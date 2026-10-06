package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordmc_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
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
         gxload_30( A396EmprCod, A9425OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9455OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A9455OMOpeCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Con Mano de Obra Orden Trabajo", ""), (short)(0)) ;
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
      edtOMOpeCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Horizontalalignment", edtOMOpeCod_Horizontalalignment, !bGXsfl_44_Refreshing);
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

   public tmordmc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordmc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordmc_impl.class ));
   }

   public tmordmc_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMEst = new HTMLChoice();
      cmbOMMTpo = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMCod_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdMC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMaqCod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdMC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMaqDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdMC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbOMEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbOMEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMOrdMC.htm");
      cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMCCosT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMCCosT_Internalname, httpContext.getMessage( "Coste Total Consumo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMCCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMCCosT_Enabled!=0) ? localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999") : localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMCCosT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMCCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMOrdMC.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdMC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdMC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMOrdMC.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV33Pgmname), GXutil.rtrim( localUtil.format( AV33Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMOrdMC.htm");
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
      ucCombo_omopecod.setProperty("Caption", Combo_omopecod_Caption);
      ucCombo_omopecod.setProperty("Cls", Combo_omopecod_Cls);
      ucCombo_omopecod.setProperty("IsGridItem", Combo_omopecod_Isgriditem);
      ucCombo_omopecod.setProperty("EmptyItem", Combo_omopecod_Emptyitem);
      ucCombo_omopecod.setProperty("DropDownOptionsTitleSettingsIcons", AV28DDO_TitleSettingsIcons);
      ucCombo_omopecod.setProperty("DropDownOptionsData", AV27OMOpeCod_Data);
      ucCombo_omopecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_omopecod_Internalname, "COMBO_OMOPECODContainer");
      /* User Defined Control */
      ucGridlevel_level1_titlescategories.setProperty("GridTitlesCategories", Gridlevel_level1_titlescategories_Gridtitlescategories);
      ucGridlevel_level1_titlescategories.render(context, "dvelop.gridtitlescategories", Gridlevel_level1_titlescategories_Internalname, "GRIDLEVEL_LEVEL1_TITLESCATEGORIESContainer");
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
         nBlankRcdCount1234 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1234 = (short)(1) ;
            scanStart16D1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               init_level_properties1234( ) ;
               getByPrimaryKey16D1234( ) ;
               addRow16D1234( ) ;
               scanNext16D1234( ) ;
            }
            scanEnd16D1234( ) ;
            nBlankRcdCount1234 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9441OMMCCosT = A9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         standaloneNotModal16D1234( ) ;
         standaloneModal16D1234( ) ;
         sMode1234 = Gx_mode ;
         while ( nGXsfl_44_idx < nRC_GXsfl_44 )
         {
            bGXsfl_44_Refreshing = true ;
            readRow16D1234( ) ;
            edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMOpeCod_Horizontalalignment = httpContext.cgiGet( "OMOPECOD_"+sGXsfl_44_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Horizontalalignment", edtOMOpeCod_Horizontalalignment, !bGXsfl_44_Refreshing);
            cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_44_Refreshing);
            edtOMOpeCargo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECARGO_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCargo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCargo_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMMCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCNT_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMMCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCPRE_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            edtOMMCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCOS_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_44_Refreshing);
            if ( ( nRcdExists_1234 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16D1234( ) ;
            }
            sendRow16D1234( ) ;
            bGXsfl_44_Refreshing = false ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1234 = (short)(5) ;
         nRcdExists_1234 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16D1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_441234( ) ;
               init_level_properties1234( ) ;
               standaloneNotModal16D1234( ) ;
               getByPrimaryKey16D1234( ) ;
               standaloneModal16D1234( ) ;
               addRow16D1234( ) ;
               scanNext16D1234( ) ;
            }
            scanEnd16D1234( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1234 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_441234( ) ;
         initAll16D1234( ) ;
         init_level_properties1234( ) ;
         B9441OMMCCosT = A9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         nRcdExists_1234 = (short)(0) ;
         nIsMod_1234 = (short)(0) ;
         nRcdDeleted_1234 = (short)(0) ;
         nBlankRcdCount1234 = (short)(nBlankRcdUsr1234+nBlankRcdCount1234) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1234 > 0 )
         {
            standaloneNotModal16D1234( ) ;
            standaloneModal16D1234( ) ;
            addRow16D1234( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtOMOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1234 = (short)(nBlankRcdCount1234-1) ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9441OMMCCosT = B9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
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
      e1116D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV28DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOMOPECOD_DATA"), AV27OMOpeCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9425OMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9445OMEst = httpContext.cgiGet( "Z9445OMEst") ;
            O9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( "O9441OMMCCosT")) ;
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
            A9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( "OMMRCNT")) ;
            A9460OMMRPre = localUtil.ctond( httpContext.cgiGet( "OMMRPRE")) ;
            A9472OMMRCos = localUtil.ctond( httpContext.cgiGet( "OMMRCOS")) ;
            AV20OMMCCnt = localUtil.ctond( httpContext.cgiGet( "vOMMCCNT")) ;
            AV30msg2 = httpContext.cgiGet( "vMSG2") ;
            Gx_msg = httpContext.cgiGet( "vMSG") ;
            A9456OMOpeNom = httpContext.cgiGet( "OMOPENOM") ;
            n9456OMOpeNom = false ;
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
            Combo_omopecod_Objectcall = httpContext.cgiGet( "COMBO_OMOPECOD_Objectcall") ;
            Combo_omopecod_Class = httpContext.cgiGet( "COMBO_OMOPECOD_Class") ;
            Combo_omopecod_Icontype = httpContext.cgiGet( "COMBO_OMOPECOD_Icontype") ;
            Combo_omopecod_Icon = httpContext.cgiGet( "COMBO_OMOPECOD_Icon") ;
            Combo_omopecod_Caption = httpContext.cgiGet( "COMBO_OMOPECOD_Caption") ;
            Combo_omopecod_Tooltip = httpContext.cgiGet( "COMBO_OMOPECOD_Tooltip") ;
            Combo_omopecod_Cls = httpContext.cgiGet( "COMBO_OMOPECOD_Cls") ;
            Combo_omopecod_Selectedvalue_set = httpContext.cgiGet( "COMBO_OMOPECOD_Selectedvalue_set") ;
            Combo_omopecod_Selectedvalue_get = httpContext.cgiGet( "COMBO_OMOPECOD_Selectedvalue_get") ;
            Combo_omopecod_Selectedtext_set = httpContext.cgiGet( "COMBO_OMOPECOD_Selectedtext_set") ;
            Combo_omopecod_Selectedtext_get = httpContext.cgiGet( "COMBO_OMOPECOD_Selectedtext_get") ;
            Combo_omopecod_Gamoauthtoken = httpContext.cgiGet( "COMBO_OMOPECOD_Gamoauthtoken") ;
            Combo_omopecod_Ddointernalname = httpContext.cgiGet( "COMBO_OMOPECOD_Ddointernalname") ;
            Combo_omopecod_Titlecontrolalign = httpContext.cgiGet( "COMBO_OMOPECOD_Titlecontrolalign") ;
            Combo_omopecod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_OMOPECOD_Dropdownoptionstype") ;
            Combo_omopecod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Enabled")) ;
            Combo_omopecod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Visible")) ;
            Combo_omopecod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_OMOPECOD_Titlecontrolidtoreplace") ;
            Combo_omopecod_Datalisttype = httpContext.cgiGet( "COMBO_OMOPECOD_Datalisttype") ;
            Combo_omopecod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Allowmultipleselection")) ;
            Combo_omopecod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_OMOPECOD_Datalistfixedvalues") ;
            Combo_omopecod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Isgriditem")) ;
            Combo_omopecod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Hasdescription")) ;
            Combo_omopecod_Datalistproc = httpContext.cgiGet( "COMBO_OMOPECOD_Datalistproc") ;
            Combo_omopecod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_OMOPECOD_Datalistprocparametersprefix") ;
            Combo_omopecod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_OMOPECOD_Remoteservicesparameters") ;
            Combo_omopecod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_OMOPECOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_omopecod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Includeonlyselectedoption")) ;
            Combo_omopecod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Includeselectalloption")) ;
            Combo_omopecod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Emptyitem")) ;
            Combo_omopecod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OMOPECOD_Includeaddnewoption")) ;
            Combo_omopecod_Htmltemplate = httpContext.cgiGet( "COMBO_OMOPECOD_Htmltemplate") ;
            Combo_omopecod_Multiplevaluestype = httpContext.cgiGet( "COMBO_OMOPECOD_Multiplevaluestype") ;
            Combo_omopecod_Loadingdata = httpContext.cgiGet( "COMBO_OMOPECOD_Loadingdata") ;
            Combo_omopecod_Noresultsfound = httpContext.cgiGet( "COMBO_OMOPECOD_Noresultsfound") ;
            Combo_omopecod_Emptyitemtext = httpContext.cgiGet( "COMBO_OMOPECOD_Emptyitemtext") ;
            Combo_omopecod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_OMOPECOD_Onlyselectedvalues") ;
            Combo_omopecod_Selectalltext = httpContext.cgiGet( "COMBO_OMOPECOD_Selectalltext") ;
            Combo_omopecod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_OMOPECOD_Multiplevaluesseparator") ;
            Combo_omopecod_Addnewoptiontext = httpContext.cgiGet( "COMBO_OMOPECOD_Addnewoptiontext") ;
            Gridlevel_level1_titlescategories_Objectcall = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall") ;
            Gridlevel_level1_titlescategories_Class = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Class") ;
            Gridlevel_level1_titlescategories_Enabled = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled")) ;
            Gridlevel_level1_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname") ;
            Gridlevel_level1_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories") ;
            Gridlevel_level1_titlescategories_Visible = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Visible")) ;
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
            A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            AV33Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdMC");
            A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            forbiddenHiddens.add("OMCod", localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
            AV33Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV33Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A9425OMCod != Z9425OMCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmordmc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_16D0( ) ;
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
                        e1116D2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1216D2 ();
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
         e1216D2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll16D1232( ) ;
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
         disableAttributes16D1232( ) ;
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

   public void confirm_16D0( )
   {
      beforeValidate16D1232( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16D1232( ) ;
         }
         else
         {
            checkExtendedTable16D1232( ) ;
            closeExtendedTableCursors16D1232( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1232 = Gx_mode ;
         confirm_16D1234( ) ;
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

   public void confirm_16D1234( )
   {
      s9441OMMCCosT = O9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      nGXsfl_44_idx = 0 ;
      while ( nGXsfl_44_idx < nRC_GXsfl_44 )
      {
         readRow16D1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            getKey16D1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               if ( RcdFound1234 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16D1234( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16D1234( ) ;
                     closeExtendedTableCursors16D1234( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9441OMMCCosT = A9441OMMCCosT ;
                     n9441OMMCCosT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMOPECOD_" + sGXsfl_44_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( nRcdDeleted_1234 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16D1234( ) ;
                     load16D1234( ) ;
                     beforeValidate16D1234( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16D1234( ) ;
                        O9441OMMCCosT = A9441OMMCCosT ;
                        n9441OMMCCosT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16D1234( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16D1234( ) ;
                           closeExtendedTableCursors16D1234( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9441OMMCCosT = A9441OMMCCosT ;
                           n9441OMMCCosT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_44_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMOpeCargo_Internalname, GXutil.rtrim( A14501OMOpeCargo)) ;
         httpContext.changePostValue( edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_44_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9461OMMCCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( O9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9463OMMCCos_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_44_idx+"Horizontalalignment", GXutil.rtrim( edtOMOpeCod_Horizontalalignment)) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPECARGO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCargo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCNT_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCOS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9441OMMCCosT = s9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16D0( )
   {
   }

   public void e1116D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmordmc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV21EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordmc_impl.this.AV21EmprCod = GXv_char2[0] ;
      tmordmc_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordmc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV22WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV22WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV28DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV28DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_omopecod_Titlecontrolidtoreplace = edtOMOpeCod_Internalname ;
      ucCombo_omopecod.sendProperty(context, "", false, Combo_omopecod_Internalname, "TitleControlIdToReplace", Combo_omopecod_Titlecontrolidtoreplace);
      edtOMOpeCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Horizontalalignment", edtOMOpeCod_Horizontalalignment, !bGXsfl_44_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOOMOPECOD' */
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
      if ( ( GXutil.strcmp(AV23TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV33Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV34GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GXV1), 8, 0));
         while ( AV34GXV1 <= AV23TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV26TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV23TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV34GXV1));
            if ( GXutil.strcmp(AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "OMMaqCod") == 0 )
            {
               AV25Insert_OMMaqCod = AV26TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Insert_OMMaqCod", AV25Insert_OMMaqCod);
            }
            AV34GXV1 = (int)(AV34GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GXV1), 8, 0));
         }
      }
      Gridlevel_level1_titlescategories_Gridinternalname = subGridlevel_level1_Internalname ;
      ucGridlevel_level1_titlescategories.sendProperty(context, "", false, Gridlevel_level1_titlescategories_Internalname, "GridInternalName", Gridlevel_level1_titlescategories_Gridinternalname);
      GXv_char4[0] = AV21EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "OR", "") ;
      GXv_int8[0] = AV17MTMovCod ;
      GXv_char2[0] = AV18MTMovNom ;
      new app.mantenimientomaquina.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_char2) ;
      tmordmc_impl.this.AV21EmprCod = GXv_char4[0] ;
      tmordmc_impl.this.AV17MTMovCod = GXv_int8[0] ;
      tmordmc_impl.this.AV18MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
   }

   public void e1216D2( )
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
      /* 'LOADCOMBOOMOPECOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = AV27OMOpeCod_Data ;
      GXv_char4[0] = AV29ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item10[0] = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
      new app.mantenimientomaquina.tmordmcloaddvcombo(remoteHandle, context).execute( "OMOpeCod", Gx_mode, AV21EmprCod, AV14OMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item10) ;
      tmordmc_impl.this.AV29ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = GXv_objcol_SdtDVB_SDTComboData_Item10[0] ;
      AV27OMOpeCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   }

   public void zm16D1232( int GX_JID )
   {
      if ( ( GX_JID == 27 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9445OMEst = T016D6_A9445OMEst[0] ;
         }
         else
         {
            Z9445OMEst = A9445OMEst ;
         }
      }
      if ( GX_JID == -27 )
      {
         Z9426OMMaqCod = A9426OMMaqCod ;
         Z9425OMCod = A9425OMCod ;
         Z9445OMEst = A9445OMEst ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z9427OMMaqDsc = A9427OMMaqDsc ;
         Z9441OMMCCosT = A9441OMMCCosT ;
      }
   }

   public void standaloneNotModal( )
   {
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      edtOMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMMCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Enabled), 5, 0), true);
      AV33Pgmname = "MantenimientoMaquina.TMOrdMC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      edtOMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMMCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV21EmprCod)==0) )
      {
         A396EmprCod = AV21EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T016D7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016D7_A407EmprNom[0] ;
      n407EmprNom = T016D7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV14OMCod) )
      {
         A9425OMCod = AV14OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      /* Using cursor T016D8 */
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
      A9445OMEst = httpContext.getMessage( httpContext.getMessage( "R", ""), "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
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
         /* Using cursor T016D10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A9441OMMCCosT = T016D10_A9441OMMCCosT[0] ;
            n9441OMMCCosT = T016D10_n9441OMMCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         O9441OMMCCosT = A9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         pr_default.close(7);
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_OMMaqCod)==0) )
         {
            A9426OMMaqCod = AV25Insert_OMMaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         }
      }
   }

   public void load16D1232( )
   {
      /* Using cursor T016D12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), A9426OMMaqCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9445OMEst = T016D12_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A407EmprNom = T016D12_A407EmprNom[0] ;
         n407EmprNom = T016D12_n407EmprNom[0] ;
         A9441OMMCCosT = T016D12_A9441OMMCCosT[0] ;
         n9441OMMCCosT = T016D12_n9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         zm16D1232( -27) ;
      }
      pr_default.close(8);
      onLoadActions16D1232( ) ;
   }

   public void onLoadActions16D1232( )
   {
      O9441OMMCCosT = A9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV25Insert_OMMaqCod)==0) )
      {
         A9426OMMaqCod = AV25Insert_OMMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      }
   }

   public void checkExtendedTable16D1232( )
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
      /* Using cursor T016D10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A9441OMMCCosT = T016D10_A9441OMMCCosT[0] ;
         n9441OMMCCosT = T016D10_n9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         nIsDirty_1232 = (short)(1) ;
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors16D1232( )
   {
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_30( String A396EmprCod ,
                          int A9425OMCod )
   {
      /* Using cursor T016D14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A9441OMMCCosT = T016D14_A9441OMMCCosT[0] ;
         n9441OMMCCosT = T016D14_n9441OMMCCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey16D1232( )
   {
      /* Using cursor T016D15 */
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
      /* Using cursor T016D6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T016D6_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
      {
         zm16D1232( 27) ;
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T016D6_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9445OMEst = T016D6_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A396EmprCod = T016D6_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load16D1232( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1232 = (short)(0) ;
            initializeNonKey16D1232( ) ;
         }
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1232 = (short)(0) ;
         initializeNonKey16D1232( ) ;
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
      getKey16D1232( ) ;
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
      /* Using cursor T016D16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9425OMCod), A9426OMMaqCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T016D16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T016D16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016D16_A9425OMCod[0] < A9425OMCod ) ) && ( GXutil.strcmp(T016D16_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T016D16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T016D16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016D16_A9425OMCod[0] > A9425OMCod ) ) && ( GXutil.strcmp(T016D16_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
         {
            A396EmprCod = T016D16_A396EmprCod[0] ;
            A9425OMCod = T016D16_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T016D17 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9425OMCod), A9426OMMaqCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T016D17_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T016D17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016D17_A9425OMCod[0] > A9425OMCod ) ) && ( GXutil.strcmp(T016D17_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T016D17_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T016D17_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016D17_A9425OMCod[0] < A9425OMCod ) ) && ( GXutil.strcmp(T016D17_A9426OMMaqCod[0], A9426OMMaqCod) == 0 ) )
         {
            A396EmprCod = T016D17_A396EmprCod[0] ;
            A9425OMCod = T016D17_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16D1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9441OMMCCosT = O9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         insert16D1232( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9425OMCod = Z9425OMCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "OMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9441OMMCCosT = O9441OMMCCosT ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A9441OMMCCosT = O9441OMMCCosT ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               update16D1232( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               /* Insert record */
               A9441OMMCCosT = O9441OMMCCosT ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               insert16D1232( ) ;
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
                  A9441OMMCCosT = O9441OMMCCosT ;
                  n9441OMMCCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
                  insert16D1232( ) ;
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
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = Z9425OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "OMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9441OMMCCosT = O9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency16D1232( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016D5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z9445OMEst, T016D5_A9445OMEst[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9445OMEst, T016D5_A9445OMEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordmc:[seudo value changed for attri]"+"OMEst");
               GXutil.writeLogRaw("Old: ",Z9445OMEst);
               GXutil.writeLogRaw("Current: ",T016D5_A9445OMEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMORDEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16D1232( )
   {
      beforeValidate16D1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16D1232( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16D1232( 0) ;
         checkOptimisticConcurrency16D1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16D1232( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16D1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016D18 */
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
                        processLevel16D1232( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16D0( ) ;
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
            load16D1232( ) ;
         }
         endLevel16D1232( ) ;
      }
      closeExtendedTableCursors16D1232( ) ;
   }

   public void update16D1232( )
   {
      beforeValidate16D1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16D1232( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16D1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16D1232( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16D1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016D19 */
                  pr_default.execute(14, new Object[] {A9426OMMaqCod, A9445OMEst, A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16D1232( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16D1232( ) ;
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
         endLevel16D1232( ) ;
      }
      closeExtendedTableCursors16D1232( ) ;
   }

   public void deferredUpdate16D1232( )
   {
   }

   public void delete( )
   {
      beforeValidate16D1232( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16D1232( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16D1232( ) ;
         afterConfirm16D1232( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16D1232( ) ;
            if ( AnyError == 0 )
            {
               A9441OMMCCosT = O9441OMMCCosT ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               scanStart16D1234( ) ;
               while ( RcdFound1234 != 0 )
               {
                  getByPrimaryKey16D1234( ) ;
                  delete16D1234( ) ;
                  scanNext16D1234( ) ;
                  O9441OMMCCosT = A9441OMMCCosT ;
                  n9441OMMCCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               }
               scanEnd16D1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016D20 */
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
      endLevel16D1232( ) ;
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16D1232( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016D22 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            A9441OMMCCosT = T016D22_A9441OMMCCosT[0] ;
            n9441OMMCCosT = T016D22_n9441OMMCCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T016D23 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Equipos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T016D24 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T016D25 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T016D26 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Rep. de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void processNestedLevel16D1234( )
   {
      s9441OMMCCosT = O9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      nGXsfl_44_idx = 0 ;
      while ( nGXsfl_44_idx < nRC_GXsfl_44 )
      {
         readRow16D1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            standaloneNotModal16D1234( ) ;
            getKey16D1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16D1234( ) ;
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( ( nRcdDeleted_1234 != 0 ) && ( nRcdExists_1234 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16D1234( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16D1234( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_44_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9441OMMCCosT = A9441OMMCCosT ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         httpContext.changePostValue( edtOMOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMOpeCargo_Internalname, GXutil.rtrim( A14501OMOpeCargo)) ;
         httpContext.changePostValue( edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_44_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9461OMMCCnt_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( O9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9463OMMCCos_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_44_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_44_idx+"Horizontalalignment", GXutil.rtrim( edtOMOpeCod_Horizontalalignment)) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPECARGO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCargo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCNT_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCOS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16D1234( ) ;
      if ( AnyError != 0 )
      {
         O9441OMMCCosT = s9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      nRcdExists_1234 = (short)(0) ;
      nIsMod_1234 = (short)(0) ;
      nRcdDeleted_1234 = (short)(0) ;
   }

   public void processLevel16D1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel16D1234( ) ;
      if ( AnyError != 0 )
      {
         O9441OMMCCosT = s9441OMMCCosT ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16D1232( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16D1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmordmc");
         if ( AnyError == 0 )
         {
            confirmValues16D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmordmc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16D1232( )
   {
      /* Scan By routine */
      /* Using cursor T016D27 */
      pr_default.execute(21, new Object[] {A9426OMMaqCod});
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A396EmprCod = T016D27_A396EmprCod[0] ;
         A9425OMCod = T016D27_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16D1232( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A396EmprCod = T016D27_A396EmprCod[0] ;
         A9425OMCod = T016D27_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
   }

   public void scanEnd16D1232( )
   {
      pr_default.close(21);
   }

   public void afterConfirm16D1232( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16D1232( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16D1232( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16D1232( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16D1232( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16D1232( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16D1232( )
   {
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      edtOMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMMCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm16D1234( int GX_JID )
   {
      if ( ( GX_JID == 31 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9462OMMCPre = T016D3_A9462OMMCPre[0] ;
            Z9459OMMRCnt = T016D3_A9459OMMRCnt[0] ;
            Z9460OMMRPre = T016D3_A9460OMMRPre[0] ;
            Z9461OMMCCnt = T016D3_A9461OMMCCnt[0] ;
         }
         else
         {
            Z9462OMMCPre = A9462OMMCPre ;
            Z9459OMMRCnt = A9459OMMRCnt ;
            Z9460OMMRPre = A9460OMMRPre ;
            Z9461OMMCCnt = A9461OMMCCnt ;
         }
      }
      if ( GX_JID == -31 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         Z9462OMMCPre = A9462OMMCPre ;
         Z9459OMMRCnt = A9459OMMRCnt ;
         Z9460OMMRPre = A9460OMMRPre ;
         Z9461OMMCCnt = A9461OMMCCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9456OMOpeNom = A9456OMOpeNom ;
         Z9457OMOpePre = A9457OMOpePre ;
         Z14501OMOpeCargo = A14501OMOpeCargo ;
      }
   }

   public void standaloneNotModal16D1234( )
   {
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_44_Refreshing);
      edtOMMCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtOMMCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Enabled), 5, 0), true);
      edtOMMCCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Enabled), 5, 0), true);
   }

   public void standaloneModal16D1234( )
   {
      if ( isIns( )  )
      {
         A9458OMMTpo = httpContext.getMessage( httpContext.getMessage( "C", ""), "") ;
      }
      A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
      httpContext.ajax_rsp_assign_attri("", false, "A9472OMMRCos", GXutil.ltrimstr( A9472OMMRCos, 12, 3));
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      }
      else
      {
         edtOMOpeCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      }
   }

   public void load16D1234( )
   {
      /* Using cursor T016D28 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9462OMMCPre = T016D28_A9462OMMCPre[0] ;
         A9456OMOpeNom = T016D28_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T016D28_n9456OMOpeNom[0] ;
         A9457OMOpePre = T016D28_A9457OMOpePre[0] ;
         n9457OMOpePre = T016D28_n9457OMOpePre[0] ;
         A14501OMOpeCargo = T016D28_A14501OMOpeCargo[0] ;
         A9459OMMRCnt = T016D28_A9459OMMRCnt[0] ;
         A9460OMMRPre = T016D28_A9460OMMRPre[0] ;
         A9461OMMCCnt = T016D28_A9461OMMCCnt[0] ;
         zm16D1234( -31) ;
      }
      pr_default.close(22);
      onLoadActions16D1234( ) ;
   }

   public void onLoadActions16D1234( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9462OMMCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9462OMMCPre = A9457OMOpePre ;
      }
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      O9463OMMCCos = A9463OMMCCos ;
      if ( isIns( )  )
      {
         A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
         }
      }
      AV20OMMCCnt = O9461OMMCCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OMMCCnt", GXutil.ltrimstr( AV20OMMCCnt, 12, 3));
      if ( isUpd( )  && ( DecimalUtil.compareTo(A9461OMMCCnt, AV20OMMCCnt) != 0 ) )
      {
         Gx_msg = httpContext.getMessage( httpContext.getMessage( "Aviso.Ha cambiado la cantidad ", ""), "") + GXutil.trim( GXutil.str( AV20OMMCCnt, 12, 3)) + httpContext.getMessage( httpContext.getMessage( " por esta nueva ", ""), "") + GXutil.trim( GXutil.str( A9461OMMCCnt, 12, 3)) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
   }

   public void checkExtendedTable16D1234( )
   {
      nIsDirty_1234 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal16D1234( ) ;
      /* Using cursor T016D4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T016D4_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016D4_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016D4_A9457OMOpePre[0] ;
      n9457OMOpePre = T016D4_n9457OMOpePre[0] ;
      A14501OMOpeCargo = T016D4_A14501OMOpeCargo[0] ;
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9462OMMCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1234 = (short)(1) ;
         A9462OMMCPre = A9457OMOpePre ;
      }
      nIsDirty_1234 = (short)(1) ;
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1234 = (short)(1) ;
         A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
         n9441OMMCCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1234 = (short)(1) ;
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1234 = (short)(1) ;
               A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
         }
      }
      AV20OMMCCnt = O9461OMMCCnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OMMCCnt", GXutil.ltrimstr( AV20OMMCCnt, 12, 3));
      if ( isUpd( )  && ( DecimalUtil.compareTo(A9461OMMCCnt, AV20OMMCCnt) != 0 ) )
      {
         Gx_msg = httpContext.getMessage( httpContext.getMessage( "Aviso.Ha cambiado la cantidad ", ""), "") + GXutil.trim( GXutil.str( AV20OMMCCnt, 12, 3)) + httpContext.getMessage( httpContext.getMessage( " por esta nueva ", ""), "") + GXutil.trim( GXutil.str( A9461OMMCCnt, 12, 3)) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      }
   }

   public void closeExtendedTableCursors16D1234( )
   {
      pr_default.close(2);
   }

   public void enableDisable16D1234( )
   {
   }

   public void gxload_32( String A396EmprCod ,
                          int A9455OMOpeCod )
   {
      /* Using cursor T016D29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T016D29_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016D29_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016D29_A9457OMOpePre[0] ;
      n9457OMOpePre = T016D29_n9457OMOpePre[0] ;
      A14501OMOpeCargo = T016D29_A14501OMOpeCargo[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9456OMOpeNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14501OMOpeCargo))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKey16D1234( )
   {
      /* Using cursor T016D30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1234 = (short)(1) ;
      }
      else
      {
         RcdFound1234 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKey16D1234( )
   {
      /* Using cursor T016D3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T016D3_A9458OMMTpo[0], "C") == 0 ) )
      {
         zm16D1234( 31) ;
         RcdFound1234 = (short)(1) ;
         initializeNonKey16D1234( ) ;
         A9458OMMTpo = T016D3_A9458OMMTpo[0] ;
         A9462OMMCPre = T016D3_A9462OMMCPre[0] ;
         A9459OMMRCnt = T016D3_A9459OMMRCnt[0] ;
         A9460OMMRPre = T016D3_A9460OMMRPre[0] ;
         A9461OMMCCnt = T016D3_A9461OMMCCnt[0] ;
         A9455OMOpeCod = T016D3_A9455OMOpeCod[0] ;
         O9461OMMCCnt = A9461OMMCCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load16D1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1234 = (short)(0) ;
         initializeNonKey16D1234( ) ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16D1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16D1234( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16D1234( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016D2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9462OMMCPre, T016D2_A9462OMMCPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9459OMMRCnt, T016D2_A9459OMMRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9460OMMRPre, T016D2_A9460OMMRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9461OMMCCnt, T016D2_A9461OMMCCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9462OMMCPre, T016D2_A9462OMMCPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordmc:[seudo value changed for attri]"+"OMMCPre");
               GXutil.writeLogRaw("Old: ",Z9462OMMCPre);
               GXutil.writeLogRaw("Current: ",T016D2_A9462OMMCPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9459OMMRCnt, T016D2_A9459OMMRCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordmc:[seudo value changed for attri]"+"OMMRCnt");
               GXutil.writeLogRaw("Old: ",Z9459OMMRCnt);
               GXutil.writeLogRaw("Current: ",T016D2_A9459OMMRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9460OMMRPre, T016D2_A9460OMMRPre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordmc:[seudo value changed for attri]"+"OMMRPre");
               GXutil.writeLogRaw("Old: ",Z9460OMMRPre);
               GXutil.writeLogRaw("Current: ",T016D2_A9460OMMRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9461OMMCCnt, T016D2_A9461OMMCCnt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmordmc:[seudo value changed for attri]"+"OMMCCnt");
               GXutil.writeLogRaw("Old: ",Z9461OMMCCnt);
               GXutil.writeLogRaw("Current: ",T016D2_A9461OMMCCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16D1234( )
   {
      beforeValidate16D1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16D1234( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16D1234( 0) ;
         checkOptimisticConcurrency16D1234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16D1234( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16D1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016D31 */
                  pr_default.execute(25, new Object[] {Integer.valueOf(A9425OMCod), A9458OMMTpo, A9462OMMCPre, A9459OMMRCnt, A9460OMMRPre, A9461OMMCCnt, A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                  if ( (pr_default.getStatus(25) == 1) )
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
            load16D1234( ) ;
         }
         endLevel16D1234( ) ;
      }
      closeExtendedTableCursors16D1234( ) ;
   }

   public void update16D1234( )
   {
      beforeValidate16D1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16D1234( ) ;
      }
      if ( ( nIsMod_1234 != 0 ) || ( nIsDirty_1234 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16D1234( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16D1234( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16D1234( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016D32 */
                     pr_default.execute(26, new Object[] {A9462OMMCPre, A9459OMMRCnt, A9460OMMRPre, A9461OMMCCnt, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16D1234( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16D1234( ) ;
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
            endLevel16D1234( ) ;
         }
      }
      closeExtendedTableCursors16D1234( ) ;
   }

   public void deferredUpdate16D1234( )
   {
   }

   public void delete16D1234( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16D1234( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16D1234( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16D1234( ) ;
         afterConfirm16D1234( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16D1234( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016D33 */
               pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
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
      sMode1234 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16D1234( ) ;
      Gx_mode = sMode1234 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16D1234( )
   {
      standaloneModal16D1234( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016D34 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
         A9456OMOpeNom = T016D34_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T016D34_n9456OMOpeNom[0] ;
         A9457OMOpePre = T016D34_A9457OMOpePre[0] ;
         n9457OMOpePre = T016D34_n9457OMOpePre[0] ;
         A14501OMOpeCargo = T016D34_A14501OMOpeCargo[0] ;
         pr_default.close(28);
         AV20OMMCCnt = O9461OMMCCnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20OMMCCnt", GXutil.ltrimstr( AV20OMMCCnt, 12, 3));
         if ( isUpd( )  && ( DecimalUtil.compareTo(A9461OMMCCnt, AV20OMMCCnt) != 0 ) )
         {
            Gx_msg = httpContext.getMessage( httpContext.getMessage( "Aviso.Ha cambiado la cantidad ", ""), "") + GXutil.trim( GXutil.str( AV20OMMCCnt, 12, 3)) + httpContext.getMessage( httpContext.getMessage( " por esta nueva ", ""), "") + GXutil.trim( GXutil.str( A9461OMMCCnt, 12, 3)) ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         }
         A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
         if ( isIns( )  )
         {
            A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos) ;
            n9441OMMCCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9441OMMCCosT = O9441OMMCCosT.add(A9463OMMCCos).subtract(O9463OMMCCos) ;
               n9441OMMCCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9441OMMCCosT = O9441OMMCCosT.subtract(O9463OMMCCos) ;
                  n9441OMMCCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T016D35 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
      }
   }

   public void endLevel16D1234( )
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

   public void scanStart16D1234( )
   {
      /* Scan By routine */
      /* Using cursor T016D36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T016D36_A9455OMOpeCod[0] ;
         A9458OMMTpo = T016D36_A9458OMMTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16D1234( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T016D36_A9455OMOpeCod[0] ;
         A9458OMMTpo = T016D36_A9458OMMTpo[0] ;
      }
   }

   public void scanEnd16D1234( )
   {
      pr_default.close(30);
   }

   public void afterConfirm16D1234( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         AV30msg2 = httpContext.getMessage( httpContext.getMessage( "Aviso.Ha insertado una nueva linea¡¡", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30msg2", AV30msg2);
      }
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9462OMMCPre = A9457OMOpePre ;
      }
      if ( isUpd( )  && ( DecimalUtil.compareTo(A9461OMMCCnt, AV20OMMCCnt) != 0 ) && true /* After */ )
      {
         GXCCtl = "OMMCCNT_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(Gx_msg, 0, GXCCtl);
      }
      if ( isIns( )  && true /* After */ && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(AV30msg2, 0, "");
      }
   }

   public void beforeInsert16D1234( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16D1234( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16D1234( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16D1234( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16D1234( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16D1234( )
   {
      edtOMOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_44_Refreshing);
      edtOMOpeCargo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCargo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCargo_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtOMMCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtOMOpePre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtOMMCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtOMMCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_44_Refreshing);
   }

   public void send_integrity_lvl_hashes16D1234( )
   {
   }

   public void send_integrity_lvl_hashes16D1232( )
   {
   }

   public void subsflControlProps_441234( )
   {
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_44_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_44_idx );
      edtOMOpeCargo_Internalname = "OMOPECARGO_"+sGXsfl_44_idx ;
      edtOMMCCnt_Internalname = "OMMCCNT_"+sGXsfl_44_idx ;
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_44_idx ;
      edtOMMCPre_Internalname = "OMMCPRE_"+sGXsfl_44_idx ;
      edtOMMCCos_Internalname = "OMMCCOS_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_441234( )
   {
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_44_fel_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_44_fel_idx );
      edtOMOpeCargo_Internalname = "OMOPECARGO_"+sGXsfl_44_fel_idx ;
      edtOMMCCnt_Internalname = "OMMCCNT_"+sGXsfl_44_fel_idx ;
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_44_fel_idx ;
      edtOMMCPre_Internalname = "OMMCPRE_"+sGXsfl_44_fel_idx ;
      edtOMMCCos_Internalname = "OMMCCOS_"+sGXsfl_44_fel_idx ;
   }

   public void addRow16D1234( )
   {
      nGXsfl_44_idx = (int)(nGXsfl_44_idx+1) ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_441234( ) ;
      sendRow16D1234( ) ;
   }

   public void sendRow16D1234( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_44_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_44_idx + "',44)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMOpeCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtOMOpeCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "OMMTPO_" + sGXsfl_44_idx ;
      cmbOMMTpo.setName( GXCCtl );
      cmbOMMTpo.setWebtags( "" );
      cmbOMMTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMMTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9458OMMTpo)==0) )
         {
            A9458OMMTpo = "C" ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMMTpo,cmbOMMTpo.getInternalname(),GXutil.rtrim( A9458OMMTpo),Integer.valueOf(1),cmbOMMTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbOMMTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Values", cmbOMMTpo.ToJavascriptSource(), !bGXsfl_44_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeCargo_Internalname,GXutil.rtrim( A14501OMOpeCargo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeCargo_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMOpeCargo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_44_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_44_idx + "',44)\"" ;
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCCnt_Enabled!=0) ? localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCnt_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMCCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpePre_Internalname,GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMOpePre_Enabled!=0) ? localUtil.format( A9457OMOpePre, "ZZZZZ9.999") : localUtil.format( A9457OMOpePre, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpePre_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMOpePre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCPre_Enabled!=0) ? localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCPre_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMCPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "TagColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCCos_Enabled!=0) ? localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999") : localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCos_Jsonclick,Integer.valueOf(0),"TagColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMCCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes16D1234( ) ;
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9458OMMTpo));
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9461OMMCCnt_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9463OMMCCos_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1234_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1234_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV21EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "OMMRCOS_" + sGXsfl_44_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPECOD_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPECOD_"+sGXsfl_44_idx+"Horizontalalignment", GXutil.rtrim( edtOMOpeCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMTPO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPECARGO_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCargo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCNT_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPEPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCPRE_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCOS_"+sGXsfl_44_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow16D1234( )
   {
      nGXsfl_44_idx = (int)(nGXsfl_44_idx+1) ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_441234( ) ;
      edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpeCod_Horizontalalignment = httpContext.cgiGet( "OMOPECOD_"+sGXsfl_44_idx+"Horizontalalignment") ;
      cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMOpeCargo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECARGO_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCNT_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCPRE_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCOS_"+sGXsfl_44_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         wbErr = true ;
         A9455OMOpeCod = 0 ;
      }
      else
      {
         A9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      cmbOMMTpo.setName( cmbOMMTpo.getInternalname() );
      cmbOMMTpo.setValue( httpContext.cgiGet( cmbOMMTpo.getInternalname()) );
      A9458OMMTpo = httpContext.cgiGet( cmbOMMTpo.getInternalname()) ;
      A14501OMOpeCargo = httpContext.cgiGet( edtOMOpeCargo_Internalname) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMMCCNT_" + sGXsfl_44_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMCCnt_Internalname ;
         wbErr = true ;
         A9461OMMCCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)) ;
      }
      A9457OMOpePre = localUtil.ctond( httpContext.cgiGet( edtOMOpePre_Internalname)) ;
      n9457OMOpePre = false ;
      A9462OMMCPre = localUtil.ctond( httpContext.cgiGet( edtOMMCPre_Internalname)) ;
      A9463OMMCCos = localUtil.ctond( httpContext.cgiGet( edtOMMCCos_Internalname)) ;
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_44_idx ;
      Z9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_44_idx ;
      Z9458OMMTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_44_idx ;
      Z9462OMMCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_44_idx ;
      Z9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_44_idx ;
      Z9460OMMRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_44_idx ;
      Z9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_44_idx ;
      A9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_44_idx ;
      A9460OMMRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9461OMMCCnt_" + sGXsfl_44_idx ;
      O9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9463OMMCCos_" + sGXsfl_44_idx ;
      O9463OMMCCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_44_idx ;
      nRcdDeleted_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1234_" + sGXsfl_44_idx ;
      nRcdExists_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1234_" + sGXsfl_44_idx ;
      nIsMod_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "OMMRCOS_" + sGXsfl_44_idx ;
      A9472OMMRCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defedtOMMCPre_Enabled = edtOMMCPre_Enabled ;
      defcmbOMMTpo_Enabled = cmbOMMTpo.getEnabled() ;
      defedtOMOpeCod_Enabled = edtOMOpeCod_Enabled ;
   }

   public void confirmValues16D0( )
   {
      nGXsfl_44_idx = 0 ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_441234( ) ;
      while ( nGXsfl_44_idx < nRC_GXsfl_44 )
      {
         nGXsfl_44_idx = (int)(nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_441234( ) ;
         httpContext.changePostValue( "Z9455OMOpeCod_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9458OMMTpo_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9458OMMTpo_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9462OMMCPre_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9462OMMCPre_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9459OMMRCnt_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9460OMMRPre_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9460OMMRPre_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_44_idx) ;
         httpContext.changePostValue( "Z9461OMMCCnt_"+sGXsfl_44_idx, httpContext.cgiGet( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_44_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_44_idx) ;
      }
      httpContext.changePostValue( "O9461OMMCCnt", httpContext.cgiGet( "T9461OMMCCnt")) ;
      httpContext.deletePostValue( "T9461OMMCCnt") ;
      httpContext.changePostValue( "O9463OMMCCos", httpContext.cgiGet( "T9463OMMCCos")) ;
      httpContext.deletePostValue( "T9463OMMCCos") ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmordmc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(A9427OMMaqDsc))}, new String[] {"Gx_mode","EmprCod","OMCod","OMMaqCod","OMMaqDsc"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdMC");
      forbiddenHiddens.add("OMCod", localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV33Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmordmc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "O9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( O9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nGXsfl_44_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV28DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOMOPECOD_DATA", AV27OMOpeCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOMOPECOD_DATA", AV27OMOpeCod_Data);
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
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCNT", GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRPRE", GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCOS", GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMMCCNT", GXutil.ltrim( localUtil.ntoc( AV20OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG2", AV30msg2);
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPENOM", GXutil.rtrim( A9456OMOpeNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECOD_Objectcall", GXutil.rtrim( Combo_omopecod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECOD_Cls", GXutil.rtrim( Combo_omopecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECOD_Enabled", GXutil.booltostr( Combo_omopecod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_omopecod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECOD_Isgriditem", GXutil.booltostr( Combo_omopecod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OMOPECOD_Emptyitem", GXutil.booltostr( Combo_omopecod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall", GXutil.rtrim( Gridlevel_level1_titlescategories_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled", GXutil.booltostr( Gridlevel_level1_titlescategories_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridtitlescategories));
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
      return formatLink("app.mantenimientomaquina.tmordmc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9426OMMaqCod)),GXutil.URLEncode(GXutil.rtrim(A9427OMMaqDsc))}, new String[] {"Gx_mode","EmprCod","OMCod","OMMaqCod","OMMaqDsc"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMOrdMC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Con Mano de Obra Orden Trabajo", "") ;
   }

   public void initializeNonKey16D1232( )
   {
      A9445OMEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      A9441OMMCCosT = DecimalUtil.ZERO ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      O9441OMMCCosT = A9441OMMCCosT ;
      n9441OMMCCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrimstr( A9441OMMCCosT, 12, 3));
      Z9445OMEst = "" ;
   }

   public void initAll16D1232( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9425OMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      initializeNonKey16D1232( ) ;
   }

   public void standaloneModalInsert( )
   {
      A9445OMEst = i9445OMEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
   }

   public void initializeNonKey16D1234( )
   {
      AV20OMMCCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OMMCCnt", GXutil.ltrimstr( AV20OMMCCnt, 12, 3));
      AV30msg2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30msg2", AV30msg2);
      A9463OMMCCos = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9472OMMRCos", GXutil.ltrimstr( A9472OMMRCos, 12, 3));
      A9456OMOpeNom = "" ;
      n9456OMOpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", A9456OMOpeNom);
      A9457OMOpePre = DecimalUtil.ZERO ;
      n9457OMOpePre = false ;
      A14501OMOpeCargo = "" ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9459OMMRCnt", GXutil.ltrimstr( A9459OMMRCnt, 12, 3));
      A9460OMMRPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9460OMMRPre", GXutil.ltrimstr( A9460OMMRPre, 12, 3));
      A9461OMMCCnt = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
      A9462OMMCPre = DecimalUtil.ZERO ;
      O9461OMMCCnt = A9461OMMCCnt ;
      O9463OMMCCos = A9463OMMCCos ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      Z9459OMMRCnt = DecimalUtil.ZERO ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
   }

   public void initAll16D1234( )
   {
      A9455OMOpeCod = 0 ;
      A9458OMMTpo = "C" ;
      initializeNonKey16D1234( ) ;
   }

   public void standaloneModalInsert16D1234( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211661542", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmordmc.js", "?20268211661542", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1234( )
   {
      edtOMMCPre_Enabled = defedtOMMCPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      cmbOMMTpo.setEnabled( defcmbOMMTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_44_Refreshing);
      edtOMOpeCod_Enabled = defedtOMOpeCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtOMOpeCod_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9458OMMTpo));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14501OMOpeCargo));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCargo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOMMCCosT_Internalname = "OMMCCOST" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtOMOpeCod_Internalname = "OMOPECOD" ;
      cmbOMMTpo.setInternalname( "OMMTPO" );
      edtOMOpeCargo_Internalname = "OMOPECARGO" ;
      edtOMMCCnt_Internalname = "OMMCCNT" ;
      edtOMOpePre_Internalname = "OMOPEPRE" ;
      edtOMMCPre_Internalname = "OMMCPRE" ;
      edtOMMCCos_Internalname = "OMMCCOS" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_omopecod_Internalname = "COMBO_OMOPECOD" ;
      Gridlevel_level1_titlescategories_Internalname = "GRIDLEVEL_LEVEL1_TITLESCATEGORIES" ;
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
      Combo_omopecod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Con Mano de Obra Orden Trabajo", "") );
      edtOMMCCos_Jsonclick = "" ;
      edtOMMCPre_Jsonclick = "" ;
      edtOMOpePre_Jsonclick = "" ;
      edtOMMCCnt_Jsonclick = "" ;
      edtOMOpeCargo_Jsonclick = "" ;
      cmbOMMTpo.setJsonclick( "" );
      edtOMOpeCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_omopecod_Titlecontrolidtoreplace = "" ;
      edtOMMCCos_Enabled = 0 ;
      edtOMMCPre_Enabled = 0 ;
      edtOMOpePre_Enabled = 0 ;
      edtOMMCCnt_Enabled = 1 ;
      edtOMOpeCargo_Enabled = 0 ;
      cmbOMMTpo.setEnabled( 0 );
      edtOMOpeCod_Enabled = 1 ;
      Gridlevel_level1_titlescategories_Gridtitlescategories = ";;;;Consumo;;Consumo;Consumo" ;
      Combo_omopecod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_omopecod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_omopecod_Cls = "ExtendedCombo" ;
      Combo_omopecod_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtOMMCCosT_Jsonclick = "" ;
      edtOMMCCosT_Enabled = 0 ;
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
      edtOMOpeCod_Horizontalalignment = "right" ;
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
      subsflControlProps_441234( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16D1234( ) ;
         standaloneModal16D1234( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16D1234( ) ;
         nGXsfl_44_idx = (int)(nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_441234( ) ;
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
      GXCCtl = "OMMTPO_" + sGXsfl_44_idx ;
      cmbOMMTpo.setName( GXCCtl );
      cmbOMMTpo.setWebtags( "" );
      cmbOMMTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMMTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9458OMMTpo)==0) )
         {
            A9458OMMTpo = "C" ;
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
      n9441OMMCCosT = false ;
      /* Using cursor T016D22 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A9441OMMCCosT = T016D22_A9441OMMCCosT[0] ;
         n9441OMMCCosT = T016D22_n9441OMMCCosT[0] ;
      }
      else
      {
         A9441OMMCCosT = DecimalUtil.doubleToDec(0) ;
         n9441OMMCCosT = false ;
      }
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9441OMMCCosT", GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), ".", "")));
   }

   public void valid_Omopecod( )
   {
      n9457OMOpePre = false ;
      n9456OMOpeNom = false ;
      /* Using cursor T016D34 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
      }
      A9456OMOpeNom = T016D34_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016D34_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016D34_A9457OMOpePre[0] ;
      n9457OMOpePre = T016D34_n9457OMOpePre[0] ;
      A14501OMOpeCargo = T016D34_A14501OMOpeCargo[0] ;
      pr_default.close(28);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9462OMMCPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9462OMMCPre = A9457OMOpePre ;
      }
      dynload_actions( ) ;
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         A9458OMMTpo = cmbOMMTpo.getValidValue(A9458OMMTpo) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", GXutil.rtrim( A9456OMOpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9457OMOpePre", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14501OMOpeCargo", GXutil.rtrim( A14501OMOpeCargo));
      httpContext.ajax_rsp_assign_attri("", false, "A9462OMMCPre", GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(12), (byte)(3), ".", "")));
   }

   public void valid_Ommccnt( )
   {
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      AV20OMMCCnt = O9461OMMCCnt ;
      if ( isUpd( )  && ( DecimalUtil.compareTo(A9461OMMCCnt, AV20OMMCCnt) != 0 ) )
      {
         Gx_msg = httpContext.getMessage( httpContext.getMessage( "Aviso.Ha cambiado la cantidad ", ""), "") + GXutil.trim( GXutil.str( AV20OMMCCnt, 12, 3)) + httpContext.getMessage( httpContext.getMessage( " por esta nueva ", ""), "") + GXutil.trim( GXutil.str( A9461OMMCCnt, 12, 3)) ;
      }
      dynload_actions( ) ;
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         A9458OMMTpo = cmbOMMTpo.getValidValue(A9458OMMTpo) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9463OMMCCos", GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20OMMCCnt", GXutil.ltrim( localUtil.ntoc( AV20OMMCCnt, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", GXutil.rtrim( Gx_msg));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV33Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1216D2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9441OMMCCosT',fld:'OMMCCOST',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_OMCOD",",oparms:[{av:'A9441OMMCCosT',fld:'OMMCCOST',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_OMOPECOD","{handler:'valid_Omopecod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A14501OMOpeCargo',fld:'OMOPECARGO',pic:''},{av:'A9462OMMCPre',fld:'OMMCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMOPECOD",",oparms:[{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'A14501OMOpeCargo',fld:'OMOPECARGO',pic:''},{av:'A9462OMMCPre',fld:'OMMCPRE',pic:'ZZ,ZZZ,ZZ9.999'}]}");
      setEventMetadata("VALID_OMMTPO","{handler:'valid_Ommtpo',iparms:[]");
      setEventMetadata("VALID_OMMTPO",",oparms:[]}");
      setEventMetadata("VALID_OMMCCNT","{handler:'valid_Ommccnt',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O9461OMMCCnt'},{av:'O9463OMMCCos'},{av:'O9441OMMCCosT'},{av:'A9461OMMCCnt',fld:'OMMCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9462OMMCPre',fld:'OMMCPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'A9463OMMCCos',fld:'OMMCCOS',pic:'ZZZZZZZ9.999'},{av:'AV20OMMCCnt',fld:'vOMMCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'Gx_msg',fld:'vMSG',pic:''}]");
      setEventMetadata("VALID_OMMCCNT",",oparms:[{av:'A9463OMMCCos',fld:'OMMCCOS',pic:'ZZZZZZZ9.999'},{av:'AV20OMMCCnt',fld:'vOMMCCNT',pic:'ZZ,ZZZ,ZZ9.999'},{av:'Gx_msg',fld:'vMSG',pic:''}]}");
      setEventMetadata("VALID_OMOPEPRE","{handler:'valid_Omopepre',iparms:[]");
      setEventMetadata("VALID_OMOPEPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMCPRE","{handler:'valid_Ommcpre',iparms:[]");
      setEventMetadata("VALID_OMMCPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMCCOS","{handler:'valid_Ommccos',iparms:[]");
      setEventMetadata("VALID_OMMCCOS",",oparms:[]}");
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
      pr_default.close(28);
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
      O9441OMMCCosT = DecimalUtil.ZERO ;
      Z9458OMMTpo = "" ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      Z9459OMMRCnt = DecimalUtil.ZERO ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
      O9461OMMCCnt = DecimalUtil.ZERO ;
      O9463OMMCCos = DecimalUtil.ZERO ;
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
      A9441OMMCCosT = DecimalUtil.ZERO ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV33Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_omopecod = new com.genexus.webpanels.GXUserControl();
      AV28DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV27OMOpeCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucGridlevel_level1_titlescategories = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9441OMMCCosT = DecimalUtil.ZERO ;
      sMode1234 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      AV25Insert_OMMaqCod = "" ;
      A407EmprNom = "" ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      AV20OMMCCnt = DecimalUtil.ZERO ;
      AV30msg2 = "" ;
      Gx_msg = "" ;
      A9456OMOpeNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_omopecod_Objectcall = "" ;
      Combo_omopecod_Class = "" ;
      Combo_omopecod_Icontype = "" ;
      Combo_omopecod_Icon = "" ;
      Combo_omopecod_Tooltip = "" ;
      Combo_omopecod_Selectedvalue_set = "" ;
      Combo_omopecod_Selectedvalue_get = "" ;
      Combo_omopecod_Selectedtext_set = "" ;
      Combo_omopecod_Selectedtext_get = "" ;
      Combo_omopecod_Gamoauthtoken = "" ;
      Combo_omopecod_Ddointernalname = "" ;
      Combo_omopecod_Titlecontrolalign = "" ;
      Combo_omopecod_Dropdownoptionstype = "" ;
      Combo_omopecod_Datalisttype = "" ;
      Combo_omopecod_Datalistfixedvalues = "" ;
      Combo_omopecod_Datalistproc = "" ;
      Combo_omopecod_Datalistprocparametersprefix = "" ;
      Combo_omopecod_Remoteservicesparameters = "" ;
      Combo_omopecod_Htmltemplate = "" ;
      Combo_omopecod_Multiplevaluestype = "" ;
      Combo_omopecod_Loadingdata = "" ;
      Combo_omopecod_Noresultsfound = "" ;
      Combo_omopecod_Emptyitemtext = "" ;
      Combo_omopecod_Onlyselectedvalues = "" ;
      Combo_omopecod_Selectalltext = "" ;
      Combo_omopecod_Multiplevaluesseparator = "" ;
      Combo_omopecod_Addnewoptiontext = "" ;
      Gridlevel_level1_titlescategories_Objectcall = "" ;
      Gridlevel_level1_titlescategories_Class = "" ;
      Gridlevel_level1_titlescategories_Gridinternalname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1232 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s9441OMMCCosT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9458OMMTpo = "" ;
      A14501OMOpeCargo = "" ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9463OMMCCos = DecimalUtil.ZERO ;
      T9461OMMCCnt = DecimalUtil.ZERO ;
      T9463OMMCCos = DecimalUtil.ZERO ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV22WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV23TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24WebSession = httpContext.getWebSession();
      AV26TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      AV18MTMovNom = "" ;
      GXv_char2 = new String[1] ;
      GXt_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV29ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection[1] ;
      Z9426OMMaqCod = "" ;
      Z407EmprNom = "" ;
      Z9427OMMaqDsc = "" ;
      Z9441OMMCCosT = DecimalUtil.ZERO ;
      T016D7_A407EmprNom = new String[] {""} ;
      T016D7_n407EmprNom = new boolean[] {false} ;
      T016D8_A9427OMMaqDsc = new String[] {""} ;
      T016D8_n9427OMMaqDsc = new boolean[] {false} ;
      T016D10_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D10_n9441OMMCCosT = new boolean[] {false} ;
      T016D12_A9426OMMaqCod = new String[] {""} ;
      T016D12_A9427OMMaqDsc = new String[] {""} ;
      T016D12_n9427OMMaqDsc = new boolean[] {false} ;
      T016D12_A9425OMCod = new int[1] ;
      T016D12_A9445OMEst = new String[] {""} ;
      T016D12_A407EmprNom = new String[] {""} ;
      T016D12_n407EmprNom = new boolean[] {false} ;
      T016D12_A396EmprCod = new String[] {""} ;
      T016D12_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D12_n9441OMMCCosT = new boolean[] {false} ;
      T016D14_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D14_n9441OMMCCosT = new boolean[] {false} ;
      T016D15_A396EmprCod = new String[] {""} ;
      T016D15_A9425OMCod = new int[1] ;
      T016D6_A9426OMMaqCod = new String[] {""} ;
      T016D6_A9425OMCod = new int[1] ;
      T016D6_A9445OMEst = new String[] {""} ;
      T016D6_A396EmprCod = new String[] {""} ;
      T016D16_A396EmprCod = new String[] {""} ;
      T016D16_A9425OMCod = new int[1] ;
      T016D16_A9426OMMaqCod = new String[] {""} ;
      T016D17_A396EmprCod = new String[] {""} ;
      T016D17_A9425OMCod = new int[1] ;
      T016D17_A9426OMMaqCod = new String[] {""} ;
      T016D5_A9426OMMaqCod = new String[] {""} ;
      T016D5_A9425OMCod = new int[1] ;
      T016D5_A9445OMEst = new String[] {""} ;
      T016D5_A396EmprCod = new String[] {""} ;
      T016D22_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D22_n9441OMMCCosT = new boolean[] {false} ;
      T016D23_A396EmprCod = new String[] {""} ;
      T016D23_A9425OMCod = new int[1] ;
      T016D23_A11446OMMEquCod = new String[] {""} ;
      T016D23_A11447OMMSEqCod = new String[] {""} ;
      T016D23_A11448OMMPieCod = new String[] {""} ;
      T016D24_A396EmprCod = new String[] {""} ;
      T016D24_A9425OMCod = new int[1] ;
      T016D24_A9430TMCod = new int[1] ;
      T016D25_A396EmprCod = new String[] {""} ;
      T016D25_A9425OMCod = new int[1] ;
      T016D25_A9455OMOpeCod = new int[1] ;
      T016D25_A9458OMMTpo = new String[] {""} ;
      T016D25_A9466OMMCLin = new short[1] ;
      T016D26_A396EmprCod = new String[] {""} ;
      T016D26_A9425OMCod = new int[1] ;
      T016D26_A9446OMRepCod = new int[1] ;
      T016D26_A9449OMRTpo = new String[] {""} ;
      T016D27_A396EmprCod = new String[] {""} ;
      T016D27_A9425OMCod = new int[1] ;
      Z9456OMOpeNom = "" ;
      Z9457OMOpePre = DecimalUtil.ZERO ;
      Z14501OMOpeCargo = "" ;
      T016D28_A9425OMCod = new int[1] ;
      T016D28_A9458OMMTpo = new String[] {""} ;
      T016D28_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D28_A9456OMOpeNom = new String[] {""} ;
      T016D28_n9456OMOpeNom = new boolean[] {false} ;
      T016D28_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D28_n9457OMOpePre = new boolean[] {false} ;
      T016D28_A14501OMOpeCargo = new String[] {""} ;
      T016D28_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D28_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D28_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D28_A396EmprCod = new String[] {""} ;
      T016D28_A9455OMOpeCod = new int[1] ;
      T016D4_A9456OMOpeNom = new String[] {""} ;
      T016D4_n9456OMOpeNom = new boolean[] {false} ;
      T016D4_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D4_n9457OMOpePre = new boolean[] {false} ;
      T016D4_A14501OMOpeCargo = new String[] {""} ;
      T016D29_A9456OMOpeNom = new String[] {""} ;
      T016D29_n9456OMOpeNom = new boolean[] {false} ;
      T016D29_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D29_n9457OMOpePre = new boolean[] {false} ;
      T016D29_A14501OMOpeCargo = new String[] {""} ;
      T016D30_A396EmprCod = new String[] {""} ;
      T016D30_A9425OMCod = new int[1] ;
      T016D30_A9455OMOpeCod = new int[1] ;
      T016D30_A9458OMMTpo = new String[] {""} ;
      T016D3_A9425OMCod = new int[1] ;
      T016D3_A9458OMMTpo = new String[] {""} ;
      T016D3_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D3_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D3_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D3_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D3_A396EmprCod = new String[] {""} ;
      T016D3_A9455OMOpeCod = new int[1] ;
      T016D2_A9425OMCod = new int[1] ;
      T016D2_A9458OMMTpo = new String[] {""} ;
      T016D2_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D2_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D2_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D2_A396EmprCod = new String[] {""} ;
      T016D2_A9455OMOpeCod = new int[1] ;
      T016D34_A9456OMOpeNom = new String[] {""} ;
      T016D34_n9456OMOpeNom = new boolean[] {false} ;
      T016D34_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016D34_n9457OMOpePre = new boolean[] {false} ;
      T016D34_A14501OMOpeCargo = new String[] {""} ;
      T016D35_A396EmprCod = new String[] {""} ;
      T016D35_A9425OMCod = new int[1] ;
      T016D35_A9455OMOpeCod = new int[1] ;
      T016D35_A9458OMMTpo = new String[] {""} ;
      T016D35_A9466OMMCLin = new short[1] ;
      T016D36_A396EmprCod = new String[] {""} ;
      T016D36_A9425OMCod = new int[1] ;
      T016D36_A9455OMOpeCod = new int[1] ;
      T016D36_A9458OMMTpo = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i9445OMEst = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      Z9463OMMCCos = DecimalUtil.ZERO ;
      ZV20OMMCCnt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordmc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordmc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordmc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordmc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordmc__default(),
         new Object[] {
             new Object[] {
            T016D2_A9425OMCod, T016D2_A9458OMMTpo, T016D2_A9462OMMCPre, T016D2_A9459OMMRCnt, T016D2_A9460OMMRPre, T016D2_A9461OMMCCnt, T016D2_A396EmprCod, T016D2_A9455OMOpeCod
            }
            , new Object[] {
            T016D3_A9425OMCod, T016D3_A9458OMMTpo, T016D3_A9462OMMCPre, T016D3_A9459OMMRCnt, T016D3_A9460OMMRPre, T016D3_A9461OMMCCnt, T016D3_A396EmprCod, T016D3_A9455OMOpeCod
            }
            , new Object[] {
            T016D4_A9456OMOpeNom, T016D4_n9456OMOpeNom, T016D4_A9457OMOpePre, T016D4_n9457OMOpePre, T016D4_A14501OMOpeCargo
            }
            , new Object[] {
            T016D5_A9426OMMaqCod, T016D5_A9425OMCod, T016D5_A9445OMEst, T016D5_A396EmprCod
            }
            , new Object[] {
            T016D6_A9426OMMaqCod, T016D6_A9425OMCod, T016D6_A9445OMEst, T016D6_A396EmprCod
            }
            , new Object[] {
            T016D7_A407EmprNom, T016D7_n407EmprNom
            }
            , new Object[] {
            T016D8_A9427OMMaqDsc, T016D8_n9427OMMaqDsc
            }
            , new Object[] {
            T016D10_A9441OMMCCosT, T016D10_n9441OMMCCosT
            }
            , new Object[] {
            T016D12_A9426OMMaqCod, T016D12_A9427OMMaqDsc, T016D12_n9427OMMaqDsc, T016D12_A9425OMCod, T016D12_A9445OMEst, T016D12_A407EmprNom, T016D12_n407EmprNom, T016D12_A396EmprCod, T016D12_A9441OMMCCosT, T016D12_n9441OMMCCosT
            }
            , new Object[] {
            T016D14_A9441OMMCCosT, T016D14_n9441OMMCCosT
            }
            , new Object[] {
            T016D15_A396EmprCod, T016D15_A9425OMCod
            }
            , new Object[] {
            T016D16_A396EmprCod, T016D16_A9425OMCod, T016D16_A9426OMMaqCod
            }
            , new Object[] {
            T016D17_A396EmprCod, T016D17_A9425OMCod, T016D17_A9426OMMaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016D22_A9441OMMCCosT, T016D22_n9441OMMCCosT
            }
            , new Object[] {
            T016D23_A396EmprCod, T016D23_A9425OMCod, T016D23_A11446OMMEquCod, T016D23_A11447OMMSEqCod, T016D23_A11448OMMPieCod
            }
            , new Object[] {
            T016D24_A396EmprCod, T016D24_A9425OMCod, T016D24_A9430TMCod
            }
            , new Object[] {
            T016D25_A396EmprCod, T016D25_A9425OMCod, T016D25_A9455OMOpeCod, T016D25_A9458OMMTpo, T016D25_A9466OMMCLin
            }
            , new Object[] {
            T016D26_A396EmprCod, T016D26_A9425OMCod, T016D26_A9446OMRepCod, T016D26_A9449OMRTpo
            }
            , new Object[] {
            T016D27_A396EmprCod, T016D27_A9425OMCod
            }
            , new Object[] {
            T016D28_A9425OMCod, T016D28_A9458OMMTpo, T016D28_A9462OMMCPre, T016D28_A9456OMOpeNom, T016D28_n9456OMOpeNom, T016D28_A9457OMOpePre, T016D28_n9457OMOpePre, T016D28_A14501OMOpeCargo, T016D28_A9459OMMRCnt, T016D28_A9460OMMRPre,
            T016D28_A9461OMMCCnt, T016D28_A396EmprCod, T016D28_A9455OMOpeCod
            }
            , new Object[] {
            T016D29_A9456OMOpeNom, T016D29_n9456OMOpeNom, T016D29_A9457OMOpePre, T016D29_n9457OMOpePre, T016D29_A14501OMOpeCargo
            }
            , new Object[] {
            T016D30_A396EmprCod, T016D30_A9425OMCod, T016D30_A9455OMOpeCod, T016D30_A9458OMMTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016D34_A9456OMOpeNom, T016D34_n9456OMOpeNom, T016D34_A9457OMOpePre, T016D34_n9457OMOpePre, T016D34_A14501OMOpeCargo
            }
            , new Object[] {
            T016D35_A396EmprCod, T016D35_A9425OMCod, T016D35_A9455OMOpeCod, T016D35_A9458OMMTpo, T016D35_A9466OMMCLin
            }
            , new Object[] {
            T016D36_A396EmprCod, T016D36_A9425OMCod, T016D36_A9455OMOpeCod, T016D36_A9458OMMTpo
            }
         }
      );
      Z9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      A9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      Z9426OMMaqCod = "" ;
      A9426OMMaqCod = "" ;
      AV33Pgmname = "MantenimientoMaquina.TMOrdMC" ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      Z9458OMMTpo = "C" ;
      A9458OMMTpo = "C" ;
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
   private short nRcdDeleted_1234 ;
   private short nRcdExists_1234 ;
   private short nIsMod_1234 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1234 ;
   private short RcdFound1234 ;
   private short nBlankRcdUsr1234 ;
   private short RcdFound1232 ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1234 ;
   private int wcpOAV14OMCod ;
   private int Z9425OMCod ;
   private int nRC_GXsfl_44 ;
   private int nGXsfl_44_idx=1 ;
   private int Z9455OMOpeCod ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int AV14OMCod ;
   private int trnEnded ;
   private int edtOMCod_Enabled ;
   private int edtOMMaqCod_Enabled ;
   private int edtOMMaqDsc_Enabled ;
   private int edtOMMCCosT_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtOMOpeCod_Enabled ;
   private int edtOMOpeCargo_Enabled ;
   private int edtOMMCCnt_Enabled ;
   private int edtOMOpePre_Enabled ;
   private int edtOMMCPre_Enabled ;
   private int edtOMMCCos_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_omopecod_Datalistupdateminimumcharacters ;
   private int AV34GXV1 ;
   private int AV17MTMovCod ;
   private int GXv_int8[] ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtOMMCPre_Enabled ;
   private int defcmbOMMTpo_Enabled ;
   private int defedtOMOpeCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal O9441OMMCCosT ;
   private java.math.BigDecimal Z9462OMMCPre ;
   private java.math.BigDecimal Z9459OMMRCnt ;
   private java.math.BigDecimal Z9460OMMRPre ;
   private java.math.BigDecimal Z9461OMMCCnt ;
   private java.math.BigDecimal O9461OMMCCnt ;
   private java.math.BigDecimal O9463OMMCCos ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal B9441OMMCCosT ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal A9460OMMRPre ;
   private java.math.BigDecimal A9472OMMRCos ;
   private java.math.BigDecimal AV20OMMCCnt ;
   private java.math.BigDecimal s9441OMMCCosT ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9457OMOpePre ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9463OMMCCos ;
   private java.math.BigDecimal T9461OMMCCnt ;
   private java.math.BigDecimal T9463OMMCCos ;
   private java.math.BigDecimal Z9441OMMCCosT ;
   private java.math.BigDecimal Z9457OMOpePre ;
   private java.math.BigDecimal Z9463OMMCCos ;
   private java.math.BigDecimal ZV20OMMCCnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV21EmprCod ;
   private String wcpOA9426OMMaqCod ;
   private String wcpOA9427OMMaqDsc ;
   private String Z396EmprCod ;
   private String Z9445OMEst ;
   private String Z9458OMMTpo ;
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
   private String edtOMOpeCod_Horizontalalignment ;
   private String edtOMOpeCod_Internalname ;
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
   private String edtOMMCCosT_Internalname ;
   private String edtOMMCCosT_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV33Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_omopecod_Caption ;
   private String Combo_omopecod_Cls ;
   private String Combo_omopecod_Internalname ;
   private String Gridlevel_level1_titlescategories_Gridtitlescategories ;
   private String Gridlevel_level1_titlescategories_Internalname ;
   private String sMode1234 ;
   private String edtOMOpeCargo_Internalname ;
   private String edtOMMCCnt_Internalname ;
   private String edtOMOpePre_Internalname ;
   private String edtOMMCPre_Internalname ;
   private String edtOMMCCos_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV25Insert_OMMaqCod ;
   private String A407EmprNom ;
   private String Gx_msg ;
   private String A9456OMOpeNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_omopecod_Objectcall ;
   private String Combo_omopecod_Class ;
   private String Combo_omopecod_Icontype ;
   private String Combo_omopecod_Icon ;
   private String Combo_omopecod_Tooltip ;
   private String Combo_omopecod_Selectedvalue_set ;
   private String Combo_omopecod_Selectedvalue_get ;
   private String Combo_omopecod_Selectedtext_set ;
   private String Combo_omopecod_Selectedtext_get ;
   private String Combo_omopecod_Gamoauthtoken ;
   private String Combo_omopecod_Ddointernalname ;
   private String Combo_omopecod_Titlecontrolalign ;
   private String Combo_omopecod_Dropdownoptionstype ;
   private String Combo_omopecod_Titlecontrolidtoreplace ;
   private String Combo_omopecod_Datalisttype ;
   private String Combo_omopecod_Datalistfixedvalues ;
   private String Combo_omopecod_Datalistproc ;
   private String Combo_omopecod_Datalistprocparametersprefix ;
   private String Combo_omopecod_Remoteservicesparameters ;
   private String Combo_omopecod_Htmltemplate ;
   private String Combo_omopecod_Multiplevaluestype ;
   private String Combo_omopecod_Loadingdata ;
   private String Combo_omopecod_Noresultsfound ;
   private String Combo_omopecod_Emptyitemtext ;
   private String Combo_omopecod_Onlyselectedvalues ;
   private String Combo_omopecod_Selectalltext ;
   private String Combo_omopecod_Multiplevaluesseparator ;
   private String Combo_omopecod_Addnewoptiontext ;
   private String Gridlevel_level1_titlescategories_Objectcall ;
   private String Gridlevel_level1_titlescategories_Class ;
   private String Gridlevel_level1_titlescategories_Gridinternalname ;
   private String hsh ;
   private String sMode1232 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9458OMMTpo ;
   private String A14501OMOpeCargo ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char3[] ;
   private String AV18MTMovNom ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z9426OMMaqCod ;
   private String Z407EmprNom ;
   private String Z9427OMMaqDsc ;
   private String Z9456OMOpeNom ;
   private String Z14501OMOpeCargo ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtOMOpeCod_Jsonclick ;
   private String edtOMOpeCargo_Jsonclick ;
   private String edtOMMCCnt_Jsonclick ;
   private String edtOMOpePre_Jsonclick ;
   private String edtOMMCPre_Jsonclick ;
   private String edtOMMCCos_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9445OMEst ;
   private String subGridlevel_level1_Header ;
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
   private boolean Combo_omopecod_Isgriditem ;
   private boolean Combo_omopecod_Emptyitem ;
   private boolean n9441OMMCCosT ;
   private boolean n407EmprNom ;
   private boolean n9456OMOpeNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_omopecod_Enabled ;
   private boolean Combo_omopecod_Visible ;
   private boolean Combo_omopecod_Allowmultipleselection ;
   private boolean Combo_omopecod_Hasdescription ;
   private boolean Combo_omopecod_Includeonlyselectedoption ;
   private boolean Combo_omopecod_Includeselectalloption ;
   private boolean Combo_omopecod_Includeaddnewoption ;
   private boolean Gridlevel_level1_titlescategories_Enabled ;
   private boolean Gridlevel_level1_titlescategories_Visible ;
   private boolean returnInSub ;
   private boolean n9457OMOpePre ;
   private String AV30msg2 ;
   private String AV29ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV24WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_omopecod ;
   private com.genexus.webpanels.GXUserControl ucGridlevel_level1_titlescategories ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private HTMLChoice cmbOMMTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T016D7_A407EmprNom ;
   private boolean[] T016D7_n407EmprNom ;
   private String[] T016D8_A9427OMMaqDsc ;
   private boolean[] T016D8_n9427OMMaqDsc ;
   private java.math.BigDecimal[] T016D10_A9441OMMCCosT ;
   private boolean[] T016D10_n9441OMMCCosT ;
   private String[] T016D12_A9426OMMaqCod ;
   private String[] T016D12_A9427OMMaqDsc ;
   private boolean[] T016D12_n9427OMMaqDsc ;
   private int[] T016D12_A9425OMCod ;
   private String[] T016D12_A9445OMEst ;
   private String[] T016D12_A407EmprNom ;
   private boolean[] T016D12_n407EmprNom ;
   private String[] T016D12_A396EmprCod ;
   private java.math.BigDecimal[] T016D12_A9441OMMCCosT ;
   private boolean[] T016D12_n9441OMMCCosT ;
   private java.math.BigDecimal[] T016D14_A9441OMMCCosT ;
   private boolean[] T016D14_n9441OMMCCosT ;
   private String[] T016D15_A396EmprCod ;
   private int[] T016D15_A9425OMCod ;
   private String[] T016D6_A9426OMMaqCod ;
   private int[] T016D6_A9425OMCod ;
   private String[] T016D6_A9445OMEst ;
   private String[] T016D6_A396EmprCod ;
   private String[] T016D16_A396EmprCod ;
   private int[] T016D16_A9425OMCod ;
   private String[] T016D16_A9426OMMaqCod ;
   private String[] T016D17_A396EmprCod ;
   private int[] T016D17_A9425OMCod ;
   private String[] T016D17_A9426OMMaqCod ;
   private String[] T016D5_A9426OMMaqCod ;
   private int[] T016D5_A9425OMCod ;
   private String[] T016D5_A9445OMEst ;
   private String[] T016D5_A396EmprCod ;
   private java.math.BigDecimal[] T016D22_A9441OMMCCosT ;
   private boolean[] T016D22_n9441OMMCCosT ;
   private String[] T016D23_A396EmprCod ;
   private int[] T016D23_A9425OMCod ;
   private String[] T016D23_A11446OMMEquCod ;
   private String[] T016D23_A11447OMMSEqCod ;
   private String[] T016D23_A11448OMMPieCod ;
   private String[] T016D24_A396EmprCod ;
   private int[] T016D24_A9425OMCod ;
   private int[] T016D24_A9430TMCod ;
   private String[] T016D25_A396EmprCod ;
   private int[] T016D25_A9425OMCod ;
   private int[] T016D25_A9455OMOpeCod ;
   private String[] T016D25_A9458OMMTpo ;
   private short[] T016D25_A9466OMMCLin ;
   private String[] T016D26_A396EmprCod ;
   private int[] T016D26_A9425OMCod ;
   private int[] T016D26_A9446OMRepCod ;
   private String[] T016D26_A9449OMRTpo ;
   private String[] T016D27_A396EmprCod ;
   private int[] T016D27_A9425OMCod ;
   private int[] T016D28_A9425OMCod ;
   private String[] T016D28_A9458OMMTpo ;
   private java.math.BigDecimal[] T016D28_A9462OMMCPre ;
   private String[] T016D28_A9456OMOpeNom ;
   private boolean[] T016D28_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016D28_A9457OMOpePre ;
   private boolean[] T016D28_n9457OMOpePre ;
   private String[] T016D28_A14501OMOpeCargo ;
   private java.math.BigDecimal[] T016D28_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016D28_A9460OMMRPre ;
   private java.math.BigDecimal[] T016D28_A9461OMMCCnt ;
   private String[] T016D28_A396EmprCod ;
   private int[] T016D28_A9455OMOpeCod ;
   private String[] T016D4_A9456OMOpeNom ;
   private boolean[] T016D4_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016D4_A9457OMOpePre ;
   private boolean[] T016D4_n9457OMOpePre ;
   private String[] T016D4_A14501OMOpeCargo ;
   private String[] T016D29_A9456OMOpeNom ;
   private boolean[] T016D29_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016D29_A9457OMOpePre ;
   private boolean[] T016D29_n9457OMOpePre ;
   private String[] T016D29_A14501OMOpeCargo ;
   private String[] T016D30_A396EmprCod ;
   private int[] T016D30_A9425OMCod ;
   private int[] T016D30_A9455OMOpeCod ;
   private String[] T016D30_A9458OMMTpo ;
   private int[] T016D3_A9425OMCod ;
   private String[] T016D3_A9458OMMTpo ;
   private java.math.BigDecimal[] T016D3_A9462OMMCPre ;
   private java.math.BigDecimal[] T016D3_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016D3_A9460OMMRPre ;
   private java.math.BigDecimal[] T016D3_A9461OMMCCnt ;
   private String[] T016D3_A396EmprCod ;
   private int[] T016D3_A9455OMOpeCod ;
   private int[] T016D2_A9425OMCod ;
   private String[] T016D2_A9458OMMTpo ;
   private java.math.BigDecimal[] T016D2_A9462OMMCPre ;
   private java.math.BigDecimal[] T016D2_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016D2_A9460OMMRPre ;
   private java.math.BigDecimal[] T016D2_A9461OMMCCnt ;
   private String[] T016D2_A396EmprCod ;
   private int[] T016D2_A9455OMOpeCod ;
   private String[] T016D34_A9456OMOpeNom ;
   private boolean[] T016D34_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016D34_A9457OMOpePre ;
   private boolean[] T016D34_n9457OMOpePre ;
   private String[] T016D34_A14501OMOpeCargo ;
   private String[] T016D35_A396EmprCod ;
   private int[] T016D35_A9425OMCod ;
   private int[] T016D35_A9455OMOpeCod ;
   private String[] T016D35_A9458OMMTpo ;
   private short[] T016D35_A9466OMMCLin ;
   private String[] T016D36_A396EmprCod ;
   private int[] T016D36_A9425OMCod ;
   private int[] T016D36_A9455OMOpeCod ;
   private String[] T016D36_A9458OMMTpo ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27OMOpeCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item9 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item10[] ;
   private app.wwpbaseobjects.SdtWWPContext AV22WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV23TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV26TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV28DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tmordmc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016D2", "SELECT OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?  FOR UPDATE OF OMMCPre, OMMRCnt, OMMRPre, OMMCCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D3", "SELECT OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D4", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre, OpeCargo AS OMOpeCargo FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D5", "SELECT OMMaqCod, OMCod, OMEst, EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMMaqCod, OMEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D6", "SELECT OMMaqCod, OMCod, OMEst, EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D8", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D10", "SELECT COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D12", "SELECT /*+ FIRST_ROWS(100) */ TM1.OMMaqCod AS OMMaqCod, T3.MaqDsc AS OMMaqDsc, TM1.OMCod, TM1.OMEst, T2.EmprNom, TM1.EmprCod, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT FROM (((TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.OMMaqCod) LEFT JOIN (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.OMCod = TM1.OMCod) WHERE TM1.EmprCod = ? and TM1.OMCod = ? and TM1.OMMaqCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D14", "SELECT COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D15", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod, OMMaqCod FROM TXPMORDEN WHERE ( EmprCod > ? or EmprCod = ? and OMCod > ?) and OMMaqCod = ? ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod, OMMaqCod FROM TXPMORDEN WHERE ( EmprCod < ? or EmprCod = ? and OMCod < ?) and OMMaqCod = ? ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016D18", "INSERT INTO TXPMORDEN(OMMaqCod, OMCod, OMEst, EmprCod, SMCod, PMCod, OMTxt, OMOpeRes, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMNot, OMPri, OMTipoId) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0)", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016D19", "UPDATE TXPMORDEN SET OMMaqCod=?, OMEst=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016D20", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T016D22", "SELECT COALESCE( T1.OMMCCosT, 0) AS OMMCCosT FROM (SELECT SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D23", "SELECT * FROM (SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D24", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D25", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D26", "SELECT * FROM (SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN WHERE OMMaqCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D28", "SELECT T1.OMCod, T1.OMMTpo, T1.OMMCPre, T2.OpeNom AS OMOpeNom, T2.OpePreHor AS OMOpePre, T2.OpeCargo AS OMOpeCargo, T1.OMMRCnt, T1.OMMRPre, T1.OMMCCnt, T1.EmprCod, T1.OMOpeCod AS OMOpeCod FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMOpeCod = ? and T1.OMMTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod, T1.OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D29", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre, OpeCargo AS OMOpeCargo FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D30", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016D31", "INSERT INTO TXPMOrMO(OMCod, OMMTpo, OMMCPre, OMMRCnt, OMMRPre, OMMCCnt, EmprCod, OMOpeCod, OMMCUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T016D32", "UPDATE TXPMOrMO SET OMMCPre=?, OMMRCnt=?, OMMRPre=?, OMMCCnt=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T016D33", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new ForEachCursor("T016D34", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre, OpeCargo AS OMOpeCargo FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016D35", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016D36", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? and OMMTpo = 'C' ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
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
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,3);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 26 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
      }
   }

}

