package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordrr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action21") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_21_16H1233( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A9425OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9446OMRepCod = (int)(GXutil.lval( httpContext.GetPar( "OMRepCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A9446OMRepCod) ;
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
            AV21EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21EmprCod, "@!"))));
            AV14OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OMCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14OMCod), "ZZZZZZZ9")));
            A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
            A9427OMMaqDsc = httpContext.GetPar( "OMMaqDsc") ;
            n9427OMMaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Res Repuestos,Orden de trabajo", ""), (short)(0)) ;
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
      nRC_GXsfl_44 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_44"))) ;
      nGXsfl_44_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_44_idx"))) ;
      sGXsfl_44_idx = httpContext.GetPar( "sGXsfl_44_idx") ;
      edtOMRepCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Horizontalalignment", edtOMRepCod_Horizontalalignment, !bGXsfl_44_Refreshing);
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

   public tmordrr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordrr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordrr_impl.class ));
   }

   public tmordrr_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMEst = new HTMLChoice();
      cmbOMRTpo = new HTMLChoice();
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
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMCod_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdRR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMaqCod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdRR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMaqDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdRR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbOMEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbOMEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMOrdRR.htm");
      cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMRRCosT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMRRCosT_Internalname, httpContext.getMessage( "Coste Total Reser.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMRRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMRRCosT_Enabled!=0) ? localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999") : localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMRRCosT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMRRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdRR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdRR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdRR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdRR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV31Pgmname), GXutil.rtrim( localUtil.format( AV31Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdRR.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_omrepcod.setProperty("Caption", Combo_omrepcod_Caption);
      ucCombo_omrepcod.setProperty("Cls", Combo_omrepcod_Cls);
      ucCombo_omrepcod.setProperty("IsGridItem", Combo_omrepcod_Isgriditem);
      ucCombo_omrepcod.setProperty("EmptyItem", Combo_omrepcod_Emptyitem);
      ucCombo_omrepcod.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
      ucCombo_omrepcod.setProperty("DropDownOptionsData", AV27OMRepCod_Data);
      ucCombo_omrepcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_omrepcod_Internalname, "COMBO_OMREPCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol44( ) ;
      nGXsfl_44_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1233 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1233 = (short)(1) ;
            scanStart16H1233( ) ;
            while ( RcdFound1233 != 0 )
            {
               init_level_properties1233( ) ;
               getByPrimaryKey16H1233( ) ;
               addRow16H1233( ) ;
               scanNext16H1233( ) ;
            }
            scanEnd16H1233( ) ;
            nBlankRcdCount1233 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9444OMRRCosT = A9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         standaloneNotModal16H1233( ) ;
         standaloneModal16H1233( ) ;
         sMode1233 = Gx_mode ;
         while ( nGXsfl_44_idx < nRC_GXsfl_44 )
         {
            bGXsfl_44_Refreshing = true ;
            readRow16H1233( ) ;
            edtOMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPCOD_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMRepCod_Horizontalalignment = httpContext.cgiGet( "OMREPCOD_"+sGXsfl_44_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Horizontalalignment", edtOMRepCod_Horizontalalignment, !bGXsfl_44_Refreshing);
            cmbOMRTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_44_Refreshing);
            edtOMRObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMROBS_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRObs_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCNT_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCnt_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMRRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRPRE_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMRRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCOS_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMRRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCos_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            if ( ( nRcdExists_1233 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16H1233( ) ;
            }
            sendRow16H1233( ) ;
            bGXsfl_44_Refreshing = false ;
         }
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9444OMRRCosT = B9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1233 = (short)(5) ;
         nRcdExists_1233 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16H1233( ) ;
            while ( RcdFound1233 != 0 )
            {
               sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_441233( ) ;
               init_level_properties1233( ) ;
               standaloneNotModal16H1233( ) ;
               getByPrimaryKey16H1233( ) ;
               standaloneModal16H1233( ) ;
               addRow16H1233( ) ;
               scanNext16H1233( ) ;
            }
            scanEnd16H1233( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1233 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_441233( ) ;
         initAll16H1233( ) ;
         init_level_properties1233( ) ;
         B9444OMRRCosT = A9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         nRcdExists_1233 = (short)(0) ;
         nIsMod_1233 = (short)(0) ;
         nRcdDeleted_1233 = (short)(0) ;
         nBlankRcdCount1233 = (short)(nBlankRcdUsr1233+nBlankRcdCount1233) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1233 > 0 )
         {
            standaloneNotModal16H1233( ) ;
            standaloneModal16H1233( ) ;
            addRow16H1233( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtOMRepCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1233 = (short)(nBlankRcdCount1233-1) ;
         }
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9444OMRRCosT = B9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
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
      e1116H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV29DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOMREPCOD_DATA"), AV27OMRepCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9425OMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9445OMEst = httpContext.cgiGet( "Z9445OMEst") ;
            O9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( "O9444OMRRCosT")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV14OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25Insert_OMMaqCod = httpContext.cgiGet( "vINSERT_OMMAQCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( "OMRCCNT")) ;
            A9453OMRCPre = localUtil.ctond( httpContext.cgiGet( "OMRCPRE")) ;
            A9454OMRCCos = localUtil.ctond( httpContext.cgiGet( "OMRCCOS")) ;
            A9448OMRepPre = localUtil.ctond( httpContext.cgiGet( "OMREPPRE")) ;
            n9448OMRepPre = false ;
            AV16oOMRRCnt = localUtil.ctond( httpContext.cgiGet( "vOOMRRCNT")) ;
            AV19nOMRRCnt = localUtil.ctond( httpContext.cgiGet( "vNOMRRCNT")) ;
            AV20ServerNow = localUtil.ctot( httpContext.cgiGet( "vSERVERNOW"), 0) ;
            AV18MTMovNom = httpContext.cgiGet( "vMTMOVNOM") ;
            AV17MTMovCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMTMOVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9447OMRepNom = httpContext.cgiGet( "OMREPNOM") ;
            n9447OMRepNom = false ;
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
            Combo_omrepcod_Objectcall = httpContext.cgiGet( "COMBO_OMREPCOD_Objectcall") ;
            Combo_omrepcod_Class = httpContext.cgiGet( "COMBO_OMREPCOD_Class") ;
            Combo_omrepcod_Icontype = httpContext.cgiGet( "COMBO_OMREPCOD_Icontype") ;
            Combo_omrepcod_Icon = httpContext.cgiGet( "COMBO_OMREPCOD_Icon") ;
            Combo_omrepcod_Caption = httpContext.cgiGet( "COMBO_OMREPCOD_Caption") ;
            Combo_omrepcod_Tooltip = httpContext.cgiGet( "COMBO_OMREPCOD_Tooltip") ;
            Combo_omrepcod_Cls = httpContext.cgiGet( "COMBO_OMREPCOD_Cls") ;
            Combo_omrepcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_OMREPCOD_Selectedvalue_set") ;
            Combo_omrepcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_OMREPCOD_Selectedvalue_get") ;
            Combo_omrepcod_Selectedtext_set = httpContext.cgiGet( "COMBO_OMREPCOD_Selectedtext_set") ;
            Combo_omrepcod_Selectedtext_get = httpContext.cgiGet( "COMBO_OMREPCOD_Selectedtext_get") ;
            Combo_omrepcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_OMREPCOD_Gamoauthtoken") ;
            Combo_omrepcod_Ddointernalname = httpContext.cgiGet( "COMBO_OMREPCOD_Ddointernalname") ;
            Combo_omrepcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_OMREPCOD_Titlecontrolalign") ;
            Combo_omrepcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_OMREPCOD_Dropdownoptionstype") ;
            Combo_omrepcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Enabled")) ;
            Combo_omrepcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Visible")) ;
            Combo_omrepcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_OMREPCOD_Titlecontrolidtoreplace") ;
            Combo_omrepcod_Datalisttype = httpContext.cgiGet( "COMBO_OMREPCOD_Datalisttype") ;
            Combo_omrepcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Allowmultipleselection")) ;
            Combo_omrepcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_OMREPCOD_Datalistfixedvalues") ;
            Combo_omrepcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Isgriditem")) ;
            Combo_omrepcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Hasdescription")) ;
            Combo_omrepcod_Datalistproc = httpContext.cgiGet( "COMBO_OMREPCOD_Datalistproc") ;
            Combo_omrepcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_OMREPCOD_Datalistprocparametersprefix") ;
            Combo_omrepcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_OMREPCOD_Remoteservicesparameters") ;
            Combo_omrepcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_OMREPCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_omrepcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Includeonlyselectedoption")) ;
            Combo_omrepcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Includeselectalloption")) ;
            Combo_omrepcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Emptyitem")) ;
            Combo_omrepcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMREPCOD_Includeaddnewoption")) ;
            Combo_omrepcod_Htmltemplate = httpContext.cgiGet( "COMBO_OMREPCOD_Htmltemplate") ;
            Combo_omrepcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_OMREPCOD_Multiplevaluestype") ;
            Combo_omrepcod_Loadingdata = httpContext.cgiGet( "COMBO_OMREPCOD_Loadingdata") ;
            Combo_omrepcod_Noresultsfound = httpContext.cgiGet( "COMBO_OMREPCOD_Noresultsfound") ;
            Combo_omrepcod_Emptyitemtext = httpContext.cgiGet( "COMBO_OMREPCOD_Emptyitemtext") ;
            Combo_omrepcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_OMREPCOD_Onlyselectedvalues") ;
            Combo_omrepcod_Selectalltext = httpContext.cgiGet( "COMBO_OMREPCOD_Selectalltext") ;
            Combo_omrepcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_OMREPCOD_Multiplevaluesseparator") ;
            Combo_omrepcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_OMREPCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
            A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
            n9427OMMaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
            cmbOMEst.setName( cmbOMEst.getInternalname() );
            cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            AV31Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdRR");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV31Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV31Pgmname, "")));
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A9425OMCod != Z9425OMCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmordrr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
                  sMode1232 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1232 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1232 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_16H0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "OMCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMCod_Internalname ;
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
                        e1116H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1216H2 ();
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
         e1216H2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll16H1232( ) ;
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
         disableAttributes16H1232( ) ;
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

   public void confirm_16H0( )
   {
      beforeValidate16H1232( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16H1232( ) ;
         }
         else
         {
            checkExtendedTable16H1232( ) ;
            closeExtendedTableCursors16H1232( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1232 = Gx_mode ;
         confirm_16H1233( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1232 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_16H1233( )
   {
      s9444OMRRCosT = O9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      nGXsfl_44_idx = 0 ;
      while ( nGXsfl_44_idx < nRC_GXsfl_44 )
      {
         readRow16H1233( ) ;
         if ( ( nRcdExists_1233 != 0 ) || ( nIsMod_1233 != 0 ) )
         {
            getKey16H1233( ) ;
            if ( ( nRcdExists_1233 == 0 ) && ( nRcdDeleted_1233 == 0 ) )
            {
               if ( RcdFound1233 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16H1233( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16H1233( ) ;
                     closeExtendedTableCursors16H1233( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9444OMRRCosT = A9444OMRRCosT ;
                     n9444OMRRCosT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMREPCOD_" + sGXsfl_44_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMRepCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1233 != 0 )
               {
                  if ( nRcdDeleted_1233 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16H1233( ) ;
                     load16H1233( ) ;
                     beforeValidate16H1233( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16H1233( ) ;
                        O9444OMRRCosT = A9444OMRRCosT ;
                        n9444OMRRCosT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1233 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16H1233( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16H1233( ) ;
                           closeExtendedTableCursors16H1233( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9444OMRRCosT = A9444OMRRCosT ;
                           n9444OMRRCosT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1233 == 0 )
                  {
                     GXCCtl = "OMREPCOD_" + sGXsfl_44_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMRTpo.getInternalname(), GXutil.rtrim( A9449OMRTpo)) ;
         httpContext.changePostValue( edtOMRObs_Internalname, GXutil.rtrim( A14496OMRObs)) ;
         httpContext.changePostValue( edtOMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_44_idx, GXutil.rtrim( Z9449OMRTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14496OMRObs_"+sGXsfl_44_idx, GXutil.rtrim( Z14496OMRObs)) ;
         httpContext.changePostValue( "T9450OMRRCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9471OMRRCos_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1233_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1233_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1233_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1233 != 0 )
         {
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_44_idx+"Horizontalalignment", GXutil.rtrim( edtOMRepCod_Horizontalalignment)) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMROBS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCNT_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCOS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9444OMRRCosT = s9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16H0( )
   {
   }

   public void e1116H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "OR", "") ;
      GXv_int3[0] = AV17MTMovCod ;
      GXv_char4[0] = AV18MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_char4) ;
      tmordrr_impl.this.A396EmprCod = GXv_char1[0] ;
      tmordrr_impl.this.AV17MTMovCod = GXv_int3[0] ;
      tmordrr_impl.this.AV18MTMovNom = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
      GXt_char5 = AV12Station ;
      GXv_char4[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmordrr_impl.this.GXt_char5 = GXv_char4[0] ;
      AV12Station = GXt_char5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV21EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char1[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char2, GXv_char1) ;
      tmordrr_impl.this.AV21EmprCod = GXv_char4[0] ;
      tmordrr_impl.this.AV11EmprNom = GXv_char2[0] ;
      tmordrr_impl.this.AV8UsurCod = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext6[0] = AV22WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext6) ;
      AV22WWPContext = GXv_SdtWWPContext6[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV29DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV29DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Combo_omrepcod_Titlecontrolidtoreplace = edtOMRepCod_Internalname ;
      ucCombo_omrepcod.sendProperty(context, "", false, Combo_omrepcod_Internalname, "TitleControlIdToReplace", Combo_omrepcod_Titlecontrolidtoreplace);
      edtOMRepCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Horizontalalignment", edtOMRepCod_Horizontalalignment, !bGXsfl_44_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOOMREPCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV23TrnContext.fromxml(AV24WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV23TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV31Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV32GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GXV1), 8, 0));
         while ( AV32GXV1 <= AV23TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV26TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV23TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV32GXV1));
            if ( GXutil.strcmp(AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "OMMaqCod") == 0 )
            {
               AV25Insert_OMMaqCod = AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Insert_OMMaqCod", AV25Insert_OMMaqCod);
            }
            AV32GXV1 = (int)(AV32GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GXV1), 8, 0));
         }
      }
   }

   public void e1216H2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOOMREPCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = AV27OMRepCod_Data ;
      GXv_char4[0] = AV28ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item10[0] = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
      new app.mantenimientomaquina.tmordrrloaddvcombo(remoteHandle, context).execute( "OMRepCod", Gx_mode, AV21EmprCod, AV14OMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item10) ;
      tmordrr_impl.this.AV28ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = GXv_objcol_SdtDVB_SDTComboData_Item10[0] ;
      AV27OMRepCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   }

   public void zm16H1232( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9445OMEst = T016H6_A9445OMEst[0] ;
         }
         else
         {
            Z9445OMEst = A9445OMEst ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z9426OMMaqCod = A9426OMMaqCod ;
         Z9425OMCod = A9425OMCod ;
         Z9445OMEst = A9445OMEst ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z9427OMMaqDsc = A9427OMMaqDsc ;
         Z9444OMRRCosT = A9444OMRRCosT ;
      }
   }

   public void standaloneNotModal( )
   {
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      AV31Pgmname = "MantenimientoMaquina.TMOrdRR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV21EmprCod)==0) )
      {
         A396EmprCod = AV21EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T016H7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016H7_A407EmprNom[0] ;
      n407EmprNom = T016H7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV14OMCod) )
      {
         A9425OMCod = AV14OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      /* Using cursor T016H8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
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
         /* Using cursor T016H10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A9444OMRRCosT = T016H10_A9444OMRRCosT[0] ;
            n9444OMRRCosT = T016H10_n9444OMRRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         O9444OMRRCosT = A9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         pr_default.close(7);
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_OMMaqCod)==0) )
         {
            A9426OMMaqCod = AV25Insert_OMMaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         }
      }
   }

   public void load16H1232( )
   {
      /* Using cursor T016H12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A9426OMMaqCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A407EmprNom = T016H12_A407EmprNom[0] ;
         n407EmprNom = T016H12_n407EmprNom[0] ;
         A9445OMEst = T016H12_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9444OMRRCosT = T016H12_A9444OMRRCosT[0] ;
         n9444OMRRCosT = T016H12_n9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         zm16H1232( -22) ;
      }
      pr_default.close(8);
      onLoadActions16H1232( ) ;
   }

   public void onLoadActions16H1232( )
   {
      O9444OMRRCosT = A9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_OMMaqCod)==0) )
      {
         A9426OMMaqCod = AV25Insert_OMMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      }
   }

   public void checkExtendedTable16H1232( )
   {
      nIsDirty_1232 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_OMMaqCod)==0) )
      {
         nIsDirty_1232 = (short)(1) ;
         A9426OMMaqCod = AV25Insert_OMMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      }
      /* Using cursor T016H10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A9444OMRRCosT = T016H10_A9444OMRRCosT[0] ;
         n9444OMRRCosT = T016H10_n9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         nIsDirty_1232 = (short)(1) ;
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors16H1232( )
   {
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_25( String A396EmprCod ,
                          int A9425OMCod )
   {
      /* Using cursor T016H14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A9444OMRRCosT = T016H14_A9444OMRRCosT[0] ;
         n9444OMRRCosT = T016H14_n9444OMRRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey16H1232( )
   {
      /* Using cursor T016H15 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      else
      {
         RcdFound1232 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016H6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T016H6_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) && ( GXutil.strcmp(T016H6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16H1232( 22) ;
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T016H6_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9445OMEst = T016H6_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load16H1232( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1232 = (short)(0) ;
            initializeNonKey16H1232( ) ;
         }
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1232 = (short)(0) ;
         initializeNonKey16H1232( ) ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16H1232( ) ;
      if ( RcdFound1232 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T016H16 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T016H16_A9425OMCod[0] < A9425OMCod ) ) && ( GXutil.strcmp(T016H16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T016H16_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T016H16_A9425OMCod[0] > A9425OMCod ) ) && ( GXutil.strcmp(T016H16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T016H16_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
         {
            A9425OMCod = T016H16_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T016H17 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T016H17_A9425OMCod[0] > A9425OMCod ) ) && ( GXutil.strcmp(T016H17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T016H17_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T016H17_A9425OMCod[0] < A9425OMCod ) ) && ( GXutil.strcmp(T016H17_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T016H17_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
         {
            A9425OMCod = T016H17_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16H1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9444OMRRCosT = O9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         insert16H1232( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1232 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               A9425OMCod = Z9425OMCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "OMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9444OMRRCosT = O9444OMRRCosT ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A9444OMRRCosT = O9444OMRRCosT ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               update16H1232( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               /* Insert record */
               A9444OMRRCosT = O9444OMRRCosT ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               insert16H1232( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "OMCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A9444OMRRCosT = O9444OMRRCosT ;
                  n9444OMRRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
                  insert16H1232( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
      {
         A9425OMCod = Z9425OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "OMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9444OMRRCosT = O9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency16H1232( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016H5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z9445OMEst, T016H5_A9445OMEst[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9445OMEst, T016H5_A9445OMEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordrr:[seudo value changed for attri]"+"OMEst");
               GXutil.writeLogRaw("Old: ",Z9445OMEst);
               GXutil.writeLogRaw("Current: ",T016H5_A9445OMEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMORDEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16H1232( )
   {
      beforeValidate16H1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16H1232( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16H1232( 0) ;
         checkOptimisticConcurrency16H1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16H1232( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16H1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016H18 */
                  pr_default.execute(13, new Object[] {A9426OMMaqCod, Integer.valueOf(A9425OMCod), A9445OMEst, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel16H1232( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16H0( ) ;
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
            load16H1232( ) ;
         }
         endLevel16H1232( ) ;
      }
      closeExtendedTableCursors16H1232( ) ;
   }

   public void update16H1232( )
   {
      beforeValidate16H1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16H1232( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16H1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16H1232( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16H1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016H19 */
                  pr_default.execute(14, new Object[] {A9426OMMaqCod, A9445OMEst, A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16H1232( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16H1232( ) ;
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
         endLevel16H1232( ) ;
      }
      closeExtendedTableCursors16H1232( ) ;
   }

   public void deferredUpdate16H1232( )
   {
   }

   public void delete( )
   {
      beforeValidate16H1232( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16H1232( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16H1232( ) ;
         afterConfirm16H1232( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16H1232( ) ;
            if ( AnyError == 0 )
            {
               A9444OMRRCosT = O9444OMRRCosT ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               scanStart16H1233( ) ;
               while ( RcdFound1233 != 0 )
               {
                  getByPrimaryKey16H1233( ) ;
                  delete16H1233( ) ;
                  scanNext16H1233( ) ;
                  O9444OMRRCosT = A9444OMRRCosT ;
                  n9444OMRRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               }
               scanEnd16H1233( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016H20 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
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
      sMode1232 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16H1232( ) ;
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16H1232( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016H22 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            A9444OMRRCosT = T016H22_A9444OMRRCosT[0] ;
            n9444OMRRCosT = T016H22_n9444OMRRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T016H23 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Equipos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T016H24 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T016H25 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MO de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevel16H1233( )
   {
      s9444OMRRCosT = O9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      nGXsfl_44_idx = 0 ;
      while ( nGXsfl_44_idx < nRC_GXsfl_44 )
      {
         readRow16H1233( ) ;
         if ( ( nRcdExists_1233 != 0 ) || ( nIsMod_1233 != 0 ) )
         {
            standaloneNotModal16H1233( ) ;
            getKey16H1233( ) ;
            if ( ( nRcdExists_1233 == 0 ) && ( nRcdDeleted_1233 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16H1233( ) ;
            }
            else
            {
               if ( RcdFound1233 != 0 )
               {
                  if ( ( nRcdDeleted_1233 != 0 ) && ( nRcdExists_1233 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16H1233( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1233 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16H1233( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1233 == 0 )
                  {
                     GXCCtl = "OMREPCOD_" + sGXsfl_44_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9444OMRRCosT = A9444OMRRCosT ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         httpContext.changePostValue( edtOMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMRTpo.getInternalname(), GXutil.rtrim( A9449OMRTpo)) ;
         httpContext.changePostValue( edtOMRObs_Internalname, GXutil.rtrim( A14496OMRObs)) ;
         httpContext.changePostValue( edtOMRRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMRRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_44_idx, GXutil.rtrim( Z9449OMRTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14496OMRObs_"+sGXsfl_44_idx, GXutil.rtrim( Z14496OMRObs)) ;
         httpContext.changePostValue( "T9450OMRRCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9471OMRRCos_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1233_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1233_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1233_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1233 != 0 )
         {
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMREPCOD_"+sGXsfl_44_idx+"Horizontalalignment", GXutil.rtrim( edtOMRepCod_Horizontalalignment)) ;
            httpContext.changePostValue( "OMRTPO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMROBS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCNT_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMRRCOS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16H1233( ) ;
      if ( AnyError != 0 )
      {
         O9444OMRRCosT = s9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      nRcdExists_1233 = (short)(0) ;
      nIsMod_1233 = (short)(0) ;
      nRcdDeleted_1233 = (short)(0) ;
   }

   public void processLevel16H1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel16H1233( ) ;
      if ( AnyError != 0 )
      {
         O9444OMRRCosT = s9444OMRRCosT ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16H1232( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16H1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmordrr");
         if ( AnyError == 0 )
         {
            confirmValues16H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmordrr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16H1232( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A9426OMMaqCod = A9426OMMaqCod ;
      this.A9427OMMaqDsc = A9427OMMaqDsc ;
      /* Scan By routine */
      /* Using cursor T016H26 */
      pr_default.execute(20, new Object[] {A396EmprCod, A9426OMMaqCod});
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T016H26_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16H1232( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T016H26_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
   }

   public void scanEnd16H1232( )
   {
      pr_default.close(20);
   }

   public void afterConfirm16H1232( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16H1232( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16H1232( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16H1232( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16H1232( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16H1232( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16H1232( )
   {
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      edtOMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMRRCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCosT_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm16H1233( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9451OMRRPre = T016H3_A9451OMRRPre[0] ;
            Z9450OMRRCnt = T016H3_A9450OMRRCnt[0] ;
            Z9452OMRCCnt = T016H3_A9452OMRCCnt[0] ;
            Z9453OMRCPre = T016H3_A9453OMRCPre[0] ;
            Z14496OMRObs = T016H3_A14496OMRObs[0] ;
         }
         else
         {
            Z9451OMRRPre = A9451OMRRPre ;
            Z9450OMRRCnt = A9450OMRRCnt ;
            Z9452OMRCCnt = A9452OMRCCnt ;
            Z9453OMRCPre = A9453OMRCPre ;
            Z14496OMRObs = A14496OMRObs ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9449OMRTpo = A9449OMRTpo ;
         Z9451OMRRPre = A9451OMRRPre ;
         Z9450OMRRCnt = A9450OMRRCnt ;
         Z9452OMRCCnt = A9452OMRCCnt ;
         Z9453OMRCPre = A9453OMRCPre ;
         Z14496OMRObs = A14496OMRObs ;
         Z396EmprCod = A396EmprCod ;
         Z9446OMRepCod = A9446OMRepCod ;
         Z9447OMRepNom = A9447OMRepNom ;
         Z9448OMRepPre = A9448OMRepPre ;
      }
   }

   public void standaloneNotModal16H1233( )
   {
      cmbOMRTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_44_Refreshing);
      edtOMRRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
   }

   public void standaloneModal16H1233( )
   {
      if ( isIns( )  )
      {
         A9449OMRTpo = httpContext.getMessage( httpContext.getMessage( "R", ""), "") ;
      }
      A9454OMRCCos = A9452OMRCCnt.multiply(A9453OMRCPre) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9454OMRCCos", GXutil.ltrimstr( A9454OMRCCos, 12, 3));
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMRepCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      }
      else
      {
         edtOMRepCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      }
   }

   public void load16H1233( )
   {
      /* Using cursor T016H27 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9451OMRRPre = T016H27_A9451OMRRPre[0] ;
         A9447OMRepNom = T016H27_A9447OMRepNom[0] ;
         n9447OMRepNom = T016H27_n9447OMRepNom[0] ;
         A9448OMRepPre = T016H27_A9448OMRepPre[0] ;
         n9448OMRepPre = T016H27_n9448OMRepPre[0] ;
         A9450OMRRCnt = T016H27_A9450OMRRCnt[0] ;
         A9452OMRCCnt = T016H27_A9452OMRCCnt[0] ;
         A9453OMRCPre = T016H27_A9453OMRCPre[0] ;
         A14496OMRObs = T016H27_A14496OMRObs[0] ;
         zm16H1233( -26) ;
      }
      pr_default.close(21);
      onLoadActions16H1233( ) ;
   }

   public void onLoadActions16H1233( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
      O9471OMRRCos = A9471OMRRCos ;
      if ( isIns( )  )
      {
         A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
         }
      }
   }

   public void checkExtendedTable16H1233( )
   {
      nIsDirty_1233 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal16H1233( ) ;
      /* Using cursor T016H4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9447OMRepNom = T016H4_A9447OMRepNom[0] ;
      n9447OMRepNom = T016H4_n9447OMRepNom[0] ;
      A9448OMRepPre = T016H4_A9448OMRepPre[0] ;
      n9448OMRepPre = T016H4_n9448OMRepPre[0] ;
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1233 = (short)(1) ;
         A9451OMRRPre = A9448OMRepPre ;
      }
      nIsDirty_1233 = (short)(1) ;
      A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1233 = (short)(1) ;
         A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
         n9444OMRRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1233 = (short)(1) ;
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1233 = (short)(1) ;
               A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
         }
      }
   }

   public void closeExtendedTableCursors16H1233( )
   {
      pr_default.close(2);
   }

   public void enableDisable16H1233( )
   {
   }

   public void gxload_27( String A396EmprCod ,
                          int A9446OMRepCod )
   {
      /* Using cursor T016H28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9447OMRepNom = T016H28_A9447OMRepNom[0] ;
      n9447OMRepNom = T016H28_n9447OMRepNom[0] ;
      A9448OMRepPre = T016H28_A9448OMRepPre[0] ;
      n9448OMRepPre = T016H28_n9448OMRepPre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9447OMRepNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey16H1233( )
   {
      /* Using cursor T016H29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1233 = (short)(1) ;
      }
      else
      {
         RcdFound1233 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey16H1233( )
   {
      /* Using cursor T016H3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T016H3_A9449OMRTpo[0], "R") == 0 ) && ( GXutil.strcmp(T016H3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16H1233( 26) ;
         RcdFound1233 = (short)(1) ;
         initializeNonKey16H1233( ) ;
         A9449OMRTpo = T016H3_A9449OMRTpo[0] ;
         A9451OMRRPre = T016H3_A9451OMRRPre[0] ;
         A9450OMRRCnt = T016H3_A9450OMRRCnt[0] ;
         A9452OMRCCnt = T016H3_A9452OMRCCnt[0] ;
         A9453OMRCPre = T016H3_A9453OMRCPre[0] ;
         A14496OMRObs = T016H3_A14496OMRObs[0] ;
         A9446OMRepCod = T016H3_A9446OMRepCod[0] ;
         O9450OMRRCnt = A9450OMRRCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9446OMRepCod = A9446OMRepCod ;
         Z9449OMRTpo = A9449OMRTpo ;
         sMode1233 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load16H1233( ) ;
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1233 = (short)(0) ;
         initializeNonKey16H1233( ) ;
         sMode1233 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16H1233( ) ;
         Gx_mode = sMode1233 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16H1233( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16H1233( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016H2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrRep"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9451OMRRPre, T016H2_A9451OMRRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9450OMRRCnt, T016H2_A9450OMRRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9452OMRCCnt, T016H2_A9452OMRCCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9453OMRCPre, T016H2_A9453OMRCPre[0]) != 0 ) || ( GXutil.strcmp(Z14496OMRObs, T016H2_A14496OMRObs[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9451OMRRPre, T016H2_A9451OMRRPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordrr:[seudo value changed for attri]"+"OMRRPre");
               GXutil.writeLogRaw("Old: ",Z9451OMRRPre);
               GXutil.writeLogRaw("Current: ",T016H2_A9451OMRRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9450OMRRCnt, T016H2_A9450OMRRCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordrr:[seudo value changed for attri]"+"OMRRCnt");
               GXutil.writeLogRaw("Old: ",Z9450OMRRCnt);
               GXutil.writeLogRaw("Current: ",T016H2_A9450OMRRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9452OMRCCnt, T016H2_A9452OMRCCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordrr:[seudo value changed for attri]"+"OMRCCnt");
               GXutil.writeLogRaw("Old: ",Z9452OMRCCnt);
               GXutil.writeLogRaw("Current: ",T016H2_A9452OMRCCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9453OMRCPre, T016H2_A9453OMRCPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordrr:[seudo value changed for attri]"+"OMRCPre");
               GXutil.writeLogRaw("Old: ",Z9453OMRCPre);
               GXutil.writeLogRaw("Current: ",T016H2_A9453OMRCPre[0]);
            }
            if ( GXutil.strcmp(Z14496OMRObs, T016H2_A14496OMRObs[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordrr:[seudo value changed for attri]"+"OMRObs");
               GXutil.writeLogRaw("Old: ",Z14496OMRObs);
               GXutil.writeLogRaw("Current: ",T016H2_A14496OMRObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrRep"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16H1233( )
   {
      beforeValidate16H1233( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16H1233( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16H1233( 0) ;
         checkOptimisticConcurrency16H1233( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16H1233( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16H1233( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016H30 */
                  pr_default.execute(24, new Object[] {Integer.valueOf(A9425OMCod), A9449OMRTpo, A9451OMRRPre, A9450OMRRCnt, A9452OMRCCnt, A9453OMRCPre, A14496OMRObs, A396EmprCod, Integer.valueOf(A9446OMRepCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load16H1233( ) ;
         }
         endLevel16H1233( ) ;
      }
      closeExtendedTableCursors16H1233( ) ;
   }

   public void update16H1233( )
   {
      beforeValidate16H1233( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16H1233( ) ;
      }
      if ( ( nIsMod_1233 != 0 ) || ( nIsDirty_1233 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16H1233( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16H1233( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16H1233( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016H31 */
                     pr_default.execute(25, new Object[] {A9451OMRRPre, A9450OMRRCnt, A9452OMRCCnt, A9453OMRCPre, A14496OMRObs, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrRep"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16H1233( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16H1233( ) ;
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
            endLevel16H1233( ) ;
         }
      }
      closeExtendedTableCursors16H1233( ) ;
   }

   public void deferredUpdate16H1233( )
   {
   }

   public void delete16H1233( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16H1233( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16H1233( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16H1233( ) ;
         afterConfirm16H1233( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16H1233( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016H32 */
               pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9446OMRepCod), A9449OMRTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrRep");
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
      sMode1233 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16H1233( ) ;
      Gx_mode = sMode1233 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16H1233( )
   {
      standaloneModal16H1233( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016H33 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
         A9447OMRepNom = T016H33_A9447OMRepNom[0] ;
         n9447OMRepNom = T016H33_n9447OMRepNom[0] ;
         A9448OMRepPre = T016H33_A9448OMRepPre[0] ;
         n9448OMRepPre = T016H33_n9448OMRepPre[0] ;
         pr_default.close(27);
         A9471OMRRCos = A9450OMRRCnt.multiply(A9451OMRRPre) ;
         if ( isIns( )  )
         {
            A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos) ;
            n9444OMRRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9444OMRRCosT = O9444OMRRCosT.add(A9471OMRRCos).subtract(O9471OMRRCos) ;
               n9444OMRRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9444OMRRCosT = O9444OMRRCosT.subtract(O9471OMRRCos) ;
                  n9444OMRRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
               }
            }
         }
      }
   }

   public void endLevel16H1233( )
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

   public void scanStart16H1233( )
   {
      /* Scan By routine */
      /* Using cursor T016H34 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1233 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9446OMRepCod = T016H34_A9446OMRepCod[0] ;
         A9449OMRTpo = T016H34_A9449OMRTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16H1233( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1233 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1233 = (short)(1) ;
         A9446OMRepCod = T016H34_A9446OMRepCod[0] ;
         A9449OMRTpo = T016H34_A9449OMRTpo[0] ;
      }
   }

   public void scanEnd16H1233( )
   {
      pr_default.close(28);
   }

   public void afterConfirm16H1233( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ )
      {
         AV20ServerNow = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20ServerNow", localUtil.ttoc( AV20ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV16oOMRRCnt = O9450OMRRCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV19nOMRRCnt = A9450OMRRCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19nOMRRCnt", GXutil.ltrimstr( AV19nOMRRCnt, 12, 3));
      }
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int3[0] = A9425OMCod ;
         GXv_int11[0] = A9446OMRepCod ;
         GXv_int12[0] = AV17MTMovCod ;
         GXv_char2[0] = AV18MTMovNom ;
         GXv_int13[0] = (byte)(1) ;
         GXv_decimal14[0] = AV16oOMRRCnt ;
         GXv_decimal15[0] = A9450OMRRCnt ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime16[0] = AV20ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int3, GXv_int11, GXv_int12, GXv_char2, GXv_int13, GXv_decimal14, GXv_decimal15, GXv_char1, GXv_dtime16) ;
         tmordrr_impl.this.A396EmprCod = GXv_char4[0] ;
         tmordrr_impl.this.A9425OMCod = GXv_int3[0] ;
         tmordrr_impl.this.A9446OMRepCod = GXv_int11[0] ;
         tmordrr_impl.this.AV17MTMovCod = GXv_int12[0] ;
         tmordrr_impl.this.AV18MTMovNom = GXv_char2[0] ;
         tmordrr_impl.this.AV16oOMRRCnt = GXv_decimal14[0] ;
         tmordrr_impl.this.A9450OMRRCnt = GXv_decimal15[0] ;
         tmordrr_impl.this.AV20ServerNow = GXv_dtime16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV20ServerNow", localUtil.ttoc( AV20ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void beforeInsert16H1233( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16H1233( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16H1233( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16H1233( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16H1233( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16H1233( )
   {
      edtOMRepCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      cmbOMRTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_44_Refreshing);
      edtOMRObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRObs_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtOMRRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCnt_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtOMRRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtOMRRCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCos_Enabled), 5, 0), !bGXsfl_44_Refreshing);
   }

   public void send_integrity_lvl_hashes16H1233( )
   {
   }

   public void send_integrity_lvl_hashes16H1232( )
   {
   }

   public void subsflControlProps_441233( )
   {
      edtOMRepCod_Internalname = "OMREPCOD_"+sGXsfl_44_idx ;
      cmbOMRTpo.setInternalname( "OMRTPO_"+sGXsfl_44_idx );
      edtOMRObs_Internalname = "OMROBS_"+sGXsfl_44_idx ;
      edtOMRRCnt_Internalname = "OMRRCNT_"+sGXsfl_44_idx ;
      edtOMRRPre_Internalname = "OMRRPRE_"+sGXsfl_44_idx ;
      edtOMRRCos_Internalname = "OMRRCOS_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_441233( )
   {
      edtOMRepCod_Internalname = "OMREPCOD_"+sGXsfl_44_fel_idx ;
      cmbOMRTpo.setInternalname( "OMRTPO_"+sGXsfl_44_fel_idx );
      edtOMRObs_Internalname = "OMROBS_"+sGXsfl_44_fel_idx ;
      edtOMRRCnt_Internalname = "OMRRCNT_"+sGXsfl_44_fel_idx ;
      edtOMRRPre_Internalname = "OMRRPRE_"+sGXsfl_44_fel_idx ;
      edtOMRRCos_Internalname = "OMRRCOS_"+sGXsfl_44_fel_idx ;
   }

   public void addRow16H1233( )
   {
      nGXsfl_44_idx = (int)(nGXsfl_44_idx+1) ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_441233( ) ;
      sendRow16H1233( ) ;
   }

   public void sendRow16H1233( )
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
         if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_44_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_44_idx + "',44)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRepCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9446OMRepCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRepCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRepCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtOMRepCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "OMRTPO_" + sGXsfl_44_idx ;
      cmbOMRTpo.setName( GXCCtl );
      cmbOMRTpo.setWebtags( "" );
      cmbOMRTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMRTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9449OMRTpo)==0) )
         {
            A9449OMRTpo = "R" ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMRTpo,cmbOMRTpo.getInternalname(),GXutil.rtrim( A9449OMRTpo),Integer.valueOf(1),cmbOMRTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbOMRTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMRTpo.setValue( GXutil.rtrim( A9449OMRTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Values", cmbOMRTpo.ToJavascriptSource(), !bGXsfl_44_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_44_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_44_idx + "',44)\"" ;
      ROClassString = "TagColumn AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRObs_Internalname,GXutil.rtrim( A14496OMRObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRObs_Jsonclick,Integer.valueOf(0),"TagColumn AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1233_" + sGXsfl_44_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_44_idx + "',44)\"" ;
      ROClassString = "TagColumn AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRCnt_Enabled!=0) ? localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9450OMRRCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCnt_Jsonclick,Integer.valueOf(0),"TagColumn AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRPre_Enabled!=0) ? localUtil.format( A9451OMRRPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9451OMRRPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRPre_Jsonclick,Integer.valueOf(0),"TagColumn AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRRPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMRRCos_Enabled!=0) ? localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999") : localUtil.format( A9471OMRRCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMRRCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes16H1233( ) ;
      GXCCtl = "Z9446OMRepCod_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9446OMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9449OMRTpo_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9449OMRTpo));
      GXCCtl = "Z9451OMRRPre_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9451OMRRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9450OMRRCnt_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14496OMRObs_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14496OMRObs));
      GXCCtl = "O9450OMRRCnt_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9450OMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9471OMRRCos_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9471OMRRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1233_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1233_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1233_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1233, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV21EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "OMRCCOS_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPCOD_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPCOD_"+sGXsfl_44_idx+"Horizontalalignment", GXutil.rtrim( edtOMRepCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRTPO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMROBS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRCNT_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRRCOS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow16H1233( )
   {
      nGXsfl_44_idx = (int)(nGXsfl_44_idx+1) ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_441233( ) ;
      edtOMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMREPCOD_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRepCod_Horizontalalignment = httpContext.cgiGet( "OMREPCOD_"+sGXsfl_44_idx+"Horizontalalignment") ;
      cmbOMRTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMRTPO_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMRObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMROBS_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCNT_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRPRE_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMRRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMRRCOS_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "OMREPCOD_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
         wbErr = true ;
         A9446OMRepCod = 0 ;
      }
      else
      {
         A9446OMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      cmbOMRTpo.setName( cmbOMRTpo.getInternalname() );
      cmbOMRTpo.setValue( httpContext.cgiGet( cmbOMRTpo.getInternalname()) );
      A9449OMRTpo = httpContext.cgiGet( cmbOMRTpo.getInternalname()) ;
      A14496OMRObs = httpContext.cgiGet( edtOMRObs_Internalname) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMRRCNT_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRRCnt_Internalname ;
         wbErr = true ;
         A9450OMRRCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( edtOMRRCnt_Internalname)) ;
      }
      A9451OMRRPre = localUtil.ctond( httpContext.cgiGet( edtOMRRPre_Internalname)) ;
      A9471OMRRCos = localUtil.ctond( httpContext.cgiGet( edtOMRRCos_Internalname)) ;
      GXCCtl = "Z9446OMRepCod_" + sGXsfl_44_idx ;
      Z9446OMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9449OMRTpo_" + sGXsfl_44_idx ;
      Z9449OMRTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9451OMRRPre_" + sGXsfl_44_idx ;
      Z9451OMRRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9450OMRRCnt_" + sGXsfl_44_idx ;
      Z9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_44_idx ;
      Z9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_44_idx ;
      Z9453OMRCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14496OMRObs_" + sGXsfl_44_idx ;
      Z14496OMRObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9452OMRCCnt_" + sGXsfl_44_idx ;
      A9452OMRCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9453OMRCPre_" + sGXsfl_44_idx ;
      A9453OMRCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9450OMRRCnt_" + sGXsfl_44_idx ;
      O9450OMRRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9471OMRRCos_" + sGXsfl_44_idx ;
      O9471OMRRCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1233_" + sGXsfl_44_idx ;
      nRcdDeleted_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1233_" + sGXsfl_44_idx ;
      nRcdExists_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1233_" + sGXsfl_44_idx ;
      nIsMod_1233 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "OMRCCOS_" + sGXsfl_44_idx ;
      A9454OMRCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defedtOMRRPre_Enabled = edtOMRRPre_Enabled ;
      defcmbOMRTpo_Enabled = cmbOMRTpo.getEnabled() ;
      defedtOMRepCod_Enabled = edtOMRepCod_Enabled ;
   }

   public void confirmValues16H0( )
   {
      nGXsfl_44_idx = 0 ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_441233( ) ;
      while ( nGXsfl_44_idx < nRC_GXsfl_44 )
      {
         nGXsfl_44_idx = (int)(nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_441233( ) ;
         httpContext.changePostValue( "Z9446OMRepCod_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9446OMRepCod_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9446OMRepCod_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9449OMRTpo_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9449OMRTpo_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9449OMRTpo_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9451OMRRPre_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9451OMRRPre_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9451OMRRPre_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9450OMRRCnt_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9450OMRRCnt_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9452OMRCCnt_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9452OMRCCnt_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9453OMRCPre_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9453OMRCPre_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9453OMRCPre_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z14496OMRObs_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z14496OMRObs_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14496OMRObs_"+sGXsfl_44_idx) ;
      }
      httpContext.changePostValue( "O9450OMRRCnt", httpContext.cgiGet( "T9450OMRRCnt")) ;
      httpContext.deletePostValue( "T9450OMRRCnt") ;
      httpContext.changePostValue( "O9471OMRRCos", httpContext.cgiGet( "T9471OMRRCos")) ;
      httpContext.deletePostValue( "T9471OMRRCos") ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmordrr", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(A9427OMMaqDsc))}, new String[] {"Gx_mode","EmprCod","OMCod","OMMaqCod","OMMaqDsc"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdRR");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV31Pgmname, "")));
      forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmordrr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "O9444OMRRCosT", GXutil.ltrim( localUtil.ntoc( O9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nGXsfl_44_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOMREPCOD_DATA", AV27OMRepCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOMREPCOD_DATA", AV27OMRepCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV21EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMCOD", GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14OMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_OMMAQCOD", GXutil.rtrim( AV25Insert_OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCCNT", GXutil.ltrim( localUtil.ntoc( A9452OMRCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCPRE", GXutil.ltrim( localUtil.ntoc( A9453OMRCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMRCCOS", GXutil.ltrim( localUtil.ntoc( A9454OMRCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPPRE", GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOOMRRCNT", GXutil.ltrim( localUtil.ntoc( AV16oOMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMRRCNT", GXutil.ltrim( localUtil.ntoc( AV19nOMRRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSERVERNOW", localUtil.ttoc( AV20ServerNow, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVNOM", GXutil.rtrim( AV18MTMovNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTMOVCOD", GXutil.ltrim( localUtil.ntoc( AV17MTMovCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMREPNOM", GXutil.rtrim( A9447OMRepNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMREPCOD_Objectcall", GXutil.rtrim( Combo_omrepcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMREPCOD_Cls", GXutil.rtrim( Combo_omrepcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMREPCOD_Enabled", GXutil.booltostr( Combo_omrepcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMREPCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_omrepcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMREPCOD_Isgriditem", GXutil.booltostr( Combo_omrepcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMREPCOD_Emptyitem", GXutil.booltostr( Combo_omrepcod_Emptyitem));
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
      return formatLink("app.mantenimientomaquina.tmordrr", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(A9427OMMaqDsc))}, new String[] {"Gx_mode","EmprCod","OMCod","OMMaqCod","OMMaqDsc"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMOrdRR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Res Repuestos,Orden de trabajo", "") ;
   }

   public void initializeNonKey16H1232( )
   {
      A9444OMRRCosT = DecimalUtil.ZERO ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      A9445OMEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      O9444OMRRCosT = A9444OMRRCosT ;
      n9444OMRRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrimstr( A9444OMRRCosT, 12, 3));
      Z9445OMEst = "" ;
   }

   public void initAll16H1232( )
   {
      A9425OMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      initializeNonKey16H1232( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16H1233( )
   {
      AV16oOMRRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
      AV19nOMRRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19nOMRRCnt", GXutil.ltrimstr( AV19nOMRRCnt, 12, 3));
      AV20ServerNow = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV20ServerNow", localUtil.ttoc( AV20ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9454OMRCCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9454OMRCCos", GXutil.ltrimstr( A9454OMRCCos, 12, 3));
      A9471OMRRCos = DecimalUtil.ZERO ;
      A9447OMRepNom = "" ;
      n9447OMRepNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9447OMRepNom", A9447OMRepNom);
      A9448OMRepPre = DecimalUtil.ZERO ;
      n9448OMRepPre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9448OMRepPre", GXutil.ltrimstr( A9448OMRepPre, 12, 3));
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9452OMRCCnt", GXutil.ltrimstr( A9452OMRCCnt, 12, 3));
      A9453OMRCPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9453OMRCPre", GXutil.ltrimstr( A9453OMRCPre, 12, 3));
      A14496OMRObs = "" ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      O9450OMRRCnt = A9450OMRRCnt ;
      O9471OMRRCos = A9471OMRRCos ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      Z9450OMRRCnt = DecimalUtil.ZERO ;
      Z9452OMRCCnt = DecimalUtil.ZERO ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
      Z14496OMRObs = "" ;
   }

   public void initAll16H1233( )
   {
      A9446OMRepCod = 0 ;
      A9449OMRTpo = "R" ;
      initializeNonKey16H1233( ) ;
   }

   public void standaloneModalInsert16H1233( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211662014", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmordrr.js", "?20268211662015", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1233( )
   {
      edtOMRRPre_Enabled = defedtOMRRPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRPre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      cmbOMRTpo.setEnabled( defcmbOMRTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMRTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMRTpo.getEnabled(), 5, 0), !bGXsfl_44_Refreshing);
      edtOMRepCod_Enabled = defedtOMRepCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRepCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
   }

   public void startgridcontrol44( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9446OMRepCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtOMRepCod_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9449OMRTpo));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMRTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14496OMRObs));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9450OMRRCnt, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9471OMRRCos, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMRRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOMCod_Internalname = "OMCOD" ;
      edtOMMaqCod_Internalname = "OMMAQCOD" ;
      edtOMMaqDsc_Internalname = "OMMAQDSC" ;
      cmbOMEst.setInternalname( "OMEST" );
      edtOMRRCosT_Internalname = "OMRRCOST" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtOMRepCod_Internalname = "OMREPCOD" ;
      cmbOMRTpo.setInternalname( "OMRTPO" );
      edtOMRObs_Internalname = "OMROBS" ;
      edtOMRRCnt_Internalname = "OMRRCNT" ;
      edtOMRRPre_Internalname = "OMRRPRE" ;
      edtOMRRCos_Internalname = "OMRRCOS" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_omrepcod_Internalname = "COMBO_OMREPCOD" ;
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
      Combo_omrepcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Res Repuestos,Orden de trabajo", "") );
      edtOMRRCos_Jsonclick = "" ;
      edtOMRRPre_Jsonclick = "" ;
      edtOMRRCnt_Jsonclick = "" ;
      edtOMRObs_Jsonclick = "" ;
      cmbOMRTpo.setJsonclick( "" );
      edtOMRepCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_omrepcod_Titlecontrolidtoreplace = "" ;
      edtOMRRCos_Enabled = 0 ;
      edtOMRRPre_Enabled = 0 ;
      edtOMRRCnt_Enabled = 1 ;
      edtOMRObs_Enabled = 1 ;
      cmbOMRTpo.setEnabled( 0 );
      edtOMRepCod_Enabled = 1 ;
      Combo_omrepcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_omrepcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_omrepcod_Cls = "ExtendedCombo" ;
      Combo_omrepcod_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtOMRRCosT_Jsonclick = "" ;
      edtOMRRCosT_Enabled = 0 ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setEnabled( 0 );
      edtOMMaqDsc_Jsonclick = "" ;
      edtOMMaqDsc_Enabled = 0 ;
      edtOMMaqCod_Jsonclick = "" ;
      edtOMMaqCod_Enabled = 0 ;
      edtOMCod_Jsonclick = "" ;
      edtOMCod_Enabled = 0 ;
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
      edtOMRepCod_Horizontalalignment = "right" ;
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

   public void xc_21_16H1233( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A9425OMCod ;
         GXv_int11[0] = A9446OMRepCod ;
         GXv_int3[0] = AV17MTMovCod ;
         GXv_char2[0] = AV18MTMovNom ;
         GXv_int13[0] = (byte)(1) ;
         GXv_decimal15[0] = AV16oOMRRCnt ;
         GXv_decimal14[0] = A9450OMRRCnt ;
         GXv_char1[0] = httpContext.getMessage( "R", "") ;
         GXv_dtime16[0] = AV20ServerNow ;
         new app.mantenimientomaquina.pmrepres(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int11, GXv_int3, GXv_char2, GXv_int13, GXv_decimal15, GXv_decimal14, GXv_char1, GXv_dtime16) ;
         A396EmprCod = GXv_char4[0] ;
         A9425OMCod = GXv_int12[0] ;
         A9446OMRepCod = GXv_int11[0] ;
         AV17MTMovCod = GXv_int3[0] ;
         AV18MTMovNom = GXv_char2[0] ;
         AV16oOMRRCnt = GXv_decimal15[0] ;
         A9450OMRRCnt = GXv_decimal14[0] ;
         AV20ServerNow = GXv_dtime16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV16oOMRRCnt", GXutil.ltrimstr( AV16oOMRRCnt, 12, 3));
         httpContext.ajax_rsp_assign_attri("", false, "AV20ServerNow", localUtil.ttoc( AV20ServerNow, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      subsflControlProps_441233( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16H1233( ) ;
         standaloneModal16H1233( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16H1233( ) ;
         nGXsfl_44_idx = (int)(nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_441233( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbOMEst.setName( "OMEST" );
      cmbOMEst.setWebtags( "" );
      cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      }
      GXCCtl = "OMRTPO_" + sGXsfl_44_idx ;
      cmbOMRTpo.setName( GXCCtl );
      cmbOMRTpo.setWebtags( "" );
      cmbOMRTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMRTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9449OMRTpo)==0) )
         {
            A9449OMRTpo = "R" ;
         }
      }
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

   public void valid_Omcod( )
   {
      n9444OMRRCosT = false ;
      /* Using cursor T016H22 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A9444OMRRCosT = T016H22_A9444OMRRCosT[0] ;
         n9444OMRRCosT = T016H22_n9444OMRRCosT[0] ;
      }
      else
      {
         A9444OMRRCosT = DecimalUtil.doubleToDec(0) ;
         n9444OMRRCosT = false ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9444OMRRCosT", GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), ".", "")));
   }

   public void valid_Omrepcod( )
   {
      n9448OMRepPre = false ;
      n9447OMRepNom = false ;
      /* Using cursor T016H33 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A9446OMRepCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MORep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMREPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMRepCod_Internalname ;
      }
      A9447OMRepNom = T016H33_A9447OMRepNom[0] ;
      n9447OMRepNom = T016H33_n9447OMRepNom[0] ;
      A9448OMRepPre = T016H33_A9448OMRepPre[0] ;
      n9448OMRepPre = T016H33_n9448OMRepPre[0] ;
      pr_default.close(27);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9451OMRRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9451OMRRPre = A9448OMRepPre ;
      }
      dynload_actions( ) ;
      if ( cmbOMRTpo.getItemCount() > 0 )
      {
         A9449OMRTpo = cmbOMRTpo.getValidValue(A9449OMRTpo) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMRTpo.setValue( GXutil.rtrim( A9449OMRTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9447OMRepNom", GXutil.rtrim( A9447OMRepNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9448OMRepPre", GXutil.ltrim( localUtil.ntoc( A9448OMRepPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9451OMRRPre", GXutil.ltrim( localUtil.ntoc( A9451OMRRPre, (byte)(12), (byte)(3), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV31Pgmname',fld:'vPGMNAME',pic:''},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1216H2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9444OMRRCosT',fld:'OMRRCOST',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_OMCOD",",oparms:[{av:'A9444OMRRCosT',fld:'OMRRCOST',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_OMREPCOD","{handler:'valid_Omrepcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9446OMRepCod',fld:'OMREPCOD',pic:'ZZZZZZZ9'},{av:'A9448OMRepPre',fld:'OMREPPRE',pic:'ZZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9451OMRRPre',fld:'OMRRPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMREPCOD",",oparms:[{av:'A9447OMRepNom',fld:'OMREPNOM',pic:''},{av:'A9448OMRepPre',fld:'OMREPPRE',pic:'ZZZZZZ9.999'},{av:'A9451OMRRPre',fld:'OMRRPRE',pic:'ZZ,ZZZ,ZZ9.999'}]}");
      setEventMetadata("VALID_OMRTPO","{handler:'valid_Omrtpo',iparms:[]");
      setEventMetadata("VALID_OMRTPO",",oparms:[]}");
      setEventMetadata("VALID_OMRRCNT","{handler:'valid_Omrrcnt',iparms:[]");
      setEventMetadata("VALID_OMRRCNT",",oparms:[]}");
      setEventMetadata("VALID_OMRRPRE","{handler:'valid_Omrrpre',iparms:[]");
      setEventMetadata("VALID_OMRRPRE",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOS","{handler:'valid_Omrrcos',iparms:[]");
      setEventMetadata("VALID_OMRRCOS",",oparms:[]}");
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
      pr_default.close(27);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV21EmprCod = "" ;
      wcpOA9426OMMaqCod = "" ;
      wcpOA9427OMMaqDsc = "" ;
      Z396EmprCod = "" ;
      Z9445OMEst = "" ;
      O9444OMRRCosT = DecimalUtil.ZERO ;
      Z9449OMRTpo = "" ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      Z9450OMRRCnt = DecimalUtil.ZERO ;
      Z9452OMRCCnt = DecimalUtil.ZERO ;
      Z9453OMRCPre = DecimalUtil.ZERO ;
      Z14496OMRObs = "" ;
      O9450OMRRCnt = DecimalUtil.ZERO ;
      O9471OMRRCos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV21EmprCod = "" ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      A9445OMEst = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A9444OMRRCosT = DecimalUtil.ZERO ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV31Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_omrepcod = new com.genexus.webpanels.GXUserControl();
      AV29DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV27OMRepCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9444OMRRCosT = DecimalUtil.ZERO ;
      sMode1233 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      AV25Insert_OMMaqCod = "" ;
      A407EmprNom = "" ;
      A9452OMRCCnt = DecimalUtil.ZERO ;
      A9453OMRCPre = DecimalUtil.ZERO ;
      A9454OMRCCos = DecimalUtil.ZERO ;
      A9448OMRepPre = DecimalUtil.ZERO ;
      AV16oOMRRCnt = DecimalUtil.ZERO ;
      AV19nOMRRCnt = DecimalUtil.ZERO ;
      AV20ServerNow = GXutil.resetTime( GXutil.nullDate() );
      AV18MTMovNom = "" ;
      A9447OMRepNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_omrepcod_Objectcall = "" ;
      Combo_omrepcod_Class = "" ;
      Combo_omrepcod_Icontype = "" ;
      Combo_omrepcod_Icon = "" ;
      Combo_omrepcod_Tooltip = "" ;
      Combo_omrepcod_Selectedvalue_set = "" ;
      Combo_omrepcod_Selectedvalue_get = "" ;
      Combo_omrepcod_Selectedtext_set = "" ;
      Combo_omrepcod_Selectedtext_get = "" ;
      Combo_omrepcod_Gamoauthtoken = "" ;
      Combo_omrepcod_Ddointernalname = "" ;
      Combo_omrepcod_Titlecontrolalign = "" ;
      Combo_omrepcod_Dropdownoptionstype = "" ;
      Combo_omrepcod_Datalisttype = "" ;
      Combo_omrepcod_Datalistfixedvalues = "" ;
      Combo_omrepcod_Datalistproc = "" ;
      Combo_omrepcod_Datalistprocparametersprefix = "" ;
      Combo_omrepcod_Remoteservicesparameters = "" ;
      Combo_omrepcod_Htmltemplate = "" ;
      Combo_omrepcod_Multiplevaluestype = "" ;
      Combo_omrepcod_Loadingdata = "" ;
      Combo_omrepcod_Noresultsfound = "" ;
      Combo_omrepcod_Emptyitemtext = "" ;
      Combo_omrepcod_Onlyselectedvalues = "" ;
      Combo_omrepcod_Selectalltext = "" ;
      Combo_omrepcod_Multiplevaluesseparator = "" ;
      Combo_omrepcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1232 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s9444OMRRCosT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9449OMRTpo = "" ;
      A14496OMRObs = "" ;
      A9450OMRRCnt = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      A9471OMRRCos = DecimalUtil.ZERO ;
      T9450OMRRCnt = DecimalUtil.ZERO ;
      T9471OMRRCos = DecimalUtil.ZERO ;
      AV12Station = "" ;
      GXt_char5 = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV22WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext6 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV23TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24WebSession = httpContext.getWebSession();
      AV26TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV28ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection[1] ;
      Z9426OMMaqCod = "" ;
      Z407EmprNom = "" ;
      Z9427OMMaqDsc = "" ;
      Z9444OMRRCosT = DecimalUtil.ZERO ;
      T016H7_A407EmprNom = new String[] {""} ;
      T016H7_n407EmprNom = new boolean[] {false} ;
      T016H8_A9427OMMaqDsc = new String[] {""} ;
      T016H8_n9427OMMaqDsc = new boolean[] {false} ;
      T016H10_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H10_n9444OMRRCosT = new boolean[] {false} ;
      T016H12_A9426OMMaqCod = new String[] {""} ;
      T016H12_A9427OMMaqDsc = new String[] {""} ;
      T016H12_n9427OMMaqDsc = new boolean[] {false} ;
      T016H12_A9425OMCod = new int[1] ;
      T016H12_A407EmprNom = new String[] {""} ;
      T016H12_n407EmprNom = new boolean[] {false} ;
      T016H12_A9445OMEst = new String[] {""} ;
      T016H12_A396EmprCod = new String[] {""} ;
      T016H12_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H12_n9444OMRRCosT = new boolean[] {false} ;
      T016H14_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H14_n9444OMRRCosT = new boolean[] {false} ;
      T016H15_A396EmprCod = new String[] {""} ;
      T016H15_A9425OMCod = new int[1] ;
      T016H6_A9426OMMaqCod = new String[] {""} ;
      T016H6_A9425OMCod = new int[1] ;
      T016H6_A9445OMEst = new String[] {""} ;
      T016H6_A396EmprCod = new String[] {""} ;
      T016H16_A396EmprCod = new String[] {""} ;
      T016H16_A9425OMCod = new int[1] ;
      T016H16_A9426OMMaqCod = new String[] {""} ;
      T016H17_A396EmprCod = new String[] {""} ;
      T016H17_A9425OMCod = new int[1] ;
      T016H17_A9426OMMaqCod = new String[] {""} ;
      T016H5_A9426OMMaqCod = new String[] {""} ;
      T016H5_A9425OMCod = new int[1] ;
      T016H5_A9445OMEst = new String[] {""} ;
      T016H5_A396EmprCod = new String[] {""} ;
      T016H22_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H22_n9444OMRRCosT = new boolean[] {false} ;
      T016H23_A396EmprCod = new String[] {""} ;
      T016H23_A9425OMCod = new int[1] ;
      T016H23_A11446OMMEquCod = new String[] {""} ;
      T016H23_A11447OMMSEqCod = new String[] {""} ;
      T016H23_A11448OMMPieCod = new String[] {""} ;
      T016H24_A396EmprCod = new String[] {""} ;
      T016H24_A9425OMCod = new int[1] ;
      T016H24_A9430TMCod = new int[1] ;
      T016H25_A396EmprCod = new String[] {""} ;
      T016H25_A9425OMCod = new int[1] ;
      T016H25_A9455OMOpeCod = new int[1] ;
      T016H25_A9458OMMTpo = new String[] {""} ;
      T016H26_A396EmprCod = new String[] {""} ;
      T016H26_A9425OMCod = new int[1] ;
      Z9447OMRepNom = "" ;
      Z9448OMRepPre = DecimalUtil.ZERO ;
      T016H27_A9425OMCod = new int[1] ;
      T016H27_A9449OMRTpo = new String[] {""} ;
      T016H27_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H27_A9447OMRepNom = new String[] {""} ;
      T016H27_n9447OMRepNom = new boolean[] {false} ;
      T016H27_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H27_n9448OMRepPre = new boolean[] {false} ;
      T016H27_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H27_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H27_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H27_A14496OMRObs = new String[] {""} ;
      T016H27_A396EmprCod = new String[] {""} ;
      T016H27_A9446OMRepCod = new int[1] ;
      T016H4_A9447OMRepNom = new String[] {""} ;
      T016H4_n9447OMRepNom = new boolean[] {false} ;
      T016H4_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H4_n9448OMRepPre = new boolean[] {false} ;
      T016H28_A9447OMRepNom = new String[] {""} ;
      T016H28_n9447OMRepNom = new boolean[] {false} ;
      T016H28_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H28_n9448OMRepPre = new boolean[] {false} ;
      T016H29_A396EmprCod = new String[] {""} ;
      T016H29_A9425OMCod = new int[1] ;
      T016H29_A9446OMRepCod = new int[1] ;
      T016H29_A9449OMRTpo = new String[] {""} ;
      T016H3_A9425OMCod = new int[1] ;
      T016H3_A9449OMRTpo = new String[] {""} ;
      T016H3_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H3_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H3_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H3_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H3_A14496OMRObs = new String[] {""} ;
      T016H3_A396EmprCod = new String[] {""} ;
      T016H3_A9446OMRepCod = new int[1] ;
      T016H2_A9425OMCod = new int[1] ;
      T016H2_A9449OMRTpo = new String[] {""} ;
      T016H2_A9451OMRRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H2_A9450OMRRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H2_A9452OMRCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H2_A9453OMRCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H2_A14496OMRObs = new String[] {""} ;
      T016H2_A396EmprCod = new String[] {""} ;
      T016H2_A9446OMRepCod = new int[1] ;
      T016H33_A9447OMRepNom = new String[] {""} ;
      T016H33_n9447OMRepNom = new boolean[] {false} ;
      T016H33_A9448OMRepPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016H33_n9448OMRepPre = new boolean[] {false} ;
      T016H34_A396EmprCod = new String[] {""} ;
      T016H34_A9425OMCod = new int[1] ;
      T016H34_A9446OMRepCod = new int[1] ;
      T016H34_A9449OMRTpo = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_int3 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_int13 = new byte[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char1 = new String[1] ;
      GXv_dtime16 = new java.util.Date[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordrr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordrr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordrr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordrr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordrr__default(),
         new Object[] {
             new Object[] {
            T016H2_A9425OMCod, T016H2_A9449OMRTpo, T016H2_A9451OMRRPre, T016H2_A9450OMRRCnt, T016H2_A9452OMRCCnt, T016H2_A9453OMRCPre, T016H2_A14496OMRObs, T016H2_A396EmprCod, T016H2_A9446OMRepCod
            }
            , new Object[] {
            T016H3_A9425OMCod, T016H3_A9449OMRTpo, T016H3_A9451OMRRPre, T016H3_A9450OMRRCnt, T016H3_A9452OMRCCnt, T016H3_A9453OMRCPre, T016H3_A14496OMRObs, T016H3_A396EmprCod, T016H3_A9446OMRepCod
            }
            , new Object[] {
            T016H4_A9447OMRepNom, T016H4_n9447OMRepNom, T016H4_A9448OMRepPre, T016H4_n9448OMRepPre
            }
            , new Object[] {
            T016H5_A9426OMMaqCod, T016H5_A9425OMCod, T016H5_A9445OMEst, T016H5_A396EmprCod
            }
            , new Object[] {
            T016H6_A9426OMMaqCod, T016H6_A9425OMCod, T016H6_A9445OMEst, T016H6_A396EmprCod
            }
            , new Object[] {
            T016H7_A407EmprNom, T016H7_n407EmprNom
            }
            , new Object[] {
            T016H8_A9427OMMaqDsc, T016H8_n9427OMMaqDsc
            }
            , new Object[] {
            T016H10_A9444OMRRCosT, T016H10_n9444OMRRCosT
            }
            , new Object[] {
            T016H12_A9426OMMaqCod, T016H12_A9427OMMaqDsc, T016H12_n9427OMMaqDsc, T016H12_A9425OMCod, T016H12_A407EmprNom, T016H12_n407EmprNom, T016H12_A9445OMEst, T016H12_A396EmprCod, T016H12_A9444OMRRCosT, T016H12_n9444OMRRCosT
            }
            , new Object[] {
            T016H14_A9444OMRRCosT, T016H14_n9444OMRRCosT
            }
            , new Object[] {
            T016H15_A396EmprCod, T016H15_A9425OMCod
            }
            , new Object[] {
            T016H16_A396EmprCod, T016H16_A9425OMCod, T016H16_A9426OMMaqCod
            }
            , new Object[] {
            T016H17_A396EmprCod, T016H17_A9425OMCod, T016H17_A9426OMMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016H22_A9444OMRRCosT, T016H22_n9444OMRRCosT
            }
            , new Object[] {
            T016H23_A396EmprCod, T016H23_A9425OMCod, T016H23_A11446OMMEquCod, T016H23_A11447OMMSEqCod, T016H23_A11448OMMPieCod
            }
            , new Object[] {
            T016H24_A396EmprCod, T016H24_A9425OMCod, T016H24_A9430TMCod
            }
            , new Object[] {
            T016H25_A396EmprCod, T016H25_A9425OMCod, T016H25_A9455OMOpeCod, T016H25_A9458OMMTpo
            }
            , new Object[] {
            T016H26_A396EmprCod, T016H26_A9425OMCod
            }
            , new Object[] {
            T016H27_A9425OMCod, T016H27_A9449OMRTpo, T016H27_A9451OMRRPre, T016H27_A9447OMRepNom, T016H27_n9447OMRepNom, T016H27_A9448OMRepPre, T016H27_n9448OMRepPre, T016H27_A9450OMRRCnt, T016H27_A9452OMRCCnt, T016H27_A9453OMRCPre,
            T016H27_A14496OMRObs, T016H27_A396EmprCod, T016H27_A9446OMRepCod
            }
            , new Object[] {
            T016H28_A9447OMRepNom, T016H28_n9447OMRepNom, T016H28_A9448OMRepPre, T016H28_n9448OMRepPre
            }
            , new Object[] {
            T016H29_A396EmprCod, T016H29_A9425OMCod, T016H29_A9446OMRepCod, T016H29_A9449OMRTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016H33_A9447OMRepNom, T016H33_n9447OMRepNom, T016H33_A9448OMRepPre, T016H33_n9448OMRepPre
            }
            , new Object[] {
            T016H34_A396EmprCod, T016H34_A9425OMCod, T016H34_A9446OMRepCod, T016H34_A9449OMRTpo
            }
         }
      );
      Z9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      A9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      Z9426OMMaqCod = "" ;
      A9426OMMaqCod = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV31Pgmname = "MantenimientoMaquina.TMOrdRR" ;
      Z9451OMRRPre = DecimalUtil.ZERO ;
      A9451OMRRPre = DecimalUtil.ZERO ;
      Z9449OMRTpo = "R" ;
      A9449OMRTpo = "R" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int13[] ;
   private short nRcdDeleted_1233 ;
   private short nRcdExists_1233 ;
   private short nIsMod_1233 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1233 ;
   private short RcdFound1233 ;
   private short nBlankRcdUsr1233 ;
   private short RcdFound1232 ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1233 ;
   private int wcpOAV14OMCod ;
   private int Z9425OMCod ;
   private int nRC_GXsfl_44 ;
   private int nGXsfl_44_idx=1 ;
   private int Z9446OMRepCod ;
   private int A9425OMCod ;
   private int A9446OMRepCod ;
   private int AV14OMCod ;
   private int trnEnded ;
   private int edtOMCod_Enabled ;
   private int edtOMMaqCod_Enabled ;
   private int edtOMMaqDsc_Enabled ;
   private int edtOMRRCosT_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtOMRepCod_Enabled ;
   private int edtOMRObs_Enabled ;
   private int edtOMRRCnt_Enabled ;
   private int edtOMRRPre_Enabled ;
   private int edtOMRRCos_Enabled ;
   private int fRowAdded ;
   private int AV17MTMovCod ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_omrepcod_Datalistupdateminimumcharacters ;
   private int AV32GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtOMRRPre_Enabled ;
   private int defcmbOMRTpo_Enabled ;
   private int defedtOMRepCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int12[] ;
   private int GXv_int11[] ;
   private int GXv_int3[] ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal O9444OMRRCosT ;
   private java.math.BigDecimal Z9451OMRRPre ;
   private java.math.BigDecimal Z9450OMRRCnt ;
   private java.math.BigDecimal Z9452OMRCCnt ;
   private java.math.BigDecimal Z9453OMRCPre ;
   private java.math.BigDecimal O9450OMRRCnt ;
   private java.math.BigDecimal O9471OMRRCos ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal B9444OMRRCosT ;
   private java.math.BigDecimal A9452OMRCCnt ;
   private java.math.BigDecimal A9453OMRCPre ;
   private java.math.BigDecimal A9454OMRCCos ;
   private java.math.BigDecimal A9448OMRepPre ;
   private java.math.BigDecimal AV16oOMRRCnt ;
   private java.math.BigDecimal AV19nOMRRCnt ;
   private java.math.BigDecimal s9444OMRRCosT ;
   private java.math.BigDecimal A9450OMRRCnt ;
   private java.math.BigDecimal A9451OMRRPre ;
   private java.math.BigDecimal A9471OMRRCos ;
   private java.math.BigDecimal T9450OMRRCnt ;
   private java.math.BigDecimal T9471OMRRCos ;
   private java.math.BigDecimal Z9444OMRRCosT ;
   private java.math.BigDecimal Z9448OMRepPre ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV21EmprCod ;
   private String wcpOA9426OMMaqCod ;
   private String wcpOA9427OMMaqDsc ;
   private String Z396EmprCod ;
   private String Z9445OMEst ;
   private String Z9449OMRTpo ;
   private String Z14496OMRObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV21EmprCod ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_44_idx="0001" ;
   private String edtOMRepCod_Horizontalalignment ;
   private String edtOMRepCod_Internalname ;
   private String A9445OMEst ;
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
   private String edtOMCod_Internalname ;
   private String edtOMCod_Jsonclick ;
   private String edtOMMaqCod_Internalname ;
   private String edtOMMaqCod_Jsonclick ;
   private String edtOMMaqDsc_Internalname ;
   private String edtOMMaqDsc_Jsonclick ;
   private String edtOMRRCosT_Internalname ;
   private String edtOMRRCosT_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV31Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_omrepcod_Caption ;
   private String Combo_omrepcod_Cls ;
   private String Combo_omrepcod_Internalname ;
   private String sMode1233 ;
   private String edtOMRObs_Internalname ;
   private String edtOMRRCnt_Internalname ;
   private String edtOMRRPre_Internalname ;
   private String edtOMRRCos_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV25Insert_OMMaqCod ;
   private String A407EmprNom ;
   private String AV18MTMovNom ;
   private String A9447OMRepNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_omrepcod_Objectcall ;
   private String Combo_omrepcod_Class ;
   private String Combo_omrepcod_Icontype ;
   private String Combo_omrepcod_Icon ;
   private String Combo_omrepcod_Tooltip ;
   private String Combo_omrepcod_Selectedvalue_set ;
   private String Combo_omrepcod_Selectedvalue_get ;
   private String Combo_omrepcod_Selectedtext_set ;
   private String Combo_omrepcod_Selectedtext_get ;
   private String Combo_omrepcod_Gamoauthtoken ;
   private String Combo_omrepcod_Ddointernalname ;
   private String Combo_omrepcod_Titlecontrolalign ;
   private String Combo_omrepcod_Dropdownoptionstype ;
   private String Combo_omrepcod_Titlecontrolidtoreplace ;
   private String Combo_omrepcod_Datalisttype ;
   private String Combo_omrepcod_Datalistfixedvalues ;
   private String Combo_omrepcod_Datalistproc ;
   private String Combo_omrepcod_Datalistprocparametersprefix ;
   private String Combo_omrepcod_Remoteservicesparameters ;
   private String Combo_omrepcod_Htmltemplate ;
   private String Combo_omrepcod_Multiplevaluestype ;
   private String Combo_omrepcod_Loadingdata ;
   private String Combo_omrepcod_Noresultsfound ;
   private String Combo_omrepcod_Emptyitemtext ;
   private String Combo_omrepcod_Onlyselectedvalues ;
   private String Combo_omrepcod_Selectalltext ;
   private String Combo_omrepcod_Multiplevaluesseparator ;
   private String Combo_omrepcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode1232 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9449OMRTpo ;
   private String A14496OMRObs ;
   private String AV12Station ;
   private String GXt_char5 ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z9426OMMaqCod ;
   private String Z407EmprNom ;
   private String Z9427OMMaqDsc ;
   private String Z9447OMRepNom ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtOMRepCod_Jsonclick ;
   private String edtOMRObs_Jsonclick ;
   private String edtOMRRCnt_Jsonclick ;
   private String edtOMRRPre_Jsonclick ;
   private String edtOMRRCos_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private java.util.Date AV20ServerNow ;
   private java.util.Date GXv_dtime16[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9427OMMaqDsc ;
   private boolean wbErr ;
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_omrepcod_Isgriditem ;
   private boolean Combo_omrepcod_Emptyitem ;
   private boolean n9444OMRRCosT ;
   private boolean n407EmprNom ;
   private boolean n9448OMRepPre ;
   private boolean n9447OMRepNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_omrepcod_Enabled ;
   private boolean Combo_omrepcod_Visible ;
   private boolean Combo_omrepcod_Allowmultipleselection ;
   private boolean Combo_omrepcod_Hasdescription ;
   private boolean Combo_omrepcod_Includeonlyselectedoption ;
   private boolean Combo_omrepcod_Includeselectalloption ;
   private boolean Combo_omrepcod_Includeaddnewoption ;
   private boolean returnInSub ;
   private String AV28ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV24WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_omrepcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private HTMLChoice cmbOMRTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T016H7_A407EmprNom ;
   private boolean[] T016H7_n407EmprNom ;
   private String[] T016H8_A9427OMMaqDsc ;
   private boolean[] T016H8_n9427OMMaqDsc ;
   private java.math.BigDecimal[] T016H10_A9444OMRRCosT ;
   private boolean[] T016H10_n9444OMRRCosT ;
   private String[] T016H12_A9426OMMaqCod ;
   private String[] T016H12_A9427OMMaqDsc ;
   private boolean[] T016H12_n9427OMMaqDsc ;
   private int[] T016H12_A9425OMCod ;
   private String[] T016H12_A407EmprNom ;
   private boolean[] T016H12_n407EmprNom ;
   private String[] T016H12_A9445OMEst ;
   private String[] T016H12_A396EmprCod ;
   private java.math.BigDecimal[] T016H12_A9444OMRRCosT ;
   private boolean[] T016H12_n9444OMRRCosT ;
   private java.math.BigDecimal[] T016H14_A9444OMRRCosT ;
   private boolean[] T016H14_n9444OMRRCosT ;
   private String[] T016H15_A396EmprCod ;
   private int[] T016H15_A9425OMCod ;
   private String[] T016H6_A9426OMMaqCod ;
   private int[] T016H6_A9425OMCod ;
   private String[] T016H6_A9445OMEst ;
   private String[] T016H6_A396EmprCod ;
   private String[] T016H16_A396EmprCod ;
   private int[] T016H16_A9425OMCod ;
   private String[] T016H16_A9426OMMaqCod ;
   private String[] T016H17_A396EmprCod ;
   private int[] T016H17_A9425OMCod ;
   private String[] T016H17_A9426OMMaqCod ;
   private String[] T016H5_A9426OMMaqCod ;
   private int[] T016H5_A9425OMCod ;
   private String[] T016H5_A9445OMEst ;
   private String[] T016H5_A396EmprCod ;
   private java.math.BigDecimal[] T016H22_A9444OMRRCosT ;
   private boolean[] T016H22_n9444OMRRCosT ;
   private String[] T016H23_A396EmprCod ;
   private int[] T016H23_A9425OMCod ;
   private String[] T016H23_A11446OMMEquCod ;
   private String[] T016H23_A11447OMMSEqCod ;
   private String[] T016H23_A11448OMMPieCod ;
   private String[] T016H24_A396EmprCod ;
   private int[] T016H24_A9425OMCod ;
   private int[] T016H24_A9430TMCod ;
   private String[] T016H25_A396EmprCod ;
   private int[] T016H25_A9425OMCod ;
   private int[] T016H25_A9455OMOpeCod ;
   private String[] T016H25_A9458OMMTpo ;
   private String[] T016H26_A396EmprCod ;
   private int[] T016H26_A9425OMCod ;
   private int[] T016H27_A9425OMCod ;
   private String[] T016H27_A9449OMRTpo ;
   private java.math.BigDecimal[] T016H27_A9451OMRRPre ;
   private String[] T016H27_A9447OMRepNom ;
   private boolean[] T016H27_n9447OMRepNom ;
   private java.math.BigDecimal[] T016H27_A9448OMRepPre ;
   private boolean[] T016H27_n9448OMRepPre ;
   private java.math.BigDecimal[] T016H27_A9450OMRRCnt ;
   private java.math.BigDecimal[] T016H27_A9452OMRCCnt ;
   private java.math.BigDecimal[] T016H27_A9453OMRCPre ;
   private String[] T016H27_A14496OMRObs ;
   private String[] T016H27_A396EmprCod ;
   private int[] T016H27_A9446OMRepCod ;
   private String[] T016H4_A9447OMRepNom ;
   private boolean[] T016H4_n9447OMRepNom ;
   private java.math.BigDecimal[] T016H4_A9448OMRepPre ;
   private boolean[] T016H4_n9448OMRepPre ;
   private String[] T016H28_A9447OMRepNom ;
   private boolean[] T016H28_n9447OMRepNom ;
   private java.math.BigDecimal[] T016H28_A9448OMRepPre ;
   private boolean[] T016H28_n9448OMRepPre ;
   private String[] T016H29_A396EmprCod ;
   private int[] T016H29_A9425OMCod ;
   private int[] T016H29_A9446OMRepCod ;
   private String[] T016H29_A9449OMRTpo ;
   private int[] T016H3_A9425OMCod ;
   private String[] T016H3_A9449OMRTpo ;
   private java.math.BigDecimal[] T016H3_A9451OMRRPre ;
   private java.math.BigDecimal[] T016H3_A9450OMRRCnt ;
   private java.math.BigDecimal[] T016H3_A9452OMRCCnt ;
   private java.math.BigDecimal[] T016H3_A9453OMRCPre ;
   private String[] T016H3_A14496OMRObs ;
   private String[] T016H3_A396EmprCod ;
   private int[] T016H3_A9446OMRepCod ;
   private int[] T016H2_A9425OMCod ;
   private String[] T016H2_A9449OMRTpo ;
   private java.math.BigDecimal[] T016H2_A9451OMRRPre ;
   private java.math.BigDecimal[] T016H2_A9450OMRRCnt ;
   private java.math.BigDecimal[] T016H2_A9452OMRCCnt ;
   private java.math.BigDecimal[] T016H2_A9453OMRCPre ;
   private String[] T016H2_A14496OMRObs ;
   private String[] T016H2_A396EmprCod ;
   private int[] T016H2_A9446OMRepCod ;
   private String[] T016H33_A9447OMRepNom ;
   private boolean[] T016H33_n9447OMRepNom ;
   private java.math.BigDecimal[] T016H33_A9448OMRepPre ;
   private boolean[] T016H33_n9448OMRepPre ;
   private String[] T016H34_A396EmprCod ;
   private int[] T016H34_A9425OMCod ;
   private int[] T016H34_A9446OMRepCod ;
   private String[] T016H34_A9449OMRTpo ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27OMRepCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item10[] ;
   private app.wwpbaseobjects.SdtWWPContext AV22WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext6[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV23TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV26TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV29DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
}

final  class tmordrr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordrr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordrr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordrr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordrr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016H2", "SELECT OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, OMRObs, EmprCod, OMRepCod FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?  FOR UPDATE OF OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, OMRObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H3", "SELECT OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, OMRObs, EmprCod, OMRepCod FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H4", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H5", "SELECT OMMaqCod, OMCod, OMEst, EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMMaqCod, OMEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H6", "SELECT OMMaqCod, OMCod, OMEst, EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H8", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H10", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H12", "SELECT /*+ FIRST_ROWS(100) */ TM1.OMMaqCod AS OMMaqCod, T3.MaqDsc AS OMMaqDsc, TM1.OMCod, T2.EmprNom, TM1.OMEst, TM1.EmprCod, COALESCE( T4.OMRRCosT, 0) AS OMRRCosT FROM (((TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.OMMaqCod) LEFT JOIN (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.OMCod = TM1.OMCod) WHERE TM1.EmprCod = ? and TM1.OMCod = ? and TM1.OMMaqCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H14", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod, OMMaqCod FROM TXPMORDEN WHERE ( OMCod > ?) and EmprCod = ? and OMMaqCod = ? ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod, OMMaqCod FROM TXPMORDEN WHERE ( OMCod < ?) and EmprCod = ? and OMMaqCod = ? ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016H18", "INSERT INTO TXPMORDEN(OMMaqCod, OMCod, OMEst, EmprCod, SMCod, PMCod, OMTxt, OMOpeRes, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMNot, OMPri, OMTipoId) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0)", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016H19", "UPDATE TXPMORDEN SET OMMaqCod=?, OMEst=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016H20", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T016H22", "SELECT COALESCE( T1.OMRRCosT, 0) AS OMRRCosT FROM (SELECT SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, EmprCod, OMCod FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H23", "SELECT * FROM (SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H24", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H25", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016H26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and OMMaqCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H27", "SELECT T1.OMCod, T1.OMRTpo, T1.OMRRPre, T2.MRNom AS OMRepNom, T2.MRStkPre AS OMRepPre, T1.OMRRCnt, T1.OMRCCnt, T1.OMRCPre, T1.OMRObs, T1.EmprCod, T1.OMRepCod AS OMRepCod FROM (TXPMOrRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.OMRepCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMRepCod = ? and T1.OMRTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMRepCod, T1.OMRTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H28", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H29", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016H30", "INSERT INTO TXPMOrRep(OMCod, OMRTpo, OMRRPre, OMRRCnt, OMRCCnt, OMRCPre, OMRObs, EmprCod, OMRepCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMOrRep")
         ,new UpdateCursor("T016H31", "UPDATE TXPMOrRep SET OMRRPre=?, OMRRCnt=?, OMRCCnt=?, OMRCPre=?, OMRObs=?  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK, "TXPMOrRep")
         ,new UpdateCursor("T016H32", "DELETE FROM TXPMOrRep  WHERE EmprCod = ? AND OMCod = ? AND OMRepCod = ? AND OMRTpo = ?", GX_NOMASK, "TXPMOrRep")
         ,new ForEachCursor("T016H33", "SELECT MRNom AS OMRepNom, MRStkPre AS OMRepPre FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016H34", "SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? and OMCod = ? and OMRTpo = 'R' ORDER BY EmprCod, OMCod, OMRepCod, OMRTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 60);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 60);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 25 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 60);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

