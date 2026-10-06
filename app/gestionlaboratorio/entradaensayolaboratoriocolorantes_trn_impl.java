package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayolaboratoriocolorantes_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"PRDCTWST") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asaprdctwst1UX820( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel18"+"_"+"") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa113631UX820( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel20"+"_"+"") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa140971UX820( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel21"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel22"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_30( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_32( A396EmprCod, A5532Lb_numero) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_33( A396EmprCod, A5532Lb_numero, A5555Lb_opcion) ;
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
            AV8Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Lb_numero), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Lb_numero), "ZZZZZZZ9")));
            AV9Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Lb_opcion", AV9Lb_opcion);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Lb_opcion, "@!"))));
            AV10Lb_LineaC = (short)(GXutil.lval( httpContext.GetPar( "Lb_LineaC"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Lb_LineaC), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_LINEAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Lb_LineaC), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Ensayo Laboratorio (Colorantes)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public entradaensayolaboratoriocolorantes_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayolaboratoriocolorantes_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratoriocolorantes_trn_impl.class ));
   }

   public entradaensayolaboratoriocolorantes_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_numero_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_numero_Internalname, httpContext.getMessage( "Nº de Ensayo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_numero_Internalname, GXutil.ltrim( localUtil.ntoc( A5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_numero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5532Lb_numero), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_numero_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_numero_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_opcion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_opcion_Internalname, httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_opcion_Internalname, GXutil.rtrim( A5555Lb_opcion), GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_opcion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_opcion_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_LineaC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_LineaC_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_LineaC_Internalname, GXutil.ltrim( localUtil.ntoc( A5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_LineaC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5557Lb_LineaC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5557Lb_LineaC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_LineaC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_LineaC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockprdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV17PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdNum_Visible, edtPrdNum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdUMe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdUMe_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdUMe_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_490_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_490_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      app.GxWebStd.gx_bitmap( httpContext, imgprompt_490_Internalname, sImgUrl, imgprompt_490_Link, "", "", context.getHttpContext().getTheme( ), imgprompt_490_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdDsc_Internalname, httpContext.getMessage( "Desc.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc), GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtForPrdDsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLB_CantC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLB_CantC_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLB_CantC_Internalname, GXutil.ltrim( localUtil.ntoc( A5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLB_CantC_Enabled!=0) ? localUtil.format( A5558LB_CantC, "ZZZZ9.99999") : localUtil.format( A5558LB_CantC, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLB_CantC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLB_CantC_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_fibra_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_fibra_Internalname, httpContext.getMessage( "Comp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_fibra_Internalname, GXutil.rtrim( A14096Lb_fibra), GXutil.rtrim( localUtil.format( A14096Lb_fibra, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_fibra_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_fibra_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_PTinC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_PTinC_Internalname, httpContext.getMessage( "Nº Fibra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_PTinC_Internalname, GXutil.ltrim( localUtil.ntoc( A6544Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_PTinC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6544Lb_PTinC), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6544Lb_PTinC), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_PTinC_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_PTinC_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, divUnnamedtable3_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPrdgots_cell_Internalname, 1, 0, "px", 0, "px", divPrdgots_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtPrdGots_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdGots_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdGots_Internalname, httpContext.getMessage( "GOTS", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdGots_Internalname, GXutil.rtrim( A11363PrdGots), GXutil.rtrim( localUtil.format( A11363PrdGots, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdGots_Jsonclick, 0, "AttributeFL", "", "", "", "", edtPrdGots_Visible, edtPrdGots_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPrdctwst_cell_Internalname, 1, 0, "px", 0, "px", divPrdctwst_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtPrdCtwSt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtwSt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCtwSt_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtwSt_Internalname, A14097PrdCtwSt, GXutil.rtrim( localUtil.format( A14097PrdCtwSt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtwSt_Jsonclick, 0, "AttributeFL", "", "", "", "", edtPrdCtwSt_Visible, edtPrdCtwSt_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV25Pgmname), GXutil.rtrim( localUtil.format( AV25Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_prdnum_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprdnum_Internalname, GXutil.rtrim( AV19ComboPrdNum), GXutil.rtrim( localUtil.format( AV19ComboPrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprdnum_Visible, edtavComboprdnum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw4_Internalname, GXutil.rtrim( A11663PrdCtw4), GXutil.rtrim( localUtil.format( A11663PrdCtw4, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw4_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdCtw4_Visible, edtPrdCtw4_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw3_Internalname, GXutil.rtrim( A10938PrdCtw3), GXutil.rtrim( localUtil.format( A10938PrdCtw3, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw3_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdCtw3_Visible, edtPrdCtw3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw2_Internalname, GXutil.rtrim( A10937PrdCtw2), GXutil.rtrim( localUtil.format( A10937PrdCtw2, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw2_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdCtw2_Visible, edtPrdCtw2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw1_Internalname, GXutil.rtrim( A10936PrdCtw1), GXutil.rtrim( localUtil.format( A10936PrdCtw1, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw1_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdCtw1_Visible, edtPrdCtw1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFibra_Internalname, GXutil.rtrim( A14094PrdFibra), GXutil.rtrim( localUtil.format( A14094PrdFibra, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFibra_Jsonclick, 0, "Attribute", "", "", "", "", edtPrdFibra_Visible, edtPrdFibra_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorioColorantes_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e111UX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV17PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "Z5532Lb_numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5555Lb_opcion = httpContext.cgiGet( "Z5555Lb_opcion") ;
            Z5557Lb_LineaC = (short)(localUtil.ctol( httpContext.cgiGet( "Z5557Lb_LineaC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5558LB_CantC = localUtil.ctond( httpContext.cgiGet( "Z5558LB_CantC")) ;
            Z6058Lb_soluc = (int)(localUtil.ctol( httpContext.cgiGet( "Z6058Lb_soluc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6544Lb_PTinC = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6544Lb_PTinC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14096Lb_fibra = httpContext.cgiGet( "Z14096Lb_fibra") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6058Lb_soluc = (int)(localUtil.ctol( httpContext.cgiGet( "Z6058Lb_soluc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N719PrdNum = httpContext.cgiGet( "N719PrdNum") ;
            N490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "N490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( "vLB_NUMERO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9Lb_opcion = httpContext.cgiGet( "vLB_OPCION") ;
            AV10Lb_LineaC = (short)(localUtil.ctol( httpContext.cgiGet( "vLB_LINEAC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14Insert_PrdNum = httpContext.cgiGet( "vINSERT_PRDNUM") ;
            AV15Insert_ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FORPRDUME"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14088Lb_Gots = httpContext.cgiGet( "LB_GOTS") ;
            n14088Lb_Gots = false ;
            A6058Lb_soluc = (int)(localUtil.ctol( httpContext.cgiGet( "LB_SOLUC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            A7260PrdHorMad = (byte)(localUtil.ctol( httpContext.cgiGet( "PRDHORMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
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
            A5532Lb_numero = (int)(localUtil.ctol( httpContext.cgiGet( edtLb_numero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = GXutil.upper( httpContext.cgiGet( edtLb_opcion_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            A5557Lb_LineaC = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LineaC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForPrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A490ForPrdUMe = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            }
            else
            {
               A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
            }
            A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
            n488ForPrdDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtLB_CantC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtLB_CantC_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_CANTC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLB_CantC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5558LB_CantC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A5558LB_CantC", GXutil.ltrimstr( A5558LB_CantC, 11, 5));
            }
            else
            {
               A5558LB_CantC = localUtil.ctond( httpContext.cgiGet( edtLB_CantC_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5558LB_CantC", GXutil.ltrimstr( A5558LB_CantC, 11, 5));
            }
            A14096Lb_fibra = httpContext.cgiGet( edtLb_fibra_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14096Lb_fibra", A14096Lb_fibra);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_PTinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_PTinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LB_PTINC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_PTinC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6544Lb_PTinC = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6544Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6544Lb_PTinC), 2, 0));
            }
            else
            {
               A6544Lb_PTinC = (byte)(localUtil.ctol( httpContext.cgiGet( edtLb_PTinC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6544Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6544Lb_PTinC), 2, 0));
            }
            A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
            A14097PrdCtwSt = httpContext.cgiGet( edtPrdCtwSt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
            AV25Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
            AV19ComboPrdNum = httpContext.cgiGet( edtavComboprdnum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ComboPrdNum", AV19ComboPrdNum);
            A11663PrdCtw4 = httpContext.cgiGet( edtPrdCtw4_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
            A10938PrdCtw3 = httpContext.cgiGet( edtPrdCtw3_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
            A10937PrdCtw2 = httpContext.cgiGet( edtPrdCtw2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
            A10936PrdCtw1 = httpContext.cgiGet( edtPrdCtw1_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
            A14094PrdFibra = httpContext.cgiGet( edtPrdFibra_Internalname) ;
            n14094PrdFibra = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", A14094PrdFibra);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorioColorantes_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV25Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV25Pgmname, "")));
            forbiddenHiddens.add("Lb_soluc", localUtil.format( DecimalUtil.doubleToDec(A6058Lb_soluc), "ZZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) || ( A5557Lb_LineaC != Z5557Lb_LineaC ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("gestionlaboratorio\\entradaensayolaboratoriocolorantes_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A5532Lb_numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_numero"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
               A5555Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
               A5557Lb_LineaC = (short)(GXutil.lval( httpContext.GetPar( "Lb_LineaC"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
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
                  sMode820 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode820 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound820 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UX0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "LB_NUMERO");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_numero_Internalname ;
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
                        e111UX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UX2 ();
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
         e121UX2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UX820( ) ;
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
         disableAttributes1UX820( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
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

   public void confirm_1UX0( )
   {
      beforeValidate1UX820( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UX820( ) ;
         }
         else
         {
            checkExtendedTable1UX820( ) ;
            closeExtendedTableCursors1UX820( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UX0( )
   {
   }

   public void e111UX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.AV23EmprNom = GXv_char3[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.AV24UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprNom", AV23EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV24UsurCod", AV24UsurCod);
      GXv_SdtWWPContext5[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV11WWPContext = GXv_SdtWWPContext5[0] ;
      edtPrdNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), true);
      AV19ComboPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboPrdNum", AV19ComboPrdNum);
      edtavComboprdnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV12TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV25Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV26GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GXV1), 8, 0));
         while ( AV26GXV1 <= AV12TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV16TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV12TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV26GXV1));
            if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrdNum") == 0 )
            {
               AV14Insert_PrdNum = AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Insert_PrdNum", AV14Insert_PrdNum);
               if ( ! (GXutil.strcmp("", AV14Insert_PrdNum)==0) )
               {
                  AV19ComboPrdNum = AV14Insert_PrdNum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV19ComboPrdNum", AV19ComboPrdNum);
                  Combo_prdnum_Selectedvalue_set = AV19ComboPrdNum ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
                  Combo_prdnum_Enabled = false ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ForPrdUMe") == 0 )
            {
               AV15Insert_ForPrdUMe = (byte)(GXutil.lval( AV16TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_ForPrdUMe", GXutil.str( AV15Insert_ForPrdUMe, 1, 0));
            }
            AV26GXV1 = (int)(AV26GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GXV1), 8, 0));
         }
      }
      edtPrdCtw4_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw4_Visible), 5, 0), true);
      edtPrdCtw3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw3_Visible), 5, 0), true);
      edtPrdCtw2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw2_Visible), 5, 0), true);
      edtPrdCtw1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw1_Visible), 5, 0), true);
      edtPrdFibra_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibra_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibra_Visible), 5, 0), true);
      GXt_int6 = (byte)(AV20Moda21) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int7) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV20Moda21 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Moda21), 4, 0));
      GXt_int6 = (byte)(AV21fibracolorante) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FIBCOL", ""), GXv_int7) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV21fibracolorante = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21fibracolorante", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21fibracolorante), 4, 0));
   }

   public void e121UX2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtPrdGots_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), true);
      divPrdgots_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divPrdgots_cell_Internalname, "Class", divPrdgots_cell_Class, true);
      edtPrdCtwSt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), true);
      divPrdctwst_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divPrdctwst_cell_Internalname, "Class", divPrdctwst_cell_Class, true);
      if ( ( edtPrdGots_Visible == ( 0 )) && ( edtPrdCtwSt_Visible == ( 0 )) )
      {
         divUnnamedtable3_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Visible), 5, 0), true);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV17PrdNum_Data ;
      GXv_char4[0] = AV18ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.gestionlaboratorio.entradaensayolaboratoriocolorantes_trnloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV7EmprCod, AV8Lb_numero, AV9Lb_opcion, AV10Lb_LineaC, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.AV18ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV17PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_prdnum_Selectedvalue_set = AV18ComboSelectedValue ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      AV19ComboPrdNum = AV18ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ComboPrdNum", AV19ComboPrdNum);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_prdnum_Enabled = false ;
         ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      }
   }

   public void zm1UX820( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5558LB_CantC = T01UX3_A5558LB_CantC[0] ;
            Z6058Lb_soluc = T01UX3_A6058Lb_soluc[0] ;
            Z6544Lb_PTinC = T01UX3_A6544Lb_PTinC[0] ;
            Z14096Lb_fibra = T01UX3_A14096Lb_fibra[0] ;
            Z719PrdNum = T01UX3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01UX3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z5558LB_CantC = A5558LB_CantC ;
            Z6058Lb_soluc = A6058Lb_soluc ;
            Z6544Lb_PTinC = A6544Lb_PTinC ;
            Z14096Lb_fibra = A14096Lb_fibra ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -28 )
      {
         Z5557Lb_LineaC = A5557Lb_LineaC ;
         Z5558LB_CantC = A5558LB_CantC ;
         Z6058Lb_soluc = A6058Lb_soluc ;
         Z6544Lb_PTinC = A6544Lb_PTinC ;
         Z14096Lb_fibra = A14096Lb_fibra ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z407EmprNom = A407EmprNom ;
         Z14088Lb_Gots = A14088Lb_Gots ;
         Z718PrdNom = A718PrdNom ;
         Z7260PrdHorMad = A7260PrdHorMad ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z11663PrdCtw4 = A11663PrdCtw4 ;
         Z10938PrdCtw3 = A10938PrdCtw3 ;
         Z10937PrdCtw2 = A10937PrdCtw2 ;
         Z10936PrdCtw1 = A10936PrdCtw1 ;
         Z11363PrdGots = A11363PrdGots ;
         Z14094PrdFibra = A14094PrdFibra ;
         Z856ValCod = A856ValCod ;
         Z488ForPrdDsc = A488ForPrdDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdGots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Enabled), 5, 0), true);
      edtPrdCtwSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Enabled), 5, 0), true);
      edtLb_LineaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaC_Enabled), 5, 0), true);
      edtLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      edtLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      AV25Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorioColorantes_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
      imgprompt_490_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDUME"+"'), id:'"+"FORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"FORPRDDSC"+"'), id:'"+"FORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      edtPrdGots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Enabled), 5, 0), true);
      edtPrdCtwSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Enabled), 5, 0), true);
      edtLb_LineaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaC_Enabled), 5, 0), true);
      edtLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      edtLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UX4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UX4_A407EmprNom[0] ;
      n407EmprNom = T01UX4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      edtPrdGots_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divPrdgots_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divPrdgots_cell_Internalname, "Class", divPrdgots_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
         entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
         if ( GXt_int6 == 1 )
         {
            divPrdgots_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divPrdgots_cell_Internalname, "Class", divPrdgots_cell_Class, true);
         }
      }
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      edtPrdCtwSt_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divPrdctwst_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divPrdctwst_cell_Internalname, "Class", divPrdctwst_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
         entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
         if ( GXt_int6 == 1 )
         {
            divPrdctwst_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divPrdctwst_cell_Internalname, "Class", divPrdctwst_cell_Class, true);
         }
      }
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int7) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int11) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int10 = GXv_int11[0] ;
      divUnnamedtable3_Visible = ((((GXt_int6==1))||((GXt_int10==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Visible), 5, 0), true);
      if ( ! (0==AV8Lb_numero) )
      {
         A5532Lb_numero = AV8Lb_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      }
      if ( ! (GXutil.strcmp("", AV9Lb_opcion)==0) )
      {
         A5555Lb_opcion = AV9Lb_opcion ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      }
      if ( ! (0==AV10Lb_LineaC) )
      {
         A5557Lb_LineaC = AV10Lb_LineaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_PrdNum)==0) )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_ForPrdUMe) )
      {
         edtForPrdUMe_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      }
      else
      {
         edtForPrdUMe_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV15Insert_ForPrdUMe) )
      {
         A490ForPrdUMe = AV15Insert_ForPrdUMe ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV14Insert_PrdNum)==0) )
      {
         A719PrdNum = AV14Insert_PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      else
      {
         A719PrdNum = AV19ComboPrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
         /* Using cursor T01UX7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         A14088Lb_Gots = T01UX7_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01UX7_n14088Lb_Gots[0] ;
         pr_default.close(5);
         /* Using cursor T01UX6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01UX6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UX6_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(4);
         /* Using cursor T01UX5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01UX5_A718PrdNom[0] ;
         A7260PrdHorMad = T01UX5_A7260PrdHorMad[0] ;
         A724PrdPreAct = T01UX5_A724PrdPreAct[0] ;
         A11663PrdCtw4 = T01UX5_A11663PrdCtw4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
         A10938PrdCtw3 = T01UX5_A10938PrdCtw3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
         A10937PrdCtw2 = T01UX5_A10937PrdCtw2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
         A10936PrdCtw1 = T01UX5_A10936PrdCtw1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
         A11363PrdGots = T01UX5_A11363PrdGots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
         A14094PrdFibra = T01UX5_A14094PrdFibra[0] ;
         n14094PrdFibra = T01UX5_n14094PrdFibra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", A14094PrdFibra);
         A856ValCod = T01UX5_A856ValCod[0] ;
         pr_default.close(3);
         GXt_char1 = A14097PrdCtwSt ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         entradaensayolaboratoriocolorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaensayolaboratoriocolorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaensayolaboratoriocolorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A14097PrdCtwSt = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
      }
   }

   public void load1UX820( )
   {
      /* Using cursor T01UX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound820 = (short)(1) ;
         A407EmprNom = T01UX9_A407EmprNom[0] ;
         n407EmprNom = T01UX9_n407EmprNom[0] ;
         A14088Lb_Gots = T01UX9_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01UX9_n14088Lb_Gots[0] ;
         A718PrdNom = T01UX9_A718PrdNom[0] ;
         A488ForPrdDsc = T01UX9_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UX9_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         A5558LB_CantC = T01UX9_A5558LB_CantC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5558LB_CantC", GXutil.ltrimstr( A5558LB_CantC, 11, 5));
         A6058Lb_soluc = T01UX9_A6058Lb_soluc[0] ;
         A6544Lb_PTinC = T01UX9_A6544Lb_PTinC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6544Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6544Lb_PTinC), 2, 0));
         A7260PrdHorMad = T01UX9_A7260PrdHorMad[0] ;
         A724PrdPreAct = T01UX9_A724PrdPreAct[0] ;
         A11663PrdCtw4 = T01UX9_A11663PrdCtw4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
         A10938PrdCtw3 = T01UX9_A10938PrdCtw3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
         A10937PrdCtw2 = T01UX9_A10937PrdCtw2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
         A10936PrdCtw1 = T01UX9_A10936PrdCtw1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
         A11363PrdGots = T01UX9_A11363PrdGots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
         A14096Lb_fibra = T01UX9_A14096Lb_fibra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14096Lb_fibra", A14096Lb_fibra);
         A14094PrdFibra = T01UX9_A14094PrdFibra[0] ;
         n14094PrdFibra = T01UX9_n14094PrdFibra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", A14094PrdFibra);
         A719PrdNum = T01UX9_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01UX9_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A856ValCod = T01UX9_A856ValCod[0] ;
         zm1UX820( -28) ;
      }
      pr_default.close(7);
      onLoadActions1UX820( ) ;
   }

   public void onLoadActions1UX820( )
   {
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14097PrdCtwSt = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
   }

   public void checkExtendedTable1UX820( )
   {
      nIsDirty_820 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( AV20Moda21 == 1 ) && ( GXutil.strcmp(A11363PrdGots, "N") == 0 ) && ( GXutil.strcmp(A14088Lb_Gots, "S") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção O produto / corante não é GOTS", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01UX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UX5_A718PrdNom[0] ;
      A7260PrdHorMad = T01UX5_A7260PrdHorMad[0] ;
      A724PrdPreAct = T01UX5_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01UX5_A11663PrdCtw4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
      A10938PrdCtw3 = T01UX5_A10938PrdCtw3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
      A10937PrdCtw2 = T01UX5_A10937PrdCtw2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
      A10936PrdCtw1 = T01UX5_A10936PrdCtw1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
      A11363PrdGots = T01UX5_A11363PrdGots[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
      A14094PrdFibra = T01UX5_A14094PrdFibra[0] ;
      n14094PrdFibra = T01UX5_n14094PrdFibra[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", A14094PrdFibra);
      A856ValCod = T01UX5_A856ValCod[0] ;
      pr_default.close(3);
      /* Using cursor T01UX6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01UX6_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UX6_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      pr_default.close(4);
      /* Using cursor T01UX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14088Lb_Gots = T01UX7_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01UX7_n14088Lb_Gots[0] ;
      pr_default.close(5);
      /* Using cursor T01UX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_OPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      nIsDirty_820 = (short)(1) ;
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14097PrdCtwSt = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
   }

   public void closeExtendedTableCursors1UX820( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_30( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01UX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01UX10_A718PrdNom[0] ;
      A7260PrdHorMad = T01UX10_A7260PrdHorMad[0] ;
      A724PrdPreAct = T01UX10_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01UX10_A11663PrdCtw4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
      A10938PrdCtw3 = T01UX10_A10938PrdCtw3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
      A10937PrdCtw2 = T01UX10_A10937PrdCtw2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
      A10936PrdCtw1 = T01UX10_A10936PrdCtw1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
      A11363PrdGots = T01UX10_A11363PrdGots[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
      A14094PrdFibra = T01UX10_A14094PrdFibra[0] ;
      n14094PrdFibra = T01UX10_n14094PrdFibra[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", A14094PrdFibra);
      A856ValCod = T01UX10_A856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11663PrdCtw4))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10938PrdCtw3))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10937PrdCtw2))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10936PrdCtw1))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11363PrdGots))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14094PrdFibra))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_31( String A396EmprCod ,
                          byte A490ForPrdUMe )
   {
      /* Using cursor T01UX11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01UX11_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UX11_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_32( String A396EmprCod ,
                          int A5532Lb_numero )
   {
      /* Using cursor T01UX12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14088Lb_Gots = T01UX12_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01UX12_n14088Lb_Gots[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14088Lb_Gots))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_33( String A396EmprCod ,
                          int A5532Lb_numero ,
                          String A5555Lb_opcion )
   {
      /* Using cursor T01UX13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_OPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1UX820( )
   {
      /* Using cursor T01UX14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound820 = (short)(1) ;
      }
      else
      {
         RcdFound820 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UX820( 28) ;
         RcdFound820 = (short)(1) ;
         A5557Lb_LineaC = T01UX3_A5557Lb_LineaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
         A5558LB_CantC = T01UX3_A5558LB_CantC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5558LB_CantC", GXutil.ltrimstr( A5558LB_CantC, 11, 5));
         A6058Lb_soluc = T01UX3_A6058Lb_soluc[0] ;
         A6544Lb_PTinC = T01UX3_A6544Lb_PTinC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6544Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6544Lb_PTinC), 2, 0));
         A14096Lb_fibra = T01UX3_A14096Lb_fibra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14096Lb_fibra", A14096Lb_fibra);
         A396EmprCod = T01UX3_A396EmprCod[0] ;
         A719PrdNum = T01UX3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01UX3_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A5532Lb_numero = T01UX3_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T01UX3_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         Z396EmprCod = A396EmprCod ;
         Z5532Lb_numero = A5532Lb_numero ;
         Z5555Lb_opcion = A5555Lb_opcion ;
         Z5557Lb_LineaC = A5557Lb_LineaC ;
         sMode820 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UX820( ) ;
         if ( AnyError == 1 )
         {
            RcdFound820 = (short)(0) ;
            initializeNonKey1UX820( ) ;
         }
         Gx_mode = sMode820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound820 = (short)(0) ;
         initializeNonKey1UX820( ) ;
         sMode820 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode820 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UX820( ) ;
      if ( RcdFound820 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound820 = (short)(0) ;
      /* Using cursor T01UX15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A5532Lb_numero), Integer.valueOf(A5532Lb_numero), A396EmprCod, A5555Lb_opcion, A5555Lb_opcion, Integer.valueOf(A5532Lb_numero), A396EmprCod, Short.valueOf(A5557Lb_LineaC)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01UX15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UX15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UX15_A5532Lb_numero[0] < A5532Lb_numero ) || ( T01UX15_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01UX15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UX15_A5555Lb_opcion[0], A5555Lb_opcion) < 0 ) || ( GXutil.strcmp(T01UX15_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) && ( T01UX15_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01UX15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UX15_A5557Lb_LineaC[0] < A5557Lb_LineaC ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01UX15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UX15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UX15_A5532Lb_numero[0] > A5532Lb_numero ) || ( T01UX15_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01UX15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UX15_A5555Lb_opcion[0], A5555Lb_opcion) > 0 ) || ( GXutil.strcmp(T01UX15_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) && ( T01UX15_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01UX15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UX15_A5557Lb_LineaC[0] > A5557Lb_LineaC ) ) )
         {
            A396EmprCod = T01UX15_A396EmprCod[0] ;
            A5532Lb_numero = T01UX15_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = T01UX15_A5555Lb_opcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            A5557Lb_LineaC = T01UX15_A5557Lb_LineaC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
            RcdFound820 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound820 = (short)(0) ;
      /* Using cursor T01UX16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A5532Lb_numero), Integer.valueOf(A5532Lb_numero), A396EmprCod, A5555Lb_opcion, A5555Lb_opcion, Integer.valueOf(A5532Lb_numero), A396EmprCod, Short.valueOf(A5557Lb_LineaC)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01UX16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UX16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UX16_A5532Lb_numero[0] > A5532Lb_numero ) || ( T01UX16_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01UX16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UX16_A5555Lb_opcion[0], A5555Lb_opcion) > 0 ) || ( GXutil.strcmp(T01UX16_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) && ( T01UX16_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01UX16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UX16_A5557Lb_LineaC[0] > A5557Lb_LineaC ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( GXutil.strcmp(T01UX16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UX16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UX16_A5532Lb_numero[0] < A5532Lb_numero ) || ( T01UX16_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01UX16_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UX16_A5555Lb_opcion[0], A5555Lb_opcion) < 0 ) || ( GXutil.strcmp(T01UX16_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) && ( T01UX16_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(T01UX16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UX16_A5557Lb_LineaC[0] < A5557Lb_LineaC ) ) )
         {
            A396EmprCod = T01UX16_A396EmprCod[0] ;
            A5532Lb_numero = T01UX16_A5532Lb_numero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
            A5555Lb_opcion = T01UX16_A5555Lb_opcion[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
            A5557Lb_LineaC = T01UX16_A5557Lb_LineaC[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
            RcdFound820 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UX820( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UX820( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound820 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) || ( A5557Lb_LineaC != Z5557Lb_LineaC ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A5532Lb_numero = Z5532Lb_numero ;
               httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
               A5555Lb_opcion = Z5555Lb_opcion ;
               httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
               A5557Lb_LineaC = Z5557Lb_LineaC ;
               httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "LB_NUMERO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtLb_numero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UX820( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) || ( A5557Lb_LineaC != Z5557Lb_LineaC ) )
            {
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UX820( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "LB_NUMERO");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_numero_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UX820( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A5532Lb_numero != Z5532Lb_numero ) || ( GXutil.strcmp(A5555Lb_opcion, Z5555Lb_opcion) != 0 ) || ( A5557Lb_LineaC != Z5557Lb_LineaC ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5532Lb_numero = Z5532Lb_numero ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = Z5555Lb_opcion ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         A5557Lb_LineaC = Z5557Lb_LineaC ;
         httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UX820( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS003"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5558LB_CantC, T01UX2_A5558LB_CantC[0]) != 0 ) || ( Z6058Lb_soluc != T01UX2_A6058Lb_soluc[0] ) || ( Z6544Lb_PTinC != T01UX2_A6544Lb_PTinC[0] ) || ( GXutil.strcmp(Z14096Lb_fibra, T01UX2_A14096Lb_fibra[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01UX2_A719PrdNum[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z490ForPrdUMe != T01UX2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z5558LB_CantC, T01UX2_A5558LB_CantC[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratoriocolorantes_trn:[seudo value changed for attri]"+"LB_CantC");
               GXutil.writeLogRaw("Old: ",Z5558LB_CantC);
               GXutil.writeLogRaw("Current: ",T01UX2_A5558LB_CantC[0]);
            }
            if ( Z6058Lb_soluc != T01UX2_A6058Lb_soluc[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratoriocolorantes_trn:[seudo value changed for attri]"+"Lb_soluc");
               GXutil.writeLogRaw("Old: ",Z6058Lb_soluc);
               GXutil.writeLogRaw("Current: ",T01UX2_A6058Lb_soluc[0]);
            }
            if ( Z6544Lb_PTinC != T01UX2_A6544Lb_PTinC[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratoriocolorantes_trn:[seudo value changed for attri]"+"Lb_PTinC");
               GXutil.writeLogRaw("Old: ",Z6544Lb_PTinC);
               GXutil.writeLogRaw("Current: ",T01UX2_A6544Lb_PTinC[0]);
            }
            if ( GXutil.strcmp(Z14096Lb_fibra, T01UX2_A14096Lb_fibra[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratoriocolorantes_trn:[seudo value changed for attri]"+"Lb_fibra");
               GXutil.writeLogRaw("Old: ",Z14096Lb_fibra);
               GXutil.writeLogRaw("Current: ",T01UX2_A14096Lb_fibra[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01UX2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratoriocolorantes_trn:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01UX2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01UX2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.entradaensayolaboratoriocolorantes_trn:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01UX2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENS003"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UX820( )
   {
      beforeValidate1UX820( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UX820( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UX820( 0) ;
         checkOptimisticConcurrency1UX820( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UX820( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UX820( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UX17 */
                  pr_default.execute(15, new Object[] {Short.valueOf(A5557Lb_LineaC), A5558LB_CantC, Integer.valueOf(A6058Lb_soluc), Byte.valueOf(A6544Lb_PTinC), A14096Lb_fibra, A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe), Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
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
                        resetCaption1UX0( ) ;
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
            load1UX820( ) ;
         }
         endLevel1UX820( ) ;
      }
      closeExtendedTableCursors1UX820( ) ;
   }

   public void update1UX820( )
   {
      beforeValidate1UX820( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UX820( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UX820( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UX820( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UX820( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UX18 */
                  pr_default.execute(16, new Object[] {A5558LB_CantC, Integer.valueOf(A6058Lb_soluc), Byte.valueOf(A6544Lb_PTinC), A14096Lb_fibra, A719PrdNum, Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENS003"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UX820( ) ;
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
         endLevel1UX820( ) ;
      }
      closeExtendedTableCursors1UX820( ) ;
   }

   public void deferredUpdate1UX820( )
   {
   }

   public void delete( )
   {
      beforeValidate1UX820( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UX820( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UX820( ) ;
         afterConfirm1UX820( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UX820( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UX19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
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
      sMode820 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UX820( ) ;
      Gx_mode = sMode820 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UX820( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UX20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01UX20_A718PrdNom[0] ;
         A7260PrdHorMad = T01UX20_A7260PrdHorMad[0] ;
         A724PrdPreAct = T01UX20_A724PrdPreAct[0] ;
         A11663PrdCtw4 = T01UX20_A11663PrdCtw4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
         A10938PrdCtw3 = T01UX20_A10938PrdCtw3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
         A10937PrdCtw2 = T01UX20_A10937PrdCtw2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
         A10936PrdCtw1 = T01UX20_A10936PrdCtw1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
         A11363PrdGots = T01UX20_A11363PrdGots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
         A14094PrdFibra = T01UX20_A14094PrdFibra[0] ;
         n14094PrdFibra = T01UX20_n14094PrdFibra[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", A14094PrdFibra);
         A856ValCod = T01UX20_A856ValCod[0] ;
         pr_default.close(18);
         /* Using cursor T01UX21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01UX21_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01UX21_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(19);
         /* Using cursor T01UX22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         A14088Lb_Gots = T01UX22_A14088Lb_Gots[0] ;
         n14088Lb_Gots = T01UX22_n14088Lb_Gots[0] ;
         pr_default.close(20);
         GXt_char1 = A14097PrdCtwSt ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char2[0] = GXt_char1 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         entradaensayolaboratoriocolorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
         entradaensayolaboratoriocolorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         entradaensayolaboratoriocolorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A14097PrdCtwSt = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
      }
   }

   public void endLevel1UX820( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UX820( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.entradaensayolaboratoriocolorantes_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.entradaensayolaboratoriocolorantes_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UX820( )
   {
      /* Scan By routine */
      /* Using cursor T01UX23 */
      pr_default.execute(21);
      RcdFound820 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound820 = (short)(1) ;
         A396EmprCod = T01UX23_A396EmprCod[0] ;
         A5532Lb_numero = T01UX23_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T01UX23_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         A5557Lb_LineaC = T01UX23_A5557Lb_LineaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UX820( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound820 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound820 = (short)(1) ;
         A396EmprCod = T01UX23_A396EmprCod[0] ;
         A5532Lb_numero = T01UX23_A5532Lb_numero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
         A5555Lb_opcion = T01UX23_A5555Lb_opcion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
         A5557Lb_LineaC = T01UX23_A5557Lb_LineaC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
      }
   }

   public void scanEnd1UX820( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1UX820( )
   {
      /* After Confirm Rules */
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A5558LB_CantC)==0) && true /* After */ && ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Existem linhas com quantidade zero. Deseja continuar?", ""), 0, "LB_CANTC");
      }
   }

   public void beforeInsert1UX820( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UX820( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UX820( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UX820( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UX820( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UX820( )
   {
      edtLb_numero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_numero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_numero_Enabled), 5, 0), true);
      edtLb_opcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_opcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_opcion_Enabled), 5, 0), true);
      edtLb_LineaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LineaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LineaC_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), true);
      edtLB_CantC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLB_CantC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLB_CantC_Enabled), 5, 0), true);
      edtLb_fibra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_fibra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_fibra_Enabled), 5, 0), true);
      edtLb_PTinC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_PTinC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_PTinC_Enabled), 5, 0), true);
      edtPrdGots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Enabled), 5, 0), true);
      edtPrdCtwSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboprdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprdnum_Enabled), 5, 0), true);
      edtPrdCtw4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw4_Enabled), 5, 0), true);
      edtPrdCtw3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw3_Enabled), 5, 0), true);
      edtPrdCtw2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw2_Enabled), 5, 0), true);
      edtPrdCtw1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw1_Enabled), 5, 0), true);
      edtPrdFibra_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFibra_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFibra_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UX820( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UX0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayolaboratoriocolorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9Lb_opcion)),GXutil.URLEncode(GXutil.ltrimstr(AV10Lb_LineaC,4,0))}, new String[] {"Gx_mode","EmprCod","Lb_numero","Lb_opcion","Lb_LineaC"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"EntradaEnsayoLaboratorioColorantes_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV25Pgmname, "")));
      forbiddenHiddens.add("Lb_soluc", localUtil.format( DecimalUtil.doubleToDec(A6058Lb_soluc), "ZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratoriocolorantes_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5532Lb_numero", GXutil.ltrim( localUtil.ntoc( Z5532Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5555Lb_opcion", GXutil.rtrim( Z5555Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5557Lb_LineaC", GXutil.ltrim( localUtil.ntoc( Z5557Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5558LB_CantC", GXutil.ltrim( localUtil.ntoc( Z5558LB_CantC, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6058Lb_soluc", GXutil.ltrim( localUtil.ntoc( Z6058Lb_soluc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6544Lb_PTinC", GXutil.ltrim( localUtil.ntoc( Z6544Lb_PTinC, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14096Lb_fibra", GXutil.rtrim( Z14096Lb_fibra));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N719PrdNum", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "N490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV17PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV17PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV8Lb_numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_NUMERO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8Lb_numero), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_OPCION", GXutil.rtrim( AV9Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_OPCION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Lb_opcion, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_LINEAC", GXutil.ltrim( localUtil.ntoc( AV10Lb_LineaC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_LINEAC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Lb_LineaC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRDNUM", GXutil.rtrim( AV14Insert_PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FORPRDUME", GXutil.ltrim( localUtil.ntoc( AV15Insert_ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV20Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_GOTS", GXutil.rtrim( A14088Lb_Gots));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_SOLUC", GXutil.ltrim( localUtil.ntoc( A6058Lb_soluc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDHORMAD", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
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
      return formatLink("app.gestionlaboratorio.entradaensayolaboratoriocolorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8Lb_numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV9Lb_opcion)),GXutil.URLEncode(GXutil.ltrimstr(AV10Lb_LineaC,4,0))}, new String[] {"Gx_mode","EmprCod","Lb_numero","Lb_opcion","Lb_LineaC"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.EntradaEnsayoLaboratorioColorantes_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Ensayo Laboratorio (Colorantes)", "") ;
   }

   public void initializeNonKey1UX820( )
   {
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A490ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      A14097PrdCtwSt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
      A14088Lb_Gots = "" ;
      n14088Lb_Gots = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", A14088Lb_Gots);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A5558LB_CantC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5558LB_CantC", GXutil.ltrimstr( A5558LB_CantC, 11, 5));
      A6058Lb_soluc = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6058Lb_soluc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6058Lb_soluc), 5, 0));
      A6544Lb_PTinC = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6544Lb_PTinC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6544Lb_PTinC), 2, 0));
      A7260PrdHorMad = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A11663PrdCtw4 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
      A10938PrdCtw3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
      A10937PrdCtw2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
      A10936PrdCtw1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
      A11363PrdGots = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
      A14096Lb_fibra = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14096Lb_fibra", A14096Lb_fibra);
      A14094PrdFibra = "" ;
      n14094PrdFibra = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", A14094PrdFibra);
      Z5558LB_CantC = DecimalUtil.ZERO ;
      Z6058Lb_soluc = 0 ;
      Z6544Lb_PTinC = (byte)(0) ;
      Z14096Lb_fibra = "" ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1UX820( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5532Lb_numero = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5532Lb_numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5532Lb_numero), 8, 0));
      A5555Lb_opcion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5555Lb_opcion", A5555Lb_opcion);
      A5557Lb_LineaC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5557Lb_LineaC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5557Lb_LineaC), 4, 0));
      initializeNonKey1UX820( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116105195", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayolaboratoriocolorantes_trn.js", "?202682116105195", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtLb_numero_Internalname = "LB_NUMERO" ;
      edtLb_opcion_Internalname = "LB_OPCION" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtLb_LineaC_Internalname = "LB_LINEAC" ;
      lblTextblockprdnum_Internalname = "TEXTBLOCKPRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtLB_CantC_Internalname = "LB_CANTC" ;
      edtLb_fibra_Internalname = "LB_FIBRA" ;
      edtLb_PTinC_Internalname = "LB_PTINC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtPrdGots_Internalname = "PRDGOTS" ;
      divPrdgots_cell_Internalname = "PRDGOTS_CELL" ;
      edtPrdCtwSt_Internalname = "PRDCTWST" ;
      divPrdctwst_cell_Internalname = "PRDCTWST_CELL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboprdnum_Internalname = "vCOMBOPRDNUM" ;
      divSectionattribute_prdnum_Internalname = "SECTIONATTRIBUTE_PRDNUM" ;
      edtPrdCtw4_Internalname = "PRDCTW4" ;
      edtPrdCtw3_Internalname = "PRDCTW3" ;
      edtPrdCtw2_Internalname = "PRDCTW2" ;
      edtPrdCtw1_Internalname = "PRDCTW1" ;
      edtPrdFibra_Internalname = "PRDFIBRA" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_490_Internalname = "PROMPT_490" ;
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
      Form.setCaption( httpContext.getMessage( "Entrada Ensayo Laboratorio (Colorantes)", "") );
      edtPrdFibra_Jsonclick = "" ;
      edtPrdFibra_Enabled = 0 ;
      edtPrdFibra_Visible = 1 ;
      edtPrdCtw1_Jsonclick = "" ;
      edtPrdCtw1_Enabled = 0 ;
      edtPrdCtw1_Visible = 1 ;
      edtPrdCtw2_Jsonclick = "" ;
      edtPrdCtw2_Enabled = 0 ;
      edtPrdCtw2_Visible = 1 ;
      edtPrdCtw3_Jsonclick = "" ;
      edtPrdCtw3_Enabled = 0 ;
      edtPrdCtw3_Visible = 1 ;
      edtPrdCtw4_Jsonclick = "" ;
      edtPrdCtw4_Enabled = 0 ;
      edtPrdCtw4_Visible = 1 ;
      edtavComboprdnum_Jsonclick = "" ;
      edtavComboprdnum_Enabled = 0 ;
      edtavComboprdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPrdCtwSt_Jsonclick = "" ;
      edtPrdCtwSt_Enabled = 0 ;
      edtPrdCtwSt_Visible = 1 ;
      divPrdctwst_cell_Class = "col-xs-12 col-sm-6" ;
      edtPrdGots_Jsonclick = "" ;
      edtPrdGots_Enabled = 0 ;
      edtPrdGots_Visible = 1 ;
      divPrdgots_cell_Class = "col-xs-12 col-sm-6" ;
      divUnnamedtable3_Visible = 1 ;
      edtLb_PTinC_Jsonclick = "" ;
      edtLb_PTinC_Enabled = 1 ;
      edtLb_fibra_Jsonclick = "" ;
      edtLb_fibra_Enabled = 1 ;
      edtLB_CantC_Jsonclick = "" ;
      edtLB_CantC_Enabled = 1 ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Enabled = 0 ;
      imgprompt_490_Visible = 1 ;
      imgprompt_490_Link = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrdNum_Visible = 1 ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      edtLb_LineaC_Jsonclick = "" ;
      edtLb_LineaC_Enabled = 0 ;
      edtLb_opcion_Jsonclick = "" ;
      edtLb_opcion_Enabled = 0 ;
      edtLb_numero_Jsonclick = "" ;
      edtLb_numero_Enabled = 0 ;
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

   public void gx4asaprdctwst1UX820( String A396EmprCod ,
                                     String A719PrdNum )
   {
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14097PrdCtwSt = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A14097PrdCtwSt)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa113631UX820( String AV7EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int11) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int10 = GXv_int11[0] ;
      edtPrdGots_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Visible), 5, 0), true);
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

   public void gxasa140971UX820( String AV7EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "MODA21", ""), ""), GXv_int11) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_int10 = GXv_int11[0] ;
      edtPrdCtwSt_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtwSt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtwSt_Visible), 5, 0), true);
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

   public void valid_Lb_numero( )
   {
      n14088Lb_Gots = false ;
      /* Using cursor T01UX22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENS001", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_NUMERO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
      }
      A14088Lb_Gots = T01UX22_A14088Lb_Gots[0] ;
      n14088Lb_Gots = T01UX22_n14088Lb_Gots[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14088Lb_Gots", GXutil.rtrim( A14088Lb_Gots));
   }

   public void valid_Lb_opcion( )
   {
      /* Using cursor T01UX24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), "", "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "LB_OPCION");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_numero_Internalname ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Prdnum( )
   {
      n14094PrdFibra = false ;
      /* Using cursor T01UX20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01UX20_A718PrdNom[0] ;
      A7260PrdHorMad = T01UX20_A7260PrdHorMad[0] ;
      A724PrdPreAct = T01UX20_A724PrdPreAct[0] ;
      A11663PrdCtw4 = T01UX20_A11663PrdCtw4[0] ;
      A10938PrdCtw3 = T01UX20_A10938PrdCtw3[0] ;
      A10937PrdCtw2 = T01UX20_A10937PrdCtw2[0] ;
      A10936PrdCtw1 = T01UX20_A10936PrdCtw1[0] ;
      A11363PrdGots = T01UX20_A11363PrdGots[0] ;
      A14094PrdFibra = T01UX20_A14094PrdFibra[0] ;
      n14094PrdFibra = T01UX20_n14094PrdFibra[0] ;
      A856ValCod = T01UX20_A856ValCod[0] ;
      pr_default.close(18);
      GXt_char1 = A14097PrdCtwSt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_char2[0] = GXt_char1 ;
      new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      entradaensayolaboratoriocolorantes_trn_impl.this.A396EmprCod = GXv_char4[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.A719PrdNum = GXv_char3[0] ;
      entradaensayolaboratoriocolorantes_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14097PrdCtwSt = GXt_char1 ;
      if ( ( AV20Moda21 == 1 ) && ( GXutil.strcmp(A11363PrdGots, "N") == 0 ) && ( GXutil.strcmp(A14088Lb_Gots, "S") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção O produto / corante não é GOTS", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", GXutil.rtrim( A11663PrdCtw4));
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", GXutil.rtrim( A10938PrdCtw3));
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", GXutil.rtrim( A10937PrdCtw2));
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", GXutil.rtrim( A10936PrdCtw1));
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", GXutil.rtrim( A11363PrdGots));
      httpContext.ajax_rsp_assign_attri("", false, "A14094PrdFibra", GXutil.rtrim( A14094PrdFibra));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14097PrdCtwSt", A14097PrdCtwSt);
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01UX21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      A488ForPrdDsc = T01UX21_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01UX21_n488ForPrdDsc[0] ;
      pr_default.close(19);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV9Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true},{av:'AV10Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8Lb_numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9',hsh:true},{av:'AV9Lb_opcion',fld:'vLB_OPCION',pic:'@!',hsh:true},{av:'AV10Lb_LineaC',fld:'vLB_LINEAC',pic:'ZZZ9',hsh:true},{av:'AV25Pgmname',fld:'vPGMNAME',pic:''},{av:'A6058Lb_soluc',fld:'LB_SOLUC',pic:'ZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UX2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_LB_NUMERO","{handler:'valid_Lb_numero',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A14088Lb_Gots',fld:'LB_GOTS',pic:''}]");
      setEventMetadata("VALID_LB_NUMERO",",oparms:[{av:'A14088Lb_Gots',fld:'LB_GOTS',pic:''}]}");
      setEventMetadata("VALID_LB_OPCION","{handler:'valid_Lb_opcion',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A5532Lb_numero',fld:'LB_NUMERO',pic:'ZZZZZZZ9'},{av:'A5555Lb_opcion',fld:'LB_OPCION',pic:'@!'}]");
      setEventMetadata("VALID_LB_OPCION",",oparms:[]}");
      setEventMetadata("VALID_LB_LINEAC","{handler:'valid_Lb_lineac',iparms:[]");
      setEventMetadata("VALID_LB_LINEAC",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A11663PrdCtw4',fld:'PRDCTW4',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A11363PrdGots',fld:'PRDGOTS',pic:''},{av:'A14094PrdFibra',fld:'PRDFIBRA',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A14097PrdCtwSt',fld:'PRDCTWST',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A11663PrdCtw4',fld:'PRDCTW4',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A11363PrdGots',fld:'PRDGOTS',pic:''},{av:'A14094PrdFibra',fld:'PRDFIBRA',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A14097PrdCtwSt',fld:'PRDCTWST',pic:''}]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("VALID_LB_CANTC","{handler:'valid_Lb_cantc',iparms:[]");
      setEventMetadata("VALID_LB_CANTC",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPRDNUM","{handler:'validv_Comboprdnum',iparms:[]");
      setEventMetadata("VALIDV_COMBOPRDNUM",",oparms:[]}");
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
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(20);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9Lb_opcion = "" ;
      Z396EmprCod = "" ;
      Z5555Lb_opcion = "" ;
      Z5558LB_CantC = DecimalUtil.ZERO ;
      Z14096Lb_fibra = "" ;
      Z719PrdNum = "" ;
      N719PrdNum = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      AV7EmprCod = "" ;
      A5555Lb_opcion = "" ;
      Gx_mode = "" ;
      AV9Lb_opcion = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblockprdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV17PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      imgprompt_490_gximage = "" ;
      sImgUrl = "" ;
      A488ForPrdDsc = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A14096Lb_fibra = "" ;
      A11363PrdGots = "" ;
      A14097PrdCtwSt = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV25Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV19ComboPrdNum = "" ;
      A11663PrdCtw4 = "" ;
      A10938PrdCtw3 = "" ;
      A10937PrdCtw2 = "" ;
      A10936PrdCtw1 = "" ;
      A14094PrdFibra = "" ;
      AV14Insert_PrdNum = "" ;
      A14088Lb_Gots = "" ;
      A407EmprNom = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistproc = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode820 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      AV23EmprNom = "" ;
      AV24UsurCod = "" ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13WebSession = httpContext.getWebSession();
      AV16TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV18ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z14088Lb_Gots = "" ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z11663PrdCtw4 = "" ;
      Z10938PrdCtw3 = "" ;
      Z10937PrdCtw2 = "" ;
      Z10936PrdCtw1 = "" ;
      Z11363PrdGots = "" ;
      Z14094PrdFibra = "" ;
      Z488ForPrdDsc = "" ;
      T01UX4_A407EmprNom = new String[] {""} ;
      T01UX4_n407EmprNom = new boolean[] {false} ;
      GXv_int7 = new byte[1] ;
      T01UX7_A14088Lb_Gots = new String[] {""} ;
      T01UX7_n14088Lb_Gots = new boolean[] {false} ;
      T01UX6_A488ForPrdDsc = new String[] {""} ;
      T01UX6_n488ForPrdDsc = new boolean[] {false} ;
      T01UX5_A718PrdNom = new String[] {""} ;
      T01UX5_A7260PrdHorMad = new byte[1] ;
      T01UX5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UX5_A11663PrdCtw4 = new String[] {""} ;
      T01UX5_A10938PrdCtw3 = new String[] {""} ;
      T01UX5_A10937PrdCtw2 = new String[] {""} ;
      T01UX5_A10936PrdCtw1 = new String[] {""} ;
      T01UX5_A11363PrdGots = new String[] {""} ;
      T01UX5_A14094PrdFibra = new String[] {""} ;
      T01UX5_n14094PrdFibra = new boolean[] {false} ;
      T01UX5_A856ValCod = new byte[1] ;
      T01UX9_A5557Lb_LineaC = new short[1] ;
      T01UX9_A407EmprNom = new String[] {""} ;
      T01UX9_n407EmprNom = new boolean[] {false} ;
      T01UX9_A14088Lb_Gots = new String[] {""} ;
      T01UX9_n14088Lb_Gots = new boolean[] {false} ;
      T01UX9_A718PrdNom = new String[] {""} ;
      T01UX9_A488ForPrdDsc = new String[] {""} ;
      T01UX9_n488ForPrdDsc = new boolean[] {false} ;
      T01UX9_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UX9_A6058Lb_soluc = new int[1] ;
      T01UX9_A6544Lb_PTinC = new byte[1] ;
      T01UX9_A7260PrdHorMad = new byte[1] ;
      T01UX9_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UX9_A11663PrdCtw4 = new String[] {""} ;
      T01UX9_A10938PrdCtw3 = new String[] {""} ;
      T01UX9_A10937PrdCtw2 = new String[] {""} ;
      T01UX9_A10936PrdCtw1 = new String[] {""} ;
      T01UX9_A11363PrdGots = new String[] {""} ;
      T01UX9_A14096Lb_fibra = new String[] {""} ;
      T01UX9_A14094PrdFibra = new String[] {""} ;
      T01UX9_n14094PrdFibra = new boolean[] {false} ;
      T01UX9_A396EmprCod = new String[] {""} ;
      T01UX9_A719PrdNum = new String[] {""} ;
      T01UX9_A490ForPrdUMe = new byte[1] ;
      T01UX9_A5532Lb_numero = new int[1] ;
      T01UX9_A5555Lb_opcion = new String[] {""} ;
      T01UX9_A856ValCod = new byte[1] ;
      T01UX8_A396EmprCod = new String[] {""} ;
      T01UX10_A718PrdNom = new String[] {""} ;
      T01UX10_A7260PrdHorMad = new byte[1] ;
      T01UX10_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UX10_A11663PrdCtw4 = new String[] {""} ;
      T01UX10_A10938PrdCtw3 = new String[] {""} ;
      T01UX10_A10937PrdCtw2 = new String[] {""} ;
      T01UX10_A10936PrdCtw1 = new String[] {""} ;
      T01UX10_A11363PrdGots = new String[] {""} ;
      T01UX10_A14094PrdFibra = new String[] {""} ;
      T01UX10_n14094PrdFibra = new boolean[] {false} ;
      T01UX10_A856ValCod = new byte[1] ;
      T01UX11_A488ForPrdDsc = new String[] {""} ;
      T01UX11_n488ForPrdDsc = new boolean[] {false} ;
      T01UX12_A14088Lb_Gots = new String[] {""} ;
      T01UX12_n14088Lb_Gots = new boolean[] {false} ;
      T01UX13_A396EmprCod = new String[] {""} ;
      T01UX14_A396EmprCod = new String[] {""} ;
      T01UX14_A5532Lb_numero = new int[1] ;
      T01UX14_A5555Lb_opcion = new String[] {""} ;
      T01UX14_A5557Lb_LineaC = new short[1] ;
      T01UX3_A5557Lb_LineaC = new short[1] ;
      T01UX3_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UX3_A6058Lb_soluc = new int[1] ;
      T01UX3_A6544Lb_PTinC = new byte[1] ;
      T01UX3_A14096Lb_fibra = new String[] {""} ;
      T01UX3_A396EmprCod = new String[] {""} ;
      T01UX3_A719PrdNum = new String[] {""} ;
      T01UX3_A490ForPrdUMe = new byte[1] ;
      T01UX3_A5532Lb_numero = new int[1] ;
      T01UX3_A5555Lb_opcion = new String[] {""} ;
      T01UX15_A396EmprCod = new String[] {""} ;
      T01UX15_A5532Lb_numero = new int[1] ;
      T01UX15_A5555Lb_opcion = new String[] {""} ;
      T01UX15_A5557Lb_LineaC = new short[1] ;
      T01UX16_A396EmprCod = new String[] {""} ;
      T01UX16_A5532Lb_numero = new int[1] ;
      T01UX16_A5555Lb_opcion = new String[] {""} ;
      T01UX16_A5557Lb_LineaC = new short[1] ;
      T01UX2_A5557Lb_LineaC = new short[1] ;
      T01UX2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UX2_A6058Lb_soluc = new int[1] ;
      T01UX2_A6544Lb_PTinC = new byte[1] ;
      T01UX2_A14096Lb_fibra = new String[] {""} ;
      T01UX2_A396EmprCod = new String[] {""} ;
      T01UX2_A719PrdNum = new String[] {""} ;
      T01UX2_A490ForPrdUMe = new byte[1] ;
      T01UX2_A5532Lb_numero = new int[1] ;
      T01UX2_A5555Lb_opcion = new String[] {""} ;
      T01UX20_A718PrdNom = new String[] {""} ;
      T01UX20_A7260PrdHorMad = new byte[1] ;
      T01UX20_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UX20_A11663PrdCtw4 = new String[] {""} ;
      T01UX20_A10938PrdCtw3 = new String[] {""} ;
      T01UX20_A10937PrdCtw2 = new String[] {""} ;
      T01UX20_A10936PrdCtw1 = new String[] {""} ;
      T01UX20_A11363PrdGots = new String[] {""} ;
      T01UX20_A14094PrdFibra = new String[] {""} ;
      T01UX20_n14094PrdFibra = new boolean[] {false} ;
      T01UX20_A856ValCod = new byte[1] ;
      T01UX21_A488ForPrdDsc = new String[] {""} ;
      T01UX21_n488ForPrdDsc = new boolean[] {false} ;
      T01UX22_A14088Lb_Gots = new String[] {""} ;
      T01UX22_n14088Lb_Gots = new boolean[] {false} ;
      T01UX23_A396EmprCod = new String[] {""} ;
      T01UX23_A5532Lb_numero = new int[1] ;
      T01UX23_A5555Lb_opcion = new String[] {""} ;
      T01UX23_A5557Lb_LineaC = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int11 = new byte[1] ;
      T01UX24_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Z14097PrdCtwSt = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratoriocolorantes_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratoriocolorantes_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratoriocolorantes_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratoriocolorantes_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayolaboratoriocolorantes_trn__default(),
         new Object[] {
             new Object[] {
            T01UX2_A5557Lb_LineaC, T01UX2_A5558LB_CantC, T01UX2_A6058Lb_soluc, T01UX2_A6544Lb_PTinC, T01UX2_A14096Lb_fibra, T01UX2_A396EmprCod, T01UX2_A719PrdNum, T01UX2_A490ForPrdUMe, T01UX2_A5532Lb_numero, T01UX2_A5555Lb_opcion
            }
            , new Object[] {
            T01UX3_A5557Lb_LineaC, T01UX3_A5558LB_CantC, T01UX3_A6058Lb_soluc, T01UX3_A6544Lb_PTinC, T01UX3_A14096Lb_fibra, T01UX3_A396EmprCod, T01UX3_A719PrdNum, T01UX3_A490ForPrdUMe, T01UX3_A5532Lb_numero, T01UX3_A5555Lb_opcion
            }
            , new Object[] {
            T01UX4_A407EmprNom, T01UX4_n407EmprNom
            }
            , new Object[] {
            T01UX5_A718PrdNom, T01UX5_A7260PrdHorMad, T01UX5_A724PrdPreAct, T01UX5_A11663PrdCtw4, T01UX5_A10938PrdCtw3, T01UX5_A10937PrdCtw2, T01UX5_A10936PrdCtw1, T01UX5_A11363PrdGots, T01UX5_A14094PrdFibra, T01UX5_n14094PrdFibra,
            T01UX5_A856ValCod
            }
            , new Object[] {
            T01UX6_A488ForPrdDsc, T01UX6_n488ForPrdDsc
            }
            , new Object[] {
            T01UX7_A14088Lb_Gots, T01UX7_n14088Lb_Gots
            }
            , new Object[] {
            T01UX8_A396EmprCod
            }
            , new Object[] {
            T01UX9_A5557Lb_LineaC, T01UX9_A407EmprNom, T01UX9_n407EmprNom, T01UX9_A14088Lb_Gots, T01UX9_n14088Lb_Gots, T01UX9_A718PrdNom, T01UX9_A488ForPrdDsc, T01UX9_n488ForPrdDsc, T01UX9_A5558LB_CantC, T01UX9_A6058Lb_soluc,
            T01UX9_A6544Lb_PTinC, T01UX9_A7260PrdHorMad, T01UX9_A724PrdPreAct, T01UX9_A11663PrdCtw4, T01UX9_A10938PrdCtw3, T01UX9_A10937PrdCtw2, T01UX9_A10936PrdCtw1, T01UX9_A11363PrdGots, T01UX9_A14096Lb_fibra, T01UX9_A14094PrdFibra,
            T01UX9_n14094PrdFibra, T01UX9_A396EmprCod, T01UX9_A719PrdNum, T01UX9_A490ForPrdUMe, T01UX9_A5532Lb_numero, T01UX9_A5555Lb_opcion, T01UX9_A856ValCod
            }
            , new Object[] {
            T01UX10_A718PrdNom, T01UX10_A7260PrdHorMad, T01UX10_A724PrdPreAct, T01UX10_A11663PrdCtw4, T01UX10_A10938PrdCtw3, T01UX10_A10937PrdCtw2, T01UX10_A10936PrdCtw1, T01UX10_A11363PrdGots, T01UX10_A14094PrdFibra, T01UX10_n14094PrdFibra,
            T01UX10_A856ValCod
            }
            , new Object[] {
            T01UX11_A488ForPrdDsc, T01UX11_n488ForPrdDsc
            }
            , new Object[] {
            T01UX12_A14088Lb_Gots, T01UX12_n14088Lb_Gots
            }
            , new Object[] {
            T01UX13_A396EmprCod
            }
            , new Object[] {
            T01UX14_A396EmprCod, T01UX14_A5532Lb_numero, T01UX14_A5555Lb_opcion, T01UX14_A5557Lb_LineaC
            }
            , new Object[] {
            T01UX15_A396EmprCod, T01UX15_A5532Lb_numero, T01UX15_A5555Lb_opcion, T01UX15_A5557Lb_LineaC
            }
            , new Object[] {
            T01UX16_A396EmprCod, T01UX16_A5532Lb_numero, T01UX16_A5555Lb_opcion, T01UX16_A5557Lb_LineaC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UX20_A718PrdNom, T01UX20_A7260PrdHorMad, T01UX20_A724PrdPreAct, T01UX20_A11663PrdCtw4, T01UX20_A10938PrdCtw3, T01UX20_A10937PrdCtw2, T01UX20_A10936PrdCtw1, T01UX20_A11363PrdGots, T01UX20_A14094PrdFibra, T01UX20_n14094PrdFibra,
            T01UX20_A856ValCod
            }
            , new Object[] {
            T01UX21_A488ForPrdDsc, T01UX21_n488ForPrdDsc
            }
            , new Object[] {
            T01UX22_A14088Lb_Gots, T01UX22_n14088Lb_Gots
            }
            , new Object[] {
            T01UX23_A396EmprCod, T01UX23_A5532Lb_numero, T01UX23_A5555Lb_opcion, T01UX23_A5557Lb_LineaC
            }
            , new Object[] {
            T01UX24_A396EmprCod
            }
         }
      );
      AV25Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorioColorantes_TRN" ;
   }

   private byte Z6544Lb_PTinC ;
   private byte Z490ForPrdUMe ;
   private byte N490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A6544Lb_PTinC ;
   private byte AV15Insert_ForPrdUMe ;
   private byte A7260PrdHorMad ;
   private byte A856ValCod ;
   private byte Z7260PrdHorMad ;
   private byte Z856ValCod ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private short wcpOAV10Lb_LineaC ;
   private short Z5557Lb_LineaC ;
   private short AV10Lb_LineaC ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5557Lb_LineaC ;
   private short AV20Moda21 ;
   private short RcdFound820 ;
   private short AV21fibracolorante ;
   private short nIsDirty_820 ;
   private int wcpOAV8Lb_numero ;
   private int Z5532Lb_numero ;
   private int Z6058Lb_soluc ;
   private int A5532Lb_numero ;
   private int AV8Lb_numero ;
   private int trnEnded ;
   private int edtLb_numero_Enabled ;
   private int edtLb_opcion_Enabled ;
   private int edtLb_LineaC_Enabled ;
   private int edtPrdNum_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int imgprompt_490_Visible ;
   private int edtForPrdDsc_Enabled ;
   private int edtLB_CantC_Enabled ;
   private int edtLb_fibra_Enabled ;
   private int edtLb_PTinC_Enabled ;
   private int divUnnamedtable3_Visible ;
   private int edtPrdGots_Visible ;
   private int edtPrdGots_Enabled ;
   private int edtPrdCtwSt_Visible ;
   private int edtPrdCtwSt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboprdnum_Visible ;
   private int edtavComboprdnum_Enabled ;
   private int edtPrdCtw4_Visible ;
   private int edtPrdCtw4_Enabled ;
   private int edtPrdCtw3_Visible ;
   private int edtPrdCtw3_Enabled ;
   private int edtPrdCtw2_Visible ;
   private int edtPrdCtw2_Enabled ;
   private int edtPrdCtw1_Visible ;
   private int edtPrdCtw1_Enabled ;
   private int edtPrdFibra_Visible ;
   private int edtPrdFibra_Enabled ;
   private int A6058Lb_soluc ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV26GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z5558LB_CantC ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9Lb_opcion ;
   private String Z396EmprCod ;
   private String Z5555Lb_opcion ;
   private String Z14096Lb_fibra ;
   private String Z719PrdNum ;
   private String N719PrdNum ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV7EmprCod ;
   private String A5555Lb_opcion ;
   private String Gx_mode ;
   private String AV9Lb_opcion ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
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
   private String edtLb_numero_Internalname ;
   private String edtLb_numero_Jsonclick ;
   private String edtLb_opcion_Internalname ;
   private String edtLb_opcion_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtLb_LineaC_Internalname ;
   private String edtLb_LineaC_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockprdnum_Internalname ;
   private String lblTextblockprdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String TempTags ;
   private String edtPrdNum_Jsonclick ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String imgprompt_490_gximage ;
   private String sImgUrl ;
   private String imgprompt_490_Internalname ;
   private String imgprompt_490_Link ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtLB_CantC_Internalname ;
   private String edtLB_CantC_Jsonclick ;
   private String edtLb_fibra_Internalname ;
   private String A14096Lb_fibra ;
   private String edtLb_fibra_Jsonclick ;
   private String edtLb_PTinC_Internalname ;
   private String edtLb_PTinC_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divPrdgots_cell_Internalname ;
   private String divPrdgots_cell_Class ;
   private String edtPrdGots_Internalname ;
   private String A11363PrdGots ;
   private String edtPrdGots_Jsonclick ;
   private String divPrdctwst_cell_Internalname ;
   private String divPrdctwst_cell_Class ;
   private String edtPrdCtwSt_Internalname ;
   private String edtPrdCtwSt_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV25Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_prdnum_Internalname ;
   private String edtavComboprdnum_Internalname ;
   private String AV19ComboPrdNum ;
   private String edtavComboprdnum_Jsonclick ;
   private String edtPrdCtw4_Internalname ;
   private String A11663PrdCtw4 ;
   private String edtPrdCtw4_Jsonclick ;
   private String edtPrdCtw3_Internalname ;
   private String A10938PrdCtw3 ;
   private String edtPrdCtw3_Jsonclick ;
   private String edtPrdCtw2_Internalname ;
   private String A10937PrdCtw2 ;
   private String edtPrdCtw2_Jsonclick ;
   private String edtPrdCtw1_Internalname ;
   private String A10936PrdCtw1 ;
   private String edtPrdCtw1_Jsonclick ;
   private String edtPrdFibra_Internalname ;
   private String A14094PrdFibra ;
   private String edtPrdFibra_Jsonclick ;
   private String AV14Insert_PrdNum ;
   private String A14088Lb_Gots ;
   private String A407EmprNom ;
   private String A718PrdNom ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode820 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String AV23EmprNom ;
   private String AV24UsurCod ;
   private String Z407EmprNom ;
   private String Z14088Lb_Gots ;
   private String Z718PrdNom ;
   private String Z11663PrdCtw4 ;
   private String Z10938PrdCtw3 ;
   private String Z10937PrdCtw2 ;
   private String Z10936PrdCtw1 ;
   private String Z11363PrdGots ;
   private String Z14094PrdFibra ;
   private String Z488ForPrdDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean n14088Lb_Gots ;
   private boolean n407EmprNom ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n488ForPrdDsc ;
   private boolean n14094PrdFibra ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A14097PrdCtwSt ;
   private String AV18ComboSelectedValue ;
   private String Z14097PrdCtwSt ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UX4_A407EmprNom ;
   private boolean[] T01UX4_n407EmprNom ;
   private String[] T01UX7_A14088Lb_Gots ;
   private boolean[] T01UX7_n14088Lb_Gots ;
   private String[] T01UX6_A488ForPrdDsc ;
   private boolean[] T01UX6_n488ForPrdDsc ;
   private String[] T01UX5_A718PrdNom ;
   private byte[] T01UX5_A7260PrdHorMad ;
   private java.math.BigDecimal[] T01UX5_A724PrdPreAct ;
   private String[] T01UX5_A11663PrdCtw4 ;
   private String[] T01UX5_A10938PrdCtw3 ;
   private String[] T01UX5_A10937PrdCtw2 ;
   private String[] T01UX5_A10936PrdCtw1 ;
   private String[] T01UX5_A11363PrdGots ;
   private String[] T01UX5_A14094PrdFibra ;
   private boolean[] T01UX5_n14094PrdFibra ;
   private byte[] T01UX5_A856ValCod ;
   private short[] T01UX9_A5557Lb_LineaC ;
   private String[] T01UX9_A407EmprNom ;
   private boolean[] T01UX9_n407EmprNom ;
   private String[] T01UX9_A14088Lb_Gots ;
   private boolean[] T01UX9_n14088Lb_Gots ;
   private String[] T01UX9_A718PrdNom ;
   private String[] T01UX9_A488ForPrdDsc ;
   private boolean[] T01UX9_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01UX9_A5558LB_CantC ;
   private int[] T01UX9_A6058Lb_soluc ;
   private byte[] T01UX9_A6544Lb_PTinC ;
   private byte[] T01UX9_A7260PrdHorMad ;
   private java.math.BigDecimal[] T01UX9_A724PrdPreAct ;
   private String[] T01UX9_A11663PrdCtw4 ;
   private String[] T01UX9_A10938PrdCtw3 ;
   private String[] T01UX9_A10937PrdCtw2 ;
   private String[] T01UX9_A10936PrdCtw1 ;
   private String[] T01UX9_A11363PrdGots ;
   private String[] T01UX9_A14096Lb_fibra ;
   private String[] T01UX9_A14094PrdFibra ;
   private boolean[] T01UX9_n14094PrdFibra ;
   private String[] T01UX9_A396EmprCod ;
   private String[] T01UX9_A719PrdNum ;
   private byte[] T01UX9_A490ForPrdUMe ;
   private int[] T01UX9_A5532Lb_numero ;
   private String[] T01UX9_A5555Lb_opcion ;
   private byte[] T01UX9_A856ValCod ;
   private String[] T01UX8_A396EmprCod ;
   private String[] T01UX10_A718PrdNom ;
   private byte[] T01UX10_A7260PrdHorMad ;
   private java.math.BigDecimal[] T01UX10_A724PrdPreAct ;
   private String[] T01UX10_A11663PrdCtw4 ;
   private String[] T01UX10_A10938PrdCtw3 ;
   private String[] T01UX10_A10937PrdCtw2 ;
   private String[] T01UX10_A10936PrdCtw1 ;
   private String[] T01UX10_A11363PrdGots ;
   private String[] T01UX10_A14094PrdFibra ;
   private boolean[] T01UX10_n14094PrdFibra ;
   private byte[] T01UX10_A856ValCod ;
   private String[] T01UX11_A488ForPrdDsc ;
   private boolean[] T01UX11_n488ForPrdDsc ;
   private String[] T01UX12_A14088Lb_Gots ;
   private boolean[] T01UX12_n14088Lb_Gots ;
   private String[] T01UX13_A396EmprCod ;
   private String[] T01UX14_A396EmprCod ;
   private int[] T01UX14_A5532Lb_numero ;
   private String[] T01UX14_A5555Lb_opcion ;
   private short[] T01UX14_A5557Lb_LineaC ;
   private short[] T01UX3_A5557Lb_LineaC ;
   private java.math.BigDecimal[] T01UX3_A5558LB_CantC ;
   private int[] T01UX3_A6058Lb_soluc ;
   private byte[] T01UX3_A6544Lb_PTinC ;
   private String[] T01UX3_A14096Lb_fibra ;
   private String[] T01UX3_A396EmprCod ;
   private String[] T01UX3_A719PrdNum ;
   private byte[] T01UX3_A490ForPrdUMe ;
   private int[] T01UX3_A5532Lb_numero ;
   private String[] T01UX3_A5555Lb_opcion ;
   private String[] T01UX15_A396EmprCod ;
   private int[] T01UX15_A5532Lb_numero ;
   private String[] T01UX15_A5555Lb_opcion ;
   private short[] T01UX15_A5557Lb_LineaC ;
   private String[] T01UX16_A396EmprCod ;
   private int[] T01UX16_A5532Lb_numero ;
   private String[] T01UX16_A5555Lb_opcion ;
   private short[] T01UX16_A5557Lb_LineaC ;
   private short[] T01UX2_A5557Lb_LineaC ;
   private java.math.BigDecimal[] T01UX2_A5558LB_CantC ;
   private int[] T01UX2_A6058Lb_soluc ;
   private byte[] T01UX2_A6544Lb_PTinC ;
   private String[] T01UX2_A14096Lb_fibra ;
   private String[] T01UX2_A396EmprCod ;
   private String[] T01UX2_A719PrdNum ;
   private byte[] T01UX2_A490ForPrdUMe ;
   private int[] T01UX2_A5532Lb_numero ;
   private String[] T01UX2_A5555Lb_opcion ;
   private String[] T01UX20_A718PrdNom ;
   private byte[] T01UX20_A7260PrdHorMad ;
   private java.math.BigDecimal[] T01UX20_A724PrdPreAct ;
   private String[] T01UX20_A11663PrdCtw4 ;
   private String[] T01UX20_A10938PrdCtw3 ;
   private String[] T01UX20_A10937PrdCtw2 ;
   private String[] T01UX20_A10936PrdCtw1 ;
   private String[] T01UX20_A11363PrdGots ;
   private String[] T01UX20_A14094PrdFibra ;
   private boolean[] T01UX20_n14094PrdFibra ;
   private byte[] T01UX20_A856ValCod ;
   private String[] T01UX21_A488ForPrdDsc ;
   private boolean[] T01UX21_n488ForPrdDsc ;
   private String[] T01UX22_A14088Lb_Gots ;
   private boolean[] T01UX22_n14088Lb_Gots ;
   private String[] T01UX23_A396EmprCod ;
   private int[] T01UX23_A5532Lb_numero ;
   private String[] T01UX23_A5555Lb_opcion ;
   private short[] T01UX23_A5557Lb_LineaC ;
   private String[] T01UX24_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV17PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV16TrnContextAtt ;
}

final  class entradaensayolaboratoriocolorantes_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratoriocolorantes_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratoriocolorantes_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratoriocolorantes_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradaensayolaboratoriocolorantes_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UX2", "SELECT Lb_LineaC, LB_CantC, Lb_soluc, Lb_PTinC, Lb_fibra, EmprCod, PrdNum, ForPrdUMe, Lb_numero, Lb_opcion FROM TXPENS003 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ?  FOR UPDATE OF LB_CantC, Lb_soluc, Lb_PTinC, Lb_fibra, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX3", "SELECT Lb_LineaC, LB_CantC, Lb_soluc, Lb_PTinC, Lb_fibra, EmprCod, PrdNum, ForPrdUMe, Lb_numero, Lb_opcion FROM TXPENS003 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX5", "SELECT PrdNom, PrdHorMad, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, PrdFibra, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX6", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX7", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX8", "SELECT EmprCod FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX9", "SELECT /*+ FIRST_ROWS(100) */ TM1.Lb_LineaC, T2.EmprNom, T3.Lb_Gots, T4.PrdNom, T5.ForPrdDsc, TM1.LB_CantC, TM1.Lb_soluc, TM1.Lb_PTinC, T4.PrdHorMad, T4.PrdPreAct, T4.PrdCtw4, T4.PrdCtw3, T4.PrdCtw2, T4.PrdCtw1, T4.PrdGots, TM1.Lb_fibra, T4.PrdFibra, TM1.EmprCod, TM1.PrdNum, TM1.ForPrdUMe, TM1.Lb_numero, TM1.Lb_opcion, T4.ValCod FROM ((((TXPENS003 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPENS001 T3 ON T3.EmprCod = TM1.EmprCod AND T3.Lb_numero = TM1.Lb_numero) INNER JOIN TXPPRODUC T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrdNum = TM1.PrdNum) INNER JOIN TXPUNMEPR T5 ON T5.EmprCod = TM1.EmprCod AND T5.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.Lb_numero = ? and TM1.Lb_opcion = ? and TM1.Lb_LineaC = ? ORDER BY TM1.EmprCod, TM1.Lb_numero, TM1.Lb_opcion, TM1.Lb_LineaC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX10", "SELECT PrdNom, PrdHorMad, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, PrdFibra, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX11", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX12", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX13", "SELECT EmprCod FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE ( EmprCod > ? or EmprCod = ? and Lb_numero > ? or Lb_numero = ? and EmprCod = ? and Lb_opcion > ? or Lb_opcion = ? and Lb_numero = ? and EmprCod = ? and Lb_LineaC > ?) ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UX16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE ( EmprCod < ? or EmprCod = ? and Lb_numero < ? or Lb_numero = ? and EmprCod = ? and Lb_opcion < ? or Lb_opcion = ? and Lb_numero = ? and EmprCod = ? and Lb_LineaC < ?) ORDER BY EmprCod DESC, Lb_numero DESC, Lb_opcion DESC, Lb_LineaC DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UX17", "INSERT INTO TXPENS003(Lb_LineaC, LB_CantC, Lb_soluc, Lb_PTinC, Lb_fibra, EmprCod, PrdNum, ForPrdUMe, Lb_numero, Lb_opcion) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPENS003")
         ,new UpdateCursor("T01UX18", "UPDATE TXPENS003 SET LB_CantC=?, Lb_soluc=?, Lb_PTinC=?, Lb_fibra=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ?", GX_NOMASK, "TXPENS003")
         ,new UpdateCursor("T01UX19", "DELETE FROM TXPENS003  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? AND Lb_LineaC = ?", GX_NOMASK, "TXPENS003")
         ,new ForEachCursor("T01UX20", "SELECT PrdNom, PrdHorMad, PrdPreAct, PrdCtw4, PrdCtw3, PrdCtw2, PrdCtw1, PrdGots, PrdFibra, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX21", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX22", "SELECT Lb_Gots FROM TXPENS001 WHERE EmprCod = ? AND Lb_numero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UX24", "SELECT EmprCod FROM TXPENS002 WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((String[]) buf[6])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,5);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               ((String[]) buf[14])[0] = rslt.getString(12, 3);
               ((String[]) buf[15])[0] = rslt.getString(13, 20);
               ((String[]) buf[16])[0] = rslt.getString(14, 3);
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 4);
               ((String[]) buf[19])[0] = rslt.getString(17, 4);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 3);
               ((String[]) buf[22])[0] = rslt.getString(19, 6);
               ((byte[]) buf[23])[0] = rslt.getByte(20);
               ((int[]) buf[24])[0] = rslt.getInt(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 1);
               ((byte[]) buf[26])[0] = rslt.getByte(23);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 15 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 4);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 16 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 4);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

