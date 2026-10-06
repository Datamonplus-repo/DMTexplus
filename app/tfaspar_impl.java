package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfaspar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action22") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_22_D0475( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A1664ParFasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13203ParUndID = (short)(GXutil.lval( httpContext.GetPar( "ParUndID"))) ;
         n13203ParUndID = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A13203ParUndID) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV39EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39EmprCod", AV39EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39EmprCod, "@!"))));
            AV40BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40BarCod), "ZZZZZZZ9")));
            AV41BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarCodReo", GXutil.str( AV41BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41BarCodReo), "9")));
            AV42BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42BarCodPar", AV42BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42BarCodPar, ""))));
            AV43ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43ProCod", AV43ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43ProCod, ""))));
            AV44BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44BarOrdLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44BarOrdLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Parametros", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_42 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_42"))) ;
      nGXsfl_42_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_42_idx"))) ;
      sGXsfl_42_idx = httpContext.GetPar( "sGXsfl_42_idx") ;
      edtBarParVal_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParVal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVal_Visible), 5, 0), !bGXsfl_42_Refreshing);
      edtBarValPar_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarValPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarValPar_Visible), 5, 0), !bGXsfl_42_Refreshing);
      edtItm_ord5_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtItm_ord5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord5_Visible), 5, 0), !bGXsfl_42_Refreshing);
      edtBarParVl2_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParVl2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVl2_Visible), 5, 0), !bGXsfl_42_Refreshing);
      edtParFasCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_42_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tfaspar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfaspar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfaspar_impl.class ));
   }

   public tfaspar_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTbl1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFasPar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Proceso", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFasPar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarOrdLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarOrdLin_Internalname, httpContext.getMessage( "Orden", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFasPar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Fase", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFasPar.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFasPar.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFasPar.htm");
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
      ucCombo_parfascod.setProperty("Caption", Combo_parfascod_Caption);
      ucCombo_parfascod.setProperty("Cls", Combo_parfascod_Cls);
      ucCombo_parfascod.setProperty("IsGridItem", Combo_parfascod_Isgriditem);
      ucCombo_parfascod.setProperty("EmptyItem", Combo_parfascod_Emptyitem);
      ucCombo_parfascod.setProperty("DropDownOptionsData", AV50ParFasCod_Data);
      ucCombo_parfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parfascod_Internalname, "COMBO_PARFASCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol42( ) ;
      nGXsfl_42_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount475 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_475 = (short)(1) ;
            scanStartD0475( ) ;
            while ( RcdFound475 != 0 )
            {
               init_level_properties475( ) ;
               getByPrimaryKeyD0475( ) ;
               addRowD0475( ) ;
               scanNextD0475( ) ;
            }
            scanEndD0475( ) ;
            nBlankRcdCount475 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalD0475( ) ;
         standaloneModalD0475( ) ;
         sMode475 = Gx_mode ;
         while ( nGXsfl_42_idx < nRC_GXsfl_42 )
         {
            bGXsfl_42_Refreshing = true ;
            readRowD0475( ) ;
            edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtParFasCod_Horizontalalignment = httpContext.cgiGet( "PARFASCOD_"+sGXsfl_42_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_42_Refreshing);
            edtBarParVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARVAL_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarParVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVal_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtBarParVal_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARVAL_"+sGXsfl_42_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarParVal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVal_Visible), 5, 0), !bGXsfl_42_Refreshing);
            edtBarParVl2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARVL2_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarParVl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVl2_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtBarParVl2_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARVL2_"+sGXsfl_42_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarParVl2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVl2_Visible), 5, 0), !bGXsfl_42_Refreshing);
            edtParUndID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDID_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParUndID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndID_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtParUndDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDDSC_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtParUndDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndDsc_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtBarValPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARVALPAR_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarValPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarValPar_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtBarValPar_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "BARVALPAR_"+sGXsfl_42_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarValPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarValPar_Visible), 5, 0), !bGXsfl_42_Refreshing);
            edtItm_ord5_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD5_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtItm_ord5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord5_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtItm_ord5_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD5_"+sGXsfl_42_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtItm_ord5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord5_Visible), 5, 0), !bGXsfl_42_Refreshing);
            edtBarParObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPAROBS_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarParObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParObs_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            if ( ( nRcdExists_475 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalD0475( ) ;
            }
            sendRowD0475( ) ;
            bGXsfl_42_Refreshing = false ;
         }
         Gx_mode = sMode475 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount475 = (short)(5) ;
         nRcdExists_475 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartD0475( ) ;
            while ( RcdFound475 != 0 )
            {
               sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_42475( ) ;
               init_level_properties475( ) ;
               standaloneNotModalD0475( ) ;
               getByPrimaryKeyD0475( ) ;
               standaloneModalD0475( ) ;
               addRowD0475( ) ;
               scanNextD0475( ) ;
            }
            scanEndD0475( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode475 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_42475( ) ;
         initAllD0475( ) ;
         init_level_properties475( ) ;
         nRcdExists_475 = (short)(0) ;
         nIsMod_475 = (short)(0) ;
         nRcdDeleted_475 = (short)(0) ;
         nBlankRcdCount475 = (short)(nBlankRcdUsr475+nBlankRcdCount475) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount475 > 0 )
         {
            standaloneNotModalD0475( ) ;
            standaloneModalD0475( ) ;
            addRowD0475( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtParFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount475 = (short)(nBlankRcdCount475-1) ;
         }
         Gx_mode = sMode475 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
      }
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
      e11D02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD_DATA"), AV50ParFasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            A457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_42 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_42"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N457FasCod = httpContext.cgiGet( "N457FasCod") ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( "BARCODPAR") ;
            AV39EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV40BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV43ProCod = httpContext.cgiGet( "vPROCOD") ;
            A758ProCod = httpContext.cgiGet( "PROCOD") ;
            AV44BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "vBARORDLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV48Insert_FasCod = httpContext.cgiGet( "vINSERT_FASCOD") ;
            A457FasCod = httpContext.cgiGet( "FASCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV59Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV35OldVal = httpContext.cgiGet( "vOLDVAL") ;
            AV36Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV12Station = httpContext.cgiGet( "vSTATION") ;
            A13991BarParVMn = httpContext.cgiGet( "BARPARVMN") ;
            A13992BarParVMx = httpContext.cgiGet( "BARPARVMX") ;
            A14079BarParPLC = httpContext.cgiGet( "BARPARPLC") ;
            A1665ParFasDsc = httpContext.cgiGet( "PARFASDSC") ;
            n1665ParFasDsc = false ;
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
            Combo_parfascod_Objectcall = httpContext.cgiGet( "COMBO_PARFASCOD_Objectcall") ;
            Combo_parfascod_Class = httpContext.cgiGet( "COMBO_PARFASCOD_Class") ;
            Combo_parfascod_Icontype = httpContext.cgiGet( "COMBO_PARFASCOD_Icontype") ;
            Combo_parfascod_Icon = httpContext.cgiGet( "COMBO_PARFASCOD_Icon") ;
            Combo_parfascod_Caption = httpContext.cgiGet( "COMBO_PARFASCOD_Caption") ;
            Combo_parfascod_Tooltip = httpContext.cgiGet( "COMBO_PARFASCOD_Tooltip") ;
            Combo_parfascod_Cls = httpContext.cgiGet( "COMBO_PARFASCOD_Cls") ;
            Combo_parfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_set") ;
            Combo_parfascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_get") ;
            Combo_parfascod_Selectedtext_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedtext_set") ;
            Combo_parfascod_Selectedtext_get = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedtext_get") ;
            Combo_parfascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PARFASCOD_Gamoauthtoken") ;
            Combo_parfascod_Ddointernalname = httpContext.cgiGet( "COMBO_PARFASCOD_Ddointernalname") ;
            Combo_parfascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PARFASCOD_Titlecontrolalign") ;
            Combo_parfascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PARFASCOD_Dropdownoptionstype") ;
            Combo_parfascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Enabled")) ;
            Combo_parfascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Visible")) ;
            Combo_parfascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PARFASCOD_Titlecontrolidtoreplace") ;
            Combo_parfascod_Datalisttype = httpContext.cgiGet( "COMBO_PARFASCOD_Datalisttype") ;
            Combo_parfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Allowmultipleselection")) ;
            Combo_parfascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistfixedvalues") ;
            Combo_parfascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Isgriditem")) ;
            Combo_parfascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Hasdescription")) ;
            Combo_parfascod_Datalistproc = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistproc") ;
            Combo_parfascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PARFASCOD_Datalistprocparametersprefix") ;
            Combo_parfascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PARFASCOD_Remoteservicesparameters") ;
            Combo_parfascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PARFASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_parfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeonlyselectedoption")) ;
            Combo_parfascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeselectalloption")) ;
            Combo_parfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitem")) ;
            Combo_parfascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeaddnewoption")) ;
            Combo_parfascod_Htmltemplate = httpContext.cgiGet( "COMBO_PARFASCOD_Htmltemplate") ;
            Combo_parfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluestype") ;
            Combo_parfascod_Loadingdata = httpContext.cgiGet( "COMBO_PARFASCOD_Loadingdata") ;
            Combo_parfascod_Noresultsfound = httpContext.cgiGet( "COMBO_PARFASCOD_Noresultsfound") ;
            Combo_parfascod_Emptyitemtext = httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitemtext") ;
            Combo_parfascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PARFASCOD_Onlyselectedvalues") ;
            Combo_parfascod_Selectalltext = httpContext.cgiGet( "COMBO_PARFASCOD_Selectalltext") ;
            Combo_parfascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluesseparator") ;
            Combo_parfascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PARFASCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TFasPar");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A194BarOrdLin != Z194BarOrdLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tfaspar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
                  sMode15 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode15 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound15 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_D00( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "BARORDLIN");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarOrdLin_Internalname ;
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
                        e11D02 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12D02 ();
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
         /* Execute user event: After Trn */
         e12D02 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllD015( ) ;
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
         disableAttributesD015( ) ;
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

   public void confirm_D00( )
   {
      beforeValidateD015( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsD015( ) ;
         }
         else
         {
            checkExtendedTableD015( ) ;
            closeExtendedTableCursorsD015( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode15 = Gx_mode ;
         confirm_D0475( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode15 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_D0475( )
   {
      nGXsfl_42_idx = 0 ;
      while ( nGXsfl_42_idx < nRC_GXsfl_42 )
      {
         readRowD0475( ) ;
         if ( ( nRcdExists_475 != 0 ) || ( nIsMod_475 != 0 ) )
         {
            getKeyD0475( ) ;
            if ( ( nRcdExists_475 == 0 ) && ( nRcdDeleted_475 == 0 ) )
            {
               if ( RcdFound475 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateD0475( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableD0475( ) ;
                     closeExtendedTableCursorsD0475( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PARFASCOD_" + sGXsfl_42_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound475 != 0 )
               {
                  if ( nRcdDeleted_475 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyD0475( ) ;
                     loadD0475( ) ;
                     beforeValidateD0475( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsD0475( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_475 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateD0475( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableD0475( ) ;
                           closeExtendedTableCursorsD0475( ) ;
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
                  if ( nRcdDeleted_475 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_42_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarParVal_Internalname, GXutil.rtrim( A3295BarParVal)) ;
         httpContext.changePostValue( edtBarParVl2_Internalname, GXutil.rtrim( A12671BarParVl2)) ;
         httpContext.changePostValue( edtParUndID_Internalname, GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParUndDsc_Internalname, GXutil.rtrim( A13204ParUndDsc)) ;
         httpContext.changePostValue( edtBarValPar_Internalname, GXutil.rtrim( A9737BarValPar)) ;
         httpContext.changePostValue( edtItm_ord5_Internalname, GXutil.ltrim( localUtil.ntoc( A10257Itm_ord5, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarParObs_Internalname, GXutil.rtrim( A3296BarParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3295BarParVal_"+sGXsfl_42_idx, GXutil.rtrim( Z3295BarParVal)) ;
         httpContext.changePostValue( "ZT_"+"Z3296BarParObs_"+sGXsfl_42_idx, GXutil.rtrim( Z3296BarParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z9737BarValPar_"+sGXsfl_42_idx, GXutil.rtrim( Z9737BarValPar)) ;
         httpContext.changePostValue( "ZT_"+"Z10257Itm_ord5_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( Z10257Itm_ord5, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12671BarParVl2_"+sGXsfl_42_idx, GXutil.rtrim( Z12671BarParVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z13991BarParVMn_"+sGXsfl_42_idx, GXutil.rtrim( Z13991BarParVMn)) ;
         httpContext.changePostValue( "ZT_"+"Z13992BarParVMx_"+sGXsfl_42_idx, GXutil.rtrim( Z13992BarParVMx)) ;
         httpContext.changePostValue( "ZT_"+"Z14079BarParPLC_"+sGXsfl_42_idx, GXutil.rtrim( Z14079BarParPLC)) ;
         httpContext.changePostValue( "T3295BarParVal_"+sGXsfl_42_idx, GXutil.rtrim( O3295BarParVal)) ;
         httpContext.changePostValue( "nRcdDeleted_475_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_475_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_475_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_475 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_42_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment)) ;
            httpContext.changePostValue( "BARPARVAL_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPARVAL_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarParVal_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPARVL2_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParVl2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPARVL2_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarParVl2_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDID_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDDSC_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARVALPAR_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarValPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARVALPAR_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarValPar_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD5_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord5_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD5_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtItm_ord5_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPAROBS_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionD00( )
   {
   }

   public void e11D02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfaspar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV39EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfaspar_impl.this.AV39EmprCod = GXv_char2[0] ;
      tfaspar_impl.this.AV11EmprNom = GXv_char3[0] ;
      tfaspar_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39EmprCod", AV39EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV37tintutex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV39EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      tfaspar_impl.this.GXt_int5 = GXv_int6[0] ;
      AV37tintutex = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37tintutex", GXutil.str( AV37tintutex, 1, 0));
      if ( AV37tintutex == 1 )
      {
         edtBarParVal_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarParVal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVal_Visible), 5, 0), !bGXsfl_42_Refreshing);
         edtBarValPar_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarValPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarValPar_Visible), 5, 0), !bGXsfl_42_Refreshing);
         edtItm_ord5_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtItm_ord5_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord5_Visible), 5, 0), !bGXsfl_42_Refreshing);
      }
      GXt_int5 = AV38jpf ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JPF", ""), GXv_int6) ;
      tfaspar_impl.this.GXt_int5 = GXv_int6[0] ;
      AV38jpf = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38jpf", GXutil.str( AV38jpf, 1, 0));
      edtBarParVal_Visible = ((AV38jpf==1) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParVal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVal_Visible), 5, 0), !bGXsfl_42_Refreshing);
      edtBarParVl2_Visible = ((AV38jpf==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParVl2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVl2_Visible), 5, 0), !bGXsfl_42_Refreshing);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tfaspar_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV39EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tfaspar_impl.this.AV39EmprCod = GXv_char4[0] ;
      tfaspar_impl.this.AV11EmprNom = GXv_char3[0] ;
      tfaspar_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39EmprCod", AV39EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext7[0] = AV45WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV45WWPContext = GXv_SdtWWPContext7[0] ;
      Combo_parfascod_Titlecontrolidtoreplace = edtParFasCod_Internalname ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "TitleControlIdToReplace", Combo_parfascod_Titlecontrolidtoreplace);
      edtParFasCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Horizontalalignment", edtParFasCod_Horizontalalignment, !bGXsfl_42_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV46TrnContext.fromxml(AV47WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV46TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV59Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV60GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GXV1), 8, 0));
         while ( AV60GXV1 <= AV46TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV49TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV46TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV60GXV1));
            if ( GXutil.strcmp(AV49TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FasCod") == 0 )
            {
               AV48Insert_FasCod = AV49TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48Insert_FasCod", AV48Insert_FasCod);
            }
            AV60GXV1 = (int)(AV60GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60GXV1), 8, 0));
         }
      }
   }

   public void e12D02( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPARFASCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV50ParFasCod_Data ;
      GXv_char4[0] = AV52ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tfasparloaddvcombo(remoteHandle, context).execute( "ParFasCod", Gx_mode, AV39EmprCod, AV40BarCod, AV41BarCodReo, AV42BarCodPar, AV43ProCod, AV44BarOrdLin, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tfaspar_impl.this.AV52ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV50ParFasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void zmD015( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z457FasCod = T00D07_A457FasCod[0] ;
         }
         else
         {
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z194BarOrdLin = A194BarOrdLin ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z457FasCod = A457FasCod ;
         Z407EmprNom = A407EmprNom ;
         Z460FasDsc = A460FasDsc ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      AV59Pgmname = "TFasPar" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV39EmprCod)==0) )
      {
         A396EmprCod = AV39EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00D08 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00D08_A407EmprNom[0] ;
      n407EmprNom = T00D08_n407EmprNom[0] ;
      pr_default.close(6);
      if ( ! (0==AV40BarCod) )
      {
         A129BarCod = AV40BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV41BarCodReo) )
      {
         A132BarCodReo = AV41BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV42BarCodPar)==0) )
      {
         A130BarCodPar = AV42BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      if ( ! (GXutil.strcmp("", AV43ProCod)==0) )
      {
         A758ProCod = AV43ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Using cursor T00D09 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00D09_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(7);
      /* Using cursor T00D010 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(8);
      if ( ! (0==AV44BarOrdLin) )
      {
         A194BarOrdLin = AV44BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV48Insert_FasCod)==0) )
      {
         A457FasCod = AV48Insert_FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
         /* Using cursor T00D011 */
         pr_default.execute(9, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00D011_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(9);
      }
   }

   public void loadD015( )
   {
      /* Using cursor T00D012 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A407EmprNom = T00D012_A407EmprNom[0] ;
         n407EmprNom = T00D012_n407EmprNom[0] ;
         A759ProDsc = T00D012_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T00D012_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A457FasCod = T00D012_A457FasCod[0] ;
         zmD015( -23) ;
      }
      pr_default.close(10);
      onLoadActionsD015( ) ;
   }

   public void onLoadActionsD015( )
   {
   }

   public void checkExtendedTableD015( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00D011 */
      pr_default.execute(9, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00D011_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(9);
   }

   public void closeExtendedTableCursorsD015( )
   {
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_27( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00D013 */
      pr_default.execute(11, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00D013_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKeyD015( )
   {
      /* Using cursor T00D014 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00D07 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zmD015( 23) ;
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T00D07_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A396EmprCod = T00D07_A396EmprCod[0] ;
         A129BarCod = T00D07_A129BarCod[0] ;
         A132BarCodReo = T00D07_A132BarCodReo[0] ;
         A130BarCodPar = T00D07_A130BarCodPar[0] ;
         A758ProCod = T00D07_A758ProCod[0] ;
         A457FasCod = T00D07_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadD015( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKeyD015( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKeyD015( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKeyD015( ) ;
      if ( RcdFound15 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T00D015 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D015_A129BarCod[0] < A129BarCod ) || ( T00D015_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D015_A132BarCodReo[0] < A132BarCodReo ) || ( T00D015_A132BarCodReo[0] == A132BarCodReo ) && ( T00D015_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00D015_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00D015_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00D015_A132BarCodReo[0] == A132BarCodReo ) && ( T00D015_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00D015_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T00D015_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00D015_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00D015_A132BarCodReo[0] == A132BarCodReo ) && ( T00D015_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D015_A194BarOrdLin[0] < A194BarOrdLin ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D015_A129BarCod[0] > A129BarCod ) || ( T00D015_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D015_A132BarCodReo[0] > A132BarCodReo ) || ( T00D015_A132BarCodReo[0] == A132BarCodReo ) && ( T00D015_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00D015_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00D015_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00D015_A132BarCodReo[0] == A132BarCodReo ) && ( T00D015_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00D015_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T00D015_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00D015_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00D015_A132BarCodReo[0] == A132BarCodReo ) && ( T00D015_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D015_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D015_A194BarOrdLin[0] > A194BarOrdLin ) ) )
         {
            A396EmprCod = T00D015_A396EmprCod[0] ;
            A129BarCod = T00D015_A129BarCod[0] ;
            A132BarCodReo = T00D015_A132BarCodReo[0] ;
            A130BarCodPar = T00D015_A130BarCodPar[0] ;
            A758ProCod = T00D015_A758ProCod[0] ;
            A194BarOrdLin = T00D015_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T00D016 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D016_A129BarCod[0] > A129BarCod ) || ( T00D016_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D016_A132BarCodReo[0] > A132BarCodReo ) || ( T00D016_A132BarCodReo[0] == A132BarCodReo ) && ( T00D016_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00D016_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00D016_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00D016_A132BarCodReo[0] == A132BarCodReo ) && ( T00D016_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00D016_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T00D016_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00D016_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00D016_A132BarCodReo[0] == A132BarCodReo ) && ( T00D016_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D016_A194BarOrdLin[0] > A194BarOrdLin ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D016_A129BarCod[0] < A129BarCod ) || ( T00D016_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D016_A132BarCodReo[0] < A132BarCodReo ) || ( T00D016_A132BarCodReo[0] == A132BarCodReo ) && ( T00D016_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00D016_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00D016_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00D016_A132BarCodReo[0] == A132BarCodReo ) && ( T00D016_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00D016_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T00D016_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00D016_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00D016_A132BarCodReo[0] == A132BarCodReo ) && ( T00D016_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00D016_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00D016_A194BarOrdLin[0] < A194BarOrdLin ) ) )
         {
            A396EmprCod = T00D016_A396EmprCod[0] ;
            A129BarCod = T00D016_A129BarCod[0] ;
            A132BarCodReo = T00D016_A132BarCodReo[0] ;
            A130BarCodPar = T00D016_A130BarCodPar[0] ;
            A758ProCod = T00D016_A758ProCod[0] ;
            A194BarOrdLin = T00D016_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyD015( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insertD015( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A194BarOrdLin = Z194BarOrdLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "BARORDLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarOrdLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               updateD015( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               /* Insert record */
               insertD015( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "BARORDLIN");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarOrdLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  insertD015( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A194BarOrdLin = Z194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "BARORDLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarOrdLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyD015( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00D06 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z457FasCod, T00D06_A457FasCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z457FasCod, T00D06_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00D06_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertD015( )
   {
      beforeValidateD015( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD015( ) ;
      }
      if ( AnyError == 0 )
      {
         zmD015( 0) ;
         checkOptimisticConcurrencyD015( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmD015( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertD015( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D017 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A194BarOrdLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
                        processLevelD015( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionD00( ) ;
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
            loadD015( ) ;
         }
         endLevelD015( ) ;
      }
      closeExtendedTableCursorsD015( ) ;
   }

   public void updateD015( )
   {
      beforeValidateD015( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD015( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyD015( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmD015( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateD015( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D018 */
                  pr_default.execute(16, new Object[] {A457FasCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateD015( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelD015( ) ;
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
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevelD015( ) ;
      }
      closeExtendedTableCursorsD015( ) ;
   }

   public void deferredUpdateD015( )
   {
   }

   public void delete( )
   {
      beforeValidateD015( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyD015( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsD015( ) ;
         afterConfirmD015( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteD015( ) ;
            if ( AnyError == 0 )
            {
               scanStartD0475( ) ;
               while ( RcdFound475 != 0 )
               {
                  getByPrimaryKeyD0475( ) ;
                  deleteD0475( ) ;
                  scanNextD0475( ) ;
               }
               scanEndD0475( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D019 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
      }
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelD015( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsD015( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00D020 */
         pr_default.execute(18, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00D020_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(18);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00D021 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00D022 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00D023 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00D024 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00D025 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00D026 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00D027 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00D028 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00D029 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00D030 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00D031 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00D032 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00D033 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00D034 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00D035 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00D036 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00D037 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00D038 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00D039 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00D040 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00D041 */
         pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPFAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
      }
   }

   public void processNestedLevelD0475( )
   {
      nGXsfl_42_idx = 0 ;
      while ( nGXsfl_42_idx < nRC_GXsfl_42 )
      {
         readRowD0475( ) ;
         if ( ( nRcdExists_475 != 0 ) || ( nIsMod_475 != 0 ) )
         {
            standaloneNotModalD0475( ) ;
            getKeyD0475( ) ;
            if ( ( nRcdExists_475 == 0 ) && ( nRcdDeleted_475 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertD0475( ) ;
            }
            else
            {
               if ( RcdFound475 != 0 )
               {
                  if ( ( nRcdDeleted_475 != 0 ) && ( nRcdExists_475 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteD0475( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_475 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateD0475( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_475 == 0 )
                  {
                     GXCCtl = "PARFASCOD_" + sGXsfl_42_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarParVal_Internalname, GXutil.rtrim( A3295BarParVal)) ;
         httpContext.changePostValue( edtBarParVl2_Internalname, GXutil.rtrim( A12671BarParVl2)) ;
         httpContext.changePostValue( edtParUndID_Internalname, GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtParUndDsc_Internalname, GXutil.rtrim( A13204ParUndDsc)) ;
         httpContext.changePostValue( edtBarValPar_Internalname, GXutil.rtrim( A9737BarValPar)) ;
         httpContext.changePostValue( edtItm_ord5_Internalname, GXutil.ltrim( localUtil.ntoc( A10257Itm_ord5, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarParObs_Internalname, GXutil.rtrim( A3296BarParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3295BarParVal_"+sGXsfl_42_idx, GXutil.rtrim( Z3295BarParVal)) ;
         httpContext.changePostValue( "ZT_"+"Z3296BarParObs_"+sGXsfl_42_idx, GXutil.rtrim( Z3296BarParObs)) ;
         httpContext.changePostValue( "ZT_"+"Z9737BarValPar_"+sGXsfl_42_idx, GXutil.rtrim( Z9737BarValPar)) ;
         httpContext.changePostValue( "ZT_"+"Z10257Itm_ord5_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( Z10257Itm_ord5, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12671BarParVl2_"+sGXsfl_42_idx, GXutil.rtrim( Z12671BarParVl2)) ;
         httpContext.changePostValue( "ZT_"+"Z13991BarParVMn_"+sGXsfl_42_idx, GXutil.rtrim( Z13991BarParVMn)) ;
         httpContext.changePostValue( "ZT_"+"Z13992BarParVMx_"+sGXsfl_42_idx, GXutil.rtrim( Z13992BarParVMx)) ;
         httpContext.changePostValue( "ZT_"+"Z14079BarParPLC_"+sGXsfl_42_idx, GXutil.rtrim( Z14079BarParPLC)) ;
         httpContext.changePostValue( "T3295BarParVal_"+sGXsfl_42_idx, GXutil.rtrim( O3295BarParVal)) ;
         httpContext.changePostValue( "nRcdDeleted_475_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_475_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_475_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_475 != 0 )
         {
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARFASCOD_"+sGXsfl_42_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment)) ;
            httpContext.changePostValue( "BARPARVAL_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPARVAL_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarParVal_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPARVL2_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParVl2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPARVL2_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarParVl2_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDID_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PARUNDDSC_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARVALPAR_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarValPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARVALPAR_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarValPar_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD5_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord5_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ITM_ORD5_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtItm_ord5_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPAROBS_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllD0475( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_475 = (short)(0) ;
      nIsMod_475 = (short)(0) ;
      nRcdDeleted_475 = (short)(0) ;
   }

   public void processLevelD015( )
   {
      /* Save parent mode. */
      sMode15 = Gx_mode ;
      processNestedLevelD0475( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelD015( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteD015( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfaspar");
         if ( AnyError == 0 )
         {
            confirmValuesD00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfaspar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartD015( )
   {
      /* Scan By routine */
      /* Using cursor T00D042 */
      pr_default.execute(40);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A396EmprCod = T00D042_A396EmprCod[0] ;
         A129BarCod = T00D042_A129BarCod[0] ;
         A132BarCodReo = T00D042_A132BarCodReo[0] ;
         A130BarCodPar = T00D042_A130BarCodPar[0] ;
         A758ProCod = T00D042_A758ProCod[0] ;
         A194BarOrdLin = T00D042_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextD015( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A396EmprCod = T00D042_A396EmprCod[0] ;
         A129BarCod = T00D042_A129BarCod[0] ;
         A132BarCodReo = T00D042_A132BarCodReo[0] ;
         A130BarCodPar = T00D042_A130BarCodPar[0] ;
         A758ProCod = T00D042_A758ProCod[0] ;
         A194BarOrdLin = T00D042_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
   }

   public void scanEndD015( )
   {
      pr_default.close(40);
   }

   public void afterConfirmD015( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertD015( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateD015( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteD015( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteD015( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateD015( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesD015( )
   {
      edtBarNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
   }

   public void zmD0475( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3295BarParVal = T00D03_A3295BarParVal[0] ;
            Z3296BarParObs = T00D03_A3296BarParObs[0] ;
            Z9737BarValPar = T00D03_A9737BarValPar[0] ;
            Z10257Itm_ord5 = T00D03_A10257Itm_ord5[0] ;
            Z12671BarParVl2 = T00D03_A12671BarParVl2[0] ;
            Z13991BarParVMn = T00D03_A13991BarParVMn[0] ;
            Z13992BarParVMx = T00D03_A13992BarParVMx[0] ;
            Z14079BarParPLC = T00D03_A14079BarParPLC[0] ;
         }
         else
         {
            Z3295BarParVal = A3295BarParVal ;
            Z3296BarParObs = A3296BarParObs ;
            Z9737BarValPar = A9737BarValPar ;
            Z10257Itm_ord5 = A10257Itm_ord5 ;
            Z12671BarParVl2 = A12671BarParVl2 ;
            Z13991BarParVMn = A13991BarParVMn ;
            Z13992BarParVMx = A13992BarParVMx ;
            Z14079BarParPLC = A14079BarParPLC ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z3295BarParVal = A3295BarParVal ;
         Z3296BarParObs = A3296BarParObs ;
         Z9737BarValPar = A9737BarValPar ;
         Z10257Itm_ord5 = A10257Itm_ord5 ;
         Z12671BarParVl2 = A12671BarParVl2 ;
         Z13991BarParVMn = A13991BarParVMn ;
         Z13992BarParVMx = A13992BarParVMx ;
         Z14079BarParPLC = A14079BarParPLC ;
         Z396EmprCod = A396EmprCod ;
         Z1664ParFasCod = A1664ParFasCod ;
         Z758ProCod = A758ProCod ;
         Z1665ParFasDsc = A1665ParFasDsc ;
         Z13203ParUndID = A13203ParUndID ;
         Z13204ParUndDsc = A13204ParUndDsc ;
      }
   }

   public void standaloneNotModalD0475( )
   {
   }

   public void standaloneModalD0475( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtParFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      }
      else
      {
         edtParFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      }
   }

   public void loadD0475( )
   {
      /* Using cursor T00D043 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound475 = (short)(1) ;
         A1665ParFasDsc = T00D043_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T00D043_n1665ParFasDsc[0] ;
         A3295BarParVal = T00D043_A3295BarParVal[0] ;
         A3296BarParObs = T00D043_A3296BarParObs[0] ;
         A9737BarValPar = T00D043_A9737BarValPar[0] ;
         A10257Itm_ord5 = T00D043_A10257Itm_ord5[0] ;
         A12671BarParVl2 = T00D043_A12671BarParVl2[0] ;
         A13204ParUndDsc = T00D043_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T00D043_n13204ParUndDsc[0] ;
         A13991BarParVMn = T00D043_A13991BarParVMn[0] ;
         A13992BarParVMx = T00D043_A13992BarParVMx[0] ;
         A14079BarParPLC = T00D043_A14079BarParPLC[0] ;
         A13203ParUndID = T00D043_A13203ParUndID[0] ;
         n13203ParUndID = T00D043_n13203ParUndID[0] ;
         zmD0475( -28) ;
      }
      pr_default.close(41);
      onLoadActionsD0475( ) ;
   }

   public void onLoadActionsD0475( )
   {
      AV35OldVal = O3295BarParVal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldVal", AV35OldVal);
      if ( GXutil.strcmp(AV35OldVal, A3295BarParVal) != 0 )
      {
         AV36Texto_i = httpContext.getMessage( httpContext.getMessage( "TFASPAR-PARAMETROS x FASE-HDR. CAMBIO VALORES INCICIALES. VALOR FT OLD= ", ""), "") + AV35OldVal + httpContext.getMessage( httpContext.getMessage( " VALOR FT NEW=", ""), "") + A3295BarParVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Texto_i", AV36Texto_i);
      }
   }

   public void checkExtendedTableD0475( )
   {
      nIsDirty_475 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalD0475( ) ;
      /* Using cursor T00D04 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_42_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T00D04_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T00D04_n1665ParFasDsc[0] ;
      A13203ParUndID = T00D04_A13203ParUndID[0] ;
      n13203ParUndID = T00D04_n13203ParUndID[0] ;
      pr_default.close(2);
      /* Using cursor T00D05 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            GXCCtl = "PARUNDID_" + sGXsfl_42_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T00D05_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T00D05_n13204ParUndDsc[0] ;
      pr_default.close(3);
      AV35OldVal = O3295BarParVal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldVal", AV35OldVal);
      if ( GXutil.strcmp(AV35OldVal, A3295BarParVal) != 0 )
      {
         AV36Texto_i = httpContext.getMessage( httpContext.getMessage( "TFASPAR-PARAMETROS x FASE-HDR. CAMBIO VALORES INCICIALES. VALOR FT OLD= ", ""), "") + AV35OldVal + httpContext.getMessage( httpContext.getMessage( " VALOR FT NEW=", ""), "") + A3295BarParVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36Texto_i", AV36Texto_i);
      }
      if ( GXutil.strcmp(AV35OldVal, A3295BarParVal) != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TFasPar", ""), AV8UsurCod, AV12Station, AV36Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
   }

   public void closeExtendedTableCursorsD0475( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisableD0475( )
   {
   }

   public void gxload_29( String A396EmprCod ,
                          short A1664ParFasCod )
   {
      /* Using cursor T00D044 */
      pr_default.execute(42, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(42) == 101) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_42_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1665ParFasDsc = T00D044_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T00D044_n1665ParFasDsc[0] ;
      A13203ParUndID = T00D044_A13203ParUndID[0] ;
      n13203ParUndID = T00D044_n13203ParUndID[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1665ParFasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(42) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(42);
   }

   public void gxload_30( String A396EmprCod ,
                          short A13203ParUndID )
   {
      /* Using cursor T00D045 */
      pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(43) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            GXCCtl = "PARUNDID_" + sGXsfl_42_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T00D045_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T00D045_n13204ParUndDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13204ParUndDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(43) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(43);
   }

   public void getKeyD0475( )
   {
      /* Using cursor T00D046 */
      pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound475 = (short)(1) ;
      }
      else
      {
         RcdFound475 = (short)(0) ;
      }
      pr_default.close(44);
   }

   public void getByPrimaryKeyD0475( )
   {
      /* Using cursor T00D03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmD0475( 28) ;
         RcdFound475 = (short)(1) ;
         initializeNonKeyD0475( ) ;
         A3295BarParVal = T00D03_A3295BarParVal[0] ;
         A3296BarParObs = T00D03_A3296BarParObs[0] ;
         A9737BarValPar = T00D03_A9737BarValPar[0] ;
         A10257Itm_ord5 = T00D03_A10257Itm_ord5[0] ;
         A12671BarParVl2 = T00D03_A12671BarParVl2[0] ;
         A13991BarParVMn = T00D03_A13991BarParVMn[0] ;
         A13992BarParVMx = T00D03_A13992BarParVMx[0] ;
         A14079BarParPLC = T00D03_A14079BarParPLC[0] ;
         A1664ParFasCod = T00D03_A1664ParFasCod[0] ;
         O3295BarParVal = A3295BarParVal ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode475 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadD0475( ) ;
         Gx_mode = sMode475 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound475 = (short)(0) ;
         initializeNonKeyD0475( ) ;
         sMode475 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalD0475( ) ;
         Gx_mode = sMode475 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesD0475( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyD0475( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00D02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBarPar"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3295BarParVal, T00D02_A3295BarParVal[0]) != 0 ) || ( GXutil.strcmp(Z3296BarParObs, T00D02_A3296BarParObs[0]) != 0 ) || ( GXutil.strcmp(Z9737BarValPar, T00D02_A9737BarValPar[0]) != 0 ) || ( Z10257Itm_ord5 != T00D02_A10257Itm_ord5[0] ) || ( GXutil.strcmp(Z12671BarParVl2, T00D02_A12671BarParVl2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13991BarParVMn, T00D02_A13991BarParVMn[0]) != 0 ) || ( GXutil.strcmp(Z13992BarParVMx, T00D02_A13992BarParVMx[0]) != 0 ) || ( GXutil.strcmp(Z14079BarParPLC, T00D02_A14079BarParPLC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3295BarParVal, T00D02_A3295BarParVal[0]) != 0 )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"BarParVal");
               GXutil.writeLogRaw("Old: ",Z3295BarParVal);
               GXutil.writeLogRaw("Current: ",T00D02_A3295BarParVal[0]);
            }
            if ( GXutil.strcmp(Z3296BarParObs, T00D02_A3296BarParObs[0]) != 0 )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"BarParObs");
               GXutil.writeLogRaw("Old: ",Z3296BarParObs);
               GXutil.writeLogRaw("Current: ",T00D02_A3296BarParObs[0]);
            }
            if ( GXutil.strcmp(Z9737BarValPar, T00D02_A9737BarValPar[0]) != 0 )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"BarValPar");
               GXutil.writeLogRaw("Old: ",Z9737BarValPar);
               GXutil.writeLogRaw("Current: ",T00D02_A9737BarValPar[0]);
            }
            if ( Z10257Itm_ord5 != T00D02_A10257Itm_ord5[0] )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"Itm_ord5");
               GXutil.writeLogRaw("Old: ",Z10257Itm_ord5);
               GXutil.writeLogRaw("Current: ",T00D02_A10257Itm_ord5[0]);
            }
            if ( GXutil.strcmp(Z12671BarParVl2, T00D02_A12671BarParVl2[0]) != 0 )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"BarParVl2");
               GXutil.writeLogRaw("Old: ",Z12671BarParVl2);
               GXutil.writeLogRaw("Current: ",T00D02_A12671BarParVl2[0]);
            }
            if ( GXutil.strcmp(Z13991BarParVMn, T00D02_A13991BarParVMn[0]) != 0 )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"BarParVMn");
               GXutil.writeLogRaw("Old: ",Z13991BarParVMn);
               GXutil.writeLogRaw("Current: ",T00D02_A13991BarParVMn[0]);
            }
            if ( GXutil.strcmp(Z13992BarParVMx, T00D02_A13992BarParVMx[0]) != 0 )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"BarParVMx");
               GXutil.writeLogRaw("Old: ",Z13992BarParVMx);
               GXutil.writeLogRaw("Current: ",T00D02_A13992BarParVMx[0]);
            }
            if ( GXutil.strcmp(Z14079BarParPLC, T00D02_A14079BarParPLC[0]) != 0 )
            {
               GXutil.writeLogln("tfaspar:[seudo value changed for attri]"+"BarParPLC");
               GXutil.writeLogRaw("Old: ",Z14079BarParPLC);
               GXutil.writeLogRaw("Current: ",T00D02_A14079BarParPLC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBarPar"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertD0475( )
   {
      beforeValidateD0475( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD0475( ) ;
      }
      if ( AnyError == 0 )
      {
         zmD0475( 0) ;
         checkOptimisticConcurrencyD0475( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmD0475( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertD0475( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00D047 */
                  pr_default.execute(45, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), A3295BarParVal, A3296BarParObs, A9737BarValPar, Short.valueOf(A10257Itm_ord5), A12671BarParVl2, A13991BarParVMn, A13992BarParVMx, A14079BarParPLC, A396EmprCod, Short.valueOf(A1664ParFasCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
                  if ( (pr_default.getStatus(45) == 1) )
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
            loadD0475( ) ;
         }
         endLevelD0475( ) ;
      }
      closeExtendedTableCursorsD0475( ) ;
   }

   public void updateD0475( )
   {
      beforeValidateD0475( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableD0475( ) ;
      }
      if ( ( nIsMod_475 != 0 ) || ( nIsDirty_475 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyD0475( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmD0475( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateD0475( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00D048 */
                     pr_default.execute(46, new Object[] {A3295BarParVal, A3296BarParObs, A9737BarValPar, Short.valueOf(A10257Itm_ord5), A12671BarParVl2, A13991BarParVMn, A13992BarParVMx, A14079BarParPLC, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
                     if ( (pr_default.getStatus(46) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBarPar"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateD0475( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyD0475( ) ;
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
            endLevelD0475( ) ;
         }
      }
      closeExtendedTableCursorsD0475( ) ;
   }

   public void deferredUpdateD0475( )
   {
   }

   public void deleteD0475( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateD0475( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyD0475( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsD0475( ) ;
         afterConfirmD0475( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteD0475( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00D049 */
               pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
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
      sMode475 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelD0475( ) ;
      Gx_mode = sMode475 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsD0475( )
   {
      standaloneModalD0475( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00D050 */
         pr_default.execute(48, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         A1665ParFasDsc = T00D050_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T00D050_n1665ParFasDsc[0] ;
         A13203ParUndID = T00D050_A13203ParUndID[0] ;
         n13203ParUndID = T00D050_n13203ParUndID[0] ;
         pr_default.close(48);
         /* Using cursor T00D051 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
         A13204ParUndDsc = T00D051_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T00D051_n13204ParUndDsc[0] ;
         pr_default.close(49);
         AV35OldVal = O3295BarParVal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OldVal", AV35OldVal);
         if ( GXutil.strcmp(AV35OldVal, A3295BarParVal) != 0 )
         {
            AV36Texto_i = httpContext.getMessage( httpContext.getMessage( "TFASPAR-PARAMETROS x FASE-HDR. CAMBIO VALORES INCICIALES. VALOR FT OLD= ", ""), "") + AV35OldVal + httpContext.getMessage( httpContext.getMessage( " VALOR FT NEW=", ""), "") + A3295BarParVal ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Texto_i", AV36Texto_i);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00D052 */
         pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPFAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
      }
   }

   public void endLevelD0475( )
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

   public void scanStartD0475( )
   {
      /* Scan By routine */
      /* Using cursor T00D053 */
      pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      RcdFound475 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound475 = (short)(1) ;
         A1664ParFasCod = T00D053_A1664ParFasCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextD0475( )
   {
      /* Scan next routine */
      pr_default.readNext(51);
      RcdFound475 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound475 = (short)(1) ;
         A1664ParFasCod = T00D053_A1664ParFasCod[0] ;
      }
   }

   public void scanEndD0475( )
   {
      pr_default.close(51);
   }

   public void afterConfirmD0475( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertD0475( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateD0475( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteD0475( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteD0475( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateD0475( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesD0475( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtBarParVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVal_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtBarParVl2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParVl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParVl2_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtParUndID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParUndID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndID_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtParUndDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParUndDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndDsc_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtBarValPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarValPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarValPar_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtItm_ord5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtItm_ord5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtItm_ord5_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtBarParObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParObs_Enabled), 5, 0), !bGXsfl_42_Refreshing);
   }

   public void send_integrity_lvl_hashesD0475( )
   {
   }

   public void send_integrity_lvl_hashesD015( )
   {
   }

   public void subsflControlProps_42475( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_42_idx ;
      edtBarParVal_Internalname = "BARPARVAL_"+sGXsfl_42_idx ;
      edtBarParVl2_Internalname = "BARPARVL2_"+sGXsfl_42_idx ;
      edtParUndID_Internalname = "PARUNDID_"+sGXsfl_42_idx ;
      edtParUndDsc_Internalname = "PARUNDDSC_"+sGXsfl_42_idx ;
      edtBarValPar_Internalname = "BARVALPAR_"+sGXsfl_42_idx ;
      edtItm_ord5_Internalname = "ITM_ORD5_"+sGXsfl_42_idx ;
      edtBarParObs_Internalname = "BARPAROBS_"+sGXsfl_42_idx ;
   }

   public void subsflControlProps_fel_42475( )
   {
      edtParFasCod_Internalname = "PARFASCOD_"+sGXsfl_42_fel_idx ;
      edtBarParVal_Internalname = "BARPARVAL_"+sGXsfl_42_fel_idx ;
      edtBarParVl2_Internalname = "BARPARVL2_"+sGXsfl_42_fel_idx ;
      edtParUndID_Internalname = "PARUNDID_"+sGXsfl_42_fel_idx ;
      edtParUndDsc_Internalname = "PARUNDDSC_"+sGXsfl_42_fel_idx ;
      edtBarValPar_Internalname = "BARVALPAR_"+sGXsfl_42_fel_idx ;
      edtItm_ord5_Internalname = "ITM_ORD5_"+sGXsfl_42_fel_idx ;
      edtBarParObs_Internalname = "BARPAROBS_"+sGXsfl_42_fel_idx ;
   }

   public void addRowD0475( )
   {
      nGXsfl_42_idx = (int)(nGXsfl_42_idx+1) ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_42475( ) ;
      sendRowD0475( ) ;
   }

   public void sendRowD0475( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_42_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_475_" + sGXsfl_42_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_42_idx + "',42)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParFasCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParFasCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtParFasCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_475_" + sGXsfl_42_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_42_idx + "',42)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarParVal_Internalname,GXutil.rtrim( A3295BarParVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarParVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtBarParVal_Visible),Integer.valueOf(edtBarParVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_475_" + sGXsfl_42_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_42_idx + "',42)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarParVl2_Internalname,GXutil.rtrim( A12671BarParVl2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarParVl2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtBarParVl2_Visible),Integer.valueOf(edtBarParVl2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParUndID_Internalname,GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtParUndID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13203ParUndID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13203ParUndID), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParUndID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParUndID_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtParUndDsc_Internalname,GXutil.rtrim( A13204ParUndDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtParUndDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtParUndDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_475_" + sGXsfl_42_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_42_idx + "',42)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarValPar_Internalname,GXutil.rtrim( A9737BarValPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarValPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtBarValPar_Visible),Integer.valueOf(edtBarValPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_475_" + sGXsfl_42_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_42_idx + "',42)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtItm_ord5_Internalname,GXutil.ltrim( localUtil.ntoc( A10257Itm_ord5, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtItm_ord5_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10257Itm_ord5), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10257Itm_ord5), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtItm_ord5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtItm_ord5_Visible),Integer.valueOf(edtItm_ord5_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_475_" + sGXsfl_42_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_42_idx + "',42)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarParObs_Internalname,GXutil.rtrim( A3296BarParObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarParObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtBarParObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesD0475( ) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3295BarParVal_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3295BarParVal));
      GXCCtl = "Z3296BarParObs_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3296BarParObs));
      GXCCtl = "Z9737BarValPar_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9737BarValPar));
      GXCCtl = "Z10257Itm_ord5_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10257Itm_ord5, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12671BarParVl2_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12671BarParVl2));
      GXCCtl = "Z13991BarParVMn_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13991BarParVMn));
      GXCCtl = "Z13992BarParVMx_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13992BarParVMx));
      GXCCtl = "Z14079BarParPLC_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14079BarParPLC));
      GXCCtl = "O3295BarParVal_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O3295BarParVal));
      GXCCtl = "nRcdDeleted_475_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_475_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_475_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_475, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV39EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV40BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV41BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV42BarCodPar));
      GXCCtl = "vPROCOD_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV43ProCod));
      GXCCtl = "vBARORDLIN_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV44BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "BARCOD_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "BARCODREO_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "BARCODPAR_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A130BarCodPar));
      GXCCtl = "PROCOD_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASCOD_"+sGXsfl_42_idx+"Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARVAL_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARVAL_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarParVal_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARVL2_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParVl2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARVL2_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarParVl2_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDID_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDDSC_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARVALPAR_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarValPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARVALPAR_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtBarValPar_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ITM_ORD5_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord5_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ITM_ORD5_"+sGXsfl_42_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtItm_ord5_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPAROBS_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowD0475( )
   {
      nGXsfl_42_idx = (int)(nGXsfl_42_idx+1) ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_42475( ) ;
      edtParFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARFASCOD_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParFasCod_Horizontalalignment = httpContext.cgiGet( "PARFASCOD_"+sGXsfl_42_idx+"Horizontalalignment") ;
      edtBarParVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARVAL_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarParVal_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARVAL_"+sGXsfl_42_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarParVl2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARVL2_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarParVl2_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "BARPARVL2_"+sGXsfl_42_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParUndID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDID_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtParUndDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PARUNDDSC_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarValPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARVALPAR_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarValPar_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "BARVALPAR_"+sGXsfl_42_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtItm_ord5_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD5_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtItm_ord5_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "ITM_ORD5_"+sGXsfl_42_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarParObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPAROBS_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PARFASCOD_" + sGXsfl_42_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         wbErr = true ;
         A1664ParFasCod = (short)(0) ;
      }
      else
      {
         A1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3295BarParVal = httpContext.cgiGet( edtBarParVal_Internalname) ;
      A12671BarParVl2 = httpContext.cgiGet( edtBarParVl2_Internalname) ;
      A13203ParUndID = (short)(localUtil.ctol( httpContext.cgiGet( edtParUndID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n13203ParUndID = false ;
      A13204ParUndDsc = httpContext.cgiGet( edtParUndDsc_Internalname) ;
      n13204ParUndDsc = false ;
      A9737BarValPar = httpContext.cgiGet( edtBarValPar_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtItm_ord5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtItm_ord5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ITM_ORD5_" + sGXsfl_42_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtItm_ord5_Internalname ;
         wbErr = true ;
         A10257Itm_ord5 = (short)(0) ;
      }
      else
      {
         A10257Itm_ord5 = (short)(localUtil.ctol( httpContext.cgiGet( edtItm_ord5_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3296BarParObs = httpContext.cgiGet( edtBarParObs_Internalname) ;
      GXCCtl = "Z1664ParFasCod_" + sGXsfl_42_idx ;
      Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3295BarParVal_" + sGXsfl_42_idx ;
      Z3295BarParVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3296BarParObs_" + sGXsfl_42_idx ;
      Z3296BarParObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9737BarValPar_" + sGXsfl_42_idx ;
      Z9737BarValPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10257Itm_ord5_" + sGXsfl_42_idx ;
      Z10257Itm_ord5 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12671BarParVl2_" + sGXsfl_42_idx ;
      Z12671BarParVl2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13991BarParVMn_" + sGXsfl_42_idx ;
      Z13991BarParVMn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13992BarParVMx_" + sGXsfl_42_idx ;
      Z13992BarParVMx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14079BarParPLC_" + sGXsfl_42_idx ;
      Z14079BarParPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13991BarParVMn_" + sGXsfl_42_idx ;
      A13991BarParVMn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13992BarParVMx_" + sGXsfl_42_idx ;
      A13992BarParVMx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14079BarParPLC_" + sGXsfl_42_idx ;
      A14079BarParPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O3295BarParVal_" + sGXsfl_42_idx ;
      O3295BarParVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_475_" + sGXsfl_42_idx ;
      nRcdDeleted_475 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_475_" + sGXsfl_42_idx ;
      nRcdExists_475 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_475_" + sGXsfl_42_idx ;
      nIsMod_475 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtParFasCod_Enabled = edtParFasCod_Enabled ;
   }

   public void confirmValuesD00( )
   {
      nGXsfl_42_idx = 0 ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_42475( ) ;
      while ( nGXsfl_42_idx < nRC_GXsfl_42 )
      {
         nGXsfl_42_idx = (int)(nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_42475( ) ;
         httpContext.changePostValue( "Z1664ParFasCod_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z1664ParFasCod_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1664ParFasCod_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z3295BarParVal_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z3295BarParVal_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3295BarParVal_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z3296BarParObs_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z3296BarParObs_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3296BarParObs_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z9737BarValPar_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z9737BarValPar_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9737BarValPar_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z10257Itm_ord5_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z10257Itm_ord5_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10257Itm_ord5_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z12671BarParVl2_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z12671BarParVl2_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12671BarParVl2_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z13991BarParVMn_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z13991BarParVMn_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13991BarParVMn_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z13992BarParVMx_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z13992BarParVMx_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13992BarParVMx_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z14079BarParPLC_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z14079BarParPLC_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14079BarParPLC_"+sGXsfl_42_idx) ;
      }
      httpContext.changePostValue( "O3295BarParVal", httpContext.cgiGet( "T3295BarParVal")) ;
      httpContext.deletePostValue( "T3295BarParVal") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tfaspar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV39EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV43ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarOrdLin,4,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFasPar");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfaspar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_42", GXutil.ltrim( localUtil.ntoc( nGXsfl_42_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N457FasCod", GXutil.rtrim( A457FasCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD_DATA", AV50ParFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD_DATA", AV50ParFasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV39EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV40BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV41BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV42BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV43ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV44BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FASCOD", GXutil.rtrim( AV48Insert_FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV59Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDVAL", GXutil.rtrim( AV35OldVal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV36Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV12Station));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARVMN", GXutil.rtrim( A13991BarParVMn));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARVMX", GXutil.rtrim( A13992BarParVMx));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPARPLC", GXutil.rtrim( A14079BarParPLC));
      app.GxWebStd.gx_hidden_field( httpContext, "PARFASDSC", GXutil.rtrim( A1665ParFasDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Objectcall", GXutil.rtrim( Combo_parfascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Cls", GXutil.rtrim( Combo_parfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Enabled", GXutil.booltostr( Combo_parfascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_parfascod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Isgriditem", GXutil.booltostr( Combo_parfascod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Emptyitem", GXutil.booltostr( Combo_parfascod_Emptyitem));
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
      return formatLink("app.tfaspar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV39EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV40BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV43ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44BarOrdLin,4,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"})  ;
   }

   public String getPgmname( )
   {
      return "TFasPar" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Parametros", "") ;
   }

   public void initializeNonKeyD015( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      Z457FasCod = "" ;
   }

   public void initAllD015( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A194BarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      initializeNonKeyD015( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyD0475( )
   {
      AV35OldVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldVal", AV35OldVal);
      A1665ParFasDsc = "" ;
      n1665ParFasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", A1665ParFasDsc);
      A3295BarParVal = "" ;
      A3296BarParObs = "" ;
      A9737BarValPar = "" ;
      A10257Itm_ord5 = (short)(0) ;
      A12671BarParVl2 = "" ;
      A13203ParUndID = (short)(0) ;
      n13203ParUndID = false ;
      A13204ParUndDsc = "" ;
      n13204ParUndDsc = false ;
      A13991BarParVMn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13991BarParVMn", A13991BarParVMn);
      A13992BarParVMx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13992BarParVMx", A13992BarParVMx);
      A14079BarParPLC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14079BarParPLC", A14079BarParPLC);
      AV36Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Texto_i", AV36Texto_i);
      O3295BarParVal = A3295BarParVal ;
      Z3295BarParVal = "" ;
      Z3296BarParObs = "" ;
      Z9737BarValPar = "" ;
      Z10257Itm_ord5 = (short)(0) ;
      Z12671BarParVl2 = "" ;
      Z13991BarParVMn = "" ;
      Z13992BarParVMx = "" ;
      Z14079BarParPLC = "" ;
   }

   public void initAllD0475( )
   {
      A1664ParFasCod = (short)(0) ;
      initializeNonKeyD0475( ) ;
   }

   public void standaloneModalInsertD0475( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655369", true, true);
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
      httpContext.AddJavascriptSource("tfaspar.js", "?20268211655369", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties475( )
   {
      edtParFasCod_Enabled = defedtParFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
   }

   public void startgridcontrol42( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtParFasCod_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A3295BarParVal));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarParVal_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A12671BarParVl2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParVl2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarParVl2_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13204ParUndDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtParUndDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9737BarValPar));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarValPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarValPar_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10257Itm_ord5, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtItm_ord5_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtItm_ord5_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A3296BarParObs));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarParObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasDsc_Internalname = "FASDSC" ;
      divTbl1_Internalname = "TBL1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtParFasCod_Internalname = "PARFASCOD" ;
      edtBarParVal_Internalname = "BARPARVAL" ;
      edtBarParVl2_Internalname = "BARPARVL2" ;
      edtParUndID_Internalname = "PARUNDID" ;
      edtParUndDsc_Internalname = "PARUNDDSC" ;
      edtBarValPar_Internalname = "BARVALPAR" ;
      edtItm_ord5_Internalname = "ITM_ORD5" ;
      edtBarParObs_Internalname = "BARPAROBS" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_parfascod_Internalname = "COMBO_PARFASCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Combo_parfascod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Parametros", "") );
      edtBarParObs_Jsonclick = "" ;
      edtItm_ord5_Jsonclick = "" ;
      edtBarValPar_Jsonclick = "" ;
      edtParUndDsc_Jsonclick = "" ;
      edtParUndID_Jsonclick = "" ;
      edtBarParVl2_Jsonclick = "" ;
      edtBarParVal_Jsonclick = "" ;
      edtParFasCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_parfascod_Titlecontrolidtoreplace = "" ;
      edtBarParObs_Enabled = 1 ;
      edtItm_ord5_Enabled = 1 ;
      edtBarValPar_Enabled = 1 ;
      edtParUndDsc_Enabled = 0 ;
      edtParUndID_Enabled = 0 ;
      edtBarParVl2_Enabled = 1 ;
      edtBarParVal_Enabled = 1 ;
      edtParFasCod_Enabled = 1 ;
      Combo_parfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parfascod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_parfascod_Cls = "ExtendedCombo" ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtParFasCod_Horizontalalignment = "right" ;
      edtBarParVl2_Visible = -1 ;
      edtItm_ord5_Visible = -1 ;
      edtBarValPar_Visible = -1 ;
      edtBarParVal_Visible = -1 ;
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

   public void xc_22_D0475( )
   {
      if ( GXutil.strcmp(AV35OldVal, A3295BarParVal) != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TFasPar", ""), AV8UsurCod, AV12Station, AV36Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_42475( ) ;
      while ( nGXsfl_42_idx <= nRC_GXsfl_42 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalD0475( ) ;
         standaloneModalD0475( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowD0475( ) ;
         nGXsfl_42_idx = (int)(nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_42475( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
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

   public void valid_Parfascod( )
   {
      n13203ParUndID = false ;
      n1665ParFasDsc = false ;
      n13204ParUndDsc = false ;
      /* Using cursor T00D050 */
      pr_default.execute(48, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(48) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PARFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
      }
      A1665ParFasDsc = T00D050_A1665ParFasDsc[0] ;
      n1665ParFasDsc = T00D050_n1665ParFasDsc[0] ;
      A13203ParUndID = T00D050_A13203ParUndID[0] ;
      n13203ParUndID = T00D050_n13203ParUndID[0] ;
      pr_default.close(48);
      /* Using cursor T00D051 */
      pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(49) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
         }
      }
      A13204ParUndDsc = T00D051_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T00D051_n13204ParUndDsc[0] ;
      pr_default.close(49);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", GXutil.rtrim( A1665ParFasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13204ParUndDsc", GXutil.rtrim( A13204ParUndDsc));
   }

   public void valid_Barparval( )
   {
      AV35OldVal = O3295BarParVal ;
      if ( GXutil.strcmp(AV35OldVal, A3295BarParVal) != 0 )
      {
         AV36Texto_i = httpContext.getMessage( httpContext.getMessage( "TFASPAR-PARAMETROS x FASE-HDR. CAMBIO VALORES INCICIALES. VALOR FT OLD= ", ""), "") + AV35OldVal + httpContext.getMessage( httpContext.getMessage( " VALOR FT NEW=", ""), "") + A3295BarParVal ;
      }
      if ( GXutil.strcmp(AV35OldVal, A3295BarParVal) != 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TFasPar", ""), AV8UsurCod, AV12Station, AV36Texto_i, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV35OldVal", GXutil.rtrim( AV35OldVal));
      httpContext.ajax_rsp_assign_attri("", false, "AV36Texto_i", AV36Texto_i);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV39EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV44BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV39EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV43ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV44BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12D02',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1664ParFasCod',fld:'PARFASCOD',pic:'ZZZ9'},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''}]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[{av:'A1665ParFasDsc',fld:'PARFASDSC',pic:''},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''}]}");
      setEventMetadata("VALID_BARPARVAL","{handler:'valid_Barparval',iparms:[{av:'O3295BarParVal'},{av:'A3295BarParVal',fld:'BARPARVAL',pic:''},{av:'AV35OldVal',fld:'vOLDVAL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV8UsurCod',fld:'vUSURCOD',pic:''},{av:'AV12Station',fld:'vSTATION',pic:''},{av:'AV36Texto_i',fld:'vTEXTO_I',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARPARVAL",",oparms:[{av:'AV35OldVal',fld:'vOLDVAL',pic:''},{av:'AV36Texto_i',fld:'vTEXTO_I',pic:''}]}");
      setEventMetadata("VALID_PARUNDID","{handler:'valid_Parundid',iparms:[]");
      setEventMetadata("VALID_PARUNDID",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barparobs',iparms:[]");
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
      pr_default.close(48);
      pr_default.close(49);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV39EmprCod = "" ;
      wcpOAV42BarCodPar = "" ;
      wcpOAV43ProCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      N457FasCod = "" ;
      Z3295BarParVal = "" ;
      Z3296BarParObs = "" ;
      Z9737BarValPar = "" ;
      Z12671BarParVl2 = "" ;
      Z13991BarParVMn = "" ;
      Z13992BarParVMx = "" ;
      Z14079BarParPLC = "" ;
      O3295BarParVal = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      Gx_mode = "" ;
      AV39EmprCod = "" ;
      AV42BarCodPar = "" ;
      AV43ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A13696BarNHdr = "" ;
      A759ProDsc = "" ;
      A460FasDsc = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      ucCombo_parfascod = new com.genexus.webpanels.GXUserControl();
      Combo_parfascod_Caption = "" ;
      AV50ParFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode475 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      AV48Insert_FasCod = "" ;
      A407EmprNom = "" ;
      AV59Pgmname = "" ;
      AV35OldVal = "" ;
      AV36Texto_i = "" ;
      AV8UsurCod = "" ;
      AV12Station = "" ;
      A13991BarParVMn = "" ;
      A13992BarParVMx = "" ;
      A14079BarParPLC = "" ;
      A1665ParFasDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_parfascod_Objectcall = "" ;
      Combo_parfascod_Class = "" ;
      Combo_parfascod_Icontype = "" ;
      Combo_parfascod_Icon = "" ;
      Combo_parfascod_Tooltip = "" ;
      Combo_parfascod_Selectedvalue_set = "" ;
      Combo_parfascod_Selectedvalue_get = "" ;
      Combo_parfascod_Selectedtext_set = "" ;
      Combo_parfascod_Selectedtext_get = "" ;
      Combo_parfascod_Gamoauthtoken = "" ;
      Combo_parfascod_Ddointernalname = "" ;
      Combo_parfascod_Titlecontrolalign = "" ;
      Combo_parfascod_Dropdownoptionstype = "" ;
      Combo_parfascod_Datalisttype = "" ;
      Combo_parfascod_Datalistfixedvalues = "" ;
      Combo_parfascod_Datalistproc = "" ;
      Combo_parfascod_Datalistprocparametersprefix = "" ;
      Combo_parfascod_Remoteservicesparameters = "" ;
      Combo_parfascod_Htmltemplate = "" ;
      Combo_parfascod_Multiplevaluestype = "" ;
      Combo_parfascod_Loadingdata = "" ;
      Combo_parfascod_Noresultsfound = "" ;
      Combo_parfascod_Emptyitemtext = "" ;
      Combo_parfascod_Onlyselectedvalues = "" ;
      Combo_parfascod_Selectalltext = "" ;
      Combo_parfascod_Multiplevaluesseparator = "" ;
      Combo_parfascod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode15 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A3295BarParVal = "" ;
      A12671BarParVl2 = "" ;
      A13204ParUndDsc = "" ;
      A9737BarValPar = "" ;
      A3296BarParObs = "" ;
      T3295BarParVal = "" ;
      AV11EmprNom = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV45WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV46TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV47WebSession = httpContext.getWebSession();
      AV49TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV52ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z460FasDsc = "" ;
      Z759ProDsc = "" ;
      T00D08_A407EmprNom = new String[] {""} ;
      T00D08_n407EmprNom = new boolean[] {false} ;
      T00D09_A759ProDsc = new String[] {""} ;
      T00D010_A396EmprCod = new String[] {""} ;
      T00D011_A460FasDsc = new String[] {""} ;
      T00D012_A194BarOrdLin = new short[1] ;
      T00D012_A407EmprNom = new String[] {""} ;
      T00D012_n407EmprNom = new boolean[] {false} ;
      T00D012_A759ProDsc = new String[] {""} ;
      T00D012_A460FasDsc = new String[] {""} ;
      T00D012_A396EmprCod = new String[] {""} ;
      T00D012_A129BarCod = new int[1] ;
      T00D012_A132BarCodReo = new byte[1] ;
      T00D012_A130BarCodPar = new String[] {""} ;
      T00D012_A758ProCod = new String[] {""} ;
      T00D012_A457FasCod = new String[] {""} ;
      T00D013_A460FasDsc = new String[] {""} ;
      T00D014_A396EmprCod = new String[] {""} ;
      T00D014_A129BarCod = new int[1] ;
      T00D014_A132BarCodReo = new byte[1] ;
      T00D014_A130BarCodPar = new String[] {""} ;
      T00D014_A758ProCod = new String[] {""} ;
      T00D014_A194BarOrdLin = new short[1] ;
      T00D07_A194BarOrdLin = new short[1] ;
      T00D07_A396EmprCod = new String[] {""} ;
      T00D07_A129BarCod = new int[1] ;
      T00D07_A132BarCodReo = new byte[1] ;
      T00D07_A130BarCodPar = new String[] {""} ;
      T00D07_A758ProCod = new String[] {""} ;
      T00D07_A457FasCod = new String[] {""} ;
      T00D015_A396EmprCod = new String[] {""} ;
      T00D015_A129BarCod = new int[1] ;
      T00D015_A132BarCodReo = new byte[1] ;
      T00D015_A130BarCodPar = new String[] {""} ;
      T00D015_A758ProCod = new String[] {""} ;
      T00D015_A194BarOrdLin = new short[1] ;
      T00D016_A396EmprCod = new String[] {""} ;
      T00D016_A129BarCod = new int[1] ;
      T00D016_A132BarCodReo = new byte[1] ;
      T00D016_A130BarCodPar = new String[] {""} ;
      T00D016_A758ProCod = new String[] {""} ;
      T00D016_A194BarOrdLin = new short[1] ;
      T00D06_A194BarOrdLin = new short[1] ;
      T00D06_A396EmprCod = new String[] {""} ;
      T00D06_A129BarCod = new int[1] ;
      T00D06_A132BarCodReo = new byte[1] ;
      T00D06_A130BarCodPar = new String[] {""} ;
      T00D06_A758ProCod = new String[] {""} ;
      T00D06_A457FasCod = new String[] {""} ;
      T00D020_A460FasDsc = new String[] {""} ;
      T00D021_A396EmprCod = new String[] {""} ;
      T00D021_A129BarCod = new int[1] ;
      T00D021_A132BarCodReo = new byte[1] ;
      T00D021_A130BarCodPar = new String[] {""} ;
      T00D021_A758ProCod = new String[] {""} ;
      T00D021_A194BarOrdLin = new short[1] ;
      T00D021_A12517SolAfLn = new short[1] ;
      T00D022_A396EmprCod = new String[] {""} ;
      T00D022_A129BarCod = new int[1] ;
      T00D022_A132BarCodReo = new byte[1] ;
      T00D022_A130BarCodPar = new String[] {""} ;
      T00D022_A758ProCod = new String[] {""} ;
      T00D022_A194BarOrdLin = new short[1] ;
      T00D022_A12516SolLzLn = new short[1] ;
      T00D023_A396EmprCod = new String[] {""} ;
      T00D023_A129BarCod = new int[1] ;
      T00D023_A132BarCodReo = new byte[1] ;
      T00D023_A130BarCodPar = new String[] {""} ;
      T00D023_A758ProCod = new String[] {""} ;
      T00D023_A194BarOrdLin = new short[1] ;
      T00D023_A12515SolPlLn = new short[1] ;
      T00D024_A396EmprCod = new String[] {""} ;
      T00D024_A129BarCod = new int[1] ;
      T00D024_A132BarCodReo = new byte[1] ;
      T00D024_A130BarCodPar = new String[] {""} ;
      T00D024_A758ProCod = new String[] {""} ;
      T00D024_A194BarOrdLin = new short[1] ;
      T00D024_A12514SolSAlLn = new short[1] ;
      T00D025_A396EmprCod = new String[] {""} ;
      T00D025_A129BarCod = new int[1] ;
      T00D025_A132BarCodReo = new byte[1] ;
      T00D025_A130BarCodPar = new String[] {""} ;
      T00D025_A758ProCod = new String[] {""} ;
      T00D025_A194BarOrdLin = new short[1] ;
      T00D025_A12513SolSAcLn = new short[1] ;
      T00D026_A396EmprCod = new String[] {""} ;
      T00D026_A129BarCod = new int[1] ;
      T00D026_A132BarCodReo = new byte[1] ;
      T00D026_A130BarCodPar = new String[] {""} ;
      T00D026_A758ProCod = new String[] {""} ;
      T00D026_A194BarOrdLin = new short[1] ;
      T00D026_A12512SolFrLn = new short[1] ;
      T00D027_A396EmprCod = new String[] {""} ;
      T00D027_A129BarCod = new int[1] ;
      T00D027_A132BarCodReo = new byte[1] ;
      T00D027_A130BarCodPar = new String[] {""} ;
      T00D027_A758ProCod = new String[] {""} ;
      T00D027_A194BarOrdLin = new short[1] ;
      T00D027_A12511SolAgLn = new short[1] ;
      T00D028_A396EmprCod = new String[] {""} ;
      T00D028_A129BarCod = new int[1] ;
      T00D028_A132BarCodReo = new byte[1] ;
      T00D028_A130BarCodPar = new String[] {""} ;
      T00D028_A758ProCod = new String[] {""} ;
      T00D028_A194BarOrdLin = new short[1] ;
      T00D028_A12510SolLvLn = new short[1] ;
      T00D029_A396EmprCod = new String[] {""} ;
      T00D029_A129BarCod = new int[1] ;
      T00D029_A132BarCodReo = new byte[1] ;
      T00D029_A130BarCodPar = new String[] {""} ;
      T00D029_A758ProCod = new String[] {""} ;
      T00D029_A194BarOrdLin = new short[1] ;
      T00D029_A10781BarFasNb = new int[1] ;
      T00D030_A396EmprCod = new String[] {""} ;
      T00D030_A129BarCod = new int[1] ;
      T00D030_A132BarCodReo = new byte[1] ;
      T00D030_A130BarCodPar = new String[] {""} ;
      T00D030_A758ProCod = new String[] {""} ;
      T00D030_A194BarOrdLin = new short[1] ;
      T00D030_A719PrdNum = new String[] {""} ;
      T00D031_A396EmprCod = new String[] {""} ;
      T00D031_A129BarCod = new int[1] ;
      T00D031_A132BarCodReo = new byte[1] ;
      T00D031_A130BarCodPar = new String[] {""} ;
      T00D031_A758ProCod = new String[] {""} ;
      T00D031_A194BarOrdLin = new short[1] ;
      T00D031_A9966Em_cod = new String[] {""} ;
      T00D032_A396EmprCod = new String[] {""} ;
      T00D032_A129BarCod = new int[1] ;
      T00D032_A132BarCodReo = new byte[1] ;
      T00D032_A130BarCodPar = new String[] {""} ;
      T00D032_A758ProCod = new String[] {""} ;
      T00D032_A194BarOrdLin = new short[1] ;
      T00D032_A9940Ab_cod = new String[] {""} ;
      T00D033_A396EmprCod = new String[] {""} ;
      T00D033_A129BarCod = new int[1] ;
      T00D033_A132BarCodReo = new byte[1] ;
      T00D033_A130BarCodPar = new String[] {""} ;
      T00D033_A758ProCod = new String[] {""} ;
      T00D033_A194BarOrdLin = new short[1] ;
      T00D033_A9911Ca_cod = new String[] {""} ;
      T00D034_A396EmprCod = new String[] {""} ;
      T00D034_A129BarCod = new int[1] ;
      T00D034_A132BarCodReo = new byte[1] ;
      T00D034_A130BarCodPar = new String[] {""} ;
      T00D034_A758ProCod = new String[] {""} ;
      T00D034_A194BarOrdLin = new short[1] ;
      T00D034_A9878Pe_cod = new String[] {""} ;
      T00D035_A396EmprCod = new String[] {""} ;
      T00D035_A129BarCod = new int[1] ;
      T00D035_A132BarCodReo = new byte[1] ;
      T00D035_A130BarCodPar = new String[] {""} ;
      T00D035_A758ProCod = new String[] {""} ;
      T00D035_A194BarOrdLin = new short[1] ;
      T00D035_A9870Rm_cod = new String[] {""} ;
      T00D036_A396EmprCod = new String[] {""} ;
      T00D036_A129BarCod = new int[1] ;
      T00D036_A132BarCodReo = new byte[1] ;
      T00D036_A130BarCodPar = new String[] {""} ;
      T00D036_A758ProCod = new String[] {""} ;
      T00D036_A194BarOrdLin = new short[1] ;
      T00D036_A7934Dtb_Ordl = new short[1] ;
      T00D037_A396EmprCod = new String[] {""} ;
      T00D037_A129BarCod = new int[1] ;
      T00D037_A132BarCodReo = new byte[1] ;
      T00D037_A130BarCodPar = new String[] {""} ;
      T00D037_A758ProCod = new String[] {""} ;
      T00D037_A194BarOrdLin = new short[1] ;
      T00D037_A5371FasQuiLin = new short[1] ;
      T00D038_A396EmprCod = new String[] {""} ;
      T00D038_A129BarCod = new int[1] ;
      T00D038_A132BarCodReo = new byte[1] ;
      T00D038_A130BarCodPar = new String[] {""} ;
      T00D038_A758ProCod = new String[] {""} ;
      T00D038_A194BarOrdLin = new short[1] ;
      T00D038_A4940A_Barcod = new int[1] ;
      T00D038_A4941A_BarReo = new byte[1] ;
      T00D038_A4942A_BarPar = new String[] {""} ;
      T00D038_A4943A_ProCod = new String[] {""} ;
      T00D038_A4944A_BarOrd = new short[1] ;
      T00D039_A396EmprCod = new String[] {""} ;
      T00D039_A129BarCod = new int[1] ;
      T00D039_A132BarCodReo = new byte[1] ;
      T00D039_A130BarCodPar = new String[] {""} ;
      T00D039_A758ProCod = new String[] {""} ;
      T00D039_A194BarOrdLin = new short[1] ;
      T00D039_A4643BarFasLot = new int[1] ;
      T00D040_A396EmprCod = new String[] {""} ;
      T00D040_A129BarCod = new int[1] ;
      T00D040_A132BarCodReo = new byte[1] ;
      T00D040_A130BarCodPar = new String[] {""} ;
      T00D040_A758ProCod = new String[] {""} ;
      T00D040_A194BarOrdLin = new short[1] ;
      T00D040_A4031CCTCod = new int[1] ;
      T00D041_A396EmprCod = new String[] {""} ;
      T00D041_A129BarCod = new int[1] ;
      T00D041_A132BarCodReo = new byte[1] ;
      T00D041_A130BarCodPar = new String[] {""} ;
      T00D041_A758ProCod = new String[] {""} ;
      T00D041_A194BarOrdLin = new short[1] ;
      T00D041_A4643BarFasLot = new int[1] ;
      T00D041_A10084BarPFcod = new short[1] ;
      T00D042_A396EmprCod = new String[] {""} ;
      T00D042_A129BarCod = new int[1] ;
      T00D042_A132BarCodReo = new byte[1] ;
      T00D042_A130BarCodPar = new String[] {""} ;
      T00D042_A758ProCod = new String[] {""} ;
      T00D042_A194BarOrdLin = new short[1] ;
      Z1665ParFasDsc = "" ;
      Z13204ParUndDsc = "" ;
      T00D043_A129BarCod = new int[1] ;
      T00D043_A132BarCodReo = new byte[1] ;
      T00D043_A130BarCodPar = new String[] {""} ;
      T00D043_A194BarOrdLin = new short[1] ;
      T00D043_A1665ParFasDsc = new String[] {""} ;
      T00D043_n1665ParFasDsc = new boolean[] {false} ;
      T00D043_A3295BarParVal = new String[] {""} ;
      T00D043_A3296BarParObs = new String[] {""} ;
      T00D043_A9737BarValPar = new String[] {""} ;
      T00D043_A10257Itm_ord5 = new short[1] ;
      T00D043_A12671BarParVl2 = new String[] {""} ;
      T00D043_A13204ParUndDsc = new String[] {""} ;
      T00D043_n13204ParUndDsc = new boolean[] {false} ;
      T00D043_A13991BarParVMn = new String[] {""} ;
      T00D043_A13992BarParVMx = new String[] {""} ;
      T00D043_A14079BarParPLC = new String[] {""} ;
      T00D043_A396EmprCod = new String[] {""} ;
      T00D043_A1664ParFasCod = new short[1] ;
      T00D043_A758ProCod = new String[] {""} ;
      T00D043_A13203ParUndID = new short[1] ;
      T00D043_n13203ParUndID = new boolean[] {false} ;
      T00D04_A1665ParFasDsc = new String[] {""} ;
      T00D04_n1665ParFasDsc = new boolean[] {false} ;
      T00D04_A13203ParUndID = new short[1] ;
      T00D04_n13203ParUndID = new boolean[] {false} ;
      T00D05_A13204ParUndDsc = new String[] {""} ;
      T00D05_n13204ParUndDsc = new boolean[] {false} ;
      T00D044_A1665ParFasDsc = new String[] {""} ;
      T00D044_n1665ParFasDsc = new boolean[] {false} ;
      T00D044_A13203ParUndID = new short[1] ;
      T00D044_n13203ParUndID = new boolean[] {false} ;
      T00D045_A13204ParUndDsc = new String[] {""} ;
      T00D045_n13204ParUndDsc = new boolean[] {false} ;
      T00D046_A396EmprCod = new String[] {""} ;
      T00D046_A129BarCod = new int[1] ;
      T00D046_A132BarCodReo = new byte[1] ;
      T00D046_A130BarCodPar = new String[] {""} ;
      T00D046_A758ProCod = new String[] {""} ;
      T00D046_A194BarOrdLin = new short[1] ;
      T00D046_A1664ParFasCod = new short[1] ;
      T00D03_A129BarCod = new int[1] ;
      T00D03_A132BarCodReo = new byte[1] ;
      T00D03_A130BarCodPar = new String[] {""} ;
      T00D03_A194BarOrdLin = new short[1] ;
      T00D03_A3295BarParVal = new String[] {""} ;
      T00D03_A3296BarParObs = new String[] {""} ;
      T00D03_A9737BarValPar = new String[] {""} ;
      T00D03_A10257Itm_ord5 = new short[1] ;
      T00D03_A12671BarParVl2 = new String[] {""} ;
      T00D03_A13991BarParVMn = new String[] {""} ;
      T00D03_A13992BarParVMx = new String[] {""} ;
      T00D03_A14079BarParPLC = new String[] {""} ;
      T00D03_A396EmprCod = new String[] {""} ;
      T00D03_A1664ParFasCod = new short[1] ;
      T00D03_A758ProCod = new String[] {""} ;
      T00D02_A129BarCod = new int[1] ;
      T00D02_A132BarCodReo = new byte[1] ;
      T00D02_A130BarCodPar = new String[] {""} ;
      T00D02_A194BarOrdLin = new short[1] ;
      T00D02_A3295BarParVal = new String[] {""} ;
      T00D02_A3296BarParObs = new String[] {""} ;
      T00D02_A9737BarValPar = new String[] {""} ;
      T00D02_A10257Itm_ord5 = new short[1] ;
      T00D02_A12671BarParVl2 = new String[] {""} ;
      T00D02_A13991BarParVMn = new String[] {""} ;
      T00D02_A13992BarParVMx = new String[] {""} ;
      T00D02_A14079BarParPLC = new String[] {""} ;
      T00D02_A396EmprCod = new String[] {""} ;
      T00D02_A1664ParFasCod = new short[1] ;
      T00D02_A758ProCod = new String[] {""} ;
      T00D050_A1665ParFasDsc = new String[] {""} ;
      T00D050_n1665ParFasDsc = new boolean[] {false} ;
      T00D050_A13203ParUndID = new short[1] ;
      T00D050_n13203ParUndID = new boolean[] {false} ;
      T00D051_A13204ParUndDsc = new String[] {""} ;
      T00D051_n13204ParUndDsc = new boolean[] {false} ;
      T00D052_A396EmprCod = new String[] {""} ;
      T00D052_A129BarCod = new int[1] ;
      T00D052_A132BarCodReo = new byte[1] ;
      T00D052_A130BarCodPar = new String[] {""} ;
      T00D052_A758ProCod = new String[] {""} ;
      T00D052_A194BarOrdLin = new short[1] ;
      T00D052_A4643BarFasLot = new int[1] ;
      T00D052_A10084BarPFcod = new short[1] ;
      T00D053_A396EmprCod = new String[] {""} ;
      T00D053_A129BarCod = new int[1] ;
      T00D053_A132BarCodReo = new byte[1] ;
      T00D053_A130BarCodPar = new String[] {""} ;
      T00D053_A758ProCod = new String[] {""} ;
      T00D053_A194BarOrdLin = new short[1] ;
      T00D053_A1664ParFasCod = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      ZV35OldVal = "" ;
      ZV36Texto_i = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfaspar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfaspar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfaspar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfaspar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfaspar__default(),
         new Object[] {
             new Object[] {
            T00D02_A129BarCod, T00D02_A132BarCodReo, T00D02_A130BarCodPar, T00D02_A194BarOrdLin, T00D02_A3295BarParVal, T00D02_A3296BarParObs, T00D02_A9737BarValPar, T00D02_A10257Itm_ord5, T00D02_A12671BarParVl2, T00D02_A13991BarParVMn,
            T00D02_A13992BarParVMx, T00D02_A14079BarParPLC, T00D02_A396EmprCod, T00D02_A1664ParFasCod, T00D02_A758ProCod
            }
            , new Object[] {
            T00D03_A129BarCod, T00D03_A132BarCodReo, T00D03_A130BarCodPar, T00D03_A194BarOrdLin, T00D03_A3295BarParVal, T00D03_A3296BarParObs, T00D03_A9737BarValPar, T00D03_A10257Itm_ord5, T00D03_A12671BarParVl2, T00D03_A13991BarParVMn,
            T00D03_A13992BarParVMx, T00D03_A14079BarParPLC, T00D03_A396EmprCod, T00D03_A1664ParFasCod, T00D03_A758ProCod
            }
            , new Object[] {
            T00D04_A1665ParFasDsc, T00D04_n1665ParFasDsc, T00D04_A13203ParUndID, T00D04_n13203ParUndID
            }
            , new Object[] {
            T00D05_A13204ParUndDsc, T00D05_n13204ParUndDsc
            }
            , new Object[] {
            T00D06_A194BarOrdLin, T00D06_A396EmprCod, T00D06_A129BarCod, T00D06_A132BarCodReo, T00D06_A130BarCodPar, T00D06_A758ProCod, T00D06_A457FasCod
            }
            , new Object[] {
            T00D07_A194BarOrdLin, T00D07_A396EmprCod, T00D07_A129BarCod, T00D07_A132BarCodReo, T00D07_A130BarCodPar, T00D07_A758ProCod, T00D07_A457FasCod
            }
            , new Object[] {
            T00D08_A407EmprNom, T00D08_n407EmprNom
            }
            , new Object[] {
            T00D09_A759ProDsc
            }
            , new Object[] {
            T00D010_A396EmprCod
            }
            , new Object[] {
            T00D011_A460FasDsc
            }
            , new Object[] {
            T00D012_A194BarOrdLin, T00D012_A407EmprNom, T00D012_n407EmprNom, T00D012_A759ProDsc, T00D012_A460FasDsc, T00D012_A396EmprCod, T00D012_A129BarCod, T00D012_A132BarCodReo, T00D012_A130BarCodPar, T00D012_A758ProCod,
            T00D012_A457FasCod
            }
            , new Object[] {
            T00D013_A460FasDsc
            }
            , new Object[] {
            T00D014_A396EmprCod, T00D014_A129BarCod, T00D014_A132BarCodReo, T00D014_A130BarCodPar, T00D014_A758ProCod, T00D014_A194BarOrdLin
            }
            , new Object[] {
            T00D015_A396EmprCod, T00D015_A129BarCod, T00D015_A132BarCodReo, T00D015_A130BarCodPar, T00D015_A758ProCod, T00D015_A194BarOrdLin
            }
            , new Object[] {
            T00D016_A396EmprCod, T00D016_A129BarCod, T00D016_A132BarCodReo, T00D016_A130BarCodPar, T00D016_A758ProCod, T00D016_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00D020_A460FasDsc
            }
            , new Object[] {
            T00D021_A396EmprCod, T00D021_A129BarCod, T00D021_A132BarCodReo, T00D021_A130BarCodPar, T00D021_A758ProCod, T00D021_A194BarOrdLin, T00D021_A12517SolAfLn
            }
            , new Object[] {
            T00D022_A396EmprCod, T00D022_A129BarCod, T00D022_A132BarCodReo, T00D022_A130BarCodPar, T00D022_A758ProCod, T00D022_A194BarOrdLin, T00D022_A12516SolLzLn
            }
            , new Object[] {
            T00D023_A396EmprCod, T00D023_A129BarCod, T00D023_A132BarCodReo, T00D023_A130BarCodPar, T00D023_A758ProCod, T00D023_A194BarOrdLin, T00D023_A12515SolPlLn
            }
            , new Object[] {
            T00D024_A396EmprCod, T00D024_A129BarCod, T00D024_A132BarCodReo, T00D024_A130BarCodPar, T00D024_A758ProCod, T00D024_A194BarOrdLin, T00D024_A12514SolSAlLn
            }
            , new Object[] {
            T00D025_A396EmprCod, T00D025_A129BarCod, T00D025_A132BarCodReo, T00D025_A130BarCodPar, T00D025_A758ProCod, T00D025_A194BarOrdLin, T00D025_A12513SolSAcLn
            }
            , new Object[] {
            T00D026_A396EmprCod, T00D026_A129BarCod, T00D026_A132BarCodReo, T00D026_A130BarCodPar, T00D026_A758ProCod, T00D026_A194BarOrdLin, T00D026_A12512SolFrLn
            }
            , new Object[] {
            T00D027_A396EmprCod, T00D027_A129BarCod, T00D027_A132BarCodReo, T00D027_A130BarCodPar, T00D027_A758ProCod, T00D027_A194BarOrdLin, T00D027_A12511SolAgLn
            }
            , new Object[] {
            T00D028_A396EmprCod, T00D028_A129BarCod, T00D028_A132BarCodReo, T00D028_A130BarCodPar, T00D028_A758ProCod, T00D028_A194BarOrdLin, T00D028_A12510SolLvLn
            }
            , new Object[] {
            T00D029_A396EmprCod, T00D029_A129BarCod, T00D029_A132BarCodReo, T00D029_A130BarCodPar, T00D029_A758ProCod, T00D029_A194BarOrdLin, T00D029_A10781BarFasNb
            }
            , new Object[] {
            T00D030_A396EmprCod, T00D030_A129BarCod, T00D030_A132BarCodReo, T00D030_A130BarCodPar, T00D030_A758ProCod, T00D030_A194BarOrdLin, T00D030_A719PrdNum
            }
            , new Object[] {
            T00D031_A396EmprCod, T00D031_A129BarCod, T00D031_A132BarCodReo, T00D031_A130BarCodPar, T00D031_A758ProCod, T00D031_A194BarOrdLin, T00D031_A9966Em_cod
            }
            , new Object[] {
            T00D032_A396EmprCod, T00D032_A129BarCod, T00D032_A132BarCodReo, T00D032_A130BarCodPar, T00D032_A758ProCod, T00D032_A194BarOrdLin, T00D032_A9940Ab_cod
            }
            , new Object[] {
            T00D033_A396EmprCod, T00D033_A129BarCod, T00D033_A132BarCodReo, T00D033_A130BarCodPar, T00D033_A758ProCod, T00D033_A194BarOrdLin, T00D033_A9911Ca_cod
            }
            , new Object[] {
            T00D034_A396EmprCod, T00D034_A129BarCod, T00D034_A132BarCodReo, T00D034_A130BarCodPar, T00D034_A758ProCod, T00D034_A194BarOrdLin, T00D034_A9878Pe_cod
            }
            , new Object[] {
            T00D035_A396EmprCod, T00D035_A129BarCod, T00D035_A132BarCodReo, T00D035_A130BarCodPar, T00D035_A758ProCod, T00D035_A194BarOrdLin, T00D035_A9870Rm_cod
            }
            , new Object[] {
            T00D036_A396EmprCod, T00D036_A129BarCod, T00D036_A132BarCodReo, T00D036_A130BarCodPar, T00D036_A758ProCod, T00D036_A194BarOrdLin, T00D036_A7934Dtb_Ordl
            }
            , new Object[] {
            T00D037_A396EmprCod, T00D037_A129BarCod, T00D037_A132BarCodReo, T00D037_A130BarCodPar, T00D037_A758ProCod, T00D037_A194BarOrdLin, T00D037_A5371FasQuiLin
            }
            , new Object[] {
            T00D038_A396EmprCod, T00D038_A129BarCod, T00D038_A132BarCodReo, T00D038_A130BarCodPar, T00D038_A758ProCod, T00D038_A194BarOrdLin, T00D038_A4940A_Barcod, T00D038_A4941A_BarReo, T00D038_A4942A_BarPar, T00D038_A4943A_ProCod,
            T00D038_A4944A_BarOrd
            }
            , new Object[] {
            T00D039_A396EmprCod, T00D039_A129BarCod, T00D039_A132BarCodReo, T00D039_A130BarCodPar, T00D039_A758ProCod, T00D039_A194BarOrdLin, T00D039_A4643BarFasLot
            }
            , new Object[] {
            T00D040_A396EmprCod, T00D040_A129BarCod, T00D040_A132BarCodReo, T00D040_A130BarCodPar, T00D040_A758ProCod, T00D040_A194BarOrdLin, T00D040_A4031CCTCod
            }
            , new Object[] {
            T00D041_A396EmprCod, T00D041_A129BarCod, T00D041_A132BarCodReo, T00D041_A130BarCodPar, T00D041_A758ProCod, T00D041_A194BarOrdLin, T00D041_A4643BarFasLot, T00D041_A10084BarPFcod
            }
            , new Object[] {
            T00D042_A396EmprCod, T00D042_A129BarCod, T00D042_A132BarCodReo, T00D042_A130BarCodPar, T00D042_A758ProCod, T00D042_A194BarOrdLin
            }
            , new Object[] {
            T00D043_A129BarCod, T00D043_A132BarCodReo, T00D043_A130BarCodPar, T00D043_A194BarOrdLin, T00D043_A1665ParFasDsc, T00D043_n1665ParFasDsc, T00D043_A3295BarParVal, T00D043_A3296BarParObs, T00D043_A9737BarValPar, T00D043_A10257Itm_ord5,
            T00D043_A12671BarParVl2, T00D043_A13204ParUndDsc, T00D043_n13204ParUndDsc, T00D043_A13991BarParVMn, T00D043_A13992BarParVMx, T00D043_A14079BarParPLC, T00D043_A396EmprCod, T00D043_A1664ParFasCod, T00D043_A758ProCod, T00D043_A13203ParUndID,
            T00D043_n13203ParUndID
            }
            , new Object[] {
            T00D044_A1665ParFasDsc, T00D044_n1665ParFasDsc, T00D044_A13203ParUndID, T00D044_n13203ParUndID
            }
            , new Object[] {
            T00D045_A13204ParUndDsc, T00D045_n13204ParUndDsc
            }
            , new Object[] {
            T00D046_A396EmprCod, T00D046_A129BarCod, T00D046_A132BarCodReo, T00D046_A130BarCodPar, T00D046_A758ProCod, T00D046_A194BarOrdLin, T00D046_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00D050_A1665ParFasDsc, T00D050_n1665ParFasDsc, T00D050_A13203ParUndID, T00D050_n13203ParUndID
            }
            , new Object[] {
            T00D051_A13204ParUndDsc, T00D051_n13204ParUndDsc
            }
            , new Object[] {
            T00D052_A396EmprCod, T00D052_A129BarCod, T00D052_A132BarCodReo, T00D052_A130BarCodPar, T00D052_A758ProCod, T00D052_A194BarOrdLin, T00D052_A4643BarFasLot, T00D052_A10084BarPFcod
            }
            , new Object[] {
            T00D053_A396EmprCod, T00D053_A129BarCod, T00D053_A132BarCodReo, T00D053_A130BarCodPar, T00D053_A758ProCod, T00D053_A194BarOrdLin, T00D053_A1664ParFasCod
            }
         }
      );
      AV59Pgmname = "TFasPar" ;
   }

   private byte wcpOAV41BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte AV41BarCodReo ;
   private byte nKeyPressed ;
   private byte A132BarCodReo ;
   private byte AV37tintutex ;
   private byte AV38jpf ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short wcpOAV44BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z1664ParFasCod ;
   private short Z10257Itm_ord5 ;
   private short nRcdDeleted_475 ;
   private short nRcdExists_475 ;
   private short nIsMod_475 ;
   private short A1664ParFasCod ;
   private short A13203ParUndID ;
   private short AV44BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A194BarOrdLin ;
   private short nBlankRcdCount475 ;
   private short RcdFound475 ;
   private short nBlankRcdUsr475 ;
   private short RcdFound15 ;
   private short A10257Itm_ord5 ;
   private short nIsDirty_15 ;
   private short Z13203ParUndID ;
   private short nIsDirty_475 ;
   private int wcpOAV40BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_42 ;
   private int nGXsfl_42_idx=1 ;
   private int AV40BarCod ;
   private int trnEnded ;
   private int edtBarParVal_Visible ;
   private int edtBarValPar_Visible ;
   private int edtItm_ord5_Visible ;
   private int edtBarParVl2_Visible ;
   private int edtBarNHdr_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtFasDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtParFasCod_Enabled ;
   private int edtBarParVal_Enabled ;
   private int edtBarParVl2_Enabled ;
   private int edtParUndID_Enabled ;
   private int edtParUndDsc_Enabled ;
   private int edtBarValPar_Enabled ;
   private int edtItm_ord5_Enabled ;
   private int edtBarParObs_Enabled ;
   private int fRowAdded ;
   private int A129BarCod ;
   private int Combo_parfascod_Datalistupdateminimumcharacters ;
   private int AV60GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtParFasCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV39EmprCod ;
   private String wcpOAV42BarCodPar ;
   private String wcpOAV43ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String N457FasCod ;
   private String Z3295BarParVal ;
   private String Z3296BarParObs ;
   private String Z9737BarValPar ;
   private String Z12671BarParVl2 ;
   private String Z13991BarParVMn ;
   private String Z13992BarParVMx ;
   private String Z14079BarParPLC ;
   private String O3295BarParVal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String Gx_mode ;
   private String AV39EmprCod ;
   private String AV42BarCodPar ;
   private String AV43ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_42_idx="0001" ;
   private String edtBarParVal_Internalname ;
   private String edtBarValPar_Internalname ;
   private String edtItm_ord5_Internalname ;
   private String edtBarParVl2_Internalname ;
   private String edtParFasCod_Horizontalalignment ;
   private String edtParFasCod_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divTbl1_Internalname ;
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_parfascod_Caption ;
   private String Combo_parfascod_Cls ;
   private String Combo_parfascod_Internalname ;
   private String sMode475 ;
   private String edtParUndID_Internalname ;
   private String edtParUndDsc_Internalname ;
   private String edtBarParObs_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV48Insert_FasCod ;
   private String A407EmprNom ;
   private String AV59Pgmname ;
   private String AV35OldVal ;
   private String AV8UsurCod ;
   private String AV12Station ;
   private String A13991BarParVMn ;
   private String A13992BarParVMx ;
   private String A14079BarParPLC ;
   private String A1665ParFasDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_parfascod_Objectcall ;
   private String Combo_parfascod_Class ;
   private String Combo_parfascod_Icontype ;
   private String Combo_parfascod_Icon ;
   private String Combo_parfascod_Tooltip ;
   private String Combo_parfascod_Selectedvalue_set ;
   private String Combo_parfascod_Selectedvalue_get ;
   private String Combo_parfascod_Selectedtext_set ;
   private String Combo_parfascod_Selectedtext_get ;
   private String Combo_parfascod_Gamoauthtoken ;
   private String Combo_parfascod_Ddointernalname ;
   private String Combo_parfascod_Titlecontrolalign ;
   private String Combo_parfascod_Dropdownoptionstype ;
   private String Combo_parfascod_Titlecontrolidtoreplace ;
   private String Combo_parfascod_Datalisttype ;
   private String Combo_parfascod_Datalistfixedvalues ;
   private String Combo_parfascod_Datalistproc ;
   private String Combo_parfascod_Datalistprocparametersprefix ;
   private String Combo_parfascod_Remoteservicesparameters ;
   private String Combo_parfascod_Htmltemplate ;
   private String Combo_parfascod_Multiplevaluestype ;
   private String Combo_parfascod_Loadingdata ;
   private String Combo_parfascod_Noresultsfound ;
   private String Combo_parfascod_Emptyitemtext ;
   private String Combo_parfascod_Onlyselectedvalues ;
   private String Combo_parfascod_Selectalltext ;
   private String Combo_parfascod_Multiplevaluesseparator ;
   private String Combo_parfascod_Addnewoptiontext ;
   private String hsh ;
   private String sMode15 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A3295BarParVal ;
   private String A12671BarParVl2 ;
   private String A13204ParUndDsc ;
   private String A9737BarValPar ;
   private String A3296BarParObs ;
   private String T3295BarParVal ;
   private String AV11EmprNom ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String Z759ProDsc ;
   private String Z1665ParFasDsc ;
   private String Z13204ParUndDsc ;
   private String sGXsfl_42_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtParFasCod_Jsonclick ;
   private String edtBarParVal_Jsonclick ;
   private String edtBarParVl2_Jsonclick ;
   private String edtParUndID_Jsonclick ;
   private String edtParUndDsc_Jsonclick ;
   private String edtBarValPar_Jsonclick ;
   private String edtItm_ord5_Jsonclick ;
   private String edtBarParObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String ZV35OldVal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13203ParUndID ;
   private boolean wbErr ;
   private boolean bGXsfl_42_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_parfascod_Isgriditem ;
   private boolean Combo_parfascod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n1665ParFasDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_parfascod_Enabled ;
   private boolean Combo_parfascod_Visible ;
   private boolean Combo_parfascod_Allowmultipleselection ;
   private boolean Combo_parfascod_Hasdescription ;
   private boolean Combo_parfascod_Includeonlyselectedoption ;
   private boolean Combo_parfascod_Includeselectalloption ;
   private boolean Combo_parfascod_Includeaddnewoption ;
   private boolean returnInSub ;
   private boolean n13204ParUndDsc ;
   private boolean Gx_longc ;
   private String AV36Texto_i ;
   private String AV52ComboSelectedValue ;
   private String ZV36Texto_i ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV47WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_parfascod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00D08_A407EmprNom ;
   private boolean[] T00D08_n407EmprNom ;
   private String[] T00D09_A759ProDsc ;
   private String[] T00D010_A396EmprCod ;
   private String[] T00D011_A460FasDsc ;
   private short[] T00D012_A194BarOrdLin ;
   private String[] T00D012_A407EmprNom ;
   private boolean[] T00D012_n407EmprNom ;
   private String[] T00D012_A759ProDsc ;
   private String[] T00D012_A460FasDsc ;
   private String[] T00D012_A396EmprCod ;
   private int[] T00D012_A129BarCod ;
   private byte[] T00D012_A132BarCodReo ;
   private String[] T00D012_A130BarCodPar ;
   private String[] T00D012_A758ProCod ;
   private String[] T00D012_A457FasCod ;
   private String[] T00D013_A460FasDsc ;
   private String[] T00D014_A396EmprCod ;
   private int[] T00D014_A129BarCod ;
   private byte[] T00D014_A132BarCodReo ;
   private String[] T00D014_A130BarCodPar ;
   private String[] T00D014_A758ProCod ;
   private short[] T00D014_A194BarOrdLin ;
   private short[] T00D07_A194BarOrdLin ;
   private String[] T00D07_A396EmprCod ;
   private int[] T00D07_A129BarCod ;
   private byte[] T00D07_A132BarCodReo ;
   private String[] T00D07_A130BarCodPar ;
   private String[] T00D07_A758ProCod ;
   private String[] T00D07_A457FasCod ;
   private String[] T00D015_A396EmprCod ;
   private int[] T00D015_A129BarCod ;
   private byte[] T00D015_A132BarCodReo ;
   private String[] T00D015_A130BarCodPar ;
   private String[] T00D015_A758ProCod ;
   private short[] T00D015_A194BarOrdLin ;
   private String[] T00D016_A396EmprCod ;
   private int[] T00D016_A129BarCod ;
   private byte[] T00D016_A132BarCodReo ;
   private String[] T00D016_A130BarCodPar ;
   private String[] T00D016_A758ProCod ;
   private short[] T00D016_A194BarOrdLin ;
   private short[] T00D06_A194BarOrdLin ;
   private String[] T00D06_A396EmprCod ;
   private int[] T00D06_A129BarCod ;
   private byte[] T00D06_A132BarCodReo ;
   private String[] T00D06_A130BarCodPar ;
   private String[] T00D06_A758ProCod ;
   private String[] T00D06_A457FasCod ;
   private String[] T00D020_A460FasDsc ;
   private String[] T00D021_A396EmprCod ;
   private int[] T00D021_A129BarCod ;
   private byte[] T00D021_A132BarCodReo ;
   private String[] T00D021_A130BarCodPar ;
   private String[] T00D021_A758ProCod ;
   private short[] T00D021_A194BarOrdLin ;
   private short[] T00D021_A12517SolAfLn ;
   private String[] T00D022_A396EmprCod ;
   private int[] T00D022_A129BarCod ;
   private byte[] T00D022_A132BarCodReo ;
   private String[] T00D022_A130BarCodPar ;
   private String[] T00D022_A758ProCod ;
   private short[] T00D022_A194BarOrdLin ;
   private short[] T00D022_A12516SolLzLn ;
   private String[] T00D023_A396EmprCod ;
   private int[] T00D023_A129BarCod ;
   private byte[] T00D023_A132BarCodReo ;
   private String[] T00D023_A130BarCodPar ;
   private String[] T00D023_A758ProCod ;
   private short[] T00D023_A194BarOrdLin ;
   private short[] T00D023_A12515SolPlLn ;
   private String[] T00D024_A396EmprCod ;
   private int[] T00D024_A129BarCod ;
   private byte[] T00D024_A132BarCodReo ;
   private String[] T00D024_A130BarCodPar ;
   private String[] T00D024_A758ProCod ;
   private short[] T00D024_A194BarOrdLin ;
   private short[] T00D024_A12514SolSAlLn ;
   private String[] T00D025_A396EmprCod ;
   private int[] T00D025_A129BarCod ;
   private byte[] T00D025_A132BarCodReo ;
   private String[] T00D025_A130BarCodPar ;
   private String[] T00D025_A758ProCod ;
   private short[] T00D025_A194BarOrdLin ;
   private short[] T00D025_A12513SolSAcLn ;
   private String[] T00D026_A396EmprCod ;
   private int[] T00D026_A129BarCod ;
   private byte[] T00D026_A132BarCodReo ;
   private String[] T00D026_A130BarCodPar ;
   private String[] T00D026_A758ProCod ;
   private short[] T00D026_A194BarOrdLin ;
   private short[] T00D026_A12512SolFrLn ;
   private String[] T00D027_A396EmprCod ;
   private int[] T00D027_A129BarCod ;
   private byte[] T00D027_A132BarCodReo ;
   private String[] T00D027_A130BarCodPar ;
   private String[] T00D027_A758ProCod ;
   private short[] T00D027_A194BarOrdLin ;
   private short[] T00D027_A12511SolAgLn ;
   private String[] T00D028_A396EmprCod ;
   private int[] T00D028_A129BarCod ;
   private byte[] T00D028_A132BarCodReo ;
   private String[] T00D028_A130BarCodPar ;
   private String[] T00D028_A758ProCod ;
   private short[] T00D028_A194BarOrdLin ;
   private short[] T00D028_A12510SolLvLn ;
   private String[] T00D029_A396EmprCod ;
   private int[] T00D029_A129BarCod ;
   private byte[] T00D029_A132BarCodReo ;
   private String[] T00D029_A130BarCodPar ;
   private String[] T00D029_A758ProCod ;
   private short[] T00D029_A194BarOrdLin ;
   private int[] T00D029_A10781BarFasNb ;
   private String[] T00D030_A396EmprCod ;
   private int[] T00D030_A129BarCod ;
   private byte[] T00D030_A132BarCodReo ;
   private String[] T00D030_A130BarCodPar ;
   private String[] T00D030_A758ProCod ;
   private short[] T00D030_A194BarOrdLin ;
   private String[] T00D030_A719PrdNum ;
   private String[] T00D031_A396EmprCod ;
   private int[] T00D031_A129BarCod ;
   private byte[] T00D031_A132BarCodReo ;
   private String[] T00D031_A130BarCodPar ;
   private String[] T00D031_A758ProCod ;
   private short[] T00D031_A194BarOrdLin ;
   private String[] T00D031_A9966Em_cod ;
   private String[] T00D032_A396EmprCod ;
   private int[] T00D032_A129BarCod ;
   private byte[] T00D032_A132BarCodReo ;
   private String[] T00D032_A130BarCodPar ;
   private String[] T00D032_A758ProCod ;
   private short[] T00D032_A194BarOrdLin ;
   private String[] T00D032_A9940Ab_cod ;
   private String[] T00D033_A396EmprCod ;
   private int[] T00D033_A129BarCod ;
   private byte[] T00D033_A132BarCodReo ;
   private String[] T00D033_A130BarCodPar ;
   private String[] T00D033_A758ProCod ;
   private short[] T00D033_A194BarOrdLin ;
   private String[] T00D033_A9911Ca_cod ;
   private String[] T00D034_A396EmprCod ;
   private int[] T00D034_A129BarCod ;
   private byte[] T00D034_A132BarCodReo ;
   private String[] T00D034_A130BarCodPar ;
   private String[] T00D034_A758ProCod ;
   private short[] T00D034_A194BarOrdLin ;
   private String[] T00D034_A9878Pe_cod ;
   private String[] T00D035_A396EmprCod ;
   private int[] T00D035_A129BarCod ;
   private byte[] T00D035_A132BarCodReo ;
   private String[] T00D035_A130BarCodPar ;
   private String[] T00D035_A758ProCod ;
   private short[] T00D035_A194BarOrdLin ;
   private String[] T00D035_A9870Rm_cod ;
   private String[] T00D036_A396EmprCod ;
   private int[] T00D036_A129BarCod ;
   private byte[] T00D036_A132BarCodReo ;
   private String[] T00D036_A130BarCodPar ;
   private String[] T00D036_A758ProCod ;
   private short[] T00D036_A194BarOrdLin ;
   private short[] T00D036_A7934Dtb_Ordl ;
   private String[] T00D037_A396EmprCod ;
   private int[] T00D037_A129BarCod ;
   private byte[] T00D037_A132BarCodReo ;
   private String[] T00D037_A130BarCodPar ;
   private String[] T00D037_A758ProCod ;
   private short[] T00D037_A194BarOrdLin ;
   private short[] T00D037_A5371FasQuiLin ;
   private String[] T00D038_A396EmprCod ;
   private int[] T00D038_A129BarCod ;
   private byte[] T00D038_A132BarCodReo ;
   private String[] T00D038_A130BarCodPar ;
   private String[] T00D038_A758ProCod ;
   private short[] T00D038_A194BarOrdLin ;
   private int[] T00D038_A4940A_Barcod ;
   private byte[] T00D038_A4941A_BarReo ;
   private String[] T00D038_A4942A_BarPar ;
   private String[] T00D038_A4943A_ProCod ;
   private short[] T00D038_A4944A_BarOrd ;
   private String[] T00D039_A396EmprCod ;
   private int[] T00D039_A129BarCod ;
   private byte[] T00D039_A132BarCodReo ;
   private String[] T00D039_A130BarCodPar ;
   private String[] T00D039_A758ProCod ;
   private short[] T00D039_A194BarOrdLin ;
   private int[] T00D039_A4643BarFasLot ;
   private String[] T00D040_A396EmprCod ;
   private int[] T00D040_A129BarCod ;
   private byte[] T00D040_A132BarCodReo ;
   private String[] T00D040_A130BarCodPar ;
   private String[] T00D040_A758ProCod ;
   private short[] T00D040_A194BarOrdLin ;
   private int[] T00D040_A4031CCTCod ;
   private String[] T00D041_A396EmprCod ;
   private int[] T00D041_A129BarCod ;
   private byte[] T00D041_A132BarCodReo ;
   private String[] T00D041_A130BarCodPar ;
   private String[] T00D041_A758ProCod ;
   private short[] T00D041_A194BarOrdLin ;
   private int[] T00D041_A4643BarFasLot ;
   private short[] T00D041_A10084BarPFcod ;
   private String[] T00D042_A396EmprCod ;
   private int[] T00D042_A129BarCod ;
   private byte[] T00D042_A132BarCodReo ;
   private String[] T00D042_A130BarCodPar ;
   private String[] T00D042_A758ProCod ;
   private short[] T00D042_A194BarOrdLin ;
   private int[] T00D043_A129BarCod ;
   private byte[] T00D043_A132BarCodReo ;
   private String[] T00D043_A130BarCodPar ;
   private short[] T00D043_A194BarOrdLin ;
   private String[] T00D043_A1665ParFasDsc ;
   private boolean[] T00D043_n1665ParFasDsc ;
   private String[] T00D043_A3295BarParVal ;
   private String[] T00D043_A3296BarParObs ;
   private String[] T00D043_A9737BarValPar ;
   private short[] T00D043_A10257Itm_ord5 ;
   private String[] T00D043_A12671BarParVl2 ;
   private String[] T00D043_A13204ParUndDsc ;
   private boolean[] T00D043_n13204ParUndDsc ;
   private String[] T00D043_A13991BarParVMn ;
   private String[] T00D043_A13992BarParVMx ;
   private String[] T00D043_A14079BarParPLC ;
   private String[] T00D043_A396EmprCod ;
   private short[] T00D043_A1664ParFasCod ;
   private String[] T00D043_A758ProCod ;
   private short[] T00D043_A13203ParUndID ;
   private boolean[] T00D043_n13203ParUndID ;
   private String[] T00D04_A1665ParFasDsc ;
   private boolean[] T00D04_n1665ParFasDsc ;
   private short[] T00D04_A13203ParUndID ;
   private boolean[] T00D04_n13203ParUndID ;
   private String[] T00D05_A13204ParUndDsc ;
   private boolean[] T00D05_n13204ParUndDsc ;
   private String[] T00D044_A1665ParFasDsc ;
   private boolean[] T00D044_n1665ParFasDsc ;
   private short[] T00D044_A13203ParUndID ;
   private boolean[] T00D044_n13203ParUndID ;
   private String[] T00D045_A13204ParUndDsc ;
   private boolean[] T00D045_n13204ParUndDsc ;
   private String[] T00D046_A396EmprCod ;
   private int[] T00D046_A129BarCod ;
   private byte[] T00D046_A132BarCodReo ;
   private String[] T00D046_A130BarCodPar ;
   private String[] T00D046_A758ProCod ;
   private short[] T00D046_A194BarOrdLin ;
   private short[] T00D046_A1664ParFasCod ;
   private int[] T00D03_A129BarCod ;
   private byte[] T00D03_A132BarCodReo ;
   private String[] T00D03_A130BarCodPar ;
   private short[] T00D03_A194BarOrdLin ;
   private String[] T00D03_A3295BarParVal ;
   private String[] T00D03_A3296BarParObs ;
   private String[] T00D03_A9737BarValPar ;
   private short[] T00D03_A10257Itm_ord5 ;
   private String[] T00D03_A12671BarParVl2 ;
   private String[] T00D03_A13991BarParVMn ;
   private String[] T00D03_A13992BarParVMx ;
   private String[] T00D03_A14079BarParPLC ;
   private String[] T00D03_A396EmprCod ;
   private short[] T00D03_A1664ParFasCod ;
   private String[] T00D03_A758ProCod ;
   private int[] T00D02_A129BarCod ;
   private byte[] T00D02_A132BarCodReo ;
   private String[] T00D02_A130BarCodPar ;
   private short[] T00D02_A194BarOrdLin ;
   private String[] T00D02_A3295BarParVal ;
   private String[] T00D02_A3296BarParObs ;
   private String[] T00D02_A9737BarValPar ;
   private short[] T00D02_A10257Itm_ord5 ;
   private String[] T00D02_A12671BarParVl2 ;
   private String[] T00D02_A13991BarParVMn ;
   private String[] T00D02_A13992BarParVMx ;
   private String[] T00D02_A14079BarParPLC ;
   private String[] T00D02_A396EmprCod ;
   private short[] T00D02_A1664ParFasCod ;
   private String[] T00D02_A758ProCod ;
   private String[] T00D050_A1665ParFasDsc ;
   private boolean[] T00D050_n1665ParFasDsc ;
   private short[] T00D050_A13203ParUndID ;
   private boolean[] T00D050_n13203ParUndID ;
   private String[] T00D051_A13204ParUndDsc ;
   private boolean[] T00D051_n13204ParUndDsc ;
   private String[] T00D052_A396EmprCod ;
   private int[] T00D052_A129BarCod ;
   private byte[] T00D052_A132BarCodReo ;
   private String[] T00D052_A130BarCodPar ;
   private String[] T00D052_A758ProCod ;
   private short[] T00D052_A194BarOrdLin ;
   private int[] T00D052_A4643BarFasLot ;
   private short[] T00D052_A10084BarPFcod ;
   private String[] T00D053_A396EmprCod ;
   private int[] T00D053_A129BarCod ;
   private byte[] T00D053_A132BarCodReo ;
   private String[] T00D053_A130BarCodPar ;
   private String[] T00D053_A758ProCod ;
   private short[] T00D053_A194BarOrdLin ;
   private short[] T00D053_A1664ParFasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV50ParFasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV45WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV46TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV49TrnContextAtt ;
}

final  class tfaspar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00D02", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarParVal, BarParObs, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC, EmprCod, ParFasCod, ProCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND ParFasCod = ?  FOR UPDATE OF BarParVal, BarParObs, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D03", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, BarParVal, BarParObs, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC, EmprCod, ParFasCod, ProCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D04", "SELECT ParFasDsc, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D05", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D06", "SELECT BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D07", "SELECT BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D08", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D09", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D010", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D011", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D012", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarOrdLin, T2.EmprNom, T4.ProDsc, T3.FasDsc, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.FasCod FROM (((TXPBARFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D013", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D014", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D015", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and ProCod > ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarOrdLin > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D016", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and ProCod < ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and BarOrdLin < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00D017", "INSERT INTO TXPBARFAS(BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00D018", "UPDATE TXPBARFAS SET FasCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00D019", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T00D020", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D021", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D022", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D023", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D024", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D025", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D026", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D027", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D028", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D029", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D030", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D031", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D032", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D033", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D034", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D035", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D036", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D037", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D038", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D039", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D040", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D041", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod FROM TXPFASPFA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D042", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D043", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T2.ParFasDsc, T1.BarParVal, T1.BarParObs, T1.BarValPar, T1.Itm_ord5, T1.BarParVl2, T3.ParUndDsc, T1.BarParVMn, T1.BarParVMx, T1.BarParPLC, T1.EmprCod, T1.ParFasCod, T1.ProCod, T2.ParUndID FROM ((TXPBarPar T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) LEFT JOIN TXPPARUND T3 ON T3.EmprCod = T1.EmprCod AND T3.ParUndID = T2.ParUndID) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.ParFasCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D044", "SELECT ParFasDsc, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D045", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D046", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00D047", "INSERT INTO TXPBarPar(BarCod, BarCodReo, BarCodPar, BarOrdLin, BarParVal, BarParObs, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC, EmprCod, ParFasCod, ProCod, BarParTxt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPBarPar")
         ,new UpdateCursor("T00D048", "UPDATE TXPBarPar SET BarParVal=?, BarParObs=?, BarValPar=?, Itm_ord5=?, BarParVl2=?, BarParVMn=?, BarParVMx=?, BarParPLC=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND ParFasCod = ?", GX_NOMASK, "TXPBarPar")
         ,new UpdateCursor("T00D049", "DELETE FROM TXPBarPar  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND ParFasCod = ?", GX_NOMASK, "TXPBarPar")
         ,new ForEachCursor("T00D050", "SELECT ParFasDsc, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D051", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00D052", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarPFcod FROM TXPFASPFA WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarPFcod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00D053", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((String[]) buf[11])[0] = rslt.getString(12, 100);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((String[]) buf[11])[0] = rslt.getString(12, 100);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 41 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 12);
               ((String[]) buf[11])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 12);
               ((String[]) buf[14])[0] = rslt.getString(13, 12);
               ((String[]) buf[15])[0] = rslt.getString(14, 100);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((short[]) buf[19])[0] = rslt.getShort(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
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
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 14 :
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
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 43 :
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
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 45 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 60);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 12);
               stmt.setString(10, (String)parms[9], 12);
               stmt.setString(11, (String)parms[10], 12);
               stmt.setString(12, (String)parms[11], 100);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 8);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 60);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 100);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setString(13, (String)parms[12], 8);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 49 :
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
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

