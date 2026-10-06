package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_12_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A1253EmprGuiRem, A1243GuiRemCli) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_albpobs") == 0 )
      {
         gxnrgridlevel_albpobs_newrow_invoke( ) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCod), "ZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Observaciones", ""), (short)(0)) ;
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

   public void gxnrgridlevel_albpobs_newrow_invoke( )
   {
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
      A914AlbPObsCon = (byte)(GXutil.lval( httpContext.GetPar( "AlbPObsCon"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_albpobs_newrow( ) ;
      /* End function gxnrGridlevel_albpobs_newrow_invoke */
   }

   public documentodetransporteproduccion_12_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_12_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_12_impl.class ));
   }

   public documentodetransporteproduccion_12_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiRemCln_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCln_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProfch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_albpobs_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_albpobs( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV17Pgmname), GXutil.rtrim( localUtil.format( AV17Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_albpobs( )
   {
      /*  Grid Control  */
      startgridcontrol43( ) ;
      nGXsfl_43_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount121 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_121 = (short)(1) ;
            scanStart1U9121( ) ;
            while ( RcdFound121 != 0 )
            {
               init_level_properties121( ) ;
               getByPrimaryKey1U9121( ) ;
               addRow1U9121( ) ;
               scanNext1U9121( ) ;
            }
            scanEnd1U9121( ) ;
            nBlankRcdCount121 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B914AlbPObsCon = A914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         standaloneNotModal1U9121( ) ;
         standaloneModal1U9121( ) ;
         sMode121 = Gx_mode ;
         while ( nGXsfl_43_idx < nRC_GXsfl_43 )
         {
            bGXsfl_43_Refreshing = true ;
            readRow1U9121( ) ;
            edtAlbPObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSLIN_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtAlbPObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBS_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            if ( ( nRcdExists_121 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1U9121( ) ;
            }
            sendRow1U9121( ) ;
            bGXsfl_43_Refreshing = false ;
         }
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A914AlbPObsCon = B914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount121 = (short)(5) ;
         nRcdExists_121 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1U9121( ) ;
            while ( RcdFound121 != 0 )
            {
               sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_43121( ) ;
               init_level_properties121( ) ;
               standaloneNotModal1U9121( ) ;
               getByPrimaryKey1U9121( ) ;
               standaloneModal1U9121( ) ;
               addRow1U9121( ) ;
               scanNext1U9121( ) ;
            }
            scanEnd1U9121( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode121 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_43121( ) ;
         initAll1U9121( ) ;
         init_level_properties121( ) ;
         B914AlbPObsCon = A914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         nRcdExists_121 = (short)(0) ;
         nIsMod_121 = (short)(0) ;
         nRcdDeleted_121 = (short)(0) ;
         nBlankRcdCount121 = (short)(nBlankRcdUsr121+nBlankRcdCount121) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount121 > 0 )
         {
            standaloneNotModal1U9121( ) ;
            standaloneModal1U9121( ) ;
            addRow1U9121( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbPObsLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount121 = (short)(nBlankRcdCount121-1) ;
         }
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A914AlbPObsCon = B914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_albpobsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_albpobs", Gridlevel_albpobsContainer, subGridlevel_albpobs_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_albpobsContainerData", Gridlevel_albpobsContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_albpobsContainerData"+"V", Gridlevel_albpobsContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_albpobsContainerData"+"V"+"\" value='"+Gridlevel_albpobsContainer.GridValuesHidden()+"'/>") ;
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
      e111U92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            Z5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5805AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            Z34AlbProfch = localUtil.ctod( httpContext.cgiGet( "Z34AlbProfch"), 0) ;
            Z2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            Z914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            A5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5805AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            A2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "O914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV12Insert_GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_GUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1253EmprGuiRem = httpContext.cgiGet( "EMPRGUIREM") ;
            A5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBENVFTP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7101AlbLic = httpContext.cgiGet( "ALBLIC") ;
            A2242AlbSec = httpContext.cgiGet( "ALBSEC") ;
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPROEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            AV17Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_12");
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            forbiddenHiddens.add("AlbProCod", localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"));
            forbiddenHiddens.add("EmprGuiRem", GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            forbiddenHiddens.add("GuiRemCli", localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"));
            AV17Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV17Pgmname, "")));
            forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
            forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            forbiddenHiddens.add("AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            forbiddenHiddens.add("AlbSec", GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")));
            forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A30AlbProCod != Z30AlbProCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_12:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
                  sMode3 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode3 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound3 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1U90( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBPROCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbProCod_Internalname ;
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
                        e111U92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121U92 ();
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
         e121U92 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1U93( ) ;
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
         disableAttributes1U93( ) ;
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

   public void confirm_1U90( )
   {
      beforeValidate1U93( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1U93( ) ;
         }
         else
         {
            checkExtendedTable1U93( ) ;
            closeExtendedTableCursors1U93( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode3 = Gx_mode ;
         confirm_1U9121( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode3 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1U9121( )
   {
      s914AlbPObsCon = O914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      nGXsfl_43_idx = 0 ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         readRow1U9121( ) ;
         if ( ( nRcdExists_121 != 0 ) || ( nIsMod_121 != 0 ) )
         {
            getKey1U9121( ) ;
            if ( ( nRcdExists_121 == 0 ) && ( nRcdDeleted_121 == 0 ) )
            {
               if ( RcdFound121 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1U9121( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1U9121( ) ;
                     closeExtendedTableCursors1U9121( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O914AlbPObsCon = A914AlbPObsCon ;
                     httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBPOBSLIN_" + sGXsfl_43_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbPObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound121 != 0 )
               {
                  if ( nRcdDeleted_121 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1U9121( ) ;
                     load1U9121( ) ;
                     beforeValidate1U9121( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1U9121( ) ;
                        O914AlbPObsCon = A914AlbPObsCon ;
                        httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_121 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1U9121( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1U9121( ) ;
                           closeExtendedTableCursors1U9121( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O914AlbPObsCon = A914AlbPObsCon ;
                           httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_121 == 0 )
                  {
                     GXCCtl = "ALBPOBSLIN_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbPObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPObs_Internalname, GXutil.rtrim( A916AlbPObs)) ;
         httpContext.changePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_43_idx, GXutil.rtrim( Z916AlbPObs)) ;
         httpContext.changePostValue( "nRcdDeleted_121_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_121_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_121_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_121 != 0 )
         {
            httpContext.changePostValue( "ALBPOBSLIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPOBS_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O914AlbPObsCon = s914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1U90( )
   {
   }

   public void e111U92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_12_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Station", AV14Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV15EmprNom ;
      GXv_char4[0] = AV18Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_12_impl.this.AV7EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_12_impl.this.AV15EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_12_impl.this.AV18Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprNom", AV15EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV18Usurcod", AV18Usurcod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV17Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV19GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GXV1), 8, 0));
         while ( AV19GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV19GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GuiRemCli") == 0 )
            {
               AV12Insert_GuiRemCli = (int)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_GuiRemCli), 6, 0));
            }
            AV19GXV1 = (int)(AV19GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GXV1), 8, 0));
         }
      }
   }

   public void e121U92( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1U93( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1253EmprGuiRem = T01U95_A1253EmprGuiRem[0] ;
            Z5805AlbEnvFtp = T01U95_A5805AlbEnvFtp[0] ;
            Z7101AlbLic = T01U95_A7101AlbLic[0] ;
            Z34AlbProfch = T01U95_A34AlbProfch[0] ;
            Z2242AlbSec = T01U95_A2242AlbSec[0] ;
            Z914AlbPObsCon = T01U95_A914AlbPObsCon[0] ;
            Z33AlbProEst = T01U95_A33AlbProEst[0] ;
            Z1243GuiRemCli = T01U95_A1243GuiRemCli[0] ;
         }
         else
         {
            Z1253EmprGuiRem = A1253EmprGuiRem ;
            Z5805AlbEnvFtp = A5805AlbEnvFtp ;
            Z7101AlbLic = A7101AlbLic ;
            Z34AlbProfch = A34AlbProfch ;
            Z2242AlbSec = A2242AlbSec ;
            Z914AlbPObsCon = A914AlbPObsCon ;
            Z33AlbProEst = A33AlbProEst ;
            Z1243GuiRemCli = A1243GuiRemCli ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z30AlbProCod = A30AlbProCod ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z34AlbProfch = A34AlbProfch ;
         Z2242AlbSec = A2242AlbSec ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z33AlbProEst = A33AlbProEst ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z396EmprCod = A396EmprCod ;
         Z1244GuiRemCln = A1244GuiRemCln ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      AV17Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_12" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Pgmname", AV17Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01U97 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01U97_A407EmprNom[0] ;
      n407EmprNom = T01U97_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV8AlbProCod) )
      {
         A30AlbProCod = AV8AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_GuiRemCli) )
      {
         A1243GuiRemCli = AV12Insert_GuiRemCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
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
   }

   public void load1U93( )
   {
      /* Using cursor T01U98 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A1253EmprGuiRem = T01U98_A1253EmprGuiRem[0] ;
         A407EmprNom = T01U98_A407EmprNom[0] ;
         n407EmprNom = T01U98_n407EmprNom[0] ;
         A5805AlbEnvFtp = T01U98_A5805AlbEnvFtp[0] ;
         A7101AlbLic = T01U98_A7101AlbLic[0] ;
         A1244GuiRemCln = T01U98_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A34AlbProfch = T01U98_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01U98_A2242AlbSec[0] ;
         A914AlbPObsCon = T01U98_A914AlbPObsCon[0] ;
         A33AlbProEst = T01U98_A33AlbProEst[0] ;
         A1243GuiRemCli = T01U98_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         zm1U93( -13) ;
      }
      pr_default.close(6);
      onLoadActions1U93( ) ;
   }

   public void onLoadActions1U93( )
   {
   }

   public void checkExtendedTable1U93( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01U96 */
      pr_default.execute(4, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01U96_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1U93( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01U99 */
      pr_default.execute(7, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01U99_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1U93( )
   {
      /* Using cursor T01U910 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01U95 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1U93( 13) ;
         RcdFound3 = (short)(1) ;
         A1253EmprGuiRem = T01U95_A1253EmprGuiRem[0] ;
         A30AlbProCod = T01U95_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A5805AlbEnvFtp = T01U95_A5805AlbEnvFtp[0] ;
         A7101AlbLic = T01U95_A7101AlbLic[0] ;
         A34AlbProfch = T01U95_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01U95_A2242AlbSec[0] ;
         A914AlbPObsCon = T01U95_A914AlbPObsCon[0] ;
         A33AlbProEst = T01U95_A33AlbProEst[0] ;
         A1243GuiRemCli = T01U95_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A396EmprCod = T01U95_A396EmprCod[0] ;
         O914AlbPObsCon = A914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1U93( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1U93( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1U93( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1U93( ) ;
      if ( RcdFound3 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01U911 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01U911_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U911_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U911_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01U911_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U911_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U911_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A396EmprCod = T01U911_A396EmprCod[0] ;
            A30AlbProCod = T01U911_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01U912 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01U912_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01U912_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U912_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01U912_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01U912_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01U912_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A396EmprCod = T01U912_A396EmprCod[0] ;
            A30AlbProCod = T01U912_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1U93( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A914AlbPObsCon = O914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         insert1U93( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               update1U93( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               /* Insert record */
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               insert1U93( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBPROCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A914AlbPObsCon = O914AlbPObsCon ;
                  httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                  insert1U93( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A914AlbPObsCon = O914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1U93( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01U94 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z1253EmprGuiRem, T01U94_A1253EmprGuiRem[0]) != 0 ) || ( Z5805AlbEnvFtp != T01U94_A5805AlbEnvFtp[0] ) || ( GXutil.strcmp(Z7101AlbLic, T01U94_A7101AlbLic[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01U94_A34AlbProfch[0])) ) || ( GXutil.strcmp(Z2242AlbSec, T01U94_A2242AlbSec[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z914AlbPObsCon != T01U94_A914AlbPObsCon[0] ) || ( Z33AlbProEst != T01U94_A33AlbProEst[0] ) || ( Z1243GuiRemCli != T01U94_A1243GuiRemCli[0] ) )
         {
            if ( GXutil.strcmp(Z1253EmprGuiRem, T01U94_A1253EmprGuiRem[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"EmprGuiRem");
               GXutil.writeLogRaw("Old: ",Z1253EmprGuiRem);
               GXutil.writeLogRaw("Current: ",T01U94_A1253EmprGuiRem[0]);
            }
            if ( Z5805AlbEnvFtp != T01U94_A5805AlbEnvFtp[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"AlbEnvFtp");
               GXutil.writeLogRaw("Old: ",Z5805AlbEnvFtp);
               GXutil.writeLogRaw("Current: ",T01U94_A5805AlbEnvFtp[0]);
            }
            if ( GXutil.strcmp(Z7101AlbLic, T01U94_A7101AlbLic[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"AlbLic");
               GXutil.writeLogRaw("Old: ",Z7101AlbLic);
               GXutil.writeLogRaw("Current: ",T01U94_A7101AlbLic[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01U94_A34AlbProfch[0])) ) )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"AlbProfch");
               GXutil.writeLogRaw("Old: ",Z34AlbProfch);
               GXutil.writeLogRaw("Current: ",T01U94_A34AlbProfch[0]);
            }
            if ( GXutil.strcmp(Z2242AlbSec, T01U94_A2242AlbSec[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"AlbSec");
               GXutil.writeLogRaw("Old: ",Z2242AlbSec);
               GXutil.writeLogRaw("Current: ",T01U94_A2242AlbSec[0]);
            }
            if ( Z914AlbPObsCon != T01U94_A914AlbPObsCon[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"AlbPObsCon");
               GXutil.writeLogRaw("Old: ",Z914AlbPObsCon);
               GXutil.writeLogRaw("Current: ",T01U94_A914AlbPObsCon[0]);
            }
            if ( Z33AlbProEst != T01U94_A33AlbProEst[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01U94_A33AlbProEst[0]);
            }
            if ( Z1243GuiRemCli != T01U94_A1243GuiRemCli[0] )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"GuiRemCli");
               GXutil.writeLogRaw("Old: ",Z1243GuiRemCli);
               GXutil.writeLogRaw("Current: ",T01U94_A1243GuiRemCli[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1U93( )
   {
      beforeValidate1U93( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U93( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1U93( 0) ;
         checkOptimisticConcurrency1U93( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U93( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1U93( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U913 */
                  pr_default.execute(11, new Object[] {A1253EmprGuiRem, Long.valueOf(A30AlbProCod), Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A34AlbProfch, A2242AlbSec, Byte.valueOf(A914AlbPObsCon), Byte.valueOf(A33AlbProEst), Integer.valueOf(A1243GuiRemCli), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel1U93( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1U90( ) ;
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
            load1U93( ) ;
         }
         endLevel1U93( ) ;
      }
      closeExtendedTableCursors1U93( ) ;
   }

   public void update1U93( )
   {
      beforeValidate1U93( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U93( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U93( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U93( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1U93( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U914 */
                  pr_default.execute(12, new Object[] {A1253EmprGuiRem, Byte.valueOf(A5805AlbEnvFtp), A7101AlbLic, A34AlbProfch, A2242AlbSec, Byte.valueOf(A914AlbPObsCon), Byte.valueOf(A33AlbProEst), Integer.valueOf(A1243GuiRemCli), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1U93( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1U93( ) ;
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
         endLevel1U93( ) ;
      }
      closeExtendedTableCursors1U93( ) ;
   }

   public void deferredUpdate1U93( )
   {
   }

   public void delete( )
   {
      beforeValidate1U93( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U93( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1U93( ) ;
         afterConfirm1U93( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1U93( ) ;
            if ( AnyError == 0 )
            {
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               scanStart1U9121( ) ;
               while ( RcdFound121 != 0 )
               {
                  getByPrimaryKey1U9121( ) ;
                  delete1U9121( ) ;
                  scanNext1U9121( ) ;
                  O914AlbPObsCon = A914AlbPObsCon ;
                  httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               }
               scanEnd1U9121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U915 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1U93( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1U93( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01U916 */
         pr_default.execute(14, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01U916_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01U917 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01U918 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01U919 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01U920 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1U9121( )
   {
      s914AlbPObsCon = O914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      nGXsfl_43_idx = 0 ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         readRow1U9121( ) ;
         if ( ( nRcdExists_121 != 0 ) || ( nIsMod_121 != 0 ) )
         {
            standaloneNotModal1U9121( ) ;
            getKey1U9121( ) ;
            if ( ( nRcdExists_121 == 0 ) && ( nRcdDeleted_121 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1U9121( ) ;
            }
            else
            {
               if ( RcdFound121 != 0 )
               {
                  if ( ( nRcdDeleted_121 != 0 ) && ( nRcdExists_121 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1U9121( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_121 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1U9121( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_121 == 0 )
                  {
                     GXCCtl = "ALBPOBSLIN_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O914AlbPObsCon = A914AlbPObsCon ;
            httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         }
         httpContext.changePostValue( edtAlbPObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPObs_Internalname, GXutil.rtrim( A916AlbPObs)) ;
         httpContext.changePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_43_idx, GXutil.rtrim( Z916AlbPObs)) ;
         httpContext.changePostValue( "nRcdDeleted_121_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_121_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_121_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_121 != 0 )
         {
            httpContext.changePostValue( "ALBPOBSLIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPOBS_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1U9121( ) ;
      if ( AnyError != 0 )
      {
         O914AlbPObsCon = s914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      nRcdExists_121 = (short)(0) ;
      nIsMod_121 = (short)(0) ;
      nRcdDeleted_121 = (short)(0) ;
   }

   public void processLevel1U93( )
   {
      /* Save parent mode. */
      sMode3 = Gx_mode ;
      processNestedLevel1U9121( ) ;
      if ( AnyError != 0 )
      {
         O914AlbPObsCon = s914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01U921 */
      pr_default.execute(19, new Object[] {Byte.valueOf(A914AlbPObsCon), A396EmprCod, Long.valueOf(A30AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
   }

   public void endLevel1U93( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1U93( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_12");
         if ( AnyError == 0 )
         {
            confirmValues1U90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentotransporteproduccion.documentodetransporteproduccion_12");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1U93( )
   {
      /* Scan By routine */
      /* Using cursor T01U922 */
      pr_default.execute(20);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A396EmprCod = T01U922_A396EmprCod[0] ;
         A30AlbProCod = T01U922_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1U93( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A396EmprCod = T01U922_A396EmprCod[0] ;
         A30AlbProCod = T01U922_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEnd1U93( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1U93( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1U93( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1U93( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1U93( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1U93( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1U93( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1U93( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1U9121( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z916AlbPObs = T01U93_A916AlbPObs[0] ;
         }
         else
         {
            Z916AlbPObs = A916AlbPObs ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         Z916AlbPObs = A916AlbPObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1U9121( )
   {
   }

   public void standaloneModal1U9121( )
   {
      if ( isIns( )  )
      {
         A914AlbPObsCon = (byte)(O914AlbPObsCon+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A915AlbPObsLin = A914AlbPObsCon ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbPObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
      else
      {
         edtAlbPObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
   }

   public void load1U9121( )
   {
      /* Using cursor T01U923 */
      pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A916AlbPObs = T01U923_A916AlbPObs[0] ;
         zm1U9121( -16) ;
      }
      pr_default.close(21);
      onLoadActions1U9121( ) ;
   }

   public void onLoadActions1U9121( )
   {
   }

   public void checkExtendedTable1U9121( )
   {
      nIsDirty_121 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1U9121( ) ;
   }

   public void closeExtendedTableCursors1U9121( )
   {
   }

   public void enableDisable1U9121( )
   {
   }

   public void getKey1U9121( )
   {
      /* Using cursor T01U924 */
      pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound121 = (short)(1) ;
      }
      else
      {
         RcdFound121 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1U9121( )
   {
      /* Using cursor T01U93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1U9121( 16) ;
         RcdFound121 = (short)(1) ;
         initializeNonKey1U9121( ) ;
         A915AlbPObsLin = T01U93_A915AlbPObsLin[0] ;
         A916AlbPObs = T01U93_A916AlbPObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1U9121( ) ;
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound121 = (short)(0) ;
         initializeNonKey1U9121( ) ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1U9121( ) ;
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1U9121( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1U9121( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01U92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z916AlbPObs, T01U92_A916AlbPObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z916AlbPObs, T01U92_A916AlbPObs[0]) != 0 )
            {
               GXutil.writeLogln("documentotransporteproduccion.documentodetransporteproduccion_12:[seudo value changed for attri]"+"AlbPObs");
               GXutil.writeLogRaw("Old: ",Z916AlbPObs);
               GXutil.writeLogRaw("Current: ",T01U92_A916AlbPObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1U9121( )
   {
      beforeValidate1U9121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U9121( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1U9121( 0) ;
         checkOptimisticConcurrency1U9121( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1U9121( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1U9121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01U925 */
                  pr_default.execute(23, new Object[] {Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin), A916AlbPObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
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
            load1U9121( ) ;
         }
         endLevel1U9121( ) ;
      }
      closeExtendedTableCursors1U9121( ) ;
   }

   public void update1U9121( )
   {
      beforeValidate1U9121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1U9121( ) ;
      }
      if ( ( nIsMod_121 != 0 ) || ( nIsDirty_121 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1U9121( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1U9121( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1U9121( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01U926 */
                     pr_default.execute(24, new Object[] {A916AlbPObs, A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                     if ( (pr_default.getStatus(24) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1U9121( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1U9121( ) ;
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
            endLevel1U9121( ) ;
         }
      }
      closeExtendedTableCursors1U9121( ) ;
   }

   public void deferredUpdate1U9121( )
   {
   }

   public void delete1U9121( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1U9121( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1U9121( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1U9121( ) ;
         afterConfirm1U9121( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1U9121( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01U927 */
               pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
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
      sMode121 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1U9121( ) ;
      Gx_mode = sMode121 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1U9121( )
   {
      standaloneModal1U9121( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1U9121( )
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

   public void scanStart1U9121( )
   {
      /* Scan By routine */
      /* Using cursor T01U928 */
      pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = T01U928_A915AlbPObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1U9121( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = T01U928_A915AlbPObsLin[0] ;
      }
   }

   public void scanEnd1U9121( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1U9121( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1U9121( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1U9121( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1U9121( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1U9121( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1U9121( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1U9121( )
   {
      edtAlbPObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbPObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void send_integrity_lvl_hashes1U9121( )
   {
   }

   public void send_integrity_lvl_hashes1U93( )
   {
   }

   public void subsflControlProps_43121( )
   {
      edtAlbPObsLin_Internalname = "ALBPOBSLIN_"+sGXsfl_43_idx ;
      edtAlbPObs_Internalname = "ALBPOBS_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_43121( )
   {
      edtAlbPObsLin_Internalname = "ALBPOBSLIN_"+sGXsfl_43_fel_idx ;
      edtAlbPObs_Internalname = "ALBPOBS_"+sGXsfl_43_fel_idx ;
   }

   public void addRow1U9121( )
   {
      nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43121( ) ;
      sendRow1U9121( ) ;
   }

   public void sendRow1U9121( )
   {
      Gridlevel_albpobsRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_albpobs_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_albpobs_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_albpobs_Class, "") != 0 )
         {
            subGridlevel_albpobs_Linesclass = subGridlevel_albpobs_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_albpobs_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_albpobs_Backstyle = (byte)(0) ;
         subGridlevel_albpobs_Backcolor = subGridlevel_albpobs_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_albpobs_Class, "") != 0 )
         {
            subGridlevel_albpobs_Linesclass = subGridlevel_albpobs_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_albpobs_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_albpobs_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_albpobs_Class, "") != 0 )
         {
            subGridlevel_albpobs_Linesclass = subGridlevel_albpobs_Class+"Odd" ;
         }
         subGridlevel_albpobs_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_albpobs_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_albpobs_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
         {
            subGridlevel_albpobs_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_albpobs_Class, "") != 0 )
            {
               subGridlevel_albpobs_Linesclass = subGridlevel_albpobs_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_albpobs_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_albpobs_Class, "") != 0 )
            {
               subGridlevel_albpobs_Linesclass = subGridlevel_albpobs_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_121_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "WWActionColumn" ;
      Gridlevel_albpobsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A915AlbPObsLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPObsLin_Jsonclick,Integer.valueOf(0),"WWActionColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbPObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_121_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_albpobsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPObs_Internalname,GXutil.rtrim( A916AlbPObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPObs_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbPObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_albpobsRow);
      send_integrity_lvl_hashes1U9121( ) ;
      GXCCtl = "Z915AlbPObsLin_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z916AlbPObs_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z916AlbPObs));
      GXCCtl = "nRcdDeleted_121_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_121_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_121_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vALBPROCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBSLIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBS_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_albpobsContainer.AddRow(Gridlevel_albpobsRow);
   }

   public void readRow1U9121( )
   {
      nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43121( ) ;
      edtAlbPObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSLIN_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBS_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBPOBSLIN_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPObsLin_Internalname ;
         wbErr = true ;
         A915AlbPObsLin = (byte)(0) ;
      }
      else
      {
         A915AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A916AlbPObs = httpContext.cgiGet( edtAlbPObs_Internalname) ;
      GXCCtl = "Z915AlbPObsLin_" + sGXsfl_43_idx ;
      Z915AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z916AlbPObs_" + sGXsfl_43_idx ;
      Z916AlbPObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_121_" + sGXsfl_43_idx ;
      nRcdDeleted_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_121_" + sGXsfl_43_idx ;
      nRcdExists_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_121_" + sGXsfl_43_idx ;
      nIsMod_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbPObsLin_Enabled = edtAlbPObsLin_Enabled ;
   }

   public void confirmValues1U90( )
   {
      nGXsfl_43_idx = 0 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43121( ) ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_43121( ) ;
         httpContext.changePostValue( "Z915AlbPObsLin_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z916AlbPObs_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z916AlbPObs_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_43_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_12");
      forbiddenHiddens.add("AlbProCod", localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"));
      forbiddenHiddens.add("EmprGuiRem", GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("GuiRemCli", localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV17Pgmname, "")));
      forbiddenHiddens.add("AlbEnvFtp", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9"));
      forbiddenHiddens.add("AlbLic", GXutil.rtrim( localUtil.format( A7101AlbLic, "")));
      forbiddenHiddens.add("AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      forbiddenHiddens.add("AlbSec", GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")));
      forbiddenHiddens.add("AlbProEst", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_12:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1253EmprGuiRem", GXutil.rtrim( Z1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( Z5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7101AlbLic", GXutil.rtrim( Z7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z34AlbProfch", localUtil.dtoc( Z34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2242AlbSec", GXutil.rtrim( Z2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( Z1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( O914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nGXsfl_43_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_GUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV12Insert_GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRGUIREM", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENVFTP", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSEC", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBSCON", GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROEST", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbProCod,10,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_12" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Observaciones", "") ;
   }

   public void initializeNonKey1U93( )
   {
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A34AlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      A914AlbPObsCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      O914AlbPObsCon = A914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      Z1253EmprGuiRem = "" ;
      Z5805AlbEnvFtp = (byte)(0) ;
      Z7101AlbLic = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z2242AlbSec = "" ;
      Z914AlbPObsCon = (byte)(0) ;
      Z33AlbProEst = (byte)(0) ;
      Z1243GuiRemCli = 0 ;
   }

   public void initAll1U93( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKey1U93( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1U9121( )
   {
      A916AlbPObs = "" ;
      Z916AlbPObs = "" ;
   }

   public void initAll1U9121( )
   {
      A915AlbPObsLin = (byte)(0) ;
      initializeNonKey1U9121( ) ;
   }

   public void standaloneModalInsert1U9121( )
   {
      A914AlbPObsCon = i914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102486", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_12.js", "?202682116102487", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties121( )
   {
      edtAlbPObsLin_Enabled = defedtAlbPObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void startgridcontrol43( )
   {
      Gridlevel_albpobsContainer.AddObjectProperty("GridName", "Gridlevel_albpobs");
      Gridlevel_albpobsContainer.AddObjectProperty("Header", subGridlevel_albpobs_Header);
      Gridlevel_albpobsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_albpobsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpobs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_albpobsContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_albpobsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albpobsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_albpobsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddColumnProperties(Gridlevel_albpobsColumn);
      Gridlevel_albpobsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_albpobsColumn.AddObjectProperty("Value", GXutil.rtrim( A916AlbPObs));
      Gridlevel_albpobsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddColumnProperties(Gridlevel_albpobsColumn);
      Gridlevel_albpobsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpobs_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpobs_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpobs_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpobs_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpobs_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpobs_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_albpobsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_albpobs_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbPObsLin_Internalname = "ALBPOBSLIN" ;
      edtAlbPObs_Internalname = "ALBPOBS" ;
      divTableleaflevel_albpobs_Internalname = "TABLELEAFLEVEL_ALBPOBS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_albpobs_Internalname = "GRIDLEVEL_ALBPOBS" ;
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
      subGridlevel_albpobs_Allowcollapsing = (byte)(0) ;
      subGridlevel_albpobs_Allowselection = (byte)(0) ;
      subGridlevel_albpobs_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Observaciones", "") );
      edtAlbPObs_Jsonclick = "" ;
      edtAlbPObsLin_Jsonclick = "" ;
      subGridlevel_albpobs_Class = "GridNoBorder WorkWith" ;
      subGridlevel_albpobs_Backcolorstyle = (byte)(0) ;
      edtAlbPObs_Enabled = 1 ;
      edtAlbPObsLin_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 0 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 0 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
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

   public void gxnrgridlevel_albpobs_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_43121( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1U9121( ) ;
         standaloneModal1U9121( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1U9121( ) ;
         nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_43121( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_albpobsContainer)) ;
      /* End function gxnrGridlevel_albpobs_newrow */
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

   public void valid_Guiremcli( )
   {
      /* Using cursor T01U916 */
      pr_default.execute(14, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01U916_A1244GuiRemCln[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'AV17Pgmname',fld:'vPGMNAME',pic:''},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121U92',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''}]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''}]}");
      setEventMetadata("VALID_ALBPOBSLIN","{handler:'valid_Albpobslin',iparms:[]");
      setEventMetadata("VALID_ALBPOBSLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albpobs',iparms:[]");
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
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z1253EmprGuiRem = "" ;
      Z7101AlbLic = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z2242AlbSec = "" ;
      Z916AlbPObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A1253EmprGuiRem = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV17Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_albpobsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode121 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A7101AlbLic = "" ;
      A2242AlbSec = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode3 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A916AlbPObs = "" ;
      AV14Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV15EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV18Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV13TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z1244GuiRemCln = "" ;
      Z407EmprNom = "" ;
      T01U97_A407EmprNom = new String[] {""} ;
      T01U97_n407EmprNom = new boolean[] {false} ;
      T01U98_A1253EmprGuiRem = new String[] {""} ;
      T01U98_A30AlbProCod = new long[1] ;
      T01U98_A407EmprNom = new String[] {""} ;
      T01U98_n407EmprNom = new boolean[] {false} ;
      T01U98_A5805AlbEnvFtp = new byte[1] ;
      T01U98_A7101AlbLic = new String[] {""} ;
      T01U98_A1244GuiRemCln = new String[] {""} ;
      T01U98_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U98_A2242AlbSec = new String[] {""} ;
      T01U98_A914AlbPObsCon = new byte[1] ;
      T01U98_A33AlbProEst = new byte[1] ;
      T01U98_A1243GuiRemCli = new int[1] ;
      T01U98_A396EmprCod = new String[] {""} ;
      T01U96_A1244GuiRemCln = new String[] {""} ;
      T01U99_A1244GuiRemCln = new String[] {""} ;
      T01U910_A396EmprCod = new String[] {""} ;
      T01U910_A30AlbProCod = new long[1] ;
      T01U95_A1253EmprGuiRem = new String[] {""} ;
      T01U95_A30AlbProCod = new long[1] ;
      T01U95_A5805AlbEnvFtp = new byte[1] ;
      T01U95_A7101AlbLic = new String[] {""} ;
      T01U95_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U95_A2242AlbSec = new String[] {""} ;
      T01U95_A914AlbPObsCon = new byte[1] ;
      T01U95_A33AlbProEst = new byte[1] ;
      T01U95_A1243GuiRemCli = new int[1] ;
      T01U95_A396EmprCod = new String[] {""} ;
      T01U911_A396EmprCod = new String[] {""} ;
      T01U911_A30AlbProCod = new long[1] ;
      T01U912_A396EmprCod = new String[] {""} ;
      T01U912_A30AlbProCod = new long[1] ;
      T01U94_A1253EmprGuiRem = new String[] {""} ;
      T01U94_A30AlbProCod = new long[1] ;
      T01U94_A5805AlbEnvFtp = new byte[1] ;
      T01U94_A7101AlbLic = new String[] {""} ;
      T01U94_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01U94_A2242AlbSec = new String[] {""} ;
      T01U94_A914AlbPObsCon = new byte[1] ;
      T01U94_A33AlbProEst = new byte[1] ;
      T01U94_A1243GuiRemCli = new int[1] ;
      T01U94_A396EmprCod = new String[] {""} ;
      T01U916_A1244GuiRemCln = new String[] {""} ;
      T01U917_A396EmprCod = new String[] {""} ;
      T01U917_A30AlbProCod = new long[1] ;
      T01U917_A12185DltLinObs = new byte[1] ;
      T01U918_A396EmprCod = new String[] {""} ;
      T01U918_A30AlbProCod = new long[1] ;
      T01U918_A12176DltHdr = new int[1] ;
      T01U918_A12177DltR = new byte[1] ;
      T01U918_A12178DltP = new String[] {""} ;
      T01U919_A396EmprCod = new String[] {""} ;
      T01U919_A30AlbProCod = new long[1] ;
      T01U919_A7540Alb_NFisca = new String[] {""} ;
      T01U920_A396EmprCod = new String[] {""} ;
      T01U920_A30AlbProCod = new long[1] ;
      T01U920_A129BarCod = new int[1] ;
      T01U920_A132BarCodReo = new byte[1] ;
      T01U920_A130BarCodPar = new String[] {""} ;
      T01U922_A396EmprCod = new String[] {""} ;
      T01U922_A30AlbProCod = new long[1] ;
      T01U923_A30AlbProCod = new long[1] ;
      T01U923_A915AlbPObsLin = new byte[1] ;
      T01U923_A916AlbPObs = new String[] {""} ;
      T01U923_A396EmprCod = new String[] {""} ;
      T01U924_A396EmprCod = new String[] {""} ;
      T01U924_A30AlbProCod = new long[1] ;
      T01U924_A915AlbPObsLin = new byte[1] ;
      T01U93_A30AlbProCod = new long[1] ;
      T01U93_A915AlbPObsLin = new byte[1] ;
      T01U93_A916AlbPObs = new String[] {""} ;
      T01U93_A396EmprCod = new String[] {""} ;
      T01U92_A30AlbProCod = new long[1] ;
      T01U92_A915AlbPObsLin = new byte[1] ;
      T01U92_A916AlbPObs = new String[] {""} ;
      T01U92_A396EmprCod = new String[] {""} ;
      T01U928_A396EmprCod = new String[] {""} ;
      T01U928_A30AlbProCod = new long[1] ;
      T01U928_A915AlbPObsLin = new byte[1] ;
      Gridlevel_albpobsRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_albpobs_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_albpobsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_12__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_12__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_12__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_12__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_12__default(),
         new Object[] {
             new Object[] {
            T01U92_A30AlbProCod, T01U92_A915AlbPObsLin, T01U92_A916AlbPObs, T01U92_A396EmprCod
            }
            , new Object[] {
            T01U93_A30AlbProCod, T01U93_A915AlbPObsLin, T01U93_A916AlbPObs, T01U93_A396EmprCod
            }
            , new Object[] {
            T01U94_A1253EmprGuiRem, T01U94_A30AlbProCod, T01U94_A5805AlbEnvFtp, T01U94_A7101AlbLic, T01U94_A34AlbProfch, T01U94_A2242AlbSec, T01U94_A914AlbPObsCon, T01U94_A33AlbProEst, T01U94_A1243GuiRemCli, T01U94_A396EmprCod
            }
            , new Object[] {
            T01U95_A1253EmprGuiRem, T01U95_A30AlbProCod, T01U95_A5805AlbEnvFtp, T01U95_A7101AlbLic, T01U95_A34AlbProfch, T01U95_A2242AlbSec, T01U95_A914AlbPObsCon, T01U95_A33AlbProEst, T01U95_A1243GuiRemCli, T01U95_A396EmprCod
            }
            , new Object[] {
            T01U96_A1244GuiRemCln
            }
            , new Object[] {
            T01U97_A407EmprNom, T01U97_n407EmprNom
            }
            , new Object[] {
            T01U98_A1253EmprGuiRem, T01U98_A30AlbProCod, T01U98_A407EmprNom, T01U98_n407EmprNom, T01U98_A5805AlbEnvFtp, T01U98_A7101AlbLic, T01U98_A1244GuiRemCln, T01U98_A34AlbProfch, T01U98_A2242AlbSec, T01U98_A914AlbPObsCon,
            T01U98_A33AlbProEst, T01U98_A1243GuiRemCli, T01U98_A396EmprCod
            }
            , new Object[] {
            T01U99_A1244GuiRemCln
            }
            , new Object[] {
            T01U910_A396EmprCod, T01U910_A30AlbProCod
            }
            , new Object[] {
            T01U911_A396EmprCod, T01U911_A30AlbProCod
            }
            , new Object[] {
            T01U912_A396EmprCod, T01U912_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01U916_A1244GuiRemCln
            }
            , new Object[] {
            T01U917_A396EmprCod, T01U917_A30AlbProCod, T01U917_A12185DltLinObs
            }
            , new Object[] {
            T01U918_A396EmprCod, T01U918_A30AlbProCod, T01U918_A12176DltHdr, T01U918_A12177DltR, T01U918_A12178DltP
            }
            , new Object[] {
            T01U919_A396EmprCod, T01U919_A30AlbProCod, T01U919_A7540Alb_NFisca
            }
            , new Object[] {
            T01U920_A396EmprCod, T01U920_A30AlbProCod, T01U920_A129BarCod, T01U920_A132BarCodReo, T01U920_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01U922_A396EmprCod, T01U922_A30AlbProCod
            }
            , new Object[] {
            T01U923_A30AlbProCod, T01U923_A915AlbPObsLin, T01U923_A916AlbPObs, T01U923_A396EmprCod
            }
            , new Object[] {
            T01U924_A396EmprCod, T01U924_A30AlbProCod, T01U924_A915AlbPObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01U928_A396EmprCod, T01U928_A30AlbProCod, T01U928_A915AlbPObsLin
            }
         }
      );
      AV17Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_12" ;
   }

   private byte Z5805AlbEnvFtp ;
   private byte Z914AlbPObsCon ;
   private byte Z33AlbProEst ;
   private byte O914AlbPObsCon ;
   private byte Z915AlbPObsLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A914AlbPObsCon ;
   private byte Gx_BScreen ;
   private byte B914AlbPObsCon ;
   private byte A5805AlbEnvFtp ;
   private byte A33AlbProEst ;
   private byte s914AlbPObsCon ;
   private byte A915AlbPObsLin ;
   private byte subGridlevel_albpobs_Backcolorstyle ;
   private byte subGridlevel_albpobs_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i914AlbPObsCon ;
   private byte subGridlevel_albpobs_Allowselection ;
   private byte subGridlevel_albpobs_Allowhovering ;
   private byte subGridlevel_albpobs_Allowcollapsing ;
   private byte subGridlevel_albpobs_Collapsed ;
   private short nRcdDeleted_121 ;
   private short nRcdExists_121 ;
   private short nIsMod_121 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount121 ;
   private short RcdFound121 ;
   private short nBlankRcdUsr121 ;
   private short RcdFound3 ;
   private short nIsDirty_3 ;
   private short nIsDirty_121 ;
   private int Z1243GuiRemCli ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int A1243GuiRemCli ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtGuiRemCli_Enabled ;
   private int edtGuiRemCln_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtAlbPObsLin_Enabled ;
   private int edtAlbPObs_Enabled ;
   private int fRowAdded ;
   private int AV12Insert_GuiRemCli ;
   private int Datamonjs_Gxcontroltype ;
   private int AV19GXV1 ;
   private int GX_JID ;
   private int subGridlevel_albpobs_Backcolor ;
   private int subGridlevel_albpobs_Allbackcolor ;
   private int defedtAlbPObsLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_albpobs_Selectedindex ;
   private int subGridlevel_albpobs_Selectioncolor ;
   private int subGridlevel_albpobs_Hoveringcolor ;
   private long wcpOAV8AlbProCod ;
   private long Z30AlbProCod ;
   private long AV8AlbProCod ;
   private long A30AlbProCod ;
   private long GRIDLEVEL_ALBPOBS_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z1253EmprGuiRem ;
   private String Z7101AlbLic ;
   private String Z2242AlbSec ;
   private String Z916AlbPObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A1253EmprGuiRem ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_43_idx="0001" ;
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
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String divTableleaflevel_albpobs_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV17Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sMode121 ;
   private String edtAlbPObsLin_Internalname ;
   private String edtAlbPObs_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_albpobs_Internalname ;
   private String A7101AlbLic ;
   private String A2242AlbSec ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode3 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A916AlbPObs ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV15EmprNom ;
   private String GXv_char3[] ;
   private String AV18Usurcod ;
   private String GXv_char4[] ;
   private String Z1244GuiRemCln ;
   private String Z407EmprNom ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGridlevel_albpobs_Class ;
   private String subGridlevel_albpobs_Linesclass ;
   private String ROClassString ;
   private String edtAlbPObsLin_Jsonclick ;
   private String edtAlbPObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_albpobs_Header ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date A34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_albpobsContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_albpobsRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_albpobsColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01U97_A407EmprNom ;
   private boolean[] T01U97_n407EmprNom ;
   private String[] T01U98_A1253EmprGuiRem ;
   private long[] T01U98_A30AlbProCod ;
   private String[] T01U98_A407EmprNom ;
   private boolean[] T01U98_n407EmprNom ;
   private byte[] T01U98_A5805AlbEnvFtp ;
   private String[] T01U98_A7101AlbLic ;
   private String[] T01U98_A1244GuiRemCln ;
   private java.util.Date[] T01U98_A34AlbProfch ;
   private String[] T01U98_A2242AlbSec ;
   private byte[] T01U98_A914AlbPObsCon ;
   private byte[] T01U98_A33AlbProEst ;
   private int[] T01U98_A1243GuiRemCli ;
   private String[] T01U98_A396EmprCod ;
   private String[] T01U96_A1244GuiRemCln ;
   private String[] T01U99_A1244GuiRemCln ;
   private String[] T01U910_A396EmprCod ;
   private long[] T01U910_A30AlbProCod ;
   private String[] T01U95_A1253EmprGuiRem ;
   private long[] T01U95_A30AlbProCod ;
   private byte[] T01U95_A5805AlbEnvFtp ;
   private String[] T01U95_A7101AlbLic ;
   private java.util.Date[] T01U95_A34AlbProfch ;
   private String[] T01U95_A2242AlbSec ;
   private byte[] T01U95_A914AlbPObsCon ;
   private byte[] T01U95_A33AlbProEst ;
   private int[] T01U95_A1243GuiRemCli ;
   private String[] T01U95_A396EmprCod ;
   private String[] T01U911_A396EmprCod ;
   private long[] T01U911_A30AlbProCod ;
   private String[] T01U912_A396EmprCod ;
   private long[] T01U912_A30AlbProCod ;
   private String[] T01U94_A1253EmprGuiRem ;
   private long[] T01U94_A30AlbProCod ;
   private byte[] T01U94_A5805AlbEnvFtp ;
   private String[] T01U94_A7101AlbLic ;
   private java.util.Date[] T01U94_A34AlbProfch ;
   private String[] T01U94_A2242AlbSec ;
   private byte[] T01U94_A914AlbPObsCon ;
   private byte[] T01U94_A33AlbProEst ;
   private int[] T01U94_A1243GuiRemCli ;
   private String[] T01U94_A396EmprCod ;
   private String[] T01U916_A1244GuiRemCln ;
   private String[] T01U917_A396EmprCod ;
   private long[] T01U917_A30AlbProCod ;
   private byte[] T01U917_A12185DltLinObs ;
   private String[] T01U918_A396EmprCod ;
   private long[] T01U918_A30AlbProCod ;
   private int[] T01U918_A12176DltHdr ;
   private byte[] T01U918_A12177DltR ;
   private String[] T01U918_A12178DltP ;
   private String[] T01U919_A396EmprCod ;
   private long[] T01U919_A30AlbProCod ;
   private String[] T01U919_A7540Alb_NFisca ;
   private String[] T01U920_A396EmprCod ;
   private long[] T01U920_A30AlbProCod ;
   private int[] T01U920_A129BarCod ;
   private byte[] T01U920_A132BarCodReo ;
   private String[] T01U920_A130BarCodPar ;
   private String[] T01U922_A396EmprCod ;
   private long[] T01U922_A30AlbProCod ;
   private long[] T01U923_A30AlbProCod ;
   private byte[] T01U923_A915AlbPObsLin ;
   private String[] T01U923_A916AlbPObs ;
   private String[] T01U923_A396EmprCod ;
   private String[] T01U924_A396EmprCod ;
   private long[] T01U924_A30AlbProCod ;
   private byte[] T01U924_A915AlbPObsLin ;
   private long[] T01U93_A30AlbProCod ;
   private byte[] T01U93_A915AlbPObsLin ;
   private String[] T01U93_A916AlbPObs ;
   private String[] T01U93_A396EmprCod ;
   private long[] T01U92_A30AlbProCod ;
   private byte[] T01U92_A915AlbPObsLin ;
   private String[] T01U92_A916AlbPObs ;
   private String[] T01U92_A396EmprCod ;
   private String[] T01U928_A396EmprCod ;
   private long[] T01U928_A30AlbProCod ;
   private byte[] T01U928_A915AlbPObsLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV13TrnContextAtt ;
}

final  class documentodetransporteproduccion_12__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_12__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_12__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_12__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentodetransporteproduccion_12__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01U92", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?  FOR UPDATE OF AlbPObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U93", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U94", "SELECT EmprGuiRem, AlbProCod, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, AlbPObsCon, AlbProEst, GuiRemCli, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF EmprGuiRem, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, AlbPObsCon, AlbProEst, GuiRemCli NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U95", "SELECT EmprGuiRem, AlbProCod, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, AlbPObsCon, AlbProEst, GuiRemCli, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U96", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U97", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U98", "SELECT /*+ FIRST_ROWS(100) */ TM1.EmprGuiRem AS EmprGuiRem, TM1.AlbProCod, T3.EmprNom, TM1.AlbEnvFtp, TM1.AlbLic, T2.CliNom AS GuiRemCln, TM1.AlbProfch, TM1.AlbSec, TM1.AlbPObsCon, TM1.AlbProEst, TM1.GuiRemCli AS GuiRemCli, TM1.EmprCod FROM ((TXPCALPRD TM1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = TM1.EmprGuiRem AND T2.CliCod = TM1.GuiRemCli) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U99", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U910", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U911", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( EmprCod > ? or EmprCod = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U912", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( EmprCod < ? or EmprCod = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01U913", "INSERT INTO TXPCALPRD(EmprGuiRem, AlbProCod, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, AlbPObsCon, AlbProEst, GuiRemCli, EmprCod, AlbProPri, GuiRemDom, AlbDomEnv, TrnCod, AlbProEso, AlbProEnt, AlbDivTCod, AlbDivCod, AlbHorSal, AlbLocCar, AlbLocDes, AlbMat, AlbCliDes, AlbFecSal, AlbProBon, AlbProTBo, AlbMarca, AlbTipCal, AlbKilRea, AlbUsu, AlbOComp, AlbMarCo, AlbNumT, AlbDesp, AlbMotTr, AlbTipDoc, AlbCambio, AlbColCa, AlbObsCb, AlbProNroF, AlbDomEv, AlbFmd, ALbFmdc, AlbHhfm, AlbGrossT, AlbProAT, AlbTrnNm, AlbTrnDm, AlbTrnNc, AlbIvaCod, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01U914", "UPDATE TXPCALPRD SET EmprGuiRem=?, AlbEnvFtp=?, AlbLic=?, AlbProfch=?, AlbSec=?, AlbPObsCon=?, AlbProEst=?, GuiRemCli=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01U915", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01U916", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U917", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U918", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U919", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01U920", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01U921", "UPDATE TXPCALPRD SET AlbPObsCon=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01U922", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U923", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? and AlbPObsLin = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01U924", "SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01U925", "INSERT INTO TXPOBSALB(AlbProCod, AlbPObsLin, AlbPObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("T01U926", "UPDATE TXPOBSALB SET AlbPObs=?  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("T01U927", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new ForEachCursor("T01U928", "SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 20);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 20);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 19 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 23 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 50);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

