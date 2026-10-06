package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdyecns_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consumos leidos de Orgatex", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOgHdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tdyecns_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdyecns_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdyecns_impl.class ));
   }

   public tdyecns_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDYECNS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Hdr", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A12387OgHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOgHdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12387OgHdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12387OgHdr), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgHdr_Jsonclick, 0, "", "", "", "", "", 1, edtOgHdr_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "R", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgR_Internalname, GXutil.ltrim( localUtil.ntoc( A12388OgR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOgR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12388OgR), "9") : localUtil.format( DecimalUtil.doubleToDec(A12388OgR), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgR_Jsonclick, 0, "", "", "", "", "", 1, edtOgR_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "P", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgP_Internalname, GXutil.rtrim( A12389OgP), GXutil.rtrim( localUtil.format( A12389OgP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgP_Jsonclick, 0, "", "", "", "", "", 1, edtOgP_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Redye", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgRedye_Internalname, GXutil.ltrim( localUtil.ntoc( A12390OgRedye, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOgRedye_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12390OgRedye), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12390OgRedye), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgRedye_Jsonclick, 0, "", "", "", "", "", 1, edtOgRedye_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Correction Number", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgCNumber_Internalname, GXutil.ltrim( localUtil.ntoc( A12391OgCNumber, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOgCNumber_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12391OgCNumber), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12391OgCNumber), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgCNumber_Jsonclick, 0, "", "", "", "", "", 1, edtOgCNumber_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "CallOff", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgCallOff_Internalname, GXutil.ltrim( localUtil.ntoc( A12392OgCallOff, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOgCallOff_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12392OgCallOff), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12392OgCallOff), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgCallOff_Jsonclick, 0, "", "", "", "", "", 1, edtOgCallOff_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Counter", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgCounter_Internalname, GXutil.ltrim( localUtil.ntoc( A12393OgCounter, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOgCounter_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12393OgCounter), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12393OgCounter), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgCounter_Jsonclick, 0, "", "", "", "", "", 1, edtOgCounter_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Product Code", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgPrdID_Internalname, GXutil.rtrim( A12382OgPrdID), GXutil.rtrim( localUtil.format( A12382OgPrdID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgPrdID_Jsonclick, 0, "", "", "", "", "", 1, edtOgPrdID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Product Name", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgPrdDc_Internalname, GXutil.rtrim( A12383OgPrdDc), GXutil.rtrim( localUtil.format( A12383OgPrdDc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgPrdDc_Jsonclick, 0, "", "", "", "", "", 1, edtOgPrdDc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Actual Amount", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgAAmount_Internalname, GXutil.ltrim( localUtil.ntoc( A12384OgAAmount, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOgAAmount_Enabled!=0) ? localUtil.format( A12384OgAAmount, "ZZZZZZ9.99999") : localUtil.format( A12384OgAAmount, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgAAmount_Jsonclick, 0, "", "", "", "", "", 1, edtOgAAmount_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Amount", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgAmount_Internalname, GXutil.ltrim( localUtil.ntoc( A12385OgAmount, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOgAmount_Enabled!=0) ? localUtil.format( A12385OgAmount, "ZZZZZZ9.99999") : localUtil.format( A12385OgAmount, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgAmount_Jsonclick, 0, "", "", "", "", "", 1, edtOgAmount_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Unit", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOgUnit_Internalname, GXutil.rtrim( A12386OgUnit), GXutil.rtrim( localUtil.format( A12386OgUnit, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOgUnit_Jsonclick, 0, "", "", "", "", "", 1, edtOgUnit_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDYECNS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDYECNS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TDYECNS.htm");
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
      e111KD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z12387OgHdr = (int)(localUtil.ctol( httpContext.cgiGet( "Z12387OgHdr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12388OgR = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12388OgR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12389OgP = httpContext.cgiGet( "Z12389OgP") ;
            Z12390OgRedye = (int)(localUtil.ctol( httpContext.cgiGet( "Z12390OgRedye"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12391OgCNumber = (int)(localUtil.ctol( httpContext.cgiGet( "Z12391OgCNumber"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12392OgCallOff = (int)(localUtil.ctol( httpContext.cgiGet( "Z12392OgCallOff"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12393OgCounter = (int)(localUtil.ctol( httpContext.cgiGet( "Z12393OgCounter"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12382OgPrdID = httpContext.cgiGet( "Z12382OgPrdID") ;
            Z12383OgPrdDc = httpContext.cgiGet( "Z12383OgPrdDc") ;
            Z12384OgAAmount = localUtil.ctond( httpContext.cgiGet( "Z12384OgAAmount")) ;
            Z12385OgAmount = localUtil.ctond( httpContext.cgiGet( "Z12385OgAmount")) ;
            Z12386OgUnit = httpContext.cgiGet( "Z12386OgUnit") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOgHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOgHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGHDR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOgHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12387OgHdr = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
            }
            else
            {
               A12387OgHdr = (int)(localUtil.ctol( httpContext.cgiGet( edtOgHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOgR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOgR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOgR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12388OgR = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
            }
            else
            {
               A12388OgR = (byte)(localUtil.ctol( httpContext.cgiGet( edtOgR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
            }
            A12389OgP = httpContext.cgiGet( edtOgP_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOgRedye_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOgRedye_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGREDYE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOgRedye_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12390OgRedye = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
            }
            else
            {
               A12390OgRedye = (int)(localUtil.ctol( httpContext.cgiGet( edtOgRedye_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOgCNumber_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOgCNumber_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGCNUMBER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOgCNumber_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12391OgCNumber = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
            }
            else
            {
               A12391OgCNumber = (int)(localUtil.ctol( httpContext.cgiGet( edtOgCNumber_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOgCallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOgCallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGCALLOFF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOgCallOff_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12392OgCallOff = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
            }
            else
            {
               A12392OgCallOff = (int)(localUtil.ctol( httpContext.cgiGet( edtOgCallOff_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOgCounter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOgCounter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGCOUNTER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOgCounter_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12393OgCounter = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
            }
            else
            {
               A12393OgCounter = (int)(localUtil.ctol( httpContext.cgiGet( edtOgCounter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
            }
            A12382OgPrdID = httpContext.cgiGet( edtOgPrdID_Internalname) ;
            n12382OgPrdID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12382OgPrdID", A12382OgPrdID);
            A12383OgPrdDc = httpContext.cgiGet( edtOgPrdDc_Internalname) ;
            n12383OgPrdDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12383OgPrdDc", A12383OgPrdDc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOgAAmount_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOgAAmount_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGAAMOUNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOgAAmount_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12384OgAAmount = DecimalUtil.ZERO ;
               n12384OgAAmount = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12384OgAAmount", GXutil.ltrimstr( A12384OgAAmount, 13, 5));
            }
            else
            {
               A12384OgAAmount = localUtil.ctond( httpContext.cgiGet( edtOgAAmount_Internalname)) ;
               n12384OgAAmount = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12384OgAAmount", GXutil.ltrimstr( A12384OgAAmount, 13, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOgAmount_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOgAmount_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OGAMOUNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOgAmount_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12385OgAmount = DecimalUtil.ZERO ;
               n12385OgAmount = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12385OgAmount", GXutil.ltrimstr( A12385OgAmount, 13, 5));
            }
            else
            {
               A12385OgAmount = localUtil.ctond( httpContext.cgiGet( edtOgAmount_Internalname)) ;
               n12385OgAmount = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12385OgAmount", GXutil.ltrimstr( A12385OgAmount, 13, 5));
            }
            A12386OgUnit = httpContext.cgiGet( edtOgUnit_Internalname) ;
            n12386OgUnit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12386OgUnit", A12386OgUnit);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               A12387OgHdr = (int)(GXutil.lval( httpContext.GetPar( "OgHdr"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
               A12388OgR = (byte)(GXutil.lval( httpContext.GetPar( "OgR"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
               A12389OgP = httpContext.GetPar( "OgP") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
               A12390OgRedye = (int)(GXutil.lval( httpContext.GetPar( "OgRedye"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
               A12391OgCNumber = (int)(GXutil.lval( httpContext.GetPar( "OgCNumber"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
               A12392OgCallOff = (int)(GXutil.lval( httpContext.GetPar( "OgCallOff"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
               A12393OgCounter = (int)(GXutil.lval( httpContext.GetPar( "OgCounter"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
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
                        e111KD2 ();
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
            initAll1KD1718( ) ;
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
      disableAttributes1KD1718( ) ;
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

   public void confirm_1KD0( )
   {
      beforeValidate1KD1718( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KD1718( ) ;
         }
         else
         {
            checkExtendedTable1KD1718( ) ;
            if ( AnyError == 0 )
            {
               zm1KD1718( 2) ;
            }
            closeExtendedTableCursors1KD1718( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValues1KD0( ) ;
      }
   }

   public void resetCaption1KD0( )
   {
   }

   public void e111KD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tdyecns_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tdyecns_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tdyecns_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdyecns_impl.this.A396EmprCod = GXv_char2[0] ;
      tdyecns_impl.this.AV11EmprNom = GXv_char3[0] ;
      tdyecns_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1KD1718( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12382OgPrdID = T01KD3_A12382OgPrdID[0] ;
            Z12383OgPrdDc = T01KD3_A12383OgPrdDc[0] ;
            Z12384OgAAmount = T01KD3_A12384OgAAmount[0] ;
            Z12385OgAmount = T01KD3_A12385OgAmount[0] ;
            Z12386OgUnit = T01KD3_A12386OgUnit[0] ;
         }
         else
         {
            Z12382OgPrdID = A12382OgPrdID ;
            Z12383OgPrdDc = A12383OgPrdDc ;
            Z12384OgAAmount = A12384OgAAmount ;
            Z12385OgAmount = A12385OgAmount ;
            Z12386OgUnit = A12386OgUnit ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12387OgHdr = A12387OgHdr ;
         Z12388OgR = A12388OgR ;
         Z12389OgP = A12389OgP ;
         Z12390OgRedye = A12390OgRedye ;
         Z12391OgCNumber = A12391OgCNumber ;
         Z12392OgCallOff = A12392OgCallOff ;
         Z12393OgCounter = A12393OgCounter ;
         Z12382OgPrdID = A12382OgPrdID ;
         Z12383OgPrdDc = A12383OgPrdDc ;
         Z12384OgAAmount = A12384OgAAmount ;
         Z12385OgAmount = A12385OgAmount ;
         Z12386OgUnit = A12386OgUnit ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TDYECNS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01KD4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KD4_A407EmprNom[0] ;
      n407EmprNom = T01KD4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
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

   public void load1KD1718( )
   {
      /* Using cursor T01KD5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), A12389OgP, Integer.valueOf(A12390OgRedye), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12393OgCounter)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound1718 = (short)(1) ;
         A407EmprNom = T01KD5_A407EmprNom[0] ;
         n407EmprNom = T01KD5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12382OgPrdID = T01KD5_A12382OgPrdID[0] ;
         n12382OgPrdID = T01KD5_n12382OgPrdID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12382OgPrdID", A12382OgPrdID);
         A12383OgPrdDc = T01KD5_A12383OgPrdDc[0] ;
         n12383OgPrdDc = T01KD5_n12383OgPrdDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12383OgPrdDc", A12383OgPrdDc);
         A12384OgAAmount = T01KD5_A12384OgAAmount[0] ;
         n12384OgAAmount = T01KD5_n12384OgAAmount[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12384OgAAmount", GXutil.ltrimstr( A12384OgAAmount, 13, 5));
         A12385OgAmount = T01KD5_A12385OgAmount[0] ;
         n12385OgAmount = T01KD5_n12385OgAmount[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12385OgAmount", GXutil.ltrimstr( A12385OgAmount, 13, 5));
         A12386OgUnit = T01KD5_A12386OgUnit[0] ;
         n12386OgUnit = T01KD5_n12386OgUnit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12386OgUnit", A12386OgUnit);
         zm1KD1718( -1) ;
      }
      pr_default.close(3);
      onLoadActions1KD1718( ) ;
   }

   public void onLoadActions1KD1718( )
   {
   }

   public void checkExtendedTable1KD1718( )
   {
      nIsDirty_1718 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KD1718( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KD1718( )
   {
      /* Using cursor T01KD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), A12389OgP, Integer.valueOf(A12390OgRedye), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12393OgCounter)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1718 = (short)(1) ;
      }
      else
      {
         RcdFound1718 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), A12389OgP, Integer.valueOf(A12390OgRedye), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12393OgCounter)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01KD3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KD1718( 1) ;
         RcdFound1718 = (short)(1) ;
         A12387OgHdr = T01KD3_A12387OgHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
         A12388OgR = T01KD3_A12388OgR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
         A12389OgP = T01KD3_A12389OgP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
         A12390OgRedye = T01KD3_A12390OgRedye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
         A12391OgCNumber = T01KD3_A12391OgCNumber[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
         A12392OgCallOff = T01KD3_A12392OgCallOff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
         A12393OgCounter = T01KD3_A12393OgCounter[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
         A12382OgPrdID = T01KD3_A12382OgPrdID[0] ;
         n12382OgPrdID = T01KD3_n12382OgPrdID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12382OgPrdID", A12382OgPrdID);
         A12383OgPrdDc = T01KD3_A12383OgPrdDc[0] ;
         n12383OgPrdDc = T01KD3_n12383OgPrdDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12383OgPrdDc", A12383OgPrdDc);
         A12384OgAAmount = T01KD3_A12384OgAAmount[0] ;
         n12384OgAAmount = T01KD3_n12384OgAAmount[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12384OgAAmount", GXutil.ltrimstr( A12384OgAAmount, 13, 5));
         A12385OgAmount = T01KD3_A12385OgAmount[0] ;
         n12385OgAmount = T01KD3_n12385OgAmount[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12385OgAmount", GXutil.ltrimstr( A12385OgAmount, 13, 5));
         A12386OgUnit = T01KD3_A12386OgUnit[0] ;
         n12386OgUnit = T01KD3_n12386OgUnit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12386OgUnit", A12386OgUnit);
         Z396EmprCod = A396EmprCod ;
         Z12387OgHdr = A12387OgHdr ;
         Z12388OgR = A12388OgR ;
         Z12389OgP = A12389OgP ;
         Z12390OgRedye = A12390OgRedye ;
         Z12391OgCNumber = A12391OgCNumber ;
         Z12392OgCallOff = A12392OgCallOff ;
         Z12393OgCounter = A12393OgCounter ;
         sMode1718 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1KD1718( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1718 = (short)(0) ;
            initializeNonKey1KD1718( ) ;
         }
         Gx_mode = sMode1718 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1718 = (short)(0) ;
         initializeNonKey1KD1718( ) ;
         sMode1718 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1718 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1KD1718( ) ;
      if ( RcdFound1718 == 0 )
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
      RcdFound1718 = (short)(0) ;
      /* Using cursor T01KD7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(A12387OgHdr), Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), A12389OgP, A12389OgP, Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), Integer.valueOf(A12390OgRedye), Integer.valueOf(A12390OgRedye), A12389OgP, Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12390OgRedye), A12389OgP, Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12390OgRedye), A12389OgP, Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), Integer.valueOf(A12393OgCounter), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T01KD7_A12387OgHdr[0] < A12387OgHdr ) || ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12388OgR[0] < A12388OgR ) || ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) < 0 ) || ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12390OgRedye[0] < A12390OgRedye ) || ( T01KD7_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12391OgCNumber[0] < A12391OgCNumber ) || ( T01KD7_A12391OgCNumber[0] == A12391OgCNumber ) && ( T01KD7_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12392OgCallOff[0] < A12392OgCallOff ) || ( T01KD7_A12392OgCallOff[0] == A12392OgCallOff ) && ( T01KD7_A12391OgCNumber[0] == A12391OgCNumber ) && ( T01KD7_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12393OgCounter[0] < A12393OgCounter ) ) && ( GXutil.strcmp(T01KD7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T01KD7_A12387OgHdr[0] > A12387OgHdr ) || ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12388OgR[0] > A12388OgR ) || ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) > 0 ) || ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12390OgRedye[0] > A12390OgRedye ) || ( T01KD7_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12391OgCNumber[0] > A12391OgCNumber ) || ( T01KD7_A12391OgCNumber[0] == A12391OgCNumber ) && ( T01KD7_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12392OgCallOff[0] > A12392OgCallOff ) || ( T01KD7_A12392OgCallOff[0] == A12392OgCallOff ) && ( T01KD7_A12391OgCNumber[0] == A12391OgCNumber ) && ( T01KD7_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD7_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD7_A12388OgR[0] == A12388OgR ) && ( T01KD7_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD7_A12393OgCounter[0] > A12393OgCounter ) ) && ( GXutil.strcmp(T01KD7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A12387OgHdr = T01KD7_A12387OgHdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
            A12388OgR = T01KD7_A12388OgR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
            A12389OgP = T01KD7_A12389OgP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
            A12390OgRedye = T01KD7_A12390OgRedye[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
            A12391OgCNumber = T01KD7_A12391OgCNumber[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
            A12392OgCallOff = T01KD7_A12392OgCallOff[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
            A12393OgCounter = T01KD7_A12393OgCounter[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
            RcdFound1718 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound1718 = (short)(0) ;
      /* Using cursor T01KD8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(A12387OgHdr), Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), A12389OgP, A12389OgP, Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), Integer.valueOf(A12390OgRedye), Integer.valueOf(A12390OgRedye), A12389OgP, Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12390OgRedye), A12389OgP, Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12390OgRedye), A12389OgP, Byte.valueOf(A12388OgR), Integer.valueOf(A12387OgHdr), Integer.valueOf(A12393OgCounter), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T01KD8_A12387OgHdr[0] > A12387OgHdr ) || ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12388OgR[0] > A12388OgR ) || ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) > 0 ) || ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12390OgRedye[0] > A12390OgRedye ) || ( T01KD8_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12391OgCNumber[0] > A12391OgCNumber ) || ( T01KD8_A12391OgCNumber[0] == A12391OgCNumber ) && ( T01KD8_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12392OgCallOff[0] > A12392OgCallOff ) || ( T01KD8_A12392OgCallOff[0] == A12392OgCallOff ) && ( T01KD8_A12391OgCNumber[0] == A12391OgCNumber ) && ( T01KD8_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12393OgCounter[0] > A12393OgCounter ) ) && ( GXutil.strcmp(T01KD8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T01KD8_A12387OgHdr[0] < A12387OgHdr ) || ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12388OgR[0] < A12388OgR ) || ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) < 0 ) || ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12390OgRedye[0] < A12390OgRedye ) || ( T01KD8_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12391OgCNumber[0] < A12391OgCNumber ) || ( T01KD8_A12391OgCNumber[0] == A12391OgCNumber ) && ( T01KD8_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12392OgCallOff[0] < A12392OgCallOff ) || ( T01KD8_A12392OgCallOff[0] == A12392OgCallOff ) && ( T01KD8_A12391OgCNumber[0] == A12391OgCNumber ) && ( T01KD8_A12390OgRedye[0] == A12390OgRedye ) && ( GXutil.strcmp(T01KD8_A12389OgP[0], A12389OgP) == 0 ) && ( T01KD8_A12388OgR[0] == A12388OgR ) && ( T01KD8_A12387OgHdr[0] == A12387OgHdr ) && ( T01KD8_A12393OgCounter[0] < A12393OgCounter ) ) && ( GXutil.strcmp(T01KD8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A12387OgHdr = T01KD8_A12387OgHdr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
            A12388OgR = T01KD8_A12388OgR[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
            A12389OgP = T01KD8_A12389OgP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
            A12390OgRedye = T01KD8_A12390OgRedye[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
            A12391OgCNumber = T01KD8_A12391OgCNumber[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
            A12392OgCallOff = T01KD8_A12392OgCallOff[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
            A12393OgCounter = T01KD8_A12393OgCounter[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
            RcdFound1718 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KD1718( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOgHdr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1KD1718( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1718 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12387OgHdr != Z12387OgHdr ) || ( A12388OgR != Z12388OgR ) || ( GXutil.strcmp(A12389OgP, Z12389OgP) != 0 ) || ( A12390OgRedye != Z12390OgRedye ) || ( A12391OgCNumber != Z12391OgCNumber ) || ( A12392OgCallOff != Z12392OgCallOff ) || ( A12393OgCounter != Z12393OgCounter ) )
            {
               A12387OgHdr = Z12387OgHdr ;
               httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
               A12388OgR = Z12388OgR ;
               httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
               A12389OgP = Z12389OgP ;
               httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
               A12390OgRedye = Z12390OgRedye ;
               httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
               A12391OgCNumber = Z12391OgCNumber ;
               httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
               A12392OgCallOff = Z12392OgCallOff ;
               httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
               A12393OgCounter = Z12393OgCounter ;
               httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOgHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1KD1718( ) ;
               GX_FocusControl = edtOgHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12387OgHdr != Z12387OgHdr ) || ( A12388OgR != Z12388OgR ) || ( GXutil.strcmp(A12389OgP, Z12389OgP) != 0 ) || ( A12390OgRedye != Z12390OgRedye ) || ( A12391OgCNumber != Z12391OgCNumber ) || ( A12392OgCallOff != Z12392OgCallOff ) || ( A12393OgCounter != Z12393OgCounter ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtOgHdr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1KD1718( ) ;
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
                  GX_FocusControl = edtOgHdr_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1KD1718( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12387OgHdr != Z12387OgHdr ) || ( A12388OgR != Z12388OgR ) || ( GXutil.strcmp(A12389OgP, Z12389OgP) != 0 ) || ( A12390OgRedye != Z12390OgRedye ) || ( A12391OgCNumber != Z12391OgCNumber ) || ( A12392OgCallOff != Z12392OgCallOff ) || ( A12393OgCounter != Z12393OgCounter ) )
      {
         A12387OgHdr = Z12387OgHdr ;
         httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
         A12388OgR = Z12388OgR ;
         httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
         A12389OgP = Z12389OgP ;
         httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
         A12390OgRedye = Z12390OgRedye ;
         httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
         A12391OgCNumber = Z12391OgCNumber ;
         httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
         A12392OgCallOff = Z12392OgCallOff ;
         httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
         A12393OgCounter = Z12393OgCounter ;
         httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOgHdr_Internalname ;
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
      getKey1KD1718( ) ;
      if ( RcdFound1718 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12387OgHdr != Z12387OgHdr ) || ( A12388OgR != Z12388OgR ) || ( GXutil.strcmp(A12389OgP, Z12389OgP) != 0 ) || ( A12390OgRedye != Z12390OgRedye ) || ( A12391OgCNumber != Z12391OgCNumber ) || ( A12392OgCallOff != Z12392OgCallOff ) || ( A12393OgCounter != Z12393OgCounter ) )
         {
            A12387OgHdr = Z12387OgHdr ;
            httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
            A12388OgR = Z12388OgR ;
            httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
            A12389OgP = Z12389OgP ;
            httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
            A12390OgRedye = Z12390OgRedye ;
            httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
            A12391OgCNumber = Z12391OgCNumber ;
            httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
            A12392OgCallOff = Z12392OgCallOff ;
            httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
            A12393OgCounter = Z12393OgCounter ;
            httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A12387OgHdr != Z12387OgHdr ) || ( A12388OgR != Z12388OgR ) || ( GXutil.strcmp(A12389OgP, Z12389OgP) != 0 ) || ( A12390OgRedye != Z12390OgRedye ) || ( A12391OgCNumber != Z12391OgCNumber ) || ( A12392OgCallOff != Z12392OgCallOff ) || ( A12393OgCounter != Z12393OgCounter ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tdyecns");
      GX_FocusControl = edtOgPrdID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1KD0( ) ;
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
      if ( RcdFound1718 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtOgPrdID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1KD1718( ) ;
      if ( RcdFound1718 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtOgPrdID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KD1718( ) ;
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
      if ( RcdFound1718 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtOgPrdID_Internalname ;
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
      if ( RcdFound1718 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtOgPrdID_Internalname ;
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
      scanStart1KD1718( ) ;
      if ( RcdFound1718 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1718 != 0 )
         {
            scanNext1KD1718( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtOgPrdID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1KD1718( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1KD1718( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), A12389OgP, Integer.valueOf(A12390OgRedye), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12393OgCounter)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDYECNS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z12382OgPrdID, T01KD2_A12382OgPrdID[0]) != 0 ) || ( GXutil.strcmp(Z12383OgPrdDc, T01KD2_A12383OgPrdDc[0]) != 0 ) || ( DecimalUtil.compareTo(Z12384OgAAmount, T01KD2_A12384OgAAmount[0]) != 0 ) || ( DecimalUtil.compareTo(Z12385OgAmount, T01KD2_A12385OgAmount[0]) != 0 ) || ( GXutil.strcmp(Z12386OgUnit, T01KD2_A12386OgUnit[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12382OgPrdID, T01KD2_A12382OgPrdID[0]) != 0 )
            {
               GXutil.writeLogln("tdyecns:[seudo value changed for attri]"+"OgPrdID");
               GXutil.writeLogRaw("Old: ",Z12382OgPrdID);
               GXutil.writeLogRaw("Current: ",T01KD2_A12382OgPrdID[0]);
            }
            if ( GXutil.strcmp(Z12383OgPrdDc, T01KD2_A12383OgPrdDc[0]) != 0 )
            {
               GXutil.writeLogln("tdyecns:[seudo value changed for attri]"+"OgPrdDc");
               GXutil.writeLogRaw("Old: ",Z12383OgPrdDc);
               GXutil.writeLogRaw("Current: ",T01KD2_A12383OgPrdDc[0]);
            }
            if ( DecimalUtil.compareTo(Z12384OgAAmount, T01KD2_A12384OgAAmount[0]) != 0 )
            {
               GXutil.writeLogln("tdyecns:[seudo value changed for attri]"+"OgAAmount");
               GXutil.writeLogRaw("Old: ",Z12384OgAAmount);
               GXutil.writeLogRaw("Current: ",T01KD2_A12384OgAAmount[0]);
            }
            if ( DecimalUtil.compareTo(Z12385OgAmount, T01KD2_A12385OgAmount[0]) != 0 )
            {
               GXutil.writeLogln("tdyecns:[seudo value changed for attri]"+"OgAmount");
               GXutil.writeLogRaw("Old: ",Z12385OgAmount);
               GXutil.writeLogRaw("Current: ",T01KD2_A12385OgAmount[0]);
            }
            if ( GXutil.strcmp(Z12386OgUnit, T01KD2_A12386OgUnit[0]) != 0 )
            {
               GXutil.writeLogln("tdyecns:[seudo value changed for attri]"+"OgUnit");
               GXutil.writeLogRaw("Old: ",Z12386OgUnit);
               GXutil.writeLogRaw("Current: ",T01KD2_A12386OgUnit[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDYECNS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KD1718( )
   {
      beforeValidate1KD1718( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KD1718( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KD1718( 0) ;
         checkOptimisticConcurrency1KD1718( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KD1718( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KD1718( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KD9 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), A12389OgP, Integer.valueOf(A12390OgRedye), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12393OgCounter), Boolean.valueOf(n12382OgPrdID), A12382OgPrdID, Boolean.valueOf(n12383OgPrdDc), A12383OgPrdDc, Boolean.valueOf(n12384OgAAmount), A12384OgAAmount, Boolean.valueOf(n12385OgAmount), A12385OgAmount, Boolean.valueOf(n12386OgUnit), A12386OgUnit, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYECNS");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1KD0( ) ;
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
            load1KD1718( ) ;
         }
         endLevel1KD1718( ) ;
      }
      closeExtendedTableCursors1KD1718( ) ;
   }

   public void update1KD1718( )
   {
      beforeValidate1KD1718( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KD1718( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KD1718( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KD1718( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KD1718( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KD10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n12382OgPrdID), A12382OgPrdID, Boolean.valueOf(n12383OgPrdDc), A12383OgPrdDc, Boolean.valueOf(n12384OgAAmount), A12384OgAAmount, Boolean.valueOf(n12385OgAmount), A12385OgAmount, Boolean.valueOf(n12386OgUnit), A12386OgUnit, A396EmprCod, Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), A12389OgP, Integer.valueOf(A12390OgRedye), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12393OgCounter)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYECNS");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDYECNS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KD1718( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1KD0( ) ;
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
         endLevel1KD1718( ) ;
      }
      closeExtendedTableCursors1KD1718( ) ;
   }

   public void deferredUpdate1KD1718( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KD1718( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KD1718( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KD1718( ) ;
         afterConfirm1KD1718( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KD1718( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KD11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A12387OgHdr), Byte.valueOf(A12388OgR), A12389OgP, Integer.valueOf(A12390OgRedye), Integer.valueOf(A12391OgCNumber), Integer.valueOf(A12392OgCallOff), Integer.valueOf(A12393OgCounter)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDYECNS");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1718 == 0 )
                     {
                        initAll1KD1718( ) ;
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
                     resetCaption1KD0( ) ;
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
      sMode1718 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KD1718( ) ;
      Gx_mode = sMode1718 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KD1718( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1KD1718( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KD1718( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdyecns");
         if ( AnyError == 0 )
         {
            confirmValues1KD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdyecns");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KD1718( )
   {
      /* Scan By routine */
      /* Using cursor T01KD12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      RcdFound1718 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1718 = (short)(1) ;
         A12387OgHdr = T01KD12_A12387OgHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
         A12388OgR = T01KD12_A12388OgR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
         A12389OgP = T01KD12_A12389OgP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
         A12390OgRedye = T01KD12_A12390OgRedye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
         A12391OgCNumber = T01KD12_A12391OgCNumber[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
         A12392OgCallOff = T01KD12_A12392OgCallOff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
         A12393OgCounter = T01KD12_A12393OgCounter[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KD1718( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound1718 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1718 = (short)(1) ;
         A12387OgHdr = T01KD12_A12387OgHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
         A12388OgR = T01KD12_A12388OgR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
         A12389OgP = T01KD12_A12389OgP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
         A12390OgRedye = T01KD12_A12390OgRedye[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
         A12391OgCNumber = T01KD12_A12391OgCNumber[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
         A12392OgCallOff = T01KD12_A12392OgCallOff[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
         A12393OgCounter = T01KD12_A12393OgCounter[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
      }
   }

   public void scanEnd1KD1718( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1KD1718( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KD1718( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KD1718( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KD1718( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KD1718( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KD1718( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KD1718( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtOgHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgHdr_Enabled), 5, 0), true);
      edtOgR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgR_Enabled), 5, 0), true);
      edtOgP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgP_Enabled), 5, 0), true);
      edtOgRedye_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgRedye_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgRedye_Enabled), 5, 0), true);
      edtOgCNumber_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgCNumber_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgCNumber_Enabled), 5, 0), true);
      edtOgCallOff_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgCallOff_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgCallOff_Enabled), 5, 0), true);
      edtOgCounter_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgCounter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgCounter_Enabled), 5, 0), true);
      edtOgPrdID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgPrdID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgPrdID_Enabled), 5, 0), true);
      edtOgPrdDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgPrdDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgPrdDc_Enabled), 5, 0), true);
      edtOgAAmount_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgAAmount_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgAAmount_Enabled), 5, 0), true);
      edtOgAmount_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgAmount_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgAmount_Enabled), 5, 0), true);
      edtOgUnit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOgUnit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOgUnit_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1KD1718( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1KD0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tdyecns", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12387OgHdr", GXutil.ltrim( localUtil.ntoc( Z12387OgHdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12388OgR", GXutil.ltrim( localUtil.ntoc( Z12388OgR, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12389OgP", GXutil.rtrim( Z12389OgP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12390OgRedye", GXutil.ltrim( localUtil.ntoc( Z12390OgRedye, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12391OgCNumber", GXutil.ltrim( localUtil.ntoc( Z12391OgCNumber, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12392OgCallOff", GXutil.ltrim( localUtil.ntoc( Z12392OgCallOff, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12393OgCounter", GXutil.ltrim( localUtil.ntoc( Z12393OgCounter, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12382OgPrdID", GXutil.rtrim( Z12382OgPrdID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12383OgPrdDc", GXutil.rtrim( Z12383OgPrdDc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12384OgAAmount", GXutil.ltrim( localUtil.ntoc( Z12384OgAAmount, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12385OgAmount", GXutil.ltrim( localUtil.ntoc( Z12385OgAmount, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12386OgUnit", GXutil.rtrim( Z12386OgUnit));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return formatLink("app.tdyecns", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDYECNS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consumos leidos de Orgatex", "") ;
   }

   public void initializeNonKey1KD1718( )
   {
      A12382OgPrdID = "" ;
      n12382OgPrdID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12382OgPrdID", A12382OgPrdID);
      A12383OgPrdDc = "" ;
      n12383OgPrdDc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12383OgPrdDc", A12383OgPrdDc);
      A12384OgAAmount = DecimalUtil.ZERO ;
      n12384OgAAmount = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12384OgAAmount", GXutil.ltrimstr( A12384OgAAmount, 13, 5));
      A12385OgAmount = DecimalUtil.ZERO ;
      n12385OgAmount = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12385OgAmount", GXutil.ltrimstr( A12385OgAmount, 13, 5));
      A12386OgUnit = "" ;
      n12386OgUnit = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12386OgUnit", A12386OgUnit);
      Z12382OgPrdID = "" ;
      Z12383OgPrdDc = "" ;
      Z12384OgAAmount = DecimalUtil.ZERO ;
      Z12385OgAmount = DecimalUtil.ZERO ;
      Z12386OgUnit = "" ;
   }

   public void initAll1KD1718( )
   {
      A12387OgHdr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12387OgHdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12387OgHdr), 8, 0));
      A12388OgR = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12388OgR", GXutil.str( A12388OgR, 1, 0));
      A12389OgP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12389OgP", A12389OgP);
      A12390OgRedye = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12390OgRedye", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12390OgRedye), 5, 0));
      A12391OgCNumber = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12391OgCNumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12391OgCNumber), 5, 0));
      A12392OgCallOff = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12392OgCallOff", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12392OgCallOff), 5, 0));
      A12393OgCounter = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12393OgCounter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12393OgCounter), 5, 0));
      initializeNonKey1KD1718( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241584054", true, true);
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
      httpContext.AddJavascriptSource("tdyecns.js", "?20268241584055", false, true);
      /* End function include_jscripts */
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
      edtOgHdr_Internalname = "OGHDR" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtOgR_Internalname = "OGR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtOgP_Internalname = "OGP" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtOgRedye_Internalname = "OGREDYE" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtOgCNumber_Internalname = "OGCNUMBER" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtOgCallOff_Internalname = "OGCALLOFF" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtOgCounter_Internalname = "OGCOUNTER" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtOgPrdID_Internalname = "OGPRDID" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtOgPrdDc_Internalname = "OGPRDDC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtOgAAmount_Internalname = "OGAAMOUNT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtOgAmount_Internalname = "OGAMOUNT" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtOgUnit_Internalname = "OGUNIT" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consumos leidos de Orgatex", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtOgUnit_Jsonclick = "" ;
      edtOgUnit_Backcolor = (int)(0xFFFFFF) ;
      edtOgUnit_Enabled = 1 ;
      edtOgAmount_Jsonclick = "" ;
      edtOgAmount_Backcolor = (int)(0xFFFFFF) ;
      edtOgAmount_Enabled = 1 ;
      edtOgAAmount_Jsonclick = "" ;
      edtOgAAmount_Backcolor = (int)(0xFFFFFF) ;
      edtOgAAmount_Enabled = 1 ;
      edtOgPrdDc_Jsonclick = "" ;
      edtOgPrdDc_Backcolor = (int)(0xFFFFFF) ;
      edtOgPrdDc_Enabled = 1 ;
      edtOgPrdID_Jsonclick = "" ;
      edtOgPrdID_Backcolor = (int)(0xFFFFFF) ;
      edtOgPrdID_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtOgCounter_Jsonclick = "" ;
      edtOgCounter_Backcolor = (int)(0xFFFFFF) ;
      edtOgCounter_Enabled = 1 ;
      edtOgCallOff_Jsonclick = "" ;
      edtOgCallOff_Backcolor = (int)(0xFFFFFF) ;
      edtOgCallOff_Enabled = 1 ;
      edtOgCNumber_Jsonclick = "" ;
      edtOgCNumber_Backcolor = (int)(0xFFFFFF) ;
      edtOgCNumber_Enabled = 1 ;
      edtOgRedye_Jsonclick = "" ;
      edtOgRedye_Backcolor = (int)(0xFFFFFF) ;
      edtOgRedye_Enabled = 1 ;
      edtOgP_Jsonclick = "" ;
      edtOgP_Backcolor = (int)(0xFFFFFF) ;
      edtOgP_Enabled = 1 ;
      edtOgR_Jsonclick = "" ;
      edtOgR_Backcolor = (int)(0xFFFFFF) ;
      edtOgR_Enabled = 1 ;
      edtOgHdr_Jsonclick = "" ;
      edtOgHdr_Backcolor = (int)(0xFFFFFF) ;
      edtOgHdr_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01KD13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KD13_A407EmprNom[0] ;
      n407EmprNom = T01KD13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(11);
      GX_FocusControl = edtOgPrdID_Internalname ;
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

   public void valid_Ogcounter( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12382OgPrdID", GXutil.rtrim( A12382OgPrdID));
      httpContext.ajax_rsp_assign_attri("", false, "A12383OgPrdDc", GXutil.rtrim( A12383OgPrdDc));
      httpContext.ajax_rsp_assign_attri("", false, "A12384OgAAmount", GXutil.ltrim( localUtil.ntoc( A12384OgAAmount, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12385OgAmount", GXutil.ltrim( localUtil.ntoc( A12385OgAmount, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12386OgUnit", GXutil.rtrim( A12386OgUnit));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12387OgHdr", GXutil.ltrim( localUtil.ntoc( Z12387OgHdr, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12388OgR", GXutil.ltrim( localUtil.ntoc( Z12388OgR, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12389OgP", GXutil.rtrim( Z12389OgP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12390OgRedye", GXutil.ltrim( localUtil.ntoc( Z12390OgRedye, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12391OgCNumber", GXutil.ltrim( localUtil.ntoc( Z12391OgCNumber, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12392OgCallOff", GXutil.ltrim( localUtil.ntoc( Z12392OgCallOff, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12393OgCounter", GXutil.ltrim( localUtil.ntoc( Z12393OgCounter, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12382OgPrdID", GXutil.rtrim( Z12382OgPrdID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12383OgPrdDc", GXutil.rtrim( Z12383OgPrdDc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12384OgAAmount", GXutil.ltrim( localUtil.ntoc( Z12384OgAAmount, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12385OgAmount", GXutil.ltrim( localUtil.ntoc( Z12385OgAmount, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12386OgUnit", GXutil.rtrim( Z12386OgUnit));
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
      setEventMetadata("VALID_OGHDR","{handler:'valid_Oghdr',iparms:[]");
      setEventMetadata("VALID_OGHDR",",oparms:[]}");
      setEventMetadata("VALID_OGR","{handler:'valid_Ogr',iparms:[]");
      setEventMetadata("VALID_OGR",",oparms:[]}");
      setEventMetadata("VALID_OGP","{handler:'valid_Ogp',iparms:[]");
      setEventMetadata("VALID_OGP",",oparms:[]}");
      setEventMetadata("VALID_OGREDYE","{handler:'valid_Ogredye',iparms:[]");
      setEventMetadata("VALID_OGREDYE",",oparms:[]}");
      setEventMetadata("VALID_OGCNUMBER","{handler:'valid_Ogcnumber',iparms:[]");
      setEventMetadata("VALID_OGCNUMBER",",oparms:[]}");
      setEventMetadata("VALID_OGCALLOFF","{handler:'valid_Ogcalloff',iparms:[]");
      setEventMetadata("VALID_OGCALLOFF",",oparms:[]}");
      setEventMetadata("VALID_OGCOUNTER","{handler:'valid_Ogcounter',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12387OgHdr',fld:'OGHDR',pic:'ZZZZZZZ9'},{av:'A12388OgR',fld:'OGR',pic:'9'},{av:'A12389OgP',fld:'OGP',pic:''},{av:'A12390OgRedye',fld:'OGREDYE',pic:'ZZZZ9'},{av:'A12391OgCNumber',fld:'OGCNUMBER',pic:'ZZZZ9'},{av:'A12392OgCallOff',fld:'OGCALLOFF',pic:'ZZZZ9'},{av:'A12393OgCounter',fld:'OGCOUNTER',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_OGCOUNTER",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12382OgPrdID',fld:'OGPRDID',pic:''},{av:'A12383OgPrdDc',fld:'OGPRDDC',pic:''},{av:'A12384OgAAmount',fld:'OGAAMOUNT',pic:'ZZZZZZ9.99999'},{av:'A12385OgAmount',fld:'OGAMOUNT',pic:'ZZZZZZ9.99999'},{av:'A12386OgUnit',fld:'OGUNIT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z12387OgHdr'},{av:'Z12388OgR'},{av:'Z12389OgP'},{av:'Z12390OgRedye'},{av:'Z12391OgCNumber'},{av:'Z12392OgCallOff'},{av:'Z12393OgCounter'},{av:'Z407EmprNom'},{av:'Z12382OgPrdID'},{av:'Z12383OgPrdDc'},{av:'Z12384OgAAmount'},{av:'Z12385OgAmount'},{av:'Z12386OgUnit'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12389OgP = "" ;
      Z12382OgPrdID = "" ;
      Z12383OgPrdDc = "" ;
      Z12384OgAAmount = DecimalUtil.ZERO ;
      Z12385OgAmount = DecimalUtil.ZERO ;
      Z12386OgUnit = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12389OgP = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A12382OgPrdID = "" ;
      lblTextblock11_Jsonclick = "" ;
      A12383OgPrdDc = "" ;
      lblTextblock12_Jsonclick = "" ;
      A12384OgAAmount = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A12385OgAmount = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      A12386OgUnit = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      Gx_mode = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
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
      T01KD4_A407EmprNom = new String[] {""} ;
      T01KD4_n407EmprNom = new boolean[] {false} ;
      T01KD5_A12387OgHdr = new int[1] ;
      T01KD5_A12388OgR = new byte[1] ;
      T01KD5_A12389OgP = new String[] {""} ;
      T01KD5_A12390OgRedye = new int[1] ;
      T01KD5_A12391OgCNumber = new int[1] ;
      T01KD5_A12392OgCallOff = new int[1] ;
      T01KD5_A12393OgCounter = new int[1] ;
      T01KD5_A407EmprNom = new String[] {""} ;
      T01KD5_n407EmprNom = new boolean[] {false} ;
      T01KD5_A12382OgPrdID = new String[] {""} ;
      T01KD5_n12382OgPrdID = new boolean[] {false} ;
      T01KD5_A12383OgPrdDc = new String[] {""} ;
      T01KD5_n12383OgPrdDc = new boolean[] {false} ;
      T01KD5_A12384OgAAmount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KD5_n12384OgAAmount = new boolean[] {false} ;
      T01KD5_A12385OgAmount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KD5_n12385OgAmount = new boolean[] {false} ;
      T01KD5_A12386OgUnit = new String[] {""} ;
      T01KD5_n12386OgUnit = new boolean[] {false} ;
      T01KD5_A396EmprCod = new String[] {""} ;
      T01KD6_A396EmprCod = new String[] {""} ;
      T01KD6_A12387OgHdr = new int[1] ;
      T01KD6_A12388OgR = new byte[1] ;
      T01KD6_A12389OgP = new String[] {""} ;
      T01KD6_A12390OgRedye = new int[1] ;
      T01KD6_A12391OgCNumber = new int[1] ;
      T01KD6_A12392OgCallOff = new int[1] ;
      T01KD6_A12393OgCounter = new int[1] ;
      T01KD3_A12387OgHdr = new int[1] ;
      T01KD3_A12388OgR = new byte[1] ;
      T01KD3_A12389OgP = new String[] {""} ;
      T01KD3_A12390OgRedye = new int[1] ;
      T01KD3_A12391OgCNumber = new int[1] ;
      T01KD3_A12392OgCallOff = new int[1] ;
      T01KD3_A12393OgCounter = new int[1] ;
      T01KD3_A12382OgPrdID = new String[] {""} ;
      T01KD3_n12382OgPrdID = new boolean[] {false} ;
      T01KD3_A12383OgPrdDc = new String[] {""} ;
      T01KD3_n12383OgPrdDc = new boolean[] {false} ;
      T01KD3_A12384OgAAmount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KD3_n12384OgAAmount = new boolean[] {false} ;
      T01KD3_A12385OgAmount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KD3_n12385OgAmount = new boolean[] {false} ;
      T01KD3_A12386OgUnit = new String[] {""} ;
      T01KD3_n12386OgUnit = new boolean[] {false} ;
      T01KD3_A396EmprCod = new String[] {""} ;
      sMode1718 = "" ;
      T01KD7_A396EmprCod = new String[] {""} ;
      T01KD7_A12387OgHdr = new int[1] ;
      T01KD7_A12388OgR = new byte[1] ;
      T01KD7_A12389OgP = new String[] {""} ;
      T01KD7_A12390OgRedye = new int[1] ;
      T01KD7_A12391OgCNumber = new int[1] ;
      T01KD7_A12392OgCallOff = new int[1] ;
      T01KD7_A12393OgCounter = new int[1] ;
      T01KD8_A396EmprCod = new String[] {""} ;
      T01KD8_A12387OgHdr = new int[1] ;
      T01KD8_A12388OgR = new byte[1] ;
      T01KD8_A12389OgP = new String[] {""} ;
      T01KD8_A12390OgRedye = new int[1] ;
      T01KD8_A12391OgCNumber = new int[1] ;
      T01KD8_A12392OgCallOff = new int[1] ;
      T01KD8_A12393OgCounter = new int[1] ;
      T01KD2_A12387OgHdr = new int[1] ;
      T01KD2_A12388OgR = new byte[1] ;
      T01KD2_A12389OgP = new String[] {""} ;
      T01KD2_A12390OgRedye = new int[1] ;
      T01KD2_A12391OgCNumber = new int[1] ;
      T01KD2_A12392OgCallOff = new int[1] ;
      T01KD2_A12393OgCounter = new int[1] ;
      T01KD2_A12382OgPrdID = new String[] {""} ;
      T01KD2_n12382OgPrdID = new boolean[] {false} ;
      T01KD2_A12383OgPrdDc = new String[] {""} ;
      T01KD2_n12383OgPrdDc = new boolean[] {false} ;
      T01KD2_A12384OgAAmount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KD2_n12384OgAAmount = new boolean[] {false} ;
      T01KD2_A12385OgAmount = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01KD2_n12385OgAmount = new boolean[] {false} ;
      T01KD2_A12386OgUnit = new String[] {""} ;
      T01KD2_n12386OgUnit = new boolean[] {false} ;
      T01KD2_A396EmprCod = new String[] {""} ;
      T01KD12_A396EmprCod = new String[] {""} ;
      T01KD12_A12387OgHdr = new int[1] ;
      T01KD12_A12388OgR = new byte[1] ;
      T01KD12_A12389OgP = new String[] {""} ;
      T01KD12_A12390OgRedye = new int[1] ;
      T01KD12_A12391OgCNumber = new int[1] ;
      T01KD12_A12392OgCallOff = new int[1] ;
      T01KD12_A12393OgCounter = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01KD13_A407EmprNom = new String[] {""} ;
      T01KD13_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ12389OgP = "" ;
      ZZ407EmprNom = "" ;
      ZZ12382OgPrdID = "" ;
      ZZ12383OgPrdDc = "" ;
      ZZ12384OgAAmount = DecimalUtil.ZERO ;
      ZZ12385OgAmount = DecimalUtil.ZERO ;
      ZZ12386OgUnit = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdyecns__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdyecns__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdyecns__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdyecns__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdyecns__default(),
         new Object[] {
             new Object[] {
            T01KD2_A12387OgHdr, T01KD2_A12388OgR, T01KD2_A12389OgP, T01KD2_A12390OgRedye, T01KD2_A12391OgCNumber, T01KD2_A12392OgCallOff, T01KD2_A12393OgCounter, T01KD2_A12382OgPrdID, T01KD2_n12382OgPrdID, T01KD2_A12383OgPrdDc,
            T01KD2_n12383OgPrdDc, T01KD2_A12384OgAAmount, T01KD2_n12384OgAAmount, T01KD2_A12385OgAmount, T01KD2_n12385OgAmount, T01KD2_A12386OgUnit, T01KD2_n12386OgUnit, T01KD2_A396EmprCod
            }
            , new Object[] {
            T01KD3_A12387OgHdr, T01KD3_A12388OgR, T01KD3_A12389OgP, T01KD3_A12390OgRedye, T01KD3_A12391OgCNumber, T01KD3_A12392OgCallOff, T01KD3_A12393OgCounter, T01KD3_A12382OgPrdID, T01KD3_n12382OgPrdID, T01KD3_A12383OgPrdDc,
            T01KD3_n12383OgPrdDc, T01KD3_A12384OgAAmount, T01KD3_n12384OgAAmount, T01KD3_A12385OgAmount, T01KD3_n12385OgAmount, T01KD3_A12386OgUnit, T01KD3_n12386OgUnit, T01KD3_A396EmprCod
            }
            , new Object[] {
            T01KD4_A407EmprNom, T01KD4_n407EmprNom
            }
            , new Object[] {
            T01KD5_A12387OgHdr, T01KD5_A12388OgR, T01KD5_A12389OgP, T01KD5_A12390OgRedye, T01KD5_A12391OgCNumber, T01KD5_A12392OgCallOff, T01KD5_A12393OgCounter, T01KD5_A407EmprNom, T01KD5_n407EmprNom, T01KD5_A12382OgPrdID,
            T01KD5_n12382OgPrdID, T01KD5_A12383OgPrdDc, T01KD5_n12383OgPrdDc, T01KD5_A12384OgAAmount, T01KD5_n12384OgAAmount, T01KD5_A12385OgAmount, T01KD5_n12385OgAmount, T01KD5_A12386OgUnit, T01KD5_n12386OgUnit, T01KD5_A396EmprCod
            }
            , new Object[] {
            T01KD6_A396EmprCod, T01KD6_A12387OgHdr, T01KD6_A12388OgR, T01KD6_A12389OgP, T01KD6_A12390OgRedye, T01KD6_A12391OgCNumber, T01KD6_A12392OgCallOff, T01KD6_A12393OgCounter
            }
            , new Object[] {
            T01KD7_A396EmprCod, T01KD7_A12387OgHdr, T01KD7_A12388OgR, T01KD7_A12389OgP, T01KD7_A12390OgRedye, T01KD7_A12391OgCNumber, T01KD7_A12392OgCallOff, T01KD7_A12393OgCounter
            }
            , new Object[] {
            T01KD8_A396EmprCod, T01KD8_A12387OgHdr, T01KD8_A12388OgR, T01KD8_A12389OgP, T01KD8_A12390OgRedye, T01KD8_A12391OgCNumber, T01KD8_A12392OgCallOff, T01KD8_A12393OgCounter
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KD12_A396EmprCod, T01KD12_A12387OgHdr, T01KD12_A12388OgR, T01KD12_A12389OgP, T01KD12_A12390OgRedye, T01KD12_A12391OgCNumber, T01KD12_A12392OgCallOff, T01KD12_A12393OgCounter
            }
            , new Object[] {
            T01KD13_A407EmprNom, T01KD13_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TDYECNS" ;
   }

   private byte Z12388OgR ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12388OgR ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ12388OgR ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1718 ;
   private short nIsDirty_1718 ;
   private int Z12387OgHdr ;
   private int Z12390OgRedye ;
   private int Z12391OgCNumber ;
   private int Z12392OgCallOff ;
   private int Z12393OgCounter ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A12387OgHdr ;
   private int edtOgHdr_Enabled ;
   private int edtOgR_Enabled ;
   private int edtOgP_Enabled ;
   private int A12390OgRedye ;
   private int edtOgRedye_Enabled ;
   private int A12391OgCNumber ;
   private int edtOgCNumber_Enabled ;
   private int A12392OgCallOff ;
   private int edtOgCallOff_Enabled ;
   private int A12393OgCounter ;
   private int edtOgCounter_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtOgPrdID_Enabled ;
   private int edtOgPrdDc_Enabled ;
   private int edtOgAAmount_Enabled ;
   private int edtOgAmount_Enabled ;
   private int edtOgUnit_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtOgUnit_Backcolor ;
   private int edtOgAmount_Backcolor ;
   private int edtOgAAmount_Backcolor ;
   private int edtOgPrdDc_Backcolor ;
   private int edtOgPrdID_Backcolor ;
   private int edtOgCounter_Backcolor ;
   private int edtOgCallOff_Backcolor ;
   private int edtOgCNumber_Backcolor ;
   private int edtOgRedye_Backcolor ;
   private int edtOgP_Backcolor ;
   private int edtOgR_Backcolor ;
   private int edtOgHdr_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ12387OgHdr ;
   private int ZZ12390OgRedye ;
   private int ZZ12391OgCNumber ;
   private int ZZ12392OgCallOff ;
   private int ZZ12393OgCounter ;
   private java.math.BigDecimal Z12384OgAAmount ;
   private java.math.BigDecimal Z12385OgAmount ;
   private java.math.BigDecimal A12384OgAAmount ;
   private java.math.BigDecimal A12385OgAmount ;
   private java.math.BigDecimal ZZ12384OgAAmount ;
   private java.math.BigDecimal ZZ12385OgAmount ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12389OgP ;
   private String Z12382OgPrdID ;
   private String Z12383OgPrdDc ;
   private String Z12386OgUnit ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOgHdr_Internalname ;
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
   private String edtOgHdr_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtOgR_Internalname ;
   private String edtOgR_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtOgP_Internalname ;
   private String A12389OgP ;
   private String edtOgP_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtOgRedye_Internalname ;
   private String edtOgRedye_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtOgCNumber_Internalname ;
   private String edtOgCNumber_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtOgCallOff_Internalname ;
   private String edtOgCallOff_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtOgCounter_Internalname ;
   private String edtOgCounter_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtOgPrdID_Internalname ;
   private String A12382OgPrdID ;
   private String edtOgPrdID_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtOgPrdDc_Internalname ;
   private String A12383OgPrdDc ;
   private String edtOgPrdDc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtOgAAmount_Internalname ;
   private String edtOgAAmount_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtOgAmount_Internalname ;
   private String edtOgAmount_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtOgUnit_Internalname ;
   private String A12386OgUnit ;
   private String edtOgUnit_Jsonclick ;
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
   private String Gx_mode ;
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
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
   private String sMode1718 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ12389OgP ;
   private String ZZ407EmprNom ;
   private String ZZ12382OgPrdID ;
   private String ZZ12383OgPrdDc ;
   private String ZZ12386OgUnit ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n12382OgPrdID ;
   private boolean n12383OgPrdDc ;
   private boolean n12384OgAAmount ;
   private boolean n12385OgAmount ;
   private boolean n12386OgUnit ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] T01KD4_A407EmprNom ;
   private boolean[] T01KD4_n407EmprNom ;
   private int[] T01KD5_A12387OgHdr ;
   private byte[] T01KD5_A12388OgR ;
   private String[] T01KD5_A12389OgP ;
   private int[] T01KD5_A12390OgRedye ;
   private int[] T01KD5_A12391OgCNumber ;
   private int[] T01KD5_A12392OgCallOff ;
   private int[] T01KD5_A12393OgCounter ;
   private String[] T01KD5_A407EmprNom ;
   private boolean[] T01KD5_n407EmprNom ;
   private String[] T01KD5_A12382OgPrdID ;
   private boolean[] T01KD5_n12382OgPrdID ;
   private String[] T01KD5_A12383OgPrdDc ;
   private boolean[] T01KD5_n12383OgPrdDc ;
   private java.math.BigDecimal[] T01KD5_A12384OgAAmount ;
   private boolean[] T01KD5_n12384OgAAmount ;
   private java.math.BigDecimal[] T01KD5_A12385OgAmount ;
   private boolean[] T01KD5_n12385OgAmount ;
   private String[] T01KD5_A12386OgUnit ;
   private boolean[] T01KD5_n12386OgUnit ;
   private String[] T01KD5_A396EmprCod ;
   private String[] T01KD6_A396EmprCod ;
   private int[] T01KD6_A12387OgHdr ;
   private byte[] T01KD6_A12388OgR ;
   private String[] T01KD6_A12389OgP ;
   private int[] T01KD6_A12390OgRedye ;
   private int[] T01KD6_A12391OgCNumber ;
   private int[] T01KD6_A12392OgCallOff ;
   private int[] T01KD6_A12393OgCounter ;
   private int[] T01KD3_A12387OgHdr ;
   private byte[] T01KD3_A12388OgR ;
   private String[] T01KD3_A12389OgP ;
   private int[] T01KD3_A12390OgRedye ;
   private int[] T01KD3_A12391OgCNumber ;
   private int[] T01KD3_A12392OgCallOff ;
   private int[] T01KD3_A12393OgCounter ;
   private String[] T01KD3_A12382OgPrdID ;
   private boolean[] T01KD3_n12382OgPrdID ;
   private String[] T01KD3_A12383OgPrdDc ;
   private boolean[] T01KD3_n12383OgPrdDc ;
   private java.math.BigDecimal[] T01KD3_A12384OgAAmount ;
   private boolean[] T01KD3_n12384OgAAmount ;
   private java.math.BigDecimal[] T01KD3_A12385OgAmount ;
   private boolean[] T01KD3_n12385OgAmount ;
   private String[] T01KD3_A12386OgUnit ;
   private boolean[] T01KD3_n12386OgUnit ;
   private String[] T01KD3_A396EmprCod ;
   private String[] T01KD7_A396EmprCod ;
   private int[] T01KD7_A12387OgHdr ;
   private byte[] T01KD7_A12388OgR ;
   private String[] T01KD7_A12389OgP ;
   private int[] T01KD7_A12390OgRedye ;
   private int[] T01KD7_A12391OgCNumber ;
   private int[] T01KD7_A12392OgCallOff ;
   private int[] T01KD7_A12393OgCounter ;
   private String[] T01KD8_A396EmprCod ;
   private int[] T01KD8_A12387OgHdr ;
   private byte[] T01KD8_A12388OgR ;
   private String[] T01KD8_A12389OgP ;
   private int[] T01KD8_A12390OgRedye ;
   private int[] T01KD8_A12391OgCNumber ;
   private int[] T01KD8_A12392OgCallOff ;
   private int[] T01KD8_A12393OgCounter ;
   private int[] T01KD2_A12387OgHdr ;
   private byte[] T01KD2_A12388OgR ;
   private String[] T01KD2_A12389OgP ;
   private int[] T01KD2_A12390OgRedye ;
   private int[] T01KD2_A12391OgCNumber ;
   private int[] T01KD2_A12392OgCallOff ;
   private int[] T01KD2_A12393OgCounter ;
   private String[] T01KD2_A12382OgPrdID ;
   private boolean[] T01KD2_n12382OgPrdID ;
   private String[] T01KD2_A12383OgPrdDc ;
   private boolean[] T01KD2_n12383OgPrdDc ;
   private java.math.BigDecimal[] T01KD2_A12384OgAAmount ;
   private boolean[] T01KD2_n12384OgAAmount ;
   private java.math.BigDecimal[] T01KD2_A12385OgAmount ;
   private boolean[] T01KD2_n12385OgAmount ;
   private String[] T01KD2_A12386OgUnit ;
   private boolean[] T01KD2_n12386OgUnit ;
   private String[] T01KD2_A396EmprCod ;
   private String[] T01KD12_A396EmprCod ;
   private int[] T01KD12_A12387OgHdr ;
   private byte[] T01KD12_A12388OgR ;
   private String[] T01KD12_A12389OgP ;
   private int[] T01KD12_A12390OgRedye ;
   private int[] T01KD12_A12391OgCNumber ;
   private int[] T01KD12_A12392OgCallOff ;
   private int[] T01KD12_A12393OgCounter ;
   private String[] T01KD13_A407EmprNom ;
   private boolean[] T01KD13_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdyecns__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdyecns__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdyecns__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdyecns__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdyecns__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KD2", "SELECT OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter, OgPrdID, OgPrdDc, OgAAmount, OgAmount, OgUnit, EmprCod FROM TXPDYECNS WHERE EmprCod = ? AND OgHdr = ? AND OgR = ? AND OgP = ? AND OgRedye = ? AND OgCNumber = ? AND OgCallOff = ? AND OgCounter = ?  FOR UPDATE OF OgPrdID, OgPrdDc, OgAAmount, OgAmount, OgUnit NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KD3", "SELECT OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter, OgPrdID, OgPrdDc, OgAAmount, OgAmount, OgUnit, EmprCod FROM TXPDYECNS WHERE EmprCod = ? AND OgHdr = ? AND OgR = ? AND OgP = ? AND OgRedye = ? AND OgCNumber = ? AND OgCallOff = ? AND OgCounter = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KD4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KD5", "SELECT /*+ FIRST_ROWS(100) */ TM1.OgHdr, TM1.OgR, TM1.OgP, TM1.OgRedye, TM1.OgCNumber, TM1.OgCallOff, TM1.OgCounter, T2.EmprNom, TM1.OgPrdID, TM1.OgPrdDc, TM1.OgAAmount, TM1.OgAmount, TM1.OgUnit, TM1.EmprCod FROM (TXPDYECNS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.OgHdr = ? and TM1.OgR = ? and TM1.OgP = ? and TM1.OgRedye = ? and TM1.OgCNumber = ? and TM1.OgCallOff = ? and TM1.OgCounter = ? ORDER BY TM1.EmprCod, TM1.OgHdr, TM1.OgR, TM1.OgP, TM1.OgRedye, TM1.OgCNumber, TM1.OgCallOff, TM1.OgCounter ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KD6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter FROM TXPDYECNS WHERE EmprCod = ? AND OgHdr = ? AND OgR = ? AND OgP = ? AND OgRedye = ? AND OgCNumber = ? AND OgCallOff = ? AND OgCounter = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KD7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter FROM TXPDYECNS WHERE ( OgHdr > ? or OgHdr = ? and OgR > ? or OgR = ? and OgHdr = ? and OgP > ? or OgP = ? and OgR = ? and OgHdr = ? and OgRedye > ? or OgRedye = ? and OgP = ? and OgR = ? and OgHdr = ? and OgCNumber > ? or OgCNumber = ? and OgRedye = ? and OgP = ? and OgR = ? and OgHdr = ? and OgCallOff > ? or OgCallOff = ? and OgCNumber = ? and OgRedye = ? and OgP = ? and OgR = ? and OgHdr = ? and OgCounter > ?) and EmprCod = ? ORDER BY EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KD8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter FROM TXPDYECNS WHERE ( OgHdr < ? or OgHdr = ? and OgR < ? or OgR = ? and OgHdr = ? and OgP < ? or OgP = ? and OgR = ? and OgHdr = ? and OgRedye < ? or OgRedye = ? and OgP = ? and OgR = ? and OgHdr = ? and OgCNumber < ? or OgCNumber = ? and OgRedye = ? and OgP = ? and OgR = ? and OgHdr = ? and OgCallOff < ? or OgCallOff = ? and OgCNumber = ? and OgRedye = ? and OgP = ? and OgR = ? and OgHdr = ? and OgCounter < ?) and EmprCod = ? ORDER BY EmprCod DESC, OgHdr DESC, OgR DESC, OgP DESC, OgRedye DESC, OgCNumber DESC, OgCallOff DESC, OgCounter DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KD9", "INSERT INTO TXPDYECNS(OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter, OgPrdID, OgPrdDc, OgAAmount, OgAmount, OgUnit, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDYECNS")
         ,new UpdateCursor("T01KD10", "UPDATE TXPDYECNS SET OgPrdID=?, OgPrdDc=?, OgAAmount=?, OgAmount=?, OgUnit=?  WHERE EmprCod = ? AND OgHdr = ? AND OgR = ? AND OgP = ? AND OgRedye = ? AND OgCNumber = ? AND OgCallOff = ? AND OgCounter = ?", GX_NOMASK, "TXPDYECNS")
         ,new UpdateCursor("T01KD11", "DELETE FROM TXPDYECNS  WHERE EmprCod = ? AND OgHdr = ? AND OgR = ? AND OgP = ? AND OgRedye = ? AND OgCNumber = ? AND OgCallOff = ? AND OgCounter = ?", GX_NOMASK, "TXPDYECNS")
         ,new ForEachCursor("T01KD12", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter FROM TXPDYECNS WHERE EmprCod = ? ORDER BY EmprCod, OgHdr, OgR, OgP, OgRedye, OgCNumber, OgCallOff, OgCounter ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KD13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 11 :
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
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setString(25, (String)parms[24], 1);
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setString(29, (String)parms[28], 3);
               return;
            case 6 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setString(25, (String)parms[24], 1);
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setString(29, (String)parms[28], 3);
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 26);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 5);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 10);
               }
               stmt.setString(13, (String)parms[17], 3);
               return;
            case 8 :
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
                  stmt.setString(2, (String)parms[3], 26);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 10);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setInt(10, ((Number) parms[14]).intValue());
               stmt.setInt(11, ((Number) parms[15]).intValue());
               stmt.setInt(12, ((Number) parms[16]).intValue());
               stmt.setInt(13, ((Number) parms[17]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

