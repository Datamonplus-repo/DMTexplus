package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class totif_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "OTIF", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOFIdEmpres_Internalname ;
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

   public totif_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public totif_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( totif_impl.class ));
   }

   public totif_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TOTIF.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFIdEmpres_Internalname, GXutil.rtrim( A12781OFIdEmpres), GXutil.rtrim( localUtil.format( A12781OFIdEmpres, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFIdEmpres_Jsonclick, 0, "", "", "", "", "", 1, edtOFIdEmpres_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOFFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFFecha_Internalname, localUtil.format(A12782OFFecha, "99/99/99"), localUtil.format( A12782OFFecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFFecha_Jsonclick, 0, "", "", "", "", "", 1, edtOFFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOTIF.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOFFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOFFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TOTIF.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Seccion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFIdSeccio_Internalname, GXutil.rtrim( A12783OFIdSeccio), GXutil.rtrim( localUtil.format( A12783OFIdSeccio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFIdSeccio_Jsonclick, 0, "", "", "", "", "", 1, edtOFIdSeccio_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Empresa-Seccion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFIdEmpSec_Internalname, GXutil.rtrim( A12784OFIdEmpSec), GXutil.rtrim( localUtil.format( A12784OFIdEmpSec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFIdEmpSec_Jsonclick, 0, "", "", "", "", "", 1, edtOFIdEmpSec_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Anyo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFAnyo_Internalname, GXutil.ltrim( localUtil.ntoc( A12785OFAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOFAnyo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12785OFAnyo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12785OFAnyo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFAnyo_Jsonclick, 0, "", "", "", "", "", 1, edtOFAnyo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Mes", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFMes_Internalname, GXutil.ltrim( localUtil.ntoc( A12786OFMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOFMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12786OFMes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12786OFMes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFMes_Jsonclick, 0, "", "", "", "", "", 1, edtOFMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Descripcion Seccion", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFSecion_Internalname, GXutil.rtrim( A12787OFSecion), GXutil.rtrim( localUtil.format( A12787OFSecion, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFSecion_Jsonclick, 0, "", "", "", "", "", 1, edtOFSecion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "N Hdrs", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFHdrs_Internalname, GXutil.ltrim( localUtil.ntoc( A12788OFHdrs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOFHdrs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12788OFHdrs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12788OFHdrs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFHdrs_Jsonclick, 0, "", "", "", "", "", 1, edtOFHdrs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Cumplidas", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFCumplida_Internalname, GXutil.ltrim( localUtil.ntoc( A12789OFCumplida, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOFCumplida_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12789OFCumplida), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12789OFCumplida), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFCumplida_Jsonclick, 0, "", "", "", "", "", 1, edtOFCumplida_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Incumplidas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFIncumpli_Internalname, GXutil.ltrim( localUtil.ntoc( A12790OFIncumpli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOFIncumpli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12790OFIncumpli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12790OFIncumpli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFIncumpli_Jsonclick, 0, "", "", "", "", "", 1, edtOFIncumpli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Fecha Corte", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOFFecCorte_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOFFecCorte_Internalname, localUtil.ttoc( A12812OFFecCorte, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12812OFFecCorte, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOFFecCorte_Jsonclick, 0, "", "", "", "", "", 1, edtOFFecCorte_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOTIF.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOFFecCorte_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOFFecCorte_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TOTIF.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOTIF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOFObs_Internalname, A12813OFObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", (short)(0), 1, edtOFObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TOTIF.htm");
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
         nBlankRcdCount1757 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1757 = (short)(1) ;
            scanStart1LF1757( ) ;
            while ( RcdFound1757 != 0 )
            {
               init_level_properties1757( ) ;
               getByPrimaryKey1LF1757( ) ;
               addRow1LF1757( ) ;
               scanNext1LF1757( ) ;
            }
            scanEnd1LF1757( ) ;
            nBlankRcdCount1757 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1LF1757( ) ;
         standaloneModal1LF1757( ) ;
         sMode1757 = Gx_mode ;
         while ( nGXsfl_80_idx < nRC_GXsfl_80 )
         {
            bGXsfl_80_Refreshing = true ;
            readRow1LF1757( ) ;
            edtavnRcdDeleted_1757_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1757_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1757_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1757_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFHDR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdr_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFHdrR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFHDRR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFHdrR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrR_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFHdrP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFHDRP_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFHdrP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrP_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFecHis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECHIS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFecHis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecHis_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFecEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECENT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecEnt_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFecRm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECRM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFecRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecRm_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFecHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECHD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFecHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecHd_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFSIT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFSit_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFase1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFASE1_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFase1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFase1_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFase2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFASE2_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFase2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFase2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFAccion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFACCION_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFAccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFAccion_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFecIns_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECINS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFecIns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecIns_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFPedcli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFPEDCLI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFPedcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFPedcli_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFProceso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFPROCESO_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFProceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFProceso_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFec1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFEC1_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFec1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFec1_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFFec2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFEC2_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFFec2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFec2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFOk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFOK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFOk_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            edtOFNoOk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFNOOK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOFNoOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFNoOk_Enabled), 5, 0), !bGXsfl_80_Refreshing);
            if ( ( nRcdExists_1757 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LF1757( ) ;
            }
            sendRow1LF1757( ) ;
            bGXsfl_80_Refreshing = false ;
         }
         Gx_mode = sMode1757 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1757 = (short)(5) ;
         nRcdExists_1757 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LF1757( ) ;
            while ( RcdFound1757 != 0 )
            {
               sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_801757( ) ;
               init_level_properties1757( ) ;
               standaloneNotModal1LF1757( ) ;
               getByPrimaryKey1LF1757( ) ;
               standaloneModal1LF1757( ) ;
               addRow1LF1757( ) ;
               scanNext1LF1757( ) ;
            }
            scanEnd1LF1757( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1757 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_801757( ) ;
      initAll1LF1757( ) ;
      init_level_properties1757( ) ;
      nRcdExists_1757 = (short)(0) ;
      nIsMod_1757 = (short)(0) ;
      nRcdDeleted_1757 = (short)(0) ;
      nBlankRcdCount1757 = (short)(nBlankRcdUsr1757+nBlankRcdCount1757) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1757 > 0 )
      {
         standaloneNotModal1LF1757( ) ;
         standaloneModal1LF1757( ) ;
         addRow1LF1757( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtOFHdr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1757 = (short)(nBlankRcdCount1757-1) ;
      }
      Gx_mode = sMode1757 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOTIF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TOTIF.htm");
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
      e111LF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z12781OFIdEmpres = httpContext.cgiGet( "Z12781OFIdEmpres") ;
            Z12782OFFecha = localUtil.ctod( httpContext.cgiGet( "Z12782OFFecha"), 0) ;
            Z12783OFIdSeccio = httpContext.cgiGet( "Z12783OFIdSeccio") ;
            Z12784OFIdEmpSec = httpContext.cgiGet( "Z12784OFIdEmpSec") ;
            Z12785OFAnyo = (short)(localUtil.ctol( httpContext.cgiGet( "Z12785OFAnyo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12786OFMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12786OFMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12787OFSecion = httpContext.cgiGet( "Z12787OFSecion") ;
            Z12788OFHdrs = (int)(localUtil.ctol( httpContext.cgiGet( "Z12788OFHdrs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12789OFCumplida = (int)(localUtil.ctol( httpContext.cgiGet( "Z12789OFCumplida"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12790OFIncumpli = (int)(localUtil.ctol( httpContext.cgiGet( "Z12790OFIncumpli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12812OFFecCorte = localUtil.ctot( httpContext.cgiGet( "Z12812OFFecCorte"), 0) ;
            Z12813OFObs = httpContext.cgiGet( "Z12813OFObs") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A12781OFIdEmpres = httpContext.cgiGet( edtOFIdEmpres_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
            if ( localUtil.vcdate( httpContext.cgiGet( edtOFFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "OFFECHA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFFecha_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12782OFFecha = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
            }
            else
            {
               A12782OFFecha = localUtil.ctod( httpContext.cgiGet( edtOFFecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
            }
            A12783OFIdSeccio = httpContext.cgiGet( edtOFIdSeccio_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
            A12784OFIdEmpSec = httpContext.cgiGet( edtOFIdEmpSec_Internalname) ;
            n12784OFIdEmpSec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12784OFIdEmpSec", A12784OFIdEmpSec);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOFAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOFAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OFANYO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFAnyo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12785OFAnyo = (short)(0) ;
               n12785OFAnyo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12785OFAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12785OFAnyo), 4, 0));
            }
            else
            {
               A12785OFAnyo = (short)(localUtil.ctol( httpContext.cgiGet( edtOFAnyo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12785OFAnyo = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12785OFAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12785OFAnyo), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOFMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOFMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OFMES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFMes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12786OFMes = (byte)(0) ;
               n12786OFMes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12786OFMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12786OFMes), 2, 0));
            }
            else
            {
               A12786OFMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtOFMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12786OFMes = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12786OFMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12786OFMes), 2, 0));
            }
            A12787OFSecion = httpContext.cgiGet( edtOFSecion_Internalname) ;
            n12787OFSecion = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12787OFSecion", A12787OFSecion);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOFHdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOFHdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OFHDRS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFHdrs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12788OFHdrs = 0 ;
               n12788OFHdrs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12788OFHdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12788OFHdrs), 6, 0));
            }
            else
            {
               A12788OFHdrs = (int)(localUtil.ctol( httpContext.cgiGet( edtOFHdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12788OFHdrs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12788OFHdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12788OFHdrs), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOFCumplida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOFCumplida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OFCUMPLIDA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFCumplida_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12789OFCumplida = 0 ;
               n12789OFCumplida = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12789OFCumplida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12789OFCumplida), 6, 0));
            }
            else
            {
               A12789OFCumplida = (int)(localUtil.ctol( httpContext.cgiGet( edtOFCumplida_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12789OFCumplida = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12789OFCumplida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12789OFCumplida), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOFIncumpli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOFIncumpli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OFINCUMPLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFIncumpli_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12790OFIncumpli = 0 ;
               n12790OFIncumpli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12790OFIncumpli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12790OFIncumpli), 6, 0));
            }
            else
            {
               A12790OFIncumpli = (int)(localUtil.ctol( httpContext.cgiGet( edtOFIncumpli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12790OFIncumpli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12790OFIncumpli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12790OFIncumpli), 6, 0));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtOFFecCorte_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "OFFECCORTE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFFecCorte_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12812OFFecCorte = GXutil.resetTime( GXutil.nullDate() );
               n12812OFFecCorte = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12812OFFecCorte", localUtil.ttoc( A12812OFFecCorte, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A12812OFFecCorte = localUtil.ctot( httpContext.cgiGet( edtOFFecCorte_Internalname)) ;
               n12812OFFecCorte = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12812OFFecCorte", localUtil.ttoc( A12812OFFecCorte, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            A12813OFObs = httpContext.cgiGet( edtOFObs_Internalname) ;
            n12813OFObs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12813OFObs", A12813OFObs);
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
               A12781OFIdEmpres = httpContext.GetPar( "OFIdEmpres") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
               A12782OFFecha = localUtil.parseDateParm( httpContext.GetPar( "OFFecha")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
               A12783OFIdSeccio = httpContext.GetPar( "OFIdSeccio") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
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
                        e111LF2 ();
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
            initAll1LF1756( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1757_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1757_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      disableAttributes1LF1756( ) ;
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

   public void confirm_1LF0( )
   {
      beforeValidate1LF1756( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LF1756( ) ;
         }
         else
         {
            checkExtendedTable1LF1756( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1LF1756( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1756 = Gx_mode ;
         confirm_1LF1757( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1756 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1756 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1LF0( ) ;
      }
   }

   public void confirm_1LF1757( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1LF1757( ) ;
         if ( ( nRcdExists_1757 != 0 ) || ( nIsMod_1757 != 0 ) )
         {
            getKey1LF1757( ) ;
            if ( ( nRcdExists_1757 == 0 ) && ( nRcdDeleted_1757 == 0 ) )
            {
               if ( RcdFound1757 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LF1757( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LF1757( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1LF1757( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "OFHDR_" + sGXsfl_80_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOFHdr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1757 != 0 )
               {
                  if ( nRcdDeleted_1757 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LF1757( ) ;
                     load1LF1757( ) ;
                     beforeValidate1LF1757( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LF1757( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1757 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LF1757( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LF1757( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1LF1757( ) ;
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
                  if ( nRcdDeleted_1757 == 0 )
                  {
                     GXCCtl = "OFHDR_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOFHdr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1757_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOFHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A12791OFHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOFHdrR_Internalname, GXutil.ltrim( localUtil.ntoc( A12792OFHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOFHdrP_Internalname, GXutil.rtrim( A12793OFHdrP)) ;
         httpContext.changePostValue( edtOFFecHis_Internalname, localUtil.format(A12794OFFecHis, "99/99/99")) ;
         httpContext.changePostValue( edtOFFecEnt_Internalname, localUtil.format(A12795OFFecEnt, "99/99/99")) ;
         httpContext.changePostValue( edtOFFecRm_Internalname, localUtil.format(A12796OFFecRm, "99/99/99")) ;
         httpContext.changePostValue( edtOFFecHd_Internalname, localUtil.format(A12797OFFecHd, "99/99/99")) ;
         httpContext.changePostValue( edtOFSit_Internalname, GXutil.ltrim( localUtil.ntoc( A12798OFSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOFFase1_Internalname, GXutil.rtrim( A12799OFFase1)) ;
         httpContext.changePostValue( edtOFFase2_Internalname, GXutil.rtrim( A12800OFFase2)) ;
         httpContext.changePostValue( edtOFAccion_Internalname, GXutil.rtrim( A12801OFAccion)) ;
         httpContext.changePostValue( edtOFFecIns_Internalname, localUtil.format(A12802OFFecIns, "99/99/99")) ;
         httpContext.changePostValue( edtOFPedcli_Internalname, GXutil.rtrim( A12803OFPedcli)) ;
         httpContext.changePostValue( edtOFProceso_Internalname, GXutil.rtrim( A12804OFProceso)) ;
         httpContext.changePostValue( edtOFFec1_Internalname, localUtil.ttoc( A12805OFFec1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtOFFec2_Internalname, localUtil.format(A12806OFFec2, "99/99/99")) ;
         httpContext.changePostValue( edtOFOk_Internalname, GXutil.rtrim( A12807OFOk)) ;
         httpContext.changePostValue( edtOFNoOk_Internalname, GXutil.rtrim( A12808OFNoOk)) ;
         httpContext.changePostValue( "ZT_"+"Z12791OFHdr_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z12791OFHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12792OFHdrR_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z12792OFHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12793OFHdrP_"+sGXsfl_80_idx, GXutil.rtrim( Z12793OFHdrP)) ;
         httpContext.changePostValue( "ZT_"+"Z12794OFFecHis_"+sGXsfl_80_idx, localUtil.dtoc( Z12794OFFecHis, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12795OFFecEnt_"+sGXsfl_80_idx, localUtil.dtoc( Z12795OFFecEnt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12796OFFecRm_"+sGXsfl_80_idx, localUtil.dtoc( Z12796OFFecRm, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12797OFFecHd_"+sGXsfl_80_idx, localUtil.dtoc( Z12797OFFecHd, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12798OFSit_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z12798OFSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12799OFFase1_"+sGXsfl_80_idx, GXutil.rtrim( Z12799OFFase1)) ;
         httpContext.changePostValue( "ZT_"+"Z12800OFFase2_"+sGXsfl_80_idx, GXutil.rtrim( Z12800OFFase2)) ;
         httpContext.changePostValue( "ZT_"+"Z12801OFAccion_"+sGXsfl_80_idx, GXutil.rtrim( Z12801OFAccion)) ;
         httpContext.changePostValue( "ZT_"+"Z12802OFFecIns_"+sGXsfl_80_idx, localUtil.dtoc( Z12802OFFecIns, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12803OFPedcli_"+sGXsfl_80_idx, GXutil.rtrim( Z12803OFPedcli)) ;
         httpContext.changePostValue( "ZT_"+"Z12804OFProceso_"+sGXsfl_80_idx, GXutil.rtrim( Z12804OFProceso)) ;
         httpContext.changePostValue( "ZT_"+"Z12805OFFec1_"+sGXsfl_80_idx, localUtil.ttoc( Z12805OFFec1, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12806OFFec2_"+sGXsfl_80_idx, localUtil.dtoc( Z12806OFFec2, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12807OFOk_"+sGXsfl_80_idx, GXutil.rtrim( Z12807OFOk)) ;
         httpContext.changePostValue( "ZT_"+"Z12808OFNoOk_"+sGXsfl_80_idx, GXutil.rtrim( Z12808OFNoOk)) ;
         httpContext.changePostValue( "nRcdDeleted_1757_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1757_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1757_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1757 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1757_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1757_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFHDR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFHDRR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdrR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFHDRP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdrP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECHIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecHis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECRM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecRm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECHD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFSIT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFASE1_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFase1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFASE2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFase2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFACCION_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFAccion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECINS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecIns_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFPEDCLI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFPedcli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFPROCESO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFProceso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFEC1_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFec1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFEC2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFec2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFOK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFOk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFNOOK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFNoOk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LF0( )
   {
   }

   public void e111LF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      totif_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      totif_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      totif_impl.this.AV10EmprCod = GXv_char2[0] ;
      totif_impl.this.AV11EmprNom = GXv_char3[0] ;
      totif_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1LF1756( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12784OFIdEmpSec = T01LF5_A12784OFIdEmpSec[0] ;
            Z12785OFAnyo = T01LF5_A12785OFAnyo[0] ;
            Z12786OFMes = T01LF5_A12786OFMes[0] ;
            Z12787OFSecion = T01LF5_A12787OFSecion[0] ;
            Z12788OFHdrs = T01LF5_A12788OFHdrs[0] ;
            Z12789OFCumplida = T01LF5_A12789OFCumplida[0] ;
            Z12790OFIncumpli = T01LF5_A12790OFIncumpli[0] ;
            Z12812OFFecCorte = T01LF5_A12812OFFecCorte[0] ;
            Z12813OFObs = T01LF5_A12813OFObs[0] ;
         }
         else
         {
            Z12784OFIdEmpSec = A12784OFIdEmpSec ;
            Z12785OFAnyo = A12785OFAnyo ;
            Z12786OFMes = A12786OFMes ;
            Z12787OFSecion = A12787OFSecion ;
            Z12788OFHdrs = A12788OFHdrs ;
            Z12789OFCumplida = A12789OFCumplida ;
            Z12790OFIncumpli = A12790OFIncumpli ;
            Z12812OFFecCorte = A12812OFFecCorte ;
            Z12813OFObs = A12813OFObs ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12781OFIdEmpres = A12781OFIdEmpres ;
         Z12782OFFecha = A12782OFFecha ;
         Z12783OFIdSeccio = A12783OFIdSeccio ;
         Z12784OFIdEmpSec = A12784OFIdEmpSec ;
         Z12785OFAnyo = A12785OFAnyo ;
         Z12786OFMes = A12786OFMes ;
         Z12787OFSecion = A12787OFSecion ;
         Z12788OFHdrs = A12788OFHdrs ;
         Z12789OFCumplida = A12789OFCumplida ;
         Z12790OFIncumpli = A12790OFIncumpli ;
         Z12812OFFecCorte = A12812OFFecCorte ;
         Z12813OFObs = A12813OFObs ;
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

   public void load1LF1756( )
   {
      /* Using cursor T01LF6 */
      pr_default.execute(4, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1756 = (short)(1) ;
         A12784OFIdEmpSec = T01LF6_A12784OFIdEmpSec[0] ;
         n12784OFIdEmpSec = T01LF6_n12784OFIdEmpSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12784OFIdEmpSec", A12784OFIdEmpSec);
         A12785OFAnyo = T01LF6_A12785OFAnyo[0] ;
         n12785OFAnyo = T01LF6_n12785OFAnyo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12785OFAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12785OFAnyo), 4, 0));
         A12786OFMes = T01LF6_A12786OFMes[0] ;
         n12786OFMes = T01LF6_n12786OFMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12786OFMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12786OFMes), 2, 0));
         A12787OFSecion = T01LF6_A12787OFSecion[0] ;
         n12787OFSecion = T01LF6_n12787OFSecion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12787OFSecion", A12787OFSecion);
         A12788OFHdrs = T01LF6_A12788OFHdrs[0] ;
         n12788OFHdrs = T01LF6_n12788OFHdrs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12788OFHdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12788OFHdrs), 6, 0));
         A12789OFCumplida = T01LF6_A12789OFCumplida[0] ;
         n12789OFCumplida = T01LF6_n12789OFCumplida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12789OFCumplida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12789OFCumplida), 6, 0));
         A12790OFIncumpli = T01LF6_A12790OFIncumpli[0] ;
         n12790OFIncumpli = T01LF6_n12790OFIncumpli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12790OFIncumpli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12790OFIncumpli), 6, 0));
         A12812OFFecCorte = T01LF6_A12812OFFecCorte[0] ;
         n12812OFFecCorte = T01LF6_n12812OFFecCorte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12812OFFecCorte", localUtil.ttoc( A12812OFFecCorte, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12813OFObs = T01LF6_A12813OFObs[0] ;
         n12813OFObs = T01LF6_n12813OFObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12813OFObs", A12813OFObs);
         zm1LF1756( -1) ;
      }
      pr_default.close(4);
      onLoadActions1LF1756( ) ;
   }

   public void onLoadActions1LF1756( )
   {
   }

   public void checkExtendedTable1LF1756( )
   {
      nIsDirty_1756 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1LF1756( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1LF1756( )
   {
      /* Using cursor T01LF7 */
      pr_default.execute(5, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1756 = (short)(1) ;
      }
      else
      {
         RcdFound1756 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LF5 */
      pr_default.execute(3, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1LF1756( 1) ;
         RcdFound1756 = (short)(1) ;
         A12781OFIdEmpres = T01LF5_A12781OFIdEmpres[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
         A12782OFFecha = T01LF5_A12782OFFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
         A12783OFIdSeccio = T01LF5_A12783OFIdSeccio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
         A12784OFIdEmpSec = T01LF5_A12784OFIdEmpSec[0] ;
         n12784OFIdEmpSec = T01LF5_n12784OFIdEmpSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12784OFIdEmpSec", A12784OFIdEmpSec);
         A12785OFAnyo = T01LF5_A12785OFAnyo[0] ;
         n12785OFAnyo = T01LF5_n12785OFAnyo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12785OFAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12785OFAnyo), 4, 0));
         A12786OFMes = T01LF5_A12786OFMes[0] ;
         n12786OFMes = T01LF5_n12786OFMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12786OFMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12786OFMes), 2, 0));
         A12787OFSecion = T01LF5_A12787OFSecion[0] ;
         n12787OFSecion = T01LF5_n12787OFSecion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12787OFSecion", A12787OFSecion);
         A12788OFHdrs = T01LF5_A12788OFHdrs[0] ;
         n12788OFHdrs = T01LF5_n12788OFHdrs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12788OFHdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12788OFHdrs), 6, 0));
         A12789OFCumplida = T01LF5_A12789OFCumplida[0] ;
         n12789OFCumplida = T01LF5_n12789OFCumplida[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12789OFCumplida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12789OFCumplida), 6, 0));
         A12790OFIncumpli = T01LF5_A12790OFIncumpli[0] ;
         n12790OFIncumpli = T01LF5_n12790OFIncumpli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12790OFIncumpli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12790OFIncumpli), 6, 0));
         A12812OFFecCorte = T01LF5_A12812OFFecCorte[0] ;
         n12812OFFecCorte = T01LF5_n12812OFFecCorte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12812OFFecCorte", localUtil.ttoc( A12812OFFecCorte, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12813OFObs = T01LF5_A12813OFObs[0] ;
         n12813OFObs = T01LF5_n12813OFObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12813OFObs", A12813OFObs);
         Z12781OFIdEmpres = A12781OFIdEmpres ;
         Z12782OFFecha = A12782OFFecha ;
         Z12783OFIdSeccio = A12783OFIdSeccio ;
         sMode1756 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1LF1756( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1756 = (short)(0) ;
            initializeNonKey1LF1756( ) ;
         }
         Gx_mode = sMode1756 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1756 = (short)(0) ;
         initializeNonKey1LF1756( ) ;
         sMode1756 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1756 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1LF1756( ) ;
      if ( RcdFound1756 == 0 )
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
      RcdFound1756 = (short)(0) ;
      /* Using cursor T01LF8 */
      pr_default.execute(6, new Object[] {A12781OFIdEmpres, A12781OFIdEmpres, A12782OFFecha, A12782OFFecha, A12781OFIdEmpres, A12783OFIdSeccio});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01LF8_A12781OFIdEmpres[0], A12781OFIdEmpres) < 0 ) || ( GXutil.strcmp(T01LF8_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && GXutil.resetTime(T01LF8_A12782OFFecha[0]).before( GXutil.resetTime( A12782OFFecha )) || GXutil.dateCompare(GXutil.resetTime(T01LF8_A12782OFFecha[0]), GXutil.resetTime(A12782OFFecha)) && ( GXutil.strcmp(T01LF8_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && ( GXutil.strcmp(T01LF8_A12783OFIdSeccio[0], A12783OFIdSeccio) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01LF8_A12781OFIdEmpres[0], A12781OFIdEmpres) > 0 ) || ( GXutil.strcmp(T01LF8_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && GXutil.resetTime(T01LF8_A12782OFFecha[0]).after( GXutil.resetTime( A12782OFFecha )) || GXutil.dateCompare(GXutil.resetTime(T01LF8_A12782OFFecha[0]), GXutil.resetTime(A12782OFFecha)) && ( GXutil.strcmp(T01LF8_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && ( GXutil.strcmp(T01LF8_A12783OFIdSeccio[0], A12783OFIdSeccio) > 0 ) ) )
         {
            A12781OFIdEmpres = T01LF8_A12781OFIdEmpres[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
            A12782OFFecha = T01LF8_A12782OFFecha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
            A12783OFIdSeccio = T01LF8_A12783OFIdSeccio[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
            RcdFound1756 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1756 = (short)(0) ;
      /* Using cursor T01LF9 */
      pr_default.execute(7, new Object[] {A12781OFIdEmpres, A12781OFIdEmpres, A12782OFFecha, A12782OFFecha, A12781OFIdEmpres, A12783OFIdSeccio});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01LF9_A12781OFIdEmpres[0], A12781OFIdEmpres) > 0 ) || ( GXutil.strcmp(T01LF9_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && GXutil.resetTime(T01LF9_A12782OFFecha[0]).after( GXutil.resetTime( A12782OFFecha )) || GXutil.dateCompare(GXutil.resetTime(T01LF9_A12782OFFecha[0]), GXutil.resetTime(A12782OFFecha)) && ( GXutil.strcmp(T01LF9_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && ( GXutil.strcmp(T01LF9_A12783OFIdSeccio[0], A12783OFIdSeccio) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01LF9_A12781OFIdEmpres[0], A12781OFIdEmpres) < 0 ) || ( GXutil.strcmp(T01LF9_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && GXutil.resetTime(T01LF9_A12782OFFecha[0]).before( GXutil.resetTime( A12782OFFecha )) || GXutil.dateCompare(GXutil.resetTime(T01LF9_A12782OFFecha[0]), GXutil.resetTime(A12782OFFecha)) && ( GXutil.strcmp(T01LF9_A12781OFIdEmpres[0], A12781OFIdEmpres) == 0 ) && ( GXutil.strcmp(T01LF9_A12783OFIdSeccio[0], A12783OFIdSeccio) < 0 ) ) )
         {
            A12781OFIdEmpres = T01LF9_A12781OFIdEmpres[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
            A12782OFFecha = T01LF9_A12782OFFecha[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
            A12783OFIdSeccio = T01LF9_A12783OFIdSeccio[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
            RcdFound1756 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LF1756( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOFIdEmpres_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LF1756( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1756 == 1 )
         {
            if ( ( GXutil.strcmp(A12781OFIdEmpres, Z12781OFIdEmpres) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A12782OFFecha), GXutil.resetTime(Z12782OFFecha)) ) || ( GXutil.strcmp(A12783OFIdSeccio, Z12783OFIdSeccio) != 0 ) )
            {
               A12781OFIdEmpres = Z12781OFIdEmpres ;
               httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
               A12782OFFecha = Z12782OFFecha ;
               httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
               A12783OFIdSeccio = Z12783OFIdSeccio ;
               httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "OFIDEMPRES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFIdEmpres_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOFIdEmpres_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1LF1756( ) ;
               GX_FocusControl = edtOFIdEmpres_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A12781OFIdEmpres, Z12781OFIdEmpres) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A12782OFFecha), GXutil.resetTime(Z12782OFFecha)) ) || ( GXutil.strcmp(A12783OFIdSeccio, Z12783OFIdSeccio) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtOFIdEmpres_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LF1756( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "OFIDEMPRES");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOFIdEmpres_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtOFIdEmpres_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1LF1756( ) ;
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
      if ( ( GXutil.strcmp(A12781OFIdEmpres, Z12781OFIdEmpres) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A12782OFFecha), GXutil.resetTime(Z12782OFFecha)) ) || ( GXutil.strcmp(A12783OFIdSeccio, Z12783OFIdSeccio) != 0 ) )
      {
         A12781OFIdEmpres = Z12781OFIdEmpres ;
         httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
         A12782OFFecha = Z12782OFFecha ;
         httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
         A12783OFIdSeccio = Z12783OFIdSeccio ;
         httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "OFIDEMPRES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFIdEmpres_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOFIdEmpres_Internalname ;
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
      getKey1LF1756( ) ;
      if ( RcdFound1756 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "OFIDEMPRES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOFIdEmpres_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A12781OFIdEmpres, Z12781OFIdEmpres) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A12782OFFecha), GXutil.resetTime(Z12782OFFecha)) ) || ( GXutil.strcmp(A12783OFIdSeccio, Z12783OFIdSeccio) != 0 ) )
         {
            A12781OFIdEmpres = Z12781OFIdEmpres ;
            httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
            A12782OFFecha = Z12782OFFecha ;
            httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
            A12783OFIdSeccio = Z12783OFIdSeccio ;
            httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "OFIDEMPRES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOFIdEmpres_Internalname ;
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
         if ( ( GXutil.strcmp(A12781OFIdEmpres, Z12781OFIdEmpres) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A12782OFFecha), GXutil.resetTime(Z12782OFFecha)) ) || ( GXutil.strcmp(A12783OFIdSeccio, Z12783OFIdSeccio) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "OFIDEMPRES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOFIdEmpres_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "totif");
      GX_FocusControl = edtOFIdEmpSec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1LF0( ) ;
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
      if ( RcdFound1756 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "OFIDEMPRES");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFIdEmpres_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtOFIdEmpSec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1LF1756( ) ;
      if ( RcdFound1756 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtOFIdEmpSec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LF1756( ) ;
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
      if ( RcdFound1756 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtOFIdEmpSec_Internalname ;
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
      if ( RcdFound1756 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtOFIdEmpSec_Internalname ;
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
      scanStart1LF1756( ) ;
      if ( RcdFound1756 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1756 != 0 )
         {
            scanNext1LF1756( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtOFIdEmpSec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LF1756( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1LF1756( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LF4 */
         pr_default.execute(2, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOTIF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z12784OFIdEmpSec, T01LF4_A12784OFIdEmpSec[0]) != 0 ) || ( Z12785OFAnyo != T01LF4_A12785OFAnyo[0] ) || ( Z12786OFMes != T01LF4_A12786OFMes[0] ) || ( GXutil.strcmp(Z12787OFSecion, T01LF4_A12787OFSecion[0]) != 0 ) || ( Z12788OFHdrs != T01LF4_A12788OFHdrs[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12789OFCumplida != T01LF4_A12789OFCumplida[0] ) || ( Z12790OFIncumpli != T01LF4_A12790OFIncumpli[0] ) || !( GXutil.dateCompare(Z12812OFFecCorte, T01LF4_A12812OFFecCorte[0]) ) || ( GXutil.strcmp(Z12813OFObs, T01LF4_A12813OFObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12784OFIdEmpSec, T01LF4_A12784OFIdEmpSec[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFIdEmpSec");
               GXutil.writeLogRaw("Old: ",Z12784OFIdEmpSec);
               GXutil.writeLogRaw("Current: ",T01LF4_A12784OFIdEmpSec[0]);
            }
            if ( Z12785OFAnyo != T01LF4_A12785OFAnyo[0] )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFAnyo");
               GXutil.writeLogRaw("Old: ",Z12785OFAnyo);
               GXutil.writeLogRaw("Current: ",T01LF4_A12785OFAnyo[0]);
            }
            if ( Z12786OFMes != T01LF4_A12786OFMes[0] )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFMes");
               GXutil.writeLogRaw("Old: ",Z12786OFMes);
               GXutil.writeLogRaw("Current: ",T01LF4_A12786OFMes[0]);
            }
            if ( GXutil.strcmp(Z12787OFSecion, T01LF4_A12787OFSecion[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFSecion");
               GXutil.writeLogRaw("Old: ",Z12787OFSecion);
               GXutil.writeLogRaw("Current: ",T01LF4_A12787OFSecion[0]);
            }
            if ( Z12788OFHdrs != T01LF4_A12788OFHdrs[0] )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFHdrs");
               GXutil.writeLogRaw("Old: ",Z12788OFHdrs);
               GXutil.writeLogRaw("Current: ",T01LF4_A12788OFHdrs[0]);
            }
            if ( Z12789OFCumplida != T01LF4_A12789OFCumplida[0] )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFCumplida");
               GXutil.writeLogRaw("Old: ",Z12789OFCumplida);
               GXutil.writeLogRaw("Current: ",T01LF4_A12789OFCumplida[0]);
            }
            if ( Z12790OFIncumpli != T01LF4_A12790OFIncumpli[0] )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFIncumpli");
               GXutil.writeLogRaw("Old: ",Z12790OFIncumpli);
               GXutil.writeLogRaw("Current: ",T01LF4_A12790OFIncumpli[0]);
            }
            if ( !( GXutil.dateCompare(Z12812OFFecCorte, T01LF4_A12812OFFecCorte[0]) ) )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFecCorte");
               GXutil.writeLogRaw("Old: ",Z12812OFFecCorte);
               GXutil.writeLogRaw("Current: ",T01LF4_A12812OFFecCorte[0]);
            }
            if ( GXutil.strcmp(Z12813OFObs, T01LF4_A12813OFObs[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFObs");
               GXutil.writeLogRaw("Old: ",Z12813OFObs);
               GXutil.writeLogRaw("Current: ",T01LF4_A12813OFObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOTIF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LF1756( )
   {
      beforeValidate1LF1756( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LF1756( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LF1756( 0) ;
         checkOptimisticConcurrency1LF1756( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LF1756( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LF1756( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LF10 */
                  pr_default.execute(8, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Boolean.valueOf(n12784OFIdEmpSec), A12784OFIdEmpSec, Boolean.valueOf(n12785OFAnyo), Short.valueOf(A12785OFAnyo), Boolean.valueOf(n12786OFMes), Byte.valueOf(A12786OFMes), Boolean.valueOf(n12787OFSecion), A12787OFSecion, Boolean.valueOf(n12788OFHdrs), Integer.valueOf(A12788OFHdrs), Boolean.valueOf(n12789OFCumplida), Integer.valueOf(A12789OFCumplida), Boolean.valueOf(n12790OFIncumpli), Integer.valueOf(A12790OFIncumpli), Boolean.valueOf(n12812OFFecCorte), A12812OFFecCorte, Boolean.valueOf(n12813OFObs), A12813OFObs});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIF");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        processLevel1LF1756( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1LF0( ) ;
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
            load1LF1756( ) ;
         }
         endLevel1LF1756( ) ;
      }
      closeExtendedTableCursors1LF1756( ) ;
   }

   public void update1LF1756( )
   {
      beforeValidate1LF1756( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LF1756( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LF1756( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LF1756( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LF1756( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LF11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n12784OFIdEmpSec), A12784OFIdEmpSec, Boolean.valueOf(n12785OFAnyo), Short.valueOf(A12785OFAnyo), Boolean.valueOf(n12786OFMes), Byte.valueOf(A12786OFMes), Boolean.valueOf(n12787OFSecion), A12787OFSecion, Boolean.valueOf(n12788OFHdrs), Integer.valueOf(A12788OFHdrs), Boolean.valueOf(n12789OFCumplida), Integer.valueOf(A12789OFCumplida), Boolean.valueOf(n12790OFIncumpli), Integer.valueOf(A12790OFIncumpli), Boolean.valueOf(n12812OFFecCorte), A12812OFFecCorte, Boolean.valueOf(n12813OFObs), A12813OFObs, A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIF");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOTIF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LF1756( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LF1756( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1LF0( ) ;
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
         endLevel1LF1756( ) ;
      }
      closeExtendedTableCursors1LF1756( ) ;
   }

   public void deferredUpdate1LF1756( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LF1756( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LF1756( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LF1756( ) ;
         afterConfirm1LF1756( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LF1756( ) ;
            if ( AnyError == 0 )
            {
               scanStart1LF1757( ) ;
               while ( RcdFound1757 != 0 )
               {
                  getByPrimaryKey1LF1757( ) ;
                  delete1LF1757( ) ;
                  scanNext1LF1757( ) ;
               }
               scanEnd1LF1757( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LF12 */
                  pr_default.execute(10, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIF");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1756 == 0 )
                        {
                           initAll1LF1756( ) ;
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
                        resetCaption1LF0( ) ;
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
      sMode1756 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LF1756( ) ;
      Gx_mode = sMode1756 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LF1756( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1LF1757( )
   {
      nGXsfl_80_idx = 0 ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         readRow1LF1757( ) ;
         if ( ( nRcdExists_1757 != 0 ) || ( nIsMod_1757 != 0 ) )
         {
            standaloneNotModal1LF1757( ) ;
            getKey1LF1757( ) ;
            if ( ( nRcdExists_1757 == 0 ) && ( nRcdDeleted_1757 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LF1757( ) ;
            }
            else
            {
               if ( RcdFound1757 != 0 )
               {
                  if ( ( nRcdDeleted_1757 != 0 ) && ( nRcdExists_1757 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LF1757( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1757 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LF1757( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1757 == 0 )
                  {
                     GXCCtl = "OFHDR_" + sGXsfl_80_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOFHdr_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1757_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOFHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A12791OFHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOFHdrR_Internalname, GXutil.ltrim( localUtil.ntoc( A12792OFHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOFHdrP_Internalname, GXutil.rtrim( A12793OFHdrP)) ;
         httpContext.changePostValue( edtOFFecHis_Internalname, localUtil.format(A12794OFFecHis, "99/99/99")) ;
         httpContext.changePostValue( edtOFFecEnt_Internalname, localUtil.format(A12795OFFecEnt, "99/99/99")) ;
         httpContext.changePostValue( edtOFFecRm_Internalname, localUtil.format(A12796OFFecRm, "99/99/99")) ;
         httpContext.changePostValue( edtOFFecHd_Internalname, localUtil.format(A12797OFFecHd, "99/99/99")) ;
         httpContext.changePostValue( edtOFSit_Internalname, GXutil.ltrim( localUtil.ntoc( A12798OFSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOFFase1_Internalname, GXutil.rtrim( A12799OFFase1)) ;
         httpContext.changePostValue( edtOFFase2_Internalname, GXutil.rtrim( A12800OFFase2)) ;
         httpContext.changePostValue( edtOFAccion_Internalname, GXutil.rtrim( A12801OFAccion)) ;
         httpContext.changePostValue( edtOFFecIns_Internalname, localUtil.format(A12802OFFecIns, "99/99/99")) ;
         httpContext.changePostValue( edtOFPedcli_Internalname, GXutil.rtrim( A12803OFPedcli)) ;
         httpContext.changePostValue( edtOFProceso_Internalname, GXutil.rtrim( A12804OFProceso)) ;
         httpContext.changePostValue( edtOFFec1_Internalname, localUtil.ttoc( A12805OFFec1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtOFFec2_Internalname, localUtil.format(A12806OFFec2, "99/99/99")) ;
         httpContext.changePostValue( edtOFOk_Internalname, GXutil.rtrim( A12807OFOk)) ;
         httpContext.changePostValue( edtOFNoOk_Internalname, GXutil.rtrim( A12808OFNoOk)) ;
         httpContext.changePostValue( "ZT_"+"Z12791OFHdr_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z12791OFHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12792OFHdrR_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z12792OFHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12793OFHdrP_"+sGXsfl_80_idx, GXutil.rtrim( Z12793OFHdrP)) ;
         httpContext.changePostValue( "ZT_"+"Z12794OFFecHis_"+sGXsfl_80_idx, localUtil.dtoc( Z12794OFFecHis, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12795OFFecEnt_"+sGXsfl_80_idx, localUtil.dtoc( Z12795OFFecEnt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12796OFFecRm_"+sGXsfl_80_idx, localUtil.dtoc( Z12796OFFecRm, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12797OFFecHd_"+sGXsfl_80_idx, localUtil.dtoc( Z12797OFFecHd, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12798OFSit_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( Z12798OFSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12799OFFase1_"+sGXsfl_80_idx, GXutil.rtrim( Z12799OFFase1)) ;
         httpContext.changePostValue( "ZT_"+"Z12800OFFase2_"+sGXsfl_80_idx, GXutil.rtrim( Z12800OFFase2)) ;
         httpContext.changePostValue( "ZT_"+"Z12801OFAccion_"+sGXsfl_80_idx, GXutil.rtrim( Z12801OFAccion)) ;
         httpContext.changePostValue( "ZT_"+"Z12802OFFecIns_"+sGXsfl_80_idx, localUtil.dtoc( Z12802OFFecIns, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12803OFPedcli_"+sGXsfl_80_idx, GXutil.rtrim( Z12803OFPedcli)) ;
         httpContext.changePostValue( "ZT_"+"Z12804OFProceso_"+sGXsfl_80_idx, GXutil.rtrim( Z12804OFProceso)) ;
         httpContext.changePostValue( "ZT_"+"Z12805OFFec1_"+sGXsfl_80_idx, localUtil.ttoc( Z12805OFFec1, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12806OFFec2_"+sGXsfl_80_idx, localUtil.dtoc( Z12806OFFec2, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12807OFOk_"+sGXsfl_80_idx, GXutil.rtrim( Z12807OFOk)) ;
         httpContext.changePostValue( "ZT_"+"Z12808OFNoOk_"+sGXsfl_80_idx, GXutil.rtrim( Z12808OFNoOk)) ;
         httpContext.changePostValue( "nRcdDeleted_1757_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1757_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1757_"+sGXsfl_80_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1757 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1757_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1757_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFHDR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFHDRR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdrR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFHDRP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdrP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECHIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecHis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECRM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecRm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECHD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecHd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFSIT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFASE1_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFase1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFASE2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFase2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFACCION_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFAccion_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFECINS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecIns_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFPEDCLI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFPedcli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFPROCESO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFProceso_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFEC1_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFec1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFFEC2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFec2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFOK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFOk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OFNOOK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFNoOk_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LF1757( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1757 = (short)(0) ;
      nIsMod_1757 = (short)(0) ;
      nRcdDeleted_1757 = (short)(0) ;
   }

   public void processLevel1LF1756( )
   {
      /* Save parent mode. */
      sMode1756 = Gx_mode ;
      processNestedLevel1LF1757( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1756 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LF1756( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LF1756( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "totif");
         if ( AnyError == 0 )
         {
            confirmValues1LF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "totif");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LF1756( )
   {
      /* Scan By routine */
      /* Using cursor T01LF13 */
      pr_default.execute(11);
      RcdFound1756 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1756 = (short)(1) ;
         A12781OFIdEmpres = T01LF13_A12781OFIdEmpres[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
         A12782OFFecha = T01LF13_A12782OFFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
         A12783OFIdSeccio = T01LF13_A12783OFIdSeccio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LF1756( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1756 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1756 = (short)(1) ;
         A12781OFIdEmpres = T01LF13_A12781OFIdEmpres[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
         A12782OFFecha = T01LF13_A12782OFFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
         A12783OFIdSeccio = T01LF13_A12783OFIdSeccio[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
      }
   }

   public void scanEnd1LF1756( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1LF1756( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LF1756( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LF1756( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LF1756( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LF1756( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LF1756( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LF1756( )
   {
      edtOFIdEmpres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFIdEmpres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFIdEmpres_Enabled), 5, 0), true);
      edtOFFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecha_Enabled), 5, 0), true);
      edtOFIdSeccio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFIdSeccio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFIdSeccio_Enabled), 5, 0), true);
      edtOFIdEmpSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFIdEmpSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFIdEmpSec_Enabled), 5, 0), true);
      edtOFAnyo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFAnyo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFAnyo_Enabled), 5, 0), true);
      edtOFMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFMes_Enabled), 5, 0), true);
      edtOFSecion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFSecion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFSecion_Enabled), 5, 0), true);
      edtOFHdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFHdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrs_Enabled), 5, 0), true);
      edtOFCumplida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFCumplida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFCumplida_Enabled), 5, 0), true);
      edtOFIncumpli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFIncumpli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFIncumpli_Enabled), 5, 0), true);
      edtOFFecCorte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFecCorte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecCorte_Enabled), 5, 0), true);
      edtOFObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFObs_Enabled), 5, 0), true);
   }

   public void zm1LF1757( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12794OFFecHis = T01LF3_A12794OFFecHis[0] ;
            Z12795OFFecEnt = T01LF3_A12795OFFecEnt[0] ;
            Z12796OFFecRm = T01LF3_A12796OFFecRm[0] ;
            Z12797OFFecHd = T01LF3_A12797OFFecHd[0] ;
            Z12798OFSit = T01LF3_A12798OFSit[0] ;
            Z12799OFFase1 = T01LF3_A12799OFFase1[0] ;
            Z12800OFFase2 = T01LF3_A12800OFFase2[0] ;
            Z12801OFAccion = T01LF3_A12801OFAccion[0] ;
            Z12802OFFecIns = T01LF3_A12802OFFecIns[0] ;
            Z12803OFPedcli = T01LF3_A12803OFPedcli[0] ;
            Z12804OFProceso = T01LF3_A12804OFProceso[0] ;
            Z12805OFFec1 = T01LF3_A12805OFFec1[0] ;
            Z12806OFFec2 = T01LF3_A12806OFFec2[0] ;
            Z12807OFOk = T01LF3_A12807OFOk[0] ;
            Z12808OFNoOk = T01LF3_A12808OFNoOk[0] ;
         }
         else
         {
            Z12794OFFecHis = A12794OFFecHis ;
            Z12795OFFecEnt = A12795OFFecEnt ;
            Z12796OFFecRm = A12796OFFecRm ;
            Z12797OFFecHd = A12797OFFecHd ;
            Z12798OFSit = A12798OFSit ;
            Z12799OFFase1 = A12799OFFase1 ;
            Z12800OFFase2 = A12800OFFase2 ;
            Z12801OFAccion = A12801OFAccion ;
            Z12802OFFecIns = A12802OFFecIns ;
            Z12803OFPedcli = A12803OFPedcli ;
            Z12804OFProceso = A12804OFProceso ;
            Z12805OFFec1 = A12805OFFec1 ;
            Z12806OFFec2 = A12806OFFec2 ;
            Z12807OFOk = A12807OFOk ;
            Z12808OFNoOk = A12808OFNoOk ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z12781OFIdEmpres = A12781OFIdEmpres ;
         Z12782OFFecha = A12782OFFecha ;
         Z12783OFIdSeccio = A12783OFIdSeccio ;
         Z12791OFHdr = A12791OFHdr ;
         Z12792OFHdrR = A12792OFHdrR ;
         Z12793OFHdrP = A12793OFHdrP ;
         Z12794OFFecHis = A12794OFFecHis ;
         Z12795OFFecEnt = A12795OFFecEnt ;
         Z12796OFFecRm = A12796OFFecRm ;
         Z12797OFFecHd = A12797OFFecHd ;
         Z12798OFSit = A12798OFSit ;
         Z12799OFFase1 = A12799OFFase1 ;
         Z12800OFFase2 = A12800OFFase2 ;
         Z12801OFAccion = A12801OFAccion ;
         Z12802OFFecIns = A12802OFFecIns ;
         Z12803OFPedcli = A12803OFPedcli ;
         Z12804OFProceso = A12804OFProceso ;
         Z12805OFFec1 = A12805OFFec1 ;
         Z12806OFFec2 = A12806OFFec2 ;
         Z12807OFOk = A12807OFOk ;
         Z12808OFNoOk = A12808OFNoOk ;
      }
   }

   public void standaloneNotModal1LF1757( )
   {
   }

   public void standaloneModal1LF1757( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOFHdr_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOFHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdr_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtOFHdr_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOFHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdr_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOFHdrR_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOFHdrR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrR_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtOFHdrR_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOFHdrR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrR_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOFHdrP_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOFHdrP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrP_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
      else
      {
         edtOFHdrP_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOFHdrP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrP_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      }
   }

   public void load1LF1757( )
   {
      /* Using cursor T01LF14 */
      pr_default.execute(12, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Integer.valueOf(A12791OFHdr), Byte.valueOf(A12792OFHdrR), A12793OFHdrP});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1757 = (short)(1) ;
         A12794OFFecHis = T01LF14_A12794OFFecHis[0] ;
         n12794OFFecHis = T01LF14_n12794OFFecHis[0] ;
         A12795OFFecEnt = T01LF14_A12795OFFecEnt[0] ;
         n12795OFFecEnt = T01LF14_n12795OFFecEnt[0] ;
         A12796OFFecRm = T01LF14_A12796OFFecRm[0] ;
         n12796OFFecRm = T01LF14_n12796OFFecRm[0] ;
         A12797OFFecHd = T01LF14_A12797OFFecHd[0] ;
         n12797OFFecHd = T01LF14_n12797OFFecHd[0] ;
         A12798OFSit = T01LF14_A12798OFSit[0] ;
         n12798OFSit = T01LF14_n12798OFSit[0] ;
         A12799OFFase1 = T01LF14_A12799OFFase1[0] ;
         n12799OFFase1 = T01LF14_n12799OFFase1[0] ;
         A12800OFFase2 = T01LF14_A12800OFFase2[0] ;
         n12800OFFase2 = T01LF14_n12800OFFase2[0] ;
         A12801OFAccion = T01LF14_A12801OFAccion[0] ;
         n12801OFAccion = T01LF14_n12801OFAccion[0] ;
         A12802OFFecIns = T01LF14_A12802OFFecIns[0] ;
         n12802OFFecIns = T01LF14_n12802OFFecIns[0] ;
         A12803OFPedcli = T01LF14_A12803OFPedcli[0] ;
         n12803OFPedcli = T01LF14_n12803OFPedcli[0] ;
         A12804OFProceso = T01LF14_A12804OFProceso[0] ;
         n12804OFProceso = T01LF14_n12804OFProceso[0] ;
         A12805OFFec1 = T01LF14_A12805OFFec1[0] ;
         n12805OFFec1 = T01LF14_n12805OFFec1[0] ;
         A12806OFFec2 = T01LF14_A12806OFFec2[0] ;
         n12806OFFec2 = T01LF14_n12806OFFec2[0] ;
         A12807OFOk = T01LF14_A12807OFOk[0] ;
         n12807OFOk = T01LF14_n12807OFOk[0] ;
         A12808OFNoOk = T01LF14_A12808OFNoOk[0] ;
         n12808OFNoOk = T01LF14_n12808OFNoOk[0] ;
         zm1LF1757( -2) ;
      }
      pr_default.close(12);
      onLoadActions1LF1757( ) ;
   }

   public void onLoadActions1LF1757( )
   {
   }

   public void checkExtendedTable1LF1757( )
   {
      nIsDirty_1757 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LF1757( ) ;
   }

   public void closeExtendedTableCursors1LF1757( )
   {
   }

   public void enableDisable1LF1757( )
   {
   }

   public void getKey1LF1757( )
   {
      /* Using cursor T01LF15 */
      pr_default.execute(13, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Integer.valueOf(A12791OFHdr), Byte.valueOf(A12792OFHdrR), A12793OFHdrP});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1757 = (short)(1) ;
      }
      else
      {
         RcdFound1757 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey1LF1757( )
   {
      /* Using cursor T01LF3 */
      pr_default.execute(1, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Integer.valueOf(A12791OFHdr), Byte.valueOf(A12792OFHdrR), A12793OFHdrP});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1LF1757( 2) ;
         RcdFound1757 = (short)(1) ;
         initializeNonKey1LF1757( ) ;
         A12791OFHdr = T01LF3_A12791OFHdr[0] ;
         A12792OFHdrR = T01LF3_A12792OFHdrR[0] ;
         A12793OFHdrP = T01LF3_A12793OFHdrP[0] ;
         A12794OFFecHis = T01LF3_A12794OFFecHis[0] ;
         n12794OFFecHis = T01LF3_n12794OFFecHis[0] ;
         A12795OFFecEnt = T01LF3_A12795OFFecEnt[0] ;
         n12795OFFecEnt = T01LF3_n12795OFFecEnt[0] ;
         A12796OFFecRm = T01LF3_A12796OFFecRm[0] ;
         n12796OFFecRm = T01LF3_n12796OFFecRm[0] ;
         A12797OFFecHd = T01LF3_A12797OFFecHd[0] ;
         n12797OFFecHd = T01LF3_n12797OFFecHd[0] ;
         A12798OFSit = T01LF3_A12798OFSit[0] ;
         n12798OFSit = T01LF3_n12798OFSit[0] ;
         A12799OFFase1 = T01LF3_A12799OFFase1[0] ;
         n12799OFFase1 = T01LF3_n12799OFFase1[0] ;
         A12800OFFase2 = T01LF3_A12800OFFase2[0] ;
         n12800OFFase2 = T01LF3_n12800OFFase2[0] ;
         A12801OFAccion = T01LF3_A12801OFAccion[0] ;
         n12801OFAccion = T01LF3_n12801OFAccion[0] ;
         A12802OFFecIns = T01LF3_A12802OFFecIns[0] ;
         n12802OFFecIns = T01LF3_n12802OFFecIns[0] ;
         A12803OFPedcli = T01LF3_A12803OFPedcli[0] ;
         n12803OFPedcli = T01LF3_n12803OFPedcli[0] ;
         A12804OFProceso = T01LF3_A12804OFProceso[0] ;
         n12804OFProceso = T01LF3_n12804OFProceso[0] ;
         A12805OFFec1 = T01LF3_A12805OFFec1[0] ;
         n12805OFFec1 = T01LF3_n12805OFFec1[0] ;
         A12806OFFec2 = T01LF3_A12806OFFec2[0] ;
         n12806OFFec2 = T01LF3_n12806OFFec2[0] ;
         A12807OFOk = T01LF3_A12807OFOk[0] ;
         n12807OFOk = T01LF3_n12807OFOk[0] ;
         A12808OFNoOk = T01LF3_A12808OFNoOk[0] ;
         n12808OFNoOk = T01LF3_n12808OFNoOk[0] ;
         Z12781OFIdEmpres = A12781OFIdEmpres ;
         Z12782OFFecha = A12782OFFecha ;
         Z12783OFIdSeccio = A12783OFIdSeccio ;
         Z12791OFHdr = A12791OFHdr ;
         Z12792OFHdrR = A12792OFHdrR ;
         Z12793OFHdrP = A12793OFHdrP ;
         sMode1757 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LF1757( ) ;
         load1LF1757( ) ;
         Gx_mode = sMode1757 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1757 = (short)(0) ;
         initializeNonKey1LF1757( ) ;
         sMode1757 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LF1757( ) ;
         Gx_mode = sMode1757 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LF1757( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LF1757( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LF2 */
         pr_default.execute(0, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Integer.valueOf(A12791OFHdr), Byte.valueOf(A12792OFHdrR), A12793OFHdrP});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOTIFDE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z12794OFFecHis), GXutil.resetTime(T01LF2_A12794OFFecHis[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z12795OFFecEnt), GXutil.resetTime(T01LF2_A12795OFFecEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z12796OFFecRm), GXutil.resetTime(T01LF2_A12796OFFecRm[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z12797OFFecHd), GXutil.resetTime(T01LF2_A12797OFFecHd[0])) ) || ( Z12798OFSit != T01LF2_A12798OFSit[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12799OFFase1, T01LF2_A12799OFFase1[0]) != 0 ) || ( GXutil.strcmp(Z12800OFFase2, T01LF2_A12800OFFase2[0]) != 0 ) || ( GXutil.strcmp(Z12801OFAccion, T01LF2_A12801OFAccion[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z12802OFFecIns), GXutil.resetTime(T01LF2_A12802OFFecIns[0])) ) || ( GXutil.strcmp(Z12803OFPedcli, T01LF2_A12803OFPedcli[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12804OFProceso, T01LF2_A12804OFProceso[0]) != 0 ) || !( GXutil.dateCompare(Z12805OFFec1, T01LF2_A12805OFFec1[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z12806OFFec2), GXutil.resetTime(T01LF2_A12806OFFec2[0])) ) || ( GXutil.strcmp(Z12807OFOk, T01LF2_A12807OFOk[0]) != 0 ) || ( GXutil.strcmp(Z12808OFNoOk, T01LF2_A12808OFNoOk[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12794OFFecHis), GXutil.resetTime(T01LF2_A12794OFFecHis[0])) ) )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFecHis");
               GXutil.writeLogRaw("Old: ",Z12794OFFecHis);
               GXutil.writeLogRaw("Current: ",T01LF2_A12794OFFecHis[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12795OFFecEnt), GXutil.resetTime(T01LF2_A12795OFFecEnt[0])) ) )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFecEnt");
               GXutil.writeLogRaw("Old: ",Z12795OFFecEnt);
               GXutil.writeLogRaw("Current: ",T01LF2_A12795OFFecEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12796OFFecRm), GXutil.resetTime(T01LF2_A12796OFFecRm[0])) ) )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFecRm");
               GXutil.writeLogRaw("Old: ",Z12796OFFecRm);
               GXutil.writeLogRaw("Current: ",T01LF2_A12796OFFecRm[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12797OFFecHd), GXutil.resetTime(T01LF2_A12797OFFecHd[0])) ) )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFecHd");
               GXutil.writeLogRaw("Old: ",Z12797OFFecHd);
               GXutil.writeLogRaw("Current: ",T01LF2_A12797OFFecHd[0]);
            }
            if ( Z12798OFSit != T01LF2_A12798OFSit[0] )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFSit");
               GXutil.writeLogRaw("Old: ",Z12798OFSit);
               GXutil.writeLogRaw("Current: ",T01LF2_A12798OFSit[0]);
            }
            if ( GXutil.strcmp(Z12799OFFase1, T01LF2_A12799OFFase1[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFase1");
               GXutil.writeLogRaw("Old: ",Z12799OFFase1);
               GXutil.writeLogRaw("Current: ",T01LF2_A12799OFFase1[0]);
            }
            if ( GXutil.strcmp(Z12800OFFase2, T01LF2_A12800OFFase2[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFase2");
               GXutil.writeLogRaw("Old: ",Z12800OFFase2);
               GXutil.writeLogRaw("Current: ",T01LF2_A12800OFFase2[0]);
            }
            if ( GXutil.strcmp(Z12801OFAccion, T01LF2_A12801OFAccion[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFAccion");
               GXutil.writeLogRaw("Old: ",Z12801OFAccion);
               GXutil.writeLogRaw("Current: ",T01LF2_A12801OFAccion[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12802OFFecIns), GXutil.resetTime(T01LF2_A12802OFFecIns[0])) ) )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFecIns");
               GXutil.writeLogRaw("Old: ",Z12802OFFecIns);
               GXutil.writeLogRaw("Current: ",T01LF2_A12802OFFecIns[0]);
            }
            if ( GXutil.strcmp(Z12803OFPedcli, T01LF2_A12803OFPedcli[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFPedcli");
               GXutil.writeLogRaw("Old: ",Z12803OFPedcli);
               GXutil.writeLogRaw("Current: ",T01LF2_A12803OFPedcli[0]);
            }
            if ( GXutil.strcmp(Z12804OFProceso, T01LF2_A12804OFProceso[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFProceso");
               GXutil.writeLogRaw("Old: ",Z12804OFProceso);
               GXutil.writeLogRaw("Current: ",T01LF2_A12804OFProceso[0]);
            }
            if ( !( GXutil.dateCompare(Z12805OFFec1, T01LF2_A12805OFFec1[0]) ) )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFec1");
               GXutil.writeLogRaw("Old: ",Z12805OFFec1);
               GXutil.writeLogRaw("Current: ",T01LF2_A12805OFFec1[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12806OFFec2), GXutil.resetTime(T01LF2_A12806OFFec2[0])) ) )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFFec2");
               GXutil.writeLogRaw("Old: ",Z12806OFFec2);
               GXutil.writeLogRaw("Current: ",T01LF2_A12806OFFec2[0]);
            }
            if ( GXutil.strcmp(Z12807OFOk, T01LF2_A12807OFOk[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFOk");
               GXutil.writeLogRaw("Old: ",Z12807OFOk);
               GXutil.writeLogRaw("Current: ",T01LF2_A12807OFOk[0]);
            }
            if ( GXutil.strcmp(Z12808OFNoOk, T01LF2_A12808OFNoOk[0]) != 0 )
            {
               GXutil.writeLogln("totif:[seudo value changed for attri]"+"OFNoOk");
               GXutil.writeLogRaw("Old: ",Z12808OFNoOk);
               GXutil.writeLogRaw("Current: ",T01LF2_A12808OFNoOk[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOTIFDE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LF1757( )
   {
      beforeValidate1LF1757( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LF1757( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LF1757( 0) ;
         checkOptimisticConcurrency1LF1757( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LF1757( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LF1757( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LF16 */
                  pr_default.execute(14, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Integer.valueOf(A12791OFHdr), Byte.valueOf(A12792OFHdrR), A12793OFHdrP, Boolean.valueOf(n12794OFFecHis), A12794OFFecHis, Boolean.valueOf(n12795OFFecEnt), A12795OFFecEnt, Boolean.valueOf(n12796OFFecRm), A12796OFFecRm, Boolean.valueOf(n12797OFFecHd), A12797OFFecHd, Boolean.valueOf(n12798OFSit), Byte.valueOf(A12798OFSit), Boolean.valueOf(n12799OFFase1), A12799OFFase1, Boolean.valueOf(n12800OFFase2), A12800OFFase2, Boolean.valueOf(n12801OFAccion), A12801OFAccion, Boolean.valueOf(n12802OFFecIns), A12802OFFecIns, Boolean.valueOf(n12803OFPedcli), A12803OFPedcli, Boolean.valueOf(n12804OFProceso), A12804OFProceso, Boolean.valueOf(n12805OFFec1), A12805OFFec1, Boolean.valueOf(n12806OFFec2), A12806OFFec2, Boolean.valueOf(n12807OFOk), A12807OFOk, Boolean.valueOf(n12808OFNoOk), A12808OFNoOk});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIFDE");
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
            load1LF1757( ) ;
         }
         endLevel1LF1757( ) ;
      }
      closeExtendedTableCursors1LF1757( ) ;
   }

   public void update1LF1757( )
   {
      beforeValidate1LF1757( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LF1757( ) ;
      }
      if ( ( nIsMod_1757 != 0 ) || ( nIsDirty_1757 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LF1757( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LF1757( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LF1757( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LF17 */
                     pr_default.execute(15, new Object[] {Boolean.valueOf(n12794OFFecHis), A12794OFFecHis, Boolean.valueOf(n12795OFFecEnt), A12795OFFecEnt, Boolean.valueOf(n12796OFFecRm), A12796OFFecRm, Boolean.valueOf(n12797OFFecHd), A12797OFFecHd, Boolean.valueOf(n12798OFSit), Byte.valueOf(A12798OFSit), Boolean.valueOf(n12799OFFase1), A12799OFFase1, Boolean.valueOf(n12800OFFase2), A12800OFFase2, Boolean.valueOf(n12801OFAccion), A12801OFAccion, Boolean.valueOf(n12802OFFecIns), A12802OFFecIns, Boolean.valueOf(n12803OFPedcli), A12803OFPedcli, Boolean.valueOf(n12804OFProceso), A12804OFProceso, Boolean.valueOf(n12805OFFec1), A12805OFFec1, Boolean.valueOf(n12806OFFec2), A12806OFFec2, Boolean.valueOf(n12807OFOk), A12807OFOk, Boolean.valueOf(n12808OFNoOk), A12808OFNoOk, A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Integer.valueOf(A12791OFHdr), Byte.valueOf(A12792OFHdrR), A12793OFHdrP});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIFDE");
                     if ( (pr_default.getStatus(15) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOTIFDE"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LF1757( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LF1757( ) ;
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
            endLevel1LF1757( ) ;
         }
      }
      closeExtendedTableCursors1LF1757( ) ;
   }

   public void deferredUpdate1LF1757( )
   {
   }

   public void delete1LF1757( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LF1757( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LF1757( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LF1757( ) ;
         afterConfirm1LF1757( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LF1757( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LF18 */
               pr_default.execute(16, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio, Integer.valueOf(A12791OFHdr), Byte.valueOf(A12792OFHdrR), A12793OFHdrP});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOTIFDE");
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
      sMode1757 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LF1757( ) ;
      Gx_mode = sMode1757 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LF1757( )
   {
      standaloneModal1LF1757( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1LF1757( )
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

   public void scanStart1LF1757( )
   {
      /* Scan By routine */
      /* Using cursor T01LF19 */
      pr_default.execute(17, new Object[] {A12781OFIdEmpres, A12782OFFecha, A12783OFIdSeccio});
      RcdFound1757 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1757 = (short)(1) ;
         A12791OFHdr = T01LF19_A12791OFHdr[0] ;
         A12792OFHdrR = T01LF19_A12792OFHdrR[0] ;
         A12793OFHdrP = T01LF19_A12793OFHdrP[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LF1757( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1757 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1757 = (short)(1) ;
         A12791OFHdr = T01LF19_A12791OFHdr[0] ;
         A12792OFHdrR = T01LF19_A12792OFHdrR[0] ;
         A12793OFHdrP = T01LF19_A12793OFHdrP[0] ;
      }
   }

   public void scanEnd1LF1757( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1LF1757( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LF1757( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LF1757( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LF1757( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LF1757( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LF1757( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LF1757( )
   {
      edtOFHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdr_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFHdrR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFHdrR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrR_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFHdrP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFHdrP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrP_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFecHis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFecHis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecHis_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecEnt_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFecRm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFecRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecRm_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFecHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFecHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecHd_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFSit_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFase1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFase1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFase1_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFase2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFase2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFase2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFAccion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFAccion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFAccion_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFecIns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFecIns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFecIns_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFPedcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFPedcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFPedcli_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFProceso_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFProceso_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFProceso_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFec1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFec1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFec1_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFFec2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFFec2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFFec2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFOk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFOk_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFNoOk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFNoOk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFNoOk_Enabled), 5, 0), !bGXsfl_80_Refreshing);
   }

   public void send_integrity_lvl_hashes1LF1757( )
   {
   }

   public void send_integrity_lvl_hashes1LF1756( )
   {
   }

   public void subsflControlProps_801757( )
   {
      edtavnRcdDeleted_1757_Internalname = "vNRCDDELETED_1757_"+sGXsfl_80_idx ;
      edtOFHdr_Internalname = "OFHDR_"+sGXsfl_80_idx ;
      edtOFHdrR_Internalname = "OFHDRR_"+sGXsfl_80_idx ;
      edtOFHdrP_Internalname = "OFHDRP_"+sGXsfl_80_idx ;
      edtOFFecHis_Internalname = "OFFECHIS_"+sGXsfl_80_idx ;
      edtOFFecEnt_Internalname = "OFFECENT_"+sGXsfl_80_idx ;
      edtOFFecRm_Internalname = "OFFECRM_"+sGXsfl_80_idx ;
      edtOFFecHd_Internalname = "OFFECHD_"+sGXsfl_80_idx ;
      edtOFSit_Internalname = "OFSIT_"+sGXsfl_80_idx ;
      edtOFFase1_Internalname = "OFFASE1_"+sGXsfl_80_idx ;
      edtOFFase2_Internalname = "OFFASE2_"+sGXsfl_80_idx ;
      edtOFAccion_Internalname = "OFACCION_"+sGXsfl_80_idx ;
      edtOFFecIns_Internalname = "OFFECINS_"+sGXsfl_80_idx ;
      edtOFPedcli_Internalname = "OFPEDCLI_"+sGXsfl_80_idx ;
      edtOFProceso_Internalname = "OFPROCESO_"+sGXsfl_80_idx ;
      edtOFFec1_Internalname = "OFFEC1_"+sGXsfl_80_idx ;
      edtOFFec2_Internalname = "OFFEC2_"+sGXsfl_80_idx ;
      edtOFOk_Internalname = "OFOK_"+sGXsfl_80_idx ;
      edtOFNoOk_Internalname = "OFNOOK_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_801757( )
   {
      edtavnRcdDeleted_1757_Internalname = "vNRCDDELETED_1757_"+sGXsfl_80_fel_idx ;
      edtOFHdr_Internalname = "OFHDR_"+sGXsfl_80_fel_idx ;
      edtOFHdrR_Internalname = "OFHDRR_"+sGXsfl_80_fel_idx ;
      edtOFHdrP_Internalname = "OFHDRP_"+sGXsfl_80_fel_idx ;
      edtOFFecHis_Internalname = "OFFECHIS_"+sGXsfl_80_fel_idx ;
      edtOFFecEnt_Internalname = "OFFECENT_"+sGXsfl_80_fel_idx ;
      edtOFFecRm_Internalname = "OFFECRM_"+sGXsfl_80_fel_idx ;
      edtOFFecHd_Internalname = "OFFECHD_"+sGXsfl_80_fel_idx ;
      edtOFSit_Internalname = "OFSIT_"+sGXsfl_80_fel_idx ;
      edtOFFase1_Internalname = "OFFASE1_"+sGXsfl_80_fel_idx ;
      edtOFFase2_Internalname = "OFFASE2_"+sGXsfl_80_fel_idx ;
      edtOFAccion_Internalname = "OFACCION_"+sGXsfl_80_fel_idx ;
      edtOFFecIns_Internalname = "OFFECINS_"+sGXsfl_80_fel_idx ;
      edtOFPedcli_Internalname = "OFPEDCLI_"+sGXsfl_80_fel_idx ;
      edtOFProceso_Internalname = "OFPROCESO_"+sGXsfl_80_fel_idx ;
      edtOFFec1_Internalname = "OFFEC1_"+sGXsfl_80_fel_idx ;
      edtOFFec2_Internalname = "OFFEC2_"+sGXsfl_80_fel_idx ;
      edtOFOk_Internalname = "OFOK_"+sGXsfl_80_fel_idx ;
      edtOFNoOk_Internalname = "OFNOOK_"+sGXsfl_80_fel_idx ;
   }

   public void addRow1LF1757( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801757( ) ;
      sendRow1LF1757( ) ;
   }

   public void sendRow1LF1757( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1757_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1757_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1757), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1757), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1757_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1757_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFHdr_Internalname,GXutil.ltrim( localUtil.ntoc( A12791OFHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12791OFHdr), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFHdr_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFHdrR_Internalname,GXutil.ltrim( localUtil.ntoc( A12792OFHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12792OFHdrR), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFHdrR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFHdrR_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFHdrP_Internalname,GXutil.rtrim( A12793OFHdrP),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFHdrP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFHdrP_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFecHis_Internalname,localUtil.format(A12794OFFecHis, "99/99/99"),localUtil.format( A12794OFFecHis, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,85);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFecHis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFecHis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFecEnt_Internalname,localUtil.format(A12795OFFecEnt, "99/99/99"),localUtil.format( A12795OFFecEnt, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFecEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFecRm_Internalname,localUtil.format(A12796OFFecRm, "99/99/99"),localUtil.format( A12796OFFecRm, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,87);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFecRm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFecRm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFecHd_Internalname,localUtil.format(A12797OFFecHd, "99/99/99"),localUtil.format( A12797OFFecHd, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,88);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFecHd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFecHd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFSit_Internalname,GXutil.ltrim( localUtil.ntoc( A12798OFSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOFSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12798OFSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12798OFSit), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFSit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFase1_Internalname,GXutil.rtrim( A12799OFFase1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFase1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFase1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFase2_Internalname,GXutil.rtrim( A12800OFFase2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFase2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFase2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFAccion_Internalname,GXutil.rtrim( A12801OFAccion),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFAccion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFAccion_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFecIns_Internalname,localUtil.format(A12802OFFecIns, "99/99/99"),localUtil.format( A12802OFFecIns, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,93);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFecIns_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFecIns_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFPedcli_Internalname,GXutil.rtrim( A12803OFPedcli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFPedcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFPedcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFProceso_Internalname,GXutil.rtrim( A12804OFProceso),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFProceso_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFProceso_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFec1_Internalname,localUtil.ttoc( A12805OFFec1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12805OFFec1, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFec1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFec1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFFec2_Internalname,localUtil.format(A12806OFFec2, "99/99/99"),localUtil.format( A12806OFFec2, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFFec2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFFec2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFOk_Internalname,GXutil.rtrim( A12807OFOk),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFOk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFOk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1757_" + sGXsfl_80_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_80_idx + "',80)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOFNoOk_Internalname,GXutil.rtrim( A12808OFNoOk),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOFNoOk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOFNoOk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1LF1757( ) ;
      GXCCtl = "Z12791OFHdr_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12791OFHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12792OFHdrR_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12792OFHdrR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12793OFHdrP_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12793OFHdrP));
      GXCCtl = "Z12794OFFecHis_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z12794OFFecHis, 0, "/"));
      GXCCtl = "Z12795OFFecEnt_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z12795OFFecEnt, 0, "/"));
      GXCCtl = "Z12796OFFecRm_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z12796OFFecRm, 0, "/"));
      GXCCtl = "Z12797OFFecHd_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z12797OFFecHd, 0, "/"));
      GXCCtl = "Z12798OFSit_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12798OFSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12799OFFase1_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12799OFFase1));
      GXCCtl = "Z12800OFFase2_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12800OFFase2));
      GXCCtl = "Z12801OFAccion_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12801OFAccion));
      GXCCtl = "Z12802OFFecIns_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z12802OFFecIns, 0, "/"));
      GXCCtl = "Z12803OFPedcli_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12803OFPedcli));
      GXCCtl = "Z12804OFProceso_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12804OFProceso));
      GXCCtl = "Z12805OFFec1_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12805OFFec1, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12806OFFec2_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z12806OFFec2, 0, "/"));
      GXCCtl = "Z12807OFOk_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12807OFOk));
      GXCCtl = "Z12808OFNoOk_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12808OFNoOk));
      GXCCtl = "nRcdDeleted_1757_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1757_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1757_" + sGXsfl_80_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1757, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1757_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1757_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFHDR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFHDRR_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdrR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFHDRP_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdrP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFECHIS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecHis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFECENT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFECRM_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecRm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFECHD_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFSIT_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFASE1_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFase1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFASE2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFase2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFACCION_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFAccion_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFECINS_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecIns_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFPEDCLI_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFPedcli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFPROCESO_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFProceso_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFEC1_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFec1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFFEC2_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFec2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFOK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFOk_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OFNOOK_"+sGXsfl_80_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOFNoOk_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1LF1757( )
   {
      nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801757( ) ;
      edtavnRcdDeleted_1757_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1757_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFHDR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFHdrR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFHDRR_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFHdrP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFHDRP_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFecHis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECHIS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFecEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECENT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFecRm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECRM_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFecHd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECHD_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFSIT_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFase1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFASE1_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFase2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFASE2_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFAccion_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFACCION_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFecIns_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFECINS_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFPedcli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFPEDCLI_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFProceso_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFPROCESO_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFec1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFEC1_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFFec2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFFEC2_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFOk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFOK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOFNoOk_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OFNOOK_"+sGXsfl_80_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1757_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1757_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1757");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1757_Internalname ;
         wbErr = true ;
         nRcdDeleted_1757 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1757 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1757_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOFHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOFHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "OFHDR_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFHdr_Internalname ;
         wbErr = true ;
         A12791OFHdr = 0 ;
      }
      else
      {
         A12791OFHdr = (int)(localUtil.ctol( httpContext.cgiGet( edtOFHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOFHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOFHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "OFHDRR_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFHdrR_Internalname ;
         wbErr = true ;
         A12792OFHdrR = (byte)(0) ;
      }
      else
      {
         A12792OFHdrR = (byte)(localUtil.ctol( httpContext.cgiGet( edtOFHdrR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A12793OFHdrP = httpContext.cgiGet( edtOFHdrP_Internalname) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtOFFecHis_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "OFFECHIS_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFFecHis_Internalname ;
         wbErr = true ;
         A12794OFFecHis = GXutil.nullDate() ;
         n12794OFFecHis = false ;
      }
      else
      {
         A12794OFFecHis = localUtil.ctod( httpContext.cgiGet( edtOFFecHis_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n12794OFFecHis = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtOFFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "OFFECENT_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFFecEnt_Internalname ;
         wbErr = true ;
         A12795OFFecEnt = GXutil.nullDate() ;
         n12795OFFecEnt = false ;
      }
      else
      {
         A12795OFFecEnt = localUtil.ctod( httpContext.cgiGet( edtOFFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n12795OFFecEnt = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtOFFecRm_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "OFFECRM_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFFecRm_Internalname ;
         wbErr = true ;
         A12796OFFecRm = GXutil.nullDate() ;
         n12796OFFecRm = false ;
      }
      else
      {
         A12796OFFecRm = localUtil.ctod( httpContext.cgiGet( edtOFFecRm_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n12796OFFecRm = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtOFFecHd_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "OFFECHD_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFFecHd_Internalname ;
         wbErr = true ;
         A12797OFFecHd = GXutil.nullDate() ;
         n12797OFFecHd = false ;
      }
      else
      {
         A12797OFFecHd = localUtil.ctod( httpContext.cgiGet( edtOFFecHd_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n12797OFFecHd = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOFSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOFSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "OFSIT_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFSit_Internalname ;
         wbErr = true ;
         A12798OFSit = (byte)(0) ;
         n12798OFSit = false ;
      }
      else
      {
         A12798OFSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtOFSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12798OFSit = false ;
      }
      A12799OFFase1 = httpContext.cgiGet( edtOFFase1_Internalname) ;
      n12799OFFase1 = false ;
      A12800OFFase2 = httpContext.cgiGet( edtOFFase2_Internalname) ;
      n12800OFFase2 = false ;
      A12801OFAccion = httpContext.cgiGet( edtOFAccion_Internalname) ;
      n12801OFAccion = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtOFFecIns_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "OFFECINS_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFFecIns_Internalname ;
         wbErr = true ;
         A12802OFFecIns = GXutil.nullDate() ;
         n12802OFFecIns = false ;
      }
      else
      {
         A12802OFFecIns = localUtil.ctod( httpContext.cgiGet( edtOFFecIns_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n12802OFFecIns = false ;
      }
      A12803OFPedcli = httpContext.cgiGet( edtOFPedcli_Internalname) ;
      n12803OFPedcli = false ;
      A12804OFProceso = httpContext.cgiGet( edtOFProceso_Internalname) ;
      n12804OFProceso = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtOFFec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "OFFEC1_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFFec1_Internalname ;
         wbErr = true ;
         A12805OFFec1 = GXutil.resetTime( GXutil.nullDate() );
         n12805OFFec1 = false ;
      }
      else
      {
         A12805OFFec1 = localUtil.ctot( httpContext.cgiGet( edtOFFec1_Internalname)) ;
         n12805OFFec1 = false ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtOFFec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "OFFEC2_" + sGXsfl_80_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOFFec2_Internalname ;
         wbErr = true ;
         A12806OFFec2 = GXutil.nullDate() ;
         n12806OFFec2 = false ;
      }
      else
      {
         A12806OFFec2 = localUtil.ctod( httpContext.cgiGet( edtOFFec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n12806OFFec2 = false ;
      }
      A12807OFOk = httpContext.cgiGet( edtOFOk_Internalname) ;
      n12807OFOk = false ;
      A12808OFNoOk = httpContext.cgiGet( edtOFNoOk_Internalname) ;
      n12808OFNoOk = false ;
      GXCCtl = "Z12791OFHdr_" + sGXsfl_80_idx ;
      Z12791OFHdr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12792OFHdrR_" + sGXsfl_80_idx ;
      Z12792OFHdrR = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12793OFHdrP_" + sGXsfl_80_idx ;
      Z12793OFHdrP = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12794OFFecHis_" + sGXsfl_80_idx ;
      Z12794OFFecHis = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12795OFFecEnt_" + sGXsfl_80_idx ;
      Z12795OFFecEnt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12796OFFecRm_" + sGXsfl_80_idx ;
      Z12796OFFecRm = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12797OFFecHd_" + sGXsfl_80_idx ;
      Z12797OFFecHd = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12798OFSit_" + sGXsfl_80_idx ;
      Z12798OFSit = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12799OFFase1_" + sGXsfl_80_idx ;
      Z12799OFFase1 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12800OFFase2_" + sGXsfl_80_idx ;
      Z12800OFFase2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12801OFAccion_" + sGXsfl_80_idx ;
      Z12801OFAccion = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12802OFFecIns_" + sGXsfl_80_idx ;
      Z12802OFFecIns = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12803OFPedcli_" + sGXsfl_80_idx ;
      Z12803OFPedcli = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12804OFProceso_" + sGXsfl_80_idx ;
      Z12804OFProceso = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12805OFFec1_" + sGXsfl_80_idx ;
      Z12805OFFec1 = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12806OFFec2_" + sGXsfl_80_idx ;
      Z12806OFFec2 = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12807OFOk_" + sGXsfl_80_idx ;
      Z12807OFOk = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12808OFNoOk_" + sGXsfl_80_idx ;
      Z12808OFNoOk = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1757_" + sGXsfl_80_idx ;
      nRcdDeleted_1757 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1757_" + sGXsfl_80_idx ;
      nRcdExists_1757 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1757_" + sGXsfl_80_idx ;
      nIsMod_1757 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOFHdrP_Enabled = edtOFHdrP_Enabled ;
      defedtOFHdrR_Enabled = edtOFHdrR_Enabled ;
      defedtOFHdr_Enabled = edtOFHdr_Enabled ;
   }

   public void confirmValues1LF0( )
   {
      nGXsfl_80_idx = 0 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_801757( ) ;
      while ( nGXsfl_80_idx < nRC_GXsfl_80 )
      {
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801757( ) ;
         httpContext.changePostValue( "Z12791OFHdr_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12791OFHdr_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12791OFHdr_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12792OFHdrR_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12792OFHdrR_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12792OFHdrR_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12793OFHdrP_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12793OFHdrP_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12793OFHdrP_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12794OFFecHis_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12794OFFecHis_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12794OFFecHis_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12795OFFecEnt_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12795OFFecEnt_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12795OFFecEnt_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12796OFFecRm_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12796OFFecRm_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12796OFFecRm_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12797OFFecHd_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12797OFFecHd_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12797OFFecHd_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12798OFSit_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12798OFSit_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12798OFSit_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12799OFFase1_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12799OFFase1_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12799OFFase1_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12800OFFase2_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12800OFFase2_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12800OFFase2_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12801OFAccion_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12801OFAccion_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12801OFAccion_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12802OFFecIns_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12802OFFecIns_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12802OFFecIns_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12803OFPedcli_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12803OFPedcli_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12803OFPedcli_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12804OFProceso_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12804OFProceso_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12804OFProceso_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12805OFFec1_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12805OFFec1_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12805OFFec1_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12806OFFec2_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12806OFFec2_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12806OFFec2_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12807OFOk_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12807OFOk_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12807OFOk_"+sGXsfl_80_idx) ;
         httpContext.changePostValue( "Z12808OFNoOk_"+sGXsfl_80_idx, httpContext.cgiGet( "ZT_"+"Z12808OFNoOk_"+sGXsfl_80_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12808OFNoOk_"+sGXsfl_80_idx) ;
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.totif", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12781OFIdEmpres", GXutil.rtrim( Z12781OFIdEmpres));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12782OFFecha", localUtil.dtoc( Z12782OFFecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12783OFIdSeccio", GXutil.rtrim( Z12783OFIdSeccio));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12784OFIdEmpSec", GXutil.rtrim( Z12784OFIdEmpSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12785OFAnyo", GXutil.ltrim( localUtil.ntoc( Z12785OFAnyo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12786OFMes", GXutil.ltrim( localUtil.ntoc( Z12786OFMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12787OFSecion", GXutil.rtrim( Z12787OFSecion));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12788OFHdrs", GXutil.ltrim( localUtil.ntoc( Z12788OFHdrs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12789OFCumplida", GXutil.ltrim( localUtil.ntoc( Z12789OFCumplida, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12790OFIncumpli", GXutil.ltrim( localUtil.ntoc( Z12790OFIncumpli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12812OFFecCorte", localUtil.ttoc( Z12812OFFecCorte, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12813OFObs", Z12813OFObs);
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
      return formatLink("app.totif", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TOTIF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OTIF", "") ;
   }

   public void initializeNonKey1LF1756( )
   {
      A12784OFIdEmpSec = "" ;
      n12784OFIdEmpSec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12784OFIdEmpSec", A12784OFIdEmpSec);
      A12785OFAnyo = (short)(0) ;
      n12785OFAnyo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12785OFAnyo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12785OFAnyo), 4, 0));
      A12786OFMes = (byte)(0) ;
      n12786OFMes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12786OFMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12786OFMes), 2, 0));
      A12787OFSecion = "" ;
      n12787OFSecion = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12787OFSecion", A12787OFSecion);
      A12788OFHdrs = 0 ;
      n12788OFHdrs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12788OFHdrs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12788OFHdrs), 6, 0));
      A12789OFCumplida = 0 ;
      n12789OFCumplida = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12789OFCumplida", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12789OFCumplida), 6, 0));
      A12790OFIncumpli = 0 ;
      n12790OFIncumpli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12790OFIncumpli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12790OFIncumpli), 6, 0));
      A12812OFFecCorte = GXutil.resetTime( GXutil.nullDate() );
      n12812OFFecCorte = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12812OFFecCorte", localUtil.ttoc( A12812OFFecCorte, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12813OFObs = "" ;
      n12813OFObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12813OFObs", A12813OFObs);
      Z12784OFIdEmpSec = "" ;
      Z12785OFAnyo = (short)(0) ;
      Z12786OFMes = (byte)(0) ;
      Z12787OFSecion = "" ;
      Z12788OFHdrs = 0 ;
      Z12789OFCumplida = 0 ;
      Z12790OFIncumpli = 0 ;
      Z12812OFFecCorte = GXutil.resetTime( GXutil.nullDate() );
      Z12813OFObs = "" ;
   }

   public void initAll1LF1756( )
   {
      A12781OFIdEmpres = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12781OFIdEmpres", A12781OFIdEmpres);
      A12782OFFecha = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A12782OFFecha", localUtil.format(A12782OFFecha, "99/99/99"));
      A12783OFIdSeccio = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12783OFIdSeccio", A12783OFIdSeccio);
      initializeNonKey1LF1756( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LF1757( )
   {
      A12794OFFecHis = GXutil.nullDate() ;
      n12794OFFecHis = false ;
      A12795OFFecEnt = GXutil.nullDate() ;
      n12795OFFecEnt = false ;
      A12796OFFecRm = GXutil.nullDate() ;
      n12796OFFecRm = false ;
      A12797OFFecHd = GXutil.nullDate() ;
      n12797OFFecHd = false ;
      A12798OFSit = (byte)(0) ;
      n12798OFSit = false ;
      A12799OFFase1 = "" ;
      n12799OFFase1 = false ;
      A12800OFFase2 = "" ;
      n12800OFFase2 = false ;
      A12801OFAccion = "" ;
      n12801OFAccion = false ;
      A12802OFFecIns = GXutil.nullDate() ;
      n12802OFFecIns = false ;
      A12803OFPedcli = "" ;
      n12803OFPedcli = false ;
      A12804OFProceso = "" ;
      n12804OFProceso = false ;
      A12805OFFec1 = GXutil.resetTime( GXutil.nullDate() );
      n12805OFFec1 = false ;
      A12806OFFec2 = GXutil.nullDate() ;
      n12806OFFec2 = false ;
      A12807OFOk = "" ;
      n12807OFOk = false ;
      A12808OFNoOk = "" ;
      n12808OFNoOk = false ;
      Z12794OFFecHis = GXutil.nullDate() ;
      Z12795OFFecEnt = GXutil.nullDate() ;
      Z12796OFFecRm = GXutil.nullDate() ;
      Z12797OFFecHd = GXutil.nullDate() ;
      Z12798OFSit = (byte)(0) ;
      Z12799OFFase1 = "" ;
      Z12800OFFase2 = "" ;
      Z12801OFAccion = "" ;
      Z12802OFFecIns = GXutil.nullDate() ;
      Z12803OFPedcli = "" ;
      Z12804OFProceso = "" ;
      Z12805OFFec1 = GXutil.resetTime( GXutil.nullDate() );
      Z12806OFFec2 = GXutil.nullDate() ;
      Z12807OFOk = "" ;
      Z12808OFNoOk = "" ;
   }

   public void initAll1LF1757( )
   {
      A12791OFHdr = 0 ;
      A12792OFHdrR = (byte)(0) ;
      A12793OFHdrP = "" ;
      initializeNonKey1LF1757( ) ;
   }

   public void standaloneModalInsert1LF1757( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016341852", true, true);
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
      httpContext.AddJavascriptSource("totif.js", "?202661016341852", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1757( )
   {
      edtOFHdrP_Enabled = defedtOFHdrP_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFHdrP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrP_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFHdrR_Enabled = defedtOFHdrR_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFHdrR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdrR_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtOFHdr_Enabled = defedtOFHdr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOFHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOFHdr_Enabled), 5, 0), !bGXsfl_80_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1757, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1757_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12791OFHdr, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12792OFHdrR, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdrR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12793OFHdrP));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFHdrP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A12794OFFecHis, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecHis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A12795OFFecEnt, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A12796OFFecRm, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecRm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A12797OFFecHd, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecHd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12798OFSit, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12799OFFase1));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFase1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12800OFFase2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFase2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12801OFAccion));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFAccion_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A12802OFFecIns, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFecIns_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12803OFPedcli));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFPedcli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12804OFProceso));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFProceso_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12805OFFec1, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFec1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A12806OFFec2, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFFec2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12807OFOk));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFOk_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12808OFNoOk));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOFNoOk_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOFIdEmpres_Internalname = "OFIDEMPRES" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtOFFecha_Internalname = "OFFECHA" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtOFIdSeccio_Internalname = "OFIDSECCIO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtOFIdEmpSec_Internalname = "OFIDEMPSEC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtOFAnyo_Internalname = "OFANYO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtOFMes_Internalname = "OFMES" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtOFSecion_Internalname = "OFSECION" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtOFHdrs_Internalname = "OFHDRS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtOFCumplida_Internalname = "OFCUMPLIDA" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtOFIncumpli_Internalname = "OFINCUMPLI" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtOFFecCorte_Internalname = "OFFECCORTE" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtOFObs_Internalname = "OFOBS" ;
      edtavnRcdDeleted_1757_Internalname = "vNRCDDELETED_1757" ;
      edtOFHdr_Internalname = "OFHDR" ;
      edtOFHdrR_Internalname = "OFHDRR" ;
      edtOFHdrP_Internalname = "OFHDRP" ;
      edtOFFecHis_Internalname = "OFFECHIS" ;
      edtOFFecEnt_Internalname = "OFFECENT" ;
      edtOFFecRm_Internalname = "OFFECRM" ;
      edtOFFecHd_Internalname = "OFFECHD" ;
      edtOFSit_Internalname = "OFSIT" ;
      edtOFFase1_Internalname = "OFFASE1" ;
      edtOFFase2_Internalname = "OFFASE2" ;
      edtOFAccion_Internalname = "OFACCION" ;
      edtOFFecIns_Internalname = "OFFECINS" ;
      edtOFPedcli_Internalname = "OFPEDCLI" ;
      edtOFProceso_Internalname = "OFPROCESO" ;
      edtOFFec1_Internalname = "OFFEC1" ;
      edtOFFec2_Internalname = "OFFEC2" ;
      edtOFOk_Internalname = "OFOK" ;
      edtOFNoOk_Internalname = "OFNOOK" ;
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
      Form.setCaption( httpContext.getMessage( "OTIF", "") );
      edtOFNoOk_Jsonclick = "" ;
      edtOFOk_Jsonclick = "" ;
      edtOFFec2_Jsonclick = "" ;
      edtOFFec1_Jsonclick = "" ;
      edtOFProceso_Jsonclick = "" ;
      edtOFPedcli_Jsonclick = "" ;
      edtOFFecIns_Jsonclick = "" ;
      edtOFAccion_Jsonclick = "" ;
      edtOFFase2_Jsonclick = "" ;
      edtOFFase1_Jsonclick = "" ;
      edtOFSit_Jsonclick = "" ;
      edtOFFecHd_Jsonclick = "" ;
      edtOFFecRm_Jsonclick = "" ;
      edtOFFecEnt_Jsonclick = "" ;
      edtOFFecHis_Jsonclick = "" ;
      edtOFHdrP_Jsonclick = "" ;
      edtOFHdrR_Jsonclick = "" ;
      edtOFHdr_Jsonclick = "" ;
      edtavnRcdDeleted_1757_Jsonclick = "" ;
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
      edtOFNoOk_Enabled = 1 ;
      edtOFOk_Enabled = 1 ;
      edtOFFec2_Enabled = 1 ;
      edtOFFec1_Enabled = 1 ;
      edtOFProceso_Enabled = 1 ;
      edtOFPedcli_Enabled = 1 ;
      edtOFFecIns_Enabled = 1 ;
      edtOFAccion_Enabled = 1 ;
      edtOFFase2_Enabled = 1 ;
      edtOFFase1_Enabled = 1 ;
      edtOFSit_Enabled = 1 ;
      edtOFFecHd_Enabled = 1 ;
      edtOFFecRm_Enabled = 1 ;
      edtOFFecEnt_Enabled = 1 ;
      edtOFFecHis_Enabled = 1 ;
      edtOFHdrP_Enabled = 1 ;
      edtOFHdrR_Enabled = 1 ;
      edtOFHdr_Enabled = 1 ;
      edtavnRcdDeleted_1757_Enabled = 1 ;
      edtOFObs_Backcolor = (int)(0xFFFFFF) ;
      edtOFObs_Enabled = 1 ;
      edtOFFecCorte_Jsonclick = "" ;
      edtOFFecCorte_Backcolor = (int)(0xFFFFFF) ;
      edtOFFecCorte_Enabled = 1 ;
      edtOFIncumpli_Jsonclick = "" ;
      edtOFIncumpli_Backcolor = (int)(0xFFFFFF) ;
      edtOFIncumpli_Enabled = 1 ;
      edtOFCumplida_Jsonclick = "" ;
      edtOFCumplida_Backcolor = (int)(0xFFFFFF) ;
      edtOFCumplida_Enabled = 1 ;
      edtOFHdrs_Jsonclick = "" ;
      edtOFHdrs_Backcolor = (int)(0xFFFFFF) ;
      edtOFHdrs_Enabled = 1 ;
      edtOFSecion_Jsonclick = "" ;
      edtOFSecion_Backcolor = (int)(0xFFFFFF) ;
      edtOFSecion_Enabled = 1 ;
      edtOFMes_Jsonclick = "" ;
      edtOFMes_Backcolor = (int)(0xFFFFFF) ;
      edtOFMes_Enabled = 1 ;
      edtOFAnyo_Jsonclick = "" ;
      edtOFAnyo_Backcolor = (int)(0xFFFFFF) ;
      edtOFAnyo_Enabled = 1 ;
      edtOFIdEmpSec_Jsonclick = "" ;
      edtOFIdEmpSec_Backcolor = (int)(0xFFFFFF) ;
      edtOFIdEmpSec_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtOFIdSeccio_Jsonclick = "" ;
      edtOFIdSeccio_Backcolor = (int)(0xFFFFFF) ;
      edtOFIdSeccio_Enabled = 1 ;
      edtOFFecha_Jsonclick = "" ;
      edtOFFecha_Backcolor = (int)(0xFFFFFF) ;
      edtOFFecha_Enabled = 1 ;
      edtOFIdEmpres_Jsonclick = "" ;
      edtOFIdEmpres_Backcolor = (int)(0xFFFFFF) ;
      edtOFIdEmpres_Enabled = 1 ;
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
      subsflControlProps_801757( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LF1757( ) ;
         standaloneModal1LF1757( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LF1757( ) ;
         nGXsfl_80_idx = (int)(nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_801757( ) ;
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
      GX_FocusControl = edtOFIdEmpSec_Internalname ;
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

   public void valid_Ofidseccio( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12784OFIdEmpSec", GXutil.rtrim( A12784OFIdEmpSec));
      httpContext.ajax_rsp_assign_attri("", false, "A12785OFAnyo", GXutil.ltrim( localUtil.ntoc( A12785OFAnyo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12786OFMes", GXutil.ltrim( localUtil.ntoc( A12786OFMes, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12787OFSecion", GXutil.rtrim( A12787OFSecion));
      httpContext.ajax_rsp_assign_attri("", false, "A12788OFHdrs", GXutil.ltrim( localUtil.ntoc( A12788OFHdrs, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12789OFCumplida", GXutil.ltrim( localUtil.ntoc( A12789OFCumplida, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12790OFIncumpli", GXutil.ltrim( localUtil.ntoc( A12790OFIncumpli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12812OFFecCorte", localUtil.ttoc( A12812OFFecCorte, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12813OFObs", A12813OFObs);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12781OFIdEmpres", GXutil.rtrim( Z12781OFIdEmpres));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12782OFFecha", localUtil.format(Z12782OFFecha, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12783OFIdSeccio", GXutil.rtrim( Z12783OFIdSeccio));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12784OFIdEmpSec", GXutil.rtrim( Z12784OFIdEmpSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12785OFAnyo", GXutil.ltrim( localUtil.ntoc( Z12785OFAnyo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12786OFMes", GXutil.ltrim( localUtil.ntoc( Z12786OFMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12787OFSecion", GXutil.rtrim( Z12787OFSecion));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12788OFHdrs", GXutil.ltrim( localUtil.ntoc( Z12788OFHdrs, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12789OFCumplida", GXutil.ltrim( localUtil.ntoc( Z12789OFCumplida, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12790OFIncumpli", GXutil.ltrim( localUtil.ntoc( Z12790OFIncumpli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12812OFFecCorte", localUtil.ttoc( Z12812OFFecCorte, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12813OFObs", Z12813OFObs);
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
      setEventMetadata("VALID_OFIDEMPRES","{handler:'valid_Ofidempres',iparms:[]");
      setEventMetadata("VALID_OFIDEMPRES",",oparms:[]}");
      setEventMetadata("VALID_OFFECHA","{handler:'valid_Offecha',iparms:[]");
      setEventMetadata("VALID_OFFECHA",",oparms:[]}");
      setEventMetadata("VALID_OFIDSECCIO","{handler:'valid_Ofidseccio',iparms:[{av:'A12781OFIdEmpres',fld:'OFIDEMPRES',pic:''},{av:'A12782OFFecha',fld:'OFFECHA',pic:''},{av:'A12783OFIdSeccio',fld:'OFIDSECCIO',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_OFIDSECCIO",",oparms:[{av:'A12784OFIdEmpSec',fld:'OFIDEMPSEC',pic:''},{av:'A12785OFAnyo',fld:'OFANYO',pic:'ZZZ9'},{av:'A12786OFMes',fld:'OFMES',pic:'Z9'},{av:'A12787OFSecion',fld:'OFSECION',pic:''},{av:'A12788OFHdrs',fld:'OFHDRS',pic:'ZZZZZ9'},{av:'A12789OFCumplida',fld:'OFCUMPLIDA',pic:'ZZZZZ9'},{av:'A12790OFIncumpli',fld:'OFINCUMPLI',pic:'ZZZZZ9'},{av:'A12812OFFecCorte',fld:'OFFECCORTE',pic:'99/99/99 99:99'},{av:'A12813OFObs',fld:'OFOBS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z12781OFIdEmpres'},{av:'Z12782OFFecha'},{av:'Z12783OFIdSeccio'},{av:'Z12784OFIdEmpSec'},{av:'Z12785OFAnyo'},{av:'Z12786OFMes'},{av:'Z12787OFSecion'},{av:'Z12788OFHdrs'},{av:'Z12789OFCumplida'},{av:'Z12790OFIncumpli'},{av:'Z12812OFFecCorte'},{av:'Z12813OFObs'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_OFHDR","{handler:'valid_Ofhdr',iparms:[]");
      setEventMetadata("VALID_OFHDR",",oparms:[]}");
      setEventMetadata("VALID_OFHDRR","{handler:'valid_Ofhdrr',iparms:[]");
      setEventMetadata("VALID_OFHDRR",",oparms:[]}");
      setEventMetadata("VALID_OFHDRP","{handler:'valid_Ofhdrp',iparms:[]");
      setEventMetadata("VALID_OFHDRP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ofnook',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z12781OFIdEmpres = "" ;
      Z12782OFFecha = GXutil.nullDate() ;
      Z12783OFIdSeccio = "" ;
      Z12784OFIdEmpSec = "" ;
      Z12787OFSecion = "" ;
      Z12812OFFecCorte = GXutil.resetTime( GXutil.nullDate() );
      Z12813OFObs = "" ;
      Z12793OFHdrP = "" ;
      Z12794OFFecHis = GXutil.nullDate() ;
      Z12795OFFecEnt = GXutil.nullDate() ;
      Z12796OFFecRm = GXutil.nullDate() ;
      Z12797OFFecHd = GXutil.nullDate() ;
      Z12799OFFase1 = "" ;
      Z12800OFFase2 = "" ;
      Z12801OFAccion = "" ;
      Z12802OFFecIns = GXutil.nullDate() ;
      Z12803OFPedcli = "" ;
      Z12804OFProceso = "" ;
      Z12805OFFec1 = GXutil.resetTime( GXutil.nullDate() );
      Z12806OFFec2 = GXutil.nullDate() ;
      Z12807OFOk = "" ;
      Z12808OFNoOk = "" ;
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
      A12781OFIdEmpres = "" ;
      lblTextblock2_Jsonclick = "" ;
      A12782OFFecha = GXutil.nullDate() ;
      lblTextblock3_Jsonclick = "" ;
      A12783OFIdSeccio = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12784OFIdEmpSec = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A12787OFSecion = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      A12812OFFecCorte = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock12_Jsonclick = "" ;
      A12813OFObs = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1757 = "" ;
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
      sMode1756 = "" ;
      GXCCtl = "" ;
      A12793OFHdrP = "" ;
      A12794OFFecHis = GXutil.nullDate() ;
      A12795OFFecEnt = GXutil.nullDate() ;
      A12796OFFecRm = GXutil.nullDate() ;
      A12797OFFecHd = GXutil.nullDate() ;
      A12799OFFase1 = "" ;
      A12800OFFase2 = "" ;
      A12801OFAccion = "" ;
      A12802OFFecIns = GXutil.nullDate() ;
      A12803OFPedcli = "" ;
      A12804OFProceso = "" ;
      A12805OFFec1 = GXutil.resetTime( GXutil.nullDate() );
      A12806OFFec2 = GXutil.nullDate() ;
      A12807OFOk = "" ;
      A12808OFNoOk = "" ;
      AV7Lit0 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      AV10EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      T01LF6_A12781OFIdEmpres = new String[] {""} ;
      T01LF6_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF6_A12783OFIdSeccio = new String[] {""} ;
      T01LF6_A12784OFIdEmpSec = new String[] {""} ;
      T01LF6_n12784OFIdEmpSec = new boolean[] {false} ;
      T01LF6_A12785OFAnyo = new short[1] ;
      T01LF6_n12785OFAnyo = new boolean[] {false} ;
      T01LF6_A12786OFMes = new byte[1] ;
      T01LF6_n12786OFMes = new boolean[] {false} ;
      T01LF6_A12787OFSecion = new String[] {""} ;
      T01LF6_n12787OFSecion = new boolean[] {false} ;
      T01LF6_A12788OFHdrs = new int[1] ;
      T01LF6_n12788OFHdrs = new boolean[] {false} ;
      T01LF6_A12789OFCumplida = new int[1] ;
      T01LF6_n12789OFCumplida = new boolean[] {false} ;
      T01LF6_A12790OFIncumpli = new int[1] ;
      T01LF6_n12790OFIncumpli = new boolean[] {false} ;
      T01LF6_A12812OFFecCorte = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF6_n12812OFFecCorte = new boolean[] {false} ;
      T01LF6_A12813OFObs = new String[] {""} ;
      T01LF6_n12813OFObs = new boolean[] {false} ;
      T01LF7_A12781OFIdEmpres = new String[] {""} ;
      T01LF7_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF7_A12783OFIdSeccio = new String[] {""} ;
      T01LF5_A12781OFIdEmpres = new String[] {""} ;
      T01LF5_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF5_A12783OFIdSeccio = new String[] {""} ;
      T01LF5_A12784OFIdEmpSec = new String[] {""} ;
      T01LF5_n12784OFIdEmpSec = new boolean[] {false} ;
      T01LF5_A12785OFAnyo = new short[1] ;
      T01LF5_n12785OFAnyo = new boolean[] {false} ;
      T01LF5_A12786OFMes = new byte[1] ;
      T01LF5_n12786OFMes = new boolean[] {false} ;
      T01LF5_A12787OFSecion = new String[] {""} ;
      T01LF5_n12787OFSecion = new boolean[] {false} ;
      T01LF5_A12788OFHdrs = new int[1] ;
      T01LF5_n12788OFHdrs = new boolean[] {false} ;
      T01LF5_A12789OFCumplida = new int[1] ;
      T01LF5_n12789OFCumplida = new boolean[] {false} ;
      T01LF5_A12790OFIncumpli = new int[1] ;
      T01LF5_n12790OFIncumpli = new boolean[] {false} ;
      T01LF5_A12812OFFecCorte = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF5_n12812OFFecCorte = new boolean[] {false} ;
      T01LF5_A12813OFObs = new String[] {""} ;
      T01LF5_n12813OFObs = new boolean[] {false} ;
      T01LF8_A12781OFIdEmpres = new String[] {""} ;
      T01LF8_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF8_A12783OFIdSeccio = new String[] {""} ;
      T01LF9_A12781OFIdEmpres = new String[] {""} ;
      T01LF9_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF9_A12783OFIdSeccio = new String[] {""} ;
      T01LF4_A12781OFIdEmpres = new String[] {""} ;
      T01LF4_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF4_A12783OFIdSeccio = new String[] {""} ;
      T01LF4_A12784OFIdEmpSec = new String[] {""} ;
      T01LF4_n12784OFIdEmpSec = new boolean[] {false} ;
      T01LF4_A12785OFAnyo = new short[1] ;
      T01LF4_n12785OFAnyo = new boolean[] {false} ;
      T01LF4_A12786OFMes = new byte[1] ;
      T01LF4_n12786OFMes = new boolean[] {false} ;
      T01LF4_A12787OFSecion = new String[] {""} ;
      T01LF4_n12787OFSecion = new boolean[] {false} ;
      T01LF4_A12788OFHdrs = new int[1] ;
      T01LF4_n12788OFHdrs = new boolean[] {false} ;
      T01LF4_A12789OFCumplida = new int[1] ;
      T01LF4_n12789OFCumplida = new boolean[] {false} ;
      T01LF4_A12790OFIncumpli = new int[1] ;
      T01LF4_n12790OFIncumpli = new boolean[] {false} ;
      T01LF4_A12812OFFecCorte = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF4_n12812OFFecCorte = new boolean[] {false} ;
      T01LF4_A12813OFObs = new String[] {""} ;
      T01LF4_n12813OFObs = new boolean[] {false} ;
      T01LF13_A12781OFIdEmpres = new String[] {""} ;
      T01LF13_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF13_A12783OFIdSeccio = new String[] {""} ;
      T01LF14_A12781OFIdEmpres = new String[] {""} ;
      T01LF14_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF14_A12783OFIdSeccio = new String[] {""} ;
      T01LF14_A12791OFHdr = new int[1] ;
      T01LF14_A12792OFHdrR = new byte[1] ;
      T01LF14_A12793OFHdrP = new String[] {""} ;
      T01LF14_A12794OFFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF14_n12794OFFecHis = new boolean[] {false} ;
      T01LF14_A12795OFFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF14_n12795OFFecEnt = new boolean[] {false} ;
      T01LF14_A12796OFFecRm = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF14_n12796OFFecRm = new boolean[] {false} ;
      T01LF14_A12797OFFecHd = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF14_n12797OFFecHd = new boolean[] {false} ;
      T01LF14_A12798OFSit = new byte[1] ;
      T01LF14_n12798OFSit = new boolean[] {false} ;
      T01LF14_A12799OFFase1 = new String[] {""} ;
      T01LF14_n12799OFFase1 = new boolean[] {false} ;
      T01LF14_A12800OFFase2 = new String[] {""} ;
      T01LF14_n12800OFFase2 = new boolean[] {false} ;
      T01LF14_A12801OFAccion = new String[] {""} ;
      T01LF14_n12801OFAccion = new boolean[] {false} ;
      T01LF14_A12802OFFecIns = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF14_n12802OFFecIns = new boolean[] {false} ;
      T01LF14_A12803OFPedcli = new String[] {""} ;
      T01LF14_n12803OFPedcli = new boolean[] {false} ;
      T01LF14_A12804OFProceso = new String[] {""} ;
      T01LF14_n12804OFProceso = new boolean[] {false} ;
      T01LF14_A12805OFFec1 = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF14_n12805OFFec1 = new boolean[] {false} ;
      T01LF14_A12806OFFec2 = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF14_n12806OFFec2 = new boolean[] {false} ;
      T01LF14_A12807OFOk = new String[] {""} ;
      T01LF14_n12807OFOk = new boolean[] {false} ;
      T01LF14_A12808OFNoOk = new String[] {""} ;
      T01LF14_n12808OFNoOk = new boolean[] {false} ;
      T01LF15_A12781OFIdEmpres = new String[] {""} ;
      T01LF15_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF15_A12783OFIdSeccio = new String[] {""} ;
      T01LF15_A12791OFHdr = new int[1] ;
      T01LF15_A12792OFHdrR = new byte[1] ;
      T01LF15_A12793OFHdrP = new String[] {""} ;
      T01LF3_A12781OFIdEmpres = new String[] {""} ;
      T01LF3_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF3_A12783OFIdSeccio = new String[] {""} ;
      T01LF3_A12791OFHdr = new int[1] ;
      T01LF3_A12792OFHdrR = new byte[1] ;
      T01LF3_A12793OFHdrP = new String[] {""} ;
      T01LF3_A12794OFFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF3_n12794OFFecHis = new boolean[] {false} ;
      T01LF3_A12795OFFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF3_n12795OFFecEnt = new boolean[] {false} ;
      T01LF3_A12796OFFecRm = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF3_n12796OFFecRm = new boolean[] {false} ;
      T01LF3_A12797OFFecHd = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF3_n12797OFFecHd = new boolean[] {false} ;
      T01LF3_A12798OFSit = new byte[1] ;
      T01LF3_n12798OFSit = new boolean[] {false} ;
      T01LF3_A12799OFFase1 = new String[] {""} ;
      T01LF3_n12799OFFase1 = new boolean[] {false} ;
      T01LF3_A12800OFFase2 = new String[] {""} ;
      T01LF3_n12800OFFase2 = new boolean[] {false} ;
      T01LF3_A12801OFAccion = new String[] {""} ;
      T01LF3_n12801OFAccion = new boolean[] {false} ;
      T01LF3_A12802OFFecIns = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF3_n12802OFFecIns = new boolean[] {false} ;
      T01LF3_A12803OFPedcli = new String[] {""} ;
      T01LF3_n12803OFPedcli = new boolean[] {false} ;
      T01LF3_A12804OFProceso = new String[] {""} ;
      T01LF3_n12804OFProceso = new boolean[] {false} ;
      T01LF3_A12805OFFec1 = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF3_n12805OFFec1 = new boolean[] {false} ;
      T01LF3_A12806OFFec2 = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF3_n12806OFFec2 = new boolean[] {false} ;
      T01LF3_A12807OFOk = new String[] {""} ;
      T01LF3_n12807OFOk = new boolean[] {false} ;
      T01LF3_A12808OFNoOk = new String[] {""} ;
      T01LF3_n12808OFNoOk = new boolean[] {false} ;
      T01LF2_A12781OFIdEmpres = new String[] {""} ;
      T01LF2_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF2_A12783OFIdSeccio = new String[] {""} ;
      T01LF2_A12791OFHdr = new int[1] ;
      T01LF2_A12792OFHdrR = new byte[1] ;
      T01LF2_A12793OFHdrP = new String[] {""} ;
      T01LF2_A12794OFFecHis = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF2_n12794OFFecHis = new boolean[] {false} ;
      T01LF2_A12795OFFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF2_n12795OFFecEnt = new boolean[] {false} ;
      T01LF2_A12796OFFecRm = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF2_n12796OFFecRm = new boolean[] {false} ;
      T01LF2_A12797OFFecHd = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF2_n12797OFFecHd = new boolean[] {false} ;
      T01LF2_A12798OFSit = new byte[1] ;
      T01LF2_n12798OFSit = new boolean[] {false} ;
      T01LF2_A12799OFFase1 = new String[] {""} ;
      T01LF2_n12799OFFase1 = new boolean[] {false} ;
      T01LF2_A12800OFFase2 = new String[] {""} ;
      T01LF2_n12800OFFase2 = new boolean[] {false} ;
      T01LF2_A12801OFAccion = new String[] {""} ;
      T01LF2_n12801OFAccion = new boolean[] {false} ;
      T01LF2_A12802OFFecIns = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF2_n12802OFFecIns = new boolean[] {false} ;
      T01LF2_A12803OFPedcli = new String[] {""} ;
      T01LF2_n12803OFPedcli = new boolean[] {false} ;
      T01LF2_A12804OFProceso = new String[] {""} ;
      T01LF2_n12804OFProceso = new boolean[] {false} ;
      T01LF2_A12805OFFec1 = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF2_n12805OFFec1 = new boolean[] {false} ;
      T01LF2_A12806OFFec2 = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF2_n12806OFFec2 = new boolean[] {false} ;
      T01LF2_A12807OFOk = new String[] {""} ;
      T01LF2_n12807OFOk = new boolean[] {false} ;
      T01LF2_A12808OFNoOk = new String[] {""} ;
      T01LF2_n12808OFNoOk = new boolean[] {false} ;
      T01LF19_A12781OFIdEmpres = new String[] {""} ;
      T01LF19_A12782OFFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T01LF19_A12783OFIdSeccio = new String[] {""} ;
      T01LF19_A12791OFHdr = new int[1] ;
      T01LF19_A12792OFHdrR = new byte[1] ;
      T01LF19_A12793OFHdrP = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ12781OFIdEmpres = "" ;
      ZZ12782OFFecha = GXutil.nullDate() ;
      ZZ12783OFIdSeccio = "" ;
      ZZ12784OFIdEmpSec = "" ;
      ZZ12787OFSecion = "" ;
      ZZ12812OFFecCorte = GXutil.resetTime( GXutil.nullDate() );
      ZZ12813OFObs = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.totif__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.totif__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.totif__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.totif__default(),
         new Object[] {
             new Object[] {
            T01LF2_A12781OFIdEmpres, T01LF2_A12782OFFecha, T01LF2_A12783OFIdSeccio, T01LF2_A12791OFHdr, T01LF2_A12792OFHdrR, T01LF2_A12793OFHdrP, T01LF2_A12794OFFecHis, T01LF2_n12794OFFecHis, T01LF2_A12795OFFecEnt, T01LF2_n12795OFFecEnt,
            T01LF2_A12796OFFecRm, T01LF2_n12796OFFecRm, T01LF2_A12797OFFecHd, T01LF2_n12797OFFecHd, T01LF2_A12798OFSit, T01LF2_n12798OFSit, T01LF2_A12799OFFase1, T01LF2_n12799OFFase1, T01LF2_A12800OFFase2, T01LF2_n12800OFFase2,
            T01LF2_A12801OFAccion, T01LF2_n12801OFAccion, T01LF2_A12802OFFecIns, T01LF2_n12802OFFecIns, T01LF2_A12803OFPedcli, T01LF2_n12803OFPedcli, T01LF2_A12804OFProceso, T01LF2_n12804OFProceso, T01LF2_A12805OFFec1, T01LF2_n12805OFFec1,
            T01LF2_A12806OFFec2, T01LF2_n12806OFFec2, T01LF2_A12807OFOk, T01LF2_n12807OFOk, T01LF2_A12808OFNoOk, T01LF2_n12808OFNoOk
            }
            , new Object[] {
            T01LF3_A12781OFIdEmpres, T01LF3_A12782OFFecha, T01LF3_A12783OFIdSeccio, T01LF3_A12791OFHdr, T01LF3_A12792OFHdrR, T01LF3_A12793OFHdrP, T01LF3_A12794OFFecHis, T01LF3_n12794OFFecHis, T01LF3_A12795OFFecEnt, T01LF3_n12795OFFecEnt,
            T01LF3_A12796OFFecRm, T01LF3_n12796OFFecRm, T01LF3_A12797OFFecHd, T01LF3_n12797OFFecHd, T01LF3_A12798OFSit, T01LF3_n12798OFSit, T01LF3_A12799OFFase1, T01LF3_n12799OFFase1, T01LF3_A12800OFFase2, T01LF3_n12800OFFase2,
            T01LF3_A12801OFAccion, T01LF3_n12801OFAccion, T01LF3_A12802OFFecIns, T01LF3_n12802OFFecIns, T01LF3_A12803OFPedcli, T01LF3_n12803OFPedcli, T01LF3_A12804OFProceso, T01LF3_n12804OFProceso, T01LF3_A12805OFFec1, T01LF3_n12805OFFec1,
            T01LF3_A12806OFFec2, T01LF3_n12806OFFec2, T01LF3_A12807OFOk, T01LF3_n12807OFOk, T01LF3_A12808OFNoOk, T01LF3_n12808OFNoOk
            }
            , new Object[] {
            T01LF4_A12781OFIdEmpres, T01LF4_A12782OFFecha, T01LF4_A12783OFIdSeccio, T01LF4_A12784OFIdEmpSec, T01LF4_n12784OFIdEmpSec, T01LF4_A12785OFAnyo, T01LF4_n12785OFAnyo, T01LF4_A12786OFMes, T01LF4_n12786OFMes, T01LF4_A12787OFSecion,
            T01LF4_n12787OFSecion, T01LF4_A12788OFHdrs, T01LF4_n12788OFHdrs, T01LF4_A12789OFCumplida, T01LF4_n12789OFCumplida, T01LF4_A12790OFIncumpli, T01LF4_n12790OFIncumpli, T01LF4_A12812OFFecCorte, T01LF4_n12812OFFecCorte, T01LF4_A12813OFObs,
            T01LF4_n12813OFObs
            }
            , new Object[] {
            T01LF5_A12781OFIdEmpres, T01LF5_A12782OFFecha, T01LF5_A12783OFIdSeccio, T01LF5_A12784OFIdEmpSec, T01LF5_n12784OFIdEmpSec, T01LF5_A12785OFAnyo, T01LF5_n12785OFAnyo, T01LF5_A12786OFMes, T01LF5_n12786OFMes, T01LF5_A12787OFSecion,
            T01LF5_n12787OFSecion, T01LF5_A12788OFHdrs, T01LF5_n12788OFHdrs, T01LF5_A12789OFCumplida, T01LF5_n12789OFCumplida, T01LF5_A12790OFIncumpli, T01LF5_n12790OFIncumpli, T01LF5_A12812OFFecCorte, T01LF5_n12812OFFecCorte, T01LF5_A12813OFObs,
            T01LF5_n12813OFObs
            }
            , new Object[] {
            T01LF6_A12781OFIdEmpres, T01LF6_A12782OFFecha, T01LF6_A12783OFIdSeccio, T01LF6_A12784OFIdEmpSec, T01LF6_n12784OFIdEmpSec, T01LF6_A12785OFAnyo, T01LF6_n12785OFAnyo, T01LF6_A12786OFMes, T01LF6_n12786OFMes, T01LF6_A12787OFSecion,
            T01LF6_n12787OFSecion, T01LF6_A12788OFHdrs, T01LF6_n12788OFHdrs, T01LF6_A12789OFCumplida, T01LF6_n12789OFCumplida, T01LF6_A12790OFIncumpli, T01LF6_n12790OFIncumpli, T01LF6_A12812OFFecCorte, T01LF6_n12812OFFecCorte, T01LF6_A12813OFObs,
            T01LF6_n12813OFObs
            }
            , new Object[] {
            T01LF7_A12781OFIdEmpres, T01LF7_A12782OFFecha, T01LF7_A12783OFIdSeccio
            }
            , new Object[] {
            T01LF8_A12781OFIdEmpres, T01LF8_A12782OFFecha, T01LF8_A12783OFIdSeccio
            }
            , new Object[] {
            T01LF9_A12781OFIdEmpres, T01LF9_A12782OFFecha, T01LF9_A12783OFIdSeccio
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LF13_A12781OFIdEmpres, T01LF13_A12782OFFecha, T01LF13_A12783OFIdSeccio
            }
            , new Object[] {
            T01LF14_A12781OFIdEmpres, T01LF14_A12782OFFecha, T01LF14_A12783OFIdSeccio, T01LF14_A12791OFHdr, T01LF14_A12792OFHdrR, T01LF14_A12793OFHdrP, T01LF14_A12794OFFecHis, T01LF14_n12794OFFecHis, T01LF14_A12795OFFecEnt, T01LF14_n12795OFFecEnt,
            T01LF14_A12796OFFecRm, T01LF14_n12796OFFecRm, T01LF14_A12797OFFecHd, T01LF14_n12797OFFecHd, T01LF14_A12798OFSit, T01LF14_n12798OFSit, T01LF14_A12799OFFase1, T01LF14_n12799OFFase1, T01LF14_A12800OFFase2, T01LF14_n12800OFFase2,
            T01LF14_A12801OFAccion, T01LF14_n12801OFAccion, T01LF14_A12802OFFecIns, T01LF14_n12802OFFecIns, T01LF14_A12803OFPedcli, T01LF14_n12803OFPedcli, T01LF14_A12804OFProceso, T01LF14_n12804OFProceso, T01LF14_A12805OFFec1, T01LF14_n12805OFFec1,
            T01LF14_A12806OFFec2, T01LF14_n12806OFFec2, T01LF14_A12807OFOk, T01LF14_n12807OFOk, T01LF14_A12808OFNoOk, T01LF14_n12808OFNoOk
            }
            , new Object[] {
            T01LF15_A12781OFIdEmpres, T01LF15_A12782OFFecha, T01LF15_A12783OFIdSeccio, T01LF15_A12791OFHdr, T01LF15_A12792OFHdrR, T01LF15_A12793OFHdrP
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LF19_A12781OFIdEmpres, T01LF19_A12782OFFecha, T01LF19_A12783OFIdSeccio, T01LF19_A12791OFHdr, T01LF19_A12792OFHdrR, T01LF19_A12793OFHdrP
            }
         }
      );
   }

   private byte Z12786OFMes ;
   private byte Z12792OFHdrR ;
   private byte Z12798OFSit ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12786OFMes ;
   private byte A12792OFHdrR ;
   private byte A12798OFSit ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ12786OFMes ;
   private short Z12785OFAnyo ;
   private short nRcdDeleted_1757 ;
   private short nRcdExists_1757 ;
   private short nIsMod_1757 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12785OFAnyo ;
   private short nBlankRcdCount1757 ;
   private short RcdFound1757 ;
   private short nBlankRcdUsr1757 ;
   private short RcdFound1756 ;
   private short nIsDirty_1756 ;
   private short nIsDirty_1757 ;
   private short ZZ12785OFAnyo ;
   private int Z12788OFHdrs ;
   private int Z12789OFCumplida ;
   private int Z12790OFIncumpli ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int Z12791OFHdr ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtOFIdEmpres_Enabled ;
   private int edtOFFecha_Enabled ;
   private int edtOFIdSeccio_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtOFIdEmpSec_Enabled ;
   private int edtOFAnyo_Enabled ;
   private int edtOFMes_Enabled ;
   private int edtOFSecion_Enabled ;
   private int A12788OFHdrs ;
   private int edtOFHdrs_Enabled ;
   private int A12789OFCumplida ;
   private int edtOFCumplida_Enabled ;
   private int A12790OFIncumpli ;
   private int edtOFIncumpli_Enabled ;
   private int edtOFFecCorte_Enabled ;
   private int edtOFObs_Enabled ;
   private int edtavnRcdDeleted_1757_Enabled ;
   private int edtOFHdr_Enabled ;
   private int edtOFHdrR_Enabled ;
   private int edtOFHdrP_Enabled ;
   private int edtOFFecHis_Enabled ;
   private int edtOFFecEnt_Enabled ;
   private int edtOFFecRm_Enabled ;
   private int edtOFFecHd_Enabled ;
   private int edtOFSit_Enabled ;
   private int edtOFFase1_Enabled ;
   private int edtOFFase2_Enabled ;
   private int edtOFAccion_Enabled ;
   private int edtOFFecIns_Enabled ;
   private int edtOFPedcli_Enabled ;
   private int edtOFProceso_Enabled ;
   private int edtOFFec1_Enabled ;
   private int edtOFFec2_Enabled ;
   private int edtOFOk_Enabled ;
   private int edtOFNoOk_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A12791OFHdr ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtOFHdrP_Enabled ;
   private int defedtOFHdrR_Enabled ;
   private int defedtOFHdr_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtOFObs_Backcolor ;
   private int edtOFFecCorte_Backcolor ;
   private int edtOFIncumpli_Backcolor ;
   private int edtOFCumplida_Backcolor ;
   private int edtOFHdrs_Backcolor ;
   private int edtOFSecion_Backcolor ;
   private int edtOFMes_Backcolor ;
   private int edtOFAnyo_Backcolor ;
   private int edtOFIdEmpSec_Backcolor ;
   private int edtOFIdSeccio_Backcolor ;
   private int edtOFFecha_Backcolor ;
   private int edtOFIdEmpres_Backcolor ;
   private int ZZ12788OFHdrs ;
   private int ZZ12789OFCumplida ;
   private int ZZ12790OFIncumpli ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z12781OFIdEmpres ;
   private String Z12783OFIdSeccio ;
   private String Z12784OFIdEmpSec ;
   private String Z12787OFSecion ;
   private String Z12793OFHdrP ;
   private String Z12799OFFase1 ;
   private String Z12800OFFase2 ;
   private String Z12801OFAccion ;
   private String Z12803OFPedcli ;
   private String Z12804OFProceso ;
   private String Z12807OFOk ;
   private String Z12808OFNoOk ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOFIdEmpres_Internalname ;
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
   private String A12781OFIdEmpres ;
   private String edtOFIdEmpres_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtOFFecha_Internalname ;
   private String edtOFFecha_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtOFIdSeccio_Internalname ;
   private String A12783OFIdSeccio ;
   private String edtOFIdSeccio_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtOFIdEmpSec_Internalname ;
   private String A12784OFIdEmpSec ;
   private String edtOFIdEmpSec_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtOFAnyo_Internalname ;
   private String edtOFAnyo_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtOFMes_Internalname ;
   private String edtOFMes_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtOFSecion_Internalname ;
   private String A12787OFSecion ;
   private String edtOFSecion_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtOFHdrs_Internalname ;
   private String edtOFHdrs_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtOFCumplida_Internalname ;
   private String edtOFCumplida_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtOFIncumpli_Internalname ;
   private String edtOFIncumpli_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtOFFecCorte_Internalname ;
   private String edtOFFecCorte_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtOFObs_Internalname ;
   private String sMode1757 ;
   private String edtavnRcdDeleted_1757_Internalname ;
   private String edtOFHdr_Internalname ;
   private String edtOFHdrR_Internalname ;
   private String edtOFHdrP_Internalname ;
   private String edtOFFecHis_Internalname ;
   private String edtOFFecEnt_Internalname ;
   private String edtOFFecRm_Internalname ;
   private String edtOFFecHd_Internalname ;
   private String edtOFSit_Internalname ;
   private String edtOFFase1_Internalname ;
   private String edtOFFase2_Internalname ;
   private String edtOFAccion_Internalname ;
   private String edtOFFecIns_Internalname ;
   private String edtOFPedcli_Internalname ;
   private String edtOFProceso_Internalname ;
   private String edtOFFec1_Internalname ;
   private String edtOFFec2_Internalname ;
   private String edtOFOk_Internalname ;
   private String edtOFNoOk_Internalname ;
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
   private String sMode1756 ;
   private String GXCCtl ;
   private String A12793OFHdrP ;
   private String A12799OFFase1 ;
   private String A12800OFFase2 ;
   private String A12801OFAccion ;
   private String A12803OFPedcli ;
   private String A12804OFProceso ;
   private String A12807OFOk ;
   private String A12808OFNoOk ;
   private String AV7Lit0 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String AV10EmprCod ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1757_Jsonclick ;
   private String edtOFHdr_Jsonclick ;
   private String edtOFHdrR_Jsonclick ;
   private String edtOFHdrP_Jsonclick ;
   private String edtOFFecHis_Jsonclick ;
   private String edtOFFecEnt_Jsonclick ;
   private String edtOFFecRm_Jsonclick ;
   private String edtOFFecHd_Jsonclick ;
   private String edtOFSit_Jsonclick ;
   private String edtOFFase1_Jsonclick ;
   private String edtOFFase2_Jsonclick ;
   private String edtOFAccion_Jsonclick ;
   private String edtOFFecIns_Jsonclick ;
   private String edtOFPedcli_Jsonclick ;
   private String edtOFProceso_Jsonclick ;
   private String edtOFFec1_Jsonclick ;
   private String edtOFFec2_Jsonclick ;
   private String edtOFOk_Jsonclick ;
   private String edtOFNoOk_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ12781OFIdEmpres ;
   private String ZZ12783OFIdSeccio ;
   private String ZZ12784OFIdEmpSec ;
   private String ZZ12787OFSecion ;
   private java.util.Date Z12812OFFecCorte ;
   private java.util.Date Z12805OFFec1 ;
   private java.util.Date A12812OFFecCorte ;
   private java.util.Date A12805OFFec1 ;
   private java.util.Date ZZ12812OFFecCorte ;
   private java.util.Date Z12782OFFecha ;
   private java.util.Date Z12794OFFecHis ;
   private java.util.Date Z12795OFFecEnt ;
   private java.util.Date Z12796OFFecRm ;
   private java.util.Date Z12797OFFecHd ;
   private java.util.Date Z12802OFFecIns ;
   private java.util.Date Z12806OFFec2 ;
   private java.util.Date A12782OFFecha ;
   private java.util.Date A12794OFFecHis ;
   private java.util.Date A12795OFFecEnt ;
   private java.util.Date A12796OFFecRm ;
   private java.util.Date A12797OFFecHd ;
   private java.util.Date A12802OFFecIns ;
   private java.util.Date A12806OFFec2 ;
   private java.util.Date ZZ12782OFFecha ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean n12784OFIdEmpSec ;
   private boolean n12785OFAnyo ;
   private boolean n12786OFMes ;
   private boolean n12787OFSecion ;
   private boolean n12788OFHdrs ;
   private boolean n12789OFCumplida ;
   private boolean n12790OFIncumpli ;
   private boolean n12812OFFecCorte ;
   private boolean n12813OFObs ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n12794OFFecHis ;
   private boolean n12795OFFecEnt ;
   private boolean n12796OFFecRm ;
   private boolean n12797OFFecHd ;
   private boolean n12798OFSit ;
   private boolean n12799OFFase1 ;
   private boolean n12800OFFase2 ;
   private boolean n12801OFAccion ;
   private boolean n12802OFFecIns ;
   private boolean n12803OFPedcli ;
   private boolean n12804OFProceso ;
   private boolean n12805OFFec1 ;
   private boolean n12806OFFec2 ;
   private boolean n12807OFOk ;
   private boolean n12808OFNoOk ;
   private String Z12813OFObs ;
   private String A12813OFObs ;
   private String ZZ12813OFObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01LF6_A12781OFIdEmpres ;
   private java.util.Date[] T01LF6_A12782OFFecha ;
   private String[] T01LF6_A12783OFIdSeccio ;
   private String[] T01LF6_A12784OFIdEmpSec ;
   private boolean[] T01LF6_n12784OFIdEmpSec ;
   private short[] T01LF6_A12785OFAnyo ;
   private boolean[] T01LF6_n12785OFAnyo ;
   private byte[] T01LF6_A12786OFMes ;
   private boolean[] T01LF6_n12786OFMes ;
   private String[] T01LF6_A12787OFSecion ;
   private boolean[] T01LF6_n12787OFSecion ;
   private int[] T01LF6_A12788OFHdrs ;
   private boolean[] T01LF6_n12788OFHdrs ;
   private int[] T01LF6_A12789OFCumplida ;
   private boolean[] T01LF6_n12789OFCumplida ;
   private int[] T01LF6_A12790OFIncumpli ;
   private boolean[] T01LF6_n12790OFIncumpli ;
   private java.util.Date[] T01LF6_A12812OFFecCorte ;
   private boolean[] T01LF6_n12812OFFecCorte ;
   private String[] T01LF6_A12813OFObs ;
   private boolean[] T01LF6_n12813OFObs ;
   private String[] T01LF7_A12781OFIdEmpres ;
   private java.util.Date[] T01LF7_A12782OFFecha ;
   private String[] T01LF7_A12783OFIdSeccio ;
   private String[] T01LF5_A12781OFIdEmpres ;
   private java.util.Date[] T01LF5_A12782OFFecha ;
   private String[] T01LF5_A12783OFIdSeccio ;
   private String[] T01LF5_A12784OFIdEmpSec ;
   private boolean[] T01LF5_n12784OFIdEmpSec ;
   private short[] T01LF5_A12785OFAnyo ;
   private boolean[] T01LF5_n12785OFAnyo ;
   private byte[] T01LF5_A12786OFMes ;
   private boolean[] T01LF5_n12786OFMes ;
   private String[] T01LF5_A12787OFSecion ;
   private boolean[] T01LF5_n12787OFSecion ;
   private int[] T01LF5_A12788OFHdrs ;
   private boolean[] T01LF5_n12788OFHdrs ;
   private int[] T01LF5_A12789OFCumplida ;
   private boolean[] T01LF5_n12789OFCumplida ;
   private int[] T01LF5_A12790OFIncumpli ;
   private boolean[] T01LF5_n12790OFIncumpli ;
   private java.util.Date[] T01LF5_A12812OFFecCorte ;
   private boolean[] T01LF5_n12812OFFecCorte ;
   private String[] T01LF5_A12813OFObs ;
   private boolean[] T01LF5_n12813OFObs ;
   private String[] T01LF8_A12781OFIdEmpres ;
   private java.util.Date[] T01LF8_A12782OFFecha ;
   private String[] T01LF8_A12783OFIdSeccio ;
   private String[] T01LF9_A12781OFIdEmpres ;
   private java.util.Date[] T01LF9_A12782OFFecha ;
   private String[] T01LF9_A12783OFIdSeccio ;
   private String[] T01LF4_A12781OFIdEmpres ;
   private java.util.Date[] T01LF4_A12782OFFecha ;
   private String[] T01LF4_A12783OFIdSeccio ;
   private String[] T01LF4_A12784OFIdEmpSec ;
   private boolean[] T01LF4_n12784OFIdEmpSec ;
   private short[] T01LF4_A12785OFAnyo ;
   private boolean[] T01LF4_n12785OFAnyo ;
   private byte[] T01LF4_A12786OFMes ;
   private boolean[] T01LF4_n12786OFMes ;
   private String[] T01LF4_A12787OFSecion ;
   private boolean[] T01LF4_n12787OFSecion ;
   private int[] T01LF4_A12788OFHdrs ;
   private boolean[] T01LF4_n12788OFHdrs ;
   private int[] T01LF4_A12789OFCumplida ;
   private boolean[] T01LF4_n12789OFCumplida ;
   private int[] T01LF4_A12790OFIncumpli ;
   private boolean[] T01LF4_n12790OFIncumpli ;
   private java.util.Date[] T01LF4_A12812OFFecCorte ;
   private boolean[] T01LF4_n12812OFFecCorte ;
   private String[] T01LF4_A12813OFObs ;
   private boolean[] T01LF4_n12813OFObs ;
   private String[] T01LF13_A12781OFIdEmpres ;
   private java.util.Date[] T01LF13_A12782OFFecha ;
   private String[] T01LF13_A12783OFIdSeccio ;
   private String[] T01LF14_A12781OFIdEmpres ;
   private java.util.Date[] T01LF14_A12782OFFecha ;
   private String[] T01LF14_A12783OFIdSeccio ;
   private int[] T01LF14_A12791OFHdr ;
   private byte[] T01LF14_A12792OFHdrR ;
   private String[] T01LF14_A12793OFHdrP ;
   private java.util.Date[] T01LF14_A12794OFFecHis ;
   private boolean[] T01LF14_n12794OFFecHis ;
   private java.util.Date[] T01LF14_A12795OFFecEnt ;
   private boolean[] T01LF14_n12795OFFecEnt ;
   private java.util.Date[] T01LF14_A12796OFFecRm ;
   private boolean[] T01LF14_n12796OFFecRm ;
   private java.util.Date[] T01LF14_A12797OFFecHd ;
   private boolean[] T01LF14_n12797OFFecHd ;
   private byte[] T01LF14_A12798OFSit ;
   private boolean[] T01LF14_n12798OFSit ;
   private String[] T01LF14_A12799OFFase1 ;
   private boolean[] T01LF14_n12799OFFase1 ;
   private String[] T01LF14_A12800OFFase2 ;
   private boolean[] T01LF14_n12800OFFase2 ;
   private String[] T01LF14_A12801OFAccion ;
   private boolean[] T01LF14_n12801OFAccion ;
   private java.util.Date[] T01LF14_A12802OFFecIns ;
   private boolean[] T01LF14_n12802OFFecIns ;
   private String[] T01LF14_A12803OFPedcli ;
   private boolean[] T01LF14_n12803OFPedcli ;
   private String[] T01LF14_A12804OFProceso ;
   private boolean[] T01LF14_n12804OFProceso ;
   private java.util.Date[] T01LF14_A12805OFFec1 ;
   private boolean[] T01LF14_n12805OFFec1 ;
   private java.util.Date[] T01LF14_A12806OFFec2 ;
   private boolean[] T01LF14_n12806OFFec2 ;
   private String[] T01LF14_A12807OFOk ;
   private boolean[] T01LF14_n12807OFOk ;
   private String[] T01LF14_A12808OFNoOk ;
   private boolean[] T01LF14_n12808OFNoOk ;
   private String[] T01LF15_A12781OFIdEmpres ;
   private java.util.Date[] T01LF15_A12782OFFecha ;
   private String[] T01LF15_A12783OFIdSeccio ;
   private int[] T01LF15_A12791OFHdr ;
   private byte[] T01LF15_A12792OFHdrR ;
   private String[] T01LF15_A12793OFHdrP ;
   private String[] T01LF3_A12781OFIdEmpres ;
   private java.util.Date[] T01LF3_A12782OFFecha ;
   private String[] T01LF3_A12783OFIdSeccio ;
   private int[] T01LF3_A12791OFHdr ;
   private byte[] T01LF3_A12792OFHdrR ;
   private String[] T01LF3_A12793OFHdrP ;
   private java.util.Date[] T01LF3_A12794OFFecHis ;
   private boolean[] T01LF3_n12794OFFecHis ;
   private java.util.Date[] T01LF3_A12795OFFecEnt ;
   private boolean[] T01LF3_n12795OFFecEnt ;
   private java.util.Date[] T01LF3_A12796OFFecRm ;
   private boolean[] T01LF3_n12796OFFecRm ;
   private java.util.Date[] T01LF3_A12797OFFecHd ;
   private boolean[] T01LF3_n12797OFFecHd ;
   private byte[] T01LF3_A12798OFSit ;
   private boolean[] T01LF3_n12798OFSit ;
   private String[] T01LF3_A12799OFFase1 ;
   private boolean[] T01LF3_n12799OFFase1 ;
   private String[] T01LF3_A12800OFFase2 ;
   private boolean[] T01LF3_n12800OFFase2 ;
   private String[] T01LF3_A12801OFAccion ;
   private boolean[] T01LF3_n12801OFAccion ;
   private java.util.Date[] T01LF3_A12802OFFecIns ;
   private boolean[] T01LF3_n12802OFFecIns ;
   private String[] T01LF3_A12803OFPedcli ;
   private boolean[] T01LF3_n12803OFPedcli ;
   private String[] T01LF3_A12804OFProceso ;
   private boolean[] T01LF3_n12804OFProceso ;
   private java.util.Date[] T01LF3_A12805OFFec1 ;
   private boolean[] T01LF3_n12805OFFec1 ;
   private java.util.Date[] T01LF3_A12806OFFec2 ;
   private boolean[] T01LF3_n12806OFFec2 ;
   private String[] T01LF3_A12807OFOk ;
   private boolean[] T01LF3_n12807OFOk ;
   private String[] T01LF3_A12808OFNoOk ;
   private boolean[] T01LF3_n12808OFNoOk ;
   private String[] T01LF2_A12781OFIdEmpres ;
   private java.util.Date[] T01LF2_A12782OFFecha ;
   private String[] T01LF2_A12783OFIdSeccio ;
   private int[] T01LF2_A12791OFHdr ;
   private byte[] T01LF2_A12792OFHdrR ;
   private String[] T01LF2_A12793OFHdrP ;
   private java.util.Date[] T01LF2_A12794OFFecHis ;
   private boolean[] T01LF2_n12794OFFecHis ;
   private java.util.Date[] T01LF2_A12795OFFecEnt ;
   private boolean[] T01LF2_n12795OFFecEnt ;
   private java.util.Date[] T01LF2_A12796OFFecRm ;
   private boolean[] T01LF2_n12796OFFecRm ;
   private java.util.Date[] T01LF2_A12797OFFecHd ;
   private boolean[] T01LF2_n12797OFFecHd ;
   private byte[] T01LF2_A12798OFSit ;
   private boolean[] T01LF2_n12798OFSit ;
   private String[] T01LF2_A12799OFFase1 ;
   private boolean[] T01LF2_n12799OFFase1 ;
   private String[] T01LF2_A12800OFFase2 ;
   private boolean[] T01LF2_n12800OFFase2 ;
   private String[] T01LF2_A12801OFAccion ;
   private boolean[] T01LF2_n12801OFAccion ;
   private java.util.Date[] T01LF2_A12802OFFecIns ;
   private boolean[] T01LF2_n12802OFFecIns ;
   private String[] T01LF2_A12803OFPedcli ;
   private boolean[] T01LF2_n12803OFPedcli ;
   private String[] T01LF2_A12804OFProceso ;
   private boolean[] T01LF2_n12804OFProceso ;
   private java.util.Date[] T01LF2_A12805OFFec1 ;
   private boolean[] T01LF2_n12805OFFec1 ;
   private java.util.Date[] T01LF2_A12806OFFec2 ;
   private boolean[] T01LF2_n12806OFFec2 ;
   private String[] T01LF2_A12807OFOk ;
   private boolean[] T01LF2_n12807OFOk ;
   private String[] T01LF2_A12808OFNoOk ;
   private boolean[] T01LF2_n12808OFNoOk ;
   private String[] T01LF19_A12781OFIdEmpres ;
   private java.util.Date[] T01LF19_A12782OFFecha ;
   private String[] T01LF19_A12783OFIdSeccio ;
   private int[] T01LF19_A12791OFHdr ;
   private byte[] T01LF19_A12792OFHdrR ;
   private String[] T01LF19_A12793OFHdrP ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class totif__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class totif__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class totif__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class totif__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LF2", "SELECT OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP, OFFecHis, OFFecEnt, OFFecRm, OFFecHd, OFSit, OFFase1, OFFase2, OFAccion, OFFecIns, OFPedcli, OFProceso, OFFec1, OFFec2, OFOk, OFNoOk FROM TXPOTIFDE WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ? AND OFHdr = ? AND OFHdrR = ? AND OFHdrP = ?  FOR UPDATE OF OFFecHis, OFFecEnt, OFFecRm, OFFecHd, OFSit, OFFase1, OFFase2, OFAccion, OFFecIns, OFPedcli, OFProceso, OFFec1, OFFec2, OFOk, OFNoOk NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LF3", "SELECT OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP, OFFecHis, OFFecEnt, OFFecRm, OFFecHd, OFSit, OFFase1, OFFase2, OFAccion, OFFecIns, OFPedcli, OFProceso, OFFec1, OFFec2, OFOk, OFNoOk FROM TXPOTIFDE WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ? AND OFHdr = ? AND OFHdrR = ? AND OFHdrP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LF4", "SELECT OFIdEmpres, OFFecha, OFIdSeccio, OFIdEmpSec, OFAnyo, OFMes, OFSecion, OFHdrs, OFCumplida, OFIncumpli, OFFecCorte, OFObs FROM TXPOTIF WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ?  FOR UPDATE OF OFIdEmpSec, OFAnyo, OFMes, OFSecion, OFHdrs, OFCumplida, OFIncumpli, OFFecCorte, OFObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LF5", "SELECT OFIdEmpres, OFFecha, OFIdSeccio, OFIdEmpSec, OFAnyo, OFMes, OFSecion, OFHdrs, OFCumplida, OFIncumpli, OFFecCorte, OFObs FROM TXPOTIF WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LF6", "SELECT /*+ FIRST_ROWS(100) */ TM1.OFIdEmpres, TM1.OFFecha, TM1.OFIdSeccio, TM1.OFIdEmpSec, TM1.OFAnyo, TM1.OFMes, TM1.OFSecion, TM1.OFHdrs, TM1.OFCumplida, TM1.OFIncumpli, TM1.OFFecCorte, TM1.OFObs FROM TXPOTIF TM1 WHERE TM1.OFIdEmpres = ? and TM1.OFFecha = ? and TM1.OFIdSeccio = ? ORDER BY TM1.OFIdEmpres, TM1.OFFecha, TM1.OFIdSeccio ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LF7", "SELECT /*+ FIRST_ROWS(1) */ OFIdEmpres, OFFecha, OFIdSeccio FROM TXPOTIF WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LF8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFIdEmpres, OFFecha, OFIdSeccio FROM TXPOTIF WHERE ( OFIdEmpres > ? or OFIdEmpres = ? and OFFecha > ? or OFFecha = ? and OFIdEmpres = ? and OFIdSeccio > ?) ORDER BY OFIdEmpres, OFFecha, OFIdSeccio) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LF9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OFIdEmpres, OFFecha, OFIdSeccio FROM TXPOTIF WHERE ( OFIdEmpres < ? or OFIdEmpres = ? and OFFecha < ? or OFFecha = ? and OFIdEmpres = ? and OFIdSeccio < ?) ORDER BY OFIdEmpres DESC, OFFecha DESC, OFIdSeccio DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LF10", "INSERT INTO TXPOTIF(OFIdEmpres, OFFecha, OFIdSeccio, OFIdEmpSec, OFAnyo, OFMes, OFSecion, OFHdrs, OFCumplida, OFIncumpli, OFFecCorte, OFObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOTIF")
         ,new UpdateCursor("T01LF11", "UPDATE TXPOTIF SET OFIdEmpSec=?, OFAnyo=?, OFMes=?, OFSecion=?, OFHdrs=?, OFCumplida=?, OFIncumpli=?, OFFecCorte=?, OFObs=?  WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ?", GX_NOMASK, "TXPOTIF")
         ,new UpdateCursor("T01LF12", "DELETE FROM TXPOTIF  WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ?", GX_NOMASK, "TXPOTIF")
         ,new ForEachCursor("T01LF13", "SELECT /*+ FIRST_ROWS(100) */ OFIdEmpres, OFFecha, OFIdSeccio FROM TXPOTIF ORDER BY OFIdEmpres, OFFecha, OFIdSeccio ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LF14", "SELECT OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP, OFFecHis, OFFecEnt, OFFecRm, OFFecHd, OFSit, OFFase1, OFFase2, OFAccion, OFFecIns, OFPedcli, OFProceso, OFFec1, OFFec2, OFOk, OFNoOk FROM TXPOTIFDE WHERE OFIdEmpres = ? and OFFecha = ? and OFIdSeccio = ? and OFHdr = ? and OFHdrR = ? and OFHdrP = ? ORDER BY OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LF15", "SELECT OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP FROM TXPOTIFDE WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ? AND OFHdr = ? AND OFHdrR = ? AND OFHdrP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LF16", "INSERT INTO TXPOTIFDE(OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP, OFFecHis, OFFecEnt, OFFecRm, OFFecHd, OFSit, OFFase1, OFFase2, OFAccion, OFFecIns, OFPedcli, OFProceso, OFFec1, OFFec2, OFOk, OFNoOk) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOTIFDE")
         ,new UpdateCursor("T01LF17", "UPDATE TXPOTIFDE SET OFFecHis=?, OFFecEnt=?, OFFecRm=?, OFFecHd=?, OFSit=?, OFFase1=?, OFFase2=?, OFAccion=?, OFFecIns=?, OFPedcli=?, OFProceso=?, OFFec1=?, OFFec2=?, OFOk=?, OFNoOk=?  WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ? AND OFHdr = ? AND OFHdrR = ? AND OFHdrP = ?", GX_NOMASK, "TXPOTIFDE")
         ,new UpdateCursor("T01LF18", "DELETE FROM TXPOTIFDE  WHERE OFIdEmpres = ? AND OFFecha = ? AND OFIdSeccio = ? AND OFHdr = ? AND OFHdrR = ? AND OFHdrP = ?", GX_NOMASK, "TXPOTIFDE")
         ,new ForEachCursor("T01LF19", "SELECT OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP FROM TXPOTIFDE WHERE OFIdEmpres = ? and OFFecha = ? and OFIdSeccio = ? ORDER BY OFIdEmpres, OFFecha, OFIdSeccio, OFHdr, OFHdrR, OFHdrP ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 9);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 9);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 9);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 8);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 2);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 2);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 30);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 200);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 5);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
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
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 200);
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setDate(11, (java.util.Date)parms[19]);
               stmt.setString(12, (String)parms[20], 2);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[9]);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[19], 8);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[21], 9);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[25], 8);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[27], 8);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[29], false);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[35], 1);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
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
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
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
                  stmt.setString(7, (String)parms[13], 8);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 9);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 8);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 8);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[25]);
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
                  stmt.setString(15, (String)parms[29], 1);
               }
               stmt.setString(16, (String)parms[30], 3);
               stmt.setDate(17, (java.util.Date)parms[31]);
               stmt.setString(18, (String)parms[32], 2);
               stmt.setInt(19, ((Number) parms[33]).intValue());
               stmt.setByte(20, ((Number) parms[34]).byteValue());
               stmt.setString(21, (String)parms[35], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 2);
               return;
      }
   }

}

