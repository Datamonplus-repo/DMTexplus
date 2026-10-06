package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmtarea_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TMCOD") == 0 )
      {
         AV13TMCod = (int)(GXutil.lval( httpContext.GetPar( "TMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TMCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13TMCod), "ZZZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatmcod13Y1242( AV13TMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"TMCOD") == 0 )
      {
         AV15NumManual = (byte)(GXutil.lval( httpContext.GetPar( "NumManual"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15NumManual", GXutil.str( AV15NumManual, 1, 0));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asatmcod13Y1242( AV15NumManual, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9525TMRepCod = (int)(GXutil.lval( httpContext.GetPar( "TMRepCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A9525TMRepCod) ;
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
            AV16EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
            AV13TMCod = (int)(GXutil.lval( httpContext.GetPar( "TMCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13TMCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13TMCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tareas de Mantenimiento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTMCod_Internalname ;
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
      nRC_GXsfl_42 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_42"))) ;
      nGXsfl_42_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_42_idx"))) ;
      sGXsfl_42_idx = httpContext.GetPar( "sGXsfl_42_idx") ;
      edtTMRepCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMRepCod_Internalname, "Horizontalalignment", edtTMRepCod_Horizontalalignment, !bGXsfl_42_Refreshing);
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

   public tmtarea_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmtarea_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmtarea_impl.class ));
   }

   public tmtarea_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTMCod_Internalname, httpContext.getMessage( "Cod. Tarea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9430TMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMTarea.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTMDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTMDsc_Internalname, httpContext.getMessage( "Tarea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTMDsc_Internalname, GXutil.rtrim( A9431TMDsc), GXutil.rtrim( localUtil.format( A9431TMDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTMDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTMDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMTarea.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTMTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTMTxt_Internalname, httpContext.getMessage( "Texto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtTMTxt_Internalname, A9432TMTxt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", (short)(0), 1, edtTMTxt_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TMTarea.htm");
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
      ucDvpanel_tableleaflevel_level1.setProperty("Width", Dvpanel_tableleaflevel_level1_Width);
      ucDvpanel_tableleaflevel_level1.setProperty("AutoWidth", Dvpanel_tableleaflevel_level1_Autowidth);
      ucDvpanel_tableleaflevel_level1.setProperty("AutoHeight", Dvpanel_tableleaflevel_level1_Autoheight);
      ucDvpanel_tableleaflevel_level1.setProperty("Cls", Dvpanel_tableleaflevel_level1_Cls);
      ucDvpanel_tableleaflevel_level1.setProperty("Title", Dvpanel_tableleaflevel_level1_Title);
      ucDvpanel_tableleaflevel_level1.setProperty("Collapsible", Dvpanel_tableleaflevel_level1_Collapsible);
      ucDvpanel_tableleaflevel_level1.setProperty("Collapsed", Dvpanel_tableleaflevel_level1_Collapsed);
      ucDvpanel_tableleaflevel_level1.setProperty("ShowCollapseIcon", Dvpanel_tableleaflevel_level1_Showcollapseicon);
      ucDvpanel_tableleaflevel_level1.setProperty("IconPosition", Dvpanel_tableleaflevel_level1_Iconposition);
      ucDvpanel_tableleaflevel_level1.setProperty("AutoScroll", Dvpanel_tableleaflevel_level1_Autoscroll);
      ucDvpanel_tableleaflevel_level1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableleaflevel_level1_Internalname, "DVPANEL_TABLELEAFLEVEL_LEVEL1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLELEAFLEVEL_LEVEL1Container"+"TableLeafLevel_Level1"+"\" style=\"display:none;\">") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMTarea.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMTarea.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMTarea.htm");
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
      ucCombo_tmrepcod.setProperty("Caption", Combo_tmrepcod_Caption);
      ucCombo_tmrepcod.setProperty("Cls", Combo_tmrepcod_Cls);
      ucCombo_tmrepcod.setProperty("IsGridItem", Combo_tmrepcod_Isgriditem);
      ucCombo_tmrepcod.setProperty("EmptyItem", Combo_tmrepcod_Emptyitem);
      ucCombo_tmrepcod.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
      ucCombo_tmrepcod.setProperty("DropDownOptionsData", AV22TMRepCod_Data);
      ucCombo_tmrepcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tmrepcod_Internalname, "COMBO_TMREPCODContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMTarea.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMTarea.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTMCDsc_Internalname, A13749TMCDsc, GXutil.rtrim( localUtil.format( A13749TMCDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTMCDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtTMCDsc_Visible, edtTMCDsc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMTarea.htm");
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
         nBlankRcdCount1243 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1243 = (short)(1) ;
            scanStart13Y1243( ) ;
            while ( RcdFound1243 != 0 )
            {
               init_level_properties1243( ) ;
               getByPrimaryKey13Y1243( ) ;
               addRow13Y1243( ) ;
               scanNext13Y1243( ) ;
            }
            scanEnd13Y1243( ) ;
            nBlankRcdCount1243 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13Y1243( ) ;
         standaloneModal13Y1243( ) ;
         sMode1243 = Gx_mode ;
         while ( nGXsfl_42_idx < nRC_GXsfl_42 )
         {
            bGXsfl_42_Refreshing = true ;
            readRow13Y1243( ) ;
            edtTMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMREPCOD_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtTMRepCod_Horizontalalignment = httpContext.cgiGet( "TMREPCOD_"+sGXsfl_42_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMRepCod_Internalname, "Horizontalalignment", edtTMRepCod_Horizontalalignment, !bGXsfl_42_Refreshing);
            edtTMRepCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMREPCNT_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMRepCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepCnt_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            edtTMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMREPNOM_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepNom_Enabled), 5, 0), !bGXsfl_42_Refreshing);
            if ( ( nRcdExists_1243 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13Y1243( ) ;
            }
            sendRow13Y1243( ) ;
            bGXsfl_42_Refreshing = false ;
         }
         Gx_mode = sMode1243 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1243 = (short)(5) ;
         nRcdExists_1243 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13Y1243( ) ;
            while ( RcdFound1243 != 0 )
            {
               sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_421243( ) ;
               init_level_properties1243( ) ;
               standaloneNotModal13Y1243( ) ;
               getByPrimaryKey13Y1243( ) ;
               standaloneModal13Y1243( ) ;
               addRow13Y1243( ) ;
               scanNext13Y1243( ) ;
            }
            scanEnd13Y1243( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1243 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_421243( ) ;
         initAll13Y1243( ) ;
         init_level_properties1243( ) ;
         nRcdExists_1243 = (short)(0) ;
         nIsMod_1243 = (short)(0) ;
         nRcdDeleted_1243 = (short)(0) ;
         nBlankRcdCount1243 = (short)(nBlankRcdUsr1243+nBlankRcdCount1243) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1243 > 0 )
         {
            standaloneNotModal13Y1243( ) ;
            standaloneModal13Y1243( ) ;
            addRow13Y1243( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTMRepCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1243 = (short)(nBlankRcdCount1243-1) ;
         }
         Gx_mode = sMode1243 ;
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
      e1113Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTMREPCOD_DATA"), AV22TMRepCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9430TMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9431TMDsc = httpContext.cgiGet( "Z9431TMDsc") ;
            Z9432TMTxt = httpContext.cgiGet( "Z9432TMTxt") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_42 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_42"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( "N9430TMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV13TMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vTMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15NumManual = (byte)(localUtil.ctol( httpContext.cgiGet( "vNUMMANUAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_tableleaflevel_level1_Objectcall = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Objectcall") ;
            Dvpanel_tableleaflevel_level1_Class = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Class") ;
            Dvpanel_tableleaflevel_level1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Enabled")) ;
            Dvpanel_tableleaflevel_level1_Width = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Width") ;
            Dvpanel_tableleaflevel_level1_Height = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Height") ;
            Dvpanel_tableleaflevel_level1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Autowidth")) ;
            Dvpanel_tableleaflevel_level1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Autoheight")) ;
            Dvpanel_tableleaflevel_level1_Cls = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Cls") ;
            Dvpanel_tableleaflevel_level1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Showheader")) ;
            Dvpanel_tableleaflevel_level1_Title = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Title") ;
            Dvpanel_tableleaflevel_level1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Collapsible")) ;
            Dvpanel_tableleaflevel_level1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Collapsed")) ;
            Dvpanel_tableleaflevel_level1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Showcollapseicon")) ;
            Dvpanel_tableleaflevel_level1_Iconposition = httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Iconposition") ;
            Dvpanel_tableleaflevel_level1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Autoscroll")) ;
            Dvpanel_tableleaflevel_level1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Visible")) ;
            Dvpanel_tableleaflevel_level1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLELEAFLEVEL_LEVEL1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tmrepcod_Objectcall = httpContext.cgiGet( "COMBO_TMREPCOD_Objectcall") ;
            Combo_tmrepcod_Class = httpContext.cgiGet( "COMBO_TMREPCOD_Class") ;
            Combo_tmrepcod_Icontype = httpContext.cgiGet( "COMBO_TMREPCOD_Icontype") ;
            Combo_tmrepcod_Icon = httpContext.cgiGet( "COMBO_TMREPCOD_Icon") ;
            Combo_tmrepcod_Caption = httpContext.cgiGet( "COMBO_TMREPCOD_Caption") ;
            Combo_tmrepcod_Tooltip = httpContext.cgiGet( "COMBO_TMREPCOD_Tooltip") ;
            Combo_tmrepcod_Cls = httpContext.cgiGet( "COMBO_TMREPCOD_Cls") ;
            Combo_tmrepcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TMREPCOD_Selectedvalue_set") ;
            Combo_tmrepcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TMREPCOD_Selectedvalue_get") ;
            Combo_tmrepcod_Selectedtext_set = httpContext.cgiGet( "COMBO_TMREPCOD_Selectedtext_set") ;
            Combo_tmrepcod_Selectedtext_get = httpContext.cgiGet( "COMBO_TMREPCOD_Selectedtext_get") ;
            Combo_tmrepcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TMREPCOD_Gamoauthtoken") ;
            Combo_tmrepcod_Ddointernalname = httpContext.cgiGet( "COMBO_TMREPCOD_Ddointernalname") ;
            Combo_tmrepcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TMREPCOD_Titlecontrolalign") ;
            Combo_tmrepcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TMREPCOD_Dropdownoptionstype") ;
            Combo_tmrepcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Enabled")) ;
            Combo_tmrepcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Visible")) ;
            Combo_tmrepcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TMREPCOD_Titlecontrolidtoreplace") ;
            Combo_tmrepcod_Datalisttype = httpContext.cgiGet( "COMBO_TMREPCOD_Datalisttype") ;
            Combo_tmrepcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Allowmultipleselection")) ;
            Combo_tmrepcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TMREPCOD_Datalistfixedvalues") ;
            Combo_tmrepcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Isgriditem")) ;
            Combo_tmrepcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Hasdescription")) ;
            Combo_tmrepcod_Datalistproc = httpContext.cgiGet( "COMBO_TMREPCOD_Datalistproc") ;
            Combo_tmrepcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TMREPCOD_Datalistprocparametersprefix") ;
            Combo_tmrepcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TMREPCOD_Remoteservicesparameters") ;
            Combo_tmrepcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TMREPCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tmrepcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Includeonlyselectedoption")) ;
            Combo_tmrepcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Includeselectalloption")) ;
            Combo_tmrepcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Emptyitem")) ;
            Combo_tmrepcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TMREPCOD_Includeaddnewoption")) ;
            Combo_tmrepcod_Htmltemplate = httpContext.cgiGet( "COMBO_TMREPCOD_Htmltemplate") ;
            Combo_tmrepcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TMREPCOD_Multiplevaluestype") ;
            Combo_tmrepcod_Loadingdata = httpContext.cgiGet( "COMBO_TMREPCOD_Loadingdata") ;
            Combo_tmrepcod_Noresultsfound = httpContext.cgiGet( "COMBO_TMREPCOD_Noresultsfound") ;
            Combo_tmrepcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TMREPCOD_Emptyitemtext") ;
            Combo_tmrepcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TMREPCOD_Onlyselectedvalues") ;
            Combo_tmrepcod_Selectalltext = httpContext.cgiGet( "COMBO_TMREPCOD_Selectalltext") ;
            Combo_tmrepcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TMREPCOD_Multiplevaluesseparator") ;
            Combo_tmrepcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TMREPCOD_Addnewoptiontext") ;
            Combo_tmrepcod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TMREPCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9430TMCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
            }
            else
            {
               A9430TMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtTMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
            }
            A9431TMDsc = httpContext.cgiGet( edtTMDsc_Internalname) ;
            n9431TMDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9431TMDsc", A9431TMDsc);
            A9432TMTxt = httpContext.cgiGet( edtTMTxt_Internalname) ;
            n9432TMTxt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9432TMTxt", A9432TMTxt);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A13749TMCDsc = httpContext.cgiGet( edtTMCDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13749TMCDsc", A13749TMCDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMTarea");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9430TMCod != Z9430TMCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmtarea:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A9430TMCod = (int)(GXutil.lval( httpContext.GetPar( "TMCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV13TMCod) )
               {
                  A9430TMCod = AV13TMCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A9430TMCod = AV13TMCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
                  }
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode1242 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV13TMCod) )
                  {
                     A9430TMCod = AV13TMCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A9430TMCod = AV13TMCod ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
                     }
                  }
                  Gx_mode = sMode1242 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1242 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13Y0( ) ;
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
                        e1113Y2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213Y2 ();
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
         e1213Y2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13Y1242( ) ;
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
         disableAttributes13Y1242( ) ;
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

   public void confirm_13Y0( )
   {
      beforeValidate13Y1242( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13Y1242( ) ;
         }
         else
         {
            checkExtendedTable13Y1242( ) ;
            closeExtendedTableCursors13Y1242( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1242 = Gx_mode ;
         confirm_13Y1243( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1242 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1242 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_13Y1243( )
   {
      nGXsfl_42_idx = 0 ;
      while ( nGXsfl_42_idx < nRC_GXsfl_42 )
      {
         readRow13Y1243( ) ;
         if ( ( nRcdExists_1243 != 0 ) || ( nIsMod_1243 != 0 ) )
         {
            getKey13Y1243( ) ;
            if ( ( nRcdExists_1243 == 0 ) && ( nRcdDeleted_1243 == 0 ) )
            {
               if ( RcdFound1243 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13Y1243( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13Y1243( ) ;
                     closeExtendedTableCursors13Y1243( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TMREPCOD_" + sGXsfl_42_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTMRepCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1243 != 0 )
               {
                  if ( nRcdDeleted_1243 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13Y1243( ) ;
                     load13Y1243( ) ;
                     beforeValidate13Y1243( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13Y1243( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1243 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13Y1243( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13Y1243( ) ;
                           closeExtendedTableCursors13Y1243( ) ;
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
                  if ( nRcdDeleted_1243 == 0 )
                  {
                     GXCCtl = "TMREPCOD_" + sGXsfl_42_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9525TMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMRepCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9527TMRepCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMRepNom_Internalname, GXutil.rtrim( A9526TMRepNom)) ;
         httpContext.changePostValue( "ZT_"+"Z9525TMRepCod_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( Z9525TMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9527TMRepCnt_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( Z9527TMRepCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1243_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1243_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1243_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1243 != 0 )
         {
            httpContext.changePostValue( "TMREPCOD_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMREPCOD_"+sGXsfl_42_idx+"Horizontalalignment", GXutil.rtrim( edtTMRepCod_Horizontalalignment)) ;
            httpContext.changePostValue( "TMREPCNT_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMREPNOM_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption13Y0( )
   {
   }

   public void e1113Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmtarea_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV25Pgmname, (byte)(99), GXv_char2) ;
      tmtarea_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmtarea_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmtarea_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV20ObtenerEmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmtarea_impl.this.AV20ObtenerEmprCod = GXv_char2[0] ;
      tmtarea_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmtarea_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ObtenerEmprCod", AV20ObtenerEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_int5 = AV15NumManual ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV16EmprCod, httpContext.getMessage( "TARMAN", ""), GXv_int6) ;
      tmtarea_impl.this.GXt_int5 = GXv_int6[0] ;
      AV15NumManual = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15NumManual", GXutil.str( AV15NumManual, 1, 0));
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmtarea_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV16EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmtarea_impl.this.AV16EmprCod = GXv_char4[0] ;
      tmtarea_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmtarea_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext7[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV17WWPContext = GXv_SdtWWPContext7[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      Combo_tmrepcod_Titlecontrolidtoreplace = edtTMRepCod_Internalname ;
      ucCombo_tmrepcod.sendProperty(context, "", false, Combo_tmrepcod_Internalname, "TitleControlIdToReplace", Combo_tmrepcod_Titlecontrolidtoreplace);
      edtTMRepCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMRepCod_Internalname, "Horizontalalignment", edtTMRepCod_Horizontalalignment, !bGXsfl_42_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOTMREPCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV18TrnContext.fromxml(AV19WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtTMCDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCDsc_Visible), 5, 0), true);
   }

   public void e1213Y2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV18TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tmtareaww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOTMREPCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV22TMRepCod_Data ;
      GXv_char4[0] = AV23ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.tmtarealoaddvcombo(remoteHandle, context).execute( "TMRepCod", Gx_mode, AV16EmprCod, AV13TMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tmtarea_impl.this.AV23ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV22TMRepCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   }

   public void zm13Y1242( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9431TMDsc = T013Y6_A9431TMDsc[0] ;
            Z9432TMTxt = T013Y6_A9432TMTxt[0] ;
         }
         else
         {
            Z9431TMDsc = A9431TMDsc ;
            Z9432TMTxt = A9432TMTxt ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z9430TMCod = A9430TMCod ;
         Z9431TMDsc = A9431TMDsc ;
         Z9432TMTxt = A9432TMTxt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV25Pgmname = "TMTarea" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Pgmname", AV25Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV16EmprCod)==0) )
      {
         A396EmprCod = AV16EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV16EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV16EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13TMCod) )
      {
         edtTMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13TMCod) )
      {
         edtTMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( AV15NumManual == 0 )
         {
            edtTMCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), true);
         }
         else
         {
            edtTMCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), true);
         }
      }
   }

   public void standaloneModal( )
   {
      if ( ! (0==AV13TMCod) )
      {
         A9430TMCod = AV13TMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9430TMCod = AV13TMCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
         }
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
         /* Using cursor T013Y7 */
         pr_default.execute(5, new Object[] {A396EmprCod});
         A407EmprNom = T013Y7_A407EmprNom[0] ;
         n407EmprNom = T013Y7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(5);
      }
   }

   public void load13Y1242( )
   {
      /* Using cursor T013Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1242 = (short)(1) ;
         A407EmprNom = T013Y8_A407EmprNom[0] ;
         n407EmprNom = T013Y8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9431TMDsc = T013Y8_A9431TMDsc[0] ;
         n9431TMDsc = T013Y8_n9431TMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9431TMDsc", A9431TMDsc);
         A9432TMTxt = T013Y8_A9432TMTxt[0] ;
         n9432TMTxt = T013Y8_n9432TMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9432TMTxt", A9432TMTxt);
         zm13Y1242( -13) ;
      }
      pr_default.close(6);
      onLoadActions13Y1242( ) ;
   }

   public void onLoadActions13Y1242( )
   {
      A13749TMCDsc = GXutil.trim( GXutil.str( A9430TMCod, 8, 0)) + " - " + GXutil.trim( A9431TMDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13749TMCDsc", A13749TMCDsc);
   }

   public void checkExtendedTable13Y1242( )
   {
      nIsDirty_1242 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T013Y7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013Y7_A407EmprNom[0] ;
      n407EmprNom = T013Y7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      nIsDirty_1242 = (short)(1) ;
      A13749TMCDsc = GXutil.trim( GXutil.str( A9430TMCod, 8, 0)) + " - " + GXutil.trim( A9431TMDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13749TMCDsc", A13749TMCDsc);
      if ( (GXutil.strcmp("", A9431TMDsc)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pendiente Descripción", ""), 1, "TMDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors13Y1242( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A396EmprCod )
   {
      /* Using cursor T013Y9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013Y9_A407EmprNom[0] ;
      n407EmprNom = T013Y9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey13Y1242( )
   {
      /* Using cursor T013Y10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1242 = (short)(1) ;
      }
      else
      {
         RcdFound1242 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013Y6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm13Y1242( 13) ;
         RcdFound1242 = (short)(1) ;
         A9430TMCod = T013Y6_A9430TMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
         A9431TMDsc = T013Y6_A9431TMDsc[0] ;
         n9431TMDsc = T013Y6_n9431TMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9431TMDsc", A9431TMDsc);
         A9432TMTxt = T013Y6_A9432TMTxt[0] ;
         n9432TMTxt = T013Y6_n9432TMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9432TMTxt", A9432TMTxt);
         A396EmprCod = T013Y6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z9430TMCod = A9430TMCod ;
         sMode1242 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13Y1242( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1242 = (short)(0) ;
            initializeNonKey13Y1242( ) ;
         }
         Gx_mode = sMode1242 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1242 = (short)(0) ;
         initializeNonKey13Y1242( ) ;
         sMode1242 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1242 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey13Y1242( ) ;
      if ( RcdFound1242 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1242 = (short)(0) ;
      /* Using cursor T013Y11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T013Y11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013Y11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013Y11_A9430TMCod[0] < A9430TMCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T013Y11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013Y11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013Y11_A9430TMCod[0] > A9430TMCod ) ) )
         {
            A396EmprCod = T013Y11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9430TMCod = T013Y11_A9430TMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
            RcdFound1242 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1242 = (short)(0) ;
      /* Using cursor T013Y12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9430TMCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T013Y12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013Y12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013Y12_A9430TMCod[0] > A9430TMCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T013Y12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013Y12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013Y12_A9430TMCod[0] < A9430TMCod ) ) )
         {
            A396EmprCod = T013Y12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9430TMCod = T013Y12_A9430TMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
            RcdFound1242 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13Y1242( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13Y1242( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1242 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9430TMCod != Z9430TMCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9430TMCod = Z9430TMCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update13Y1242( ) ;
               GX_FocusControl = edtTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9430TMCod != Z9430TMCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtTMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13Y1242( ) ;
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
                  GX_FocusControl = edtTMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13Y1242( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9430TMCod != Z9430TMCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9430TMCod = Z9430TMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency13Y1242( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013Y5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMTAREA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z9431TMDsc, T013Y5_A9431TMDsc[0]) != 0 ) || ( GXutil.strcmp(Z9432TMTxt, T013Y5_A9432TMTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9431TMDsc, T013Y5_A9431TMDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmtarea:[seudo value changed for attri]"+"TMDsc");
               GXutil.writeLogRaw("Old: ",Z9431TMDsc);
               GXutil.writeLogRaw("Current: ",T013Y5_A9431TMDsc[0]);
            }
            if ( GXutil.strcmp(Z9432TMTxt, T013Y5_A9432TMTxt[0]) != 0 )
            {
               GXutil.writeLogln("tmtarea:[seudo value changed for attri]"+"TMTxt");
               GXutil.writeLogRaw("Old: ",Z9432TMTxt);
               GXutil.writeLogRaw("Current: ",T013Y5_A9432TMTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMTAREA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13Y1242( )
   {
      beforeValidate13Y1242( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13Y1242( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13Y1242( 0) ;
         checkOptimisticConcurrency13Y1242( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13Y1242( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13Y1242( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013Y13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A9430TMCod), Boolean.valueOf(n9431TMDsc), A9431TMDsc, Boolean.valueOf(n9432TMTxt), A9432TMTxt, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTAREA");
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
                        processLevel13Y1242( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption13Y0( ) ;
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
            load13Y1242( ) ;
         }
         endLevel13Y1242( ) ;
      }
      closeExtendedTableCursors13Y1242( ) ;
   }

   public void update13Y1242( )
   {
      beforeValidate13Y1242( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13Y1242( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13Y1242( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13Y1242( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13Y1242( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013Y14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n9431TMDsc), A9431TMDsc, Boolean.valueOf(n9432TMTxt), A9432TMTxt, A396EmprCod, Integer.valueOf(A9430TMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTAREA");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMTAREA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13Y1242( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13Y1242( ) ;
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
         endLevel13Y1242( ) ;
      }
      closeExtendedTableCursors13Y1242( ) ;
   }

   public void deferredUpdate13Y1242( )
   {
   }

   public void delete( )
   {
      beforeValidate13Y1242( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13Y1242( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13Y1242( ) ;
         afterConfirm13Y1242( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13Y1242( ) ;
            if ( AnyError == 0 )
            {
               scanStart13Y1243( ) ;
               while ( RcdFound1243 != 0 )
               {
                  getByPrimaryKey13Y1243( ) ;
                  delete13Y1243( ) ;
                  scanNext13Y1243( ) ;
               }
               scanEnd13Y1243( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013Y15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTAREA");
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
      sMode1242 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13Y1242( ) ;
      Gx_mode = sMode1242 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13Y1242( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013Y16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T013Y16_A407EmprNom[0] ;
         n407EmprNom = T013Y16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
         A13749TMCDsc = GXutil.trim( GXutil.str( A9430TMCod, 8, 0)) + " - " + GXutil.trim( A9431TMDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13749TMCDsc", A13749TMCDsc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013Y17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T013Y18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T013Y19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CODPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel13Y1243( )
   {
      nGXsfl_42_idx = 0 ;
      while ( nGXsfl_42_idx < nRC_GXsfl_42 )
      {
         readRow13Y1243( ) ;
         if ( ( nRcdExists_1243 != 0 ) || ( nIsMod_1243 != 0 ) )
         {
            standaloneNotModal13Y1243( ) ;
            getKey13Y1243( ) ;
            if ( ( nRcdExists_1243 == 0 ) && ( nRcdDeleted_1243 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13Y1243( ) ;
            }
            else
            {
               if ( RcdFound1243 != 0 )
               {
                  if ( ( nRcdDeleted_1243 != 0 ) && ( nRcdExists_1243 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13Y1243( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1243 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13Y1243( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1243 == 0 )
                  {
                     GXCCtl = "TMREPCOD_" + sGXsfl_42_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTMRepCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTMRepCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9525TMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMRepCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9527TMRepCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTMRepNom_Internalname, GXutil.rtrim( A9526TMRepNom)) ;
         httpContext.changePostValue( "ZT_"+"Z9525TMRepCod_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( Z9525TMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9527TMRepCnt_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( Z9527TMRepCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1243_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1243_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1243_"+sGXsfl_42_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1243 != 0 )
         {
            httpContext.changePostValue( "TMREPCOD_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMREPCOD_"+sGXsfl_42_idx+"Horizontalalignment", GXutil.rtrim( edtTMRepCod_Horizontalalignment)) ;
            httpContext.changePostValue( "TMREPCNT_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TMREPNOM_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13Y1243( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1243 = (short)(0) ;
      nIsMod_1243 = (short)(0) ;
      nRcdDeleted_1243 = (short)(0) ;
   }

   public void processLevel13Y1242( )
   {
      /* Save parent mode. */
      sMode1242 = Gx_mode ;
      processNestedLevel13Y1243( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1242 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13Y1242( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13Y1242( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmtarea");
         if ( AnyError == 0 )
         {
            confirmValues13Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmtarea");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13Y1242( )
   {
      /* Scan By routine */
      /* Using cursor T013Y20 */
      pr_default.execute(18);
      RcdFound1242 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1242 = (short)(1) ;
         A396EmprCod = T013Y20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9430TMCod = T013Y20_A9430TMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13Y1242( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1242 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1242 = (short)(1) ;
         A396EmprCod = T013Y20_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9430TMCod = T013Y20_A9430TMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
      }
   }

   public void scanEnd13Y1242( )
   {
      pr_default.close(18);
   }

   public void afterConfirm13Y1242( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && true /* Level */ && ( AV15NumManual == 0 ) )
      {
         GXt_int12 = A9430TMCod ;
         GXv_int13[0] = GXt_int12 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTTAR", ""), ""), GXv_int13) ;
         tmtarea_impl.this.GXt_int12 = GXv_int13[0] ;
         A9430TMCod = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
      }
   }

   public void beforeInsert13Y1242( )
   {
      /* Before Insert Rules */
      if ( (0==A9430TMCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo con valor 0", ""), 1, "TMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdate13Y1242( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13Y1242( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13Y1242( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13Y1242( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13Y1242( )
   {
      edtTMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCod_Enabled), 5, 0), true);
      edtTMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMDsc_Enabled), 5, 0), true);
      edtTMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMTxt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtTMCDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMCDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMCDsc_Enabled), 5, 0), true);
   }

   public void zm13Y1243( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9527TMRepCnt = T013Y3_A9527TMRepCnt[0] ;
         }
         else
         {
            Z9527TMRepCnt = A9527TMRepCnt ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z9430TMCod = A9430TMCod ;
         Z9527TMRepCnt = A9527TMRepCnt ;
         Z396EmprCod = A396EmprCod ;
         Z9525TMRepCod = A9525TMRepCod ;
         Z9526TMRepNom = A9526TMRepNom ;
      }
   }

   public void standaloneNotModal13Y1243( )
   {
      edtTMRepNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepNom_Enabled), 5, 0), !bGXsfl_42_Refreshing);
   }

   public void standaloneModal13Y1243( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTMRepCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      }
      else
      {
         edtTMRepCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      }
   }

   public void load13Y1243( )
   {
      /* Using cursor T013Y21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod), Integer.valueOf(A9525TMRepCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1243 = (short)(1) ;
         A9526TMRepNom = T013Y21_A9526TMRepNom[0] ;
         n9526TMRepNom = T013Y21_n9526TMRepNom[0] ;
         A9527TMRepCnt = T013Y21_A9527TMRepCnt[0] ;
         zm13Y1243( -15) ;
      }
      pr_default.close(19);
      onLoadActions13Y1243( ) ;
   }

   public void onLoadActions13Y1243( )
   {
   }

   public void checkExtendedTable13Y1243( )
   {
      nIsDirty_1243 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal13Y1243( ) ;
      /* Using cursor T013Y4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9525TMRepCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TMREPCOD_" + sGXsfl_42_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MTarRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9526TMRepNom = T013Y4_A9526TMRepNom[0] ;
      n9526TMRepNom = T013Y4_n9526TMRepNom[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors13Y1243( )
   {
      pr_default.close(2);
   }

   public void enableDisable13Y1243( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          int A9525TMRepCod )
   {
      /* Using cursor T013Y22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9525TMRepCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "TMREPCOD_" + sGXsfl_42_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MTarRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMRepCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9526TMRepNom = T013Y22_A9526TMRepNom[0] ;
      n9526TMRepNom = T013Y22_n9526TMRepNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9526TMRepNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey13Y1243( )
   {
      /* Using cursor T013Y23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod), Integer.valueOf(A9525TMRepCod)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1243 = (short)(1) ;
      }
      else
      {
         RcdFound1243 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey13Y1243( )
   {
      /* Using cursor T013Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod), Integer.valueOf(A9525TMRepCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm13Y1243( 15) ;
         RcdFound1243 = (short)(1) ;
         initializeNonKey13Y1243( ) ;
         A9527TMRepCnt = T013Y3_A9527TMRepCnt[0] ;
         A9525TMRepCod = T013Y3_A9525TMRepCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9430TMCod = A9430TMCod ;
         Z9525TMRepCod = A9525TMRepCod ;
         sMode1243 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13Y1243( ) ;
         Gx_mode = sMode1243 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1243 = (short)(0) ;
         initializeNonKey13Y1243( ) ;
         sMode1243 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13Y1243( ) ;
         Gx_mode = sMode1243 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13Y1243( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13Y1243( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013Y2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod), Integer.valueOf(A9525TMRepCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMTaRep"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9527TMRepCnt, T013Y2_A9527TMRepCnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9527TMRepCnt, T013Y2_A9527TMRepCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmtarea:[seudo value changed for attri]"+"TMRepCnt");
               GXutil.writeLogRaw("Old: ",Z9527TMRepCnt);
               GXutil.writeLogRaw("Current: ",T013Y2_A9527TMRepCnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMTaRep"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13Y1243( )
   {
      beforeValidate13Y1243( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13Y1243( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13Y1243( 0) ;
         checkOptimisticConcurrency13Y1243( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13Y1243( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13Y1243( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013Y24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A9430TMCod), A9527TMRepCnt, A396EmprCod, Integer.valueOf(A9525TMRepCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTaRep");
                  if ( (pr_default.getStatus(22) == 1) )
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
            load13Y1243( ) ;
         }
         endLevel13Y1243( ) ;
      }
      closeExtendedTableCursors13Y1243( ) ;
   }

   public void update13Y1243( )
   {
      beforeValidate13Y1243( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13Y1243( ) ;
      }
      if ( ( nIsMod_1243 != 0 ) || ( nIsDirty_1243 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13Y1243( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13Y1243( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13Y1243( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013Y25 */
                     pr_default.execute(23, new Object[] {A9527TMRepCnt, A396EmprCod, Integer.valueOf(A9430TMCod), Integer.valueOf(A9525TMRepCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTaRep");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMTaRep"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13Y1243( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13Y1243( ) ;
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
            endLevel13Y1243( ) ;
         }
      }
      closeExtendedTableCursors13Y1243( ) ;
   }

   public void deferredUpdate13Y1243( )
   {
   }

   public void delete13Y1243( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13Y1243( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13Y1243( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13Y1243( ) ;
         afterConfirm13Y1243( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13Y1243( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013Y26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod), Integer.valueOf(A9525TMRepCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMTaRep");
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
      sMode1243 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13Y1243( ) ;
      Gx_mode = sMode1243 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13Y1243( )
   {
      standaloneModal13Y1243( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013Y27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9525TMRepCod)});
         A9526TMRepNom = T013Y27_A9526TMRepNom[0] ;
         n9526TMRepNom = T013Y27_n9526TMRepNom[0] ;
         pr_default.close(25);
      }
   }

   public void endLevel13Y1243( )
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

   public void scanStart13Y1243( )
   {
      /* Scan By routine */
      /* Using cursor T013Y28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9430TMCod)});
      RcdFound1243 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1243 = (short)(1) ;
         A9525TMRepCod = T013Y28_A9525TMRepCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13Y1243( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1243 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1243 = (short)(1) ;
         A9525TMRepCod = T013Y28_A9525TMRepCod[0] ;
      }
   }

   public void scanEnd13Y1243( )
   {
      pr_default.close(26);
   }

   public void afterConfirm13Y1243( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13Y1243( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13Y1243( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13Y1243( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13Y1243( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13Y1243( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13Y1243( )
   {
      edtTMRepCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtTMRepCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMRepCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepCnt_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtTMRepNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepNom_Enabled), 5, 0), !bGXsfl_42_Refreshing);
   }

   public void send_integrity_lvl_hashes13Y1243( )
   {
   }

   public void send_integrity_lvl_hashes13Y1242( )
   {
   }

   public void subsflControlProps_421243( )
   {
      edtTMRepCod_Internalname = "TMREPCOD_"+sGXsfl_42_idx ;
      edtTMRepCnt_Internalname = "TMREPCNT_"+sGXsfl_42_idx ;
      edtTMRepNom_Internalname = "TMREPNOM_"+sGXsfl_42_idx ;
   }

   public void subsflControlProps_fel_421243( )
   {
      edtTMRepCod_Internalname = "TMREPCOD_"+sGXsfl_42_fel_idx ;
      edtTMRepCnt_Internalname = "TMREPCNT_"+sGXsfl_42_fel_idx ;
      edtTMRepNom_Internalname = "TMREPNOM_"+sGXsfl_42_fel_idx ;
   }

   public void addRow13Y1243( )
   {
      nGXsfl_42_idx = (int)(nGXsfl_42_idx+1) ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_421243( ) ;
      sendRow13Y1243( ) ;
   }

   public void sendRow13Y1243( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1243_" + sGXsfl_42_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_42_idx + "',42)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMRepCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9525TMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9525TMRepCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMRepCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTMRepCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtTMRepCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1243_" + sGXsfl_42_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_42_idx + "',42)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMRepCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9527TMRepCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTMRepCnt_Enabled!=0) ? localUtil.format( A9527TMRepCnt, "ZZZZZZZ9.999") : localUtil.format( A9527TMRepCnt, "ZZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMRepCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn TagColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtTMRepCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTMRepNom_Internalname,GXutil.rtrim( A9526TMRepNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTMRepNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtTMRepNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes13Y1243( ) ;
      GXCCtl = "Z9525TMRepCod_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9525TMRepCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9527TMRepCnt_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9527TMRepCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1243_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1243_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1243_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1243, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_42_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV18TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV18TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV16EmprCod));
      GXCCtl = "vTMCOD_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMREPCOD_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMREPCOD_"+sGXsfl_42_idx+"Horizontalalignment", GXutil.rtrim( edtTMRepCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "TMREPCNT_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TMREPNOM_"+sGXsfl_42_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow13Y1243( )
   {
      nGXsfl_42_idx = (int)(nGXsfl_42_idx+1) ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_421243( ) ;
      edtTMRepCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMREPCOD_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMRepCod_Horizontalalignment = httpContext.cgiGet( "TMREPCOD_"+sGXsfl_42_idx+"Horizontalalignment") ;
      edtTMRepCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMREPCNT_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTMRepNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TMREPNOM_"+sGXsfl_42_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "TMREPCOD_" + sGXsfl_42_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMRepCod_Internalname ;
         wbErr = true ;
         A9525TMRepCod = 0 ;
      }
      else
      {
         A9525TMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( edtTMRepCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTMRepCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTMRepCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "TMREPCNT_" + sGXsfl_42_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMRepCnt_Internalname ;
         wbErr = true ;
         A9527TMRepCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9527TMRepCnt = localUtil.ctond( httpContext.cgiGet( edtTMRepCnt_Internalname)) ;
      }
      A9526TMRepNom = httpContext.cgiGet( edtTMRepNom_Internalname) ;
      n9526TMRepNom = false ;
      GXCCtl = "Z9525TMRepCod_" + sGXsfl_42_idx ;
      Z9525TMRepCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9527TMRepCnt_" + sGXsfl_42_idx ;
      Z9527TMRepCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1243_" + sGXsfl_42_idx ;
      nRcdDeleted_1243 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1243_" + sGXsfl_42_idx ;
      nRcdExists_1243 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1243_" + sGXsfl_42_idx ;
      nIsMod_1243 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTMRepNom_Enabled = edtTMRepNom_Enabled ;
      defedtTMRepCod_Enabled = edtTMRepCod_Enabled ;
   }

   public void confirmValues13Y0( )
   {
      nGXsfl_42_idx = 0 ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_421243( ) ;
      while ( nGXsfl_42_idx < nRC_GXsfl_42 )
      {
         nGXsfl_42_idx = (int)(nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_421243( ) ;
         httpContext.changePostValue( "Z9525TMRepCod_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z9525TMRepCod_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9525TMRepCod_"+sGXsfl_42_idx) ;
         httpContext.changePostValue( "Z9527TMRepCnt_"+sGXsfl_42_idx, httpContext.cgiGet( "ZT_"+"Z9527TMRepCnt_"+sGXsfl_42_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9527TMRepCnt_"+sGXsfl_42_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmtarea", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13TMCod,8,0))}, new String[] {"Gx_mode","EmprCod","TMCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMTarea");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmtarea:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9430TMCod", GXutil.ltrim( localUtil.ntoc( Z9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9431TMDsc", GXutil.rtrim( Z9431TMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9432TMTxt", Z9432TMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_42", GXutil.ltrim( localUtil.ntoc( nGXsfl_42_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9430TMCod", GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTMREPCOD_DATA", AV22TMRepCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTMREPCOD_DATA", AV22TMRepCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV18TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV18TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV18TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTMCOD", GXutil.ltrim( localUtil.ntoc( AV13TMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13TMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMMANUAL", GXutil.ltrim( localUtil.ntoc( AV15NumManual, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV25Pgmname));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Objectcall", GXutil.rtrim( Dvpanel_tableleaflevel_level1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Enabled", GXutil.booltostr( Dvpanel_tableleaflevel_level1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Width", GXutil.rtrim( Dvpanel_tableleaflevel_level1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Autowidth", GXutil.booltostr( Dvpanel_tableleaflevel_level1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Autoheight", GXutil.booltostr( Dvpanel_tableleaflevel_level1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Cls", GXutil.rtrim( Dvpanel_tableleaflevel_level1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Title", GXutil.rtrim( Dvpanel_tableleaflevel_level1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Collapsible", GXutil.booltostr( Dvpanel_tableleaflevel_level1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Collapsed", GXutil.booltostr( Dvpanel_tableleaflevel_level1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Showcollapseicon", GXutil.booltostr( Dvpanel_tableleaflevel_level1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Iconposition", GXutil.rtrim( Dvpanel_tableleaflevel_level1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELEAFLEVEL_LEVEL1_Autoscroll", GXutil.booltostr( Dvpanel_tableleaflevel_level1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMREPCOD_Objectcall", GXutil.rtrim( Combo_tmrepcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMREPCOD_Cls", GXutil.rtrim( Combo_tmrepcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMREPCOD_Enabled", GXutil.booltostr( Combo_tmrepcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMREPCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_tmrepcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMREPCOD_Isgriditem", GXutil.booltostr( Combo_tmrepcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TMREPCOD_Emptyitem", GXutil.booltostr( Combo_tmrepcod_Emptyitem));
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
      return formatLink("app.tmtarea", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13TMCod,8,0))}, new String[] {"Gx_mode","EmprCod","TMCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMTarea" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tareas de Mantenimiento", "") ;
   }

   public void initializeNonKey13Y1242( )
   {
      A13749TMCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13749TMCDsc", A13749TMCDsc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A9431TMDsc = "" ;
      n9431TMDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9431TMDsc", A9431TMDsc);
      A9432TMTxt = "" ;
      n9432TMTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9432TMTxt", A9432TMTxt);
      Z9431TMDsc = "" ;
      Z9432TMTxt = "" ;
   }

   public void initAll13Y1242( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9430TMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
      initializeNonKey13Y1242( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey13Y1243( )
   {
      A9526TMRepNom = "" ;
      n9526TMRepNom = false ;
      A9527TMRepCnt = DecimalUtil.ZERO ;
      Z9527TMRepCnt = DecimalUtil.ZERO ;
   }

   public void initAll13Y1243( )
   {
      A9525TMRepCod = 0 ;
      initializeNonKey13Y1243( ) ;
   }

   public void standaloneModalInsert13Y1243( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026362313452", true, true);
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
      httpContext.AddJavascriptSource("tmtarea.js", "?2026362313452", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1243( )
   {
      edtTMRepNom_Enabled = defedtTMRepNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMRepNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepNom_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtTMRepCod_Enabled = defedtTMRepCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTMRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTMRepCod_Enabled), 5, 0), !bGXsfl_42_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9525TMRepCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtTMRepCod_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9527TMRepCnt, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9526TMRepNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTMRepNom_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtTMCod_Internalname = "TMCOD" ;
      edtTMDsc_Internalname = "TMDSC" ;
      edtTMTxt_Internalname = "TMTXT" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtTMRepCod_Internalname = "TMREPCOD" ;
      edtTMRepCnt_Internalname = "TMREPCNT" ;
      edtTMRepNom_Internalname = "TMREPNOM" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      Dvpanel_tableleaflevel_level1_Internalname = "DVPANEL_TABLELEAFLEVEL_LEVEL1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_tmrepcod_Internalname = "COMBO_TMREPCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtTMCDsc_Internalname = "TMCDSC" ;
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
      Combo_tmrepcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Tareas de Mantenimiento", "") );
      edtTMRepNom_Jsonclick = "" ;
      edtTMRepCnt_Jsonclick = "" ;
      edtTMRepCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_tmrepcod_Titlecontrolidtoreplace = "" ;
      edtTMRepNom_Enabled = 0 ;
      edtTMRepCnt_Enabled = 1 ;
      edtTMRepCod_Enabled = 1 ;
      edtTMCDsc_Jsonclick = "" ;
      edtTMCDsc_Enabled = 0 ;
      edtTMCDsc_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      Combo_tmrepcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tmrepcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_tmrepcod_Cls = "ExtendedCombo" ;
      Combo_tmrepcod_Caption = "" ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Dvpanel_tableleaflevel_level1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_level1_Iconposition = "Right" ;
      Dvpanel_tableleaflevel_level1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_level1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_level1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableleaflevel_level1_Title = httpContext.getMessage( "Detalle", "") ;
      Dvpanel_tableleaflevel_level1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableleaflevel_level1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableleaflevel_level1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableleaflevel_level1_Width = "100%" ;
      edtTMTxt_Enabled = 1 ;
      edtTMDsc_Jsonclick = "" ;
      edtTMDsc_Enabled = 1 ;
      edtTMCod_Jsonclick = "" ;
      edtTMCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtTMRepCod_Horizontalalignment = "right" ;
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

   public void gx4asatmcod13Y1242( int AV13TMCod )
   {
      if ( ! (0==AV13TMCod) )
      {
         A9430TMCod = AV13TMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9430TMCod = AV13TMCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asatmcod13Y1242( byte AV15NumManual ,
                                   String Gx_mode ,
                                   String A396EmprCod )
   {
      if ( isIns( )  && true /* After */ && true /* Level */ && ( AV15NumManual == 0 ) )
      {
         GXt_int12 = A9430TMCod ;
         GXv_int13[0] = GXt_int12 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTTAR", ""), ""), GXv_int13) ;
         tmtarea_impl.this.GXt_int12 = GXv_int13[0] ;
         A9430TMCod = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A9430TMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9430TMCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9430TMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_421243( ) ;
      while ( nGXsfl_42_idx <= nRC_GXsfl_42 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13Y1243( ) ;
         standaloneModal13Y1243( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13Y1243( ) ;
         nGXsfl_42_idx = (int)(nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_421243( ) ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T013Y16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T013Y16_A407EmprNom[0] ;
      n407EmprNom = T013Y16_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Tmrepcod( )
   {
      n9526TMRepNom = false ;
      /* Using cursor T013Y27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9525TMRepCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MTarRep", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TMREPCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTMRepCod_Internalname ;
      }
      A9526TMRepNom = T013Y27_A9526TMRepNom[0] ;
      n9526TMRepNom = T013Y27_n9526TMRepNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9526TMRepNom", GXutil.rtrim( A9526TMRepNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13TMCod',fld:'vTMCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV18TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13TMCod',fld:'vTMCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213Y2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV18TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_TMCOD","{handler:'valid_Tmcod',iparms:[]");
      setEventMetadata("VALID_TMCOD",",oparms:[]}");
      setEventMetadata("VALID_TMDSC","{handler:'valid_Tmdsc',iparms:[]");
      setEventMetadata("VALID_TMDSC",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_TMREPCOD","{handler:'valid_Tmrepcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9525TMRepCod',fld:'TMREPCOD',pic:'ZZZZZZZ9'},{av:'A9526TMRepNom',fld:'TMREPNOM',pic:''}]");
      setEventMetadata("VALID_TMREPCOD",",oparms:[{av:'A9526TMRepNom',fld:'TMREPNOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Tmrepnom',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV16EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9431TMDsc = "" ;
      Z9432TMTxt = "" ;
      Z9527TMRepCnt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV16EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A9431TMDsc = "" ;
      A9432TMTxt = "" ;
      ucDvpanel_tableleaflevel_level1 = new com.genexus.webpanels.GXUserControl();
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucCombo_tmrepcod = new com.genexus.webpanels.GXUserControl();
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV22TMRepCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      A13749TMCDsc = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1243 = "" ;
      sStyleString = "" ;
      AV25Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_tableleaflevel_level1_Objectcall = "" ;
      Dvpanel_tableleaflevel_level1_Class = "" ;
      Dvpanel_tableleaflevel_level1_Height = "" ;
      Combo_tmrepcod_Objectcall = "" ;
      Combo_tmrepcod_Class = "" ;
      Combo_tmrepcod_Icontype = "" ;
      Combo_tmrepcod_Icon = "" ;
      Combo_tmrepcod_Tooltip = "" ;
      Combo_tmrepcod_Selectedvalue_set = "" ;
      Combo_tmrepcod_Selectedvalue_get = "" ;
      Combo_tmrepcod_Selectedtext_set = "" ;
      Combo_tmrepcod_Selectedtext_get = "" ;
      Combo_tmrepcod_Gamoauthtoken = "" ;
      Combo_tmrepcod_Ddointernalname = "" ;
      Combo_tmrepcod_Titlecontrolalign = "" ;
      Combo_tmrepcod_Dropdownoptionstype = "" ;
      Combo_tmrepcod_Datalisttype = "" ;
      Combo_tmrepcod_Datalistfixedvalues = "" ;
      Combo_tmrepcod_Datalistproc = "" ;
      Combo_tmrepcod_Datalistprocparametersprefix = "" ;
      Combo_tmrepcod_Remoteservicesparameters = "" ;
      Combo_tmrepcod_Htmltemplate = "" ;
      Combo_tmrepcod_Multiplevaluestype = "" ;
      Combo_tmrepcod_Loadingdata = "" ;
      Combo_tmrepcod_Noresultsfound = "" ;
      Combo_tmrepcod_Emptyitemtext = "" ;
      Combo_tmrepcod_Onlyselectedvalues = "" ;
      Combo_tmrepcod_Selectalltext = "" ;
      Combo_tmrepcod_Multiplevaluesseparator = "" ;
      Combo_tmrepcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1242 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A9527TMRepCnt = DecimalUtil.ZERO ;
      A9526TMRepNom = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV20ObtenerEmprCod = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV18TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV23ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T013Y7_A407EmprNom = new String[] {""} ;
      T013Y7_n407EmprNom = new boolean[] {false} ;
      T013Y8_A9430TMCod = new int[1] ;
      T013Y8_A407EmprNom = new String[] {""} ;
      T013Y8_n407EmprNom = new boolean[] {false} ;
      T013Y8_A9431TMDsc = new String[] {""} ;
      T013Y8_n9431TMDsc = new boolean[] {false} ;
      T013Y8_A9432TMTxt = new String[] {""} ;
      T013Y8_n9432TMTxt = new boolean[] {false} ;
      T013Y8_A396EmprCod = new String[] {""} ;
      T013Y9_A407EmprNom = new String[] {""} ;
      T013Y9_n407EmprNom = new boolean[] {false} ;
      T013Y10_A396EmprCod = new String[] {""} ;
      T013Y10_A9430TMCod = new int[1] ;
      T013Y6_A9430TMCod = new int[1] ;
      T013Y6_A9431TMDsc = new String[] {""} ;
      T013Y6_n9431TMDsc = new boolean[] {false} ;
      T013Y6_A9432TMTxt = new String[] {""} ;
      T013Y6_n9432TMTxt = new boolean[] {false} ;
      T013Y6_A396EmprCod = new String[] {""} ;
      T013Y11_A396EmprCod = new String[] {""} ;
      T013Y11_A9430TMCod = new int[1] ;
      T013Y12_A396EmprCod = new String[] {""} ;
      T013Y12_A9430TMCod = new int[1] ;
      T013Y5_A9430TMCod = new int[1] ;
      T013Y5_A9431TMDsc = new String[] {""} ;
      T013Y5_n9431TMDsc = new boolean[] {false} ;
      T013Y5_A9432TMTxt = new String[] {""} ;
      T013Y5_n9432TMTxt = new boolean[] {false} ;
      T013Y5_A396EmprCod = new String[] {""} ;
      T013Y16_A407EmprNom = new String[] {""} ;
      T013Y16_n407EmprNom = new boolean[] {false} ;
      T013Y17_A396EmprCod = new String[] {""} ;
      T013Y17_A9429PMCod = new int[1] ;
      T013Y17_A9479PMTCod = new int[1] ;
      T013Y18_A396EmprCod = new String[] {""} ;
      T013Y18_A9425OMCod = new int[1] ;
      T013Y18_A9430TMCod = new int[1] ;
      T013Y19_A396EmprCod = new String[] {""} ;
      T013Y19_A656ParCod = new short[1] ;
      T013Y20_A396EmprCod = new String[] {""} ;
      T013Y20_A9430TMCod = new int[1] ;
      Z9526TMRepNom = "" ;
      T013Y21_A9430TMCod = new int[1] ;
      T013Y21_A9526TMRepNom = new String[] {""} ;
      T013Y21_n9526TMRepNom = new boolean[] {false} ;
      T013Y21_A9527TMRepCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Y21_A396EmprCod = new String[] {""} ;
      T013Y21_A9525TMRepCod = new int[1] ;
      T013Y4_A9526TMRepNom = new String[] {""} ;
      T013Y4_n9526TMRepNom = new boolean[] {false} ;
      T013Y22_A9526TMRepNom = new String[] {""} ;
      T013Y22_n9526TMRepNom = new boolean[] {false} ;
      T013Y23_A396EmprCod = new String[] {""} ;
      T013Y23_A9430TMCod = new int[1] ;
      T013Y23_A9525TMRepCod = new int[1] ;
      T013Y3_A9430TMCod = new int[1] ;
      T013Y3_A9527TMRepCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Y3_A396EmprCod = new String[] {""} ;
      T013Y3_A9525TMRepCod = new int[1] ;
      T013Y2_A9430TMCod = new int[1] ;
      T013Y2_A9527TMRepCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013Y2_A396EmprCod = new String[] {""} ;
      T013Y2_A9525TMRepCod = new int[1] ;
      T013Y27_A9526TMRepNom = new String[] {""} ;
      T013Y27_n9526TMRepNom = new boolean[] {false} ;
      T013Y28_A396EmprCod = new String[] {""} ;
      T013Y28_A9430TMCod = new int[1] ;
      T013Y28_A9525TMRepCod = new int[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int13 = new int[1] ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmtarea__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmtarea__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmtarea__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmtarea__default(),
         new Object[] {
             new Object[] {
            T013Y2_A9430TMCod, T013Y2_A9527TMRepCnt, T013Y2_A396EmprCod, T013Y2_A9525TMRepCod
            }
            , new Object[] {
            T013Y3_A9430TMCod, T013Y3_A9527TMRepCnt, T013Y3_A396EmprCod, T013Y3_A9525TMRepCod
            }
            , new Object[] {
            T013Y4_A9526TMRepNom, T013Y4_n9526TMRepNom
            }
            , new Object[] {
            T013Y5_A9430TMCod, T013Y5_A9431TMDsc, T013Y5_n9431TMDsc, T013Y5_A9432TMTxt, T013Y5_n9432TMTxt, T013Y5_A396EmprCod
            }
            , new Object[] {
            T013Y6_A9430TMCod, T013Y6_A9431TMDsc, T013Y6_n9431TMDsc, T013Y6_A9432TMTxt, T013Y6_n9432TMTxt, T013Y6_A396EmprCod
            }
            , new Object[] {
            T013Y7_A407EmprNom, T013Y7_n407EmprNom
            }
            , new Object[] {
            T013Y8_A9430TMCod, T013Y8_A407EmprNom, T013Y8_n407EmprNom, T013Y8_A9431TMDsc, T013Y8_n9431TMDsc, T013Y8_A9432TMTxt, T013Y8_n9432TMTxt, T013Y8_A396EmprCod
            }
            , new Object[] {
            T013Y9_A407EmprNom, T013Y9_n407EmprNom
            }
            , new Object[] {
            T013Y10_A396EmprCod, T013Y10_A9430TMCod
            }
            , new Object[] {
            T013Y11_A396EmprCod, T013Y11_A9430TMCod
            }
            , new Object[] {
            T013Y12_A396EmprCod, T013Y12_A9430TMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013Y16_A407EmprNom, T013Y16_n407EmprNom
            }
            , new Object[] {
            T013Y17_A396EmprCod, T013Y17_A9429PMCod, T013Y17_A9479PMTCod
            }
            , new Object[] {
            T013Y18_A396EmprCod, T013Y18_A9425OMCod, T013Y18_A9430TMCod
            }
            , new Object[] {
            T013Y19_A396EmprCod, T013Y19_A656ParCod
            }
            , new Object[] {
            T013Y20_A396EmprCod, T013Y20_A9430TMCod
            }
            , new Object[] {
            T013Y21_A9430TMCod, T013Y21_A9526TMRepNom, T013Y21_n9526TMRepNom, T013Y21_A9527TMRepCnt, T013Y21_A396EmprCod, T013Y21_A9525TMRepCod
            }
            , new Object[] {
            T013Y22_A9526TMRepNom, T013Y22_n9526TMRepNom
            }
            , new Object[] {
            T013Y23_A396EmprCod, T013Y23_A9430TMCod, T013Y23_A9525TMRepCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013Y27_A9526TMRepNom, T013Y27_n9526TMRepNom
            }
            , new Object[] {
            T013Y28_A396EmprCod, T013Y28_A9430TMCod, T013Y28_A9525TMRepCod
            }
         }
      );
      AV25Pgmname = "TMTarea" ;
   }

   private byte GxWebError ;
   private byte AV15NumManual ;
   private byte nKeyPressed ;
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
   private short nRcdDeleted_1243 ;
   private short nRcdExists_1243 ;
   private short nIsMod_1243 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1243 ;
   private short RcdFound1243 ;
   private short nBlankRcdUsr1243 ;
   private short RcdFound1242 ;
   private short nIsDirty_1242 ;
   private short nIsDirty_1243 ;
   private int wcpOAV13TMCod ;
   private int Z9430TMCod ;
   private int nRC_GXsfl_42 ;
   private int nGXsfl_42_idx=1 ;
   private int N9430TMCod ;
   private int Z9525TMRepCod ;
   private int AV13TMCod ;
   private int A9525TMRepCod ;
   private int trnEnded ;
   private int A9430TMCod ;
   private int edtTMCod_Enabled ;
   private int edtTMDsc_Enabled ;
   private int edtTMTxt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtTMCDsc_Visible ;
   private int edtTMCDsc_Enabled ;
   private int edtTMRepCod_Enabled ;
   private int edtTMRepCnt_Enabled ;
   private int edtTMRepNom_Enabled ;
   private int fRowAdded ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_tableleaflevel_level1_Gxcontroltype ;
   private int Combo_tmrepcod_Datalistupdateminimumcharacters ;
   private int Combo_tmrepcod_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtTMRepNom_Enabled ;
   private int defedtTMRepCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXt_int12 ;
   private int GXv_int13[] ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9527TMRepCnt ;
   private java.math.BigDecimal A9527TMRepCnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV16EmprCod ;
   private String Z396EmprCod ;
   private String Z9431TMDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV16EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTMCod_Internalname ;
   private String sGXsfl_42_idx="0001" ;
   private String edtTMRepCod_Horizontalalignment ;
   private String edtTMRepCod_Internalname ;
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
   private String edtTMCod_Jsonclick ;
   private String edtTMDsc_Internalname ;
   private String A9431TMDsc ;
   private String edtTMDsc_Jsonclick ;
   private String edtTMTxt_Internalname ;
   private String Dvpanel_tableleaflevel_level1_Width ;
   private String Dvpanel_tableleaflevel_level1_Cls ;
   private String Dvpanel_tableleaflevel_level1_Title ;
   private String Dvpanel_tableleaflevel_level1_Iconposition ;
   private String Dvpanel_tableleaflevel_level1_Internalname ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_tmrepcod_Caption ;
   private String Combo_tmrepcod_Cls ;
   private String Combo_tmrepcod_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtTMCDsc_Internalname ;
   private String edtTMCDsc_Jsonclick ;
   private String sMode1243 ;
   private String edtTMRepCnt_Internalname ;
   private String edtTMRepNom_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV25Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_tableleaflevel_level1_Objectcall ;
   private String Dvpanel_tableleaflevel_level1_Class ;
   private String Dvpanel_tableleaflevel_level1_Height ;
   private String Combo_tmrepcod_Objectcall ;
   private String Combo_tmrepcod_Class ;
   private String Combo_tmrepcod_Icontype ;
   private String Combo_tmrepcod_Icon ;
   private String Combo_tmrepcod_Tooltip ;
   private String Combo_tmrepcod_Selectedvalue_set ;
   private String Combo_tmrepcod_Selectedvalue_get ;
   private String Combo_tmrepcod_Selectedtext_set ;
   private String Combo_tmrepcod_Selectedtext_get ;
   private String Combo_tmrepcod_Gamoauthtoken ;
   private String Combo_tmrepcod_Ddointernalname ;
   private String Combo_tmrepcod_Titlecontrolalign ;
   private String Combo_tmrepcod_Dropdownoptionstype ;
   private String Combo_tmrepcod_Titlecontrolidtoreplace ;
   private String Combo_tmrepcod_Datalisttype ;
   private String Combo_tmrepcod_Datalistfixedvalues ;
   private String Combo_tmrepcod_Datalistproc ;
   private String Combo_tmrepcod_Datalistprocparametersprefix ;
   private String Combo_tmrepcod_Remoteservicesparameters ;
   private String Combo_tmrepcod_Htmltemplate ;
   private String Combo_tmrepcod_Multiplevaluestype ;
   private String Combo_tmrepcod_Loadingdata ;
   private String Combo_tmrepcod_Noresultsfound ;
   private String Combo_tmrepcod_Emptyitemtext ;
   private String Combo_tmrepcod_Onlyselectedvalues ;
   private String Combo_tmrepcod_Selectalltext ;
   private String Combo_tmrepcod_Multiplevaluesseparator ;
   private String Combo_tmrepcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode1242 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9526TMRepNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV20ObtenerEmprCod ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z9526TMRepNom ;
   private String sGXsfl_42_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtTMRepCod_Jsonclick ;
   private String edtTMRepCnt_Jsonclick ;
   private String edtTMRepNom_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_42_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_tableleaflevel_level1_Autowidth ;
   private boolean Dvpanel_tableleaflevel_level1_Autoheight ;
   private boolean Dvpanel_tableleaflevel_level1_Collapsible ;
   private boolean Dvpanel_tableleaflevel_level1_Collapsed ;
   private boolean Dvpanel_tableleaflevel_level1_Showcollapseicon ;
   private boolean Dvpanel_tableleaflevel_level1_Autoscroll ;
   private boolean Combo_tmrepcod_Isgriditem ;
   private boolean Combo_tmrepcod_Emptyitem ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_tableleaflevel_level1_Enabled ;
   private boolean Dvpanel_tableleaflevel_level1_Showheader ;
   private boolean Dvpanel_tableleaflevel_level1_Visible ;
   private boolean Combo_tmrepcod_Enabled ;
   private boolean Combo_tmrepcod_Visible ;
   private boolean Combo_tmrepcod_Allowmultipleselection ;
   private boolean Combo_tmrepcod_Hasdescription ;
   private boolean Combo_tmrepcod_Includeonlyselectedoption ;
   private boolean Combo_tmrepcod_Includeselectalloption ;
   private boolean Combo_tmrepcod_Includeaddnewoption ;
   private boolean n9431TMDsc ;
   private boolean n9432TMTxt ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n9526TMRepNom ;
   private String Z9432TMTxt ;
   private String A9432TMTxt ;
   private String A13749TMCDsc ;
   private String AV23ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV19WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableleaflevel_level1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_tmrepcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T013Y7_A407EmprNom ;
   private boolean[] T013Y7_n407EmprNom ;
   private int[] T013Y8_A9430TMCod ;
   private String[] T013Y8_A407EmprNom ;
   private boolean[] T013Y8_n407EmprNom ;
   private String[] T013Y8_A9431TMDsc ;
   private boolean[] T013Y8_n9431TMDsc ;
   private String[] T013Y8_A9432TMTxt ;
   private boolean[] T013Y8_n9432TMTxt ;
   private String[] T013Y8_A396EmprCod ;
   private String[] T013Y9_A407EmprNom ;
   private boolean[] T013Y9_n407EmprNom ;
   private String[] T013Y10_A396EmprCod ;
   private int[] T013Y10_A9430TMCod ;
   private int[] T013Y6_A9430TMCod ;
   private String[] T013Y6_A9431TMDsc ;
   private boolean[] T013Y6_n9431TMDsc ;
   private String[] T013Y6_A9432TMTxt ;
   private boolean[] T013Y6_n9432TMTxt ;
   private String[] T013Y6_A396EmprCod ;
   private String[] T013Y11_A396EmprCod ;
   private int[] T013Y11_A9430TMCod ;
   private String[] T013Y12_A396EmprCod ;
   private int[] T013Y12_A9430TMCod ;
   private int[] T013Y5_A9430TMCod ;
   private String[] T013Y5_A9431TMDsc ;
   private boolean[] T013Y5_n9431TMDsc ;
   private String[] T013Y5_A9432TMTxt ;
   private boolean[] T013Y5_n9432TMTxt ;
   private String[] T013Y5_A396EmprCod ;
   private String[] T013Y16_A407EmprNom ;
   private boolean[] T013Y16_n407EmprNom ;
   private String[] T013Y17_A396EmprCod ;
   private int[] T013Y17_A9429PMCod ;
   private int[] T013Y17_A9479PMTCod ;
   private String[] T013Y18_A396EmprCod ;
   private int[] T013Y18_A9425OMCod ;
   private int[] T013Y18_A9430TMCod ;
   private String[] T013Y19_A396EmprCod ;
   private short[] T013Y19_A656ParCod ;
   private String[] T013Y20_A396EmprCod ;
   private int[] T013Y20_A9430TMCod ;
   private int[] T013Y21_A9430TMCod ;
   private String[] T013Y21_A9526TMRepNom ;
   private boolean[] T013Y21_n9526TMRepNom ;
   private java.math.BigDecimal[] T013Y21_A9527TMRepCnt ;
   private String[] T013Y21_A396EmprCod ;
   private int[] T013Y21_A9525TMRepCod ;
   private String[] T013Y4_A9526TMRepNom ;
   private boolean[] T013Y4_n9526TMRepNom ;
   private String[] T013Y22_A9526TMRepNom ;
   private boolean[] T013Y22_n9526TMRepNom ;
   private String[] T013Y23_A396EmprCod ;
   private int[] T013Y23_A9430TMCod ;
   private int[] T013Y23_A9525TMRepCod ;
   private int[] T013Y3_A9430TMCod ;
   private java.math.BigDecimal[] T013Y3_A9527TMRepCnt ;
   private String[] T013Y3_A396EmprCod ;
   private int[] T013Y3_A9525TMRepCod ;
   private int[] T013Y2_A9430TMCod ;
   private java.math.BigDecimal[] T013Y2_A9527TMRepCnt ;
   private String[] T013Y2_A396EmprCod ;
   private int[] T013Y2_A9525TMRepCod ;
   private String[] T013Y27_A9526TMRepNom ;
   private boolean[] T013Y27_n9526TMRepNom ;
   private String[] T013Y28_A396EmprCod ;
   private int[] T013Y28_A9430TMCod ;
   private int[] T013Y28_A9525TMRepCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV22TMRepCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV18TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
}

final  class tmtarea__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmtarea__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmtarea__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmtarea__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013Y2", "SELECT TMCod, TMRepCnt, EmprCod, TMRepCod FROM TXPMTaRep WHERE EmprCod = ? AND TMCod = ? AND TMRepCod = ?  FOR UPDATE OF TMRepCnt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y3", "SELECT TMCod, TMRepCnt, EmprCod, TMRepCod FROM TXPMTaRep WHERE EmprCod = ? AND TMCod = ? AND TMRepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y4", "SELECT MRNom AS TMRepNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y5", "SELECT TMCod, TMDsc, TMTxt, EmprCod FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ?  FOR UPDATE OF TMDsc, TMTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y6", "SELECT TMCod, TMDsc, TMTxt, EmprCod FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y8", "SELECT /*+ FIRST_ROWS(100) */ TM1.TMCod, T2.EmprNom, TM1.TMDsc, TM1.TMTxt, TM1.EmprCod FROM (TXPMTAREA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TMCod = ? ORDER BY TM1.EmprCod, TM1.TMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TMCod FROM TXPMTAREA WHERE EmprCod = ? AND TMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TMCod FROM TXPMTAREA WHERE ( EmprCod > ? or EmprCod = ? and TMCod > ?) ORDER BY EmprCod, TMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013Y12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TMCod FROM TXPMTAREA WHERE ( EmprCod < ? or EmprCod = ? and TMCod < ?) ORDER BY EmprCod DESC, TMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013Y13", "INSERT INTO TXPMTAREA(TMCod, TMDsc, TMTxt, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMTAREA")
         ,new UpdateCursor("T013Y14", "UPDATE TXPMTAREA SET TMDsc=?, TMTxt=?  WHERE EmprCod = ? AND TMCod = ?", GX_NOMASK, "TXPMTAREA")
         ,new UpdateCursor("T013Y15", "DELETE FROM TXPMTAREA  WHERE EmprCod = ? AND TMCod = ?", GX_NOMASK, "TXPMTAREA")
         ,new ForEachCursor("T013Y16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y17", "SELECT * FROM (SELECT EmprCod, PMCod, PMTCod FROM TXPMPrev3 WHERE EmprCod = ? AND PMTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013Y18", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND TMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013Y19", "SELECT * FROM (SELECT EmprCod, ParCod FROM TXPCODPAR WHERE EmprCod = ? AND ParTMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013Y20", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TMCod FROM TXPMTAREA ORDER BY EmprCod, TMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y21", "SELECT T1.TMCod, T2.MRNom AS TMRepNom, T1.TMRepCnt, T1.EmprCod, T1.TMRepCod AS TMRepCod FROM (TXPMTaRep T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.TMRepCod) WHERE T1.EmprCod = ? and T1.TMCod = ? and T1.TMRepCod = ? ORDER BY T1.EmprCod, T1.TMCod, T1.TMRepCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y22", "SELECT MRNom AS TMRepNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y23", "SELECT EmprCod, TMCod, TMRepCod FROM TXPMTaRep WHERE EmprCod = ? AND TMCod = ? AND TMRepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013Y24", "INSERT INTO TXPMTaRep(TMCod, TMRepCnt, EmprCod, TMRepCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMTaRep")
         ,new UpdateCursor("T013Y25", "UPDATE TXPMTaRep SET TMRepCnt=?  WHERE EmprCod = ? AND TMCod = ? AND TMRepCod = ?", GX_NOMASK, "TXPMTaRep")
         ,new UpdateCursor("T013Y26", "DELETE FROM TXPMTaRep  WHERE EmprCod = ? AND TMCod = ? AND TMRepCod = ?", GX_NOMASK, "TXPMTaRep")
         ,new ForEachCursor("T013Y27", "SELECT MRNom AS TMRepNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013Y28", "SELECT EmprCod, TMCod, TMRepCod FROM TXPMTaRep WHERE EmprCod = ? and TMCod = ? ORDER BY EmprCod, TMCod, TMRepCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 2000);
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 2000);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
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
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 23 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

