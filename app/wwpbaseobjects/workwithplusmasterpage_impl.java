package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class workwithplusmasterpage_impl extends GXMasterPage
{
   public workwithplusmasterpage_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public workwithplusmasterpage_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( workwithplusmasterpage_impl.class ));
   }

   public workwithplusmasterpage_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa0G2( ) ;
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws0G2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we0G2( ) ;
            }
         }
      }
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      if ( ! isFullAjaxMode( ) )
      {
         GXWebForm.addResponsiveMetaHeaders((getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta());
         getDataAreaObject().renderHtmlHeaders();
      }
   }

   public void renderHtmlOpenForm( )
   {
      if ( ! isFullAjaxMode( ) )
      {
         getDataAreaObject().renderHtmlOpenForm();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROGRAMDESCRIPTION_MPAGE", getSecureSignedToken( "gxmpage_", GXutil.rtrim( localUtil.format( AV48ProgramDescription, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWWPCONTEXT_MPAGE", getSecureSignedToken( "gxmpage_", AV69WWPContext));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDEXTOADDITEMS_MPAGE", getSecureSignedToken( "gxmpage_", localUtil.format( DecimalUtil.doubleToDec(AV47IndexToAddItems), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "vBOOKMARKSDATA_MPAGE", AV39BookmarksData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBOOKMARKSDATA_MPAGE", AV39BookmarksData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "vADMINAGDATA_MPAGE", AV5AdminAGData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vADMINAGDATA_MPAGE", AV5AdminAGData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "vDVELOP_MENU_MPAGE", AV10DVelop_Menu);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDVELOP_MENU_MPAGE", AV10DVelop_Menu);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "vDVELOP_MENU_USERDATA_MPAGE", AV42DVelop_Menu_UserData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDVELOP_MENU_USERDATA_MPAGE", AV42DVelop_Menu_UserData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPROGRAMDESCRIPTION_MPAGE", AV48ProgramDescription);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROGRAMDESCRIPTION_MPAGE", getSecureSignedToken( "gxmpage_", GXutil.rtrim( localUtil.format( AV48ProgramDescription, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "vWWPCONTEXT_MPAGE", AV69WWPContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vWWPCONTEXT_MPAGE", AV69WWPContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWWPCONTEXT_MPAGE", getSecureSignedToken( "gxmpage_", AV69WWPContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vINDEXTOADDITEMS_MPAGE", GXutil.ltrim( localUtil.ntoc( AV47IndexToAddItems, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDEXTOADDITEMS_MPAGE", getSecureSignedToken( "gxmpage_", localUtil.format( DecimalUtil.doubleToDec(AV47IndexToAddItems), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_BOOKMARKS_MPAGE_Icontype", GXutil.rtrim( Ddo_bookmarks_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_BOOKMARKS_MPAGE_Icon", GXutil.rtrim( Ddo_bookmarks_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_BOOKMARKS_MPAGE_Tooltip", GXutil.rtrim( Ddo_bookmarks_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_BOOKMARKS_MPAGE_Cls", GXutil.rtrim( Ddo_bookmarks_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_BOOKMARKS_MPAGE_Titlecontrolalign", GXutil.rtrim( Ddo_bookmarks_Titlecontrolalign));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_ADMINAG_MPAGE_Icon", GXutil.rtrim( Ddo_adminag_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_ADMINAG_MPAGE_Cls", GXutil.rtrim( Ddo_adminag_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_ADMINAG_MPAGE_Titlecontrolalign", GXutil.rtrim( Ddo_adminag_Titlecontrolalign));
      app.GxWebStd.gx_hidden_field( httpContext, "UCMENU_MPAGE_Searchserviceurl", GXutil.rtrim( Ucmenu_Searchserviceurl));
      app.GxWebStd.gx_hidden_field( httpContext, "UCMENU_MPAGE_Searchminchars", GXutil.ltrim( localUtil.ntoc( Ucmenu_Searchminchars, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UCMENU_MPAGE_Searchhelperdescription", GXutil.rtrim( Ucmenu_Searchhelperdescription));
      app.GxWebStd.gx_hidden_field( httpContext, "UCMENU_MPAGE_Sidebarmainclass", GXutil.rtrim( Ucmenu_Sidebarmainclass));
      app.GxWebStd.gx_hidden_field( httpContext, "UCMENU_MPAGE_Scrollwidth", GXutil.ltrim( localUtil.ntoc( Ucmenu_Scrollwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UCMENU_MPAGE_Scrollalwaysvisible", GXutil.booltostr( Ucmenu_Scrollalwaysvisible));
      app.GxWebStd.gx_hidden_field( httpContext, "UCMENU_MPAGE_Hidescrollincompactmenu", GXutil.booltostr( Ucmenu_Hidescrollincompactmenu));
      app.GxWebStd.gx_hidden_field( httpContext, "UCMENU_MPAGE_Firstlevelisgrouping", GXutil.booltostr( Ucmenu_Firstlevelisgrouping));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITIES_MPAGE_Enablefixobjectfitcover", GXutil.booltostr( Wwputilities_Enablefixobjectfitcover));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITIES_MPAGE_Enablefloatinglabels", GXutil.booltostr( Wwputilities_Enablefloatinglabels));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITIES_MPAGE_Enableupdaterowselectionstatus", GXutil.booltostr( Wwputilities_Enableupdaterowselectionstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITIES_MPAGE_Enableconvertcombotobootstrapselect", GXutil.booltostr( Wwputilities_Enableconvertcombotobootstrapselect));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITIES_MPAGE_Allowcolumnresizing", GXutil.booltostr( Wwputilities_Allowcolumnresizing));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITIES_MPAGE_Allowcolumnreordering", GXutil.booltostr( Wwputilities_Allowcolumnreordering));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITIES_MPAGE_Allowcolumndragging", GXutil.booltostr( Wwputilities_Allowcolumndragging));
      app.GxWebStd.gx_hidden_field( httpContext, "WWPUTILITIES_MPAGE_Allowcolumnsrestore", GXutil.booltostr( Wwputilities_Allowcolumnsrestore));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_BOOKMARKS_MPAGE_Activeeventkey", GXutil.rtrim( Ddo_bookmarks_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "vHTTPREQUEST_MPAGE_Baseurl", GXutil.rtrim( AV50Httprequest.getBaseURL()));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_ADMINAG_MPAGE_Activeeventkey", GXutil.rtrim( Ddo_adminag_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "FORM_MPAGE_Caption", GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getCaption()));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_BOOKMARKS_MPAGE_Activeeventkey", GXutil.rtrim( Ddo_bookmarks_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "FORM_MPAGE_Caption", GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getCaption()));
   }

   public void renderHtmlCloseForm0G2( )
   {
      sendCloseFormHiddens( ) ;
      sendSecurityToken(sPrefix);
      if ( ! isFullAjaxMode( ) )
      {
         getDataAreaObject().renderHtmlCloseForm();
      }
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/slimscroll/jquery.slimscroll.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/SidebarMenu/BootstrapSidebarMenuRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVMessage/pnotify.custom.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVMessage/DVMessageRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Tooltip/BootstrapTooltipRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Mask/jquery.mask.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/WorkWithPlusUtilities/BootstrapSelect.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/WorkWithPlusUtilities/WorkWithPlusUtilitiesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DatePicker/DatePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("wwpbaseobjects/workwithplusmasterpage.js", "?20269141425425", false, true);
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "WWPBaseObjects.WorkWithPlusMasterPage" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Master Page", "") ;
   }

   public void wb0G0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         if ( ! ShowMPWhenPopUp( ) && httpContext.isPopUpObject( ) )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableOutput();
            }
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
            /* Content placeholder */
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
            httpContext.writeText( ">") ;
            if ( ! isFullAjaxMode( ) )
            {
               getDataAreaObject().renderHtmlContent();
            }
            httpContext.writeText( "</div>") ;
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
            wbLoad = true ;
            return  ;
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", divLayoutmaintable_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainWhiteHeader", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "TableHeaderSidebarImage", "left", "top", " "+"data-gx-flex"+" ", "justify-content:flex-end;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_11_0G2( true) ;
      }
      else
      {
         wb_table1_11_0G2( false) ;
      }
      return  ;
   }

   public void wb_table1_11_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "ShowMenuImageCellNotFixedRight page-content", "left", "top", "", "flex-grow:1;", "div");
         wb_table2_18_0G2( true) ;
      }
      else
      {
         wb_table2_18_0G2( false) ;
      }
      return  ;
   }

   public void wb_table2_18_0G2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellHeaderBar hidden-xs", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableuserrole_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',true,'',0)\"" ;
         ClassString = bttBtnenglishlink_Class ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenglishlink_Internalname, "", httpContext.getMessage( "EN", ""), bttBtnenglishlink_Jsonclick, 5, httpContext.getMessage( "EN", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",true,"+"'"+"EDOENGLISHLINK_MPAGE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',true,'',0)\"" ;
         ClassString = bttBtnportugueselink_Class ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnportugueselink_Internalname, "", httpContext.getMessage( "PT", ""), bttBtnportugueselink_Jsonclick, 5, httpContext.getMessage( "PT", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",true,"+"'"+"EDOPORTUGUESELINK_MPAGE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',true,'',0)\"" ;
         ClassString = bttBtnspanishlink_Class ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnspanishlink_Internalname, "", httpContext.getMessage( "ES", ""), bttBtnspanishlink_Jsonclick, 5, httpContext.getMessage( "ES", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",true,"+"'"+"EDOSPANISHLINK_MPAGE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_bookmarks.setProperty("IconType", Ddo_bookmarks_Icontype);
         ucDdo_bookmarks.setProperty("Icon", Ddo_bookmarks_Icon);
         ucDdo_bookmarks.setProperty("Caption", Ddo_bookmarks_Caption);
         ucDdo_bookmarks.setProperty("Cls", Ddo_bookmarks_Cls);
         ucDdo_bookmarks.setProperty("DropDownOptionsData", AV39BookmarksData);
         ucDdo_bookmarks.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_bookmarks_Internalname, "DDO_BOOKMARKS_MPAGEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "MasterTopIconsCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_adminag.setProperty("Caption", Ddo_adminag_Caption);
         ucDdo_adminag.setProperty("Cls", Ddo_adminag_Cls);
         ucDdo_adminag.setProperty("DropDownOptionsData", AV5AdminAGData);
         ucDdo_adminag.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_adminag_Internalname, "DDO_ADMINAG_MPAGEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUcmenu.setProperty("SearchServiceUrl", Ucmenu_Searchserviceurl);
         ucUcmenu.setProperty("SearchMinChars", Ucmenu_Searchminchars);
         ucUcmenu.setProperty("SearchHelperDescription", Ucmenu_Searchhelperdescription);
         ucUcmenu.setProperty("SidebarMainClass", Ucmenu_Sidebarmainclass);
         ucUcmenu.setProperty("ScrollWidth", Ucmenu_Scrollwidth);
         ucUcmenu.setProperty("ScrollAlwaysVisible", Ucmenu_Scrollalwaysvisible);
         ucUcmenu.setProperty("HideScrollInCompactMenu", Ucmenu_Hidescrollincompactmenu);
         ucUcmenu.setProperty("FirstLevelIsGrouping", Ucmenu_Firstlevelisgrouping);
         ucUcmenu.setProperty("SidebarMenuOptionsData", AV10DVelop_Menu);
         ucUcmenu.setProperty("SidebarMenuUserData", AV42DVelop_Menu_UserData);
         ucUcmenu.render(context, "dvelop.gxbootstrap.sidebarmenu", Ucmenu_Internalname, "UCMENU_MPAGEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 page-content page-content-back-image CellTableContentWithFooter", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         /* Content placeholder */
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
         httpContext.writeText( ">") ;
         if ( ! isFullAjaxMode( ) )
         {
            getDataAreaObject().renderHtmlContent();
         }
         httpContext.writeText( "</div>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MasterFooterCellFixedVMSidebarImage page-content", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefooter_Internalname, divTablefooter_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "justify-content:flex-end;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfooter_Internalname, lblTextblockfooter_Caption, "", "", lblTextblockfooter_Jsonclick, "'"+""+"'"+",true,"+"'"+"e110g1_client"+"'", "", "FooterText", 7, "", 1, lblTextblockfooter_Enabled, 1, (short)(1), "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUcmessage.render(context, "dvelop.dvmessage", Ucmessage_Internalname, "UCMESSAGE_MPAGEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUctooltip.render(context, "dvelop.gxbootstrap.tooltip", Uctooltip_Internalname, "UCTOOLTIP_MPAGEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucWwputilities.setProperty("EnableFixObjectFitCover", Wwputilities_Enablefixobjectfitcover);
         ucWwputilities.setProperty("EnableFloatingLabels", Wwputilities_Enablefloatinglabels);
         ucWwputilities.setProperty("EnableUpdateRowSelectionStatus", Wwputilities_Enableupdaterowselectionstatus);
         ucWwputilities.setProperty("EnableConvertComboToBootstrapSelect", Wwputilities_Enableconvertcombotobootstrapselect);
         ucWwputilities.setProperty("AllowColumnResizing", Wwputilities_Allowcolumnresizing);
         ucWwputilities.setProperty("AllowColumnReordering", Wwputilities_Allowcolumnreordering);
         ucWwputilities.setProperty("AllowColumnDragging", Wwputilities_Allowcolumndragging);
         ucWwputilities.setProperty("AllowColumnsRestore", Wwputilities_Allowcolumnsrestore);
         ucWwputilities.render(context, "dvelop.workwithplusutilities_f5", Wwputilities_Internalname, "WWPUTILITIES_MPAGEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucWwpdatepicker.render(context, "wwp.datepicker", Wwpdatepicker_Internalname, "WWPDATEPICKER_MPAGEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJS_MPAGEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',true,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavPickerdummyvariable_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPickerdummyvariable_Internalname, localUtil.format(AV51PickerDummyVariable, "99/99/99"), localUtil.format( AV51PickerDummyVariable, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "", "", "", edtavPickerdummyvariable_Jsonclick, 0, "Invisible", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavPickerdummyvariable_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start0G2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup0G0( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( getDataAreaObject().executeStartEvent() != 0 )
         {
            httpContext.setAjaxCallMode();
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void ws0G2( )
   {
      start0G2( ) ;
      evt0G2( ) ;
   }

   public void evt0G2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "RFR_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DDO_BOOKMARKS_MPAGE.ONOPTIONCLICKED_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e120G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e130G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "DOENGLISHLINK_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoEnglishLink' */
                        e140G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "DOPORTUGUESELINK_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoPortugueseLink' */
                        e150G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "DOSPANISHLINK_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoSpanishLink' */
                        e160G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Refresh */
                        e170G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Load */
                        e180G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! wbErr )
                        {
                           Rfr0gs = false ;
                           if ( ! Rfr0gs )
                           {
                           }
                           dynload_actions( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               if ( httpContext.wbHandled == 0 )
               {
                  getDataAreaObject().dispatchEvents();
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we0G2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm0G2( ) ;
         }
      }
   }

   public void pa0G2( )
   {
      if ( nDonePA == 0 )
      {
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavPickerdummyvariable_Internalname ;
            httpContext.ajax_rsp_assign_attri("", true, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf0G2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rf0G2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ShowMPWhenPopUp( ) || ! httpContext.isPopUpObject( ) )
      {
         /* Execute user event: Refresh */
         e170G2 ();
         gxdyncontrolsrefreshing = true ;
         fix_multi_value_controls( ) ;
         gxdyncontrolsrefreshing = false ;
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e180G2 ();
         wb0G0( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
   }

   public void send_integrity_lvl_hashes0G2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup0G0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e130G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBOOKMARKSDATA_MPAGE"), AV39BookmarksData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vADMINAGDATA_MPAGE"), AV5AdminAGData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDVELOP_MENU_MPAGE"), AV10DVelop_Menu);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDVELOP_MENU_USERDATA_MPAGE"), AV42DVelop_Menu_UserData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vWWPCONTEXT_MPAGE"), AV69WWPContext);
         /* Read saved values. */
         Ddo_bookmarks_Icontype = httpContext.cgiGet( "DDO_BOOKMARKS_MPAGE_Icontype") ;
         Ddo_bookmarks_Icon = httpContext.cgiGet( "DDO_BOOKMARKS_MPAGE_Icon") ;
         Ddo_bookmarks_Tooltip = httpContext.cgiGet( "DDO_BOOKMARKS_MPAGE_Tooltip") ;
         Ddo_bookmarks_Cls = httpContext.cgiGet( "DDO_BOOKMARKS_MPAGE_Cls") ;
         Ddo_bookmarks_Titlecontrolalign = httpContext.cgiGet( "DDO_BOOKMARKS_MPAGE_Titlecontrolalign") ;
         Ddo_adminag_Icon = httpContext.cgiGet( "DDO_ADMINAG_MPAGE_Icon") ;
         Ddo_adminag_Cls = httpContext.cgiGet( "DDO_ADMINAG_MPAGE_Cls") ;
         Ddo_adminag_Titlecontrolalign = httpContext.cgiGet( "DDO_ADMINAG_MPAGE_Titlecontrolalign") ;
         Ucmenu_Searchserviceurl = httpContext.cgiGet( "UCMENU_MPAGE_Searchserviceurl") ;
         Ucmenu_Searchminchars = (int)(localUtil.ctol( httpContext.cgiGet( "UCMENU_MPAGE_Searchminchars"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ucmenu_Searchhelperdescription = httpContext.cgiGet( "UCMENU_MPAGE_Searchhelperdescription") ;
         Ucmenu_Sidebarmainclass = httpContext.cgiGet( "UCMENU_MPAGE_Sidebarmainclass") ;
         Ucmenu_Scrollwidth = (int)(localUtil.ctol( httpContext.cgiGet( "UCMENU_MPAGE_Scrollwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ucmenu_Scrollalwaysvisible = GXutil.strtobool( httpContext.cgiGet( "UCMENU_MPAGE_Scrollalwaysvisible")) ;
         Ucmenu_Hidescrollincompactmenu = GXutil.strtobool( httpContext.cgiGet( "UCMENU_MPAGE_Hidescrollincompactmenu")) ;
         Ucmenu_Firstlevelisgrouping = GXutil.strtobool( httpContext.cgiGet( "UCMENU_MPAGE_Firstlevelisgrouping")) ;
         Wwputilities_Enablefixobjectfitcover = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITIES_MPAGE_Enablefixobjectfitcover")) ;
         Wwputilities_Enablefloatinglabels = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITIES_MPAGE_Enablefloatinglabels")) ;
         Wwputilities_Enableupdaterowselectionstatus = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITIES_MPAGE_Enableupdaterowselectionstatus")) ;
         Wwputilities_Enableconvertcombotobootstrapselect = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITIES_MPAGE_Enableconvertcombotobootstrapselect")) ;
         Wwputilities_Allowcolumnresizing = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITIES_MPAGE_Allowcolumnresizing")) ;
         Wwputilities_Allowcolumnreordering = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITIES_MPAGE_Allowcolumnreordering")) ;
         Wwputilities_Allowcolumndragging = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITIES_MPAGE_Allowcolumndragging")) ;
         Wwputilities_Allowcolumnsrestore = GXutil.strtobool( httpContext.cgiGet( "WWPUTILITIES_MPAGE_Allowcolumnsrestore")) ;
         Ddo_bookmarks_Activeeventkey = httpContext.cgiGet( "DDO_BOOKMARKS_MPAGE_Activeeventkey") ;
         (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setCaption( httpContext.cgiGet( "FORM_MPAGE_Caption") );
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavPickerdummyvariable_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vPICKERDUMMYVARIABLE_MPAGE");
            GX_FocusControl = edtavPickerdummyvariable_Internalname ;
            httpContext.ajax_rsp_assign_attri("", true, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51PickerDummyVariable = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", true, "AV51PickerDummyVariable", localUtil.format(AV51PickerDummyVariable, "99/99/99"));
         }
         else
         {
            AV51PickerDummyVariable = localUtil.ctod( httpContext.cgiGet( edtavPickerdummyvariable_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", true, "AV51PickerDummyVariable", localUtil.format(AV51PickerDummyVariable, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e130G2 ();
      if (returnInSub) return;
   }

   public void e130G2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV55Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      workwithplusmasterpage_impl.this.GXt_char1 = GXv_char2[0] ;
      AV55Station = GXt_char1 ;
      GXv_char2[0] = AV56EmprCod ;
      GXv_char3[0] = AV57EmprNom ;
      GXv_char4[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV55Station, GXv_char2, GXv_char3, GXv_char4) ;
      workwithplusmasterpage_impl.this.AV56EmprCod = GXv_char2[0] ;
      workwithplusmasterpage_impl.this.AV57EmprNom = GXv_char3[0] ;
      workwithplusmasterpage_impl.this.AV59UsurCod = GXv_char4[0] ;
      AV39BookmarksData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle) ;
      AV40BookmarksDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
      AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "Bookmark Page", "") );
      AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "fas fa-star FontIconTopRightActions" );
      AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( "Dummy" );
      AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
      AV39BookmarksData.add(AV40BookmarksDataItem, 0);
      Ddo_adminag_Icon = httpContext.convertURL( context.getHttpContext().getImagePath( "a8e64609-d2a6-4834-b32c-e2cbea9cf2b8", "", context.getHttpContext().getTheme( ))) ;
      ucDdo_adminag.sendProperty(context, "", true, Ddo_adminag_Internalname, "Icon", Ddo_adminag_Icon);
      /* * Property gximage not supported in */
      /* * Property gximage not supported in */
      /* * Property gximage not supported in */
      /* * Property gximage not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('"userInfoMaterial"',3) ]
         Target    : [ t([ t('Ddo_adminag',3),t('Icon',3) ],29),t(gximage,3) ]
         ForType   : 29
         Type      : []
      */
      AV5AdminAGData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle) ;
      AV6AdminAGDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
      AV6AdminAGDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "Cerrar Sesión", "") );
      AV6AdminAGDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "fa fa-asterisk FontIconTopRightActions" );
      AV6AdminAGDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( "Action" );
      AV6AdminAGDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
      AV5AdminAGData.add(AV6AdminAGDataItem, 0);
      AV66ret = (short)(httpContext.setTheme( "WorkWithPlusThemeDS")) ;
      GXv_SdtWWPContext5[0] = AV69WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV69WWPContext = GXv_SdtWWPContext5[0] ;
      GXv_char4[0] = AV68Version ;
      GXv_char3[0] = AV70Build ;
      GXv_char2[0] = AV67Release ;
      new app.devops.getmirrorversion(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      workwithplusmasterpage_impl.this.AV68Version = GXv_char4[0] ;
      workwithplusmasterpage_impl.this.AV70Build = GXv_char3[0] ;
      workwithplusmasterpage_impl.this.AV67Release = GXv_char2[0] ;
      lblTextblockfooter_Caption = AV68Version ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblockfooter_Internalname, "Caption", lblTextblockfooter_Caption, true);
      if ( GXutil.strcmp(AV69WWPContext.getgxTv_SdtWWPContext_Userid(), "ADMIN") == 0 )
      {
         lblTextblockfooter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", true, lblTextblockfooter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTextblockfooter_Enabled), 5, 0), true);
      }
      else
      {
         lblTextblockfooter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", true, lblTextblockfooter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTextblockfooter_Enabled), 5, 0), true);
      }
      GXt_int6 = (byte)(AV58moda21) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV56EmprCod, httpContext.getMessage( "MOPM21", ""), GXv_int7) ;
      workwithplusmasterpage_impl.this.GXt_int6 = GXv_int7[0] ;
      AV58moda21 = GXt_int6 ;
      GXt_int6 = AV60ingmnu ;
      GXv_int7[0] = GXt_int6 ;
      new app.anticipacionerrores.parametroget(remoteHandle, context).execute( AV56EmprCod, "INGMNU", GXv_int7) ;
      workwithplusmasterpage_impl.this.GXt_int6 = GXv_int7[0] ;
      AV60ingmnu = GXt_int6 ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta().addItem(httpContext.getMessage( "viewport", ""), httpContext.getMessage( "width=device-width,initial-scale=1.0", ""), (short)(0)) ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta().addItem("apple-mobile-web-app-capable", httpContext.getMessage( "yes", ""), (short)(0)) ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setHeaderrawhtml( "<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\""+httpContext.convertURL( context.getHttpContext().getImagePath( "56c9f488-047e-4774-a6ed-0f55eb1456ec", "", context.getHttpContext().getTheme( )))+"\">" );
      divLayoutmaintable_Class = "MainContainerWithFooter" ;
      httpContext.ajax_rsp_assign_prop("", true, divLayoutmaintable_Internalname, "Class", divLayoutmaintable_Class, true);
      AV52CadenaAutenticacion = AV13WebSession.getValue("TexplusNET_Autentication") ;
      AV53SdtAutenticacion.fromJSonString(AV52CadenaAutenticacion, null);
      if ( (GXutil.strcmp("", AV53SdtAutenticacion.getgxTv_SdtSDTAutenticacion_Cadena03())==0) )
      {
         callWebObject(formatLink("app.login", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      AV63pgmname_object = Contentholder.getPgmname() ;
      AV54CadenaComunicacionKbExterna = AV13WebSession.getValue("TexplusNET_ComunicacionKbExterna") ;
      if ( ! ( GXutil.strcmp(AV54CadenaComunicacionKbExterna, "registrado") == 0 ) )
      {
         if ( ! (0==AV58moda21) )
         {
            GXt_objcol_SdtDVelop_Menu_Item8 = AV10DVelop_Menu ;
            GXv_objcol_SdtDVelop_Menu_Item9[0] = GXt_objcol_SdtDVelop_Menu_Item8 ;
            new app.pget_dvelopmenu(remoteHandle, context).execute( AV59UsurCod, GXv_objcol_SdtDVelop_Menu_Item9) ;
            GXt_objcol_SdtDVelop_Menu_Item8 = GXv_objcol_SdtDVelop_Menu_Item9[0] ;
            AV10DVelop_Menu = GXt_objcol_SdtDVelop_Menu_Item8 ;
         }
         else if ( ! (0==AV60ingmnu) )
         {
            GXt_objcol_SdtDVelop_Menu_Item8 = AV10DVelop_Menu ;
            GXv_objcol_SdtDVelop_Menu_Item9[0] = GXt_objcol_SdtDVelop_Menu_Item8 ;
            new app.anticipacionerrores.pget_dvelopmenuid(remoteHandle, context).execute( AV59UsurCod, GXv_objcol_SdtDVelop_Menu_Item9) ;
            GXt_objcol_SdtDVelop_Menu_Item8 = GXv_objcol_SdtDVelop_Menu_Item9[0] ;
            AV10DVelop_Menu = GXt_objcol_SdtDVelop_Menu_Item8 ;
         }
         else
         {
            GXt_objcol_SdtDVelop_Menu_Item8 = AV10DVelop_Menu ;
            GXv_objcol_SdtDVelop_Menu_Item9[0] = GXt_objcol_SdtDVelop_Menu_Item8 ;
            new app.anticipacionerrores.pget_dvelopmenuid(remoteHandle, context).execute( AV59UsurCod, GXv_objcol_SdtDVelop_Menu_Item9) ;
            GXt_objcol_SdtDVelop_Menu_Item8 = GXv_objcol_SdtDVelop_Menu_Item9[0] ;
            AV10DVelop_Menu = GXt_objcol_SdtDVelop_Menu_Item8 ;
         }
      }
      else
      {
         AV10DVelop_Menu.clear();
      }
      divTablefooter_Visible = ((!(GXutil.strcmp(AV54CadenaComunicacionKbExterna, "registrado")==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", true, divTablefooter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablefooter_Visible), 5, 0), true);
      lblTextblocktitle_Visible = ((!(GXutil.strcmp(AV54CadenaComunicacionKbExterna, "registrado")==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblocktitle_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTextblocktitle_Visible), 5, 0), true);
      Ddo_adminag_Titlecontrolalign = "Left" ;
      ucDdo_adminag.sendProperty(context, "", true, Ddo_adminag_Internalname, "TitleControlAlign", Ddo_adminag_Titlecontrolalign);
      AV11AdminAGDataIndex = (short)(1) ;
      GXv_char4[0] = AV12Language ;
      if ( new app.wwpbaseobjects.wwp_loadlanguageandtheme(remoteHandle, context).executeUdp( GXv_char4) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      workwithplusmasterpage_impl.this.AV12Language = GXv_char4[0] ;
      if ( Cond_result )
      {
         httpContext.doAjaxRefresh();
      }
      bttBtnenglishlink_Class = "ButtonAsLink" ;
      httpContext.ajax_rsp_assign_prop("", true, bttBtnenglishlink_Internalname, "Class", bttBtnenglishlink_Class, true);
      bttBtnportugueselink_Class = "ButtonAsLink" ;
      httpContext.ajax_rsp_assign_prop("", true, bttBtnportugueselink_Internalname, "Class", bttBtnportugueselink_Class, true);
      bttBtnspanishlink_Class = "ButtonAsLink" ;
      httpContext.ajax_rsp_assign_prop("", true, bttBtnspanishlink_Internalname, "Class", bttBtnspanishlink_Class, true);
      if ( GXutil.strcmp(AV12Language, "English") == 0 )
      {
         bttBtnenglishlink_Class = "ButtonAsLinkBold" ;
         httpContext.ajax_rsp_assign_prop("", true, bttBtnenglishlink_Internalname, "Class", bttBtnenglishlink_Class, true);
      }
      else if ( GXutil.strcmp(AV12Language, "Portuguese") == 0 )
      {
         bttBtnportugueselink_Class = "ButtonAsLinkBold" ;
         httpContext.ajax_rsp_assign_prop("", true, bttBtnportugueselink_Internalname, "Class", bttBtnportugueselink_Class, true);
      }
      else if ( GXutil.strcmp(AV12Language, "Spanish") == 0 )
      {
         bttBtnspanishlink_Class = "ButtonAsLinkBold" ;
         httpContext.ajax_rsp_assign_prop("", true, bttBtnspanishlink_Internalname, "Class", bttBtnspanishlink_Class, true);
      }
      Ddo_bookmarks_Tooltip = httpContext.getMessage( "WWP_Bookmark_Tooltip", "") ;
      ucDdo_bookmarks.sendProperty(context, "", true, Ddo_bookmarks_Internalname, "Tooltip", Ddo_bookmarks_Tooltip);
      Ddo_bookmarks_Titlecontrolalign = "Left" ;
      ucDdo_bookmarks.sendProperty(context, "", true, Ddo_bookmarks_Internalname, "TitleControlAlign", Ddo_bookmarks_Titlecontrolalign);
      if ( GXutil.strcmp(AV50Httprequest.getMethod(), "GET") == 0 )
      {
         GXt_SdtWWP_DesignSystemSettings10 = AV65WWP_DesignSystemSettings;
         GXv_SdtWWP_DesignSystemSettings11[0] = GXt_SdtWWP_DesignSystemSettings10;
         new app.wwpbaseobjects.wwp_getdesignsystemsettings(remoteHandle, context).execute( GXv_SdtWWP_DesignSystemSettings11) ;
         GXt_SdtWWP_DesignSystemSettings10 = GXv_SdtWWP_DesignSystemSettings11[0] ;
         AV65WWP_DesignSystemSettings = GXt_SdtWWP_DesignSystemSettings10;
         this.executeExternalObjectMethod("", true, "gx.core.ds", "setOption", new Object[] {"base-color",AV65WWP_DesignSystemSettings.getgxTv_SdtWWP_DesignSystemSettings_Basecolor()}, false);
         this.executeExternalObjectMethod("", true, "gx.core.ds", "setOption", new Object[] {"background-color",AV65WWP_DesignSystemSettings.getgxTv_SdtWWP_DesignSystemSettings_Backgroundstyle()}, false);
         this.executeExternalObjectMethod("", true, "gx.core.ds", "setOption", new Object[] {"menu-color",AV65WWP_DesignSystemSettings.getgxTv_SdtWWP_DesignSystemSettings_Menucolor()}, false);
         this.executeExternalObjectMethod("", true, "WWPActions", "EmpoweredGrids_Refresh", new Object[] {}, false);
      }
   }

   public void e140G2( )
   {
      /* 'DoEnglishLink' Routine */
      returnInSub = false ;
      if ( setLanguage( "English") == 0 )
      {
         AV13WebSession.setValue("isLangLoaded", "true");
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e150G2( )
   {
      /* 'DoPortugueseLink' Routine */
      returnInSub = false ;
      if ( setLanguage( "Portuguese") == 0 )
      {
         AV13WebSession.setValue("isLangLoaded", "true");
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e160G2( )
   {
      /* 'DoSpanishLink' Routine */
      returnInSub = false ;
      if ( setLanguage( "Spanish") == 0 )
      {
         AV13WebSession.setValue("isLangLoaded", "true");
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e120G2( )
   {
      /* Ddo_bookmarks_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_bookmarks_Activeeventkey, "Dummy") == 0 )
      {
         /* Execute user subroutine: 'DO DUMMY' */
         S112 ();
         if (returnInSub) return;
      }
      if ( GXutil.strcmp(Ddo_bookmarks_Activeeventkey, "AddBookmark") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.editbookmark", new String[] {GXutil.URLEncode(GXutil.rtrim(AV50Httprequest.getBaseURL()+AV50Httprequest.getScriptName())),GXutil.URLEncode(GXutil.rtrim(AV48ProgramDescription))}, new String[] {"InBookmarkURL","BookmarkPageDescription"}) , new Object[] {"","",});
      }
      else if ( GXutil.strcmp(Ddo_bookmarks_Activeeventkey, "ManageBookmarks") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("AppBookmarks"))}, new String[] {"UserKey"}) , new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DO DUMMY' Routine */
      returnInSub = false ;
   }

   public void S122( )
   {
      /* 'DO ACTION' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.login", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e170G2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      lblTextblocktitle_Caption = (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getCaption() ;
      httpContext.ajax_rsp_assign_prop("", true, lblTextblocktitle_Internalname, "Caption", lblTextblocktitle_Caption, true);
      /* Execute user subroutine: 'LOADBOOKMARKS' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", true, "AV39BookmarksData", AV39BookmarksData);
   }

   public void S132( )
   {
      /* 'LOADBOOKMARKS' Routine */
      returnInSub = false ;
      AV39BookmarksData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle) ;
      AV40BookmarksDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
      AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( "AddBookmark" );
      AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
      AV39BookmarksData.add(AV40BookmarksDataItem, 0);
      AV48ProgramDescription = Contentholder.getPgmdesc() ;
      httpContext.ajax_rsp_assign_attri("", true, "AV48ProgramDescription", AV48ProgramDescription);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROGRAMDESCRIPTION_MPAGE", getSecureSignedToken( "gxmpage_", GXutil.rtrim( localUtil.format( AV48ProgramDescription, ""))));
      AV44CurrentURL = AV50Httprequest.getBaseURL() + AV50Httprequest.getScriptName() ;
      AV45GridStateCollection.fromxml(new app.wwpbaseobjects.loadmanagefiltersstate(remoteHandle, context).executeUdp( "AppBookmarks"), null, null);
      AV43BookmarkFound = false ;
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV45GridStateCollection.size() )
      {
         AV46GridStateCollectionItem = (app.wwpbaseobjects.SdtGridStateCollection_Item)((app.wwpbaseobjects.SdtGridStateCollection_Item)AV45GridStateCollection.elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV46GridStateCollectionItem.getgxTv_SdtGridStateCollection_Item_Gridstatexml(), AV44CurrentURL) == 0 )
         {
            AV48ProgramDescription = AV46GridStateCollectionItem.getgxTv_SdtGridStateCollection_Item_Title() ;
            httpContext.ajax_rsp_assign_attri("", true, "AV48ProgramDescription", AV48ProgramDescription);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROGRAMDESCRIPTION_MPAGE", getSecureSignedToken( "gxmpage_", GXutil.rtrim( localUtil.format( AV48ProgramDescription, ""))));
            AV43BookmarkFound = true ;
            if (true) break;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
      }
      if ( AV43BookmarkFound )
      {
         this.executeUsercontrolMethod("", true, "DDO_BOOKMARKS_MPAGEContainer", "Update", "", new Object[] {"","fas fa-star "+"FontColorIconBookmarkTitleAdded"});
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "Edit bookmark for this page", "") );
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "fas fa-star "+"FontColorIconBookmarkAdded" );
      }
      else
      {
         this.executeUsercontrolMethod("", true, "DDO_BOOKMARKS_MPAGEContainer", "Update", "", new Object[] {"","far fa-star "+"FontColorIconBookmarkTitle"});
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "Bookmark this page", "") );
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "far fa-star "+"FontColorIconBookmark" );
      }
      if ( AV45GridStateCollection.size() > 0 )
      {
         AV40BookmarksDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( true );
         AV39BookmarksData.add(AV40BookmarksDataItem, 0);
         AV76GXV2 = 1 ;
         while ( AV76GXV2 <= AV45GridStateCollection.size() )
         {
            AV46GridStateCollectionItem = (app.wwpbaseobjects.SdtGridStateCollection_Item)((app.wwpbaseobjects.SdtGridStateCollection_Item)AV45GridStateCollection.elementAt(-1+AV76GXV2));
            AV40BookmarksDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
            AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( AV46GridStateCollectionItem.getgxTv_SdtGridStateCollection_Item_Title() );
            AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Link( AV46GridStateCollectionItem.getgxTv_SdtGridStateCollection_Item_Gridstatexml() );
            GXt_char1 = AV49FontIcon ;
            GXv_char4[0] = GXt_char1 ;
            new app.wwpbaseobjects.getbookmarkfonticon(remoteHandle, context).execute( GXutil.strReplace( AV46GridStateCollectionItem.getgxTv_SdtGridStateCollection_Item_Gridstatexml(), AV50Httprequest.getBaseURL(), ""), AV10DVelop_Menu, GXv_char4) ;
            workwithplusmasterpage_impl.this.GXt_char1 = GXv_char4[0] ;
            AV49FontIcon = GXt_char1 ;
            AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( ((GXutil.strcmp(AV49FontIcon, "")==0) ? "FontColorIconBookmark fas fa-link" : "FontColorIconBookmark"+" "+AV49FontIcon) );
            AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
            AV39BookmarksData.add(AV40BookmarksDataItem, 0);
            AV47IndexToAddItems = (short)(AV47IndexToAddItems+1) ;
            httpContext.ajax_rsp_assign_attri("", true, "AV47IndexToAddItems", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47IndexToAddItems), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINDEXTOADDITEMS_MPAGE", getSecureSignedToken( "gxmpage_", localUtil.format( DecimalUtil.doubleToDec(AV47IndexToAddItems), "ZZZ9")));
            AV76GXV2 = (int)(AV76GXV2+1) ;
         }
         AV40BookmarksDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( true );
         AV39BookmarksData.add(AV40BookmarksDataItem, 0);
         AV40BookmarksDataItem = (app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item)new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Title( httpContext.getMessage( "Bookmark manager", "") );
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Fonticon( "fas fa-cog "+"FontColorIconBookmark" );
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Eventkey( "ManageBookmarks" );
         AV40BookmarksDataItem.setgxTv_SdtDVB_SDTDropDownOptionsData_Item_Isdivider( false );
         AV39BookmarksData.add(AV40BookmarksDataItem, 0);
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e180G2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_18_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblShowmenu_Internalname, httpContext.getMessage( "<i class=\"fas fa-bars FontIconMenu\"></i>", ""), "", "", lblShowmenu_Jsonclick, "'"+""+"'"+",true,"+"'"+"e190g1_client"+"'", "", "TextBlock", 7, "", 1, 1, 0, (short)(1), "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktitle_Internalname, lblTextblocktitle_Caption, "", "", lblTextblocktitle_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockTitleMaterial", 0, "", lblTextblocktitle_Visible, 1, 0, (short)(0), "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_18_0G2e( true) ;
      }
      else
      {
         wb_table2_18_0G2e( false) ;
      }
   }

   public void wb_table1_11_0G2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "TableLogo page-content", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "ImageTopHeader" + " " + ((GXutil.strcmp(imgHeader_gximage, "")==0) ? "GX_Image_LogoIcon1_Class" : "GX_Image_"+imgHeader_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "516aa93f-ad9b-43f5-a189-6b90a719949d", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgHeader_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblLogodsc_Internalname, httpContext.getMessage( "TEXPLUS", ""), "", "", lblLogodsc_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockLogo", 0, "", 1, 1, 0, (short)(0), "HLP_WWPBaseObjects\\WorkWithPlusMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_11_0G2e( true) ;
      }
      else
      {
         wb_table1_11_0G2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa0G2( ) ;
      ws0G2( ) ;
      we0G2( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void master_styles( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVMessage/DVMessage.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/fontawesome_v5/css/fontawesome.min.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/fontawesome_v5/css/all.min.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Shared/daterangepicker/daterangepicker.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().item(idxLst)), "?20269141425569", true, true);
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
      httpContext.AddJavascriptSource("wwpbaseobjects/workwithplusmasterpage.js", "?20269141425569", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/slimscroll/jquery.slimscroll.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/SidebarMenu/BootstrapSidebarMenuRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVMessage/pnotify.custom.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVMessage/DVMessageRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Tooltip/BootstrapTooltipRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Mask/jquery.mask.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/WorkWithPlusUtilities/BootstrapSelect.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/WorkWithPlusUtilities/WorkWithPlusUtilitiesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DatePicker/DatePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgHeader_Internalname = "HEADER_MPAGE" ;
      lblLogodsc_Internalname = "LOGODSC_MPAGE" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2_MPAGE" ;
      lblShowmenu_Internalname = "SHOWMENU_MPAGE" ;
      lblTextblocktitle_Internalname = "TEXTBLOCKTITLE_MPAGE" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3_MPAGE" ;
      bttBtnenglishlink_Internalname = "BTNENGLISHLINK_MPAGE" ;
      bttBtnportugueselink_Internalname = "BTNPORTUGUESELINK_MPAGE" ;
      bttBtnspanishlink_Internalname = "BTNSPANISHLINK_MPAGE" ;
      Ddo_bookmarks_Internalname = "DDO_BOOKMARKS_MPAGE" ;
      Ddo_adminag_Internalname = "DDO_ADMINAG_MPAGE" ;
      divTableuserrole_Internalname = "TABLEUSERROLE_MPAGE" ;
      divTableheader_Internalname = "TABLEHEADER_MPAGE" ;
      Ucmenu_Internalname = "UCMENU_MPAGE" ;
      divTablecontent_Internalname = "TABLECONTENT_MPAGE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1_MPAGE" ;
      lblTextblockfooter_Internalname = "TEXTBLOCKFOOTER_MPAGE" ;
      divTablefooter_Internalname = "TABLEFOOTER_MPAGE" ;
      Ucmessage_Internalname = "UCMESSAGE_MPAGE" ;
      Uctooltip_Internalname = "UCTOOLTIP_MPAGE" ;
      Wwputilities_Internalname = "WWPUTILITIES_MPAGE" ;
      Wwpdatepicker_Internalname = "WWPDATEPICKER_MPAGE" ;
      Datamonjs_Internalname = "DATAMONJS_MPAGE" ;
      divTablemain_Internalname = "TABLEMAIN_MPAGE" ;
      edtavPickerdummyvariable_Internalname = "vPICKERDUMMYVARIABLE_MPAGE" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS_MPAGE" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE_MPAGE" ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setInternalname( "FORM_MPAGE" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      lblTextblocktitle_Visible = 1 ;
      lblTextblocktitle_Caption = httpContext.getMessage( " Title", "") ;
      edtavPickerdummyvariable_Jsonclick = "" ;
      lblTextblockfooter_Caption = httpContext.getMessage( "DatamonPlus - copyright 2025 (Revisión 20250714 (U650))", "") ;
      lblTextblockfooter_Enabled = 1 ;
      divTablefooter_Visible = 1 ;
      bttBtnspanishlink_Class = "ButtonAsLink" ;
      bttBtnportugueselink_Class = "ButtonAsLink" ;
      bttBtnenglishlink_Class = "ButtonAsLink" ;
      divLayoutmaintable_Class = "Table" ;
      Wwputilities_Allowcolumnsrestore = GXutil.toBoolean( -1) ;
      Wwputilities_Allowcolumndragging = GXutil.toBoolean( -1) ;
      Wwputilities_Allowcolumnreordering = GXutil.toBoolean( -1) ;
      Wwputilities_Allowcolumnresizing = GXutil.toBoolean( -1) ;
      Wwputilities_Enableconvertcombotobootstrapselect = GXutil.toBoolean( -1) ;
      Wwputilities_Enableupdaterowselectionstatus = GXutil.toBoolean( -1) ;
      Wwputilities_Enablefloatinglabels = GXutil.toBoolean( -1) ;
      Wwputilities_Enablefixobjectfitcover = GXutil.toBoolean( -1) ;
      Ucmenu_Firstlevelisgrouping = GXutil.toBoolean( -1) ;
      Ucmenu_Hidescrollincompactmenu = GXutil.toBoolean( 0) ;
      Ucmenu_Scrollalwaysvisible = GXutil.toBoolean( -1) ;
      Ucmenu_Scrollwidth = 5 ;
      Ucmenu_Sidebarmainclass = "page-sidebar sidebar-fixed sidebar-back-image" ;
      Ucmenu_Searchhelperdescription = "WWP_SearchMenuOption" ;
      Ucmenu_Searchminchars = 0 ;
      Ucmenu_Searchserviceurl = "xxx" ;
      Ddo_adminag_Titlecontrolalign = "Automatic" ;
      Ddo_adminag_Cls = "ActionGroupHeader" ;
      Ddo_adminag_Icon = "" ;
      Ddo_bookmarks_Titlecontrolalign = "Automatic" ;
      Ddo_bookmarks_Cls = "DropDownOptionsNoBackHover" ;
      Ddo_bookmarks_Tooltip = "" ;
      Ddo_bookmarks_Icon = "far fa-star" ;
      Ddo_bookmarks_Icontype = "FontIcon" ;
      Contentholder.setDataArea(getDataAreaObject());
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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
      setEventMetadata("REFRESH_MPAGE","{handler:'refresh',iparms:[{ctrl:'FORM_MPAGE',prop:'Caption'},{av:'AV50Httprequest.getBaseURL()',ctrl:'vHTTPREQUEST_MPAGE',prop:'Baseurl'},{av:'AV10DVelop_Menu',fld:'vDVELOP_MENU_MPAGE',pic:''},{av:'AV48ProgramDescription',fld:'vPROGRAMDESCRIPTION_MPAGE',pic:'',hsh:true},{av:'AV69WWPContext',fld:'vWWPCONTEXT_MPAGE',pic:'',hsh:true},{av:'AV47IndexToAddItems',fld:'vINDEXTOADDITEMS_MPAGE',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH_MPAGE",",oparms:[{av:'lblTextblocktitle_Caption',ctrl:'TEXTBLOCKTITLE_MPAGE',prop:'Caption'},{av:'AV39BookmarksData',fld:'vBOOKMARKSDATA_MPAGE',pic:''},{av:'AV48ProgramDescription',fld:'vPROGRAMDESCRIPTION_MPAGE',pic:'',hsh:true},{av:'AV47IndexToAddItems',fld:'vINDEXTOADDITEMS_MPAGE',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("DOENGLISHLINK_MPAGE","{handler:'e140G2',iparms:[]");
      setEventMetadata("DOENGLISHLINK_MPAGE",",oparms:[]}");
      setEventMetadata("DOPORTUGUESELINK_MPAGE","{handler:'e150G2',iparms:[]");
      setEventMetadata("DOPORTUGUESELINK_MPAGE",",oparms:[]}");
      setEventMetadata("DOSPANISHLINK_MPAGE","{handler:'e160G2',iparms:[]");
      setEventMetadata("DOSPANISHLINK_MPAGE",",oparms:[]}");
      setEventMetadata("DDO_BOOKMARKS_MPAGE.ONOPTIONCLICKED_MPAGE","{handler:'e120G2',iparms:[{av:'Ddo_bookmarks_Activeeventkey',ctrl:'DDO_BOOKMARKS_MPAGE',prop:'ActiveEventKey'},{av:'AV50Httprequest.getBaseURL()',ctrl:'vHTTPREQUEST_MPAGE',prop:'Baseurl'},{av:'AV48ProgramDescription',fld:'vPROGRAMDESCRIPTION_MPAGE',pic:'',hsh:true}]");
      setEventMetadata("DDO_BOOKMARKS_MPAGE.ONOPTIONCLICKED_MPAGE",",oparms:[{av:'AV50Httprequest.getBaseURL()',ctrl:'vHTTPREQUEST_MPAGE',prop:'Baseurl'}]}");
      setEventMetadata("DOSHOWMENU_MPAGE","{handler:'e190G1',iparms:[]");
      setEventMetadata("DOSHOWMENU_MPAGE",",oparms:[]}");
      setEventMetadata("TEXTBLOCKFOOTER_MPAGE.CLICK_MPAGE","{handler:'e110G1',iparms:[{av:'AV69WWPContext',fld:'vWWPCONTEXT_MPAGE',pic:'',hsh:true}]");
      setEventMetadata("TEXTBLOCKFOOTER_MPAGE.CLICK_MPAGE",",oparms:[]}");
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
      Contentholder = new com.genexus.webpanels.GXDataAreaControl();
      Ddo_bookmarks_Activeeventkey = "" ;
      AV50Httprequest = httpContext.getHttpRequest();
      Ddo_adminag_Activeeventkey = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      AV48ProgramDescription = "" ;
      AV69WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXKey = "" ;
      AV39BookmarksData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV5AdminAGData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV10DVelop_Menu = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "Item", "TexplusNET", remoteHandle);
      AV42DVelop_Menu_UserData = new app.wwpbaseobjects.SdtDVelop_Menu_UserData(remoteHandle, context);
      sPrefix = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnenglishlink_Jsonclick = "" ;
      bttBtnportugueselink_Jsonclick = "" ;
      bttBtnspanishlink_Jsonclick = "" ;
      ucDdo_bookmarks = new com.genexus.webpanels.GXUserControl();
      Ddo_bookmarks_Caption = "" ;
      ucDdo_adminag = new com.genexus.webpanels.GXUserControl();
      Ddo_adminag_Caption = "" ;
      ucUcmenu = new com.genexus.webpanels.GXUserControl();
      lblTextblockfooter_Jsonclick = "" ;
      ucUcmessage = new com.genexus.webpanels.GXUserControl();
      ucUctooltip = new com.genexus.webpanels.GXUserControl();
      ucWwputilities = new com.genexus.webpanels.GXUserControl();
      ucWwpdatepicker = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV51PickerDummyVariable = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GX_FocusControl = "" ;
      AV55Station = "" ;
      AV56EmprCod = "" ;
      AV57EmprNom = "" ;
      AV59UsurCod = "" ;
      AV40BookmarksDataItem = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
      AV6AdminAGDataItem = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV68Version = "" ;
      AV70Build = "" ;
      GXv_char3 = new String[1] ;
      AV67Release = "" ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new byte[1] ;
      AV52CadenaAutenticacion = "" ;
      AV13WebSession = httpContext.getWebSession();
      AV53SdtAutenticacion = new app.wwpbaseobjects.SdtSDTAutenticacion(remoteHandle, context);
      AV63pgmname_object = "" ;
      AV54CadenaComunicacionKbExterna = "" ;
      GXt_objcol_SdtDVelop_Menu_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item>(app.wwpbaseobjects.SdtDVelop_Menu_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtDVelop_Menu_Item9 = new GXBaseCollection[1] ;
      AV12Language = "" ;
      AV65WWP_DesignSystemSettings = new app.wwpbaseobjects.SdtWWP_DesignSystemSettings(remoteHandle, context);
      GXt_SdtWWP_DesignSystemSettings10 = new app.wwpbaseobjects.SdtWWP_DesignSystemSettings(remoteHandle, context);
      GXv_SdtWWP_DesignSystemSettings11 = new app.wwpbaseobjects.SdtWWP_DesignSystemSettings[1] ;
      AV44CurrentURL = "" ;
      AV45GridStateCollection = new GXBaseCollection<app.wwpbaseobjects.SdtGridStateCollection_Item>(app.wwpbaseobjects.SdtGridStateCollection_Item.class, "Item", "", remoteHandle);
      AV46GridStateCollectionItem = new app.wwpbaseobjects.SdtGridStateCollection_Item(remoteHandle, context);
      AV49FontIcon = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      sStyleString = "" ;
      lblShowmenu_Jsonclick = "" ;
      lblTextblocktitle_Jsonclick = "" ;
      imgHeader_gximage = "" ;
      sImgUrl = "" ;
      lblLogodsc_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sDynURL = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private byte nDonePA ;
   private byte AV60ingmnu ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte nGotPars ;
   private byte nGXWrapped ;
   private short AV47IndexToAddItems ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV66ret ;
   private short AV58moda21 ;
   private short AV11AdminAGDataIndex ;
   private int Ucmenu_Searchminchars ;
   private int Ucmenu_Scrollwidth ;
   private int divTablefooter_Visible ;
   private int lblTextblockfooter_Enabled ;
   private int lblTextblocktitle_Visible ;
   private int AV75GXV1 ;
   private int AV76GXV2 ;
   private int idxLst ;
   private String Ddo_bookmarks_Activeeventkey ;
   private String Ddo_adminag_Activeeventkey ;
   private String GXKey ;
   private String Ddo_bookmarks_Icontype ;
   private String Ddo_bookmarks_Icon ;
   private String Ddo_bookmarks_Tooltip ;
   private String Ddo_bookmarks_Cls ;
   private String Ddo_bookmarks_Titlecontrolalign ;
   private String Ddo_adminag_Icon ;
   private String Ddo_adminag_Cls ;
   private String Ddo_adminag_Titlecontrolalign ;
   private String Ucmenu_Searchserviceurl ;
   private String Ucmenu_Searchhelperdescription ;
   private String Ucmenu_Sidebarmainclass ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divLayoutmaintable_Class ;
   private String divTablemain_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableuserrole_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String bttBtnenglishlink_Class ;
   private String StyleString ;
   private String bttBtnenglishlink_Internalname ;
   private String bttBtnenglishlink_Jsonclick ;
   private String bttBtnportugueselink_Class ;
   private String bttBtnportugueselink_Internalname ;
   private String bttBtnportugueselink_Jsonclick ;
   private String bttBtnspanishlink_Class ;
   private String bttBtnspanishlink_Internalname ;
   private String bttBtnspanishlink_Jsonclick ;
   private String Ddo_bookmarks_Caption ;
   private String Ddo_bookmarks_Internalname ;
   private String Ddo_adminag_Caption ;
   private String Ddo_adminag_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Ucmenu_Internalname ;
   private String divTablecontent_Internalname ;
   private String divTablefooter_Internalname ;
   private String lblTextblockfooter_Internalname ;
   private String lblTextblockfooter_Caption ;
   private String lblTextblockfooter_Jsonclick ;
   private String Ucmessage_Internalname ;
   private String Uctooltip_Internalname ;
   private String Wwputilities_Internalname ;
   private String Wwpdatepicker_Internalname ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPickerdummyvariable_Internalname ;
   private String edtavPickerdummyvariable_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GX_FocusControl ;
   private String AV55Station ;
   private String AV56EmprCod ;
   private String AV57EmprNom ;
   private String AV59UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String lblTextblocktitle_Internalname ;
   private String lblTextblocktitle_Caption ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sStyleString ;
   private String tblUnnamedtable3_Internalname ;
   private String lblShowmenu_Internalname ;
   private String lblShowmenu_Jsonclick ;
   private String lblTextblocktitle_Jsonclick ;
   private String tblUnnamedtable2_Internalname ;
   private String imgHeader_gximage ;
   private String sImgUrl ;
   private String imgHeader_Internalname ;
   private String lblLogodsc_Internalname ;
   private String lblLogodsc_Jsonclick ;
   private String sDynURL ;
   private java.util.Date AV51PickerDummyVariable ;
   private boolean Ucmenu_Scrollalwaysvisible ;
   private boolean Ucmenu_Hidescrollincompactmenu ;
   private boolean Ucmenu_Firstlevelisgrouping ;
   private boolean Wwputilities_Enablefixobjectfitcover ;
   private boolean Wwputilities_Enablefloatinglabels ;
   private boolean Wwputilities_Enableupdaterowselectionstatus ;
   private boolean Wwputilities_Enableconvertcombotobootstrapselect ;
   private boolean Wwputilities_Allowcolumnresizing ;
   private boolean Wwputilities_Allowcolumnreordering ;
   private boolean Wwputilities_Allowcolumndragging ;
   private boolean Wwputilities_Allowcolumnsrestore ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean toggleJsOutput ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean AV43BookmarkFound ;
   private String AV67Release ;
   private String AV48ProgramDescription ;
   private String AV68Version ;
   private String AV70Build ;
   private String AV52CadenaAutenticacion ;
   private String AV63pgmname_object ;
   private String AV54CadenaComunicacionKbExterna ;
   private String AV12Language ;
   private String AV44CurrentURL ;
   private String AV49FontIcon ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV50Httprequest ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.webpanels.GXUserControl ucDdo_bookmarks ;
   private com.genexus.webpanels.GXUserControl ucDdo_adminag ;
   private com.genexus.webpanels.GXUserControl ucUcmenu ;
   private com.genexus.webpanels.GXUserControl ucUcmessage ;
   private com.genexus.webpanels.GXUserControl ucUctooltip ;
   private com.genexus.webpanels.GXUserControl ucWwputilities ;
   private com.genexus.webpanels.GXUserControl ucWwpdatepicker ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXDataAreaControl Contentholder ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39BookmarksData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV5AdminAGData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtGridStateCollection_Item> AV45GridStateCollection ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> AV10DVelop_Menu ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> GXt_objcol_SdtDVelop_Menu_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVelop_Menu_Item> GXv_objcol_SdtDVelop_Menu_Item9[] ;
   private app.wwpbaseobjects.SdtDVelop_Menu_UserData AV42DVelop_Menu_UserData ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item AV40BookmarksDataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item AV6AdminAGDataItem ;
   private app.wwpbaseobjects.SdtGridStateCollection_Item AV46GridStateCollectionItem ;
   private app.wwpbaseobjects.SdtSDTAutenticacion AV53SdtAutenticacion ;
   private app.wwpbaseobjects.SdtWWP_DesignSystemSettings AV65WWP_DesignSystemSettings ;
   private app.wwpbaseobjects.SdtWWP_DesignSystemSettings GXt_SdtWWP_DesignSystemSettings10 ;
   private app.wwpbaseobjects.SdtWWP_DesignSystemSettings GXv_SdtWWP_DesignSystemSettings11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV69WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

