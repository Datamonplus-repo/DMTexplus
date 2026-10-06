package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mpdatamon_impl extends GXMasterPage
{
   public mpdatamon_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mpdatamon_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mpdatamon_impl.class ));
   }

   public mpdatamon_impl( int remoteHandle ,
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

   public void gxnrgridsystem_newrow_invoke( )
   {
      nRC_GXsfl_57 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_57"))) ;
      nGXsfl_57_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_57_idx"))) ;
      sGXsfl_57_idx = httpContext.GetPar( "sGXsfl_57_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsystem_newrow( ) ;
      /* End function gxnrGridsystem_newrow_invoke */
   }

   public void gxgrgridsystem_refresh_invoke( )
   {
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsystem_refresh( ) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsystem_refresh_invoke */
   }

   public void gxnrgridprofilemenu_newrow_invoke( )
   {
      nRC_GXsfl_69 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_69"))) ;
      nGXsfl_69_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_69_idx"))) ;
      sGXsfl_69_idx = httpContext.GetPar( "sGXsfl_69_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridprofilemenu_newrow( ) ;
      /* End function gxnrGridprofilemenu_newrow_invoke */
   }

   public void gxgrgridprofilemenu_refresh_invoke( )
   {
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridprofilemenu_refresh( ) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridprofilemenu_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa27S2( ) ;
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws27S2( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we27S2( ) ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "Sdtuser", AV26SdtUser);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtuser", AV26SdtUser);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "Sdtprofilemenu", AV24SdtProfileMenu);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtprofilemenu", AV24SdtProfileMenu);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "Sdtsystem", AV25SdtSystem);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtsystem", AV25SdtSystem);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_57", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_69", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_69, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, "vSDTUSER_MPAGE", AV26SdtUser);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTUSER_MPAGE", AV26SdtUser);
      }
   }

   public void renderHtmlCloseForm27S2( )
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
      httpContext.AddJavascriptSource("datamon/mpdatamon.js", "?20268313532356", false, true);
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "Datamon.MPDatamon" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Datamon", "") ;
   }

   public void wb27S0( )
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
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContainer_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHeader_Internalname, 1, 0, "px", 0, "px", "MPHeader", "left", "top", "", "", "header");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "align-content:space-between;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divConthome_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-4 col-sm-3 col-md-2 col-lg-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divBtnmenu_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "navbar-header", "left", "top", "", "", "div");
         httpContext.writeText( "<button class=\"navbar-btn\" id=\"sidebarCollapse\" onclick=\"return false\">") ;
         httpContext.writeText( "<span></span>") ;
         httpContext.writeText( "<span></span>") ;
         httpContext.writeText( "<span></span>") ;
         httpContext.writeText( "</button>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-5 col-sm-9 col-lg-6", "left", "top", "", "", "div");
         wb_table1_17_27S2( true) ;
      }
      else
      {
         wb_table1_17_27S2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_27S2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "Justify", "Middle", "", "align-self:center;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContsistema_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Text block */
         lblSystemmenu_Link = "" ;
         httpContext.ajax_rsp_assign_prop("", true, lblSystemmenu_Internalname, "Link", lblSystemmenu_Link, true);
         app.GxWebStd.gx_label_ctrl( httpContext, lblSystemmenu_Internalname, httpContext.getMessage( "Menu", ""), lblSystemmenu_Link, "", lblSystemmenu_Jsonclick, "'"+""+"'"+",true,"+"'"+"ESYSTEM_MPAGE."+"'", "", "TextBlock", 5, "", 1, 1, 0, (short)(1), "HLP_Datamon\\MPDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Justify", "Middle", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "Right", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divContprofile_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableprofile_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 40, "px", "col-xs-2", "left", "Middle", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, "", httpContext.getMessage( "User_Image", ""), "col-sm-3 MPAvatarLabel", 0, true, "");
         /* Static Bitmap Variable */
         ClassString = "MPAvatar" ;
         StyleString = "" ;
         sImgUrl = httpContext.getResourceRelative(AV26SdtUser.getgxTv_SdtSdtUser_User_image()) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavCtluser_image_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 0, "", "", 1, 1, 0, "px", 40, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Datamon\\MPDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "Middle", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 40, "px", "col-xs-10 hidden-xs hidden-sm hidden-md col-lg-5", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 20, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCtluser_name_Internalname, httpContext.getMessage( "User_Name", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCtluser_name_Internalname, AV26SdtUser.getgxTv_SdtSdtUser_User_name(), GXutil.rtrim( localUtil.format( AV26SdtUser.getgxTv_SdtSdtUser_User_name(), "")), "", "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "", "", "", edtavCtluser_name_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCtluser_name_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_Datamon\\MPDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 20, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCtluser_profile_Internalname, httpContext.getMessage( "User_Profile", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCtluser_profile_Internalname, AV26SdtUser.getgxTv_SdtSdtUser_User_profile(), GXutil.rtrim( localUtil.format( AV26SdtUser.getgxTv_SdtSdtUser_User_profile(), "")), "", "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "", "", "", edtavCtluser_profile_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavCtluser_profile_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_Datamon\\MPDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "header");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPlacemain_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMenu_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUcmenu.render(context, "", this_Internalname, "UCMENU_MPAGEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"UCMENU_MPAGEContainer"+"Ucmenu_extraContent"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUcmenu_extracontent_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFooter_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "footer");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfooter_Internalname, httpContext.getMessage( "DatamonPlus - copyright 2025 (Revisión 20250131 (U245)", ""), "", "", lblTextblockfooter_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Datamon\\MPDatamon.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "footer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "Middle", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDivmenusystem_Internalname, 1, 0, "px", 0, "px", "MPSystemMenuShow", "left", "top", "", "", "div");
         /*  Grid Control  */
         MPGridsystemContainer.SetIsFreestyle(true);
         MPGridsystemContainer.SetWrapped(nGXWrapped);
         startgridcontrol57( ) ;
      }
      if ( ( wbEnd == 57 ) && ( ! httpContext.isPopUpObject( ) || ShowMPWhenPopUp( ) ) )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_57 = (int)(nGXsfl_57_idx-1) ;
         if ( MPGridsystemContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV43GXV4 = nGXsfl_57_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"MPGridsystemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsystem", MPGridsystemContainer, subGridsystem_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "MPGridsystemContainerData", MPGridsystemContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "MPGridsystemContainerData"+"V", MPGridsystemContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"MPGridsystemContainerData"+"V"+"\" value='"+MPGridsystemContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "Middle", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDivmenuprofile_Internalname, 1, 0, "px", 0, "px", "MPProfileMenu", "left", "top", "", "", "div");
         /*  Grid Control  */
         MPGridprofilemenuContainer.SetIsFreestyle(true);
         MPGridprofilemenuContainer.SetWrapped(nGXWrapped);
         startgridcontrol69( ) ;
      }
      if ( ( wbEnd == 69 ) && ( ! httpContext.isPopUpObject( ) || ShowMPWhenPopUp( ) ) )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_69 = (int)(nGXsfl_69_idx-1) ;
         if ( MPGridprofilemenuContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV46GXV7 = nGXsfl_69_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"MPGridprofilemenuContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridprofilemenu", MPGridprofilemenuContainer, subGridprofilemenu_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "MPGridprofilemenuContainerData", MPGridprofilemenuContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "MPGridprofilemenuContainerData"+"V", MPGridprofilemenuContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"MPGridprofilemenuContainerData"+"V"+"\" value='"+MPGridprofilemenuContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( ( wbEnd == 57 ) && ( ! httpContext.isPopUpObject( ) || ShowMPWhenPopUp( ) ) )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( MPGridsystemContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV43GXV4 = nGXsfl_57_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"MPGridsystemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsystem", MPGridsystemContainer, subGridsystem_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "MPGridsystemContainerData", MPGridsystemContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "MPGridsystemContainerData"+"V", MPGridsystemContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"MPGridsystemContainerData"+"V"+"\" value='"+MPGridsystemContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( ( wbEnd == 69 ) && ( ! httpContext.isPopUpObject( ) || ShowMPWhenPopUp( ) ) )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( MPGridprofilemenuContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV46GXV7 = nGXsfl_69_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"MPGridprofilemenuContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridprofilemenu", MPGridprofilemenuContainer, subGridprofilemenu_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "MPGridprofilemenuContainerData", MPGridprofilemenuContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "MPGridprofilemenuContainerData"+"V", MPGridprofilemenuContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"MPGridprofilemenuContainerData"+"V"+"\" value='"+MPGridprofilemenuContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start27S2( )
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
      strup27S0( ) ;
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

   public void ws27S2( )
   {
      start27S2( ) ;
      evt27S2( ) ;
   }

   public void evt27S2( )
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
                     else if ( GXutil.strcmp(sEvt, "SYSTEM_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( GXutil.strcmp(GXutil.left( sEvt, 32), "GRIDPROFILEMENU_MPAGE.LOAD_MPAGE") == 0 )
                     {
                        nGXsfl_69_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_693( ) ;
                        AV46GXV7 = nGXsfl_69_idx ;
                        if ( ( AV24SdtProfileMenu.size() >= AV46GXV7 ) && ( AV46GXV7 > 0 ) )
                        {
                           AV24SdtProfileMenu.currentItem( ((app.datamon.SdtSdtProfileMenu_Menu)AV24SdtProfileMenu.elementAt(-1+AV46GXV7)) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRIDPROFILEMENU_MPAGE.LOAD_MPAGE") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              e1127S3 ();
                           }
                           else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                           }
                        }
                        else
                        {
                        }
                     }
                     else if ( ( GXutil.strcmp(GXutil.left( sEvt, 27), "GRIDSYSTEM_MPAGE.LOAD_MPAGE") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "ENTER_MPAGE") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "CANCEL_MPAGE") == 0 ) )
                     {
                        nGXsfl_57_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_572( ) ;
                        AV43GXV4 = nGXsfl_57_idx ;
                        if ( ( AV25SdtSystem.size() >= AV43GXV4 ) && ( AV43GXV4 > 0 ) )
                        {
                           AV25SdtSystem.currentItem( ((app.datamon.SdtSdtSystem_System)AV25SdtSystem.elementAt(-1+AV43GXV4)) );
                        }
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "GRIDSYSTEM_MPAGE.LOAD_MPAGE") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              e1227S2 ();
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
                           }
                        }
                        else
                        {
                        }
                     }
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

   public void we27S2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm27S2( ) ;
         }
      }
   }

   public void pa27S2( )
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
            GX_FocusControl = edtavCtluser_name_Internalname ;
            httpContext.ajax_rsp_assign_attri("", true, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridsystem_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_572( ) ;
      while ( nGXsfl_57_idx <= nRC_GXsfl_57 )
      {
         sendrow_572( ) ;
         nGXsfl_57_idx = ((subGridsystem_Islastpage==1)&&(nGXsfl_57_idx+1>subgridsystem_fnc_recordsperpage( )) ? 1 : nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      addString( httpContext.getJSONContainerResponse( MPGridsystemContainer)) ;
      /* End function gxnrGridsystem_newrow */
   }

   public void gxnrgridprofilemenu_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_693( ) ;
      while ( nGXsfl_69_idx <= nRC_GXsfl_69 )
      {
         sendrow_693( ) ;
         nGXsfl_69_idx = ((subGridprofilemenu_Islastpage==1)&&(nGXsfl_69_idx+1>subgridprofilemenu_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_693( ) ;
      }
      addString( httpContext.getJSONContainerResponse( MPGridprofilemenuContainer)) ;
      /* End function gxnrGridprofilemenu_newrow */
   }

   public void gxgrgridsystem_refresh( )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRIDSYSTEM_MPAGE_nCurrentRecord = 0 ;
      rf27S2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsystem_refresh */
   }

   public void gxgrgridprofilemenu_refresh( )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRIDPROFILEMENU_MPAGE_nCurrentRecord = 0 ;
      rf27S3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridprofilemenu_refresh */
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
      rf27S2( ) ;
      rf27S3( ) ;
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
      edtavCtluser_name_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtluser_name_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtluser_name_Enabled), 5, 0), true);
      edtavCtluser_profile_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtluser_profile_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtluser_profile_Enabled), 5, 0), true);
      edtavCtlsystemname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtlsystemname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtlsystemname_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtavCtlprofilemenuicon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtlprofilemenuicon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtlprofilemenuicon_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavCtlprofilemenutitle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtlprofilemenutitle_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtlprofilemenutitle_Enabled), 5, 0), !bGXsfl_69_Refreshing);
   }

   public void rf27S2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ShowMPWhenPopUp( ) || ! httpContext.isPopUpObject( ) )
      {
         if ( isAjaxCallMode( ) )
         {
            MPGridsystemContainer.ClearRows();
         }
         wbStart = (short)(57) ;
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
         bGXsfl_57_Refreshing = true ;
         MPGridsystemContainer.AddObjectProperty("GridName", "Gridsystem");
         MPGridsystemContainer.AddObjectProperty("CmpContext", "");
         MPGridsystemContainer.AddObjectProperty("InMasterPage", "true");
         MPGridsystemContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         MPGridsystemContainer.AddObjectProperty("Class", "FreeStyleGrid");
         MPGridsystemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsystem_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         MPGridsystemContainer.setPageSize( subgridsystem_fnc_recordsperpage( ) );
         gxdyncontrolsrefreshing = true ;
         fix_multi_value_controls( ) ;
         gxdyncontrolsrefreshing = false ;
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_572( ) ;
         e1227S2 ();
         wbEnd = (short)(57) ;
         wb27S0( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      bGXsfl_57_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27S2( )
   {
   }

   public void rf27S3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ShowMPWhenPopUp( ) || ! httpContext.isPopUpObject( ) )
      {
         if ( isAjaxCallMode( ) )
         {
            MPGridprofilemenuContainer.ClearRows();
         }
         wbStart = (short)(69) ;
         nGXsfl_69_idx = 1 ;
         sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_693( ) ;
         bGXsfl_69_Refreshing = true ;
         MPGridprofilemenuContainer.AddObjectProperty("GridName", "Gridprofilemenu");
         MPGridprofilemenuContainer.AddObjectProperty("CmpContext", "");
         MPGridprofilemenuContainer.AddObjectProperty("InMasterPage", "true");
         MPGridprofilemenuContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         MPGridprofilemenuContainer.AddObjectProperty("Class", "FreeStyleGrid");
         MPGridprofilemenuContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.setPageSize( subgridprofilemenu_fnc_recordsperpage( ) );
         gxdyncontrolsrefreshing = true ;
         fix_multi_value_controls( ) ;
         gxdyncontrolsrefreshing = false ;
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_693( ) ;
         e1127S3 ();
         wbEnd = (short)(69) ;
         wb27S0( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      bGXsfl_69_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27S3( )
   {
   }

   public int subgridsystem_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridsystem_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridsystem_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridsystem_fnc_currentpage( )
   {
      return -1 ;
   }

   public int subgridprofilemenu_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridprofilemenu_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridprofilemenu_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridprofilemenu_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavCtluser_name_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtluser_name_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtluser_name_Enabled), 5, 0), true);
      edtavCtluser_profile_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtluser_profile_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtluser_profile_Enabled), 5, 0), true);
      edtavCtlsystemname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtlsystemname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtlsystemname_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtavCtlprofilemenuicon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtlprofilemenuicon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtlprofilemenuicon_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      edtavCtlprofilemenutitle_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, edtavCtlprofilemenutitle_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCtlprofilemenutitle_Enabled), 5, 0), !bGXsfl_69_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup27S0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTUSER_MPAGE"), AV26SdtUser);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtuser"), AV26SdtUser);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtprofilemenu"), AV24SdtProfileMenu);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtsystem"), AV25SdtSystem);
         /* Read saved values. */
         nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_57_fel_idx = 0 ;
         while ( nGXsfl_57_fel_idx < nRC_GXsfl_57 )
         {
            nGXsfl_57_fel_idx = ((subGridsystem_Islastpage==1)&&(nGXsfl_57_fel_idx+1>subgridsystem_fnc_recordsperpage( )) ? 1 : nGXsfl_57_fel_idx+1) ;
            sGXsfl_57_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_572( ) ;
            AV43GXV4 = nGXsfl_57_fel_idx ;
            if ( ( AV25SdtSystem.size() >= AV43GXV4 ) && ( AV43GXV4 > 0 ) )
            {
               AV25SdtSystem.currentItem( ((app.datamon.SdtSdtSystem_System)AV25SdtSystem.elementAt(-1+AV43GXV4)) );
            }
         }
         if ( nGXsfl_57_fel_idx == 0 )
         {
            nGXsfl_57_idx = 1 ;
            sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_572( ) ;
         }
         nGXsfl_57_fel_idx = 1 ;
         nRC_GXsfl_69 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_69"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_69_fel_idx = 0 ;
         while ( nGXsfl_69_fel_idx < nRC_GXsfl_69 )
         {
            nGXsfl_69_fel_idx = ((subGridprofilemenu_Islastpage==1)&&(nGXsfl_69_fel_idx+1>subgridprofilemenu_fnc_recordsperpage( )) ? 1 : nGXsfl_69_fel_idx+1) ;
            sGXsfl_69_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_693( ) ;
            AV46GXV7 = nGXsfl_69_fel_idx ;
            if ( ( AV24SdtProfileMenu.size() >= AV46GXV7 ) && ( AV46GXV7 > 0 ) )
            {
               AV24SdtProfileMenu.currentItem( ((app.datamon.SdtSdtProfileMenu_Menu)AV24SdtProfileMenu.elementAt(-1+AV46GXV7)) );
            }
         }
         if ( nGXsfl_69_fel_idx == 0 )
         {
            nGXsfl_69_idx = 1 ;
            sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_693( ) ;
         }
         nGXsfl_69_fel_idx = 1 ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   private void e1227S2( )
   {
      /* Gridsystem_Load Routine */
      returnInSub = false ;
      AV43GXV4 = 1 ;
      while ( AV43GXV4 <= AV25SdtSystem.size() )
      {
         AV25SdtSystem.currentItem( ((app.datamon.SdtSdtSystem_System)AV25SdtSystem.elementAt(-1+AV43GXV4)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(57) ;
         }
         sendrow_572( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_57_Refreshing )
         {
            httpContext.doAjaxLoad(57, GridsystemRow);
         }
         AV43GXV4 = (int)(AV43GXV4+1) ;
      }
   }

   private void e1127S3( )
   {
      /* Gridprofilemenu_Load Routine */
      returnInSub = false ;
      AV46GXV7 = 1 ;
      while ( AV46GXV7 <= AV24SdtProfileMenu.size() )
      {
         AV24SdtProfileMenu.currentItem( ((app.datamon.SdtSdtProfileMenu_Menu)AV24SdtProfileMenu.elementAt(-1+AV46GXV7)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(69) ;
         }
         sendrow_693( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_69_Refreshing )
         {
            httpContext.doAjaxLoad(69, GridprofilemenuRow);
         }
         AV46GXV7 = (int)(AV46GXV7+1) ;
      }
   }

   public void wb_table1_17_27S2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Left\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Left;text-align:-moz-Left;text-align:-webkit-Left")+"\">") ;
         /* Static images/pictures */
         ClassString = "MPLogo" ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "03d415b8-f1bb-46e6-a044-23cf1d029d21", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgLogo_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_Datamon\\MPDatamon.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Enterprise Resource Planning inteligente", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "SubTitleLogo", 0, "", 1, 1, 0, (short)(0), "HLP_Datamon\\MPDatamon.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_27S2e( true) ;
      }
      else
      {
         wb_table1_17_27S2e( false) ;
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
      pa27S2( ) ;
      ws27S2( ) ;
      we27S2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().item(idxLst)), "?20268313532395", true, true);
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
      httpContext.AddJavascriptSource("datamon/mpdatamon.js", "?20268313532395", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_572( )
   {
      edtavCtlsystemimage_Internalname = "CTLSYSTEMIMAGE_MPAGE_"+sGXsfl_57_idx ;
      edtavCtlsystemname_Internalname = "CTLSYSTEMNAME_MPAGE_"+sGXsfl_57_idx ;
   }

   public void subsflControlProps_fel_572( )
   {
      edtavCtlsystemimage_Internalname = "CTLSYSTEMIMAGE_MPAGE_"+sGXsfl_57_fel_idx ;
      edtavCtlsystemname_Internalname = "CTLSYSTEMNAME_MPAGE_"+sGXsfl_57_fel_idx ;
   }

   public void sendrow_572( )
   {
      subsflControlProps_572( ) ;
      wb27S0( ) ;
      GridsystemRow = GXWebRow.GetNew(context,MPGridsystemContainer) ;
      if ( subGridsystem_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridsystem_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridsystem_Class, "") != 0 )
         {
            subGridsystem_Linesclass = subGridsystem_Class+"Odd" ;
         }
      }
      else if ( subGridsystem_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridsystem_Backstyle = (byte)(0) ;
         subGridsystem_Backcolor = subGridsystem_Allbackcolor ;
         if ( GXutil.strcmp(subGridsystem_Class, "") != 0 )
         {
            subGridsystem_Linesclass = subGridsystem_Class+"Uniform" ;
         }
      }
      else if ( subGridsystem_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridsystem_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridsystem_Class, "") != 0 )
         {
            subGridsystem_Linesclass = subGridsystem_Class+"Odd" ;
         }
         subGridsystem_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridsystem_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridsystem_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_57_idx) % (2))) == 0 )
         {
            subGridsystem_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridsystem_Class, "") != 0 )
            {
               subGridsystem_Linesclass = subGridsystem_Class+"Even" ;
            }
         }
         else
         {
            subGridsystem_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridsystem_Class, "") != 0 )
            {
               subGridsystem_Linesclass = subGridsystem_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( MPGridsystemContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGridsystem_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_57_idx+"\">") ;
      }
      /* Div Control */
      GridsystemRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridsystemitem_Internalname+"_"+sGXsfl_57_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      GridsystemRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      GridsystemRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      GridsystemRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divSection1_Internalname+"_"+sGXsfl_57_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","SystemItem","left","top","","","div"});
      /* Div Control */
      GridsystemRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridsystemRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {"",httpContext.getMessage( "System Image", ""),"gx-form-item ImageLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Static Bitmap Variable */
      ClassString = "Image" ;
      StyleString = "" ;
      sImgUrl = httpContext.getResourceRelative(((app.datamon.SdtSdtSystem_System)AV25SdtSystem.elementAt(-1+AV43GXV4)).getgxTv_SdtSdtSystem_System_Systemimage()) ;
      GridsystemRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavCtlsystemimage_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(1),Integer.valueOf(0),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      GridsystemRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      GridsystemRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridsystemRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavCtlsystemname_Internalname,httpContext.getMessage( "System Name", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridsystemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlsystemname_Internalname,((app.datamon.SdtSdtSystem_System)AV25SdtSystem.elementAt(-1+AV43GXV4)).getgxTv_SdtSdtSystem_System_Systemname(),"","","'"+""+"'"+",true,"+"'"+"E_MPAGE."+sGXsfl_57_idx+"'","","","","",edtavCtlsystemname_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavCtlsystemname_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
      GridsystemRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridsystemRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridsystemRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridsystemRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridsystemRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      send_integrity_lvl_hashes27S2( ) ;
      /* End of Columns property logic. */
      MPGridsystemContainer.AddRow(GridsystemRow);
      nGXsfl_57_idx = ((subGridsystem_Islastpage==1)&&(nGXsfl_57_idx+1>subgridsystem_fnc_recordsperpage( )) ? 1 : nGXsfl_57_idx+1) ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_572( ) ;
      /* End function sendrow_572 */
   }

   public void subsflControlProps_693( )
   {
      edtavCtlprofilemenuicon_Internalname = "CTLPROFILEMENUICON_MPAGE_"+sGXsfl_69_idx ;
      edtavCtlprofilemenutitle_Internalname = "CTLPROFILEMENUTITLE_MPAGE_"+sGXsfl_69_idx ;
   }

   public void subsflControlProps_fel_693( )
   {
      edtavCtlprofilemenuicon_Internalname = "CTLPROFILEMENUICON_MPAGE_"+sGXsfl_69_fel_idx ;
      edtavCtlprofilemenutitle_Internalname = "CTLPROFILEMENUTITLE_MPAGE_"+sGXsfl_69_fel_idx ;
   }

   public void sendrow_693( )
   {
      subsflControlProps_693( ) ;
      wb27S0( ) ;
      GridprofilemenuRow = GXWebRow.GetNew(context,MPGridprofilemenuContainer) ;
      if ( subGridprofilemenu_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridprofilemenu_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridprofilemenu_Class, "") != 0 )
         {
            subGridprofilemenu_Linesclass = subGridprofilemenu_Class+"Odd" ;
         }
      }
      else if ( subGridprofilemenu_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridprofilemenu_Backstyle = (byte)(0) ;
         subGridprofilemenu_Backcolor = subGridprofilemenu_Allbackcolor ;
         if ( GXutil.strcmp(subGridprofilemenu_Class, "") != 0 )
         {
            subGridprofilemenu_Linesclass = subGridprofilemenu_Class+"Uniform" ;
         }
      }
      else if ( subGridprofilemenu_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridprofilemenu_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridprofilemenu_Class, "") != 0 )
         {
            subGridprofilemenu_Linesclass = subGridprofilemenu_Class+"Odd" ;
         }
         subGridprofilemenu_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridprofilemenu_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridprofilemenu_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_69_idx) % (2))) == 0 )
         {
            subGridprofilemenu_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridprofilemenu_Class, "") != 0 )
            {
               subGridprofilemenu_Linesclass = subGridprofilemenu_Class+"Even" ;
            }
         }
         else
         {
            subGridprofilemenu_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridprofilemenu_Class, "") != 0 )
            {
               subGridprofilemenu_Linesclass = subGridprofilemenu_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( MPGridprofilemenuContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGridprofilemenu_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_69_idx+"\">") ;
      }
      /* Div Control */
      GridprofilemenuRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divGridprofileitem_Internalname+"_"+sGXsfl_69_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","justify-content:space-between;","div"});
      /* Div Control */
      GridprofilemenuRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Div Control */
      GridprofilemenuRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridprofilemenuRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavCtlprofilemenuicon_Internalname,httpContext.getMessage( "Profile Menu Icon", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridprofilemenuRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlprofilemenuicon_Internalname,((app.datamon.SdtSdtProfileMenu_Menu)AV24SdtProfileMenu.elementAt(-1+AV46GXV7)).getgxTv_SdtSdtProfileMenu_Menu_Profilemenuicon(),"","","'"+""+"'"+",true,"+"'"+"E_MPAGE."+sGXsfl_69_idx+"'","","","","",edtavCtlprofilemenuicon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavCtlprofilemenuicon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
      GridprofilemenuRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridprofilemenuRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      GridprofilemenuRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      /* Div Control */
      GridprofilemenuRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridprofilemenuRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavCtlprofilemenutitle_Internalname,httpContext.getMessage( "Profile Menu Title", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridprofilemenuRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCtlprofilemenutitle_Internalname,((app.datamon.SdtSdtProfileMenu_Menu)AV24SdtProfileMenu.elementAt(-1+AV46GXV7)).getgxTv_SdtSdtProfileMenu_Menu_Profilemenutitle(),"","","'"+""+"'"+",true,"+"'"+"E_MPAGE."+sGXsfl_69_idx+"'","","","","",edtavCtlprofilemenutitle_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavCtlprofilemenutitle_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(69),Integer.valueOf(1),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
      GridprofilemenuRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridprofilemenuRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridprofilemenuRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      send_integrity_lvl_hashes27S3( ) ;
      GXCCtl = "vSDTUSER_MPAGE_" + sGXsfl_69_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", true, GXCCtl, AV26SdtUser);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV26SdtUser);
      }
      /* End of Columns property logic. */
      MPGridprofilemenuContainer.AddRow(GridprofilemenuRow);
      nGXsfl_69_idx = ((subGridprofilemenu_Islastpage==1)&&(nGXsfl_69_idx+1>subgridprofilemenu_fnc_recordsperpage( )) ? 1 : nGXsfl_69_idx+1) ;
      sGXsfl_69_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_69_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_693( ) ;
      /* End function sendrow_693 */
   }

   public void startgridcontrol57( )
   {
      if ( MPGridsystemContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"MPGridsystemContainer"+"DivS\" data-gxgridid=\"57\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsystem_Internalname, subGridsystem_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         MPGridsystemContainer.AddObjectProperty("GridName", "Gridsystem");
      }
      else
      {
         MPGridsystemContainer.AddObjectProperty("GridName", "Gridsystem");
         MPGridsystemContainer.AddObjectProperty("Header", subGridsystem_Header);
         MPGridsystemContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         MPGridsystemContainer.AddObjectProperty("Class", "FreeStyleGrid");
         MPGridsystemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsystem_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("CmpContext", "");
         MPGridsystemContainer.AddObjectProperty("InMasterPage", "true");
         GridsystemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridsystemContainer.AddColumnProperties(GridsystemColumn);
         GridsystemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridsystemContainer.AddColumnProperties(GridsystemColumn);
         GridsystemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridsystemContainer.AddColumnProperties(GridsystemColumn);
         GridsystemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridsystemContainer.AddColumnProperties(GridsystemColumn);
         GridsystemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridsystemContainer.AddColumnProperties(GridsystemColumn);
         GridsystemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridsystemContainer.AddColumnProperties(GridsystemColumn);
         GridsystemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridsystemContainer.AddColumnProperties(GridsystemColumn);
         GridsystemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsystemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlsystemname_Enabled, (byte)(5), (byte)(0), ".", "")));
         MPGridsystemContainer.AddColumnProperties(GridsystemColumn);
         MPGridsystemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsystem_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsystem_Allowselection, (byte)(1), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsystem_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsystem_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsystem_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsystem_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         MPGridsystemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsystem_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol69( )
   {
      if ( MPGridprofilemenuContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"MPGridprofilemenuContainer"+"DivS\" data-gxgridid=\"69\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridprofilemenu_Internalname, subGridprofilemenu_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         MPGridprofilemenuContainer.AddObjectProperty("GridName", "Gridprofilemenu");
      }
      else
      {
         MPGridprofilemenuContainer.AddObjectProperty("GridName", "Gridprofilemenu");
         MPGridprofilemenuContainer.AddObjectProperty("Header", subGridprofilemenu_Header);
         MPGridprofilemenuContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         MPGridprofilemenuContainer.AddObjectProperty("Class", "FreeStyleGrid");
         MPGridprofilemenuContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("CmpContext", "");
         MPGridprofilemenuContainer.AddObjectProperty("InMasterPage", "true");
         GridprofilemenuColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridprofilemenuContainer.AddColumnProperties(GridprofilemenuColumn);
         GridprofilemenuColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridprofilemenuContainer.AddColumnProperties(GridprofilemenuColumn);
         GridprofilemenuColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridprofilemenuContainer.AddColumnProperties(GridprofilemenuColumn);
         GridprofilemenuColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridprofilemenuColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlprofilemenuicon_Enabled, (byte)(5), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddColumnProperties(GridprofilemenuColumn);
         GridprofilemenuColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridprofilemenuContainer.AddColumnProperties(GridprofilemenuColumn);
         GridprofilemenuColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         MPGridprofilemenuContainer.AddColumnProperties(GridprofilemenuColumn);
         GridprofilemenuColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridprofilemenuColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCtlprofilemenutitle_Enabled, (byte)(5), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddColumnProperties(GridprofilemenuColumn);
         MPGridprofilemenuContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Allowselection, (byte)(1), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         MPGridprofilemenuContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridprofilemenu_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      divBtnmenu_Internalname = "BTNMENU_MPAGE" ;
      imgLogo_Internalname = "LOGO_MPAGE" ;
      lblTextblock1_Internalname = "TEXTBLOCK1_MPAGE" ;
      tblTable1_Internalname = "TABLE1_MPAGE" ;
      divTable3_Internalname = "TABLE3_MPAGE" ;
      divConthome_Internalname = "CONTHOME_MPAGE" ;
      lblSystemmenu_Internalname = "SYSTEMMENU_MPAGE" ;
      divContsistema_Internalname = "CONTSISTEMA_MPAGE" ;
      imgavCtluser_image_Internalname = "CTLUSER_IMAGE_MPAGE" ;
      edtavCtluser_name_Internalname = "CTLUSER_NAME_MPAGE" ;
      edtavCtluser_profile_Internalname = "CTLUSER_PROFILE_MPAGE" ;
      divTable2_Internalname = "TABLE2_MPAGE" ;
      divTableprofile_Internalname = "TABLEPROFILE_MPAGE" ;
      divContprofile_Internalname = "CONTPROFILE_MPAGE" ;
      divTableheader_Internalname = "TABLEHEADER_MPAGE" ;
      divHeader_Internalname = "HEADER_MPAGE" ;
      divUcmenu_extracontent_Internalname = "UCMENU_EXTRACONTENT_MPAGE" ;
      divMenu_Internalname = "MENU_MPAGE" ;
      divPlacemain_Internalname = "PLACEMAIN_MPAGE" ;
      lblTextblockfooter_Internalname = "TEXTBLOCKFOOTER_MPAGE" ;
      divFooter_Internalname = "FOOTER_MPAGE" ;
      divContainer_Internalname = "CONTAINER_MPAGE" ;
      edtavCtlsystemimage_Internalname = "CTLSYSTEMIMAGE_MPAGE" ;
      edtavCtlsystemname_Internalname = "CTLSYSTEMNAME_MPAGE" ;
      divSection1_Internalname = "SECTION1_MPAGE" ;
      divGridsystemitem_Internalname = "GRIDSYSTEMITEM_MPAGE" ;
      divDivmenusystem_Internalname = "DIVMENUSYSTEM_MPAGE" ;
      edtavCtlprofilemenuicon_Internalname = "CTLPROFILEMENUICON_MPAGE" ;
      edtavCtlprofilemenutitle_Internalname = "CTLPROFILEMENUTITLE_MPAGE" ;
      divGridprofileitem_Internalname = "GRIDPROFILEITEM_MPAGE" ;
      divDivmenuprofile_Internalname = "DIVMENUPROFILE_MPAGE" ;
      divMaintable_Internalname = "MAINTABLE_MPAGE" ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setInternalname( "FORM_MPAGE" );
      subGridsystem_Internalname = "GRIDSYSTEM_MPAGE" ;
      subGridprofilemenu_Internalname = "GRIDPROFILEMENU_MPAGE" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGridprofilemenu_Allowcollapsing = (byte)(0) ;
      subGridsystem_Allowcollapsing = (byte)(0) ;
      edtavCtlprofilemenutitle_Jsonclick = "" ;
      edtavCtlprofilemenutitle_Enabled = 0 ;
      edtavCtlprofilemenuicon_Jsonclick = "" ;
      edtavCtlprofilemenuicon_Enabled = 0 ;
      subGridprofilemenu_Class = "FreeStyleGrid" ;
      edtavCtlsystemname_Jsonclick = "" ;
      edtavCtlsystemname_Enabled = 0 ;
      subGridsystem_Class = "FreeStyleGrid" ;
      subGridprofilemenu_Backcolorstyle = (byte)(0) ;
      subGridsystem_Backcolorstyle = (byte)(0) ;
      edtavCtlprofilemenutitle_Enabled = -1 ;
      edtavCtlprofilemenuicon_Enabled = -1 ;
      edtavCtlsystemname_Enabled = -1 ;
      edtavCtluser_profile_Enabled = -1 ;
      edtavCtluser_name_Enabled = -1 ;
      edtavCtluser_profile_Jsonclick = "" ;
      edtavCtluser_profile_Enabled = 0 ;
      edtavCtluser_name_Jsonclick = "" ;
      edtavCtluser_name_Enabled = 0 ;
      lblSystemmenu_Link = "" ;
      Contholder1.setDataArea(getDataAreaObject());
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
      setEventMetadata("REFRESH_MPAGE","{handler:'refresh',iparms:[{av:'GRIDSYSTEM_MPAGE_nFirstRecordOnPage'},{av:'GRIDSYSTEM_MPAGE_nEOF'},{av:'AV25SdtSystem',fld:'vSDTSYSTEM_MPAGE',grid:57,pic:''},{av:'nGXsfl_57_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:57},{av:'nRC_GXsfl_57',ctrl:'GRIDSYSTEM_MPAGE',prop:'GridRC',grid:57},{av:'GRIDPROFILEMENU_MPAGE_nFirstRecordOnPage'},{av:'GRIDPROFILEMENU_MPAGE_nEOF'},{av:'AV24SdtProfileMenu',fld:'vSDTPROFILEMENU_MPAGE',grid:69,pic:''},{av:'nGXsfl_69_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:69},{av:'nRC_GXsfl_69',ctrl:'GRIDPROFILEMENU_MPAGE',prop:'GridRC',grid:69}]");
      setEventMetadata("REFRESH_MPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv6',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv9',iparms:[]");
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
      Contholder1 = new com.genexus.webpanels.GXDataAreaControl();
      Form = new com.genexus.webpanels.GXWebForm();
      GXKey = "" ;
      AV26SdtUser = new app.datamon.SdtSdtUser(remoteHandle, context);
      AV24SdtProfileMenu = new GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu>(app.datamon.SdtSdtProfileMenu_Menu.class, "Menu", "TexplusNET", remoteHandle);
      AV25SdtSystem = new GXBaseCollection<app.datamon.SdtSdtSystem_System>(app.datamon.SdtSdtSystem_System.class, "System", "TexplusNET", remoteHandle);
      sPrefix = "" ;
      lblSystemmenu_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      ucUcmenu = new com.genexus.webpanels.GXUserControl();
      this_Internalname = "" ;
      lblTextblockfooter_Jsonclick = "" ;
      MPGridsystemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      MPGridprofilemenuContainer = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GX_FocusControl = "" ;
      GridsystemRow = new com.genexus.webpanels.GXWebRow();
      GridprofilemenuRow = new com.genexus.webpanels.GXWebRow();
      lblTextblock1_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sDynURL = "" ;
      subGridsystem_Linesclass = "" ;
      ROClassString = "" ;
      subGridprofilemenu_Linesclass = "" ;
      GXCCtl = "" ;
      subGridsystem_Header = "" ;
      GridsystemColumn = new com.genexus.webpanels.GXWebColumn();
      subGridprofilemenu_Header = "" ;
      GridprofilemenuColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCtluser_name_Enabled = 0 ;
      edtavCtluser_profile_Enabled = 0 ;
      edtavCtlsystemname_Enabled = 0 ;
      edtavCtlprofilemenuicon_Enabled = 0 ;
      edtavCtlprofilemenutitle_Enabled = 0 ;
   }

   private byte GxWebError ;
   private byte nDonePA ;
   private byte subGridsystem_Backcolorstyle ;
   private byte subGridprofilemenu_Backcolorstyle ;
   private byte nGotPars ;
   private byte nGXWrapped ;
   private byte subGridsystem_Backstyle ;
   private byte subGridprofilemenu_Backstyle ;
   private byte subGridsystem_Allowselection ;
   private byte subGridsystem_Allowhovering ;
   private byte subGridsystem_Allowcollapsing ;
   private byte subGridsystem_Collapsed ;
   private byte subGridprofilemenu_Allowselection ;
   private byte subGridprofilemenu_Allowhovering ;
   private byte subGridprofilemenu_Allowcollapsing ;
   private byte subGridprofilemenu_Collapsed ;
   private byte GRIDSYSTEM_MPAGE_nEOF ;
   private byte GRIDPROFILEMENU_MPAGE_nEOF ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_57 ;
   private int nRC_GXsfl_69 ;
   private int nGXsfl_57_idx=1 ;
   private int nGXsfl_69_idx=1 ;
   private int edtavCtluser_name_Enabled ;
   private int edtavCtluser_profile_Enabled ;
   private int AV43GXV4 ;
   private int AV46GXV7 ;
   private int subGridsystem_Islastpage ;
   private int subGridprofilemenu_Islastpage ;
   private int edtavCtlsystemname_Enabled ;
   private int edtavCtlprofilemenuicon_Enabled ;
   private int edtavCtlprofilemenutitle_Enabled ;
   private int nGXsfl_57_fel_idx=1 ;
   private int nGXsfl_69_fel_idx=1 ;
   private int idxLst ;
   private int subGridsystem_Backcolor ;
   private int subGridsystem_Allbackcolor ;
   private int subGridprofilemenu_Backcolor ;
   private int subGridprofilemenu_Allbackcolor ;
   private int subGridsystem_Selectedindex ;
   private int subGridsystem_Selectioncolor ;
   private int subGridsystem_Hoveringcolor ;
   private int subGridprofilemenu_Selectedindex ;
   private int subGridprofilemenu_Selectioncolor ;
   private int subGridprofilemenu_Hoveringcolor ;
   private long GRIDSYSTEM_MPAGE_nCurrentRecord ;
   private long GRIDPROFILEMENU_MPAGE_nCurrentRecord ;
   private long GRIDSYSTEM_MPAGE_nFirstRecordOnPage ;
   private long GRIDPROFILEMENU_MPAGE_nFirstRecordOnPage ;
   private String sGXsfl_57_idx="0001" ;
   private String sGXsfl_69_idx="0001" ;
   private String GXKey ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divContainer_Internalname ;
   private String divHeader_Internalname ;
   private String divTableheader_Internalname ;
   private String divConthome_Internalname ;
   private String divTable3_Internalname ;
   private String divBtnmenu_Internalname ;
   private String divContsistema_Internalname ;
   private String lblSystemmenu_Link ;
   private String lblSystemmenu_Internalname ;
   private String lblSystemmenu_Jsonclick ;
   private String divContprofile_Internalname ;
   private String divTableprofile_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgavCtluser_image_Internalname ;
   private String divTable2_Internalname ;
   private String edtavCtluser_name_Internalname ;
   private String edtavCtluser_name_Jsonclick ;
   private String edtavCtluser_profile_Internalname ;
   private String edtavCtluser_profile_Jsonclick ;
   private String divPlacemain_Internalname ;
   private String divMenu_Internalname ;
   private String this_Internalname ;
   private String divUcmenu_extracontent_Internalname ;
   private String divFooter_Internalname ;
   private String lblTextblockfooter_Internalname ;
   private String lblTextblockfooter_Jsonclick ;
   private String divDivmenusystem_Internalname ;
   private String sStyleString ;
   private String subGridsystem_Internalname ;
   private String divDivmenuprofile_Internalname ;
   private String subGridprofilemenu_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GX_FocusControl ;
   private String edtavCtlsystemname_Internalname ;
   private String edtavCtlprofilemenuicon_Internalname ;
   private String edtavCtlprofilemenutitle_Internalname ;
   private String sGXsfl_57_fel_idx="0001" ;
   private String sGXsfl_69_fel_idx="0001" ;
   private String tblTable1_Internalname ;
   private String imgLogo_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String sDynURL ;
   private String edtavCtlsystemimage_Internalname ;
   private String subGridsystem_Class ;
   private String subGridsystem_Linesclass ;
   private String divGridsystemitem_Internalname ;
   private String divSection1_Internalname ;
   private String ROClassString ;
   private String edtavCtlsystemname_Jsonclick ;
   private String subGridprofilemenu_Class ;
   private String subGridprofilemenu_Linesclass ;
   private String divGridprofileitem_Internalname ;
   private String edtavCtlprofilemenuicon_Jsonclick ;
   private String edtavCtlprofilemenutitle_Jsonclick ;
   private String GXCCtl ;
   private String subGridsystem_Header ;
   private String subGridprofilemenu_Header ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_57_Refreshing=false ;
   private boolean bGXsfl_69_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid MPGridsystemContainer ;
   private com.genexus.webpanels.GXWebGrid MPGridprofilemenuContainer ;
   private com.genexus.webpanels.GXWebRow GridsystemRow ;
   private com.genexus.webpanels.GXWebRow GridprofilemenuRow ;
   private com.genexus.webpanels.GXWebColumn GridsystemColumn ;
   private com.genexus.webpanels.GXWebColumn GridprofilemenuColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucUcmenu ;
   private com.genexus.webpanels.GXDataAreaControl Contholder1 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.datamon.SdtSdtSystem_System> AV25SdtSystem ;
   private GXBaseCollection<app.datamon.SdtSdtProfileMenu_Menu> AV24SdtProfileMenu ;
   private app.datamon.SdtSdtUser AV26SdtUser ;
}

