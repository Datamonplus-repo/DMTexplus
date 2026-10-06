package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class txaf_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "XAFALPCOD") ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "XAFALPCOD") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "XAFALPCOD") ;
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         A8103XAFALPCOD = GXutil.lval( gxfirstwebparm) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8103XAFALPCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8103XAFALPCOD), 10, 0));
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         }
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
         Form.getMeta().addItem("description", httpContext.getMessage( "INT_REMISIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtXAFTpo_Internalname ;
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
      nRC_GXsfl_100 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_100"))) ;
      nGXsfl_100_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_100_idx"))) ;
      sGXsfl_100_idx = httpContext.GetPar( "sGXsfl_100_idx") ;
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

   public txaf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public txaf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( txaf_impl.class ));
   }

   public txaf_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TXAF.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "NRO_REMISION", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFALPCOD_Internalname, GXutil.ltrim( localUtil.ntoc( A8103XAFALPCOD, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAFALPCOD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8103XAFALPCOD), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8103XAFALPCOD), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFALPCOD_Jsonclick, 0, "", "", "", "", "", 1, edtXAFALPCOD_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "XAFTpo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFTpo_Internalname, GXutil.rtrim( A8104XAFTpo), GXutil.rtrim( localUtil.format( A8104XAFTpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFTpo_Jsonclick, 0, "", "", "", "", "", 1, edtXAFTpo_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "CLIENTE", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFCLI_Internalname, GXutil.rtrim( A8105XAFCLI), GXutil.rtrim( localUtil.format( A8105XAFCLI, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFCLI_Jsonclick, 0, "", "", "", "", "", 1, edtXAFCLI_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "FECHA", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXAFFCH_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFFCH_Internalname, localUtil.ttoc( A8106XAFFCH, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8106XAFFCH, "99/99/9999 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFFCH_Jsonclick, 0, "", "", "", "", "", 1, edtXAFFCH_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXAF.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXAFFCH_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXAFFCH_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXAF.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "FECHA_VENCIMIENTO", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXAFVTO_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFVTO_Internalname, localUtil.ttoc( A8107XAFVTO, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8107XAFVTO, "99/99/9999 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFVTO_Jsonclick, 0, "", "", "", "", "", 1, edtXAFVTO_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXAF.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXAFVTO_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXAFVTO_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXAF.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "FORMA_DE_PAGO", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFFPG_Internalname, GXutil.rtrim( A8108XAFFPG), GXutil.rtrim( localUtil.format( A8108XAFFPG, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFFPG_Jsonclick, 0, "", "", "", "", "", 1, edtXAFFPG_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "VENDEDOR", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFVND_Internalname, GXutil.ltrim( localUtil.ntoc( A8109XAFVND, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAFVND_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8109XAFVND), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8109XAFVND), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFVND_Jsonclick, 0, "", "", "", "", "", 1, edtXAFVND_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "OBSERVACIONES", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFOBS_Internalname, A8110XAFOBS, GXutil.rtrim( localUtil.format( A8110XAFOBS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFOBS_Jsonclick, 0, "", "", "", "", "", 1, edtXAFOBS_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "DESCUENTO_PLAZO", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFDTOPZO_Internalname, GXutil.ltrim( localUtil.ntoc( A8111XAFDTOPZO, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAFDTOPZO_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8111XAFDTOPZO), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8111XAFDTOPZO), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFDTOPZO_Jsonclick, 0, "", "", "", "", "", 1, edtXAFDTOPZO_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "DESCUENTO_PORCENTAJE", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFDTOPRC_Internalname, GXutil.ltrim( localUtil.ntoc( A8112XAFDTOPRC, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtXAFDTOPRC_Enabled!=0) ? localUtil.format( A8112XAFDTOPRC, "ZZZ.99") : localUtil.format( A8112XAFDTOPRC, "ZZZ.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFDTOPRC_Jsonclick, 0, "", "", "", "", "", 1, edtXAFDTOPRC_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "USUARIO_GENERA", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFUSUGEN_Internalname, GXutil.rtrim( A8113XAFUSUGEN), GXutil.rtrim( localUtil.format( A8113XAFUSUGEN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFUSUGEN_Jsonclick, 0, "", "", "", "", "", 1, edtXAFUSUGEN_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "FECHA_GENERA", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXAFFCHGEN_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFFCHGEN_Internalname, localUtil.ttoc( A8114XAFFCHGEN, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8114XAFFCHGEN, "99/99/9999 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFFCHGEN_Jsonclick, 0, "", "", "", "", "", 1, edtXAFFCHGEN_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXAF.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXAFFCHGEN_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXAFFCHGEN_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXAF.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "USUARIO_LEE", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFUSULEE_Internalname, GXutil.rtrim( A8115XAFUSULEE), GXutil.rtrim( localUtil.format( A8115XAFUSULEE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFUSULEE_Jsonclick, 0, "", "", "", "", "", 1, edtXAFUSULEE_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "FECHA_LEE", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtXAFFCHLEE_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFFCHLEE_Internalname, localUtil.ttoc( A8116XAFFCHLEE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A8116XAFFCHLEE, "99/99/9999 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFFCHLEE_Jsonclick, 0, "", "", "", "", "", 1, edtXAFFCHLEE_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TXAF.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtXAFFCHLEE_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtXAFFCHLEE_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TXAF.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "XAFEST", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtXAFEST_Internalname, GXutil.rtrim( A8117XAFEST), GXutil.rtrim( localUtil.format( A8117XAFEST, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtXAFEST_Jsonclick, 0, "", "", "", "", "", 1, edtXAFEST_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "XAFERR", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtXAFERR_Internalname, A8118XAFERR, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", (short)(0), 1, edtXAFERR_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TXAF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol100( ) ;
      nGXsfl_100_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1139 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1139 = (short)(1) ;
            scanStart1151139( ) ;
            while ( RcdFound1139 != 0 )
            {
               init_level_properties1139( ) ;
               getByPrimaryKey1151139( ) ;
               addRow1151139( ) ;
               scanNext1151139( ) ;
            }
            scanEnd1151139( ) ;
            nBlankRcdCount1139 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1151139( ) ;
         standaloneModal1151139( ) ;
         sMode1139 = Gx_mode ;
         while ( nGXsfl_100_idx < nRC_GXsfl_100 )
         {
            bGXsfl_100_Refreshing = true ;
            readRow1151139( ) ;
            edtavnRcdDeleted_1139_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1139_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1139_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1139_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLIN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLIN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLIN_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINHDR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINHDR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINHDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINHDR_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINALR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINALR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINALR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINALR_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINLOT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINLOT_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINLOT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINLOT_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINPZA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINPZA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINPZA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINPZA_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINARTC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINARTC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINARTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINARTC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINARTD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINARTD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINARTD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINARTD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLININTC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLININTC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLININTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLININTC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINDIBC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINDIBC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINDIBC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINDIBC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINDIBD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINDIBD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINDIBD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINDIBD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINCOLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINCOLC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINCOLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINCOLC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINCOLD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINCOLD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINCOLD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINCOLD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINKGSE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINKGSE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINKGSE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINKGSE_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINKGSS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINKGSS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINKGSS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINKGSS_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINMER_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMER_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMER_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMER_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINMTSS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMTSS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMTSS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMTSS_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINPREK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINPREK_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINPREK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINPREK_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINPREM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINPREM_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINPREM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINPREM_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINMOC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMOC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMOC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINMAQC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMAQC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMAQC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMAQC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLININSC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLININSC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLININSC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLININSC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINUSUG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINUSUG_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINUSUG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINUSUG_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINFCHG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINFCHG_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINFCHG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINFCHG_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINUSUL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINUSUL_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINUSUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINUSUL_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINFCHL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINFCHL_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINFCHL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINFCHL_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINEST_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINEST_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINEST_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINEST_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINERR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINERR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINERR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINERR_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINCCO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINCCO_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINCCO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINCCO_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINMTSE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMTSE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMTSE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMTSE_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINKGS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINKGS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINKGS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINKGS_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINMTS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMTS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMTS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMTS_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINREFC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINREFC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINREFC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINREFC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINREFD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINREFD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINREFD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINREFD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINPRE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINPRE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINPRE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINPRE_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINDTO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINDTO_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINDTO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINDTO_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINREC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINREC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINREC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINREC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            edtXAFLINKGR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINKGR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtXAFLINKGR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINKGR_Enabled), 5, 0), !bGXsfl_100_Refreshing);
            if ( ( nRcdExists_1139 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1151139( ) ;
            }
            sendRow1151139( ) ;
            bGXsfl_100_Refreshing = false ;
         }
         Gx_mode = sMode1139 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1139 = (short)(5) ;
         nRcdExists_1139 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1151139( ) ;
            while ( RcdFound1139 != 0 )
            {
               sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1001139( ) ;
               init_level_properties1139( ) ;
               standaloneNotModal1151139( ) ;
               getByPrimaryKey1151139( ) ;
               standaloneModal1151139( ) ;
               addRow1151139( ) ;
               scanNext1151139( ) ;
            }
            scanEnd1151139( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1139 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001139( ) ;
         initAll1151139( ) ;
         init_level_properties1139( ) ;
         nRcdExists_1139 = (short)(0) ;
         nIsMod_1139 = (short)(0) ;
         nRcdDeleted_1139 = (short)(0) ;
         nBlankRcdCount1139 = (short)(nBlankRcdUsr1139+nBlankRcdCount1139) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1139 > 0 )
         {
            standaloneNotModal1151139( ) ;
            standaloneModal1151139( ) ;
            addRow1151139( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtXAFLIN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1139 = (short)(nBlankRcdCount1139-1) ;
         }
         Gx_mode = sMode1139 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TXAF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TXAF.htm");
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
         Z8103XAFALPCOD = localUtil.ctol( httpContext.cgiGet( "Z8103XAFALPCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z8104XAFTpo = httpContext.cgiGet( "Z8104XAFTpo") ;
         Z8105XAFCLI = httpContext.cgiGet( "Z8105XAFCLI") ;
         Z8106XAFFCH = localUtil.ctot( httpContext.cgiGet( "Z8106XAFFCH"), 0) ;
         Z8107XAFVTO = localUtil.ctot( httpContext.cgiGet( "Z8107XAFVTO"), 0) ;
         Z8108XAFFPG = httpContext.cgiGet( "Z8108XAFFPG") ;
         Z8109XAFVND = (short)(localUtil.ctol( httpContext.cgiGet( "Z8109XAFVND"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8110XAFOBS = httpContext.cgiGet( "Z8110XAFOBS") ;
         Z8111XAFDTOPZO = (int)(localUtil.ctol( httpContext.cgiGet( "Z8111XAFDTOPZO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8112XAFDTOPRC = localUtil.ctond( httpContext.cgiGet( "Z8112XAFDTOPRC")) ;
         Z8113XAFUSUGEN = httpContext.cgiGet( "Z8113XAFUSUGEN") ;
         Z8114XAFFCHGEN = localUtil.ctot( httpContext.cgiGet( "Z8114XAFFCHGEN"), 0) ;
         Z8115XAFUSULEE = httpContext.cgiGet( "Z8115XAFUSULEE") ;
         Z8116XAFFCHLEE = localUtil.ctot( httpContext.cgiGet( "Z8116XAFFCHLEE"), 0) ;
         Z8117XAFEST = httpContext.cgiGet( "Z8117XAFEST") ;
         Z8118XAFERR = httpContext.cgiGet( "Z8118XAFERR") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A8103XAFALPCOD = localUtil.ctol( httpContext.cgiGet( edtXAFALPCOD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8103XAFALPCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8103XAFALPCOD), 10, 0));
         A8104XAFTpo = httpContext.cgiGet( edtXAFTpo_Internalname) ;
         n8104XAFTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8104XAFTpo", A8104XAFTpo);
         A8105XAFCLI = httpContext.cgiGet( edtXAFCLI_Internalname) ;
         n8105XAFCLI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8105XAFCLI", A8105XAFCLI);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtXAFFCH_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "XAFFCH");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFFCH_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8106XAFFCH = GXutil.resetTime( GXutil.nullDate() );
            n8106XAFFCH = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8106XAFFCH", localUtil.ttoc( A8106XAFFCH, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8106XAFFCH = localUtil.ctot( httpContext.cgiGet( edtXAFFCH_Internalname)) ;
            n8106XAFFCH = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8106XAFFCH", localUtil.ttoc( A8106XAFFCH, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtXAFVTO_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "XAFVTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFVTO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8107XAFVTO = GXutil.resetTime( GXutil.nullDate() );
            n8107XAFVTO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8107XAFVTO", localUtil.ttoc( A8107XAFVTO, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8107XAFVTO = localUtil.ctot( httpContext.cgiGet( edtXAFVTO_Internalname)) ;
            n8107XAFVTO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8107XAFVTO", localUtil.ttoc( A8107XAFVTO, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A8108XAFFPG = httpContext.cgiGet( edtXAFFPG_Internalname) ;
         n8108XAFFPG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8108XAFFPG", A8108XAFFPG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAFVND_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAFVND_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XAFVND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFVND_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8109XAFVND = (short)(0) ;
            n8109XAFVND = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8109XAFVND", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8109XAFVND), 3, 0));
         }
         else
         {
            A8109XAFVND = (short)(localUtil.ctol( httpContext.cgiGet( edtXAFVND_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8109XAFVND = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8109XAFVND", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8109XAFVND), 3, 0));
         }
         A8110XAFOBS = httpContext.cgiGet( edtXAFOBS_Internalname) ;
         n8110XAFOBS = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8110XAFOBS", A8110XAFOBS);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAFDTOPZO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAFDTOPZO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XAFDTOPZO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFDTOPZO_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8111XAFDTOPZO = 0 ;
            n8111XAFDTOPZO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8111XAFDTOPZO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8111XAFDTOPZO), 5, 0));
         }
         else
         {
            A8111XAFDTOPZO = (int)(localUtil.ctol( httpContext.cgiGet( edtXAFDTOPZO_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8111XAFDTOPZO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8111XAFDTOPZO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8111XAFDTOPZO), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFDTOPRC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFDTOPRC_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "XAFDTOPRC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFDTOPRC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8112XAFDTOPRC = DecimalUtil.ZERO ;
            n8112XAFDTOPRC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8112XAFDTOPRC", GXutil.ltrimstr( A8112XAFDTOPRC, 6, 2));
         }
         else
         {
            A8112XAFDTOPRC = localUtil.ctond( httpContext.cgiGet( edtXAFDTOPRC_Internalname)) ;
            n8112XAFDTOPRC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8112XAFDTOPRC", GXutil.ltrimstr( A8112XAFDTOPRC, 6, 2));
         }
         A8113XAFUSUGEN = httpContext.cgiGet( edtXAFUSUGEN_Internalname) ;
         n8113XAFUSUGEN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8113XAFUSUGEN", A8113XAFUSUGEN);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtXAFFCHGEN_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "XAFFCHGEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFFCHGEN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8114XAFFCHGEN = GXutil.resetTime( GXutil.nullDate() );
            n8114XAFFCHGEN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8114XAFFCHGEN", localUtil.ttoc( A8114XAFFCHGEN, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8114XAFFCHGEN = localUtil.ctot( httpContext.cgiGet( edtXAFFCHGEN_Internalname)) ;
            n8114XAFFCHGEN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8114XAFFCHGEN", localUtil.ttoc( A8114XAFFCHGEN, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A8115XAFUSULEE = httpContext.cgiGet( edtXAFUSULEE_Internalname) ;
         n8115XAFUSULEE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8115XAFUSULEE", A8115XAFUSULEE);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtXAFFCHLEE_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "XAFFCHLEE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFFCHLEE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8116XAFFCHLEE = GXutil.resetTime( GXutil.nullDate() );
            n8116XAFFCHLEE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8116XAFFCHLEE", localUtil.ttoc( A8116XAFFCHLEE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A8116XAFFCHLEE = localUtil.ctot( httpContext.cgiGet( edtXAFFCHLEE_Internalname)) ;
            n8116XAFFCHLEE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8116XAFFCHLEE", localUtil.ttoc( A8116XAFFCHLEE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A8117XAFEST = httpContext.cgiGet( edtXAFEST_Internalname) ;
         n8117XAFEST = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8117XAFEST", A8117XAFEST);
         A8118XAFERR = httpContext.cgiGet( edtXAFERR_Internalname) ;
         n8118XAFERR = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8118XAFERR", A8118XAFERR);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TXAF");
         forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("txaf:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A8103XAFALPCOD = GXutil.lval( httpContext.GetPar( "XAFALPCOD")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8103XAFALPCOD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8103XAFALPCOD), 10, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons( ) ;
            standaloneModal( ) ;
         }
         else
         {
            if ( isDsp( ) )
            {
               sMode1138 = Gx_mode ;
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               Gx_mode = sMode1138 ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            }
            standaloneModal( ) ;
            if ( ! isIns( ) )
            {
               getByPrimaryKey( ) ;
               if ( RcdFound1138 == 1 )
               {
                  if ( isDlt( ) )
                  {
                     /* Confirm record */
                     confirm_1150( ) ;
                     if ( AnyError == 0 )
                     {
                        GX_FocusControl = bttBtn_enter_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "XAFALPCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXAFALPCOD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "CHECK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_check( ) ;
                        }
                        /* No code required for Help button. It is implemented at the Browser level. */
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
            initAll1151138( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1151138( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1139_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1139_Enabled), 5, 0), !bGXsfl_100_Refreshing);
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

   public void confirm_1150( )
   {
      beforeValidate1151138( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1151138( ) ;
         }
         else
         {
            checkExtendedTable1151138( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1151138( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1138 = Gx_mode ;
         confirm_1151139( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1138 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1138 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1150( ) ;
      }
   }

   public void confirm_1151139( )
   {
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1151139( ) ;
         if ( ( nRcdExists_1139 != 0 ) || ( nIsMod_1139 != 0 ) )
         {
            getKey1151139( ) ;
            if ( ( nRcdExists_1139 == 0 ) && ( nRcdDeleted_1139 == 0 ) )
            {
               if ( RcdFound1139 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1151139( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1151139( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1151139( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "XAFLIN_" + sGXsfl_100_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXAFLIN_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1139 != 0 )
               {
                  if ( nRcdDeleted_1139 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1151139( ) ;
                     load1151139( ) ;
                     beforeValidate1151139( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1151139( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1139 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1151139( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1151139( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1151139( ) ;
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
                  if ( nRcdDeleted_1139 == 0 )
                  {
                     GXCCtl = "XAFLIN_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXAFLIN_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1139_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLIN_Internalname, GXutil.ltrim( localUtil.ntoc( A8119XAFLIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINHDR_Internalname, GXutil.rtrim( A8120XAFLINHDR)) ;
         httpContext.changePostValue( edtXAFLINALR_Internalname, GXutil.rtrim( A8121XAFLINALR)) ;
         httpContext.changePostValue( edtXAFLINLOT_Internalname, GXutil.rtrim( A8122XAFLINLOT)) ;
         httpContext.changePostValue( edtXAFLINPZA_Internalname, GXutil.ltrim( localUtil.ntoc( A8123XAFLINPZA, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINARTC_Internalname, GXutil.rtrim( A8124XAFLINARTC)) ;
         httpContext.changePostValue( edtXAFLINARTD_Internalname, GXutil.rtrim( A8125XAFLINARTD)) ;
         httpContext.changePostValue( edtXAFLININTC_Internalname, GXutil.ltrim( localUtil.ntoc( A8126XAFLININTC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINDIBC_Internalname, GXutil.rtrim( A8127XAFLINDIBC)) ;
         httpContext.changePostValue( edtXAFLINDIBD_Internalname, GXutil.rtrim( A8128XAFLINDIBD)) ;
         httpContext.changePostValue( edtXAFLINCOLC_Internalname, GXutil.rtrim( A8129XAFLINCOLC)) ;
         httpContext.changePostValue( edtXAFLINCOLD_Internalname, GXutil.rtrim( A8130XAFLINCOLD)) ;
         httpContext.changePostValue( edtXAFLINKGSE_Internalname, GXutil.ltrim( localUtil.ntoc( A8131XAFLINKGSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINKGSS_Internalname, GXutil.ltrim( localUtil.ntoc( A8132XAFLINKGSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMER_Internalname, GXutil.ltrim( localUtil.ntoc( A8133XAFLINMER, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMTSS_Internalname, GXutil.ltrim( localUtil.ntoc( A8134XAFLINMTSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINPREK_Internalname, GXutil.ltrim( localUtil.ntoc( A8135XAFLINPREK, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINPREM_Internalname, GXutil.ltrim( localUtil.ntoc( A8136XAFLINPREM, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMOC_Internalname, GXutil.ltrim( localUtil.ntoc( A8137XAFLINMOC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMAQC_Internalname, GXutil.ltrim( localUtil.ntoc( A8138XAFLINMAQC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLININSC_Internalname, GXutil.ltrim( localUtil.ntoc( A8139XAFLININSC, (byte)(16), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINUSUG_Internalname, GXutil.rtrim( A8140XAFLINUSUG)) ;
         httpContext.changePostValue( edtXAFLINFCHG_Internalname, localUtil.ttoc( A8141XAFLINFCHG, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtXAFLINUSUL_Internalname, GXutil.rtrim( A8142XAFLINUSUL)) ;
         httpContext.changePostValue( edtXAFLINFCHL_Internalname, localUtil.ttoc( A8143XAFLINFCHL, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtXAFLINEST_Internalname, GXutil.rtrim( A8144XAFLINEST)) ;
         httpContext.changePostValue( edtXAFLINERR_Internalname, GXutil.rtrim( A8145XAFLINERR)) ;
         httpContext.changePostValue( edtXAFLINCCO_Internalname, GXutil.rtrim( A8146XAFLINCCO)) ;
         httpContext.changePostValue( edtXAFLINMTSE_Internalname, GXutil.ltrim( localUtil.ntoc( A8147XAFLINMTSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINKGS_Internalname, GXutil.ltrim( localUtil.ntoc( A8148XAFLINKGS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMTS_Internalname, GXutil.ltrim( localUtil.ntoc( A8149XAFLINMTS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINREFC_Internalname, GXutil.rtrim( A8150XAFLINREFC)) ;
         httpContext.changePostValue( edtXAFLINREFD_Internalname, GXutil.rtrim( A8151XAFLINREFD)) ;
         httpContext.changePostValue( edtXAFLINPRE_Internalname, GXutil.ltrim( localUtil.ntoc( A8152XAFLINPRE, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINDTO_Internalname, GXutil.ltrim( localUtil.ntoc( A8309XAFLINDTO, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINREC_Internalname, GXutil.ltrim( localUtil.ntoc( A8310XAFLINREC, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINKGR_Internalname, GXutil.ltrim( localUtil.ntoc( A12713XAFLINKGR, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8119XAFLIN_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8119XAFLIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8120XAFLINHDR_"+sGXsfl_100_idx, GXutil.rtrim( Z8120XAFLINHDR)) ;
         httpContext.changePostValue( "ZT_"+"Z8121XAFLINALR_"+sGXsfl_100_idx, GXutil.rtrim( Z8121XAFLINALR)) ;
         httpContext.changePostValue( "ZT_"+"Z8122XAFLINLOT_"+sGXsfl_100_idx, GXutil.rtrim( Z8122XAFLINLOT)) ;
         httpContext.changePostValue( "ZT_"+"Z8123XAFLINPZA_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8123XAFLINPZA, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8124XAFLINARTC_"+sGXsfl_100_idx, GXutil.rtrim( Z8124XAFLINARTC)) ;
         httpContext.changePostValue( "ZT_"+"Z8125XAFLINARTD_"+sGXsfl_100_idx, GXutil.rtrim( Z8125XAFLINARTD)) ;
         httpContext.changePostValue( "ZT_"+"Z8126XAFLININTC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8126XAFLININTC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8127XAFLINDIBC_"+sGXsfl_100_idx, GXutil.rtrim( Z8127XAFLINDIBC)) ;
         httpContext.changePostValue( "ZT_"+"Z8128XAFLINDIBD_"+sGXsfl_100_idx, GXutil.rtrim( Z8128XAFLINDIBD)) ;
         httpContext.changePostValue( "ZT_"+"Z8129XAFLINCOLC_"+sGXsfl_100_idx, GXutil.rtrim( Z8129XAFLINCOLC)) ;
         httpContext.changePostValue( "ZT_"+"Z8130XAFLINCOLD_"+sGXsfl_100_idx, GXutil.rtrim( Z8130XAFLINCOLD)) ;
         httpContext.changePostValue( "ZT_"+"Z8131XAFLINKGSE_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8131XAFLINKGSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8132XAFLINKGSS_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8132XAFLINKGSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8133XAFLINMER_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8133XAFLINMER, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8134XAFLINMTSS_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8134XAFLINMTSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8135XAFLINPREK_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8135XAFLINPREK, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8136XAFLINPREM_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8136XAFLINPREM, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8137XAFLINMOC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8137XAFLINMOC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8138XAFLINMAQC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8138XAFLINMAQC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8139XAFLININSC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8139XAFLININSC, (byte)(16), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8140XAFLINUSUG_"+sGXsfl_100_idx, GXutil.rtrim( Z8140XAFLINUSUG)) ;
         httpContext.changePostValue( "ZT_"+"Z8141XAFLINFCHG_"+sGXsfl_100_idx, localUtil.ttoc( Z8141XAFLINFCHG, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z8142XAFLINUSUL_"+sGXsfl_100_idx, GXutil.rtrim( Z8142XAFLINUSUL)) ;
         httpContext.changePostValue( "ZT_"+"Z8143XAFLINFCHL_"+sGXsfl_100_idx, localUtil.ttoc( Z8143XAFLINFCHL, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z8144XAFLINEST_"+sGXsfl_100_idx, GXutil.rtrim( Z8144XAFLINEST)) ;
         httpContext.changePostValue( "ZT_"+"Z8145XAFLINERR_"+sGXsfl_100_idx, GXutil.rtrim( Z8145XAFLINERR)) ;
         httpContext.changePostValue( "ZT_"+"Z8146XAFLINCCO_"+sGXsfl_100_idx, GXutil.rtrim( Z8146XAFLINCCO)) ;
         httpContext.changePostValue( "ZT_"+"Z8147XAFLINMTSE_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8147XAFLINMTSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8148XAFLINKGS_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8148XAFLINKGS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8149XAFLINMTS_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8149XAFLINMTS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8150XAFLINREFC_"+sGXsfl_100_idx, GXutil.rtrim( Z8150XAFLINREFC)) ;
         httpContext.changePostValue( "ZT_"+"Z8151XAFLINREFD_"+sGXsfl_100_idx, GXutil.rtrim( Z8151XAFLINREFD)) ;
         httpContext.changePostValue( "ZT_"+"Z8152XAFLINPRE_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8152XAFLINPRE, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8309XAFLINDTO_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8309XAFLINDTO, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8310XAFLINREC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8310XAFLINREC, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12713XAFLINKGR_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z12713XAFLINKGR, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1139_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1139_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1139_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1139 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1139_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1139_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLIN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINHDR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINHDR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINALR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINALR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINLOT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINLOT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINPZA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPZA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINARTC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINARTC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINARTD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINARTD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLININTC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLININTC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINDIBC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDIBC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINDIBD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDIBD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINCOLC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCOLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINCOLD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCOLD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINKGSE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGSE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINKGSS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGSS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMER_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMER_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMTSS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTSS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINPREK_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPREK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINPREM_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPREM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMOC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMOC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMAQC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMAQC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLININSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLININSC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINUSUG_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINUSUG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINFCHG_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINFCHG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINUSUL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINUSUL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINFCHL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINFCHL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINEST_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINEST_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINERR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINERR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINCCO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCCO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMTSE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTSE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINKGS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMTS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINREFC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREFC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINREFD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREFD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINPRE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPRE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINDTO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDTO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINREC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINKGR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1150( )
   {
   }

   public void zm1151138( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8104XAFTpo = T01155_A8104XAFTpo[0] ;
            Z8105XAFCLI = T01155_A8105XAFCLI[0] ;
            Z8106XAFFCH = T01155_A8106XAFFCH[0] ;
            Z8107XAFVTO = T01155_A8107XAFVTO[0] ;
            Z8108XAFFPG = T01155_A8108XAFFPG[0] ;
            Z8109XAFVND = T01155_A8109XAFVND[0] ;
            Z8110XAFOBS = T01155_A8110XAFOBS[0] ;
            Z8111XAFDTOPZO = T01155_A8111XAFDTOPZO[0] ;
            Z8112XAFDTOPRC = T01155_A8112XAFDTOPRC[0] ;
            Z8113XAFUSUGEN = T01155_A8113XAFUSUGEN[0] ;
            Z8114XAFFCHGEN = T01155_A8114XAFFCHGEN[0] ;
            Z8115XAFUSULEE = T01155_A8115XAFUSULEE[0] ;
            Z8116XAFFCHLEE = T01155_A8116XAFFCHLEE[0] ;
            Z8117XAFEST = T01155_A8117XAFEST[0] ;
            Z8118XAFERR = T01155_A8118XAFERR[0] ;
         }
         else
         {
            Z8104XAFTpo = A8104XAFTpo ;
            Z8105XAFCLI = A8105XAFCLI ;
            Z8106XAFFCH = A8106XAFFCH ;
            Z8107XAFVTO = A8107XAFVTO ;
            Z8108XAFFPG = A8108XAFFPG ;
            Z8109XAFVND = A8109XAFVND ;
            Z8110XAFOBS = A8110XAFOBS ;
            Z8111XAFDTOPZO = A8111XAFDTOPZO ;
            Z8112XAFDTOPRC = A8112XAFDTOPRC ;
            Z8113XAFUSUGEN = A8113XAFUSUGEN ;
            Z8114XAFFCHGEN = A8114XAFFCHGEN ;
            Z8115XAFUSULEE = A8115XAFUSULEE ;
            Z8116XAFFCHLEE = A8116XAFFCHLEE ;
            Z8117XAFEST = A8117XAFEST ;
            Z8118XAFERR = A8118XAFERR ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z8103XAFALPCOD = A8103XAFALPCOD ;
         Z8104XAFTpo = A8104XAFTpo ;
         Z8105XAFCLI = A8105XAFCLI ;
         Z8106XAFFCH = A8106XAFFCH ;
         Z8107XAFVTO = A8107XAFVTO ;
         Z8108XAFFPG = A8108XAFFPG ;
         Z8109XAFVND = A8109XAFVND ;
         Z8110XAFOBS = A8110XAFOBS ;
         Z8111XAFDTOPZO = A8111XAFDTOPZO ;
         Z8112XAFDTOPRC = A8112XAFDTOPRC ;
         Z8113XAFUSUGEN = A8113XAFUSUGEN ;
         Z8114XAFFCHGEN = A8114XAFFCHGEN ;
         Z8115XAFUSULEE = A8115XAFUSULEE ;
         Z8116XAFFCHLEE = A8116XAFFCHLEE ;
         Z8117XAFEST = A8117XAFEST ;
         Z8118XAFERR = A8118XAFERR ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  || isUpd( )  || isDsp( ) || isDlt( )  )
      {
         bttBtn_get_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_get_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
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

   public void load1151138( )
   {
      /* Using cursor T01156 */
      pr_default.execute(4, new Object[] {Long.valueOf(A8103XAFALPCOD)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1138 = (short)(1) ;
         A8104XAFTpo = T01156_A8104XAFTpo[0] ;
         n8104XAFTpo = T01156_n8104XAFTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8104XAFTpo", A8104XAFTpo);
         A8105XAFCLI = T01156_A8105XAFCLI[0] ;
         n8105XAFCLI = T01156_n8105XAFCLI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8105XAFCLI", A8105XAFCLI);
         A8106XAFFCH = T01156_A8106XAFFCH[0] ;
         n8106XAFFCH = T01156_n8106XAFFCH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8106XAFFCH", localUtil.ttoc( A8106XAFFCH, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8107XAFVTO = T01156_A8107XAFVTO[0] ;
         n8107XAFVTO = T01156_n8107XAFVTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8107XAFVTO", localUtil.ttoc( A8107XAFVTO, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8108XAFFPG = T01156_A8108XAFFPG[0] ;
         n8108XAFFPG = T01156_n8108XAFFPG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8108XAFFPG", A8108XAFFPG);
         A8109XAFVND = T01156_A8109XAFVND[0] ;
         n8109XAFVND = T01156_n8109XAFVND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8109XAFVND", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8109XAFVND), 3, 0));
         A8110XAFOBS = T01156_A8110XAFOBS[0] ;
         n8110XAFOBS = T01156_n8110XAFOBS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8110XAFOBS", A8110XAFOBS);
         A8111XAFDTOPZO = T01156_A8111XAFDTOPZO[0] ;
         n8111XAFDTOPZO = T01156_n8111XAFDTOPZO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8111XAFDTOPZO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8111XAFDTOPZO), 5, 0));
         A8112XAFDTOPRC = T01156_A8112XAFDTOPRC[0] ;
         n8112XAFDTOPRC = T01156_n8112XAFDTOPRC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8112XAFDTOPRC", GXutil.ltrimstr( A8112XAFDTOPRC, 6, 2));
         A8113XAFUSUGEN = T01156_A8113XAFUSUGEN[0] ;
         n8113XAFUSUGEN = T01156_n8113XAFUSUGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8113XAFUSUGEN", A8113XAFUSUGEN);
         A8114XAFFCHGEN = T01156_A8114XAFFCHGEN[0] ;
         n8114XAFFCHGEN = T01156_n8114XAFFCHGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8114XAFFCHGEN", localUtil.ttoc( A8114XAFFCHGEN, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8115XAFUSULEE = T01156_A8115XAFUSULEE[0] ;
         n8115XAFUSULEE = T01156_n8115XAFUSULEE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8115XAFUSULEE", A8115XAFUSULEE);
         A8116XAFFCHLEE = T01156_A8116XAFFCHLEE[0] ;
         n8116XAFFCHLEE = T01156_n8116XAFFCHLEE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8116XAFFCHLEE", localUtil.ttoc( A8116XAFFCHLEE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8117XAFEST = T01156_A8117XAFEST[0] ;
         n8117XAFEST = T01156_n8117XAFEST[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8117XAFEST", A8117XAFEST);
         A8118XAFERR = T01156_A8118XAFERR[0] ;
         n8118XAFERR = T01156_n8118XAFERR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8118XAFERR", A8118XAFERR);
         zm1151138( -1) ;
      }
      pr_default.close(4);
      onLoadActions1151138( ) ;
   }

   public void onLoadActions1151138( )
   {
   }

   public void checkExtendedTable1151138( )
   {
      nIsDirty_1138 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1151138( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1151138( )
   {
      /* Using cursor T01157 */
      pr_default.execute(5, new Object[] {Long.valueOf(A8103XAFALPCOD)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1138 = (short)(1) ;
      }
      else
      {
         RcdFound1138 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01155 */
      pr_default.execute(3, new Object[] {Long.valueOf(A8103XAFALPCOD)});
      if ( (pr_default.getStatus(3) != 101) && ( T01155_A8103XAFALPCOD[0] == A8103XAFALPCOD ) )
      {
         zm1151138( 1) ;
         RcdFound1138 = (short)(1) ;
         A8104XAFTpo = T01155_A8104XAFTpo[0] ;
         n8104XAFTpo = T01155_n8104XAFTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8104XAFTpo", A8104XAFTpo);
         A8105XAFCLI = T01155_A8105XAFCLI[0] ;
         n8105XAFCLI = T01155_n8105XAFCLI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8105XAFCLI", A8105XAFCLI);
         A8106XAFFCH = T01155_A8106XAFFCH[0] ;
         n8106XAFFCH = T01155_n8106XAFFCH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8106XAFFCH", localUtil.ttoc( A8106XAFFCH, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8107XAFVTO = T01155_A8107XAFVTO[0] ;
         n8107XAFVTO = T01155_n8107XAFVTO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8107XAFVTO", localUtil.ttoc( A8107XAFVTO, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8108XAFFPG = T01155_A8108XAFFPG[0] ;
         n8108XAFFPG = T01155_n8108XAFFPG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8108XAFFPG", A8108XAFFPG);
         A8109XAFVND = T01155_A8109XAFVND[0] ;
         n8109XAFVND = T01155_n8109XAFVND[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8109XAFVND", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8109XAFVND), 3, 0));
         A8110XAFOBS = T01155_A8110XAFOBS[0] ;
         n8110XAFOBS = T01155_n8110XAFOBS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8110XAFOBS", A8110XAFOBS);
         A8111XAFDTOPZO = T01155_A8111XAFDTOPZO[0] ;
         n8111XAFDTOPZO = T01155_n8111XAFDTOPZO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8111XAFDTOPZO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8111XAFDTOPZO), 5, 0));
         A8112XAFDTOPRC = T01155_A8112XAFDTOPRC[0] ;
         n8112XAFDTOPRC = T01155_n8112XAFDTOPRC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8112XAFDTOPRC", GXutil.ltrimstr( A8112XAFDTOPRC, 6, 2));
         A8113XAFUSUGEN = T01155_A8113XAFUSUGEN[0] ;
         n8113XAFUSUGEN = T01155_n8113XAFUSUGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8113XAFUSUGEN", A8113XAFUSUGEN);
         A8114XAFFCHGEN = T01155_A8114XAFFCHGEN[0] ;
         n8114XAFFCHGEN = T01155_n8114XAFFCHGEN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8114XAFFCHGEN", localUtil.ttoc( A8114XAFFCHGEN, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8115XAFUSULEE = T01155_A8115XAFUSULEE[0] ;
         n8115XAFUSULEE = T01155_n8115XAFUSULEE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8115XAFUSULEE", A8115XAFUSULEE);
         A8116XAFFCHLEE = T01155_A8116XAFFCHLEE[0] ;
         n8116XAFFCHLEE = T01155_n8116XAFFCHLEE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8116XAFFCHLEE", localUtil.ttoc( A8116XAFFCHLEE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A8117XAFEST = T01155_A8117XAFEST[0] ;
         n8117XAFEST = T01155_n8117XAFEST[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8117XAFEST", A8117XAFEST);
         A8118XAFERR = T01155_A8118XAFERR[0] ;
         n8118XAFERR = T01155_n8118XAFERR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8118XAFERR", A8118XAFERR);
         Z8103XAFALPCOD = A8103XAFALPCOD ;
         sMode1138 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1151138( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1138 = (short)(0) ;
            initializeNonKey1151138( ) ;
         }
         Gx_mode = sMode1138 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1138 = (short)(0) ;
         initializeNonKey1151138( ) ;
         sMode1138 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1138 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1151138( ) ;
      if ( RcdFound1138 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1138 = (short)(0) ;
      /* Using cursor T01158 */
      pr_default.execute(6, new Object[] {Long.valueOf(A8103XAFALPCOD)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( T01158_A8103XAFALPCOD[0] == A8103XAFALPCOD ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( T01158_A8103XAFALPCOD[0] == A8103XAFALPCOD ) )
         {
            RcdFound1138 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1138 = (short)(0) ;
      /* Using cursor T01159 */
      pr_default.execute(7, new Object[] {Long.valueOf(A8103XAFALPCOD)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( T01159_A8103XAFALPCOD[0] == A8103XAFALPCOD ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( T01159_A8103XAFALPCOD[0] == A8103XAFALPCOD ) )
         {
            RcdFound1138 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1151138( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtXAFTpo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1151138( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1138 == 1 )
         {
            if ( A8103XAFALPCOD != Z8103XAFALPCOD )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "XAFALPCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAFALPCOD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtXAFTpo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1151138( ) ;
               GX_FocusControl = edtXAFTpo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A8103XAFALPCOD != Z8103XAFALPCOD )
            {
               /* Insert record */
               GX_FocusControl = edtXAFTpo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1151138( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "XAFALPCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtXAFALPCOD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtXAFTpo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1151138( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( A8103XAFALPCOD != Z8103XAFALPCOD )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "XAFALPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFALPCOD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtXAFTpo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void btn_check( )
   {
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getKey1151138( ) ;
      if ( RcdFound1138 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "XAFALPCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFALPCOD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A8103XAFALPCOD != Z8103XAFALPCOD )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "XAFALPCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtXAFALPCOD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( isDlt( ) )
         {
            delete_check( ) ;
         }
         else
         {
            update_check( ) ;
         }
      }
      else
      {
         if ( A8103XAFALPCOD != Z8103XAFALPCOD )
         {
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "XAFALPCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtXAFALPCOD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               insert_check( ) ;
            }
         }
      }
      Application.rollbackDataStores(context, remoteHandle, pr_default, "txaf");
      GX_FocusControl = edtXAFTpo_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1150( ) ;
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

   public void checkOptimisticConcurrency1151138( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01154 */
         pr_default.execute(2, new Object[] {Long.valueOf(A8103XAFALPCOD)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINT_REMISIONES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z8104XAFTpo, T01154_A8104XAFTpo[0]) != 0 ) || ( GXutil.strcmp(Z8105XAFCLI, T01154_A8105XAFCLI[0]) != 0 ) || !( GXutil.dateCompare(Z8106XAFFCH, T01154_A8106XAFFCH[0]) ) || !( GXutil.dateCompare(Z8107XAFVTO, T01154_A8107XAFVTO[0]) ) || ( GXutil.strcmp(Z8108XAFFPG, T01154_A8108XAFFPG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8109XAFVND != T01154_A8109XAFVND[0] ) || ( GXutil.strcmp(Z8110XAFOBS, T01154_A8110XAFOBS[0]) != 0 ) || ( Z8111XAFDTOPZO != T01154_A8111XAFDTOPZO[0] ) || ( DecimalUtil.compareTo(Z8112XAFDTOPRC, T01154_A8112XAFDTOPRC[0]) != 0 ) || ( GXutil.strcmp(Z8113XAFUSUGEN, T01154_A8113XAFUSUGEN[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z8114XAFFCHGEN, T01154_A8114XAFFCHGEN[0]) ) || ( GXutil.strcmp(Z8115XAFUSULEE, T01154_A8115XAFUSULEE[0]) != 0 ) || !( GXutil.dateCompare(Z8116XAFFCHLEE, T01154_A8116XAFFCHLEE[0]) ) || ( GXutil.strcmp(Z8117XAFEST, T01154_A8117XAFEST[0]) != 0 ) || ( GXutil.strcmp(Z8118XAFERR, T01154_A8118XAFERR[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z8104XAFTpo, T01154_A8104XAFTpo[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFTpo");
               GXutil.writeLogRaw("Old: ",Z8104XAFTpo);
               GXutil.writeLogRaw("Current: ",T01154_A8104XAFTpo[0]);
            }
            if ( GXutil.strcmp(Z8105XAFCLI, T01154_A8105XAFCLI[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFCLI");
               GXutil.writeLogRaw("Old: ",Z8105XAFCLI);
               GXutil.writeLogRaw("Current: ",T01154_A8105XAFCLI[0]);
            }
            if ( !( GXutil.dateCompare(Z8106XAFFCH, T01154_A8106XAFFCH[0]) ) )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFFCH");
               GXutil.writeLogRaw("Old: ",Z8106XAFFCH);
               GXutil.writeLogRaw("Current: ",T01154_A8106XAFFCH[0]);
            }
            if ( !( GXutil.dateCompare(Z8107XAFVTO, T01154_A8107XAFVTO[0]) ) )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFVTO");
               GXutil.writeLogRaw("Old: ",Z8107XAFVTO);
               GXutil.writeLogRaw("Current: ",T01154_A8107XAFVTO[0]);
            }
            if ( GXutil.strcmp(Z8108XAFFPG, T01154_A8108XAFFPG[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFFPG");
               GXutil.writeLogRaw("Old: ",Z8108XAFFPG);
               GXutil.writeLogRaw("Current: ",T01154_A8108XAFFPG[0]);
            }
            if ( Z8109XAFVND != T01154_A8109XAFVND[0] )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFVND");
               GXutil.writeLogRaw("Old: ",Z8109XAFVND);
               GXutil.writeLogRaw("Current: ",T01154_A8109XAFVND[0]);
            }
            if ( GXutil.strcmp(Z8110XAFOBS, T01154_A8110XAFOBS[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFOBS");
               GXutil.writeLogRaw("Old: ",Z8110XAFOBS);
               GXutil.writeLogRaw("Current: ",T01154_A8110XAFOBS[0]);
            }
            if ( Z8111XAFDTOPZO != T01154_A8111XAFDTOPZO[0] )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFDTOPZO");
               GXutil.writeLogRaw("Old: ",Z8111XAFDTOPZO);
               GXutil.writeLogRaw("Current: ",T01154_A8111XAFDTOPZO[0]);
            }
            if ( DecimalUtil.compareTo(Z8112XAFDTOPRC, T01154_A8112XAFDTOPRC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFDTOPRC");
               GXutil.writeLogRaw("Old: ",Z8112XAFDTOPRC);
               GXutil.writeLogRaw("Current: ",T01154_A8112XAFDTOPRC[0]);
            }
            if ( GXutil.strcmp(Z8113XAFUSUGEN, T01154_A8113XAFUSUGEN[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFUSUGEN");
               GXutil.writeLogRaw("Old: ",Z8113XAFUSUGEN);
               GXutil.writeLogRaw("Current: ",T01154_A8113XAFUSUGEN[0]);
            }
            if ( !( GXutil.dateCompare(Z8114XAFFCHGEN, T01154_A8114XAFFCHGEN[0]) ) )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFFCHGEN");
               GXutil.writeLogRaw("Old: ",Z8114XAFFCHGEN);
               GXutil.writeLogRaw("Current: ",T01154_A8114XAFFCHGEN[0]);
            }
            if ( GXutil.strcmp(Z8115XAFUSULEE, T01154_A8115XAFUSULEE[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFUSULEE");
               GXutil.writeLogRaw("Old: ",Z8115XAFUSULEE);
               GXutil.writeLogRaw("Current: ",T01154_A8115XAFUSULEE[0]);
            }
            if ( !( GXutil.dateCompare(Z8116XAFFCHLEE, T01154_A8116XAFFCHLEE[0]) ) )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFFCHLEE");
               GXutil.writeLogRaw("Old: ",Z8116XAFFCHLEE);
               GXutil.writeLogRaw("Current: ",T01154_A8116XAFFCHLEE[0]);
            }
            if ( GXutil.strcmp(Z8117XAFEST, T01154_A8117XAFEST[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFEST");
               GXutil.writeLogRaw("Old: ",Z8117XAFEST);
               GXutil.writeLogRaw("Current: ",T01154_A8117XAFEST[0]);
            }
            if ( GXutil.strcmp(Z8118XAFERR, T01154_A8118XAFERR[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFERR");
               GXutil.writeLogRaw("Old: ",Z8118XAFERR);
               GXutil.writeLogRaw("Current: ",T01154_A8118XAFERR[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINT_REMISIONES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1151138( )
   {
      beforeValidate1151138( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1151138( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1151138( 0) ;
         checkOptimisticConcurrency1151138( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1151138( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1151138( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011510 */
                  pr_default.execute(8, new Object[] {Long.valueOf(A8103XAFALPCOD), Boolean.valueOf(n8104XAFTpo), A8104XAFTpo, Boolean.valueOf(n8105XAFCLI), A8105XAFCLI, Boolean.valueOf(n8106XAFFCH), A8106XAFFCH, Boolean.valueOf(n8107XAFVTO), A8107XAFVTO, Boolean.valueOf(n8108XAFFPG), A8108XAFFPG, Boolean.valueOf(n8109XAFVND), Short.valueOf(A8109XAFVND), Boolean.valueOf(n8110XAFOBS), A8110XAFOBS, Boolean.valueOf(n8111XAFDTOPZO), Integer.valueOf(A8111XAFDTOPZO), Boolean.valueOf(n8112XAFDTOPRC), A8112XAFDTOPRC, Boolean.valueOf(n8113XAFUSUGEN), A8113XAFUSUGEN, Boolean.valueOf(n8114XAFFCHGEN), A8114XAFFCHGEN, Boolean.valueOf(n8115XAFUSULEE), A8115XAFUSULEE, Boolean.valueOf(n8116XAFFCHLEE), A8116XAFFCHLEE, Boolean.valueOf(n8117XAFEST), A8117XAFEST, Boolean.valueOf(n8118XAFERR), A8118XAFERR});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINT_REMISIONES");
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
                        processLevel1151138( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
                           }
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
            load1151138( ) ;
         }
         endLevel1151138( ) ;
      }
      closeExtendedTableCursors1151138( ) ;
   }

   public void update1151138( )
   {
      beforeValidate1151138( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1151138( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1151138( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1151138( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1151138( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011511 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n8104XAFTpo), A8104XAFTpo, Boolean.valueOf(n8105XAFCLI), A8105XAFCLI, Boolean.valueOf(n8106XAFFCH), A8106XAFFCH, Boolean.valueOf(n8107XAFVTO), A8107XAFVTO, Boolean.valueOf(n8108XAFFPG), A8108XAFFPG, Boolean.valueOf(n8109XAFVND), Short.valueOf(A8109XAFVND), Boolean.valueOf(n8110XAFOBS), A8110XAFOBS, Boolean.valueOf(n8111XAFDTOPZO), Integer.valueOf(A8111XAFDTOPZO), Boolean.valueOf(n8112XAFDTOPRC), A8112XAFDTOPRC, Boolean.valueOf(n8113XAFUSUGEN), A8113XAFUSUGEN, Boolean.valueOf(n8114XAFFCHGEN), A8114XAFFCHGEN, Boolean.valueOf(n8115XAFUSULEE), A8115XAFUSULEE, Boolean.valueOf(n8116XAFFCHLEE), A8116XAFFCHLEE, Boolean.valueOf(n8117XAFEST), A8117XAFEST, Boolean.valueOf(n8118XAFERR), A8118XAFERR, Long.valueOf(A8103XAFALPCOD)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINT_REMISIONES");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINT_REMISIONES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1151138( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1151138( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel1151138( ) ;
      }
      closeExtendedTableCursors1151138( ) ;
   }

   public void deferredUpdate1151138( )
   {
   }

   public void delete( )
   {
      beforeValidate1151138( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1151138( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1151138( ) ;
         afterConfirm1151138( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1151138( ) ;
            if ( AnyError == 0 )
            {
               scanStart1151139( ) ;
               while ( RcdFound1139 != 0 )
               {
                  getByPrimaryKey1151139( ) ;
                  delete1151139( ) ;
                  scanNext1151139( ) ;
               }
               scanEnd1151139( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011512 */
                  pr_default.execute(10, new Object[] {Long.valueOf(A8103XAFALPCOD)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINT_REMISIONES");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
      }
      sMode1138 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1151138( ) ;
      Gx_mode = sMode1138 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1151138( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1151139( )
   {
      nGXsfl_100_idx = 0 ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         readRow1151139( ) ;
         if ( ( nRcdExists_1139 != 0 ) || ( nIsMod_1139 != 0 ) )
         {
            standaloneNotModal1151139( ) ;
            getKey1151139( ) ;
            if ( ( nRcdExists_1139 == 0 ) && ( nRcdDeleted_1139 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1151139( ) ;
            }
            else
            {
               if ( RcdFound1139 != 0 )
               {
                  if ( ( nRcdDeleted_1139 != 0 ) && ( nRcdExists_1139 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1151139( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1139 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1151139( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1139 == 0 )
                  {
                     GXCCtl = "XAFLIN_" + sGXsfl_100_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtXAFLIN_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1139_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLIN_Internalname, GXutil.ltrim( localUtil.ntoc( A8119XAFLIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINHDR_Internalname, GXutil.rtrim( A8120XAFLINHDR)) ;
         httpContext.changePostValue( edtXAFLINALR_Internalname, GXutil.rtrim( A8121XAFLINALR)) ;
         httpContext.changePostValue( edtXAFLINLOT_Internalname, GXutil.rtrim( A8122XAFLINLOT)) ;
         httpContext.changePostValue( edtXAFLINPZA_Internalname, GXutil.ltrim( localUtil.ntoc( A8123XAFLINPZA, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINARTC_Internalname, GXutil.rtrim( A8124XAFLINARTC)) ;
         httpContext.changePostValue( edtXAFLINARTD_Internalname, GXutil.rtrim( A8125XAFLINARTD)) ;
         httpContext.changePostValue( edtXAFLININTC_Internalname, GXutil.ltrim( localUtil.ntoc( A8126XAFLININTC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINDIBC_Internalname, GXutil.rtrim( A8127XAFLINDIBC)) ;
         httpContext.changePostValue( edtXAFLINDIBD_Internalname, GXutil.rtrim( A8128XAFLINDIBD)) ;
         httpContext.changePostValue( edtXAFLINCOLC_Internalname, GXutil.rtrim( A8129XAFLINCOLC)) ;
         httpContext.changePostValue( edtXAFLINCOLD_Internalname, GXutil.rtrim( A8130XAFLINCOLD)) ;
         httpContext.changePostValue( edtXAFLINKGSE_Internalname, GXutil.ltrim( localUtil.ntoc( A8131XAFLINKGSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINKGSS_Internalname, GXutil.ltrim( localUtil.ntoc( A8132XAFLINKGSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMER_Internalname, GXutil.ltrim( localUtil.ntoc( A8133XAFLINMER, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMTSS_Internalname, GXutil.ltrim( localUtil.ntoc( A8134XAFLINMTSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINPREK_Internalname, GXutil.ltrim( localUtil.ntoc( A8135XAFLINPREK, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINPREM_Internalname, GXutil.ltrim( localUtil.ntoc( A8136XAFLINPREM, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMOC_Internalname, GXutil.ltrim( localUtil.ntoc( A8137XAFLINMOC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMAQC_Internalname, GXutil.ltrim( localUtil.ntoc( A8138XAFLINMAQC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLININSC_Internalname, GXutil.ltrim( localUtil.ntoc( A8139XAFLININSC, (byte)(16), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINUSUG_Internalname, GXutil.rtrim( A8140XAFLINUSUG)) ;
         httpContext.changePostValue( edtXAFLINFCHG_Internalname, localUtil.ttoc( A8141XAFLINFCHG, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtXAFLINUSUL_Internalname, GXutil.rtrim( A8142XAFLINUSUL)) ;
         httpContext.changePostValue( edtXAFLINFCHL_Internalname, localUtil.ttoc( A8143XAFLINFCHL, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtXAFLINEST_Internalname, GXutil.rtrim( A8144XAFLINEST)) ;
         httpContext.changePostValue( edtXAFLINERR_Internalname, GXutil.rtrim( A8145XAFLINERR)) ;
         httpContext.changePostValue( edtXAFLINCCO_Internalname, GXutil.rtrim( A8146XAFLINCCO)) ;
         httpContext.changePostValue( edtXAFLINMTSE_Internalname, GXutil.ltrim( localUtil.ntoc( A8147XAFLINMTSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINKGS_Internalname, GXutil.ltrim( localUtil.ntoc( A8148XAFLINKGS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINMTS_Internalname, GXutil.ltrim( localUtil.ntoc( A8149XAFLINMTS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINREFC_Internalname, GXutil.rtrim( A8150XAFLINREFC)) ;
         httpContext.changePostValue( edtXAFLINREFD_Internalname, GXutil.rtrim( A8151XAFLINREFD)) ;
         httpContext.changePostValue( edtXAFLINPRE_Internalname, GXutil.ltrim( localUtil.ntoc( A8152XAFLINPRE, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINDTO_Internalname, GXutil.ltrim( localUtil.ntoc( A8309XAFLINDTO, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINREC_Internalname, GXutil.ltrim( localUtil.ntoc( A8310XAFLINREC, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtXAFLINKGR_Internalname, GXutil.ltrim( localUtil.ntoc( A12713XAFLINKGR, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8119XAFLIN_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8119XAFLIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8120XAFLINHDR_"+sGXsfl_100_idx, GXutil.rtrim( Z8120XAFLINHDR)) ;
         httpContext.changePostValue( "ZT_"+"Z8121XAFLINALR_"+sGXsfl_100_idx, GXutil.rtrim( Z8121XAFLINALR)) ;
         httpContext.changePostValue( "ZT_"+"Z8122XAFLINLOT_"+sGXsfl_100_idx, GXutil.rtrim( Z8122XAFLINLOT)) ;
         httpContext.changePostValue( "ZT_"+"Z8123XAFLINPZA_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8123XAFLINPZA, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8124XAFLINARTC_"+sGXsfl_100_idx, GXutil.rtrim( Z8124XAFLINARTC)) ;
         httpContext.changePostValue( "ZT_"+"Z8125XAFLINARTD_"+sGXsfl_100_idx, GXutil.rtrim( Z8125XAFLINARTD)) ;
         httpContext.changePostValue( "ZT_"+"Z8126XAFLININTC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8126XAFLININTC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8127XAFLINDIBC_"+sGXsfl_100_idx, GXutil.rtrim( Z8127XAFLINDIBC)) ;
         httpContext.changePostValue( "ZT_"+"Z8128XAFLINDIBD_"+sGXsfl_100_idx, GXutil.rtrim( Z8128XAFLINDIBD)) ;
         httpContext.changePostValue( "ZT_"+"Z8129XAFLINCOLC_"+sGXsfl_100_idx, GXutil.rtrim( Z8129XAFLINCOLC)) ;
         httpContext.changePostValue( "ZT_"+"Z8130XAFLINCOLD_"+sGXsfl_100_idx, GXutil.rtrim( Z8130XAFLINCOLD)) ;
         httpContext.changePostValue( "ZT_"+"Z8131XAFLINKGSE_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8131XAFLINKGSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8132XAFLINKGSS_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8132XAFLINKGSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8133XAFLINMER_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8133XAFLINMER, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8134XAFLINMTSS_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8134XAFLINMTSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8135XAFLINPREK_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8135XAFLINPREK, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8136XAFLINPREM_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8136XAFLINPREM, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8137XAFLINMOC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8137XAFLINMOC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8138XAFLINMAQC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8138XAFLINMAQC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8139XAFLININSC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8139XAFLININSC, (byte)(16), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8140XAFLINUSUG_"+sGXsfl_100_idx, GXutil.rtrim( Z8140XAFLINUSUG)) ;
         httpContext.changePostValue( "ZT_"+"Z8141XAFLINFCHG_"+sGXsfl_100_idx, localUtil.ttoc( Z8141XAFLINFCHG, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z8142XAFLINUSUL_"+sGXsfl_100_idx, GXutil.rtrim( Z8142XAFLINUSUL)) ;
         httpContext.changePostValue( "ZT_"+"Z8143XAFLINFCHL_"+sGXsfl_100_idx, localUtil.ttoc( Z8143XAFLINFCHL, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z8144XAFLINEST_"+sGXsfl_100_idx, GXutil.rtrim( Z8144XAFLINEST)) ;
         httpContext.changePostValue( "ZT_"+"Z8145XAFLINERR_"+sGXsfl_100_idx, GXutil.rtrim( Z8145XAFLINERR)) ;
         httpContext.changePostValue( "ZT_"+"Z8146XAFLINCCO_"+sGXsfl_100_idx, GXutil.rtrim( Z8146XAFLINCCO)) ;
         httpContext.changePostValue( "ZT_"+"Z8147XAFLINMTSE_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8147XAFLINMTSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8148XAFLINKGS_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8148XAFLINKGS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8149XAFLINMTS_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8149XAFLINMTS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8150XAFLINREFC_"+sGXsfl_100_idx, GXutil.rtrim( Z8150XAFLINREFC)) ;
         httpContext.changePostValue( "ZT_"+"Z8151XAFLINREFD_"+sGXsfl_100_idx, GXutil.rtrim( Z8151XAFLINREFD)) ;
         httpContext.changePostValue( "ZT_"+"Z8152XAFLINPRE_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8152XAFLINPRE, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8309XAFLINDTO_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8309XAFLINDTO, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8310XAFLINREC_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z8310XAFLINREC, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12713XAFLINKGR_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( Z12713XAFLINKGR, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1139_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1139_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1139_"+sGXsfl_100_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1139 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1139_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1139_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLIN_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINHDR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINHDR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINALR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINALR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINLOT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINLOT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINPZA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPZA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINARTC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINARTC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINARTD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINARTD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLININTC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLININTC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINDIBC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDIBC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINDIBD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDIBD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINCOLC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCOLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINCOLD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCOLD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINKGSE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGSE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINKGSS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGSS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMER_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMER_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMTSS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTSS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINPREK_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPREK_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINPREM_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPREM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMOC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMOC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMAQC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMAQC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLININSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLININSC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINUSUG_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINUSUG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINFCHG_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINFCHG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINUSUL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINUSUL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINFCHL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINFCHL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINEST_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINEST_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINERR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINERR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINCCO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCCO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMTSE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTSE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINKGS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINMTS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTS_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINREFC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREFC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINREFD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREFD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINPRE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPRE_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINDTO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDTO_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINREC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "XAFLINKGR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1151139( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1139 = (short)(0) ;
      nIsMod_1139 = (short)(0) ;
      nRcdDeleted_1139 = (short)(0) ;
   }

   public void processLevel1151138( )
   {
      /* Save parent mode. */
      sMode1138 = Gx_mode ;
      processNestedLevel1151139( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1138 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1151138( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1151138( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "txaf");
         if ( AnyError == 0 )
         {
            confirmValues1150( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "txaf");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1151138( )
   {
      this.A8103XAFALPCOD = A8103XAFALPCOD ;
      /* Scan By routine */
      /* Using cursor T011513 */
      pr_default.execute(11, new Object[] {Long.valueOf(A8103XAFALPCOD)});
      RcdFound1138 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1138 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1151138( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1138 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1138 = (short)(1) ;
      }
   }

   public void scanEnd1151138( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1151138( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1151138( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1151138( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1151138( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1151138( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1151138( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1151138( )
   {
      edtXAFALPCOD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFALPCOD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFALPCOD_Enabled), 5, 0), true);
      edtXAFTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFTpo_Enabled), 5, 0), true);
      edtXAFCLI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFCLI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFCLI_Enabled), 5, 0), true);
      edtXAFFCH_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFFCH_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFFCH_Enabled), 5, 0), true);
      edtXAFVTO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFVTO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFVTO_Enabled), 5, 0), true);
      edtXAFFPG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFFPG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFFPG_Enabled), 5, 0), true);
      edtXAFVND_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFVND_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFVND_Enabled), 5, 0), true);
      edtXAFOBS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFOBS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFOBS_Enabled), 5, 0), true);
      edtXAFDTOPZO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFDTOPZO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFDTOPZO_Enabled), 5, 0), true);
      edtXAFDTOPRC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFDTOPRC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFDTOPRC_Enabled), 5, 0), true);
      edtXAFUSUGEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFUSUGEN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFUSUGEN_Enabled), 5, 0), true);
      edtXAFFCHGEN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFFCHGEN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFFCHGEN_Enabled), 5, 0), true);
      edtXAFUSULEE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFUSULEE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFUSULEE_Enabled), 5, 0), true);
      edtXAFFCHLEE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFFCHLEE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFFCHLEE_Enabled), 5, 0), true);
      edtXAFEST_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFEST_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFEST_Enabled), 5, 0), true);
      edtXAFERR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFERR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFERR_Enabled), 5, 0), true);
   }

   public void zm1151139( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8120XAFLINHDR = T01153_A8120XAFLINHDR[0] ;
            Z8121XAFLINALR = T01153_A8121XAFLINALR[0] ;
            Z8122XAFLINLOT = T01153_A8122XAFLINLOT[0] ;
            Z8123XAFLINPZA = T01153_A8123XAFLINPZA[0] ;
            Z8124XAFLINARTC = T01153_A8124XAFLINARTC[0] ;
            Z8125XAFLINARTD = T01153_A8125XAFLINARTD[0] ;
            Z8126XAFLININTC = T01153_A8126XAFLININTC[0] ;
            Z8127XAFLINDIBC = T01153_A8127XAFLINDIBC[0] ;
            Z8128XAFLINDIBD = T01153_A8128XAFLINDIBD[0] ;
            Z8129XAFLINCOLC = T01153_A8129XAFLINCOLC[0] ;
            Z8130XAFLINCOLD = T01153_A8130XAFLINCOLD[0] ;
            Z8131XAFLINKGSE = T01153_A8131XAFLINKGSE[0] ;
            Z8132XAFLINKGSS = T01153_A8132XAFLINKGSS[0] ;
            Z8133XAFLINMER = T01153_A8133XAFLINMER[0] ;
            Z8134XAFLINMTSS = T01153_A8134XAFLINMTSS[0] ;
            Z8135XAFLINPREK = T01153_A8135XAFLINPREK[0] ;
            Z8136XAFLINPREM = T01153_A8136XAFLINPREM[0] ;
            Z8137XAFLINMOC = T01153_A8137XAFLINMOC[0] ;
            Z8138XAFLINMAQC = T01153_A8138XAFLINMAQC[0] ;
            Z8139XAFLININSC = T01153_A8139XAFLININSC[0] ;
            Z8140XAFLINUSUG = T01153_A8140XAFLINUSUG[0] ;
            Z8141XAFLINFCHG = T01153_A8141XAFLINFCHG[0] ;
            Z8142XAFLINUSUL = T01153_A8142XAFLINUSUL[0] ;
            Z8143XAFLINFCHL = T01153_A8143XAFLINFCHL[0] ;
            Z8144XAFLINEST = T01153_A8144XAFLINEST[0] ;
            Z8145XAFLINERR = T01153_A8145XAFLINERR[0] ;
            Z8146XAFLINCCO = T01153_A8146XAFLINCCO[0] ;
            Z8147XAFLINMTSE = T01153_A8147XAFLINMTSE[0] ;
            Z8148XAFLINKGS = T01153_A8148XAFLINKGS[0] ;
            Z8149XAFLINMTS = T01153_A8149XAFLINMTS[0] ;
            Z8150XAFLINREFC = T01153_A8150XAFLINREFC[0] ;
            Z8151XAFLINREFD = T01153_A8151XAFLINREFD[0] ;
            Z8152XAFLINPRE = T01153_A8152XAFLINPRE[0] ;
            Z8309XAFLINDTO = T01153_A8309XAFLINDTO[0] ;
            Z8310XAFLINREC = T01153_A8310XAFLINREC[0] ;
            Z12713XAFLINKGR = T01153_A12713XAFLINKGR[0] ;
         }
         else
         {
            Z8120XAFLINHDR = A8120XAFLINHDR ;
            Z8121XAFLINALR = A8121XAFLINALR ;
            Z8122XAFLINLOT = A8122XAFLINLOT ;
            Z8123XAFLINPZA = A8123XAFLINPZA ;
            Z8124XAFLINARTC = A8124XAFLINARTC ;
            Z8125XAFLINARTD = A8125XAFLINARTD ;
            Z8126XAFLININTC = A8126XAFLININTC ;
            Z8127XAFLINDIBC = A8127XAFLINDIBC ;
            Z8128XAFLINDIBD = A8128XAFLINDIBD ;
            Z8129XAFLINCOLC = A8129XAFLINCOLC ;
            Z8130XAFLINCOLD = A8130XAFLINCOLD ;
            Z8131XAFLINKGSE = A8131XAFLINKGSE ;
            Z8132XAFLINKGSS = A8132XAFLINKGSS ;
            Z8133XAFLINMER = A8133XAFLINMER ;
            Z8134XAFLINMTSS = A8134XAFLINMTSS ;
            Z8135XAFLINPREK = A8135XAFLINPREK ;
            Z8136XAFLINPREM = A8136XAFLINPREM ;
            Z8137XAFLINMOC = A8137XAFLINMOC ;
            Z8138XAFLINMAQC = A8138XAFLINMAQC ;
            Z8139XAFLININSC = A8139XAFLININSC ;
            Z8140XAFLINUSUG = A8140XAFLINUSUG ;
            Z8141XAFLINFCHG = A8141XAFLINFCHG ;
            Z8142XAFLINUSUL = A8142XAFLINUSUL ;
            Z8143XAFLINFCHL = A8143XAFLINFCHL ;
            Z8144XAFLINEST = A8144XAFLINEST ;
            Z8145XAFLINERR = A8145XAFLINERR ;
            Z8146XAFLINCCO = A8146XAFLINCCO ;
            Z8147XAFLINMTSE = A8147XAFLINMTSE ;
            Z8148XAFLINKGS = A8148XAFLINKGS ;
            Z8149XAFLINMTS = A8149XAFLINMTS ;
            Z8150XAFLINREFC = A8150XAFLINREFC ;
            Z8151XAFLINREFD = A8151XAFLINREFD ;
            Z8152XAFLINPRE = A8152XAFLINPRE ;
            Z8309XAFLINDTO = A8309XAFLINDTO ;
            Z8310XAFLINREC = A8310XAFLINREC ;
            Z12713XAFLINKGR = A12713XAFLINKGR ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z8103XAFALPCOD = A8103XAFALPCOD ;
         Z8119XAFLIN = A8119XAFLIN ;
         Z8120XAFLINHDR = A8120XAFLINHDR ;
         Z8121XAFLINALR = A8121XAFLINALR ;
         Z8122XAFLINLOT = A8122XAFLINLOT ;
         Z8123XAFLINPZA = A8123XAFLINPZA ;
         Z8124XAFLINARTC = A8124XAFLINARTC ;
         Z8125XAFLINARTD = A8125XAFLINARTD ;
         Z8126XAFLININTC = A8126XAFLININTC ;
         Z8127XAFLINDIBC = A8127XAFLINDIBC ;
         Z8128XAFLINDIBD = A8128XAFLINDIBD ;
         Z8129XAFLINCOLC = A8129XAFLINCOLC ;
         Z8130XAFLINCOLD = A8130XAFLINCOLD ;
         Z8131XAFLINKGSE = A8131XAFLINKGSE ;
         Z8132XAFLINKGSS = A8132XAFLINKGSS ;
         Z8133XAFLINMER = A8133XAFLINMER ;
         Z8134XAFLINMTSS = A8134XAFLINMTSS ;
         Z8135XAFLINPREK = A8135XAFLINPREK ;
         Z8136XAFLINPREM = A8136XAFLINPREM ;
         Z8137XAFLINMOC = A8137XAFLINMOC ;
         Z8138XAFLINMAQC = A8138XAFLINMAQC ;
         Z8139XAFLININSC = A8139XAFLININSC ;
         Z8140XAFLINUSUG = A8140XAFLINUSUG ;
         Z8141XAFLINFCHG = A8141XAFLINFCHG ;
         Z8142XAFLINUSUL = A8142XAFLINUSUL ;
         Z8143XAFLINFCHL = A8143XAFLINFCHL ;
         Z8144XAFLINEST = A8144XAFLINEST ;
         Z8145XAFLINERR = A8145XAFLINERR ;
         Z8146XAFLINCCO = A8146XAFLINCCO ;
         Z8147XAFLINMTSE = A8147XAFLINMTSE ;
         Z8148XAFLINKGS = A8148XAFLINKGS ;
         Z8149XAFLINMTS = A8149XAFLINMTS ;
         Z8150XAFLINREFC = A8150XAFLINREFC ;
         Z8151XAFLINREFD = A8151XAFLINREFD ;
         Z8152XAFLINPRE = A8152XAFLINPRE ;
         Z8309XAFLINDTO = A8309XAFLINDTO ;
         Z8310XAFLINREC = A8310XAFLINREC ;
         Z12713XAFLINKGR = A12713XAFLINKGR ;
      }
   }

   public void standaloneNotModal1151139( )
   {
   }

   public void standaloneModal1151139( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtXAFLIN_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXAFLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLIN_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
      else
      {
         edtXAFLIN_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtXAFLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLIN_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      }
   }

   public void load1151139( )
   {
      /* Using cursor T011514 */
      pr_default.execute(12, new Object[] {Long.valueOf(A8103XAFALPCOD), Integer.valueOf(A8119XAFLIN)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1139 = (short)(1) ;
         A8120XAFLINHDR = T011514_A8120XAFLINHDR[0] ;
         n8120XAFLINHDR = T011514_n8120XAFLINHDR[0] ;
         A8121XAFLINALR = T011514_A8121XAFLINALR[0] ;
         n8121XAFLINALR = T011514_n8121XAFLINALR[0] ;
         A8122XAFLINLOT = T011514_A8122XAFLINLOT[0] ;
         n8122XAFLINLOT = T011514_n8122XAFLINLOT[0] ;
         A8123XAFLINPZA = T011514_A8123XAFLINPZA[0] ;
         n8123XAFLINPZA = T011514_n8123XAFLINPZA[0] ;
         A8124XAFLINARTC = T011514_A8124XAFLINARTC[0] ;
         n8124XAFLINARTC = T011514_n8124XAFLINARTC[0] ;
         A8125XAFLINARTD = T011514_A8125XAFLINARTD[0] ;
         n8125XAFLINARTD = T011514_n8125XAFLINARTD[0] ;
         A8126XAFLININTC = T011514_A8126XAFLININTC[0] ;
         n8126XAFLININTC = T011514_n8126XAFLININTC[0] ;
         A8127XAFLINDIBC = T011514_A8127XAFLINDIBC[0] ;
         n8127XAFLINDIBC = T011514_n8127XAFLINDIBC[0] ;
         A8128XAFLINDIBD = T011514_A8128XAFLINDIBD[0] ;
         n8128XAFLINDIBD = T011514_n8128XAFLINDIBD[0] ;
         A8129XAFLINCOLC = T011514_A8129XAFLINCOLC[0] ;
         n8129XAFLINCOLC = T011514_n8129XAFLINCOLC[0] ;
         A8130XAFLINCOLD = T011514_A8130XAFLINCOLD[0] ;
         n8130XAFLINCOLD = T011514_n8130XAFLINCOLD[0] ;
         A8131XAFLINKGSE = T011514_A8131XAFLINKGSE[0] ;
         n8131XAFLINKGSE = T011514_n8131XAFLINKGSE[0] ;
         A8132XAFLINKGSS = T011514_A8132XAFLINKGSS[0] ;
         n8132XAFLINKGSS = T011514_n8132XAFLINKGSS[0] ;
         A8133XAFLINMER = T011514_A8133XAFLINMER[0] ;
         n8133XAFLINMER = T011514_n8133XAFLINMER[0] ;
         A8134XAFLINMTSS = T011514_A8134XAFLINMTSS[0] ;
         n8134XAFLINMTSS = T011514_n8134XAFLINMTSS[0] ;
         A8135XAFLINPREK = T011514_A8135XAFLINPREK[0] ;
         n8135XAFLINPREK = T011514_n8135XAFLINPREK[0] ;
         A8136XAFLINPREM = T011514_A8136XAFLINPREM[0] ;
         n8136XAFLINPREM = T011514_n8136XAFLINPREM[0] ;
         A8137XAFLINMOC = T011514_A8137XAFLINMOC[0] ;
         n8137XAFLINMOC = T011514_n8137XAFLINMOC[0] ;
         A8138XAFLINMAQC = T011514_A8138XAFLINMAQC[0] ;
         n8138XAFLINMAQC = T011514_n8138XAFLINMAQC[0] ;
         A8139XAFLININSC = T011514_A8139XAFLININSC[0] ;
         n8139XAFLININSC = T011514_n8139XAFLININSC[0] ;
         A8140XAFLINUSUG = T011514_A8140XAFLINUSUG[0] ;
         n8140XAFLINUSUG = T011514_n8140XAFLINUSUG[0] ;
         A8141XAFLINFCHG = T011514_A8141XAFLINFCHG[0] ;
         n8141XAFLINFCHG = T011514_n8141XAFLINFCHG[0] ;
         A8142XAFLINUSUL = T011514_A8142XAFLINUSUL[0] ;
         n8142XAFLINUSUL = T011514_n8142XAFLINUSUL[0] ;
         A8143XAFLINFCHL = T011514_A8143XAFLINFCHL[0] ;
         n8143XAFLINFCHL = T011514_n8143XAFLINFCHL[0] ;
         A8144XAFLINEST = T011514_A8144XAFLINEST[0] ;
         n8144XAFLINEST = T011514_n8144XAFLINEST[0] ;
         A8145XAFLINERR = T011514_A8145XAFLINERR[0] ;
         n8145XAFLINERR = T011514_n8145XAFLINERR[0] ;
         A8146XAFLINCCO = T011514_A8146XAFLINCCO[0] ;
         n8146XAFLINCCO = T011514_n8146XAFLINCCO[0] ;
         A8147XAFLINMTSE = T011514_A8147XAFLINMTSE[0] ;
         n8147XAFLINMTSE = T011514_n8147XAFLINMTSE[0] ;
         A8148XAFLINKGS = T011514_A8148XAFLINKGS[0] ;
         n8148XAFLINKGS = T011514_n8148XAFLINKGS[0] ;
         A8149XAFLINMTS = T011514_A8149XAFLINMTS[0] ;
         n8149XAFLINMTS = T011514_n8149XAFLINMTS[0] ;
         A8150XAFLINREFC = T011514_A8150XAFLINREFC[0] ;
         n8150XAFLINREFC = T011514_n8150XAFLINREFC[0] ;
         A8151XAFLINREFD = T011514_A8151XAFLINREFD[0] ;
         n8151XAFLINREFD = T011514_n8151XAFLINREFD[0] ;
         A8152XAFLINPRE = T011514_A8152XAFLINPRE[0] ;
         n8152XAFLINPRE = T011514_n8152XAFLINPRE[0] ;
         A8309XAFLINDTO = T011514_A8309XAFLINDTO[0] ;
         n8309XAFLINDTO = T011514_n8309XAFLINDTO[0] ;
         A8310XAFLINREC = T011514_A8310XAFLINREC[0] ;
         n8310XAFLINREC = T011514_n8310XAFLINREC[0] ;
         A12713XAFLINKGR = T011514_A12713XAFLINKGR[0] ;
         n12713XAFLINKGR = T011514_n12713XAFLINKGR[0] ;
         zm1151139( -2) ;
      }
      pr_default.close(12);
      onLoadActions1151139( ) ;
   }

   public void onLoadActions1151139( )
   {
   }

   public void checkExtendedTable1151139( )
   {
      nIsDirty_1139 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1151139( ) ;
   }

   public void closeExtendedTableCursors1151139( )
   {
   }

   public void enableDisable1151139( )
   {
   }

   public void getKey1151139( )
   {
      /* Using cursor T011515 */
      pr_default.execute(13, new Object[] {Long.valueOf(A8103XAFALPCOD), Integer.valueOf(A8119XAFLIN)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1139 = (short)(1) ;
      }
      else
      {
         RcdFound1139 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey1151139( )
   {
      /* Using cursor T01153 */
      pr_default.execute(1, new Object[] {Long.valueOf(A8103XAFALPCOD), Integer.valueOf(A8119XAFLIN)});
      if ( (pr_default.getStatus(1) != 101) && ( T01153_A8103XAFALPCOD[0] == A8103XAFALPCOD ) )
      {
         zm1151139( 2) ;
         RcdFound1139 = (short)(1) ;
         initializeNonKey1151139( ) ;
         A8119XAFLIN = T01153_A8119XAFLIN[0] ;
         A8120XAFLINHDR = T01153_A8120XAFLINHDR[0] ;
         n8120XAFLINHDR = T01153_n8120XAFLINHDR[0] ;
         A8121XAFLINALR = T01153_A8121XAFLINALR[0] ;
         n8121XAFLINALR = T01153_n8121XAFLINALR[0] ;
         A8122XAFLINLOT = T01153_A8122XAFLINLOT[0] ;
         n8122XAFLINLOT = T01153_n8122XAFLINLOT[0] ;
         A8123XAFLINPZA = T01153_A8123XAFLINPZA[0] ;
         n8123XAFLINPZA = T01153_n8123XAFLINPZA[0] ;
         A8124XAFLINARTC = T01153_A8124XAFLINARTC[0] ;
         n8124XAFLINARTC = T01153_n8124XAFLINARTC[0] ;
         A8125XAFLINARTD = T01153_A8125XAFLINARTD[0] ;
         n8125XAFLINARTD = T01153_n8125XAFLINARTD[0] ;
         A8126XAFLININTC = T01153_A8126XAFLININTC[0] ;
         n8126XAFLININTC = T01153_n8126XAFLININTC[0] ;
         A8127XAFLINDIBC = T01153_A8127XAFLINDIBC[0] ;
         n8127XAFLINDIBC = T01153_n8127XAFLINDIBC[0] ;
         A8128XAFLINDIBD = T01153_A8128XAFLINDIBD[0] ;
         n8128XAFLINDIBD = T01153_n8128XAFLINDIBD[0] ;
         A8129XAFLINCOLC = T01153_A8129XAFLINCOLC[0] ;
         n8129XAFLINCOLC = T01153_n8129XAFLINCOLC[0] ;
         A8130XAFLINCOLD = T01153_A8130XAFLINCOLD[0] ;
         n8130XAFLINCOLD = T01153_n8130XAFLINCOLD[0] ;
         A8131XAFLINKGSE = T01153_A8131XAFLINKGSE[0] ;
         n8131XAFLINKGSE = T01153_n8131XAFLINKGSE[0] ;
         A8132XAFLINKGSS = T01153_A8132XAFLINKGSS[0] ;
         n8132XAFLINKGSS = T01153_n8132XAFLINKGSS[0] ;
         A8133XAFLINMER = T01153_A8133XAFLINMER[0] ;
         n8133XAFLINMER = T01153_n8133XAFLINMER[0] ;
         A8134XAFLINMTSS = T01153_A8134XAFLINMTSS[0] ;
         n8134XAFLINMTSS = T01153_n8134XAFLINMTSS[0] ;
         A8135XAFLINPREK = T01153_A8135XAFLINPREK[0] ;
         n8135XAFLINPREK = T01153_n8135XAFLINPREK[0] ;
         A8136XAFLINPREM = T01153_A8136XAFLINPREM[0] ;
         n8136XAFLINPREM = T01153_n8136XAFLINPREM[0] ;
         A8137XAFLINMOC = T01153_A8137XAFLINMOC[0] ;
         n8137XAFLINMOC = T01153_n8137XAFLINMOC[0] ;
         A8138XAFLINMAQC = T01153_A8138XAFLINMAQC[0] ;
         n8138XAFLINMAQC = T01153_n8138XAFLINMAQC[0] ;
         A8139XAFLININSC = T01153_A8139XAFLININSC[0] ;
         n8139XAFLININSC = T01153_n8139XAFLININSC[0] ;
         A8140XAFLINUSUG = T01153_A8140XAFLINUSUG[0] ;
         n8140XAFLINUSUG = T01153_n8140XAFLINUSUG[0] ;
         A8141XAFLINFCHG = T01153_A8141XAFLINFCHG[0] ;
         n8141XAFLINFCHG = T01153_n8141XAFLINFCHG[0] ;
         A8142XAFLINUSUL = T01153_A8142XAFLINUSUL[0] ;
         n8142XAFLINUSUL = T01153_n8142XAFLINUSUL[0] ;
         A8143XAFLINFCHL = T01153_A8143XAFLINFCHL[0] ;
         n8143XAFLINFCHL = T01153_n8143XAFLINFCHL[0] ;
         A8144XAFLINEST = T01153_A8144XAFLINEST[0] ;
         n8144XAFLINEST = T01153_n8144XAFLINEST[0] ;
         A8145XAFLINERR = T01153_A8145XAFLINERR[0] ;
         n8145XAFLINERR = T01153_n8145XAFLINERR[0] ;
         A8146XAFLINCCO = T01153_A8146XAFLINCCO[0] ;
         n8146XAFLINCCO = T01153_n8146XAFLINCCO[0] ;
         A8147XAFLINMTSE = T01153_A8147XAFLINMTSE[0] ;
         n8147XAFLINMTSE = T01153_n8147XAFLINMTSE[0] ;
         A8148XAFLINKGS = T01153_A8148XAFLINKGS[0] ;
         n8148XAFLINKGS = T01153_n8148XAFLINKGS[0] ;
         A8149XAFLINMTS = T01153_A8149XAFLINMTS[0] ;
         n8149XAFLINMTS = T01153_n8149XAFLINMTS[0] ;
         A8150XAFLINREFC = T01153_A8150XAFLINREFC[0] ;
         n8150XAFLINREFC = T01153_n8150XAFLINREFC[0] ;
         A8151XAFLINREFD = T01153_A8151XAFLINREFD[0] ;
         n8151XAFLINREFD = T01153_n8151XAFLINREFD[0] ;
         A8152XAFLINPRE = T01153_A8152XAFLINPRE[0] ;
         n8152XAFLINPRE = T01153_n8152XAFLINPRE[0] ;
         A8309XAFLINDTO = T01153_A8309XAFLINDTO[0] ;
         n8309XAFLINDTO = T01153_n8309XAFLINDTO[0] ;
         A8310XAFLINREC = T01153_A8310XAFLINREC[0] ;
         n8310XAFLINREC = T01153_n8310XAFLINREC[0] ;
         A12713XAFLINKGR = T01153_A12713XAFLINKGR[0] ;
         n12713XAFLINKGR = T01153_n12713XAFLINKGR[0] ;
         Z8103XAFALPCOD = A8103XAFALPCOD ;
         Z8119XAFLIN = A8119XAFLIN ;
         sMode1139 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1151139( ) ;
         Gx_mode = sMode1139 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1139 = (short)(0) ;
         initializeNonKey1151139( ) ;
         sMode1139 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1151139( ) ;
         Gx_mode = sMode1139 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1151139( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1151139( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01152 */
         pr_default.execute(0, new Object[] {Long.valueOf(A8103XAFALPCOD), Integer.valueOf(A8119XAFLIN)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINT_REMISIONES_DET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z8120XAFLINHDR, T01152_A8120XAFLINHDR[0]) != 0 ) || ( GXutil.strcmp(Z8121XAFLINALR, T01152_A8121XAFLINALR[0]) != 0 ) || ( GXutil.strcmp(Z8122XAFLINLOT, T01152_A8122XAFLINLOT[0]) != 0 ) || ( Z8123XAFLINPZA != T01152_A8123XAFLINPZA[0] ) || ( GXutil.strcmp(Z8124XAFLINARTC, T01152_A8124XAFLINARTC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8125XAFLINARTD, T01152_A8125XAFLINARTD[0]) != 0 ) || ( Z8126XAFLININTC != T01152_A8126XAFLININTC[0] ) || ( GXutil.strcmp(Z8127XAFLINDIBC, T01152_A8127XAFLINDIBC[0]) != 0 ) || ( GXutil.strcmp(Z8128XAFLINDIBD, T01152_A8128XAFLINDIBD[0]) != 0 ) || ( GXutil.strcmp(Z8129XAFLINCOLC, T01152_A8129XAFLINCOLC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8130XAFLINCOLD, T01152_A8130XAFLINCOLD[0]) != 0 ) || ( DecimalUtil.compareTo(Z8131XAFLINKGSE, T01152_A8131XAFLINKGSE[0]) != 0 ) || ( DecimalUtil.compareTo(Z8132XAFLINKGSS, T01152_A8132XAFLINKGSS[0]) != 0 ) || ( DecimalUtil.compareTo(Z8133XAFLINMER, T01152_A8133XAFLINMER[0]) != 0 ) || ( DecimalUtil.compareTo(Z8134XAFLINMTSS, T01152_A8134XAFLINMTSS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8135XAFLINPREK, T01152_A8135XAFLINPREK[0]) != 0 ) || ( DecimalUtil.compareTo(Z8136XAFLINPREM, T01152_A8136XAFLINPREM[0]) != 0 ) || ( DecimalUtil.compareTo(Z8137XAFLINMOC, T01152_A8137XAFLINMOC[0]) != 0 ) || ( DecimalUtil.compareTo(Z8138XAFLINMAQC, T01152_A8138XAFLINMAQC[0]) != 0 ) || ( DecimalUtil.compareTo(Z8139XAFLININSC, T01152_A8139XAFLININSC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8140XAFLINUSUG, T01152_A8140XAFLINUSUG[0]) != 0 ) || !( GXutil.dateCompare(Z8141XAFLINFCHG, T01152_A8141XAFLINFCHG[0]) ) || ( GXutil.strcmp(Z8142XAFLINUSUL, T01152_A8142XAFLINUSUL[0]) != 0 ) || !( GXutil.dateCompare(Z8143XAFLINFCHL, T01152_A8143XAFLINFCHL[0]) ) || ( GXutil.strcmp(Z8144XAFLINEST, T01152_A8144XAFLINEST[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8145XAFLINERR, T01152_A8145XAFLINERR[0]) != 0 ) || ( GXutil.strcmp(Z8146XAFLINCCO, T01152_A8146XAFLINCCO[0]) != 0 ) || ( DecimalUtil.compareTo(Z8147XAFLINMTSE, T01152_A8147XAFLINMTSE[0]) != 0 ) || ( DecimalUtil.compareTo(Z8148XAFLINKGS, T01152_A8148XAFLINKGS[0]) != 0 ) || ( DecimalUtil.compareTo(Z8149XAFLINMTS, T01152_A8149XAFLINMTS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8150XAFLINREFC, T01152_A8150XAFLINREFC[0]) != 0 ) || ( GXutil.strcmp(Z8151XAFLINREFD, T01152_A8151XAFLINREFD[0]) != 0 ) || ( DecimalUtil.compareTo(Z8152XAFLINPRE, T01152_A8152XAFLINPRE[0]) != 0 ) || ( DecimalUtil.compareTo(Z8309XAFLINDTO, T01152_A8309XAFLINDTO[0]) != 0 ) || ( DecimalUtil.compareTo(Z8310XAFLINREC, T01152_A8310XAFLINREC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12713XAFLINKGR, T01152_A12713XAFLINKGR[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z8120XAFLINHDR, T01152_A8120XAFLINHDR[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINHDR");
               GXutil.writeLogRaw("Old: ",Z8120XAFLINHDR);
               GXutil.writeLogRaw("Current: ",T01152_A8120XAFLINHDR[0]);
            }
            if ( GXutil.strcmp(Z8121XAFLINALR, T01152_A8121XAFLINALR[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINALR");
               GXutil.writeLogRaw("Old: ",Z8121XAFLINALR);
               GXutil.writeLogRaw("Current: ",T01152_A8121XAFLINALR[0]);
            }
            if ( GXutil.strcmp(Z8122XAFLINLOT, T01152_A8122XAFLINLOT[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINLOT");
               GXutil.writeLogRaw("Old: ",Z8122XAFLINLOT);
               GXutil.writeLogRaw("Current: ",T01152_A8122XAFLINLOT[0]);
            }
            if ( Z8123XAFLINPZA != T01152_A8123XAFLINPZA[0] )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINPZA");
               GXutil.writeLogRaw("Old: ",Z8123XAFLINPZA);
               GXutil.writeLogRaw("Current: ",T01152_A8123XAFLINPZA[0]);
            }
            if ( GXutil.strcmp(Z8124XAFLINARTC, T01152_A8124XAFLINARTC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINARTC");
               GXutil.writeLogRaw("Old: ",Z8124XAFLINARTC);
               GXutil.writeLogRaw("Current: ",T01152_A8124XAFLINARTC[0]);
            }
            if ( GXutil.strcmp(Z8125XAFLINARTD, T01152_A8125XAFLINARTD[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINARTD");
               GXutil.writeLogRaw("Old: ",Z8125XAFLINARTD);
               GXutil.writeLogRaw("Current: ",T01152_A8125XAFLINARTD[0]);
            }
            if ( Z8126XAFLININTC != T01152_A8126XAFLININTC[0] )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLININTC");
               GXutil.writeLogRaw("Old: ",Z8126XAFLININTC);
               GXutil.writeLogRaw("Current: ",T01152_A8126XAFLININTC[0]);
            }
            if ( GXutil.strcmp(Z8127XAFLINDIBC, T01152_A8127XAFLINDIBC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINDIBC");
               GXutil.writeLogRaw("Old: ",Z8127XAFLINDIBC);
               GXutil.writeLogRaw("Current: ",T01152_A8127XAFLINDIBC[0]);
            }
            if ( GXutil.strcmp(Z8128XAFLINDIBD, T01152_A8128XAFLINDIBD[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINDIBD");
               GXutil.writeLogRaw("Old: ",Z8128XAFLINDIBD);
               GXutil.writeLogRaw("Current: ",T01152_A8128XAFLINDIBD[0]);
            }
            if ( GXutil.strcmp(Z8129XAFLINCOLC, T01152_A8129XAFLINCOLC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINCOLC");
               GXutil.writeLogRaw("Old: ",Z8129XAFLINCOLC);
               GXutil.writeLogRaw("Current: ",T01152_A8129XAFLINCOLC[0]);
            }
            if ( GXutil.strcmp(Z8130XAFLINCOLD, T01152_A8130XAFLINCOLD[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINCOLD");
               GXutil.writeLogRaw("Old: ",Z8130XAFLINCOLD);
               GXutil.writeLogRaw("Current: ",T01152_A8130XAFLINCOLD[0]);
            }
            if ( DecimalUtil.compareTo(Z8131XAFLINKGSE, T01152_A8131XAFLINKGSE[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINKGSE");
               GXutil.writeLogRaw("Old: ",Z8131XAFLINKGSE);
               GXutil.writeLogRaw("Current: ",T01152_A8131XAFLINKGSE[0]);
            }
            if ( DecimalUtil.compareTo(Z8132XAFLINKGSS, T01152_A8132XAFLINKGSS[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINKGSS");
               GXutil.writeLogRaw("Old: ",Z8132XAFLINKGSS);
               GXutil.writeLogRaw("Current: ",T01152_A8132XAFLINKGSS[0]);
            }
            if ( DecimalUtil.compareTo(Z8133XAFLINMER, T01152_A8133XAFLINMER[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINMER");
               GXutil.writeLogRaw("Old: ",Z8133XAFLINMER);
               GXutil.writeLogRaw("Current: ",T01152_A8133XAFLINMER[0]);
            }
            if ( DecimalUtil.compareTo(Z8134XAFLINMTSS, T01152_A8134XAFLINMTSS[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINMTSS");
               GXutil.writeLogRaw("Old: ",Z8134XAFLINMTSS);
               GXutil.writeLogRaw("Current: ",T01152_A8134XAFLINMTSS[0]);
            }
            if ( DecimalUtil.compareTo(Z8135XAFLINPREK, T01152_A8135XAFLINPREK[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINPREK");
               GXutil.writeLogRaw("Old: ",Z8135XAFLINPREK);
               GXutil.writeLogRaw("Current: ",T01152_A8135XAFLINPREK[0]);
            }
            if ( DecimalUtil.compareTo(Z8136XAFLINPREM, T01152_A8136XAFLINPREM[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINPREM");
               GXutil.writeLogRaw("Old: ",Z8136XAFLINPREM);
               GXutil.writeLogRaw("Current: ",T01152_A8136XAFLINPREM[0]);
            }
            if ( DecimalUtil.compareTo(Z8137XAFLINMOC, T01152_A8137XAFLINMOC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINMOC");
               GXutil.writeLogRaw("Old: ",Z8137XAFLINMOC);
               GXutil.writeLogRaw("Current: ",T01152_A8137XAFLINMOC[0]);
            }
            if ( DecimalUtil.compareTo(Z8138XAFLINMAQC, T01152_A8138XAFLINMAQC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINMAQC");
               GXutil.writeLogRaw("Old: ",Z8138XAFLINMAQC);
               GXutil.writeLogRaw("Current: ",T01152_A8138XAFLINMAQC[0]);
            }
            if ( DecimalUtil.compareTo(Z8139XAFLININSC, T01152_A8139XAFLININSC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLININSC");
               GXutil.writeLogRaw("Old: ",Z8139XAFLININSC);
               GXutil.writeLogRaw("Current: ",T01152_A8139XAFLININSC[0]);
            }
            if ( GXutil.strcmp(Z8140XAFLINUSUG, T01152_A8140XAFLINUSUG[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINUSUG");
               GXutil.writeLogRaw("Old: ",Z8140XAFLINUSUG);
               GXutil.writeLogRaw("Current: ",T01152_A8140XAFLINUSUG[0]);
            }
            if ( !( GXutil.dateCompare(Z8141XAFLINFCHG, T01152_A8141XAFLINFCHG[0]) ) )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINFCHG");
               GXutil.writeLogRaw("Old: ",Z8141XAFLINFCHG);
               GXutil.writeLogRaw("Current: ",T01152_A8141XAFLINFCHG[0]);
            }
            if ( GXutil.strcmp(Z8142XAFLINUSUL, T01152_A8142XAFLINUSUL[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINUSUL");
               GXutil.writeLogRaw("Old: ",Z8142XAFLINUSUL);
               GXutil.writeLogRaw("Current: ",T01152_A8142XAFLINUSUL[0]);
            }
            if ( !( GXutil.dateCompare(Z8143XAFLINFCHL, T01152_A8143XAFLINFCHL[0]) ) )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINFCHL");
               GXutil.writeLogRaw("Old: ",Z8143XAFLINFCHL);
               GXutil.writeLogRaw("Current: ",T01152_A8143XAFLINFCHL[0]);
            }
            if ( GXutil.strcmp(Z8144XAFLINEST, T01152_A8144XAFLINEST[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINEST");
               GXutil.writeLogRaw("Old: ",Z8144XAFLINEST);
               GXutil.writeLogRaw("Current: ",T01152_A8144XAFLINEST[0]);
            }
            if ( GXutil.strcmp(Z8145XAFLINERR, T01152_A8145XAFLINERR[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINERR");
               GXutil.writeLogRaw("Old: ",Z8145XAFLINERR);
               GXutil.writeLogRaw("Current: ",T01152_A8145XAFLINERR[0]);
            }
            if ( GXutil.strcmp(Z8146XAFLINCCO, T01152_A8146XAFLINCCO[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINCCO");
               GXutil.writeLogRaw("Old: ",Z8146XAFLINCCO);
               GXutil.writeLogRaw("Current: ",T01152_A8146XAFLINCCO[0]);
            }
            if ( DecimalUtil.compareTo(Z8147XAFLINMTSE, T01152_A8147XAFLINMTSE[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINMTSE");
               GXutil.writeLogRaw("Old: ",Z8147XAFLINMTSE);
               GXutil.writeLogRaw("Current: ",T01152_A8147XAFLINMTSE[0]);
            }
            if ( DecimalUtil.compareTo(Z8148XAFLINKGS, T01152_A8148XAFLINKGS[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINKGS");
               GXutil.writeLogRaw("Old: ",Z8148XAFLINKGS);
               GXutil.writeLogRaw("Current: ",T01152_A8148XAFLINKGS[0]);
            }
            if ( DecimalUtil.compareTo(Z8149XAFLINMTS, T01152_A8149XAFLINMTS[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINMTS");
               GXutil.writeLogRaw("Old: ",Z8149XAFLINMTS);
               GXutil.writeLogRaw("Current: ",T01152_A8149XAFLINMTS[0]);
            }
            if ( GXutil.strcmp(Z8150XAFLINREFC, T01152_A8150XAFLINREFC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINREFC");
               GXutil.writeLogRaw("Old: ",Z8150XAFLINREFC);
               GXutil.writeLogRaw("Current: ",T01152_A8150XAFLINREFC[0]);
            }
            if ( GXutil.strcmp(Z8151XAFLINREFD, T01152_A8151XAFLINREFD[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINREFD");
               GXutil.writeLogRaw("Old: ",Z8151XAFLINREFD);
               GXutil.writeLogRaw("Current: ",T01152_A8151XAFLINREFD[0]);
            }
            if ( DecimalUtil.compareTo(Z8152XAFLINPRE, T01152_A8152XAFLINPRE[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINPRE");
               GXutil.writeLogRaw("Old: ",Z8152XAFLINPRE);
               GXutil.writeLogRaw("Current: ",T01152_A8152XAFLINPRE[0]);
            }
            if ( DecimalUtil.compareTo(Z8309XAFLINDTO, T01152_A8309XAFLINDTO[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINDTO");
               GXutil.writeLogRaw("Old: ",Z8309XAFLINDTO);
               GXutil.writeLogRaw("Current: ",T01152_A8309XAFLINDTO[0]);
            }
            if ( DecimalUtil.compareTo(Z8310XAFLINREC, T01152_A8310XAFLINREC[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINREC");
               GXutil.writeLogRaw("Old: ",Z8310XAFLINREC);
               GXutil.writeLogRaw("Current: ",T01152_A8310XAFLINREC[0]);
            }
            if ( DecimalUtil.compareTo(Z12713XAFLINKGR, T01152_A12713XAFLINKGR[0]) != 0 )
            {
               GXutil.writeLogln("txaf:[seudo value changed for attri]"+"XAFLINKGR");
               GXutil.writeLogRaw("Old: ",Z12713XAFLINKGR);
               GXutil.writeLogRaw("Current: ",T01152_A12713XAFLINKGR[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPINT_REMISIONES_DET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1151139( )
   {
      beforeValidate1151139( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1151139( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1151139( 0) ;
         checkOptimisticConcurrency1151139( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1151139( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1151139( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T011516 */
                  pr_default.execute(14, new Object[] {Long.valueOf(A8103XAFALPCOD), Integer.valueOf(A8119XAFLIN), Boolean.valueOf(n8120XAFLINHDR), A8120XAFLINHDR, Boolean.valueOf(n8121XAFLINALR), A8121XAFLINALR, Boolean.valueOf(n8122XAFLINLOT), A8122XAFLINLOT, Boolean.valueOf(n8123XAFLINPZA), Integer.valueOf(A8123XAFLINPZA), Boolean.valueOf(n8124XAFLINARTC), A8124XAFLINARTC, Boolean.valueOf(n8125XAFLINARTD), A8125XAFLINARTD, Boolean.valueOf(n8126XAFLININTC), Integer.valueOf(A8126XAFLININTC), Boolean.valueOf(n8127XAFLINDIBC), A8127XAFLINDIBC, Boolean.valueOf(n8128XAFLINDIBD), A8128XAFLINDIBD, Boolean.valueOf(n8129XAFLINCOLC), A8129XAFLINCOLC, Boolean.valueOf(n8130XAFLINCOLD), A8130XAFLINCOLD, Boolean.valueOf(n8131XAFLINKGSE), A8131XAFLINKGSE, Boolean.valueOf(n8132XAFLINKGSS), A8132XAFLINKGSS, Boolean.valueOf(n8133XAFLINMER), A8133XAFLINMER, Boolean.valueOf(n8134XAFLINMTSS), A8134XAFLINMTSS, Boolean.valueOf(n8135XAFLINPREK), A8135XAFLINPREK, Boolean.valueOf(n8136XAFLINPREM), A8136XAFLINPREM, Boolean.valueOf(n8137XAFLINMOC), A8137XAFLINMOC, Boolean.valueOf(n8138XAFLINMAQC), A8138XAFLINMAQC, Boolean.valueOf(n8139XAFLININSC), A8139XAFLININSC, Boolean.valueOf(n8140XAFLINUSUG), A8140XAFLINUSUG, Boolean.valueOf(n8141XAFLINFCHG), A8141XAFLINFCHG, Boolean.valueOf(n8142XAFLINUSUL), A8142XAFLINUSUL, Boolean.valueOf(n8143XAFLINFCHL), A8143XAFLINFCHL, Boolean.valueOf(n8144XAFLINEST), A8144XAFLINEST, Boolean.valueOf(n8145XAFLINERR), A8145XAFLINERR, Boolean.valueOf(n8146XAFLINCCO), A8146XAFLINCCO, Boolean.valueOf(n8147XAFLINMTSE), A8147XAFLINMTSE, Boolean.valueOf(n8148XAFLINKGS), A8148XAFLINKGS, Boolean.valueOf(n8149XAFLINMTS), A8149XAFLINMTS, Boolean.valueOf(n8150XAFLINREFC), A8150XAFLINREFC, Boolean.valueOf(n8151XAFLINREFD), A8151XAFLINREFD, Boolean.valueOf(n8152XAFLINPRE), A8152XAFLINPRE, Boolean.valueOf(n8309XAFLINDTO), A8309XAFLINDTO, Boolean.valueOf(n8310XAFLINREC), A8310XAFLINREC, Boolean.valueOf(n12713XAFLINKGR), A12713XAFLINKGR});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINT_REMISIONES_DET");
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
            load1151139( ) ;
         }
         endLevel1151139( ) ;
      }
      closeExtendedTableCursors1151139( ) ;
   }

   public void update1151139( )
   {
      beforeValidate1151139( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1151139( ) ;
      }
      if ( ( nIsMod_1139 != 0 ) || ( nIsDirty_1139 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1151139( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1151139( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1151139( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T011517 */
                     pr_default.execute(15, new Object[] {Boolean.valueOf(n8120XAFLINHDR), A8120XAFLINHDR, Boolean.valueOf(n8121XAFLINALR), A8121XAFLINALR, Boolean.valueOf(n8122XAFLINLOT), A8122XAFLINLOT, Boolean.valueOf(n8123XAFLINPZA), Integer.valueOf(A8123XAFLINPZA), Boolean.valueOf(n8124XAFLINARTC), A8124XAFLINARTC, Boolean.valueOf(n8125XAFLINARTD), A8125XAFLINARTD, Boolean.valueOf(n8126XAFLININTC), Integer.valueOf(A8126XAFLININTC), Boolean.valueOf(n8127XAFLINDIBC), A8127XAFLINDIBC, Boolean.valueOf(n8128XAFLINDIBD), A8128XAFLINDIBD, Boolean.valueOf(n8129XAFLINCOLC), A8129XAFLINCOLC, Boolean.valueOf(n8130XAFLINCOLD), A8130XAFLINCOLD, Boolean.valueOf(n8131XAFLINKGSE), A8131XAFLINKGSE, Boolean.valueOf(n8132XAFLINKGSS), A8132XAFLINKGSS, Boolean.valueOf(n8133XAFLINMER), A8133XAFLINMER, Boolean.valueOf(n8134XAFLINMTSS), A8134XAFLINMTSS, Boolean.valueOf(n8135XAFLINPREK), A8135XAFLINPREK, Boolean.valueOf(n8136XAFLINPREM), A8136XAFLINPREM, Boolean.valueOf(n8137XAFLINMOC), A8137XAFLINMOC, Boolean.valueOf(n8138XAFLINMAQC), A8138XAFLINMAQC, Boolean.valueOf(n8139XAFLININSC), A8139XAFLININSC, Boolean.valueOf(n8140XAFLINUSUG), A8140XAFLINUSUG, Boolean.valueOf(n8141XAFLINFCHG), A8141XAFLINFCHG, Boolean.valueOf(n8142XAFLINUSUL), A8142XAFLINUSUL, Boolean.valueOf(n8143XAFLINFCHL), A8143XAFLINFCHL, Boolean.valueOf(n8144XAFLINEST), A8144XAFLINEST, Boolean.valueOf(n8145XAFLINERR), A8145XAFLINERR, Boolean.valueOf(n8146XAFLINCCO), A8146XAFLINCCO, Boolean.valueOf(n8147XAFLINMTSE), A8147XAFLINMTSE, Boolean.valueOf(n8148XAFLINKGS), A8148XAFLINKGS, Boolean.valueOf(n8149XAFLINMTS), A8149XAFLINMTS, Boolean.valueOf(n8150XAFLINREFC), A8150XAFLINREFC, Boolean.valueOf(n8151XAFLINREFD), A8151XAFLINREFD, Boolean.valueOf(n8152XAFLINPRE), A8152XAFLINPRE, Boolean.valueOf(n8309XAFLINDTO), A8309XAFLINDTO, Boolean.valueOf(n8310XAFLINREC), A8310XAFLINREC, Boolean.valueOf(n12713XAFLINKGR), A12713XAFLINKGR, Long.valueOf(A8103XAFALPCOD), Integer.valueOf(A8119XAFLIN)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINT_REMISIONES_DET");
                     if ( (pr_default.getStatus(15) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPINT_REMISIONES_DET"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1151139( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1151139( ) ;
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
            endLevel1151139( ) ;
         }
      }
      closeExtendedTableCursors1151139( ) ;
   }

   public void deferredUpdate1151139( )
   {
   }

   public void delete1151139( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1151139( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1151139( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1151139( ) ;
         afterConfirm1151139( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1151139( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T011518 */
               pr_default.execute(16, new Object[] {Long.valueOf(A8103XAFALPCOD), Integer.valueOf(A8119XAFLIN)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPINT_REMISIONES_DET");
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
      sMode1139 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1151139( ) ;
      Gx_mode = sMode1139 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1151139( )
   {
      standaloneModal1151139( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1151139( )
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

   public void scanStart1151139( )
   {
      /* Scan By routine */
      /* Using cursor T011519 */
      pr_default.execute(17, new Object[] {Long.valueOf(A8103XAFALPCOD)});
      RcdFound1139 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1139 = (short)(1) ;
         A8119XAFLIN = T011519_A8119XAFLIN[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1151139( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1139 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1139 = (short)(1) ;
         A8119XAFLIN = T011519_A8119XAFLIN[0] ;
      }
   }

   public void scanEnd1151139( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1151139( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1151139( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1151139( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1151139( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1151139( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1151139( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1151139( )
   {
      edtXAFLIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLIN_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINHDR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINHDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINHDR_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINALR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINALR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINALR_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINLOT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINLOT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINLOT_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINPZA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINPZA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINPZA_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINARTC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINARTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINARTC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINARTD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINARTD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINARTD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLININTC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLININTC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLININTC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINDIBC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINDIBC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINDIBC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINDIBD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINDIBD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINDIBD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINCOLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINCOLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINCOLC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINCOLD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINCOLD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINCOLD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINKGSE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINKGSE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINKGSE_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINKGSS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINKGSS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINKGSS_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINMER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMER_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMER_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINMTSS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMTSS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMTSS_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINPREK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINPREK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINPREK_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINPREM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINPREM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINPREM_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINMOC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMOC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMOC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINMAQC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMAQC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMAQC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLININSC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLININSC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLININSC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINUSUG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINUSUG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINUSUG_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINFCHG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINFCHG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINFCHG_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINUSUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINUSUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINUSUL_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINFCHL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINFCHL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINFCHL_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINEST_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINEST_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINEST_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINERR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINERR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINERR_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINCCO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINCCO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINCCO_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINMTSE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMTSE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMTSE_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINKGS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINKGS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINKGS_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINMTS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINMTS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINMTS_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINREFC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINREFC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINREFC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINREFD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINREFD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINREFD_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINPRE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINPRE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINPRE_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINDTO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINDTO_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINDTO_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINREC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINREC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINREC_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtXAFLINKGR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLINKGR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLINKGR_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void send_integrity_lvl_hashes1151139( )
   {
   }

   public void send_integrity_lvl_hashes1151138( )
   {
   }

   public void subsflControlProps_1001139( )
   {
      edtavnRcdDeleted_1139_Internalname = "vNRCDDELETED_1139_"+sGXsfl_100_idx ;
      edtXAFLIN_Internalname = "XAFLIN_"+sGXsfl_100_idx ;
      edtXAFLINHDR_Internalname = "XAFLINHDR_"+sGXsfl_100_idx ;
      edtXAFLINALR_Internalname = "XAFLINALR_"+sGXsfl_100_idx ;
      edtXAFLINLOT_Internalname = "XAFLINLOT_"+sGXsfl_100_idx ;
      edtXAFLINPZA_Internalname = "XAFLINPZA_"+sGXsfl_100_idx ;
      edtXAFLINARTC_Internalname = "XAFLINARTC_"+sGXsfl_100_idx ;
      edtXAFLINARTD_Internalname = "XAFLINARTD_"+sGXsfl_100_idx ;
      edtXAFLININTC_Internalname = "XAFLININTC_"+sGXsfl_100_idx ;
      edtXAFLINDIBC_Internalname = "XAFLINDIBC_"+sGXsfl_100_idx ;
      edtXAFLINDIBD_Internalname = "XAFLINDIBD_"+sGXsfl_100_idx ;
      edtXAFLINCOLC_Internalname = "XAFLINCOLC_"+sGXsfl_100_idx ;
      edtXAFLINCOLD_Internalname = "XAFLINCOLD_"+sGXsfl_100_idx ;
      edtXAFLINKGSE_Internalname = "XAFLINKGSE_"+sGXsfl_100_idx ;
      edtXAFLINKGSS_Internalname = "XAFLINKGSS_"+sGXsfl_100_idx ;
      edtXAFLINMER_Internalname = "XAFLINMER_"+sGXsfl_100_idx ;
      edtXAFLINMTSS_Internalname = "XAFLINMTSS_"+sGXsfl_100_idx ;
      edtXAFLINPREK_Internalname = "XAFLINPREK_"+sGXsfl_100_idx ;
      edtXAFLINPREM_Internalname = "XAFLINPREM_"+sGXsfl_100_idx ;
      edtXAFLINMOC_Internalname = "XAFLINMOC_"+sGXsfl_100_idx ;
      edtXAFLINMAQC_Internalname = "XAFLINMAQC_"+sGXsfl_100_idx ;
      edtXAFLININSC_Internalname = "XAFLININSC_"+sGXsfl_100_idx ;
      edtXAFLINUSUG_Internalname = "XAFLINUSUG_"+sGXsfl_100_idx ;
      edtXAFLINFCHG_Internalname = "XAFLINFCHG_"+sGXsfl_100_idx ;
      edtXAFLINUSUL_Internalname = "XAFLINUSUL_"+sGXsfl_100_idx ;
      edtXAFLINFCHL_Internalname = "XAFLINFCHL_"+sGXsfl_100_idx ;
      edtXAFLINEST_Internalname = "XAFLINEST_"+sGXsfl_100_idx ;
      edtXAFLINERR_Internalname = "XAFLINERR_"+sGXsfl_100_idx ;
      edtXAFLINCCO_Internalname = "XAFLINCCO_"+sGXsfl_100_idx ;
      edtXAFLINMTSE_Internalname = "XAFLINMTSE_"+sGXsfl_100_idx ;
      edtXAFLINKGS_Internalname = "XAFLINKGS_"+sGXsfl_100_idx ;
      edtXAFLINMTS_Internalname = "XAFLINMTS_"+sGXsfl_100_idx ;
      edtXAFLINREFC_Internalname = "XAFLINREFC_"+sGXsfl_100_idx ;
      edtXAFLINREFD_Internalname = "XAFLINREFD_"+sGXsfl_100_idx ;
      edtXAFLINPRE_Internalname = "XAFLINPRE_"+sGXsfl_100_idx ;
      edtXAFLINDTO_Internalname = "XAFLINDTO_"+sGXsfl_100_idx ;
      edtXAFLINREC_Internalname = "XAFLINREC_"+sGXsfl_100_idx ;
      edtXAFLINKGR_Internalname = "XAFLINKGR_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_1001139( )
   {
      edtavnRcdDeleted_1139_Internalname = "vNRCDDELETED_1139_"+sGXsfl_100_fel_idx ;
      edtXAFLIN_Internalname = "XAFLIN_"+sGXsfl_100_fel_idx ;
      edtXAFLINHDR_Internalname = "XAFLINHDR_"+sGXsfl_100_fel_idx ;
      edtXAFLINALR_Internalname = "XAFLINALR_"+sGXsfl_100_fel_idx ;
      edtXAFLINLOT_Internalname = "XAFLINLOT_"+sGXsfl_100_fel_idx ;
      edtXAFLINPZA_Internalname = "XAFLINPZA_"+sGXsfl_100_fel_idx ;
      edtXAFLINARTC_Internalname = "XAFLINARTC_"+sGXsfl_100_fel_idx ;
      edtXAFLINARTD_Internalname = "XAFLINARTD_"+sGXsfl_100_fel_idx ;
      edtXAFLININTC_Internalname = "XAFLININTC_"+sGXsfl_100_fel_idx ;
      edtXAFLINDIBC_Internalname = "XAFLINDIBC_"+sGXsfl_100_fel_idx ;
      edtXAFLINDIBD_Internalname = "XAFLINDIBD_"+sGXsfl_100_fel_idx ;
      edtXAFLINCOLC_Internalname = "XAFLINCOLC_"+sGXsfl_100_fel_idx ;
      edtXAFLINCOLD_Internalname = "XAFLINCOLD_"+sGXsfl_100_fel_idx ;
      edtXAFLINKGSE_Internalname = "XAFLINKGSE_"+sGXsfl_100_fel_idx ;
      edtXAFLINKGSS_Internalname = "XAFLINKGSS_"+sGXsfl_100_fel_idx ;
      edtXAFLINMER_Internalname = "XAFLINMER_"+sGXsfl_100_fel_idx ;
      edtXAFLINMTSS_Internalname = "XAFLINMTSS_"+sGXsfl_100_fel_idx ;
      edtXAFLINPREK_Internalname = "XAFLINPREK_"+sGXsfl_100_fel_idx ;
      edtXAFLINPREM_Internalname = "XAFLINPREM_"+sGXsfl_100_fel_idx ;
      edtXAFLINMOC_Internalname = "XAFLINMOC_"+sGXsfl_100_fel_idx ;
      edtXAFLINMAQC_Internalname = "XAFLINMAQC_"+sGXsfl_100_fel_idx ;
      edtXAFLININSC_Internalname = "XAFLININSC_"+sGXsfl_100_fel_idx ;
      edtXAFLINUSUG_Internalname = "XAFLINUSUG_"+sGXsfl_100_fel_idx ;
      edtXAFLINFCHG_Internalname = "XAFLINFCHG_"+sGXsfl_100_fel_idx ;
      edtXAFLINUSUL_Internalname = "XAFLINUSUL_"+sGXsfl_100_fel_idx ;
      edtXAFLINFCHL_Internalname = "XAFLINFCHL_"+sGXsfl_100_fel_idx ;
      edtXAFLINEST_Internalname = "XAFLINEST_"+sGXsfl_100_fel_idx ;
      edtXAFLINERR_Internalname = "XAFLINERR_"+sGXsfl_100_fel_idx ;
      edtXAFLINCCO_Internalname = "XAFLINCCO_"+sGXsfl_100_fel_idx ;
      edtXAFLINMTSE_Internalname = "XAFLINMTSE_"+sGXsfl_100_fel_idx ;
      edtXAFLINKGS_Internalname = "XAFLINKGS_"+sGXsfl_100_fel_idx ;
      edtXAFLINMTS_Internalname = "XAFLINMTS_"+sGXsfl_100_fel_idx ;
      edtXAFLINREFC_Internalname = "XAFLINREFC_"+sGXsfl_100_fel_idx ;
      edtXAFLINREFD_Internalname = "XAFLINREFD_"+sGXsfl_100_fel_idx ;
      edtXAFLINPRE_Internalname = "XAFLINPRE_"+sGXsfl_100_fel_idx ;
      edtXAFLINDTO_Internalname = "XAFLINDTO_"+sGXsfl_100_fel_idx ;
      edtXAFLINREC_Internalname = "XAFLINREC_"+sGXsfl_100_fel_idx ;
      edtXAFLINKGR_Internalname = "XAFLINKGR_"+sGXsfl_100_fel_idx ;
   }

   public void addRow1151139( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001139( ) ;
      sendRow1151139( ) ;
   }

   public void sendRow1151139( )
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
         if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1139_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1139_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1139), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1139), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1139_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1139_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLIN_Internalname,GXutil.ltrim( localUtil.ntoc( A8119XAFLIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8119XAFLIN), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLIN_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLIN_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINHDR_Internalname,GXutil.rtrim( A8120XAFLINHDR),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINHDR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINHDR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINALR_Internalname,GXutil.rtrim( A8121XAFLINALR),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINALR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINALR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINLOT_Internalname,GXutil.rtrim( A8122XAFLINLOT),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINLOT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINLOT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINPZA_Internalname,GXutil.ltrim( localUtil.ntoc( A8123XAFLINPZA, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINPZA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8123XAFLINPZA), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8123XAFLINPZA), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINPZA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINPZA_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINARTC_Internalname,GXutil.rtrim( A8124XAFLINARTC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINARTC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINARTC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINARTD_Internalname,GXutil.rtrim( A8125XAFLINARTD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINARTD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINARTD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLININTC_Internalname,GXutil.ltrim( localUtil.ntoc( A8126XAFLININTC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLININTC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8126XAFLININTC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8126XAFLININTC), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLININTC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLININTC_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINDIBC_Internalname,GXutil.rtrim( A8127XAFLINDIBC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINDIBC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINDIBC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINDIBD_Internalname,GXutil.rtrim( A8128XAFLINDIBD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINDIBD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINDIBD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINCOLC_Internalname,GXutil.rtrim( A8129XAFLINCOLC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINCOLC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINCOLC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINCOLD_Internalname,GXutil.rtrim( A8130XAFLINCOLD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINCOLD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINCOLD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINKGSE_Internalname,GXutil.ltrim( localUtil.ntoc( A8131XAFLINKGSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINKGSE_Enabled!=0) ? localUtil.format( A8131XAFLINKGSE, "ZZZZZZZZZ.999") : localUtil.format( A8131XAFLINKGSE, "ZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINKGSE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINKGSE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINKGSS_Internalname,GXutil.ltrim( localUtil.ntoc( A8132XAFLINKGSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINKGSS_Enabled!=0) ? localUtil.format( A8132XAFLINKGSS, "ZZZZZZZZZ.999") : localUtil.format( A8132XAFLINKGSS, "ZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINKGSS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINKGSS_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINMER_Internalname,GXutil.ltrim( localUtil.ntoc( A8133XAFLINMER, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINMER_Enabled!=0) ? localUtil.format( A8133XAFLINMER, "ZZZ.99") : localUtil.format( A8133XAFLINMER, "ZZZ.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,116);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINMER_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINMER_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINMTSS_Internalname,GXutil.ltrim( localUtil.ntoc( A8134XAFLINMTSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINMTSS_Enabled!=0) ? localUtil.format( A8134XAFLINMTSS, "ZZZZZZZZZ.999") : localUtil.format( A8134XAFLINMTSS, "ZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,117);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINMTSS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINMTSS_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINPREK_Internalname,GXutil.ltrim( localUtil.ntoc( A8135XAFLINPREK, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINPREK_Enabled!=0) ? localUtil.format( A8135XAFLINPREK, "ZZZZZZZZZZ.999") : localUtil.format( A8135XAFLINPREK, "ZZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINPREK_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINPREK_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINPREM_Internalname,GXutil.ltrim( localUtil.ntoc( A8136XAFLINPREM, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINPREM_Enabled!=0) ? localUtil.format( A8136XAFLINPREM, "ZZZZZZZZZZ.999") : localUtil.format( A8136XAFLINPREM, "ZZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,119);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINPREM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINPREM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINMOC_Internalname,GXutil.ltrim( localUtil.ntoc( A8137XAFLINMOC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINMOC_Enabled!=0) ? localUtil.format( A8137XAFLINMOC, "ZZZZZZZZZZ.999") : localUtil.format( A8137XAFLINMOC, "ZZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,120);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINMOC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINMOC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINMAQC_Internalname,GXutil.ltrim( localUtil.ntoc( A8138XAFLINMAQC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINMAQC_Enabled!=0) ? localUtil.format( A8138XAFLINMAQC, "ZZZZZZZZZZ.999") : localUtil.format( A8138XAFLINMAQC, "ZZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,121);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINMAQC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINMAQC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLININSC_Internalname,GXutil.ltrim( localUtil.ntoc( A8139XAFLININSC, (byte)(16), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLININSC_Enabled!=0) ? localUtil.format( A8139XAFLININSC, "ZZZZZZZZZZZZ.999") : localUtil.format( A8139XAFLININSC, "ZZZZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,122);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLININSC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLININSC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINUSUG_Internalname,GXutil.rtrim( A8140XAFLINUSUG),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINUSUG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINUSUG_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINFCHG_Internalname,localUtil.ttoc( A8141XAFLINFCHG, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A8141XAFLINFCHG, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,124);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINFCHG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINFCHG_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINUSUL_Internalname,GXutil.rtrim( A8142XAFLINUSUL),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINUSUL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINUSUL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINFCHL_Internalname,localUtil.ttoc( A8143XAFLINFCHL, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A8143XAFLINFCHL, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINFCHL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINFCHL_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINEST_Internalname,GXutil.rtrim( A8144XAFLINEST),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINEST_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINEST_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 128,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINERR_Internalname,GXutil.rtrim( A8145XAFLINERR),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,128);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINERR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINERR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINCCO_Internalname,GXutil.rtrim( A8146XAFLINCCO),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINCCO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINCCO_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINMTSE_Internalname,GXutil.ltrim( localUtil.ntoc( A8147XAFLINMTSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINMTSE_Enabled!=0) ? localUtil.format( A8147XAFLINMTSE, "ZZZZZZZZZ.999") : localUtil.format( A8147XAFLINMTSE, "ZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINMTSE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINMTSE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINKGS_Internalname,GXutil.ltrim( localUtil.ntoc( A8148XAFLINKGS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINKGS_Enabled!=0) ? localUtil.format( A8148XAFLINKGS, "ZZZZZZZZZ.999") : localUtil.format( A8148XAFLINKGS, "ZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINKGS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINKGS_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINMTS_Internalname,GXutil.ltrim( localUtil.ntoc( A8149XAFLINMTS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINMTS_Enabled!=0) ? localUtil.format( A8149XAFLINMTS, "ZZZZZZZZZ.999") : localUtil.format( A8149XAFLINMTS, "ZZZZZZZZZ.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINMTS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINMTS_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINREFC_Internalname,GXutil.rtrim( A8150XAFLINREFC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINREFC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINREFC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 134,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINREFD_Internalname,GXutil.rtrim( A8151XAFLINREFD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINREFD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINREFD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINPRE_Internalname,GXutil.ltrim( localUtil.ntoc( A8152XAFLINPRE, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINPRE_Enabled!=0) ? localUtil.format( A8152XAFLINPRE, "ZZZZZZZZZ9.999") : localUtil.format( A8152XAFLINPRE, "ZZZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,135);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINPRE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINPRE_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINDTO_Internalname,GXutil.ltrim( localUtil.ntoc( A8309XAFLINDTO, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINDTO_Enabled!=0) ? localUtil.format( A8309XAFLINDTO, "ZZ9.99") : localUtil.format( A8309XAFLINDTO, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,136);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINDTO_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINDTO_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINREC_Internalname,GXutil.ltrim( localUtil.ntoc( A8310XAFLINREC, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINREC_Enabled!=0) ? localUtil.format( A8310XAFLINREC, "ZZ9.99") : localUtil.format( A8310XAFLINREC, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,137);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINREC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINREC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1139_" + sGXsfl_100_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 138,'',false,'" + sGXsfl_100_idx + "',100)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtXAFLINKGR_Internalname,GXutil.ltrim( localUtil.ntoc( A12713XAFLINKGR, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtXAFLINKGR_Enabled!=0) ? localUtil.format( A12713XAFLINKGR, "ZZZZZZZZ9.999") : localUtil.format( A12713XAFLINKGR, "ZZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,138);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtXAFLINKGR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtXAFLINKGR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1151139( ) ;
      GXCCtl = "Z8119XAFLIN_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8119XAFLIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8120XAFLINHDR_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8120XAFLINHDR));
      GXCCtl = "Z8121XAFLINALR_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8121XAFLINALR));
      GXCCtl = "Z8122XAFLINLOT_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8122XAFLINLOT));
      GXCCtl = "Z8123XAFLINPZA_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8123XAFLINPZA, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8124XAFLINARTC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8124XAFLINARTC));
      GXCCtl = "Z8125XAFLINARTD_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8125XAFLINARTD));
      GXCCtl = "Z8126XAFLININTC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8126XAFLININTC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8127XAFLINDIBC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8127XAFLINDIBC));
      GXCCtl = "Z8128XAFLINDIBD_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8128XAFLINDIBD));
      GXCCtl = "Z8129XAFLINCOLC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8129XAFLINCOLC));
      GXCCtl = "Z8130XAFLINCOLD_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8130XAFLINCOLD));
      GXCCtl = "Z8131XAFLINKGSE_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8131XAFLINKGSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8132XAFLINKGSS_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8132XAFLINKGSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8133XAFLINMER_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8133XAFLINMER, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8134XAFLINMTSS_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8134XAFLINMTSS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8135XAFLINPREK_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8135XAFLINPREK, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8136XAFLINPREM_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8136XAFLINPREM, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8137XAFLINMOC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8137XAFLINMOC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8138XAFLINMAQC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8138XAFLINMAQC, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8139XAFLININSC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8139XAFLININSC, (byte)(16), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8140XAFLINUSUG_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8140XAFLINUSUG));
      GXCCtl = "Z8141XAFLINFCHG_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z8141XAFLINFCHG, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z8142XAFLINUSUL_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8142XAFLINUSUL));
      GXCCtl = "Z8143XAFLINFCHL_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z8143XAFLINFCHL, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z8144XAFLINEST_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8144XAFLINEST));
      GXCCtl = "Z8145XAFLINERR_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8145XAFLINERR));
      GXCCtl = "Z8146XAFLINCCO_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8146XAFLINCCO));
      GXCCtl = "Z8147XAFLINMTSE_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8147XAFLINMTSE, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8148XAFLINKGS_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8148XAFLINKGS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8149XAFLINMTS_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8149XAFLINMTS, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8150XAFLINREFC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8150XAFLINREFC));
      GXCCtl = "Z8151XAFLINREFD_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8151XAFLINREFD));
      GXCCtl = "Z8152XAFLINPRE_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8152XAFLINPRE, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8309XAFLINDTO_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8309XAFLINDTO, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8310XAFLINREC_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8310XAFLINREC, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12713XAFLINKGR_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12713XAFLINKGR, (byte)(13), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1139_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1139_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1139_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1139, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_100_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1139_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1139_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLIN_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLIN_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINHDR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINHDR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINALR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINALR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINLOT_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINLOT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINPZA_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPZA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINARTC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINARTC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINARTD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINARTD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLININTC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLININTC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINDIBC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDIBC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINDIBD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDIBD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINCOLC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCOLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINCOLD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCOLD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINKGSE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGSE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINKGSS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGSS_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINMER_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMER_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINMTSS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTSS_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINPREK_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPREK_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINPREM_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPREM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINMOC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMOC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINMAQC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMAQC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLININSC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLININSC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINUSUG_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINUSUG_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINFCHG_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINFCHG_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINUSUL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINUSUL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINFCHL_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINFCHL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINEST_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINEST_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINERR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINERR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINCCO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCCO_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINMTSE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTSE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINKGS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGS_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINMTS_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTS_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINREFC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREFC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINREFD_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREFD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINPRE_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPRE_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINDTO_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDTO_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINREC_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "XAFLINKGR_"+sGXsfl_100_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGR_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1151139( )
   {
      nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001139( ) ;
      edtavnRcdDeleted_1139_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1139_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLIN_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLIN_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINHDR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINHDR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINALR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINALR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINLOT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINLOT_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINPZA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINPZA_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINARTC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINARTC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINARTD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINARTD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLININTC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLININTC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINDIBC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINDIBC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINDIBD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINDIBD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINCOLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINCOLC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINCOLD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINCOLD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINKGSE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINKGSE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINKGSS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINKGSS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINMER_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMER_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINMTSS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMTSS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINPREK_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINPREK_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINPREM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINPREM_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINMOC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMOC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINMAQC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMAQC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLININSC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLININSC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINUSUG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINUSUG_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINFCHG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINFCHG_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINUSUL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINUSUL_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINFCHL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINFCHL_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINEST_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINEST_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINERR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINERR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINCCO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINCCO_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINMTSE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMTSE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINKGS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINKGS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINMTS_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINMTS_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINREFC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINREFC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINREFD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINREFD_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINPRE_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINPRE_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINDTO_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINDTO_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINREC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINREC_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtXAFLINKGR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "XAFLINKGR_"+sGXsfl_100_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1139_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1139_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1139");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1139_Internalname ;
         wbErr = true ;
         nRcdDeleted_1139 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1139 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1139_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAFLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAFLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "XAFLIN_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLIN_Internalname ;
         wbErr = true ;
         A8119XAFLIN = 0 ;
      }
      else
      {
         A8119XAFLIN = (int)(localUtil.ctol( httpContext.cgiGet( edtXAFLIN_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8120XAFLINHDR = httpContext.cgiGet( edtXAFLINHDR_Internalname) ;
      n8120XAFLINHDR = false ;
      A8121XAFLINALR = httpContext.cgiGet( edtXAFLINALR_Internalname) ;
      n8121XAFLINALR = false ;
      A8122XAFLINLOT = httpContext.cgiGet( edtXAFLINLOT_Internalname) ;
      n8122XAFLINLOT = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAFLINPZA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAFLINPZA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "XAFLINPZA_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINPZA_Internalname ;
         wbErr = true ;
         A8123XAFLINPZA = 0 ;
         n8123XAFLINPZA = false ;
      }
      else
      {
         A8123XAFLINPZA = (int)(localUtil.ctol( httpContext.cgiGet( edtXAFLINPZA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8123XAFLINPZA = false ;
      }
      A8124XAFLINARTC = httpContext.cgiGet( edtXAFLINARTC_Internalname) ;
      n8124XAFLINARTC = false ;
      A8125XAFLINARTD = httpContext.cgiGet( edtXAFLINARTD_Internalname) ;
      n8125XAFLINARTD = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtXAFLININTC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtXAFLININTC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "XAFLININTC_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLININTC_Internalname ;
         wbErr = true ;
         A8126XAFLININTC = 0 ;
         n8126XAFLININTC = false ;
      }
      else
      {
         A8126XAFLININTC = (int)(localUtil.ctol( httpContext.cgiGet( edtXAFLININTC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8126XAFLININTC = false ;
      }
      A8127XAFLINDIBC = httpContext.cgiGet( edtXAFLINDIBC_Internalname) ;
      n8127XAFLINDIBC = false ;
      A8128XAFLINDIBD = httpContext.cgiGet( edtXAFLINDIBD_Internalname) ;
      n8128XAFLINDIBD = false ;
      A8129XAFLINCOLC = httpContext.cgiGet( edtXAFLINCOLC_Internalname) ;
      n8129XAFLINCOLC = false ;
      A8130XAFLINCOLD = httpContext.cgiGet( edtXAFLINCOLD_Internalname) ;
      n8130XAFLINCOLD = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINKGSE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINKGSE_Internalname)), DecimalUtil.stringToDec("999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINKGSE_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINKGSE_Internalname ;
         wbErr = true ;
         A8131XAFLINKGSE = DecimalUtil.ZERO ;
         n8131XAFLINKGSE = false ;
      }
      else
      {
         A8131XAFLINKGSE = localUtil.ctond( httpContext.cgiGet( edtXAFLINKGSE_Internalname)) ;
         n8131XAFLINKGSE = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINKGSS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINKGSS_Internalname)), DecimalUtil.stringToDec("999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINKGSS_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINKGSS_Internalname ;
         wbErr = true ;
         A8132XAFLINKGSS = DecimalUtil.ZERO ;
         n8132XAFLINKGSS = false ;
      }
      else
      {
         A8132XAFLINKGSS = localUtil.ctond( httpContext.cgiGet( edtXAFLINKGSS_Internalname)) ;
         n8132XAFLINKGSS = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINMER_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINMER_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "XAFLINMER_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINMER_Internalname ;
         wbErr = true ;
         A8133XAFLINMER = DecimalUtil.ZERO ;
         n8133XAFLINMER = false ;
      }
      else
      {
         A8133XAFLINMER = localUtil.ctond( httpContext.cgiGet( edtXAFLINMER_Internalname)) ;
         n8133XAFLINMER = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINMTSS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINMTSS_Internalname)), DecimalUtil.stringToDec("999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINMTSS_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINMTSS_Internalname ;
         wbErr = true ;
         A8134XAFLINMTSS = DecimalUtil.ZERO ;
         n8134XAFLINMTSS = false ;
      }
      else
      {
         A8134XAFLINMTSS = localUtil.ctond( httpContext.cgiGet( edtXAFLINMTSS_Internalname)) ;
         n8134XAFLINMTSS = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINPREK_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINPREK_Internalname)), DecimalUtil.stringToDec("9999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINPREK_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINPREK_Internalname ;
         wbErr = true ;
         A8135XAFLINPREK = DecimalUtil.ZERO ;
         n8135XAFLINPREK = false ;
      }
      else
      {
         A8135XAFLINPREK = localUtil.ctond( httpContext.cgiGet( edtXAFLINPREK_Internalname)) ;
         n8135XAFLINPREK = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINPREM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINPREM_Internalname)), DecimalUtil.stringToDec("9999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINPREM_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINPREM_Internalname ;
         wbErr = true ;
         A8136XAFLINPREM = DecimalUtil.ZERO ;
         n8136XAFLINPREM = false ;
      }
      else
      {
         A8136XAFLINPREM = localUtil.ctond( httpContext.cgiGet( edtXAFLINPREM_Internalname)) ;
         n8136XAFLINPREM = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINMOC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINMOC_Internalname)), DecimalUtil.stringToDec("9999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINMOC_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINMOC_Internalname ;
         wbErr = true ;
         A8137XAFLINMOC = DecimalUtil.ZERO ;
         n8137XAFLINMOC = false ;
      }
      else
      {
         A8137XAFLINMOC = localUtil.ctond( httpContext.cgiGet( edtXAFLINMOC_Internalname)) ;
         n8137XAFLINMOC = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINMAQC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINMAQC_Internalname)), DecimalUtil.stringToDec("9999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINMAQC_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINMAQC_Internalname ;
         wbErr = true ;
         A8138XAFLINMAQC = DecimalUtil.ZERO ;
         n8138XAFLINMAQC = false ;
      }
      else
      {
         A8138XAFLINMAQC = localUtil.ctond( httpContext.cgiGet( edtXAFLINMAQC_Internalname)) ;
         n8138XAFLINMAQC = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLININSC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLININSC_Internalname)), DecimalUtil.stringToDec("999999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLININSC_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLININSC_Internalname ;
         wbErr = true ;
         A8139XAFLININSC = DecimalUtil.ZERO ;
         n8139XAFLININSC = false ;
      }
      else
      {
         A8139XAFLININSC = localUtil.ctond( httpContext.cgiGet( edtXAFLININSC_Internalname)) ;
         n8139XAFLININSC = false ;
      }
      A8140XAFLINUSUG = httpContext.cgiGet( edtXAFLINUSUG_Internalname) ;
      n8140XAFLINUSUG = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtXAFLINFCHG_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "XAFLINFCHG_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINFCHG_Internalname ;
         wbErr = true ;
         A8141XAFLINFCHG = GXutil.resetTime( GXutil.nullDate() );
         n8141XAFLINFCHG = false ;
      }
      else
      {
         A8141XAFLINFCHG = localUtil.ctot( httpContext.cgiGet( edtXAFLINFCHG_Internalname)) ;
         n8141XAFLINFCHG = false ;
      }
      A8142XAFLINUSUL = httpContext.cgiGet( edtXAFLINUSUL_Internalname) ;
      n8142XAFLINUSUL = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtXAFLINFCHL_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "XAFLINFCHL_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINFCHL_Internalname ;
         wbErr = true ;
         A8143XAFLINFCHL = GXutil.resetTime( GXutil.nullDate() );
         n8143XAFLINFCHL = false ;
      }
      else
      {
         A8143XAFLINFCHL = localUtil.ctot( httpContext.cgiGet( edtXAFLINFCHL_Internalname)) ;
         n8143XAFLINFCHL = false ;
      }
      A8144XAFLINEST = httpContext.cgiGet( edtXAFLINEST_Internalname) ;
      n8144XAFLINEST = false ;
      A8145XAFLINERR = httpContext.cgiGet( edtXAFLINERR_Internalname) ;
      n8145XAFLINERR = false ;
      A8146XAFLINCCO = httpContext.cgiGet( edtXAFLINCCO_Internalname) ;
      n8146XAFLINCCO = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINMTSE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINMTSE_Internalname)), DecimalUtil.stringToDec("999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINMTSE_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINMTSE_Internalname ;
         wbErr = true ;
         A8147XAFLINMTSE = DecimalUtil.ZERO ;
         n8147XAFLINMTSE = false ;
      }
      else
      {
         A8147XAFLINMTSE = localUtil.ctond( httpContext.cgiGet( edtXAFLINMTSE_Internalname)) ;
         n8147XAFLINMTSE = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINKGS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINKGS_Internalname)), DecimalUtil.stringToDec("999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINKGS_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINKGS_Internalname ;
         wbErr = true ;
         A8148XAFLINKGS = DecimalUtil.ZERO ;
         n8148XAFLINKGS = false ;
      }
      else
      {
         A8148XAFLINKGS = localUtil.ctond( httpContext.cgiGet( edtXAFLINKGS_Internalname)) ;
         n8148XAFLINKGS = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINMTS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINMTS_Internalname)), DecimalUtil.stringToDec("999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINMTS_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINMTS_Internalname ;
         wbErr = true ;
         A8149XAFLINMTS = DecimalUtil.ZERO ;
         n8149XAFLINMTS = false ;
      }
      else
      {
         A8149XAFLINMTS = localUtil.ctond( httpContext.cgiGet( edtXAFLINMTS_Internalname)) ;
         n8149XAFLINMTS = false ;
      }
      A8150XAFLINREFC = httpContext.cgiGet( edtXAFLINREFC_Internalname) ;
      n8150XAFLINREFC = false ;
      A8151XAFLINREFD = httpContext.cgiGet( edtXAFLINREFD_Internalname) ;
      n8151XAFLINREFD = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINPRE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINPRE_Internalname)), DecimalUtil.stringToDec("9999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINPRE_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINPRE_Internalname ;
         wbErr = true ;
         A8152XAFLINPRE = DecimalUtil.ZERO ;
         n8152XAFLINPRE = false ;
      }
      else
      {
         A8152XAFLINPRE = localUtil.ctond( httpContext.cgiGet( edtXAFLINPRE_Internalname)) ;
         n8152XAFLINPRE = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINDTO_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINDTO_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "XAFLINDTO_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINDTO_Internalname ;
         wbErr = true ;
         A8309XAFLINDTO = DecimalUtil.ZERO ;
         n8309XAFLINDTO = false ;
      }
      else
      {
         A8309XAFLINDTO = localUtil.ctond( httpContext.cgiGet( edtXAFLINDTO_Internalname)) ;
         n8309XAFLINDTO = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINREC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINREC_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "XAFLINREC_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINREC_Internalname ;
         wbErr = true ;
         A8310XAFLINREC = DecimalUtil.ZERO ;
         n8310XAFLINREC = false ;
      }
      else
      {
         A8310XAFLINREC = localUtil.ctond( httpContext.cgiGet( edtXAFLINREC_Internalname)) ;
         n8310XAFLINREC = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtXAFLINKGR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtXAFLINKGR_Internalname)), DecimalUtil.stringToDec("999999999.999")) > 0 ) ) )
      {
         GXCCtl = "XAFLINKGR_" + sGXsfl_100_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtXAFLINKGR_Internalname ;
         wbErr = true ;
         A12713XAFLINKGR = DecimalUtil.ZERO ;
         n12713XAFLINKGR = false ;
      }
      else
      {
         A12713XAFLINKGR = localUtil.ctond( httpContext.cgiGet( edtXAFLINKGR_Internalname)) ;
         n12713XAFLINKGR = false ;
      }
      GXCCtl = "Z8119XAFLIN_" + sGXsfl_100_idx ;
      Z8119XAFLIN = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8120XAFLINHDR_" + sGXsfl_100_idx ;
      Z8120XAFLINHDR = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8121XAFLINALR_" + sGXsfl_100_idx ;
      Z8121XAFLINALR = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8122XAFLINLOT_" + sGXsfl_100_idx ;
      Z8122XAFLINLOT = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8123XAFLINPZA_" + sGXsfl_100_idx ;
      Z8123XAFLINPZA = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8124XAFLINARTC_" + sGXsfl_100_idx ;
      Z8124XAFLINARTC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8125XAFLINARTD_" + sGXsfl_100_idx ;
      Z8125XAFLINARTD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8126XAFLININTC_" + sGXsfl_100_idx ;
      Z8126XAFLININTC = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8127XAFLINDIBC_" + sGXsfl_100_idx ;
      Z8127XAFLINDIBC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8128XAFLINDIBD_" + sGXsfl_100_idx ;
      Z8128XAFLINDIBD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8129XAFLINCOLC_" + sGXsfl_100_idx ;
      Z8129XAFLINCOLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8130XAFLINCOLD_" + sGXsfl_100_idx ;
      Z8130XAFLINCOLD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8131XAFLINKGSE_" + sGXsfl_100_idx ;
      Z8131XAFLINKGSE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8132XAFLINKGSS_" + sGXsfl_100_idx ;
      Z8132XAFLINKGSS = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8133XAFLINMER_" + sGXsfl_100_idx ;
      Z8133XAFLINMER = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8134XAFLINMTSS_" + sGXsfl_100_idx ;
      Z8134XAFLINMTSS = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8135XAFLINPREK_" + sGXsfl_100_idx ;
      Z8135XAFLINPREK = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8136XAFLINPREM_" + sGXsfl_100_idx ;
      Z8136XAFLINPREM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8137XAFLINMOC_" + sGXsfl_100_idx ;
      Z8137XAFLINMOC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8138XAFLINMAQC_" + sGXsfl_100_idx ;
      Z8138XAFLINMAQC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8139XAFLININSC_" + sGXsfl_100_idx ;
      Z8139XAFLININSC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8140XAFLINUSUG_" + sGXsfl_100_idx ;
      Z8140XAFLINUSUG = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8141XAFLINFCHG_" + sGXsfl_100_idx ;
      Z8141XAFLINFCHG = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8142XAFLINUSUL_" + sGXsfl_100_idx ;
      Z8142XAFLINUSUL = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8143XAFLINFCHL_" + sGXsfl_100_idx ;
      Z8143XAFLINFCHL = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8144XAFLINEST_" + sGXsfl_100_idx ;
      Z8144XAFLINEST = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8145XAFLINERR_" + sGXsfl_100_idx ;
      Z8145XAFLINERR = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8146XAFLINCCO_" + sGXsfl_100_idx ;
      Z8146XAFLINCCO = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8147XAFLINMTSE_" + sGXsfl_100_idx ;
      Z8147XAFLINMTSE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8148XAFLINKGS_" + sGXsfl_100_idx ;
      Z8148XAFLINKGS = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8149XAFLINMTS_" + sGXsfl_100_idx ;
      Z8149XAFLINMTS = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8150XAFLINREFC_" + sGXsfl_100_idx ;
      Z8150XAFLINREFC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8151XAFLINREFD_" + sGXsfl_100_idx ;
      Z8151XAFLINREFD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8152XAFLINPRE_" + sGXsfl_100_idx ;
      Z8152XAFLINPRE = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8309XAFLINDTO_" + sGXsfl_100_idx ;
      Z8309XAFLINDTO = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8310XAFLINREC_" + sGXsfl_100_idx ;
      Z8310XAFLINREC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12713XAFLINKGR_" + sGXsfl_100_idx ;
      Z12713XAFLINKGR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1139_" + sGXsfl_100_idx ;
      nRcdDeleted_1139 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1139_" + sGXsfl_100_idx ;
      nRcdExists_1139 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1139_" + sGXsfl_100_idx ;
      nIsMod_1139 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtXAFLIN_Enabled = edtXAFLIN_Enabled ;
   }

   public void confirmValues1150( )
   {
      nGXsfl_100_idx = 0 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1001139( ) ;
      while ( nGXsfl_100_idx < nRC_GXsfl_100 )
      {
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001139( ) ;
         httpContext.changePostValue( "Z8119XAFLIN_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8119XAFLIN_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8119XAFLIN_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8120XAFLINHDR_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8120XAFLINHDR_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8120XAFLINHDR_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8121XAFLINALR_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8121XAFLINALR_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8121XAFLINALR_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8122XAFLINLOT_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8122XAFLINLOT_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8122XAFLINLOT_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8123XAFLINPZA_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8123XAFLINPZA_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8123XAFLINPZA_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8124XAFLINARTC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8124XAFLINARTC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8124XAFLINARTC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8125XAFLINARTD_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8125XAFLINARTD_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8125XAFLINARTD_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8126XAFLININTC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8126XAFLININTC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8126XAFLININTC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8127XAFLINDIBC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8127XAFLINDIBC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8127XAFLINDIBC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8128XAFLINDIBD_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8128XAFLINDIBD_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8128XAFLINDIBD_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8129XAFLINCOLC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8129XAFLINCOLC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8129XAFLINCOLC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8130XAFLINCOLD_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8130XAFLINCOLD_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8130XAFLINCOLD_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8131XAFLINKGSE_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8131XAFLINKGSE_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8131XAFLINKGSE_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8132XAFLINKGSS_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8132XAFLINKGSS_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8132XAFLINKGSS_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8133XAFLINMER_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8133XAFLINMER_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8133XAFLINMER_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8134XAFLINMTSS_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8134XAFLINMTSS_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8134XAFLINMTSS_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8135XAFLINPREK_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8135XAFLINPREK_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8135XAFLINPREK_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8136XAFLINPREM_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8136XAFLINPREM_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8136XAFLINPREM_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8137XAFLINMOC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8137XAFLINMOC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8137XAFLINMOC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8138XAFLINMAQC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8138XAFLINMAQC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8138XAFLINMAQC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8139XAFLININSC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8139XAFLININSC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8139XAFLININSC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8140XAFLINUSUG_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8140XAFLINUSUG_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8140XAFLINUSUG_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8141XAFLINFCHG_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8141XAFLINFCHG_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8141XAFLINFCHG_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8142XAFLINUSUL_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8142XAFLINUSUL_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8142XAFLINUSUL_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8143XAFLINFCHL_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8143XAFLINFCHL_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8143XAFLINFCHL_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8144XAFLINEST_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8144XAFLINEST_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8144XAFLINEST_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8145XAFLINERR_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8145XAFLINERR_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8145XAFLINERR_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8146XAFLINCCO_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8146XAFLINCCO_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8146XAFLINCCO_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8147XAFLINMTSE_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8147XAFLINMTSE_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8147XAFLINMTSE_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8148XAFLINKGS_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8148XAFLINKGS_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8148XAFLINKGS_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8149XAFLINMTS_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8149XAFLINMTS_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8149XAFLINMTS_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8150XAFLINREFC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8150XAFLINREFC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8150XAFLINREFC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8151XAFLINREFD_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8151XAFLINREFD_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8151XAFLINREFD_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8152XAFLINPRE_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8152XAFLINPRE_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8152XAFLINPRE_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8309XAFLINDTO_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8309XAFLINDTO_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8309XAFLINDTO_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z8310XAFLINREC_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z8310XAFLINREC_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8310XAFLINREC_"+sGXsfl_100_idx) ;
         httpContext.changePostValue( "Z12713XAFLINKGR_"+sGXsfl_100_idx, httpContext.cgiGet( "ZT_"+"Z12713XAFLINKGR_"+sGXsfl_100_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12713XAFLINKGR_"+sGXsfl_100_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.txaf", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A8103XAFALPCOD,10,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"XAFALPCOD","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TXAF");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("txaf:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z8103XAFALPCOD", GXutil.ltrim( localUtil.ntoc( Z8103XAFALPCOD, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8104XAFTpo", GXutil.rtrim( Z8104XAFTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8105XAFCLI", GXutil.rtrim( Z8105XAFCLI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8106XAFFCH", localUtil.ttoc( Z8106XAFFCH, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8107XAFVTO", localUtil.ttoc( Z8107XAFVTO, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8108XAFFPG", GXutil.rtrim( Z8108XAFFPG));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8109XAFVND", GXutil.ltrim( localUtil.ntoc( Z8109XAFVND, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8110XAFOBS", Z8110XAFOBS);
      app.GxWebStd.gx_hidden_field( httpContext, "Z8111XAFDTOPZO", GXutil.ltrim( localUtil.ntoc( Z8111XAFDTOPZO, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8112XAFDTOPRC", GXutil.ltrim( localUtil.ntoc( Z8112XAFDTOPRC, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8113XAFUSUGEN", GXutil.rtrim( Z8113XAFUSUGEN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8114XAFFCHGEN", localUtil.ttoc( Z8114XAFFCHGEN, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8115XAFUSULEE", GXutil.rtrim( Z8115XAFUSULEE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8116XAFFCHLEE", localUtil.ttoc( Z8116XAFFCHLEE, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8117XAFEST", GXutil.rtrim( Z8117XAFEST));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8118XAFERR", Z8118XAFERR);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nGXsfl_100_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.txaf", new String[] {GXutil.URLEncode(GXutil.ltrimstr(A8103XAFALPCOD,10,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"XAFALPCOD","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TXAF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "INT_REMISIONES", "") ;
   }

   public void initializeNonKey1151138( )
   {
      A8104XAFTpo = "" ;
      n8104XAFTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8104XAFTpo", A8104XAFTpo);
      A8105XAFCLI = "" ;
      n8105XAFCLI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8105XAFCLI", A8105XAFCLI);
      A8106XAFFCH = GXutil.resetTime( GXutil.nullDate() );
      n8106XAFFCH = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8106XAFFCH", localUtil.ttoc( A8106XAFFCH, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8107XAFVTO = GXutil.resetTime( GXutil.nullDate() );
      n8107XAFVTO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8107XAFVTO", localUtil.ttoc( A8107XAFVTO, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8108XAFFPG = "" ;
      n8108XAFFPG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8108XAFFPG", A8108XAFFPG);
      A8109XAFVND = (short)(0) ;
      n8109XAFVND = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8109XAFVND", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8109XAFVND), 3, 0));
      A8110XAFOBS = "" ;
      n8110XAFOBS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8110XAFOBS", A8110XAFOBS);
      A8111XAFDTOPZO = 0 ;
      n8111XAFDTOPZO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8111XAFDTOPZO", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8111XAFDTOPZO), 5, 0));
      A8112XAFDTOPRC = DecimalUtil.ZERO ;
      n8112XAFDTOPRC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8112XAFDTOPRC", GXutil.ltrimstr( A8112XAFDTOPRC, 6, 2));
      A8113XAFUSUGEN = "" ;
      n8113XAFUSUGEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8113XAFUSUGEN", A8113XAFUSUGEN);
      A8114XAFFCHGEN = GXutil.resetTime( GXutil.nullDate() );
      n8114XAFFCHGEN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8114XAFFCHGEN", localUtil.ttoc( A8114XAFFCHGEN, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8115XAFUSULEE = "" ;
      n8115XAFUSULEE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8115XAFUSULEE", A8115XAFUSULEE);
      A8116XAFFCHLEE = GXutil.resetTime( GXutil.nullDate() );
      n8116XAFFCHLEE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8116XAFFCHLEE", localUtil.ttoc( A8116XAFFCHLEE, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A8117XAFEST = "" ;
      n8117XAFEST = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8117XAFEST", A8117XAFEST);
      A8118XAFERR = "" ;
      n8118XAFERR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8118XAFERR", A8118XAFERR);
      Z8104XAFTpo = "" ;
      Z8105XAFCLI = "" ;
      Z8106XAFFCH = GXutil.resetTime( GXutil.nullDate() );
      Z8107XAFVTO = GXutil.resetTime( GXutil.nullDate() );
      Z8108XAFFPG = "" ;
      Z8109XAFVND = (short)(0) ;
      Z8110XAFOBS = "" ;
      Z8111XAFDTOPZO = 0 ;
      Z8112XAFDTOPRC = DecimalUtil.ZERO ;
      Z8113XAFUSUGEN = "" ;
      Z8114XAFFCHGEN = GXutil.resetTime( GXutil.nullDate() );
      Z8115XAFUSULEE = "" ;
      Z8116XAFFCHLEE = GXutil.resetTime( GXutil.nullDate() );
      Z8117XAFEST = "" ;
      Z8118XAFERR = "" ;
   }

   public void initAll1151138( )
   {
      initializeNonKey1151138( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1151139( )
   {
      A8120XAFLINHDR = "" ;
      n8120XAFLINHDR = false ;
      A8121XAFLINALR = "" ;
      n8121XAFLINALR = false ;
      A8122XAFLINLOT = "" ;
      n8122XAFLINLOT = false ;
      A8123XAFLINPZA = 0 ;
      n8123XAFLINPZA = false ;
      A8124XAFLINARTC = "" ;
      n8124XAFLINARTC = false ;
      A8125XAFLINARTD = "" ;
      n8125XAFLINARTD = false ;
      A8126XAFLININTC = 0 ;
      n8126XAFLININTC = false ;
      A8127XAFLINDIBC = "" ;
      n8127XAFLINDIBC = false ;
      A8128XAFLINDIBD = "" ;
      n8128XAFLINDIBD = false ;
      A8129XAFLINCOLC = "" ;
      n8129XAFLINCOLC = false ;
      A8130XAFLINCOLD = "" ;
      n8130XAFLINCOLD = false ;
      A8131XAFLINKGSE = DecimalUtil.ZERO ;
      n8131XAFLINKGSE = false ;
      A8132XAFLINKGSS = DecimalUtil.ZERO ;
      n8132XAFLINKGSS = false ;
      A8133XAFLINMER = DecimalUtil.ZERO ;
      n8133XAFLINMER = false ;
      A8134XAFLINMTSS = DecimalUtil.ZERO ;
      n8134XAFLINMTSS = false ;
      A8135XAFLINPREK = DecimalUtil.ZERO ;
      n8135XAFLINPREK = false ;
      A8136XAFLINPREM = DecimalUtil.ZERO ;
      n8136XAFLINPREM = false ;
      A8137XAFLINMOC = DecimalUtil.ZERO ;
      n8137XAFLINMOC = false ;
      A8138XAFLINMAQC = DecimalUtil.ZERO ;
      n8138XAFLINMAQC = false ;
      A8139XAFLININSC = DecimalUtil.ZERO ;
      n8139XAFLININSC = false ;
      A8140XAFLINUSUG = "" ;
      n8140XAFLINUSUG = false ;
      A8141XAFLINFCHG = GXutil.resetTime( GXutil.nullDate() );
      n8141XAFLINFCHG = false ;
      A8142XAFLINUSUL = "" ;
      n8142XAFLINUSUL = false ;
      A8143XAFLINFCHL = GXutil.resetTime( GXutil.nullDate() );
      n8143XAFLINFCHL = false ;
      A8144XAFLINEST = "" ;
      n8144XAFLINEST = false ;
      A8145XAFLINERR = "" ;
      n8145XAFLINERR = false ;
      A8146XAFLINCCO = "" ;
      n8146XAFLINCCO = false ;
      A8147XAFLINMTSE = DecimalUtil.ZERO ;
      n8147XAFLINMTSE = false ;
      A8148XAFLINKGS = DecimalUtil.ZERO ;
      n8148XAFLINKGS = false ;
      A8149XAFLINMTS = DecimalUtil.ZERO ;
      n8149XAFLINMTS = false ;
      A8150XAFLINREFC = "" ;
      n8150XAFLINREFC = false ;
      A8151XAFLINREFD = "" ;
      n8151XAFLINREFD = false ;
      A8152XAFLINPRE = DecimalUtil.ZERO ;
      n8152XAFLINPRE = false ;
      A8309XAFLINDTO = DecimalUtil.ZERO ;
      n8309XAFLINDTO = false ;
      A8310XAFLINREC = DecimalUtil.ZERO ;
      n8310XAFLINREC = false ;
      A12713XAFLINKGR = DecimalUtil.ZERO ;
      n12713XAFLINKGR = false ;
      Z8120XAFLINHDR = "" ;
      Z8121XAFLINALR = "" ;
      Z8122XAFLINLOT = "" ;
      Z8123XAFLINPZA = 0 ;
      Z8124XAFLINARTC = "" ;
      Z8125XAFLINARTD = "" ;
      Z8126XAFLININTC = 0 ;
      Z8127XAFLINDIBC = "" ;
      Z8128XAFLINDIBD = "" ;
      Z8129XAFLINCOLC = "" ;
      Z8130XAFLINCOLD = "" ;
      Z8131XAFLINKGSE = DecimalUtil.ZERO ;
      Z8132XAFLINKGSS = DecimalUtil.ZERO ;
      Z8133XAFLINMER = DecimalUtil.ZERO ;
      Z8134XAFLINMTSS = DecimalUtil.ZERO ;
      Z8135XAFLINPREK = DecimalUtil.ZERO ;
      Z8136XAFLINPREM = DecimalUtil.ZERO ;
      Z8137XAFLINMOC = DecimalUtil.ZERO ;
      Z8138XAFLINMAQC = DecimalUtil.ZERO ;
      Z8139XAFLININSC = DecimalUtil.ZERO ;
      Z8140XAFLINUSUG = "" ;
      Z8141XAFLINFCHG = GXutil.resetTime( GXutil.nullDate() );
      Z8142XAFLINUSUL = "" ;
      Z8143XAFLINFCHL = GXutil.resetTime( GXutil.nullDate() );
      Z8144XAFLINEST = "" ;
      Z8145XAFLINERR = "" ;
      Z8146XAFLINCCO = "" ;
      Z8147XAFLINMTSE = DecimalUtil.ZERO ;
      Z8148XAFLINKGS = DecimalUtil.ZERO ;
      Z8149XAFLINMTS = DecimalUtil.ZERO ;
      Z8150XAFLINREFC = "" ;
      Z8151XAFLINREFD = "" ;
      Z8152XAFLINPRE = DecimalUtil.ZERO ;
      Z8309XAFLINDTO = DecimalUtil.ZERO ;
      Z8310XAFLINREC = DecimalUtil.ZERO ;
      Z12713XAFLINKGR = DecimalUtil.ZERO ;
   }

   public void initAll1151139( )
   {
      A8119XAFLIN = 0 ;
      initializeNonKey1151139( ) ;
   }

   public void standaloneModalInsert1151139( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251901499", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("txaf.js", "?20261251901499", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1139( )
   {
      edtXAFLIN_Enabled = defedtXAFLIN_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtXAFLIN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtXAFLIN_Enabled), 5, 0), !bGXsfl_100_Refreshing);
   }

   public void startgridcontrol100( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1139, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1139_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8119XAFLIN, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLIN_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8120XAFLINHDR));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINHDR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8121XAFLINALR));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINALR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8122XAFLINLOT));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINLOT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8123XAFLINPZA, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPZA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8124XAFLINARTC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINARTC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8125XAFLINARTD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINARTD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8126XAFLININTC, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLININTC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8127XAFLINDIBC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDIBC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8128XAFLINDIBD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDIBD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8129XAFLINCOLC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCOLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8130XAFLINCOLD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCOLD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8131XAFLINKGSE, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGSE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8132XAFLINKGSS, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGSS_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8133XAFLINMER, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMER_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8134XAFLINMTSS, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTSS_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8135XAFLINPREK, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPREK_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8136XAFLINPREM, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPREM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8137XAFLINMOC, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMOC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8138XAFLINMAQC, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMAQC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8139XAFLININSC, (byte)(16), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLININSC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8140XAFLINUSUG));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINUSUG_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A8141XAFLINFCHG, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINFCHG_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8142XAFLINUSUL));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINUSUL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A8143XAFLINFCHL, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINFCHL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8144XAFLINEST));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINEST_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8145XAFLINERR));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINERR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8146XAFLINCCO));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINCCO_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8147XAFLINMTSE, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTSE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8148XAFLINKGS, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGS_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8149XAFLINMTS, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINMTS_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8150XAFLINREFC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREFC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8151XAFLINREFD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREFD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8152XAFLINPRE, (byte)(14), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINPRE_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8309XAFLINDTO, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINDTO_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8310XAFLINREC, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINREC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12713XAFLINKGR, (byte)(13), (byte)(3), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtXAFLINKGR_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtXAFALPCOD_Internalname = "XAFALPCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtXAFTpo_Internalname = "XAFTPO" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtXAFCLI_Internalname = "XAFCLI" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtXAFFCH_Internalname = "XAFFCH" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtXAFVTO_Internalname = "XAFVTO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtXAFFPG_Internalname = "XAFFPG" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtXAFVND_Internalname = "XAFVND" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtXAFOBS_Internalname = "XAFOBS" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtXAFDTOPZO_Internalname = "XAFDTOPZO" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtXAFDTOPRC_Internalname = "XAFDTOPRC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtXAFUSUGEN_Internalname = "XAFUSUGEN" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtXAFFCHGEN_Internalname = "XAFFCHGEN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtXAFUSULEE_Internalname = "XAFUSULEE" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtXAFFCHLEE_Internalname = "XAFFCHLEE" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtXAFEST_Internalname = "XAFEST" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtXAFERR_Internalname = "XAFERR" ;
      edtavnRcdDeleted_1139_Internalname = "vNRCDDELETED_1139" ;
      edtXAFLIN_Internalname = "XAFLIN" ;
      edtXAFLINHDR_Internalname = "XAFLINHDR" ;
      edtXAFLINALR_Internalname = "XAFLINALR" ;
      edtXAFLINLOT_Internalname = "XAFLINLOT" ;
      edtXAFLINPZA_Internalname = "XAFLINPZA" ;
      edtXAFLINARTC_Internalname = "XAFLINARTC" ;
      edtXAFLINARTD_Internalname = "XAFLINARTD" ;
      edtXAFLININTC_Internalname = "XAFLININTC" ;
      edtXAFLINDIBC_Internalname = "XAFLINDIBC" ;
      edtXAFLINDIBD_Internalname = "XAFLINDIBD" ;
      edtXAFLINCOLC_Internalname = "XAFLINCOLC" ;
      edtXAFLINCOLD_Internalname = "XAFLINCOLD" ;
      edtXAFLINKGSE_Internalname = "XAFLINKGSE" ;
      edtXAFLINKGSS_Internalname = "XAFLINKGSS" ;
      edtXAFLINMER_Internalname = "XAFLINMER" ;
      edtXAFLINMTSS_Internalname = "XAFLINMTSS" ;
      edtXAFLINPREK_Internalname = "XAFLINPREK" ;
      edtXAFLINPREM_Internalname = "XAFLINPREM" ;
      edtXAFLINMOC_Internalname = "XAFLINMOC" ;
      edtXAFLINMAQC_Internalname = "XAFLINMAQC" ;
      edtXAFLININSC_Internalname = "XAFLININSC" ;
      edtXAFLINUSUG_Internalname = "XAFLINUSUG" ;
      edtXAFLINFCHG_Internalname = "XAFLINFCHG" ;
      edtXAFLINUSUL_Internalname = "XAFLINUSUL" ;
      edtXAFLINFCHL_Internalname = "XAFLINFCHL" ;
      edtXAFLINEST_Internalname = "XAFLINEST" ;
      edtXAFLINERR_Internalname = "XAFLINERR" ;
      edtXAFLINCCO_Internalname = "XAFLINCCO" ;
      edtXAFLINMTSE_Internalname = "XAFLINMTSE" ;
      edtXAFLINKGS_Internalname = "XAFLINKGS" ;
      edtXAFLINMTS_Internalname = "XAFLINMTS" ;
      edtXAFLINREFC_Internalname = "XAFLINREFC" ;
      edtXAFLINREFD_Internalname = "XAFLINREFD" ;
      edtXAFLINPRE_Internalname = "XAFLINPRE" ;
      edtXAFLINDTO_Internalname = "XAFLINDTO" ;
      edtXAFLINREC_Internalname = "XAFLINREC" ;
      edtXAFLINKGR_Internalname = "XAFLINKGR" ;
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
      Form.setCaption( httpContext.getMessage( "INT_REMISIONES", "") );
      edtXAFLINKGR_Jsonclick = "" ;
      edtXAFLINREC_Jsonclick = "" ;
      edtXAFLINDTO_Jsonclick = "" ;
      edtXAFLINPRE_Jsonclick = "" ;
      edtXAFLINREFD_Jsonclick = "" ;
      edtXAFLINREFC_Jsonclick = "" ;
      edtXAFLINMTS_Jsonclick = "" ;
      edtXAFLINKGS_Jsonclick = "" ;
      edtXAFLINMTSE_Jsonclick = "" ;
      edtXAFLINCCO_Jsonclick = "" ;
      edtXAFLINERR_Jsonclick = "" ;
      edtXAFLINEST_Jsonclick = "" ;
      edtXAFLINFCHL_Jsonclick = "" ;
      edtXAFLINUSUL_Jsonclick = "" ;
      edtXAFLINFCHG_Jsonclick = "" ;
      edtXAFLINUSUG_Jsonclick = "" ;
      edtXAFLININSC_Jsonclick = "" ;
      edtXAFLINMAQC_Jsonclick = "" ;
      edtXAFLINMOC_Jsonclick = "" ;
      edtXAFLINPREM_Jsonclick = "" ;
      edtXAFLINPREK_Jsonclick = "" ;
      edtXAFLINMTSS_Jsonclick = "" ;
      edtXAFLINMER_Jsonclick = "" ;
      edtXAFLINKGSS_Jsonclick = "" ;
      edtXAFLINKGSE_Jsonclick = "" ;
      edtXAFLINCOLD_Jsonclick = "" ;
      edtXAFLINCOLC_Jsonclick = "" ;
      edtXAFLINDIBD_Jsonclick = "" ;
      edtXAFLINDIBC_Jsonclick = "" ;
      edtXAFLININTC_Jsonclick = "" ;
      edtXAFLINARTD_Jsonclick = "" ;
      edtXAFLINARTC_Jsonclick = "" ;
      edtXAFLINPZA_Jsonclick = "" ;
      edtXAFLINLOT_Jsonclick = "" ;
      edtXAFLINALR_Jsonclick = "" ;
      edtXAFLINHDR_Jsonclick = "" ;
      edtXAFLIN_Jsonclick = "" ;
      edtavnRcdDeleted_1139_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtXAFLINKGR_Enabled = 1 ;
      edtXAFLINREC_Enabled = 1 ;
      edtXAFLINDTO_Enabled = 1 ;
      edtXAFLINPRE_Enabled = 1 ;
      edtXAFLINREFD_Enabled = 1 ;
      edtXAFLINREFC_Enabled = 1 ;
      edtXAFLINMTS_Enabled = 1 ;
      edtXAFLINKGS_Enabled = 1 ;
      edtXAFLINMTSE_Enabled = 1 ;
      edtXAFLINCCO_Enabled = 1 ;
      edtXAFLINERR_Enabled = 1 ;
      edtXAFLINEST_Enabled = 1 ;
      edtXAFLINFCHL_Enabled = 1 ;
      edtXAFLINUSUL_Enabled = 1 ;
      edtXAFLINFCHG_Enabled = 1 ;
      edtXAFLINUSUG_Enabled = 1 ;
      edtXAFLININSC_Enabled = 1 ;
      edtXAFLINMAQC_Enabled = 1 ;
      edtXAFLINMOC_Enabled = 1 ;
      edtXAFLINPREM_Enabled = 1 ;
      edtXAFLINPREK_Enabled = 1 ;
      edtXAFLINMTSS_Enabled = 1 ;
      edtXAFLINMER_Enabled = 1 ;
      edtXAFLINKGSS_Enabled = 1 ;
      edtXAFLINKGSE_Enabled = 1 ;
      edtXAFLINCOLD_Enabled = 1 ;
      edtXAFLINCOLC_Enabled = 1 ;
      edtXAFLINDIBD_Enabled = 1 ;
      edtXAFLINDIBC_Enabled = 1 ;
      edtXAFLININTC_Enabled = 1 ;
      edtXAFLINARTD_Enabled = 1 ;
      edtXAFLINARTC_Enabled = 1 ;
      edtXAFLINPZA_Enabled = 1 ;
      edtXAFLINLOT_Enabled = 1 ;
      edtXAFLINALR_Enabled = 1 ;
      edtXAFLINHDR_Enabled = 1 ;
      edtXAFLIN_Enabled = 1 ;
      edtavnRcdDeleted_1139_Enabled = 1 ;
      edtXAFERR_Backcolor = (int)(0xFFFFFF) ;
      edtXAFERR_Enabled = 1 ;
      edtXAFEST_Jsonclick = "" ;
      edtXAFEST_Backcolor = (int)(0xFFFFFF) ;
      edtXAFEST_Enabled = 1 ;
      edtXAFFCHLEE_Jsonclick = "" ;
      edtXAFFCHLEE_Backcolor = (int)(0xFFFFFF) ;
      edtXAFFCHLEE_Enabled = 1 ;
      edtXAFUSULEE_Jsonclick = "" ;
      edtXAFUSULEE_Backcolor = (int)(0xFFFFFF) ;
      edtXAFUSULEE_Enabled = 1 ;
      edtXAFFCHGEN_Jsonclick = "" ;
      edtXAFFCHGEN_Backcolor = (int)(0xFFFFFF) ;
      edtXAFFCHGEN_Enabled = 1 ;
      edtXAFUSUGEN_Jsonclick = "" ;
      edtXAFUSUGEN_Backcolor = (int)(0xFFFFFF) ;
      edtXAFUSUGEN_Enabled = 1 ;
      edtXAFDTOPRC_Jsonclick = "" ;
      edtXAFDTOPRC_Backcolor = (int)(0xFFFFFF) ;
      edtXAFDTOPRC_Enabled = 1 ;
      edtXAFDTOPZO_Jsonclick = "" ;
      edtXAFDTOPZO_Backcolor = (int)(0xFFFFFF) ;
      edtXAFDTOPZO_Enabled = 1 ;
      edtXAFOBS_Jsonclick = "" ;
      edtXAFOBS_Backcolor = (int)(0xFFFFFF) ;
      edtXAFOBS_Enabled = 1 ;
      edtXAFVND_Jsonclick = "" ;
      edtXAFVND_Backcolor = (int)(0xFFFFFF) ;
      edtXAFVND_Enabled = 1 ;
      edtXAFFPG_Jsonclick = "" ;
      edtXAFFPG_Backcolor = (int)(0xFFFFFF) ;
      edtXAFFPG_Enabled = 1 ;
      edtXAFVTO_Jsonclick = "" ;
      edtXAFVTO_Backcolor = (int)(0xFFFFFF) ;
      edtXAFVTO_Enabled = 1 ;
      edtXAFFCH_Jsonclick = "" ;
      edtXAFFCH_Backcolor = (int)(0xFFFFFF) ;
      edtXAFFCH_Enabled = 1 ;
      edtXAFCLI_Jsonclick = "" ;
      edtXAFCLI_Backcolor = (int)(0xFFFFFF) ;
      edtXAFCLI_Enabled = 1 ;
      edtXAFTpo_Jsonclick = "" ;
      edtXAFTpo_Backcolor = (int)(0xFFFFFF) ;
      edtXAFTpo_Enabled = 1 ;
      bttBtn_get_Enabled = 0 ;
      bttBtn_get_Visible = 1 ;
      edtXAFALPCOD_Jsonclick = "" ;
      edtXAFALPCOD_Backcolor = (int)(0xFFFFFF) ;
      edtXAFALPCOD_Enabled = 0 ;
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
      subsflControlProps_1001139( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1151139( ) ;
         standaloneModal1151139( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1151139( ) ;
         nGXsfl_100_idx = (int)(nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1001139( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A8103XAFALPCOD',fld:'XAFALPCOD',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_XAFALPCOD","{handler:'valid_Xafalpcod',iparms:[]");
      setEventMetadata("VALID_XAFALPCOD",",oparms:[]}");
      setEventMetadata("VALID_XAFLIN","{handler:'valid_Xaflin',iparms:[]");
      setEventMetadata("VALID_XAFLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Xaflinkgr',iparms:[]");
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
      wcpOGx_mode = "" ;
      Z8104XAFTpo = "" ;
      Z8105XAFCLI = "" ;
      Z8106XAFFCH = GXutil.resetTime( GXutil.nullDate() );
      Z8107XAFVTO = GXutil.resetTime( GXutil.nullDate() );
      Z8108XAFFPG = "" ;
      Z8110XAFOBS = "" ;
      Z8112XAFDTOPRC = DecimalUtil.ZERO ;
      Z8113XAFUSUGEN = "" ;
      Z8114XAFFCHGEN = GXutil.resetTime( GXutil.nullDate() );
      Z8115XAFUSULEE = "" ;
      Z8116XAFFCHLEE = GXutil.resetTime( GXutil.nullDate() );
      Z8117XAFEST = "" ;
      Z8118XAFERR = "" ;
      Z8120XAFLINHDR = "" ;
      Z8121XAFLINALR = "" ;
      Z8122XAFLINLOT = "" ;
      Z8124XAFLINARTC = "" ;
      Z8125XAFLINARTD = "" ;
      Z8127XAFLINDIBC = "" ;
      Z8128XAFLINDIBD = "" ;
      Z8129XAFLINCOLC = "" ;
      Z8130XAFLINCOLD = "" ;
      Z8131XAFLINKGSE = DecimalUtil.ZERO ;
      Z8132XAFLINKGSS = DecimalUtil.ZERO ;
      Z8133XAFLINMER = DecimalUtil.ZERO ;
      Z8134XAFLINMTSS = DecimalUtil.ZERO ;
      Z8135XAFLINPREK = DecimalUtil.ZERO ;
      Z8136XAFLINPREM = DecimalUtil.ZERO ;
      Z8137XAFLINMOC = DecimalUtil.ZERO ;
      Z8138XAFLINMAQC = DecimalUtil.ZERO ;
      Z8139XAFLININSC = DecimalUtil.ZERO ;
      Z8140XAFLINUSUG = "" ;
      Z8141XAFLINFCHG = GXutil.resetTime( GXutil.nullDate() );
      Z8142XAFLINUSUL = "" ;
      Z8143XAFLINFCHL = GXutil.resetTime( GXutil.nullDate() );
      Z8144XAFLINEST = "" ;
      Z8145XAFLINERR = "" ;
      Z8146XAFLINCCO = "" ;
      Z8147XAFLINMTSE = DecimalUtil.ZERO ;
      Z8148XAFLINKGS = DecimalUtil.ZERO ;
      Z8149XAFLINMTS = DecimalUtil.ZERO ;
      Z8150XAFLINREFC = "" ;
      Z8151XAFLINREFD = "" ;
      Z8152XAFLINPRE = DecimalUtil.ZERO ;
      Z8309XAFLINDTO = DecimalUtil.ZERO ;
      Z8310XAFLINREC = DecimalUtil.ZERO ;
      Z12713XAFLINKGR = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      A8104XAFTpo = "" ;
      lblTextblock3_Jsonclick = "" ;
      A8105XAFCLI = "" ;
      lblTextblock4_Jsonclick = "" ;
      A8106XAFFCH = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock5_Jsonclick = "" ;
      A8107XAFVTO = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock6_Jsonclick = "" ;
      A8108XAFFPG = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A8110XAFOBS = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A8112XAFDTOPRC = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A8113XAFUSUGEN = "" ;
      lblTextblock12_Jsonclick = "" ;
      A8114XAFFCHGEN = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock13_Jsonclick = "" ;
      A8115XAFUSULEE = "" ;
      lblTextblock14_Jsonclick = "" ;
      A8116XAFFCHLEE = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock15_Jsonclick = "" ;
      A8117XAFEST = "" ;
      lblTextblock16_Jsonclick = "" ;
      A8118XAFERR = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1139 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1138 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A8120XAFLINHDR = "" ;
      A8121XAFLINALR = "" ;
      A8122XAFLINLOT = "" ;
      A8124XAFLINARTC = "" ;
      A8125XAFLINARTD = "" ;
      A8127XAFLINDIBC = "" ;
      A8128XAFLINDIBD = "" ;
      A8129XAFLINCOLC = "" ;
      A8130XAFLINCOLD = "" ;
      A8131XAFLINKGSE = DecimalUtil.ZERO ;
      A8132XAFLINKGSS = DecimalUtil.ZERO ;
      A8133XAFLINMER = DecimalUtil.ZERO ;
      A8134XAFLINMTSS = DecimalUtil.ZERO ;
      A8135XAFLINPREK = DecimalUtil.ZERO ;
      A8136XAFLINPREM = DecimalUtil.ZERO ;
      A8137XAFLINMOC = DecimalUtil.ZERO ;
      A8138XAFLINMAQC = DecimalUtil.ZERO ;
      A8139XAFLININSC = DecimalUtil.ZERO ;
      A8140XAFLINUSUG = "" ;
      A8141XAFLINFCHG = GXutil.resetTime( GXutil.nullDate() );
      A8142XAFLINUSUL = "" ;
      A8143XAFLINFCHL = GXutil.resetTime( GXutil.nullDate() );
      A8144XAFLINEST = "" ;
      A8145XAFLINERR = "" ;
      A8146XAFLINCCO = "" ;
      A8147XAFLINMTSE = DecimalUtil.ZERO ;
      A8148XAFLINKGS = DecimalUtil.ZERO ;
      A8149XAFLINMTS = DecimalUtil.ZERO ;
      A8150XAFLINREFC = "" ;
      A8151XAFLINREFD = "" ;
      A8152XAFLINPRE = DecimalUtil.ZERO ;
      A8309XAFLINDTO = DecimalUtil.ZERO ;
      A8310XAFLINREC = DecimalUtil.ZERO ;
      A12713XAFLINKGR = DecimalUtil.ZERO ;
      T01156_A8103XAFALPCOD = new long[1] ;
      T01156_A8104XAFTpo = new String[] {""} ;
      T01156_n8104XAFTpo = new boolean[] {false} ;
      T01156_A8105XAFCLI = new String[] {""} ;
      T01156_n8105XAFCLI = new boolean[] {false} ;
      T01156_A8106XAFFCH = new java.util.Date[] {GXutil.nullDate()} ;
      T01156_n8106XAFFCH = new boolean[] {false} ;
      T01156_A8107XAFVTO = new java.util.Date[] {GXutil.nullDate()} ;
      T01156_n8107XAFVTO = new boolean[] {false} ;
      T01156_A8108XAFFPG = new String[] {""} ;
      T01156_n8108XAFFPG = new boolean[] {false} ;
      T01156_A8109XAFVND = new short[1] ;
      T01156_n8109XAFVND = new boolean[] {false} ;
      T01156_A8110XAFOBS = new String[] {""} ;
      T01156_n8110XAFOBS = new boolean[] {false} ;
      T01156_A8111XAFDTOPZO = new int[1] ;
      T01156_n8111XAFDTOPZO = new boolean[] {false} ;
      T01156_A8112XAFDTOPRC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01156_n8112XAFDTOPRC = new boolean[] {false} ;
      T01156_A8113XAFUSUGEN = new String[] {""} ;
      T01156_n8113XAFUSUGEN = new boolean[] {false} ;
      T01156_A8114XAFFCHGEN = new java.util.Date[] {GXutil.nullDate()} ;
      T01156_n8114XAFFCHGEN = new boolean[] {false} ;
      T01156_A8115XAFUSULEE = new String[] {""} ;
      T01156_n8115XAFUSULEE = new boolean[] {false} ;
      T01156_A8116XAFFCHLEE = new java.util.Date[] {GXutil.nullDate()} ;
      T01156_n8116XAFFCHLEE = new boolean[] {false} ;
      T01156_A8117XAFEST = new String[] {""} ;
      T01156_n8117XAFEST = new boolean[] {false} ;
      T01156_A8118XAFERR = new String[] {""} ;
      T01156_n8118XAFERR = new boolean[] {false} ;
      T01157_A8103XAFALPCOD = new long[1] ;
      T01155_A8103XAFALPCOD = new long[1] ;
      T01155_A8104XAFTpo = new String[] {""} ;
      T01155_n8104XAFTpo = new boolean[] {false} ;
      T01155_A8105XAFCLI = new String[] {""} ;
      T01155_n8105XAFCLI = new boolean[] {false} ;
      T01155_A8106XAFFCH = new java.util.Date[] {GXutil.nullDate()} ;
      T01155_n8106XAFFCH = new boolean[] {false} ;
      T01155_A8107XAFVTO = new java.util.Date[] {GXutil.nullDate()} ;
      T01155_n8107XAFVTO = new boolean[] {false} ;
      T01155_A8108XAFFPG = new String[] {""} ;
      T01155_n8108XAFFPG = new boolean[] {false} ;
      T01155_A8109XAFVND = new short[1] ;
      T01155_n8109XAFVND = new boolean[] {false} ;
      T01155_A8110XAFOBS = new String[] {""} ;
      T01155_n8110XAFOBS = new boolean[] {false} ;
      T01155_A8111XAFDTOPZO = new int[1] ;
      T01155_n8111XAFDTOPZO = new boolean[] {false} ;
      T01155_A8112XAFDTOPRC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01155_n8112XAFDTOPRC = new boolean[] {false} ;
      T01155_A8113XAFUSUGEN = new String[] {""} ;
      T01155_n8113XAFUSUGEN = new boolean[] {false} ;
      T01155_A8114XAFFCHGEN = new java.util.Date[] {GXutil.nullDate()} ;
      T01155_n8114XAFFCHGEN = new boolean[] {false} ;
      T01155_A8115XAFUSULEE = new String[] {""} ;
      T01155_n8115XAFUSULEE = new boolean[] {false} ;
      T01155_A8116XAFFCHLEE = new java.util.Date[] {GXutil.nullDate()} ;
      T01155_n8116XAFFCHLEE = new boolean[] {false} ;
      T01155_A8117XAFEST = new String[] {""} ;
      T01155_n8117XAFEST = new boolean[] {false} ;
      T01155_A8118XAFERR = new String[] {""} ;
      T01155_n8118XAFERR = new boolean[] {false} ;
      T01158_A8103XAFALPCOD = new long[1] ;
      T01159_A8103XAFALPCOD = new long[1] ;
      T01154_A8103XAFALPCOD = new long[1] ;
      T01154_A8104XAFTpo = new String[] {""} ;
      T01154_n8104XAFTpo = new boolean[] {false} ;
      T01154_A8105XAFCLI = new String[] {""} ;
      T01154_n8105XAFCLI = new boolean[] {false} ;
      T01154_A8106XAFFCH = new java.util.Date[] {GXutil.nullDate()} ;
      T01154_n8106XAFFCH = new boolean[] {false} ;
      T01154_A8107XAFVTO = new java.util.Date[] {GXutil.nullDate()} ;
      T01154_n8107XAFVTO = new boolean[] {false} ;
      T01154_A8108XAFFPG = new String[] {""} ;
      T01154_n8108XAFFPG = new boolean[] {false} ;
      T01154_A8109XAFVND = new short[1] ;
      T01154_n8109XAFVND = new boolean[] {false} ;
      T01154_A8110XAFOBS = new String[] {""} ;
      T01154_n8110XAFOBS = new boolean[] {false} ;
      T01154_A8111XAFDTOPZO = new int[1] ;
      T01154_n8111XAFDTOPZO = new boolean[] {false} ;
      T01154_A8112XAFDTOPRC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01154_n8112XAFDTOPRC = new boolean[] {false} ;
      T01154_A8113XAFUSUGEN = new String[] {""} ;
      T01154_n8113XAFUSUGEN = new boolean[] {false} ;
      T01154_A8114XAFFCHGEN = new java.util.Date[] {GXutil.nullDate()} ;
      T01154_n8114XAFFCHGEN = new boolean[] {false} ;
      T01154_A8115XAFUSULEE = new String[] {""} ;
      T01154_n8115XAFUSULEE = new boolean[] {false} ;
      T01154_A8116XAFFCHLEE = new java.util.Date[] {GXutil.nullDate()} ;
      T01154_n8116XAFFCHLEE = new boolean[] {false} ;
      T01154_A8117XAFEST = new String[] {""} ;
      T01154_n8117XAFEST = new boolean[] {false} ;
      T01154_A8118XAFERR = new String[] {""} ;
      T01154_n8118XAFERR = new boolean[] {false} ;
      T011513_A8103XAFALPCOD = new long[1] ;
      T011514_A8103XAFALPCOD = new long[1] ;
      T011514_A8119XAFLIN = new int[1] ;
      T011514_A8120XAFLINHDR = new String[] {""} ;
      T011514_n8120XAFLINHDR = new boolean[] {false} ;
      T011514_A8121XAFLINALR = new String[] {""} ;
      T011514_n8121XAFLINALR = new boolean[] {false} ;
      T011514_A8122XAFLINLOT = new String[] {""} ;
      T011514_n8122XAFLINLOT = new boolean[] {false} ;
      T011514_A8123XAFLINPZA = new int[1] ;
      T011514_n8123XAFLINPZA = new boolean[] {false} ;
      T011514_A8124XAFLINARTC = new String[] {""} ;
      T011514_n8124XAFLINARTC = new boolean[] {false} ;
      T011514_A8125XAFLINARTD = new String[] {""} ;
      T011514_n8125XAFLINARTD = new boolean[] {false} ;
      T011514_A8126XAFLININTC = new int[1] ;
      T011514_n8126XAFLININTC = new boolean[] {false} ;
      T011514_A8127XAFLINDIBC = new String[] {""} ;
      T011514_n8127XAFLINDIBC = new boolean[] {false} ;
      T011514_A8128XAFLINDIBD = new String[] {""} ;
      T011514_n8128XAFLINDIBD = new boolean[] {false} ;
      T011514_A8129XAFLINCOLC = new String[] {""} ;
      T011514_n8129XAFLINCOLC = new boolean[] {false} ;
      T011514_A8130XAFLINCOLD = new String[] {""} ;
      T011514_n8130XAFLINCOLD = new boolean[] {false} ;
      T011514_A8131XAFLINKGSE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8131XAFLINKGSE = new boolean[] {false} ;
      T011514_A8132XAFLINKGSS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8132XAFLINKGSS = new boolean[] {false} ;
      T011514_A8133XAFLINMER = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8133XAFLINMER = new boolean[] {false} ;
      T011514_A8134XAFLINMTSS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8134XAFLINMTSS = new boolean[] {false} ;
      T011514_A8135XAFLINPREK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8135XAFLINPREK = new boolean[] {false} ;
      T011514_A8136XAFLINPREM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8136XAFLINPREM = new boolean[] {false} ;
      T011514_A8137XAFLINMOC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8137XAFLINMOC = new boolean[] {false} ;
      T011514_A8138XAFLINMAQC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8138XAFLINMAQC = new boolean[] {false} ;
      T011514_A8139XAFLININSC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8139XAFLININSC = new boolean[] {false} ;
      T011514_A8140XAFLINUSUG = new String[] {""} ;
      T011514_n8140XAFLINUSUG = new boolean[] {false} ;
      T011514_A8141XAFLINFCHG = new java.util.Date[] {GXutil.nullDate()} ;
      T011514_n8141XAFLINFCHG = new boolean[] {false} ;
      T011514_A8142XAFLINUSUL = new String[] {""} ;
      T011514_n8142XAFLINUSUL = new boolean[] {false} ;
      T011514_A8143XAFLINFCHL = new java.util.Date[] {GXutil.nullDate()} ;
      T011514_n8143XAFLINFCHL = new boolean[] {false} ;
      T011514_A8144XAFLINEST = new String[] {""} ;
      T011514_n8144XAFLINEST = new boolean[] {false} ;
      T011514_A8145XAFLINERR = new String[] {""} ;
      T011514_n8145XAFLINERR = new boolean[] {false} ;
      T011514_A8146XAFLINCCO = new String[] {""} ;
      T011514_n8146XAFLINCCO = new boolean[] {false} ;
      T011514_A8147XAFLINMTSE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8147XAFLINMTSE = new boolean[] {false} ;
      T011514_A8148XAFLINKGS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8148XAFLINKGS = new boolean[] {false} ;
      T011514_A8149XAFLINMTS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8149XAFLINMTS = new boolean[] {false} ;
      T011514_A8150XAFLINREFC = new String[] {""} ;
      T011514_n8150XAFLINREFC = new boolean[] {false} ;
      T011514_A8151XAFLINREFD = new String[] {""} ;
      T011514_n8151XAFLINREFD = new boolean[] {false} ;
      T011514_A8152XAFLINPRE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8152XAFLINPRE = new boolean[] {false} ;
      T011514_A8309XAFLINDTO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8309XAFLINDTO = new boolean[] {false} ;
      T011514_A8310XAFLINREC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n8310XAFLINREC = new boolean[] {false} ;
      T011514_A12713XAFLINKGR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T011514_n12713XAFLINKGR = new boolean[] {false} ;
      T011515_A8103XAFALPCOD = new long[1] ;
      T011515_A8119XAFLIN = new int[1] ;
      T01153_A8103XAFALPCOD = new long[1] ;
      T01153_A8119XAFLIN = new int[1] ;
      T01153_A8120XAFLINHDR = new String[] {""} ;
      T01153_n8120XAFLINHDR = new boolean[] {false} ;
      T01153_A8121XAFLINALR = new String[] {""} ;
      T01153_n8121XAFLINALR = new boolean[] {false} ;
      T01153_A8122XAFLINLOT = new String[] {""} ;
      T01153_n8122XAFLINLOT = new boolean[] {false} ;
      T01153_A8123XAFLINPZA = new int[1] ;
      T01153_n8123XAFLINPZA = new boolean[] {false} ;
      T01153_A8124XAFLINARTC = new String[] {""} ;
      T01153_n8124XAFLINARTC = new boolean[] {false} ;
      T01153_A8125XAFLINARTD = new String[] {""} ;
      T01153_n8125XAFLINARTD = new boolean[] {false} ;
      T01153_A8126XAFLININTC = new int[1] ;
      T01153_n8126XAFLININTC = new boolean[] {false} ;
      T01153_A8127XAFLINDIBC = new String[] {""} ;
      T01153_n8127XAFLINDIBC = new boolean[] {false} ;
      T01153_A8128XAFLINDIBD = new String[] {""} ;
      T01153_n8128XAFLINDIBD = new boolean[] {false} ;
      T01153_A8129XAFLINCOLC = new String[] {""} ;
      T01153_n8129XAFLINCOLC = new boolean[] {false} ;
      T01153_A8130XAFLINCOLD = new String[] {""} ;
      T01153_n8130XAFLINCOLD = new boolean[] {false} ;
      T01153_A8131XAFLINKGSE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8131XAFLINKGSE = new boolean[] {false} ;
      T01153_A8132XAFLINKGSS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8132XAFLINKGSS = new boolean[] {false} ;
      T01153_A8133XAFLINMER = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8133XAFLINMER = new boolean[] {false} ;
      T01153_A8134XAFLINMTSS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8134XAFLINMTSS = new boolean[] {false} ;
      T01153_A8135XAFLINPREK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8135XAFLINPREK = new boolean[] {false} ;
      T01153_A8136XAFLINPREM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8136XAFLINPREM = new boolean[] {false} ;
      T01153_A8137XAFLINMOC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8137XAFLINMOC = new boolean[] {false} ;
      T01153_A8138XAFLINMAQC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8138XAFLINMAQC = new boolean[] {false} ;
      T01153_A8139XAFLININSC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8139XAFLININSC = new boolean[] {false} ;
      T01153_A8140XAFLINUSUG = new String[] {""} ;
      T01153_n8140XAFLINUSUG = new boolean[] {false} ;
      T01153_A8141XAFLINFCHG = new java.util.Date[] {GXutil.nullDate()} ;
      T01153_n8141XAFLINFCHG = new boolean[] {false} ;
      T01153_A8142XAFLINUSUL = new String[] {""} ;
      T01153_n8142XAFLINUSUL = new boolean[] {false} ;
      T01153_A8143XAFLINFCHL = new java.util.Date[] {GXutil.nullDate()} ;
      T01153_n8143XAFLINFCHL = new boolean[] {false} ;
      T01153_A8144XAFLINEST = new String[] {""} ;
      T01153_n8144XAFLINEST = new boolean[] {false} ;
      T01153_A8145XAFLINERR = new String[] {""} ;
      T01153_n8145XAFLINERR = new boolean[] {false} ;
      T01153_A8146XAFLINCCO = new String[] {""} ;
      T01153_n8146XAFLINCCO = new boolean[] {false} ;
      T01153_A8147XAFLINMTSE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8147XAFLINMTSE = new boolean[] {false} ;
      T01153_A8148XAFLINKGS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8148XAFLINKGS = new boolean[] {false} ;
      T01153_A8149XAFLINMTS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8149XAFLINMTS = new boolean[] {false} ;
      T01153_A8150XAFLINREFC = new String[] {""} ;
      T01153_n8150XAFLINREFC = new boolean[] {false} ;
      T01153_A8151XAFLINREFD = new String[] {""} ;
      T01153_n8151XAFLINREFD = new boolean[] {false} ;
      T01153_A8152XAFLINPRE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8152XAFLINPRE = new boolean[] {false} ;
      T01153_A8309XAFLINDTO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8309XAFLINDTO = new boolean[] {false} ;
      T01153_A8310XAFLINREC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n8310XAFLINREC = new boolean[] {false} ;
      T01153_A12713XAFLINKGR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01153_n12713XAFLINKGR = new boolean[] {false} ;
      T01152_A8103XAFALPCOD = new long[1] ;
      T01152_A8119XAFLIN = new int[1] ;
      T01152_A8120XAFLINHDR = new String[] {""} ;
      T01152_n8120XAFLINHDR = new boolean[] {false} ;
      T01152_A8121XAFLINALR = new String[] {""} ;
      T01152_n8121XAFLINALR = new boolean[] {false} ;
      T01152_A8122XAFLINLOT = new String[] {""} ;
      T01152_n8122XAFLINLOT = new boolean[] {false} ;
      T01152_A8123XAFLINPZA = new int[1] ;
      T01152_n8123XAFLINPZA = new boolean[] {false} ;
      T01152_A8124XAFLINARTC = new String[] {""} ;
      T01152_n8124XAFLINARTC = new boolean[] {false} ;
      T01152_A8125XAFLINARTD = new String[] {""} ;
      T01152_n8125XAFLINARTD = new boolean[] {false} ;
      T01152_A8126XAFLININTC = new int[1] ;
      T01152_n8126XAFLININTC = new boolean[] {false} ;
      T01152_A8127XAFLINDIBC = new String[] {""} ;
      T01152_n8127XAFLINDIBC = new boolean[] {false} ;
      T01152_A8128XAFLINDIBD = new String[] {""} ;
      T01152_n8128XAFLINDIBD = new boolean[] {false} ;
      T01152_A8129XAFLINCOLC = new String[] {""} ;
      T01152_n8129XAFLINCOLC = new boolean[] {false} ;
      T01152_A8130XAFLINCOLD = new String[] {""} ;
      T01152_n8130XAFLINCOLD = new boolean[] {false} ;
      T01152_A8131XAFLINKGSE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8131XAFLINKGSE = new boolean[] {false} ;
      T01152_A8132XAFLINKGSS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8132XAFLINKGSS = new boolean[] {false} ;
      T01152_A8133XAFLINMER = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8133XAFLINMER = new boolean[] {false} ;
      T01152_A8134XAFLINMTSS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8134XAFLINMTSS = new boolean[] {false} ;
      T01152_A8135XAFLINPREK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8135XAFLINPREK = new boolean[] {false} ;
      T01152_A8136XAFLINPREM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8136XAFLINPREM = new boolean[] {false} ;
      T01152_A8137XAFLINMOC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8137XAFLINMOC = new boolean[] {false} ;
      T01152_A8138XAFLINMAQC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8138XAFLINMAQC = new boolean[] {false} ;
      T01152_A8139XAFLININSC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8139XAFLININSC = new boolean[] {false} ;
      T01152_A8140XAFLINUSUG = new String[] {""} ;
      T01152_n8140XAFLINUSUG = new boolean[] {false} ;
      T01152_A8141XAFLINFCHG = new java.util.Date[] {GXutil.nullDate()} ;
      T01152_n8141XAFLINFCHG = new boolean[] {false} ;
      T01152_A8142XAFLINUSUL = new String[] {""} ;
      T01152_n8142XAFLINUSUL = new boolean[] {false} ;
      T01152_A8143XAFLINFCHL = new java.util.Date[] {GXutil.nullDate()} ;
      T01152_n8143XAFLINFCHL = new boolean[] {false} ;
      T01152_A8144XAFLINEST = new String[] {""} ;
      T01152_n8144XAFLINEST = new boolean[] {false} ;
      T01152_A8145XAFLINERR = new String[] {""} ;
      T01152_n8145XAFLINERR = new boolean[] {false} ;
      T01152_A8146XAFLINCCO = new String[] {""} ;
      T01152_n8146XAFLINCCO = new boolean[] {false} ;
      T01152_A8147XAFLINMTSE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8147XAFLINMTSE = new boolean[] {false} ;
      T01152_A8148XAFLINKGS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8148XAFLINKGS = new boolean[] {false} ;
      T01152_A8149XAFLINMTS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8149XAFLINMTS = new boolean[] {false} ;
      T01152_A8150XAFLINREFC = new String[] {""} ;
      T01152_n8150XAFLINREFC = new boolean[] {false} ;
      T01152_A8151XAFLINREFD = new String[] {""} ;
      T01152_n8151XAFLINREFD = new boolean[] {false} ;
      T01152_A8152XAFLINPRE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8152XAFLINPRE = new boolean[] {false} ;
      T01152_A8309XAFLINDTO = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8309XAFLINDTO = new boolean[] {false} ;
      T01152_A8310XAFLINREC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n8310XAFLINREC = new boolean[] {false} ;
      T01152_A12713XAFLINKGR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01152_n12713XAFLINKGR = new boolean[] {false} ;
      T011519_A8103XAFALPCOD = new long[1] ;
      T011519_A8119XAFLIN = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.txaf__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.txaf__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.txaf__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.txaf__default(),
         new Object[] {
             new Object[] {
            T01152_A8103XAFALPCOD, T01152_A8119XAFLIN, T01152_A8120XAFLINHDR, T01152_n8120XAFLINHDR, T01152_A8121XAFLINALR, T01152_n8121XAFLINALR, T01152_A8122XAFLINLOT, T01152_n8122XAFLINLOT, T01152_A8123XAFLINPZA, T01152_n8123XAFLINPZA,
            T01152_A8124XAFLINARTC, T01152_n8124XAFLINARTC, T01152_A8125XAFLINARTD, T01152_n8125XAFLINARTD, T01152_A8126XAFLININTC, T01152_n8126XAFLININTC, T01152_A8127XAFLINDIBC, T01152_n8127XAFLINDIBC, T01152_A8128XAFLINDIBD, T01152_n8128XAFLINDIBD,
            T01152_A8129XAFLINCOLC, T01152_n8129XAFLINCOLC, T01152_A8130XAFLINCOLD, T01152_n8130XAFLINCOLD, T01152_A8131XAFLINKGSE, T01152_n8131XAFLINKGSE, T01152_A8132XAFLINKGSS, T01152_n8132XAFLINKGSS, T01152_A8133XAFLINMER, T01152_n8133XAFLINMER,
            T01152_A8134XAFLINMTSS, T01152_n8134XAFLINMTSS, T01152_A8135XAFLINPREK, T01152_n8135XAFLINPREK, T01152_A8136XAFLINPREM, T01152_n8136XAFLINPREM, T01152_A8137XAFLINMOC, T01152_n8137XAFLINMOC, T01152_A8138XAFLINMAQC, T01152_n8138XAFLINMAQC,
            T01152_A8139XAFLININSC, T01152_n8139XAFLININSC, T01152_A8140XAFLINUSUG, T01152_n8140XAFLINUSUG, T01152_A8141XAFLINFCHG, T01152_n8141XAFLINFCHG, T01152_A8142XAFLINUSUL, T01152_n8142XAFLINUSUL, T01152_A8143XAFLINFCHL, T01152_n8143XAFLINFCHL,
            T01152_A8144XAFLINEST, T01152_n8144XAFLINEST, T01152_A8145XAFLINERR, T01152_n8145XAFLINERR, T01152_A8146XAFLINCCO, T01152_n8146XAFLINCCO, T01152_A8147XAFLINMTSE, T01152_n8147XAFLINMTSE, T01152_A8148XAFLINKGS, T01152_n8148XAFLINKGS,
            T01152_A8149XAFLINMTS, T01152_n8149XAFLINMTS, T01152_A8150XAFLINREFC, T01152_n8150XAFLINREFC, T01152_A8151XAFLINREFD, T01152_n8151XAFLINREFD, T01152_A8152XAFLINPRE, T01152_n8152XAFLINPRE, T01152_A8309XAFLINDTO, T01152_n8309XAFLINDTO,
            T01152_A8310XAFLINREC, T01152_n8310XAFLINREC, T01152_A12713XAFLINKGR, T01152_n12713XAFLINKGR
            }
            , new Object[] {
            T01153_A8103XAFALPCOD, T01153_A8119XAFLIN, T01153_A8120XAFLINHDR, T01153_n8120XAFLINHDR, T01153_A8121XAFLINALR, T01153_n8121XAFLINALR, T01153_A8122XAFLINLOT, T01153_n8122XAFLINLOT, T01153_A8123XAFLINPZA, T01153_n8123XAFLINPZA,
            T01153_A8124XAFLINARTC, T01153_n8124XAFLINARTC, T01153_A8125XAFLINARTD, T01153_n8125XAFLINARTD, T01153_A8126XAFLININTC, T01153_n8126XAFLININTC, T01153_A8127XAFLINDIBC, T01153_n8127XAFLINDIBC, T01153_A8128XAFLINDIBD, T01153_n8128XAFLINDIBD,
            T01153_A8129XAFLINCOLC, T01153_n8129XAFLINCOLC, T01153_A8130XAFLINCOLD, T01153_n8130XAFLINCOLD, T01153_A8131XAFLINKGSE, T01153_n8131XAFLINKGSE, T01153_A8132XAFLINKGSS, T01153_n8132XAFLINKGSS, T01153_A8133XAFLINMER, T01153_n8133XAFLINMER,
            T01153_A8134XAFLINMTSS, T01153_n8134XAFLINMTSS, T01153_A8135XAFLINPREK, T01153_n8135XAFLINPREK, T01153_A8136XAFLINPREM, T01153_n8136XAFLINPREM, T01153_A8137XAFLINMOC, T01153_n8137XAFLINMOC, T01153_A8138XAFLINMAQC, T01153_n8138XAFLINMAQC,
            T01153_A8139XAFLININSC, T01153_n8139XAFLININSC, T01153_A8140XAFLINUSUG, T01153_n8140XAFLINUSUG, T01153_A8141XAFLINFCHG, T01153_n8141XAFLINFCHG, T01153_A8142XAFLINUSUL, T01153_n8142XAFLINUSUL, T01153_A8143XAFLINFCHL, T01153_n8143XAFLINFCHL,
            T01153_A8144XAFLINEST, T01153_n8144XAFLINEST, T01153_A8145XAFLINERR, T01153_n8145XAFLINERR, T01153_A8146XAFLINCCO, T01153_n8146XAFLINCCO, T01153_A8147XAFLINMTSE, T01153_n8147XAFLINMTSE, T01153_A8148XAFLINKGS, T01153_n8148XAFLINKGS,
            T01153_A8149XAFLINMTS, T01153_n8149XAFLINMTS, T01153_A8150XAFLINREFC, T01153_n8150XAFLINREFC, T01153_A8151XAFLINREFD, T01153_n8151XAFLINREFD, T01153_A8152XAFLINPRE, T01153_n8152XAFLINPRE, T01153_A8309XAFLINDTO, T01153_n8309XAFLINDTO,
            T01153_A8310XAFLINREC, T01153_n8310XAFLINREC, T01153_A12713XAFLINKGR, T01153_n12713XAFLINKGR
            }
            , new Object[] {
            T01154_A8103XAFALPCOD, T01154_A8104XAFTpo, T01154_n8104XAFTpo, T01154_A8105XAFCLI, T01154_n8105XAFCLI, T01154_A8106XAFFCH, T01154_n8106XAFFCH, T01154_A8107XAFVTO, T01154_n8107XAFVTO, T01154_A8108XAFFPG,
            T01154_n8108XAFFPG, T01154_A8109XAFVND, T01154_n8109XAFVND, T01154_A8110XAFOBS, T01154_n8110XAFOBS, T01154_A8111XAFDTOPZO, T01154_n8111XAFDTOPZO, T01154_A8112XAFDTOPRC, T01154_n8112XAFDTOPRC, T01154_A8113XAFUSUGEN,
            T01154_n8113XAFUSUGEN, T01154_A8114XAFFCHGEN, T01154_n8114XAFFCHGEN, T01154_A8115XAFUSULEE, T01154_n8115XAFUSULEE, T01154_A8116XAFFCHLEE, T01154_n8116XAFFCHLEE, T01154_A8117XAFEST, T01154_n8117XAFEST, T01154_A8118XAFERR,
            T01154_n8118XAFERR
            }
            , new Object[] {
            T01155_A8103XAFALPCOD, T01155_A8104XAFTpo, T01155_n8104XAFTpo, T01155_A8105XAFCLI, T01155_n8105XAFCLI, T01155_A8106XAFFCH, T01155_n8106XAFFCH, T01155_A8107XAFVTO, T01155_n8107XAFVTO, T01155_A8108XAFFPG,
            T01155_n8108XAFFPG, T01155_A8109XAFVND, T01155_n8109XAFVND, T01155_A8110XAFOBS, T01155_n8110XAFOBS, T01155_A8111XAFDTOPZO, T01155_n8111XAFDTOPZO, T01155_A8112XAFDTOPRC, T01155_n8112XAFDTOPRC, T01155_A8113XAFUSUGEN,
            T01155_n8113XAFUSUGEN, T01155_A8114XAFFCHGEN, T01155_n8114XAFFCHGEN, T01155_A8115XAFUSULEE, T01155_n8115XAFUSULEE, T01155_A8116XAFFCHLEE, T01155_n8116XAFFCHLEE, T01155_A8117XAFEST, T01155_n8117XAFEST, T01155_A8118XAFERR,
            T01155_n8118XAFERR
            }
            , new Object[] {
            T01156_A8103XAFALPCOD, T01156_A8104XAFTpo, T01156_n8104XAFTpo, T01156_A8105XAFCLI, T01156_n8105XAFCLI, T01156_A8106XAFFCH, T01156_n8106XAFFCH, T01156_A8107XAFVTO, T01156_n8107XAFVTO, T01156_A8108XAFFPG,
            T01156_n8108XAFFPG, T01156_A8109XAFVND, T01156_n8109XAFVND, T01156_A8110XAFOBS, T01156_n8110XAFOBS, T01156_A8111XAFDTOPZO, T01156_n8111XAFDTOPZO, T01156_A8112XAFDTOPRC, T01156_n8112XAFDTOPRC, T01156_A8113XAFUSUGEN,
            T01156_n8113XAFUSUGEN, T01156_A8114XAFFCHGEN, T01156_n8114XAFFCHGEN, T01156_A8115XAFUSULEE, T01156_n8115XAFUSULEE, T01156_A8116XAFFCHLEE, T01156_n8116XAFFCHLEE, T01156_A8117XAFEST, T01156_n8117XAFEST, T01156_A8118XAFERR,
            T01156_n8118XAFERR
            }
            , new Object[] {
            T01157_A8103XAFALPCOD
            }
            , new Object[] {
            T01158_A8103XAFALPCOD
            }
            , new Object[] {
            T01159_A8103XAFALPCOD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011513_A8103XAFALPCOD
            }
            , new Object[] {
            T011514_A8103XAFALPCOD, T011514_A8119XAFLIN, T011514_A8120XAFLINHDR, T011514_n8120XAFLINHDR, T011514_A8121XAFLINALR, T011514_n8121XAFLINALR, T011514_A8122XAFLINLOT, T011514_n8122XAFLINLOT, T011514_A8123XAFLINPZA, T011514_n8123XAFLINPZA,
            T011514_A8124XAFLINARTC, T011514_n8124XAFLINARTC, T011514_A8125XAFLINARTD, T011514_n8125XAFLINARTD, T011514_A8126XAFLININTC, T011514_n8126XAFLININTC, T011514_A8127XAFLINDIBC, T011514_n8127XAFLINDIBC, T011514_A8128XAFLINDIBD, T011514_n8128XAFLINDIBD,
            T011514_A8129XAFLINCOLC, T011514_n8129XAFLINCOLC, T011514_A8130XAFLINCOLD, T011514_n8130XAFLINCOLD, T011514_A8131XAFLINKGSE, T011514_n8131XAFLINKGSE, T011514_A8132XAFLINKGSS, T011514_n8132XAFLINKGSS, T011514_A8133XAFLINMER, T011514_n8133XAFLINMER,
            T011514_A8134XAFLINMTSS, T011514_n8134XAFLINMTSS, T011514_A8135XAFLINPREK, T011514_n8135XAFLINPREK, T011514_A8136XAFLINPREM, T011514_n8136XAFLINPREM, T011514_A8137XAFLINMOC, T011514_n8137XAFLINMOC, T011514_A8138XAFLINMAQC, T011514_n8138XAFLINMAQC,
            T011514_A8139XAFLININSC, T011514_n8139XAFLININSC, T011514_A8140XAFLINUSUG, T011514_n8140XAFLINUSUG, T011514_A8141XAFLINFCHG, T011514_n8141XAFLINFCHG, T011514_A8142XAFLINUSUL, T011514_n8142XAFLINUSUL, T011514_A8143XAFLINFCHL, T011514_n8143XAFLINFCHL,
            T011514_A8144XAFLINEST, T011514_n8144XAFLINEST, T011514_A8145XAFLINERR, T011514_n8145XAFLINERR, T011514_A8146XAFLINCCO, T011514_n8146XAFLINCCO, T011514_A8147XAFLINMTSE, T011514_n8147XAFLINMTSE, T011514_A8148XAFLINKGS, T011514_n8148XAFLINKGS,
            T011514_A8149XAFLINMTS, T011514_n8149XAFLINMTS, T011514_A8150XAFLINREFC, T011514_n8150XAFLINREFC, T011514_A8151XAFLINREFD, T011514_n8151XAFLINREFD, T011514_A8152XAFLINPRE, T011514_n8152XAFLINPRE, T011514_A8309XAFLINDTO, T011514_n8309XAFLINDTO,
            T011514_A8310XAFLINREC, T011514_n8310XAFLINREC, T011514_A12713XAFLINKGR, T011514_n12713XAFLINKGR
            }
            , new Object[] {
            T011515_A8103XAFALPCOD, T011515_A8119XAFLIN
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T011519_A8103XAFALPCOD, T011519_A8119XAFLIN
            }
         }
      );
      Z8103XAFALPCOD = 0 ;
      A8103XAFALPCOD = 0 ;
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
   private short Z8109XAFVND ;
   private short nRcdDeleted_1139 ;
   private short nRcdExists_1139 ;
   private short nIsMod_1139 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A8109XAFVND ;
   private short nBlankRcdCount1139 ;
   private short RcdFound1139 ;
   private short nBlankRcdUsr1139 ;
   private short RcdFound1138 ;
   private short nIsDirty_1138 ;
   private short nIsDirty_1139 ;
   private int Z8111XAFDTOPZO ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int Z8119XAFLIN ;
   private int Z8123XAFLINPZA ;
   private int Z8126XAFLININTC ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtXAFALPCOD_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtXAFTpo_Enabled ;
   private int edtXAFCLI_Enabled ;
   private int edtXAFFCH_Enabled ;
   private int edtXAFVTO_Enabled ;
   private int edtXAFFPG_Enabled ;
   private int edtXAFVND_Enabled ;
   private int edtXAFOBS_Enabled ;
   private int A8111XAFDTOPZO ;
   private int edtXAFDTOPZO_Enabled ;
   private int edtXAFDTOPRC_Enabled ;
   private int edtXAFUSUGEN_Enabled ;
   private int edtXAFFCHGEN_Enabled ;
   private int edtXAFUSULEE_Enabled ;
   private int edtXAFFCHLEE_Enabled ;
   private int edtXAFEST_Enabled ;
   private int edtXAFERR_Enabled ;
   private int edtavnRcdDeleted_1139_Enabled ;
   private int edtXAFLIN_Enabled ;
   private int edtXAFLINHDR_Enabled ;
   private int edtXAFLINALR_Enabled ;
   private int edtXAFLINLOT_Enabled ;
   private int edtXAFLINPZA_Enabled ;
   private int edtXAFLINARTC_Enabled ;
   private int edtXAFLINARTD_Enabled ;
   private int edtXAFLININTC_Enabled ;
   private int edtXAFLINDIBC_Enabled ;
   private int edtXAFLINDIBD_Enabled ;
   private int edtXAFLINCOLC_Enabled ;
   private int edtXAFLINCOLD_Enabled ;
   private int edtXAFLINKGSE_Enabled ;
   private int edtXAFLINKGSS_Enabled ;
   private int edtXAFLINMER_Enabled ;
   private int edtXAFLINMTSS_Enabled ;
   private int edtXAFLINPREK_Enabled ;
   private int edtXAFLINPREM_Enabled ;
   private int edtXAFLINMOC_Enabled ;
   private int edtXAFLINMAQC_Enabled ;
   private int edtXAFLININSC_Enabled ;
   private int edtXAFLINUSUG_Enabled ;
   private int edtXAFLINFCHG_Enabled ;
   private int edtXAFLINUSUL_Enabled ;
   private int edtXAFLINFCHL_Enabled ;
   private int edtXAFLINEST_Enabled ;
   private int edtXAFLINERR_Enabled ;
   private int edtXAFLINCCO_Enabled ;
   private int edtXAFLINMTSE_Enabled ;
   private int edtXAFLINKGS_Enabled ;
   private int edtXAFLINMTS_Enabled ;
   private int edtXAFLINREFC_Enabled ;
   private int edtXAFLINREFD_Enabled ;
   private int edtXAFLINPRE_Enabled ;
   private int edtXAFLINDTO_Enabled ;
   private int edtXAFLINREC_Enabled ;
   private int edtXAFLINKGR_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A8119XAFLIN ;
   private int A8123XAFLINPZA ;
   private int A8126XAFLININTC ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtXAFLIN_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtXAFERR_Backcolor ;
   private int edtXAFEST_Backcolor ;
   private int edtXAFFCHLEE_Backcolor ;
   private int edtXAFUSULEE_Backcolor ;
   private int edtXAFFCHGEN_Backcolor ;
   private int edtXAFUSUGEN_Backcolor ;
   private int edtXAFDTOPRC_Backcolor ;
   private int edtXAFDTOPZO_Backcolor ;
   private int edtXAFOBS_Backcolor ;
   private int edtXAFVND_Backcolor ;
   private int edtXAFFPG_Backcolor ;
   private int edtXAFVTO_Backcolor ;
   private int edtXAFFCH_Backcolor ;
   private int edtXAFCLI_Backcolor ;
   private int edtXAFTpo_Backcolor ;
   private int edtXAFALPCOD_Backcolor ;
   private long wcpOA8103XAFALPCOD ;
   private long Z8103XAFALPCOD ;
   private long A8103XAFALPCOD ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8112XAFDTOPRC ;
   private java.math.BigDecimal Z8131XAFLINKGSE ;
   private java.math.BigDecimal Z8132XAFLINKGSS ;
   private java.math.BigDecimal Z8133XAFLINMER ;
   private java.math.BigDecimal Z8134XAFLINMTSS ;
   private java.math.BigDecimal Z8135XAFLINPREK ;
   private java.math.BigDecimal Z8136XAFLINPREM ;
   private java.math.BigDecimal Z8137XAFLINMOC ;
   private java.math.BigDecimal Z8138XAFLINMAQC ;
   private java.math.BigDecimal Z8139XAFLININSC ;
   private java.math.BigDecimal Z8147XAFLINMTSE ;
   private java.math.BigDecimal Z8148XAFLINKGS ;
   private java.math.BigDecimal Z8149XAFLINMTS ;
   private java.math.BigDecimal Z8152XAFLINPRE ;
   private java.math.BigDecimal Z8309XAFLINDTO ;
   private java.math.BigDecimal Z8310XAFLINREC ;
   private java.math.BigDecimal Z12713XAFLINKGR ;
   private java.math.BigDecimal A8112XAFDTOPRC ;
   private java.math.BigDecimal A8131XAFLINKGSE ;
   private java.math.BigDecimal A8132XAFLINKGSS ;
   private java.math.BigDecimal A8133XAFLINMER ;
   private java.math.BigDecimal A8134XAFLINMTSS ;
   private java.math.BigDecimal A8135XAFLINPREK ;
   private java.math.BigDecimal A8136XAFLINPREM ;
   private java.math.BigDecimal A8137XAFLINMOC ;
   private java.math.BigDecimal A8138XAFLINMAQC ;
   private java.math.BigDecimal A8139XAFLININSC ;
   private java.math.BigDecimal A8147XAFLINMTSE ;
   private java.math.BigDecimal A8148XAFLINKGS ;
   private java.math.BigDecimal A8149XAFLINMTS ;
   private java.math.BigDecimal A8152XAFLINPRE ;
   private java.math.BigDecimal A8309XAFLINDTO ;
   private java.math.BigDecimal A8310XAFLINREC ;
   private java.math.BigDecimal A12713XAFLINKGR ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String Z8104XAFTpo ;
   private String Z8105XAFCLI ;
   private String Z8108XAFFPG ;
   private String Z8113XAFUSUGEN ;
   private String Z8115XAFUSULEE ;
   private String Z8117XAFEST ;
   private String Z8120XAFLINHDR ;
   private String Z8121XAFLINALR ;
   private String Z8122XAFLINLOT ;
   private String Z8124XAFLINARTC ;
   private String Z8125XAFLINARTD ;
   private String Z8127XAFLINDIBC ;
   private String Z8128XAFLINDIBD ;
   private String Z8129XAFLINCOLC ;
   private String Z8130XAFLINCOLD ;
   private String Z8140XAFLINUSUG ;
   private String Z8142XAFLINUSUL ;
   private String Z8144XAFLINEST ;
   private String Z8145XAFLINERR ;
   private String Z8146XAFLINCCO ;
   private String Z8150XAFLINREFC ;
   private String Z8151XAFLINREFD ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtXAFTpo_Internalname ;
   private String sGXsfl_100_idx="0001" ;
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
   private String edtXAFALPCOD_Internalname ;
   private String edtXAFALPCOD_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String A8104XAFTpo ;
   private String edtXAFTpo_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtXAFCLI_Internalname ;
   private String A8105XAFCLI ;
   private String edtXAFCLI_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtXAFFCH_Internalname ;
   private String edtXAFFCH_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtXAFVTO_Internalname ;
   private String edtXAFVTO_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtXAFFPG_Internalname ;
   private String A8108XAFFPG ;
   private String edtXAFFPG_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtXAFVND_Internalname ;
   private String edtXAFVND_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtXAFOBS_Internalname ;
   private String edtXAFOBS_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtXAFDTOPZO_Internalname ;
   private String edtXAFDTOPZO_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtXAFDTOPRC_Internalname ;
   private String edtXAFDTOPRC_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtXAFUSUGEN_Internalname ;
   private String A8113XAFUSUGEN ;
   private String edtXAFUSUGEN_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtXAFFCHGEN_Internalname ;
   private String edtXAFFCHGEN_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtXAFUSULEE_Internalname ;
   private String A8115XAFUSULEE ;
   private String edtXAFUSULEE_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtXAFFCHLEE_Internalname ;
   private String edtXAFFCHLEE_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtXAFEST_Internalname ;
   private String A8117XAFEST ;
   private String edtXAFEST_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtXAFERR_Internalname ;
   private String sMode1139 ;
   private String edtavnRcdDeleted_1139_Internalname ;
   private String edtXAFLIN_Internalname ;
   private String edtXAFLINHDR_Internalname ;
   private String edtXAFLINALR_Internalname ;
   private String edtXAFLINLOT_Internalname ;
   private String edtXAFLINPZA_Internalname ;
   private String edtXAFLINARTC_Internalname ;
   private String edtXAFLINARTD_Internalname ;
   private String edtXAFLININTC_Internalname ;
   private String edtXAFLINDIBC_Internalname ;
   private String edtXAFLINDIBD_Internalname ;
   private String edtXAFLINCOLC_Internalname ;
   private String edtXAFLINCOLD_Internalname ;
   private String edtXAFLINKGSE_Internalname ;
   private String edtXAFLINKGSS_Internalname ;
   private String edtXAFLINMER_Internalname ;
   private String edtXAFLINMTSS_Internalname ;
   private String edtXAFLINPREK_Internalname ;
   private String edtXAFLINPREM_Internalname ;
   private String edtXAFLINMOC_Internalname ;
   private String edtXAFLINMAQC_Internalname ;
   private String edtXAFLININSC_Internalname ;
   private String edtXAFLINUSUG_Internalname ;
   private String edtXAFLINFCHG_Internalname ;
   private String edtXAFLINUSUL_Internalname ;
   private String edtXAFLINFCHL_Internalname ;
   private String edtXAFLINEST_Internalname ;
   private String edtXAFLINERR_Internalname ;
   private String edtXAFLINCCO_Internalname ;
   private String edtXAFLINMTSE_Internalname ;
   private String edtXAFLINKGS_Internalname ;
   private String edtXAFLINMTS_Internalname ;
   private String edtXAFLINREFC_Internalname ;
   private String edtXAFLINREFD_Internalname ;
   private String edtXAFLINPRE_Internalname ;
   private String edtXAFLINDTO_Internalname ;
   private String edtXAFLINREC_Internalname ;
   private String edtXAFLINKGR_Internalname ;
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
   private String sMode1138 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A8120XAFLINHDR ;
   private String A8121XAFLINALR ;
   private String A8122XAFLINLOT ;
   private String A8124XAFLINARTC ;
   private String A8125XAFLINARTD ;
   private String A8127XAFLINDIBC ;
   private String A8128XAFLINDIBD ;
   private String A8129XAFLINCOLC ;
   private String A8130XAFLINCOLD ;
   private String A8140XAFLINUSUG ;
   private String A8142XAFLINUSUL ;
   private String A8144XAFLINEST ;
   private String A8145XAFLINERR ;
   private String A8146XAFLINCCO ;
   private String A8150XAFLINREFC ;
   private String A8151XAFLINREFD ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1139_Jsonclick ;
   private String edtXAFLIN_Jsonclick ;
   private String edtXAFLINHDR_Jsonclick ;
   private String edtXAFLINALR_Jsonclick ;
   private String edtXAFLINLOT_Jsonclick ;
   private String edtXAFLINPZA_Jsonclick ;
   private String edtXAFLINARTC_Jsonclick ;
   private String edtXAFLINARTD_Jsonclick ;
   private String edtXAFLININTC_Jsonclick ;
   private String edtXAFLINDIBC_Jsonclick ;
   private String edtXAFLINDIBD_Jsonclick ;
   private String edtXAFLINCOLC_Jsonclick ;
   private String edtXAFLINCOLD_Jsonclick ;
   private String edtXAFLINKGSE_Jsonclick ;
   private String edtXAFLINKGSS_Jsonclick ;
   private String edtXAFLINMER_Jsonclick ;
   private String edtXAFLINMTSS_Jsonclick ;
   private String edtXAFLINPREK_Jsonclick ;
   private String edtXAFLINPREM_Jsonclick ;
   private String edtXAFLINMOC_Jsonclick ;
   private String edtXAFLINMAQC_Jsonclick ;
   private String edtXAFLININSC_Jsonclick ;
   private String edtXAFLINUSUG_Jsonclick ;
   private String edtXAFLINFCHG_Jsonclick ;
   private String edtXAFLINUSUL_Jsonclick ;
   private String edtXAFLINFCHL_Jsonclick ;
   private String edtXAFLINEST_Jsonclick ;
   private String edtXAFLINERR_Jsonclick ;
   private String edtXAFLINCCO_Jsonclick ;
   private String edtXAFLINMTSE_Jsonclick ;
   private String edtXAFLINKGS_Jsonclick ;
   private String edtXAFLINMTS_Jsonclick ;
   private String edtXAFLINREFC_Jsonclick ;
   private String edtXAFLINREFD_Jsonclick ;
   private String edtXAFLINPRE_Jsonclick ;
   private String edtXAFLINDTO_Jsonclick ;
   private String edtXAFLINREC_Jsonclick ;
   private String edtXAFLINKGR_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private java.util.Date Z8106XAFFCH ;
   private java.util.Date Z8107XAFVTO ;
   private java.util.Date Z8114XAFFCHGEN ;
   private java.util.Date Z8116XAFFCHLEE ;
   private java.util.Date Z8141XAFLINFCHG ;
   private java.util.Date Z8143XAFLINFCHL ;
   private java.util.Date A8106XAFFCH ;
   private java.util.Date A8107XAFVTO ;
   private java.util.Date A8114XAFFCHGEN ;
   private java.util.Date A8116XAFFCHLEE ;
   private java.util.Date A8141XAFLINFCHG ;
   private java.util.Date A8143XAFLINFCHL ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean n8104XAFTpo ;
   private boolean n8105XAFCLI ;
   private boolean n8106XAFFCH ;
   private boolean n8107XAFVTO ;
   private boolean n8108XAFFPG ;
   private boolean n8109XAFVND ;
   private boolean n8110XAFOBS ;
   private boolean n8111XAFDTOPZO ;
   private boolean n8112XAFDTOPRC ;
   private boolean n8113XAFUSUGEN ;
   private boolean n8114XAFFCHGEN ;
   private boolean n8115XAFUSULEE ;
   private boolean n8116XAFFCHLEE ;
   private boolean n8117XAFEST ;
   private boolean n8118XAFERR ;
   private boolean Gx_longc ;
   private boolean n8120XAFLINHDR ;
   private boolean n8121XAFLINALR ;
   private boolean n8122XAFLINLOT ;
   private boolean n8123XAFLINPZA ;
   private boolean n8124XAFLINARTC ;
   private boolean n8125XAFLINARTD ;
   private boolean n8126XAFLININTC ;
   private boolean n8127XAFLINDIBC ;
   private boolean n8128XAFLINDIBD ;
   private boolean n8129XAFLINCOLC ;
   private boolean n8130XAFLINCOLD ;
   private boolean n8131XAFLINKGSE ;
   private boolean n8132XAFLINKGSS ;
   private boolean n8133XAFLINMER ;
   private boolean n8134XAFLINMTSS ;
   private boolean n8135XAFLINPREK ;
   private boolean n8136XAFLINPREM ;
   private boolean n8137XAFLINMOC ;
   private boolean n8138XAFLINMAQC ;
   private boolean n8139XAFLININSC ;
   private boolean n8140XAFLINUSUG ;
   private boolean n8141XAFLINFCHG ;
   private boolean n8142XAFLINUSUL ;
   private boolean n8143XAFLINFCHL ;
   private boolean n8144XAFLINEST ;
   private boolean n8145XAFLINERR ;
   private boolean n8146XAFLINCCO ;
   private boolean n8147XAFLINMTSE ;
   private boolean n8148XAFLINKGS ;
   private boolean n8149XAFLINMTS ;
   private boolean n8150XAFLINREFC ;
   private boolean n8151XAFLINREFD ;
   private boolean n8152XAFLINPRE ;
   private boolean n8309XAFLINDTO ;
   private boolean n8310XAFLINREC ;
   private boolean n12713XAFLINKGR ;
   private String Z8110XAFOBS ;
   private String Z8118XAFERR ;
   private String A8110XAFOBS ;
   private String A8118XAFERR ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private long[] T01156_A8103XAFALPCOD ;
   private String[] T01156_A8104XAFTpo ;
   private boolean[] T01156_n8104XAFTpo ;
   private String[] T01156_A8105XAFCLI ;
   private boolean[] T01156_n8105XAFCLI ;
   private java.util.Date[] T01156_A8106XAFFCH ;
   private boolean[] T01156_n8106XAFFCH ;
   private java.util.Date[] T01156_A8107XAFVTO ;
   private boolean[] T01156_n8107XAFVTO ;
   private String[] T01156_A8108XAFFPG ;
   private boolean[] T01156_n8108XAFFPG ;
   private short[] T01156_A8109XAFVND ;
   private boolean[] T01156_n8109XAFVND ;
   private String[] T01156_A8110XAFOBS ;
   private boolean[] T01156_n8110XAFOBS ;
   private int[] T01156_A8111XAFDTOPZO ;
   private boolean[] T01156_n8111XAFDTOPZO ;
   private java.math.BigDecimal[] T01156_A8112XAFDTOPRC ;
   private boolean[] T01156_n8112XAFDTOPRC ;
   private String[] T01156_A8113XAFUSUGEN ;
   private boolean[] T01156_n8113XAFUSUGEN ;
   private java.util.Date[] T01156_A8114XAFFCHGEN ;
   private boolean[] T01156_n8114XAFFCHGEN ;
   private String[] T01156_A8115XAFUSULEE ;
   private boolean[] T01156_n8115XAFUSULEE ;
   private java.util.Date[] T01156_A8116XAFFCHLEE ;
   private boolean[] T01156_n8116XAFFCHLEE ;
   private String[] T01156_A8117XAFEST ;
   private boolean[] T01156_n8117XAFEST ;
   private String[] T01156_A8118XAFERR ;
   private boolean[] T01156_n8118XAFERR ;
   private long[] T01157_A8103XAFALPCOD ;
   private long[] T01155_A8103XAFALPCOD ;
   private String[] T01155_A8104XAFTpo ;
   private boolean[] T01155_n8104XAFTpo ;
   private String[] T01155_A8105XAFCLI ;
   private boolean[] T01155_n8105XAFCLI ;
   private java.util.Date[] T01155_A8106XAFFCH ;
   private boolean[] T01155_n8106XAFFCH ;
   private java.util.Date[] T01155_A8107XAFVTO ;
   private boolean[] T01155_n8107XAFVTO ;
   private String[] T01155_A8108XAFFPG ;
   private boolean[] T01155_n8108XAFFPG ;
   private short[] T01155_A8109XAFVND ;
   private boolean[] T01155_n8109XAFVND ;
   private String[] T01155_A8110XAFOBS ;
   private boolean[] T01155_n8110XAFOBS ;
   private int[] T01155_A8111XAFDTOPZO ;
   private boolean[] T01155_n8111XAFDTOPZO ;
   private java.math.BigDecimal[] T01155_A8112XAFDTOPRC ;
   private boolean[] T01155_n8112XAFDTOPRC ;
   private String[] T01155_A8113XAFUSUGEN ;
   private boolean[] T01155_n8113XAFUSUGEN ;
   private java.util.Date[] T01155_A8114XAFFCHGEN ;
   private boolean[] T01155_n8114XAFFCHGEN ;
   private String[] T01155_A8115XAFUSULEE ;
   private boolean[] T01155_n8115XAFUSULEE ;
   private java.util.Date[] T01155_A8116XAFFCHLEE ;
   private boolean[] T01155_n8116XAFFCHLEE ;
   private String[] T01155_A8117XAFEST ;
   private boolean[] T01155_n8117XAFEST ;
   private String[] T01155_A8118XAFERR ;
   private boolean[] T01155_n8118XAFERR ;
   private long[] T01158_A8103XAFALPCOD ;
   private long[] T01159_A8103XAFALPCOD ;
   private long[] T01154_A8103XAFALPCOD ;
   private String[] T01154_A8104XAFTpo ;
   private boolean[] T01154_n8104XAFTpo ;
   private String[] T01154_A8105XAFCLI ;
   private boolean[] T01154_n8105XAFCLI ;
   private java.util.Date[] T01154_A8106XAFFCH ;
   private boolean[] T01154_n8106XAFFCH ;
   private java.util.Date[] T01154_A8107XAFVTO ;
   private boolean[] T01154_n8107XAFVTO ;
   private String[] T01154_A8108XAFFPG ;
   private boolean[] T01154_n8108XAFFPG ;
   private short[] T01154_A8109XAFVND ;
   private boolean[] T01154_n8109XAFVND ;
   private String[] T01154_A8110XAFOBS ;
   private boolean[] T01154_n8110XAFOBS ;
   private int[] T01154_A8111XAFDTOPZO ;
   private boolean[] T01154_n8111XAFDTOPZO ;
   private java.math.BigDecimal[] T01154_A8112XAFDTOPRC ;
   private boolean[] T01154_n8112XAFDTOPRC ;
   private String[] T01154_A8113XAFUSUGEN ;
   private boolean[] T01154_n8113XAFUSUGEN ;
   private java.util.Date[] T01154_A8114XAFFCHGEN ;
   private boolean[] T01154_n8114XAFFCHGEN ;
   private String[] T01154_A8115XAFUSULEE ;
   private boolean[] T01154_n8115XAFUSULEE ;
   private java.util.Date[] T01154_A8116XAFFCHLEE ;
   private boolean[] T01154_n8116XAFFCHLEE ;
   private String[] T01154_A8117XAFEST ;
   private boolean[] T01154_n8117XAFEST ;
   private String[] T01154_A8118XAFERR ;
   private boolean[] T01154_n8118XAFERR ;
   private long[] T011513_A8103XAFALPCOD ;
   private long[] T011514_A8103XAFALPCOD ;
   private int[] T011514_A8119XAFLIN ;
   private String[] T011514_A8120XAFLINHDR ;
   private boolean[] T011514_n8120XAFLINHDR ;
   private String[] T011514_A8121XAFLINALR ;
   private boolean[] T011514_n8121XAFLINALR ;
   private String[] T011514_A8122XAFLINLOT ;
   private boolean[] T011514_n8122XAFLINLOT ;
   private int[] T011514_A8123XAFLINPZA ;
   private boolean[] T011514_n8123XAFLINPZA ;
   private String[] T011514_A8124XAFLINARTC ;
   private boolean[] T011514_n8124XAFLINARTC ;
   private String[] T011514_A8125XAFLINARTD ;
   private boolean[] T011514_n8125XAFLINARTD ;
   private int[] T011514_A8126XAFLININTC ;
   private boolean[] T011514_n8126XAFLININTC ;
   private String[] T011514_A8127XAFLINDIBC ;
   private boolean[] T011514_n8127XAFLINDIBC ;
   private String[] T011514_A8128XAFLINDIBD ;
   private boolean[] T011514_n8128XAFLINDIBD ;
   private String[] T011514_A8129XAFLINCOLC ;
   private boolean[] T011514_n8129XAFLINCOLC ;
   private String[] T011514_A8130XAFLINCOLD ;
   private boolean[] T011514_n8130XAFLINCOLD ;
   private java.math.BigDecimal[] T011514_A8131XAFLINKGSE ;
   private boolean[] T011514_n8131XAFLINKGSE ;
   private java.math.BigDecimal[] T011514_A8132XAFLINKGSS ;
   private boolean[] T011514_n8132XAFLINKGSS ;
   private java.math.BigDecimal[] T011514_A8133XAFLINMER ;
   private boolean[] T011514_n8133XAFLINMER ;
   private java.math.BigDecimal[] T011514_A8134XAFLINMTSS ;
   private boolean[] T011514_n8134XAFLINMTSS ;
   private java.math.BigDecimal[] T011514_A8135XAFLINPREK ;
   private boolean[] T011514_n8135XAFLINPREK ;
   private java.math.BigDecimal[] T011514_A8136XAFLINPREM ;
   private boolean[] T011514_n8136XAFLINPREM ;
   private java.math.BigDecimal[] T011514_A8137XAFLINMOC ;
   private boolean[] T011514_n8137XAFLINMOC ;
   private java.math.BigDecimal[] T011514_A8138XAFLINMAQC ;
   private boolean[] T011514_n8138XAFLINMAQC ;
   private java.math.BigDecimal[] T011514_A8139XAFLININSC ;
   private boolean[] T011514_n8139XAFLININSC ;
   private String[] T011514_A8140XAFLINUSUG ;
   private boolean[] T011514_n8140XAFLINUSUG ;
   private java.util.Date[] T011514_A8141XAFLINFCHG ;
   private boolean[] T011514_n8141XAFLINFCHG ;
   private String[] T011514_A8142XAFLINUSUL ;
   private boolean[] T011514_n8142XAFLINUSUL ;
   private java.util.Date[] T011514_A8143XAFLINFCHL ;
   private boolean[] T011514_n8143XAFLINFCHL ;
   private String[] T011514_A8144XAFLINEST ;
   private boolean[] T011514_n8144XAFLINEST ;
   private String[] T011514_A8145XAFLINERR ;
   private boolean[] T011514_n8145XAFLINERR ;
   private String[] T011514_A8146XAFLINCCO ;
   private boolean[] T011514_n8146XAFLINCCO ;
   private java.math.BigDecimal[] T011514_A8147XAFLINMTSE ;
   private boolean[] T011514_n8147XAFLINMTSE ;
   private java.math.BigDecimal[] T011514_A8148XAFLINKGS ;
   private boolean[] T011514_n8148XAFLINKGS ;
   private java.math.BigDecimal[] T011514_A8149XAFLINMTS ;
   private boolean[] T011514_n8149XAFLINMTS ;
   private String[] T011514_A8150XAFLINREFC ;
   private boolean[] T011514_n8150XAFLINREFC ;
   private String[] T011514_A8151XAFLINREFD ;
   private boolean[] T011514_n8151XAFLINREFD ;
   private java.math.BigDecimal[] T011514_A8152XAFLINPRE ;
   private boolean[] T011514_n8152XAFLINPRE ;
   private java.math.BigDecimal[] T011514_A8309XAFLINDTO ;
   private boolean[] T011514_n8309XAFLINDTO ;
   private java.math.BigDecimal[] T011514_A8310XAFLINREC ;
   private boolean[] T011514_n8310XAFLINREC ;
   private java.math.BigDecimal[] T011514_A12713XAFLINKGR ;
   private boolean[] T011514_n12713XAFLINKGR ;
   private long[] T011515_A8103XAFALPCOD ;
   private int[] T011515_A8119XAFLIN ;
   private long[] T01153_A8103XAFALPCOD ;
   private int[] T01153_A8119XAFLIN ;
   private String[] T01153_A8120XAFLINHDR ;
   private boolean[] T01153_n8120XAFLINHDR ;
   private String[] T01153_A8121XAFLINALR ;
   private boolean[] T01153_n8121XAFLINALR ;
   private String[] T01153_A8122XAFLINLOT ;
   private boolean[] T01153_n8122XAFLINLOT ;
   private int[] T01153_A8123XAFLINPZA ;
   private boolean[] T01153_n8123XAFLINPZA ;
   private String[] T01153_A8124XAFLINARTC ;
   private boolean[] T01153_n8124XAFLINARTC ;
   private String[] T01153_A8125XAFLINARTD ;
   private boolean[] T01153_n8125XAFLINARTD ;
   private int[] T01153_A8126XAFLININTC ;
   private boolean[] T01153_n8126XAFLININTC ;
   private String[] T01153_A8127XAFLINDIBC ;
   private boolean[] T01153_n8127XAFLINDIBC ;
   private String[] T01153_A8128XAFLINDIBD ;
   private boolean[] T01153_n8128XAFLINDIBD ;
   private String[] T01153_A8129XAFLINCOLC ;
   private boolean[] T01153_n8129XAFLINCOLC ;
   private String[] T01153_A8130XAFLINCOLD ;
   private boolean[] T01153_n8130XAFLINCOLD ;
   private java.math.BigDecimal[] T01153_A8131XAFLINKGSE ;
   private boolean[] T01153_n8131XAFLINKGSE ;
   private java.math.BigDecimal[] T01153_A8132XAFLINKGSS ;
   private boolean[] T01153_n8132XAFLINKGSS ;
   private java.math.BigDecimal[] T01153_A8133XAFLINMER ;
   private boolean[] T01153_n8133XAFLINMER ;
   private java.math.BigDecimal[] T01153_A8134XAFLINMTSS ;
   private boolean[] T01153_n8134XAFLINMTSS ;
   private java.math.BigDecimal[] T01153_A8135XAFLINPREK ;
   private boolean[] T01153_n8135XAFLINPREK ;
   private java.math.BigDecimal[] T01153_A8136XAFLINPREM ;
   private boolean[] T01153_n8136XAFLINPREM ;
   private java.math.BigDecimal[] T01153_A8137XAFLINMOC ;
   private boolean[] T01153_n8137XAFLINMOC ;
   private java.math.BigDecimal[] T01153_A8138XAFLINMAQC ;
   private boolean[] T01153_n8138XAFLINMAQC ;
   private java.math.BigDecimal[] T01153_A8139XAFLININSC ;
   private boolean[] T01153_n8139XAFLININSC ;
   private String[] T01153_A8140XAFLINUSUG ;
   private boolean[] T01153_n8140XAFLINUSUG ;
   private java.util.Date[] T01153_A8141XAFLINFCHG ;
   private boolean[] T01153_n8141XAFLINFCHG ;
   private String[] T01153_A8142XAFLINUSUL ;
   private boolean[] T01153_n8142XAFLINUSUL ;
   private java.util.Date[] T01153_A8143XAFLINFCHL ;
   private boolean[] T01153_n8143XAFLINFCHL ;
   private String[] T01153_A8144XAFLINEST ;
   private boolean[] T01153_n8144XAFLINEST ;
   private String[] T01153_A8145XAFLINERR ;
   private boolean[] T01153_n8145XAFLINERR ;
   private String[] T01153_A8146XAFLINCCO ;
   private boolean[] T01153_n8146XAFLINCCO ;
   private java.math.BigDecimal[] T01153_A8147XAFLINMTSE ;
   private boolean[] T01153_n8147XAFLINMTSE ;
   private java.math.BigDecimal[] T01153_A8148XAFLINKGS ;
   private boolean[] T01153_n8148XAFLINKGS ;
   private java.math.BigDecimal[] T01153_A8149XAFLINMTS ;
   private boolean[] T01153_n8149XAFLINMTS ;
   private String[] T01153_A8150XAFLINREFC ;
   private boolean[] T01153_n8150XAFLINREFC ;
   private String[] T01153_A8151XAFLINREFD ;
   private boolean[] T01153_n8151XAFLINREFD ;
   private java.math.BigDecimal[] T01153_A8152XAFLINPRE ;
   private boolean[] T01153_n8152XAFLINPRE ;
   private java.math.BigDecimal[] T01153_A8309XAFLINDTO ;
   private boolean[] T01153_n8309XAFLINDTO ;
   private java.math.BigDecimal[] T01153_A8310XAFLINREC ;
   private boolean[] T01153_n8310XAFLINREC ;
   private java.math.BigDecimal[] T01153_A12713XAFLINKGR ;
   private boolean[] T01153_n12713XAFLINKGR ;
   private long[] T01152_A8103XAFALPCOD ;
   private int[] T01152_A8119XAFLIN ;
   private String[] T01152_A8120XAFLINHDR ;
   private boolean[] T01152_n8120XAFLINHDR ;
   private String[] T01152_A8121XAFLINALR ;
   private boolean[] T01152_n8121XAFLINALR ;
   private String[] T01152_A8122XAFLINLOT ;
   private boolean[] T01152_n8122XAFLINLOT ;
   private int[] T01152_A8123XAFLINPZA ;
   private boolean[] T01152_n8123XAFLINPZA ;
   private String[] T01152_A8124XAFLINARTC ;
   private boolean[] T01152_n8124XAFLINARTC ;
   private String[] T01152_A8125XAFLINARTD ;
   private boolean[] T01152_n8125XAFLINARTD ;
   private int[] T01152_A8126XAFLININTC ;
   private boolean[] T01152_n8126XAFLININTC ;
   private String[] T01152_A8127XAFLINDIBC ;
   private boolean[] T01152_n8127XAFLINDIBC ;
   private String[] T01152_A8128XAFLINDIBD ;
   private boolean[] T01152_n8128XAFLINDIBD ;
   private String[] T01152_A8129XAFLINCOLC ;
   private boolean[] T01152_n8129XAFLINCOLC ;
   private String[] T01152_A8130XAFLINCOLD ;
   private boolean[] T01152_n8130XAFLINCOLD ;
   private java.math.BigDecimal[] T01152_A8131XAFLINKGSE ;
   private boolean[] T01152_n8131XAFLINKGSE ;
   private java.math.BigDecimal[] T01152_A8132XAFLINKGSS ;
   private boolean[] T01152_n8132XAFLINKGSS ;
   private java.math.BigDecimal[] T01152_A8133XAFLINMER ;
   private boolean[] T01152_n8133XAFLINMER ;
   private java.math.BigDecimal[] T01152_A8134XAFLINMTSS ;
   private boolean[] T01152_n8134XAFLINMTSS ;
   private java.math.BigDecimal[] T01152_A8135XAFLINPREK ;
   private boolean[] T01152_n8135XAFLINPREK ;
   private java.math.BigDecimal[] T01152_A8136XAFLINPREM ;
   private boolean[] T01152_n8136XAFLINPREM ;
   private java.math.BigDecimal[] T01152_A8137XAFLINMOC ;
   private boolean[] T01152_n8137XAFLINMOC ;
   private java.math.BigDecimal[] T01152_A8138XAFLINMAQC ;
   private boolean[] T01152_n8138XAFLINMAQC ;
   private java.math.BigDecimal[] T01152_A8139XAFLININSC ;
   private boolean[] T01152_n8139XAFLININSC ;
   private String[] T01152_A8140XAFLINUSUG ;
   private boolean[] T01152_n8140XAFLINUSUG ;
   private java.util.Date[] T01152_A8141XAFLINFCHG ;
   private boolean[] T01152_n8141XAFLINFCHG ;
   private String[] T01152_A8142XAFLINUSUL ;
   private boolean[] T01152_n8142XAFLINUSUL ;
   private java.util.Date[] T01152_A8143XAFLINFCHL ;
   private boolean[] T01152_n8143XAFLINFCHL ;
   private String[] T01152_A8144XAFLINEST ;
   private boolean[] T01152_n8144XAFLINEST ;
   private String[] T01152_A8145XAFLINERR ;
   private boolean[] T01152_n8145XAFLINERR ;
   private String[] T01152_A8146XAFLINCCO ;
   private boolean[] T01152_n8146XAFLINCCO ;
   private java.math.BigDecimal[] T01152_A8147XAFLINMTSE ;
   private boolean[] T01152_n8147XAFLINMTSE ;
   private java.math.BigDecimal[] T01152_A8148XAFLINKGS ;
   private boolean[] T01152_n8148XAFLINKGS ;
   private java.math.BigDecimal[] T01152_A8149XAFLINMTS ;
   private boolean[] T01152_n8149XAFLINMTS ;
   private String[] T01152_A8150XAFLINREFC ;
   private boolean[] T01152_n8150XAFLINREFC ;
   private String[] T01152_A8151XAFLINREFD ;
   private boolean[] T01152_n8151XAFLINREFD ;
   private java.math.BigDecimal[] T01152_A8152XAFLINPRE ;
   private boolean[] T01152_n8152XAFLINPRE ;
   private java.math.BigDecimal[] T01152_A8309XAFLINDTO ;
   private boolean[] T01152_n8309XAFLINDTO ;
   private java.math.BigDecimal[] T01152_A8310XAFLINREC ;
   private boolean[] T01152_n8310XAFLINREC ;
   private java.math.BigDecimal[] T01152_A12713XAFLINKGR ;
   private boolean[] T01152_n12713XAFLINKGR ;
   private long[] T011519_A8103XAFALPCOD ;
   private int[] T011519_A8119XAFLIN ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class txaf__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txaf__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txaf__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class txaf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01152", "SELECT NRO_REMISION AS XAFALPCOD, LINEA, OP, ENTRADA, LOTE, PIEZAS, COD_ARTICULO, DSC_ARTICULO, INTENSIDAD, COD_DIBUJO, DSC_DIBUJO, COD_COLOR, DSC_COLOR, KILOS_ENTRADOS, KILOS_SALIDOS, MERMA, METROS_SALIDOS, PRECIO_KILO, PRECIO_METRO, COSTO_MO, COSTO_MAQUINA, COSTO_INSUMOS, USUARIO_GENERA AS XAFLINUSUG, FECHA_GENERA AS XAFLINFCHG, USUARIO_LEE AS XAFLINUSUL, FECHA_LEE AS XAFLINFCHL, ESTADO AS XAFLINEST, ERROR AS XAFLINERR, CENTRO_COSTO, METROS_ENTRADOS, KILOS_FACTURADOS, METROS_FACTURADOS, COD_REFERENCIA, DSC_REFERENCIA, PRECIO, DESCUENTO, RECARGO, KILOS_RECEPCION FROM TXPINT_REMISIONES_DET WHERE NRO_REMISION = ? AND LINEA = ?  FOR UPDATE OF OP, ENTRADA, LOTE, PIEZAS, COD_ARTICULO, DSC_ARTICULO, INTENSIDAD, COD_DIBUJO, DSC_DIBUJO, COD_COLOR, DSC_COLOR, KILOS_ENTRADOS, KILOS_SALIDOS, MERMA, METROS_SALIDOS, PRECIO_KILO, PRECIO_METRO, COSTO_MO, COSTO_MAQUINA, COSTO_INSUMOS, USUARIO_GENERA, FECHA_GENERA, USUARIO_LEE, FECHA_LEE, ESTADO, ERROR, CENTRO_COSTO, METROS_ENTRADOS, KILOS_FACTURADOS, METROS_FACTURADOS, COD_REFERENCIA, DSC_REFERENCIA, PRECIO, DESCUENTO, RECARGO, KILOS_RECEPCION NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01153", "SELECT NRO_REMISION AS XAFALPCOD, LINEA, OP, ENTRADA, LOTE, PIEZAS, COD_ARTICULO, DSC_ARTICULO, INTENSIDAD, COD_DIBUJO, DSC_DIBUJO, COD_COLOR, DSC_COLOR, KILOS_ENTRADOS, KILOS_SALIDOS, MERMA, METROS_SALIDOS, PRECIO_KILO, PRECIO_METRO, COSTO_MO, COSTO_MAQUINA, COSTO_INSUMOS, USUARIO_GENERA AS XAFLINUSUG, FECHA_GENERA AS XAFLINFCHG, USUARIO_LEE AS XAFLINUSUL, FECHA_LEE AS XAFLINFCHL, ESTADO AS XAFLINEST, ERROR AS XAFLINERR, CENTRO_COSTO, METROS_ENTRADOS, KILOS_FACTURADOS, METROS_FACTURADOS, COD_REFERENCIA, DSC_REFERENCIA, PRECIO, DESCUENTO, RECARGO, KILOS_RECEPCION FROM TXPINT_REMISIONES_DET WHERE NRO_REMISION = ? AND LINEA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01154", "SELECT NRO_REMISION AS XAFALPCOD, TIPO, CLIENTE, FECHA, FECHA_VENCIMIENTO, FORMA_DE_PAGO, VENDEDOR, OBSERVACIONES, DESCUENTO_PLAZO, DESCUENTO_PORCENTAJE, USUARIO_GENERA AS XAFUSUGEN, FECHA_GENERA AS XAFFCHGEN, USUARIO_LEE AS XAFUSULEE, FECHA_LEE AS XAFFCHLEE, ESTADO AS XAFEST, ERROR AS XAFERR FROM TXPINT_REMISIONES WHERE NRO_REMISION = ?  FOR UPDATE OF TIPO, CLIENTE, FECHA, FECHA_VENCIMIENTO, FORMA_DE_PAGO, VENDEDOR, OBSERVACIONES, DESCUENTO_PLAZO, DESCUENTO_PORCENTAJE, USUARIO_GENERA, FECHA_GENERA, USUARIO_LEE, FECHA_LEE, ESTADO, ERROR NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01155", "SELECT NRO_REMISION AS XAFALPCOD, TIPO, CLIENTE, FECHA, FECHA_VENCIMIENTO, FORMA_DE_PAGO, VENDEDOR, OBSERVACIONES, DESCUENTO_PLAZO, DESCUENTO_PORCENTAJE, USUARIO_GENERA AS XAFUSUGEN, FECHA_GENERA AS XAFFCHGEN, USUARIO_LEE AS XAFUSULEE, FECHA_LEE AS XAFFCHLEE, ESTADO AS XAFEST, ERROR AS XAFERR FROM TXPINT_REMISIONES WHERE NRO_REMISION = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01156", "SELECT /*+ FIRST_ROWS(1) */ TM1.NRO_REMISION AS XAFALPCOD, TM1.TIPO, TM1.CLIENTE, TM1.FECHA, TM1.FECHA_VENCIMIENTO, TM1.FORMA_DE_PAGO, TM1.VENDEDOR, TM1.OBSERVACIONES, TM1.DESCUENTO_PLAZO, TM1.DESCUENTO_PORCENTAJE, TM1.USUARIO_GENERA AS XAFUSUGEN, TM1.FECHA_GENERA AS XAFFCHGEN, TM1.USUARIO_LEE AS XAFUSULEE, TM1.FECHA_LEE AS XAFFCHLEE, TM1.ESTADO AS XAFEST, TM1.ERROR AS XAFERR FROM TXPINT_REMISIONES TM1 WHERE TM1.NRO_REMISION = ? ORDER BY TM1.NRO_REMISION ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01157", "SELECT /*+ FIRST_ROWS(1) */ NRO_REMISION AS XAFALPCOD FROM TXPINT_REMISIONES WHERE NRO_REMISION = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01158", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NRO_REMISION AS XAFALPCOD FROM TXPINT_REMISIONES WHERE NRO_REMISION = ? ORDER BY NRO_REMISION) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01159", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ NRO_REMISION AS XAFALPCOD FROM TXPINT_REMISIONES WHERE NRO_REMISION = ? ORDER BY NRO_REMISION DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T011510", "INSERT INTO TXPINT_REMISIONES(NRO_REMISION, TIPO, CLIENTE, FECHA, FECHA_VENCIMIENTO, FORMA_DE_PAGO, VENDEDOR, OBSERVACIONES, DESCUENTO_PLAZO, DESCUENTO_PORCENTAJE, USUARIO_GENERA, FECHA_GENERA, USUARIO_LEE, FECHA_LEE, ESTADO, ERROR) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINT_REMISIONES")
         ,new UpdateCursor("T011511", "UPDATE TXPINT_REMISIONES SET TIPO=?, CLIENTE=?, FECHA=?, FECHA_VENCIMIENTO=?, FORMA_DE_PAGO=?, VENDEDOR=?, OBSERVACIONES=?, DESCUENTO_PLAZO=?, DESCUENTO_PORCENTAJE=?, USUARIO_GENERA=?, FECHA_GENERA=?, USUARIO_LEE=?, FECHA_LEE=?, ESTADO=?, ERROR=?  WHERE NRO_REMISION = ?", GX_NOMASK, "TXPINT_REMISIONES")
         ,new UpdateCursor("T011512", "DELETE FROM TXPINT_REMISIONES  WHERE NRO_REMISION = ?", GX_NOMASK, "TXPINT_REMISIONES")
         ,new ForEachCursor("T011513", "SELECT /*+ FIRST_ROWS(100) */ NRO_REMISION AS XAFALPCOD FROM TXPINT_REMISIONES WHERE NRO_REMISION = ? ORDER BY NRO_REMISION ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T011514", "SELECT NRO_REMISION AS XAFALPCOD, LINEA, OP, ENTRADA, LOTE, PIEZAS, COD_ARTICULO, DSC_ARTICULO, INTENSIDAD, COD_DIBUJO, DSC_DIBUJO, COD_COLOR, DSC_COLOR, KILOS_ENTRADOS, KILOS_SALIDOS, MERMA, METROS_SALIDOS, PRECIO_KILO, PRECIO_METRO, COSTO_MO, COSTO_MAQUINA, COSTO_INSUMOS, USUARIO_GENERA AS XAFLINUSUG, FECHA_GENERA AS XAFLINFCHG, USUARIO_LEE AS XAFLINUSUL, FECHA_LEE AS XAFLINFCHL, ESTADO AS XAFLINEST, ERROR AS XAFLINERR, CENTRO_COSTO, METROS_ENTRADOS, KILOS_FACTURADOS, METROS_FACTURADOS, COD_REFERENCIA, DSC_REFERENCIA, PRECIO, DESCUENTO, RECARGO, KILOS_RECEPCION FROM TXPINT_REMISIONES_DET WHERE NRO_REMISION = ? and LINEA = ? ORDER BY NRO_REMISION, LINEA ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T011515", "SELECT NRO_REMISION AS XAFALPCOD, LINEA FROM TXPINT_REMISIONES_DET WHERE NRO_REMISION = ? AND LINEA = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T011516", "INSERT INTO TXPINT_REMISIONES_DET(NRO_REMISION, LINEA, OP, ENTRADA, LOTE, PIEZAS, COD_ARTICULO, DSC_ARTICULO, INTENSIDAD, COD_DIBUJO, DSC_DIBUJO, COD_COLOR, DSC_COLOR, KILOS_ENTRADOS, KILOS_SALIDOS, MERMA, METROS_SALIDOS, PRECIO_KILO, PRECIO_METRO, COSTO_MO, COSTO_MAQUINA, COSTO_INSUMOS, USUARIO_GENERA, FECHA_GENERA, USUARIO_LEE, FECHA_LEE, ESTADO, ERROR, CENTRO_COSTO, METROS_ENTRADOS, KILOS_FACTURADOS, METROS_FACTURADOS, COD_REFERENCIA, DSC_REFERENCIA, PRECIO, DESCUENTO, RECARGO, KILOS_RECEPCION) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPINT_REMISIONES_DET")
         ,new UpdateCursor("T011517", "UPDATE TXPINT_REMISIONES_DET SET OP=?, ENTRADA=?, LOTE=?, PIEZAS=?, COD_ARTICULO=?, DSC_ARTICULO=?, INTENSIDAD=?, COD_DIBUJO=?, DSC_DIBUJO=?, COD_COLOR=?, DSC_COLOR=?, KILOS_ENTRADOS=?, KILOS_SALIDOS=?, MERMA=?, METROS_SALIDOS=?, PRECIO_KILO=?, PRECIO_METRO=?, COSTO_MO=?, COSTO_MAQUINA=?, COSTO_INSUMOS=?, USUARIO_GENERA=?, FECHA_GENERA=?, USUARIO_LEE=?, FECHA_LEE=?, ESTADO=?, ERROR=?, CENTRO_COSTO=?, METROS_ENTRADOS=?, KILOS_FACTURADOS=?, METROS_FACTURADOS=?, COD_REFERENCIA=?, DSC_REFERENCIA=?, PRECIO=?, DESCUENTO=?, RECARGO=?, KILOS_RECEPCION=?  WHERE NRO_REMISION = ? AND LINEA = ?", GX_NOMASK, "TXPINT_REMISIONES_DET")
         ,new UpdateCursor("T011518", "DELETE FROM TXPINT_REMISIONES_DET  WHERE NRO_REMISION = ? AND LINEA = ?", GX_NOMASK, "TXPINT_REMISIONES_DET")
         ,new ForEachCursor("T011519", "SELECT NRO_REMISION AS XAFALPCOD, LINEA FROM TXPINT_REMISIONES_DET WHERE NRO_REMISION = ? ORDER BY NRO_REMISION, LINEA ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,3);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,3);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,3);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,3);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,3);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(22,3);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 2000);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 4);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(30,3);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(31,3);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(32,3);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(33, 16);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(34, 26);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(35,3);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(38,3);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,3);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,3);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,3);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,3);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,3);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(22,3);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 2000);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 4);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(30,3);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(31,3);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(32,3);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(33, 16);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(34, 26);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(35,3);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(38,3);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 11);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 11);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 11);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(17,3);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(18,3);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,3);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(20,3);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(21,3);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(22,3);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 10);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(28, 2000);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(29, 4);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(30,3);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(31,3);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(32,3);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((String[]) buf[62])[0] = rslt.getString(33, 16);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((String[]) buf[64])[0] = rslt.getString(34, 26);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[66])[0] = rslt.getBigDecimal(35,3);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[68])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[72])[0] = rslt.getBigDecimal(38,3);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 11);
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
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 13);
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
                  stmt.setString(11, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[22], false);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 10);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[26], false);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 2000);
               }
               return;
            case 9 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 11);
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
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 2);
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
                  stmt.setVarchar(7, (String)parms[13], 13);
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
                  stmt.setString(10, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
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
                  stmt.setVarchar(15, (String)parms[29], 2000);
               }
               stmt.setLong(16, ((Number) parms[30]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 10);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 16);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 26);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 16);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 30);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[21], 13);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 13);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[25], 3);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[27], 3);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[31], 3);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[37], 3);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[39], 3);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[41], 3);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[43], 10);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[45], false);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[47], 10);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[49], false);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[51], 1);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[53], 2000);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[55], 4);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[57], 3);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(31, (java.math.BigDecimal)parms[59], 3);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[61], 3);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[63], 16);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[65], 26);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[67], 3);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[73], 3);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 10);
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
                  stmt.setString(3, (String)parms[5], 10);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 26);
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 16);
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
                  stmt.setString(10, (String)parms[19], 13);
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
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[23], 3);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 3);
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
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 3);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 3);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 3);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 3);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 3);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 10);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 10);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[47], false);
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
                  stmt.setString(26, (String)parms[51], 2000);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 4);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[55], 3);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[57], 3);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(30, (java.math.BigDecimal)parms[59], 3);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 16);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[63], 26);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[65], 3);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[71], 3);
               }
               stmt.setLong(37, ((Number) parms[72]).longValue());
               stmt.setInt(38, ((Number) parms[73]).intValue());
               return;
            case 16 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

