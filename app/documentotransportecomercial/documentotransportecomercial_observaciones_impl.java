package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_observaciones_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A252CliCod) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8AlbComCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbComCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Documento Transporte Comercial_Observaciones", ""), (short)(0)) ;
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
      A2385AlbCObsCon = (byte)(GXutil.lval( httpContext.GetPar( "AlbCObsCon"))) ;
      n2385AlbCObsCon = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
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

   public documentotransportecomercial_observaciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransportecomercial_observaciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_observaciones_impl.class ));
   }

   public documentotransportecomercial_observaciones_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComCod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbComCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbComFch_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbComFch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbComFch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbComFch_Internalname, localUtil.format(A17AlbComFch, "99/99/99"), localUtil.format( A17AlbComFch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbComFch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbComFch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbComFch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbComFch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV15Pgmname), GXutil.rtrim( localUtil.format( AV15Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_Observaciones.htm");
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

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol43( ) ;
      nGXsfl_43_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount324 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_324 = (short)(1) ;
            scanStart1UC324( ) ;
            while ( RcdFound324 != 0 )
            {
               init_level_properties324( ) ;
               getByPrimaryKey1UC324( ) ;
               addRow1UC324( ) ;
               scanNext1UC324( ) ;
            }
            scanEnd1UC324( ) ;
            nBlankRcdCount324 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2385AlbCObsCon = A2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
         standaloneNotModal1UC324( ) ;
         standaloneModal1UC324( ) ;
         sMode324 = Gx_mode ;
         while ( nGXsfl_43_idx < nRC_GXsfl_43 )
         {
            bGXsfl_43_Refreshing = true ;
            readRow1UC324( ) ;
            edtAlbCObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOBSLIN_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            edtAlbCObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOBS_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbCObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCObs_Enabled), 5, 0), !bGXsfl_43_Refreshing);
            if ( ( nRcdExists_324 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UC324( ) ;
            }
            sendRow1UC324( ) ;
            bGXsfl_43_Refreshing = false ;
         }
         Gx_mode = sMode324 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2385AlbCObsCon = B2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount324 = (short)(5) ;
         nRcdExists_324 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UC324( ) ;
            while ( RcdFound324 != 0 )
            {
               sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_43324( ) ;
               init_level_properties324( ) ;
               standaloneNotModal1UC324( ) ;
               getByPrimaryKey1UC324( ) ;
               standaloneModal1UC324( ) ;
               addRow1UC324( ) ;
               scanNext1UC324( ) ;
            }
            scanEnd1UC324( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode324 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_43324( ) ;
         initAll1UC324( ) ;
         init_level_properties324( ) ;
         B2385AlbCObsCon = A2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
         nRcdExists_324 = (short)(0) ;
         nIsMod_324 = (short)(0) ;
         nRcdDeleted_324 = (short)(0) ;
         nBlankRcdCount324 = (short)(nBlankRcdUsr324+nBlankRcdCount324) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount324 > 0 )
         {
            standaloneNotModal1UC324( ) ;
            standaloneModal1UC324( ) ;
            addRow1UC324( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbCObsLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount324 = (short)(nBlankRcdCount324-1) ;
         }
         Gx_mode = sMode324 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2385AlbCObsCon = B2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
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
      e111UC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z14AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2385AlbCObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2385AlbCObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z17AlbComFch = localUtil.ctod( httpContext.cgiGet( "Z17AlbComFch"), 0) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2385AlbCObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2385AlbCObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2385AlbCObsCon = false ;
            O2385AlbCObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "O2385AlbCObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2385AlbCObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBCOBSCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A17AlbComFch = localUtil.ctod( httpContext.cgiGet( edtAlbComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
            AV15Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Observaciones");
            A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            forbiddenHiddens.add("AlbComCod", localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
            AV15Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV15Pgmname, "")));
            A17AlbComFch = localUtil.ctod( httpContext.cgiGet( edtAlbComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
            forbiddenHiddens.add("AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A14AlbComCod != Z14AlbComCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("documentotransportecomercial\\documentotransportecomercial_observaciones:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A14AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
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
                  sMode1 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UC0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "ALBCOMCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbComCod_Internalname ;
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
                        e111UC2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UC2 ();
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
         e121UC2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UC1( ) ;
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
         disableAttributes1UC1( ) ;
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

   public void confirm_1UC0( )
   {
      beforeValidate1UC1( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UC1( ) ;
         }
         else
         {
            checkExtendedTable1UC1( ) ;
            closeExtendedTableCursors1UC1( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1 = Gx_mode ;
         confirm_1UC324( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1UC324( )
   {
      s2385AlbCObsCon = O2385AlbCObsCon ;
      n2385AlbCObsCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      nGXsfl_43_idx = 0 ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         readRow1UC324( ) ;
         if ( ( nRcdExists_324 != 0 ) || ( nIsMod_324 != 0 ) )
         {
            getKey1UC324( ) ;
            if ( ( nRcdExists_324 == 0 ) && ( nRcdDeleted_324 == 0 ) )
            {
               if ( RcdFound324 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UC324( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UC324( ) ;
                     closeExtendedTableCursors1UC324( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2385AlbCObsCon = A2385AlbCObsCon ;
                     n2385AlbCObsCon = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBCOBSLIN_" + sGXsfl_43_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbCObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound324 != 0 )
               {
                  if ( nRcdDeleted_324 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UC324( ) ;
                     load1UC324( ) ;
                     beforeValidate1UC324( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UC324( ) ;
                        O2385AlbCObsCon = A2385AlbCObsCon ;
                        n2385AlbCObsCon = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_324 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UC324( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UC324( ) ;
                           closeExtendedTableCursors1UC324( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2385AlbCObsCon = A2385AlbCObsCon ;
                           n2385AlbCObsCon = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_324 == 0 )
                  {
                     GXCCtl = "ALBCOBSLIN_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbCObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbCObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2386AlbCObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCObs_Internalname, GXutil.rtrim( A2384AlbCObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2386AlbCObsLin_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z2386AlbCObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2384AlbCObs_"+sGXsfl_43_idx, GXutil.rtrim( Z2384AlbCObs)) ;
         httpContext.changePostValue( "nRcdDeleted_324_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_324_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_324_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_324 != 0 )
         {
            httpContext.changePostValue( "ALBCOBSLIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOBS_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2385AlbCObsCon = s2385AlbCObsCon ;
      n2385AlbCObsCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1UC0( )
   {
   }

   public void e111UC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransportecomercial_observaciones_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV17Emprnom ;
      GXv_char4[0] = AV18Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransportecomercial_observaciones_impl.this.AV7EmprCod = GXv_char2[0] ;
      documentotransportecomercial_observaciones_impl.this.AV17Emprnom = GXv_char3[0] ;
      documentotransportecomercial_observaciones_impl.this.AV18Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprnom", AV17Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV18Usurcod", AV18Usurcod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV10TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV15Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV19GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GXV1), 8, 0));
         while ( AV19GXV1 <= AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV13TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV10TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV19GXV1));
            if ( GXutil.strcmp(AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV12Insert_CliCod = (int)(GXutil.lval( AV13TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Insert_CliCod), 6, 0));
            }
            AV19GXV1 = (int)(AV19GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GXV1), 8, 0));
         }
      }
   }

   public void e121UC2( )
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

   public void zm1UC1( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2385AlbCObsCon = T01UC5_A2385AlbCObsCon[0] ;
            Z17AlbComFch = T01UC5_A17AlbComFch[0] ;
            Z252CliCod = T01UC5_A252CliCod[0] ;
         }
         else
         {
            Z2385AlbCObsCon = A2385AlbCObsCon ;
            Z17AlbComFch = A17AlbComFch ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z14AlbComCod = A14AlbComCod ;
         Z2385AlbCObsCon = A2385AlbCObsCon ;
         Z17AlbComFch = A17AlbComFch ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFch_Enabled), 5, 0), true);
      AV15Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Observaciones" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFch_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UC6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UC6_A407EmprNom[0] ;
      n407EmprNom = T01UC6_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (0==AV8AlbComCod) )
      {
         A14AlbComCod = AV8AlbComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV12Insert_CliCod) )
      {
         A252CliCod = AV12Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
         /* Using cursor T01UC7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01UC7_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(5);
      }
   }

   public void load1UC1( )
   {
      /* Using cursor T01UC8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A2385AlbCObsCon = T01UC8_A2385AlbCObsCon[0] ;
         n2385AlbCObsCon = T01UC8_n2385AlbCObsCon[0] ;
         A407EmprNom = T01UC8_A407EmprNom[0] ;
         n407EmprNom = T01UC8_n407EmprNom[0] ;
         A279CliNom = T01UC8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A17AlbComFch = T01UC8_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A252CliCod = T01UC8_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1UC1( -13) ;
      }
      pr_default.close(6);
      onLoadActions1UC1( ) ;
   }

   public void onLoadActions1UC1( )
   {
   }

   public void checkExtendedTable1UC1( )
   {
      nIsDirty_1 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01UC7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01UC7_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1UC1( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01UC9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01UC9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1UC1( )
   {
      /* Using cursor T01UC10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1 = (short)(1) ;
      }
      else
      {
         RcdFound1 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UC5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1UC1( 13) ;
         RcdFound1 = (short)(1) ;
         A14AlbComCod = T01UC5_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         A2385AlbCObsCon = T01UC5_A2385AlbCObsCon[0] ;
         n2385AlbCObsCon = T01UC5_n2385AlbCObsCon[0] ;
         A17AlbComFch = T01UC5_A17AlbComFch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
         A396EmprCod = T01UC5_A396EmprCod[0] ;
         A252CliCod = T01UC5_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         O2385AlbCObsCon = A2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UC1( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1 = (short)(0) ;
            initializeNonKey1UC1( ) ;
         }
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1 = (short)(0) ;
         initializeNonKey1UC1( ) ;
         sMode1 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1UC1( ) ;
      if ( RcdFound1 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T01UC11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UC11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UC11_A14AlbComCod[0] < A14AlbComCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UC11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UC11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UC11_A14AlbComCod[0] > A14AlbComCod ) ) )
         {
            A396EmprCod = T01UC11_A396EmprCod[0] ;
            A14AlbComCod = T01UC11_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1 = (short)(0) ;
      /* Using cursor T01UC12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A14AlbComCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01UC12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UC12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UC12_A14AlbComCod[0] > A14AlbComCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01UC12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UC12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UC12_A14AlbComCod[0] < A14AlbComCod ) ) )
         {
            A396EmprCod = T01UC12_A396EmprCod[0] ;
            A14AlbComCod = T01UC12_A14AlbComCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
            RcdFound1 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UC1( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2385AlbCObsCon = O2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
         insert1UC1( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A14AlbComCod = Z14AlbComCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "ALBCOMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2385AlbCObsCon = O2385AlbCObsCon ;
               n2385AlbCObsCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A2385AlbCObsCon = O2385AlbCObsCon ;
               n2385AlbCObsCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
               update1UC1( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) )
            {
               /* Insert record */
               A2385AlbCObsCon = O2385AlbCObsCon ;
               n2385AlbCObsCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
               insert1UC1( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "ALBCOMCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A2385AlbCObsCon = O2385AlbCObsCon ;
                  n2385AlbCObsCon = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
                  insert1UC1( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A14AlbComCod != Z14AlbComCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14AlbComCod = Z14AlbComCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "ALBCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2385AlbCObsCon = O2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UC1( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UC4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z2385AlbCObsCon != T01UC4_A2385AlbCObsCon[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z17AlbComFch), GXutil.resetTime(T01UC4_A17AlbComFch[0])) ) || ( Z252CliCod != T01UC4_A252CliCod[0] ) )
         {
            if ( Z2385AlbCObsCon != T01UC4_A2385AlbCObsCon[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_observaciones:[seudo value changed for attri]"+"AlbCObsCon");
               GXutil.writeLogRaw("Old: ",Z2385AlbCObsCon);
               GXutil.writeLogRaw("Current: ",T01UC4_A2385AlbCObsCon[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z17AlbComFch), GXutil.resetTime(T01UC4_A17AlbComFch[0])) ) )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_observaciones:[seudo value changed for attri]"+"AlbComFch");
               GXutil.writeLogRaw("Old: ",Z17AlbComFch);
               GXutil.writeLogRaw("Current: ",T01UC4_A17AlbComFch[0]);
            }
            if ( Z252CliCod != T01UC4_A252CliCod[0] )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_observaciones:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01UC4_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UC1( )
   {
      beforeValidate1UC1( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UC1( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UC1( 0) ;
         checkOptimisticConcurrency1UC1( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UC1( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UC1( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UC13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A14AlbComCod), Boolean.valueOf(n2385AlbCObsCon), Byte.valueOf(A2385AlbCObsCon), A17AlbComFch, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
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
                        processLevel1UC1( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UC0( ) ;
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
            load1UC1( ) ;
         }
         endLevel1UC1( ) ;
      }
      closeExtendedTableCursors1UC1( ) ;
   }

   public void update1UC1( )
   {
      beforeValidate1UC1( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UC1( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UC1( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UC1( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UC1( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UC14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n2385AlbCObsCon), Byte.valueOf(A2385AlbCObsCon), A17AlbComFch, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A14AlbComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALCOM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UC1( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UC1( ) ;
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
         endLevel1UC1( ) ;
      }
      closeExtendedTableCursors1UC1( ) ;
   }

   public void deferredUpdate1UC1( )
   {
   }

   public void delete( )
   {
      beforeValidate1UC1( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UC1( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UC1( ) ;
         afterConfirm1UC1( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UC1( ) ;
            if ( AnyError == 0 )
            {
               A2385AlbCObsCon = O2385AlbCObsCon ;
               n2385AlbCObsCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
               scanStart1UC324( ) ;
               while ( RcdFound324 != 0 )
               {
                  getByPrimaryKey1UC324( ) ;
                  delete1UC324( ) ;
                  scanNext1UC324( ) ;
                  O2385AlbCObsCon = A2385AlbCObsCon ;
                  n2385AlbCObsCon = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
               }
               scanEnd1UC324( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UC15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
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
      sMode1 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UC1( ) ;
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UC1( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UC16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01UC16_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UC17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1UC324( )
   {
      s2385AlbCObsCon = O2385AlbCObsCon ;
      n2385AlbCObsCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      nGXsfl_43_idx = 0 ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         readRow1UC324( ) ;
         if ( ( nRcdExists_324 != 0 ) || ( nIsMod_324 != 0 ) )
         {
            standaloneNotModal1UC324( ) ;
            getKey1UC324( ) ;
            if ( ( nRcdExists_324 == 0 ) && ( nRcdDeleted_324 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UC324( ) ;
            }
            else
            {
               if ( RcdFound324 != 0 )
               {
                  if ( ( nRcdDeleted_324 != 0 ) && ( nRcdExists_324 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UC324( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_324 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UC324( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_324 == 0 )
                  {
                     GXCCtl = "ALBCOBSLIN_" + sGXsfl_43_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbCObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2385AlbCObsCon = A2385AlbCObsCon ;
            n2385AlbCObsCon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
         }
         httpContext.changePostValue( edtAlbCObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2386AlbCObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbCObs_Internalname, GXutil.rtrim( A2384AlbCObs)) ;
         httpContext.changePostValue( "ZT_"+"Z2386AlbCObsLin_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( Z2386AlbCObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2384AlbCObs_"+sGXsfl_43_idx, GXutil.rtrim( Z2384AlbCObs)) ;
         httpContext.changePostValue( "nRcdDeleted_324_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_324_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_324_"+sGXsfl_43_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_324 != 0 )
         {
            httpContext.changePostValue( "ALBCOBSLIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBCOBS_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1UC324( ) ;
      if ( AnyError != 0 )
      {
         O2385AlbCObsCon = s2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      }
      nRcdExists_324 = (short)(0) ;
      nIsMod_324 = (short)(0) ;
      nRcdDeleted_324 = (short)(0) ;
   }

   public void processLevel1UC1( )
   {
      /* Save parent mode. */
      sMode1 = Gx_mode ;
      processNestedLevel1UC324( ) ;
      if ( AnyError != 0 )
      {
         O2385AlbCObsCon = s2385AlbCObsCon ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01UC18 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n2385AlbCObsCon), Byte.valueOf(A2385AlbCObsCon), A396EmprCod, Integer.valueOf(A14AlbComCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALCOM");
   }

   public void endLevel1UC1( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1UC1( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_observaciones");
         if ( AnyError == 0 )
         {
            confirmValues1UC0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "documentotransportecomercial.documentotransportecomercial_observaciones");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UC1( )
   {
      /* Scan By routine */
      /* Using cursor T01UC19 */
      pr_default.execute(17);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A396EmprCod = T01UC19_A396EmprCod[0] ;
         A14AlbComCod = T01UC19_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UC1( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1 = (short)(1) ;
         A396EmprCod = T01UC19_A396EmprCod[0] ;
         A14AlbComCod = T01UC19_A14AlbComCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      }
   }

   public void scanEnd1UC1( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1UC1( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UC1( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UC1( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UC1( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UC1( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UC1( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UC1( )
   {
      edtAlbComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbComFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComFch_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1UC324( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2384AlbCObs = T01UC3_A2384AlbCObs[0] ;
         }
         else
         {
            Z2384AlbCObs = A2384AlbCObs ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z14AlbComCod = A14AlbComCod ;
         Z2386AlbCObsLin = A2386AlbCObsLin ;
         Z2384AlbCObs = A2384AlbCObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1UC324( )
   {
   }

   public void standaloneModal1UC324( )
   {
      if ( isIns( )  )
      {
         A2385AlbCObsCon = (byte)(O2385AlbCObsCon+1) ;
         n2385AlbCObsCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A2386AlbCObsLin = A2385AlbCObsCon ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbCObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbCObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
      else
      {
         edtAlbCObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbCObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      }
   }

   public void load1UC324( )
   {
      /* Using cursor T01UC20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Byte.valueOf(A2386AlbCObsLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound324 = (short)(1) ;
         A2384AlbCObs = T01UC20_A2384AlbCObs[0] ;
         n2384AlbCObs = T01UC20_n2384AlbCObs[0] ;
         zm1UC324( -16) ;
      }
      pr_default.close(18);
      onLoadActions1UC324( ) ;
   }

   public void onLoadActions1UC324( )
   {
   }

   public void checkExtendedTable1UC324( )
   {
      nIsDirty_324 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1UC324( ) ;
   }

   public void closeExtendedTableCursors1UC324( )
   {
   }

   public void enableDisable1UC324( )
   {
   }

   public void getKey1UC324( )
   {
      /* Using cursor T01UC21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Byte.valueOf(A2386AlbCObsLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound324 = (short)(1) ;
      }
      else
      {
         RcdFound324 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1UC324( )
   {
      /* Using cursor T01UC3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Byte.valueOf(A2386AlbCObsLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UC324( 16) ;
         RcdFound324 = (short)(1) ;
         initializeNonKey1UC324( ) ;
         A2386AlbCObsLin = T01UC3_A2386AlbCObsLin[0] ;
         A2384AlbCObs = T01UC3_A2384AlbCObs[0] ;
         n2384AlbCObs = T01UC3_n2384AlbCObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z14AlbComCod = A14AlbComCod ;
         Z2386AlbCObsLin = A2386AlbCObsLin ;
         sMode324 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UC324( ) ;
         Gx_mode = sMode324 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound324 = (short)(0) ;
         initializeNonKey1UC324( ) ;
         sMode324 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UC324( ) ;
         Gx_mode = sMode324 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UC324( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UC324( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UC2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Byte.valueOf(A2386AlbCObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z2384AlbCObs, T01UC2_A2384AlbCObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z2384AlbCObs, T01UC2_A2384AlbCObs[0]) != 0 )
            {
               GXutil.writeLogln("documentotransportecomercial.documentotransportecomercial_observaciones:[seudo value changed for attri]"+"AlbCObs");
               GXutil.writeLogRaw("Old: ",Z2384AlbCObs);
               GXutil.writeLogRaw("Current: ",T01UC2_A2384AlbCObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSALC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UC324( )
   {
      beforeValidate1UC324( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UC324( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UC324( 0) ;
         checkOptimisticConcurrency1UC324( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UC324( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UC324( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UC22 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A14AlbComCod), Byte.valueOf(A2386AlbCObsLin), Boolean.valueOf(n2384AlbCObs), A2384AlbCObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALC");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1UC324( ) ;
         }
         endLevel1UC324( ) ;
      }
      closeExtendedTableCursors1UC324( ) ;
   }

   public void update1UC324( )
   {
      beforeValidate1UC324( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UC324( ) ;
      }
      if ( ( nIsMod_324 != 0 ) || ( nIsDirty_324 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UC324( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UC324( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UC324( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01UC23 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n2384AlbCObs), A2384AlbCObs, A396EmprCod, Integer.valueOf(A14AlbComCod), Byte.valueOf(A2386AlbCObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALC");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1UC324( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UC324( ) ;
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
            endLevel1UC324( ) ;
         }
      }
      closeExtendedTableCursors1UC324( ) ;
   }

   public void deferredUpdate1UC324( )
   {
   }

   public void delete1UC324( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UC324( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UC324( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UC324( ) ;
         afterConfirm1UC324( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UC324( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UC24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod), Byte.valueOf(A2386AlbCObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALC");
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
      sMode324 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UC324( ) ;
      Gx_mode = sMode324 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UC324( )
   {
      standaloneModal1UC324( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1UC324( )
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

   public void scanStart1UC324( )
   {
      /* Scan By routine */
      /* Using cursor T01UC25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A14AlbComCod)});
      RcdFound324 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound324 = (short)(1) ;
         A2386AlbCObsLin = T01UC25_A2386AlbCObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UC324( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound324 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound324 = (short)(1) ;
         A2386AlbCObsLin = T01UC25_A2386AlbCObsLin[0] ;
      }
   }

   public void scanEnd1UC324( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1UC324( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UC324( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UC324( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UC324( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UC324( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UC324( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UC324( )
   {
      edtAlbCObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbCObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCObs_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void send_integrity_lvl_hashes1UC324( )
   {
   }

   public void send_integrity_lvl_hashes1UC1( )
   {
   }

   public void subsflControlProps_43324( )
   {
      edtAlbCObsLin_Internalname = "ALBCOBSLIN_"+sGXsfl_43_idx ;
      edtAlbCObs_Internalname = "ALBCOBS_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_43324( )
   {
      edtAlbCObsLin_Internalname = "ALBCOBSLIN_"+sGXsfl_43_fel_idx ;
      edtAlbCObs_Internalname = "ALBCOBS_"+sGXsfl_43_fel_idx ;
   }

   public void addRow1UC324( )
   {
      nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43324( ) ;
      sendRow1UC324( ) ;
   }

   public void sendRow1UC324( )
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
         if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_324_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "WWActionColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2386AlbCObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2386AlbCObsLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCObsLin_Jsonclick,Integer.valueOf(0),"WWActionColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbCObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_324_" + sGXsfl_43_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_43_idx + "',43)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCObs_Internalname,GXutil.rtrim( A2384AlbCObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCObs_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbCObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1UC324( ) ;
      GXCCtl = "Z2386AlbCObsLin_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2386AlbCObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2384AlbCObs_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2384AlbCObs));
      GXCCtl = "nRcdDeleted_324_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_324_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_324_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_324, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vALBCOMCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_43_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOBSLIN_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOBS_"+sGXsfl_43_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1UC324( )
   {
      nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43324( ) ;
      edtAlbCObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOBSLIN_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbCObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBCOBS_"+sGXsfl_43_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbCObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbCObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBCOBSLIN_" + sGXsfl_43_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbCObsLin_Internalname ;
         wbErr = true ;
         A2386AlbCObsLin = (byte)(0) ;
      }
      else
      {
         A2386AlbCObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbCObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2384AlbCObs = httpContext.cgiGet( edtAlbCObs_Internalname) ;
      n2384AlbCObs = false ;
      GXCCtl = "Z2386AlbCObsLin_" + sGXsfl_43_idx ;
      Z2386AlbCObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2384AlbCObs_" + sGXsfl_43_idx ;
      Z2384AlbCObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_324_" + sGXsfl_43_idx ;
      nRcdDeleted_324 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_324_" + sGXsfl_43_idx ;
      nRcdExists_324 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_324_" + sGXsfl_43_idx ;
      nIsMod_324 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbCObsLin_Enabled = edtAlbCObsLin_Enabled ;
   }

   public void confirmValues1UC0( )
   {
      nGXsfl_43_idx = 0 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_43324( ) ;
      while ( nGXsfl_43_idx < nRC_GXsfl_43 )
      {
         nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_43324( ) ;
         httpContext.changePostValue( "Z2386AlbCObsLin_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z2386AlbCObsLin_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2386AlbCObsLin_"+sGXsfl_43_idx) ;
         httpContext.changePostValue( "Z2384AlbCObs_"+sGXsfl_43_idx, httpContext.cgiGet( "ZT_"+"Z2384AlbCObs_"+sGXsfl_43_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2384AlbCObs_"+sGXsfl_43_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransportecomercial.documentotransportecomercial_observaciones", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbComCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbComCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_Observaciones");
      forbiddenHiddens.add("AlbComCod", localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV15Pgmname, "")));
      forbiddenHiddens.add("AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransportecomercial\\documentotransportecomercial_observaciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14AlbComCod", GXutil.ltrim( localUtil.ntoc( Z14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2385AlbCObsCon", GXutil.ltrim( localUtil.ntoc( Z2385AlbCObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z17AlbComFch", localUtil.dtoc( Z17AlbComFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O2385AlbCObsCon", GXutil.ltrim( localUtil.ntoc( O2385AlbCObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV8AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBCOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8AlbComCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV12Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOBSCON", GXutil.ltrim( localUtil.ntoc( A2385AlbCObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.documentotransportecomercial.documentotransportecomercial_observaciones", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8AlbComCod,8,0))}, new String[] {"Gx_mode","EmprCod","AlbComCod"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteComercial.DocumentoTransporteComercial_Observaciones" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Documento Transporte Comercial_Observaciones", "") ;
   }

   public void initializeNonKey1UC1( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A2385AlbCObsCon = (byte)(0) ;
      n2385AlbCObsCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A17AlbComFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A17AlbComFch", localUtil.format(A17AlbComFch, "99/99/99"));
      O2385AlbCObsCon = A2385AlbCObsCon ;
      n2385AlbCObsCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
      Z2385AlbCObsCon = (byte)(0) ;
      Z17AlbComFch = GXutil.nullDate() ;
      Z252CliCod = 0 ;
   }

   public void initAll1UC1( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A14AlbComCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14AlbComCod), 8, 0));
      initializeNonKey1UC1( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UC324( )
   {
      A2384AlbCObs = "" ;
      n2384AlbCObs = false ;
      Z2384AlbCObs = "" ;
   }

   public void initAll1UC324( )
   {
      A2386AlbCObsLin = (byte)(0) ;
      initializeNonKey1UC324( ) ;
   }

   public void standaloneModalInsert1UC324( )
   {
      A2385AlbCObsCon = i2385AlbCObsCon ;
      n2385AlbCObsCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2385AlbCObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2385AlbCObsCon), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610230", true, true);
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
      httpContext.AddJavascriptSource("documentotransportecomercial/documentotransportecomercial_observaciones.js", "?20268211610231", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties324( )
   {
      edtAlbCObsLin_Enabled = defedtAlbCObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCObsLin_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void startgridcontrol43( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2386AlbCObsLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A2384AlbCObs));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbCObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbComCod_Internalname = "ALBCOMCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbComFch_Internalname = "ALBCOMFCH" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbCObsLin_Internalname = "ALBCOBSLIN" ;
      edtAlbCObs_Internalname = "ALBCOBS" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Documento Transporte Comercial_Observaciones", "") );
      edtAlbCObs_Jsonclick = "" ;
      edtAlbCObsLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtAlbCObs_Enabled = 1 ;
      edtAlbCObsLin_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbComFch_Jsonclick = "" ;
      edtAlbComFch_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtAlbComCod_Jsonclick = "" ;
      edtAlbComCod_Enabled = 0 ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_43324( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UC324( ) ;
         standaloneModal1UC324( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UC324( ) ;
         nGXsfl_43_idx = (int)(nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_43324( ) ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01UC16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01UC16_A279CliNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV15Pgmname',fld:'vPGMNAME',pic:''},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UC2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMCOD","{handler:'valid_Albcomcod',iparms:[]");
      setEventMetadata("VALID_ALBCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_ALBCOBSLIN","{handler:'valid_Albcobslin',iparms:[]");
      setEventMetadata("VALID_ALBCOBSLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albcobs',iparms:[]");
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
      Z17AlbComFch = GXutil.nullDate() ;
      Z2384AlbCObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A279CliNom = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV15Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode324 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A2384AlbCObs = "" ;
      AV16Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV17Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV18Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV13TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T01UC6_A407EmprNom = new String[] {""} ;
      T01UC6_n407EmprNom = new boolean[] {false} ;
      T01UC7_A279CliNom = new String[] {""} ;
      T01UC8_A14AlbComCod = new int[1] ;
      T01UC8_A2385AlbCObsCon = new byte[1] ;
      T01UC8_n2385AlbCObsCon = new boolean[] {false} ;
      T01UC8_A407EmprNom = new String[] {""} ;
      T01UC8_n407EmprNom = new boolean[] {false} ;
      T01UC8_A279CliNom = new String[] {""} ;
      T01UC8_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UC8_A396EmprCod = new String[] {""} ;
      T01UC8_A252CliCod = new int[1] ;
      T01UC9_A279CliNom = new String[] {""} ;
      T01UC10_A396EmprCod = new String[] {""} ;
      T01UC10_A14AlbComCod = new int[1] ;
      T01UC5_A14AlbComCod = new int[1] ;
      T01UC5_A2385AlbCObsCon = new byte[1] ;
      T01UC5_n2385AlbCObsCon = new boolean[] {false} ;
      T01UC5_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UC5_A396EmprCod = new String[] {""} ;
      T01UC5_A252CliCod = new int[1] ;
      T01UC11_A396EmprCod = new String[] {""} ;
      T01UC11_A14AlbComCod = new int[1] ;
      T01UC12_A396EmprCod = new String[] {""} ;
      T01UC12_A14AlbComCod = new int[1] ;
      T01UC4_A14AlbComCod = new int[1] ;
      T01UC4_A2385AlbCObsCon = new byte[1] ;
      T01UC4_n2385AlbCObsCon = new boolean[] {false} ;
      T01UC4_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01UC4_A396EmprCod = new String[] {""} ;
      T01UC4_A252CliCod = new int[1] ;
      T01UC16_A279CliNom = new String[] {""} ;
      T01UC17_A396EmprCod = new String[] {""} ;
      T01UC17_A14AlbComCod = new int[1] ;
      T01UC17_A20AlbComLin = new short[1] ;
      T01UC19_A396EmprCod = new String[] {""} ;
      T01UC19_A14AlbComCod = new int[1] ;
      T01UC20_A14AlbComCod = new int[1] ;
      T01UC20_A2386AlbCObsLin = new byte[1] ;
      T01UC20_A2384AlbCObs = new String[] {""} ;
      T01UC20_n2384AlbCObs = new boolean[] {false} ;
      T01UC20_A396EmprCod = new String[] {""} ;
      T01UC21_A396EmprCod = new String[] {""} ;
      T01UC21_A14AlbComCod = new int[1] ;
      T01UC21_A2386AlbCObsLin = new byte[1] ;
      T01UC3_A14AlbComCod = new int[1] ;
      T01UC3_A2386AlbCObsLin = new byte[1] ;
      T01UC3_A2384AlbCObs = new String[] {""} ;
      T01UC3_n2384AlbCObs = new boolean[] {false} ;
      T01UC3_A396EmprCod = new String[] {""} ;
      T01UC2_A14AlbComCod = new int[1] ;
      T01UC2_A2386AlbCObsLin = new byte[1] ;
      T01UC2_A2384AlbCObs = new String[] {""} ;
      T01UC2_n2384AlbCObs = new boolean[] {false} ;
      T01UC2_A396EmprCod = new String[] {""} ;
      T01UC25_A396EmprCod = new String[] {""} ;
      T01UC25_A14AlbComCod = new int[1] ;
      T01UC25_A2386AlbCObsLin = new byte[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_observaciones__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_observaciones__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_observaciones__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_observaciones__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_observaciones__default(),
         new Object[] {
             new Object[] {
            T01UC2_A14AlbComCod, T01UC2_A2386AlbCObsLin, T01UC2_A2384AlbCObs, T01UC2_n2384AlbCObs, T01UC2_A396EmprCod
            }
            , new Object[] {
            T01UC3_A14AlbComCod, T01UC3_A2386AlbCObsLin, T01UC3_A2384AlbCObs, T01UC3_n2384AlbCObs, T01UC3_A396EmprCod
            }
            , new Object[] {
            T01UC4_A14AlbComCod, T01UC4_A2385AlbCObsCon, T01UC4_n2385AlbCObsCon, T01UC4_A17AlbComFch, T01UC4_A396EmprCod, T01UC4_A252CliCod
            }
            , new Object[] {
            T01UC5_A14AlbComCod, T01UC5_A2385AlbCObsCon, T01UC5_n2385AlbCObsCon, T01UC5_A17AlbComFch, T01UC5_A396EmprCod, T01UC5_A252CliCod
            }
            , new Object[] {
            T01UC6_A407EmprNom, T01UC6_n407EmprNom
            }
            , new Object[] {
            T01UC7_A279CliNom
            }
            , new Object[] {
            T01UC8_A14AlbComCod, T01UC8_A2385AlbCObsCon, T01UC8_n2385AlbCObsCon, T01UC8_A407EmprNom, T01UC8_n407EmprNom, T01UC8_A279CliNom, T01UC8_A17AlbComFch, T01UC8_A396EmprCod, T01UC8_A252CliCod
            }
            , new Object[] {
            T01UC9_A279CliNom
            }
            , new Object[] {
            T01UC10_A396EmprCod, T01UC10_A14AlbComCod
            }
            , new Object[] {
            T01UC11_A396EmprCod, T01UC11_A14AlbComCod
            }
            , new Object[] {
            T01UC12_A396EmprCod, T01UC12_A14AlbComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UC16_A279CliNom
            }
            , new Object[] {
            T01UC17_A396EmprCod, T01UC17_A14AlbComCod, T01UC17_A20AlbComLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01UC19_A396EmprCod, T01UC19_A14AlbComCod
            }
            , new Object[] {
            T01UC20_A14AlbComCod, T01UC20_A2386AlbCObsLin, T01UC20_A2384AlbCObs, T01UC20_n2384AlbCObs, T01UC20_A396EmprCod
            }
            , new Object[] {
            T01UC21_A396EmprCod, T01UC21_A14AlbComCod, T01UC21_A2386AlbCObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UC25_A396EmprCod, T01UC25_A14AlbComCod, T01UC25_A2386AlbCObsLin
            }
         }
      );
      AV15Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_Observaciones" ;
   }

   private byte Z2385AlbCObsCon ;
   private byte O2385AlbCObsCon ;
   private byte Z2386AlbCObsLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A2385AlbCObsCon ;
   private byte Gx_BScreen ;
   private byte B2385AlbCObsCon ;
   private byte s2385AlbCObsCon ;
   private byte A2386AlbCObsLin ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2385AlbCObsCon ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_324 ;
   private short nRcdExists_324 ;
   private short nIsMod_324 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount324 ;
   private short RcdFound324 ;
   private short nBlankRcdUsr324 ;
   private short RcdFound1 ;
   private short nIsDirty_1 ;
   private short nIsDirty_324 ;
   private int wcpOAV8AlbComCod ;
   private int Z14AlbComCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int A252CliCod ;
   private int AV8AlbComCod ;
   private int trnEnded ;
   private int A14AlbComCod ;
   private int edtAlbComCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbComFch_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtAlbCObsLin_Enabled ;
   private int edtAlbCObs_Enabled ;
   private int fRowAdded ;
   private int AV12Insert_CliCod ;
   private int Datamonjs_Gxcontroltype ;
   private int AV19GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtAlbCObsLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z2384AlbCObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
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
   private String edtAlbComCod_Internalname ;
   private String edtAlbComCod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbComFch_Internalname ;
   private String edtAlbComFch_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV15Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sMode324 ;
   private String edtAlbCObsLin_Internalname ;
   private String edtAlbCObs_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A2384AlbCObs ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17Emprnom ;
   private String GXv_char3[] ;
   private String AV18Usurcod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtAlbCObsLin_Jsonclick ;
   private String edtAlbCObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private java.util.Date Z17AlbComFch ;
   private java.util.Date A17AlbComFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n2385AlbCObsCon ;
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
   private boolean n2384AlbCObs ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UC6_A407EmprNom ;
   private boolean[] T01UC6_n407EmprNom ;
   private String[] T01UC7_A279CliNom ;
   private int[] T01UC8_A14AlbComCod ;
   private byte[] T01UC8_A2385AlbCObsCon ;
   private boolean[] T01UC8_n2385AlbCObsCon ;
   private String[] T01UC8_A407EmprNom ;
   private boolean[] T01UC8_n407EmprNom ;
   private String[] T01UC8_A279CliNom ;
   private java.util.Date[] T01UC8_A17AlbComFch ;
   private String[] T01UC8_A396EmprCod ;
   private int[] T01UC8_A252CliCod ;
   private String[] T01UC9_A279CliNom ;
   private String[] T01UC10_A396EmprCod ;
   private int[] T01UC10_A14AlbComCod ;
   private int[] T01UC5_A14AlbComCod ;
   private byte[] T01UC5_A2385AlbCObsCon ;
   private boolean[] T01UC5_n2385AlbCObsCon ;
   private java.util.Date[] T01UC5_A17AlbComFch ;
   private String[] T01UC5_A396EmprCod ;
   private int[] T01UC5_A252CliCod ;
   private String[] T01UC11_A396EmprCod ;
   private int[] T01UC11_A14AlbComCod ;
   private String[] T01UC12_A396EmprCod ;
   private int[] T01UC12_A14AlbComCod ;
   private int[] T01UC4_A14AlbComCod ;
   private byte[] T01UC4_A2385AlbCObsCon ;
   private boolean[] T01UC4_n2385AlbCObsCon ;
   private java.util.Date[] T01UC4_A17AlbComFch ;
   private String[] T01UC4_A396EmprCod ;
   private int[] T01UC4_A252CliCod ;
   private String[] T01UC16_A279CliNom ;
   private String[] T01UC17_A396EmprCod ;
   private int[] T01UC17_A14AlbComCod ;
   private short[] T01UC17_A20AlbComLin ;
   private String[] T01UC19_A396EmprCod ;
   private int[] T01UC19_A14AlbComCod ;
   private int[] T01UC20_A14AlbComCod ;
   private byte[] T01UC20_A2386AlbCObsLin ;
   private String[] T01UC20_A2384AlbCObs ;
   private boolean[] T01UC20_n2384AlbCObs ;
   private String[] T01UC20_A396EmprCod ;
   private String[] T01UC21_A396EmprCod ;
   private int[] T01UC21_A14AlbComCod ;
   private byte[] T01UC21_A2386AlbCObsLin ;
   private int[] T01UC3_A14AlbComCod ;
   private byte[] T01UC3_A2386AlbCObsLin ;
   private String[] T01UC3_A2384AlbCObs ;
   private boolean[] T01UC3_n2384AlbCObs ;
   private String[] T01UC3_A396EmprCod ;
   private int[] T01UC2_A14AlbComCod ;
   private byte[] T01UC2_A2386AlbCObsLin ;
   private String[] T01UC2_A2384AlbCObs ;
   private boolean[] T01UC2_n2384AlbCObs ;
   private String[] T01UC2_A396EmprCod ;
   private String[] T01UC25_A396EmprCod ;
   private int[] T01UC25_A14AlbComCod ;
   private byte[] T01UC25_A2386AlbCObsLin ;
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

final  class documentotransportecomercial_observaciones__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_observaciones__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_observaciones__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_observaciones__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class documentotransportecomercial_observaciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UC2", "SELECT AlbComCod, AlbCObsLin, AlbCObs, EmprCod FROM TXPOBSALC WHERE EmprCod = ? AND AlbComCod = ? AND AlbCObsLin = ?  FOR UPDATE OF AlbCObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC3", "SELECT AlbComCod, AlbCObsLin, AlbCObs, EmprCod FROM TXPOBSALC WHERE EmprCod = ? AND AlbComCod = ? AND AlbCObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC4", "SELECT AlbComCod, AlbCObsCon, AlbComFch, EmprCod, CliCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ?  FOR UPDATE OF AlbCObsCon, AlbComFch, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC5", "SELECT AlbComCod, AlbCObsCon, AlbComFch, EmprCod, CliCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC7", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC8", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbComCod, TM1.AlbCObsCon, T2.EmprNom, T3.CliNom, TM1.AlbComFch, TM1.EmprCod, TM1.CliCod FROM ((TXPCALCOM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.AlbComCod = ? ORDER BY TM1.EmprCod, TM1.AlbComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND AlbComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE ( EmprCod > ? or EmprCod = ? and AlbComCod > ?) ORDER BY EmprCod, AlbComCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UC12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbComCod FROM TXPCALCOM WHERE ( EmprCod < ? or EmprCod = ? and AlbComCod < ?) ORDER BY EmprCod DESC, AlbComCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UC13", "INSERT INTO TXPCALCOM(AlbComCod, AlbCObsCon, AlbComFch, EmprCod, CliCod, AlbComPri, AlbComEst, AlbComLiC, AlbComEso, AlbCSec, AlcDivTCod, AlcDivCod, TrnCod, AlbComHor, AlbComMat, AlcDomEnv, AlbComFs, AlbComFd, AlbComFdD, AlbComSt, AlbComEAT, AlbComID, AlbComAT, AlcIvaCod, AlbCTrNm, AlbCTrDm, AlbCTrNc, AlbComATCU, AlbComSerA, AlbComTipA) VALUES(?, ?, ?, ?, ?, ' ', 0, 0, 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPCALCOM")
         ,new UpdateCursor("T01UC14", "UPDATE TXPCALCOM SET AlbCObsCon=?, AlbComFch=?, CliCod=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new UpdateCursor("T01UC15", "DELETE FROM TXPCALCOM  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new ForEachCursor("T01UC16", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC17", "SELECT * FROM (SELECT EmprCod, AlbComCod, AlbComLin FROM TXPLALCOM WHERE EmprCod = ? AND AlbComCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UC18", "UPDATE TXPCALCOM SET AlbCObsCon=?  WHERE EmprCod = ? AND AlbComCod = ?", GX_NOMASK, "TXPCALCOM")
         ,new ForEachCursor("T01UC19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbComCod FROM TXPCALCOM ORDER BY EmprCod, AlbComCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC20", "SELECT AlbComCod, AlbCObsLin, AlbCObs, EmprCod FROM TXPOBSALC WHERE EmprCod = ? and AlbComCod = ? and AlbCObsLin = ? ORDER BY EmprCod, AlbComCod, AlbCObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UC21", "SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? AND AlbComCod = ? AND AlbCObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UC22", "INSERT INTO TXPOBSALC(AlbComCod, AlbCObsLin, AlbCObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSALC")
         ,new UpdateCursor("T01UC23", "UPDATE TXPOBSALC SET AlbCObs=?  WHERE EmprCod = ? AND AlbComCod = ? AND AlbCObsLin = ?", GX_NOMASK, "TXPOBSALC")
         ,new UpdateCursor("T01UC24", "DELETE FROM TXPOBSALC  WHERE EmprCod = ? AND AlbComCod = ? AND AlbCObsLin = ?", GX_NOMASK, "TXPOBSALC")
         ,new ForEachCursor("T01UC25", "SELECT EmprCod, AlbComCod, AlbCObsLin FROM TXPOBSALC WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod, AlbCObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setDate(2, (java.util.Date)parms[2]);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 50);
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 50);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

