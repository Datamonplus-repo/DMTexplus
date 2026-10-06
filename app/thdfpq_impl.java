package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thdfpq_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
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
         gxload_29( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A764ProForCod) ;
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
            AV36EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36EmprCod, "@!"))));
            AV37BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37BarCod), "ZZZZZZZ9")));
            AV38BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReo", GXutil.str( AV38BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38BarCodReo), "9")));
            AV39BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodPar", AV39BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39BarCodPar, ""))));
            AV40ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40ProCod", AV40ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40ProCod, ""))));
            AV41BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41BarOrdLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41BarOrdLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TRATAMIENTO QUIMICO P/FASES", ""), (short)(0)) ;
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
      A5372FasQuiUl = (short)(GXutil.lval( httpContext.GetPar( "FasQuiUl"))) ;
      n5372FasQuiUl = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public thdfpq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thdfpq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thdfpq_impl.class ));
   }

   public thdfpq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDFPQ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDFPQ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDFPQ.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDFPQ.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "flex-grow:1;", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDFPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDFPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THDFPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV57Pgmname), GXutil.rtrim( localUtil.format( AV57Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THDFPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      ucCombo_proforcod.setProperty("Caption", Combo_proforcod_Caption);
      ucCombo_proforcod.setProperty("Cls", Combo_proforcod_Cls);
      ucCombo_proforcod.setProperty("IsGridItem", Combo_proforcod_Isgriditem);
      ucCombo_proforcod.setProperty("EmptyItem", Combo_proforcod_Emptyitem);
      ucCombo_proforcod.setProperty("DropDownOptionsData", AV47ProForCod_Data);
      ucCombo_proforcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforcod_Internalname, "COMBO_PROFORCODContainer");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasQuiUl_Internalname, GXutil.ltrim( localUtil.ntoc( A5372FasQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasQuiUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5372FasQuiUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5372FasQuiUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasQuiUl_Jsonclick, 0, "Attribute", "", "", "", "", edtFasQuiUl_Visible, edtFasQuiUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THDFPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol41( ) ;
      nGXsfl_41_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount779 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_779 = (short)(1) ;
            scanStartU4779( ) ;
            while ( RcdFound779 != 0 )
            {
               init_level_properties779( ) ;
               getByPrimaryKeyU4779( ) ;
               addRowU4779( ) ;
               scanNextU4779( ) ;
            }
            scanEndU4779( ) ;
            nBlankRcdCount779 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5372FasQuiUl = A5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         standaloneNotModalU4779( ) ;
         standaloneModalU4779( ) ;
         sMode779 = Gx_mode ;
         while ( nGXsfl_41_idx < nRC_GXsfl_41 )
         {
            bGXsfl_41_Refreshing = true ;
            readRowU4779( ) ;
            edtFasQuiLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUILIN_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiLin_Enabled), 5, 0), !bGXsfl_41_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
            if ( ( nRcdExists_779 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalU4779( ) ;
            }
            sendRowU4779( ) ;
            bGXsfl_41_Refreshing = false ;
         }
         Gx_mode = sMode779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5372FasQuiUl = B5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount779 = (short)(5) ;
         nRcdExists_779 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartU4779( ) ;
            while ( RcdFound779 != 0 )
            {
               sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_41779( ) ;
               init_level_properties779( ) ;
               standaloneNotModalU4779( ) ;
               getByPrimaryKeyU4779( ) ;
               standaloneModalU4779( ) ;
               addRowU4779( ) ;
               scanNextU4779( ) ;
            }
            scanEndU4779( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode779 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_41779( ) ;
         initAllU4779( ) ;
         init_level_properties779( ) ;
         B5372FasQuiUl = A5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         nRcdExists_779 = (short)(0) ;
         nIsMod_779 = (short)(0) ;
         nRcdDeleted_779 = (short)(0) ;
         nBlankRcdCount779 = (short)(nBlankRcdUsr779+nBlankRcdCount779) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount779 > 0 )
         {
            standaloneNotModalU4779( ) ;
            standaloneModalU4779( ) ;
            addRowU4779( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount779 = (short)(nBlankRcdCount779-1) ;
         }
         Gx_mode = sMode779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5372FasQuiUl = B5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
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
      e11U42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORCOD_DATA"), AV47ProForCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5372FasQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z5372FasQuiUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            A457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            O5372FasQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "O5372FasQuiUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N457FasCod = httpContext.cgiGet( "N457FasCod") ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( "BARCODPAR") ;
            AV36EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV37BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV40ProCod = httpContext.cgiGet( "vPROCOD") ;
            A758ProCod = httpContext.cgiGet( "PROCOD") ;
            AV41BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "vBARORDLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV45Insert_FasCod = httpContext.cgiGet( "vINSERT_FASCOD") ;
            A457FasCod = httpContext.cgiGet( "FASCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5373FasQuiNp = (short)(localUtil.ctol( httpContext.cgiGet( "FASQUINP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5374FasQuiTp = (short)(localUtil.ctol( httpContext.cgiGet( "FASQUITP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5375FasQuiRb = (short)(localUtil.ctol( httpContext.cgiGet( "FASQUIRB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6599FasMaqPl = httpContext.cgiGet( "FASMAQPL") ;
            A6600FasFecPl = localUtil.ctod( httpContext.cgiGet( "FASFECPL"), 0) ;
            A6601FasOrdPl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASORDPL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6602FasStPl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASSTPL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6663FasQuiAnc = (short)(localUtil.ctol( httpContext.cgiGet( "FASQUIANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6664FasQuiGrm = (short)(localUtil.ctol( httpContext.cgiGet( "FASQUIGRM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9722FasQuiVel = localUtil.ctond( httpContext.cgiGet( "FASQUIVEL")) ;
            A11506FasQuiAv = httpContext.cgiGet( "FASQUIAV") ;
            A12124FasQuiAs = httpContext.cgiGet( "FASQUIAS") ;
            A12125FasQuiAI = httpContext.cgiGet( "FASQUIAI") ;
            A6665FasQuiObs = httpContext.cgiGet( "FASQUIOBS") ;
            A766ProForDsc = httpContext.cgiGet( "PROFORDSC") ;
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
            Combo_proforcod_Objectcall = httpContext.cgiGet( "COMBO_PROFORCOD_Objectcall") ;
            Combo_proforcod_Class = httpContext.cgiGet( "COMBO_PROFORCOD_Class") ;
            Combo_proforcod_Icontype = httpContext.cgiGet( "COMBO_PROFORCOD_Icontype") ;
            Combo_proforcod_Icon = httpContext.cgiGet( "COMBO_PROFORCOD_Icon") ;
            Combo_proforcod_Caption = httpContext.cgiGet( "COMBO_PROFORCOD_Caption") ;
            Combo_proforcod_Tooltip = httpContext.cgiGet( "COMBO_PROFORCOD_Tooltip") ;
            Combo_proforcod_Cls = httpContext.cgiGet( "COMBO_PROFORCOD_Cls") ;
            Combo_proforcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_set") ;
            Combo_proforcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_get") ;
            Combo_proforcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedtext_set") ;
            Combo_proforcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedtext_get") ;
            Combo_proforcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROFORCOD_Gamoauthtoken") ;
            Combo_proforcod_Ddointernalname = httpContext.cgiGet( "COMBO_PROFORCOD_Ddointernalname") ;
            Combo_proforcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROFORCOD_Titlecontrolalign") ;
            Combo_proforcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROFORCOD_Dropdownoptionstype") ;
            Combo_proforcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Enabled")) ;
            Combo_proforcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Visible")) ;
            Combo_proforcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROFORCOD_Titlecontrolidtoreplace") ;
            Combo_proforcod_Datalisttype = httpContext.cgiGet( "COMBO_PROFORCOD_Datalisttype") ;
            Combo_proforcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Allowmultipleselection")) ;
            Combo_proforcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistfixedvalues") ;
            Combo_proforcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Isgriditem")) ;
            Combo_proforcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Hasdescription")) ;
            Combo_proforcod_Datalistproc = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistproc") ;
            Combo_proforcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistprocparametersprefix") ;
            Combo_proforcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROFORCOD_Remoteservicesparameters") ;
            Combo_proforcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeonlyselectedoption")) ;
            Combo_proforcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeselectalloption")) ;
            Combo_proforcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitem")) ;
            Combo_proforcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeaddnewoption")) ;
            Combo_proforcod_Htmltemplate = httpContext.cgiGet( "COMBO_PROFORCOD_Htmltemplate") ;
            Combo_proforcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROFORCOD_Multiplevaluestype") ;
            Combo_proforcod_Loadingdata = httpContext.cgiGet( "COMBO_PROFORCOD_Loadingdata") ;
            Combo_proforcod_Noresultsfound = httpContext.cgiGet( "COMBO_PROFORCOD_Noresultsfound") ;
            Combo_proforcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitemtext") ;
            Combo_proforcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROFORCOD_Onlyselectedvalues") ;
            Combo_proforcod_Selectalltext = httpContext.cgiGet( "COMBO_PROFORCOD_Selectalltext") ;
            Combo_proforcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROFORCOD_Multiplevaluesseparator") ;
            Combo_proforcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROFORCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            AV57Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
            A5372FasQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5372FasQuiUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"THDFPQ");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV57Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV57Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A194BarOrdLin != Z194BarOrdLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("thdfpq:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_U40( ) ;
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
                        e11U42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12U42 ();
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
         e12U42 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllU415( ) ;
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
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributesU415( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
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

   public void confirm_U40( )
   {
      beforeValidateU415( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsU415( ) ;
         }
         else
         {
            checkExtendedTableU415( ) ;
            closeExtendedTableCursorsU415( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode15 = Gx_mode ;
         confirm_U4779( ) ;
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

   public void confirm_U4779( )
   {
      s5372FasQuiUl = O5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      nGXsfl_41_idx = 0 ;
      while ( nGXsfl_41_idx < nRC_GXsfl_41 )
      {
         readRowU4779( ) ;
         if ( ( nRcdExists_779 != 0 ) || ( nIsMod_779 != 0 ) )
         {
            getKeyU4779( ) ;
            if ( ( nRcdExists_779 == 0 ) && ( nRcdDeleted_779 == 0 ) )
            {
               if ( RcdFound779 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateU4779( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableU4779( ) ;
                     closeExtendedTableCursorsU4779( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5372FasQuiUl = A5372FasQuiUl ;
                     n5372FasQuiUl = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound779 != 0 )
               {
                  if ( nRcdDeleted_779 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyU4779( ) ;
                     loadU4779( ) ;
                     beforeValidateU4779( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsU4779( ) ;
                        O5372FasQuiUl = A5372FasQuiUl ;
                        n5372FasQuiUl = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_779 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateU4779( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableU4779( ) ;
                           closeExtendedTableCursorsU4779( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5372FasQuiUl = A5372FasQuiUl ;
                           n5372FasQuiUl = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_779 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasQuiLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5371FasQuiLin_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5373FasQuiNp_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5374FasQuiTp_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5375FasQuiRb_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6599FasMaqPl_"+sGXsfl_41_idx, GXutil.rtrim( Z6599FasMaqPl)) ;
         httpContext.changePostValue( "ZT_"+"Z6600FasFecPl_"+sGXsfl_41_idx, localUtil.dtoc( Z6600FasFecPl, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z6601FasOrdPl_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z6601FasOrdPl, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6602FasStPl_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z6602FasStPl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6663FasQuiAnc_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z6663FasQuiAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6664FasQuiGrm_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z6664FasQuiGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9722FasQuiVel_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z9722FasQuiVel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11506FasQuiAv_"+sGXsfl_41_idx, GXutil.rtrim( Z11506FasQuiAv)) ;
         httpContext.changePostValue( "ZT_"+"Z12124FasQuiAs_"+sGXsfl_41_idx, GXutil.rtrim( Z12124FasQuiAs)) ;
         httpContext.changePostValue( "ZT_"+"Z12125FasQuiAI_"+sGXsfl_41_idx, GXutil.rtrim( Z12125FasQuiAI)) ;
         httpContext.changePostValue( "ZT_"+"Z6665FasQuiObs_"+sGXsfl_41_idx, Z6665FasQuiObs) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_41_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_779_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_779_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_779_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_779 != 0 )
         {
            httpContext.changePostValue( "FASQUILIN_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5372FasQuiUl = s5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionU40( )
   {
   }

   public void e11U42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      thdfpq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thdfpq_impl.this.A396EmprCod = GXv_char2[0] ;
      thdfpq_impl.this.AV11EmprNom = GXv_char3[0] ;
      thdfpq_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      thdfpq_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV36EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      thdfpq_impl.this.AV36EmprCod = GXv_char4[0] ;
      thdfpq_impl.this.AV11EmprNom = GXv_char3[0] ;
      thdfpq_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV42WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV42WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_proforcod_Titlecontrolidtoreplace = edtProForCod_Internalname ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "TitleControlIdToReplace", Combo_proforcod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPROFORCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV43TrnContext.fromxml(AV44WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV43TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV57Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV58GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GXV1), 8, 0));
         while ( AV58GXV1 <= AV43TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV46TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV43TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV58GXV1));
            if ( GXutil.strcmp(AV46TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FasCod") == 0 )
            {
               AV45Insert_FasCod = AV46TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45Insert_FasCod", AV45Insert_FasCod);
            }
            AV58GXV1 = (int)(AV58GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GXV1), 8, 0));
         }
      }
      edtFasQuiUl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Visible), 5, 0), true);
   }

   public void e12U42( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int6[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A758ProCod ;
      GXv_int8[0] = A194BarOrdLin ;
      new app.ppqphf(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_char3, GXv_char2, GXv_int8) ;
      thdfpq_impl.this.A396EmprCod = GXv_char4[0] ;
      thdfpq_impl.this.A129BarCod = GXv_int6[0] ;
      thdfpq_impl.this.A132BarCodReo = GXv_int7[0] ;
      thdfpq_impl.this.A130BarCodPar = GXv_char3[0] ;
      thdfpq_impl.this.A758ProCod = GXv_char2[0] ;
      thdfpq_impl.this.A194BarOrdLin = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROFORCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = AV47ProForCod_Data ;
      GXv_char4[0] = AV49ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item10[0] = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
      new app.thdfpqloaddvcombo(remoteHandle, context).execute( "ProForCod", Gx_mode, AV36EmprCod, AV37BarCod, AV38BarCodReo, AV39BarCodPar, AV40ProCod, AV41BarOrdLin, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item10) ;
      thdfpq_impl.this.AV49ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = GXv_objcol_SdtDVB_SDTComboData_Item10[0] ;
      AV47ProForCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   }

   public void zmU415( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5372FasQuiUl = T00U46_A5372FasQuiUl[0] ;
            Z457FasCod = T00U46_A457FasCod[0] ;
         }
         else
         {
            Z5372FasQuiUl = A5372FasQuiUl ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -25 )
      {
         Z194BarOrdLin = A194BarOrdLin ;
         Z5372FasQuiUl = A5372FasQuiUl ;
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
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
      AV57Pgmname = "THDFPQ" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV36EmprCod)==0) )
      {
         A396EmprCod = AV36EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00U47 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00U47_A407EmprNom[0] ;
      n407EmprNom = T00U47_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV37BarCod) )
      {
         A129BarCod = AV37BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV38BarCodReo) )
      {
         A132BarCodReo = AV38BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV39BarCodPar)==0) )
      {
         A130BarCodPar = AV39BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      if ( ! (GXutil.strcmp("", AV40ProCod)==0) )
      {
         A758ProCod = AV40ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Using cursor T00U48 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00U48_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
      /* Using cursor T00U49 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      if ( ! (0==AV41BarOrdLin) )
      {
         A194BarOrdLin = AV41BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV45Insert_FasCod)==0) )
      {
         A457FasCod = AV45Insert_FasCod ;
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
         /* Using cursor T00U410 */
         pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00U410_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(8);
      }
   }

   public void loadU415( )
   {
      /* Using cursor T00U411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A407EmprNom = T00U411_A407EmprNom[0] ;
         n407EmprNom = T00U411_n407EmprNom[0] ;
         A759ProDsc = T00U411_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T00U411_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A5372FasQuiUl = T00U411_A5372FasQuiUl[0] ;
         n5372FasQuiUl = T00U411_n5372FasQuiUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         A457FasCod = T00U411_A457FasCod[0] ;
         zmU415( -25) ;
      }
      pr_default.close(9);
      onLoadActionsU415( ) ;
   }

   public void onLoadActionsU415( )
   {
   }

   public void checkExtendedTableU415( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00U410 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00U410_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(8);
   }

   public void closeExtendedTableCursorsU415( )
   {
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_29( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00U412 */
      pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00U412_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKeyU415( )
   {
      /* Using cursor T00U413 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00U46 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00U46_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmU415( 25) ;
         RcdFound15 = (short)(1) ;
         A194BarOrdLin = T00U46_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A5372FasQuiUl = T00U46_A5372FasQuiUl[0] ;
         n5372FasQuiUl = T00U46_n5372FasQuiUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         A129BarCod = T00U46_A129BarCod[0] ;
         A132BarCodReo = T00U46_A132BarCodReo[0] ;
         A130BarCodPar = T00U46_A130BarCodPar[0] ;
         A758ProCod = T00U46_A758ProCod[0] ;
         A457FasCod = T00U46_A457FasCod[0] ;
         O5372FasQuiUl = A5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadU415( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKeyU415( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKeyU415( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyU415( ) ;
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
      /* Using cursor T00U414 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A194BarOrdLin), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T00U414_A129BarCod[0] < A129BarCod ) || ( T00U414_A129BarCod[0] == A129BarCod ) && ( T00U414_A132BarCodReo[0] < A132BarCodReo ) || ( T00U414_A132BarCodReo[0] == A132BarCodReo ) && ( T00U414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00U414_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00U414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00U414_A132BarCodReo[0] == A132BarCodReo ) && ( T00U414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00U414_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T00U414_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00U414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00U414_A132BarCodReo[0] == A132BarCodReo ) && ( T00U414_A129BarCod[0] == A129BarCod ) && ( T00U414_A194BarOrdLin[0] < A194BarOrdLin ) ) && ( GXutil.strcmp(T00U414_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T00U414_A129BarCod[0] > A129BarCod ) || ( T00U414_A129BarCod[0] == A129BarCod ) && ( T00U414_A132BarCodReo[0] > A132BarCodReo ) || ( T00U414_A132BarCodReo[0] == A132BarCodReo ) && ( T00U414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00U414_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00U414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00U414_A132BarCodReo[0] == A132BarCodReo ) && ( T00U414_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00U414_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T00U414_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00U414_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00U414_A132BarCodReo[0] == A132BarCodReo ) && ( T00U414_A129BarCod[0] == A129BarCod ) && ( T00U414_A194BarOrdLin[0] > A194BarOrdLin ) ) && ( GXutil.strcmp(T00U414_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T00U414_A129BarCod[0] ;
            A132BarCodReo = T00U414_A132BarCodReo[0] ;
            A130BarCodPar = T00U414_A130BarCodPar[0] ;
            A758ProCod = T00U414_A758ProCod[0] ;
            A194BarOrdLin = T00U414_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T00U415 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A758ProCod, A758ProCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Short.valueOf(A194BarOrdLin), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T00U415_A129BarCod[0] > A129BarCod ) || ( T00U415_A129BarCod[0] == A129BarCod ) && ( T00U415_A132BarCodReo[0] > A132BarCodReo ) || ( T00U415_A132BarCodReo[0] == A132BarCodReo ) && ( T00U415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00U415_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T00U415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00U415_A132BarCodReo[0] == A132BarCodReo ) && ( T00U415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00U415_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T00U415_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00U415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00U415_A132BarCodReo[0] == A132BarCodReo ) && ( T00U415_A129BarCod[0] == A129BarCod ) && ( T00U415_A194BarOrdLin[0] > A194BarOrdLin ) ) && ( GXutil.strcmp(T00U415_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T00U415_A129BarCod[0] < A129BarCod ) || ( T00U415_A129BarCod[0] == A129BarCod ) && ( T00U415_A132BarCodReo[0] < A132BarCodReo ) || ( T00U415_A132BarCodReo[0] == A132BarCodReo ) && ( T00U415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00U415_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T00U415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00U415_A132BarCodReo[0] == A132BarCodReo ) && ( T00U415_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T00U415_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T00U415_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T00U415_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00U415_A132BarCodReo[0] == A132BarCodReo ) && ( T00U415_A129BarCod[0] == A129BarCod ) && ( T00U415_A194BarOrdLin[0] < A194BarOrdLin ) ) && ( GXutil.strcmp(T00U415_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T00U415_A129BarCod[0] ;
            A132BarCodReo = T00U415_A132BarCodReo[0] ;
            A130BarCodPar = T00U415_A130BarCodPar[0] ;
            A758ProCod = T00U415_A758ProCod[0] ;
            A194BarOrdLin = T00U415_A194BarOrdLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyU415( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5372FasQuiUl = O5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         insertU415( ) ;
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
               A5372FasQuiUl = O5372FasQuiUl ;
               n5372FasQuiUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A5372FasQuiUl = O5372FasQuiUl ;
               n5372FasQuiUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               updateU415( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               /* Insert record */
               A5372FasQuiUl = O5372FasQuiUl ;
               n5372FasQuiUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               insertU415( ) ;
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
                  A5372FasQuiUl = O5372FasQuiUl ;
                  n5372FasQuiUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
                  insertU415( ) ;
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
         A5372FasQuiUl = O5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyU415( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00U45 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z5372FasQuiUl != T00U45_A5372FasQuiUl[0] ) || ( GXutil.strcmp(Z457FasCod, T00U45_A457FasCod[0]) != 0 ) )
         {
            if ( Z5372FasQuiUl != T00U45_A5372FasQuiUl[0] )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiUl");
               GXutil.writeLogRaw("Old: ",Z5372FasQuiUl);
               GXutil.writeLogRaw("Current: ",T00U45_A5372FasQuiUl[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T00U45_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00U45_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertU415( )
   {
      beforeValidateU415( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU415( ) ;
      }
      if ( AnyError == 0 )
      {
         zmU415( 0) ;
         checkOptimisticConcurrencyU415( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU415( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertU415( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U416 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A194BarOrdLin), Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
                        processLevelU415( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionU40( ) ;
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
            loadU415( ) ;
         }
         endLevelU415( ) ;
      }
      closeExtendedTableCursorsU415( ) ;
   }

   public void updateU415( )
   {
      beforeValidateU415( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU415( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU415( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU415( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateU415( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U417 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A457FasCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateU415( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelU415( ) ;
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
         endLevelU415( ) ;
      }
      closeExtendedTableCursorsU415( ) ;
   }

   public void deferredUpdateU415( )
   {
   }

   public void delete( )
   {
      beforeValidateU415( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU415( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsU415( ) ;
         afterConfirmU415( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteU415( ) ;
            if ( AnyError == 0 )
            {
               A5372FasQuiUl = O5372FasQuiUl ;
               n5372FasQuiUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               scanStartU4779( ) ;
               while ( RcdFound779 != 0 )
               {
                  getByPrimaryKeyU4779( ) ;
                  deleteU4779( ) ;
                  scanNextU4779( ) ;
                  O5372FasQuiUl = A5372FasQuiUl ;
                  n5372FasQuiUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               }
               scanEndU4779( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U418 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
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
      endLevelU415( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsU415( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00U419 */
         pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T00U419_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00U420 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00U421 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00U422 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00U423 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00U424 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00U425 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00U426 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00U427 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00U428 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00U429 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00U430 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00U431 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00U432 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00U433 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00U434 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00U435 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00U436 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00U437 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00U438 */
         pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00U439 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
      }
   }

   public void processNestedLevelU4779( )
   {
      s5372FasQuiUl = O5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      nGXsfl_41_idx = 0 ;
      while ( nGXsfl_41_idx < nRC_GXsfl_41 )
      {
         readRowU4779( ) ;
         if ( ( nRcdExists_779 != 0 ) || ( nIsMod_779 != 0 ) )
         {
            standaloneNotModalU4779( ) ;
            getKeyU4779( ) ;
            if ( ( nRcdExists_779 == 0 ) && ( nRcdDeleted_779 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertU4779( ) ;
            }
            else
            {
               if ( RcdFound779 != 0 )
               {
                  if ( ( nRcdDeleted_779 != 0 ) && ( nRcdExists_779 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteU4779( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_779 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateU4779( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_779 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O5372FasQuiUl = A5372FasQuiUl ;
            n5372FasQuiUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         }
         httpContext.changePostValue( edtFasQuiLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5371FasQuiLin_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5373FasQuiNp_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5374FasQuiTp_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5375FasQuiRb_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6599FasMaqPl_"+sGXsfl_41_idx, GXutil.rtrim( Z6599FasMaqPl)) ;
         httpContext.changePostValue( "ZT_"+"Z6600FasFecPl_"+sGXsfl_41_idx, localUtil.dtoc( Z6600FasFecPl, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z6601FasOrdPl_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z6601FasOrdPl, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6602FasStPl_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z6602FasStPl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6663FasQuiAnc_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z6663FasQuiAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6664FasQuiGrm_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z6664FasQuiGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9722FasQuiVel_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( Z9722FasQuiVel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11506FasQuiAv_"+sGXsfl_41_idx, GXutil.rtrim( Z11506FasQuiAv)) ;
         httpContext.changePostValue( "ZT_"+"Z12124FasQuiAs_"+sGXsfl_41_idx, GXutil.rtrim( Z12124FasQuiAs)) ;
         httpContext.changePostValue( "ZT_"+"Z12125FasQuiAI_"+sGXsfl_41_idx, GXutil.rtrim( Z12125FasQuiAI)) ;
         httpContext.changePostValue( "ZT_"+"Z6665FasQuiObs_"+sGXsfl_41_idx, Z6665FasQuiObs) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_41_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_779_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_779_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_779_"+sGXsfl_41_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_779 != 0 )
         {
            httpContext.changePostValue( "FASQUILIN_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllU4779( ) ;
      if ( AnyError != 0 )
      {
         O5372FasQuiUl = s5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      }
      nRcdExists_779 = (short)(0) ;
      nIsMod_779 = (short)(0) ;
      nRcdDeleted_779 = (short)(0) ;
   }

   public void processLevelU415( )
   {
      /* Save parent mode. */
      sMode15 = Gx_mode ;
      processNestedLevelU4779( ) ;
      if ( AnyError != 0 )
      {
         O5372FasQuiUl = s5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00U440 */
      pr_default.execute(38, new Object[] {Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
   }

   public void endLevelU415( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompleteU415( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thdfpq");
         if ( AnyError == 0 )
         {
            confirmValuesU40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thdfpq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartU415( )
   {
      /* Scan By routine */
      /* Using cursor T00U441 */
      pr_default.execute(39, new Object[] {A396EmprCod});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A129BarCod = T00U441_A129BarCod[0] ;
         A132BarCodReo = T00U441_A132BarCodReo[0] ;
         A130BarCodPar = T00U441_A130BarCodPar[0] ;
         A758ProCod = T00U441_A758ProCod[0] ;
         A194BarOrdLin = T00U441_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextU415( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A129BarCod = T00U441_A129BarCod[0] ;
         A132BarCodReo = T00U441_A132BarCodReo[0] ;
         A130BarCodPar = T00U441_A130BarCodPar[0] ;
         A758ProCod = T00U441_A758ProCod[0] ;
         A194BarOrdLin = T00U441_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      }
   }

   public void scanEndU415( )
   {
      pr_default.close(39);
   }

   public void afterConfirmU415( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertU415( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateU415( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteU415( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteU415( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateU415( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesU415( )
   {
      edtBarNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
   }

   public void zmU4779( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5373FasQuiNp = T00U43_A5373FasQuiNp[0] ;
            Z5374FasQuiTp = T00U43_A5374FasQuiTp[0] ;
            Z5375FasQuiRb = T00U43_A5375FasQuiRb[0] ;
            Z6599FasMaqPl = T00U43_A6599FasMaqPl[0] ;
            Z6600FasFecPl = T00U43_A6600FasFecPl[0] ;
            Z6601FasOrdPl = T00U43_A6601FasOrdPl[0] ;
            Z6602FasStPl = T00U43_A6602FasStPl[0] ;
            Z6663FasQuiAnc = T00U43_A6663FasQuiAnc[0] ;
            Z6664FasQuiGrm = T00U43_A6664FasQuiGrm[0] ;
            Z9722FasQuiVel = T00U43_A9722FasQuiVel[0] ;
            Z11506FasQuiAv = T00U43_A11506FasQuiAv[0] ;
            Z12124FasQuiAs = T00U43_A12124FasQuiAs[0] ;
            Z12125FasQuiAI = T00U43_A12125FasQuiAI[0] ;
            Z6665FasQuiObs = T00U43_A6665FasQuiObs[0] ;
            Z764ProForCod = T00U43_A764ProForCod[0] ;
         }
         else
         {
            Z5373FasQuiNp = A5373FasQuiNp ;
            Z5374FasQuiTp = A5374FasQuiTp ;
            Z5375FasQuiRb = A5375FasQuiRb ;
            Z6599FasMaqPl = A6599FasMaqPl ;
            Z6600FasFecPl = A6600FasFecPl ;
            Z6601FasOrdPl = A6601FasOrdPl ;
            Z6602FasStPl = A6602FasStPl ;
            Z6663FasQuiAnc = A6663FasQuiAnc ;
            Z6664FasQuiGrm = A6664FasQuiGrm ;
            Z9722FasQuiVel = A9722FasQuiVel ;
            Z11506FasQuiAv = A11506FasQuiAv ;
            Z12124FasQuiAs = A12124FasQuiAs ;
            Z12125FasQuiAI = A12125FasQuiAI ;
            Z6665FasQuiObs = A6665FasQuiObs ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z5371FasQuiLin = A5371FasQuiLin ;
         Z5373FasQuiNp = A5373FasQuiNp ;
         Z5374FasQuiTp = A5374FasQuiTp ;
         Z5375FasQuiRb = A5375FasQuiRb ;
         Z6599FasMaqPl = A6599FasMaqPl ;
         Z6600FasFecPl = A6600FasFecPl ;
         Z6601FasOrdPl = A6601FasOrdPl ;
         Z6602FasStPl = A6602FasStPl ;
         Z6663FasQuiAnc = A6663FasQuiAnc ;
         Z6664FasQuiGrm = A6664FasQuiGrm ;
         Z9722FasQuiVel = A9722FasQuiVel ;
         Z11506FasQuiAv = A11506FasQuiAv ;
         Z12124FasQuiAs = A12124FasQuiAs ;
         Z12125FasQuiAI = A12125FasQuiAI ;
         Z6665FasQuiObs = A6665FasQuiObs ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z758ProCod = A758ProCod ;
         Z766ProForDsc = A766ProForDsc ;
      }
   }

   public void standaloneNotModalU4779( )
   {
      edtFasQuiLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiLin_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
   }

   public void standaloneModalU4779( )
   {
      if ( isIns( )  )
      {
         A5372FasQuiUl = (short)(O5372FasQuiUl+10) ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5371FasQuiLin = A5372FasQuiUl ;
      }
   }

   public void loadU4779( )
   {
      /* Using cursor T00U442 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound779 = (short)(1) ;
         A766ProForDsc = T00U442_A766ProForDsc[0] ;
         A5373FasQuiNp = T00U442_A5373FasQuiNp[0] ;
         A5374FasQuiTp = T00U442_A5374FasQuiTp[0] ;
         A5375FasQuiRb = T00U442_A5375FasQuiRb[0] ;
         A6599FasMaqPl = T00U442_A6599FasMaqPl[0] ;
         A6600FasFecPl = T00U442_A6600FasFecPl[0] ;
         A6601FasOrdPl = T00U442_A6601FasOrdPl[0] ;
         A6602FasStPl = T00U442_A6602FasStPl[0] ;
         A6663FasQuiAnc = T00U442_A6663FasQuiAnc[0] ;
         A6664FasQuiGrm = T00U442_A6664FasQuiGrm[0] ;
         A9722FasQuiVel = T00U442_A9722FasQuiVel[0] ;
         A11506FasQuiAv = T00U442_A11506FasQuiAv[0] ;
         A12124FasQuiAs = T00U442_A12124FasQuiAs[0] ;
         A12125FasQuiAI = T00U442_A12125FasQuiAI[0] ;
         A6665FasQuiObs = T00U442_A6665FasQuiObs[0] ;
         A764ProForCod = T00U442_A764ProForCod[0] ;
         zmU4779( -30) ;
      }
      pr_default.close(40);
      onLoadActionsU4779( ) ;
   }

   public void onLoadActionsU4779( )
   {
   }

   public void checkExtendedTableU4779( )
   {
      nIsDirty_779 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalU4779( ) ;
      /* Using cursor T00U44 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_41_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00U44_A766ProForDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsU4779( )
   {
      pr_default.close(2);
   }

   public void enableDisableU4779( )
   {
   }

   public void gxload_31( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T00U443 */
      pr_default.execute(41, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(41) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_41_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00U443_A766ProForDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(41) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(41);
   }

   public void getKeyU4779( )
   {
      /* Using cursor T00U444 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound779 = (short)(1) ;
      }
      else
      {
         RcdFound779 = (short)(0) ;
      }
      pr_default.close(42);
   }

   public void getByPrimaryKeyU4779( )
   {
      /* Using cursor T00U43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00U43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmU4779( 30) ;
         RcdFound779 = (short)(1) ;
         initializeNonKeyU4779( ) ;
         A5371FasQuiLin = T00U43_A5371FasQuiLin[0] ;
         A5373FasQuiNp = T00U43_A5373FasQuiNp[0] ;
         A5374FasQuiTp = T00U43_A5374FasQuiTp[0] ;
         A5375FasQuiRb = T00U43_A5375FasQuiRb[0] ;
         A6599FasMaqPl = T00U43_A6599FasMaqPl[0] ;
         A6600FasFecPl = T00U43_A6600FasFecPl[0] ;
         A6601FasOrdPl = T00U43_A6601FasOrdPl[0] ;
         A6602FasStPl = T00U43_A6602FasStPl[0] ;
         A6663FasQuiAnc = T00U43_A6663FasQuiAnc[0] ;
         A6664FasQuiGrm = T00U43_A6664FasQuiGrm[0] ;
         A9722FasQuiVel = T00U43_A9722FasQuiVel[0] ;
         A11506FasQuiAv = T00U43_A11506FasQuiAv[0] ;
         A12124FasQuiAs = T00U43_A12124FasQuiAs[0] ;
         A12125FasQuiAI = T00U43_A12125FasQuiAI[0] ;
         A6665FasQuiObs = T00U43_A6665FasQuiObs[0] ;
         A764ProForCod = T00U43_A764ProForCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z5371FasQuiLin = A5371FasQuiLin ;
         sMode779 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadU4779( ) ;
         Gx_mode = sMode779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound779 = (short)(0) ;
         initializeNonKeyU4779( ) ;
         sMode779 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalU4779( ) ;
         Gx_mode = sMode779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesU4779( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyU4779( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00U42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASQUI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z5373FasQuiNp != T00U42_A5373FasQuiNp[0] ) || ( Z5374FasQuiTp != T00U42_A5374FasQuiTp[0] ) || ( Z5375FasQuiRb != T00U42_A5375FasQuiRb[0] ) || ( GXutil.strcmp(Z6599FasMaqPl, T00U42_A6599FasMaqPl[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z6600FasFecPl), GXutil.resetTime(T00U42_A6600FasFecPl[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6601FasOrdPl != T00U42_A6601FasOrdPl[0] ) || ( Z6602FasStPl != T00U42_A6602FasStPl[0] ) || ( Z6663FasQuiAnc != T00U42_A6663FasQuiAnc[0] ) || ( Z6664FasQuiGrm != T00U42_A6664FasQuiGrm[0] ) || ( DecimalUtil.compareTo(Z9722FasQuiVel, T00U42_A9722FasQuiVel[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11506FasQuiAv, T00U42_A11506FasQuiAv[0]) != 0 ) || ( GXutil.strcmp(Z12124FasQuiAs, T00U42_A12124FasQuiAs[0]) != 0 ) || ( GXutil.strcmp(Z12125FasQuiAI, T00U42_A12125FasQuiAI[0]) != 0 ) || ( GXutil.strcmp(Z6665FasQuiObs, T00U42_A6665FasQuiObs[0]) != 0 ) || ( GXutil.strcmp(Z764ProForCod, T00U42_A764ProForCod[0]) != 0 ) )
         {
            if ( Z5373FasQuiNp != T00U42_A5373FasQuiNp[0] )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiNp");
               GXutil.writeLogRaw("Old: ",Z5373FasQuiNp);
               GXutil.writeLogRaw("Current: ",T00U42_A5373FasQuiNp[0]);
            }
            if ( Z5374FasQuiTp != T00U42_A5374FasQuiTp[0] )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiTp");
               GXutil.writeLogRaw("Old: ",Z5374FasQuiTp);
               GXutil.writeLogRaw("Current: ",T00U42_A5374FasQuiTp[0]);
            }
            if ( Z5375FasQuiRb != T00U42_A5375FasQuiRb[0] )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiRb");
               GXutil.writeLogRaw("Old: ",Z5375FasQuiRb);
               GXutil.writeLogRaw("Current: ",T00U42_A5375FasQuiRb[0]);
            }
            if ( GXutil.strcmp(Z6599FasMaqPl, T00U42_A6599FasMaqPl[0]) != 0 )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasMaqPl");
               GXutil.writeLogRaw("Old: ",Z6599FasMaqPl);
               GXutil.writeLogRaw("Current: ",T00U42_A6599FasMaqPl[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z6600FasFecPl), GXutil.resetTime(T00U42_A6600FasFecPl[0])) ) )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasFecPl");
               GXutil.writeLogRaw("Old: ",Z6600FasFecPl);
               GXutil.writeLogRaw("Current: ",T00U42_A6600FasFecPl[0]);
            }
            if ( Z6601FasOrdPl != T00U42_A6601FasOrdPl[0] )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasOrdPl");
               GXutil.writeLogRaw("Old: ",Z6601FasOrdPl);
               GXutil.writeLogRaw("Current: ",T00U42_A6601FasOrdPl[0]);
            }
            if ( Z6602FasStPl != T00U42_A6602FasStPl[0] )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasStPl");
               GXutil.writeLogRaw("Old: ",Z6602FasStPl);
               GXutil.writeLogRaw("Current: ",T00U42_A6602FasStPl[0]);
            }
            if ( Z6663FasQuiAnc != T00U42_A6663FasQuiAnc[0] )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiAnc");
               GXutil.writeLogRaw("Old: ",Z6663FasQuiAnc);
               GXutil.writeLogRaw("Current: ",T00U42_A6663FasQuiAnc[0]);
            }
            if ( Z6664FasQuiGrm != T00U42_A6664FasQuiGrm[0] )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiGrm");
               GXutil.writeLogRaw("Old: ",Z6664FasQuiGrm);
               GXutil.writeLogRaw("Current: ",T00U42_A6664FasQuiGrm[0]);
            }
            if ( DecimalUtil.compareTo(Z9722FasQuiVel, T00U42_A9722FasQuiVel[0]) != 0 )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiVel");
               GXutil.writeLogRaw("Old: ",Z9722FasQuiVel);
               GXutil.writeLogRaw("Current: ",T00U42_A9722FasQuiVel[0]);
            }
            if ( GXutil.strcmp(Z11506FasQuiAv, T00U42_A11506FasQuiAv[0]) != 0 )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiAv");
               GXutil.writeLogRaw("Old: ",Z11506FasQuiAv);
               GXutil.writeLogRaw("Current: ",T00U42_A11506FasQuiAv[0]);
            }
            if ( GXutil.strcmp(Z12124FasQuiAs, T00U42_A12124FasQuiAs[0]) != 0 )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiAs");
               GXutil.writeLogRaw("Old: ",Z12124FasQuiAs);
               GXutil.writeLogRaw("Current: ",T00U42_A12124FasQuiAs[0]);
            }
            if ( GXutil.strcmp(Z12125FasQuiAI, T00U42_A12125FasQuiAI[0]) != 0 )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiAI");
               GXutil.writeLogRaw("Old: ",Z12125FasQuiAI);
               GXutil.writeLogRaw("Current: ",T00U42_A12125FasQuiAI[0]);
            }
            if ( GXutil.strcmp(Z6665FasQuiObs, T00U42_A6665FasQuiObs[0]) != 0 )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"FasQuiObs");
               GXutil.writeLogRaw("Old: ",Z6665FasQuiObs);
               GXutil.writeLogRaw("Current: ",T00U42_A6665FasQuiObs[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T00U42_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("thdfpq:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T00U42_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASQUI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertU4779( )
   {
      beforeValidateU4779( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU4779( ) ;
      }
      if ( AnyError == 0 )
      {
         zmU4779( 0) ;
         checkOptimisticConcurrencyU4779( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmU4779( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertU4779( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00U445 */
                  pr_default.execute(43, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl), Short.valueOf(A6663FasQuiAnc), Short.valueOf(A6664FasQuiGrm), A9722FasQuiVel, A11506FasQuiAv, A12124FasQuiAs, A12125FasQuiAI, A6665FasQuiObs, A396EmprCod, A764ProForCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
                  if ( (pr_default.getStatus(43) == 1) )
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
            loadU4779( ) ;
         }
         endLevelU4779( ) ;
      }
      closeExtendedTableCursorsU4779( ) ;
   }

   public void updateU4779( )
   {
      beforeValidateU4779( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableU4779( ) ;
      }
      if ( ( nIsMod_779 != 0 ) || ( nIsDirty_779 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyU4779( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmU4779( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateU4779( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00U446 */
                     pr_default.execute(44, new Object[] {Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl), Short.valueOf(A6663FasQuiAnc), Short.valueOf(A6664FasQuiGrm), A9722FasQuiVel, A11506FasQuiAv, A12124FasQuiAs, A12125FasQuiAI, A6665FasQuiObs, A764ProForCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
                     if ( (pr_default.getStatus(44) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASQUI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateU4779( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyU4779( ) ;
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
            endLevelU4779( ) ;
         }
      }
      closeExtendedTableCursorsU4779( ) ;
   }

   public void deferredUpdateU4779( )
   {
   }

   public void deleteU4779( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateU4779( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyU4779( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsU4779( ) ;
         afterConfirmU4779( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteU4779( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00U447 */
               pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
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
      sMode779 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelU4779( ) ;
      Gx_mode = sMode779 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsU4779( )
   {
      standaloneModalU4779( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00U448 */
         pr_default.execute(46, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T00U448_A766ProForDsc[0] ;
         pr_default.close(46);
      }
   }

   public void endLevelU4779( )
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

   public void scanStartU4779( )
   {
      /* Scan By routine */
      /* Using cursor T00U449 */
      pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      RcdFound779 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound779 = (short)(1) ;
         A5371FasQuiLin = T00U449_A5371FasQuiLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextU4779( )
   {
      /* Scan next routine */
      pr_default.readNext(47);
      RcdFound779 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound779 = (short)(1) ;
         A5371FasQuiLin = T00U449_A5371FasQuiLin[0] ;
      }
   }

   public void scanEndU4779( )
   {
      pr_default.close(47);
   }

   public void afterConfirmU4779( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertU4779( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateU4779( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteU4779( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteU4779( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateU4779( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesU4779( )
   {
      edtFasQuiLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiLin_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void send_integrity_lvl_hashesU4779( )
   {
   }

   public void send_integrity_lvl_hashesU415( )
   {
   }

   public void subsflControlProps_41779( )
   {
      edtFasQuiLin_Internalname = "FASQUILIN_"+sGXsfl_41_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_41779( )
   {
      edtFasQuiLin_Internalname = "FASQUILIN_"+sGXsfl_41_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_41_fel_idx ;
   }

   public void addRowU4779( )
   {
      nGXsfl_41_idx = (int)(nGXsfl_41_idx+1) ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_41779( ) ;
      sendRowU4779( ) ;
   }

   public void sendRowU4779( )
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
         if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
      ROClassString = "WWActionColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasQuiLin_Internalname,GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasQuiLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5371FasQuiLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5371FasQuiLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasQuiLin_Jsonclick,Integer.valueOf(0),"WWActionColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasQuiLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_779_" + sGXsfl_41_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_41_idx + "',41)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn AttributeWidth100Porc AttributeWidth100Porc","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesU4779( ) ;
      GXCCtl = "Z5371FasQuiLin_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5373FasQuiNp_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5374FasQuiTp_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5375FasQuiRb_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6599FasMaqPl_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6599FasMaqPl));
      GXCCtl = "Z6600FasFecPl_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z6600FasFecPl, 0, "/"));
      GXCCtl = "Z6601FasOrdPl_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6601FasOrdPl, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6602FasStPl_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6602FasStPl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6663FasQuiAnc_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6663FasQuiAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6664FasQuiGrm_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6664FasQuiGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9722FasQuiVel_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9722FasQuiVel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11506FasQuiAv_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11506FasQuiAv));
      GXCCtl = "Z12124FasQuiAs_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12124FasQuiAs));
      GXCCtl = "Z12125FasQuiAI_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12125FasQuiAI));
      GXCCtl = "Z6665FasQuiObs_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z6665FasQuiObs);
      GXCCtl = "Z764ProForCod_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "nRcdDeleted_779_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_779_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_779_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "BARCOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "BARCODREO_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "BARCODPAR_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A130BarCodPar));
      GXCCtl = "PROCOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A758ProCod));
      GXCCtl = "vMODE_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV36EmprCod));
      GXCCtl = "vBARCOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV37BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV38BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV39BarCodPar));
      GXCCtl = "vPROCOD_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV40ProCod));
      GXCCtl = "vBARORDLIN_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV41BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUILIN_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_41_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowU4779( )
   {
      nGXsfl_41_idx = (int)(nGXsfl_41_idx+1) ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_41779( ) ;
      edtFasQuiLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUILIN_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_41_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5371FasQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      GXCCtl = "Z5371FasQuiLin_" + sGXsfl_41_idx ;
      Z5371FasQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5373FasQuiNp_" + sGXsfl_41_idx ;
      Z5373FasQuiNp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5374FasQuiTp_" + sGXsfl_41_idx ;
      Z5374FasQuiTp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5375FasQuiRb_" + sGXsfl_41_idx ;
      Z5375FasQuiRb = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6599FasMaqPl_" + sGXsfl_41_idx ;
      Z6599FasMaqPl = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6600FasFecPl_" + sGXsfl_41_idx ;
      Z6600FasFecPl = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z6601FasOrdPl_" + sGXsfl_41_idx ;
      Z6601FasOrdPl = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6602FasStPl_" + sGXsfl_41_idx ;
      Z6602FasStPl = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6663FasQuiAnc_" + sGXsfl_41_idx ;
      Z6663FasQuiAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6664FasQuiGrm_" + sGXsfl_41_idx ;
      Z6664FasQuiGrm = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9722FasQuiVel_" + sGXsfl_41_idx ;
      Z9722FasQuiVel = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11506FasQuiAv_" + sGXsfl_41_idx ;
      Z11506FasQuiAv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12124FasQuiAs_" + sGXsfl_41_idx ;
      Z12124FasQuiAs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12125FasQuiAI_" + sGXsfl_41_idx ;
      Z12125FasQuiAI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6665FasQuiObs_" + sGXsfl_41_idx ;
      Z6665FasQuiObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_41_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5373FasQuiNp_" + sGXsfl_41_idx ;
      A5373FasQuiNp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5374FasQuiTp_" + sGXsfl_41_idx ;
      A5374FasQuiTp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5375FasQuiRb_" + sGXsfl_41_idx ;
      A5375FasQuiRb = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6599FasMaqPl_" + sGXsfl_41_idx ;
      A6599FasMaqPl = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6600FasFecPl_" + sGXsfl_41_idx ;
      A6600FasFecPl = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z6601FasOrdPl_" + sGXsfl_41_idx ;
      A6601FasOrdPl = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6602FasStPl_" + sGXsfl_41_idx ;
      A6602FasStPl = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6663FasQuiAnc_" + sGXsfl_41_idx ;
      A6663FasQuiAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6664FasQuiGrm_" + sGXsfl_41_idx ;
      A6664FasQuiGrm = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9722FasQuiVel_" + sGXsfl_41_idx ;
      A9722FasQuiVel = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11506FasQuiAv_" + sGXsfl_41_idx ;
      A11506FasQuiAv = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12124FasQuiAs_" + sGXsfl_41_idx ;
      A12124FasQuiAs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12125FasQuiAI_" + sGXsfl_41_idx ;
      A12125FasQuiAI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6665FasQuiObs_" + sGXsfl_41_idx ;
      A6665FasQuiObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_779_" + sGXsfl_41_idx ;
      nRcdDeleted_779 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_779_" + sGXsfl_41_idx ;
      nRcdExists_779 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_779_" + sGXsfl_41_idx ;
      nIsMod_779 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFasQuiLin_Enabled = edtFasQuiLin_Enabled ;
   }

   public void confirmValuesU40( )
   {
      nGXsfl_41_idx = 0 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_41779( ) ;
      while ( nGXsfl_41_idx < nRC_GXsfl_41 )
      {
         nGXsfl_41_idx = (int)(nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_41779( ) ;
         httpContext.changePostValue( "Z5371FasQuiLin_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z5371FasQuiLin_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5371FasQuiLin_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z5373FasQuiNp_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z5373FasQuiNp_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5373FasQuiNp_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z5374FasQuiTp_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z5374FasQuiTp_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5374FasQuiTp_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z5375FasQuiRb_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z5375FasQuiRb_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5375FasQuiRb_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z6599FasMaqPl_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z6599FasMaqPl_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6599FasMaqPl_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z6600FasFecPl_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z6600FasFecPl_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6600FasFecPl_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z6601FasOrdPl_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z6601FasOrdPl_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6601FasOrdPl_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z6602FasStPl_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z6602FasStPl_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6602FasStPl_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z6663FasQuiAnc_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z6663FasQuiAnc_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6663FasQuiAnc_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z6664FasQuiGrm_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z6664FasQuiGrm_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6664FasQuiGrm_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z9722FasQuiVel_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z9722FasQuiVel_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9722FasQuiVel_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z11506FasQuiAv_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z11506FasQuiAv_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11506FasQuiAv_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z12124FasQuiAs_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z12124FasQuiAs_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12124FasQuiAs_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z12125FasQuiAI_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z12125FasQuiAI_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12125FasQuiAI_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z6665FasQuiObs_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z6665FasQuiObs_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6665FasQuiObs_"+sGXsfl_41_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_41_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_41_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_41_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.thdfpq", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV39BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV40ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarOrdLin,4,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"THDFPQ");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV57Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("thdfpq:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5372FasQuiUl", GXutil.ltrim( localUtil.ntoc( Z5372FasQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O5372FasQuiUl", GXutil.ltrim( localUtil.ntoc( O5372FasQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nGXsfl_41_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N457FasCod", GXutil.rtrim( A457FasCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORCOD_DATA", AV47ProForCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORCOD_DATA", AV47ProForCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV36EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV37BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV37BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV38BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV38BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV39BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV40ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV41BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FASCOD", GXutil.rtrim( AV45Insert_FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUINP", GXutil.ltrim( localUtil.ntoc( A5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUITP", GXutil.ltrim( localUtil.ntoc( A5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIRB", GXutil.ltrim( localUtil.ntoc( A5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASMAQPL", GXutil.rtrim( A6599FasMaqPl));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFECPL", localUtil.dtoc( A6600FasFecPl, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "FASORDPL", GXutil.ltrim( localUtil.ntoc( A6601FasOrdPl, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASSTPL", GXutil.ltrim( localUtil.ntoc( A6602FasStPl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIANC", GXutil.ltrim( localUtil.ntoc( A6663FasQuiAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIGRM", GXutil.ltrim( localUtil.ntoc( A6664FasQuiGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIVEL", GXutil.ltrim( localUtil.ntoc( A9722FasQuiVel, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIAV", GXutil.rtrim( A11506FasQuiAv));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIAS", GXutil.rtrim( A12124FasQuiAs));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIAI", GXutil.rtrim( A12125FasQuiAI));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIOBS", A6665FasQuiObs);
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC", GXutil.rtrim( A766ProForDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Objectcall", GXutil.rtrim( Combo_proforcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Cls", GXutil.rtrim( Combo_proforcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Enabled", GXutil.booltostr( Combo_proforcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_proforcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Isgriditem", GXutil.booltostr( Combo_proforcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Emptyitem", GXutil.booltostr( Combo_proforcod_Emptyitem));
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
      return formatLink("app.thdfpq", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV36EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV39BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV40ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV41BarOrdLin,4,0))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"})  ;
   }

   public String getPgmname( )
   {
      return "THDFPQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TRATAMIENTO QUIMICO P/FASES", "") ;
   }

   public void initializeNonKeyU415( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A5372FasQuiUl = (short)(0) ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      O5372FasQuiUl = A5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      Z5372FasQuiUl = (short)(0) ;
      Z457FasCod = "" ;
   }

   public void initAllU415( )
   {
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
      initializeNonKeyU415( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyU4779( )
   {
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A5373FasQuiNp = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5373FasQuiNp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5373FasQuiNp), 4, 0));
      A5374FasQuiTp = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5374FasQuiTp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5374FasQuiTp), 4, 0));
      A5375FasQuiRb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5375FasQuiRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5375FasQuiRb), 4, 0));
      A6599FasMaqPl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6599FasMaqPl", A6599FasMaqPl);
      A6600FasFecPl = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A6600FasFecPl", localUtil.format(A6600FasFecPl, "99/99/99"));
      A6601FasOrdPl = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6601FasOrdPl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6601FasOrdPl), 2, 0));
      A6602FasStPl = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6602FasStPl", GXutil.str( A6602FasStPl, 1, 0));
      A6663FasQuiAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6663FasQuiAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6663FasQuiAnc), 3, 0));
      A6664FasQuiGrm = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6664FasQuiGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6664FasQuiGrm), 4, 0));
      A9722FasQuiVel = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9722FasQuiVel", GXutil.ltrimstr( A9722FasQuiVel, 5, 1));
      A11506FasQuiAv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11506FasQuiAv", A11506FasQuiAv);
      A12124FasQuiAs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12124FasQuiAs", A12124FasQuiAs);
      A12125FasQuiAI = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12125FasQuiAI", A12125FasQuiAI);
      A6665FasQuiObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6665FasQuiObs", A6665FasQuiObs);
      Z5373FasQuiNp = (short)(0) ;
      Z5374FasQuiTp = (short)(0) ;
      Z5375FasQuiRb = (short)(0) ;
      Z6599FasMaqPl = "" ;
      Z6600FasFecPl = GXutil.nullDate() ;
      Z6601FasOrdPl = (byte)(0) ;
      Z6602FasStPl = (byte)(0) ;
      Z6663FasQuiAnc = (short)(0) ;
      Z6664FasQuiGrm = (short)(0) ;
      Z9722FasQuiVel = DecimalUtil.ZERO ;
      Z11506FasQuiAv = "" ;
      Z12124FasQuiAs = "" ;
      Z12125FasQuiAI = "" ;
      Z6665FasQuiObs = "" ;
      Z764ProForCod = "" ;
   }

   public void initAllU4779( )
   {
      A5371FasQuiLin = (short)(0) ;
      initializeNonKeyU4779( ) ;
   }

   public void standaloneModalInsertU4779( )
   {
      A5372FasQuiUl = i5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211662065", true, true);
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
      httpContext.AddJavascriptSource("thdfpq.js", "?20268211662066", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties779( )
   {
      edtFasQuiLin_Enabled = defedtFasQuiLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiLin_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void startgridcontrol41( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtFasQuiLin_Internalname = "FASQUILIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_proforcod_Internalname = "COMBO_PROFORCOD" ;
      edtFasQuiUl_Internalname = "FASQUIUL" ;
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
      Combo_proforcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "TRATAMIENTO QUIMICO P/FASES", "") );
      edtProForCod_Jsonclick = "" ;
      edtFasQuiLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_proforcod_Titlecontrolidtoreplace = "" ;
      edtProForCod_Enabled = 1 ;
      edtFasQuiLin_Enabled = 0 ;
      edtFasQuiUl_Jsonclick = "" ;
      edtFasQuiUl_Enabled = 0 ;
      edtFasQuiUl_Visible = 1 ;
      Combo_proforcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_proforcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_proforcod_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_41779( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalU4779( ) ;
         standaloneModalU4779( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowU4779( ) ;
         nGXsfl_41_idx = (int)(nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_41779( ) ;
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

   public void valid_Proforcod( )
   {
      n5372FasQuiUl = false ;
      /* Using cursor T00U448 */
      pr_default.execute(46, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T00U448_A766ProForDsc[0] ;
      pr_default.close(46);
      O5372FasQuiUl = A5372FasQuiUl ;
      n5372FasQuiUl = false ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV40ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV41BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV37BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV38BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV39BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV40ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV41BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12U42',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_FASQUIUL","{handler:'valid_Fasquiul',iparms:[]");
      setEventMetadata("VALID_FASQUIUL",",oparms:[]}");
      setEventMetadata("VALID_FASQUILIN","{handler:'valid_Fasquilin',iparms:[]");
      setEventMetadata("VALID_FASQUILIN",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A5372FasQuiUl',fld:'FASQUIUL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]}");
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
      pr_default.close(46);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV36EmprCod = "" ;
      wcpOAV39BarCodPar = "" ;
      wcpOAV40ProCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      N457FasCod = "" ;
      Z6599FasMaqPl = "" ;
      Z6600FasFecPl = GXutil.nullDate() ;
      Z9722FasQuiVel = DecimalUtil.ZERO ;
      Z11506FasQuiAv = "" ;
      Z12124FasQuiAs = "" ;
      Z12125FasQuiAI = "" ;
      Z6665FasQuiObs = "" ;
      Z764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A764ProForCod = "" ;
      Gx_mode = "" ;
      AV36EmprCod = "" ;
      AV39BarCodPar = "" ;
      AV40ProCod = "" ;
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
      bttBtntrn_delete_Jsonclick = "" ;
      AV57Pgmname = "" ;
      ucCombo_proforcod = new com.genexus.webpanels.GXUserControl();
      Combo_proforcod_Caption = "" ;
      AV47ProForCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode779 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      AV45Insert_FasCod = "" ;
      A407EmprNom = "" ;
      A6599FasMaqPl = "" ;
      A6600FasFecPl = GXutil.nullDate() ;
      A9722FasQuiVel = DecimalUtil.ZERO ;
      A11506FasQuiAv = "" ;
      A12124FasQuiAs = "" ;
      A12125FasQuiAI = "" ;
      A6665FasQuiObs = "" ;
      A766ProForDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_proforcod_Objectcall = "" ;
      Combo_proforcod_Class = "" ;
      Combo_proforcod_Icontype = "" ;
      Combo_proforcod_Icon = "" ;
      Combo_proforcod_Tooltip = "" ;
      Combo_proforcod_Selectedvalue_set = "" ;
      Combo_proforcod_Selectedvalue_get = "" ;
      Combo_proforcod_Selectedtext_set = "" ;
      Combo_proforcod_Selectedtext_get = "" ;
      Combo_proforcod_Gamoauthtoken = "" ;
      Combo_proforcod_Ddointernalname = "" ;
      Combo_proforcod_Titlecontrolalign = "" ;
      Combo_proforcod_Dropdownoptionstype = "" ;
      Combo_proforcod_Datalisttype = "" ;
      Combo_proforcod_Datalistfixedvalues = "" ;
      Combo_proforcod_Datalistproc = "" ;
      Combo_proforcod_Datalistprocparametersprefix = "" ;
      Combo_proforcod_Remoteservicesparameters = "" ;
      Combo_proforcod_Htmltemplate = "" ;
      Combo_proforcod_Multiplevaluestype = "" ;
      Combo_proforcod_Loadingdata = "" ;
      Combo_proforcod_Noresultsfound = "" ;
      Combo_proforcod_Emptyitemtext = "" ;
      Combo_proforcod_Onlyselectedvalues = "" ;
      Combo_proforcod_Selectalltext = "" ;
      Combo_proforcod_Multiplevaluesseparator = "" ;
      Combo_proforcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode15 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      AV42WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV44WebSession = httpContext.getWebSession();
      AV46TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV49ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z460FasDsc = "" ;
      Z759ProDsc = "" ;
      T00U47_A407EmprNom = new String[] {""} ;
      T00U47_n407EmprNom = new boolean[] {false} ;
      T00U48_A759ProDsc = new String[] {""} ;
      T00U49_A396EmprCod = new String[] {""} ;
      T00U410_A460FasDsc = new String[] {""} ;
      T00U411_A194BarOrdLin = new short[1] ;
      T00U411_A407EmprNom = new String[] {""} ;
      T00U411_n407EmprNom = new boolean[] {false} ;
      T00U411_A759ProDsc = new String[] {""} ;
      T00U411_A460FasDsc = new String[] {""} ;
      T00U411_A5372FasQuiUl = new short[1] ;
      T00U411_n5372FasQuiUl = new boolean[] {false} ;
      T00U411_A396EmprCod = new String[] {""} ;
      T00U411_A129BarCod = new int[1] ;
      T00U411_A132BarCodReo = new byte[1] ;
      T00U411_A130BarCodPar = new String[] {""} ;
      T00U411_A758ProCod = new String[] {""} ;
      T00U411_A457FasCod = new String[] {""} ;
      T00U412_A460FasDsc = new String[] {""} ;
      T00U413_A396EmprCod = new String[] {""} ;
      T00U413_A129BarCod = new int[1] ;
      T00U413_A132BarCodReo = new byte[1] ;
      T00U413_A130BarCodPar = new String[] {""} ;
      T00U413_A758ProCod = new String[] {""} ;
      T00U413_A194BarOrdLin = new short[1] ;
      T00U46_A194BarOrdLin = new short[1] ;
      T00U46_A5372FasQuiUl = new short[1] ;
      T00U46_n5372FasQuiUl = new boolean[] {false} ;
      T00U46_A396EmprCod = new String[] {""} ;
      T00U46_A129BarCod = new int[1] ;
      T00U46_A132BarCodReo = new byte[1] ;
      T00U46_A130BarCodPar = new String[] {""} ;
      T00U46_A758ProCod = new String[] {""} ;
      T00U46_A457FasCod = new String[] {""} ;
      T00U414_A396EmprCod = new String[] {""} ;
      T00U414_A129BarCod = new int[1] ;
      T00U414_A132BarCodReo = new byte[1] ;
      T00U414_A130BarCodPar = new String[] {""} ;
      T00U414_A758ProCod = new String[] {""} ;
      T00U414_A194BarOrdLin = new short[1] ;
      T00U415_A396EmprCod = new String[] {""} ;
      T00U415_A129BarCod = new int[1] ;
      T00U415_A132BarCodReo = new byte[1] ;
      T00U415_A130BarCodPar = new String[] {""} ;
      T00U415_A758ProCod = new String[] {""} ;
      T00U415_A194BarOrdLin = new short[1] ;
      T00U45_A194BarOrdLin = new short[1] ;
      T00U45_A5372FasQuiUl = new short[1] ;
      T00U45_n5372FasQuiUl = new boolean[] {false} ;
      T00U45_A396EmprCod = new String[] {""} ;
      T00U45_A129BarCod = new int[1] ;
      T00U45_A132BarCodReo = new byte[1] ;
      T00U45_A130BarCodPar = new String[] {""} ;
      T00U45_A758ProCod = new String[] {""} ;
      T00U45_A457FasCod = new String[] {""} ;
      T00U419_A460FasDsc = new String[] {""} ;
      T00U420_A396EmprCod = new String[] {""} ;
      T00U420_A129BarCod = new int[1] ;
      T00U420_A132BarCodReo = new byte[1] ;
      T00U420_A130BarCodPar = new String[] {""} ;
      T00U420_A758ProCod = new String[] {""} ;
      T00U420_A194BarOrdLin = new short[1] ;
      T00U420_A12517SolAfLn = new short[1] ;
      T00U421_A396EmprCod = new String[] {""} ;
      T00U421_A129BarCod = new int[1] ;
      T00U421_A132BarCodReo = new byte[1] ;
      T00U421_A130BarCodPar = new String[] {""} ;
      T00U421_A758ProCod = new String[] {""} ;
      T00U421_A194BarOrdLin = new short[1] ;
      T00U421_A12516SolLzLn = new short[1] ;
      T00U422_A396EmprCod = new String[] {""} ;
      T00U422_A129BarCod = new int[1] ;
      T00U422_A132BarCodReo = new byte[1] ;
      T00U422_A130BarCodPar = new String[] {""} ;
      T00U422_A758ProCod = new String[] {""} ;
      T00U422_A194BarOrdLin = new short[1] ;
      T00U422_A12515SolPlLn = new short[1] ;
      T00U423_A396EmprCod = new String[] {""} ;
      T00U423_A129BarCod = new int[1] ;
      T00U423_A132BarCodReo = new byte[1] ;
      T00U423_A130BarCodPar = new String[] {""} ;
      T00U423_A758ProCod = new String[] {""} ;
      T00U423_A194BarOrdLin = new short[1] ;
      T00U423_A12514SolSAlLn = new short[1] ;
      T00U424_A396EmprCod = new String[] {""} ;
      T00U424_A129BarCod = new int[1] ;
      T00U424_A132BarCodReo = new byte[1] ;
      T00U424_A130BarCodPar = new String[] {""} ;
      T00U424_A758ProCod = new String[] {""} ;
      T00U424_A194BarOrdLin = new short[1] ;
      T00U424_A12513SolSAcLn = new short[1] ;
      T00U425_A396EmprCod = new String[] {""} ;
      T00U425_A129BarCod = new int[1] ;
      T00U425_A132BarCodReo = new byte[1] ;
      T00U425_A130BarCodPar = new String[] {""} ;
      T00U425_A758ProCod = new String[] {""} ;
      T00U425_A194BarOrdLin = new short[1] ;
      T00U425_A12512SolFrLn = new short[1] ;
      T00U426_A396EmprCod = new String[] {""} ;
      T00U426_A129BarCod = new int[1] ;
      T00U426_A132BarCodReo = new byte[1] ;
      T00U426_A130BarCodPar = new String[] {""} ;
      T00U426_A758ProCod = new String[] {""} ;
      T00U426_A194BarOrdLin = new short[1] ;
      T00U426_A12511SolAgLn = new short[1] ;
      T00U427_A396EmprCod = new String[] {""} ;
      T00U427_A129BarCod = new int[1] ;
      T00U427_A132BarCodReo = new byte[1] ;
      T00U427_A130BarCodPar = new String[] {""} ;
      T00U427_A758ProCod = new String[] {""} ;
      T00U427_A194BarOrdLin = new short[1] ;
      T00U427_A12510SolLvLn = new short[1] ;
      T00U428_A396EmprCod = new String[] {""} ;
      T00U428_A129BarCod = new int[1] ;
      T00U428_A132BarCodReo = new byte[1] ;
      T00U428_A130BarCodPar = new String[] {""} ;
      T00U428_A758ProCod = new String[] {""} ;
      T00U428_A194BarOrdLin = new short[1] ;
      T00U428_A10781BarFasNb = new int[1] ;
      T00U429_A396EmprCod = new String[] {""} ;
      T00U429_A129BarCod = new int[1] ;
      T00U429_A132BarCodReo = new byte[1] ;
      T00U429_A130BarCodPar = new String[] {""} ;
      T00U429_A758ProCod = new String[] {""} ;
      T00U429_A194BarOrdLin = new short[1] ;
      T00U429_A719PrdNum = new String[] {""} ;
      T00U430_A396EmprCod = new String[] {""} ;
      T00U430_A129BarCod = new int[1] ;
      T00U430_A132BarCodReo = new byte[1] ;
      T00U430_A130BarCodPar = new String[] {""} ;
      T00U430_A758ProCod = new String[] {""} ;
      T00U430_A194BarOrdLin = new short[1] ;
      T00U430_A9966Em_cod = new String[] {""} ;
      T00U431_A396EmprCod = new String[] {""} ;
      T00U431_A129BarCod = new int[1] ;
      T00U431_A132BarCodReo = new byte[1] ;
      T00U431_A130BarCodPar = new String[] {""} ;
      T00U431_A758ProCod = new String[] {""} ;
      T00U431_A194BarOrdLin = new short[1] ;
      T00U431_A9940Ab_cod = new String[] {""} ;
      T00U432_A396EmprCod = new String[] {""} ;
      T00U432_A129BarCod = new int[1] ;
      T00U432_A132BarCodReo = new byte[1] ;
      T00U432_A130BarCodPar = new String[] {""} ;
      T00U432_A758ProCod = new String[] {""} ;
      T00U432_A194BarOrdLin = new short[1] ;
      T00U432_A9911Ca_cod = new String[] {""} ;
      T00U433_A396EmprCod = new String[] {""} ;
      T00U433_A129BarCod = new int[1] ;
      T00U433_A132BarCodReo = new byte[1] ;
      T00U433_A130BarCodPar = new String[] {""} ;
      T00U433_A758ProCod = new String[] {""} ;
      T00U433_A194BarOrdLin = new short[1] ;
      T00U433_A9878Pe_cod = new String[] {""} ;
      T00U434_A396EmprCod = new String[] {""} ;
      T00U434_A129BarCod = new int[1] ;
      T00U434_A132BarCodReo = new byte[1] ;
      T00U434_A130BarCodPar = new String[] {""} ;
      T00U434_A758ProCod = new String[] {""} ;
      T00U434_A194BarOrdLin = new short[1] ;
      T00U434_A9870Rm_cod = new String[] {""} ;
      T00U435_A396EmprCod = new String[] {""} ;
      T00U435_A129BarCod = new int[1] ;
      T00U435_A132BarCodReo = new byte[1] ;
      T00U435_A130BarCodPar = new String[] {""} ;
      T00U435_A758ProCod = new String[] {""} ;
      T00U435_A194BarOrdLin = new short[1] ;
      T00U435_A7934Dtb_Ordl = new short[1] ;
      T00U436_A396EmprCod = new String[] {""} ;
      T00U436_A129BarCod = new int[1] ;
      T00U436_A132BarCodReo = new byte[1] ;
      T00U436_A130BarCodPar = new String[] {""} ;
      T00U436_A758ProCod = new String[] {""} ;
      T00U436_A194BarOrdLin = new short[1] ;
      T00U436_A4940A_Barcod = new int[1] ;
      T00U436_A4941A_BarReo = new byte[1] ;
      T00U436_A4942A_BarPar = new String[] {""} ;
      T00U436_A4943A_ProCod = new String[] {""} ;
      T00U436_A4944A_BarOrd = new short[1] ;
      T00U437_A396EmprCod = new String[] {""} ;
      T00U437_A129BarCod = new int[1] ;
      T00U437_A132BarCodReo = new byte[1] ;
      T00U437_A130BarCodPar = new String[] {""} ;
      T00U437_A758ProCod = new String[] {""} ;
      T00U437_A194BarOrdLin = new short[1] ;
      T00U437_A4643BarFasLot = new int[1] ;
      T00U438_A396EmprCod = new String[] {""} ;
      T00U438_A129BarCod = new int[1] ;
      T00U438_A132BarCodReo = new byte[1] ;
      T00U438_A130BarCodPar = new String[] {""} ;
      T00U438_A758ProCod = new String[] {""} ;
      T00U438_A194BarOrdLin = new short[1] ;
      T00U438_A4031CCTCod = new int[1] ;
      T00U439_A396EmprCod = new String[] {""} ;
      T00U439_A129BarCod = new int[1] ;
      T00U439_A132BarCodReo = new byte[1] ;
      T00U439_A130BarCodPar = new String[] {""} ;
      T00U439_A758ProCod = new String[] {""} ;
      T00U439_A194BarOrdLin = new short[1] ;
      T00U439_A1664ParFasCod = new short[1] ;
      T00U441_A396EmprCod = new String[] {""} ;
      T00U441_A129BarCod = new int[1] ;
      T00U441_A132BarCodReo = new byte[1] ;
      T00U441_A130BarCodPar = new String[] {""} ;
      T00U441_A758ProCod = new String[] {""} ;
      T00U441_A194BarOrdLin = new short[1] ;
      Z766ProForDsc = "" ;
      T00U442_A129BarCod = new int[1] ;
      T00U442_A132BarCodReo = new byte[1] ;
      T00U442_A130BarCodPar = new String[] {""} ;
      T00U442_A194BarOrdLin = new short[1] ;
      T00U442_A5371FasQuiLin = new short[1] ;
      T00U442_A766ProForDsc = new String[] {""} ;
      T00U442_A5373FasQuiNp = new short[1] ;
      T00U442_A5374FasQuiTp = new short[1] ;
      T00U442_A5375FasQuiRb = new short[1] ;
      T00U442_A6599FasMaqPl = new String[] {""} ;
      T00U442_A6600FasFecPl = new java.util.Date[] {GXutil.nullDate()} ;
      T00U442_A6601FasOrdPl = new byte[1] ;
      T00U442_A6602FasStPl = new byte[1] ;
      T00U442_A6663FasQuiAnc = new short[1] ;
      T00U442_A6664FasQuiGrm = new short[1] ;
      T00U442_A9722FasQuiVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U442_A11506FasQuiAv = new String[] {""} ;
      T00U442_A12124FasQuiAs = new String[] {""} ;
      T00U442_A12125FasQuiAI = new String[] {""} ;
      T00U442_A6665FasQuiObs = new String[] {""} ;
      T00U442_A396EmprCod = new String[] {""} ;
      T00U442_A764ProForCod = new String[] {""} ;
      T00U442_A758ProCod = new String[] {""} ;
      T00U44_A766ProForDsc = new String[] {""} ;
      GXCCtl = "" ;
      T00U443_A766ProForDsc = new String[] {""} ;
      T00U444_A396EmprCod = new String[] {""} ;
      T00U444_A129BarCod = new int[1] ;
      T00U444_A132BarCodReo = new byte[1] ;
      T00U444_A130BarCodPar = new String[] {""} ;
      T00U444_A758ProCod = new String[] {""} ;
      T00U444_A194BarOrdLin = new short[1] ;
      T00U444_A5371FasQuiLin = new short[1] ;
      T00U43_A129BarCod = new int[1] ;
      T00U43_A132BarCodReo = new byte[1] ;
      T00U43_A130BarCodPar = new String[] {""} ;
      T00U43_A194BarOrdLin = new short[1] ;
      T00U43_A5371FasQuiLin = new short[1] ;
      T00U43_A5373FasQuiNp = new short[1] ;
      T00U43_A5374FasQuiTp = new short[1] ;
      T00U43_A5375FasQuiRb = new short[1] ;
      T00U43_A6599FasMaqPl = new String[] {""} ;
      T00U43_A6600FasFecPl = new java.util.Date[] {GXutil.nullDate()} ;
      T00U43_A6601FasOrdPl = new byte[1] ;
      T00U43_A6602FasStPl = new byte[1] ;
      T00U43_A6663FasQuiAnc = new short[1] ;
      T00U43_A6664FasQuiGrm = new short[1] ;
      T00U43_A9722FasQuiVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U43_A11506FasQuiAv = new String[] {""} ;
      T00U43_A12124FasQuiAs = new String[] {""} ;
      T00U43_A12125FasQuiAI = new String[] {""} ;
      T00U43_A6665FasQuiObs = new String[] {""} ;
      T00U43_A396EmprCod = new String[] {""} ;
      T00U43_A764ProForCod = new String[] {""} ;
      T00U43_A758ProCod = new String[] {""} ;
      T00U42_A129BarCod = new int[1] ;
      T00U42_A132BarCodReo = new byte[1] ;
      T00U42_A130BarCodPar = new String[] {""} ;
      T00U42_A194BarOrdLin = new short[1] ;
      T00U42_A5371FasQuiLin = new short[1] ;
      T00U42_A5373FasQuiNp = new short[1] ;
      T00U42_A5374FasQuiTp = new short[1] ;
      T00U42_A5375FasQuiRb = new short[1] ;
      T00U42_A6599FasMaqPl = new String[] {""} ;
      T00U42_A6600FasFecPl = new java.util.Date[] {GXutil.nullDate()} ;
      T00U42_A6601FasOrdPl = new byte[1] ;
      T00U42_A6602FasStPl = new byte[1] ;
      T00U42_A6663FasQuiAnc = new short[1] ;
      T00U42_A6664FasQuiGrm = new short[1] ;
      T00U42_A9722FasQuiVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00U42_A11506FasQuiAv = new String[] {""} ;
      T00U42_A12124FasQuiAs = new String[] {""} ;
      T00U42_A12125FasQuiAI = new String[] {""} ;
      T00U42_A6665FasQuiObs = new String[] {""} ;
      T00U42_A396EmprCod = new String[] {""} ;
      T00U42_A764ProForCod = new String[] {""} ;
      T00U42_A758ProCod = new String[] {""} ;
      T00U448_A766ProForDsc = new String[] {""} ;
      T00U449_A396EmprCod = new String[] {""} ;
      T00U449_A129BarCod = new int[1] ;
      T00U449_A132BarCodReo = new byte[1] ;
      T00U449_A130BarCodPar = new String[] {""} ;
      T00U449_A758ProCod = new String[] {""} ;
      T00U449_A194BarOrdLin = new short[1] ;
      T00U449_A5371FasQuiLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thdfpq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thdfpq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thdfpq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thdfpq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thdfpq__default(),
         new Object[] {
             new Object[] {
            T00U42_A129BarCod, T00U42_A132BarCodReo, T00U42_A130BarCodPar, T00U42_A194BarOrdLin, T00U42_A5371FasQuiLin, T00U42_A5373FasQuiNp, T00U42_A5374FasQuiTp, T00U42_A5375FasQuiRb, T00U42_A6599FasMaqPl, T00U42_A6600FasFecPl,
            T00U42_A6601FasOrdPl, T00U42_A6602FasStPl, T00U42_A6663FasQuiAnc, T00U42_A6664FasQuiGrm, T00U42_A9722FasQuiVel, T00U42_A11506FasQuiAv, T00U42_A12124FasQuiAs, T00U42_A12125FasQuiAI, T00U42_A6665FasQuiObs, T00U42_A396EmprCod,
            T00U42_A764ProForCod, T00U42_A758ProCod
            }
            , new Object[] {
            T00U43_A129BarCod, T00U43_A132BarCodReo, T00U43_A130BarCodPar, T00U43_A194BarOrdLin, T00U43_A5371FasQuiLin, T00U43_A5373FasQuiNp, T00U43_A5374FasQuiTp, T00U43_A5375FasQuiRb, T00U43_A6599FasMaqPl, T00U43_A6600FasFecPl,
            T00U43_A6601FasOrdPl, T00U43_A6602FasStPl, T00U43_A6663FasQuiAnc, T00U43_A6664FasQuiGrm, T00U43_A9722FasQuiVel, T00U43_A11506FasQuiAv, T00U43_A12124FasQuiAs, T00U43_A12125FasQuiAI, T00U43_A6665FasQuiObs, T00U43_A396EmprCod,
            T00U43_A764ProForCod, T00U43_A758ProCod
            }
            , new Object[] {
            T00U44_A766ProForDsc
            }
            , new Object[] {
            T00U45_A194BarOrdLin, T00U45_A5372FasQuiUl, T00U45_n5372FasQuiUl, T00U45_A396EmprCod, T00U45_A129BarCod, T00U45_A132BarCodReo, T00U45_A130BarCodPar, T00U45_A758ProCod, T00U45_A457FasCod
            }
            , new Object[] {
            T00U46_A194BarOrdLin, T00U46_A5372FasQuiUl, T00U46_n5372FasQuiUl, T00U46_A396EmprCod, T00U46_A129BarCod, T00U46_A132BarCodReo, T00U46_A130BarCodPar, T00U46_A758ProCod, T00U46_A457FasCod
            }
            , new Object[] {
            T00U47_A407EmprNom, T00U47_n407EmprNom
            }
            , new Object[] {
            T00U48_A759ProDsc
            }
            , new Object[] {
            T00U49_A396EmprCod
            }
            , new Object[] {
            T00U410_A460FasDsc
            }
            , new Object[] {
            T00U411_A194BarOrdLin, T00U411_A407EmprNom, T00U411_n407EmprNom, T00U411_A759ProDsc, T00U411_A460FasDsc, T00U411_A5372FasQuiUl, T00U411_n5372FasQuiUl, T00U411_A396EmprCod, T00U411_A129BarCod, T00U411_A132BarCodReo,
            T00U411_A130BarCodPar, T00U411_A758ProCod, T00U411_A457FasCod
            }
            , new Object[] {
            T00U412_A460FasDsc
            }
            , new Object[] {
            T00U413_A396EmprCod, T00U413_A129BarCod, T00U413_A132BarCodReo, T00U413_A130BarCodPar, T00U413_A758ProCod, T00U413_A194BarOrdLin
            }
            , new Object[] {
            T00U414_A396EmprCod, T00U414_A129BarCod, T00U414_A132BarCodReo, T00U414_A130BarCodPar, T00U414_A758ProCod, T00U414_A194BarOrdLin
            }
            , new Object[] {
            T00U415_A396EmprCod, T00U415_A129BarCod, T00U415_A132BarCodReo, T00U415_A130BarCodPar, T00U415_A758ProCod, T00U415_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00U419_A460FasDsc
            }
            , new Object[] {
            T00U420_A396EmprCod, T00U420_A129BarCod, T00U420_A132BarCodReo, T00U420_A130BarCodPar, T00U420_A758ProCod, T00U420_A194BarOrdLin, T00U420_A12517SolAfLn
            }
            , new Object[] {
            T00U421_A396EmprCod, T00U421_A129BarCod, T00U421_A132BarCodReo, T00U421_A130BarCodPar, T00U421_A758ProCod, T00U421_A194BarOrdLin, T00U421_A12516SolLzLn
            }
            , new Object[] {
            T00U422_A396EmprCod, T00U422_A129BarCod, T00U422_A132BarCodReo, T00U422_A130BarCodPar, T00U422_A758ProCod, T00U422_A194BarOrdLin, T00U422_A12515SolPlLn
            }
            , new Object[] {
            T00U423_A396EmprCod, T00U423_A129BarCod, T00U423_A132BarCodReo, T00U423_A130BarCodPar, T00U423_A758ProCod, T00U423_A194BarOrdLin, T00U423_A12514SolSAlLn
            }
            , new Object[] {
            T00U424_A396EmprCod, T00U424_A129BarCod, T00U424_A132BarCodReo, T00U424_A130BarCodPar, T00U424_A758ProCod, T00U424_A194BarOrdLin, T00U424_A12513SolSAcLn
            }
            , new Object[] {
            T00U425_A396EmprCod, T00U425_A129BarCod, T00U425_A132BarCodReo, T00U425_A130BarCodPar, T00U425_A758ProCod, T00U425_A194BarOrdLin, T00U425_A12512SolFrLn
            }
            , new Object[] {
            T00U426_A396EmprCod, T00U426_A129BarCod, T00U426_A132BarCodReo, T00U426_A130BarCodPar, T00U426_A758ProCod, T00U426_A194BarOrdLin, T00U426_A12511SolAgLn
            }
            , new Object[] {
            T00U427_A396EmprCod, T00U427_A129BarCod, T00U427_A132BarCodReo, T00U427_A130BarCodPar, T00U427_A758ProCod, T00U427_A194BarOrdLin, T00U427_A12510SolLvLn
            }
            , new Object[] {
            T00U428_A396EmprCod, T00U428_A129BarCod, T00U428_A132BarCodReo, T00U428_A130BarCodPar, T00U428_A758ProCod, T00U428_A194BarOrdLin, T00U428_A10781BarFasNb
            }
            , new Object[] {
            T00U429_A396EmprCod, T00U429_A129BarCod, T00U429_A132BarCodReo, T00U429_A130BarCodPar, T00U429_A758ProCod, T00U429_A194BarOrdLin, T00U429_A719PrdNum
            }
            , new Object[] {
            T00U430_A396EmprCod, T00U430_A129BarCod, T00U430_A132BarCodReo, T00U430_A130BarCodPar, T00U430_A758ProCod, T00U430_A194BarOrdLin, T00U430_A9966Em_cod
            }
            , new Object[] {
            T00U431_A396EmprCod, T00U431_A129BarCod, T00U431_A132BarCodReo, T00U431_A130BarCodPar, T00U431_A758ProCod, T00U431_A194BarOrdLin, T00U431_A9940Ab_cod
            }
            , new Object[] {
            T00U432_A396EmprCod, T00U432_A129BarCod, T00U432_A132BarCodReo, T00U432_A130BarCodPar, T00U432_A758ProCod, T00U432_A194BarOrdLin, T00U432_A9911Ca_cod
            }
            , new Object[] {
            T00U433_A396EmprCod, T00U433_A129BarCod, T00U433_A132BarCodReo, T00U433_A130BarCodPar, T00U433_A758ProCod, T00U433_A194BarOrdLin, T00U433_A9878Pe_cod
            }
            , new Object[] {
            T00U434_A396EmprCod, T00U434_A129BarCod, T00U434_A132BarCodReo, T00U434_A130BarCodPar, T00U434_A758ProCod, T00U434_A194BarOrdLin, T00U434_A9870Rm_cod
            }
            , new Object[] {
            T00U435_A396EmprCod, T00U435_A129BarCod, T00U435_A132BarCodReo, T00U435_A130BarCodPar, T00U435_A758ProCod, T00U435_A194BarOrdLin, T00U435_A7934Dtb_Ordl
            }
            , new Object[] {
            T00U436_A396EmprCod, T00U436_A129BarCod, T00U436_A132BarCodReo, T00U436_A130BarCodPar, T00U436_A758ProCod, T00U436_A194BarOrdLin, T00U436_A4940A_Barcod, T00U436_A4941A_BarReo, T00U436_A4942A_BarPar, T00U436_A4943A_ProCod,
            T00U436_A4944A_BarOrd
            }
            , new Object[] {
            T00U437_A396EmprCod, T00U437_A129BarCod, T00U437_A132BarCodReo, T00U437_A130BarCodPar, T00U437_A758ProCod, T00U437_A194BarOrdLin, T00U437_A4643BarFasLot
            }
            , new Object[] {
            T00U438_A396EmprCod, T00U438_A129BarCod, T00U438_A132BarCodReo, T00U438_A130BarCodPar, T00U438_A758ProCod, T00U438_A194BarOrdLin, T00U438_A4031CCTCod
            }
            , new Object[] {
            T00U439_A396EmprCod, T00U439_A129BarCod, T00U439_A132BarCodReo, T00U439_A130BarCodPar, T00U439_A758ProCod, T00U439_A194BarOrdLin, T00U439_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T00U441_A396EmprCod, T00U441_A129BarCod, T00U441_A132BarCodReo, T00U441_A130BarCodPar, T00U441_A758ProCod, T00U441_A194BarOrdLin
            }
            , new Object[] {
            T00U442_A129BarCod, T00U442_A132BarCodReo, T00U442_A130BarCodPar, T00U442_A194BarOrdLin, T00U442_A5371FasQuiLin, T00U442_A766ProForDsc, T00U442_A5373FasQuiNp, T00U442_A5374FasQuiTp, T00U442_A5375FasQuiRb, T00U442_A6599FasMaqPl,
            T00U442_A6600FasFecPl, T00U442_A6601FasOrdPl, T00U442_A6602FasStPl, T00U442_A6663FasQuiAnc, T00U442_A6664FasQuiGrm, T00U442_A9722FasQuiVel, T00U442_A11506FasQuiAv, T00U442_A12124FasQuiAs, T00U442_A12125FasQuiAI, T00U442_A6665FasQuiObs,
            T00U442_A396EmprCod, T00U442_A764ProForCod, T00U442_A758ProCod
            }
            , new Object[] {
            T00U443_A766ProForDsc
            }
            , new Object[] {
            T00U444_A396EmprCod, T00U444_A129BarCod, T00U444_A132BarCodReo, T00U444_A130BarCodPar, T00U444_A758ProCod, T00U444_A194BarOrdLin, T00U444_A5371FasQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00U448_A766ProForDsc
            }
            , new Object[] {
            T00U449_A396EmprCod, T00U449_A129BarCod, T00U449_A132BarCodReo, T00U449_A130BarCodPar, T00U449_A758ProCod, T00U449_A194BarOrdLin, T00U449_A5371FasQuiLin
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV57Pgmname = "THDFPQ" ;
   }

   private byte wcpOAV38BarCodReo ;
   private byte Z132BarCodReo ;
   private byte Z6601FasOrdPl ;
   private byte Z6602FasStPl ;
   private byte GxWebError ;
   private byte AV38BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A132BarCodReo ;
   private byte A6601FasOrdPl ;
   private byte A6602FasStPl ;
   private byte GXv_int7[] ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short wcpOAV41BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z5372FasQuiUl ;
   private short O5372FasQuiUl ;
   private short Z5371FasQuiLin ;
   private short Z5373FasQuiNp ;
   private short Z5374FasQuiTp ;
   private short Z5375FasQuiRb ;
   private short Z6663FasQuiAnc ;
   private short Z6664FasQuiGrm ;
   private short nRcdDeleted_779 ;
   private short nRcdExists_779 ;
   private short nIsMod_779 ;
   private short AV41BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5372FasQuiUl ;
   private short A194BarOrdLin ;
   private short nBlankRcdCount779 ;
   private short RcdFound779 ;
   private short B5372FasQuiUl ;
   private short nBlankRcdUsr779 ;
   private short A5373FasQuiNp ;
   private short A5374FasQuiTp ;
   private short A5375FasQuiRb ;
   private short A6663FasQuiAnc ;
   private short A6664FasQuiGrm ;
   private short RcdFound15 ;
   private short s5372FasQuiUl ;
   private short A5371FasQuiLin ;
   private short GXv_int8[] ;
   private short nIsDirty_15 ;
   private short nIsDirty_779 ;
   private short i5372FasQuiUl ;
   private int wcpOAV37BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int AV37BarCod ;
   private int trnEnded ;
   private int edtBarNHdr_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtFasDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtFasQuiUl_Enabled ;
   private int edtFasQuiUl_Visible ;
   private int edtFasQuiLin_Enabled ;
   private int edtProForCod_Enabled ;
   private int fRowAdded ;
   private int A129BarCod ;
   private int Combo_proforcod_Datalistupdateminimumcharacters ;
   private int AV58GXV1 ;
   private int GXv_int6[] ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtFasQuiLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9722FasQuiVel ;
   private java.math.BigDecimal A9722FasQuiVel ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV36EmprCod ;
   private String wcpOAV39BarCodPar ;
   private String wcpOAV40ProCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String N457FasCod ;
   private String Z6599FasMaqPl ;
   private String Z11506FasQuiAv ;
   private String Z12124FasQuiAs ;
   private String Z12125FasQuiAI ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A764ProForCod ;
   private String Gx_mode ;
   private String AV36EmprCod ;
   private String AV39BarCodPar ;
   private String AV40ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_41_idx="0001" ;
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
   private String divUnnamedtable1_Internalname ;
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
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV57Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_proforcod_Caption ;
   private String Combo_proforcod_Cls ;
   private String Combo_proforcod_Internalname ;
   private String edtFasQuiUl_Internalname ;
   private String edtFasQuiUl_Jsonclick ;
   private String sMode779 ;
   private String edtFasQuiLin_Internalname ;
   private String edtProForCod_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV45Insert_FasCod ;
   private String A407EmprNom ;
   private String A6599FasMaqPl ;
   private String A11506FasQuiAv ;
   private String A12124FasQuiAs ;
   private String A12125FasQuiAI ;
   private String A766ProForDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_proforcod_Objectcall ;
   private String Combo_proforcod_Class ;
   private String Combo_proforcod_Icontype ;
   private String Combo_proforcod_Icon ;
   private String Combo_proforcod_Tooltip ;
   private String Combo_proforcod_Selectedvalue_set ;
   private String Combo_proforcod_Selectedvalue_get ;
   private String Combo_proforcod_Selectedtext_set ;
   private String Combo_proforcod_Selectedtext_get ;
   private String Combo_proforcod_Gamoauthtoken ;
   private String Combo_proforcod_Ddointernalname ;
   private String Combo_proforcod_Titlecontrolalign ;
   private String Combo_proforcod_Dropdownoptionstype ;
   private String Combo_proforcod_Titlecontrolidtoreplace ;
   private String Combo_proforcod_Datalisttype ;
   private String Combo_proforcod_Datalistfixedvalues ;
   private String Combo_proforcod_Datalistproc ;
   private String Combo_proforcod_Datalistprocparametersprefix ;
   private String Combo_proforcod_Remoteservicesparameters ;
   private String Combo_proforcod_Htmltemplate ;
   private String Combo_proforcod_Multiplevaluestype ;
   private String Combo_proforcod_Loadingdata ;
   private String Combo_proforcod_Noresultsfound ;
   private String Combo_proforcod_Emptyitemtext ;
   private String Combo_proforcod_Onlyselectedvalues ;
   private String Combo_proforcod_Selectalltext ;
   private String Combo_proforcod_Multiplevaluesseparator ;
   private String Combo_proforcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode15 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String Z759ProDsc ;
   private String Z766ProForDsc ;
   private String GXCCtl ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtFasQuiLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private java.util.Date Z6600FasFecPl ;
   private java.util.Date A6600FasFecPl ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n5372FasQuiUl ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_proforcod_Isgriditem ;
   private boolean Combo_proforcod_Emptyitem ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_proforcod_Enabled ;
   private boolean Combo_proforcod_Visible ;
   private boolean Combo_proforcod_Allowmultipleselection ;
   private boolean Combo_proforcod_Hasdescription ;
   private boolean Combo_proforcod_Includeonlyselectedoption ;
   private boolean Combo_proforcod_Includeselectalloption ;
   private boolean Combo_proforcod_Includeaddnewoption ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z6665FasQuiObs ;
   private String A6665FasQuiObs ;
   private String AV49ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV44WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00U47_A407EmprNom ;
   private boolean[] T00U47_n407EmprNom ;
   private String[] T00U48_A759ProDsc ;
   private String[] T00U49_A396EmprCod ;
   private String[] T00U410_A460FasDsc ;
   private short[] T00U411_A194BarOrdLin ;
   private String[] T00U411_A407EmprNom ;
   private boolean[] T00U411_n407EmprNom ;
   private String[] T00U411_A759ProDsc ;
   private String[] T00U411_A460FasDsc ;
   private short[] T00U411_A5372FasQuiUl ;
   private boolean[] T00U411_n5372FasQuiUl ;
   private String[] T00U411_A396EmprCod ;
   private int[] T00U411_A129BarCod ;
   private byte[] T00U411_A132BarCodReo ;
   private String[] T00U411_A130BarCodPar ;
   private String[] T00U411_A758ProCod ;
   private String[] T00U411_A457FasCod ;
   private String[] T00U412_A460FasDsc ;
   private String[] T00U413_A396EmprCod ;
   private int[] T00U413_A129BarCod ;
   private byte[] T00U413_A132BarCodReo ;
   private String[] T00U413_A130BarCodPar ;
   private String[] T00U413_A758ProCod ;
   private short[] T00U413_A194BarOrdLin ;
   private short[] T00U46_A194BarOrdLin ;
   private short[] T00U46_A5372FasQuiUl ;
   private boolean[] T00U46_n5372FasQuiUl ;
   private String[] T00U46_A396EmprCod ;
   private int[] T00U46_A129BarCod ;
   private byte[] T00U46_A132BarCodReo ;
   private String[] T00U46_A130BarCodPar ;
   private String[] T00U46_A758ProCod ;
   private String[] T00U46_A457FasCod ;
   private String[] T00U414_A396EmprCod ;
   private int[] T00U414_A129BarCod ;
   private byte[] T00U414_A132BarCodReo ;
   private String[] T00U414_A130BarCodPar ;
   private String[] T00U414_A758ProCod ;
   private short[] T00U414_A194BarOrdLin ;
   private String[] T00U415_A396EmprCod ;
   private int[] T00U415_A129BarCod ;
   private byte[] T00U415_A132BarCodReo ;
   private String[] T00U415_A130BarCodPar ;
   private String[] T00U415_A758ProCod ;
   private short[] T00U415_A194BarOrdLin ;
   private short[] T00U45_A194BarOrdLin ;
   private short[] T00U45_A5372FasQuiUl ;
   private boolean[] T00U45_n5372FasQuiUl ;
   private String[] T00U45_A396EmprCod ;
   private int[] T00U45_A129BarCod ;
   private byte[] T00U45_A132BarCodReo ;
   private String[] T00U45_A130BarCodPar ;
   private String[] T00U45_A758ProCod ;
   private String[] T00U45_A457FasCod ;
   private String[] T00U419_A460FasDsc ;
   private String[] T00U420_A396EmprCod ;
   private int[] T00U420_A129BarCod ;
   private byte[] T00U420_A132BarCodReo ;
   private String[] T00U420_A130BarCodPar ;
   private String[] T00U420_A758ProCod ;
   private short[] T00U420_A194BarOrdLin ;
   private short[] T00U420_A12517SolAfLn ;
   private String[] T00U421_A396EmprCod ;
   private int[] T00U421_A129BarCod ;
   private byte[] T00U421_A132BarCodReo ;
   private String[] T00U421_A130BarCodPar ;
   private String[] T00U421_A758ProCod ;
   private short[] T00U421_A194BarOrdLin ;
   private short[] T00U421_A12516SolLzLn ;
   private String[] T00U422_A396EmprCod ;
   private int[] T00U422_A129BarCod ;
   private byte[] T00U422_A132BarCodReo ;
   private String[] T00U422_A130BarCodPar ;
   private String[] T00U422_A758ProCod ;
   private short[] T00U422_A194BarOrdLin ;
   private short[] T00U422_A12515SolPlLn ;
   private String[] T00U423_A396EmprCod ;
   private int[] T00U423_A129BarCod ;
   private byte[] T00U423_A132BarCodReo ;
   private String[] T00U423_A130BarCodPar ;
   private String[] T00U423_A758ProCod ;
   private short[] T00U423_A194BarOrdLin ;
   private short[] T00U423_A12514SolSAlLn ;
   private String[] T00U424_A396EmprCod ;
   private int[] T00U424_A129BarCod ;
   private byte[] T00U424_A132BarCodReo ;
   private String[] T00U424_A130BarCodPar ;
   private String[] T00U424_A758ProCod ;
   private short[] T00U424_A194BarOrdLin ;
   private short[] T00U424_A12513SolSAcLn ;
   private String[] T00U425_A396EmprCod ;
   private int[] T00U425_A129BarCod ;
   private byte[] T00U425_A132BarCodReo ;
   private String[] T00U425_A130BarCodPar ;
   private String[] T00U425_A758ProCod ;
   private short[] T00U425_A194BarOrdLin ;
   private short[] T00U425_A12512SolFrLn ;
   private String[] T00U426_A396EmprCod ;
   private int[] T00U426_A129BarCod ;
   private byte[] T00U426_A132BarCodReo ;
   private String[] T00U426_A130BarCodPar ;
   private String[] T00U426_A758ProCod ;
   private short[] T00U426_A194BarOrdLin ;
   private short[] T00U426_A12511SolAgLn ;
   private String[] T00U427_A396EmprCod ;
   private int[] T00U427_A129BarCod ;
   private byte[] T00U427_A132BarCodReo ;
   private String[] T00U427_A130BarCodPar ;
   private String[] T00U427_A758ProCod ;
   private short[] T00U427_A194BarOrdLin ;
   private short[] T00U427_A12510SolLvLn ;
   private String[] T00U428_A396EmprCod ;
   private int[] T00U428_A129BarCod ;
   private byte[] T00U428_A132BarCodReo ;
   private String[] T00U428_A130BarCodPar ;
   private String[] T00U428_A758ProCod ;
   private short[] T00U428_A194BarOrdLin ;
   private int[] T00U428_A10781BarFasNb ;
   private String[] T00U429_A396EmprCod ;
   private int[] T00U429_A129BarCod ;
   private byte[] T00U429_A132BarCodReo ;
   private String[] T00U429_A130BarCodPar ;
   private String[] T00U429_A758ProCod ;
   private short[] T00U429_A194BarOrdLin ;
   private String[] T00U429_A719PrdNum ;
   private String[] T00U430_A396EmprCod ;
   private int[] T00U430_A129BarCod ;
   private byte[] T00U430_A132BarCodReo ;
   private String[] T00U430_A130BarCodPar ;
   private String[] T00U430_A758ProCod ;
   private short[] T00U430_A194BarOrdLin ;
   private String[] T00U430_A9966Em_cod ;
   private String[] T00U431_A396EmprCod ;
   private int[] T00U431_A129BarCod ;
   private byte[] T00U431_A132BarCodReo ;
   private String[] T00U431_A130BarCodPar ;
   private String[] T00U431_A758ProCod ;
   private short[] T00U431_A194BarOrdLin ;
   private String[] T00U431_A9940Ab_cod ;
   private String[] T00U432_A396EmprCod ;
   private int[] T00U432_A129BarCod ;
   private byte[] T00U432_A132BarCodReo ;
   private String[] T00U432_A130BarCodPar ;
   private String[] T00U432_A758ProCod ;
   private short[] T00U432_A194BarOrdLin ;
   private String[] T00U432_A9911Ca_cod ;
   private String[] T00U433_A396EmprCod ;
   private int[] T00U433_A129BarCod ;
   private byte[] T00U433_A132BarCodReo ;
   private String[] T00U433_A130BarCodPar ;
   private String[] T00U433_A758ProCod ;
   private short[] T00U433_A194BarOrdLin ;
   private String[] T00U433_A9878Pe_cod ;
   private String[] T00U434_A396EmprCod ;
   private int[] T00U434_A129BarCod ;
   private byte[] T00U434_A132BarCodReo ;
   private String[] T00U434_A130BarCodPar ;
   private String[] T00U434_A758ProCod ;
   private short[] T00U434_A194BarOrdLin ;
   private String[] T00U434_A9870Rm_cod ;
   private String[] T00U435_A396EmprCod ;
   private int[] T00U435_A129BarCod ;
   private byte[] T00U435_A132BarCodReo ;
   private String[] T00U435_A130BarCodPar ;
   private String[] T00U435_A758ProCod ;
   private short[] T00U435_A194BarOrdLin ;
   private short[] T00U435_A7934Dtb_Ordl ;
   private String[] T00U436_A396EmprCod ;
   private int[] T00U436_A129BarCod ;
   private byte[] T00U436_A132BarCodReo ;
   private String[] T00U436_A130BarCodPar ;
   private String[] T00U436_A758ProCod ;
   private short[] T00U436_A194BarOrdLin ;
   private int[] T00U436_A4940A_Barcod ;
   private byte[] T00U436_A4941A_BarReo ;
   private String[] T00U436_A4942A_BarPar ;
   private String[] T00U436_A4943A_ProCod ;
   private short[] T00U436_A4944A_BarOrd ;
   private String[] T00U437_A396EmprCod ;
   private int[] T00U437_A129BarCod ;
   private byte[] T00U437_A132BarCodReo ;
   private String[] T00U437_A130BarCodPar ;
   private String[] T00U437_A758ProCod ;
   private short[] T00U437_A194BarOrdLin ;
   private int[] T00U437_A4643BarFasLot ;
   private String[] T00U438_A396EmprCod ;
   private int[] T00U438_A129BarCod ;
   private byte[] T00U438_A132BarCodReo ;
   private String[] T00U438_A130BarCodPar ;
   private String[] T00U438_A758ProCod ;
   private short[] T00U438_A194BarOrdLin ;
   private int[] T00U438_A4031CCTCod ;
   private String[] T00U439_A396EmprCod ;
   private int[] T00U439_A129BarCod ;
   private byte[] T00U439_A132BarCodReo ;
   private String[] T00U439_A130BarCodPar ;
   private String[] T00U439_A758ProCod ;
   private short[] T00U439_A194BarOrdLin ;
   private short[] T00U439_A1664ParFasCod ;
   private String[] T00U441_A396EmprCod ;
   private int[] T00U441_A129BarCod ;
   private byte[] T00U441_A132BarCodReo ;
   private String[] T00U441_A130BarCodPar ;
   private String[] T00U441_A758ProCod ;
   private short[] T00U441_A194BarOrdLin ;
   private int[] T00U442_A129BarCod ;
   private byte[] T00U442_A132BarCodReo ;
   private String[] T00U442_A130BarCodPar ;
   private short[] T00U442_A194BarOrdLin ;
   private short[] T00U442_A5371FasQuiLin ;
   private String[] T00U442_A766ProForDsc ;
   private short[] T00U442_A5373FasQuiNp ;
   private short[] T00U442_A5374FasQuiTp ;
   private short[] T00U442_A5375FasQuiRb ;
   private String[] T00U442_A6599FasMaqPl ;
   private java.util.Date[] T00U442_A6600FasFecPl ;
   private byte[] T00U442_A6601FasOrdPl ;
   private byte[] T00U442_A6602FasStPl ;
   private short[] T00U442_A6663FasQuiAnc ;
   private short[] T00U442_A6664FasQuiGrm ;
   private java.math.BigDecimal[] T00U442_A9722FasQuiVel ;
   private String[] T00U442_A11506FasQuiAv ;
   private String[] T00U442_A12124FasQuiAs ;
   private String[] T00U442_A12125FasQuiAI ;
   private String[] T00U442_A6665FasQuiObs ;
   private String[] T00U442_A396EmprCod ;
   private String[] T00U442_A764ProForCod ;
   private String[] T00U442_A758ProCod ;
   private String[] T00U44_A766ProForDsc ;
   private String[] T00U443_A766ProForDsc ;
   private String[] T00U444_A396EmprCod ;
   private int[] T00U444_A129BarCod ;
   private byte[] T00U444_A132BarCodReo ;
   private String[] T00U444_A130BarCodPar ;
   private String[] T00U444_A758ProCod ;
   private short[] T00U444_A194BarOrdLin ;
   private short[] T00U444_A5371FasQuiLin ;
   private int[] T00U43_A129BarCod ;
   private byte[] T00U43_A132BarCodReo ;
   private String[] T00U43_A130BarCodPar ;
   private short[] T00U43_A194BarOrdLin ;
   private short[] T00U43_A5371FasQuiLin ;
   private short[] T00U43_A5373FasQuiNp ;
   private short[] T00U43_A5374FasQuiTp ;
   private short[] T00U43_A5375FasQuiRb ;
   private String[] T00U43_A6599FasMaqPl ;
   private java.util.Date[] T00U43_A6600FasFecPl ;
   private byte[] T00U43_A6601FasOrdPl ;
   private byte[] T00U43_A6602FasStPl ;
   private short[] T00U43_A6663FasQuiAnc ;
   private short[] T00U43_A6664FasQuiGrm ;
   private java.math.BigDecimal[] T00U43_A9722FasQuiVel ;
   private String[] T00U43_A11506FasQuiAv ;
   private String[] T00U43_A12124FasQuiAs ;
   private String[] T00U43_A12125FasQuiAI ;
   private String[] T00U43_A6665FasQuiObs ;
   private String[] T00U43_A396EmprCod ;
   private String[] T00U43_A764ProForCod ;
   private String[] T00U43_A758ProCod ;
   private int[] T00U42_A129BarCod ;
   private byte[] T00U42_A132BarCodReo ;
   private String[] T00U42_A130BarCodPar ;
   private short[] T00U42_A194BarOrdLin ;
   private short[] T00U42_A5371FasQuiLin ;
   private short[] T00U42_A5373FasQuiNp ;
   private short[] T00U42_A5374FasQuiTp ;
   private short[] T00U42_A5375FasQuiRb ;
   private String[] T00U42_A6599FasMaqPl ;
   private java.util.Date[] T00U42_A6600FasFecPl ;
   private byte[] T00U42_A6601FasOrdPl ;
   private byte[] T00U42_A6602FasStPl ;
   private short[] T00U42_A6663FasQuiAnc ;
   private short[] T00U42_A6664FasQuiGrm ;
   private java.math.BigDecimal[] T00U42_A9722FasQuiVel ;
   private String[] T00U42_A11506FasQuiAv ;
   private String[] T00U42_A12124FasQuiAs ;
   private String[] T00U42_A12125FasQuiAI ;
   private String[] T00U42_A6665FasQuiObs ;
   private String[] T00U42_A396EmprCod ;
   private String[] T00U42_A764ProForCod ;
   private String[] T00U42_A758ProCod ;
   private String[] T00U448_A766ProForDsc ;
   private String[] T00U449_A396EmprCod ;
   private int[] T00U449_A129BarCod ;
   private byte[] T00U449_A132BarCodReo ;
   private String[] T00U449_A130BarCodPar ;
   private String[] T00U449_A758ProCod ;
   private short[] T00U449_A194BarOrdLin ;
   private short[] T00U449_A5371FasQuiLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV47ProForCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item10[] ;
   private app.wwpbaseobjects.SdtWWPContext AV42WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV43TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV46TrnContextAtt ;
}

final  class thdfpq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdfpq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdfpq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdfpq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thdfpq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00U42", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, FasQuiLin, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiObs, EmprCod, ProForCod, ProCod FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?  FOR UPDATE OF FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiObs, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U43", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, FasQuiLin, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiObs, EmprCod, ProForCod, ProCod FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U44", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U45", "SELECT BarOrdLin, FasQuiUl, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF FasQuiUl, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U46", "SELECT BarOrdLin, FasQuiUl, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U47", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U48", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U49", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U410", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U411", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarOrdLin, T2.EmprNom, T4.ProDsc, T3.FasDsc, TM1.FasQuiUl, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.FasCod FROM (((TXPBARFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U412", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U413", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U414", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and ProCod > ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarOrdLin > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U415", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and ProCod < ? or ProCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarOrdLin < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00U416", "INSERT INTO TXPBARFAS(BarOrdLin, FasQuiUl, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, FasCod, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00U417", "UPDATE TXPBARFAS SET FasQuiUl=?, FasCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00U418", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T00U419", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U420", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U421", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U422", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U423", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U424", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U425", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U426", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U427", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U428", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U429", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U430", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U431", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U432", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U433", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U434", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U435", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U436", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U437", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U438", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00U439", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00U440", "UPDATE TXPBARFAS SET FasQuiUl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T00U441", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U442", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.FasQuiLin, T2.ProForDsc, T1.FasQuiNp, T1.FasQuiTp, T1.FasQuiRb, T1.FasMaqPl, T1.FasFecPl, T1.FasOrdPl, T1.FasStPl, T1.FasQuiAnc, T1.FasQuiGrm, T1.FasQuiVel, T1.FasQuiAv, T1.FasQuiAs, T1.FasQuiAI, T1.FasQuiObs, T1.EmprCod, T1.ProForCod, T1.ProCod FROM (TXPFASQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.FasQuiLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.FasQuiLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U443", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U444", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00U445", "INSERT INTO TXPFASQUI(BarCod, BarCodReo, BarCodPar, BarOrdLin, FasQuiLin, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiObs, EmprCod, ProForCod, ProCod, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPFASQUI")
         ,new UpdateCursor("T00U446", "UPDATE TXPFASQUI SET FasQuiNp=?, FasQuiTp=?, FasQuiRb=?, FasMaqPl=?, FasFecPl=?, FasOrdPl=?, FasStPl=?, FasQuiAnc=?, FasQuiGrm=?, FasQuiVel=?, FasQuiAv=?, FasQuiAs=?, FasQuiAI=?, FasQuiObs=?, ProForCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK, "TXPFASQUI")
         ,new UpdateCursor("T00U447", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK, "TXPFASQUI")
         ,new ForEachCursor("T00U448", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00U449", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,1);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((String[]) buf[20])[0] = rslt.getString(21, 6);
               ((String[]) buf[21])[0] = rslt.getString(22, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,1);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               ((String[]) buf[16])[0] = rslt.getString(17, 3);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((String[]) buf[20])[0] = rslt.getString(21, 6);
               ((String[]) buf[21])[0] = rslt.getString(22, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((String[]) buf[4])[0] = rslt.getString(4, 28);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 34 :
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
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 40 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,1);
               ((String[]) buf[16])[0] = rslt.getString(17, 4);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((String[]) buf[19])[0] = rslt.getVarchar(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 3);
               ((String[]) buf[21])[0] = rslt.getString(22, 6);
               ((String[]) buf[22])[0] = rslt.getString(23, 8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 47 :
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 8);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setString(8, (String)parms[8], 8);
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 43 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setDate(10, (java.util.Date)parms[9]);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 1);
               stmt.setString(16, (String)parms[15], 4);
               stmt.setString(17, (String)parms[16], 3);
               stmt.setString(18, (String)parms[17], 3);
               stmt.setVarchar(19, (String)parms[18], 400, false);
               stmt.setString(20, (String)parms[19], 3);
               stmt.setString(21, (String)parms[20], 6);
               stmt.setString(22, (String)parms[21], 8);
               return;
            case 44 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 1);
               stmt.setString(11, (String)parms[10], 4);
               stmt.setString(12, (String)parms[11], 3);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setVarchar(14, (String)parms[13], 400, false);
               stmt.setString(15, (String)parms[14], 6);
               stmt.setString(16, (String)parms[15], 3);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 1);
               stmt.setString(20, (String)parms[19], 8);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 47 :
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

