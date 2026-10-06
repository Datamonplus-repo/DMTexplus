package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxroll_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A6224VxLotId = (int)(GXutil.lval( httpContext.GetPar( "VxLotId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A6224VxLotId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A6642VxLotTeLo = httpContext.GetPar( "VxLotTeLo") ;
         n6642VxLotTeLo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6642VxLotTeLo", A6642VxLotTeLo);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A6642VxLotTeLo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A7422VxLotACru = httpContext.GetPar( "VxLotACru") ;
         n7422VxLotACru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7422VxLotACru", A7422VxLotACru);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A7422VxLotACru) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A7550VxRapCod = (int)(GXutil.lval( httpContext.GetPar( "VxRapCod"))) ;
         n7550VxRapCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7550VxRapCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7550VxRapCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A7550VxRapCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A12248VxAlmCod = httpContext.GetPar( "VxAlmCod") ;
         n12248VxAlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
         A12249VxAlmUbi = httpContext.GetPar( "VxAlmUbi") ;
         n12249VxAlmUbi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12249VxAlmUbi", A12249VxAlmUbi);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A12248VxAlmCod, A12249VxAlmUbi) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A12248VxAlmCod = httpContext.GetPar( "VxAlmCod") ;
         n12248VxAlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A12248VxAlmCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla STKTE/STKTEMOV en Vertex", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxLotId_Internalname ;
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
      nRC_GXsfl_230 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_230"))) ;
      nGXsfl_230_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_230_idx"))) ;
      sGXsfl_230_idx = httpContext.GetPar( "sGXsfl_230_idx") ;
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

   public tvxroll_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxroll_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxroll_impl.class ));
   }

   public tvxroll_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbVxSteUniMe = new HTMLChoice();
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
      if ( cmbVxSteUniMe.getItemCount() > 0 )
      {
         A13294VxSteUniMe = cmbVxSteUniMe.getValidValue(A13294VxSteUniMe) ;
         n13294VxSteUniMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13294VxSteUniMe", A13294VxSteUniMe);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbVxSteUniMe.setValue( GXutil.rtrim( A13294VxSteUniMe) );
         httpContext.ajax_rsp_assign_prop("", false, cmbVxSteUniMe.getInternalname(), "Values", cmbVxSteUniMe.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVXRoll.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Nro Rollo", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotId_Internalname, GXutil.ltrim( localUtil.ntoc( A6224VxLotId, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6224VxLotId), "ZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6224VxLotId), "ZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotId_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotId_Enabled, 0, "text", "1", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Situación", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXLotSit_Internalname, GXutil.ltrim( localUtil.ntoc( A6300VXLotSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVXLotSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6300VXLotSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6300VXLotSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXLotSit_Jsonclick, 0, "", "", "", "", "", 1, edtVXLotSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Fecha Situación", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVXLotSitF_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXLotSitF_Internalname, localUtil.ttoc( A12719VXLotSitF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12719VXLotSitF, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXLotSitF_Jsonclick, 0, "", "", "", "", "", 1, edtVXLotSitF_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVXLotSitF_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVXLotSitF_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVXRoll.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Marca de anulado", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVXLotAnu_Internalname, GXutil.ltrim( localUtil.ntoc( A6303VXLotAnu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVXLotAnu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6303VXLotAnu), "9") : localUtil.format( DecimalUtil.doubleToDec(A6303VXLotAnu), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVXLotAnu_Jsonclick, 0, "", "", "", "", "", 1, edtVXLotAnu_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Kilos Crudo", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotCan_Internalname, GXutil.ltrim( localUtil.ntoc( A6318VxLotCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotCan_Enabled!=0) ? localUtil.format( A6318VxLotCan, "ZZZZZ9.99") : localUtil.format( A6318VxLotCan, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotCan_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotCan_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Kilos Terminado", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotCTe_Internalname, GXutil.ltrim( localUtil.ntoc( A6458VxLotCTe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotCTe_Enabled!=0) ? localUtil.format( A6458VxLotCTe, "ZZZZZ9.99") : localUtil.format( A6458VxLotCTe, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotCTe_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotCTe_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Hoja de Ruta de Acabado", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotHRA_Internalname, GXutil.rtrim( A6459VxLotHRA), GXutil.rtrim( localUtil.format( A6459VxLotHRA, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotHRA_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotHRA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Hoja de Ruta de Tejido", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotHRT_Internalname, GXutil.rtrim( A11686VxLotHRT), GXutil.rtrim( localUtil.format( A11686VxLotHRT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotHRT_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotHRT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Proveedor Crudo", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotPrvC_Internalname, GXutil.ltrim( localUtil.ntoc( A6640VxLotPrvC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotPrvC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6640VxLotPrvC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6640VxLotPrvC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotPrvC_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotPrvC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Defecto Principal Tejeduria", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotDefPT_Internalname, GXutil.ltrim( localUtil.ntoc( A6641VxLotDefPT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotDefPT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6641VxLotDefPT), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6641VxLotDefPT), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotDefPT_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotDefPT_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Lote Tejeduría", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotTeLo_Internalname, GXutil.rtrim( A6642VxLotTeLo), GXutil.rtrim( localUtil.format( A6642VxLotTeLo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotTeLo_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotTeLo_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Máquina Tejeduría", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotMaqT_Internalname, GXutil.rtrim( A6643VxLotMaqT), GXutil.rtrim( localUtil.format( A6643VxLotMaqT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotMaqT_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotMaqT_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Artículo Crudo", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotACru_Internalname, GXutil.rtrim( A7422VxLotACru), GXutil.rtrim( localUtil.format( A7422VxLotACru, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotACru_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotACru_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Calidad Crudo", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotCalC_Internalname, GXutil.ltrim( localUtil.ntoc( A7423VxLotCalC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotCalC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7423VxLotCalC), "9") : localUtil.format( DecimalUtil.doubleToDec(A7423VxLotCalC), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotCalC_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotCalC_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Código de Rapport", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxRapCod_Internalname, GXutil.ltrim( localUtil.ntoc( A7550VxRapCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxRapCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7550VxRapCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7550VxRapCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxRapCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxRapCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Nro. Partida", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxAcParN_Internalname, GXutil.ltrim( localUtil.ntoc( A8320VxAcParN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxAcParN_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8320VxAcParN), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8320VxAcParN), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxAcParN_Jsonclick, 0, "", "", "", "", "", 1, edtVxAcParN_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Artículo Terminado", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxArtTer_Internalname, GXutil.rtrim( A8321VxArtTer), GXutil.rtrim( localUtil.format( A8321VxArtTer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxArtTer_Jsonclick, 0, "", "", "", "", "", 1, edtVxArtTer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8322VxColCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxColCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8322VxColCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8322VxColCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxColCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxColCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "VxHRComp", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxHRComp_Internalname, GXutil.ltrim( localUtil.ntoc( A8323VxHRComp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxHRComp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8323VxHRComp), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8323VxHRComp), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxHRComp_Jsonclick, 0, "", "", "", "", "", 1, edtVxHRComp_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Metros  Crudo", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotMts_Internalname, GXutil.ltrim( localUtil.ntoc( A11209VxLotMts, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotMts_Enabled!=0) ? localUtil.format( A11209VxLotMts, "ZZZZZZZZ9.99") : localUtil.format( A11209VxLotMts, "ZZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotMts_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotMts_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Metros Terminado", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxLotMTe_Internalname, GXutil.ltrim( localUtil.ntoc( A13025VxLotMTe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxLotMTe_Enabled!=0) ? localUtil.format( A13025VxLotMTe, "ZZZZZ9.99") : localUtil.format( A13025VxLotMTe, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxLotMTe_Jsonclick, 0, "", "", "", "", "", 1, edtVxLotMTe_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Vx Cod Ext", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxCodExt_Internalname, GXutil.rtrim( A11305VxCodExt), GXutil.rtrim( localUtil.format( A11305VxCodExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxCodExt_Jsonclick, 0, "", "", "", "", "", 1, edtVxCodExt_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Operario que tejió el rollo", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxUsuTej_Internalname, GXutil.rtrim( A11775VxUsuTej), GXutil.rtrim( localUtil.format( A11775VxUsuTej, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxUsuTej_Jsonclick, 0, "", "", "", "", "", 1, edtVxUsuTej_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Almacen/Ubicación", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxAlmUbi_Internalname, GXutil.rtrim( A12249VxAlmUbi), GXutil.rtrim( localUtil.format( A12249VxAlmUbi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxAlmUbi_Jsonclick, 0, "", "", "", "", "", 1, edtVxAlmUbi_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Código Almacén", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxAlmCod_Internalname, GXutil.rtrim( A12248VxAlmCod), GXutil.rtrim( localUtil.format( A12248VxAlmCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxAlmCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxAlmCod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Tipo Documento de Entrada", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxComCRCT_Internalname, GXutil.rtrim( A12251VxComCRCT), GXutil.rtrim( localUtil.format( A12251VxComCRCT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxComCRCT_Jsonclick, 0, "", "", "", "", "", 1, edtVxComCRCT_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Nro Documento de Entrada", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxComCRCC_Internalname, GXutil.ltrim( localUtil.ntoc( A12250VxComCRCC, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxComCRCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12250VxComCRCC), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12250VxComCRCC), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxComCRCC_Jsonclick, 0, "", "", "", "", "", 1, edtVxComCRCC_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteCliDe_Internalname, GXutil.ltrim( localUtil.ntoc( A12252VxSteCliDe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxSteCliDe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12252VxSteCliDe), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12252VxSteCliDe), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteCliDe_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteCliDe_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Fecha Creación", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVxSteFecCr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteFecCr_Internalname, localUtil.format(A12253VxSteFecCr, "99/99/99"), localUtil.format( A12253VxSteFecCr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteFecCr_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteFecCr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVxSteFecCr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVxSteFecCr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVXRoll.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Nº Pedido Cliente (Eliot)", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxStePedNC_Internalname, GXutil.rtrim( A12375VxStePedNC), GXutil.rtrim( localUtil.format( A12375VxStePedNC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxStePedNC_Jsonclick, 0, "", "", "", "", "", 1, edtVxStePedNC_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Código Dibujo Interno (Eliot)", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteDibCo_Internalname, GXutil.rtrim( A12376VxSteDibCo), GXutil.rtrim( localUtil.format( A12376VxSteDibCo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteDibCo_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteDibCo_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Nº Línea Pedido", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxStePedLi_Internalname, GXutil.ltrim( localUtil.ntoc( A12377VxStePedLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxStePedLi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12377VxStePedLi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12377VxStePedLi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxStePedLi_Jsonclick, 0, "", "", "", "", "", 1, edtVxStePedLi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Lote Activo", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteAct_Internalname, GXutil.ltrim( localUtil.ntoc( A12749VxSteAct, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxSteAct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12749VxSteAct), "9") : localUtil.format( DecimalUtil.doubleToDec(A12749VxSteAct), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteAct_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteAct_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Fecha Fin Tejeduría", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtVxSteFecFT_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteFecFT_Internalname, localUtil.ttoc( A12885VxSteFecFT, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A12885VxSteFecFT, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteFecFT_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteFecFT_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtVxSteFecFT_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtVxSteFecFT_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TVXRoll.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Devolucion ('R' si es reproceso)", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteDev_Internalname, GXutil.rtrim( A12896VxSteDev), GXutil.rtrim( localUtil.format( A12896VxSteDev, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteDev_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteDev_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Rollo Reservado", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteRsv_Internalname, GXutil.rtrim( A12919VxSteRsv), GXutil.rtrim( localUtil.format( A12919VxSteRsv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteRsv_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteRsv_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Restricciones al color final", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSTeTejRe_Internalname, GXutil.rtrim( A13115VxSTeTejRe), GXutil.rtrim( localUtil.format( A13115VxSTeTejRe, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSTeTejRe_Jsonclick, 0, "", "", "", "", "", 1, edtVxSTeTejRe_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Rollo \"madre\"", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteIdMad_Internalname, GXutil.ltrim( localUtil.ntoc( A13202VxSteIdMad, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxSteIdMad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13202VxSteIdMad), "ZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13202VxSteIdMad), "ZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteIdMad_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteIdMad_Enabled, 0, "text", "1", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Peso Metro lineal", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSTePml_Internalname, GXutil.ltrim( localUtil.ntoc( A13211VxSTePml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxSTePml_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13211VxSTePml), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13211VxSTePml), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSTePml_Jsonclick, 0, "", "", "", "", "", 1, edtVxSTePml_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Metros en funcion del pml", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteMtspm_Internalname, GXutil.ltrim( localUtil.ntoc( A13212VxSteMtspm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxSteMtspm_Enabled!=0) ? localUtil.format( A13212VxSteMtspm, "ZZZZZ9.99") : localUtil.format( A13212VxSteMtspm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteMtspm_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteMtspm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Unidad de Medida", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbVxSteUniMe, cmbVxSteUniMe.getInternalname(), GXutil.rtrim( A13294VxSteUniMe), 1, cmbVxSteUniMe.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbVxSteUniMe.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "", true, (byte)(0), "HLP_TVXRoll.htm");
      cmbVxSteUniMe.setValue( GXutil.rtrim( A13294VxSteUniMe) );
      httpContext.ajax_rsp_assign_prop("", false, cmbVxSteUniMe.getInternalname(), "Values", cmbVxSteUniMe.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Rendimiento", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxSteRdto_Internalname, GXutil.ltrim( localUtil.ntoc( A13295VxSteRdto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxSteRdto_Enabled!=0) ? localUtil.format( A13295VxSteRdto, "Z9.99") : localUtil.format( A13295VxSteRdto, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxSteRdto_Jsonclick, 0, "", "", "", "", "", 1, edtVxSteRdto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVXRoll.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol230( ) ;
      nGXsfl_230_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1750 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1750 = (short)(1) ;
            scanStartUX1750( ) ;
            while ( RcdFound1750 != 0 )
            {
               init_level_properties1750( ) ;
               getByPrimaryKeyUX1750( ) ;
               addRowUX1750( ) ;
               scanNextUX1750( ) ;
            }
            scanEndUX1750( ) ;
            nBlankRcdCount1750 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalUX1750( ) ;
         standaloneModalUX1750( ) ;
         sMode1750 = Gx_mode ;
         while ( nGXsfl_230_idx < nRC_GXsfl_230 )
         {
            bGXsfl_230_Refreshing = true ;
            readRowUX1750( ) ;
            edtavnRcdDeleted_1750_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1750_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1750_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1750_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMFEC_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMFec_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMTMov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMTMOV_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMTMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMTMov_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMAlmCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMALMCO_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMAlmCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMAlmCo_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMSIT_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMSit_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMaux_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMAUX_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMaux_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMaux_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStUsuCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTUSUCOD_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStUsuCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStUsuCod_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStWrkStn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTWRKSTN_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStWrkStn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStWrkStn_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMAlmOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMALMOR_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMAlmOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMAlmOr_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMSitOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMSITOR_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMSitOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMSitOr_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMCAN_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMCan_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            edtVxStMCanOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMCANOR_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxStMCanOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMCanOr_Enabled), 5, 0), !bGXsfl_230_Refreshing);
            if ( ( nRcdExists_1750 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalUX1750( ) ;
            }
            sendRowUX1750( ) ;
            bGXsfl_230_Refreshing = false ;
         }
         Gx_mode = sMode1750 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1750 = (short)(5) ;
         nRcdExists_1750 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartUX1750( ) ;
            while ( RcdFound1750 != 0 )
            {
               sGXsfl_230_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_230_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2301750( ) ;
               init_level_properties1750( ) ;
               standaloneNotModalUX1750( ) ;
               getByPrimaryKeyUX1750( ) ;
               standaloneModalUX1750( ) ;
               addRowUX1750( ) ;
               scanNextUX1750( ) ;
            }
            scanEndUX1750( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1750 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_230_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_230_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_2301750( ) ;
      initAllUX1750( ) ;
      init_level_properties1750( ) ;
      nRcdExists_1750 = (short)(0) ;
      nIsMod_1750 = (short)(0) ;
      nRcdDeleted_1750 = (short)(0) ;
      nBlankRcdCount1750 = (short)(nBlankRcdUsr1750+nBlankRcdCount1750) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1750 > 0 )
      {
         standaloneNotModalUX1750( ) ;
         standaloneModalUX1750( ) ;
         addRowUX1750( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtVxStMFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1750 = (short)(nBlankRcdCount1750-1) ;
      }
      Gx_mode = sMode1750 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 247,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 248,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVXRoll.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVXRoll.htm");
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
         Z6224VxLotId = (int)(localUtil.ctol( httpContext.cgiGet( "Z6224VxLotId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6300VXLotSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6300VXLotSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12719VXLotSitF = localUtil.ctot( httpContext.cgiGet( "Z12719VXLotSitF"), 0) ;
         Z6303VXLotAnu = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6303VXLotAnu"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6318VxLotCan = localUtil.ctond( httpContext.cgiGet( "Z6318VxLotCan")) ;
         Z6458VxLotCTe = localUtil.ctond( httpContext.cgiGet( "Z6458VxLotCTe")) ;
         Z6459VxLotHRA = httpContext.cgiGet( "Z6459VxLotHRA") ;
         Z11686VxLotHRT = httpContext.cgiGet( "Z11686VxLotHRT") ;
         Z6640VxLotPrvC = (int)(localUtil.ctol( httpContext.cgiGet( "Z6640VxLotPrvC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6641VxLotDefPT = (short)(localUtil.ctol( httpContext.cgiGet( "Z6641VxLotDefPT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6643VxLotMaqT = httpContext.cgiGet( "Z6643VxLotMaqT") ;
         Z7422VxLotACru = httpContext.cgiGet( "Z7422VxLotACru") ;
         Z7423VxLotCalC = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7423VxLotCalC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8320VxAcParN = (int)(localUtil.ctol( httpContext.cgiGet( "Z8320VxAcParN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8321VxArtTer = httpContext.cgiGet( "Z8321VxArtTer") ;
         Z8322VxColCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z8322VxColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11209VxLotMts = localUtil.ctond( httpContext.cgiGet( "Z11209VxLotMts")) ;
         Z13025VxLotMTe = localUtil.ctond( httpContext.cgiGet( "Z13025VxLotMTe")) ;
         Z11305VxCodExt = httpContext.cgiGet( "Z11305VxCodExt") ;
         Z11775VxUsuTej = httpContext.cgiGet( "Z11775VxUsuTej") ;
         Z12251VxComCRCT = httpContext.cgiGet( "Z12251VxComCRCT") ;
         Z12250VxComCRCC = (int)(localUtil.ctol( httpContext.cgiGet( "Z12250VxComCRCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12252VxSteCliDe = (int)(localUtil.ctol( httpContext.cgiGet( "Z12252VxSteCliDe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12253VxSteFecCr = localUtil.ctod( httpContext.cgiGet( "Z12253VxSteFecCr"), 0) ;
         Z12375VxStePedNC = httpContext.cgiGet( "Z12375VxStePedNC") ;
         Z12376VxSteDibCo = httpContext.cgiGet( "Z12376VxSteDibCo") ;
         Z12377VxStePedLi = (short)(localUtil.ctol( httpContext.cgiGet( "Z12377VxStePedLi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12749VxSteAct = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12749VxSteAct"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12885VxSteFecFT = localUtil.ctot( httpContext.cgiGet( "Z12885VxSteFecFT"), 0) ;
         Z12896VxSteDev = httpContext.cgiGet( "Z12896VxSteDev") ;
         Z12919VxSteRsv = httpContext.cgiGet( "Z12919VxSteRsv") ;
         Z13115VxSTeTejRe = httpContext.cgiGet( "Z13115VxSTeTejRe") ;
         Z13202VxSteIdMad = (int)(localUtil.ctol( httpContext.cgiGet( "Z13202VxSteIdMad"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13294VxSteUniMe = httpContext.cgiGet( "Z13294VxSteUniMe") ;
         Z6642VxLotTeLo = httpContext.cgiGet( "Z6642VxLotTeLo") ;
         Z7550VxRapCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z7550VxRapCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12248VxAlmCod = httpContext.cgiGet( "Z12248VxAlmCod") ;
         Z12249VxAlmUbi = httpContext.cgiGet( "Z12249VxAlmUbi") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_230 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_230"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6224VxLotId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
         }
         else
         {
            A6224VxLotId = (int)(localUtil.ctol( httpContext.cgiGet( edtVxLotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVXLotSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVXLotSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTSIT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVXLotSit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6300VXLotSit = (byte)(0) ;
            n6300VXLotSit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6300VXLotSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6300VXLotSit), 2, 0));
         }
         else
         {
            A6300VXLotSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtVXLotSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6300VXLotSit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6300VXLotSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6300VXLotSit), 2, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtVXLotSitF_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "VXLOTSITF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVXLotSitF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12719VXLotSitF = GXutil.resetTime( GXutil.nullDate() );
            n12719VXLotSitF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12719VXLotSitF", localUtil.ttoc( A12719VXLotSitF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A12719VXLotSitF = localUtil.ctot( httpContext.cgiGet( edtVXLotSitF_Internalname)) ;
            n12719VXLotSitF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12719VXLotSitF", localUtil.ttoc( A12719VXLotSitF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVXLotAnu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVXLotAnu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTANU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVXLotAnu_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6303VXLotAnu = (byte)(0) ;
            n6303VXLotAnu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6303VXLotAnu", GXutil.str( A6303VXLotAnu, 1, 0));
         }
         else
         {
            A6303VXLotAnu = (byte)(localUtil.ctol( httpContext.cgiGet( edtVXLotAnu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6303VXLotAnu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6303VXLotAnu", GXutil.str( A6303VXLotAnu, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxLotCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxLotCan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTCAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotCan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6318VxLotCan = DecimalUtil.ZERO ;
            n6318VxLotCan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6318VxLotCan", GXutil.ltrimstr( A6318VxLotCan, 9, 2));
         }
         else
         {
            A6318VxLotCan = localUtil.ctond( httpContext.cgiGet( edtVxLotCan_Internalname)) ;
            n6318VxLotCan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6318VxLotCan", GXutil.ltrimstr( A6318VxLotCan, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxLotCTe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxLotCTe_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTCTE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotCTe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6458VxLotCTe = DecimalUtil.ZERO ;
            n6458VxLotCTe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6458VxLotCTe", GXutil.ltrimstr( A6458VxLotCTe, 9, 2));
         }
         else
         {
            A6458VxLotCTe = localUtil.ctond( httpContext.cgiGet( edtVxLotCTe_Internalname)) ;
            n6458VxLotCTe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6458VxLotCTe", GXutil.ltrimstr( A6458VxLotCTe, 9, 2));
         }
         A6459VxLotHRA = httpContext.cgiGet( edtVxLotHRA_Internalname) ;
         n6459VxLotHRA = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6459VxLotHRA", A6459VxLotHRA);
         A11686VxLotHRT = httpContext.cgiGet( edtVxLotHRT_Internalname) ;
         n11686VxLotHRT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11686VxLotHRT", A11686VxLotHRT);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotPrvC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotPrvC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTPRVC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotPrvC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6640VxLotPrvC = 0 ;
            n6640VxLotPrvC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6640VxLotPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6640VxLotPrvC), 6, 0));
         }
         else
         {
            A6640VxLotPrvC = (int)(localUtil.ctol( httpContext.cgiGet( edtVxLotPrvC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6640VxLotPrvC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6640VxLotPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6640VxLotPrvC), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotDefPT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotDefPT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTDEFPT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotDefPT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6641VxLotDefPT = (short)(0) ;
            n6641VxLotDefPT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6641VxLotDefPT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6641VxLotDefPT), 4, 0));
         }
         else
         {
            A6641VxLotDefPT = (short)(localUtil.ctol( httpContext.cgiGet( edtVxLotDefPT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6641VxLotDefPT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6641VxLotDefPT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6641VxLotDefPT), 4, 0));
         }
         A6642VxLotTeLo = httpContext.cgiGet( edtVxLotTeLo_Internalname) ;
         n6642VxLotTeLo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6642VxLotTeLo", A6642VxLotTeLo);
         A6643VxLotMaqT = httpContext.cgiGet( edtVxLotMaqT_Internalname) ;
         n6643VxLotMaqT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6643VxLotMaqT", A6643VxLotMaqT);
         A7422VxLotACru = httpContext.cgiGet( edtVxLotACru_Internalname) ;
         n7422VxLotACru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7422VxLotACru", A7422VxLotACru);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotCalC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxLotCalC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTCALC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotCalC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7423VxLotCalC = (byte)(0) ;
            n7423VxLotCalC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7423VxLotCalC", GXutil.str( A7423VxLotCalC, 1, 0));
         }
         else
         {
            A7423VxLotCalC = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxLotCalC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7423VxLotCalC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7423VxLotCalC", GXutil.str( A7423VxLotCalC, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxRapCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxRapCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXRAPCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxRapCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7550VxRapCod = 0 ;
            n7550VxRapCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7550VxRapCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7550VxRapCod), 6, 0));
         }
         else
         {
            A7550VxRapCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxRapCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7550VxRapCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7550VxRapCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7550VxRapCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxAcParN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxAcParN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXACPARN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAcParN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8320VxAcParN = 0 ;
            n8320VxAcParN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8320VxAcParN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8320VxAcParN), 8, 0));
         }
         else
         {
            A8320VxAcParN = (int)(localUtil.ctol( httpContext.cgiGet( edtVxAcParN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8320VxAcParN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8320VxAcParN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8320VxAcParN), 8, 0));
         }
         A8321VxArtTer = httpContext.cgiGet( edtVxArtTer_Internalname) ;
         n8321VxArtTer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8321VxArtTer", A8321VxArtTer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXCOLCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxColCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8322VxColCod = 0 ;
            n8322VxColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8322VxColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8322VxColCod), 6, 0));
         }
         else
         {
            A8322VxColCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8322VxColCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8322VxColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8322VxColCod), 6, 0));
         }
         A8323VxHRComp = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxHRComp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxLotMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxLotMts_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTMTS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotMts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11209VxLotMts = DecimalUtil.ZERO ;
            n11209VxLotMts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11209VxLotMts", GXutil.ltrimstr( A11209VxLotMts, 12, 2));
         }
         else
         {
            A11209VxLotMts = localUtil.ctond( httpContext.cgiGet( edtVxLotMts_Internalname)) ;
            n11209VxLotMts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11209VxLotMts", GXutil.ltrimstr( A11209VxLotMts, 12, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxLotMTe_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxLotMTe_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXLOTMTE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotMTe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13025VxLotMTe = DecimalUtil.ZERO ;
            n13025VxLotMTe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13025VxLotMTe", GXutil.ltrimstr( A13025VxLotMTe, 9, 2));
         }
         else
         {
            A13025VxLotMTe = localUtil.ctond( httpContext.cgiGet( edtVxLotMTe_Internalname)) ;
            n13025VxLotMTe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13025VxLotMTe", GXutil.ltrimstr( A13025VxLotMTe, 9, 2));
         }
         A11305VxCodExt = httpContext.cgiGet( edtVxCodExt_Internalname) ;
         n11305VxCodExt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11305VxCodExt", A11305VxCodExt);
         A11775VxUsuTej = httpContext.cgiGet( edtVxUsuTej_Internalname) ;
         n11775VxUsuTej = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11775VxUsuTej", A11775VxUsuTej);
         A12249VxAlmUbi = httpContext.cgiGet( edtVxAlmUbi_Internalname) ;
         n12249VxAlmUbi = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12249VxAlmUbi", A12249VxAlmUbi);
         A12248VxAlmCod = httpContext.cgiGet( edtVxAlmCod_Internalname) ;
         n12248VxAlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
         A12251VxComCRCT = httpContext.cgiGet( edtVxComCRCT_Internalname) ;
         n12251VxComCRCT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12251VxComCRCT", A12251VxComCRCT);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxComCRCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxComCRCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXCOMCRCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxComCRCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12250VxComCRCC = 0 ;
            n12250VxComCRCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12250VxComCRCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12250VxComCRCC), 8, 0));
         }
         else
         {
            A12250VxComCRCC = (int)(localUtil.ctol( httpContext.cgiGet( edtVxComCRCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12250VxComCRCC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12250VxComCRCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12250VxComCRCC), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxSteCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxSteCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXSTECLIDE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxSteCliDe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12252VxSteCliDe = 0 ;
            n12252VxSteCliDe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12252VxSteCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12252VxSteCliDe), 6, 0));
         }
         else
         {
            A12252VxSteCliDe = (int)(localUtil.ctol( httpContext.cgiGet( edtVxSteCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12252VxSteCliDe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12252VxSteCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12252VxSteCliDe), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtVxSteFecCr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "VXSTEFECCR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxSteFecCr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12253VxSteFecCr = GXutil.nullDate() ;
            n12253VxSteFecCr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12253VxSteFecCr", localUtil.format(A12253VxSteFecCr, "99/99/99"));
         }
         else
         {
            A12253VxSteFecCr = localUtil.ctod( httpContext.cgiGet( edtVxSteFecCr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n12253VxSteFecCr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12253VxSteFecCr", localUtil.format(A12253VxSteFecCr, "99/99/99"));
         }
         A12375VxStePedNC = httpContext.cgiGet( edtVxStePedNC_Internalname) ;
         n12375VxStePedNC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12375VxStePedNC", A12375VxStePedNC);
         A12376VxSteDibCo = httpContext.cgiGet( edtVxSteDibCo_Internalname) ;
         n12376VxSteDibCo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12376VxSteDibCo", A12376VxSteDibCo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxStePedLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxStePedLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXSTEPEDLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxStePedLi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12377VxStePedLi = (short)(0) ;
            n12377VxStePedLi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12377VxStePedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12377VxStePedLi), 4, 0));
         }
         else
         {
            A12377VxStePedLi = (short)(localUtil.ctol( httpContext.cgiGet( edtVxStePedLi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12377VxStePedLi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12377VxStePedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12377VxStePedLi), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxSteAct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxSteAct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXSTEACT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxSteAct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12749VxSteAct = (byte)(0) ;
            n12749VxSteAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12749VxSteAct", GXutil.str( A12749VxSteAct, 1, 0));
         }
         else
         {
            A12749VxSteAct = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxSteAct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12749VxSteAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12749VxSteAct", GXutil.str( A12749VxSteAct, 1, 0));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtVxSteFecFT_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "VXSTEFECFT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxSteFecFT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12885VxSteFecFT = GXutil.resetTime( GXutil.nullDate() );
            n12885VxSteFecFT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12885VxSteFecFT", localUtil.ttoc( A12885VxSteFecFT, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A12885VxSteFecFT = localUtil.ctot( httpContext.cgiGet( edtVxSteFecFT_Internalname)) ;
            n12885VxSteFecFT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12885VxSteFecFT", localUtil.ttoc( A12885VxSteFecFT, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A12896VxSteDev = httpContext.cgiGet( edtVxSteDev_Internalname) ;
         n12896VxSteDev = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12896VxSteDev", A12896VxSteDev);
         A12919VxSteRsv = httpContext.cgiGet( edtVxSteRsv_Internalname) ;
         n12919VxSteRsv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12919VxSteRsv", A12919VxSteRsv);
         A13115VxSTeTejRe = httpContext.cgiGet( edtVxSTeTejRe_Internalname) ;
         n13115VxSTeTejRe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13115VxSTeTejRe", A13115VxSTeTejRe);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxSteIdMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxSteIdMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXSTEIDMAD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxSteIdMad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13202VxSteIdMad = 0 ;
            n13202VxSteIdMad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13202VxSteIdMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13202VxSteIdMad), 9, 0));
         }
         else
         {
            A13202VxSteIdMad = (int)(localUtil.ctol( httpContext.cgiGet( edtVxSteIdMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13202VxSteIdMad = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13202VxSteIdMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13202VxSteIdMad), 9, 0));
         }
         A13211VxSTePml = (short)(localUtil.ctol( httpContext.cgiGet( edtVxSTePml_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
         A13212VxSteMtspm = localUtil.ctond( httpContext.cgiGet( edtVxSteMtspm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrimstr( A13212VxSteMtspm, 9, 2));
         cmbVxSteUniMe.setName( cmbVxSteUniMe.getInternalname() );
         cmbVxSteUniMe.setValue( httpContext.cgiGet( cmbVxSteUniMe.getInternalname()) );
         A13294VxSteUniMe = httpContext.cgiGet( cmbVxSteUniMe.getInternalname()) ;
         n13294VxSteUniMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13294VxSteUniMe", A13294VxSteUniMe);
         A13295VxSteRdto = localUtil.ctond( httpContext.cgiGet( edtVxSteRdto_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
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
            A6224VxLotId = (int)(GXutil.lval( httpContext.GetPar( "VxLotId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
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
            initAllUX916( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1750_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1750_Enabled), 5, 0), !bGXsfl_230_Refreshing);
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
      disableAttributesUX916( ) ;
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

   public void confirm_UX0( )
   {
      beforeValidateUX916( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsUX916( ) ;
         }
         else
         {
            checkExtendedTableUX916( ) ;
            if ( AnyError == 0 )
            {
               zmUX916( 5) ;
               zmUX916( 6) ;
               zmUX916( 7) ;
               zmUX916( 8) ;
               zmUX916( 9) ;
               zmUX916( 10) ;
            }
            closeExtendedTableCursorsUX916( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode916 = Gx_mode ;
         confirm_UX1750( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode916 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode916 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesUX0( ) ;
      }
   }

   public void confirm_UX1750( )
   {
      nGXsfl_230_idx = 0 ;
      while ( nGXsfl_230_idx < nRC_GXsfl_230 )
      {
         readRowUX1750( ) ;
         if ( ( nRcdExists_1750 != 0 ) || ( nIsMod_1750 != 0 ) )
         {
            getKeyUX1750( ) ;
            if ( ( nRcdExists_1750 == 0 ) && ( nRcdDeleted_1750 == 0 ) )
            {
               if ( RcdFound1750 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateUX1750( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableUX1750( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsUX1750( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "VXSTMFEC_" + sGXsfl_230_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxStMFec_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1750 != 0 )
               {
                  if ( nRcdDeleted_1750 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyUX1750( ) ;
                     loadUX1750( ) ;
                     beforeValidateUX1750( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsUX1750( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1750 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateUX1750( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableUX1750( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsUX1750( ) ;
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
                  if ( nRcdDeleted_1750 == 0 )
                  {
                     GXCCtl = "VXSTMFEC_" + sGXsfl_230_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxStMFec_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1750_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxStMFec_Internalname, localUtil.ttoc( A12730VxStMFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtVxStMTMov_Internalname, GXutil.rtrim( A12720VxStMTMov)) ;
         httpContext.changePostValue( edtVxStMAlmCo_Internalname, GXutil.rtrim( A12721VxStMAlmCo)) ;
         httpContext.changePostValue( edtVxStMSit_Internalname, GXutil.ltrim( localUtil.ntoc( A12722VxStMSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxStMaux_Internalname, GXutil.rtrim( A12723VxStMaux)) ;
         httpContext.changePostValue( edtVxStUsuCod_Internalname, GXutil.rtrim( A12724VxStUsuCod)) ;
         httpContext.changePostValue( edtVxStWrkStn_Internalname, GXutil.rtrim( A12725VxStWrkStn)) ;
         httpContext.changePostValue( edtVxStMAlmOr_Internalname, GXutil.rtrim( A12726VxStMAlmOr)) ;
         httpContext.changePostValue( edtVxStMSitOr_Internalname, GXutil.ltrim( localUtil.ntoc( A12727VxStMSitOr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxStMCan_Internalname, GXutil.ltrim( localUtil.ntoc( A12728VxStMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxStMCanOr_Internalname, GXutil.ltrim( localUtil.ntoc( A12729VxStMCanOr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12730VxStMFec_"+sGXsfl_230_idx, localUtil.ttoc( Z12730VxStMFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12720VxStMTMov_"+sGXsfl_230_idx, GXutil.rtrim( Z12720VxStMTMov)) ;
         httpContext.changePostValue( "ZT_"+"Z12721VxStMAlmCo_"+sGXsfl_230_idx, GXutil.rtrim( Z12721VxStMAlmCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12722VxStMSit_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( Z12722VxStMSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12723VxStMaux_"+sGXsfl_230_idx, GXutil.rtrim( Z12723VxStMaux)) ;
         httpContext.changePostValue( "ZT_"+"Z12724VxStUsuCod_"+sGXsfl_230_idx, GXutil.rtrim( Z12724VxStUsuCod)) ;
         httpContext.changePostValue( "ZT_"+"Z12725VxStWrkStn_"+sGXsfl_230_idx, GXutil.rtrim( Z12725VxStWrkStn)) ;
         httpContext.changePostValue( "ZT_"+"Z12726VxStMAlmOr_"+sGXsfl_230_idx, GXutil.rtrim( Z12726VxStMAlmOr)) ;
         httpContext.changePostValue( "ZT_"+"Z12727VxStMSitOr_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( Z12727VxStMSitOr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12728VxStMCan_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( Z12728VxStMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12729VxStMCanOr_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( Z12729VxStMCanOr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1750_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1750_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1750_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1750 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1750_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1750_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMFEC_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMTMOV_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMTMov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMALMCO_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMAlmCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMSIT_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMAUX_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMaux_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTUSUCOD_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStUsuCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTWRKSTN_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStWrkStn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMALMOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMAlmOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMSITOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMSitOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMCAN_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMCANOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMCanOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionUX0( )
   {
   }

   public void zmUX916( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6300VXLotSit = T00UX5_A6300VXLotSit[0] ;
            Z12719VXLotSitF = T00UX5_A12719VXLotSitF[0] ;
            Z6303VXLotAnu = T00UX5_A6303VXLotAnu[0] ;
            Z6318VxLotCan = T00UX5_A6318VxLotCan[0] ;
            Z6458VxLotCTe = T00UX5_A6458VxLotCTe[0] ;
            Z6459VxLotHRA = T00UX5_A6459VxLotHRA[0] ;
            Z11686VxLotHRT = T00UX5_A11686VxLotHRT[0] ;
            Z6640VxLotPrvC = T00UX5_A6640VxLotPrvC[0] ;
            Z6641VxLotDefPT = T00UX5_A6641VxLotDefPT[0] ;
            Z6643VxLotMaqT = T00UX5_A6643VxLotMaqT[0] ;
            Z7422VxLotACru = T00UX5_A7422VxLotACru[0] ;
            Z7423VxLotCalC = T00UX5_A7423VxLotCalC[0] ;
            Z8320VxAcParN = T00UX5_A8320VxAcParN[0] ;
            Z8321VxArtTer = T00UX5_A8321VxArtTer[0] ;
            Z8322VxColCod = T00UX5_A8322VxColCod[0] ;
            Z11209VxLotMts = T00UX5_A11209VxLotMts[0] ;
            Z13025VxLotMTe = T00UX5_A13025VxLotMTe[0] ;
            Z11305VxCodExt = T00UX5_A11305VxCodExt[0] ;
            Z11775VxUsuTej = T00UX5_A11775VxUsuTej[0] ;
            Z12251VxComCRCT = T00UX5_A12251VxComCRCT[0] ;
            Z12250VxComCRCC = T00UX5_A12250VxComCRCC[0] ;
            Z12252VxSteCliDe = T00UX5_A12252VxSteCliDe[0] ;
            Z12253VxSteFecCr = T00UX5_A12253VxSteFecCr[0] ;
            Z12375VxStePedNC = T00UX5_A12375VxStePedNC[0] ;
            Z12376VxSteDibCo = T00UX5_A12376VxSteDibCo[0] ;
            Z12377VxStePedLi = T00UX5_A12377VxStePedLi[0] ;
            Z12749VxSteAct = T00UX5_A12749VxSteAct[0] ;
            Z12885VxSteFecFT = T00UX5_A12885VxSteFecFT[0] ;
            Z12896VxSteDev = T00UX5_A12896VxSteDev[0] ;
            Z12919VxSteRsv = T00UX5_A12919VxSteRsv[0] ;
            Z13115VxSTeTejRe = T00UX5_A13115VxSTeTejRe[0] ;
            Z13202VxSteIdMad = T00UX5_A13202VxSteIdMad[0] ;
            Z13294VxSteUniMe = T00UX5_A13294VxSteUniMe[0] ;
            Z6642VxLotTeLo = T00UX5_A6642VxLotTeLo[0] ;
            Z7550VxRapCod = T00UX5_A7550VxRapCod[0] ;
            Z12248VxAlmCod = T00UX5_A12248VxAlmCod[0] ;
            Z12249VxAlmUbi = T00UX5_A12249VxAlmUbi[0] ;
         }
         else
         {
            Z6300VXLotSit = A6300VXLotSit ;
            Z12719VXLotSitF = A12719VXLotSitF ;
            Z6303VXLotAnu = A6303VXLotAnu ;
            Z6318VxLotCan = A6318VxLotCan ;
            Z6458VxLotCTe = A6458VxLotCTe ;
            Z6459VxLotHRA = A6459VxLotHRA ;
            Z11686VxLotHRT = A11686VxLotHRT ;
            Z6640VxLotPrvC = A6640VxLotPrvC ;
            Z6641VxLotDefPT = A6641VxLotDefPT ;
            Z6643VxLotMaqT = A6643VxLotMaqT ;
            Z7422VxLotACru = A7422VxLotACru ;
            Z7423VxLotCalC = A7423VxLotCalC ;
            Z8320VxAcParN = A8320VxAcParN ;
            Z8321VxArtTer = A8321VxArtTer ;
            Z8322VxColCod = A8322VxColCod ;
            Z11209VxLotMts = A11209VxLotMts ;
            Z13025VxLotMTe = A13025VxLotMTe ;
            Z11305VxCodExt = A11305VxCodExt ;
            Z11775VxUsuTej = A11775VxUsuTej ;
            Z12251VxComCRCT = A12251VxComCRCT ;
            Z12250VxComCRCC = A12250VxComCRCC ;
            Z12252VxSteCliDe = A12252VxSteCliDe ;
            Z12253VxSteFecCr = A12253VxSteFecCr ;
            Z12375VxStePedNC = A12375VxStePedNC ;
            Z12376VxSteDibCo = A12376VxSteDibCo ;
            Z12377VxStePedLi = A12377VxStePedLi ;
            Z12749VxSteAct = A12749VxSteAct ;
            Z12885VxSteFecFT = A12885VxSteFecFT ;
            Z12896VxSteDev = A12896VxSteDev ;
            Z12919VxSteRsv = A12919VxSteRsv ;
            Z13115VxSTeTejRe = A13115VxSTeTejRe ;
            Z13202VxSteIdMad = A13202VxSteIdMad ;
            Z13294VxSteUniMe = A13294VxSteUniMe ;
            Z6642VxLotTeLo = A6642VxLotTeLo ;
            Z7550VxRapCod = A7550VxRapCod ;
            Z12248VxAlmCod = A12248VxAlmCod ;
            Z12249VxAlmUbi = A12249VxAlmUbi ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z6224VxLotId = A6224VxLotId ;
         Z6300VXLotSit = A6300VXLotSit ;
         Z12719VXLotSitF = A12719VXLotSitF ;
         Z6303VXLotAnu = A6303VXLotAnu ;
         Z6318VxLotCan = A6318VxLotCan ;
         Z6458VxLotCTe = A6458VxLotCTe ;
         Z6459VxLotHRA = A6459VxLotHRA ;
         Z11686VxLotHRT = A11686VxLotHRT ;
         Z6640VxLotPrvC = A6640VxLotPrvC ;
         Z6641VxLotDefPT = A6641VxLotDefPT ;
         Z6643VxLotMaqT = A6643VxLotMaqT ;
         Z7422VxLotACru = A7422VxLotACru ;
         Z7423VxLotCalC = A7423VxLotCalC ;
         Z8320VxAcParN = A8320VxAcParN ;
         Z8321VxArtTer = A8321VxArtTer ;
         Z8322VxColCod = A8322VxColCod ;
         Z11209VxLotMts = A11209VxLotMts ;
         Z13025VxLotMTe = A13025VxLotMTe ;
         Z11305VxCodExt = A11305VxCodExt ;
         Z11775VxUsuTej = A11775VxUsuTej ;
         Z12251VxComCRCT = A12251VxComCRCT ;
         Z12250VxComCRCC = A12250VxComCRCC ;
         Z12252VxSteCliDe = A12252VxSteCliDe ;
         Z12253VxSteFecCr = A12253VxSteFecCr ;
         Z12375VxStePedNC = A12375VxStePedNC ;
         Z12376VxSteDibCo = A12376VxSteDibCo ;
         Z12377VxStePedLi = A12377VxStePedLi ;
         Z12749VxSteAct = A12749VxSteAct ;
         Z12885VxSteFecFT = A12885VxSteFecFT ;
         Z12896VxSteDev = A12896VxSteDev ;
         Z12919VxSteRsv = A12919VxSteRsv ;
         Z13115VxSTeTejRe = A13115VxSTeTejRe ;
         Z13202VxSteIdMad = A13202VxSteIdMad ;
         Z13294VxSteUniMe = A13294VxSteUniMe ;
         Z6642VxLotTeLo = A6642VxLotTeLo ;
         Z7550VxRapCod = A7550VxRapCod ;
         Z12248VxAlmCod = A12248VxAlmCod ;
         Z12249VxAlmUbi = A12249VxAlmUbi ;
         Z8323VxHRComp = A8323VxHRComp ;
         Z13211VxSTePml = A13211VxSTePml ;
         Z13295VxSteRdto = A13295VxSteRdto ;
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

   public void loadUX916( )
   {
      /* Using cursor T00UX14 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound916 = (short)(1) ;
         A6300VXLotSit = T00UX14_A6300VXLotSit[0] ;
         n6300VXLotSit = T00UX14_n6300VXLotSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6300VXLotSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6300VXLotSit), 2, 0));
         A12719VXLotSitF = T00UX14_A12719VXLotSitF[0] ;
         n12719VXLotSitF = T00UX14_n12719VXLotSitF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12719VXLotSitF", localUtil.ttoc( A12719VXLotSitF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6303VXLotAnu = T00UX14_A6303VXLotAnu[0] ;
         n6303VXLotAnu = T00UX14_n6303VXLotAnu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6303VXLotAnu", GXutil.str( A6303VXLotAnu, 1, 0));
         A6318VxLotCan = T00UX14_A6318VxLotCan[0] ;
         n6318VxLotCan = T00UX14_n6318VxLotCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6318VxLotCan", GXutil.ltrimstr( A6318VxLotCan, 9, 2));
         A6458VxLotCTe = T00UX14_A6458VxLotCTe[0] ;
         n6458VxLotCTe = T00UX14_n6458VxLotCTe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6458VxLotCTe", GXutil.ltrimstr( A6458VxLotCTe, 9, 2));
         A6459VxLotHRA = T00UX14_A6459VxLotHRA[0] ;
         n6459VxLotHRA = T00UX14_n6459VxLotHRA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6459VxLotHRA", A6459VxLotHRA);
         A11686VxLotHRT = T00UX14_A11686VxLotHRT[0] ;
         n11686VxLotHRT = T00UX14_n11686VxLotHRT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11686VxLotHRT", A11686VxLotHRT);
         A6640VxLotPrvC = T00UX14_A6640VxLotPrvC[0] ;
         n6640VxLotPrvC = T00UX14_n6640VxLotPrvC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6640VxLotPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6640VxLotPrvC), 6, 0));
         A6641VxLotDefPT = T00UX14_A6641VxLotDefPT[0] ;
         n6641VxLotDefPT = T00UX14_n6641VxLotDefPT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6641VxLotDefPT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6641VxLotDefPT), 4, 0));
         A6643VxLotMaqT = T00UX14_A6643VxLotMaqT[0] ;
         n6643VxLotMaqT = T00UX14_n6643VxLotMaqT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6643VxLotMaqT", A6643VxLotMaqT);
         A7422VxLotACru = T00UX14_A7422VxLotACru[0] ;
         n7422VxLotACru = T00UX14_n7422VxLotACru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7422VxLotACru", A7422VxLotACru);
         A7423VxLotCalC = T00UX14_A7423VxLotCalC[0] ;
         n7423VxLotCalC = T00UX14_n7423VxLotCalC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7423VxLotCalC", GXutil.str( A7423VxLotCalC, 1, 0));
         A8320VxAcParN = T00UX14_A8320VxAcParN[0] ;
         n8320VxAcParN = T00UX14_n8320VxAcParN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8320VxAcParN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8320VxAcParN), 8, 0));
         A8321VxArtTer = T00UX14_A8321VxArtTer[0] ;
         n8321VxArtTer = T00UX14_n8321VxArtTer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8321VxArtTer", A8321VxArtTer);
         A8322VxColCod = T00UX14_A8322VxColCod[0] ;
         n8322VxColCod = T00UX14_n8322VxColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8322VxColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8322VxColCod), 6, 0));
         A11209VxLotMts = T00UX14_A11209VxLotMts[0] ;
         n11209VxLotMts = T00UX14_n11209VxLotMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11209VxLotMts", GXutil.ltrimstr( A11209VxLotMts, 12, 2));
         A13025VxLotMTe = T00UX14_A13025VxLotMTe[0] ;
         n13025VxLotMTe = T00UX14_n13025VxLotMTe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13025VxLotMTe", GXutil.ltrimstr( A13025VxLotMTe, 9, 2));
         A11305VxCodExt = T00UX14_A11305VxCodExt[0] ;
         n11305VxCodExt = T00UX14_n11305VxCodExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11305VxCodExt", A11305VxCodExt);
         A11775VxUsuTej = T00UX14_A11775VxUsuTej[0] ;
         n11775VxUsuTej = T00UX14_n11775VxUsuTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11775VxUsuTej", A11775VxUsuTej);
         A12251VxComCRCT = T00UX14_A12251VxComCRCT[0] ;
         n12251VxComCRCT = T00UX14_n12251VxComCRCT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12251VxComCRCT", A12251VxComCRCT);
         A12250VxComCRCC = T00UX14_A12250VxComCRCC[0] ;
         n12250VxComCRCC = T00UX14_n12250VxComCRCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12250VxComCRCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12250VxComCRCC), 8, 0));
         A12252VxSteCliDe = T00UX14_A12252VxSteCliDe[0] ;
         n12252VxSteCliDe = T00UX14_n12252VxSteCliDe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12252VxSteCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12252VxSteCliDe), 6, 0));
         A12253VxSteFecCr = T00UX14_A12253VxSteFecCr[0] ;
         n12253VxSteFecCr = T00UX14_n12253VxSteFecCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12253VxSteFecCr", localUtil.format(A12253VxSteFecCr, "99/99/99"));
         A12375VxStePedNC = T00UX14_A12375VxStePedNC[0] ;
         n12375VxStePedNC = T00UX14_n12375VxStePedNC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12375VxStePedNC", A12375VxStePedNC);
         A12376VxSteDibCo = T00UX14_A12376VxSteDibCo[0] ;
         n12376VxSteDibCo = T00UX14_n12376VxSteDibCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12376VxSteDibCo", A12376VxSteDibCo);
         A12377VxStePedLi = T00UX14_A12377VxStePedLi[0] ;
         n12377VxStePedLi = T00UX14_n12377VxStePedLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12377VxStePedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12377VxStePedLi), 4, 0));
         A12749VxSteAct = T00UX14_A12749VxSteAct[0] ;
         n12749VxSteAct = T00UX14_n12749VxSteAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12749VxSteAct", GXutil.str( A12749VxSteAct, 1, 0));
         A12885VxSteFecFT = T00UX14_A12885VxSteFecFT[0] ;
         n12885VxSteFecFT = T00UX14_n12885VxSteFecFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12885VxSteFecFT", localUtil.ttoc( A12885VxSteFecFT, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12896VxSteDev = T00UX14_A12896VxSteDev[0] ;
         n12896VxSteDev = T00UX14_n12896VxSteDev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12896VxSteDev", A12896VxSteDev);
         A12919VxSteRsv = T00UX14_A12919VxSteRsv[0] ;
         n12919VxSteRsv = T00UX14_n12919VxSteRsv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12919VxSteRsv", A12919VxSteRsv);
         A13115VxSTeTejRe = T00UX14_A13115VxSTeTejRe[0] ;
         n13115VxSTeTejRe = T00UX14_n13115VxSTeTejRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13115VxSTeTejRe", A13115VxSTeTejRe);
         A13202VxSteIdMad = T00UX14_A13202VxSteIdMad[0] ;
         n13202VxSteIdMad = T00UX14_n13202VxSteIdMad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13202VxSteIdMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13202VxSteIdMad), 9, 0));
         A13294VxSteUniMe = T00UX14_A13294VxSteUniMe[0] ;
         n13294VxSteUniMe = T00UX14_n13294VxSteUniMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13294VxSteUniMe", A13294VxSteUniMe);
         A6642VxLotTeLo = T00UX14_A6642VxLotTeLo[0] ;
         n6642VxLotTeLo = T00UX14_n6642VxLotTeLo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6642VxLotTeLo", A6642VxLotTeLo);
         A7550VxRapCod = T00UX14_A7550VxRapCod[0] ;
         n7550VxRapCod = T00UX14_n7550VxRapCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7550VxRapCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7550VxRapCod), 6, 0));
         A12248VxAlmCod = T00UX14_A12248VxAlmCod[0] ;
         n12248VxAlmCod = T00UX14_n12248VxAlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
         A12249VxAlmUbi = T00UX14_A12249VxAlmUbi[0] ;
         n12249VxAlmUbi = T00UX14_n12249VxAlmUbi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12249VxAlmUbi", A12249VxAlmUbi);
         A13211VxSTePml = T00UX14_A13211VxSTePml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
         A13295VxSteRdto = T00UX14_A13295VxSteRdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
         A8323VxHRComp = T00UX14_A8323VxHRComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
         zmUX916( -3) ;
      }
      pr_default.close(10);
      onLoadActionsUX916( ) ;
   }

   public void onLoadActionsUX916( )
   {
      if ( A13211VxSTePml > 0 )
      {
         A13212VxSteMtspm = A6318VxLotCan.divide(DecimalUtil.doubleToDec(A13211VxSTePml), 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(1000)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrimstr( A13212VxSteMtspm, 9, 2));
      }
      else
      {
         A13212VxSteMtspm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrimstr( A13212VxSteMtspm, 9, 2));
      }
   }

   public void checkExtendedTableUX916( )
   {
      nIsDirty_916 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00UX12 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A8323VxHRComp = T00UX12_A8323VxHRComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
      }
      else
      {
         nIsDirty_916 = (short)(1) ;
         A8323VxHRComp = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
      }
      pr_default.close(9);
      /* Using cursor T00UX15 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n11686VxLotHRT), A11686VxLotHRT, Integer.valueOf(A6224VxLotId), Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {httpContext.getMessage( "Hoja de Ruta de Tejido", "")+","+httpContext.getMessage( "Nro Rollo", "")}), 1, "VXLOTHRT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotHRT_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(11);
      /* Using cursor T00UX6 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n6642VxLotTeLo), A6642VxLotTeLo});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Lotes de Tejeduría", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXLOTTELO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotTeLo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      /* Using cursor T00UX10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n7422VxLotACru), A7422VxLotACru});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A13211VxSTePml = T00UX10_A13211VxSTePml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
         A13295VxSteRdto = T00UX10_A13295VxSteRdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
      }
      else
      {
         nIsDirty_916 = (short)(1) ;
         A13295VxSteRdto = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
         nIsDirty_916 = (short)(1) ;
         A13211VxSTePml = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
      }
      pr_default.close(8);
      if ( A13211VxSTePml > 0 )
      {
         nIsDirty_916 = (short)(1) ;
         A13212VxSteMtspm = A6318VxLotCan.divide(DecimalUtil.doubleToDec(A13211VxSTePml), 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(1000)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrimstr( A13212VxSteMtspm, 9, 2));
      }
      else
      {
         nIsDirty_916 = (short)(1) ;
         A13212VxSteMtspm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrimstr( A13212VxSteMtspm, 9, 2));
      }
      /* Using cursor T00UX7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n7550VxRapCod), Integer.valueOf(A7550VxRapCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Rapports", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXRAPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxRapCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T00UX9 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A12248VxAlmCod)==0) || (GXutil.strcmp("", A12249VxAlmUbi)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacén / Ubicaciones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXALMUBI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAlmCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(7);
      /* Using cursor T00UX8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A12248VxAlmCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Estructura ALMACEN  en VERTEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAlmCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(6);
      if ( ! ( ( GXutil.strcmp(A13294VxSteUniMe, "L") == 0 ) || ( GXutil.strcmp(A13294VxSteUniMe, "P") == 0 ) || (GXutil.strcmp("", A13294VxSteUniMe)==0) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad de Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "VXSTEUNIME");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbVxSteUniMe.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsUX916( )
   {
      pr_default.close(9);
      pr_default.close(4);
      pr_default.close(8);
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_10( int A6224VxLotId )
   {
      /* Using cursor T00UX17 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A8323VxHRComp = T00UX17_A8323VxHRComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
      }
      else
      {
         A8323VxHRComp = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8323VxHRComp, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_5( String A6642VxLotTeLo )
   {
      /* Using cursor T00UX18 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n6642VxLotTeLo), A6642VxLotTeLo});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Lotes de Tejeduría", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXLOTTELO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotTeLo_Internalname ;
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

   public void gxload_9( String A7422VxLotACru )
   {
      /* Using cursor T00UX19 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n7422VxLotACru), A7422VxLotACru});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A13211VxSTePml = T00UX19_A13211VxSTePml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
         A13295VxSteRdto = T00UX19_A13295VxSteRdto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
      }
      else
      {
         A13295VxSteRdto = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
         A13211VxSTePml = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13211VxSTePml, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13295VxSteRdto, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_6( int A7550VxRapCod )
   {
      /* Using cursor T00UX20 */
      pr_default.execute(15, new Object[] {Boolean.valueOf(n7550VxRapCod), Integer.valueOf(A7550VxRapCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Rapports", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXRAPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxRapCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_8( String A12248VxAlmCod ,
                         String A12249VxAlmUbi )
   {
      /* Using cursor T00UX21 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A12248VxAlmCod)==0) || (GXutil.strcmp("", A12249VxAlmUbi)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacén / Ubicaciones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXALMUBI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAlmCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_7( String A12248VxAlmCod )
   {
      /* Using cursor T00UX22 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A12248VxAlmCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Estructura ALMACEN  en VERTEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAlmCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKeyUX916( )
   {
      /* Using cursor T00UX23 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound916 = (short)(1) ;
      }
      else
      {
         RcdFound916 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00UX5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmUX916( 3) ;
         RcdFound916 = (short)(1) ;
         A6224VxLotId = T00UX5_A6224VxLotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
         A6300VXLotSit = T00UX5_A6300VXLotSit[0] ;
         n6300VXLotSit = T00UX5_n6300VXLotSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6300VXLotSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6300VXLotSit), 2, 0));
         A12719VXLotSitF = T00UX5_A12719VXLotSitF[0] ;
         n12719VXLotSitF = T00UX5_n12719VXLotSitF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12719VXLotSitF", localUtil.ttoc( A12719VXLotSitF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6303VXLotAnu = T00UX5_A6303VXLotAnu[0] ;
         n6303VXLotAnu = T00UX5_n6303VXLotAnu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6303VXLotAnu", GXutil.str( A6303VXLotAnu, 1, 0));
         A6318VxLotCan = T00UX5_A6318VxLotCan[0] ;
         n6318VxLotCan = T00UX5_n6318VxLotCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6318VxLotCan", GXutil.ltrimstr( A6318VxLotCan, 9, 2));
         A6458VxLotCTe = T00UX5_A6458VxLotCTe[0] ;
         n6458VxLotCTe = T00UX5_n6458VxLotCTe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6458VxLotCTe", GXutil.ltrimstr( A6458VxLotCTe, 9, 2));
         A6459VxLotHRA = T00UX5_A6459VxLotHRA[0] ;
         n6459VxLotHRA = T00UX5_n6459VxLotHRA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6459VxLotHRA", A6459VxLotHRA);
         A11686VxLotHRT = T00UX5_A11686VxLotHRT[0] ;
         n11686VxLotHRT = T00UX5_n11686VxLotHRT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11686VxLotHRT", A11686VxLotHRT);
         A6640VxLotPrvC = T00UX5_A6640VxLotPrvC[0] ;
         n6640VxLotPrvC = T00UX5_n6640VxLotPrvC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6640VxLotPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6640VxLotPrvC), 6, 0));
         A6641VxLotDefPT = T00UX5_A6641VxLotDefPT[0] ;
         n6641VxLotDefPT = T00UX5_n6641VxLotDefPT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6641VxLotDefPT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6641VxLotDefPT), 4, 0));
         A6643VxLotMaqT = T00UX5_A6643VxLotMaqT[0] ;
         n6643VxLotMaqT = T00UX5_n6643VxLotMaqT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6643VxLotMaqT", A6643VxLotMaqT);
         A7422VxLotACru = T00UX5_A7422VxLotACru[0] ;
         n7422VxLotACru = T00UX5_n7422VxLotACru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7422VxLotACru", A7422VxLotACru);
         A7423VxLotCalC = T00UX5_A7423VxLotCalC[0] ;
         n7423VxLotCalC = T00UX5_n7423VxLotCalC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7423VxLotCalC", GXutil.str( A7423VxLotCalC, 1, 0));
         A8320VxAcParN = T00UX5_A8320VxAcParN[0] ;
         n8320VxAcParN = T00UX5_n8320VxAcParN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8320VxAcParN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8320VxAcParN), 8, 0));
         A8321VxArtTer = T00UX5_A8321VxArtTer[0] ;
         n8321VxArtTer = T00UX5_n8321VxArtTer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8321VxArtTer", A8321VxArtTer);
         A8322VxColCod = T00UX5_A8322VxColCod[0] ;
         n8322VxColCod = T00UX5_n8322VxColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8322VxColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8322VxColCod), 6, 0));
         A11209VxLotMts = T00UX5_A11209VxLotMts[0] ;
         n11209VxLotMts = T00UX5_n11209VxLotMts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11209VxLotMts", GXutil.ltrimstr( A11209VxLotMts, 12, 2));
         A13025VxLotMTe = T00UX5_A13025VxLotMTe[0] ;
         n13025VxLotMTe = T00UX5_n13025VxLotMTe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13025VxLotMTe", GXutil.ltrimstr( A13025VxLotMTe, 9, 2));
         A11305VxCodExt = T00UX5_A11305VxCodExt[0] ;
         n11305VxCodExt = T00UX5_n11305VxCodExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11305VxCodExt", A11305VxCodExt);
         A11775VxUsuTej = T00UX5_A11775VxUsuTej[0] ;
         n11775VxUsuTej = T00UX5_n11775VxUsuTej[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11775VxUsuTej", A11775VxUsuTej);
         A12251VxComCRCT = T00UX5_A12251VxComCRCT[0] ;
         n12251VxComCRCT = T00UX5_n12251VxComCRCT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12251VxComCRCT", A12251VxComCRCT);
         A12250VxComCRCC = T00UX5_A12250VxComCRCC[0] ;
         n12250VxComCRCC = T00UX5_n12250VxComCRCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12250VxComCRCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12250VxComCRCC), 8, 0));
         A12252VxSteCliDe = T00UX5_A12252VxSteCliDe[0] ;
         n12252VxSteCliDe = T00UX5_n12252VxSteCliDe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12252VxSteCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12252VxSteCliDe), 6, 0));
         A12253VxSteFecCr = T00UX5_A12253VxSteFecCr[0] ;
         n12253VxSteFecCr = T00UX5_n12253VxSteFecCr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12253VxSteFecCr", localUtil.format(A12253VxSteFecCr, "99/99/99"));
         A12375VxStePedNC = T00UX5_A12375VxStePedNC[0] ;
         n12375VxStePedNC = T00UX5_n12375VxStePedNC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12375VxStePedNC", A12375VxStePedNC);
         A12376VxSteDibCo = T00UX5_A12376VxSteDibCo[0] ;
         n12376VxSteDibCo = T00UX5_n12376VxSteDibCo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12376VxSteDibCo", A12376VxSteDibCo);
         A12377VxStePedLi = T00UX5_A12377VxStePedLi[0] ;
         n12377VxStePedLi = T00UX5_n12377VxStePedLi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12377VxStePedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12377VxStePedLi), 4, 0));
         A12749VxSteAct = T00UX5_A12749VxSteAct[0] ;
         n12749VxSteAct = T00UX5_n12749VxSteAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12749VxSteAct", GXutil.str( A12749VxSteAct, 1, 0));
         A12885VxSteFecFT = T00UX5_A12885VxSteFecFT[0] ;
         n12885VxSteFecFT = T00UX5_n12885VxSteFecFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12885VxSteFecFT", localUtil.ttoc( A12885VxSteFecFT, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A12896VxSteDev = T00UX5_A12896VxSteDev[0] ;
         n12896VxSteDev = T00UX5_n12896VxSteDev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12896VxSteDev", A12896VxSteDev);
         A12919VxSteRsv = T00UX5_A12919VxSteRsv[0] ;
         n12919VxSteRsv = T00UX5_n12919VxSteRsv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12919VxSteRsv", A12919VxSteRsv);
         A13115VxSTeTejRe = T00UX5_A13115VxSTeTejRe[0] ;
         n13115VxSTeTejRe = T00UX5_n13115VxSTeTejRe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13115VxSTeTejRe", A13115VxSTeTejRe);
         A13202VxSteIdMad = T00UX5_A13202VxSteIdMad[0] ;
         n13202VxSteIdMad = T00UX5_n13202VxSteIdMad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13202VxSteIdMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13202VxSteIdMad), 9, 0));
         A13294VxSteUniMe = T00UX5_A13294VxSteUniMe[0] ;
         n13294VxSteUniMe = T00UX5_n13294VxSteUniMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13294VxSteUniMe", A13294VxSteUniMe);
         A6642VxLotTeLo = T00UX5_A6642VxLotTeLo[0] ;
         n6642VxLotTeLo = T00UX5_n6642VxLotTeLo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6642VxLotTeLo", A6642VxLotTeLo);
         A7550VxRapCod = T00UX5_A7550VxRapCod[0] ;
         n7550VxRapCod = T00UX5_n7550VxRapCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7550VxRapCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7550VxRapCod), 6, 0));
         A12248VxAlmCod = T00UX5_A12248VxAlmCod[0] ;
         n12248VxAlmCod = T00UX5_n12248VxAlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
         A12249VxAlmUbi = T00UX5_A12249VxAlmUbi[0] ;
         n12249VxAlmUbi = T00UX5_n12249VxAlmUbi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12249VxAlmUbi", A12249VxAlmUbi);
         Z6224VxLotId = A6224VxLotId ;
         sMode916 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadUX916( ) ;
         if ( AnyError == 1 )
         {
            RcdFound916 = (short)(0) ;
            initializeNonKeyUX916( ) ;
         }
         Gx_mode = sMode916 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound916 = (short)(0) ;
         initializeNonKeyUX916( ) ;
         sMode916 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode916 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyUX916( ) ;
      if ( RcdFound916 == 0 )
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
      RcdFound916 = (short)(0) ;
      /* Using cursor T00UX24 */
      pr_default.execute(19, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( T00UX24_A6224VxLotId[0] < A6224VxLotId ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( T00UX24_A6224VxLotId[0] > A6224VxLotId ) ) )
         {
            A6224VxLotId = T00UX24_A6224VxLotId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
            RcdFound916 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound916 = (short)(0) ;
      /* Using cursor T00UX25 */
      pr_default.execute(20, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( T00UX25_A6224VxLotId[0] > A6224VxLotId ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( T00UX25_A6224VxLotId[0] < A6224VxLotId ) ) )
         {
            A6224VxLotId = T00UX25_A6224VxLotId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
            RcdFound916 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyUX916( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxLotId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertUX916( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound916 == 1 )
         {
            if ( A6224VxLotId != Z6224VxLotId )
            {
               A6224VxLotId = Z6224VxLotId ;
               httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXLOTID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxLotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxLotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateUX916( ) ;
               GX_FocusControl = edtVxLotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A6224VxLotId != Z6224VxLotId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxLotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertUX916( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXLOTID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxLotId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxLotId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertUX916( ) ;
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
      if ( A6224VxLotId != Z6224VxLotId )
      {
         A6224VxLotId = Z6224VxLotId ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXLOTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxLotId_Internalname ;
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
      getKeyUX916( ) ;
      if ( RcdFound916 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXLOTID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A6224VxLotId != Z6224VxLotId )
         {
            A6224VxLotId = Z6224VxLotId ;
            httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXLOTID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxLotId_Internalname ;
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
         if ( A6224VxLotId != Z6224VxLotId )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXLOTID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxLotId_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxroll");
      GX_FocusControl = edtVXLotSit_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_UX0( ) ;
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
      if ( RcdFound916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXLOTID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVXLotSit_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartUX916( ) ;
      if ( RcdFound916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVXLotSit_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndUX916( ) ;
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
      if ( RcdFound916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVXLotSit_Internalname ;
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
      if ( RcdFound916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVXLotSit_Internalname ;
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
      scanStartUX916( ) ;
      if ( RcdFound916 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound916 != 0 )
         {
            scanNextUX916( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVXLotSit_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndUX916( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyUX916( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00UX4 */
         pr_default.execute(2, new Object[] {Integer.valueOf(A6224VxLotId)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXSTKTE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( Z6300VXLotSit != T00UX4_A6300VXLotSit[0] ) || !( GXutil.dateCompare(Z12719VXLotSitF, T00UX4_A12719VXLotSitF[0]) ) || ( Z6303VXLotAnu != T00UX4_A6303VXLotAnu[0] ) || ( DecimalUtil.compareTo(Z6318VxLotCan, T00UX4_A6318VxLotCan[0]) != 0 ) || ( DecimalUtil.compareTo(Z6458VxLotCTe, T00UX4_A6458VxLotCTe[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6459VxLotHRA, T00UX4_A6459VxLotHRA[0]) != 0 ) || ( GXutil.strcmp(Z11686VxLotHRT, T00UX4_A11686VxLotHRT[0]) != 0 ) || ( Z6640VxLotPrvC != T00UX4_A6640VxLotPrvC[0] ) || ( Z6641VxLotDefPT != T00UX4_A6641VxLotDefPT[0] ) || ( GXutil.strcmp(Z6643VxLotMaqT, T00UX4_A6643VxLotMaqT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7422VxLotACru, T00UX4_A7422VxLotACru[0]) != 0 ) || ( Z7423VxLotCalC != T00UX4_A7423VxLotCalC[0] ) || ( Z8320VxAcParN != T00UX4_A8320VxAcParN[0] ) || ( GXutil.strcmp(Z8321VxArtTer, T00UX4_A8321VxArtTer[0]) != 0 ) || ( Z8322VxColCod != T00UX4_A8322VxColCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11209VxLotMts, T00UX4_A11209VxLotMts[0]) != 0 ) || ( DecimalUtil.compareTo(Z13025VxLotMTe, T00UX4_A13025VxLotMTe[0]) != 0 ) || ( GXutil.strcmp(Z11305VxCodExt, T00UX4_A11305VxCodExt[0]) != 0 ) || ( GXutil.strcmp(Z11775VxUsuTej, T00UX4_A11775VxUsuTej[0]) != 0 ) || ( GXutil.strcmp(Z12251VxComCRCT, T00UX4_A12251VxComCRCT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12250VxComCRCC != T00UX4_A12250VxComCRCC[0] ) || ( Z12252VxSteCliDe != T00UX4_A12252VxSteCliDe[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z12253VxSteFecCr), GXutil.resetTime(T00UX4_A12253VxSteFecCr[0])) ) || ( GXutil.strcmp(Z12375VxStePedNC, T00UX4_A12375VxStePedNC[0]) != 0 ) || ( GXutil.strcmp(Z12376VxSteDibCo, T00UX4_A12376VxSteDibCo[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12377VxStePedLi != T00UX4_A12377VxStePedLi[0] ) || ( Z12749VxSteAct != T00UX4_A12749VxSteAct[0] ) || !( GXutil.dateCompare(Z12885VxSteFecFT, T00UX4_A12885VxSteFecFT[0]) ) || ( GXutil.strcmp(Z12896VxSteDev, T00UX4_A12896VxSteDev[0]) != 0 ) || ( GXutil.strcmp(Z12919VxSteRsv, T00UX4_A12919VxSteRsv[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13115VxSTeTejRe, T00UX4_A13115VxSTeTejRe[0]) != 0 ) || ( Z13202VxSteIdMad != T00UX4_A13202VxSteIdMad[0] ) || ( GXutil.strcmp(Z13294VxSteUniMe, T00UX4_A13294VxSteUniMe[0]) != 0 ) || ( GXutil.strcmp(Z6642VxLotTeLo, T00UX4_A6642VxLotTeLo[0]) != 0 ) || ( Z7550VxRapCod != T00UX4_A7550VxRapCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12248VxAlmCod, T00UX4_A12248VxAlmCod[0]) != 0 ) || ( GXutil.strcmp(Z12249VxAlmUbi, T00UX4_A12249VxAlmUbi[0]) != 0 ) )
         {
            if ( Z6300VXLotSit != T00UX4_A6300VXLotSit[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VXLotSit");
               GXutil.writeLogRaw("Old: ",Z6300VXLotSit);
               GXutil.writeLogRaw("Current: ",T00UX4_A6300VXLotSit[0]);
            }
            if ( !( GXutil.dateCompare(Z12719VXLotSitF, T00UX4_A12719VXLotSitF[0]) ) )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VXLotSitF");
               GXutil.writeLogRaw("Old: ",Z12719VXLotSitF);
               GXutil.writeLogRaw("Current: ",T00UX4_A12719VXLotSitF[0]);
            }
            if ( Z6303VXLotAnu != T00UX4_A6303VXLotAnu[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VXLotAnu");
               GXutil.writeLogRaw("Old: ",Z6303VXLotAnu);
               GXutil.writeLogRaw("Current: ",T00UX4_A6303VXLotAnu[0]);
            }
            if ( DecimalUtil.compareTo(Z6318VxLotCan, T00UX4_A6318VxLotCan[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotCan");
               GXutil.writeLogRaw("Old: ",Z6318VxLotCan);
               GXutil.writeLogRaw("Current: ",T00UX4_A6318VxLotCan[0]);
            }
            if ( DecimalUtil.compareTo(Z6458VxLotCTe, T00UX4_A6458VxLotCTe[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotCTe");
               GXutil.writeLogRaw("Old: ",Z6458VxLotCTe);
               GXutil.writeLogRaw("Current: ",T00UX4_A6458VxLotCTe[0]);
            }
            if ( GXutil.strcmp(Z6459VxLotHRA, T00UX4_A6459VxLotHRA[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotHRA");
               GXutil.writeLogRaw("Old: ",Z6459VxLotHRA);
               GXutil.writeLogRaw("Current: ",T00UX4_A6459VxLotHRA[0]);
            }
            if ( GXutil.strcmp(Z11686VxLotHRT, T00UX4_A11686VxLotHRT[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotHRT");
               GXutil.writeLogRaw("Old: ",Z11686VxLotHRT);
               GXutil.writeLogRaw("Current: ",T00UX4_A11686VxLotHRT[0]);
            }
            if ( Z6640VxLotPrvC != T00UX4_A6640VxLotPrvC[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotPrvC");
               GXutil.writeLogRaw("Old: ",Z6640VxLotPrvC);
               GXutil.writeLogRaw("Current: ",T00UX4_A6640VxLotPrvC[0]);
            }
            if ( Z6641VxLotDefPT != T00UX4_A6641VxLotDefPT[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotDefPT");
               GXutil.writeLogRaw("Old: ",Z6641VxLotDefPT);
               GXutil.writeLogRaw("Current: ",T00UX4_A6641VxLotDefPT[0]);
            }
            if ( GXutil.strcmp(Z6643VxLotMaqT, T00UX4_A6643VxLotMaqT[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotMaqT");
               GXutil.writeLogRaw("Old: ",Z6643VxLotMaqT);
               GXutil.writeLogRaw("Current: ",T00UX4_A6643VxLotMaqT[0]);
            }
            if ( GXutil.strcmp(Z7422VxLotACru, T00UX4_A7422VxLotACru[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotACru");
               GXutil.writeLogRaw("Old: ",Z7422VxLotACru);
               GXutil.writeLogRaw("Current: ",T00UX4_A7422VxLotACru[0]);
            }
            if ( Z7423VxLotCalC != T00UX4_A7423VxLotCalC[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotCalC");
               GXutil.writeLogRaw("Old: ",Z7423VxLotCalC);
               GXutil.writeLogRaw("Current: ",T00UX4_A7423VxLotCalC[0]);
            }
            if ( Z8320VxAcParN != T00UX4_A8320VxAcParN[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxAcParN");
               GXutil.writeLogRaw("Old: ",Z8320VxAcParN);
               GXutil.writeLogRaw("Current: ",T00UX4_A8320VxAcParN[0]);
            }
            if ( GXutil.strcmp(Z8321VxArtTer, T00UX4_A8321VxArtTer[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxArtTer");
               GXutil.writeLogRaw("Old: ",Z8321VxArtTer);
               GXutil.writeLogRaw("Current: ",T00UX4_A8321VxArtTer[0]);
            }
            if ( Z8322VxColCod != T00UX4_A8322VxColCod[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxColCod");
               GXutil.writeLogRaw("Old: ",Z8322VxColCod);
               GXutil.writeLogRaw("Current: ",T00UX4_A8322VxColCod[0]);
            }
            if ( DecimalUtil.compareTo(Z11209VxLotMts, T00UX4_A11209VxLotMts[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotMts");
               GXutil.writeLogRaw("Old: ",Z11209VxLotMts);
               GXutil.writeLogRaw("Current: ",T00UX4_A11209VxLotMts[0]);
            }
            if ( DecimalUtil.compareTo(Z13025VxLotMTe, T00UX4_A13025VxLotMTe[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotMTe");
               GXutil.writeLogRaw("Old: ",Z13025VxLotMTe);
               GXutil.writeLogRaw("Current: ",T00UX4_A13025VxLotMTe[0]);
            }
            if ( GXutil.strcmp(Z11305VxCodExt, T00UX4_A11305VxCodExt[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxCodExt");
               GXutil.writeLogRaw("Old: ",Z11305VxCodExt);
               GXutil.writeLogRaw("Current: ",T00UX4_A11305VxCodExt[0]);
            }
            if ( GXutil.strcmp(Z11775VxUsuTej, T00UX4_A11775VxUsuTej[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxUsuTej");
               GXutil.writeLogRaw("Old: ",Z11775VxUsuTej);
               GXutil.writeLogRaw("Current: ",T00UX4_A11775VxUsuTej[0]);
            }
            if ( GXutil.strcmp(Z12251VxComCRCT, T00UX4_A12251VxComCRCT[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxComCRCT");
               GXutil.writeLogRaw("Old: ",Z12251VxComCRCT);
               GXutil.writeLogRaw("Current: ",T00UX4_A12251VxComCRCT[0]);
            }
            if ( Z12250VxComCRCC != T00UX4_A12250VxComCRCC[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxComCRCC");
               GXutil.writeLogRaw("Old: ",Z12250VxComCRCC);
               GXutil.writeLogRaw("Current: ",T00UX4_A12250VxComCRCC[0]);
            }
            if ( Z12252VxSteCliDe != T00UX4_A12252VxSteCliDe[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteCliDe");
               GXutil.writeLogRaw("Old: ",Z12252VxSteCliDe);
               GXutil.writeLogRaw("Current: ",T00UX4_A12252VxSteCliDe[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12253VxSteFecCr), GXutil.resetTime(T00UX4_A12253VxSteFecCr[0])) ) )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteFecCr");
               GXutil.writeLogRaw("Old: ",Z12253VxSteFecCr);
               GXutil.writeLogRaw("Current: ",T00UX4_A12253VxSteFecCr[0]);
            }
            if ( GXutil.strcmp(Z12375VxStePedNC, T00UX4_A12375VxStePedNC[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStePedNC");
               GXutil.writeLogRaw("Old: ",Z12375VxStePedNC);
               GXutil.writeLogRaw("Current: ",T00UX4_A12375VxStePedNC[0]);
            }
            if ( GXutil.strcmp(Z12376VxSteDibCo, T00UX4_A12376VxSteDibCo[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteDibCo");
               GXutil.writeLogRaw("Old: ",Z12376VxSteDibCo);
               GXutil.writeLogRaw("Current: ",T00UX4_A12376VxSteDibCo[0]);
            }
            if ( Z12377VxStePedLi != T00UX4_A12377VxStePedLi[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStePedLi");
               GXutil.writeLogRaw("Old: ",Z12377VxStePedLi);
               GXutil.writeLogRaw("Current: ",T00UX4_A12377VxStePedLi[0]);
            }
            if ( Z12749VxSteAct != T00UX4_A12749VxSteAct[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteAct");
               GXutil.writeLogRaw("Old: ",Z12749VxSteAct);
               GXutil.writeLogRaw("Current: ",T00UX4_A12749VxSteAct[0]);
            }
            if ( !( GXutil.dateCompare(Z12885VxSteFecFT, T00UX4_A12885VxSteFecFT[0]) ) )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteFecFT");
               GXutil.writeLogRaw("Old: ",Z12885VxSteFecFT);
               GXutil.writeLogRaw("Current: ",T00UX4_A12885VxSteFecFT[0]);
            }
            if ( GXutil.strcmp(Z12896VxSteDev, T00UX4_A12896VxSteDev[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteDev");
               GXutil.writeLogRaw("Old: ",Z12896VxSteDev);
               GXutil.writeLogRaw("Current: ",T00UX4_A12896VxSteDev[0]);
            }
            if ( GXutil.strcmp(Z12919VxSteRsv, T00UX4_A12919VxSteRsv[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteRsv");
               GXutil.writeLogRaw("Old: ",Z12919VxSteRsv);
               GXutil.writeLogRaw("Current: ",T00UX4_A12919VxSteRsv[0]);
            }
            if ( GXutil.strcmp(Z13115VxSTeTejRe, T00UX4_A13115VxSTeTejRe[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSTeTejRe");
               GXutil.writeLogRaw("Old: ",Z13115VxSTeTejRe);
               GXutil.writeLogRaw("Current: ",T00UX4_A13115VxSTeTejRe[0]);
            }
            if ( Z13202VxSteIdMad != T00UX4_A13202VxSteIdMad[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteIdMad");
               GXutil.writeLogRaw("Old: ",Z13202VxSteIdMad);
               GXutil.writeLogRaw("Current: ",T00UX4_A13202VxSteIdMad[0]);
            }
            if ( GXutil.strcmp(Z13294VxSteUniMe, T00UX4_A13294VxSteUniMe[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxSteUniMe");
               GXutil.writeLogRaw("Old: ",Z13294VxSteUniMe);
               GXutil.writeLogRaw("Current: ",T00UX4_A13294VxSteUniMe[0]);
            }
            if ( GXutil.strcmp(Z6642VxLotTeLo, T00UX4_A6642VxLotTeLo[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxLotTeLo");
               GXutil.writeLogRaw("Old: ",Z6642VxLotTeLo);
               GXutil.writeLogRaw("Current: ",T00UX4_A6642VxLotTeLo[0]);
            }
            if ( Z7550VxRapCod != T00UX4_A7550VxRapCod[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxRapCod");
               GXutil.writeLogRaw("Old: ",Z7550VxRapCod);
               GXutil.writeLogRaw("Current: ",T00UX4_A7550VxRapCod[0]);
            }
            if ( GXutil.strcmp(Z12248VxAlmCod, T00UX4_A12248VxAlmCod[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxAlmCod");
               GXutil.writeLogRaw("Old: ",Z12248VxAlmCod);
               GXutil.writeLogRaw("Current: ",T00UX4_A12248VxAlmCod[0]);
            }
            if ( GXutil.strcmp(Z12249VxAlmUbi, T00UX4_A12249VxAlmUbi[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxAlmUbi");
               GXutil.writeLogRaw("Old: ",Z12249VxAlmUbi);
               GXutil.writeLogRaw("Current: ",T00UX4_A12249VxAlmUbi[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXSTKTE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertUX916( )
   {
      beforeValidateUX916( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUX916( ) ;
      }
      if ( AnyError == 0 )
      {
         zmUX916( 0) ;
         checkOptimisticConcurrencyUX916( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUX916( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertUX916( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UX26 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A6224VxLotId), Boolean.valueOf(n6300VXLotSit), Byte.valueOf(A6300VXLotSit), Boolean.valueOf(n12719VXLotSitF), A12719VXLotSitF, Boolean.valueOf(n6303VXLotAnu), Byte.valueOf(A6303VXLotAnu), Boolean.valueOf(n6318VxLotCan), A6318VxLotCan, Boolean.valueOf(n6458VxLotCTe), A6458VxLotCTe, Boolean.valueOf(n6459VxLotHRA), A6459VxLotHRA, Boolean.valueOf(n11686VxLotHRT), A11686VxLotHRT, Boolean.valueOf(n6640VxLotPrvC), Integer.valueOf(A6640VxLotPrvC), Boolean.valueOf(n6641VxLotDefPT), Short.valueOf(A6641VxLotDefPT), Boolean.valueOf(n6643VxLotMaqT), A6643VxLotMaqT, Boolean.valueOf(n7422VxLotACru), A7422VxLotACru, Boolean.valueOf(n7423VxLotCalC), Byte.valueOf(A7423VxLotCalC), Boolean.valueOf(n8320VxAcParN), Integer.valueOf(A8320VxAcParN), Boolean.valueOf(n8321VxArtTer), A8321VxArtTer, Boolean.valueOf(n8322VxColCod), Integer.valueOf(A8322VxColCod), Boolean.valueOf(n11209VxLotMts), A11209VxLotMts, Boolean.valueOf(n13025VxLotMTe), A13025VxLotMTe, Boolean.valueOf(n11305VxCodExt), A11305VxCodExt, Boolean.valueOf(n11775VxUsuTej), A11775VxUsuTej, Boolean.valueOf(n12251VxComCRCT), A12251VxComCRCT, Boolean.valueOf(n12250VxComCRCC), Integer.valueOf(A12250VxComCRCC), Boolean.valueOf(n12252VxSteCliDe), Integer.valueOf(A12252VxSteCliDe), Boolean.valueOf(n12253VxSteFecCr), A12253VxSteFecCr, Boolean.valueOf(n12375VxStePedNC), A12375VxStePedNC, Boolean.valueOf(n12376VxSteDibCo), A12376VxSteDibCo, Boolean.valueOf(n12377VxStePedLi), Short.valueOf(A12377VxStePedLi), Boolean.valueOf(n12749VxSteAct), Byte.valueOf(A12749VxSteAct), Boolean.valueOf(n12885VxSteFecFT), A12885VxSteFecFT, Boolean.valueOf(n12896VxSteDev), A12896VxSteDev, Boolean.valueOf(n12919VxSteRsv), A12919VxSteRsv, Boolean.valueOf(n13115VxSTeTejRe), A13115VxSTeTejRe, Boolean.valueOf(n13202VxSteIdMad), Integer.valueOf(A13202VxSteIdMad), Boolean.valueOf(n13294VxSteUniMe), A13294VxSteUniMe, Boolean.valueOf(n6642VxLotTeLo), A6642VxLotTeLo, Boolean.valueOf(n7550VxRapCod), Integer.valueOf(A7550VxRapCod), Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKTE");
                  if ( (pr_default.getStatus(21) == 1) )
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
                        processLevelUX916( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionUX0( ) ;
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
            loadUX916( ) ;
         }
         endLevelUX916( ) ;
      }
      closeExtendedTableCursorsUX916( ) ;
   }

   public void updateUX916( )
   {
      beforeValidateUX916( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUX916( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUX916( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUX916( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateUX916( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UX27 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n6300VXLotSit), Byte.valueOf(A6300VXLotSit), Boolean.valueOf(n12719VXLotSitF), A12719VXLotSitF, Boolean.valueOf(n6303VXLotAnu), Byte.valueOf(A6303VXLotAnu), Boolean.valueOf(n6318VxLotCan), A6318VxLotCan, Boolean.valueOf(n6458VxLotCTe), A6458VxLotCTe, Boolean.valueOf(n6459VxLotHRA), A6459VxLotHRA, Boolean.valueOf(n11686VxLotHRT), A11686VxLotHRT, Boolean.valueOf(n6640VxLotPrvC), Integer.valueOf(A6640VxLotPrvC), Boolean.valueOf(n6641VxLotDefPT), Short.valueOf(A6641VxLotDefPT), Boolean.valueOf(n6643VxLotMaqT), A6643VxLotMaqT, Boolean.valueOf(n7422VxLotACru), A7422VxLotACru, Boolean.valueOf(n7423VxLotCalC), Byte.valueOf(A7423VxLotCalC), Boolean.valueOf(n8320VxAcParN), Integer.valueOf(A8320VxAcParN), Boolean.valueOf(n8321VxArtTer), A8321VxArtTer, Boolean.valueOf(n8322VxColCod), Integer.valueOf(A8322VxColCod), Boolean.valueOf(n11209VxLotMts), A11209VxLotMts, Boolean.valueOf(n13025VxLotMTe), A13025VxLotMTe, Boolean.valueOf(n11305VxCodExt), A11305VxCodExt, Boolean.valueOf(n11775VxUsuTej), A11775VxUsuTej, Boolean.valueOf(n12251VxComCRCT), A12251VxComCRCT, Boolean.valueOf(n12250VxComCRCC), Integer.valueOf(A12250VxComCRCC), Boolean.valueOf(n12252VxSteCliDe), Integer.valueOf(A12252VxSteCliDe), Boolean.valueOf(n12253VxSteFecCr), A12253VxSteFecCr, Boolean.valueOf(n12375VxStePedNC), A12375VxStePedNC, Boolean.valueOf(n12376VxSteDibCo), A12376VxSteDibCo, Boolean.valueOf(n12377VxStePedLi), Short.valueOf(A12377VxStePedLi), Boolean.valueOf(n12749VxSteAct), Byte.valueOf(A12749VxSteAct), Boolean.valueOf(n12885VxSteFecFT), A12885VxSteFecFT, Boolean.valueOf(n12896VxSteDev), A12896VxSteDev, Boolean.valueOf(n12919VxSteRsv), A12919VxSteRsv, Boolean.valueOf(n13115VxSTeTejRe), A13115VxSTeTejRe, Boolean.valueOf(n13202VxSteIdMad), Integer.valueOf(A13202VxSteIdMad), Boolean.valueOf(n13294VxSteUniMe), A13294VxSteUniMe, Boolean.valueOf(n6642VxLotTeLo), A6642VxLotTeLo, Boolean.valueOf(n7550VxRapCod), Integer.valueOf(A7550VxRapCod), Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi, Integer.valueOf(A6224VxLotId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKTE");
                  if ( (pr_default.getStatus(22) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXSTKTE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateUX916( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelUX916( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionUX0( ) ;
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
         endLevelUX916( ) ;
      }
      closeExtendedTableCursorsUX916( ) ;
   }

   public void deferredUpdateUX916( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateUX916( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUX916( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsUX916( ) ;
         afterConfirmUX916( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteUX916( ) ;
            if ( AnyError == 0 )
            {
               scanStartUX1750( ) ;
               while ( RcdFound1750 != 0 )
               {
                  getByPrimaryKeyUX1750( ) ;
                  deleteUX1750( ) ;
                  scanNextUX1750( ) ;
               }
               scanEndUX1750( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UX28 */
                  pr_default.execute(23, new Object[] {Integer.valueOf(A6224VxLotId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKTE");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound916 == 0 )
                        {
                           initAllUX916( ) ;
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
                        resetCaptionUX0( ) ;
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
      sMode916 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelUX916( ) ;
      Gx_mode = sMode916 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsUX916( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00UX30 */
         pr_default.execute(24, new Object[] {Integer.valueOf(A6224VxLotId)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A8323VxHRComp = T00UX30_A8323VxHRComp[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
         }
         else
         {
            A8323VxHRComp = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
         }
         pr_default.close(24);
         /* Using cursor T00UX31 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n7422VxLotACru), A7422VxLotACru});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A13211VxSTePml = T00UX31_A13211VxSTePml[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
            A13295VxSteRdto = T00UX31_A13295VxSteRdto[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
         }
         else
         {
            A13295VxSteRdto = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
            A13211VxSTePml = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
         }
         pr_default.close(25);
         if ( A13211VxSTePml > 0 )
         {
            A13212VxSteMtspm = A6318VxLotCan.divide(DecimalUtil.doubleToDec(A13211VxSTePml), 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(1000)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrimstr( A13212VxSteMtspm, 9, 2));
         }
         else
         {
            A13212VxSteMtspm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrimstr( A13212VxSteMtspm, 9, 2));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00UX32 */
         pr_default.execute(26, new Object[] {Integer.valueOf(A6224VxLotId)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Vertex - OSERPI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00UX33 */
         pr_default.execute(27, new Object[] {Integer.valueOf(A6224VxLotId)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Vertex - Rollos en HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevelUX1750( )
   {
      nGXsfl_230_idx = 0 ;
      while ( nGXsfl_230_idx < nRC_GXsfl_230 )
      {
         readRowUX1750( ) ;
         if ( ( nRcdExists_1750 != 0 ) || ( nIsMod_1750 != 0 ) )
         {
            standaloneNotModalUX1750( ) ;
            getKeyUX1750( ) ;
            if ( ( nRcdExists_1750 == 0 ) && ( nRcdDeleted_1750 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertUX1750( ) ;
            }
            else
            {
               if ( RcdFound1750 != 0 )
               {
                  if ( ( nRcdDeleted_1750 != 0 ) && ( nRcdExists_1750 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteUX1750( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1750 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateUX1750( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1750 == 0 )
                  {
                     GXCCtl = "VXSTMFEC_" + sGXsfl_230_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxStMFec_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1750_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxStMFec_Internalname, localUtil.ttoc( A12730VxStMFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtVxStMTMov_Internalname, GXutil.rtrim( A12720VxStMTMov)) ;
         httpContext.changePostValue( edtVxStMAlmCo_Internalname, GXutil.rtrim( A12721VxStMAlmCo)) ;
         httpContext.changePostValue( edtVxStMSit_Internalname, GXutil.ltrim( localUtil.ntoc( A12722VxStMSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxStMaux_Internalname, GXutil.rtrim( A12723VxStMaux)) ;
         httpContext.changePostValue( edtVxStUsuCod_Internalname, GXutil.rtrim( A12724VxStUsuCod)) ;
         httpContext.changePostValue( edtVxStWrkStn_Internalname, GXutil.rtrim( A12725VxStWrkStn)) ;
         httpContext.changePostValue( edtVxStMAlmOr_Internalname, GXutil.rtrim( A12726VxStMAlmOr)) ;
         httpContext.changePostValue( edtVxStMSitOr_Internalname, GXutil.ltrim( localUtil.ntoc( A12727VxStMSitOr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxStMCan_Internalname, GXutil.ltrim( localUtil.ntoc( A12728VxStMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxStMCanOr_Internalname, GXutil.ltrim( localUtil.ntoc( A12729VxStMCanOr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12730VxStMFec_"+sGXsfl_230_idx, localUtil.ttoc( Z12730VxStMFec, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z12720VxStMTMov_"+sGXsfl_230_idx, GXutil.rtrim( Z12720VxStMTMov)) ;
         httpContext.changePostValue( "ZT_"+"Z12721VxStMAlmCo_"+sGXsfl_230_idx, GXutil.rtrim( Z12721VxStMAlmCo)) ;
         httpContext.changePostValue( "ZT_"+"Z12722VxStMSit_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( Z12722VxStMSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12723VxStMaux_"+sGXsfl_230_idx, GXutil.rtrim( Z12723VxStMaux)) ;
         httpContext.changePostValue( "ZT_"+"Z12724VxStUsuCod_"+sGXsfl_230_idx, GXutil.rtrim( Z12724VxStUsuCod)) ;
         httpContext.changePostValue( "ZT_"+"Z12725VxStWrkStn_"+sGXsfl_230_idx, GXutil.rtrim( Z12725VxStWrkStn)) ;
         httpContext.changePostValue( "ZT_"+"Z12726VxStMAlmOr_"+sGXsfl_230_idx, GXutil.rtrim( Z12726VxStMAlmOr)) ;
         httpContext.changePostValue( "ZT_"+"Z12727VxStMSitOr_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( Z12727VxStMSitOr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12728VxStMCan_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( Z12728VxStMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12729VxStMCanOr_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( Z12729VxStMCanOr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1750_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1750_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1750_"+sGXsfl_230_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1750 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1750_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1750_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMFEC_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMTMOV_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMTMov_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMALMCO_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMAlmCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMSIT_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMSit_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMAUX_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMaux_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTUSUCOD_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStUsuCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTWRKSTN_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStWrkStn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMALMOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMAlmOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMSITOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMSitOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMCAN_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXSTMCANOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMCanOr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllUX1750( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1750 = (short)(0) ;
      nIsMod_1750 = (short)(0) ;
      nRcdDeleted_1750 = (short)(0) ;
   }

   public void processLevelUX916( )
   {
      /* Save parent mode. */
      sMode916 = Gx_mode ;
      processNestedLevelUX1750( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode916 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelUX916( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteUX916( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxroll");
         if ( AnyError == 0 )
         {
            confirmValuesUX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxroll");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartUX916( )
   {
      /* Using cursor T00UX34 */
      pr_default.execute(28);
      RcdFound916 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound916 = (short)(1) ;
         A6224VxLotId = T00UX34_A6224VxLotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextUX916( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound916 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound916 = (short)(1) ;
         A6224VxLotId = T00UX34_A6224VxLotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
      }
   }

   public void scanEndUX916( )
   {
      pr_default.close(28);
   }

   public void afterConfirmUX916( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertUX916( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateUX916( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteUX916( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteUX916( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateUX916( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesUX916( )
   {
      edtVxLotId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotId_Enabled), 5, 0), true);
      edtVXLotSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXLotSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXLotSit_Enabled), 5, 0), true);
      edtVXLotSitF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXLotSitF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXLotSitF_Enabled), 5, 0), true);
      edtVXLotAnu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVXLotAnu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVXLotAnu_Enabled), 5, 0), true);
      edtVxLotCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotCan_Enabled), 5, 0), true);
      edtVxLotCTe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotCTe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotCTe_Enabled), 5, 0), true);
      edtVxLotHRA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotHRA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotHRA_Enabled), 5, 0), true);
      edtVxLotHRT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotHRT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotHRT_Enabled), 5, 0), true);
      edtVxLotPrvC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotPrvC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotPrvC_Enabled), 5, 0), true);
      edtVxLotDefPT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotDefPT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotDefPT_Enabled), 5, 0), true);
      edtVxLotTeLo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotTeLo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotTeLo_Enabled), 5, 0), true);
      edtVxLotMaqT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotMaqT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotMaqT_Enabled), 5, 0), true);
      edtVxLotACru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotACru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotACru_Enabled), 5, 0), true);
      edtVxLotCalC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotCalC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotCalC_Enabled), 5, 0), true);
      edtVxRapCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxRapCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxRapCod_Enabled), 5, 0), true);
      edtVxAcParN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxAcParN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAcParN_Enabled), 5, 0), true);
      edtVxArtTer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxArtTer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxArtTer_Enabled), 5, 0), true);
      edtVxColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxColCod_Enabled), 5, 0), true);
      edtVxHRComp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxHRComp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxHRComp_Enabled), 5, 0), true);
      edtVxLotMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotMts_Enabled), 5, 0), true);
      edtVxLotMTe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxLotMTe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxLotMTe_Enabled), 5, 0), true);
      edtVxCodExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxCodExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxCodExt_Enabled), 5, 0), true);
      edtVxUsuTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxUsuTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxUsuTej_Enabled), 5, 0), true);
      edtVxAlmUbi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxAlmUbi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmUbi_Enabled), 5, 0), true);
      edtVxAlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxAlmCod_Enabled), 5, 0), true);
      edtVxComCRCT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxComCRCT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxComCRCT_Enabled), 5, 0), true);
      edtVxComCRCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxComCRCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxComCRCC_Enabled), 5, 0), true);
      edtVxSteCliDe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteCliDe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteCliDe_Enabled), 5, 0), true);
      edtVxSteFecCr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteFecCr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteFecCr_Enabled), 5, 0), true);
      edtVxStePedNC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStePedNC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStePedNC_Enabled), 5, 0), true);
      edtVxSteDibCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteDibCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteDibCo_Enabled), 5, 0), true);
      edtVxStePedLi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStePedLi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStePedLi_Enabled), 5, 0), true);
      edtVxSteAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteAct_Enabled), 5, 0), true);
      edtVxSteFecFT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteFecFT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteFecFT_Enabled), 5, 0), true);
      edtVxSteDev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteDev_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteDev_Enabled), 5, 0), true);
      edtVxSteRsv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteRsv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteRsv_Enabled), 5, 0), true);
      edtVxSTeTejRe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSTeTejRe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSTeTejRe_Enabled), 5, 0), true);
      edtVxSteIdMad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteIdMad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteIdMad_Enabled), 5, 0), true);
      edtVxSTePml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSTePml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSTePml_Enabled), 5, 0), true);
      edtVxSteMtspm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteMtspm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteMtspm_Enabled), 5, 0), true);
      cmbVxSteUniMe.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbVxSteUniMe.getInternalname(), "Enabled", GXutil.ltrimstr( cmbVxSteUniMe.getEnabled(), 5, 0), true);
      edtVxSteRdto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxSteRdto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxSteRdto_Enabled), 5, 0), true);
   }

   public void zmUX1750( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12720VxStMTMov = T00UX3_A12720VxStMTMov[0] ;
            Z12721VxStMAlmCo = T00UX3_A12721VxStMAlmCo[0] ;
            Z12722VxStMSit = T00UX3_A12722VxStMSit[0] ;
            Z12723VxStMaux = T00UX3_A12723VxStMaux[0] ;
            Z12724VxStUsuCod = T00UX3_A12724VxStUsuCod[0] ;
            Z12725VxStWrkStn = T00UX3_A12725VxStWrkStn[0] ;
            Z12726VxStMAlmOr = T00UX3_A12726VxStMAlmOr[0] ;
            Z12727VxStMSitOr = T00UX3_A12727VxStMSitOr[0] ;
            Z12728VxStMCan = T00UX3_A12728VxStMCan[0] ;
            Z12729VxStMCanOr = T00UX3_A12729VxStMCanOr[0] ;
         }
         else
         {
            Z12720VxStMTMov = A12720VxStMTMov ;
            Z12721VxStMAlmCo = A12721VxStMAlmCo ;
            Z12722VxStMSit = A12722VxStMSit ;
            Z12723VxStMaux = A12723VxStMaux ;
            Z12724VxStUsuCod = A12724VxStUsuCod ;
            Z12725VxStWrkStn = A12725VxStWrkStn ;
            Z12726VxStMAlmOr = A12726VxStMAlmOr ;
            Z12727VxStMSitOr = A12727VxStMSitOr ;
            Z12728VxStMCan = A12728VxStMCan ;
            Z12729VxStMCanOr = A12729VxStMCanOr ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z6224VxLotId = A6224VxLotId ;
         Z12730VxStMFec = A12730VxStMFec ;
         Z12720VxStMTMov = A12720VxStMTMov ;
         Z12721VxStMAlmCo = A12721VxStMAlmCo ;
         Z12722VxStMSit = A12722VxStMSit ;
         Z12723VxStMaux = A12723VxStMaux ;
         Z12724VxStUsuCod = A12724VxStUsuCod ;
         Z12725VxStWrkStn = A12725VxStWrkStn ;
         Z12726VxStMAlmOr = A12726VxStMAlmOr ;
         Z12727VxStMSitOr = A12727VxStMSitOr ;
         Z12728VxStMCan = A12728VxStMCan ;
         Z12729VxStMCanOr = A12729VxStMCanOr ;
      }
   }

   public void standaloneNotModalUX1750( )
   {
   }

   public void standaloneModalUX1750( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtVxStMFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxStMFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMFec_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      }
      else
      {
         edtVxStMFec_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxStMFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMFec_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      }
   }

   public void loadUX1750( )
   {
      /* Using cursor T00UX35 */
      pr_default.execute(29, new Object[] {Integer.valueOf(A6224VxLotId), A12730VxStMFec});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound1750 = (short)(1) ;
         A12720VxStMTMov = T00UX35_A12720VxStMTMov[0] ;
         n12720VxStMTMov = T00UX35_n12720VxStMTMov[0] ;
         A12721VxStMAlmCo = T00UX35_A12721VxStMAlmCo[0] ;
         n12721VxStMAlmCo = T00UX35_n12721VxStMAlmCo[0] ;
         A12722VxStMSit = T00UX35_A12722VxStMSit[0] ;
         n12722VxStMSit = T00UX35_n12722VxStMSit[0] ;
         A12723VxStMaux = T00UX35_A12723VxStMaux[0] ;
         n12723VxStMaux = T00UX35_n12723VxStMaux[0] ;
         A12724VxStUsuCod = T00UX35_A12724VxStUsuCod[0] ;
         n12724VxStUsuCod = T00UX35_n12724VxStUsuCod[0] ;
         A12725VxStWrkStn = T00UX35_A12725VxStWrkStn[0] ;
         n12725VxStWrkStn = T00UX35_n12725VxStWrkStn[0] ;
         A12726VxStMAlmOr = T00UX35_A12726VxStMAlmOr[0] ;
         n12726VxStMAlmOr = T00UX35_n12726VxStMAlmOr[0] ;
         A12727VxStMSitOr = T00UX35_A12727VxStMSitOr[0] ;
         n12727VxStMSitOr = T00UX35_n12727VxStMSitOr[0] ;
         A12728VxStMCan = T00UX35_A12728VxStMCan[0] ;
         n12728VxStMCan = T00UX35_n12728VxStMCan[0] ;
         A12729VxStMCanOr = T00UX35_A12729VxStMCanOr[0] ;
         n12729VxStMCanOr = T00UX35_n12729VxStMCanOr[0] ;
         zmUX1750( -11) ;
      }
      pr_default.close(29);
      onLoadActionsUX1750( ) ;
   }

   public void onLoadActionsUX1750( )
   {
   }

   public void checkExtendedTableUX1750( )
   {
      nIsDirty_1750 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalUX1750( ) ;
   }

   public void closeExtendedTableCursorsUX1750( )
   {
   }

   public void enableDisableUX1750( )
   {
   }

   public void getKeyUX1750( )
   {
      /* Using cursor T00UX36 */
      pr_default.execute(30, new Object[] {Integer.valueOf(A6224VxLotId), A12730VxStMFec});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1750 = (short)(1) ;
      }
      else
      {
         RcdFound1750 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKeyUX1750( )
   {
      /* Using cursor T00UX3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(A6224VxLotId), A12730VxStMFec});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmUX1750( 11) ;
         RcdFound1750 = (short)(1) ;
         initializeNonKeyUX1750( ) ;
         A12730VxStMFec = T00UX3_A12730VxStMFec[0] ;
         A12720VxStMTMov = T00UX3_A12720VxStMTMov[0] ;
         n12720VxStMTMov = T00UX3_n12720VxStMTMov[0] ;
         A12721VxStMAlmCo = T00UX3_A12721VxStMAlmCo[0] ;
         n12721VxStMAlmCo = T00UX3_n12721VxStMAlmCo[0] ;
         A12722VxStMSit = T00UX3_A12722VxStMSit[0] ;
         n12722VxStMSit = T00UX3_n12722VxStMSit[0] ;
         A12723VxStMaux = T00UX3_A12723VxStMaux[0] ;
         n12723VxStMaux = T00UX3_n12723VxStMaux[0] ;
         A12724VxStUsuCod = T00UX3_A12724VxStUsuCod[0] ;
         n12724VxStUsuCod = T00UX3_n12724VxStUsuCod[0] ;
         A12725VxStWrkStn = T00UX3_A12725VxStWrkStn[0] ;
         n12725VxStWrkStn = T00UX3_n12725VxStWrkStn[0] ;
         A12726VxStMAlmOr = T00UX3_A12726VxStMAlmOr[0] ;
         n12726VxStMAlmOr = T00UX3_n12726VxStMAlmOr[0] ;
         A12727VxStMSitOr = T00UX3_A12727VxStMSitOr[0] ;
         n12727VxStMSitOr = T00UX3_n12727VxStMSitOr[0] ;
         A12728VxStMCan = T00UX3_A12728VxStMCan[0] ;
         n12728VxStMCan = T00UX3_n12728VxStMCan[0] ;
         A12729VxStMCanOr = T00UX3_A12729VxStMCanOr[0] ;
         n12729VxStMCanOr = T00UX3_n12729VxStMCanOr[0] ;
         Z6224VxLotId = A6224VxLotId ;
         Z12730VxStMFec = A12730VxStMFec ;
         sMode1750 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalUX1750( ) ;
         loadUX1750( ) ;
         Gx_mode = sMode1750 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1750 = (short)(0) ;
         initializeNonKeyUX1750( ) ;
         sMode1750 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalUX1750( ) ;
         Gx_mode = sMode1750 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesUX1750( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyUX1750( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00UX2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(A6224VxLotId), A12730VxStMFec});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXSTKTEMOV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12720VxStMTMov, T00UX2_A12720VxStMTMov[0]) != 0 ) || ( GXutil.strcmp(Z12721VxStMAlmCo, T00UX2_A12721VxStMAlmCo[0]) != 0 ) || ( Z12722VxStMSit != T00UX2_A12722VxStMSit[0] ) || ( GXutil.strcmp(Z12723VxStMaux, T00UX2_A12723VxStMaux[0]) != 0 ) || ( GXutil.strcmp(Z12724VxStUsuCod, T00UX2_A12724VxStUsuCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12725VxStWrkStn, T00UX2_A12725VxStWrkStn[0]) != 0 ) || ( GXutil.strcmp(Z12726VxStMAlmOr, T00UX2_A12726VxStMAlmOr[0]) != 0 ) || ( Z12727VxStMSitOr != T00UX2_A12727VxStMSitOr[0] ) || ( DecimalUtil.compareTo(Z12728VxStMCan, T00UX2_A12728VxStMCan[0]) != 0 ) || ( DecimalUtil.compareTo(Z12729VxStMCanOr, T00UX2_A12729VxStMCanOr[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12720VxStMTMov, T00UX2_A12720VxStMTMov[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStMTMov");
               GXutil.writeLogRaw("Old: ",Z12720VxStMTMov);
               GXutil.writeLogRaw("Current: ",T00UX2_A12720VxStMTMov[0]);
            }
            if ( GXutil.strcmp(Z12721VxStMAlmCo, T00UX2_A12721VxStMAlmCo[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStMAlmCo");
               GXutil.writeLogRaw("Old: ",Z12721VxStMAlmCo);
               GXutil.writeLogRaw("Current: ",T00UX2_A12721VxStMAlmCo[0]);
            }
            if ( Z12722VxStMSit != T00UX2_A12722VxStMSit[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStMSit");
               GXutil.writeLogRaw("Old: ",Z12722VxStMSit);
               GXutil.writeLogRaw("Current: ",T00UX2_A12722VxStMSit[0]);
            }
            if ( GXutil.strcmp(Z12723VxStMaux, T00UX2_A12723VxStMaux[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStMaux");
               GXutil.writeLogRaw("Old: ",Z12723VxStMaux);
               GXutil.writeLogRaw("Current: ",T00UX2_A12723VxStMaux[0]);
            }
            if ( GXutil.strcmp(Z12724VxStUsuCod, T00UX2_A12724VxStUsuCod[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStUsuCod");
               GXutil.writeLogRaw("Old: ",Z12724VxStUsuCod);
               GXutil.writeLogRaw("Current: ",T00UX2_A12724VxStUsuCod[0]);
            }
            if ( GXutil.strcmp(Z12725VxStWrkStn, T00UX2_A12725VxStWrkStn[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStWrkStn");
               GXutil.writeLogRaw("Old: ",Z12725VxStWrkStn);
               GXutil.writeLogRaw("Current: ",T00UX2_A12725VxStWrkStn[0]);
            }
            if ( GXutil.strcmp(Z12726VxStMAlmOr, T00UX2_A12726VxStMAlmOr[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStMAlmOr");
               GXutil.writeLogRaw("Old: ",Z12726VxStMAlmOr);
               GXutil.writeLogRaw("Current: ",T00UX2_A12726VxStMAlmOr[0]);
            }
            if ( Z12727VxStMSitOr != T00UX2_A12727VxStMSitOr[0] )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStMSitOr");
               GXutil.writeLogRaw("Old: ",Z12727VxStMSitOr);
               GXutil.writeLogRaw("Current: ",T00UX2_A12727VxStMSitOr[0]);
            }
            if ( DecimalUtil.compareTo(Z12728VxStMCan, T00UX2_A12728VxStMCan[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStMCan");
               GXutil.writeLogRaw("Old: ",Z12728VxStMCan);
               GXutil.writeLogRaw("Current: ",T00UX2_A12728VxStMCan[0]);
            }
            if ( DecimalUtil.compareTo(Z12729VxStMCanOr, T00UX2_A12729VxStMCanOr[0]) != 0 )
            {
               GXutil.writeLogln("tvxroll:[seudo value changed for attri]"+"VxStMCanOr");
               GXutil.writeLogRaw("Old: ",Z12729VxStMCanOr);
               GXutil.writeLogRaw("Current: ",T00UX2_A12729VxStMCanOr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXSTKTEMOV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertUX1750( )
   {
      beforeValidateUX1750( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUX1750( ) ;
      }
      if ( AnyError == 0 )
      {
         zmUX1750( 0) ;
         checkOptimisticConcurrencyUX1750( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmUX1750( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertUX1750( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00UX37 */
                  pr_default.execute(31, new Object[] {Integer.valueOf(A6224VxLotId), A12730VxStMFec, Boolean.valueOf(n12720VxStMTMov), A12720VxStMTMov, Boolean.valueOf(n12721VxStMAlmCo), A12721VxStMAlmCo, Boolean.valueOf(n12722VxStMSit), Byte.valueOf(A12722VxStMSit), Boolean.valueOf(n12723VxStMaux), A12723VxStMaux, Boolean.valueOf(n12724VxStUsuCod), A12724VxStUsuCod, Boolean.valueOf(n12725VxStWrkStn), A12725VxStWrkStn, Boolean.valueOf(n12726VxStMAlmOr), A12726VxStMAlmOr, Boolean.valueOf(n12727VxStMSitOr), Short.valueOf(A12727VxStMSitOr), Boolean.valueOf(n12728VxStMCan), A12728VxStMCan, Boolean.valueOf(n12729VxStMCanOr), A12729VxStMCanOr});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKTEMOV");
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
            loadUX1750( ) ;
         }
         endLevelUX1750( ) ;
      }
      closeExtendedTableCursorsUX1750( ) ;
   }

   public void updateUX1750( )
   {
      beforeValidateUX1750( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableUX1750( ) ;
      }
      if ( ( nIsMod_1750 != 0 ) || ( nIsDirty_1750 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyUX1750( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmUX1750( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateUX1750( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00UX38 */
                     pr_default.execute(32, new Object[] {Boolean.valueOf(n12720VxStMTMov), A12720VxStMTMov, Boolean.valueOf(n12721VxStMAlmCo), A12721VxStMAlmCo, Boolean.valueOf(n12722VxStMSit), Byte.valueOf(A12722VxStMSit), Boolean.valueOf(n12723VxStMaux), A12723VxStMaux, Boolean.valueOf(n12724VxStUsuCod), A12724VxStUsuCod, Boolean.valueOf(n12725VxStWrkStn), A12725VxStWrkStn, Boolean.valueOf(n12726VxStMAlmOr), A12726VxStMAlmOr, Boolean.valueOf(n12727VxStMSitOr), Short.valueOf(A12727VxStMSitOr), Boolean.valueOf(n12728VxStMCan), A12728VxStMCan, Boolean.valueOf(n12729VxStMCanOr), A12729VxStMCanOr, Integer.valueOf(A6224VxLotId), A12730VxStMFec});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKTEMOV");
                     if ( (pr_default.getStatus(32) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXSTKTEMOV"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateUX1750( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyUX1750( ) ;
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
            endLevelUX1750( ) ;
         }
      }
      closeExtendedTableCursorsUX1750( ) ;
   }

   public void deferredUpdateUX1750( )
   {
   }

   public void deleteUX1750( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateUX1750( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyUX1750( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsUX1750( ) ;
         afterConfirmUX1750( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteUX1750( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00UX39 */
               pr_default.execute(33, new Object[] {Integer.valueOf(A6224VxLotId), A12730VxStMFec});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKTEMOV");
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
      sMode1750 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelUX1750( ) ;
      Gx_mode = sMode1750 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsUX1750( )
   {
      standaloneModalUX1750( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelUX1750( )
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

   public void scanStartUX1750( )
   {
      /* Scan By routine */
      /* Using cursor T00UX40 */
      pr_default.execute(34, new Object[] {Integer.valueOf(A6224VxLotId)});
      RcdFound1750 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1750 = (short)(1) ;
         A12730VxStMFec = T00UX40_A12730VxStMFec[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextUX1750( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound1750 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1750 = (short)(1) ;
         A12730VxStMFec = T00UX40_A12730VxStMFec[0] ;
      }
   }

   public void scanEndUX1750( )
   {
      pr_default.close(34);
   }

   public void afterConfirmUX1750( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertUX1750( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateUX1750( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteUX1750( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteUX1750( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateUX1750( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesUX1750( )
   {
      edtVxStMFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMFec_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStMTMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMTMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMTMov_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStMAlmCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMAlmCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMAlmCo_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStMSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMSit_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStMaux_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMaux_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMaux_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStUsuCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStUsuCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStUsuCod_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStWrkStn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStWrkStn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStWrkStn_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStMAlmOr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMAlmOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMAlmOr_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStMSitOr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMSitOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMSitOr_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStMCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMCan_Enabled), 5, 0), !bGXsfl_230_Refreshing);
      edtVxStMCanOr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMCanOr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMCanOr_Enabled), 5, 0), !bGXsfl_230_Refreshing);
   }

   public void send_integrity_lvl_hashesUX1750( )
   {
   }

   public void send_integrity_lvl_hashesUX916( )
   {
   }

   public void subsflControlProps_2301750( )
   {
      edtavnRcdDeleted_1750_Internalname = "vNRCDDELETED_1750_"+sGXsfl_230_idx ;
      edtVxStMFec_Internalname = "VXSTMFEC_"+sGXsfl_230_idx ;
      edtVxStMTMov_Internalname = "VXSTMTMOV_"+sGXsfl_230_idx ;
      edtVxStMAlmCo_Internalname = "VXSTMALMCO_"+sGXsfl_230_idx ;
      edtVxStMSit_Internalname = "VXSTMSIT_"+sGXsfl_230_idx ;
      edtVxStMaux_Internalname = "VXSTMAUX_"+sGXsfl_230_idx ;
      edtVxStUsuCod_Internalname = "VXSTUSUCOD_"+sGXsfl_230_idx ;
      edtVxStWrkStn_Internalname = "VXSTWRKSTN_"+sGXsfl_230_idx ;
      edtVxStMAlmOr_Internalname = "VXSTMALMOR_"+sGXsfl_230_idx ;
      edtVxStMSitOr_Internalname = "VXSTMSITOR_"+sGXsfl_230_idx ;
      edtVxStMCan_Internalname = "VXSTMCAN_"+sGXsfl_230_idx ;
      edtVxStMCanOr_Internalname = "VXSTMCANOR_"+sGXsfl_230_idx ;
   }

   public void subsflControlProps_fel_2301750( )
   {
      edtavnRcdDeleted_1750_Internalname = "vNRCDDELETED_1750_"+sGXsfl_230_fel_idx ;
      edtVxStMFec_Internalname = "VXSTMFEC_"+sGXsfl_230_fel_idx ;
      edtVxStMTMov_Internalname = "VXSTMTMOV_"+sGXsfl_230_fel_idx ;
      edtVxStMAlmCo_Internalname = "VXSTMALMCO_"+sGXsfl_230_fel_idx ;
      edtVxStMSit_Internalname = "VXSTMSIT_"+sGXsfl_230_fel_idx ;
      edtVxStMaux_Internalname = "VXSTMAUX_"+sGXsfl_230_fel_idx ;
      edtVxStUsuCod_Internalname = "VXSTUSUCOD_"+sGXsfl_230_fel_idx ;
      edtVxStWrkStn_Internalname = "VXSTWRKSTN_"+sGXsfl_230_fel_idx ;
      edtVxStMAlmOr_Internalname = "VXSTMALMOR_"+sGXsfl_230_fel_idx ;
      edtVxStMSitOr_Internalname = "VXSTMSITOR_"+sGXsfl_230_fel_idx ;
      edtVxStMCan_Internalname = "VXSTMCAN_"+sGXsfl_230_fel_idx ;
      edtVxStMCanOr_Internalname = "VXSTMCANOR_"+sGXsfl_230_fel_idx ;
   }

   public void addRowUX1750( )
   {
      nGXsfl_230_idx = (int)(nGXsfl_230_idx+1) ;
      sGXsfl_230_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_230_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2301750( ) ;
      sendRowUX1750( ) ;
   }

   public void sendRowUX1750( )
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
         if ( ((int)((nGXsfl_230_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 231,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1750_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1750_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1750), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1750), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,231);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1750_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1750_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMFec_Internalname,localUtil.ttoc( A12730VxStMFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A12730VxStMFec, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,232);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMFec_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 233,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMTMov_Internalname,GXutil.rtrim( A12720VxStMTMov),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,233);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMTMov_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMTMov_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 234,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMAlmCo_Internalname,GXutil.rtrim( A12721VxStMAlmCo),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMAlmCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMAlmCo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMSit_Internalname,GXutil.ltrim( localUtil.ntoc( A12722VxStMSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxStMSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12722VxStMSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A12722VxStMSit), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,235);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMSit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 236,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMaux_Internalname,GXutil.rtrim( A12723VxStMaux),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,236);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMaux_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMaux_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 237,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStUsuCod_Internalname,GXutil.rtrim( A12724VxStUsuCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,237);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStUsuCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStUsuCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 238,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStWrkStn_Internalname,GXutil.rtrim( A12725VxStWrkStn),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,238);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStWrkStn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStWrkStn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 239,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMAlmOr_Internalname,GXutil.rtrim( A12726VxStMAlmOr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,239);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMAlmOr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMAlmOr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 240,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMSitOr_Internalname,GXutil.ltrim( localUtil.ntoc( A12727VxStMSitOr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxStMSitOr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12727VxStMSitOr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12727VxStMSitOr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,240);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMSitOr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMSitOr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 241,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMCan_Internalname,GXutil.ltrim( localUtil.ntoc( A12728VxStMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxStMCan_Enabled!=0) ? localUtil.format( A12728VxStMCan, "ZZZZZ9.99") : localUtil.format( A12728VxStMCan, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,241);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1750_" + sGXsfl_230_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 242,'',false,'" + sGXsfl_230_idx + "',230)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxStMCanOr_Internalname,GXutil.ltrim( localUtil.ntoc( A12729VxStMCanOr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVxStMCanOr_Enabled!=0) ? localUtil.format( A12729VxStMCanOr, "ZZZZZ9.99") : localUtil.format( A12729VxStMCanOr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,242);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxStMCanOr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxStMCanOr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(230),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesUX1750( ) ;
      GXCCtl = "Z12730VxStMFec_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z12730VxStMFec, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z12720VxStMTMov_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12720VxStMTMov));
      GXCCtl = "Z12721VxStMAlmCo_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12721VxStMAlmCo));
      GXCCtl = "Z12722VxStMSit_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12722VxStMSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12723VxStMaux_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12723VxStMaux));
      GXCCtl = "Z12724VxStUsuCod_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12724VxStUsuCod));
      GXCCtl = "Z12725VxStWrkStn_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12725VxStWrkStn));
      GXCCtl = "Z12726VxStMAlmOr_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12726VxStMAlmOr));
      GXCCtl = "Z12727VxStMSitOr_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12727VxStMSitOr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12728VxStMCan_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12728VxStMCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12729VxStMCanOr_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12729VxStMCanOr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1750_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1750_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1750_" + sGXsfl_230_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1750, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1750_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1750_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMFEC_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMTMOV_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMTMov_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMALMCO_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMAlmCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMSIT_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMAUX_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMaux_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTUSUCOD_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStUsuCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTWRKSTN_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStWrkStn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMALMOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMAlmOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMSITOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMSitOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMCAN_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXSTMCANOR_"+sGXsfl_230_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMCanOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowUX1750( )
   {
      nGXsfl_230_idx = (int)(nGXsfl_230_idx+1) ;
      sGXsfl_230_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_230_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2301750( ) ;
      edtavnRcdDeleted_1750_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1750_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMFEC_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMTMov_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMTMOV_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMAlmCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMALMCO_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMSit_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMSIT_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMaux_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMAUX_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStUsuCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTUSUCOD_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStWrkStn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTWRKSTN_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMAlmOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMALMOR_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMSitOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMSITOR_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMCAN_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxStMCanOr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXSTMCANOR_"+sGXsfl_230_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1750_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1750_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1750");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1750_Internalname ;
         wbErr = true ;
         nRcdDeleted_1750 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1750 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1750_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtVxStMFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "VXSTMFEC_" + sGXsfl_230_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxStMFec_Internalname ;
         wbErr = true ;
         A12730VxStMFec = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A12730VxStMFec = localUtil.ctot( httpContext.cgiGet( edtVxStMFec_Internalname)) ;
      }
      A12720VxStMTMov = httpContext.cgiGet( edtVxStMTMov_Internalname) ;
      n12720VxStMTMov = false ;
      A12721VxStMAlmCo = httpContext.cgiGet( edtVxStMAlmCo_Internalname) ;
      n12721VxStMAlmCo = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "VXSTMSIT_" + sGXsfl_230_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxStMSit_Internalname ;
         wbErr = true ;
         A12722VxStMSit = (byte)(0) ;
         n12722VxStMSit = false ;
      }
      else
      {
         A12722VxStMSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtVxStMSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12722VxStMSit = false ;
      }
      A12723VxStMaux = httpContext.cgiGet( edtVxStMaux_Internalname) ;
      n12723VxStMaux = false ;
      A12724VxStUsuCod = httpContext.cgiGet( edtVxStUsuCod_Internalname) ;
      n12724VxStUsuCod = false ;
      A12725VxStWrkStn = httpContext.cgiGet( edtVxStWrkStn_Internalname) ;
      n12725VxStWrkStn = false ;
      A12726VxStMAlmOr = httpContext.cgiGet( edtVxStMAlmOr_Internalname) ;
      n12726VxStMAlmOr = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMSitOr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMSitOr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "VXSTMSITOR_" + sGXsfl_230_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxStMSitOr_Internalname ;
         wbErr = true ;
         A12727VxStMSitOr = (short)(0) ;
         n12727VxStMSitOr = false ;
      }
      else
      {
         A12727VxStMSitOr = (short)(localUtil.ctol( httpContext.cgiGet( edtVxStMSitOr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12727VxStMSitOr = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxStMCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxStMCan_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "VXSTMCAN_" + sGXsfl_230_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxStMCan_Internalname ;
         wbErr = true ;
         A12728VxStMCan = DecimalUtil.ZERO ;
         n12728VxStMCan = false ;
      }
      else
      {
         A12728VxStMCan = localUtil.ctond( httpContext.cgiGet( edtVxStMCan_Internalname)) ;
         n12728VxStMCan = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVxStMCanOr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVxStMCanOr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "VXSTMCANOR_" + sGXsfl_230_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxStMCanOr_Internalname ;
         wbErr = true ;
         A12729VxStMCanOr = DecimalUtil.ZERO ;
         n12729VxStMCanOr = false ;
      }
      else
      {
         A12729VxStMCanOr = localUtil.ctond( httpContext.cgiGet( edtVxStMCanOr_Internalname)) ;
         n12729VxStMCanOr = false ;
      }
      GXCCtl = "Z12730VxStMFec_" + sGXsfl_230_idx ;
      Z12730VxStMFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12720VxStMTMov_" + sGXsfl_230_idx ;
      Z12720VxStMTMov = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12721VxStMAlmCo_" + sGXsfl_230_idx ;
      Z12721VxStMAlmCo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12722VxStMSit_" + sGXsfl_230_idx ;
      Z12722VxStMSit = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12723VxStMaux_" + sGXsfl_230_idx ;
      Z12723VxStMaux = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12724VxStUsuCod_" + sGXsfl_230_idx ;
      Z12724VxStUsuCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12725VxStWrkStn_" + sGXsfl_230_idx ;
      Z12725VxStWrkStn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12726VxStMAlmOr_" + sGXsfl_230_idx ;
      Z12726VxStMAlmOr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12727VxStMSitOr_" + sGXsfl_230_idx ;
      Z12727VxStMSitOr = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12728VxStMCan_" + sGXsfl_230_idx ;
      Z12728VxStMCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12729VxStMCanOr_" + sGXsfl_230_idx ;
      Z12729VxStMCanOr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1750_" + sGXsfl_230_idx ;
      nRcdDeleted_1750 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1750_" + sGXsfl_230_idx ;
      nRcdExists_1750 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1750_" + sGXsfl_230_idx ;
      nIsMod_1750 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtVxStMFec_Enabled = edtVxStMFec_Enabled ;
   }

   public void confirmValuesUX0( )
   {
      nGXsfl_230_idx = 0 ;
      sGXsfl_230_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_230_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2301750( ) ;
      while ( nGXsfl_230_idx < nRC_GXsfl_230 )
      {
         nGXsfl_230_idx = (int)(nGXsfl_230_idx+1) ;
         sGXsfl_230_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_230_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2301750( ) ;
         httpContext.changePostValue( "Z12730VxStMFec_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12730VxStMFec_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12730VxStMFec_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12720VxStMTMov_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12720VxStMTMov_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12720VxStMTMov_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12721VxStMAlmCo_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12721VxStMAlmCo_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12721VxStMAlmCo_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12722VxStMSit_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12722VxStMSit_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12722VxStMSit_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12723VxStMaux_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12723VxStMaux_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12723VxStMaux_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12724VxStUsuCod_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12724VxStUsuCod_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12724VxStUsuCod_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12725VxStWrkStn_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12725VxStWrkStn_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12725VxStWrkStn_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12726VxStMAlmOr_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12726VxStMAlmOr_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12726VxStMAlmOr_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12727VxStMSitOr_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12727VxStMSitOr_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12727VxStMSitOr_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12728VxStMCan_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12728VxStMCan_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12728VxStMCan_"+sGXsfl_230_idx) ;
         httpContext.changePostValue( "Z12729VxStMCanOr_"+sGXsfl_230_idx, httpContext.cgiGet( "ZT_"+"Z12729VxStMCanOr_"+sGXsfl_230_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12729VxStMCanOr_"+sGXsfl_230_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxroll", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6224VxLotId", GXutil.ltrim( localUtil.ntoc( Z6224VxLotId, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6300VXLotSit", GXutil.ltrim( localUtil.ntoc( Z6300VXLotSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12719VXLotSitF", localUtil.ttoc( Z12719VXLotSitF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6303VXLotAnu", GXutil.ltrim( localUtil.ntoc( Z6303VXLotAnu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6318VxLotCan", GXutil.ltrim( localUtil.ntoc( Z6318VxLotCan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6458VxLotCTe", GXutil.ltrim( localUtil.ntoc( Z6458VxLotCTe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6459VxLotHRA", GXutil.rtrim( Z6459VxLotHRA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11686VxLotHRT", GXutil.rtrim( Z11686VxLotHRT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6640VxLotPrvC", GXutil.ltrim( localUtil.ntoc( Z6640VxLotPrvC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6641VxLotDefPT", GXutil.ltrim( localUtil.ntoc( Z6641VxLotDefPT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6643VxLotMaqT", GXutil.rtrim( Z6643VxLotMaqT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7422VxLotACru", GXutil.rtrim( Z7422VxLotACru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7423VxLotCalC", GXutil.ltrim( localUtil.ntoc( Z7423VxLotCalC, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8320VxAcParN", GXutil.ltrim( localUtil.ntoc( Z8320VxAcParN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8321VxArtTer", GXutil.rtrim( Z8321VxArtTer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8322VxColCod", GXutil.ltrim( localUtil.ntoc( Z8322VxColCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11209VxLotMts", GXutil.ltrim( localUtil.ntoc( Z11209VxLotMts, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13025VxLotMTe", GXutil.ltrim( localUtil.ntoc( Z13025VxLotMTe, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11305VxCodExt", GXutil.rtrim( Z11305VxCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11775VxUsuTej", GXutil.rtrim( Z11775VxUsuTej));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12251VxComCRCT", GXutil.rtrim( Z12251VxComCRCT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12250VxComCRCC", GXutil.ltrim( localUtil.ntoc( Z12250VxComCRCC, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12252VxSteCliDe", GXutil.ltrim( localUtil.ntoc( Z12252VxSteCliDe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12253VxSteFecCr", localUtil.dtoc( Z12253VxSteFecCr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12375VxStePedNC", GXutil.rtrim( Z12375VxStePedNC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12376VxSteDibCo", GXutil.rtrim( Z12376VxSteDibCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12377VxStePedLi", GXutil.ltrim( localUtil.ntoc( Z12377VxStePedLi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12749VxSteAct", GXutil.ltrim( localUtil.ntoc( Z12749VxSteAct, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12885VxSteFecFT", localUtil.ttoc( Z12885VxSteFecFT, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12896VxSteDev", GXutil.rtrim( Z12896VxSteDev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12919VxSteRsv", GXutil.rtrim( Z12919VxSteRsv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13115VxSTeTejRe", GXutil.rtrim( Z13115VxSTeTejRe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13202VxSteIdMad", GXutil.ltrim( localUtil.ntoc( Z13202VxSteIdMad, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13294VxSteUniMe", GXutil.rtrim( Z13294VxSteUniMe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6642VxLotTeLo", GXutil.rtrim( Z6642VxLotTeLo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7550VxRapCod", GXutil.ltrim( localUtil.ntoc( Z7550VxRapCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12248VxAlmCod", GXutil.rtrim( Z12248VxAlmCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12249VxAlmUbi", GXutil.rtrim( Z12249VxAlmUbi));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_230", GXutil.ltrim( localUtil.ntoc( nGXsfl_230_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvxroll", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVXRoll" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla STKTE/STKTEMOV en Vertex", "") ;
   }

   public void initializeNonKeyUX916( )
   {
      A13211VxSTePml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13211VxSTePml), 4, 0));
      A13295VxSteRdto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrimstr( A13295VxSteRdto, 5, 2));
      A13212VxSteMtspm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrimstr( A13212VxSteMtspm, 9, 2));
      A6300VXLotSit = (byte)(0) ;
      n6300VXLotSit = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6300VXLotSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6300VXLotSit), 2, 0));
      A12719VXLotSitF = GXutil.resetTime( GXutil.nullDate() );
      n12719VXLotSitF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12719VXLotSitF", localUtil.ttoc( A12719VXLotSitF, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6303VXLotAnu = (byte)(0) ;
      n6303VXLotAnu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6303VXLotAnu", GXutil.str( A6303VXLotAnu, 1, 0));
      A6318VxLotCan = DecimalUtil.ZERO ;
      n6318VxLotCan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6318VxLotCan", GXutil.ltrimstr( A6318VxLotCan, 9, 2));
      A6458VxLotCTe = DecimalUtil.ZERO ;
      n6458VxLotCTe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6458VxLotCTe", GXutil.ltrimstr( A6458VxLotCTe, 9, 2));
      A6459VxLotHRA = "" ;
      n6459VxLotHRA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6459VxLotHRA", A6459VxLotHRA);
      A11686VxLotHRT = "" ;
      n11686VxLotHRT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11686VxLotHRT", A11686VxLotHRT);
      A6640VxLotPrvC = 0 ;
      n6640VxLotPrvC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6640VxLotPrvC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6640VxLotPrvC), 6, 0));
      A6641VxLotDefPT = (short)(0) ;
      n6641VxLotDefPT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6641VxLotDefPT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6641VxLotDefPT), 4, 0));
      A6642VxLotTeLo = "" ;
      n6642VxLotTeLo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6642VxLotTeLo", A6642VxLotTeLo);
      A6643VxLotMaqT = "" ;
      n6643VxLotMaqT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6643VxLotMaqT", A6643VxLotMaqT);
      A7422VxLotACru = "" ;
      n7422VxLotACru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7422VxLotACru", A7422VxLotACru);
      A7423VxLotCalC = (byte)(0) ;
      n7423VxLotCalC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7423VxLotCalC", GXutil.str( A7423VxLotCalC, 1, 0));
      A7550VxRapCod = 0 ;
      n7550VxRapCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7550VxRapCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7550VxRapCod), 6, 0));
      A8320VxAcParN = 0 ;
      n8320VxAcParN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8320VxAcParN", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8320VxAcParN), 8, 0));
      A8321VxArtTer = "" ;
      n8321VxArtTer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8321VxArtTer", A8321VxArtTer);
      A8322VxColCod = 0 ;
      n8322VxColCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8322VxColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8322VxColCod), 6, 0));
      A8323VxHRComp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8323VxHRComp), 2, 0));
      A11209VxLotMts = DecimalUtil.ZERO ;
      n11209VxLotMts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11209VxLotMts", GXutil.ltrimstr( A11209VxLotMts, 12, 2));
      A13025VxLotMTe = DecimalUtil.ZERO ;
      n13025VxLotMTe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13025VxLotMTe", GXutil.ltrimstr( A13025VxLotMTe, 9, 2));
      A11305VxCodExt = "" ;
      n11305VxCodExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11305VxCodExt", A11305VxCodExt);
      A11775VxUsuTej = "" ;
      n11775VxUsuTej = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11775VxUsuTej", A11775VxUsuTej);
      A12249VxAlmUbi = "" ;
      n12249VxAlmUbi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12249VxAlmUbi", A12249VxAlmUbi);
      A12248VxAlmCod = "" ;
      n12248VxAlmCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", A12248VxAlmCod);
      A12251VxComCRCT = "" ;
      n12251VxComCRCT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12251VxComCRCT", A12251VxComCRCT);
      A12250VxComCRCC = 0 ;
      n12250VxComCRCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12250VxComCRCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12250VxComCRCC), 8, 0));
      A12252VxSteCliDe = 0 ;
      n12252VxSteCliDe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12252VxSteCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12252VxSteCliDe), 6, 0));
      A12253VxSteFecCr = GXutil.nullDate() ;
      n12253VxSteFecCr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12253VxSteFecCr", localUtil.format(A12253VxSteFecCr, "99/99/99"));
      A12375VxStePedNC = "" ;
      n12375VxStePedNC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12375VxStePedNC", A12375VxStePedNC);
      A12376VxSteDibCo = "" ;
      n12376VxSteDibCo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12376VxSteDibCo", A12376VxSteDibCo);
      A12377VxStePedLi = (short)(0) ;
      n12377VxStePedLi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12377VxStePedLi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12377VxStePedLi), 4, 0));
      A12749VxSteAct = (byte)(0) ;
      n12749VxSteAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12749VxSteAct", GXutil.str( A12749VxSteAct, 1, 0));
      A12885VxSteFecFT = GXutil.resetTime( GXutil.nullDate() );
      n12885VxSteFecFT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12885VxSteFecFT", localUtil.ttoc( A12885VxSteFecFT, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12896VxSteDev = "" ;
      n12896VxSteDev = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12896VxSteDev", A12896VxSteDev);
      A12919VxSteRsv = "" ;
      n12919VxSteRsv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12919VxSteRsv", A12919VxSteRsv);
      A13115VxSTeTejRe = "" ;
      n13115VxSTeTejRe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13115VxSTeTejRe", A13115VxSTeTejRe);
      A13202VxSteIdMad = 0 ;
      n13202VxSteIdMad = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13202VxSteIdMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13202VxSteIdMad), 9, 0));
      A13294VxSteUniMe = "" ;
      n13294VxSteUniMe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13294VxSteUniMe", A13294VxSteUniMe);
      Z6300VXLotSit = (byte)(0) ;
      Z12719VXLotSitF = GXutil.resetTime( GXutil.nullDate() );
      Z6303VXLotAnu = (byte)(0) ;
      Z6318VxLotCan = DecimalUtil.ZERO ;
      Z6458VxLotCTe = DecimalUtil.ZERO ;
      Z6459VxLotHRA = "" ;
      Z11686VxLotHRT = "" ;
      Z6640VxLotPrvC = 0 ;
      Z6641VxLotDefPT = (short)(0) ;
      Z6643VxLotMaqT = "" ;
      Z7422VxLotACru = "" ;
      Z7423VxLotCalC = (byte)(0) ;
      Z8320VxAcParN = 0 ;
      Z8321VxArtTer = "" ;
      Z8322VxColCod = 0 ;
      Z11209VxLotMts = DecimalUtil.ZERO ;
      Z13025VxLotMTe = DecimalUtil.ZERO ;
      Z11305VxCodExt = "" ;
      Z11775VxUsuTej = "" ;
      Z12251VxComCRCT = "" ;
      Z12250VxComCRCC = 0 ;
      Z12252VxSteCliDe = 0 ;
      Z12253VxSteFecCr = GXutil.nullDate() ;
      Z12375VxStePedNC = "" ;
      Z12376VxSteDibCo = "" ;
      Z12377VxStePedLi = (short)(0) ;
      Z12749VxSteAct = (byte)(0) ;
      Z12885VxSteFecFT = GXutil.resetTime( GXutil.nullDate() );
      Z12896VxSteDev = "" ;
      Z12919VxSteRsv = "" ;
      Z13115VxSTeTejRe = "" ;
      Z13202VxSteIdMad = 0 ;
      Z13294VxSteUniMe = "" ;
      Z6642VxLotTeLo = "" ;
      Z7550VxRapCod = 0 ;
      Z12248VxAlmCod = "" ;
      Z12249VxAlmUbi = "" ;
   }

   public void initAllUX916( )
   {
      A6224VxLotId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6224VxLotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6224VxLotId), 9, 0));
      initializeNonKeyUX916( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyUX1750( )
   {
      A12720VxStMTMov = "" ;
      n12720VxStMTMov = false ;
      A12721VxStMAlmCo = "" ;
      n12721VxStMAlmCo = false ;
      A12722VxStMSit = (byte)(0) ;
      n12722VxStMSit = false ;
      A12723VxStMaux = "" ;
      n12723VxStMaux = false ;
      A12724VxStUsuCod = "" ;
      n12724VxStUsuCod = false ;
      A12725VxStWrkStn = "" ;
      n12725VxStWrkStn = false ;
      A12726VxStMAlmOr = "" ;
      n12726VxStMAlmOr = false ;
      A12727VxStMSitOr = (short)(0) ;
      n12727VxStMSitOr = false ;
      A12728VxStMCan = DecimalUtil.ZERO ;
      n12728VxStMCan = false ;
      A12729VxStMCanOr = DecimalUtil.ZERO ;
      n12729VxStMCanOr = false ;
      Z12720VxStMTMov = "" ;
      Z12721VxStMAlmCo = "" ;
      Z12722VxStMSit = (byte)(0) ;
      Z12723VxStMaux = "" ;
      Z12724VxStUsuCod = "" ;
      Z12725VxStWrkStn = "" ;
      Z12726VxStMAlmOr = "" ;
      Z12727VxStMSitOr = (short)(0) ;
      Z12728VxStMCan = DecimalUtil.ZERO ;
      Z12729VxStMCanOr = DecimalUtil.ZERO ;
   }

   public void initAllUX1750( )
   {
      A12730VxStMFec = GXutil.resetTime( GXutil.nullDate() );
      initializeNonKeyUX1750( ) ;
   }

   public void standaloneModalInsertUX1750( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202612518592796", true, true);
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
      httpContext.AddJavascriptSource("tvxroll.js", "?202612518592796", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1750( )
   {
      edtVxStMFec_Enabled = defedtVxStMFec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMFec_Enabled), 5, 0), !bGXsfl_230_Refreshing);
   }

   public void startgridcontrol230( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1750, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1750_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A12730VxStMFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12720VxStMTMov));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMTMov_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12721VxStMAlmCo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMAlmCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12722VxStMSit, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMSit_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12723VxStMaux));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMaux_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12724VxStUsuCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStUsuCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12725VxStWrkStn));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStWrkStn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12726VxStMAlmOr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMAlmOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12727VxStMSitOr, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMSitOr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12728VxStMCan, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12729VxStMCanOr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxStMCanOr_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtVxLotId_Internalname = "VXLOTID" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVXLotSit_Internalname = "VXLOTSIT" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVXLotSitF_Internalname = "VXLOTSITF" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVXLotAnu_Internalname = "VXLOTANU" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxLotCan_Internalname = "VXLOTCAN" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVxLotCTe_Internalname = "VXLOTCTE" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtVxLotHRA_Internalname = "VXLOTHRA" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtVxLotHRT_Internalname = "VXLOTHRT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtVxLotPrvC_Internalname = "VXLOTPRVC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtVxLotDefPT_Internalname = "VXLOTDEFPT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtVxLotTeLo_Internalname = "VXLOTTELO" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtVxLotMaqT_Internalname = "VXLOTMAQT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtVxLotACru_Internalname = "VXLOTACRU" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtVxLotCalC_Internalname = "VXLOTCALC" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtVxRapCod_Internalname = "VXRAPCOD" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtVxAcParN_Internalname = "VXACPARN" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtVxArtTer_Internalname = "VXARTTER" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtVxColCod_Internalname = "VXCOLCOD" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtVxHRComp_Internalname = "VXHRCOMP" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtVxLotMts_Internalname = "VXLOTMTS" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtVxLotMTe_Internalname = "VXLOTMTE" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtVxCodExt_Internalname = "VXCODEXT" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtVxUsuTej_Internalname = "VXUSUTEJ" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtVxAlmUbi_Internalname = "VXALMUBI" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtVxAlmCod_Internalname = "VXALMCOD" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtVxComCRCT_Internalname = "VXCOMCRCT" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtVxComCRCC_Internalname = "VXCOMCRCC" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtVxSteCliDe_Internalname = "VXSTECLIDE" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtVxSteFecCr_Internalname = "VXSTEFECCR" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtVxStePedNC_Internalname = "VXSTEPEDNC" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtVxSteDibCo_Internalname = "VXSTEDIBCO" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtVxStePedLi_Internalname = "VXSTEPEDLI" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtVxSteAct_Internalname = "VXSTEACT" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtVxSteFecFT_Internalname = "VXSTEFECFT" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtVxSteDev_Internalname = "VXSTEDEV" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtVxSteRsv_Internalname = "VXSTERSV" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtVxSTeTejRe_Internalname = "VXSTETEJRE" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtVxSteIdMad_Internalname = "VXSTEIDMAD" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtVxSTePml_Internalname = "VXSTEPML" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtVxSteMtspm_Internalname = "VXSTEMTSPM" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      cmbVxSteUniMe.setInternalname( "VXSTEUNIME" );
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtVxSteRdto_Internalname = "VXSTERDTO" ;
      edtavnRcdDeleted_1750_Internalname = "vNRCDDELETED_1750" ;
      edtVxStMFec_Internalname = "VXSTMFEC" ;
      edtVxStMTMov_Internalname = "VXSTMTMOV" ;
      edtVxStMAlmCo_Internalname = "VXSTMALMCO" ;
      edtVxStMSit_Internalname = "VXSTMSIT" ;
      edtVxStMaux_Internalname = "VXSTMAUX" ;
      edtVxStUsuCod_Internalname = "VXSTUSUCOD" ;
      edtVxStWrkStn_Internalname = "VXSTWRKSTN" ;
      edtVxStMAlmOr_Internalname = "VXSTMALMOR" ;
      edtVxStMSitOr_Internalname = "VXSTMSITOR" ;
      edtVxStMCan_Internalname = "VXSTMCAN" ;
      edtVxStMCanOr_Internalname = "VXSTMCANOR" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla STKTE/STKTEMOV en Vertex", "") );
      edtVxStMCanOr_Jsonclick = "" ;
      edtVxStMCan_Jsonclick = "" ;
      edtVxStMSitOr_Jsonclick = "" ;
      edtVxStMAlmOr_Jsonclick = "" ;
      edtVxStWrkStn_Jsonclick = "" ;
      edtVxStUsuCod_Jsonclick = "" ;
      edtVxStMaux_Jsonclick = "" ;
      edtVxStMSit_Jsonclick = "" ;
      edtVxStMAlmCo_Jsonclick = "" ;
      edtVxStMTMov_Jsonclick = "" ;
      edtVxStMFec_Jsonclick = "" ;
      edtavnRcdDeleted_1750_Jsonclick = "" ;
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
      edtVxStMCanOr_Enabled = 1 ;
      edtVxStMCan_Enabled = 1 ;
      edtVxStMSitOr_Enabled = 1 ;
      edtVxStMAlmOr_Enabled = 1 ;
      edtVxStWrkStn_Enabled = 1 ;
      edtVxStUsuCod_Enabled = 1 ;
      edtVxStMaux_Enabled = 1 ;
      edtVxStMSit_Enabled = 1 ;
      edtVxStMAlmCo_Enabled = 1 ;
      edtVxStMTMov_Enabled = 1 ;
      edtVxStMFec_Enabled = 1 ;
      edtavnRcdDeleted_1750_Enabled = 1 ;
      edtVxSteRdto_Jsonclick = "" ;
      edtVxSteRdto_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteRdto_Enabled = 0 ;
      cmbVxSteUniMe.setJsonclick( "" );
      cmbVxSteUniMe.setEnabled( 1 );
      cmbVxSteUniMe.setIBackground( (int)(0xFFFFFF) );
      edtVxSteMtspm_Jsonclick = "" ;
      edtVxSteMtspm_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteMtspm_Enabled = 0 ;
      edtVxSTePml_Jsonclick = "" ;
      edtVxSTePml_Backcolor = (int)(0xFFFFFF) ;
      edtVxSTePml_Enabled = 0 ;
      edtVxSteIdMad_Jsonclick = "" ;
      edtVxSteIdMad_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteIdMad_Enabled = 1 ;
      edtVxSTeTejRe_Jsonclick = "" ;
      edtVxSTeTejRe_Backcolor = (int)(0xFFFFFF) ;
      edtVxSTeTejRe_Enabled = 1 ;
      edtVxSteRsv_Jsonclick = "" ;
      edtVxSteRsv_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteRsv_Enabled = 1 ;
      edtVxSteDev_Jsonclick = "" ;
      edtVxSteDev_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteDev_Enabled = 1 ;
      edtVxSteFecFT_Jsonclick = "" ;
      edtVxSteFecFT_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteFecFT_Enabled = 1 ;
      edtVxSteAct_Jsonclick = "" ;
      edtVxSteAct_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteAct_Enabled = 1 ;
      edtVxStePedLi_Jsonclick = "" ;
      edtVxStePedLi_Backcolor = (int)(0xFFFFFF) ;
      edtVxStePedLi_Enabled = 1 ;
      edtVxSteDibCo_Jsonclick = "" ;
      edtVxSteDibCo_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteDibCo_Enabled = 1 ;
      edtVxStePedNC_Jsonclick = "" ;
      edtVxStePedNC_Backcolor = (int)(0xFFFFFF) ;
      edtVxStePedNC_Enabled = 1 ;
      edtVxSteFecCr_Jsonclick = "" ;
      edtVxSteFecCr_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteFecCr_Enabled = 1 ;
      edtVxSteCliDe_Jsonclick = "" ;
      edtVxSteCliDe_Backcolor = (int)(0xFFFFFF) ;
      edtVxSteCliDe_Enabled = 1 ;
      edtVxComCRCC_Jsonclick = "" ;
      edtVxComCRCC_Backcolor = (int)(0xFFFFFF) ;
      edtVxComCRCC_Enabled = 1 ;
      edtVxComCRCT_Jsonclick = "" ;
      edtVxComCRCT_Backcolor = (int)(0xFFFFFF) ;
      edtVxComCRCT_Enabled = 1 ;
      edtVxAlmCod_Jsonclick = "" ;
      edtVxAlmCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxAlmCod_Enabled = 1 ;
      edtVxAlmUbi_Jsonclick = "" ;
      edtVxAlmUbi_Backcolor = (int)(0xFFFFFF) ;
      edtVxAlmUbi_Enabled = 1 ;
      edtVxUsuTej_Jsonclick = "" ;
      edtVxUsuTej_Backcolor = (int)(0xFFFFFF) ;
      edtVxUsuTej_Enabled = 1 ;
      edtVxCodExt_Jsonclick = "" ;
      edtVxCodExt_Backcolor = (int)(0xFFFFFF) ;
      edtVxCodExt_Enabled = 1 ;
      edtVxLotMTe_Jsonclick = "" ;
      edtVxLotMTe_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotMTe_Enabled = 1 ;
      edtVxLotMts_Jsonclick = "" ;
      edtVxLotMts_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotMts_Enabled = 1 ;
      edtVxHRComp_Jsonclick = "" ;
      edtVxHRComp_Backcolor = (int)(0xFFFFFF) ;
      edtVxHRComp_Enabled = 0 ;
      edtVxColCod_Jsonclick = "" ;
      edtVxColCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxColCod_Enabled = 1 ;
      edtVxArtTer_Jsonclick = "" ;
      edtVxArtTer_Backcolor = (int)(0xFFFFFF) ;
      edtVxArtTer_Enabled = 1 ;
      edtVxAcParN_Jsonclick = "" ;
      edtVxAcParN_Backcolor = (int)(0xFFFFFF) ;
      edtVxAcParN_Enabled = 1 ;
      edtVxRapCod_Jsonclick = "" ;
      edtVxRapCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxRapCod_Enabled = 1 ;
      edtVxLotCalC_Jsonclick = "" ;
      edtVxLotCalC_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotCalC_Enabled = 1 ;
      edtVxLotACru_Jsonclick = "" ;
      edtVxLotACru_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotACru_Enabled = 1 ;
      edtVxLotMaqT_Jsonclick = "" ;
      edtVxLotMaqT_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotMaqT_Enabled = 1 ;
      edtVxLotTeLo_Jsonclick = "" ;
      edtVxLotTeLo_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotTeLo_Enabled = 1 ;
      edtVxLotDefPT_Jsonclick = "" ;
      edtVxLotDefPT_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotDefPT_Enabled = 1 ;
      edtVxLotPrvC_Jsonclick = "" ;
      edtVxLotPrvC_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotPrvC_Enabled = 1 ;
      edtVxLotHRT_Jsonclick = "" ;
      edtVxLotHRT_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotHRT_Enabled = 1 ;
      edtVxLotHRA_Jsonclick = "" ;
      edtVxLotHRA_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotHRA_Enabled = 1 ;
      edtVxLotCTe_Jsonclick = "" ;
      edtVxLotCTe_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotCTe_Enabled = 1 ;
      edtVxLotCan_Jsonclick = "" ;
      edtVxLotCan_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotCan_Enabled = 1 ;
      edtVXLotAnu_Jsonclick = "" ;
      edtVXLotAnu_Backcolor = (int)(0xFFFFFF) ;
      edtVXLotAnu_Enabled = 1 ;
      edtVXLotSitF_Jsonclick = "" ;
      edtVXLotSitF_Backcolor = (int)(0xFFFFFF) ;
      edtVXLotSitF_Enabled = 1 ;
      edtVXLotSit_Jsonclick = "" ;
      edtVXLotSit_Backcolor = (int)(0xFFFFFF) ;
      edtVXLotSit_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxLotId_Jsonclick = "" ;
      edtVxLotId_Backcolor = (int)(0xFFFFFF) ;
      edtVxLotId_Enabled = 1 ;
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
      subsflControlProps_2301750( ) ;
      while ( nGXsfl_230_idx <= nRC_GXsfl_230 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalUX1750( ) ;
         standaloneModalUX1750( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowUX1750( ) ;
         nGXsfl_230_idx = (int)(nGXsfl_230_idx+1) ;
         sGXsfl_230_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_230_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2301750( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbVxSteUniMe.setName( "VXSTEUNIME" );
      cmbVxSteUniMe.setWebtags( "" );
      cmbVxSteUniMe.addItem("L", httpContext.getMessage( "Longitud", ""), (short)(0));
      cmbVxSteUniMe.addItem("P", httpContext.getMessage( "Peso", ""), (short)(0));
      if ( cmbVxSteUniMe.getItemCount() > 0 )
      {
         A13294VxSteUniMe = cmbVxSteUniMe.getValidValue(A13294VxSteUniMe) ;
         n13294VxSteUniMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13294VxSteUniMe", A13294VxSteUniMe);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtVXLotSit_Internalname ;
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

   public void valid_Vxlotid( )
   {
      n13294VxSteUniMe = false ;
      A13294VxSteUniMe = cmbVxSteUniMe.getValue() ;
      n13294VxSteUniMe = false ;
      cmbVxSteUniMe.setValue( A13294VxSteUniMe );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00UX30 */
      pr_default.execute(24, new Object[] {Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A8323VxHRComp = T00UX30_A8323VxHRComp[0] ;
      }
      else
      {
         A8323VxHRComp = (byte)(0) ;
      }
      pr_default.close(24);
      dynload_actions( ) ;
      if ( cmbVxSteUniMe.getItemCount() > 0 )
      {
         A13294VxSteUniMe = cmbVxSteUniMe.getValidValue(A13294VxSteUniMe) ;
         n13294VxSteUniMe = false ;
         cmbVxSteUniMe.setValue( A13294VxSteUniMe );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbVxSteUniMe.setValue( GXutil.rtrim( A13294VxSteUniMe) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6300VXLotSit", GXutil.ltrim( localUtil.ntoc( A6300VXLotSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12719VXLotSitF", localUtil.ttoc( A12719VXLotSitF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6303VXLotAnu", GXutil.ltrim( localUtil.ntoc( A6303VXLotAnu, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6318VxLotCan", GXutil.ltrim( localUtil.ntoc( A6318VxLotCan, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6458VxLotCTe", GXutil.ltrim( localUtil.ntoc( A6458VxLotCTe, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6459VxLotHRA", GXutil.rtrim( A6459VxLotHRA));
      httpContext.ajax_rsp_assign_attri("", false, "A11686VxLotHRT", GXutil.rtrim( A11686VxLotHRT));
      httpContext.ajax_rsp_assign_attri("", false, "A6640VxLotPrvC", GXutil.ltrim( localUtil.ntoc( A6640VxLotPrvC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6641VxLotDefPT", GXutil.ltrim( localUtil.ntoc( A6641VxLotDefPT, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6642VxLotTeLo", GXutil.rtrim( A6642VxLotTeLo));
      httpContext.ajax_rsp_assign_attri("", false, "A6643VxLotMaqT", GXutil.rtrim( A6643VxLotMaqT));
      httpContext.ajax_rsp_assign_attri("", false, "A7422VxLotACru", GXutil.rtrim( A7422VxLotACru));
      httpContext.ajax_rsp_assign_attri("", false, "A7423VxLotCalC", GXutil.ltrim( localUtil.ntoc( A7423VxLotCalC, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7550VxRapCod", GXutil.ltrim( localUtil.ntoc( A7550VxRapCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8320VxAcParN", GXutil.ltrim( localUtil.ntoc( A8320VxAcParN, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8321VxArtTer", GXutil.rtrim( A8321VxArtTer));
      httpContext.ajax_rsp_assign_attri("", false, "A8322VxColCod", GXutil.ltrim( localUtil.ntoc( A8322VxColCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11209VxLotMts", GXutil.ltrim( localUtil.ntoc( A11209VxLotMts, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13025VxLotMTe", GXutil.ltrim( localUtil.ntoc( A13025VxLotMTe, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11305VxCodExt", GXutil.rtrim( A11305VxCodExt));
      httpContext.ajax_rsp_assign_attri("", false, "A11775VxUsuTej", GXutil.rtrim( A11775VxUsuTej));
      httpContext.ajax_rsp_assign_attri("", false, "A12249VxAlmUbi", GXutil.rtrim( A12249VxAlmUbi));
      httpContext.ajax_rsp_assign_attri("", false, "A12248VxAlmCod", GXutil.rtrim( A12248VxAlmCod));
      httpContext.ajax_rsp_assign_attri("", false, "A12251VxComCRCT", GXutil.rtrim( A12251VxComCRCT));
      httpContext.ajax_rsp_assign_attri("", false, "A12250VxComCRCC", GXutil.ltrim( localUtil.ntoc( A12250VxComCRCC, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12252VxSteCliDe", GXutil.ltrim( localUtil.ntoc( A12252VxSteCliDe, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12253VxSteFecCr", localUtil.format(A12253VxSteFecCr, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12375VxStePedNC", GXutil.rtrim( A12375VxStePedNC));
      httpContext.ajax_rsp_assign_attri("", false, "A12376VxSteDibCo", GXutil.rtrim( A12376VxSteDibCo));
      httpContext.ajax_rsp_assign_attri("", false, "A12377VxStePedLi", GXutil.ltrim( localUtil.ntoc( A12377VxStePedLi, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12749VxSteAct", GXutil.ltrim( localUtil.ntoc( A12749VxSteAct, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12885VxSteFecFT", localUtil.ttoc( A12885VxSteFecFT, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12896VxSteDev", GXutil.rtrim( A12896VxSteDev));
      httpContext.ajax_rsp_assign_attri("", false, "A12919VxSteRsv", GXutil.rtrim( A12919VxSteRsv));
      httpContext.ajax_rsp_assign_attri("", false, "A13115VxSTeTejRe", GXutil.rtrim( A13115VxSTeTejRe));
      httpContext.ajax_rsp_assign_attri("", false, "A13202VxSteIdMad", GXutil.ltrim( localUtil.ntoc( A13202VxSteIdMad, (byte)(9), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13294VxSteUniMe", GXutil.rtrim( A13294VxSteUniMe));
      cmbVxSteUniMe.setValue( GXutil.rtrim( A13294VxSteUniMe) );
      httpContext.ajax_rsp_assign_prop("", false, cmbVxSteUniMe.getInternalname(), "Values", cmbVxSteUniMe.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A8323VxHRComp", GXutil.ltrim( localUtil.ntoc( A8323VxHRComp, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrim( localUtil.ntoc( A13211VxSTePml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrim( localUtil.ntoc( A13295VxSteRdto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrim( localUtil.ntoc( A13212VxSteMtspm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6224VxLotId", GXutil.ltrim( localUtil.ntoc( Z6224VxLotId, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6300VXLotSit", GXutil.ltrim( localUtil.ntoc( Z6300VXLotSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12719VXLotSitF", localUtil.ttoc( Z12719VXLotSitF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6303VXLotAnu", GXutil.ltrim( localUtil.ntoc( Z6303VXLotAnu, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6318VxLotCan", GXutil.ltrim( localUtil.ntoc( Z6318VxLotCan, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6458VxLotCTe", GXutil.ltrim( localUtil.ntoc( Z6458VxLotCTe, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6459VxLotHRA", GXutil.rtrim( Z6459VxLotHRA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11686VxLotHRT", GXutil.rtrim( Z11686VxLotHRT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6640VxLotPrvC", GXutil.ltrim( localUtil.ntoc( Z6640VxLotPrvC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6641VxLotDefPT", GXutil.ltrim( localUtil.ntoc( Z6641VxLotDefPT, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6642VxLotTeLo", GXutil.rtrim( Z6642VxLotTeLo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6643VxLotMaqT", GXutil.rtrim( Z6643VxLotMaqT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7422VxLotACru", GXutil.rtrim( Z7422VxLotACru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7423VxLotCalC", GXutil.ltrim( localUtil.ntoc( Z7423VxLotCalC, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7550VxRapCod", GXutil.ltrim( localUtil.ntoc( Z7550VxRapCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8320VxAcParN", GXutil.ltrim( localUtil.ntoc( Z8320VxAcParN, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8321VxArtTer", GXutil.rtrim( Z8321VxArtTer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8322VxColCod", GXutil.ltrim( localUtil.ntoc( Z8322VxColCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11209VxLotMts", GXutil.ltrim( localUtil.ntoc( Z11209VxLotMts, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13025VxLotMTe", GXutil.ltrim( localUtil.ntoc( Z13025VxLotMTe, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11305VxCodExt", GXutil.rtrim( Z11305VxCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11775VxUsuTej", GXutil.rtrim( Z11775VxUsuTej));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12249VxAlmUbi", GXutil.rtrim( Z12249VxAlmUbi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12248VxAlmCod", GXutil.rtrim( Z12248VxAlmCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12251VxComCRCT", GXutil.rtrim( Z12251VxComCRCT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12250VxComCRCC", GXutil.ltrim( localUtil.ntoc( Z12250VxComCRCC, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12252VxSteCliDe", GXutil.ltrim( localUtil.ntoc( Z12252VxSteCliDe, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12253VxSteFecCr", localUtil.format(Z12253VxSteFecCr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12375VxStePedNC", GXutil.rtrim( Z12375VxStePedNC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12376VxSteDibCo", GXutil.rtrim( Z12376VxSteDibCo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12377VxStePedLi", GXutil.ltrim( localUtil.ntoc( Z12377VxStePedLi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12749VxSteAct", GXutil.ltrim( localUtil.ntoc( Z12749VxSteAct, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12885VxSteFecFT", localUtil.ttoc( Z12885VxSteFecFT, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12896VxSteDev", GXutil.rtrim( Z12896VxSteDev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12919VxSteRsv", GXutil.rtrim( Z12919VxSteRsv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13115VxSTeTejRe", GXutil.rtrim( Z13115VxSTeTejRe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13202VxSteIdMad", GXutil.ltrim( localUtil.ntoc( Z13202VxSteIdMad, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13294VxSteUniMe", GXutil.rtrim( Z13294VxSteUniMe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8323VxHRComp", GXutil.ltrim( localUtil.ntoc( Z8323VxHRComp, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13211VxSTePml", GXutil.ltrim( localUtil.ntoc( Z13211VxSTePml, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13295VxSteRdto", GXutil.ltrim( localUtil.ntoc( Z13295VxSteRdto, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13212VxSteMtspm", GXutil.ltrim( localUtil.ntoc( Z13212VxSteMtspm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Vxlothrt( )
   {
      n11686VxLotHRT = false ;
      /* Using cursor T00UX41 */
      pr_default.execute(35, new Object[] {Boolean.valueOf(n11686VxLotHRT), A11686VxLotHRT, Integer.valueOf(A6224VxLotId), Integer.valueOf(A6224VxLotId)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_1004", new Object[] {httpContext.getMessage( "Hoja de Ruta de Tejido", "")+","+httpContext.getMessage( "Nro Rollo", "")}), 1, "VXLOTHRT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotHRT_Internalname ;
      }
      pr_default.close(35);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Vxlottelo( )
   {
      n6642VxLotTeLo = false ;
      /* Using cursor T00UX42 */
      pr_default.execute(36, new Object[] {Boolean.valueOf(n6642VxLotTeLo), A6642VxLotTeLo});
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Lotes de Tejeduría", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXLOTTELO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxLotTeLo_Internalname ;
      }
      pr_default.close(36);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Vxlotacru( )
   {
      n7422VxLotACru = false ;
      n6318VxLotCan = false ;
      /* Using cursor T00UX31 */
      pr_default.execute(25, new Object[] {Boolean.valueOf(n7422VxLotACru), A7422VxLotACru});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A13211VxSTePml = T00UX31_A13211VxSTePml[0] ;
         A13295VxSteRdto = T00UX31_A13295VxSteRdto[0] ;
      }
      else
      {
         A13295VxSteRdto = DecimalUtil.doubleToDec(0) ;
         A13211VxSTePml = (short)(0) ;
      }
      pr_default.close(25);
      if ( A13211VxSTePml > 0 )
      {
         A13212VxSteMtspm = A6318VxLotCan.divide(DecimalUtil.doubleToDec(A13211VxSTePml), 18, java.math.RoundingMode.DOWN).multiply(DecimalUtil.doubleToDec(1000)) ;
      }
      else
      {
         A13212VxSteMtspm = DecimalUtil.doubleToDec(0) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13211VxSTePml", GXutil.ltrim( localUtil.ntoc( A13211VxSTePml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13295VxSteRdto", GXutil.ltrim( localUtil.ntoc( A13295VxSteRdto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13212VxSteMtspm", GXutil.ltrim( localUtil.ntoc( A13212VxSteMtspm, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Vxrapcod( )
   {
      n7550VxRapCod = false ;
      /* Using cursor T00UX43 */
      pr_default.execute(37, new Object[] {Boolean.valueOf(n7550VxRapCod), Integer.valueOf(A7550VxRapCod)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Vertex - Rapports", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXRAPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxRapCod_Internalname ;
      }
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Vxalmcod( )
   {
      n12248VxAlmCod = false ;
      n12249VxAlmUbi = false ;
      /* Using cursor T00UX44 */
      pr_default.execute(38, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod});
      if ( (pr_default.getStatus(38) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A12248VxAlmCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Estructura ALMACEN  en VERTEX", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXALMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAlmCod_Internalname ;
         }
      }
      pr_default.close(38);
      /* Using cursor T00UX45 */
      pr_default.execute(39, new Object[] {Boolean.valueOf(n12248VxAlmCod), A12248VxAlmCod, Boolean.valueOf(n12249VxAlmUbi), A12249VxAlmUbi});
      if ( (pr_default.getStatus(39) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A12248VxAlmCod)==0) || (GXutil.strcmp("", A12249VxAlmUbi)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Almacén / Ubicaciones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VXALMUBI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxAlmCod_Internalname ;
         }
      }
      pr_default.close(39);
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
      setEventMetadata("VALID_VXLOTID","{handler:'valid_Vxlotid',iparms:[{av:'cmbVxSteUniMe'},{av:'A13294VxSteUniMe',fld:'VXSTEUNIME',pic:''},{av:'A6224VxLotId',fld:'VXLOTID',pic:'ZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXLOTID",",oparms:[{av:'A6300VXLotSit',fld:'VXLOTSIT',pic:'Z9'},{av:'A12719VXLotSitF',fld:'VXLOTSITF',pic:'99/99/99 99:99'},{av:'A6303VXLotAnu',fld:'VXLOTANU',pic:'9'},{av:'A6318VxLotCan',fld:'VXLOTCAN',pic:'ZZZZZ9.99'},{av:'A6458VxLotCTe',fld:'VXLOTCTE',pic:'ZZZZZ9.99'},{av:'A6459VxLotHRA',fld:'VXLOTHRA',pic:''},{av:'A11686VxLotHRT',fld:'VXLOTHRT',pic:''},{av:'A6640VxLotPrvC',fld:'VXLOTPRVC',pic:'ZZZZZ9'},{av:'A6641VxLotDefPT',fld:'VXLOTDEFPT',pic:'ZZZ9'},{av:'A6642VxLotTeLo',fld:'VXLOTTELO',pic:''},{av:'A6643VxLotMaqT',fld:'VXLOTMAQT',pic:''},{av:'A7422VxLotACru',fld:'VXLOTACRU',pic:''},{av:'A7423VxLotCalC',fld:'VXLOTCALC',pic:'9'},{av:'A7550VxRapCod',fld:'VXRAPCOD',pic:'ZZZZZ9'},{av:'A8320VxAcParN',fld:'VXACPARN',pic:'ZZZZZZZ9'},{av:'A8321VxArtTer',fld:'VXARTTER',pic:''},{av:'A8322VxColCod',fld:'VXCOLCOD',pic:'ZZZZZ9'},{av:'A11209VxLotMts',fld:'VXLOTMTS',pic:'ZZZZZZZZ9.99'},{av:'A13025VxLotMTe',fld:'VXLOTMTE',pic:'ZZZZZ9.99'},{av:'A11305VxCodExt',fld:'VXCODEXT',pic:''},{av:'A11775VxUsuTej',fld:'VXUSUTEJ',pic:''},{av:'A12249VxAlmUbi',fld:'VXALMUBI',pic:''},{av:'A12248VxAlmCod',fld:'VXALMCOD',pic:''},{av:'A12251VxComCRCT',fld:'VXCOMCRCT',pic:''},{av:'A12250VxComCRCC',fld:'VXCOMCRCC',pic:'ZZZZZZZ9'},{av:'A12252VxSteCliDe',fld:'VXSTECLIDE',pic:'ZZZZZ9'},{av:'A12253VxSteFecCr',fld:'VXSTEFECCR',pic:''},{av:'A12375VxStePedNC',fld:'VXSTEPEDNC',pic:''},{av:'A12376VxSteDibCo',fld:'VXSTEDIBCO',pic:''},{av:'A12377VxStePedLi',fld:'VXSTEPEDLI',pic:'ZZZ9'},{av:'A12749VxSteAct',fld:'VXSTEACT',pic:'9'},{av:'A12885VxSteFecFT',fld:'VXSTEFECFT',pic:'99/99/99 99:99'},{av:'A12896VxSteDev',fld:'VXSTEDEV',pic:''},{av:'A12919VxSteRsv',fld:'VXSTERSV',pic:''},{av:'A13115VxSTeTejRe',fld:'VXSTETEJRE',pic:''},{av:'A13202VxSteIdMad',fld:'VXSTEIDMAD',pic:'ZZZZZZZZ9'},{av:'cmbVxSteUniMe'},{av:'A13294VxSteUniMe',fld:'VXSTEUNIME',pic:''},{av:'A8323VxHRComp',fld:'VXHRCOMP',pic:'Z9'},{av:'A13211VxSTePml',fld:'VXSTEPML',pic:'ZZZ9'},{av:'A13295VxSteRdto',fld:'VXSTERDTO',pic:'Z9.99'},{av:'A13212VxSteMtspm',fld:'VXSTEMTSPM',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z6224VxLotId'},{av:'Z6300VXLotSit'},{av:'Z12719VXLotSitF'},{av:'Z6303VXLotAnu'},{av:'Z6318VxLotCan'},{av:'Z6458VxLotCTe'},{av:'Z6459VxLotHRA'},{av:'Z11686VxLotHRT'},{av:'Z6640VxLotPrvC'},{av:'Z6641VxLotDefPT'},{av:'Z6642VxLotTeLo'},{av:'Z6643VxLotMaqT'},{av:'Z7422VxLotACru'},{av:'Z7423VxLotCalC'},{av:'Z7550VxRapCod'},{av:'Z8320VxAcParN'},{av:'Z8321VxArtTer'},{av:'Z8322VxColCod'},{av:'Z11209VxLotMts'},{av:'Z13025VxLotMTe'},{av:'Z11305VxCodExt'},{av:'Z11775VxUsuTej'},{av:'Z12249VxAlmUbi'},{av:'Z12248VxAlmCod'},{av:'Z12251VxComCRCT'},{av:'Z12250VxComCRCC'},{av:'Z12252VxSteCliDe'},{av:'Z12253VxSteFecCr'},{av:'Z12375VxStePedNC'},{av:'Z12376VxSteDibCo'},{av:'Z12377VxStePedLi'},{av:'Z12749VxSteAct'},{av:'Z12885VxSteFecFT'},{av:'Z12896VxSteDev'},{av:'Z12919VxSteRsv'},{av:'Z13115VxSTeTejRe'},{av:'Z13202VxSteIdMad'},{av:'Z13294VxSteUniMe'},{av:'Z8323VxHRComp'},{av:'Z13211VxSTePml'},{av:'Z13295VxSteRdto'},{av:'Z13212VxSteMtspm'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXLOTCAN","{handler:'valid_Vxlotcan',iparms:[]");
      setEventMetadata("VALID_VXLOTCAN",",oparms:[]}");
      setEventMetadata("VALID_VXLOTHRT","{handler:'valid_Vxlothrt',iparms:[{av:'A11686VxLotHRT',fld:'VXLOTHRT',pic:''},{av:'A6224VxLotId',fld:'VXLOTID',pic:'ZZZZZZZZ9'}]");
      setEventMetadata("VALID_VXLOTHRT",",oparms:[]}");
      setEventMetadata("VALID_VXLOTTELO","{handler:'valid_Vxlottelo',iparms:[{av:'A6642VxLotTeLo',fld:'VXLOTTELO',pic:''}]");
      setEventMetadata("VALID_VXLOTTELO",",oparms:[]}");
      setEventMetadata("VALID_VXLOTACRU","{handler:'valid_Vxlotacru',iparms:[{av:'A7422VxLotACru',fld:'VXLOTACRU',pic:''},{av:'A6318VxLotCan',fld:'VXLOTCAN',pic:'ZZZZZ9.99'},{av:'A13211VxSTePml',fld:'VXSTEPML',pic:'ZZZ9'},{av:'A13295VxSteRdto',fld:'VXSTERDTO',pic:'Z9.99'},{av:'A13212VxSteMtspm',fld:'VXSTEMTSPM',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_VXLOTACRU",",oparms:[{av:'A13211VxSTePml',fld:'VXSTEPML',pic:'ZZZ9'},{av:'A13295VxSteRdto',fld:'VXSTERDTO',pic:'Z9.99'},{av:'A13212VxSteMtspm',fld:'VXSTEMTSPM',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_VXRAPCOD","{handler:'valid_Vxrapcod',iparms:[{av:'A7550VxRapCod',fld:'VXRAPCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_VXRAPCOD",",oparms:[]}");
      setEventMetadata("VALID_VXALMUBI","{handler:'valid_Vxalmubi',iparms:[]");
      setEventMetadata("VALID_VXALMUBI",",oparms:[]}");
      setEventMetadata("VALID_VXALMCOD","{handler:'valid_Vxalmcod',iparms:[{av:'A12248VxAlmCod',fld:'VXALMCOD',pic:''},{av:'A12249VxAlmUbi',fld:'VXALMUBI',pic:''}]");
      setEventMetadata("VALID_VXALMCOD",",oparms:[]}");
      setEventMetadata("VALID_VXSTEPML","{handler:'valid_Vxstepml',iparms:[]");
      setEventMetadata("VALID_VXSTEPML",",oparms:[]}");
      setEventMetadata("VALID_VXSTEUNIME","{handler:'valid_Vxsteunime',iparms:[]");
      setEventMetadata("VALID_VXSTEUNIME",",oparms:[]}");
      setEventMetadata("VALID_VXSTMFEC","{handler:'valid_Vxstmfec',iparms:[]");
      setEventMetadata("VALID_VXSTMFEC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Vxstmcanor',iparms:[]");
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
      pr_default.close(36);
      pr_default.close(37);
      pr_default.close(39);
      pr_default.close(38);
      pr_default.close(25);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z12719VXLotSitF = GXutil.resetTime( GXutil.nullDate() );
      Z6318VxLotCan = DecimalUtil.ZERO ;
      Z6458VxLotCTe = DecimalUtil.ZERO ;
      Z6459VxLotHRA = "" ;
      Z11686VxLotHRT = "" ;
      Z6643VxLotMaqT = "" ;
      Z7422VxLotACru = "" ;
      Z8321VxArtTer = "" ;
      Z11209VxLotMts = DecimalUtil.ZERO ;
      Z13025VxLotMTe = DecimalUtil.ZERO ;
      Z11305VxCodExt = "" ;
      Z11775VxUsuTej = "" ;
      Z12251VxComCRCT = "" ;
      Z12253VxSteFecCr = GXutil.nullDate() ;
      Z12375VxStePedNC = "" ;
      Z12376VxSteDibCo = "" ;
      Z12885VxSteFecFT = GXutil.resetTime( GXutil.nullDate() );
      Z12896VxSteDev = "" ;
      Z12919VxSteRsv = "" ;
      Z13115VxSTeTejRe = "" ;
      Z13294VxSteUniMe = "" ;
      Z6642VxLotTeLo = "" ;
      Z12248VxAlmCod = "" ;
      Z12249VxAlmUbi = "" ;
      Z12730VxStMFec = GXutil.resetTime( GXutil.nullDate() );
      Z12720VxStMTMov = "" ;
      Z12721VxStMAlmCo = "" ;
      Z12723VxStMaux = "" ;
      Z12724VxStUsuCod = "" ;
      Z12725VxStWrkStn = "" ;
      Z12726VxStMAlmOr = "" ;
      Z12728VxStMCan = DecimalUtil.ZERO ;
      Z12729VxStMCanOr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A6642VxLotTeLo = "" ;
      A7422VxLotACru = "" ;
      A12248VxAlmCod = "" ;
      A12249VxAlmUbi = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A13294VxSteUniMe = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A12719VXLotSitF = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A6318VxLotCan = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A6458VxLotCTe = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A6459VxLotHRA = "" ;
      lblTextblock8_Jsonclick = "" ;
      A11686VxLotHRT = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A6643VxLotMaqT = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A8321VxArtTer = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A11209VxLotMts = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A13025VxLotMTe = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      A11305VxCodExt = "" ;
      lblTextblock23_Jsonclick = "" ;
      A11775VxUsuTej = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A12251VxComCRCT = "" ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A12253VxSteFecCr = GXutil.nullDate() ;
      lblTextblock30_Jsonclick = "" ;
      A12375VxStePedNC = "" ;
      lblTextblock31_Jsonclick = "" ;
      A12376VxSteDibCo = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A12885VxSteFecFT = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock35_Jsonclick = "" ;
      A12896VxSteDev = "" ;
      lblTextblock36_Jsonclick = "" ;
      A12919VxSteRsv = "" ;
      lblTextblock37_Jsonclick = "" ;
      A13115VxSTeTejRe = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      A13212VxSteMtspm = DecimalUtil.ZERO ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      A13295VxSteRdto = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1750 = "" ;
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
      sMode916 = "" ;
      GXCCtl = "" ;
      A12730VxStMFec = GXutil.resetTime( GXutil.nullDate() );
      A12720VxStMTMov = "" ;
      A12721VxStMAlmCo = "" ;
      A12723VxStMaux = "" ;
      A12724VxStUsuCod = "" ;
      A12725VxStWrkStn = "" ;
      A12726VxStMAlmOr = "" ;
      A12728VxStMCan = DecimalUtil.ZERO ;
      A12729VxStMCanOr = DecimalUtil.ZERO ;
      Z13295VxSteRdto = DecimalUtil.ZERO ;
      T00UX14_A11769VxArTECod = new String[] {""} ;
      T00UX14_A6224VxLotId = new int[1] ;
      T00UX14_A6300VXLotSit = new byte[1] ;
      T00UX14_n6300VXLotSit = new boolean[] {false} ;
      T00UX14_A12719VXLotSitF = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX14_n12719VXLotSitF = new boolean[] {false} ;
      T00UX14_A6303VXLotAnu = new byte[1] ;
      T00UX14_n6303VXLotAnu = new boolean[] {false} ;
      T00UX14_A6318VxLotCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX14_n6318VxLotCan = new boolean[] {false} ;
      T00UX14_A6458VxLotCTe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX14_n6458VxLotCTe = new boolean[] {false} ;
      T00UX14_A6459VxLotHRA = new String[] {""} ;
      T00UX14_n6459VxLotHRA = new boolean[] {false} ;
      T00UX14_A11686VxLotHRT = new String[] {""} ;
      T00UX14_n11686VxLotHRT = new boolean[] {false} ;
      T00UX14_A6640VxLotPrvC = new int[1] ;
      T00UX14_n6640VxLotPrvC = new boolean[] {false} ;
      T00UX14_A6641VxLotDefPT = new short[1] ;
      T00UX14_n6641VxLotDefPT = new boolean[] {false} ;
      T00UX14_A6643VxLotMaqT = new String[] {""} ;
      T00UX14_n6643VxLotMaqT = new boolean[] {false} ;
      T00UX14_A7422VxLotACru = new String[] {""} ;
      T00UX14_n7422VxLotACru = new boolean[] {false} ;
      T00UX14_A7423VxLotCalC = new byte[1] ;
      T00UX14_n7423VxLotCalC = new boolean[] {false} ;
      T00UX14_A8320VxAcParN = new int[1] ;
      T00UX14_n8320VxAcParN = new boolean[] {false} ;
      T00UX14_A8321VxArtTer = new String[] {""} ;
      T00UX14_n8321VxArtTer = new boolean[] {false} ;
      T00UX14_A8322VxColCod = new int[1] ;
      T00UX14_n8322VxColCod = new boolean[] {false} ;
      T00UX14_A11209VxLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX14_n11209VxLotMts = new boolean[] {false} ;
      T00UX14_A13025VxLotMTe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX14_n13025VxLotMTe = new boolean[] {false} ;
      T00UX14_A11305VxCodExt = new String[] {""} ;
      T00UX14_n11305VxCodExt = new boolean[] {false} ;
      T00UX14_A11775VxUsuTej = new String[] {""} ;
      T00UX14_n11775VxUsuTej = new boolean[] {false} ;
      T00UX14_A12251VxComCRCT = new String[] {""} ;
      T00UX14_n12251VxComCRCT = new boolean[] {false} ;
      T00UX14_A12250VxComCRCC = new int[1] ;
      T00UX14_n12250VxComCRCC = new boolean[] {false} ;
      T00UX14_A12252VxSteCliDe = new int[1] ;
      T00UX14_n12252VxSteCliDe = new boolean[] {false} ;
      T00UX14_A12253VxSteFecCr = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX14_n12253VxSteFecCr = new boolean[] {false} ;
      T00UX14_A12375VxStePedNC = new String[] {""} ;
      T00UX14_n12375VxStePedNC = new boolean[] {false} ;
      T00UX14_A12376VxSteDibCo = new String[] {""} ;
      T00UX14_n12376VxSteDibCo = new boolean[] {false} ;
      T00UX14_A12377VxStePedLi = new short[1] ;
      T00UX14_n12377VxStePedLi = new boolean[] {false} ;
      T00UX14_A12749VxSteAct = new byte[1] ;
      T00UX14_n12749VxSteAct = new boolean[] {false} ;
      T00UX14_A12885VxSteFecFT = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX14_n12885VxSteFecFT = new boolean[] {false} ;
      T00UX14_A12896VxSteDev = new String[] {""} ;
      T00UX14_n12896VxSteDev = new boolean[] {false} ;
      T00UX14_A12919VxSteRsv = new String[] {""} ;
      T00UX14_n12919VxSteRsv = new boolean[] {false} ;
      T00UX14_A13115VxSTeTejRe = new String[] {""} ;
      T00UX14_n13115VxSTeTejRe = new boolean[] {false} ;
      T00UX14_A13202VxSteIdMad = new int[1] ;
      T00UX14_n13202VxSteIdMad = new boolean[] {false} ;
      T00UX14_A13294VxSteUniMe = new String[] {""} ;
      T00UX14_n13294VxSteUniMe = new boolean[] {false} ;
      T00UX14_A6642VxLotTeLo = new String[] {""} ;
      T00UX14_n6642VxLotTeLo = new boolean[] {false} ;
      T00UX14_A7550VxRapCod = new int[1] ;
      T00UX14_n7550VxRapCod = new boolean[] {false} ;
      T00UX14_A12248VxAlmCod = new String[] {""} ;
      T00UX14_n12248VxAlmCod = new boolean[] {false} ;
      T00UX14_A12249VxAlmUbi = new String[] {""} ;
      T00UX14_n12249VxAlmUbi = new boolean[] {false} ;
      T00UX14_A13211VxSTePml = new short[1] ;
      T00UX14_A13295VxSteRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX14_A8323VxHRComp = new byte[1] ;
      T00UX12_A8323VxHRComp = new byte[1] ;
      T00UX15_A11686VxLotHRT = new String[] {""} ;
      T00UX15_n11686VxLotHRT = new boolean[] {false} ;
      T00UX6_A6642VxLotTeLo = new String[] {""} ;
      T00UX6_n6642VxLotTeLo = new boolean[] {false} ;
      T00UX10_A13211VxSTePml = new short[1] ;
      T00UX10_A13295VxSteRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX7_A7550VxRapCod = new int[1] ;
      T00UX7_n7550VxRapCod = new boolean[] {false} ;
      T00UX9_A12248VxAlmCod = new String[] {""} ;
      T00UX9_n12248VxAlmCod = new boolean[] {false} ;
      T00UX8_A12248VxAlmCod = new String[] {""} ;
      T00UX8_n12248VxAlmCod = new boolean[] {false} ;
      T00UX17_A8323VxHRComp = new byte[1] ;
      T00UX18_A6642VxLotTeLo = new String[] {""} ;
      T00UX18_n6642VxLotTeLo = new boolean[] {false} ;
      T00UX19_A13211VxSTePml = new short[1] ;
      T00UX19_A13295VxSteRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX20_A7550VxRapCod = new int[1] ;
      T00UX20_n7550VxRapCod = new boolean[] {false} ;
      T00UX21_A12248VxAlmCod = new String[] {""} ;
      T00UX21_n12248VxAlmCod = new boolean[] {false} ;
      T00UX22_A12248VxAlmCod = new String[] {""} ;
      T00UX22_n12248VxAlmCod = new boolean[] {false} ;
      T00UX23_A6224VxLotId = new int[1] ;
      T00UX5_A6224VxLotId = new int[1] ;
      T00UX5_A6300VXLotSit = new byte[1] ;
      T00UX5_n6300VXLotSit = new boolean[] {false} ;
      T00UX5_A12719VXLotSitF = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX5_n12719VXLotSitF = new boolean[] {false} ;
      T00UX5_A6303VXLotAnu = new byte[1] ;
      T00UX5_n6303VXLotAnu = new boolean[] {false} ;
      T00UX5_A6318VxLotCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX5_n6318VxLotCan = new boolean[] {false} ;
      T00UX5_A6458VxLotCTe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX5_n6458VxLotCTe = new boolean[] {false} ;
      T00UX5_A6459VxLotHRA = new String[] {""} ;
      T00UX5_n6459VxLotHRA = new boolean[] {false} ;
      T00UX5_A11686VxLotHRT = new String[] {""} ;
      T00UX5_n11686VxLotHRT = new boolean[] {false} ;
      T00UX5_A6640VxLotPrvC = new int[1] ;
      T00UX5_n6640VxLotPrvC = new boolean[] {false} ;
      T00UX5_A6641VxLotDefPT = new short[1] ;
      T00UX5_n6641VxLotDefPT = new boolean[] {false} ;
      T00UX5_A6643VxLotMaqT = new String[] {""} ;
      T00UX5_n6643VxLotMaqT = new boolean[] {false} ;
      T00UX5_A7422VxLotACru = new String[] {""} ;
      T00UX5_n7422VxLotACru = new boolean[] {false} ;
      T00UX5_A7423VxLotCalC = new byte[1] ;
      T00UX5_n7423VxLotCalC = new boolean[] {false} ;
      T00UX5_A8320VxAcParN = new int[1] ;
      T00UX5_n8320VxAcParN = new boolean[] {false} ;
      T00UX5_A8321VxArtTer = new String[] {""} ;
      T00UX5_n8321VxArtTer = new boolean[] {false} ;
      T00UX5_A8322VxColCod = new int[1] ;
      T00UX5_n8322VxColCod = new boolean[] {false} ;
      T00UX5_A11209VxLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX5_n11209VxLotMts = new boolean[] {false} ;
      T00UX5_A13025VxLotMTe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX5_n13025VxLotMTe = new boolean[] {false} ;
      T00UX5_A11305VxCodExt = new String[] {""} ;
      T00UX5_n11305VxCodExt = new boolean[] {false} ;
      T00UX5_A11775VxUsuTej = new String[] {""} ;
      T00UX5_n11775VxUsuTej = new boolean[] {false} ;
      T00UX5_A12251VxComCRCT = new String[] {""} ;
      T00UX5_n12251VxComCRCT = new boolean[] {false} ;
      T00UX5_A12250VxComCRCC = new int[1] ;
      T00UX5_n12250VxComCRCC = new boolean[] {false} ;
      T00UX5_A12252VxSteCliDe = new int[1] ;
      T00UX5_n12252VxSteCliDe = new boolean[] {false} ;
      T00UX5_A12253VxSteFecCr = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX5_n12253VxSteFecCr = new boolean[] {false} ;
      T00UX5_A12375VxStePedNC = new String[] {""} ;
      T00UX5_n12375VxStePedNC = new boolean[] {false} ;
      T00UX5_A12376VxSteDibCo = new String[] {""} ;
      T00UX5_n12376VxSteDibCo = new boolean[] {false} ;
      T00UX5_A12377VxStePedLi = new short[1] ;
      T00UX5_n12377VxStePedLi = new boolean[] {false} ;
      T00UX5_A12749VxSteAct = new byte[1] ;
      T00UX5_n12749VxSteAct = new boolean[] {false} ;
      T00UX5_A12885VxSteFecFT = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX5_n12885VxSteFecFT = new boolean[] {false} ;
      T00UX5_A12896VxSteDev = new String[] {""} ;
      T00UX5_n12896VxSteDev = new boolean[] {false} ;
      T00UX5_A12919VxSteRsv = new String[] {""} ;
      T00UX5_n12919VxSteRsv = new boolean[] {false} ;
      T00UX5_A13115VxSTeTejRe = new String[] {""} ;
      T00UX5_n13115VxSTeTejRe = new boolean[] {false} ;
      T00UX5_A13202VxSteIdMad = new int[1] ;
      T00UX5_n13202VxSteIdMad = new boolean[] {false} ;
      T00UX5_A13294VxSteUniMe = new String[] {""} ;
      T00UX5_n13294VxSteUniMe = new boolean[] {false} ;
      T00UX5_A6642VxLotTeLo = new String[] {""} ;
      T00UX5_n6642VxLotTeLo = new boolean[] {false} ;
      T00UX5_A7550VxRapCod = new int[1] ;
      T00UX5_n7550VxRapCod = new boolean[] {false} ;
      T00UX5_A12248VxAlmCod = new String[] {""} ;
      T00UX5_n12248VxAlmCod = new boolean[] {false} ;
      T00UX5_A12249VxAlmUbi = new String[] {""} ;
      T00UX5_n12249VxAlmUbi = new boolean[] {false} ;
      T00UX24_A6224VxLotId = new int[1] ;
      T00UX25_A6224VxLotId = new int[1] ;
      T00UX4_A6224VxLotId = new int[1] ;
      T00UX4_A6300VXLotSit = new byte[1] ;
      T00UX4_n6300VXLotSit = new boolean[] {false} ;
      T00UX4_A12719VXLotSitF = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX4_n12719VXLotSitF = new boolean[] {false} ;
      T00UX4_A6303VXLotAnu = new byte[1] ;
      T00UX4_n6303VXLotAnu = new boolean[] {false} ;
      T00UX4_A6318VxLotCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX4_n6318VxLotCan = new boolean[] {false} ;
      T00UX4_A6458VxLotCTe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX4_n6458VxLotCTe = new boolean[] {false} ;
      T00UX4_A6459VxLotHRA = new String[] {""} ;
      T00UX4_n6459VxLotHRA = new boolean[] {false} ;
      T00UX4_A11686VxLotHRT = new String[] {""} ;
      T00UX4_n11686VxLotHRT = new boolean[] {false} ;
      T00UX4_A6640VxLotPrvC = new int[1] ;
      T00UX4_n6640VxLotPrvC = new boolean[] {false} ;
      T00UX4_A6641VxLotDefPT = new short[1] ;
      T00UX4_n6641VxLotDefPT = new boolean[] {false} ;
      T00UX4_A6643VxLotMaqT = new String[] {""} ;
      T00UX4_n6643VxLotMaqT = new boolean[] {false} ;
      T00UX4_A7422VxLotACru = new String[] {""} ;
      T00UX4_n7422VxLotACru = new boolean[] {false} ;
      T00UX4_A7423VxLotCalC = new byte[1] ;
      T00UX4_n7423VxLotCalC = new boolean[] {false} ;
      T00UX4_A8320VxAcParN = new int[1] ;
      T00UX4_n8320VxAcParN = new boolean[] {false} ;
      T00UX4_A8321VxArtTer = new String[] {""} ;
      T00UX4_n8321VxArtTer = new boolean[] {false} ;
      T00UX4_A8322VxColCod = new int[1] ;
      T00UX4_n8322VxColCod = new boolean[] {false} ;
      T00UX4_A11209VxLotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX4_n11209VxLotMts = new boolean[] {false} ;
      T00UX4_A13025VxLotMTe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX4_n13025VxLotMTe = new boolean[] {false} ;
      T00UX4_A11305VxCodExt = new String[] {""} ;
      T00UX4_n11305VxCodExt = new boolean[] {false} ;
      T00UX4_A11775VxUsuTej = new String[] {""} ;
      T00UX4_n11775VxUsuTej = new boolean[] {false} ;
      T00UX4_A12251VxComCRCT = new String[] {""} ;
      T00UX4_n12251VxComCRCT = new boolean[] {false} ;
      T00UX4_A12250VxComCRCC = new int[1] ;
      T00UX4_n12250VxComCRCC = new boolean[] {false} ;
      T00UX4_A12252VxSteCliDe = new int[1] ;
      T00UX4_n12252VxSteCliDe = new boolean[] {false} ;
      T00UX4_A12253VxSteFecCr = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX4_n12253VxSteFecCr = new boolean[] {false} ;
      T00UX4_A12375VxStePedNC = new String[] {""} ;
      T00UX4_n12375VxStePedNC = new boolean[] {false} ;
      T00UX4_A12376VxSteDibCo = new String[] {""} ;
      T00UX4_n12376VxSteDibCo = new boolean[] {false} ;
      T00UX4_A12377VxStePedLi = new short[1] ;
      T00UX4_n12377VxStePedLi = new boolean[] {false} ;
      T00UX4_A12749VxSteAct = new byte[1] ;
      T00UX4_n12749VxSteAct = new boolean[] {false} ;
      T00UX4_A12885VxSteFecFT = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX4_n12885VxSteFecFT = new boolean[] {false} ;
      T00UX4_A12896VxSteDev = new String[] {""} ;
      T00UX4_n12896VxSteDev = new boolean[] {false} ;
      T00UX4_A12919VxSteRsv = new String[] {""} ;
      T00UX4_n12919VxSteRsv = new boolean[] {false} ;
      T00UX4_A13115VxSTeTejRe = new String[] {""} ;
      T00UX4_n13115VxSTeTejRe = new boolean[] {false} ;
      T00UX4_A13202VxSteIdMad = new int[1] ;
      T00UX4_n13202VxSteIdMad = new boolean[] {false} ;
      T00UX4_A13294VxSteUniMe = new String[] {""} ;
      T00UX4_n13294VxSteUniMe = new boolean[] {false} ;
      T00UX4_A6642VxLotTeLo = new String[] {""} ;
      T00UX4_n6642VxLotTeLo = new boolean[] {false} ;
      T00UX4_A7550VxRapCod = new int[1] ;
      T00UX4_n7550VxRapCod = new boolean[] {false} ;
      T00UX4_A12248VxAlmCod = new String[] {""} ;
      T00UX4_n12248VxAlmCod = new boolean[] {false} ;
      T00UX4_A12249VxAlmUbi = new String[] {""} ;
      T00UX4_n12249VxAlmUbi = new boolean[] {false} ;
      T00UX30_A8323VxHRComp = new byte[1] ;
      T00UX31_A13211VxSTePml = new short[1] ;
      T00UX31_A13295VxSteRdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX32_A7525VxOFabTip = new String[] {""} ;
      T00UX32_A12372VxOSCod = new int[1] ;
      T00UX32_A6224VxLotId = new int[1] ;
      T00UX33_A6224VxLotId = new int[1] ;
      T00UX33_A8314VxHREmp = new String[] {""} ;
      T00UX33_n8314VxHREmp = new boolean[] {false} ;
      T00UX33_A8315VxHRBar = new int[1] ;
      T00UX33_n8315VxHRBar = new boolean[] {false} ;
      T00UX33_A8316VxHrReo = new byte[1] ;
      T00UX33_n8316VxHrReo = new boolean[] {false} ;
      T00UX33_A8317VxHrPar = new String[] {""} ;
      T00UX33_n8317VxHrPar = new boolean[] {false} ;
      T00UX34_A6224VxLotId = new int[1] ;
      T00UX35_A6224VxLotId = new int[1] ;
      T00UX35_A12730VxStMFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX35_A12720VxStMTMov = new String[] {""} ;
      T00UX35_n12720VxStMTMov = new boolean[] {false} ;
      T00UX35_A12721VxStMAlmCo = new String[] {""} ;
      T00UX35_n12721VxStMAlmCo = new boolean[] {false} ;
      T00UX35_A12722VxStMSit = new byte[1] ;
      T00UX35_n12722VxStMSit = new boolean[] {false} ;
      T00UX35_A12723VxStMaux = new String[] {""} ;
      T00UX35_n12723VxStMaux = new boolean[] {false} ;
      T00UX35_A12724VxStUsuCod = new String[] {""} ;
      T00UX35_n12724VxStUsuCod = new boolean[] {false} ;
      T00UX35_A12725VxStWrkStn = new String[] {""} ;
      T00UX35_n12725VxStWrkStn = new boolean[] {false} ;
      T00UX35_A12726VxStMAlmOr = new String[] {""} ;
      T00UX35_n12726VxStMAlmOr = new boolean[] {false} ;
      T00UX35_A12727VxStMSitOr = new short[1] ;
      T00UX35_n12727VxStMSitOr = new boolean[] {false} ;
      T00UX35_A12728VxStMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX35_n12728VxStMCan = new boolean[] {false} ;
      T00UX35_A12729VxStMCanOr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX35_n12729VxStMCanOr = new boolean[] {false} ;
      T00UX36_A6224VxLotId = new int[1] ;
      T00UX36_A12730VxStMFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX3_A6224VxLotId = new int[1] ;
      T00UX3_A12730VxStMFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX3_A12720VxStMTMov = new String[] {""} ;
      T00UX3_n12720VxStMTMov = new boolean[] {false} ;
      T00UX3_A12721VxStMAlmCo = new String[] {""} ;
      T00UX3_n12721VxStMAlmCo = new boolean[] {false} ;
      T00UX3_A12722VxStMSit = new byte[1] ;
      T00UX3_n12722VxStMSit = new boolean[] {false} ;
      T00UX3_A12723VxStMaux = new String[] {""} ;
      T00UX3_n12723VxStMaux = new boolean[] {false} ;
      T00UX3_A12724VxStUsuCod = new String[] {""} ;
      T00UX3_n12724VxStUsuCod = new boolean[] {false} ;
      T00UX3_A12725VxStWrkStn = new String[] {""} ;
      T00UX3_n12725VxStWrkStn = new boolean[] {false} ;
      T00UX3_A12726VxStMAlmOr = new String[] {""} ;
      T00UX3_n12726VxStMAlmOr = new boolean[] {false} ;
      T00UX3_A12727VxStMSitOr = new short[1] ;
      T00UX3_n12727VxStMSitOr = new boolean[] {false} ;
      T00UX3_A12728VxStMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX3_n12728VxStMCan = new boolean[] {false} ;
      T00UX3_A12729VxStMCanOr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX3_n12729VxStMCanOr = new boolean[] {false} ;
      T00UX2_A6224VxLotId = new int[1] ;
      T00UX2_A12730VxStMFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00UX2_A12720VxStMTMov = new String[] {""} ;
      T00UX2_n12720VxStMTMov = new boolean[] {false} ;
      T00UX2_A12721VxStMAlmCo = new String[] {""} ;
      T00UX2_n12721VxStMAlmCo = new boolean[] {false} ;
      T00UX2_A12722VxStMSit = new byte[1] ;
      T00UX2_n12722VxStMSit = new boolean[] {false} ;
      T00UX2_A12723VxStMaux = new String[] {""} ;
      T00UX2_n12723VxStMaux = new boolean[] {false} ;
      T00UX2_A12724VxStUsuCod = new String[] {""} ;
      T00UX2_n12724VxStUsuCod = new boolean[] {false} ;
      T00UX2_A12725VxStWrkStn = new String[] {""} ;
      T00UX2_n12725VxStWrkStn = new boolean[] {false} ;
      T00UX2_A12726VxStMAlmOr = new String[] {""} ;
      T00UX2_n12726VxStMAlmOr = new boolean[] {false} ;
      T00UX2_A12727VxStMSitOr = new short[1] ;
      T00UX2_n12727VxStMSitOr = new boolean[] {false} ;
      T00UX2_A12728VxStMCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX2_n12728VxStMCan = new boolean[] {false} ;
      T00UX2_A12729VxStMCanOr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00UX2_n12729VxStMCanOr = new boolean[] {false} ;
      T00UX40_A6224VxLotId = new int[1] ;
      T00UX40_A12730VxStMFec = new java.util.Date[] {GXutil.nullDate()} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Z13212VxSteMtspm = DecimalUtil.ZERO ;
      ZZ12719VXLotSitF = GXutil.resetTime( GXutil.nullDate() );
      ZZ6318VxLotCan = DecimalUtil.ZERO ;
      ZZ6458VxLotCTe = DecimalUtil.ZERO ;
      ZZ6459VxLotHRA = "" ;
      ZZ11686VxLotHRT = "" ;
      ZZ6642VxLotTeLo = "" ;
      ZZ6643VxLotMaqT = "" ;
      ZZ7422VxLotACru = "" ;
      ZZ8321VxArtTer = "" ;
      ZZ11209VxLotMts = DecimalUtil.ZERO ;
      ZZ13025VxLotMTe = DecimalUtil.ZERO ;
      ZZ11305VxCodExt = "" ;
      ZZ11775VxUsuTej = "" ;
      ZZ12249VxAlmUbi = "" ;
      ZZ12248VxAlmCod = "" ;
      ZZ12251VxComCRCT = "" ;
      ZZ12253VxSteFecCr = GXutil.nullDate() ;
      ZZ12375VxStePedNC = "" ;
      ZZ12376VxSteDibCo = "" ;
      ZZ12885VxSteFecFT = GXutil.resetTime( GXutil.nullDate() );
      ZZ12896VxSteDev = "" ;
      ZZ12919VxSteRsv = "" ;
      ZZ13115VxSTeTejRe = "" ;
      ZZ13294VxSteUniMe = "" ;
      ZZ13295VxSteRdto = DecimalUtil.ZERO ;
      ZZ13212VxSteMtspm = DecimalUtil.ZERO ;
      T00UX41_A11686VxLotHRT = new String[] {""} ;
      T00UX41_n11686VxLotHRT = new boolean[] {false} ;
      T00UX42_A6642VxLotTeLo = new String[] {""} ;
      T00UX42_n6642VxLotTeLo = new boolean[] {false} ;
      T00UX43_A7550VxRapCod = new int[1] ;
      T00UX43_n7550VxRapCod = new boolean[] {false} ;
      T00UX44_A12248VxAlmCod = new String[] {""} ;
      T00UX44_n12248VxAlmCod = new boolean[] {false} ;
      T00UX45_A12248VxAlmCod = new String[] {""} ;
      T00UX45_n12248VxAlmCod = new boolean[] {false} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxroll__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxroll__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxroll__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxroll__default(),
         new Object[] {
             new Object[] {
            T00UX2_A6224VxLotId, T00UX2_A12730VxStMFec, T00UX2_A12720VxStMTMov, T00UX2_n12720VxStMTMov, T00UX2_A12721VxStMAlmCo, T00UX2_n12721VxStMAlmCo, T00UX2_A12722VxStMSit, T00UX2_n12722VxStMSit, T00UX2_A12723VxStMaux, T00UX2_n12723VxStMaux,
            T00UX2_A12724VxStUsuCod, T00UX2_n12724VxStUsuCod, T00UX2_A12725VxStWrkStn, T00UX2_n12725VxStWrkStn, T00UX2_A12726VxStMAlmOr, T00UX2_n12726VxStMAlmOr, T00UX2_A12727VxStMSitOr, T00UX2_n12727VxStMSitOr, T00UX2_A12728VxStMCan, T00UX2_n12728VxStMCan,
            T00UX2_A12729VxStMCanOr, T00UX2_n12729VxStMCanOr
            }
            , new Object[] {
            T00UX3_A6224VxLotId, T00UX3_A12730VxStMFec, T00UX3_A12720VxStMTMov, T00UX3_n12720VxStMTMov, T00UX3_A12721VxStMAlmCo, T00UX3_n12721VxStMAlmCo, T00UX3_A12722VxStMSit, T00UX3_n12722VxStMSit, T00UX3_A12723VxStMaux, T00UX3_n12723VxStMaux,
            T00UX3_A12724VxStUsuCod, T00UX3_n12724VxStUsuCod, T00UX3_A12725VxStWrkStn, T00UX3_n12725VxStWrkStn, T00UX3_A12726VxStMAlmOr, T00UX3_n12726VxStMAlmOr, T00UX3_A12727VxStMSitOr, T00UX3_n12727VxStMSitOr, T00UX3_A12728VxStMCan, T00UX3_n12728VxStMCan,
            T00UX3_A12729VxStMCanOr, T00UX3_n12729VxStMCanOr
            }
            , new Object[] {
            T00UX4_A6224VxLotId, T00UX4_A6300VXLotSit, T00UX4_n6300VXLotSit, T00UX4_A12719VXLotSitF, T00UX4_n12719VXLotSitF, T00UX4_A6303VXLotAnu, T00UX4_n6303VXLotAnu, T00UX4_A6318VxLotCan, T00UX4_n6318VxLotCan, T00UX4_A6458VxLotCTe,
            T00UX4_n6458VxLotCTe, T00UX4_A6459VxLotHRA, T00UX4_n6459VxLotHRA, T00UX4_A11686VxLotHRT, T00UX4_n11686VxLotHRT, T00UX4_A6640VxLotPrvC, T00UX4_n6640VxLotPrvC, T00UX4_A6641VxLotDefPT, T00UX4_n6641VxLotDefPT, T00UX4_A6643VxLotMaqT,
            T00UX4_n6643VxLotMaqT, T00UX4_A7422VxLotACru, T00UX4_n7422VxLotACru, T00UX4_A7423VxLotCalC, T00UX4_n7423VxLotCalC, T00UX4_A8320VxAcParN, T00UX4_n8320VxAcParN, T00UX4_A8321VxArtTer, T00UX4_n8321VxArtTer, T00UX4_A8322VxColCod,
            T00UX4_n8322VxColCod, T00UX4_A11209VxLotMts, T00UX4_n11209VxLotMts, T00UX4_A13025VxLotMTe, T00UX4_n13025VxLotMTe, T00UX4_A11305VxCodExt, T00UX4_n11305VxCodExt, T00UX4_A11775VxUsuTej, T00UX4_n11775VxUsuTej, T00UX4_A12251VxComCRCT,
            T00UX4_n12251VxComCRCT, T00UX4_A12250VxComCRCC, T00UX4_n12250VxComCRCC, T00UX4_A12252VxSteCliDe, T00UX4_n12252VxSteCliDe, T00UX4_A12253VxSteFecCr, T00UX4_n12253VxSteFecCr, T00UX4_A12375VxStePedNC, T00UX4_n12375VxStePedNC, T00UX4_A12376VxSteDibCo,
            T00UX4_n12376VxSteDibCo, T00UX4_A12377VxStePedLi, T00UX4_n12377VxStePedLi, T00UX4_A12749VxSteAct, T00UX4_n12749VxSteAct, T00UX4_A12885VxSteFecFT, T00UX4_n12885VxSteFecFT, T00UX4_A12896VxSteDev, T00UX4_n12896VxSteDev, T00UX4_A12919VxSteRsv,
            T00UX4_n12919VxSteRsv, T00UX4_A13115VxSTeTejRe, T00UX4_n13115VxSTeTejRe, T00UX4_A13202VxSteIdMad, T00UX4_n13202VxSteIdMad, T00UX4_A13294VxSteUniMe, T00UX4_n13294VxSteUniMe, T00UX4_A6642VxLotTeLo, T00UX4_n6642VxLotTeLo, T00UX4_A7550VxRapCod,
            T00UX4_n7550VxRapCod, T00UX4_A12248VxAlmCod, T00UX4_n12248VxAlmCod, T00UX4_A12249VxAlmUbi, T00UX4_n12249VxAlmUbi
            }
            , new Object[] {
            T00UX5_A6224VxLotId, T00UX5_A6300VXLotSit, T00UX5_n6300VXLotSit, T00UX5_A12719VXLotSitF, T00UX5_n12719VXLotSitF, T00UX5_A6303VXLotAnu, T00UX5_n6303VXLotAnu, T00UX5_A6318VxLotCan, T00UX5_n6318VxLotCan, T00UX5_A6458VxLotCTe,
            T00UX5_n6458VxLotCTe, T00UX5_A6459VxLotHRA, T00UX5_n6459VxLotHRA, T00UX5_A11686VxLotHRT, T00UX5_n11686VxLotHRT, T00UX5_A6640VxLotPrvC, T00UX5_n6640VxLotPrvC, T00UX5_A6641VxLotDefPT, T00UX5_n6641VxLotDefPT, T00UX5_A6643VxLotMaqT,
            T00UX5_n6643VxLotMaqT, T00UX5_A7422VxLotACru, T00UX5_n7422VxLotACru, T00UX5_A7423VxLotCalC, T00UX5_n7423VxLotCalC, T00UX5_A8320VxAcParN, T00UX5_n8320VxAcParN, T00UX5_A8321VxArtTer, T00UX5_n8321VxArtTer, T00UX5_A8322VxColCod,
            T00UX5_n8322VxColCod, T00UX5_A11209VxLotMts, T00UX5_n11209VxLotMts, T00UX5_A13025VxLotMTe, T00UX5_n13025VxLotMTe, T00UX5_A11305VxCodExt, T00UX5_n11305VxCodExt, T00UX5_A11775VxUsuTej, T00UX5_n11775VxUsuTej, T00UX5_A12251VxComCRCT,
            T00UX5_n12251VxComCRCT, T00UX5_A12250VxComCRCC, T00UX5_n12250VxComCRCC, T00UX5_A12252VxSteCliDe, T00UX5_n12252VxSteCliDe, T00UX5_A12253VxSteFecCr, T00UX5_n12253VxSteFecCr, T00UX5_A12375VxStePedNC, T00UX5_n12375VxStePedNC, T00UX5_A12376VxSteDibCo,
            T00UX5_n12376VxSteDibCo, T00UX5_A12377VxStePedLi, T00UX5_n12377VxStePedLi, T00UX5_A12749VxSteAct, T00UX5_n12749VxSteAct, T00UX5_A12885VxSteFecFT, T00UX5_n12885VxSteFecFT, T00UX5_A12896VxSteDev, T00UX5_n12896VxSteDev, T00UX5_A12919VxSteRsv,
            T00UX5_n12919VxSteRsv, T00UX5_A13115VxSTeTejRe, T00UX5_n13115VxSTeTejRe, T00UX5_A13202VxSteIdMad, T00UX5_n13202VxSteIdMad, T00UX5_A13294VxSteUniMe, T00UX5_n13294VxSteUniMe, T00UX5_A6642VxLotTeLo, T00UX5_n6642VxLotTeLo, T00UX5_A7550VxRapCod,
            T00UX5_n7550VxRapCod, T00UX5_A12248VxAlmCod, T00UX5_n12248VxAlmCod, T00UX5_A12249VxAlmUbi, T00UX5_n12249VxAlmUbi
            }
            , new Object[] {
            T00UX6_A6642VxLotTeLo
            }
            , new Object[] {
            T00UX7_A7550VxRapCod
            }
            , new Object[] {
            T00UX8_A12248VxAlmCod
            }
            , new Object[] {
            T00UX9_A12248VxAlmCod
            }
            , new Object[] {
            T00UX10_A13211VxSTePml, T00UX10_A13295VxSteRdto
            }
            , new Object[] {
            T00UX12_A8323VxHRComp
            }
            , new Object[] {
            T00UX14_A11769VxArTECod, T00UX14_A6224VxLotId, T00UX14_A6300VXLotSit, T00UX14_n6300VXLotSit, T00UX14_A12719VXLotSitF, T00UX14_n12719VXLotSitF, T00UX14_A6303VXLotAnu, T00UX14_n6303VXLotAnu, T00UX14_A6318VxLotCan, T00UX14_n6318VxLotCan,
            T00UX14_A6458VxLotCTe, T00UX14_n6458VxLotCTe, T00UX14_A6459VxLotHRA, T00UX14_n6459VxLotHRA, T00UX14_A11686VxLotHRT, T00UX14_n11686VxLotHRT, T00UX14_A6640VxLotPrvC, T00UX14_n6640VxLotPrvC, T00UX14_A6641VxLotDefPT, T00UX14_n6641VxLotDefPT,
            T00UX14_A6643VxLotMaqT, T00UX14_n6643VxLotMaqT, T00UX14_A7422VxLotACru, T00UX14_n7422VxLotACru, T00UX14_A7423VxLotCalC, T00UX14_n7423VxLotCalC, T00UX14_A8320VxAcParN, T00UX14_n8320VxAcParN, T00UX14_A8321VxArtTer, T00UX14_n8321VxArtTer,
            T00UX14_A8322VxColCod, T00UX14_n8322VxColCod, T00UX14_A11209VxLotMts, T00UX14_n11209VxLotMts, T00UX14_A13025VxLotMTe, T00UX14_n13025VxLotMTe, T00UX14_A11305VxCodExt, T00UX14_n11305VxCodExt, T00UX14_A11775VxUsuTej, T00UX14_n11775VxUsuTej,
            T00UX14_A12251VxComCRCT, T00UX14_n12251VxComCRCT, T00UX14_A12250VxComCRCC, T00UX14_n12250VxComCRCC, T00UX14_A12252VxSteCliDe, T00UX14_n12252VxSteCliDe, T00UX14_A12253VxSteFecCr, T00UX14_n12253VxSteFecCr, T00UX14_A12375VxStePedNC, T00UX14_n12375VxStePedNC,
            T00UX14_A12376VxSteDibCo, T00UX14_n12376VxSteDibCo, T00UX14_A12377VxStePedLi, T00UX14_n12377VxStePedLi, T00UX14_A12749VxSteAct, T00UX14_n12749VxSteAct, T00UX14_A12885VxSteFecFT, T00UX14_n12885VxSteFecFT, T00UX14_A12896VxSteDev, T00UX14_n12896VxSteDev,
            T00UX14_A12919VxSteRsv, T00UX14_n12919VxSteRsv, T00UX14_A13115VxSTeTejRe, T00UX14_n13115VxSTeTejRe, T00UX14_A13202VxSteIdMad, T00UX14_n13202VxSteIdMad, T00UX14_A13294VxSteUniMe, T00UX14_n13294VxSteUniMe, T00UX14_A6642VxLotTeLo, T00UX14_n6642VxLotTeLo,
            T00UX14_A7550VxRapCod, T00UX14_n7550VxRapCod, T00UX14_A12248VxAlmCod, T00UX14_n12248VxAlmCod, T00UX14_A12249VxAlmUbi, T00UX14_n12249VxAlmUbi, T00UX14_A13211VxSTePml, T00UX14_A13295VxSteRdto, T00UX14_A8323VxHRComp
            }
            , new Object[] {
            T00UX15_A11686VxLotHRT, T00UX15_n11686VxLotHRT
            }
            , new Object[] {
            T00UX17_A8323VxHRComp
            }
            , new Object[] {
            T00UX18_A6642VxLotTeLo
            }
            , new Object[] {
            T00UX19_A13211VxSTePml, T00UX19_A13295VxSteRdto
            }
            , new Object[] {
            T00UX20_A7550VxRapCod
            }
            , new Object[] {
            T00UX21_A12248VxAlmCod
            }
            , new Object[] {
            T00UX22_A12248VxAlmCod
            }
            , new Object[] {
            T00UX23_A6224VxLotId
            }
            , new Object[] {
            T00UX24_A6224VxLotId
            }
            , new Object[] {
            T00UX25_A6224VxLotId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00UX30_A8323VxHRComp
            }
            , new Object[] {
            T00UX31_A13211VxSTePml, T00UX31_A13295VxSteRdto
            }
            , new Object[] {
            T00UX32_A7525VxOFabTip, T00UX32_A12372VxOSCod, T00UX32_A6224VxLotId
            }
            , new Object[] {
            T00UX33_A6224VxLotId, T00UX33_A8314VxHREmp, T00UX33_A8315VxHRBar, T00UX33_A8316VxHrReo, T00UX33_A8317VxHrPar
            }
            , new Object[] {
            T00UX34_A6224VxLotId
            }
            , new Object[] {
            T00UX35_A6224VxLotId, T00UX35_A12730VxStMFec, T00UX35_A12720VxStMTMov, T00UX35_n12720VxStMTMov, T00UX35_A12721VxStMAlmCo, T00UX35_n12721VxStMAlmCo, T00UX35_A12722VxStMSit, T00UX35_n12722VxStMSit, T00UX35_A12723VxStMaux, T00UX35_n12723VxStMaux,
            T00UX35_A12724VxStUsuCod, T00UX35_n12724VxStUsuCod, T00UX35_A12725VxStWrkStn, T00UX35_n12725VxStWrkStn, T00UX35_A12726VxStMAlmOr, T00UX35_n12726VxStMAlmOr, T00UX35_A12727VxStMSitOr, T00UX35_n12727VxStMSitOr, T00UX35_A12728VxStMCan, T00UX35_n12728VxStMCan,
            T00UX35_A12729VxStMCanOr, T00UX35_n12729VxStMCanOr
            }
            , new Object[] {
            T00UX36_A6224VxLotId, T00UX36_A12730VxStMFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00UX40_A6224VxLotId, T00UX40_A12730VxStMFec
            }
            , new Object[] {
            T00UX41_A11686VxLotHRT, T00UX41_n11686VxLotHRT
            }
            , new Object[] {
            T00UX42_A6642VxLotTeLo
            }
            , new Object[] {
            T00UX43_A7550VxRapCod
            }
            , new Object[] {
            T00UX44_A12248VxAlmCod
            }
            , new Object[] {
            T00UX45_A12248VxAlmCod
            }
         }
      );
   }

   private byte Z6300VXLotSit ;
   private byte Z6303VXLotAnu ;
   private byte Z7423VxLotCalC ;
   private byte Z12749VxSteAct ;
   private byte Z12722VxStMSit ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6300VXLotSit ;
   private byte A6303VXLotAnu ;
   private byte A7423VxLotCalC ;
   private byte A8323VxHRComp ;
   private byte A12749VxSteAct ;
   private byte A12722VxStMSit ;
   private byte Z8323VxHRComp ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ6300VXLotSit ;
   private byte ZZ6303VXLotAnu ;
   private byte ZZ7423VxLotCalC ;
   private byte ZZ12749VxSteAct ;
   private byte ZZ8323VxHRComp ;
   private short Z6641VxLotDefPT ;
   private short Z12377VxStePedLi ;
   private short Z12727VxStMSitOr ;
   private short nRcdDeleted_1750 ;
   private short nRcdExists_1750 ;
   private short nIsMod_1750 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6641VxLotDefPT ;
   private short A12377VxStePedLi ;
   private short A13211VxSTePml ;
   private short nBlankRcdCount1750 ;
   private short RcdFound1750 ;
   private short nBlankRcdUsr1750 ;
   private short A12727VxStMSitOr ;
   private short Z13211VxSTePml ;
   private short RcdFound916 ;
   private short nIsDirty_916 ;
   private short nIsDirty_1750 ;
   private short ZZ6641VxLotDefPT ;
   private short ZZ12377VxStePedLi ;
   private short ZZ13211VxSTePml ;
   private int Z6224VxLotId ;
   private int Z6640VxLotPrvC ;
   private int Z8320VxAcParN ;
   private int Z8322VxColCod ;
   private int Z12250VxComCRCC ;
   private int Z12252VxSteCliDe ;
   private int Z13202VxSteIdMad ;
   private int Z7550VxRapCod ;
   private int nRC_GXsfl_230 ;
   private int nGXsfl_230_idx=1 ;
   private int A6224VxLotId ;
   private int A7550VxRapCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxLotId_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtVXLotSit_Enabled ;
   private int edtVXLotSitF_Enabled ;
   private int edtVXLotAnu_Enabled ;
   private int edtVxLotCan_Enabled ;
   private int edtVxLotCTe_Enabled ;
   private int edtVxLotHRA_Enabled ;
   private int edtVxLotHRT_Enabled ;
   private int A6640VxLotPrvC ;
   private int edtVxLotPrvC_Enabled ;
   private int edtVxLotDefPT_Enabled ;
   private int edtVxLotTeLo_Enabled ;
   private int edtVxLotMaqT_Enabled ;
   private int edtVxLotACru_Enabled ;
   private int edtVxLotCalC_Enabled ;
   private int edtVxRapCod_Enabled ;
   private int A8320VxAcParN ;
   private int edtVxAcParN_Enabled ;
   private int edtVxArtTer_Enabled ;
   private int A8322VxColCod ;
   private int edtVxColCod_Enabled ;
   private int edtVxHRComp_Enabled ;
   private int edtVxLotMts_Enabled ;
   private int edtVxLotMTe_Enabled ;
   private int edtVxCodExt_Enabled ;
   private int edtVxUsuTej_Enabled ;
   private int edtVxAlmUbi_Enabled ;
   private int edtVxAlmCod_Enabled ;
   private int edtVxComCRCT_Enabled ;
   private int A12250VxComCRCC ;
   private int edtVxComCRCC_Enabled ;
   private int A12252VxSteCliDe ;
   private int edtVxSteCliDe_Enabled ;
   private int edtVxSteFecCr_Enabled ;
   private int edtVxStePedNC_Enabled ;
   private int edtVxSteDibCo_Enabled ;
   private int edtVxStePedLi_Enabled ;
   private int edtVxSteAct_Enabled ;
   private int edtVxSteFecFT_Enabled ;
   private int edtVxSteDev_Enabled ;
   private int edtVxSteRsv_Enabled ;
   private int edtVxSTeTejRe_Enabled ;
   private int A13202VxSteIdMad ;
   private int edtVxSteIdMad_Enabled ;
   private int edtVxSTePml_Enabled ;
   private int edtVxSteMtspm_Enabled ;
   private int edtVxSteRdto_Enabled ;
   private int edtavnRcdDeleted_1750_Enabled ;
   private int edtVxStMFec_Enabled ;
   private int edtVxStMTMov_Enabled ;
   private int edtVxStMAlmCo_Enabled ;
   private int edtVxStMSit_Enabled ;
   private int edtVxStMaux_Enabled ;
   private int edtVxStUsuCod_Enabled ;
   private int edtVxStWrkStn_Enabled ;
   private int edtVxStMAlmOr_Enabled ;
   private int edtVxStMSitOr_Enabled ;
   private int edtVxStMCan_Enabled ;
   private int edtVxStMCanOr_Enabled ;
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
   private int defedtVxStMFec_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtVxSteRdto_Backcolor ;
   private int edtVxSteMtspm_Backcolor ;
   private int edtVxSTePml_Backcolor ;
   private int edtVxSteIdMad_Backcolor ;
   private int edtVxSTeTejRe_Backcolor ;
   private int edtVxSteRsv_Backcolor ;
   private int edtVxSteDev_Backcolor ;
   private int edtVxSteFecFT_Backcolor ;
   private int edtVxSteAct_Backcolor ;
   private int edtVxStePedLi_Backcolor ;
   private int edtVxSteDibCo_Backcolor ;
   private int edtVxStePedNC_Backcolor ;
   private int edtVxSteFecCr_Backcolor ;
   private int edtVxSteCliDe_Backcolor ;
   private int edtVxComCRCC_Backcolor ;
   private int edtVxComCRCT_Backcolor ;
   private int edtVxAlmCod_Backcolor ;
   private int edtVxAlmUbi_Backcolor ;
   private int edtVxUsuTej_Backcolor ;
   private int edtVxCodExt_Backcolor ;
   private int edtVxLotMTe_Backcolor ;
   private int edtVxLotMts_Backcolor ;
   private int edtVxHRComp_Backcolor ;
   private int edtVxColCod_Backcolor ;
   private int edtVxArtTer_Backcolor ;
   private int edtVxAcParN_Backcolor ;
   private int edtVxRapCod_Backcolor ;
   private int edtVxLotCalC_Backcolor ;
   private int edtVxLotACru_Backcolor ;
   private int edtVxLotMaqT_Backcolor ;
   private int edtVxLotTeLo_Backcolor ;
   private int edtVxLotDefPT_Backcolor ;
   private int edtVxLotPrvC_Backcolor ;
   private int edtVxLotHRT_Backcolor ;
   private int edtVxLotHRA_Backcolor ;
   private int edtVxLotCTe_Backcolor ;
   private int edtVxLotCan_Backcolor ;
   private int edtVXLotAnu_Backcolor ;
   private int edtVXLotSitF_Backcolor ;
   private int edtVXLotSit_Backcolor ;
   private int edtVxLotId_Backcolor ;
   private int ZZ6224VxLotId ;
   private int ZZ6640VxLotPrvC ;
   private int ZZ7550VxRapCod ;
   private int ZZ8320VxAcParN ;
   private int ZZ8322VxColCod ;
   private int ZZ12250VxComCRCC ;
   private int ZZ12252VxSteCliDe ;
   private int ZZ13202VxSteIdMad ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6318VxLotCan ;
   private java.math.BigDecimal Z6458VxLotCTe ;
   private java.math.BigDecimal Z11209VxLotMts ;
   private java.math.BigDecimal Z13025VxLotMTe ;
   private java.math.BigDecimal Z12728VxStMCan ;
   private java.math.BigDecimal Z12729VxStMCanOr ;
   private java.math.BigDecimal A6318VxLotCan ;
   private java.math.BigDecimal A6458VxLotCTe ;
   private java.math.BigDecimal A11209VxLotMts ;
   private java.math.BigDecimal A13025VxLotMTe ;
   private java.math.BigDecimal A13212VxSteMtspm ;
   private java.math.BigDecimal A13295VxSteRdto ;
   private java.math.BigDecimal A12728VxStMCan ;
   private java.math.BigDecimal A12729VxStMCanOr ;
   private java.math.BigDecimal Z13295VxSteRdto ;
   private java.math.BigDecimal Z13212VxSteMtspm ;
   private java.math.BigDecimal ZZ6318VxLotCan ;
   private java.math.BigDecimal ZZ6458VxLotCTe ;
   private java.math.BigDecimal ZZ11209VxLotMts ;
   private java.math.BigDecimal ZZ13025VxLotMTe ;
   private java.math.BigDecimal ZZ13295VxSteRdto ;
   private java.math.BigDecimal ZZ13212VxSteMtspm ;
   private String sPrefix ;
   private String Z6459VxLotHRA ;
   private String Z11686VxLotHRT ;
   private String Z6643VxLotMaqT ;
   private String Z7422VxLotACru ;
   private String Z8321VxArtTer ;
   private String Z11305VxCodExt ;
   private String Z11775VxUsuTej ;
   private String Z12251VxComCRCT ;
   private String Z12375VxStePedNC ;
   private String Z12376VxSteDibCo ;
   private String Z12896VxSteDev ;
   private String Z12919VxSteRsv ;
   private String Z13115VxSTeTejRe ;
   private String Z13294VxSteUniMe ;
   private String Z6642VxLotTeLo ;
   private String Z12248VxAlmCod ;
   private String Z12249VxAlmUbi ;
   private String Z12720VxStMTMov ;
   private String Z12721VxStMAlmCo ;
   private String Z12723VxStMaux ;
   private String Z12724VxStUsuCod ;
   private String Z12725VxStWrkStn ;
   private String Z12726VxStMAlmOr ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A6642VxLotTeLo ;
   private String A7422VxLotACru ;
   private String A12248VxAlmCod ;
   private String A12249VxAlmUbi ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxLotId_Internalname ;
   private String sGXsfl_230_idx="0001" ;
   private String Gx_mode ;
   private String A13294VxSteUniMe ;
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
   private String edtVxLotId_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVXLotSit_Internalname ;
   private String edtVXLotSit_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVXLotSitF_Internalname ;
   private String edtVXLotSitF_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVXLotAnu_Internalname ;
   private String edtVXLotAnu_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxLotCan_Internalname ;
   private String edtVxLotCan_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVxLotCTe_Internalname ;
   private String edtVxLotCTe_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtVxLotHRA_Internalname ;
   private String A6459VxLotHRA ;
   private String edtVxLotHRA_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtVxLotHRT_Internalname ;
   private String A11686VxLotHRT ;
   private String edtVxLotHRT_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtVxLotPrvC_Internalname ;
   private String edtVxLotPrvC_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtVxLotDefPT_Internalname ;
   private String edtVxLotDefPT_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtVxLotTeLo_Internalname ;
   private String edtVxLotTeLo_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtVxLotMaqT_Internalname ;
   private String A6643VxLotMaqT ;
   private String edtVxLotMaqT_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtVxLotACru_Internalname ;
   private String edtVxLotACru_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtVxLotCalC_Internalname ;
   private String edtVxLotCalC_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtVxRapCod_Internalname ;
   private String edtVxRapCod_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtVxAcParN_Internalname ;
   private String edtVxAcParN_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtVxArtTer_Internalname ;
   private String A8321VxArtTer ;
   private String edtVxArtTer_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtVxColCod_Internalname ;
   private String edtVxColCod_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtVxHRComp_Internalname ;
   private String edtVxHRComp_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtVxLotMts_Internalname ;
   private String edtVxLotMts_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtVxLotMTe_Internalname ;
   private String edtVxLotMTe_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtVxCodExt_Internalname ;
   private String A11305VxCodExt ;
   private String edtVxCodExt_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtVxUsuTej_Internalname ;
   private String A11775VxUsuTej ;
   private String edtVxUsuTej_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtVxAlmUbi_Internalname ;
   private String edtVxAlmUbi_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtVxAlmCod_Internalname ;
   private String edtVxAlmCod_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtVxComCRCT_Internalname ;
   private String A12251VxComCRCT ;
   private String edtVxComCRCT_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtVxComCRCC_Internalname ;
   private String edtVxComCRCC_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtVxSteCliDe_Internalname ;
   private String edtVxSteCliDe_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtVxSteFecCr_Internalname ;
   private String edtVxSteFecCr_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtVxStePedNC_Internalname ;
   private String A12375VxStePedNC ;
   private String edtVxStePedNC_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtVxSteDibCo_Internalname ;
   private String A12376VxSteDibCo ;
   private String edtVxSteDibCo_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtVxStePedLi_Internalname ;
   private String edtVxStePedLi_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtVxSteAct_Internalname ;
   private String edtVxSteAct_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtVxSteFecFT_Internalname ;
   private String edtVxSteFecFT_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtVxSteDev_Internalname ;
   private String A12896VxSteDev ;
   private String edtVxSteDev_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtVxSteRsv_Internalname ;
   private String A12919VxSteRsv ;
   private String edtVxSteRsv_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtVxSTeTejRe_Internalname ;
   private String A13115VxSTeTejRe ;
   private String edtVxSTeTejRe_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtVxSteIdMad_Internalname ;
   private String edtVxSteIdMad_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtVxSTePml_Internalname ;
   private String edtVxSTePml_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtVxSteMtspm_Internalname ;
   private String edtVxSteMtspm_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtVxSteRdto_Internalname ;
   private String edtVxSteRdto_Jsonclick ;
   private String sMode1750 ;
   private String edtavnRcdDeleted_1750_Internalname ;
   private String edtVxStMFec_Internalname ;
   private String edtVxStMTMov_Internalname ;
   private String edtVxStMAlmCo_Internalname ;
   private String edtVxStMSit_Internalname ;
   private String edtVxStMaux_Internalname ;
   private String edtVxStUsuCod_Internalname ;
   private String edtVxStWrkStn_Internalname ;
   private String edtVxStMAlmOr_Internalname ;
   private String edtVxStMSitOr_Internalname ;
   private String edtVxStMCan_Internalname ;
   private String edtVxStMCanOr_Internalname ;
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
   private String sMode916 ;
   private String GXCCtl ;
   private String A12720VxStMTMov ;
   private String A12721VxStMAlmCo ;
   private String A12723VxStMaux ;
   private String A12724VxStUsuCod ;
   private String A12725VxStWrkStn ;
   private String A12726VxStMAlmOr ;
   private String sGXsfl_230_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1750_Jsonclick ;
   private String edtVxStMFec_Jsonclick ;
   private String edtVxStMTMov_Jsonclick ;
   private String edtVxStMAlmCo_Jsonclick ;
   private String edtVxStMSit_Jsonclick ;
   private String edtVxStMaux_Jsonclick ;
   private String edtVxStUsuCod_Jsonclick ;
   private String edtVxStWrkStn_Jsonclick ;
   private String edtVxStMAlmOr_Jsonclick ;
   private String edtVxStMSitOr_Jsonclick ;
   private String edtVxStMCan_Jsonclick ;
   private String edtVxStMCanOr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ6459VxLotHRA ;
   private String ZZ11686VxLotHRT ;
   private String ZZ6642VxLotTeLo ;
   private String ZZ6643VxLotMaqT ;
   private String ZZ7422VxLotACru ;
   private String ZZ8321VxArtTer ;
   private String ZZ11305VxCodExt ;
   private String ZZ11775VxUsuTej ;
   private String ZZ12249VxAlmUbi ;
   private String ZZ12248VxAlmCod ;
   private String ZZ12251VxComCRCT ;
   private String ZZ12375VxStePedNC ;
   private String ZZ12376VxSteDibCo ;
   private String ZZ12896VxSteDev ;
   private String ZZ12919VxSteRsv ;
   private String ZZ13115VxSTeTejRe ;
   private String ZZ13294VxSteUniMe ;
   private java.util.Date Z12719VXLotSitF ;
   private java.util.Date Z12885VxSteFecFT ;
   private java.util.Date Z12730VxStMFec ;
   private java.util.Date A12719VXLotSitF ;
   private java.util.Date A12885VxSteFecFT ;
   private java.util.Date A12730VxStMFec ;
   private java.util.Date ZZ12719VXLotSitF ;
   private java.util.Date ZZ12885VxSteFecFT ;
   private java.util.Date Z12253VxSteFecCr ;
   private java.util.Date A12253VxSteFecCr ;
   private java.util.Date ZZ12253VxSteFecCr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n6642VxLotTeLo ;
   private boolean n7422VxLotACru ;
   private boolean n7550VxRapCod ;
   private boolean n12248VxAlmCod ;
   private boolean n12249VxAlmUbi ;
   private boolean wbErr ;
   private boolean n13294VxSteUniMe ;
   private boolean bGXsfl_230_Refreshing=false ;
   private boolean n6300VXLotSit ;
   private boolean n12719VXLotSitF ;
   private boolean n6303VXLotAnu ;
   private boolean n6318VxLotCan ;
   private boolean n6458VxLotCTe ;
   private boolean n6459VxLotHRA ;
   private boolean n11686VxLotHRT ;
   private boolean n6640VxLotPrvC ;
   private boolean n6641VxLotDefPT ;
   private boolean n6643VxLotMaqT ;
   private boolean n7423VxLotCalC ;
   private boolean n8320VxAcParN ;
   private boolean n8321VxArtTer ;
   private boolean n8322VxColCod ;
   private boolean n11209VxLotMts ;
   private boolean n13025VxLotMTe ;
   private boolean n11305VxCodExt ;
   private boolean n11775VxUsuTej ;
   private boolean n12251VxComCRCT ;
   private boolean n12250VxComCRCC ;
   private boolean n12252VxSteCliDe ;
   private boolean n12253VxSteFecCr ;
   private boolean n12375VxStePedNC ;
   private boolean n12376VxSteDibCo ;
   private boolean n12377VxStePedLi ;
   private boolean n12749VxSteAct ;
   private boolean n12885VxSteFecFT ;
   private boolean n12896VxSteDev ;
   private boolean n12919VxSteRsv ;
   private boolean n13115VxSTeTejRe ;
   private boolean n13202VxSteIdMad ;
   private boolean Gx_longc ;
   private boolean n12720VxStMTMov ;
   private boolean n12721VxStMAlmCo ;
   private boolean n12722VxStMSit ;
   private boolean n12723VxStMaux ;
   private boolean n12724VxStUsuCod ;
   private boolean n12725VxStWrkStn ;
   private boolean n12726VxStMAlmOr ;
   private boolean n12727VxStMSitOr ;
   private boolean n12728VxStMCan ;
   private boolean n12729VxStMCanOr ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private HTMLChoice cmbVxSteUniMe ;
   private IDataStoreProvider pr_default ;
   private String[] T00UX14_A11769VxArTECod ;
   private int[] T00UX14_A6224VxLotId ;
   private byte[] T00UX14_A6300VXLotSit ;
   private boolean[] T00UX14_n6300VXLotSit ;
   private java.util.Date[] T00UX14_A12719VXLotSitF ;
   private boolean[] T00UX14_n12719VXLotSitF ;
   private byte[] T00UX14_A6303VXLotAnu ;
   private boolean[] T00UX14_n6303VXLotAnu ;
   private java.math.BigDecimal[] T00UX14_A6318VxLotCan ;
   private boolean[] T00UX14_n6318VxLotCan ;
   private java.math.BigDecimal[] T00UX14_A6458VxLotCTe ;
   private boolean[] T00UX14_n6458VxLotCTe ;
   private String[] T00UX14_A6459VxLotHRA ;
   private boolean[] T00UX14_n6459VxLotHRA ;
   private String[] T00UX14_A11686VxLotHRT ;
   private boolean[] T00UX14_n11686VxLotHRT ;
   private int[] T00UX14_A6640VxLotPrvC ;
   private boolean[] T00UX14_n6640VxLotPrvC ;
   private short[] T00UX14_A6641VxLotDefPT ;
   private boolean[] T00UX14_n6641VxLotDefPT ;
   private String[] T00UX14_A6643VxLotMaqT ;
   private boolean[] T00UX14_n6643VxLotMaqT ;
   private String[] T00UX14_A7422VxLotACru ;
   private boolean[] T00UX14_n7422VxLotACru ;
   private byte[] T00UX14_A7423VxLotCalC ;
   private boolean[] T00UX14_n7423VxLotCalC ;
   private int[] T00UX14_A8320VxAcParN ;
   private boolean[] T00UX14_n8320VxAcParN ;
   private String[] T00UX14_A8321VxArtTer ;
   private boolean[] T00UX14_n8321VxArtTer ;
   private int[] T00UX14_A8322VxColCod ;
   private boolean[] T00UX14_n8322VxColCod ;
   private java.math.BigDecimal[] T00UX14_A11209VxLotMts ;
   private boolean[] T00UX14_n11209VxLotMts ;
   private java.math.BigDecimal[] T00UX14_A13025VxLotMTe ;
   private boolean[] T00UX14_n13025VxLotMTe ;
   private String[] T00UX14_A11305VxCodExt ;
   private boolean[] T00UX14_n11305VxCodExt ;
   private String[] T00UX14_A11775VxUsuTej ;
   private boolean[] T00UX14_n11775VxUsuTej ;
   private String[] T00UX14_A12251VxComCRCT ;
   private boolean[] T00UX14_n12251VxComCRCT ;
   private int[] T00UX14_A12250VxComCRCC ;
   private boolean[] T00UX14_n12250VxComCRCC ;
   private int[] T00UX14_A12252VxSteCliDe ;
   private boolean[] T00UX14_n12252VxSteCliDe ;
   private java.util.Date[] T00UX14_A12253VxSteFecCr ;
   private boolean[] T00UX14_n12253VxSteFecCr ;
   private String[] T00UX14_A12375VxStePedNC ;
   private boolean[] T00UX14_n12375VxStePedNC ;
   private String[] T00UX14_A12376VxSteDibCo ;
   private boolean[] T00UX14_n12376VxSteDibCo ;
   private short[] T00UX14_A12377VxStePedLi ;
   private boolean[] T00UX14_n12377VxStePedLi ;
   private byte[] T00UX14_A12749VxSteAct ;
   private boolean[] T00UX14_n12749VxSteAct ;
   private java.util.Date[] T00UX14_A12885VxSteFecFT ;
   private boolean[] T00UX14_n12885VxSteFecFT ;
   private String[] T00UX14_A12896VxSteDev ;
   private boolean[] T00UX14_n12896VxSteDev ;
   private String[] T00UX14_A12919VxSteRsv ;
   private boolean[] T00UX14_n12919VxSteRsv ;
   private String[] T00UX14_A13115VxSTeTejRe ;
   private boolean[] T00UX14_n13115VxSTeTejRe ;
   private int[] T00UX14_A13202VxSteIdMad ;
   private boolean[] T00UX14_n13202VxSteIdMad ;
   private String[] T00UX14_A13294VxSteUniMe ;
   private boolean[] T00UX14_n13294VxSteUniMe ;
   private String[] T00UX14_A6642VxLotTeLo ;
   private boolean[] T00UX14_n6642VxLotTeLo ;
   private int[] T00UX14_A7550VxRapCod ;
   private boolean[] T00UX14_n7550VxRapCod ;
   private String[] T00UX14_A12248VxAlmCod ;
   private boolean[] T00UX14_n12248VxAlmCod ;
   private String[] T00UX14_A12249VxAlmUbi ;
   private boolean[] T00UX14_n12249VxAlmUbi ;
   private short[] T00UX14_A13211VxSTePml ;
   private java.math.BigDecimal[] T00UX14_A13295VxSteRdto ;
   private byte[] T00UX14_A8323VxHRComp ;
   private byte[] T00UX12_A8323VxHRComp ;
   private String[] T00UX15_A11686VxLotHRT ;
   private boolean[] T00UX15_n11686VxLotHRT ;
   private String[] T00UX6_A6642VxLotTeLo ;
   private boolean[] T00UX6_n6642VxLotTeLo ;
   private short[] T00UX10_A13211VxSTePml ;
   private java.math.BigDecimal[] T00UX10_A13295VxSteRdto ;
   private int[] T00UX7_A7550VxRapCod ;
   private boolean[] T00UX7_n7550VxRapCod ;
   private String[] T00UX9_A12248VxAlmCod ;
   private boolean[] T00UX9_n12248VxAlmCod ;
   private String[] T00UX8_A12248VxAlmCod ;
   private boolean[] T00UX8_n12248VxAlmCod ;
   private byte[] T00UX17_A8323VxHRComp ;
   private String[] T00UX18_A6642VxLotTeLo ;
   private boolean[] T00UX18_n6642VxLotTeLo ;
   private short[] T00UX19_A13211VxSTePml ;
   private java.math.BigDecimal[] T00UX19_A13295VxSteRdto ;
   private int[] T00UX20_A7550VxRapCod ;
   private boolean[] T00UX20_n7550VxRapCod ;
   private String[] T00UX21_A12248VxAlmCod ;
   private boolean[] T00UX21_n12248VxAlmCod ;
   private String[] T00UX22_A12248VxAlmCod ;
   private boolean[] T00UX22_n12248VxAlmCod ;
   private int[] T00UX23_A6224VxLotId ;
   private int[] T00UX5_A6224VxLotId ;
   private byte[] T00UX5_A6300VXLotSit ;
   private boolean[] T00UX5_n6300VXLotSit ;
   private java.util.Date[] T00UX5_A12719VXLotSitF ;
   private boolean[] T00UX5_n12719VXLotSitF ;
   private byte[] T00UX5_A6303VXLotAnu ;
   private boolean[] T00UX5_n6303VXLotAnu ;
   private java.math.BigDecimal[] T00UX5_A6318VxLotCan ;
   private boolean[] T00UX5_n6318VxLotCan ;
   private java.math.BigDecimal[] T00UX5_A6458VxLotCTe ;
   private boolean[] T00UX5_n6458VxLotCTe ;
   private String[] T00UX5_A6459VxLotHRA ;
   private boolean[] T00UX5_n6459VxLotHRA ;
   private String[] T00UX5_A11686VxLotHRT ;
   private boolean[] T00UX5_n11686VxLotHRT ;
   private int[] T00UX5_A6640VxLotPrvC ;
   private boolean[] T00UX5_n6640VxLotPrvC ;
   private short[] T00UX5_A6641VxLotDefPT ;
   private boolean[] T00UX5_n6641VxLotDefPT ;
   private String[] T00UX5_A6643VxLotMaqT ;
   private boolean[] T00UX5_n6643VxLotMaqT ;
   private String[] T00UX5_A7422VxLotACru ;
   private boolean[] T00UX5_n7422VxLotACru ;
   private byte[] T00UX5_A7423VxLotCalC ;
   private boolean[] T00UX5_n7423VxLotCalC ;
   private int[] T00UX5_A8320VxAcParN ;
   private boolean[] T00UX5_n8320VxAcParN ;
   private String[] T00UX5_A8321VxArtTer ;
   private boolean[] T00UX5_n8321VxArtTer ;
   private int[] T00UX5_A8322VxColCod ;
   private boolean[] T00UX5_n8322VxColCod ;
   private java.math.BigDecimal[] T00UX5_A11209VxLotMts ;
   private boolean[] T00UX5_n11209VxLotMts ;
   private java.math.BigDecimal[] T00UX5_A13025VxLotMTe ;
   private boolean[] T00UX5_n13025VxLotMTe ;
   private String[] T00UX5_A11305VxCodExt ;
   private boolean[] T00UX5_n11305VxCodExt ;
   private String[] T00UX5_A11775VxUsuTej ;
   private boolean[] T00UX5_n11775VxUsuTej ;
   private String[] T00UX5_A12251VxComCRCT ;
   private boolean[] T00UX5_n12251VxComCRCT ;
   private int[] T00UX5_A12250VxComCRCC ;
   private boolean[] T00UX5_n12250VxComCRCC ;
   private int[] T00UX5_A12252VxSteCliDe ;
   private boolean[] T00UX5_n12252VxSteCliDe ;
   private java.util.Date[] T00UX5_A12253VxSteFecCr ;
   private boolean[] T00UX5_n12253VxSteFecCr ;
   private String[] T00UX5_A12375VxStePedNC ;
   private boolean[] T00UX5_n12375VxStePedNC ;
   private String[] T00UX5_A12376VxSteDibCo ;
   private boolean[] T00UX5_n12376VxSteDibCo ;
   private short[] T00UX5_A12377VxStePedLi ;
   private boolean[] T00UX5_n12377VxStePedLi ;
   private byte[] T00UX5_A12749VxSteAct ;
   private boolean[] T00UX5_n12749VxSteAct ;
   private java.util.Date[] T00UX5_A12885VxSteFecFT ;
   private boolean[] T00UX5_n12885VxSteFecFT ;
   private String[] T00UX5_A12896VxSteDev ;
   private boolean[] T00UX5_n12896VxSteDev ;
   private String[] T00UX5_A12919VxSteRsv ;
   private boolean[] T00UX5_n12919VxSteRsv ;
   private String[] T00UX5_A13115VxSTeTejRe ;
   private boolean[] T00UX5_n13115VxSTeTejRe ;
   private int[] T00UX5_A13202VxSteIdMad ;
   private boolean[] T00UX5_n13202VxSteIdMad ;
   private String[] T00UX5_A13294VxSteUniMe ;
   private boolean[] T00UX5_n13294VxSteUniMe ;
   private String[] T00UX5_A6642VxLotTeLo ;
   private boolean[] T00UX5_n6642VxLotTeLo ;
   private int[] T00UX5_A7550VxRapCod ;
   private boolean[] T00UX5_n7550VxRapCod ;
   private String[] T00UX5_A12248VxAlmCod ;
   private boolean[] T00UX5_n12248VxAlmCod ;
   private String[] T00UX5_A12249VxAlmUbi ;
   private boolean[] T00UX5_n12249VxAlmUbi ;
   private int[] T00UX24_A6224VxLotId ;
   private int[] T00UX25_A6224VxLotId ;
   private int[] T00UX4_A6224VxLotId ;
   private byte[] T00UX4_A6300VXLotSit ;
   private boolean[] T00UX4_n6300VXLotSit ;
   private java.util.Date[] T00UX4_A12719VXLotSitF ;
   private boolean[] T00UX4_n12719VXLotSitF ;
   private byte[] T00UX4_A6303VXLotAnu ;
   private boolean[] T00UX4_n6303VXLotAnu ;
   private java.math.BigDecimal[] T00UX4_A6318VxLotCan ;
   private boolean[] T00UX4_n6318VxLotCan ;
   private java.math.BigDecimal[] T00UX4_A6458VxLotCTe ;
   private boolean[] T00UX4_n6458VxLotCTe ;
   private String[] T00UX4_A6459VxLotHRA ;
   private boolean[] T00UX4_n6459VxLotHRA ;
   private String[] T00UX4_A11686VxLotHRT ;
   private boolean[] T00UX4_n11686VxLotHRT ;
   private int[] T00UX4_A6640VxLotPrvC ;
   private boolean[] T00UX4_n6640VxLotPrvC ;
   private short[] T00UX4_A6641VxLotDefPT ;
   private boolean[] T00UX4_n6641VxLotDefPT ;
   private String[] T00UX4_A6643VxLotMaqT ;
   private boolean[] T00UX4_n6643VxLotMaqT ;
   private String[] T00UX4_A7422VxLotACru ;
   private boolean[] T00UX4_n7422VxLotACru ;
   private byte[] T00UX4_A7423VxLotCalC ;
   private boolean[] T00UX4_n7423VxLotCalC ;
   private int[] T00UX4_A8320VxAcParN ;
   private boolean[] T00UX4_n8320VxAcParN ;
   private String[] T00UX4_A8321VxArtTer ;
   private boolean[] T00UX4_n8321VxArtTer ;
   private int[] T00UX4_A8322VxColCod ;
   private boolean[] T00UX4_n8322VxColCod ;
   private java.math.BigDecimal[] T00UX4_A11209VxLotMts ;
   private boolean[] T00UX4_n11209VxLotMts ;
   private java.math.BigDecimal[] T00UX4_A13025VxLotMTe ;
   private boolean[] T00UX4_n13025VxLotMTe ;
   private String[] T00UX4_A11305VxCodExt ;
   private boolean[] T00UX4_n11305VxCodExt ;
   private String[] T00UX4_A11775VxUsuTej ;
   private boolean[] T00UX4_n11775VxUsuTej ;
   private String[] T00UX4_A12251VxComCRCT ;
   private boolean[] T00UX4_n12251VxComCRCT ;
   private int[] T00UX4_A12250VxComCRCC ;
   private boolean[] T00UX4_n12250VxComCRCC ;
   private int[] T00UX4_A12252VxSteCliDe ;
   private boolean[] T00UX4_n12252VxSteCliDe ;
   private java.util.Date[] T00UX4_A12253VxSteFecCr ;
   private boolean[] T00UX4_n12253VxSteFecCr ;
   private String[] T00UX4_A12375VxStePedNC ;
   private boolean[] T00UX4_n12375VxStePedNC ;
   private String[] T00UX4_A12376VxSteDibCo ;
   private boolean[] T00UX4_n12376VxSteDibCo ;
   private short[] T00UX4_A12377VxStePedLi ;
   private boolean[] T00UX4_n12377VxStePedLi ;
   private byte[] T00UX4_A12749VxSteAct ;
   private boolean[] T00UX4_n12749VxSteAct ;
   private java.util.Date[] T00UX4_A12885VxSteFecFT ;
   private boolean[] T00UX4_n12885VxSteFecFT ;
   private String[] T00UX4_A12896VxSteDev ;
   private boolean[] T00UX4_n12896VxSteDev ;
   private String[] T00UX4_A12919VxSteRsv ;
   private boolean[] T00UX4_n12919VxSteRsv ;
   private String[] T00UX4_A13115VxSTeTejRe ;
   private boolean[] T00UX4_n13115VxSTeTejRe ;
   private int[] T00UX4_A13202VxSteIdMad ;
   private boolean[] T00UX4_n13202VxSteIdMad ;
   private String[] T00UX4_A13294VxSteUniMe ;
   private boolean[] T00UX4_n13294VxSteUniMe ;
   private String[] T00UX4_A6642VxLotTeLo ;
   private boolean[] T00UX4_n6642VxLotTeLo ;
   private int[] T00UX4_A7550VxRapCod ;
   private boolean[] T00UX4_n7550VxRapCod ;
   private String[] T00UX4_A12248VxAlmCod ;
   private boolean[] T00UX4_n12248VxAlmCod ;
   private String[] T00UX4_A12249VxAlmUbi ;
   private boolean[] T00UX4_n12249VxAlmUbi ;
   private byte[] T00UX30_A8323VxHRComp ;
   private short[] T00UX31_A13211VxSTePml ;
   private java.math.BigDecimal[] T00UX31_A13295VxSteRdto ;
   private String[] T00UX32_A7525VxOFabTip ;
   private int[] T00UX32_A12372VxOSCod ;
   private int[] T00UX32_A6224VxLotId ;
   private int[] T00UX33_A6224VxLotId ;
   private String[] T00UX33_A8314VxHREmp ;
   private boolean[] T00UX33_n8314VxHREmp ;
   private int[] T00UX33_A8315VxHRBar ;
   private boolean[] T00UX33_n8315VxHRBar ;
   private byte[] T00UX33_A8316VxHrReo ;
   private boolean[] T00UX33_n8316VxHrReo ;
   private String[] T00UX33_A8317VxHrPar ;
   private boolean[] T00UX33_n8317VxHrPar ;
   private int[] T00UX34_A6224VxLotId ;
   private int[] T00UX35_A6224VxLotId ;
   private java.util.Date[] T00UX35_A12730VxStMFec ;
   private String[] T00UX35_A12720VxStMTMov ;
   private boolean[] T00UX35_n12720VxStMTMov ;
   private String[] T00UX35_A12721VxStMAlmCo ;
   private boolean[] T00UX35_n12721VxStMAlmCo ;
   private byte[] T00UX35_A12722VxStMSit ;
   private boolean[] T00UX35_n12722VxStMSit ;
   private String[] T00UX35_A12723VxStMaux ;
   private boolean[] T00UX35_n12723VxStMaux ;
   private String[] T00UX35_A12724VxStUsuCod ;
   private boolean[] T00UX35_n12724VxStUsuCod ;
   private String[] T00UX35_A12725VxStWrkStn ;
   private boolean[] T00UX35_n12725VxStWrkStn ;
   private String[] T00UX35_A12726VxStMAlmOr ;
   private boolean[] T00UX35_n12726VxStMAlmOr ;
   private short[] T00UX35_A12727VxStMSitOr ;
   private boolean[] T00UX35_n12727VxStMSitOr ;
   private java.math.BigDecimal[] T00UX35_A12728VxStMCan ;
   private boolean[] T00UX35_n12728VxStMCan ;
   private java.math.BigDecimal[] T00UX35_A12729VxStMCanOr ;
   private boolean[] T00UX35_n12729VxStMCanOr ;
   private int[] T00UX36_A6224VxLotId ;
   private java.util.Date[] T00UX36_A12730VxStMFec ;
   private int[] T00UX3_A6224VxLotId ;
   private java.util.Date[] T00UX3_A12730VxStMFec ;
   private String[] T00UX3_A12720VxStMTMov ;
   private boolean[] T00UX3_n12720VxStMTMov ;
   private String[] T00UX3_A12721VxStMAlmCo ;
   private boolean[] T00UX3_n12721VxStMAlmCo ;
   private byte[] T00UX3_A12722VxStMSit ;
   private boolean[] T00UX3_n12722VxStMSit ;
   private String[] T00UX3_A12723VxStMaux ;
   private boolean[] T00UX3_n12723VxStMaux ;
   private String[] T00UX3_A12724VxStUsuCod ;
   private boolean[] T00UX3_n12724VxStUsuCod ;
   private String[] T00UX3_A12725VxStWrkStn ;
   private boolean[] T00UX3_n12725VxStWrkStn ;
   private String[] T00UX3_A12726VxStMAlmOr ;
   private boolean[] T00UX3_n12726VxStMAlmOr ;
   private short[] T00UX3_A12727VxStMSitOr ;
   private boolean[] T00UX3_n12727VxStMSitOr ;
   private java.math.BigDecimal[] T00UX3_A12728VxStMCan ;
   private boolean[] T00UX3_n12728VxStMCan ;
   private java.math.BigDecimal[] T00UX3_A12729VxStMCanOr ;
   private boolean[] T00UX3_n12729VxStMCanOr ;
   private int[] T00UX2_A6224VxLotId ;
   private java.util.Date[] T00UX2_A12730VxStMFec ;
   private String[] T00UX2_A12720VxStMTMov ;
   private boolean[] T00UX2_n12720VxStMTMov ;
   private String[] T00UX2_A12721VxStMAlmCo ;
   private boolean[] T00UX2_n12721VxStMAlmCo ;
   private byte[] T00UX2_A12722VxStMSit ;
   private boolean[] T00UX2_n12722VxStMSit ;
   private String[] T00UX2_A12723VxStMaux ;
   private boolean[] T00UX2_n12723VxStMaux ;
   private String[] T00UX2_A12724VxStUsuCod ;
   private boolean[] T00UX2_n12724VxStUsuCod ;
   private String[] T00UX2_A12725VxStWrkStn ;
   private boolean[] T00UX2_n12725VxStWrkStn ;
   private String[] T00UX2_A12726VxStMAlmOr ;
   private boolean[] T00UX2_n12726VxStMAlmOr ;
   private short[] T00UX2_A12727VxStMSitOr ;
   private boolean[] T00UX2_n12727VxStMSitOr ;
   private java.math.BigDecimal[] T00UX2_A12728VxStMCan ;
   private boolean[] T00UX2_n12728VxStMCan ;
   private java.math.BigDecimal[] T00UX2_A12729VxStMCanOr ;
   private boolean[] T00UX2_n12729VxStMCanOr ;
   private int[] T00UX40_A6224VxLotId ;
   private java.util.Date[] T00UX40_A12730VxStMFec ;
   private String[] T00UX41_A11686VxLotHRT ;
   private boolean[] T00UX41_n11686VxLotHRT ;
   private String[] T00UX42_A6642VxLotTeLo ;
   private boolean[] T00UX42_n6642VxLotTeLo ;
   private int[] T00UX43_A7550VxRapCod ;
   private boolean[] T00UX43_n7550VxRapCod ;
   private String[] T00UX44_A12248VxAlmCod ;
   private boolean[] T00UX44_n12248VxAlmCod ;
   private String[] T00UX45_A12248VxAlmCod ;
   private boolean[] T00UX45_n12248VxAlmCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxroll__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxroll__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxroll__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxroll__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00UX2", "SELECT SteLotId AS VxLotId, SteMFec, SteMTMov, SteMAlmCod, SteMSit, SteMAux, SteMUsuCod, SteMWkStn, SteMAlmOri, SteMSitOri, SteMCan, SteMCanOri FROM VTXSTKTEMOV WHERE SteLotId = ? AND SteMFec = ?  FOR UPDATE OF SteMTMov, SteMAlmCod, SteMSit, SteMAux, SteMUsuCod, SteMWkStn, SteMAlmOri, SteMSitOri, SteMCan, SteMCanOri NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX3", "SELECT SteLotId AS VxLotId, SteMFec, SteMTMov, SteMAlmCod, SteMSit, SteMAux, SteMUsuCod, SteMWkStn, SteMAlmOri, SteMSitOri, SteMCan, SteMCanOri FROM VTXSTKTEMOV WHERE SteLotId = ? AND SteMFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX4", "SELECT STeLotId AS VxLotId, SteSit, SteSitF, SteAct AS VXLotAnu, SteCanCre, STeCan, STeHRAca, STeHRTej, steprvcru, stedefpt, SteMaqTej, STeArtCre, STeCalCre, AcParNum, ArtCod, ColECod, STeMtsCru, SteMts, STeCodSap, STeUsuTej, STeComCRCT, STeComCRCC, STeCliDes, STeFecCR, SteCliPed, SteDibCod, STePedLin, SteAct AS VxSteAct, STEFecFT, SteDev, SteRsv, SteTejRes, SteIdMadre, SteUniMed, TeLoCod AS VxLotTeLo, RapCod, AlmCod AS VxAlmCod, AlmUbi AS VxAlmUbi FROM VTXSTKTE WHERE STeLotId = ?  FOR UPDATE OF SteSit, SteSitF, SteAct, SteCanCre, STeCan, STeHRAca, STeHRTej, steprvcru, stedefpt, SteMaqTej, STeArtCre, STeCalCre, AcParNum, ArtCod, ColECod, STeMtsCru, SteMts, STeCodSap, STeUsuTej, STeComCRCT, STeComCRCC, STeCliDes, STeFecCR, SteCliPed, SteDibCod, STePedLin, SteAct, STEFecFT, SteDev, SteRsv, SteTejRes, SteIdMadre, SteUniMed, TeLoCod, RapCod, AlmCod, AlmUbi NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX5", "SELECT STeLotId AS VxLotId, SteSit, SteSitF, SteAct AS VXLotAnu, SteCanCre, STeCan, STeHRAca, STeHRTej, steprvcru, stedefpt, SteMaqTej, STeArtCre, STeCalCre, AcParNum, ArtCod, ColECod, STeMtsCru, SteMts, STeCodSap, STeUsuTej, STeComCRCT, STeComCRCC, STeCliDes, STeFecCR, SteCliPed, SteDibCod, STePedLin, SteAct AS VxSteAct, STEFecFT, SteDev, SteRsv, SteTejRes, SteIdMadre, SteUniMed, TeLoCod AS VxLotTeLo, RapCod, AlmCod AS VxAlmCod, AlmUbi AS VxAlmUbi FROM VTXSTKTE WHERE STeLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX6", "SELECT TeLoCod AS VxLotTeLo FROM VTXTELOTES WHERE TeLoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX7", "SELECT rapcod FROM VTXRAPPORT WHERE rapcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX8", "SELECT AlmCod AS VxAlmCod FROM VTXALMACEN WHERE AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX9", "SELECT AlmCod AS VxAlmCod FROM VTXALMUBI WHERE AlmCod = ? AND AlmUbi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX10", "SELECT COALESCE( ArtTePml, 0) AS VxSTePml, COALESCE( ArtTeRdto, 0) AS VxSteRdto FROM VTXARTDATEJ WHERE ArtTeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX12", "SELECT COALESCE( T1.VxHRComp, 0) AS VxHRComp FROM (SELECT COUNT(*) AS VxHRComp, STeLotId AS VxLotId FROM VTXSTKTEHR GROUP BY STeLotId ) T1 WHERE T1.VxLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX14", "SELECT /*+ FIRST_ROWS(100) */ T3.ArtTeCod AS VxArTECod, TM1.STeLotId AS VxLotId, TM1.SteSit, TM1.SteSitF, TM1.SteAct AS VXLotAnu, TM1.SteCanCre, TM1.STeCan, TM1.STeHRAca, TM1.STeHRTej, TM1.steprvcru, TM1.stedefpt, TM1.SteMaqTej, TM1.STeArtCre, TM1.STeCalCre, TM1.AcParNum, TM1.ArtCod, TM1.ColECod, TM1.STeMtsCru, TM1.SteMts, TM1.STeCodSap, TM1.STeUsuTej, TM1.STeComCRCT, TM1.STeComCRCC, TM1.STeCliDes, TM1.STeFecCR, TM1.SteCliPed, TM1.SteDibCod, TM1.STePedLin, TM1.SteAct AS VxSteAct, TM1.STEFecFT, TM1.SteDev, TM1.SteRsv, TM1.SteTejRes, TM1.SteIdMadre, TM1.SteUniMed, TM1.TeLoCod AS VxLotTeLo, TM1.RapCod, TM1.AlmCod AS VxAlmCod, TM1.AlmUbi AS VxAlmUbi, COALESCE( T3.ArtTePml, 0) AS VxSTePml, COALESCE( T3.ArtTeRdto, 0) AS VxSteRdto, COALESCE( T2.VxHRComp, 0) AS VxHRComp FROM ((VTXSTKTE TM1 LEFT JOIN (SELECT COUNT(*) AS VxHRComp, STeLotId AS VxLotId FROM VTXSTKTEHR GROUP BY STeLotId ) T2 ON T2.VxLotId = TM1.STeLotId) LEFT JOIN VTXARTDATEJ T3 ON T3.ArtTeCod = TM1.STeArtCre) WHERE TM1.STeLotId = ? ORDER BY TM1.STeLotId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX15", "SELECT STeHRTej FROM VTXSTKTE WHERE (STeHRTej = ? AND STeLotId = ?) AND (Not ( STeLotId = ?)) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX17", "SELECT COALESCE( T1.VxHRComp, 0) AS VxHRComp FROM (SELECT COUNT(*) AS VxHRComp, STeLotId AS VxLotId FROM VTXSTKTEHR GROUP BY STeLotId ) T1 WHERE T1.VxLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX18", "SELECT TeLoCod AS VxLotTeLo FROM VTXTELOTES WHERE TeLoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX19", "SELECT COALESCE( ArtTePml, 0) AS VxSTePml, COALESCE( ArtTeRdto, 0) AS VxSteRdto FROM VTXARTDATEJ WHERE ArtTeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX20", "SELECT rapcod FROM VTXRAPPORT WHERE rapcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX21", "SELECT AlmCod AS VxAlmCod FROM VTXALMUBI WHERE AlmCod = ? AND AlmUbi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX22", "SELECT AlmCod AS VxAlmCod FROM VTXALMACEN WHERE AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX23", "SELECT /*+ FIRST_ROWS(1) */ STeLotId AS VxLotId FROM VTXSTKTE WHERE STeLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ STeLotId AS VxLotId FROM VTXSTKTE WHERE ( STeLotId > ?) ORDER BY STeLotId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00UX25", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ STeLotId AS VxLotId FROM VTXSTKTE WHERE ( STeLotId < ?) ORDER BY STeLotId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00UX26", "INSERT INTO VTXSTKTE(STeLotId, SteSit, SteSitF, SteAct, SteCanCre, STeCan, STeHRAca, STeHRTej, steprvcru, stedefpt, SteMaqTej, STeArtCre, STeCalCre, AcParNum, ArtCod, ColECod, STeMtsCru, SteMts, STeCodSap, STeUsuTej, STeComCRCT, STeComCRCC, STeCliDes, STeFecCR, SteCliPed, SteDibCod, STePedLin, SteAct, STEFecFT, SteDev, SteRsv, SteTejRes, SteIdMadre, SteUniMed, TeLoCod, RapCod, AlmCod, AlmUbi) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXSTKTE")
         ,new UpdateCursor("T00UX27", "UPDATE VTXSTKTE SET SteSit=?, SteSitF=?, SteAct=?, SteCanCre=?, STeCan=?, STeHRAca=?, STeHRTej=?, steprvcru=?, stedefpt=?, SteMaqTej=?, STeArtCre=?, STeCalCre=?, AcParNum=?, ArtCod=?, ColECod=?, STeMtsCru=?, SteMts=?, STeCodSap=?, STeUsuTej=?, STeComCRCT=?, STeComCRCC=?, STeCliDes=?, STeFecCR=?, SteCliPed=?, SteDibCod=?, STePedLin=?, SteAct=?, STEFecFT=?, SteDev=?, SteRsv=?, SteTejRes=?, SteIdMadre=?, SteUniMed=?, TeLoCod=?, RapCod=?, AlmCod=?, AlmUbi=?  WHERE STeLotId = ?", GX_NOMASK, "VTXSTKTE")
         ,new UpdateCursor("T00UX28", "DELETE FROM VTXSTKTE  WHERE STeLotId = ?", GX_NOMASK, "VTXSTKTE")
         ,new ForEachCursor("T00UX30", "SELECT COALESCE( T1.VxHRComp, 0) AS VxHRComp FROM (SELECT COUNT(*) AS VxHRComp, STeLotId AS VxLotId FROM VTXSTKTEHR GROUP BY STeLotId ) T1 WHERE T1.VxLotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX31", "SELECT COALESCE( ArtTePml, 0) AS VxSTePml, COALESCE( ArtTeRdto, 0) AS VxSteRdto FROM VTXARTDATEJ WHERE ArtTeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX32", "SELECT * FROM (SELECT OFabTip, OSCod, STeLotId AS VxLotId FROM VTXOSERPI WHERE STeLotId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00UX33", "SELECT * FROM (SELECT STeLotId AS VxLotId, STeHREmp AS VxHREmp, STeHRBar AS VxHRBar, STeHRReo AS VxHrReo, STeHRPar AS VxHrPar FROM VTXSTKTEHR WHERE STeLotId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00UX34", "SELECT /*+ FIRST_ROWS(100) */ STeLotId AS VxLotId FROM VTXSTKTE ORDER BY STeLotId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX35", "SELECT SteLotId AS VxLotId, SteMFec, SteMTMov, SteMAlmCod, SteMSit, SteMAux, SteMUsuCod, SteMWkStn, SteMAlmOri, SteMSitOri, SteMCan, SteMCanOri FROM VTXSTKTEMOV WHERE SteLotId = ? and SteMFec = ? ORDER BY SteLotId, SteMFec ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX36", "SELECT SteLotId AS VxLotId, SteMFec FROM VTXSTKTEMOV WHERE SteLotId = ? AND SteMFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00UX37", "INSERT INTO VTXSTKTEMOV(SteLotId, SteMFec, SteMTMov, SteMAlmCod, SteMSit, SteMAux, SteMUsuCod, SteMWkStn, SteMAlmOri, SteMSitOri, SteMCan, SteMCanOri) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXSTKTEMOV")
         ,new UpdateCursor("T00UX38", "UPDATE VTXSTKTEMOV SET SteMTMov=?, SteMAlmCod=?, SteMSit=?, SteMAux=?, SteMUsuCod=?, SteMWkStn=?, SteMAlmOri=?, SteMSitOri=?, SteMCan=?, SteMCanOri=?  WHERE SteLotId = ? AND SteMFec = ?", GX_NOMASK, "VTXSTKTEMOV")
         ,new UpdateCursor("T00UX39", "DELETE FROM VTXSTKTEMOV  WHERE SteLotId = ? AND SteMFec = ?", GX_NOMASK, "VTXSTKTEMOV")
         ,new ForEachCursor("T00UX40", "SELECT SteLotId AS VxLotId, SteMFec FROM VTXSTKTEMOV WHERE SteLotId = ? ORDER BY SteLotId, SteMFec ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX41", "SELECT STeHRTej FROM VTXSTKTE WHERE (STeHRTej = ? AND STeLotId = ?) AND (Not ( STeLotId = ?)) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX42", "SELECT TeLoCod AS VxLotTeLo FROM VTXTELOTES WHERE TeLoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX43", "SELECT rapcod FROM VTXRAPPORT WHERE rapcod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX44", "SELECT AlmCod AS VxAlmCod FROM VTXALMACEN WHERE AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00UX45", "SELECT AlmCod AS VxAlmCod FROM VTXALMUBI WHERE AlmCod = ? AND AlmUbi = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 15);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDate(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 16);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDateTime(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 4);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((int[]) buf[69])[0] = rslt.getInt(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 4);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 15);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 6);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDate(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(26, 16);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[55])[0] = rslt.getGXDateTime(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(30, 1);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((int[]) buf[63])[0] = rslt.getInt(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 4);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((int[]) buf[69])[0] = rslt.getInt(36);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 4);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(38, 10);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 9 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 15);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(23);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((int[]) buf[44])[0] = rslt.getInt(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[46])[0] = rslt.getGXDate(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 20);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 16);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((short[]) buf[52])[0] = rslt.getShort(28);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(29);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDateTime(30);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(31, 1);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(34);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((String[]) buf[66])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(36, 4);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(37);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(38, 4);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((short[]) buf[76])[0] = rslt.getShort(40);
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(41,2);
               ((byte[]) buf[78])[0] = rslt.getByte(42);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 24 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 25 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 29 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               return;
            case 34 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 37 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 1 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 2 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 7 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
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
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 16 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
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
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 10);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 6);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 16);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 16);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 15);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 8);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 6);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[44]).intValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DATE );
               }
               else
               {
                  stmt.setDate(24, (java.util.Date)parms[46]);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 20);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[50], 16);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[52]).shortValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[54]).byteValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(29, (java.util.Date)parms[56], false);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[58], 1);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[60], 1);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[62], 1);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(33, ((Number) parms[64]).intValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[66], 1);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[68], 4);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[70]).intValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[72], 4);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[74], 10);
               }
               return;
            case 22 :
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 10);
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
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 6);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 16);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 16);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 15);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 8);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 6);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[41]).intValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[43]).intValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DATE );
               }
               else
               {
                  stmt.setDate(23, (java.util.Date)parms[45]);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 20);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 16);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(28, (java.util.Date)parms[55], false);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 1);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 1);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[63]).intValue());
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
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 4);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(35, ((Number) parms[69]).intValue());
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 4);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 10);
               }
               stmt.setInt(38, ((Number) parms[74]).intValue());
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
               }
               return;
            case 26 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 27 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 31 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 8);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 10);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 4);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[21], 2);
               }
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 4);
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
                  stmt.setString(4, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 8);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 10);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 4);
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               stmt.setInt(11, ((Number) parms[20]).intValue());
               stmt.setDateTime(12, (java.util.Date)parms[21], false);
               return;
            case 33 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
            case 35 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 37 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               return;
            case 38 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 4);
               }
               return;
            case 39 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               return;
      }
   }

}

