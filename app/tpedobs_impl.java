package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedobs_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A658PedCod) ;
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
            AV27EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
            AV39PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39PedCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39PedCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "OBSERVACIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPedCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      nRC_GXsfl_51 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_51"))) ;
      nGXsfl_51_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_51_idx"))) ;
      sGXsfl_51_idx = httpContext.GetPar( "sGXsfl_51_idx") ;
      A2503PedObsUL = (byte)(GXutil.lval( httpContext.GetPar( "PedObsUL"))) ;
      n2503PedObsUL = false ;
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

   public tpedobs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpedobs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedobs_impl.class ));
   }

   public tpedobs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDOBS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 col-md-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedFec_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPedFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFec_Internalname, localUtil.format(A661PedFec, "99/99/99"), localUtil.format( A661PedFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedFec_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDOBS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDOBS.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-md-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedFecEnt_Internalname, httpContext.getMessage( "Fecha Ent. Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPedFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFecEnt_Internalname, localUtil.format(A662PedFecEnt, "99/99/99"), localUtil.format( A662PedFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDOBS.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDOBS.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, divUnnamedtable2_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedPerDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedPerDes_Internalname, httpContext.getMessage( "Destinatario Pedido Compras", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedPerDes_Internalname, GXutil.rtrim( A8154PedPerDes), GXutil.rtrim( localUtil.format( A8154PedPerDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedPerDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedPerDes_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDOBS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedPerPet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedPerPet_Internalname, httpContext.getMessage( "Peticionario Pedido Compras", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedPerPet_Internalname, GXutil.rtrim( A8155PedPerPet), GXutil.rtrim( localUtil.format( A8155PedPerPet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedPerPet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedPerPet_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDOBS.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDOBS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDOBS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDOBS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablefooter_Internalname, 1, 0, "px", divTablefooter_Height, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      startgridcontrol51( ) ;
      nGXsfl_51_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount337 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_337 = (short)(1) ;
            scanStart8F337( ) ;
            while ( RcdFound337 != 0 )
            {
               init_level_properties337( ) ;
               getByPrimaryKey8F337( ) ;
               addRow8F337( ) ;
               scanNext8F337( ) ;
            }
            scanEnd8F337( ) ;
            nBlankRcdCount337 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B2503PedObsUL = A2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         B5049PedConLin = A5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         standaloneNotModal8F337( ) ;
         standaloneModal8F337( ) ;
         sMode337 = Gx_mode ;
         while ( nGXsfl_51_idx < nRC_GXsfl_51 )
         {
            bGXsfl_51_Refreshing = true ;
            readRow8F337( ) ;
            edtPedObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDOBSLIN_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtPedObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDOBSTXT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedObsTxt_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            if ( ( nRcdExists_337 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal8F337( ) ;
            }
            sendRow8F337( ) ;
            bGXsfl_51_Refreshing = false ;
         }
         Gx_mode = sMode337 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2503PedObsUL = B2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         A5049PedConLin = B5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount337 = (short)(2) ;
         nRcdExists_337 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart8F337( ) ;
            while ( RcdFound337 != 0 )
            {
               sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_51337( ) ;
               init_level_properties337( ) ;
               standaloneNotModal8F337( ) ;
               getByPrimaryKey8F337( ) ;
               standaloneModal8F337( ) ;
               addRow8F337( ) ;
               scanNext8F337( ) ;
            }
            scanEnd8F337( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode337 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_51337( ) ;
         initAll8F337( ) ;
         init_level_properties337( ) ;
         B2503PedObsUL = A2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         B5049PedConLin = A5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         nRcdExists_337 = (short)(0) ;
         nIsMod_337 = (short)(0) ;
         nRcdDeleted_337 = (short)(0) ;
         nBlankRcdCount337 = (short)(nBlankRcdUsr337+nBlankRcdCount337) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount337 > 0 )
         {
            standaloneNotModal8F337( ) ;
            standaloneModal8F337( ) ;
            addRow8F337( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPedObsLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount337 = (short)(nBlankRcdCount337-1) ;
         }
         Gx_mode = sMode337 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A2503PedObsUL = B2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         A5049PedConLin = B5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
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
      e118F2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2503PedObsUL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2503PedObsUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8154PedPerDes = httpContext.cgiGet( "Z8154PedPerDes") ;
            Z8155PedPerPet = httpContext.cgiGet( "Z8155PedPerPet") ;
            Z662PedFecEnt = localUtil.ctod( httpContext.cgiGet( "Z662PedFecEnt"), 0) ;
            Z661PedFec = localUtil.ctod( httpContext.cgiGet( "Z661PedFec"), 0) ;
            A2503PedObsUL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2503PedObsUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2503PedObsUL = false ;
            O2503PedObsUL = (byte)(localUtil.ctol( httpContext.cgiGet( "O2503PedObsUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5049PedConLin = (byte)(localUtil.ctol( httpContext.cgiGet( "O5049PedConLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_51 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_51"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N661PedFec = localUtil.ctod( httpContext.cgiGet( "N661PedFec"), 0) ;
            AV27EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV39PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "vPEDCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38tintutex = (byte)(localUtil.ctol( httpContext.cgiGet( "vTINTUTEX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5049PedConLin = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDCONLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Max_lineas = (byte)(localUtil.ctol( httpContext.cgiGet( "vMAX_LINEAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30Msg_l = httpContext.cgiGet( "vMSG_L") ;
            A2503PedObsUL = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDOBSUL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A658PedCod = 0 ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            }
            else
            {
               A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPedFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A661PedFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
            }
            else
            {
               A661PedFec = localUtil.ctod( httpContext.cgiGet( edtPedFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPedFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDFECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedFecEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A662PedFecEnt = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
            }
            else
            {
               A662PedFecEnt = localUtil.ctod( httpContext.cgiGet( edtPedFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
            }
            A8154PedPerDes = httpContext.cgiGet( edtPedPerDes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8154PedPerDes", A8154PedPerDes);
            A8155PedPerPet = httpContext.cgiGet( edtPedPerPet_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8155PedPerPet", A8155PedPerPet);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPEDOBS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A658PedCod != Z658PedCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tpedobs:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
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
                  sMode76 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode76 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound76 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_8F0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PEDCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPedCod_Internalname ;
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
                        e118F2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e128F2 ();
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
         e128F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll8F76( ) ;
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
         disableAttributes8F76( ) ;
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

   public void confirm_8F0( )
   {
      beforeValidate8F76( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls8F76( ) ;
         }
         else
         {
            checkExtendedTable8F76( ) ;
            closeExtendedTableCursors8F76( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode76 = Gx_mode ;
         confirm_8F337( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode76 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode76 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_8F337( )
   {
      s2503PedObsUL = O2503PedObsUL ;
      n2503PedObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
      s5049PedConLin = O5049PedConLin ;
      n5049PedConLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow8F337( ) ;
         if ( ( nRcdExists_337 != 0 ) || ( nIsMod_337 != 0 ) )
         {
            getKey8F337( ) ;
            if ( ( nRcdExists_337 == 0 ) && ( nRcdDeleted_337 == 0 ) )
            {
               if ( RcdFound337 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate8F337( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable8F337( ) ;
                     closeExtendedTableCursors8F337( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2503PedObsUL = A2503PedObsUL ;
                     n2503PedObsUL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
                     O5049PedConLin = A5049PedConLin ;
                     n5049PedConLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "PEDOBSLIN_" + sGXsfl_51_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPedObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound337 != 0 )
               {
                  if ( nRcdDeleted_337 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey8F337( ) ;
                     load8F337( ) ;
                     beforeValidate8F337( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls8F337( ) ;
                        O2503PedObsUL = A2503PedObsUL ;
                        n2503PedObsUL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
                        O5049PedConLin = A5049PedConLin ;
                        n5049PedConLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_337 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate8F337( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable8F337( ) ;
                           closeExtendedTableCursors8F337( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2503PedObsUL = A2503PedObsUL ;
                           n2503PedObsUL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
                           O5049PedConLin = A5049PedConLin ;
                           n5049PedConLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_337 == 0 )
                  {
                     GXCCtl = "PEDOBSLIN_" + sGXsfl_51_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPedObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPedObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2501PedObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedObsTxt_Internalname, GXutil.rtrim( A2502PedObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z2501PedObsLin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z2501PedObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2502PedObsTxt_"+sGXsfl_51_idx, GXutil.rtrim( Z2502PedObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_337_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_337_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_337_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_337 != 0 )
         {
            httpContext.changePostValue( "PEDOBSLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDOBSTXT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2503PedObsUL = s2503PedObsUL ;
      n2503PedObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
      O5049PedConLin = s5049PedConLin ;
      n5049PedConLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption8F0( )
   {
   }

   public void e118F2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tpedobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV27EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpedobs_impl.this.AV27EmprCod = GXv_char2[0] ;
      tpedobs_impl.this.AV28EmprNom = GXv_char3[0] ;
      tpedobs_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprNom", AV28EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      AV29Max_lineas = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Max_lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Max_lineas), 2, 0));
      AV31PedObs = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31PedObs", GXutil.str( AV31PedObs, 1, 0));
      GXv_int5[0] = AV29Max_lineas ;
      new app.pbuscon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "PEDOBS", ""), GXv_int5) ;
      tpedobs_impl.this.AV29Max_lineas = (byte)((byte)(GXv_int5[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Max_lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Max_lineas), 2, 0));
      if ( AV29Max_lineas == 0 )
      {
         AV31PedObs = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31PedObs", GXutil.str( AV31PedObs, 1, 0));
         AV29Max_lineas = (byte)(99) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Max_lineas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Max_lineas), 2, 0));
      }
      AV30Msg_l = httpContext.getMessage( "Maximo de Lineas= ", "") + GXutil.str( AV29Max_lineas, 2, 0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Msg_l", AV30Msg_l);
      GXt_int6 = AV34Pertex ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "PERTEX", ""), GXv_int7) ;
      tpedobs_impl.this.GXt_int6 = GXv_int7[0] ;
      AV34Pertex = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pertex", GXutil.str( AV34Pertex, 1, 0));
      GXt_int6 = AV38tintutex ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int7) ;
      tpedobs_impl.this.GXt_int6 = GXv_int7[0] ;
      AV38tintutex = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38tintutex", GXutil.str( AV38tintutex, 1, 0));
      GXt_char1 = AV19Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tpedobs_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char4[0] = AV27EmprCod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char4, GXv_char3, GXv_char2) ;
      tpedobs_impl.this.AV27EmprCod = GXv_char4[0] ;
      tpedobs_impl.this.AV28EmprNom = GXv_char3[0] ;
      tpedobs_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprNom", AV28EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext8[0] = AV40WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV40WWPContext = GXv_SdtWWPContext8[0] ;
      divTablefooter_Height = 30 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablefooter_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablefooter_Height), 9, 0), true);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV41TrnContext.fromxml(AV42WebSession.getValue("TrnContext"), null, null);
   }

   public void e128F2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A658PedCod ;
      new app.ppedcum(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
      tpedobs_impl.this.A396EmprCod = GXv_char4[0] ;
      tpedobs_impl.this.A658PedCod = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A658PedCod ;
      new app.fechaentregalineaspedido(remoteHandle, context).execute( GXv_char4, GXv_int5) ;
      tpedobs_impl.this.A396EmprCod = GXv_char4[0] ;
      tpedobs_impl.this.A658PedCod = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV41TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tpedobsww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
   }

   public void zm8F76( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2503PedObsUL = T008F5_A2503PedObsUL[0] ;
            Z8154PedPerDes = T008F5_A8154PedPerDes[0] ;
            Z8155PedPerPet = T008F5_A8155PedPerPet[0] ;
            Z662PedFecEnt = T008F5_A662PedFecEnt[0] ;
            Z661PedFec = T008F5_A661PedFec[0] ;
         }
         else
         {
            Z2503PedObsUL = A2503PedObsUL ;
            Z8154PedPerDes = A8154PedPerDes ;
            Z8155PedPerPet = A8155PedPerPet ;
            Z662PedFecEnt = A662PedFecEnt ;
            Z661PedFec = A661PedFec ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z658PedCod = A658PedCod ;
         Z2503PedObsUL = A2503PedObsUL ;
         Z8154PedPerDes = A8154PedPerDes ;
         Z8155PedPerPet = A8155PedPerPet ;
         Z662PedFecEnt = A662PedFecEnt ;
         Z661PedFec = A661PedFec ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z5049PedConLin = A5049PedConLin ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV27EmprCod)==0) )
      {
         A396EmprCod = AV27EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T008F6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T008F6_A407EmprNom[0] ;
      n407EmprNom = T008F6_n407EmprNom[0] ;
      pr_default.close(4);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( httpContext.getMessage( "PERTEX", ""), ""), GXv_int7) ;
      tpedobs_impl.this.GXt_int6 = GXv_int7[0] ;
      divUnnamedtable2_Visible = (((GXt_int6==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      if ( ! (0==AV39PedCod) )
      {
         A658PedCod = AV39PedCod ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
      if ( ! (0==AV39PedCod) )
      {
         edtPedCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
      else
      {
         edtPedCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV39PedCod) )
      {
         edtPedCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
      if ( AV38tintutex == 1 )
      {
         edtPedFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFec_Enabled), 5, 0), true);
      }
      else
      {
         edtPedFec_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFec_Enabled), 5, 0), true);
      }
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
         /* Using cursor T008F8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(5) != 101) )
         {
            A5049PedConLin = T008F8_A5049PedConLin[0] ;
            n5049PedConLin = T008F8_n5049PedConLin[0] ;
         }
         else
         {
            A5049PedConLin = (byte)(0) ;
            n5049PedConLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         }
         O5049PedConLin = A5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         pr_default.close(5);
      }
   }

   public void load8F76( )
   {
      /* Using cursor T008F10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound76 = (short)(1) ;
         A2503PedObsUL = T008F10_A2503PedObsUL[0] ;
         n2503PedObsUL = T008F10_n2503PedObsUL[0] ;
         A407EmprNom = T008F10_A407EmprNom[0] ;
         n407EmprNom = T008F10_n407EmprNom[0] ;
         A8154PedPerDes = T008F10_A8154PedPerDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8154PedPerDes", A8154PedPerDes);
         A8155PedPerPet = T008F10_A8155PedPerPet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8155PedPerPet", A8155PedPerPet);
         A662PedFecEnt = T008F10_A662PedFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
         A661PedFec = T008F10_A661PedFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A5049PedConLin = T008F10_A5049PedConLin[0] ;
         n5049PedConLin = T008F10_n5049PedConLin[0] ;
         zm8F76( -14) ;
      }
      pr_default.close(6);
      onLoadActions8F76( ) ;
   }

   public void onLoadActions8F76( )
   {
      O5049PedConLin = A5049PedConLin ;
      n5049PedConLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
   }

   public void checkExtendedTable8F76( )
   {
      nIsDirty_76 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T008F8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A5049PedConLin = T008F8_A5049PedConLin[0] ;
         n5049PedConLin = T008F8_n5049PedConLin[0] ;
      }
      else
      {
         nIsDirty_76 = (short)(1) ;
         A5049PedConLin = (byte)(0) ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      }
      pr_default.close(5);
      if ( ( A5049PedConLin > AV29Max_lineas ) && ( AV29Max_lineas > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV30Msg_l, 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors8F76( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          int A658PedCod )
   {
      /* Using cursor T008F12 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A5049PedConLin = T008F12_A5049PedConLin[0] ;
         n5049PedConLin = T008F12_n5049PedConLin[0] ;
      }
      else
      {
         A5049PedConLin = (byte)(0) ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5049PedConLin, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey8F76( )
   {
      /* Using cursor T008F13 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound76 = (short)(1) ;
      }
      else
      {
         RcdFound76 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T008F5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm8F76( 14) ;
         RcdFound76 = (short)(1) ;
         A658PedCod = T008F5_A658PedCod[0] ;
         n658PedCod = T008F5_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A2503PedObsUL = T008F5_A2503PedObsUL[0] ;
         n2503PedObsUL = T008F5_n2503PedObsUL[0] ;
         A8154PedPerDes = T008F5_A8154PedPerDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8154PedPerDes", A8154PedPerDes);
         A8155PedPerPet = T008F5_A8155PedPerPet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8155PedPerPet", A8155PedPerPet);
         A662PedFecEnt = T008F5_A662PedFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
         A661PedFec = T008F5_A661PedFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A396EmprCod = T008F5_A396EmprCod[0] ;
         O2503PedObsUL = A2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z658PedCod = A658PedCod ;
         sMode76 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load8F76( ) ;
         if ( AnyError == 1 )
         {
            RcdFound76 = (short)(0) ;
            initializeNonKey8F76( ) ;
         }
         Gx_mode = sMode76 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound76 = (short)(0) ;
         initializeNonKey8F76( ) ;
         sMode76 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode76 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey8F76( ) ;
      if ( RcdFound76 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound76 = (short)(0) ;
      /* Using cursor T008F14 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T008F14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T008F14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008F14_A658PedCod[0] < A658PedCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T008F14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T008F14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008F14_A658PedCod[0] > A658PedCod ) ) )
         {
            A396EmprCod = T008F14_A396EmprCod[0] ;
            A658PedCod = T008F14_A658PedCod[0] ;
            n658PedCod = T008F14_n658PedCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            RcdFound76 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound76 = (short)(0) ;
      /* Using cursor T008F15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T008F15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T008F15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008F15_A658PedCod[0] > A658PedCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T008F15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T008F15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T008F15_A658PedCod[0] < A658PedCod ) ) )
         {
            A396EmprCod = T008F15_A396EmprCod[0] ;
            A658PedCod = T008F15_A658PedCod[0] ;
            n658PedCod = T008F15_n658PedCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            RcdFound76 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey8F76( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2503PedObsUL = O2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         A5049PedConLin = O5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         GX_FocusControl = edtPedCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert8F76( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound76 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A658PedCod = Z658PedCod ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PEDCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2503PedObsUL = O2503PedObsUL ;
               n2503PedObsUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
               A5049PedConLin = O5049PedConLin ;
               n5049PedConLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A2503PedObsUL = O2503PedObsUL ;
               n2503PedObsUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
               A5049PedConLin = O5049PedConLin ;
               n5049PedConLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
               update8F76( ) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) )
            {
               /* Insert record */
               A2503PedObsUL = O2503PedObsUL ;
               n2503PedObsUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
               A5049PedConLin = O5049PedConLin ;
               n5049PedConLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert8F76( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PEDCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPedCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A2503PedObsUL = O2503PedObsUL ;
                  n2503PedObsUL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
                  A5049PedConLin = O5049PedConLin ;
                  n5049PedConLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
                  GX_FocusControl = edtPedCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert8F76( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = Z658PedCod ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2503PedObsUL = O2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         A5049PedConLin = O5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPedCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency8F76( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T008F4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPEDID"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z2503PedObsUL != T008F4_A2503PedObsUL[0] ) || ( GXutil.strcmp(Z8154PedPerDes, T008F4_A8154PedPerDes[0]) != 0 ) || ( GXutil.strcmp(Z8155PedPerPet, T008F4_A8155PedPerPet[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z662PedFecEnt), GXutil.resetTime(T008F4_A662PedFecEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z661PedFec), GXutil.resetTime(T008F4_A661PedFec[0])) ) )
         {
            if ( Z2503PedObsUL != T008F4_A2503PedObsUL[0] )
            {
               GXutil.writeLogln("tpedobs:[seudo value changed for attri]"+"PedObsUL");
               GXutil.writeLogRaw("Old: ",Z2503PedObsUL);
               GXutil.writeLogRaw("Current: ",T008F4_A2503PedObsUL[0]);
            }
            if ( GXutil.strcmp(Z8154PedPerDes, T008F4_A8154PedPerDes[0]) != 0 )
            {
               GXutil.writeLogln("tpedobs:[seudo value changed for attri]"+"PedPerDes");
               GXutil.writeLogRaw("Old: ",Z8154PedPerDes);
               GXutil.writeLogRaw("Current: ",T008F4_A8154PedPerDes[0]);
            }
            if ( GXutil.strcmp(Z8155PedPerPet, T008F4_A8155PedPerPet[0]) != 0 )
            {
               GXutil.writeLogln("tpedobs:[seudo value changed for attri]"+"PedPerPet");
               GXutil.writeLogRaw("Old: ",Z8155PedPerPet);
               GXutil.writeLogRaw("Current: ",T008F4_A8155PedPerPet[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z662PedFecEnt), GXutil.resetTime(T008F4_A662PedFecEnt[0])) ) )
            {
               GXutil.writeLogln("tpedobs:[seudo value changed for attri]"+"PedFecEnt");
               GXutil.writeLogRaw("Old: ",Z662PedFecEnt);
               GXutil.writeLogRaw("Current: ",T008F4_A662PedFecEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z661PedFec), GXutil.resetTime(T008F4_A661PedFec[0])) ) )
            {
               GXutil.writeLogln("tpedobs:[seudo value changed for attri]"+"PedFec");
               GXutil.writeLogRaw("Old: ",Z661PedFec);
               GXutil.writeLogRaw("Current: ",T008F4_A661PedFec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPEDID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert8F76( )
   {
      beforeValidate8F76( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable8F76( ) ;
      }
      if ( AnyError == 0 )
      {
         zm8F76( 0) ;
         checkOptimisticConcurrency8F76( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm8F76( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert8F76( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008F16 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Boolean.valueOf(n2503PedObsUL), Byte.valueOf(A2503PedObsUL), A8154PedPerDes, A8155PedPerPet, A662PedFecEnt, A661PedFec, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
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
                        processLevel8F76( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption8F0( ) ;
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
            load8F76( ) ;
         }
         endLevel8F76( ) ;
      }
      closeExtendedTableCursors8F76( ) ;
   }

   public void update8F76( )
   {
      beforeValidate8F76( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable8F76( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency8F76( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm8F76( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate8F76( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008F17 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n2503PedObsUL), Byte.valueOf(A2503PedObsUL), A8154PedPerDes, A8155PedPerPet, A662PedFecEnt, A661PedFec, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPEDID"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate8F76( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel8F76( ) ;
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
         endLevel8F76( ) ;
      }
      closeExtendedTableCursors8F76( ) ;
   }

   public void deferredUpdate8F76( )
   {
   }

   public void delete( )
   {
      beforeValidate8F76( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency8F76( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls8F76( ) ;
         afterConfirm8F76( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete8F76( ) ;
            if ( AnyError == 0 )
            {
               A2503PedObsUL = O2503PedObsUL ;
               n2503PedObsUL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
               A5049PedConLin = O5049PedConLin ;
               n5049PedConLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
               scanStart8F337( ) ;
               while ( RcdFound337 != 0 )
               {
                  getByPrimaryKey8F337( ) ;
                  delete8F337( ) ;
                  scanNext8F337( ) ;
                  O2503PedObsUL = A2503PedObsUL ;
                  n2503PedObsUL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
                  O5049PedConLin = A5049PedConLin ;
                  n5049PedConLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
               }
               scanEnd8F337( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008F18 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
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
      sMode76 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel8F76( ) ;
      Gx_mode = sMode76 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls8F76( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T008F20 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            A5049PedConLin = T008F20_A5049PedConLin[0] ;
            n5049PedConLin = T008F20_n5049PedConLin[0] ;
         }
         else
         {
            A5049PedConLin = (byte)(0) ;
            n5049PedConLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         }
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T008F21 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Cabecera)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T008F22 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void processNestedLevel8F337( )
   {
      s2503PedObsUL = O2503PedObsUL ;
      n2503PedObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
      s5049PedConLin = O5049PedConLin ;
      n5049PedConLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow8F337( ) ;
         if ( ( nRcdExists_337 != 0 ) || ( nIsMod_337 != 0 ) )
         {
            standaloneNotModal8F337( ) ;
            getKey8F337( ) ;
            if ( ( nRcdExists_337 == 0 ) && ( nRcdDeleted_337 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert8F337( ) ;
            }
            else
            {
               if ( RcdFound337 != 0 )
               {
                  if ( ( nRcdDeleted_337 != 0 ) && ( nRcdExists_337 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete8F337( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_337 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update8F337( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_337 == 0 )
                  {
                     GXCCtl = "PEDOBSLIN_" + sGXsfl_51_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPedObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2503PedObsUL = A2503PedObsUL ;
            n2503PedObsUL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
            O5049PedConLin = A5049PedConLin ;
            n5049PedConLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         }
         httpContext.changePostValue( edtPedObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2501PedObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedObsTxt_Internalname, GXutil.rtrim( A2502PedObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z2501PedObsLin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z2501PedObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2502PedObsTxt_"+sGXsfl_51_idx, GXutil.rtrim( Z2502PedObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_337_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_337_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_337_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_337 != 0 )
         {
            httpContext.changePostValue( "PEDOBSLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDOBSTXT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll8F337( ) ;
      if ( AnyError != 0 )
      {
         O2503PedObsUL = s2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         O5049PedConLin = s5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      }
      nRcdExists_337 = (short)(0) ;
      nIsMod_337 = (short)(0) ;
      nRcdDeleted_337 = (short)(0) ;
   }

   public void processLevel8F76( )
   {
      /* Save parent mode. */
      sMode76 = Gx_mode ;
      processNestedLevel8F337( ) ;
      if ( AnyError != 0 )
      {
         O2503PedObsUL = s2503PedObsUL ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
         O5049PedConLin = s5049PedConLin ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode76 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T008F23 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n2503PedObsUL), Byte.valueOf(A2503PedObsUL), A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
   }

   public void endLevel8F76( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete8F76( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpedobs");
         if ( AnyError == 0 )
         {
            confirmValues8F0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedobs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart8F76( )
   {
      /* Scan By routine */
      /* Using cursor T008F24 */
      pr_default.execute(18);
      RcdFound76 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound76 = (short)(1) ;
         A396EmprCod = T008F24_A396EmprCod[0] ;
         A658PedCod = T008F24_A658PedCod[0] ;
         n658PedCod = T008F24_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext8F76( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound76 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound76 = (short)(1) ;
         A396EmprCod = T008F24_A396EmprCod[0] ;
         A658PedCod = T008F24_A658PedCod[0] ;
         n658PedCod = T008F24_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
   }

   public void scanEnd8F76( )
   {
      pr_default.close(18);
   }

   public void afterConfirm8F76( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert8F76( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate8F76( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete8F76( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete8F76( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate8F76( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes8F76( )
   {
      edtPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      edtPedFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFec_Enabled), 5, 0), true);
      edtPedFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFecEnt_Enabled), 5, 0), true);
      edtPedPerDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPerDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPerDes_Enabled), 5, 0), true);
      edtPedPerPet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPerPet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPerPet_Enabled), 5, 0), true);
   }

   public void zm8F337( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2502PedObsTxt = T008F3_A2502PedObsTxt[0] ;
         }
         else
         {
            Z2502PedObsTxt = A2502PedObsTxt ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z658PedCod = A658PedCod ;
         Z2501PedObsLin = A2501PedObsLin ;
         Z2502PedObsTxt = A2502PedObsTxt ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal8F337( )
   {
   }

   public void standaloneModal8F337( )
   {
      if ( isIns( )  )
      {
         A2503PedObsUL = (byte)(O2503PedObsUL+1) ;
         n2503PedObsUL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A2501PedObsLin = A2503PedObsUL ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPedObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         edtPedObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
   }

   public void load8F337( )
   {
      /* Using cursor T008F25 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Byte.valueOf(A2501PedObsLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound337 = (short)(1) ;
         A2502PedObsTxt = T008F25_A2502PedObsTxt[0] ;
         zm8F337( -17) ;
      }
      pr_default.close(19);
      onLoadActions8F337( ) ;
   }

   public void onLoadActions8F337( )
   {
      if ( isIns( )  )
      {
         A5049PedConLin = (byte)(O5049PedConLin+1) ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5049PedConLin = O5049PedConLin ;
            n5049PedConLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5049PedConLin = (byte)(O5049PedConLin-1) ;
               n5049PedConLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
            }
         }
      }
   }

   public void checkExtendedTable8F337( )
   {
      nIsDirty_337 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal8F337( ) ;
      if ( isIns( )  )
      {
         nIsDirty_337 = (short)(1) ;
         A5049PedConLin = (byte)(O5049PedConLin+1) ;
         n5049PedConLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_337 = (short)(1) ;
            A5049PedConLin = O5049PedConLin ;
            n5049PedConLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_337 = (short)(1) ;
               A5049PedConLin = (byte)(O5049PedConLin-1) ;
               n5049PedConLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
            }
         }
      }
      if ( ( A5049PedConLin > AV29Max_lineas ) && ( AV29Max_lineas > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV30Msg_l, 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors8F337( )
   {
   }

   public void enableDisable8F337( )
   {
   }

   public void getKey8F337( )
   {
      /* Using cursor T008F26 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Byte.valueOf(A2501PedObsLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound337 = (short)(1) ;
      }
      else
      {
         RcdFound337 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey8F337( )
   {
      /* Using cursor T008F3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Byte.valueOf(A2501PedObsLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm8F337( 17) ;
         RcdFound337 = (short)(1) ;
         initializeNonKey8F337( ) ;
         A2501PedObsLin = T008F3_A2501PedObsLin[0] ;
         A2502PedObsTxt = T008F3_A2502PedObsTxt[0] ;
         Z396EmprCod = A396EmprCod ;
         Z658PedCod = A658PedCod ;
         Z2501PedObsLin = A2501PedObsLin ;
         sMode337 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load8F337( ) ;
         Gx_mode = sMode337 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound337 = (short)(0) ;
         initializeNonKey8F337( ) ;
         sMode337 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal8F337( ) ;
         Gx_mode = sMode337 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes8F337( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency8F337( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T008F2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Byte.valueOf(A2501PedObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSPED"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z2502PedObsTxt, T008F2_A2502PedObsTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z2502PedObsTxt, T008F2_A2502PedObsTxt[0]) != 0 )
            {
               GXutil.writeLogln("tpedobs:[seudo value changed for attri]"+"PedObsTxt");
               GXutil.writeLogRaw("Old: ",Z2502PedObsTxt);
               GXutil.writeLogRaw("Current: ",T008F2_A2502PedObsTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSPED"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert8F337( )
   {
      beforeValidate8F337( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable8F337( ) ;
      }
      if ( AnyError == 0 )
      {
         zm8F337( 0) ;
         checkOptimisticConcurrency8F337( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm8F337( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert8F337( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T008F27 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Byte.valueOf(A2501PedObsLin), A2502PedObsTxt, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSPED");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load8F337( ) ;
         }
         endLevel8F337( ) ;
      }
      closeExtendedTableCursors8F337( ) ;
   }

   public void update8F337( )
   {
      beforeValidate8F337( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable8F337( ) ;
      }
      if ( ( nIsMod_337 != 0 ) || ( nIsDirty_337 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency8F337( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm8F337( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate8F337( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T008F28 */
                     pr_default.execute(22, new Object[] {A2502PedObsTxt, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Byte.valueOf(A2501PedObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSPED");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSPED"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate8F337( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey8F337( ) ;
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
            endLevel8F337( ) ;
         }
      }
      closeExtendedTableCursors8F337( ) ;
   }

   public void deferredUpdate8F337( )
   {
   }

   public void delete8F337( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate8F337( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency8F337( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls8F337( ) ;
         afterConfirm8F337( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete8F337( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T008F29 */
               pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), Byte.valueOf(A2501PedObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSPED");
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
      sMode337 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel8F337( ) ;
      Gx_mode = sMode337 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls8F337( )
   {
      standaloneModal8F337( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A5049PedConLin = (byte)(O5049PedConLin+1) ;
            n5049PedConLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5049PedConLin = O5049PedConLin ;
               n5049PedConLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5049PedConLin = (byte)(O5049PedConLin-1) ;
                  n5049PedConLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
               }
            }
         }
      }
   }

   public void endLevel8F337( )
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

   public void scanStart8F337( )
   {
      /* Scan By routine */
      /* Using cursor T008F30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      RcdFound337 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound337 = (short)(1) ;
         A2501PedObsLin = T008F30_A2501PedObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext8F337( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound337 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound337 = (short)(1) ;
         A2501PedObsLin = T008F30_A2501PedObsLin[0] ;
      }
   }

   public void scanEnd8F337( )
   {
      pr_default.close(24);
   }

   public void afterConfirm8F337( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert8F337( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate8F337( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete8F337( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete8F337( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate8F337( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes8F337( )
   {
      edtPedObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtPedObsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedObsTxt_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void send_integrity_lvl_hashes8F337( )
   {
   }

   public void send_integrity_lvl_hashes8F76( )
   {
   }

   public void subsflControlProps_51337( )
   {
      edtPedObsLin_Internalname = "PEDOBSLIN_"+sGXsfl_51_idx ;
      edtPedObsTxt_Internalname = "PEDOBSTXT_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_51337( )
   {
      edtPedObsLin_Internalname = "PEDOBSLIN_"+sGXsfl_51_fel_idx ;
      edtPedObsTxt_Internalname = "PEDOBSTXT_"+sGXsfl_51_fel_idx ;
   }

   public void addRow8F337( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51337( ) ;
      sendRow8F337( ) ;
   }

   public void sendRow8F337( )
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
         if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_337_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "WWActionColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2501PedObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2501PedObsLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedObsLin_Jsonclick,Integer.valueOf(0),"WWActionColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_337_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedObsTxt_Internalname,GXutil.rtrim( A2502PedObsTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedObsTxt_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedObsTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes8F337( ) ;
      GXCCtl = "Z2501PedObsLin_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2501PedObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2502PedObsTxt_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2502PedObsTxt));
      GXCCtl = "nRcdDeleted_337_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_337_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_337_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_337, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vMODE_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_51_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV41TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV41TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV27EmprCod));
      GXCCtl = "vPEDCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV39PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDOBSLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDOBSTXT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow8F337( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51337( ) ;
      edtPedObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDOBSLIN_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDOBSTXT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "PEDOBSLIN_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedObsLin_Internalname ;
         wbErr = true ;
         A2501PedObsLin = (byte)(0) ;
      }
      else
      {
         A2501PedObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtPedObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2502PedObsTxt = httpContext.cgiGet( edtPedObsTxt_Internalname) ;
      GXCCtl = "Z2501PedObsLin_" + sGXsfl_51_idx ;
      Z2501PedObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2502PedObsTxt_" + sGXsfl_51_idx ;
      Z2502PedObsTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_337_" + sGXsfl_51_idx ;
      nRcdDeleted_337 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_337_" + sGXsfl_51_idx ;
      nRcdExists_337 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_337_" + sGXsfl_51_idx ;
      nIsMod_337 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPedObsLin_Enabled = edtPedObsLin_Enabled ;
   }

   public void confirmValues8F0( )
   {
      nGXsfl_51_idx = 0 ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_51337( ) ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_51337( ) ;
         httpContext.changePostValue( "Z2501PedObsLin_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z2501PedObsLin_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2501PedObsLin_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z2502PedObsTxt_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z2502PedObsTxt_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2502PedObsTxt_"+sGXsfl_51_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tpedobs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39PedCod,8,0))}, new String[] {"Gx_mode","EmprCod","PedCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPEDOBS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpedobs:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2503PedObsUL", GXutil.ltrim( localUtil.ntoc( Z2503PedObsUL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8154PedPerDes", GXutil.rtrim( Z8154PedPerDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8155PedPerPet", GXutil.rtrim( Z8155PedPerPet));
      app.GxWebStd.gx_hidden_field( httpContext, "Z662PedFecEnt", localUtil.dtoc( Z662PedFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z661PedFec", localUtil.dtoc( Z661PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "O2503PedObsUL", GXutil.ltrim( localUtil.ntoc( O2503PedObsUL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5049PedConLin", GXutil.ltrim( localUtil.ntoc( O5049PedConLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nGXsfl_51_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N661PedFec", localUtil.dtoc( A661PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV41TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV41TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV41TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV27EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDCOD", GXutil.ltrim( localUtil.ntoc( AV39PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39PedCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTUTEX", GXutil.ltrim( localUtil.ntoc( AV38tintutex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCONLIN", GXutil.ltrim( localUtil.ntoc( A5049PedConLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAX_LINEAS", GXutil.ltrim( localUtil.ntoc( AV29Max_lineas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_L", GXutil.rtrim( AV30Msg_l));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDOBSUL", GXutil.ltrim( localUtil.ntoc( A2503PedObsUL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tpedobs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39PedCod,8,0))}, new String[] {"Gx_mode","EmprCod","PedCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPEDOBS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OBSERVACIONES", "") ;
   }

   public void initializeNonKey8F76( )
   {
      A2503PedObsUL = (byte)(0) ;
      n2503PedObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
      A5049PedConLin = (byte)(0) ;
      n5049PedConLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      A8154PedPerDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8154PedPerDes", A8154PedPerDes);
      A8155PedPerPet = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8155PedPerPet", A8155PedPerPet);
      A662PedFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
      A661PedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      O2503PedObsUL = A2503PedObsUL ;
      n2503PedObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
      O5049PedConLin = A5049PedConLin ;
      n5049PedConLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5049PedConLin), 2, 0));
      Z2503PedObsUL = (byte)(0) ;
      Z8154PedPerDes = "" ;
      Z8155PedPerPet = "" ;
      Z662PedFecEnt = GXutil.nullDate() ;
      Z661PedFec = GXutil.nullDate() ;
   }

   public void initAll8F76( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      initializeNonKey8F76( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey8F337( )
   {
      A2502PedObsTxt = "" ;
      Z2502PedObsTxt = "" ;
   }

   public void initAll8F337( )
   {
      A2501PedObsLin = (byte)(0) ;
      initializeNonKey8F337( ) ;
   }

   public void standaloneModalInsert8F337( )
   {
      A2503PedObsUL = i2503PedObsUL ;
      n2503PedObsUL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2503PedObsUL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2503PedObsUL), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211654497", true, true);
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
      httpContext.AddJavascriptSource("tpedobs.js", "?20268211654498", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties337( )
   {
      edtPedObsLin_Enabled = defedtPedObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void startgridcontrol51( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2501PedObsLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A2502PedObsTxt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPedCod_Internalname = "PEDCOD" ;
      edtPedFec_Internalname = "PEDFEC" ;
      edtPedFecEnt_Internalname = "PEDFECENT" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtPedPerDes_Internalname = "PEDPERDES" ;
      edtPedPerPet_Internalname = "PEDPERPET" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPedObsLin_Internalname = "PEDOBSLIN" ;
      edtPedObsTxt_Internalname = "PEDOBSTXT" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablefooter_Internalname = "TABLEFOOTER" ;
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
      Form.setCaption( httpContext.getMessage( "OBSERVACIONES", "") );
      edtPedObsTxt_Jsonclick = "" ;
      edtPedObsLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtPedObsTxt_Enabled = 1 ;
      edtPedObsLin_Enabled = 1 ;
      divTablefooter_Height = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPedPerPet_Jsonclick = "" ;
      edtPedPerPet_Enabled = 1 ;
      edtPedPerDes_Jsonclick = "" ;
      edtPedPerDes_Enabled = 1 ;
      divUnnamedtable2_Visible = 1 ;
      edtPedFecEnt_Jsonclick = "" ;
      edtPedFecEnt_Enabled = 1 ;
      edtPedFec_Jsonclick = "" ;
      edtPedFec_Enabled = 1 ;
      edtPedCod_Jsonclick = "" ;
      edtPedCod_Enabled = 1 ;
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
      subsflControlProps_51337( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal8F337( ) ;
         standaloneModal8F337( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow8F337( ) ;
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_51337( ) ;
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

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      n5049PedConLin = false ;
      /* Using cursor T008F20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A5049PedConLin = T008F20_A5049PedConLin[0] ;
         n5049PedConLin = T008F20_n5049PedConLin[0] ;
      }
      else
      {
         A5049PedConLin = (byte)(0) ;
         n5049PedConLin = false ;
      }
      pr_default.close(14);
      if ( ( A5049PedConLin > AV29Max_lineas ) && ( AV29Max_lineas > 0 ) )
      {
         httpContext.GX_msglist.addItem(AV30Msg_l, 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5049PedConLin", GXutil.ltrim( localUtil.ntoc( A5049PedConLin, (byte)(2), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV39PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV41TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV39PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e128F2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV41TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'AV30Msg_l',fld:'vMSG_L',pic:''},{av:'A5049PedConLin',fld:'PEDCONLIN',pic:'Z9'},{av:'AV29Max_lineas',fld:'vMAX_LINEAS',pic:'Z9'}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'A5049PedConLin',fld:'PEDCONLIN',pic:'Z9'}]}");
      setEventMetadata("VALID_PEDOBSLIN","{handler:'valid_Pedobslin',iparms:[]");
      setEventMetadata("VALID_PEDOBSLIN",",oparms:[]}");
      setEventMetadata("VALID_PEDOBSTXT","{handler:'valid_Pedobstxt',iparms:[]");
      setEventMetadata("VALID_PEDOBSTXT",",oparms:[]}");
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
      wcpOAV27EmprCod = "" ;
      Z396EmprCod = "" ;
      Z8154PedPerDes = "" ;
      Z8155PedPerPet = "" ;
      Z662PedFecEnt = GXutil.nullDate() ;
      Z661PedFec = GXutil.nullDate() ;
      N661PedFec = GXutil.nullDate() ;
      Z2502PedObsTxt = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV27EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      A8154PedPerDes = "" ;
      A8155PedPerPet = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode337 = "" ;
      sStyleString = "" ;
      AV30Msg_l = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode76 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A2502PedObsTxt = "" ;
      AV19Station = "" ;
      AV28EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV40WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV42WebSession = httpContext.getWebSession();
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      Z407EmprNom = "" ;
      T008F6_A407EmprNom = new String[] {""} ;
      T008F6_n407EmprNom = new boolean[] {false} ;
      GXv_int7 = new byte[1] ;
      T008F8_A5049PedConLin = new byte[1] ;
      T008F8_n5049PedConLin = new boolean[] {false} ;
      T008F10_A658PedCod = new int[1] ;
      T008F10_n658PedCod = new boolean[] {false} ;
      T008F10_A2503PedObsUL = new byte[1] ;
      T008F10_n2503PedObsUL = new boolean[] {false} ;
      T008F10_A407EmprNom = new String[] {""} ;
      T008F10_n407EmprNom = new boolean[] {false} ;
      T008F10_A8154PedPerDes = new String[] {""} ;
      T008F10_A8155PedPerPet = new String[] {""} ;
      T008F10_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T008F10_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T008F10_A396EmprCod = new String[] {""} ;
      T008F10_A5049PedConLin = new byte[1] ;
      T008F10_n5049PedConLin = new boolean[] {false} ;
      T008F12_A5049PedConLin = new byte[1] ;
      T008F12_n5049PedConLin = new boolean[] {false} ;
      T008F13_A396EmprCod = new String[] {""} ;
      T008F13_A658PedCod = new int[1] ;
      T008F13_n658PedCod = new boolean[] {false} ;
      T008F5_A658PedCod = new int[1] ;
      T008F5_n658PedCod = new boolean[] {false} ;
      T008F5_A2503PedObsUL = new byte[1] ;
      T008F5_n2503PedObsUL = new boolean[] {false} ;
      T008F5_A8154PedPerDes = new String[] {""} ;
      T008F5_A8155PedPerPet = new String[] {""} ;
      T008F5_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T008F5_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T008F5_A396EmprCod = new String[] {""} ;
      T008F14_A396EmprCod = new String[] {""} ;
      T008F14_A658PedCod = new int[1] ;
      T008F14_n658PedCod = new boolean[] {false} ;
      T008F15_A396EmprCod = new String[] {""} ;
      T008F15_A658PedCod = new int[1] ;
      T008F15_n658PedCod = new boolean[] {false} ;
      T008F4_A658PedCod = new int[1] ;
      T008F4_n658PedCod = new boolean[] {false} ;
      T008F4_A2503PedObsUL = new byte[1] ;
      T008F4_n2503PedObsUL = new boolean[] {false} ;
      T008F4_A8154PedPerDes = new String[] {""} ;
      T008F4_A8155PedPerPet = new String[] {""} ;
      T008F4_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T008F4_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T008F4_A396EmprCod = new String[] {""} ;
      T008F20_A5049PedConLin = new byte[1] ;
      T008F20_n5049PedConLin = new boolean[] {false} ;
      T008F21_A396EmprCod = new String[] {""} ;
      T008F21_A4850DevComCod = new int[1] ;
      T008F22_A396EmprCod = new String[] {""} ;
      T008F22_A658PedCod = new int[1] ;
      T008F22_n658PedCod = new boolean[] {false} ;
      T008F22_A719PrdNum = new String[] {""} ;
      T008F24_A396EmprCod = new String[] {""} ;
      T008F24_A658PedCod = new int[1] ;
      T008F24_n658PedCod = new boolean[] {false} ;
      T008F25_A658PedCod = new int[1] ;
      T008F25_n658PedCod = new boolean[] {false} ;
      T008F25_A2501PedObsLin = new byte[1] ;
      T008F25_A2502PedObsTxt = new String[] {""} ;
      T008F25_A396EmprCod = new String[] {""} ;
      T008F26_A396EmprCod = new String[] {""} ;
      T008F26_A658PedCod = new int[1] ;
      T008F26_n658PedCod = new boolean[] {false} ;
      T008F26_A2501PedObsLin = new byte[1] ;
      T008F3_A658PedCod = new int[1] ;
      T008F3_n658PedCod = new boolean[] {false} ;
      T008F3_A2501PedObsLin = new byte[1] ;
      T008F3_A2502PedObsTxt = new String[] {""} ;
      T008F3_A396EmprCod = new String[] {""} ;
      T008F2_A658PedCod = new int[1] ;
      T008F2_n658PedCod = new boolean[] {false} ;
      T008F2_A2501PedObsLin = new byte[1] ;
      T008F2_A2502PedObsTxt = new String[] {""} ;
      T008F2_A396EmprCod = new String[] {""} ;
      T008F30_A396EmprCod = new String[] {""} ;
      T008F30_A658PedCod = new int[1] ;
      T008F30_n658PedCod = new boolean[] {false} ;
      T008F30_A2501PedObsLin = new byte[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpedobs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpedobs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpedobs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpedobs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedobs__default(),
         new Object[] {
             new Object[] {
            T008F2_A658PedCod, T008F2_A2501PedObsLin, T008F2_A2502PedObsTxt, T008F2_A396EmprCod
            }
            , new Object[] {
            T008F3_A658PedCod, T008F3_A2501PedObsLin, T008F3_A2502PedObsTxt, T008F3_A396EmprCod
            }
            , new Object[] {
            T008F4_A658PedCod, T008F4_A2503PedObsUL, T008F4_n2503PedObsUL, T008F4_A8154PedPerDes, T008F4_A8155PedPerPet, T008F4_A662PedFecEnt, T008F4_A661PedFec, T008F4_A396EmprCod
            }
            , new Object[] {
            T008F5_A658PedCod, T008F5_A2503PedObsUL, T008F5_n2503PedObsUL, T008F5_A8154PedPerDes, T008F5_A8155PedPerPet, T008F5_A662PedFecEnt, T008F5_A661PedFec, T008F5_A396EmprCod
            }
            , new Object[] {
            T008F6_A407EmprNom, T008F6_n407EmprNom
            }
            , new Object[] {
            T008F8_A5049PedConLin, T008F8_n5049PedConLin
            }
            , new Object[] {
            T008F10_A658PedCod, T008F10_A2503PedObsUL, T008F10_n2503PedObsUL, T008F10_A407EmprNom, T008F10_n407EmprNom, T008F10_A8154PedPerDes, T008F10_A8155PedPerPet, T008F10_A662PedFecEnt, T008F10_A661PedFec, T008F10_A396EmprCod,
            T008F10_A5049PedConLin, T008F10_n5049PedConLin
            }
            , new Object[] {
            T008F12_A5049PedConLin, T008F12_n5049PedConLin
            }
            , new Object[] {
            T008F13_A396EmprCod, T008F13_A658PedCod
            }
            , new Object[] {
            T008F14_A396EmprCod, T008F14_A658PedCod
            }
            , new Object[] {
            T008F15_A396EmprCod, T008F15_A658PedCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T008F20_A5049PedConLin, T008F20_n5049PedConLin
            }
            , new Object[] {
            T008F21_A396EmprCod, T008F21_A4850DevComCod
            }
            , new Object[] {
            T008F22_A396EmprCod, T008F22_A658PedCod, T008F22_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            T008F24_A396EmprCod, T008F24_A658PedCod
            }
            , new Object[] {
            T008F25_A658PedCod, T008F25_A2501PedObsLin, T008F25_A2502PedObsTxt, T008F25_A396EmprCod
            }
            , new Object[] {
            T008F26_A396EmprCod, T008F26_A658PedCod, T008F26_A2501PedObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T008F30_A396EmprCod, T008F30_A658PedCod, T008F30_A2501PedObsLin
            }
         }
      );
   }

   private byte Z2503PedObsUL ;
   private byte O2503PedObsUL ;
   private byte O5049PedConLin ;
   private byte Z2501PedObsLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A2503PedObsUL ;
   private byte Gx_BScreen ;
   private byte B2503PedObsUL ;
   private byte B5049PedConLin ;
   private byte A5049PedConLin ;
   private byte AV38tintutex ;
   private byte AV29Max_lineas ;
   private byte s2503PedObsUL ;
   private byte s5049PedConLin ;
   private byte A2501PedObsLin ;
   private byte AV31PedObs ;
   private byte AV34Pertex ;
   private byte Z5049PedConLin ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i2503PedObsUL ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_337 ;
   private short nRcdExists_337 ;
   private short nIsMod_337 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount337 ;
   private short RcdFound337 ;
   private short nBlankRcdUsr337 ;
   private short RcdFound76 ;
   private short nIsDirty_76 ;
   private short nIsDirty_337 ;
   private int wcpOAV39PedCod ;
   private int Z658PedCod ;
   private int nRC_GXsfl_51 ;
   private int nGXsfl_51_idx=1 ;
   private int A658PedCod ;
   private int AV39PedCod ;
   private int trnEnded ;
   private int edtPedCod_Enabled ;
   private int edtPedFec_Enabled ;
   private int edtPedFecEnt_Enabled ;
   private int divUnnamedtable2_Visible ;
   private int edtPedPerDes_Enabled ;
   private int edtPedPerPet_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int divTablefooter_Height ;
   private int edtPedObsLin_Enabled ;
   private int edtPedObsTxt_Enabled ;
   private int fRowAdded ;
   private int GXv_int5[] ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtPedObsLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV27EmprCod ;
   private String Z396EmprCod ;
   private String Z8154PedPerDes ;
   private String Z8155PedPerPet ;
   private String Z2502PedObsTxt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV27EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPedCod_Internalname ;
   private String sGXsfl_51_idx="0001" ;
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
   private String TempTags ;
   private String edtPedCod_Jsonclick ;
   private String edtPedFec_Internalname ;
   private String edtPedFec_Jsonclick ;
   private String edtPedFecEnt_Internalname ;
   private String edtPedFecEnt_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtPedPerDes_Internalname ;
   private String A8154PedPerDes ;
   private String edtPedPerDes_Jsonclick ;
   private String edtPedPerPet_Internalname ;
   private String A8155PedPerPet ;
   private String edtPedPerPet_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divTablefooter_Internalname ;
   private String sMode337 ;
   private String edtPedObsLin_Internalname ;
   private String edtPedObsTxt_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV30Msg_l ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode76 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A2502PedObsTxt ;
   private String AV19Station ;
   private String AV28EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtPedObsLin_Jsonclick ;
   private String edtPedObsTxt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private java.util.Date Z662PedFecEnt ;
   private java.util.Date Z661PedFec ;
   private java.util.Date N661PedFec ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n658PedCod ;
   private boolean wbErr ;
   private boolean n2503PedObsUL ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n5049PedConLin ;
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV42WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T008F6_A407EmprNom ;
   private boolean[] T008F6_n407EmprNom ;
   private byte[] T008F8_A5049PedConLin ;
   private boolean[] T008F8_n5049PedConLin ;
   private int[] T008F10_A658PedCod ;
   private boolean[] T008F10_n658PedCod ;
   private byte[] T008F10_A2503PedObsUL ;
   private boolean[] T008F10_n2503PedObsUL ;
   private String[] T008F10_A407EmprNom ;
   private boolean[] T008F10_n407EmprNom ;
   private String[] T008F10_A8154PedPerDes ;
   private String[] T008F10_A8155PedPerPet ;
   private java.util.Date[] T008F10_A662PedFecEnt ;
   private java.util.Date[] T008F10_A661PedFec ;
   private String[] T008F10_A396EmprCod ;
   private byte[] T008F10_A5049PedConLin ;
   private boolean[] T008F10_n5049PedConLin ;
   private byte[] T008F12_A5049PedConLin ;
   private boolean[] T008F12_n5049PedConLin ;
   private String[] T008F13_A396EmprCod ;
   private int[] T008F13_A658PedCod ;
   private boolean[] T008F13_n658PedCod ;
   private int[] T008F5_A658PedCod ;
   private boolean[] T008F5_n658PedCod ;
   private byte[] T008F5_A2503PedObsUL ;
   private boolean[] T008F5_n2503PedObsUL ;
   private String[] T008F5_A8154PedPerDes ;
   private String[] T008F5_A8155PedPerPet ;
   private java.util.Date[] T008F5_A662PedFecEnt ;
   private java.util.Date[] T008F5_A661PedFec ;
   private String[] T008F5_A396EmprCod ;
   private String[] T008F14_A396EmprCod ;
   private int[] T008F14_A658PedCod ;
   private boolean[] T008F14_n658PedCod ;
   private String[] T008F15_A396EmprCod ;
   private int[] T008F15_A658PedCod ;
   private boolean[] T008F15_n658PedCod ;
   private int[] T008F4_A658PedCod ;
   private boolean[] T008F4_n658PedCod ;
   private byte[] T008F4_A2503PedObsUL ;
   private boolean[] T008F4_n2503PedObsUL ;
   private String[] T008F4_A8154PedPerDes ;
   private String[] T008F4_A8155PedPerPet ;
   private java.util.Date[] T008F4_A662PedFecEnt ;
   private java.util.Date[] T008F4_A661PedFec ;
   private String[] T008F4_A396EmprCod ;
   private byte[] T008F20_A5049PedConLin ;
   private boolean[] T008F20_n5049PedConLin ;
   private String[] T008F21_A396EmprCod ;
   private int[] T008F21_A4850DevComCod ;
   private String[] T008F22_A396EmprCod ;
   private int[] T008F22_A658PedCod ;
   private boolean[] T008F22_n658PedCod ;
   private String[] T008F22_A719PrdNum ;
   private String[] T008F24_A396EmprCod ;
   private int[] T008F24_A658PedCod ;
   private boolean[] T008F24_n658PedCod ;
   private int[] T008F25_A658PedCod ;
   private boolean[] T008F25_n658PedCod ;
   private byte[] T008F25_A2501PedObsLin ;
   private String[] T008F25_A2502PedObsTxt ;
   private String[] T008F25_A396EmprCod ;
   private String[] T008F26_A396EmprCod ;
   private int[] T008F26_A658PedCod ;
   private boolean[] T008F26_n658PedCod ;
   private byte[] T008F26_A2501PedObsLin ;
   private int[] T008F3_A658PedCod ;
   private boolean[] T008F3_n658PedCod ;
   private byte[] T008F3_A2501PedObsLin ;
   private String[] T008F3_A2502PedObsTxt ;
   private String[] T008F3_A396EmprCod ;
   private int[] T008F2_A658PedCod ;
   private boolean[] T008F2_n658PedCod ;
   private byte[] T008F2_A2501PedObsLin ;
   private String[] T008F2_A2502PedObsTxt ;
   private String[] T008F2_A396EmprCod ;
   private String[] T008F30_A396EmprCod ;
   private int[] T008F30_A658PedCod ;
   private boolean[] T008F30_n658PedCod ;
   private byte[] T008F30_A2501PedObsLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV40WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV41TrnContext ;
}

final  class tpedobs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedobs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedobs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedobs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T008F2", "SELECT PedCod, PedObsLin, PedObsTxt, EmprCod FROM TXPOBSPED WHERE EmprCod = ? AND PedCod = ? AND PedObsLin = ?  FOR UPDATE OF PedObsTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F3", "SELECT PedCod, PedObsLin, PedObsTxt, EmprCod FROM TXPOBSPED WHERE EmprCod = ? AND PedCod = ? AND PedObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F4", "SELECT PedCod, PedObsUL, PedPerDes, PedPerPet, PedFecEnt, PedFec, EmprCod FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ?  FOR UPDATE OF PedObsUL, PedPerDes, PedPerPet, PedFecEnt, PedFec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F5", "SELECT PedCod, PedObsUL, PedPerDes, PedPerPet, PedFecEnt, PedFec, EmprCod FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F8", "SELECT COALESCE( T1.PedConLin, 0) AS PedConLin FROM (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T1 WHERE T1.EmprCod = ? AND T1.PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F10", "SELECT /*+ FIRST_ROWS(100) */ TM1.PedCod, TM1.PedObsUL, T2.EmprNom, TM1.PedPerDes, TM1.PedPerPet, TM1.PedFecEnt, TM1.PedFec, TM1.EmprCod, COALESCE( T3.PedConLin, 0) AS PedConLin FROM ((TXPCPEDID TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.PedCod = TM1.PedCod) WHERE TM1.EmprCod = ? and TM1.PedCod = ? ORDER BY TM1.EmprCod, TM1.PedCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F12", "SELECT COALESCE( T1.PedConLin, 0) AS PedConLin FROM (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T1 WHERE T1.EmprCod = ? AND T1.PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedCod FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedCod FROM TXPCPEDID WHERE ( EmprCod > ? or EmprCod = ? and PedCod > ?) ORDER BY EmprCod, PedCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008F15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedCod FROM TXPCPEDID WHERE ( EmprCod < ? or EmprCod = ? and PedCod < ?) ORDER BY EmprCod DESC, PedCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T008F16", "INSERT INTO TXPCPEDID(PedCod, PedObsUL, PedPerDes, PedPerPet, PedFecEnt, PedFec, EmprCod, PrvNum, PedSit, PedPri, PedCDivCod, PedCodExt, PedEnv, PedPrvDPP, PedAlmc) VALUES(?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, ' ', 0, 0, 0)", GX_NOMASK, "TXPCPEDID")
         ,new UpdateCursor("T008F17", "UPDATE TXPCPEDID SET PedObsUL=?, PedPerDes=?, PedPerPet=?, PedFecEnt=?, PedFec=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK, "TXPCPEDID")
         ,new UpdateCursor("T008F18", "DELETE FROM TXPCPEDID  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK, "TXPCPEDID")
         ,new ForEachCursor("T008F20", "SELECT COALESCE( T1.PedConLin, 0) AS PedConLin FROM (SELECT COUNT(*) AS PedConLin, EmprCod, PedCod FROM TXPOBSPED GROUP BY EmprCod, PedCod ) T1 WHERE T1.EmprCod = ? AND T1.PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F21", "SELECT * FROM (SELECT EmprCod, DevComCod FROM TXPDEVCCO WHERE EmprCod = ? AND PedCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T008F22", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T008F23", "UPDATE TXPCPEDID SET PedObsUL=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK, "TXPCPEDID")
         ,new ForEachCursor("T008F24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PedCod FROM TXPCPEDID ORDER BY EmprCod, PedCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F25", "SELECT PedCod, PedObsLin, PedObsTxt, EmprCod FROM TXPOBSPED WHERE EmprCod = ? and PedCod = ? and PedObsLin = ? ORDER BY EmprCod, PedCod, PedObsLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T008F26", "SELECT EmprCod, PedCod, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? AND PedCod = ? AND PedObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T008F27", "INSERT INTO TXPOBSPED(PedCod, PedObsLin, PedObsTxt, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSPED")
         ,new UpdateCursor("T008F28", "UPDATE TXPOBSPED SET PedObsTxt=?  WHERE EmprCod = ? AND PedCod = ? AND PedObsLin = ?", GX_NOMASK, "TXPOBSPED")
         ,new UpdateCursor("T008F29", "DELETE FROM TXPOBSPED  WHERE EmprCod = ? AND PedCod = ? AND PedObsLin = ?", GX_NOMASK, "TXPOBSPED")
         ,new ForEachCursor("T008F30", "SELECT EmprCod, PedCod, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PedObsLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 24 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               stmt.setString(3, (String)parms[4], 30);
               stmt.setString(4, (String)parms[5], 30);
               stmt.setDate(5, (java.util.Date)parms[6]);
               stmt.setDate(6, (java.util.Date)parms[7]);
               stmt.setString(7, (String)parms[8], 3);
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
               stmt.setString(2, (String)parms[2], 30);
               stmt.setString(3, (String)parms[3], 30);
               stmt.setDate(4, (java.util.Date)parms[4]);
               stmt.setDate(5, (java.util.Date)parms[5]);
               stmt.setString(6, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               stmt.setString(3, (String)parms[3], 60);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

