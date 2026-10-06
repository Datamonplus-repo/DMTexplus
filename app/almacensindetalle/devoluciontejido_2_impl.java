package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devoluciontejido_2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_1TG1634( A396EmprCod, A44AlbRecCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A11669DevCruId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A840TrnCod) ;
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
            AV8DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8DevCruId), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DevCruId), "ZZZZZZZ9")));
            AV9AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRecCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbRecCod), "ZZZZZZZ9")));
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion Tejido (Lineas)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public devoluciontejido_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devoluciontejido_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_2_impl.class ));
   }

   public devoluciontejido_2_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruId_Internalname, httpContext.getMessage( "Devolucion Id", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruId_Internalname, GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruId_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruFec_Internalname, httpContext.getMessage( "Fecha Devolucion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruFec_Internalname, localUtil.format(A11670DevCruFec, "99/99/99"), localUtil.format( A11670DevCruFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavImgalbreccodprompt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavImgalbreccodprompt_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Static Bitmap Variable */
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavImgalbreccodprompt_gximage, "")==0) ? "" : "GX_Image_"+imgavImgalbreccodprompt_gximage+"_Class") ;
      StyleString = "" ;
      AV13imgAlbRecCodPrompt_IsBlob = (boolean)(((GXutil.strcmp("", AV13imgAlbRecCodPrompt)==0)&&(GXutil.strcmp("", AV25Imgalbreccodprompt_GXI)==0))||!(GXutil.strcmp("", AV13imgAlbRecCodPrompt)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV13imgAlbRecCodPrompt)==0) ? AV25Imgalbreccodprompt_GXI : httpContext.getResourceRelative(AV13imgAlbRecCodPrompt)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavImgalbreccodprompt_Internalname, sImgUrl, imgavImgalbreccodprompt_Link, "", "", context.getHttpContext().getTheme( ), imgavImgalbreccodprompt_Visible, imgavImgalbreccodprompt_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", "", 1, AV13imgAlbRecCodPrompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRefDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRefDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRefDsc_Internalname, GXutil.rtrim( A3613AlbRefDsc), GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRefDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRefDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruUnd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruUnd_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruUnd_Enabled!=0) ? localUtil.format( A11683DevCruUnd, "ZZZZZ9.99") : localUtil.format( A11683DevCruUnd, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruUnd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruUnd_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Cant. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruPzs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruPzs_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruPzs_Internalname, GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruPzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruPzs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruPzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Pzs. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV24Pgmname), GXutil.rtrim( localUtil.format( AV24Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      e111TG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "Z11669DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( "Z11683DevCruUnd")) ;
            Z11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( "Z11684DevCruPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z3613AlbRefDsc = httpContext.cgiGet( "Z3613AlbRefDsc") ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n840TrnCod = false ;
            O11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( "O11684DevCruPzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "O54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( "O11683DevCruUnd")) ;
            O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "O60AlbRUniUti")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "ALBRUNIENT")) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "ALBRUNIUTI")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "vDEVCRUID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV23FlagCli = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A56AlbRUni = httpContext.cgiGet( "ALBRUNI") ;
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( "DEVCRUSAL"), 0) ;
            A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVCRUEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11672DevCruMat = httpContext.cgiGet( "DEVCRUMAT") ;
            A11674DevCruHash = httpContext.cgiGet( "DEVCRUHASH") ;
            A11675DevCruDesc = httpContext.cgiGet( "DEVCRUDESC") ;
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( "DEVCRUDTSY"), 0) ;
            A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( "DEVCRUGROS")) ;
            A11678DevCruStt = httpContext.cgiGet( "DEVCRUSTT") ;
            A11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVCRUENVA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11680DevCruAtId = httpContext.cgiGet( "DEVCRUATID") ;
            A11681DevCruAT = httpContext.cgiGet( "DEVCRUAT") ;
            A11682DevCruObs = httpContext.cgiGet( "DEVCRUOBS") ;
            A13983DevCruATCU = httpContext.cgiGet( "DEVCRUATCU") ;
            A13984DevCruSerA = httpContext.cgiGet( "DEVCRUSERA") ;
            A13985DevCruTipA = httpContext.cgiGet( "DEVCRUTIPA") ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11669DevCruId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            }
            else
            {
               A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            }
            A11670DevCruFec = localUtil.ctod( httpContext.cgiGet( edtDevCruFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            AV13imgAlbRecCodPrompt = httpContext.cgiGet( imgavImgalbreccodprompt_Internalname) ;
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUUND");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruUnd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11683DevCruUnd = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
            }
            else
            {
               A11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
            }
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUPZS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruPzs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11684DevCruPzs = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
            }
            else
            {
               A11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
            }
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            AV24Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_2");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A11669DevCruId != Z11669DevCruId ) || ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("almacensindetalle\\devoluciontejido_2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
                  sMode1634 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1634 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1634 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TG0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DEVCRUID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevCruId_Internalname ;
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
                        e111TG2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TG2 ();
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
         e121TG2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TG1634( ) ;
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
         disableAttributes1TG1634( ) ;
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

   public void confirm_1TG0( )
   {
      beforeValidate1TG1634( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TG1634( ) ;
         }
         else
         {
            checkExtendedTable1TG1634( ) ;
            closeExtendedTableCursors1TG1634( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TG0( )
   {
   }

   public void e111TG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      devoluciontejido_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      devoluciontejido_2_impl.this.AV7EmprCod = GXv_char2[0] ;
      devoluciontejido_2_impl.this.AV14EmprNom = GXv_char3[0] ;
      devoluciontejido_2_impl.this.AV15UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXt_int5 = (byte)(AV17FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      devoluciontejido_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17FirmaD), 4, 0));
      GXt_int5 = (byte)(AV18Ws) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "WSDM", ""), GXv_int6) ;
      devoluciontejido_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Ws", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Ws), 4, 0));
      GXt_int5 = (byte)(AV19Modhh) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      devoluciontejido_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Modhh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Modhh), 4, 0));
      GXt_int5 = (byte)(AV20Reg000) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "REG000", ""), GXv_int6) ;
      devoluciontejido_2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20Reg000 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Reg000", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Reg000), 4, 0));
      GXt_int7 = AV21copias ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "DEVEND", ""), GXv_int8) ;
      devoluciontejido_2_impl.this.GXt_int7 = GXv_int8[0] ;
      AV21copias = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21copias), 4, 0));
      AV21copias = (short)(((0==AV21copias) ? 1 : AV21copias)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21copias), 4, 0));
      AV22Copias2 = AV21copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Copias2), 4, 0));
      GXt_char1 = AV16Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      devoluciontejido_2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char4, GXv_char3, GXv_char2) ;
      devoluciontejido_2_impl.this.AV7EmprCod = GXv_char4[0] ;
      devoluciontejido_2_impl.this.AV14EmprNom = GXv_char3[0] ;
      devoluciontejido_2_impl.this.AV15UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXv_SdtWWPContext9[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV10WWPContext = GXv_SdtWWPContext9[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      imgavImgalbreccodprompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavImgalbreccodprompt_Internalname, "gximage", imgavImgalbreccodprompt_gximage, true);
      AV13imgAlbRecCodPrompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavImgalbreccodprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV13imgAlbRecCodPrompt)==0) ? AV25Imgalbreccodprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13imgAlbRecCodPrompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavImgalbreccodprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13imgAlbRecCodPrompt), true);
      AV25Imgalbreccodprompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavImgalbreccodprompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV13imgAlbRecCodPrompt)==0) ? AV25Imgalbreccodprompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV13imgAlbRecCodPrompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavImgalbreccodprompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV13imgAlbRecCodPrompt), true);
      imgavImgalbreccodprompt_Visible = ((GXutil.strcmp(Gx_mode, "INS")==0) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavImgalbreccodprompt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgavImgalbreccodprompt_Visible), 5, 0), true);
   }

   public void e121TG2( )
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

   public void zm1TG1634( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11683DevCruUnd = T01TG3_A11683DevCruUnd[0] ;
            Z11684DevCruPzs = T01TG3_A11684DevCruPzs[0] ;
         }
         else
         {
            Z11683DevCruUnd = A11683DevCruUnd ;
            Z11684DevCruPzs = A11684DevCruPzs ;
         }
      }
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T01TG6_A47AlbREst[0] ;
         Z45AlbRef = T01TG6_A45AlbRef[0] ;
         Z3613AlbRefDsc = T01TG6_A3613AlbRefDsc[0] ;
         Z58AlbRUniEnt = T01TG6_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01TG6_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01TG6_A56AlbRUni[0] ;
         Z840TrnCod = T01TG6_A840TrnCod[0] ;
      }
      if ( GX_JID == -17 )
      {
         Z11683DevCruUnd = A11683DevCruUnd ;
         Z11684DevCruPzs = A11684DevCruPzs ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z11669DevCruId = A11669DevCruId ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z11670DevCruFec = A11670DevCruFec ;
         Z11673DevCruSal = A11673DevCruSal ;
         Z11671DevCruEst = A11671DevCruEst ;
         Z11672DevCruMat = A11672DevCruMat ;
         Z11674DevCruHash = A11674DevCruHash ;
         Z11675DevCruDesc = A11675DevCruDesc ;
         Z11676DevCruDtSy = A11676DevCruDtSy ;
         Z11677DevCruGros = A11677DevCruGros ;
         Z11678DevCruStt = A11678DevCruStt ;
         Z11679DevCruEnvA = A11679DevCruEnvA ;
         Z11680DevCruAtId = A11680DevCruAtId ;
         Z11681DevCruAT = A11681DevCruAT ;
         Z11682DevCruObs = A11682DevCruObs ;
         Z13983DevCruATCU = A13983DevCruATCU ;
         Z13984DevCruSerA = A13984DevCruSerA ;
         Z13985DevCruTipA = A13985DevCruTipA ;
         Z252CliCod = A252CliCod ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z45AlbRef = A45AlbRef ;
         Z3613AlbRefDsc = A3613AlbRefDsc ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z56AlbRUni = A56AlbRUni ;
         Z840TrnCod = A840TrnCod ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV24Pgmname = "AlmacenSinDetalle.DevolucionTejido_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
      imgavImgalbreccodprompt_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.consultaalmacentejido"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"ALBRECCOD"+"'), id:'"+"ALBRECCOD"+"'"+",IOType:'inout',isKey:true,isLastKey:true}"+","+"{Ctrl:gx.dom.el('"+"CLICOD"+"'), id:'"+"CLICOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"DEVCRUUND"+"'), id:'"+"DEVCRUUND"+"'"+",IOType:'out'}"+","+"{Ctrl:gx.dom.el('"+"DEVCRUPZS"+"'), id:'"+"DEVCRUPZS"+"'"+",IOType:'out'}"+"],"+"null"+","+"'', false"+","+"false"+");") ;
      httpContext.ajax_rsp_assign_prop("", false, imgavImgalbreccodprompt_Internalname, "Link", imgavImgalbreccodprompt_Link, true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TG4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TG4_A407EmprNom[0] ;
      n407EmprNom = T01TG4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV8DevCruId) )
      {
         A11669DevCruId = AV8DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      if ( ! (0==AV8DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      else
      {
         edtDevCruId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         A44AlbRecCod = AV9AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      /* Using cursor T01TG8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01TG8_A279CliNom[0] ;
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
         /* Using cursor T01TG7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         A11670DevCruFec = T01TG7_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11673DevCruSal = T01TG7_A11673DevCruSal[0] ;
         A11671DevCruEst = T01TG7_A11671DevCruEst[0] ;
         A11672DevCruMat = T01TG7_A11672DevCruMat[0] ;
         A11674DevCruHash = T01TG7_A11674DevCruHash[0] ;
         A11675DevCruDesc = T01TG7_A11675DevCruDesc[0] ;
         A11676DevCruDtSy = T01TG7_A11676DevCruDtSy[0] ;
         A11677DevCruGros = T01TG7_A11677DevCruGros[0] ;
         A11678DevCruStt = T01TG7_A11678DevCruStt[0] ;
         A11679DevCruEnvA = T01TG7_A11679DevCruEnvA[0] ;
         A11680DevCruAtId = T01TG7_A11680DevCruAtId[0] ;
         A11681DevCruAT = T01TG7_A11681DevCruAT[0] ;
         A11682DevCruObs = T01TG7_A11682DevCruObs[0] ;
         A13983DevCruATCU = T01TG7_A13983DevCruATCU[0] ;
         A13984DevCruSerA = T01TG7_A13984DevCruSerA[0] ;
         A13985DevCruTipA = T01TG7_A13985DevCruTipA[0] ;
         pr_default.close(5);
         /* Using cursor T01TG6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         zm1TG1634( 19) ;
         A60AlbRUniUti = T01TG6_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01TG6_A54AlbRPieUti[0] ;
         A47AlbREst = T01TG6_A47AlbREst[0] ;
         A45AlbRef = T01TG6_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T01TG6_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A58AlbRUniEnt = T01TG6_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01TG6_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01TG6_A56AlbRUni[0] ;
         A840TrnCod = T01TG6_A840TrnCod[0] ;
         n840TrnCod = T01TG6_n840TrnCod[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(4);
         /* Using cursor T01TG9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01TG9_A841TrnNom[0] ;
         n841TrnNom = T01TG9_n841TrnNom[0] ;
         pr_default.close(7);
      }
   }

   public void load1TG1634( )
   {
      /* Using cursor T01TG10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A60AlbRUniUti = T01TG10_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01TG10_A54AlbRPieUti[0] ;
         A47AlbREst = T01TG10_A47AlbREst[0] ;
         A407EmprNom = T01TG10_A407EmprNom[0] ;
         n407EmprNom = T01TG10_n407EmprNom[0] ;
         A11670DevCruFec = T01TG10_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11673DevCruSal = T01TG10_A11673DevCruSal[0] ;
         A279CliNom = T01TG10_A279CliNom[0] ;
         A841TrnNom = T01TG10_A841TrnNom[0] ;
         n841TrnNom = T01TG10_n841TrnNom[0] ;
         A11671DevCruEst = T01TG10_A11671DevCruEst[0] ;
         A11672DevCruMat = T01TG10_A11672DevCruMat[0] ;
         A11674DevCruHash = T01TG10_A11674DevCruHash[0] ;
         A11675DevCruDesc = T01TG10_A11675DevCruDesc[0] ;
         A11676DevCruDtSy = T01TG10_A11676DevCruDtSy[0] ;
         A11677DevCruGros = T01TG10_A11677DevCruGros[0] ;
         A11678DevCruStt = T01TG10_A11678DevCruStt[0] ;
         A11679DevCruEnvA = T01TG10_A11679DevCruEnvA[0] ;
         A11680DevCruAtId = T01TG10_A11680DevCruAtId[0] ;
         A11681DevCruAT = T01TG10_A11681DevCruAT[0] ;
         A11682DevCruObs = T01TG10_A11682DevCruObs[0] ;
         A13983DevCruATCU = T01TG10_A13983DevCruATCU[0] ;
         A13984DevCruSerA = T01TG10_A13984DevCruSerA[0] ;
         A13985DevCruTipA = T01TG10_A13985DevCruTipA[0] ;
         A45AlbRef = T01TG10_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T01TG10_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A11683DevCruUnd = T01TG10_A11683DevCruUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
         A11684DevCruPzs = T01TG10_A11684DevCruPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
         A58AlbRUniEnt = T01TG10_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01TG10_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01TG10_A56AlbRUni[0] ;
         A840TrnCod = T01TG10_A840TrnCod[0] ;
         n840TrnCod = T01TG10_n840TrnCod[0] ;
         zm1TG1634( -17) ;
      }
      pr_default.close(8);
      onLoadActions1TG1634( ) ;
   }

   public void onLoadActions1TG1634( )
   {
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O11683DevCruUnd) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O11684DevCruPzs) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( A57AlbRUniDis.doubleValue() <= 0 )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() > 0 )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
   }

   public void checkExtendedTable1TG1634( )
   {
      nIsDirty_1634 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_int6[0] = (byte)(AV23FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int10, GXv_int6) ;
         devoluciontejido_2_impl.this.A396EmprCod = GXv_char4[0] ;
         devoluciontejido_2_impl.this.A44AlbRecCod = GXv_int8[0] ;
         devoluciontejido_2_impl.this.A252CliCod = GXv_int10[0] ;
         devoluciontejido_2_impl.this.AV23FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23FlagCli), 4, 0));
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A11683DevCruUnd)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Unidades a devolver ¡", ""), 1, "DEVCRUUND");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruUnd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01TG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01TG6_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01TG6_A54AlbRPieUti[0] ;
      A47AlbREst = T01TG6_A47AlbREst[0] ;
      A45AlbRef = T01TG6_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = T01TG6_A3613AlbRefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A58AlbRUniEnt = T01TG6_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01TG6_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01TG6_A56AlbRUni[0] ;
      A840TrnCod = T01TG6_A840TrnCod[0] ;
      n840TrnCod = T01TG6_n840TrnCod[0] ;
      nIsDirty_1634 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      nIsDirty_1634 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      pr_default.close(4);
      if ( isDlt( )  )
      {
         nIsDirty_1634 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(O11683DevCruUnd) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1634 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_1634 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-O11684DevCruPzs) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_1634 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_1634 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_1634 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_1634 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( A57AlbRUniDis.doubleValue() <= 0 )
      {
         nIsDirty_1634 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( A57AlbRUniDis.doubleValue() > 0 )
         {
            nIsDirty_1634 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      if ( A57AlbRUniDis.doubleValue() < 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, "");
         AnyError = (short)(1) ;
      }
      nIsDirty_1634 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      /* Using cursor T01TG7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEVOLUCION GENERO CRUDO detail", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11670DevCruFec = T01TG7_A11670DevCruFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11673DevCruSal = T01TG7_A11673DevCruSal[0] ;
      A11671DevCruEst = T01TG7_A11671DevCruEst[0] ;
      A11672DevCruMat = T01TG7_A11672DevCruMat[0] ;
      A11674DevCruHash = T01TG7_A11674DevCruHash[0] ;
      A11675DevCruDesc = T01TG7_A11675DevCruDesc[0] ;
      A11676DevCruDtSy = T01TG7_A11676DevCruDtSy[0] ;
      A11677DevCruGros = T01TG7_A11677DevCruGros[0] ;
      A11678DevCruStt = T01TG7_A11678DevCruStt[0] ;
      A11679DevCruEnvA = T01TG7_A11679DevCruEnvA[0] ;
      A11680DevCruAtId = T01TG7_A11680DevCruAtId[0] ;
      A11681DevCruAT = T01TG7_A11681DevCruAT[0] ;
      A11682DevCruObs = T01TG7_A11682DevCruObs[0] ;
      A13983DevCruATCU = T01TG7_A13983DevCruATCU[0] ;
      A13984DevCruSerA = T01TG7_A13984DevCruSerA[0] ;
      A13985DevCruTipA = T01TG7_A13985DevCruTipA[0] ;
      pr_default.close(5);
      /* Using cursor T01TG9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
         }
      }
      A841TrnNom = T01TG9_A841TrnNom[0] ;
      n841TrnNom = T01TG9_n841TrnNom[0] ;
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1TG1634( )
   {
      pr_default.close(3);
      pr_default.close(5);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01TG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01TG6_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A60AlbRUniUti = T01TG6_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01TG6_A54AlbRPieUti[0] ;
      A47AlbREst = T01TG6_A47AlbREst[0] ;
      A45AlbRef = T01TG6_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = T01TG6_A3613AlbRefDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A58AlbRUniEnt = T01TG6_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01TG6_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01TG6_A56AlbRUni[0] ;
      A840TrnCod = T01TG6_A840TrnCod[0] ;
      n840TrnCod = T01TG6_n840TrnCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3613AlbRefDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void gxload_20( String A396EmprCod ,
                          int A11669DevCruId )
   {
      /* Using cursor T01TG11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEVOLUCION GENERO CRUDO detail", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A11670DevCruFec = T01TG11_A11670DevCruFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11673DevCruSal = T01TG11_A11673DevCruSal[0] ;
      A11671DevCruEst = T01TG11_A11671DevCruEst[0] ;
      A11672DevCruMat = T01TG11_A11672DevCruMat[0] ;
      A11674DevCruHash = T01TG11_A11674DevCruHash[0] ;
      A11675DevCruDesc = T01TG11_A11675DevCruDesc[0] ;
      A11676DevCruDtSy = T01TG11_A11676DevCruDtSy[0] ;
      A11677DevCruGros = T01TG11_A11677DevCruGros[0] ;
      A11678DevCruStt = T01TG11_A11678DevCruStt[0] ;
      A11679DevCruEnvA = T01TG11_A11679DevCruEnvA[0] ;
      A11680DevCruAtId = T01TG11_A11680DevCruAtId[0] ;
      A11681DevCruAT = T01TG11_A11681DevCruAT[0] ;
      A11682DevCruObs = T01TG11_A11682DevCruObs[0] ;
      A13983DevCruATCU = T01TG11_A13983DevCruATCU[0] ;
      A13984DevCruSerA = T01TG11_A13984DevCruSerA[0] ;
      A13985DevCruTipA = T01TG11_A13985DevCruTipA[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A11670DevCruFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11672DevCruMat))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11674DevCruHash))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11675DevCruDesc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11678DevCruStt))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11680DevCruAtId))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11681DevCruAT))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( A11682DevCruObs)+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13983DevCruATCU))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13984DevCruSerA))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13985DevCruTipA))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_22( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01TG12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
         }
      }
      A841TrnNom = T01TG12_A841TrnNom[0] ;
      n841TrnNom = T01TG12_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1TG1634( )
   {
      /* Using cursor T01TG13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1634 = (short)(1) ;
      }
      else
      {
         RcdFound1634 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TG1634( 17) ;
         RcdFound1634 = (short)(1) ;
         A11683DevCruUnd = T01TG3_A11683DevCruUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
         A11684DevCruPzs = T01TG3_A11684DevCruPzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
         A396EmprCod = T01TG3_A396EmprCod[0] ;
         A44AlbRecCod = T01TG3_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A11669DevCruId = T01TG3_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         O11684DevCruPzs = A11684DevCruPzs ;
         httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
         O11683DevCruUnd = A11683DevCruUnd ;
         httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TG1634( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1634 = (short)(0) ;
            initializeNonKey1TG1634( ) ;
         }
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1634 = (short)(0) ;
         initializeNonKey1TG1634( ) ;
         sMode1634 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1634 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TG1634( ) ;
      if ( RcdFound1634 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1634 = (short)(0) ;
      /* Using cursor T01TG14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01TG14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TG14_A44AlbRecCod[0] < A44AlbRecCod ) || ( T01TG14_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01TG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TG14_A11669DevCruId[0] < A11669DevCruId ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01TG14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TG14_A44AlbRecCod[0] > A44AlbRecCod ) || ( T01TG14_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01TG14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TG14_A11669DevCruId[0] > A11669DevCruId ) ) )
         {
            A396EmprCod = T01TG14_A396EmprCod[0] ;
            A44AlbRecCod = T01TG14_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A11669DevCruId = T01TG14_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1634 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1634 = (short)(0) ;
      /* Using cursor T01TG15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01TG15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TG15_A44AlbRecCod[0] > A44AlbRecCod ) || ( T01TG15_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01TG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TG15_A11669DevCruId[0] > A11669DevCruId ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01TG15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TG15_A44AlbRecCod[0] < A44AlbRecCod ) || ( T01TG15_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T01TG15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TG15_A11669DevCruId[0] < A11669DevCruId ) ) )
         {
            A396EmprCod = T01TG15_A396EmprCod[0] ;
            A44AlbRecCod = T01TG15_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A11669DevCruId = T01TG15_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1634 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TG1634( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TG1634( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1634 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A11669DevCruId = Z11669DevCruId ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
               A44AlbRecCod = Z44AlbRecCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEVCRUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TG1634( ) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TG1634( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEVCRUID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevCruId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDevCruId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TG1634( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = Z11669DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A44AlbRecCod = Z44AlbRecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TG1634( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z11683DevCruUnd, T01TG2_A11683DevCruUnd[0]) != 0 ) || ( Z11684DevCruPzs != T01TG2_A11684DevCruPzs[0] ) )
         {
            if ( DecimalUtil.compareTo(Z11683DevCruUnd, T01TG2_A11683DevCruUnd[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"DevCruUnd");
               GXutil.writeLogRaw("Old: ",Z11683DevCruUnd);
               GXutil.writeLogRaw("Current: ",T01TG2_A11683DevCruUnd[0]);
            }
            if ( Z11684DevCruPzs != T01TG2_A11684DevCruPzs[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"DevCruPzs");
               GXutil.writeLogRaw("Old: ",Z11684DevCruPzs);
               GXutil.writeLogRaw("Current: ",T01TG2_A11684DevCruPzs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCR1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01TG16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(14) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != T01TG16_A47AlbREst[0] ) || ( GXutil.strcmp(Z45AlbRef, T01TG16_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z3613AlbRefDsc, T01TG16_A3613AlbRefDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01TG16_A58AlbRUniEnt[0]) != 0 ) || ( Z52AlbRPieEnt != T01TG16_A52AlbRPieEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z56AlbRUni, T01TG16_A56AlbRUni[0]) != 0 ) || ( Z840TrnCod != T01TG16_A840TrnCod[0] ) )
         {
            if ( Z47AlbREst != T01TG16_A47AlbREst[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01TG16_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01TG16_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01TG16_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z3613AlbRefDsc, T01TG16_A3613AlbRefDsc[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"AlbRefDsc");
               GXutil.writeLogRaw("Old: ",Z3613AlbRefDsc);
               GXutil.writeLogRaw("Current: ",T01TG16_A3613AlbRefDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01TG16_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01TG16_A58AlbRUniEnt[0]);
            }
            if ( Z52AlbRPieEnt != T01TG16_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01TG16_A52AlbRPieEnt[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01TG16_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01TG16_A56AlbRUni[0]);
            }
            if ( Z840TrnCod != T01TG16_A840TrnCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_2:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01TG16_A840TrnCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TG1634( )
   {
      beforeValidate1TG1634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TG1634( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TG1634( 0) ;
         checkOptimisticConcurrency1TG1634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TG1634( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TG1634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TG17 */
                  pr_default.execute(15, new Object[] {A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A11669DevCruId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                  if ( (pr_default.getStatus(15) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11TG1634( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1TG0( ) ;
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
            load1TG1634( ) ;
         }
         endLevel1TG1634( ) ;
      }
      closeExtendedTableCursors1TG1634( ) ;
   }

   public void update1TG1634( )
   {
      beforeValidate1TG1634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TG1634( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TG1634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TG1634( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TG1634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TG18 */
                  pr_default.execute(16, new Object[] {A11683DevCruUnd, Integer.valueOf(A11684DevCruPzs), A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCR1"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TG1634( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11TG1634( ) ;
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
         endLevel1TG1634( ) ;
      }
      closeExtendedTableCursors1TG1634( ) ;
   }

   public void deferredUpdate1TG1634( )
   {
   }

   public void delete( )
   {
      beforeValidate1TG1634( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TG1634( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TG1634( ) ;
         afterConfirm1TG1634( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TG1634( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TG19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCR1");
               if ( AnyError == 0 )
               {
                  updateTablesN11TG1634( ) ;
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
      sMode1634 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TG1634( ) ;
      Gx_mode = sMode1634 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TG1634( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TG20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T01TG20_A47AlbREst[0] ;
         Z45AlbRef = T01TG20_A45AlbRef[0] ;
         Z3613AlbRefDsc = T01TG20_A3613AlbRefDsc[0] ;
         Z58AlbRUniEnt = T01TG20_A58AlbRUniEnt[0] ;
         Z52AlbRPieEnt = T01TG20_A52AlbRPieEnt[0] ;
         Z56AlbRUni = T01TG20_A56AlbRUni[0] ;
         Z840TrnCod = T01TG20_A840TrnCod[0] ;
         A60AlbRUniUti = T01TG20_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01TG20_A54AlbRPieUti[0] ;
         A47AlbREst = T01TG20_A47AlbREst[0] ;
         A45AlbRef = T01TG20_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A3613AlbRefDsc = T01TG20_A3613AlbRefDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
         A58AlbRUniEnt = T01TG20_A58AlbRUniEnt[0] ;
         A52AlbRPieEnt = T01TG20_A52AlbRPieEnt[0] ;
         A56AlbRUni = T01TG20_A56AlbRUni[0] ;
         A840TrnCod = T01TG20_A840TrnCod[0] ;
         n840TrnCod = T01TG20_n840TrnCod[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(18);
         if ( isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O11683DevCruUnd) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A11683DevCruUnd).subtract(O11683DevCruUnd) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
         }
         if ( isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-O11684DevCruPzs) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A11684DevCruPzs-O11684DevCruPzs) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
         }
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         if ( A57AlbRUniDis.doubleValue() <= 0 )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( A57AlbRUniDis.doubleValue() > 0 )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         /* Using cursor T01TG21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         A11670DevCruFec = T01TG21_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11673DevCruSal = T01TG21_A11673DevCruSal[0] ;
         A11671DevCruEst = T01TG21_A11671DevCruEst[0] ;
         A11672DevCruMat = T01TG21_A11672DevCruMat[0] ;
         A11674DevCruHash = T01TG21_A11674DevCruHash[0] ;
         A11675DevCruDesc = T01TG21_A11675DevCruDesc[0] ;
         A11676DevCruDtSy = T01TG21_A11676DevCruDtSy[0] ;
         A11677DevCruGros = T01TG21_A11677DevCruGros[0] ;
         A11678DevCruStt = T01TG21_A11678DevCruStt[0] ;
         A11679DevCruEnvA = T01TG21_A11679DevCruEnvA[0] ;
         A11680DevCruAtId = T01TG21_A11680DevCruAtId[0] ;
         A11681DevCruAT = T01TG21_A11681DevCruAT[0] ;
         A11682DevCruObs = T01TG21_A11682DevCruObs[0] ;
         A13983DevCruATCU = T01TG21_A13983DevCruATCU[0] ;
         A13984DevCruSerA = T01TG21_A13984DevCruSerA[0] ;
         A13985DevCruTipA = T01TG21_A13985DevCruTipA[0] ;
         pr_default.close(19);
         /* Using cursor T01TG22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01TG22_A841TrnNom[0] ;
         n841TrnNom = T01TG22_n841TrnNom[0] ;
         pr_default.close(20);
      }
   }

   public void updateTablesN11TG1634( )
   {
      /* Using cursor T01TG23 */
      pr_default.execute(21, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1TG1634( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(14);
      if ( AnyError == 0 )
      {
         beforeComplete1TG1634( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_2");
         if ( AnyError == 0 )
         {
            confirmValues1TG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TG1634( )
   {
      /* Scan By routine */
      /* Using cursor T01TG24 */
      pr_default.execute(22);
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A396EmprCod = T01TG24_A396EmprCod[0] ;
         A11669DevCruId = T01TG24_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A44AlbRecCod = T01TG24_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TG1634( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1634 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1634 = (short)(1) ;
         A396EmprCod = T01TG24_A396EmprCod[0] ;
         A11669DevCruId = T01TG24_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A44AlbRecCod = T01TG24_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1TG1634( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1TG1634( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TG1634( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TG1634( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TG1634( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TG1634( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TG1634( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TG1634( )
   {
      edtDevCruId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      edtDevCruFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFec_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRefDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Enabled), 5, 0), true);
      edtDevCruUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtDevCruPzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruPzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TG1634( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TG0( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.devoluciontejido_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DevCruId,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","DevCruId","AlbRecCod","CliCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_2");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\devoluciontejido_2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11669DevCruId", GXutil.ltrim( localUtil.ntoc( Z11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11683DevCruUnd", GXutil.ltrim( localUtil.ntoc( Z11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11684DevCruPzs", GXutil.ltrim( localUtil.ntoc( Z11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3613AlbRefDsc", GXutil.rtrim( Z3613AlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11684DevCruPzs", GXutil.ltrim( localUtil.ntoc( O11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11683DevCruUnd", GXutil.ltrim( localUtil.ntoc( O11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV8DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV9AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCLI", GXutil.ltrim( localUtil.ntoc( AV23FlagCli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNI", GXutil.rtrim( A56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNCOD", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSAL", localUtil.ttoc( A11673DevCruSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUEST", GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUMAT", GXutil.rtrim( A11672DevCruMat));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUHASH", GXutil.rtrim( A11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUDESC", GXutil.rtrim( A11675DevCruDesc));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUDTSY", localUtil.ttoc( A11676DevCruDtSy, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUGROS", GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSTT", GXutil.rtrim( A11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUENVA", GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUATID", GXutil.rtrim( A11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUAT", GXutil.rtrim( A11681DevCruAT));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUOBS", A11682DevCruObs);
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUATCU", GXutil.rtrim( A13983DevCruATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSERA", GXutil.rtrim( A13984DevCruSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUTIPA", GXutil.rtrim( A13985DevCruTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
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
      return formatLink("app.almacensindetalle.devoluciontejido_2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DevCruId,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","DevCruId","AlbRecCod","CliCod"})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.DevolucionTejido_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion Tejido (Lineas)", "") ;
   }

   public void initializeNonKey1TG1634( )
   {
      AV23FlagCli = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23FlagCli), 4, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A11670DevCruFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A11671DevCruEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
      A11672DevCruMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
      A11674DevCruHash = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
      A11675DevCruDesc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11677DevCruGros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
      A11678DevCruStt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      A11679DevCruEnvA = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11680DevCruAtId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11681DevCruAT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      A11682DevCruObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      A13983DevCruATCU = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
      A13984DevCruSerA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
      A13985DevCruTipA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A3613AlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", A3613AlbRefDsc);
      A11683DevCruUnd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
      A11684DevCruPzs = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      O11684DevCruPzs = A11684DevCruPzs ;
      httpContext.ajax_rsp_assign_attri("", false, "A11684DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11684DevCruPzs), 6, 0));
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O11683DevCruUnd = A11683DevCruUnd ;
      httpContext.ajax_rsp_assign_attri("", false, "A11683DevCruUnd", GXutil.ltrimstr( A11683DevCruUnd, 9, 2));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      Z11683DevCruUnd = DecimalUtil.ZERO ;
      Z11684DevCruPzs = 0 ;
      Z47AlbREst = (byte)(0) ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z56AlbRUni = "" ;
      Z840TrnCod = (short)(0) ;
   }

   public void initAll1TG1634( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A11669DevCruId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1TG1634( ) ;
   }

   public void standaloneModalInsert( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101011", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/devoluciontejido_2.js", "?202682116101011", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtDevCruId_Internalname = "DEVCRUID" ;
      edtDevCruFec_Internalname = "DEVCRUFEC" ;
      edtCliCod_Internalname = "CLICOD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      imgavImgalbreccodprompt_Internalname = "vIMGALBRECCODPROMPT" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtDevCruUnd_Internalname = "DEVCRUUND" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtDevCruPzs_Internalname = "DEVCRUPZS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "Devolucion Tejido (Lineas)", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtDevCruPzs_Jsonclick = "" ;
      edtDevCruPzs_Enabled = 1 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtDevCruUnd_Jsonclick = "" ;
      edtDevCruUnd_Enabled = 1 ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRefDsc_Enabled = 0 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      imgavImgalbreccodprompt_gximage = "" ;
      imgavImgalbreccodprompt_Enabled = 1 ;
      imgavImgalbreccodprompt_Link = "" ;
      imgavImgalbreccodprompt_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruFec_Enabled = 0 ;
      edtDevCruId_Jsonclick = "" ;
      edtDevCruId_Enabled = 1 ;
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

   public void xc_14_1TG1634( String A396EmprCod ,
                              int A44AlbRecCod ,
                              int A252CliCod )
   {
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int6[0] = (byte)(AV23FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8, GXv_int6) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int10[0] ;
         A252CliCod = GXv_int8[0] ;
         AV23FlagCli = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV23FlagCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23FlagCli), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV23FlagCli, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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

   public void valid_Devcruid( )
   {
      /* Using cursor T01TG21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEVOLUCION GENERO CRUDO detail", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
      }
      A11670DevCruFec = T01TG21_A11670DevCruFec[0] ;
      A11673DevCruSal = T01TG21_A11673DevCruSal[0] ;
      A11671DevCruEst = T01TG21_A11671DevCruEst[0] ;
      A11672DevCruMat = T01TG21_A11672DevCruMat[0] ;
      A11674DevCruHash = T01TG21_A11674DevCruHash[0] ;
      A11675DevCruDesc = T01TG21_A11675DevCruDesc[0] ;
      A11676DevCruDtSy = T01TG21_A11676DevCruDtSy[0] ;
      A11677DevCruGros = T01TG21_A11677DevCruGros[0] ;
      A11678DevCruStt = T01TG21_A11678DevCruStt[0] ;
      A11679DevCruEnvA = T01TG21_A11679DevCruEnvA[0] ;
      A11680DevCruAtId = T01TG21_A11680DevCruAtId[0] ;
      A11681DevCruAT = T01TG21_A11681DevCruAT[0] ;
      A11682DevCruObs = T01TG21_A11682DevCruObs[0] ;
      A13983DevCruATCU = T01TG21_A13983DevCruATCU[0] ;
      A13984DevCruSerA = T01TG21_A13984DevCruSerA[0] ;
      A13985DevCruTipA = T01TG21_A13985DevCruTipA[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", GXutil.rtrim( A11672DevCruMat));
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", GXutil.rtrim( A11674DevCruHash));
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", GXutil.rtrim( A11675DevCruDesc));
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", GXutil.rtrim( A11678DevCruStt));
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.ltrim( localUtil.ntoc( A11679DevCruEnvA, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", GXutil.rtrim( A11680DevCruAtId));
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", GXutil.rtrim( A11681DevCruAT));
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", GXutil.rtrim( A13983DevCruATCU));
      httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", GXutil.rtrim( A13984DevCruSerA));
      httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", GXutil.rtrim( A13985DevCruTipA));
   }

   public void valid_Albreccod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01TG20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T01TG20_A47AlbREst[0] ;
      Z45AlbRef = T01TG20_A45AlbRef[0] ;
      Z3613AlbRefDsc = T01TG20_A3613AlbRefDsc[0] ;
      Z58AlbRUniEnt = T01TG20_A58AlbRUniEnt[0] ;
      Z52AlbRPieEnt = T01TG20_A52AlbRPieEnt[0] ;
      Z56AlbRUni = T01TG20_A56AlbRUni[0] ;
      Z840TrnCod = T01TG20_A840TrnCod[0] ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A60AlbRUniUti = T01TG20_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01TG20_A54AlbRPieUti[0] ;
      A47AlbREst = T01TG20_A47AlbREst[0] ;
      A45AlbRef = T01TG20_A45AlbRef[0] ;
      A3613AlbRefDsc = T01TG20_A3613AlbRefDsc[0] ;
      A58AlbRUniEnt = T01TG20_A58AlbRUniEnt[0] ;
      A52AlbRPieEnt = T01TG20_A52AlbRPieEnt[0] ;
      A56AlbRUni = T01TG20_A56AlbRUni[0] ;
      A840TrnCod = T01TG20_A840TrnCod[0] ;
      n840TrnCod = T01TG20_n840TrnCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(18);
      /* Using cursor T01TG22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
         }
      }
      A841TrnNom = T01TG22_A841TrnNom[0] ;
      n841TrnNom = T01TG22_n841TrnNom[0] ;
      pr_default.close(20);
      if ( true /* After */ && ! (0==A44AlbRecCod) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int6[0] = (byte)(AV23FlagCli) ;
         new app.pctrcli(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8, GXv_int6) ;
         devoluciontejido_2_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         devoluciontejido_2_impl.this.A44AlbRecCod = GXv_int10[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         devoluciontejido_2_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         devoluciontejido_2_impl.this.AV23FlagCli = GXv_int6[0] ;
         AV23FlagCli = this.AV23FlagCli ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3613AlbRefDsc", GXutil.rtrim( A3613AlbRefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV23FlagCli", GXutil.ltrim( localUtil.ntoc( AV23FlagCli, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV9AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TG2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'},{av:'A11671DevCruEst',fld:'DEVCRUEST',pic:'9'},{av:'A11672DevCruMat',fld:'DEVCRUMAT',pic:''},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A11675DevCruDesc',fld:'DEVCRUDESC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11677DevCruGros',fld:'DEVCRUGROS',pic:'ZZZZZZZZZ9.99'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:''},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11681DevCruAT',fld:'DEVCRUAT',pic:''},{av:'A11682DevCruObs',fld:'DEVCRUOBS',pic:''},{av:'A13983DevCruATCU',fld:'DEVCRUATCU',pic:''},{av:'A13984DevCruSerA',fld:'DEVCRUSERA',pic:''},{av:'A13985DevCruTipA',fld:'DEVCRUTIPA',pic:''}]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'},{av:'A11671DevCruEst',fld:'DEVCRUEST',pic:'9'},{av:'A11672DevCruMat',fld:'DEVCRUMAT',pic:''},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A11675DevCruDesc',fld:'DEVCRUDESC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11677DevCruGros',fld:'DEVCRUGROS',pic:'ZZZZZZZZZ9.99'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:''},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11681DevCruAT',fld:'DEVCRUAT',pic:''},{av:'A11682DevCruObs',fld:'DEVCRUOBS',pic:''},{av:'A13983DevCruATCU',fld:'DEVCRUATCU',pic:''},{av:'A13984DevCruSerA',fld:'DEVCRUSERA',pic:''},{av:'A13985DevCruTipA',fld:'DEVCRUTIPA',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'AV23FlagCli',fld:'vFLAGCLI',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A3613AlbRefDsc',fld:'ALBREFDSC',pic:''},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV23FlagCli',fld:'vFLAGCLI',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEVCRUUND","{handler:'valid_Devcruund',iparms:[]");
      setEventMetadata("VALID_DEVCRUUND",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUPZS","{handler:'valid_Devcrupzs',iparms:[]");
      setEventMetadata("VALID_DEVCRUPZS",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11683DevCruUnd = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z3613AlbRefDsc = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      O11683DevCruUnd = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
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
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV13imgAlbRecCodPrompt = "" ;
      AV25Imgalbreccodprompt_GXI = "" ;
      sImgUrl = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV24Pgmname = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11672DevCruMat = "" ;
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11678DevCruStt = "" ;
      A11680DevCruAtId = "" ;
      A11681DevCruAT = "" ;
      A11682DevCruObs = "" ;
      A13983DevCruATCU = "" ;
      A13984DevCruSerA = "" ;
      A13985DevCruTipA = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1634 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV16Station = "" ;
      AV14EmprNom = "" ;
      AV15UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11672DevCruMat = "" ;
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z13983DevCruATCU = "" ;
      Z13984DevCruSerA = "" ;
      Z13985DevCruTipA = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z841TrnNom = "" ;
      T01TG4_A407EmprNom = new String[] {""} ;
      T01TG4_n407EmprNom = new boolean[] {false} ;
      T01TG8_A279CliNom = new String[] {""} ;
      T01TG7_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG7_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG7_A11671DevCruEst = new byte[1] ;
      T01TG7_A11672DevCruMat = new String[] {""} ;
      T01TG7_A11674DevCruHash = new String[] {""} ;
      T01TG7_A11675DevCruDesc = new String[] {""} ;
      T01TG7_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG7_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG7_A11678DevCruStt = new String[] {""} ;
      T01TG7_A11679DevCruEnvA = new byte[1] ;
      T01TG7_A11680DevCruAtId = new String[] {""} ;
      T01TG7_A11681DevCruAT = new String[] {""} ;
      T01TG7_A11682DevCruObs = new String[] {""} ;
      T01TG7_A13983DevCruATCU = new String[] {""} ;
      T01TG7_A13984DevCruSerA = new String[] {""} ;
      T01TG7_A13985DevCruTipA = new String[] {""} ;
      T01TG6_A252CliCod = new int[1] ;
      T01TG6_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG6_A54AlbRPieUti = new int[1] ;
      T01TG6_A47AlbREst = new byte[1] ;
      T01TG6_A45AlbRef = new String[] {""} ;
      T01TG6_A3613AlbRefDsc = new String[] {""} ;
      T01TG6_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG6_A52AlbRPieEnt = new int[1] ;
      T01TG6_A56AlbRUni = new String[] {""} ;
      T01TG6_A840TrnCod = new short[1] ;
      T01TG6_n840TrnCod = new boolean[] {false} ;
      T01TG9_A841TrnNom = new String[] {""} ;
      T01TG9_n841TrnNom = new boolean[] {false} ;
      T01TG10_A252CliCod = new int[1] ;
      T01TG10_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG10_A54AlbRPieUti = new int[1] ;
      T01TG10_A47AlbREst = new byte[1] ;
      T01TG10_A407EmprNom = new String[] {""} ;
      T01TG10_n407EmprNom = new boolean[] {false} ;
      T01TG10_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG10_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG10_A279CliNom = new String[] {""} ;
      T01TG10_A841TrnNom = new String[] {""} ;
      T01TG10_n841TrnNom = new boolean[] {false} ;
      T01TG10_A11671DevCruEst = new byte[1] ;
      T01TG10_A11672DevCruMat = new String[] {""} ;
      T01TG10_A11674DevCruHash = new String[] {""} ;
      T01TG10_A11675DevCruDesc = new String[] {""} ;
      T01TG10_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG10_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG10_A11678DevCruStt = new String[] {""} ;
      T01TG10_A11679DevCruEnvA = new byte[1] ;
      T01TG10_A11680DevCruAtId = new String[] {""} ;
      T01TG10_A11681DevCruAT = new String[] {""} ;
      T01TG10_A11682DevCruObs = new String[] {""} ;
      T01TG10_A13983DevCruATCU = new String[] {""} ;
      T01TG10_A13984DevCruSerA = new String[] {""} ;
      T01TG10_A13985DevCruTipA = new String[] {""} ;
      T01TG10_A45AlbRef = new String[] {""} ;
      T01TG10_A3613AlbRefDsc = new String[] {""} ;
      T01TG10_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG10_A11684DevCruPzs = new int[1] ;
      T01TG10_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG10_A52AlbRPieEnt = new int[1] ;
      T01TG10_A56AlbRUni = new String[] {""} ;
      T01TG10_A396EmprCod = new String[] {""} ;
      T01TG10_A44AlbRecCod = new int[1] ;
      T01TG10_A11669DevCruId = new int[1] ;
      T01TG10_A840TrnCod = new short[1] ;
      T01TG10_n840TrnCod = new boolean[] {false} ;
      T01TG11_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG11_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG11_A11671DevCruEst = new byte[1] ;
      T01TG11_A11672DevCruMat = new String[] {""} ;
      T01TG11_A11674DevCruHash = new String[] {""} ;
      T01TG11_A11675DevCruDesc = new String[] {""} ;
      T01TG11_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG11_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG11_A11678DevCruStt = new String[] {""} ;
      T01TG11_A11679DevCruEnvA = new byte[1] ;
      T01TG11_A11680DevCruAtId = new String[] {""} ;
      T01TG11_A11681DevCruAT = new String[] {""} ;
      T01TG11_A11682DevCruObs = new String[] {""} ;
      T01TG11_A13983DevCruATCU = new String[] {""} ;
      T01TG11_A13984DevCruSerA = new String[] {""} ;
      T01TG11_A13985DevCruTipA = new String[] {""} ;
      T01TG12_A841TrnNom = new String[] {""} ;
      T01TG12_n841TrnNom = new boolean[] {false} ;
      T01TG13_A396EmprCod = new String[] {""} ;
      T01TG13_A11669DevCruId = new int[1] ;
      T01TG13_A44AlbRecCod = new int[1] ;
      T01TG3_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG3_A11684DevCruPzs = new int[1] ;
      T01TG3_A396EmprCod = new String[] {""} ;
      T01TG3_A44AlbRecCod = new int[1] ;
      T01TG3_A11669DevCruId = new int[1] ;
      T01TG14_A396EmprCod = new String[] {""} ;
      T01TG14_A44AlbRecCod = new int[1] ;
      T01TG14_A11669DevCruId = new int[1] ;
      T01TG15_A396EmprCod = new String[] {""} ;
      T01TG15_A44AlbRecCod = new int[1] ;
      T01TG15_A11669DevCruId = new int[1] ;
      T01TG2_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG2_A11684DevCruPzs = new int[1] ;
      T01TG2_A396EmprCod = new String[] {""} ;
      T01TG2_A44AlbRecCod = new int[1] ;
      T01TG2_A11669DevCruId = new int[1] ;
      T01TG16_A252CliCod = new int[1] ;
      T01TG16_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG16_A54AlbRPieUti = new int[1] ;
      T01TG16_A47AlbREst = new byte[1] ;
      T01TG16_A45AlbRef = new String[] {""} ;
      T01TG16_A3613AlbRefDsc = new String[] {""} ;
      T01TG16_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG16_A52AlbRPieEnt = new int[1] ;
      T01TG16_A56AlbRUni = new String[] {""} ;
      T01TG16_A840TrnCod = new short[1] ;
      T01TG16_n840TrnCod = new boolean[] {false} ;
      T01TG20_A252CliCod = new int[1] ;
      T01TG20_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG20_A54AlbRPieUti = new int[1] ;
      T01TG20_A47AlbREst = new byte[1] ;
      T01TG20_A45AlbRef = new String[] {""} ;
      T01TG20_A3613AlbRefDsc = new String[] {""} ;
      T01TG20_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG20_A52AlbRPieEnt = new int[1] ;
      T01TG20_A56AlbRUni = new String[] {""} ;
      T01TG20_A840TrnCod = new short[1] ;
      T01TG20_n840TrnCod = new boolean[] {false} ;
      T01TG21_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG21_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG21_A11671DevCruEst = new byte[1] ;
      T01TG21_A11672DevCruMat = new String[] {""} ;
      T01TG21_A11674DevCruHash = new String[] {""} ;
      T01TG21_A11675DevCruDesc = new String[] {""} ;
      T01TG21_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01TG21_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TG21_A11678DevCruStt = new String[] {""} ;
      T01TG21_A11679DevCruEnvA = new byte[1] ;
      T01TG21_A11680DevCruAtId = new String[] {""} ;
      T01TG21_A11681DevCruAT = new String[] {""} ;
      T01TG21_A11682DevCruObs = new String[] {""} ;
      T01TG21_A13983DevCruATCU = new String[] {""} ;
      T01TG21_A13984DevCruSerA = new String[] {""} ;
      T01TG21_A13985DevCruTipA = new String[] {""} ;
      T01TG22_A841TrnNom = new String[] {""} ;
      T01TG22_n841TrnNom = new boolean[] {false} ;
      T01TG24_A396EmprCod = new String[] {""} ;
      T01TG24_A11669DevCruId = new int[1] ;
      T01TG24_A44AlbRecCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_2__default(),
         new Object[] {
             new Object[] {
            T01TG2_A11683DevCruUnd, T01TG2_A11684DevCruPzs, T01TG2_A396EmprCod, T01TG2_A44AlbRecCod, T01TG2_A11669DevCruId
            }
            , new Object[] {
            T01TG3_A11683DevCruUnd, T01TG3_A11684DevCruPzs, T01TG3_A396EmprCod, T01TG3_A44AlbRecCod, T01TG3_A11669DevCruId
            }
            , new Object[] {
            T01TG4_A407EmprNom, T01TG4_n407EmprNom
            }
            , new Object[] {
            T01TG5_A252CliCod, T01TG5_A60AlbRUniUti, T01TG5_A54AlbRPieUti, T01TG5_A47AlbREst, T01TG5_A45AlbRef, T01TG5_A3613AlbRefDsc, T01TG5_A58AlbRUniEnt, T01TG5_A52AlbRPieEnt, T01TG5_A56AlbRUni, T01TG5_A840TrnCod,
            T01TG5_n840TrnCod
            }
            , new Object[] {
            T01TG6_A252CliCod, T01TG6_A60AlbRUniUti, T01TG6_A54AlbRPieUti, T01TG6_A47AlbREst, T01TG6_A45AlbRef, T01TG6_A3613AlbRefDsc, T01TG6_A58AlbRUniEnt, T01TG6_A52AlbRPieEnt, T01TG6_A56AlbRUni, T01TG6_A840TrnCod,
            T01TG6_n840TrnCod
            }
            , new Object[] {
            T01TG7_A11670DevCruFec, T01TG7_A11673DevCruSal, T01TG7_A11671DevCruEst, T01TG7_A11672DevCruMat, T01TG7_A11674DevCruHash, T01TG7_A11675DevCruDesc, T01TG7_A11676DevCruDtSy, T01TG7_A11677DevCruGros, T01TG7_A11678DevCruStt, T01TG7_A11679DevCruEnvA,
            T01TG7_A11680DevCruAtId, T01TG7_A11681DevCruAT, T01TG7_A11682DevCruObs, T01TG7_A13983DevCruATCU, T01TG7_A13984DevCruSerA, T01TG7_A13985DevCruTipA
            }
            , new Object[] {
            T01TG8_A279CliNom
            }
            , new Object[] {
            T01TG9_A841TrnNom, T01TG9_n841TrnNom
            }
            , new Object[] {
            T01TG10_A252CliCod, T01TG10_A60AlbRUniUti, T01TG10_A54AlbRPieUti, T01TG10_A47AlbREst, T01TG10_A407EmprNom, T01TG10_n407EmprNom, T01TG10_A11670DevCruFec, T01TG10_A11673DevCruSal, T01TG10_A279CliNom, T01TG10_A841TrnNom,
            T01TG10_n841TrnNom, T01TG10_A11671DevCruEst, T01TG10_A11672DevCruMat, T01TG10_A11674DevCruHash, T01TG10_A11675DevCruDesc, T01TG10_A11676DevCruDtSy, T01TG10_A11677DevCruGros, T01TG10_A11678DevCruStt, T01TG10_A11679DevCruEnvA, T01TG10_A11680DevCruAtId,
            T01TG10_A11681DevCruAT, T01TG10_A11682DevCruObs, T01TG10_A13983DevCruATCU, T01TG10_A13984DevCruSerA, T01TG10_A13985DevCruTipA, T01TG10_A45AlbRef, T01TG10_A3613AlbRefDsc, T01TG10_A11683DevCruUnd, T01TG10_A11684DevCruPzs, T01TG10_A58AlbRUniEnt,
            T01TG10_A52AlbRPieEnt, T01TG10_A56AlbRUni, T01TG10_A396EmprCod, T01TG10_A44AlbRecCod, T01TG10_A11669DevCruId, T01TG10_A840TrnCod, T01TG10_n840TrnCod
            }
            , new Object[] {
            T01TG11_A11670DevCruFec, T01TG11_A11673DevCruSal, T01TG11_A11671DevCruEst, T01TG11_A11672DevCruMat, T01TG11_A11674DevCruHash, T01TG11_A11675DevCruDesc, T01TG11_A11676DevCruDtSy, T01TG11_A11677DevCruGros, T01TG11_A11678DevCruStt, T01TG11_A11679DevCruEnvA,
            T01TG11_A11680DevCruAtId, T01TG11_A11681DevCruAT, T01TG11_A11682DevCruObs, T01TG11_A13983DevCruATCU, T01TG11_A13984DevCruSerA, T01TG11_A13985DevCruTipA
            }
            , new Object[] {
            T01TG12_A841TrnNom, T01TG12_n841TrnNom
            }
            , new Object[] {
            T01TG13_A396EmprCod, T01TG13_A11669DevCruId, T01TG13_A44AlbRecCod
            }
            , new Object[] {
            T01TG14_A396EmprCod, T01TG14_A44AlbRecCod, T01TG14_A11669DevCruId
            }
            , new Object[] {
            T01TG15_A396EmprCod, T01TG15_A44AlbRecCod, T01TG15_A11669DevCruId
            }
            , new Object[] {
            T01TG16_A252CliCod, T01TG16_A60AlbRUniUti, T01TG16_A54AlbRPieUti, T01TG16_A47AlbREst, T01TG16_A45AlbRef, T01TG16_A3613AlbRefDsc, T01TG16_A58AlbRUniEnt, T01TG16_A52AlbRPieEnt, T01TG16_A56AlbRUni, T01TG16_A840TrnCod,
            T01TG16_n840TrnCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TG20_A252CliCod, T01TG20_A60AlbRUniUti, T01TG20_A54AlbRPieUti, T01TG20_A47AlbREst, T01TG20_A45AlbRef, T01TG20_A3613AlbRefDsc, T01TG20_A58AlbRUniEnt, T01TG20_A52AlbRPieEnt, T01TG20_A56AlbRUni, T01TG20_A840TrnCod,
            T01TG20_n840TrnCod
            }
            , new Object[] {
            T01TG21_A11670DevCruFec, T01TG21_A11673DevCruSal, T01TG21_A11671DevCruEst, T01TG21_A11672DevCruMat, T01TG21_A11674DevCruHash, T01TG21_A11675DevCruDesc, T01TG21_A11676DevCruDtSy, T01TG21_A11677DevCruGros, T01TG21_A11678DevCruStt, T01TG21_A11679DevCruEnvA,
            T01TG21_A11680DevCruAtId, T01TG21_A11681DevCruAT, T01TG21_A11682DevCruObs, T01TG21_A13983DevCruATCU, T01TG21_A13984DevCruSerA, T01TG21_A13985DevCruTipA
            }
            , new Object[] {
            T01TG22_A841TrnNom, T01TG22_n841TrnNom
            }
            , new Object[] {
            }
            , new Object[] {
            T01TG24_A396EmprCod, T01TG24_A11669DevCruId, T01TG24_A44AlbRecCod
            }
         }
      );
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      AV24Pgmname = "AlmacenSinDetalle.DevolucionTejido_2" ;
   }

   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A47AlbREst ;
   private byte A11671DevCruEst ;
   private byte A11679DevCruEnvA ;
   private byte GXt_int5 ;
   private byte Z11671DevCruEst ;
   private byte Z11679DevCruEnvA ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXv_int6[] ;
   private short Z840TrnCod ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV23FlagCli ;
   private short RcdFound1634 ;
   private short AV17FirmaD ;
   private short AV18Ws ;
   private short AV19Modhh ;
   private short AV20Reg000 ;
   private short AV21copias ;
   private short AV22Copias2 ;
   private short nIsDirty_1634 ;
   private short ZV23FlagCli ;
   private int wcpOAV8DevCruId ;
   private int wcpOAV9AlbRecCod ;
   private int wcpOA252CliCod ;
   private int Z11669DevCruId ;
   private int Z44AlbRecCod ;
   private int Z11684DevCruPzs ;
   private int Z52AlbRPieEnt ;
   private int O11684DevCruPzs ;
   private int O54AlbRPieUti ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A11669DevCruId ;
   private int AV8DevCruId ;
   private int AV9AlbRecCod ;
   private int trnEnded ;
   private int edtDevCruId_Enabled ;
   private int edtDevCruFec_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int imgavImgalbreccodprompt_Visible ;
   private int imgavImgalbreccodprompt_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRefDsc_Enabled ;
   private int edtDevCruUnd_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A11684DevCruPzs ;
   private int edtDevCruPzs_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int GXt_int7 ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int Z54AlbRPieUti ;
   private int idxLst ;
   private int GXv_int10[] ;
   private int GXv_int8[] ;
   private int ZO54AlbRPieUti ;
   private java.math.BigDecimal Z11683DevCruUnd ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O11683DevCruUnd ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A11677DevCruGros ;
   private java.math.BigDecimal Z11677DevCruGros ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z45AlbRef ;
   private String Z3613AlbRefDsc ;
   private String Z56AlbRUni ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevCruId_Internalname ;
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
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String edtDevCruId_Jsonclick ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruFec_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String imgavImgalbreccodprompt_Internalname ;
   private String imgavImgalbreccodprompt_gximage ;
   private String sImgUrl ;
   private String imgavImgalbreccodprompt_Link ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtDevCruUnd_Internalname ;
   private String edtDevCruUnd_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtDevCruPzs_Internalname ;
   private String edtDevCruPzs_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV24Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String A56AlbRUni ;
   private String A407EmprNom ;
   private String A11672DevCruMat ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String A11678DevCruStt ;
   private String A11680DevCruAtId ;
   private String A11681DevCruAT ;
   private String A13983DevCruATCU ;
   private String A13984DevCruSerA ;
   private String A13985DevCruTipA ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String hsh ;
   private String sMode1634 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV16Station ;
   private String AV14EmprNom ;
   private String AV15UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z11672DevCruMat ;
   private String Z11674DevCruHash ;
   private String Z11675DevCruDesc ;
   private String Z11678DevCruStt ;
   private String Z11680DevCruAtId ;
   private String Z11681DevCruAT ;
   private String Z13983DevCruATCU ;
   private String Z13984DevCruSerA ;
   private String Z13985DevCruTipA ;
   private String Z841TrnNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char4[] ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date Z11673DevCruSal ;
   private java.util.Date Z11676DevCruDtSy ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date Z11670DevCruFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean AV13imgAlbRecCodPrompt_IsBlob ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV25Imgalbreccodprompt_GXI ;
   private String A11682DevCruObs ;
   private String Z11682DevCruObs ;
   private String AV13imgAlbRecCodPrompt ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01TG4_A407EmprNom ;
   private boolean[] T01TG4_n407EmprNom ;
   private String[] T01TG8_A279CliNom ;
   private java.util.Date[] T01TG7_A11670DevCruFec ;
   private java.util.Date[] T01TG7_A11673DevCruSal ;
   private byte[] T01TG7_A11671DevCruEst ;
   private String[] T01TG7_A11672DevCruMat ;
   private String[] T01TG7_A11674DevCruHash ;
   private String[] T01TG7_A11675DevCruDesc ;
   private java.util.Date[] T01TG7_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01TG7_A11677DevCruGros ;
   private String[] T01TG7_A11678DevCruStt ;
   private byte[] T01TG7_A11679DevCruEnvA ;
   private String[] T01TG7_A11680DevCruAtId ;
   private String[] T01TG7_A11681DevCruAT ;
   private String[] T01TG7_A11682DevCruObs ;
   private String[] T01TG7_A13983DevCruATCU ;
   private String[] T01TG7_A13984DevCruSerA ;
   private String[] T01TG7_A13985DevCruTipA ;
   private int[] T01TG6_A252CliCod ;
   private java.math.BigDecimal[] T01TG6_A60AlbRUniUti ;
   private int[] T01TG6_A54AlbRPieUti ;
   private byte[] T01TG6_A47AlbREst ;
   private String[] T01TG6_A45AlbRef ;
   private String[] T01TG6_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01TG6_A58AlbRUniEnt ;
   private int[] T01TG6_A52AlbRPieEnt ;
   private String[] T01TG6_A56AlbRUni ;
   private short[] T01TG6_A840TrnCod ;
   private boolean[] T01TG6_n840TrnCod ;
   private String[] T01TG9_A841TrnNom ;
   private boolean[] T01TG9_n841TrnNom ;
   private int[] T01TG10_A252CliCod ;
   private java.math.BigDecimal[] T01TG10_A60AlbRUniUti ;
   private int[] T01TG10_A54AlbRPieUti ;
   private byte[] T01TG10_A47AlbREst ;
   private String[] T01TG10_A407EmprNom ;
   private boolean[] T01TG10_n407EmprNom ;
   private java.util.Date[] T01TG10_A11670DevCruFec ;
   private java.util.Date[] T01TG10_A11673DevCruSal ;
   private String[] T01TG10_A279CliNom ;
   private String[] T01TG10_A841TrnNom ;
   private boolean[] T01TG10_n841TrnNom ;
   private byte[] T01TG10_A11671DevCruEst ;
   private String[] T01TG10_A11672DevCruMat ;
   private String[] T01TG10_A11674DevCruHash ;
   private String[] T01TG10_A11675DevCruDesc ;
   private java.util.Date[] T01TG10_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01TG10_A11677DevCruGros ;
   private String[] T01TG10_A11678DevCruStt ;
   private byte[] T01TG10_A11679DevCruEnvA ;
   private String[] T01TG10_A11680DevCruAtId ;
   private String[] T01TG10_A11681DevCruAT ;
   private String[] T01TG10_A11682DevCruObs ;
   private String[] T01TG10_A13983DevCruATCU ;
   private String[] T01TG10_A13984DevCruSerA ;
   private String[] T01TG10_A13985DevCruTipA ;
   private String[] T01TG10_A45AlbRef ;
   private String[] T01TG10_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01TG10_A11683DevCruUnd ;
   private int[] T01TG10_A11684DevCruPzs ;
   private java.math.BigDecimal[] T01TG10_A58AlbRUniEnt ;
   private int[] T01TG10_A52AlbRPieEnt ;
   private String[] T01TG10_A56AlbRUni ;
   private String[] T01TG10_A396EmprCod ;
   private int[] T01TG10_A44AlbRecCod ;
   private int[] T01TG10_A11669DevCruId ;
   private short[] T01TG10_A840TrnCod ;
   private boolean[] T01TG10_n840TrnCod ;
   private java.util.Date[] T01TG11_A11670DevCruFec ;
   private java.util.Date[] T01TG11_A11673DevCruSal ;
   private byte[] T01TG11_A11671DevCruEst ;
   private String[] T01TG11_A11672DevCruMat ;
   private String[] T01TG11_A11674DevCruHash ;
   private String[] T01TG11_A11675DevCruDesc ;
   private java.util.Date[] T01TG11_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01TG11_A11677DevCruGros ;
   private String[] T01TG11_A11678DevCruStt ;
   private byte[] T01TG11_A11679DevCruEnvA ;
   private String[] T01TG11_A11680DevCruAtId ;
   private String[] T01TG11_A11681DevCruAT ;
   private String[] T01TG11_A11682DevCruObs ;
   private String[] T01TG11_A13983DevCruATCU ;
   private String[] T01TG11_A13984DevCruSerA ;
   private String[] T01TG11_A13985DevCruTipA ;
   private String[] T01TG12_A841TrnNom ;
   private boolean[] T01TG12_n841TrnNom ;
   private String[] T01TG13_A396EmprCod ;
   private int[] T01TG13_A11669DevCruId ;
   private int[] T01TG13_A44AlbRecCod ;
   private java.math.BigDecimal[] T01TG3_A11683DevCruUnd ;
   private int[] T01TG3_A11684DevCruPzs ;
   private String[] T01TG3_A396EmprCod ;
   private int[] T01TG3_A44AlbRecCod ;
   private int[] T01TG3_A11669DevCruId ;
   private String[] T01TG14_A396EmprCod ;
   private int[] T01TG14_A44AlbRecCod ;
   private int[] T01TG14_A11669DevCruId ;
   private String[] T01TG15_A396EmprCod ;
   private int[] T01TG15_A44AlbRecCod ;
   private int[] T01TG15_A11669DevCruId ;
   private java.math.BigDecimal[] T01TG2_A11683DevCruUnd ;
   private int[] T01TG2_A11684DevCruPzs ;
   private String[] T01TG2_A396EmprCod ;
   private int[] T01TG2_A44AlbRecCod ;
   private int[] T01TG2_A11669DevCruId ;
   private int[] T01TG16_A252CliCod ;
   private java.math.BigDecimal[] T01TG16_A60AlbRUniUti ;
   private int[] T01TG16_A54AlbRPieUti ;
   private byte[] T01TG16_A47AlbREst ;
   private String[] T01TG16_A45AlbRef ;
   private String[] T01TG16_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01TG16_A58AlbRUniEnt ;
   private int[] T01TG16_A52AlbRPieEnt ;
   private String[] T01TG16_A56AlbRUni ;
   private short[] T01TG16_A840TrnCod ;
   private boolean[] T01TG16_n840TrnCod ;
   private int[] T01TG20_A252CliCod ;
   private java.math.BigDecimal[] T01TG20_A60AlbRUniUti ;
   private int[] T01TG20_A54AlbRPieUti ;
   private byte[] T01TG20_A47AlbREst ;
   private String[] T01TG20_A45AlbRef ;
   private String[] T01TG20_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01TG20_A58AlbRUniEnt ;
   private int[] T01TG20_A52AlbRPieEnt ;
   private String[] T01TG20_A56AlbRUni ;
   private short[] T01TG20_A840TrnCod ;
   private boolean[] T01TG20_n840TrnCod ;
   private java.util.Date[] T01TG21_A11670DevCruFec ;
   private java.util.Date[] T01TG21_A11673DevCruSal ;
   private byte[] T01TG21_A11671DevCruEst ;
   private String[] T01TG21_A11672DevCruMat ;
   private String[] T01TG21_A11674DevCruHash ;
   private String[] T01TG21_A11675DevCruDesc ;
   private java.util.Date[] T01TG21_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01TG21_A11677DevCruGros ;
   private String[] T01TG21_A11678DevCruStt ;
   private byte[] T01TG21_A11679DevCruEnvA ;
   private String[] T01TG21_A11680DevCruAtId ;
   private String[] T01TG21_A11681DevCruAT ;
   private String[] T01TG21_A11682DevCruObs ;
   private String[] T01TG21_A13983DevCruATCU ;
   private String[] T01TG21_A13984DevCruSerA ;
   private String[] T01TG21_A13985DevCruTipA ;
   private String[] T01TG22_A841TrnNom ;
   private boolean[] T01TG22_n841TrnNom ;
   private String[] T01TG24_A396EmprCod ;
   private int[] T01TG24_A11669DevCruId ;
   private int[] T01TG24_A44AlbRecCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private int[] T01TG5_A252CliCod ;
   private java.math.BigDecimal[] T01TG5_A60AlbRUniUti ;
   private int[] T01TG5_A54AlbRPieUti ;
   private byte[] T01TG5_A47AlbREst ;
   private String[] T01TG5_A45AlbRef ;
   private String[] T01TG5_A3613AlbRefDsc ;
   private java.math.BigDecimal[] T01TG5_A58AlbRUniEnt ;
   private int[] T01TG5_A52AlbRPieEnt ;
   private String[] T01TG5_A56AlbRUni ;
   private short[] T01TG5_A840TrnCod ;
   private boolean[] T01TG5_n840TrnCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
}

final  class devoluciontejido_2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TG2", "SELECT DevCruUnd, DevCruPzs, EmprCod, AlbRecCod, DevCruId FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?  FOR UPDATE OF DevCruUnd, DevCruPzs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG3", "SELECT DevCruUnd, DevCruPzs, EmprCod, AlbRecCod, DevCruId FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG5", "SELECT CliCod, AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni, TrnCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG6", "SELECT CliCod, AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni, TrnCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG7", "SELECT DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG9", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG10", "SELECT /*+ FIRST_ROWS(100) */ T5.CliCod, T5.AlbRUniUti, T5.AlbRPieUti, T5.AlbREst, T2.EmprNom, T4.DevCruFec, T4.DevCruSal, T3.CliNom, T6.TrnNom, T4.DevCruEst, T4.DevCruMat, T4.DevCruHash, T4.DevCruDesc, T4.DevCruDtSy, T4.DevCruGros, T4.DevCruStt, T4.DevCruEnvA, T4.DevCruAtId, T4.DevCruAT, T4.DevCruObs, T4.DevCruATCU, T4.DevCruSerA, T4.DevCruTipA, T5.AlbRef, T5.AlbRefDsc, TM1.DevCruUnd, TM1.DevCruPzs, T5.AlbRUniEnt, T5.AlbRPieEnt, T5.AlbRUni, TM1.EmprCod, TM1.AlbRecCod, TM1.DevCruId, T5.TrnCod FROM (((((TXPDEVCR1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPDEVCRU T4 ON T4.EmprCod = TM1.EmprCod AND T4.DevCruId = TM1.DevCruId) INNER JOIN TXPALBREC T5 ON T5.EmprCod = TM1.EmprCod AND T5.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = T5.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = T5.TrnCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.DevCruId = ? ORDER BY TM1.EmprCod, TM1.DevCruId, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG11", "SELECT DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG12", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DevCruId FROM TXPDEVCR1 WHERE ( EmprCod > ? or EmprCod = ? and AlbRecCod > ? or AlbRecCod = ? and EmprCod = ? and DevCruId > ?) ORDER BY EmprCod, DevCruId, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TG15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, DevCruId FROM TXPDEVCR1 WHERE ( EmprCod < ? or EmprCod = ? and AlbRecCod < ? or AlbRecCod = ? and EmprCod = ? and DevCruId < ?) ORDER BY EmprCod DESC, DevCruId DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TG16", "SELECT CliCod, AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni, TrnCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRUniUti, AlbRPieUti, AlbREst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TG17", "INSERT INTO TXPDEVCR1(DevCruUnd, DevCruPzs, EmprCod, AlbRecCod, DevCruId) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01TG18", "UPDATE TXPDEVCR1 SET DevCruUnd=?, DevCruPzs=?  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new UpdateCursor("T01TG19", "DELETE FROM TXPDEVCR1  WHERE EmprCod = ? AND DevCruId = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDEVCR1")
         ,new ForEachCursor("T01TG20", "SELECT CliCod, AlbRUniUti, AlbRPieUti, AlbREst, AlbRef, AlbRefDsc, AlbRUniEnt, AlbRPieEnt, AlbRUni, TrnCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG21", "SELECT DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TG22", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TG23", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01TG24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 ORDER BY EmprCod, DevCruId, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 300);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((String[]) buf[13])[0] = rslt.getString(12, 200);
               ((String[]) buf[14])[0] = rslt.getString(13, 300);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 20);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getVarchar(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 20);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 4);
               ((String[]) buf[25])[0] = rslt.getString(24, 16);
               ((String[]) buf[26])[0] = rslt.getString(25, 26);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,2);
               ((int[]) buf[28])[0] = rslt.getInt(27);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(28,2);
               ((int[]) buf[30])[0] = rslt.getInt(29);
               ((String[]) buf[31])[0] = rslt.getString(30, 1);
               ((String[]) buf[32])[0] = rslt.getString(31, 3);
               ((int[]) buf[33])[0] = rslt.getInt(32);
               ((int[]) buf[34])[0] = rslt.getInt(33);
               ((short[]) buf[35])[0] = rslt.getShort(34);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 300);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 19 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 300);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getVarchar(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 20);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
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
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 16 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 21 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
      }
   }

}

