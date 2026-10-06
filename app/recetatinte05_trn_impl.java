package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetatinte05_trn_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action27") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
         AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
         AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
         AV11RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11RecLinMaq), "ZZZ9")));
         A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_27_1RB409( AV7EmprCod, AV8BarCod, AV9BarCodReo, AV10BarCodPar, AV11RecLinMaq, A1273RecLinPro) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PROFORCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13740ProFDsc = httpContext.GetPar( "ProFDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaproforcod1RB0( A396EmprCod, A13740ProFDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PROFORCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13740ProFDsc = httpContext.GetPar( "ProFDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaproforcod1RB0( A396EmprCod, A13740ProFDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PROFORCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h764ProForCod = httpContext.GetPar( "h764ProForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaproforcod1RB409( A396EmprCod, h764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
            AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
            AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
            AV11RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11RecLinMaq), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11RecLinMaq), "ZZZ9")));
            AV12RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12RecLinPro), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12RecLinPro), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Procesos Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRecLinPro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public recetatinte05_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetatinte05_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetatinte05_trn_impl.class ));
   }

   public recetatinte05_trn_impl( int remoteHandle ,
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
      ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
      ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
      ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
      ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
      ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
      ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
      ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
      ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
      ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
      ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedbarnhdr_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "", "", lblTextblockbarnhdr_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetaTinte05_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTablemergedbarnhdr_Internalname, tblTablemergedbarnhdr_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td class='MergeDataCell'>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N Hdr", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetaTinte05_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblBarnhdr_popoverimage_Internalname, httpContext.getMessage( "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>", ""), "", "", lblBarnhdr_popoverimage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_RecetaTinte05_TRN.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
      ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
      ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
      ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
      ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
      ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
      ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
      ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
      ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
      ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
      ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecLinPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecLinPro_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecLinPro_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, h764ProForCod, GXutil.rtrim( localUtil.format( h764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForCod_Enabled, 1, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_RecetaTinte05_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetaTinte05_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetaTinte05_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* User Defined Control */
      ucPopover_barnhdr.setProperty("PopoverWidth", Popover_barnhdr_Popoverwidth);
      ucPopover_barnhdr.setProperty("Position", Popover_barnhdr_Position);
      ucPopover_barnhdr.render(context, "dvelop.wwppopover", Popover_barnhdr_Internalname, "POPOVER_BARNHDRContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCod_Visible, edtBarCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodReo_Visible, edtBarCodReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", edtBarCodPar_Visible, edtBarCodPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinMaq_Jsonclick, 0, "Attribute", "", "", "", "", edtRecLinMaq_Visible, edtRecLinMaq_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtUltLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A1272UltLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtUltLinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1272UltLinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1272UltLinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUltLinPro_Jsonclick, 0, "Attribute", "", "", "", "", edtUltLinPro_Visible, edtUltLinPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTmx_Jsonclick, 0, "Attribute", "", "", "", "", edtProForTmx_Visible, edtProForTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtProRecObs_Internalname, A4587ProRecObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", (short)(0), edtProRecObs_Visible, edtProRecObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "32768", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecNroPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A4697RecNroPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecNroPrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4697RecNroPrg), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4697RecNroPrg), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecNroPrg_Jsonclick, 0, "Attribute", "", "", "", "", edtRecNroPrg_Visible, edtRecNroPrg_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecVolPrf_Internalname, GXutil.ltrim( localUtil.ntoc( A4695RecVolPrf, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecVolPrf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecVolPrf_Jsonclick, 0, "Attribute", "", "", "", "", edtRecVolPrf_Visible, edtRecVolPrf_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecNumRec_Internalname, GXutil.ltrim( localUtil.ntoc( A1251RecNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecNumRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1251RecNumRec), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1251RecNumRec), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecNumRec_Jsonclick, 0, "Attribute", "", "", "", "", edtRecNumRec_Visible, edtRecNumRec_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecNH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10544RecNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecNH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10544RecNH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10544RecNH2O), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecNH2O_Jsonclick, 0, "Attribute", "", "", "", "", edtRecNH2O_Visible, edtRecNH2O_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetaTinte05_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtProForDsc_Visible, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetaTinte05_TRN.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
      if ( ! isFullAjaxMode( ) )
      {
         /* WebComponent */
         app.GxWebStd.gx_hidden_field( httpContext, "W0074"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpW0074"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpW0074"+"");
            }
            WebComp_Wwpaux_wc.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
      }
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
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
      e111RB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z2804RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1273RecLinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4697RecNroPrg = (int)(localUtil.ctol( httpContext.cgiGet( "Z4697RecNroPrg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4695RecVolPrf = (int)(localUtil.ctol( httpContext.cgiGet( "Z4695RecVolPrf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1251RecNumRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z1251RecNumRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10544RecNH2O = (short)(localUtil.ctol( httpContext.cgiGet( "Z10544RecNH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N764ProForCod = httpContext.cgiGet( "N764ProForCod") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV11RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "vRECLINMAQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "vRECLINPRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16Insert_ProForCod = httpContext.cgiGet( "vINSERT_PROFORCOD") ;
            A764ProForCod = httpContext.cgiGet( "GXHCPROFORCOD") ;
            AV18errMensaje = httpContext.cgiGet( "vERRMENSAJE") ;
            AV22Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Visible")) ;
            Popover_barnhdr_Objectcall = httpContext.cgiGet( "POPOVER_BARNHDR_Objectcall") ;
            Popover_barnhdr_Class = httpContext.cgiGet( "POPOVER_BARNHDR_Class") ;
            Popover_barnhdr_Enabled = GXutil.strtobool( httpContext.cgiGet( "POPOVER_BARNHDR_Enabled")) ;
            Popover_barnhdr_Gridinternalname = httpContext.cgiGet( "POPOVER_BARNHDR_Gridinternalname") ;
            Popover_barnhdr_Iteminternalname = httpContext.cgiGet( "POPOVER_BARNHDR_Iteminternalname") ;
            Popover_barnhdr_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "POPOVER_BARNHDR_Isgriditem")) ;
            Popover_barnhdr_Trigger = httpContext.cgiGet( "POPOVER_BARNHDR_Trigger") ;
            Popover_barnhdr_Triggerelement = httpContext.cgiGet( "POPOVER_BARNHDR_Triggerelement") ;
            Popover_barnhdr_Cls = httpContext.cgiGet( "POPOVER_BARNHDR_Cls") ;
            Popover_barnhdr_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_BARNHDR_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Popover_barnhdr_Html = httpContext.cgiGet( "POPOVER_BARNHDR_Html") ;
            Popover_barnhdr_Position = httpContext.cgiGet( "POPOVER_BARNHDR_Position") ;
            Popover_barnhdr_Load = httpContext.cgiGet( "POPOVER_BARNHDR_Load") ;
            Popover_barnhdr_Showloading = GXutil.strtobool( httpContext.cgiGet( "POPOVER_BARNHDR_Showloading")) ;
            Popover_barnhdr_Keepopened = GXutil.strtobool( httpContext.cgiGet( "POPOVER_BARNHDR_Keepopened")) ;
            Popover_barnhdr_Reloadonkeychange = GXutil.strtobool( httpContext.cgiGet( "POPOVER_BARNHDR_Reloadonkeychange")) ;
            Popover_barnhdr_Minimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_BARNHDR_Minimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Popover_barnhdr_Openifempty = GXutil.strtobool( httpContext.cgiGet( "POPOVER_BARNHDR_Openifempty")) ;
            Popover_barnhdr_Visible = GXutil.strtobool( httpContext.cgiGet( "POPOVER_BARNHDR_Visible")) ;
            /* Read variables values. */
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLINPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecLinPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1273RecLinPro = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            }
            else
            {
               A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            }
            h764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLINMAQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecLinMaq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2804RecLinMaq = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            }
            else
            {
               A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            }
            A1272UltLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtUltLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
            A772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
            A4587ProRecObs = httpContext.cgiGet( edtProRecObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4587ProRecObs", A4587ProRecObs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecNroPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecNroPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECNROPRG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecNroPrg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4697RecNroPrg = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4697RecNroPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4697RecNroPrg), 5, 0));
            }
            else
            {
               A4697RecNroPrg = (int)(localUtil.ctol( httpContext.cgiGet( edtRecNroPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4697RecNroPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4697RecNroPrg), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecVolPrf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecVolPrf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECVOLPRF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecVolPrf_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4695RecVolPrf = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4695RecVolPrf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4695RecVolPrf), 5, 0));
            }
            else
            {
               A4695RecVolPrf = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4695RecVolPrf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4695RecVolPrf), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECNUMREC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecNumRec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1251RecNumRec = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1251RecNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1251RecNumRec), 5, 0));
            }
            else
            {
               A1251RecNumRec = (int)(localUtil.ctol( httpContext.cgiGet( edtRecNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1251RecNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1251RecNumRec), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECNH2O");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecNH2O_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10544RecNH2O = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10544RecNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10544RecNH2O), 4, 0));
            }
            else
            {
               A10544RecNH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtRecNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10544RecNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10544RecNH2O), 4, 0));
            }
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"RecetaTinte05_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("recetatinte05_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
               A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
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
                  sMode409 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode409 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound409 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RB0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111RB2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RB2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                  }
                  else
                  {
                  }
               }
               else if ( GXutil.strcmp(sEvtType, "W") == 0 )
               {
                  sEvtType = GXutil.left( sEvt, 4) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 74 )
                  {
                     OldWwpaux_wc = httpContext.cgiGet( "W0074") ;
                     if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                     {
                        WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                     if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                     {
                        WebComp_Wwpaux_wc.componentprocess("W0074", "", sEvt);
                     }
                     WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
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
         /* Execute user event: After Trn */
         e121RB2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RB409( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1RB409( ) ;
      }
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

   public void confirm_1RB0( )
   {
      beforeValidate1RB409( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RB409( ) ;
         }
         else
         {
            checkExtendedTable1RB409( ) ;
            closeExtendedTableCursors1RB409( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1RB0( )
   {
   }

   public void e111RB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetatinte05_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV20Emprnom ;
      GXv_char4[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetatinte05_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      recetatinte05_trn_impl.this.AV20Emprnom = GXv_char3[0] ;
      recetatinte05_trn_impl.this.AV21Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Emprnom", AV20Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usurcod", AV21Usurcod);
      GXv_SdtWWPContext5[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV13WWPContext = GXv_SdtWWPContext5[0] ;
      Popover_barnhdr_Iteminternalname = edtBarNHdr_Internalname ;
      ucPopover_barnhdr.sendProperty(context, "", false, Popover_barnhdr_Internalname, "ItemInternalName", Popover_barnhdr_Iteminternalname);
      AV14TrnContext.fromxml(AV15WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV14TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV22Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV23GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GXV1), 8, 0));
         while ( AV23GXV1 <= AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV17TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV14TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV23GXV1));
            if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ProForCod") == 0 )
            {
               AV16Insert_ProForCod = AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16Insert_ProForCod", AV16Insert_ProForCod);
            }
            AV23GXV1 = (int)(AV23GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtBarCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), true);
      edtBarCodReo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), true);
      edtBarCodPar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), true);
      edtRecLinMaq_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Visible), 5, 0), true);
      edtUltLinPro_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinPro_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinPro_Visible), 5, 0), true);
      edtProForTmx_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Visible), 5, 0), true);
      edtProRecObs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProRecObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProRecObs_Visible), 5, 0), true);
      edtRecNroPrg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNroPrg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNroPrg_Visible), 5, 0), true);
      edtRecVolPrf_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecVolPrf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolPrf_Visible), 5, 0), true);
      edtRecNumRec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNumRec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNumRec_Visible), 5, 0), true);
      edtRecNH2O_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNH2O_Visible), 5, 0), true);
      edtProForDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Visible), 5, 0), true);
   }

   public void e121RB2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1RB409( int GX_JID )
   {
      if ( ( GX_JID == 29 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4697RecNroPrg = T01RB3_A4697RecNroPrg[0] ;
            Z4695RecVolPrf = T01RB3_A4695RecVolPrf[0] ;
            Z1251RecNumRec = T01RB3_A1251RecNumRec[0] ;
            Z10544RecNH2O = T01RB3_A10544RecNH2O[0] ;
            Z764ProForCod = T01RB3_A764ProForCod[0] ;
         }
         else
         {
            Z4697RecNroPrg = A4697RecNroPrg ;
            Z4695RecVolPrf = A4695RecVolPrf ;
            Z1251RecNumRec = A1251RecNumRec ;
            Z10544RecNH2O = A10544RecNH2O ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -29 )
      {
         Z1273RecLinPro = A1273RecLinPro ;
         Z4587ProRecObs = A4587ProRecObs ;
         Z4697RecNroPrg = A4697RecNroPrg ;
         Z4695RecVolPrf = A4695RecVolPrf ;
         Z1251RecNumRec = A1251RecNumRec ;
         Z10544RecNH2O = A10544RecNH2O ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1272UltLinPro = A1272UltLinPro ;
         Z766ProForDsc = A766ProForDsc ;
         Z772ProForTmx = A772ProForTmx ;
      }
   }

   public void standaloneNotModal( )
   {
      AV22Pgmname = "RecetaTinte05_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pgmname", AV22Pgmname);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8BarCod) )
      {
         A129BarCod = AV8BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV8BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8BarCod) )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9BarCodReo) )
      {
         A132BarCodReo = AV9BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (0==AV9BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9BarCodReo) )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         A130BarCodPar = AV10BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11RecLinMaq) )
      {
         A2804RecLinMaq = AV11RecLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      }
      if ( ! (0==AV11RecLinMaq) )
      {
         edtRecLinMaq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      else
      {
         edtRecLinMaq_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11RecLinMaq) )
      {
         edtRecLinMaq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12RecLinPro) )
      {
         A1273RecLinPro = AV12RecLinPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      }
      if ( ! (0==AV12RecLinPro) )
      {
         edtRecLinPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      }
      else
      {
         edtRecLinPro_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12RecLinPro) )
      {
         edtRecLinPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV16Insert_ProForCod)==0) )
      {
         edtProForCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProForCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV16Insert_ProForCod)==0) )
      {
         A764ProForCod = AV16Insert_ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         /* Using cursor T01RB6 */
         pr_default.execute(4, new Object[] {A396EmprCod, A764ProForCod});
         h764ProForCod = "" ;
         while ( (pr_default.getStatus(4) != 101) )
         {
            h764ProForCod = T01RB6_A13740ProFDsc[0] ;
            if (true) break;
         }
         pr_default.close(4);
         httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         /* Using cursor T01RB5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         A1272UltLinPro = T01RB5_A1272UltLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         pr_default.close(3);
         /* Using cursor T01RB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01RB4_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A772ProForTmx = T01RB4_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         pr_default.close(2);
      }
   }

   public void load1RB409( )
   {
      /* Using cursor T01RB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound409 = (short)(1) ;
         A4587ProRecObs = T01RB7_A4587ProRecObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4587ProRecObs", A4587ProRecObs);
         A1272UltLinPro = T01RB7_A1272UltLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         A766ProForDsc = T01RB7_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A772ProForTmx = T01RB7_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A4697RecNroPrg = T01RB7_A4697RecNroPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4697RecNroPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4697RecNroPrg), 5, 0));
         A4695RecVolPrf = T01RB7_A4695RecVolPrf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4695RecVolPrf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4695RecVolPrf), 5, 0));
         A1251RecNumRec = T01RB7_A1251RecNumRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1251RecNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1251RecNumRec), 5, 0));
         A10544RecNH2O = T01RB7_A10544RecNH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10544RecNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10544RecNH2O), 4, 0));
         A764ProForCod = T01RB7_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         zm1RB409( -29) ;
      }
      pr_default.close(5);
      onLoadActions1RB409( ) ;
   }

   public void onLoadActions1RB409( )
   {
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      /* Using cursor T01RB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A764ProForCod});
      h764ProForCod = "" ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         h764ProForCod = T01RB8_A13740ProFDsc[0] ;
         if (true) break;
      }
      pr_default.close(6);
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
   }

   public void checkExtendedTable1RB409( )
   {
      nIsDirty_409 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( (GXutil.strcmp("", h764ProForCod)==0) )
      {
         nIsDirty_409 = (short)(1) ;
         A764ProForCod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      else
      {
         A13740ProFDsc = h764ProForCod ;
         /* Using cursor T01RB9 */
         pr_default.execute(7, new Object[] {A13740ProFDsc, A396EmprCod});
         A396EmprCod = T01RB9_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RB9_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A764ProForCod = T01RB9_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         if ( ! ( (pr_default.getStatus(7) == 101) ) )
         {
            pr_default.readNext(7);
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "PROFORCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(7);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      if ( (GXutil.strcmp("", h764ProForCod)==0) )
      {
         nIsDirty_409 = (short)(1) ;
         A764ProForCod = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      else
      {
         A13740ProFDsc = h764ProForCod ;
         /* Using cursor T01RB10 */
         pr_default.execute(8, new Object[] {A13740ProFDsc, A396EmprCod});
         A396EmprCod = T01RB10_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RB10_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A764ProForCod = T01RB10_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         if ( ! ( (pr_default.getStatus(8) == 101) ) )
         {
            pr_default.readNext(8);
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "PROFORCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(8);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      /* Using cursor T01RB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01RB4_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A772ProForTmx = T01RB4_A772ProForTmx[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      pr_default.close(2);
      nIsDirty_409 = (short)(1) ;
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      /* Using cursor T01RB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1272UltLinPro = T01RB5_A1272UltLinPro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1RB409( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_30( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T01RB11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01RB11_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A772ProForTmx = T01RB11_A772ProForTmx[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_31( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar ,
                          short A2804RecLinMaq )
   {
      /* Using cursor T01RB12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1272UltLinPro = T01RB12_A1272UltLinPro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1272UltLinPro, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1RB409( )
   {
      /* Using cursor T01RB13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound409 = (short)(1) ;
      }
      else
      {
         RcdFound409 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RB409( 29) ;
         RcdFound409 = (short)(1) ;
         A4587ProRecObs = T01RB3_A4587ProRecObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4587ProRecObs", A4587ProRecObs);
         A1273RecLinPro = T01RB3_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A4697RecNroPrg = T01RB3_A4697RecNroPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4697RecNroPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4697RecNroPrg), 5, 0));
         A4695RecVolPrf = T01RB3_A4695RecVolPrf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4695RecVolPrf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4695RecVolPrf), 5, 0));
         A1251RecNumRec = T01RB3_A1251RecNumRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1251RecNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1251RecNumRec), 5, 0));
         A10544RecNH2O = T01RB3_A10544RecNH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10544RecNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10544RecNH2O), 4, 0));
         A396EmprCod = T01RB3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RB3_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A129BarCod = T01RB3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RB3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RB3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RB3_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         sMode409 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RB409( ) ;
         if ( AnyError == 1 )
         {
            RcdFound409 = (short)(0) ;
            initializeNonKey1RB409( ) ;
         }
         Gx_mode = sMode409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound409 = (short)(0) ;
         initializeNonKey1RB409( ) ;
         sMode409 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode409 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RB409( ) ;
      if ( RcdFound409 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound409 = (short)(0) ;
      /* Using cursor T01RB14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB14_A129BarCod[0] < A129BarCod ) || ( T01RB14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB14_A132BarCodReo[0] < A132BarCodReo ) || ( T01RB14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RB14_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RB14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RB14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB14_A2804RecLinMaq[0] < A2804RecLinMaq ) || ( T01RB14_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RB14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RB14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB14_A1273RecLinPro[0] < A1273RecLinPro ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB14_A129BarCod[0] > A129BarCod ) || ( T01RB14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB14_A132BarCodReo[0] > A132BarCodReo ) || ( T01RB14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RB14_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RB14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RB14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB14_A2804RecLinMaq[0] > A2804RecLinMaq ) || ( T01RB14_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RB14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RB14_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB14_A1273RecLinPro[0] > A1273RecLinPro ) ) )
         {
            A396EmprCod = T01RB14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RB14_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RB14_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RB14_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01RB14_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A1273RecLinPro = T01RB14_A1273RecLinPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            RcdFound409 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound409 = (short)(0) ;
      /* Using cursor T01RB15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB15_A129BarCod[0] > A129BarCod ) || ( T01RB15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB15_A132BarCodReo[0] > A132BarCodReo ) || ( T01RB15_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RB15_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01RB15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RB15_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB15_A2804RecLinMaq[0] > A2804RecLinMaq ) || ( T01RB15_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RB15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RB15_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB15_A1273RecLinPro[0] > A1273RecLinPro ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB15_A129BarCod[0] < A129BarCod ) || ( T01RB15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB15_A132BarCodReo[0] < A132BarCodReo ) || ( T01RB15_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RB15_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01RB15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RB15_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB15_A2804RecLinMaq[0] < A2804RecLinMaq ) || ( T01RB15_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01RB15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01RB15_A132BarCodReo[0] == A132BarCodReo ) && ( T01RB15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RB15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01RB15_A1273RecLinPro[0] < A1273RecLinPro ) ) )
         {
            A396EmprCod = T01RB15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01RB15_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01RB15_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01RB15_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01RB15_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A1273RecLinPro = T01RB15_A1273RecLinPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            RcdFound409 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RB409( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRecLinPro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RB409( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound409 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A2804RecLinMaq = Z2804RecLinMaq ;
               httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
               A1273RecLinPro = Z1273RecLinPro ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRecLinPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1RB409( ) ;
               GX_FocusControl = edtRecLinPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) )
            {
               /* Insert record */
               GX_FocusControl = edtRecLinPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RB409( ) ;
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
                  /* Insert record */
                  GX_FocusControl = edtRecLinPro_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RB409( ) ;
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
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = Z2804RecLinMaq ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = Z1273RecLinPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRecLinPro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RB409( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h764ProForCod)==0) )
         {
            A764ProForCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         }
         else
         {
            A13740ProFDsc = h764ProForCod ;
            /* Using cursor T01RB16 */
            pr_default.execute(14, new Object[] {A13740ProFDsc, A396EmprCod});
            A396EmprCod = T01RB16_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A764ProForCod = T01RB16_A764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A764ProForCod = T01RB16_A764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               pr_default.readNext(14);
               if ( ! ( (pr_default.getStatus(14) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "PROFORCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(14);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01RB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRECET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z4697RecNroPrg != T01RB2_A4697RecNroPrg[0] ) || ( Z4695RecVolPrf != T01RB2_A4695RecVolPrf[0] ) || ( Z1251RecNumRec != T01RB2_A1251RecNumRec[0] ) || ( Z10544RecNH2O != T01RB2_A10544RecNH2O[0] ) || ( GXutil.strcmp(Z764ProForCod, T01RB2_A764ProForCod[0]) != 0 ) )
         {
            if ( Z4697RecNroPrg != T01RB2_A4697RecNroPrg[0] )
            {
               GXutil.writeLogln("recetatinte05_trn:[seudo value changed for attri]"+"RecNroPrg");
               GXutil.writeLogRaw("Old: ",Z4697RecNroPrg);
               GXutil.writeLogRaw("Current: ",T01RB2_A4697RecNroPrg[0]);
            }
            if ( Z4695RecVolPrf != T01RB2_A4695RecVolPrf[0] )
            {
               GXutil.writeLogln("recetatinte05_trn:[seudo value changed for attri]"+"RecVolPrf");
               GXutil.writeLogRaw("Old: ",Z4695RecVolPrf);
               GXutil.writeLogRaw("Current: ",T01RB2_A4695RecVolPrf[0]);
            }
            if ( Z1251RecNumRec != T01RB2_A1251RecNumRec[0] )
            {
               GXutil.writeLogln("recetatinte05_trn:[seudo value changed for attri]"+"RecNumRec");
               GXutil.writeLogRaw("Old: ",Z1251RecNumRec);
               GXutil.writeLogRaw("Current: ",T01RB2_A1251RecNumRec[0]);
            }
            if ( Z10544RecNH2O != T01RB2_A10544RecNH2O[0] )
            {
               GXutil.writeLogln("recetatinte05_trn:[seudo value changed for attri]"+"RecNH2O");
               GXutil.writeLogRaw("Old: ",Z10544RecNH2O);
               GXutil.writeLogRaw("Current: ",T01RB2_A10544RecNH2O[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T01RB2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("recetatinte05_trn:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01RB2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCRECET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RB409( )
   {
      beforeValidate1RB409( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RB409( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RB409( 0) ;
         checkOptimisticConcurrency1RB409( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RB409( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RB409( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RB17 */
                  pr_default.execute(15, new Object[] {Byte.valueOf(A1273RecLinPro), A4587ProRecObs, Integer.valueOf(A4697RecNroPrg), Integer.valueOf(A4695RecVolPrf), Integer.valueOf(A1251RecNumRec), Short.valueOf(A10544RecNH2O), A396EmprCod, A764ProForCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1RB0( ) ;
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
            load1RB409( ) ;
         }
         endLevel1RB409( ) ;
      }
      closeExtendedTableCursors1RB409( ) ;
   }

   public void update1RB409( )
   {
      beforeValidate1RB409( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RB409( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RB409( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RB409( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RB409( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RB18 */
                  pr_default.execute(16, new Object[] {A4587ProRecObs, Integer.valueOf(A4697RecNroPrg), Integer.valueOf(A4695RecVolPrf), Integer.valueOf(A1251RecNumRec), Short.valueOf(A10544RecNH2O), A764ProForCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRECET"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RB409( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
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
         endLevel1RB409( ) ;
      }
      closeExtendedTableCursors1RB409( ) ;
   }

   public void deferredUpdate1RB409( )
   {
   }

   public void delete( )
   {
      beforeValidate1RB409( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RB409( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RB409( ) ;
         afterConfirm1RB409( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RB409( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RB19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECET");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     if ( isUpd( ) || isDlt( ) )
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
      sMode409 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RB409( ) ;
      Gx_mode = sMode409 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RB409( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
         /* Using cursor T01RB20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
         A1272UltLinPro = T01RB20_A1272UltLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
         pr_default.close(18);
         /* Using cursor T01RB21 */
         pr_default.execute(19, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01RB21_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A772ProForTmx = T01RB21_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01RB22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void endLevel1RB409( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RB409( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recetatinte05_trn");
         if ( AnyError == 0 )
         {
            confirmValues1RB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "recetatinte05_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RB409( )
   {
      /* Scan By routine */
      /* Using cursor T01RB23 */
      pr_default.execute(21);
      RcdFound409 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound409 = (short)(1) ;
         A396EmprCod = T01RB23_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RB23_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RB23_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RB23_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RB23_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01RB23_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RB409( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound409 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound409 = (short)(1) ;
         A396EmprCod = T01RB23_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01RB23_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01RB23_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01RB23_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01RB23_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01RB23_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      }
   }

   public void scanEnd1RB409( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1RB409( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1RB409( )
   {
      /* Before Insert Rules */
      if ( (0==A1273RecLinPro) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "valor incorrecto", ""), 1, "RECLINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRecLinPro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (0==A1273RecLinPro) )
      {
         GXv_char4[0] = AV18errMensaje ;
         new app.recetatinte05_prc(remoteHandle, context).execute( AV7EmprCod, AV8BarCod, AV9BarCodReo, AV10BarCodPar, AV11RecLinMaq, A1273RecLinPro, GXv_char4) ;
         recetatinte05_trn_impl.this.AV18errMensaje = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18errMensaje", AV18errMensaje);
      }
   }

   public void beforeUpdate1RB409( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RB409( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RB409( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RB409( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RB409( )
   {
      edtBarNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Enabled), 5, 0), true);
      edtRecLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtRecLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMaq_Enabled), 5, 0), true);
      edtUltLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltLinPro_Enabled), 5, 0), true);
      edtProForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Enabled), 5, 0), true);
      edtProRecObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProRecObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProRecObs_Enabled), 5, 0), true);
      edtRecNroPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNroPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNroPrg_Enabled), 5, 0), true);
      edtRecVolPrf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecVolPrf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecVolPrf_Enabled), 5, 0), true);
      edtRecNumRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNumRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNumRec_Enabled), 5, 0), true);
      edtRecNH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNH2O_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RB409( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RB0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetatinte05_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV11RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12RecLinPro,2,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
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
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetaTinte05_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetatinte05_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1273RecLinPro", GXutil.ltrim( localUtil.ntoc( Z1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4697RecNroPrg", GXutil.ltrim( localUtil.ntoc( Z4697RecNroPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4695RecVolPrf", GXutil.ltrim( localUtil.ntoc( Z4695RecVolPrf, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1251RecNumRec", GXutil.ltrim( localUtil.ntoc( Z1251RecNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10544RecNH2O", GXutil.ltrim( localUtil.ntoc( Z10544RecNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N764ProForCod", GXutil.rtrim( A764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV10BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV11RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV12RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PROFORCOD", GXutil.rtrim( AV16Insert_ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPROFORCOD", GXutil.rtrim( A764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE", AV18errMensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV22Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARNHDR_Objectcall", GXutil.rtrim( Popover_barnhdr_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARNHDR_Enabled", GXutil.booltostr( Popover_barnhdr_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARNHDR_Iteminternalname", GXutil.rtrim( Popover_barnhdr_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARNHDR_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_barnhdr_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARNHDR_Position", GXutil.rtrim( Popover_barnhdr_Position));
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
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
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
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
      return formatLink("app.recetatinte05_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV11RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12RecLinPro,2,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro"})  ;
   }

   public String getPgmname( )
   {
      return "RecetaTinte05_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Procesos Quimicos", "") ;
   }

   public void initializeNonKey1RB409( )
   {
      h764ProForCod = "" ;
      AV18errMensaje = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18errMensaje", AV18errMensaje);
      A13696BarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      A1272UltLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1272UltLinPro), 2, 0));
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A772ProForTmx = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      A4587ProRecObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4587ProRecObs", A4587ProRecObs);
      A4697RecNroPrg = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4697RecNroPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4697RecNroPrg), 5, 0));
      A4695RecVolPrf = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4695RecVolPrf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4695RecVolPrf), 5, 0));
      A1251RecNumRec = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1251RecNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1251RecNumRec), 5, 0));
      A10544RecNH2O = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10544RecNH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10544RecNH2O), 4, 0));
      Z4697RecNroPrg = 0 ;
      Z4695RecVolPrf = 0 ;
      Z1251RecNumRec = 0 ;
      Z10544RecNH2O = (short)(0) ;
      Z764ProForCod = "" ;
   }

   public void initAll1RB409( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A2804RecLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
      A1273RecLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      initializeNonKey1RB409( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211691081", true, true);
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
      httpContext.AddJavascriptSource("recetatinte05_trn.js", "?20268211691082", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockbarnhdr_Internalname = "TEXTBLOCKBARNHDR" ;
      edtBarNHdr_Internalname = "BARNHDR" ;
      lblBarnhdr_popoverimage_Internalname = "BARNHDR_POPOVERIMAGE" ;
      tblTablemergedbarnhdr_Internalname = "TABLEMERGEDBARNHDR" ;
      divTablesplittedbarnhdr_Internalname = "TABLESPLITTEDBARNHDR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Popover_barnhdr_Internalname = "POPOVER_BARNHDR" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtUltLinPro_Internalname = "ULTLINPRO" ;
      edtProForTmx_Internalname = "PROFORTMX" ;
      edtProRecObs_Internalname = "PRORECOBS" ;
      edtRecNroPrg_Internalname = "RECNROPRG" ;
      edtRecVolPrf_Internalname = "RECVOLPRF" ;
      edtRecNumRec_Internalname = "RECNUMREC" ;
      edtRecNH2O_Internalname = "RECNH2O" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento Procesos Quimicos", "") );
      Popover_barnhdr_Iteminternalname = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 0 ;
      edtProForDsc_Visible = 1 ;
      edtRecNH2O_Jsonclick = "" ;
      edtRecNH2O_Enabled = 1 ;
      edtRecNH2O_Visible = 1 ;
      edtRecNumRec_Jsonclick = "" ;
      edtRecNumRec_Enabled = 1 ;
      edtRecNumRec_Visible = 1 ;
      edtRecVolPrf_Jsonclick = "" ;
      edtRecVolPrf_Enabled = 1 ;
      edtRecVolPrf_Visible = 1 ;
      edtRecNroPrg_Jsonclick = "" ;
      edtRecNroPrg_Enabled = 1 ;
      edtRecNroPrg_Visible = 1 ;
      edtProRecObs_Enabled = 1 ;
      edtProRecObs_Visible = 1 ;
      edtProForTmx_Jsonclick = "" ;
      edtProForTmx_Enabled = 0 ;
      edtProForTmx_Visible = 1 ;
      edtUltLinPro_Jsonclick = "" ;
      edtUltLinPro_Enabled = 0 ;
      edtUltLinPro_Visible = 1 ;
      edtRecLinMaq_Jsonclick = "" ;
      edtRecLinMaq_Enabled = 1 ;
      edtRecLinMaq_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodPar_Visible = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCodReo_Visible = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtBarCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      Popover_barnhdr_Position = "Bottom" ;
      Popover_barnhdr_Popoverwidth = 400 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinPro_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Agregar Proceso", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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

   public void gxsgaproforcod1RB0( String A396EmprCod ,
                                   String A13740ProFDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaproforcod_data1RB0( A396EmprCod, A13740ProFDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaproforcod_data1RB0( String A396EmprCod ,
                                           String A13740ProFDsc )
   {
      l13740ProFDsc = GXutil.concat( GXutil.rtrim( A13740ProFDsc), "%", "") ;
      /* Using cursor T01RB24 */
      pr_default.execute(22, new Object[] {A396EmprCod, l13740ProFDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(22) != 101) )
      {
         gxdynajaxctrlcodr.add(T01RB24_A13740ProFDsc[0]);
         gxdynajaxctrldescr.add(T01RB24_A13740ProFDsc[0]);
         pr_default.readNext(22);
      }
      pr_default.close(22);
   }

   public void gxhcaproforcod1RB409( String A396EmprCod ,
                                     String A13740ProFDsc )
   {
      /* Using cursor T01RB25 */
      pr_default.execute(23, new Object[] {A13740ProFDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(23) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13740ProFDsc = T01RB25_A13740ProFDsc[0] ;
         A396EmprCod = T01RB25_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = T01RB25_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         pr_default.readNext(23);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A764ProForCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void xc_27_1RB409( String AV7EmprCod ,
                             int AV8BarCod ,
                             byte AV9BarCodReo ,
                             String AV10BarCodPar ,
                             short AV11RecLinMaq ,
                             byte A1273RecLinPro )
   {
      if ( ! (0==A1273RecLinPro) )
      {
         GXv_char4[0] = AV18errMensaje ;
         new app.recetatinte05_prc(remoteHandle, context).execute( AV7EmprCod, AV8BarCod, AV9BarCodReo, AV10BarCodPar, AV11RecLinMaq, A1273RecLinPro, GXv_char4) ;
         AV18errMensaje = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18errMensaje", AV18errMensaje);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( AV18errMensaje)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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

   public void valid_Reclinmaq( )
   {
      /* Using cursor T01RB26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "RECMAQ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINMAQ");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1272UltLinPro = T01RB26_A1272UltLinPro[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1272UltLinPro", GXutil.ltrim( localUtil.ntoc( A1272UltLinPro, (byte)(2), (byte)(0), ".", "")));
   }

   public void valid_Proforcod( )
   {
      if ( (GXutil.strcmp("", h764ProForCod)==0) )
      {
         A764ProForCod = "" ;
      }
      else
      {
         A13740ProFDsc = h764ProForCod ;
         /* Using cursor T01RB27 */
         pr_default.execute(25, new Object[] {A13740ProFDsc, A396EmprCod});
         A396EmprCod = T01RB27_A396EmprCod[0] ;
         A764ProForCod = T01RB27_A764ProForCod[0] ;
         A764ProForCod = T01RB27_A764ProForCod[0] ;
         if ( ! ( (pr_default.getStatus(25) == 101) ) )
         {
            pr_default.readNext(25);
            if ( ! ( (pr_default.getStatus(25) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "PROFORCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(25);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      /* Using cursor T01RB28 */
      pr_default.execute(26, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A766ProForDsc = T01RB28_A766ProForDsc[0] ;
      A772ProForTmx = T01RB28_A772ProForTmx[0] ;
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", GXutil.rtrim( A764ProForCod));
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV12RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV11RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV12RecLinPro',fld:'vRECLINPRO',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121RB2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_RECLINPRO","{handler:'valid_Reclinpro',iparms:[]");
      setEventMetadata("VALID_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'h764ProForCod'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A772ProForTmx',fld:'PROFORTMX',pic:'ZZZ9'},{av:'h764ProForCod'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1272UltLinPro',fld:'ULTLINPRO',pic:'Z9'}]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[{av:'A1272UltLinPro',fld:'ULTLINPRO',pic:'Z9'}]}");
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
      pr_default.close(26);
      pr_default.close(19);
      pr_default.close(24);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV10BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z764ProForCod = "" ;
      N764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV10BarCodPar = "" ;
      A396EmprCod = "" ;
      A13740ProFDsc = "" ;
      h764ProForCod = "" ;
      A764ProForCod = "" ;
      A130BarCodPar = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockbarnhdr_Jsonclick = "" ;
      sStyleString = "" ;
      A13696BarNHdr = "" ;
      lblBarnhdr_popoverimage_Jsonclick = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      ucPopover_barnhdr = new com.genexus.webpanels.GXUserControl();
      A4587ProRecObs = "" ;
      A766ProForDsc = "" ;
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      AV16Insert_ProForCod = "" ;
      AV18errMensaje = "" ;
      AV22Pgmname = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Popover_barnhdr_Objectcall = "" ;
      Popover_barnhdr_Class = "" ;
      Popover_barnhdr_Gridinternalname = "" ;
      Popover_barnhdr_Trigger = "" ;
      Popover_barnhdr_Triggerelement = "" ;
      Popover_barnhdr_Cls = "" ;
      Popover_barnhdr_Html = "" ;
      Popover_barnhdr_Load = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode409 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV21Usurcod = "" ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15WebSession = httpContext.getWebSession();
      AV17TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z4587ProRecObs = "" ;
      Z766ProForDsc = "" ;
      T01RB6_A13740ProFDsc = new String[] {""} ;
      T01RB6_A396EmprCod = new String[] {""} ;
      T01RB6_A764ProForCod = new String[] {""} ;
      T01RB5_A1272UltLinPro = new byte[1] ;
      T01RB4_A766ProForDsc = new String[] {""} ;
      T01RB4_A772ProForTmx = new short[1] ;
      T01RB7_A4587ProRecObs = new String[] {""} ;
      T01RB7_A1273RecLinPro = new byte[1] ;
      T01RB7_A1272UltLinPro = new byte[1] ;
      T01RB7_A766ProForDsc = new String[] {""} ;
      T01RB7_A772ProForTmx = new short[1] ;
      T01RB7_A4697RecNroPrg = new int[1] ;
      T01RB7_A4695RecVolPrf = new int[1] ;
      T01RB7_A1251RecNumRec = new int[1] ;
      T01RB7_A10544RecNH2O = new short[1] ;
      T01RB7_A396EmprCod = new String[] {""} ;
      T01RB7_A764ProForCod = new String[] {""} ;
      T01RB7_A129BarCod = new int[1] ;
      T01RB7_A132BarCodReo = new byte[1] ;
      T01RB7_A130BarCodPar = new String[] {""} ;
      T01RB7_A2804RecLinMaq = new short[1] ;
      T01RB8_A13740ProFDsc = new String[] {""} ;
      T01RB8_A396EmprCod = new String[] {""} ;
      T01RB8_A764ProForCod = new String[] {""} ;
      T01RB9_A13740ProFDsc = new String[] {""} ;
      T01RB9_A396EmprCod = new String[] {""} ;
      T01RB9_A764ProForCod = new String[] {""} ;
      T01RB10_A13740ProFDsc = new String[] {""} ;
      T01RB10_A396EmprCod = new String[] {""} ;
      T01RB10_A764ProForCod = new String[] {""} ;
      T01RB11_A766ProForDsc = new String[] {""} ;
      T01RB11_A772ProForTmx = new short[1] ;
      T01RB12_A1272UltLinPro = new byte[1] ;
      T01RB13_A396EmprCod = new String[] {""} ;
      T01RB13_A129BarCod = new int[1] ;
      T01RB13_A132BarCodReo = new byte[1] ;
      T01RB13_A130BarCodPar = new String[] {""} ;
      T01RB13_A2804RecLinMaq = new short[1] ;
      T01RB13_A1273RecLinPro = new byte[1] ;
      T01RB3_A4587ProRecObs = new String[] {""} ;
      T01RB3_A1273RecLinPro = new byte[1] ;
      T01RB3_A4697RecNroPrg = new int[1] ;
      T01RB3_A4695RecVolPrf = new int[1] ;
      T01RB3_A1251RecNumRec = new int[1] ;
      T01RB3_A10544RecNH2O = new short[1] ;
      T01RB3_A396EmprCod = new String[] {""} ;
      T01RB3_A764ProForCod = new String[] {""} ;
      T01RB3_A129BarCod = new int[1] ;
      T01RB3_A132BarCodReo = new byte[1] ;
      T01RB3_A130BarCodPar = new String[] {""} ;
      T01RB3_A2804RecLinMaq = new short[1] ;
      T01RB14_A396EmprCod = new String[] {""} ;
      T01RB14_A129BarCod = new int[1] ;
      T01RB14_A132BarCodReo = new byte[1] ;
      T01RB14_A130BarCodPar = new String[] {""} ;
      T01RB14_A2804RecLinMaq = new short[1] ;
      T01RB14_A1273RecLinPro = new byte[1] ;
      T01RB15_A396EmprCod = new String[] {""} ;
      T01RB15_A129BarCod = new int[1] ;
      T01RB15_A132BarCodReo = new byte[1] ;
      T01RB15_A130BarCodPar = new String[] {""} ;
      T01RB15_A2804RecLinMaq = new short[1] ;
      T01RB15_A1273RecLinPro = new byte[1] ;
      T01RB16_A13740ProFDsc = new String[] {""} ;
      T01RB16_A396EmprCod = new String[] {""} ;
      T01RB16_A764ProForCod = new String[] {""} ;
      T01RB2_A4587ProRecObs = new String[] {""} ;
      T01RB2_A1273RecLinPro = new byte[1] ;
      T01RB2_A4697RecNroPrg = new int[1] ;
      T01RB2_A4695RecVolPrf = new int[1] ;
      T01RB2_A1251RecNumRec = new int[1] ;
      T01RB2_A10544RecNH2O = new short[1] ;
      T01RB2_A396EmprCod = new String[] {""} ;
      T01RB2_A764ProForCod = new String[] {""} ;
      T01RB2_A129BarCod = new int[1] ;
      T01RB2_A132BarCodReo = new byte[1] ;
      T01RB2_A130BarCodPar = new String[] {""} ;
      T01RB2_A2804RecLinMaq = new short[1] ;
      T01RB20_A1272UltLinPro = new byte[1] ;
      T01RB21_A766ProForDsc = new String[] {""} ;
      T01RB21_A772ProForTmx = new short[1] ;
      T01RB22_A396EmprCod = new String[] {""} ;
      T01RB22_A129BarCod = new int[1] ;
      T01RB22_A132BarCodReo = new byte[1] ;
      T01RB22_A130BarCodPar = new String[] {""} ;
      T01RB22_A2804RecLinMaq = new short[1] ;
      T01RB22_A1273RecLinPro = new byte[1] ;
      T01RB22_A811RecLin = new short[1] ;
      T01RB23_A396EmprCod = new String[] {""} ;
      T01RB23_A129BarCod = new int[1] ;
      T01RB23_A132BarCodReo = new byte[1] ;
      T01RB23_A130BarCodPar = new String[] {""} ;
      T01RB23_A2804RecLinMaq = new short[1] ;
      T01RB23_A1273RecLinPro = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13740ProFDsc = "" ;
      T01RB24_A13740ProFDsc = new String[] {""} ;
      T01RB25_A13740ProFDsc = new String[] {""} ;
      T01RB25_A396EmprCod = new String[] {""} ;
      T01RB25_A764ProForCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      T01RB26_A1272UltLinPro = new byte[1] ;
      T01RB27_A13740ProFDsc = new String[] {""} ;
      T01RB27_A396EmprCod = new String[] {""} ;
      T01RB27_A764ProForCod = new String[] {""} ;
      T01RB28_A766ProForDsc = new String[] {""} ;
      T01RB28_A772ProForTmx = new short[1] ;
      Zh764ProForCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.recetatinte05_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recetatinte05_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recetatinte05_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recetatinte05_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetatinte05_trn__default(),
         new Object[] {
             new Object[] {
            T01RB2_A4587ProRecObs, T01RB2_A1273RecLinPro, T01RB2_A4697RecNroPrg, T01RB2_A4695RecVolPrf, T01RB2_A1251RecNumRec, T01RB2_A10544RecNH2O, T01RB2_A396EmprCod, T01RB2_A764ProForCod, T01RB2_A129BarCod, T01RB2_A132BarCodReo,
            T01RB2_A130BarCodPar, T01RB2_A2804RecLinMaq
            }
            , new Object[] {
            T01RB3_A4587ProRecObs, T01RB3_A1273RecLinPro, T01RB3_A4697RecNroPrg, T01RB3_A4695RecVolPrf, T01RB3_A1251RecNumRec, T01RB3_A10544RecNH2O, T01RB3_A396EmprCod, T01RB3_A764ProForCod, T01RB3_A129BarCod, T01RB3_A132BarCodReo,
            T01RB3_A130BarCodPar, T01RB3_A2804RecLinMaq
            }
            , new Object[] {
            T01RB4_A766ProForDsc, T01RB4_A772ProForTmx
            }
            , new Object[] {
            T01RB5_A1272UltLinPro
            }
            , new Object[] {
            T01RB6_A13740ProFDsc, T01RB6_A396EmprCod, T01RB6_A764ProForCod
            }
            , new Object[] {
            T01RB7_A4587ProRecObs, T01RB7_A1273RecLinPro, T01RB7_A1272UltLinPro, T01RB7_A766ProForDsc, T01RB7_A772ProForTmx, T01RB7_A4697RecNroPrg, T01RB7_A4695RecVolPrf, T01RB7_A1251RecNumRec, T01RB7_A10544RecNH2O, T01RB7_A396EmprCod,
            T01RB7_A764ProForCod, T01RB7_A129BarCod, T01RB7_A132BarCodReo, T01RB7_A130BarCodPar, T01RB7_A2804RecLinMaq
            }
            , new Object[] {
            T01RB8_A13740ProFDsc, T01RB8_A396EmprCod, T01RB8_A764ProForCod
            }
            , new Object[] {
            T01RB9_A13740ProFDsc, T01RB9_A396EmprCod, T01RB9_A764ProForCod
            }
            , new Object[] {
            T01RB10_A13740ProFDsc, T01RB10_A396EmprCod, T01RB10_A764ProForCod
            }
            , new Object[] {
            T01RB11_A766ProForDsc, T01RB11_A772ProForTmx
            }
            , new Object[] {
            T01RB12_A1272UltLinPro
            }
            , new Object[] {
            T01RB13_A396EmprCod, T01RB13_A129BarCod, T01RB13_A132BarCodReo, T01RB13_A130BarCodPar, T01RB13_A2804RecLinMaq, T01RB13_A1273RecLinPro
            }
            , new Object[] {
            T01RB14_A396EmprCod, T01RB14_A129BarCod, T01RB14_A132BarCodReo, T01RB14_A130BarCodPar, T01RB14_A2804RecLinMaq, T01RB14_A1273RecLinPro
            }
            , new Object[] {
            T01RB15_A396EmprCod, T01RB15_A129BarCod, T01RB15_A132BarCodReo, T01RB15_A130BarCodPar, T01RB15_A2804RecLinMaq, T01RB15_A1273RecLinPro
            }
            , new Object[] {
            T01RB16_A13740ProFDsc, T01RB16_A396EmprCod, T01RB16_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RB20_A1272UltLinPro
            }
            , new Object[] {
            T01RB21_A766ProForDsc, T01RB21_A772ProForTmx
            }
            , new Object[] {
            T01RB22_A396EmprCod, T01RB22_A129BarCod, T01RB22_A132BarCodReo, T01RB22_A130BarCodPar, T01RB22_A2804RecLinMaq, T01RB22_A1273RecLinPro, T01RB22_A811RecLin
            }
            , new Object[] {
            T01RB23_A396EmprCod, T01RB23_A129BarCod, T01RB23_A132BarCodReo, T01RB23_A130BarCodPar, T01RB23_A2804RecLinMaq, T01RB23_A1273RecLinPro
            }
            , new Object[] {
            T01RB24_A13740ProFDsc
            }
            , new Object[] {
            T01RB25_A13740ProFDsc, T01RB25_A396EmprCod, T01RB25_A764ProForCod
            }
            , new Object[] {
            T01RB26_A1272UltLinPro
            }
            , new Object[] {
            T01RB27_A13740ProFDsc, T01RB27_A396EmprCod, T01RB27_A764ProForCod
            }
            , new Object[] {
            T01RB28_A766ProForDsc, T01RB28_A772ProForTmx
            }
         }
      );
      AV22Pgmname = "RecetaTinte05_TRN" ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV9BarCodReo ;
   private byte wcpOAV12RecLinPro ;
   private byte Z132BarCodReo ;
   private byte Z1273RecLinPro ;
   private byte GxWebError ;
   private byte AV9BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A132BarCodReo ;
   private byte AV12RecLinPro ;
   private byte nKeyPressed ;
   private byte A1272UltLinPro ;
   private byte Z1272UltLinPro ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV11RecLinMaq ;
   private short Z2804RecLinMaq ;
   private short Z10544RecNH2O ;
   private short AV11RecLinMaq ;
   private short A2804RecLinMaq ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A772ProForTmx ;
   private short A10544RecNH2O ;
   private short RcdFound409 ;
   private short nCmpId ;
   private short Z772ProForTmx ;
   private short nIsDirty_409 ;
   private short gxhchits ;
   private int wcpOAV8BarCod ;
   private int Z129BarCod ;
   private int Z4697RecNroPrg ;
   private int Z4695RecVolPrf ;
   private int Z1251RecNumRec ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int trnEnded ;
   private int edtBarNHdr_Enabled ;
   private int edtRecLinPro_Enabled ;
   private int edtProForCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int Popover_barnhdr_Popoverwidth ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtBarCod_Visible ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Visible ;
   private int edtBarCodPar_Enabled ;
   private int edtRecLinMaq_Visible ;
   private int edtRecLinMaq_Enabled ;
   private int edtUltLinPro_Enabled ;
   private int edtUltLinPro_Visible ;
   private int edtProForTmx_Enabled ;
   private int edtProForTmx_Visible ;
   private int edtProRecObs_Visible ;
   private int edtProRecObs_Enabled ;
   private int A4697RecNroPrg ;
   private int edtRecNroPrg_Enabled ;
   private int edtRecNroPrg_Visible ;
   private int A4695RecVolPrf ;
   private int edtRecVolPrf_Enabled ;
   private int edtRecVolPrf_Visible ;
   private int A1251RecNumRec ;
   private int edtRecNumRec_Enabled ;
   private int edtRecNumRec_Visible ;
   private int edtRecNH2O_Enabled ;
   private int edtRecNH2O_Visible ;
   private int edtProForDsc_Visible ;
   private int edtProForDsc_Enabled ;
   private int Popover_barnhdr_Minimumcharacters ;
   private int AV23GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV10BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z764ProForCod ;
   private String N764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV10BarCodPar ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRecLinPro_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedbarnhdr_Internalname ;
   private String lblTextblockbarnhdr_Internalname ;
   private String lblTextblockbarnhdr_Jsonclick ;
   private String sStyleString ;
   private String tblTablemergedbarnhdr_Internalname ;
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String lblBarnhdr_popoverimage_Internalname ;
   private String lblBarnhdr_popoverimage_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtRecLinPro_Jsonclick ;
   private String edtProForCod_Internalname ;
   private String edtProForCod_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Popover_barnhdr_Position ;
   private String Popover_barnhdr_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtUltLinPro_Internalname ;
   private String edtUltLinPro_Jsonclick ;
   private String edtProForTmx_Internalname ;
   private String edtProForTmx_Jsonclick ;
   private String edtProRecObs_Internalname ;
   private String edtRecNroPrg_Internalname ;
   private String edtRecNroPrg_Jsonclick ;
   private String edtRecVolPrf_Internalname ;
   private String edtRecVolPrf_Jsonclick ;
   private String edtRecNumRec_Internalname ;
   private String edtRecNumRec_Jsonclick ;
   private String edtRecNH2O_Internalname ;
   private String edtRecNH2O_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String AV16Insert_ProForCod ;
   private String AV22Pgmname ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Popover_barnhdr_Objectcall ;
   private String Popover_barnhdr_Class ;
   private String Popover_barnhdr_Gridinternalname ;
   private String Popover_barnhdr_Iteminternalname ;
   private String Popover_barnhdr_Trigger ;
   private String Popover_barnhdr_Triggerelement ;
   private String Popover_barnhdr_Cls ;
   private String Popover_barnhdr_Html ;
   private String Popover_barnhdr_Load ;
   private String hsh ;
   private String sMode409 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20Emprnom ;
   private String GXv_char3[] ;
   private String AV21Usurcod ;
   private String Z766ProForDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Popover_barnhdr_Enabled ;
   private boolean Popover_barnhdr_Isgriditem ;
   private boolean Popover_barnhdr_Showloading ;
   private boolean Popover_barnhdr_Keepopened ;
   private boolean Popover_barnhdr_Reloadonkeychange ;
   private boolean Popover_barnhdr_Openifempty ;
   private boolean Popover_barnhdr_Visible ;
   private boolean returnInSub ;
   private String A4587ProRecObs ;
   private String Z4587ProRecObs ;
   private String A13740ProFDsc ;
   private String h764ProForCod ;
   private String AV18errMensaje ;
   private String l13740ProFDsc ;
   private String Zh764ProForCod ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV15WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucPopover_barnhdr ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RB6_A13740ProFDsc ;
   private String[] T01RB6_A396EmprCod ;
   private String[] T01RB6_A764ProForCod ;
   private byte[] T01RB5_A1272UltLinPro ;
   private String[] T01RB4_A766ProForDsc ;
   private short[] T01RB4_A772ProForTmx ;
   private String[] T01RB7_A4587ProRecObs ;
   private byte[] T01RB7_A1273RecLinPro ;
   private byte[] T01RB7_A1272UltLinPro ;
   private String[] T01RB7_A766ProForDsc ;
   private short[] T01RB7_A772ProForTmx ;
   private int[] T01RB7_A4697RecNroPrg ;
   private int[] T01RB7_A4695RecVolPrf ;
   private int[] T01RB7_A1251RecNumRec ;
   private short[] T01RB7_A10544RecNH2O ;
   private String[] T01RB7_A396EmprCod ;
   private String[] T01RB7_A764ProForCod ;
   private int[] T01RB7_A129BarCod ;
   private byte[] T01RB7_A132BarCodReo ;
   private String[] T01RB7_A130BarCodPar ;
   private short[] T01RB7_A2804RecLinMaq ;
   private String[] T01RB8_A13740ProFDsc ;
   private String[] T01RB8_A396EmprCod ;
   private String[] T01RB8_A764ProForCod ;
   private String[] T01RB9_A13740ProFDsc ;
   private String[] T01RB9_A396EmprCod ;
   private String[] T01RB9_A764ProForCod ;
   private String[] T01RB10_A13740ProFDsc ;
   private String[] T01RB10_A396EmprCod ;
   private String[] T01RB10_A764ProForCod ;
   private String[] T01RB11_A766ProForDsc ;
   private short[] T01RB11_A772ProForTmx ;
   private byte[] T01RB12_A1272UltLinPro ;
   private String[] T01RB13_A396EmprCod ;
   private int[] T01RB13_A129BarCod ;
   private byte[] T01RB13_A132BarCodReo ;
   private String[] T01RB13_A130BarCodPar ;
   private short[] T01RB13_A2804RecLinMaq ;
   private byte[] T01RB13_A1273RecLinPro ;
   private String[] T01RB3_A4587ProRecObs ;
   private byte[] T01RB3_A1273RecLinPro ;
   private int[] T01RB3_A4697RecNroPrg ;
   private int[] T01RB3_A4695RecVolPrf ;
   private int[] T01RB3_A1251RecNumRec ;
   private short[] T01RB3_A10544RecNH2O ;
   private String[] T01RB3_A396EmprCod ;
   private String[] T01RB3_A764ProForCod ;
   private int[] T01RB3_A129BarCod ;
   private byte[] T01RB3_A132BarCodReo ;
   private String[] T01RB3_A130BarCodPar ;
   private short[] T01RB3_A2804RecLinMaq ;
   private String[] T01RB14_A396EmprCod ;
   private int[] T01RB14_A129BarCod ;
   private byte[] T01RB14_A132BarCodReo ;
   private String[] T01RB14_A130BarCodPar ;
   private short[] T01RB14_A2804RecLinMaq ;
   private byte[] T01RB14_A1273RecLinPro ;
   private String[] T01RB15_A396EmprCod ;
   private int[] T01RB15_A129BarCod ;
   private byte[] T01RB15_A132BarCodReo ;
   private String[] T01RB15_A130BarCodPar ;
   private short[] T01RB15_A2804RecLinMaq ;
   private byte[] T01RB15_A1273RecLinPro ;
   private String[] T01RB16_A13740ProFDsc ;
   private String[] T01RB16_A396EmprCod ;
   private String[] T01RB16_A764ProForCod ;
   private String[] T01RB2_A4587ProRecObs ;
   private byte[] T01RB2_A1273RecLinPro ;
   private int[] T01RB2_A4697RecNroPrg ;
   private int[] T01RB2_A4695RecVolPrf ;
   private int[] T01RB2_A1251RecNumRec ;
   private short[] T01RB2_A10544RecNH2O ;
   private String[] T01RB2_A396EmprCod ;
   private String[] T01RB2_A764ProForCod ;
   private int[] T01RB2_A129BarCod ;
   private byte[] T01RB2_A132BarCodReo ;
   private String[] T01RB2_A130BarCodPar ;
   private short[] T01RB2_A2804RecLinMaq ;
   private byte[] T01RB20_A1272UltLinPro ;
   private String[] T01RB21_A766ProForDsc ;
   private short[] T01RB21_A772ProForTmx ;
   private String[] T01RB22_A396EmprCod ;
   private int[] T01RB22_A129BarCod ;
   private byte[] T01RB22_A132BarCodReo ;
   private String[] T01RB22_A130BarCodPar ;
   private short[] T01RB22_A2804RecLinMaq ;
   private byte[] T01RB22_A1273RecLinPro ;
   private short[] T01RB22_A811RecLin ;
   private String[] T01RB23_A396EmprCod ;
   private int[] T01RB23_A129BarCod ;
   private byte[] T01RB23_A132BarCodReo ;
   private String[] T01RB23_A130BarCodPar ;
   private short[] T01RB23_A2804RecLinMaq ;
   private byte[] T01RB23_A1273RecLinPro ;
   private String[] T01RB24_A13740ProFDsc ;
   private String[] T01RB25_A13740ProFDsc ;
   private String[] T01RB25_A396EmprCod ;
   private String[] T01RB25_A764ProForCod ;
   private byte[] T01RB26_A1272UltLinPro ;
   private String[] T01RB27_A13740ProFDsc ;
   private String[] T01RB27_A396EmprCod ;
   private String[] T01RB27_A764ProForCod ;
   private String[] T01RB28_A766ProForDsc ;
   private short[] T01RB28_A772ProForTmx ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV17TrnContextAtt ;
}

final  class recetatinte05_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetatinte05_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetatinte05_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetatinte05_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetatinte05_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RB2", "SELECT ProRecObs, RecLinPro, RecNroPrg, RecVolPrf, RecNumRec, RecNH2O, EmprCod, ProForCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?  FOR UPDATE OF ProRecObs, RecNroPrg, RecVolPrf, RecNumRec, RecNH2O, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB3", "SELECT ProRecObs, RecLinPro, RecNroPrg, RecVolPrf, RecNumRec, RecNH2O, EmprCod, ProForCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB4", "SELECT ProForDsc, ProForTmx FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB5", "SELECT UltLinPro FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB6", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB7", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProRecObs, TM1.RecLinPro, T2.UltLinPro, T3.ProForDsc, T3.ProForTmx, TM1.RecNroPrg, TM1.RecVolPrf, TM1.RecNumRec, TM1.RecNH2O, TM1.EmprCod, TM1.ProForCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq FROM ((TXPCRECET TM1 INNER JOIN TXPRECMAQ T2 ON T2.EmprCod = TM1.EmprCod AND T2.BarCod = TM1.BarCod AND T2.BarCodReo = TM1.BarCodReo AND T2.BarCodPar = TM1.BarCodPar AND T2.RecLinMaq = TM1.RecLinMaq) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProForCod = TM1.ProForCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.RecLinMaq = ? and TM1.RecLinPro = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq, TM1.RecLinPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB8", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB9", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB10", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB11", "SELECT ProForDsc, ProForTmx FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB12", "SELECT UltLinPro FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq > ? or RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinPro > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RB15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq < ? or RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinPro < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMaq DESC, RecLinPro DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RB16", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01RB17", "INSERT INTO TXPCRECET(RecLinPro, ProRecObs, RecNroPrg, RecVolPrf, RecNumRec, RecNH2O, EmprCod, ProForCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecTiempo, RecTemp, RecPhMx, RecPhMn, RecRb) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCRECET")
         ,new UpdateCursor("T01RB18", "UPDATE TXPCRECET SET ProRecObs=?, RecNroPrg=?, RecVolPrf=?, RecNumRec=?, RecNH2O=?, ProForCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK, "TXPCRECET")
         ,new UpdateCursor("T01RB19", "DELETE FROM TXPCRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?", GX_NOMASK, "TXPCRECET")
         ,new ForEachCursor("T01RB20", "SELECT UltLinPro FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB21", "SELECT ProForDsc, ProForTmx FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RB23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB24", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc FROM TXPCPROFO WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc))) like '%' || UPPER(?)) ORDER BY ProFDsc) WHERE rownum <= 50 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB25", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB26", "SELECT UltLinPro FROM TXPRECMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB27", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RB28", "SELECT ProForDsc, ProForTmx FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 18 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 24 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 15 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setLongVarchar(2, (String)parms[1], false);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 16 :
               stmt.setLongVarchar(1, (String)parms[0], false);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

