package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class temppar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV46Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         AV29UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
         AV37Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
         AV42Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
         A316ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_28_SU41( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs, A316ContVal) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV46Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         AV29UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
         AV37Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
         AV42Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_SU41( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action30") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV46Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         AV29UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
         AV37Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
         AV42Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_30_SU41( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"") == 0 )
      {
         AV35EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa14174SU27( AV35EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"") == 0 )
      {
         AV35EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa14184SU27( AV35EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"") == 0 )
      {
         AV35EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa14173SU27( AV35EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"") == 0 )
      {
         AV35EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa14177SU27( AV35EmprCod) ;
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
            AV35EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
            AV36EmprNom = httpContext.GetPar( "EmprNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36EmprNom", AV36EmprNom);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS EMPRESA", ""), (short)(0)) ;
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
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      edtContTp_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContTp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContTp_Visible), 5, 0), !bGXsfl_32_Refreshing);
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

   public temppar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public temppar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( temppar_impl.class ));
   }

   public temppar_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEmprcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavEmprcod_Internalname, httpContext.getMessage( "Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV35EmprCod), GXutil.rtrim( localUtil.format( AV35EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEmprcod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavEmprnom_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprnom_Internalname, GXutil.rtrim( AV36EmprNom), GXutil.rtrim( localUtil.format( AV36EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEmprnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TEMPPAR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TEMPPAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount41 = (short)(10) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_41 = (short)(1) ;
            scanStartSU41( ) ;
            while ( RcdFound41 != 0 )
            {
               init_level_properties41( ) ;
               getByPrimaryKeySU41( ) ;
               addRowSU41( ) ;
               scanNextSU41( ) ;
            }
            scanEndSU41( ) ;
            nBlankRcdCount41 = (short)(10) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalSU41( ) ;
         standaloneModalSU41( ) ;
         sMode41 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRowSU41( ) ;
            edtContCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTDSC_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContDsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTVAL_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContVal_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContDsc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTDSC2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContDsc2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContVal2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTVAL2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContVal2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContVal2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContTp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTTP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContTp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContTp_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTTP_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContTp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContTp_Visible), 5, 0), !bGXsfl_32_Refreshing);
            edtContCtrl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTCTRL_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContCtrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCtrl_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContCtrl_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTCTRL_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContCtrl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCtrl_Visible), 5, 0), !bGXsfl_32_Refreshing);
            edtContAplica_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTAPLICA_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContAplica_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContAplica_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContAplica_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTAPLICA_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContAplica_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContAplica_Visible), 5, 0), !bGXsfl_32_Refreshing);
            edtContATCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTATCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContATCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContATCod_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTATCOD_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContATCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATCod_Visible), 5, 0), !bGXsfl_32_Refreshing);
            edtContATEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTATEST_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContATEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATEst_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtContATEst_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTATEST_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtContATEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATEst_Visible), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_41 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalSU41( ) ;
            }
            sendRowSU41( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode41 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount41 = (short)(10) ;
         nRcdExists_41 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartSU41( ) ;
            while ( RcdFound41 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3241( ) ;
               init_level_properties41( ) ;
               standaloneNotModalSU41( ) ;
               getByPrimaryKeySU41( ) ;
               standaloneModalSU41( ) ;
               addRowSU41( ) ;
               scanNextSU41( ) ;
            }
            scanEndSU41( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode41 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_3241( ) ;
         initAllSU41( ) ;
         init_level_properties41( ) ;
         nRcdExists_41 = (short)(0) ;
         nIsMod_41 = (short)(0) ;
         nRcdDeleted_41 = (short)(0) ;
         nBlankRcdCount41 = (short)(nBlankRcdUsr41+nBlankRcdCount41) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount41 > 0 )
         {
            standaloneNotModalSU41( ) ;
            standaloneModalSU41( ) ;
            addRowSU41( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtContCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount41 = (short)(nBlankRcdCount41-1) ;
         }
         Gx_mode = sMode41 ;
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
      e11SU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
            Z3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3915EmpNumDec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "Z407EmprNom") ;
            n407EmprNom = false ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3915EmpNumDec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV46Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV42Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            A14178ContATTs = httpContext.cgiGet( "CONTATTS") ;
            n14178ContATTs = false ;
            A14179ContUltMov = localUtil.ctol( httpContext.cgiGet( "CONTULTMOV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n14179ContUltMov = false ;
            A14180ContIDSeri = httpContext.cgiGet( "CONTIDSERI") ;
            n14180ContIDSeri = false ;
            A14181ContIDSerN = httpContext.cgiGet( "CONTIDSERN") ;
            n14181ContIDSerN = false ;
            A14182ContFcPrvU = localUtil.ctod( httpContext.cgiGet( "CONTFCPRVU"), 0) ;
            n14182ContFcPrvU = false ;
            A14176ContFecUti = localUtil.ctod( httpContext.cgiGet( "CONTFECUTI"), 0) ;
            n14176ContFecUti = false ;
            A14183ContNumIni = (int)(localUtil.ctol( httpContext.cgiGet( "CONTNUMINI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14183ContNumIni = false ;
            A14185ContFecFUt = localUtil.ctod( httpContext.cgiGet( "CONTFECFUT"), 0) ;
            n14185ContFecFUt = false ;
            A14187ContIdSerL = httpContext.cgiGet( "CONTIDSERL") ;
            n14187ContIdSerL = false ;
            A14186ContNumlas = (int)(localUtil.ctol( httpContext.cgiGet( "CONTNUMLAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14186ContNumlas = false ;
            AV29UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV37Station = httpContext.cgiGet( "vSTATION") ;
            A14172ContDoc = httpContext.cgiGet( "CONTDOC") ;
            n14172ContDoc = false ;
            A14175ContClaseD = httpContext.cgiGet( "CONTCLASED") ;
            n14175ContClaseD = false ;
            A14188Contnumcer = httpContext.cgiGet( "CONTNUMCER") ;
            n14188Contnumcer = false ;
            A14189Contmedio = httpContext.cgiGet( "CONTMEDIO") ;
            n14189Contmedio = false ;
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
            /* Read variables values. */
            AV35EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
            AV36EmprNom = httpContext.cgiGet( edtavEmprnom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36EmprNom", AV36EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TEMPPAR");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("EmprNom", GXutil.rtrim( localUtil.format( A407EmprNom, "")));
            forbiddenHiddens.add("EmpNumDec", localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("temppar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode27 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode27 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound27 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_SU0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "");
                     AnyError = (short)(1) ;
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
                        e11SU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12SU2 ();
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
         e12SU2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllSU27( ) ;
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
         disableAttributesSU27( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Enabled), 5, 0), true);
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

   public void confirm_SU0( )
   {
      beforeValidateSU27( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsSU27( ) ;
         }
         else
         {
            checkExtendedTableSU27( ) ;
            closeExtendedTableCursorsSU27( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode27 = Gx_mode ;
         confirm_SU41( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode27 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_SU41( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRowSU41( ) ;
         if ( ( nRcdExists_41 != 0 ) || ( nIsMod_41 != 0 ) )
         {
            getKeySU41( ) ;
            if ( ( nRcdExists_41 == 0 ) && ( nRcdDeleted_41 == 0 ) )
            {
               if ( RcdFound41 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateSU41( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableSU41( ) ;
                     closeExtendedTableCursorsSU41( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CONTCOD_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtContCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound41 != 0 )
               {
                  if ( nRcdDeleted_41 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeySU41( ) ;
                     loadSU41( ) ;
                     beforeValidateSU41( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsSU41( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_41 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateSU41( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableSU41( ) ;
                           closeExtendedTableCursorsSU41( ) ;
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
                  if ( nRcdDeleted_41 == 0 )
                  {
                     GXCCtl = "CONTCOD_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtContCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtContCod_Internalname, GXutil.rtrim( A313ContCod)) ;
         httpContext.changePostValue( edtContDsc_Internalname, GXutil.rtrim( A314ContDsc)) ;
         httpContext.changePostValue( edtContVal_Internalname, GXutil.ltrim( localUtil.ntoc( A316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtContDsc2_Internalname, GXutil.rtrim( A7208ContDsc2)) ;
         httpContext.changePostValue( edtContVal2_Internalname, GXutil.ltrim( localUtil.ntoc( A1147ContVal2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtContTp_Internalname, GXutil.rtrim( A10270ContTp)) ;
         httpContext.changePostValue( edtContCtrl_Internalname, GXutil.rtrim( A14174ContCtrl)) ;
         httpContext.changePostValue( edtContAplica_Internalname, GXutil.ltrim( localUtil.ntoc( A14184ContAplica, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtContATCod_Internalname, GXutil.rtrim( A14173ContATCod)) ;
         httpContext.changePostValue( edtContATEst_Internalname, GXutil.rtrim( A14177ContATEst)) ;
         httpContext.changePostValue( "ZT_"+"Z313ContCod_"+sGXsfl_32_idx, GXutil.rtrim( Z313ContCod)) ;
         httpContext.changePostValue( "ZT_"+"Z14174ContCtrl_"+sGXsfl_32_idx, GXutil.rtrim( Z14174ContCtrl)) ;
         httpContext.changePostValue( "ZT_"+"Z14177ContATEst_"+sGXsfl_32_idx, GXutil.rtrim( Z14177ContATEst)) ;
         httpContext.changePostValue( "ZT_"+"Z14178ContATTs_"+sGXsfl_32_idx, GXutil.rtrim( Z14178ContATTs)) ;
         httpContext.changePostValue( "ZT_"+"Z14179ContUltMov_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14179ContUltMov, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14180ContIDSeri_"+sGXsfl_32_idx, GXutil.rtrim( Z14180ContIDSeri)) ;
         httpContext.changePostValue( "ZT_"+"Z14181ContIDSerN_"+sGXsfl_32_idx, GXutil.rtrim( Z14181ContIDSerN)) ;
         httpContext.changePostValue( "ZT_"+"Z14182ContFcPrvU_"+sGXsfl_32_idx, localUtil.dtoc( Z14182ContFcPrvU, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z14176ContFecUti_"+sGXsfl_32_idx, localUtil.dtoc( Z14176ContFecUti, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z14183ContNumIni_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14183ContNumIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14184ContAplica_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14184ContAplica, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14185ContFecFUt_"+sGXsfl_32_idx, localUtil.dtoc( Z14185ContFecFUt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z14187ContIdSerL_"+sGXsfl_32_idx, GXutil.rtrim( Z14187ContIdSerL)) ;
         httpContext.changePostValue( "ZT_"+"Z14186ContNumlas_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14186ContNumlas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z314ContDsc_"+sGXsfl_32_idx, GXutil.rtrim( Z314ContDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z316ContVal_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7208ContDsc2_"+sGXsfl_32_idx, GXutil.rtrim( Z7208ContDsc2)) ;
         httpContext.changePostValue( "ZT_"+"Z1147ContVal2_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z1147ContVal2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10270ContTp_"+sGXsfl_32_idx, GXutil.rtrim( Z10270ContTp)) ;
         httpContext.changePostValue( "ZT_"+"Z14172ContDoc_"+sGXsfl_32_idx, GXutil.rtrim( Z14172ContDoc)) ;
         httpContext.changePostValue( "ZT_"+"Z14173ContATCod_"+sGXsfl_32_idx, GXutil.rtrim( Z14173ContATCod)) ;
         httpContext.changePostValue( "ZT_"+"Z14175ContClaseD_"+sGXsfl_32_idx, GXutil.rtrim( Z14175ContClaseD)) ;
         httpContext.changePostValue( "ZT_"+"Z14188Contnumcer_"+sGXsfl_32_idx, GXutil.rtrim( Z14188Contnumcer)) ;
         httpContext.changePostValue( "ZT_"+"Z14189Contmedio_"+sGXsfl_32_idx, GXutil.rtrim( Z14189Contmedio)) ;
         httpContext.changePostValue( "T316ContVal_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( O316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_41_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_41_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_41_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N316ContVal_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( A316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_41 != 0 )
         {
            httpContext.changePostValue( "CONTCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTDSC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTVAL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTDSC2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContDsc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTVAL2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContVal2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTTP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContTp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTTP_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContTp_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTCTRL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContCtrl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTCTRL_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContCtrl_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTAPLICA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContAplica_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTAPLICA_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContAplica_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTATCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContATCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTATCOD_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContATCod_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTATEST_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContATEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTATEST_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContATEst_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionSU0( )
   {
   }

   public void e11SU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      temppar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      GXv_char2[0] = AV35EmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char4[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      temppar_impl.this.AV35EmprCod = GXv_char2[0] ;
      temppar_impl.this.AV36EmprNom = GXv_char3[0] ;
      temppar_impl.this.AV29UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprNom", AV36EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
      GXt_int5 = AV41Eliot ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      AV41Eliot = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Eliot", GXutil.str( AV41Eliot, 1, 0));
      edtContTp_Visible = (((AV41Eliot==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContTp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContTp_Visible), 5, 0), !bGXsfl_32_Refreshing);
      GXt_char1 = AV37Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      temppar_impl.this.GXt_char1 = GXv_char4[0] ;
      AV37Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Station", AV37Station);
      GXv_char4[0] = AV35EmprCod ;
      GXv_char3[0] = AV36EmprNom ;
      GXv_char2[0] = AV29UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char4, GXv_char3, GXv_char2) ;
      temppar_impl.this.AV35EmprCod = GXv_char4[0] ;
      temppar_impl.this.AV36EmprNom = GXv_char3[0] ;
      temppar_impl.this.AV29UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprNom", AV36EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV29UsurCod", AV29UsurCod);
      GXv_SdtWWPContext7[0] = AV43WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV43WWPContext = GXv_SdtWWPContext7[0] ;
      AV44TrnContext.fromxml(AV45WebSession.getValue("TrnContext"), null, null);
   }

   public void e12SU2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV44TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tempparww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {AV36EmprNom});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV36EmprNom"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zmSU27( int GX_JID )
   {
      if ( ( GX_JID == 33 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z407EmprNom = T00SU5_A407EmprNom[0] ;
            Z3915EmpNumDec = T00SU5_A3915EmpNumDec[0] ;
         }
         else
         {
            Z407EmprNom = A407EmprNom ;
            Z3915EmpNumDec = A3915EmpNumDec ;
         }
      }
      if ( GX_JID == -33 )
      {
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
      }
   }

   public void standaloneNotModal( )
   {
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      AV46Pgmname = "TEMPPAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV35EmprCod)==0) )
      {
         A396EmprCod = AV35EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, "100001", GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      edtContCtrl_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContCtrl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCtrl_Visible), 5, 0), !bGXsfl_32_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, "100001", GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      edtContAplica_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContAplica_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContAplica_Visible), 5, 0), !bGXsfl_32_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, "100001", GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      edtContATCod_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATCod_Visible), 5, 0), !bGXsfl_32_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, "100001", GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      edtContATEst_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATEst_Visible), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar Empresa", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite Eliminar", ""), 1, "");
         AnyError = (short)(1) ;
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

   public void loadSU27( )
   {
      /* Using cursor T00SU6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A407EmprNom = T00SU6_A407EmprNom[0] ;
         n407EmprNom = T00SU6_n407EmprNom[0] ;
         A3915EmpNumDec = T00SU6_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T00SU6_n3915EmpNumDec[0] ;
         zmSU27( -33) ;
      }
      pr_default.close(4);
      onLoadActionsSU27( ) ;
   }

   public void onLoadActionsSU27( )
   {
   }

   public void checkExtendedTableSU27( )
   {
      nIsDirty_27 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsSU27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeySU27( )
   {
      /* Using cursor T00SU7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00SU5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmSU27( 33) ;
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00SU5_A396EmprCod[0] ;
         A407EmprNom = T00SU5_A407EmprNom[0] ;
         n407EmprNom = T00SU5_n407EmprNom[0] ;
         A3915EmpNumDec = T00SU5_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T00SU5_n3915EmpNumDec[0] ;
         Z396EmprCod = A396EmprCod ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadSU27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKeySU27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKeySU27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeySU27( ) ;
      if ( RcdFound27 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T00SU8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00SU8_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00SU8_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            A396EmprCod = T00SU8_A396EmprCod[0] ;
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T00SU9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00SU9_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00SU9_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            A396EmprCod = T00SU9_A396EmprCod[0] ;
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeySU27( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insertSU27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
               AnyError = (short)(1) ;
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               updateSU27( ) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
            {
               /* Insert record */
               insertSU27( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  /* Insert record */
                  insertSU27( ) ;
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
      if ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "");
         AnyError = (short)(1) ;
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

   public void checkOptimisticConcurrencySU27( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SU4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z407EmprNom, T00SU4_A407EmprNom[0]) != 0 ) || ( Z3915EmpNumDec != T00SU4_A3915EmpNumDec[0] ) )
         {
            if ( GXutil.strcmp(Z407EmprNom, T00SU4_A407EmprNom[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"EmprNom");
               GXutil.writeLogRaw("Old: ",Z407EmprNom);
               GXutil.writeLogRaw("Current: ",T00SU4_A407EmprNom[0]);
            }
            if ( Z3915EmpNumDec != T00SU4_A3915EmpNumDec[0] )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"EmpNumDec");
               GXutil.writeLogRaw("Old: ",Z3915EmpNumDec);
               GXutil.writeLogRaw("Current: ",T00SU4_A3915EmpNumDec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPRES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSU27( )
   {
      beforeValidateSU27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSU27( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSU27( 0) ;
         checkOptimisticConcurrencySU27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSU27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSU27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SU10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n3915EmpNumDec), Byte.valueOf(A3915EmpNumDec)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        processLevelSU27( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionSU0( ) ;
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
            loadSU27( ) ;
         }
         endLevelSU27( ) ;
      }
      closeExtendedTableCursorsSU27( ) ;
   }

   public void updateSU27( )
   {
      beforeValidateSU27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSU27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySU27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSU27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateSU27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SU11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n407EmprNom), A407EmprNom, Boolean.valueOf(n3915EmpNumDec), Byte.valueOf(A3915EmpNumDec), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPRES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateSU27( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelSU27( ) ;
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
         endLevelSU27( ) ;
      }
      closeExtendedTableCursorsSU27( ) ;
   }

   public void deferredUpdateSU27( )
   {
   }

   public void delete( )
   {
      beforeValidateSU27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySU27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSU27( ) ;
         afterConfirmSU27( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSU27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00SU12 */
               pr_default.execute(10, new Object[] {A396EmprCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPRES");
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSU27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSU27( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelSU41( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRowSU41( ) ;
         if ( ( nRcdExists_41 != 0 ) || ( nIsMod_41 != 0 ) )
         {
            standaloneNotModalSU41( ) ;
            getKeySU41( ) ;
            if ( ( nRcdExists_41 == 0 ) && ( nRcdDeleted_41 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertSU41( ) ;
            }
            else
            {
               if ( RcdFound41 != 0 )
               {
                  if ( ( nRcdDeleted_41 != 0 ) && ( nRcdExists_41 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteSU41( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_41 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateSU41( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_41 == 0 )
                  {
                     GXCCtl = "CONTCOD_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtContCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtContCod_Internalname, GXutil.rtrim( A313ContCod)) ;
         httpContext.changePostValue( edtContDsc_Internalname, GXutil.rtrim( A314ContDsc)) ;
         httpContext.changePostValue( edtContVal_Internalname, GXutil.ltrim( localUtil.ntoc( A316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtContDsc2_Internalname, GXutil.rtrim( A7208ContDsc2)) ;
         httpContext.changePostValue( edtContVal2_Internalname, GXutil.ltrim( localUtil.ntoc( A1147ContVal2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtContTp_Internalname, GXutil.rtrim( A10270ContTp)) ;
         httpContext.changePostValue( edtContCtrl_Internalname, GXutil.rtrim( A14174ContCtrl)) ;
         httpContext.changePostValue( edtContAplica_Internalname, GXutil.ltrim( localUtil.ntoc( A14184ContAplica, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtContATCod_Internalname, GXutil.rtrim( A14173ContATCod)) ;
         httpContext.changePostValue( edtContATEst_Internalname, GXutil.rtrim( A14177ContATEst)) ;
         httpContext.changePostValue( "ZT_"+"Z313ContCod_"+sGXsfl_32_idx, GXutil.rtrim( Z313ContCod)) ;
         httpContext.changePostValue( "ZT_"+"Z14174ContCtrl_"+sGXsfl_32_idx, GXutil.rtrim( Z14174ContCtrl)) ;
         httpContext.changePostValue( "ZT_"+"Z14177ContATEst_"+sGXsfl_32_idx, GXutil.rtrim( Z14177ContATEst)) ;
         httpContext.changePostValue( "ZT_"+"Z14178ContATTs_"+sGXsfl_32_idx, GXutil.rtrim( Z14178ContATTs)) ;
         httpContext.changePostValue( "ZT_"+"Z14179ContUltMov_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14179ContUltMov, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14180ContIDSeri_"+sGXsfl_32_idx, GXutil.rtrim( Z14180ContIDSeri)) ;
         httpContext.changePostValue( "ZT_"+"Z14181ContIDSerN_"+sGXsfl_32_idx, GXutil.rtrim( Z14181ContIDSerN)) ;
         httpContext.changePostValue( "ZT_"+"Z14182ContFcPrvU_"+sGXsfl_32_idx, localUtil.dtoc( Z14182ContFcPrvU, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z14176ContFecUti_"+sGXsfl_32_idx, localUtil.dtoc( Z14176ContFecUti, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z14183ContNumIni_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14183ContNumIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14184ContAplica_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14184ContAplica, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14185ContFecFUt_"+sGXsfl_32_idx, localUtil.dtoc( Z14185ContFecFUt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z14187ContIdSerL_"+sGXsfl_32_idx, GXutil.rtrim( Z14187ContIdSerL)) ;
         httpContext.changePostValue( "ZT_"+"Z14186ContNumlas_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14186ContNumlas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z314ContDsc_"+sGXsfl_32_idx, GXutil.rtrim( Z314ContDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z316ContVal_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7208ContDsc2_"+sGXsfl_32_idx, GXutil.rtrim( Z7208ContDsc2)) ;
         httpContext.changePostValue( "ZT_"+"Z1147ContVal2_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z1147ContVal2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10270ContTp_"+sGXsfl_32_idx, GXutil.rtrim( Z10270ContTp)) ;
         httpContext.changePostValue( "ZT_"+"Z14172ContDoc_"+sGXsfl_32_idx, GXutil.rtrim( Z14172ContDoc)) ;
         httpContext.changePostValue( "ZT_"+"Z14173ContATCod_"+sGXsfl_32_idx, GXutil.rtrim( Z14173ContATCod)) ;
         httpContext.changePostValue( "ZT_"+"Z14175ContClaseD_"+sGXsfl_32_idx, GXutil.rtrim( Z14175ContClaseD)) ;
         httpContext.changePostValue( "ZT_"+"Z14188Contnumcer_"+sGXsfl_32_idx, GXutil.rtrim( Z14188Contnumcer)) ;
         httpContext.changePostValue( "ZT_"+"Z14189Contmedio_"+sGXsfl_32_idx, GXutil.rtrim( Z14189Contmedio)) ;
         httpContext.changePostValue( "T316ContVal_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( O316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_41_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_41_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_41_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N316ContVal_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( A316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_41 != 0 )
         {
            httpContext.changePostValue( "CONTCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTDSC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTVAL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTDSC2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContDsc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTVAL2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContVal2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTTP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContTp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTTP_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContTp_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTCTRL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContCtrl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTCTRL_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContCtrl_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTAPLICA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContAplica_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTAPLICA_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContAplica_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTATCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContATCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTATCOD_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContATCod_Visible, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTATEST_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContATEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONTATEST_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContATEst_Visible, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllSU41( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_41 = (short)(0) ;
      nIsMod_41 = (short)(0) ;
      nRcdDeleted_41 = (short)(0) ;
   }

   public void processLevelSU27( )
   {
      /* Save parent mode. */
      sMode27 = Gx_mode ;
      processNestedLevelSU41( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelSU27( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteSU27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "temppar");
         if ( AnyError == 0 )
         {
            confirmValuesSU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "temppar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartSU27( )
   {
      /* Scan By routine */
      /* Using cursor T00SU13 */
      pr_default.execute(11);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00SU13_A396EmprCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSU27( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A396EmprCod = T00SU13_A396EmprCod[0] ;
      }
   }

   public void scanEndSU27( )
   {
      pr_default.close(11);
   }

   public void afterConfirmSU27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSU27( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSU27( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSU27( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSU27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSU27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSU27( )
   {
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      edtavEmprnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Enabled), 5, 0), true);
   }

   public void zmSU41( int GX_JID )
   {
      if ( ( GX_JID == 34 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14174ContCtrl = T00SU3_A14174ContCtrl[0] ;
            Z14177ContATEst = T00SU3_A14177ContATEst[0] ;
            Z14178ContATTs = T00SU3_A14178ContATTs[0] ;
            Z14179ContUltMov = T00SU3_A14179ContUltMov[0] ;
            Z14180ContIDSeri = T00SU3_A14180ContIDSeri[0] ;
            Z14181ContIDSerN = T00SU3_A14181ContIDSerN[0] ;
            Z14182ContFcPrvU = T00SU3_A14182ContFcPrvU[0] ;
            Z14176ContFecUti = T00SU3_A14176ContFecUti[0] ;
            Z14183ContNumIni = T00SU3_A14183ContNumIni[0] ;
            Z14184ContAplica = T00SU3_A14184ContAplica[0] ;
            Z14185ContFecFUt = T00SU3_A14185ContFecFUt[0] ;
            Z14187ContIdSerL = T00SU3_A14187ContIdSerL[0] ;
            Z14186ContNumlas = T00SU3_A14186ContNumlas[0] ;
            Z314ContDsc = T00SU3_A314ContDsc[0] ;
            Z316ContVal = T00SU3_A316ContVal[0] ;
            Z7208ContDsc2 = T00SU3_A7208ContDsc2[0] ;
            Z1147ContVal2 = T00SU3_A1147ContVal2[0] ;
            Z10270ContTp = T00SU3_A10270ContTp[0] ;
            Z14172ContDoc = T00SU3_A14172ContDoc[0] ;
            Z14173ContATCod = T00SU3_A14173ContATCod[0] ;
            Z14175ContClaseD = T00SU3_A14175ContClaseD[0] ;
            Z14188Contnumcer = T00SU3_A14188Contnumcer[0] ;
            Z14189Contmedio = T00SU3_A14189Contmedio[0] ;
         }
         else
         {
            Z14174ContCtrl = A14174ContCtrl ;
            Z14177ContATEst = A14177ContATEst ;
            Z14178ContATTs = A14178ContATTs ;
            Z14179ContUltMov = A14179ContUltMov ;
            Z14180ContIDSeri = A14180ContIDSeri ;
            Z14181ContIDSerN = A14181ContIDSerN ;
            Z14182ContFcPrvU = A14182ContFcPrvU ;
            Z14176ContFecUti = A14176ContFecUti ;
            Z14183ContNumIni = A14183ContNumIni ;
            Z14184ContAplica = A14184ContAplica ;
            Z14185ContFecFUt = A14185ContFecFUt ;
            Z14187ContIdSerL = A14187ContIdSerL ;
            Z14186ContNumlas = A14186ContNumlas ;
            Z314ContDsc = A314ContDsc ;
            Z316ContVal = A316ContVal ;
            Z7208ContDsc2 = A7208ContDsc2 ;
            Z1147ContVal2 = A1147ContVal2 ;
            Z10270ContTp = A10270ContTp ;
            Z14172ContDoc = A14172ContDoc ;
            Z14173ContATCod = A14173ContATCod ;
            Z14175ContClaseD = A14175ContClaseD ;
            Z14188Contnumcer = A14188Contnumcer ;
            Z14189Contmedio = A14189Contmedio ;
         }
      }
      if ( GX_JID == -34 )
      {
         Z396EmprCod = A396EmprCod ;
         Z313ContCod = A313ContCod ;
         Z14174ContCtrl = A14174ContCtrl ;
         Z14177ContATEst = A14177ContATEst ;
         Z14178ContATTs = A14178ContATTs ;
         Z14179ContUltMov = A14179ContUltMov ;
         Z14180ContIDSeri = A14180ContIDSeri ;
         Z14181ContIDSerN = A14181ContIDSerN ;
         Z14182ContFcPrvU = A14182ContFcPrvU ;
         Z14176ContFecUti = A14176ContFecUti ;
         Z14183ContNumIni = A14183ContNumIni ;
         Z14184ContAplica = A14184ContAplica ;
         Z14185ContFecFUt = A14185ContFecFUt ;
         Z14187ContIdSerL = A14187ContIdSerL ;
         Z14186ContNumlas = A14186ContNumlas ;
         Z314ContDsc = A314ContDsc ;
         Z316ContVal = A316ContVal ;
         Z7208ContDsc2 = A7208ContDsc2 ;
         Z1147ContVal2 = A1147ContVal2 ;
         Z10270ContTp = A10270ContTp ;
         Z14172ContDoc = A14172ContDoc ;
         Z14173ContATCod = A14173ContATCod ;
         Z14175ContClaseD = A14175ContClaseD ;
         Z14188Contnumcer = A14188Contnumcer ;
         Z14189Contmedio = A14189Contmedio ;
      }
   }

   public void standaloneNotModalSU41( )
   {
      edtContCtrl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContCtrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCtrl_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContAplica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContAplica_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContAplica_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContATCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContATEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATEst_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void standaloneModalSU41( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A14174ContCtrl)==0) && ( Gx_BScreen == 0 ) )
      {
         A14174ContCtrl = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n14174ContCtrl = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A14177ContATEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A14177ContATEst = " " ;
         n14177ContATEst = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A14178ContATTs)==0) && ( Gx_BScreen == 0 ) )
      {
         A14178ContATTs = " " ;
         n14178ContATTs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14178ContATTs", A14178ContATTs);
      }
      if ( isIns( )  && (0==A14179ContUltMov) && ( Gx_BScreen == 0 ) )
      {
         A14179ContUltMov = 0 ;
         n14179ContUltMov = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14179ContUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14179ContUltMov), 12, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A14180ContIDSeri)==0) && ( Gx_BScreen == 0 ) )
      {
         A14180ContIDSeri = "" ;
         n14180ContIDSeri = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14180ContIDSeri", A14180ContIDSeri);
      }
      if ( isIns( )  && (GXutil.strcmp("", A14181ContIDSerN)==0) && ( Gx_BScreen == 0 ) )
      {
         A14181ContIDSerN = "" ;
         n14181ContIDSerN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14181ContIDSerN", A14181ContIDSerN);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14182ContFcPrvU)) && ( Gx_BScreen == 0 ) )
      {
         A14182ContFcPrvU = GXutil.nullDate() ;
         n14182ContFcPrvU = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14182ContFcPrvU", localUtil.format(A14182ContFcPrvU, "99/99/99"));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14176ContFecUti)) && ( Gx_BScreen == 0 ) )
      {
         A14176ContFecUti = GXutil.nullDate() ;
         n14176ContFecUti = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14176ContFecUti", localUtil.format(A14176ContFecUti, "99/99/99"));
      }
      if ( isIns( )  && (0==A14183ContNumIni) && ( Gx_BScreen == 0 ) )
      {
         A14183ContNumIni = 0 ;
         n14183ContNumIni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14183ContNumIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14183ContNumIni), 8, 0));
      }
      if ( isIns( )  && (0==A14184ContAplica) && ( Gx_BScreen == 0 ) )
      {
         A14184ContAplica = (byte)(0) ;
         n14184ContAplica = false ;
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14185ContFecFUt)) && ( Gx_BScreen == 0 ) )
      {
         A14185ContFecFUt = GXutil.nullDate() ;
         n14185ContFecFUt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14185ContFecFUt", localUtil.format(A14185ContFecFUt, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A14187ContIdSerL)==0) && ( Gx_BScreen == 0 ) )
      {
         A14187ContIdSerL = " " ;
         n14187ContIdSerL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14187ContIdSerL", A14187ContIdSerL);
      }
      if ( isIns( )  && (0==A14186ContNumlas) && ( Gx_BScreen == 0 ) )
      {
         A14186ContNumlas = 0 ;
         n14186ContNumlas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14186ContNumlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14186ContNumlas), 8, 0));
      }
      if ( ! (GXutil.strcmp("", A14173ContATCod)==0) && ( GXutil.strcmp(A14177ContATEst, httpContext.getMessage( httpContext.getMessage( "A", ""), "")) == 0 ) )
      {
         edtContVal_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtContVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContVal_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtContVal_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtContVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContVal_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtContCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtContCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtContCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtContCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void loadSU41( )
   {
      /* Using cursor T00SU14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A313ContCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A14174ContCtrl = T00SU14_A14174ContCtrl[0] ;
         n14174ContCtrl = T00SU14_n14174ContCtrl[0] ;
         A14177ContATEst = T00SU14_A14177ContATEst[0] ;
         n14177ContATEst = T00SU14_n14177ContATEst[0] ;
         A14178ContATTs = T00SU14_A14178ContATTs[0] ;
         n14178ContATTs = T00SU14_n14178ContATTs[0] ;
         A14179ContUltMov = T00SU14_A14179ContUltMov[0] ;
         n14179ContUltMov = T00SU14_n14179ContUltMov[0] ;
         A14180ContIDSeri = T00SU14_A14180ContIDSeri[0] ;
         n14180ContIDSeri = T00SU14_n14180ContIDSeri[0] ;
         A14181ContIDSerN = T00SU14_A14181ContIDSerN[0] ;
         n14181ContIDSerN = T00SU14_n14181ContIDSerN[0] ;
         A14182ContFcPrvU = T00SU14_A14182ContFcPrvU[0] ;
         n14182ContFcPrvU = T00SU14_n14182ContFcPrvU[0] ;
         A14176ContFecUti = T00SU14_A14176ContFecUti[0] ;
         n14176ContFecUti = T00SU14_n14176ContFecUti[0] ;
         A14183ContNumIni = T00SU14_A14183ContNumIni[0] ;
         n14183ContNumIni = T00SU14_n14183ContNumIni[0] ;
         A14184ContAplica = T00SU14_A14184ContAplica[0] ;
         n14184ContAplica = T00SU14_n14184ContAplica[0] ;
         A14185ContFecFUt = T00SU14_A14185ContFecFUt[0] ;
         n14185ContFecFUt = T00SU14_n14185ContFecFUt[0] ;
         A14187ContIdSerL = T00SU14_A14187ContIdSerL[0] ;
         n14187ContIdSerL = T00SU14_n14187ContIdSerL[0] ;
         A14186ContNumlas = T00SU14_A14186ContNumlas[0] ;
         n14186ContNumlas = T00SU14_n14186ContNumlas[0] ;
         A314ContDsc = T00SU14_A314ContDsc[0] ;
         A316ContVal = T00SU14_A316ContVal[0] ;
         A7208ContDsc2 = T00SU14_A7208ContDsc2[0] ;
         A1147ContVal2 = T00SU14_A1147ContVal2[0] ;
         A10270ContTp = T00SU14_A10270ContTp[0] ;
         A14172ContDoc = T00SU14_A14172ContDoc[0] ;
         n14172ContDoc = T00SU14_n14172ContDoc[0] ;
         A14173ContATCod = T00SU14_A14173ContATCod[0] ;
         n14173ContATCod = T00SU14_n14173ContATCod[0] ;
         A14175ContClaseD = T00SU14_A14175ContClaseD[0] ;
         n14175ContClaseD = T00SU14_n14175ContClaseD[0] ;
         A14188Contnumcer = T00SU14_A14188Contnumcer[0] ;
         n14188Contnumcer = T00SU14_n14188Contnumcer[0] ;
         A14189Contmedio = T00SU14_A14189Contmedio[0] ;
         n14189Contmedio = T00SU14_n14189Contmedio[0] ;
         zmSU41( -34) ;
      }
      pr_default.close(12);
      onLoadActionsSU41( ) ;
   }

   public void onLoadActionsSU41( )
   {
      if ( ( O316ContVal != A316ContVal ) && isUpd( )  )
      {
         AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Modificacion Valores,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor Anterior=", ""), "") + GXutil.str( O316ContVal, 8, 0) + httpContext.getMessage( httpContext.getMessage( " Valor Nuevo=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
      }
      else
      {
         if ( isDlt( )  )
         {
            AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Eliminacion,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
         }
         else
         {
            if ( isIns( )  )
            {
               AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Alta,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
            }
         }
      }
   }

   public void checkExtendedTableSU41( )
   {
      nIsDirty_41 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalSU41( ) ;
      if ( ( O316ContVal != A316ContVal ) && isUpd( )  )
      {
         AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Modificacion Valores,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor Anterior=", ""), "") + GXutil.str( O316ContVal, 8, 0) + httpContext.getMessage( httpContext.getMessage( " Valor Nuevo=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
      }
      else
      {
         if ( isDlt( )  )
         {
            AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Eliminacion,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
         }
         else
         {
            if ( isIns( )  )
            {
               AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Alta,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
            }
         }
      }
      if ( ! (GXutil.strcmp("", A14173ContATCod)==0) && ( A316ContVal != O316ContVal ) && ( GXutil.strcmp(A14177ContATEst, httpContext.getMessage( "A", "")) == 0 ) )
      {
         GXCCtl = "CONTVAL_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. Você NÃO pode modificar o valor do contador, ele tem um código de validação, ", "")+GXutil.trim( A14173ContATCod), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtContVal_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsSU41( )
   {
   }

   public void enableDisableSU41( )
   {
   }

   public void getKeySU41( )
   {
      /* Using cursor T00SU15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A313ContCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound41 = (short)(1) ;
      }
      else
      {
         RcdFound41 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKeySU41( )
   {
      /* Using cursor T00SU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A313ContCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmSU41( 34) ;
         RcdFound41 = (short)(1) ;
         initializeNonKeySU41( ) ;
         A313ContCod = T00SU3_A313ContCod[0] ;
         A14174ContCtrl = T00SU3_A14174ContCtrl[0] ;
         n14174ContCtrl = T00SU3_n14174ContCtrl[0] ;
         A14177ContATEst = T00SU3_A14177ContATEst[0] ;
         n14177ContATEst = T00SU3_n14177ContATEst[0] ;
         A14178ContATTs = T00SU3_A14178ContATTs[0] ;
         n14178ContATTs = T00SU3_n14178ContATTs[0] ;
         A14179ContUltMov = T00SU3_A14179ContUltMov[0] ;
         n14179ContUltMov = T00SU3_n14179ContUltMov[0] ;
         A14180ContIDSeri = T00SU3_A14180ContIDSeri[0] ;
         n14180ContIDSeri = T00SU3_n14180ContIDSeri[0] ;
         A14181ContIDSerN = T00SU3_A14181ContIDSerN[0] ;
         n14181ContIDSerN = T00SU3_n14181ContIDSerN[0] ;
         A14182ContFcPrvU = T00SU3_A14182ContFcPrvU[0] ;
         n14182ContFcPrvU = T00SU3_n14182ContFcPrvU[0] ;
         A14176ContFecUti = T00SU3_A14176ContFecUti[0] ;
         n14176ContFecUti = T00SU3_n14176ContFecUti[0] ;
         A14183ContNumIni = T00SU3_A14183ContNumIni[0] ;
         n14183ContNumIni = T00SU3_n14183ContNumIni[0] ;
         A14184ContAplica = T00SU3_A14184ContAplica[0] ;
         n14184ContAplica = T00SU3_n14184ContAplica[0] ;
         A14185ContFecFUt = T00SU3_A14185ContFecFUt[0] ;
         n14185ContFecFUt = T00SU3_n14185ContFecFUt[0] ;
         A14187ContIdSerL = T00SU3_A14187ContIdSerL[0] ;
         n14187ContIdSerL = T00SU3_n14187ContIdSerL[0] ;
         A14186ContNumlas = T00SU3_A14186ContNumlas[0] ;
         n14186ContNumlas = T00SU3_n14186ContNumlas[0] ;
         A314ContDsc = T00SU3_A314ContDsc[0] ;
         A316ContVal = T00SU3_A316ContVal[0] ;
         A7208ContDsc2 = T00SU3_A7208ContDsc2[0] ;
         A1147ContVal2 = T00SU3_A1147ContVal2[0] ;
         A10270ContTp = T00SU3_A10270ContTp[0] ;
         A14172ContDoc = T00SU3_A14172ContDoc[0] ;
         n14172ContDoc = T00SU3_n14172ContDoc[0] ;
         A14173ContATCod = T00SU3_A14173ContATCod[0] ;
         n14173ContATCod = T00SU3_n14173ContATCod[0] ;
         A14175ContClaseD = T00SU3_A14175ContClaseD[0] ;
         n14175ContClaseD = T00SU3_n14175ContClaseD[0] ;
         A14188Contnumcer = T00SU3_A14188Contnumcer[0] ;
         n14188Contnumcer = T00SU3_n14188Contnumcer[0] ;
         A14189Contmedio = T00SU3_A14189Contmedio[0] ;
         n14189Contmedio = T00SU3_n14189Contmedio[0] ;
         O316ContVal = A316ContVal ;
         Z396EmprCod = A396EmprCod ;
         Z313ContCod = A313ContCod ;
         sMode41 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadSU41( ) ;
         Gx_mode = sMode41 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound41 = (short)(0) ;
         initializeNonKeySU41( ) ;
         sMode41 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSU41( ) ;
         Gx_mode = sMode41 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesSU41( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencySU41( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A313ContCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14174ContCtrl, T00SU2_A14174ContCtrl[0]) != 0 ) || ( GXutil.strcmp(Z14177ContATEst, T00SU2_A14177ContATEst[0]) != 0 ) || ( GXutil.strcmp(Z14178ContATTs, T00SU2_A14178ContATTs[0]) != 0 ) || ( Z14179ContUltMov != T00SU2_A14179ContUltMov[0] ) || ( GXutil.strcmp(Z14180ContIDSeri, T00SU2_A14180ContIDSeri[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14181ContIDSerN, T00SU2_A14181ContIDSerN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z14182ContFcPrvU), GXutil.resetTime(T00SU2_A14182ContFcPrvU[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z14176ContFecUti), GXutil.resetTime(T00SU2_A14176ContFecUti[0])) ) || ( Z14183ContNumIni != T00SU2_A14183ContNumIni[0] ) || ( Z14184ContAplica != T00SU2_A14184ContAplica[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z14185ContFecFUt), GXutil.resetTime(T00SU2_A14185ContFecFUt[0])) ) || ( GXutil.strcmp(Z14187ContIdSerL, T00SU2_A14187ContIdSerL[0]) != 0 ) || ( Z14186ContNumlas != T00SU2_A14186ContNumlas[0] ) || ( GXutil.strcmp(Z314ContDsc, T00SU2_A314ContDsc[0]) != 0 ) || ( Z316ContVal != T00SU2_A316ContVal[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7208ContDsc2, T00SU2_A7208ContDsc2[0]) != 0 ) || ( Z1147ContVal2 != T00SU2_A1147ContVal2[0] ) || ( GXutil.strcmp(Z10270ContTp, T00SU2_A10270ContTp[0]) != 0 ) || ( GXutil.strcmp(Z14172ContDoc, T00SU2_A14172ContDoc[0]) != 0 ) || ( GXutil.strcmp(Z14173ContATCod, T00SU2_A14173ContATCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14175ContClaseD, T00SU2_A14175ContClaseD[0]) != 0 ) || ( GXutil.strcmp(Z14188Contnumcer, T00SU2_A14188Contnumcer[0]) != 0 ) || ( GXutil.strcmp(Z14189Contmedio, T00SU2_A14189Contmedio[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z14174ContCtrl, T00SU2_A14174ContCtrl[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContCtrl");
               GXutil.writeLogRaw("Old: ",Z14174ContCtrl);
               GXutil.writeLogRaw("Current: ",T00SU2_A14174ContCtrl[0]);
            }
            if ( GXutil.strcmp(Z14177ContATEst, T00SU2_A14177ContATEst[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContATEst");
               GXutil.writeLogRaw("Old: ",Z14177ContATEst);
               GXutil.writeLogRaw("Current: ",T00SU2_A14177ContATEst[0]);
            }
            if ( GXutil.strcmp(Z14178ContATTs, T00SU2_A14178ContATTs[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContATTs");
               GXutil.writeLogRaw("Old: ",Z14178ContATTs);
               GXutil.writeLogRaw("Current: ",T00SU2_A14178ContATTs[0]);
            }
            if ( Z14179ContUltMov != T00SU2_A14179ContUltMov[0] )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContUltMov");
               GXutil.writeLogRaw("Old: ",Z14179ContUltMov);
               GXutil.writeLogRaw("Current: ",T00SU2_A14179ContUltMov[0]);
            }
            if ( GXutil.strcmp(Z14180ContIDSeri, T00SU2_A14180ContIDSeri[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContIDSeri");
               GXutil.writeLogRaw("Old: ",Z14180ContIDSeri);
               GXutil.writeLogRaw("Current: ",T00SU2_A14180ContIDSeri[0]);
            }
            if ( GXutil.strcmp(Z14181ContIDSerN, T00SU2_A14181ContIDSerN[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContIDSerN");
               GXutil.writeLogRaw("Old: ",Z14181ContIDSerN);
               GXutil.writeLogRaw("Current: ",T00SU2_A14181ContIDSerN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14182ContFcPrvU), GXutil.resetTime(T00SU2_A14182ContFcPrvU[0])) ) )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContFcPrvU");
               GXutil.writeLogRaw("Old: ",Z14182ContFcPrvU);
               GXutil.writeLogRaw("Current: ",T00SU2_A14182ContFcPrvU[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14176ContFecUti), GXutil.resetTime(T00SU2_A14176ContFecUti[0])) ) )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContFecUti");
               GXutil.writeLogRaw("Old: ",Z14176ContFecUti);
               GXutil.writeLogRaw("Current: ",T00SU2_A14176ContFecUti[0]);
            }
            if ( Z14183ContNumIni != T00SU2_A14183ContNumIni[0] )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContNumIni");
               GXutil.writeLogRaw("Old: ",Z14183ContNumIni);
               GXutil.writeLogRaw("Current: ",T00SU2_A14183ContNumIni[0]);
            }
            if ( Z14184ContAplica != T00SU2_A14184ContAplica[0] )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContAplica");
               GXutil.writeLogRaw("Old: ",Z14184ContAplica);
               GXutil.writeLogRaw("Current: ",T00SU2_A14184ContAplica[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14185ContFecFUt), GXutil.resetTime(T00SU2_A14185ContFecFUt[0])) ) )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContFecFUt");
               GXutil.writeLogRaw("Old: ",Z14185ContFecFUt);
               GXutil.writeLogRaw("Current: ",T00SU2_A14185ContFecFUt[0]);
            }
            if ( GXutil.strcmp(Z14187ContIdSerL, T00SU2_A14187ContIdSerL[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContIdSerL");
               GXutil.writeLogRaw("Old: ",Z14187ContIdSerL);
               GXutil.writeLogRaw("Current: ",T00SU2_A14187ContIdSerL[0]);
            }
            if ( Z14186ContNumlas != T00SU2_A14186ContNumlas[0] )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContNumlas");
               GXutil.writeLogRaw("Old: ",Z14186ContNumlas);
               GXutil.writeLogRaw("Current: ",T00SU2_A14186ContNumlas[0]);
            }
            if ( GXutil.strcmp(Z314ContDsc, T00SU2_A314ContDsc[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContDsc");
               GXutil.writeLogRaw("Old: ",Z314ContDsc);
               GXutil.writeLogRaw("Current: ",T00SU2_A314ContDsc[0]);
            }
            if ( Z316ContVal != T00SU2_A316ContVal[0] )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContVal");
               GXutil.writeLogRaw("Old: ",Z316ContVal);
               GXutil.writeLogRaw("Current: ",T00SU2_A316ContVal[0]);
            }
            if ( GXutil.strcmp(Z7208ContDsc2, T00SU2_A7208ContDsc2[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContDsc2");
               GXutil.writeLogRaw("Old: ",Z7208ContDsc2);
               GXutil.writeLogRaw("Current: ",T00SU2_A7208ContDsc2[0]);
            }
            if ( Z1147ContVal2 != T00SU2_A1147ContVal2[0] )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContVal2");
               GXutil.writeLogRaw("Old: ",Z1147ContVal2);
               GXutil.writeLogRaw("Current: ",T00SU2_A1147ContVal2[0]);
            }
            if ( GXutil.strcmp(Z10270ContTp, T00SU2_A10270ContTp[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContTp");
               GXutil.writeLogRaw("Old: ",Z10270ContTp);
               GXutil.writeLogRaw("Current: ",T00SU2_A10270ContTp[0]);
            }
            if ( GXutil.strcmp(Z14172ContDoc, T00SU2_A14172ContDoc[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContDoc");
               GXutil.writeLogRaw("Old: ",Z14172ContDoc);
               GXutil.writeLogRaw("Current: ",T00SU2_A14172ContDoc[0]);
            }
            if ( GXutil.strcmp(Z14173ContATCod, T00SU2_A14173ContATCod[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContATCod");
               GXutil.writeLogRaw("Old: ",Z14173ContATCod);
               GXutil.writeLogRaw("Current: ",T00SU2_A14173ContATCod[0]);
            }
            if ( GXutil.strcmp(Z14175ContClaseD, T00SU2_A14175ContClaseD[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"ContClaseD");
               GXutil.writeLogRaw("Old: ",Z14175ContClaseD);
               GXutil.writeLogRaw("Current: ",T00SU2_A14175ContClaseD[0]);
            }
            if ( GXutil.strcmp(Z14188Contnumcer, T00SU2_A14188Contnumcer[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"Contnumcer");
               GXutil.writeLogRaw("Old: ",Z14188Contnumcer);
               GXutil.writeLogRaw("Current: ",T00SU2_A14188Contnumcer[0]);
            }
            if ( GXutil.strcmp(Z14189Contmedio, T00SU2_A14189Contmedio[0]) != 0 )
            {
               GXutil.writeLogln("temppar:[seudo value changed for attri]"+"Contmedio");
               GXutil.writeLogRaw("Old: ",Z14189Contmedio);
               GXutil.writeLogRaw("Current: ",T00SU2_A14189Contmedio[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPEMPLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSU41( )
   {
      beforeValidateSU41( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSU41( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSU41( 0) ;
         checkOptimisticConcurrencySU41( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSU41( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSU41( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SU16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, A313ContCod, Boolean.valueOf(n14174ContCtrl), A14174ContCtrl, Boolean.valueOf(n14177ContATEst), A14177ContATEst, Boolean.valueOf(n14178ContATTs), A14178ContATTs, Boolean.valueOf(n14179ContUltMov), Long.valueOf(A14179ContUltMov), Boolean.valueOf(n14180ContIDSeri), A14180ContIDSeri, Boolean.valueOf(n14181ContIDSerN), A14181ContIDSerN, Boolean.valueOf(n14182ContFcPrvU), A14182ContFcPrvU, Boolean.valueOf(n14176ContFecUti), A14176ContFecUti, Boolean.valueOf(n14183ContNumIni), Integer.valueOf(A14183ContNumIni), Boolean.valueOf(n14184ContAplica), Byte.valueOf(A14184ContAplica), Boolean.valueOf(n14185ContFecFUt), A14185ContFecFUt, Boolean.valueOf(n14187ContIdSerL), A14187ContIdSerL, Boolean.valueOf(n14186ContNumlas), Integer.valueOf(A14186ContNumlas), A314ContDsc, Integer.valueOf(A316ContVal), A7208ContDsc2, Long.valueOf(A1147ContVal2), A10270ContTp, Boolean.valueOf(n14172ContDoc), A14172ContDoc, Boolean.valueOf(n14173ContATCod), A14173ContATCod, Boolean.valueOf(n14175ContClaseD), A14175ContClaseD, Boolean.valueOf(n14188Contnumcer), A14188Contnumcer, Boolean.valueOf(n14189Contmedio), A14189Contmedio});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
                  if ( (pr_default.getStatus(14) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs, 99999999, (byte)(0), "@") ;
                     }
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
            loadSU41( ) ;
         }
         endLevelSU41( ) ;
      }
      closeExtendedTableCursorsSU41( ) ;
   }

   public void updateSU41( )
   {
      beforeValidateSU41( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSU41( ) ;
      }
      if ( ( nIsMod_41 != 0 ) || ( nIsDirty_41 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencySU41( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmSU41( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateSU41( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00SU17 */
                     pr_default.execute(15, new Object[] {Boolean.valueOf(n14174ContCtrl), A14174ContCtrl, Boolean.valueOf(n14177ContATEst), A14177ContATEst, Boolean.valueOf(n14178ContATTs), A14178ContATTs, Boolean.valueOf(n14179ContUltMov), Long.valueOf(A14179ContUltMov), Boolean.valueOf(n14180ContIDSeri), A14180ContIDSeri, Boolean.valueOf(n14181ContIDSerN), A14181ContIDSerN, Boolean.valueOf(n14182ContFcPrvU), A14182ContFcPrvU, Boolean.valueOf(n14176ContFecUti), A14176ContFecUti, Boolean.valueOf(n14183ContNumIni), Integer.valueOf(A14183ContNumIni), Boolean.valueOf(n14184ContAplica), Byte.valueOf(A14184ContAplica), Boolean.valueOf(n14185ContFecFUt), A14185ContFecFUt, Boolean.valueOf(n14187ContIdSerL), A14187ContIdSerL, Boolean.valueOf(n14186ContNumlas), Integer.valueOf(A14186ContNumlas), A314ContDsc, Integer.valueOf(A316ContVal), A7208ContDsc2, Long.valueOf(A1147ContVal2), A10270ContTp, Boolean.valueOf(n14172ContDoc), A14172ContDoc, Boolean.valueOf(n14173ContATCod), A14173ContATCod, Boolean.valueOf(n14175ContClaseD), A14175ContClaseD, Boolean.valueOf(n14188Contnumcer), A14188Contnumcer, Boolean.valueOf(n14189Contmedio), A14189Contmedio, A396EmprCod, A313ContCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
                     if ( (pr_default.getStatus(15) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPEMPLIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateSU41( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( ( O316ContVal != A316ContVal ) && true /* After */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs, 99999999, (byte)(0), "@") ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeySU41( ) ;
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
            endLevelSU41( ) ;
         }
      }
      closeExtendedTableCursorsSU41( ) ;
   }

   public void deferredUpdateSU41( )
   {
   }

   public void deleteSU41( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSU41( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySU41( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSU41( ) ;
         afterConfirmSU41( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSU41( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00SU18 */
               pr_default.execute(16, new Object[] {A396EmprCod, A313ContCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPEMPLIN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* After */ )
                  {
                     new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs, 99999999, (byte)(0), "@") ;
                  }
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
      sMode41 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSU41( ) ;
      Gx_mode = sMode41 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSU41( )
   {
      standaloneModalSU41( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( O316ContVal != A316ContVal ) && isUpd( )  )
         {
            AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Modificacion Valores,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor Anterior=", ""), "") + GXutil.str( O316ContVal, 8, 0) + httpContext.getMessage( httpContext.getMessage( " Valor Nuevo=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
         }
         else
         {
            if ( isDlt( )  )
            {
               AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Eliminacion,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
            }
            else
            {
               if ( isIns( )  )
               {
                  AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Alta,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
               }
            }
         }
      }
   }

   public void endLevelSU41( )
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

   public void scanStartSU41( )
   {
      /* Scan By routine */
      /* Using cursor T00SU19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound41 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A313ContCod = T00SU19_A313ContCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSU41( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound41 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound41 = (short)(1) ;
         A313ContCod = T00SU19_A313ContCod[0] ;
      }
   }

   public void scanEndSU41( )
   {
      pr_default.close(17);
   }

   public void afterConfirmSU41( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSU41( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSU41( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSU41( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSU41( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSU41( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSU41( )
   {
      edtContCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContDsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContVal_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContDsc2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContVal2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContVal2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContVal2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContTp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContTp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContCtrl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContCtrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCtrl_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContAplica_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContAplica_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContAplica_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContATCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContATEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATEst_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashesSU41( )
   {
   }

   public void send_integrity_lvl_hashesSU27( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
   }

   public void subsflControlProps_3241( )
   {
      edtContCod_Internalname = "CONTCOD_"+sGXsfl_32_idx ;
      edtContDsc_Internalname = "CONTDSC_"+sGXsfl_32_idx ;
      edtContVal_Internalname = "CONTVAL_"+sGXsfl_32_idx ;
      edtContDsc2_Internalname = "CONTDSC2_"+sGXsfl_32_idx ;
      edtContVal2_Internalname = "CONTVAL2_"+sGXsfl_32_idx ;
      edtContTp_Internalname = "CONTTP_"+sGXsfl_32_idx ;
      edtContCtrl_Internalname = "CONTCTRL_"+sGXsfl_32_idx ;
      edtContAplica_Internalname = "CONTAPLICA_"+sGXsfl_32_idx ;
      edtContATCod_Internalname = "CONTATCOD_"+sGXsfl_32_idx ;
      edtContATEst_Internalname = "CONTATEST_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_3241( )
   {
      edtContCod_Internalname = "CONTCOD_"+sGXsfl_32_fel_idx ;
      edtContDsc_Internalname = "CONTDSC_"+sGXsfl_32_fel_idx ;
      edtContVal_Internalname = "CONTVAL_"+sGXsfl_32_fel_idx ;
      edtContDsc2_Internalname = "CONTDSC2_"+sGXsfl_32_fel_idx ;
      edtContVal2_Internalname = "CONTVAL2_"+sGXsfl_32_fel_idx ;
      edtContTp_Internalname = "CONTTP_"+sGXsfl_32_fel_idx ;
      edtContCtrl_Internalname = "CONTCTRL_"+sGXsfl_32_fel_idx ;
      edtContAplica_Internalname = "CONTAPLICA_"+sGXsfl_32_fel_idx ;
      edtContATCod_Internalname = "CONTATCOD_"+sGXsfl_32_fel_idx ;
      edtContATEst_Internalname = "CONTATEST_"+sGXsfl_32_fel_idx ;
   }

   public void addRowSU41( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3241( ) ;
      sendRowSU41( ) ;
   }

   public void sendRowSU41( )
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
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_41_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContCod_Internalname,GXutil.rtrim( A313ContCod),GXutil.rtrim( localUtil.format( A313ContCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtContCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_41_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContDsc_Internalname,GXutil.rtrim( A314ContDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtContDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_41_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContVal_Internalname,GXutil.ltrim( localUtil.ntoc( A316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A316ContVal), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtContVal_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_41_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContDsc2_Internalname,GXutil.rtrim( A7208ContDsc2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContDsc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtContDsc2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_41_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContVal2_Internalname,GXutil.ltrim( localUtil.ntoc( A1147ContVal2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtContVal2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1147ContVal2), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1147ContVal2), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContVal2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtContVal2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_41_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContTp_Internalname,GXutil.rtrim( A10270ContTp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContTp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtContTp_Visible),Integer.valueOf(edtContTp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContCtrl_Internalname,GXutil.rtrim( A14174ContCtrl),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContCtrl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtContCtrl_Visible),Integer.valueOf(edtContCtrl_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContAplica_Internalname,GXutil.ltrim( localUtil.ntoc( A14184ContAplica, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtContAplica_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14184ContAplica), "9") : localUtil.format( DecimalUtil.doubleToDec(A14184ContAplica), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContAplica_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtContAplica_Visible),Integer.valueOf(edtContAplica_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContATCod_Internalname,GXutil.rtrim( A14173ContATCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContATCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtContATCod_Visible),Integer.valueOf(edtContATCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtContATEst_Internalname,GXutil.rtrim( A14177ContATEst),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtContATEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(edtContATEst_Visible),Integer.valueOf(edtContATEst_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesSU41( ) ;
      GXCCtl = "Z313ContCod_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z313ContCod));
      GXCCtl = "Z14174ContCtrl_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14174ContCtrl));
      GXCCtl = "Z14177ContATEst_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14177ContATEst));
      GXCCtl = "Z14178ContATTs_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14178ContATTs));
      GXCCtl = "Z14179ContUltMov_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14179ContUltMov, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14180ContIDSeri_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14180ContIDSeri));
      GXCCtl = "Z14181ContIDSerN_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14181ContIDSerN));
      GXCCtl = "Z14182ContFcPrvU_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z14182ContFcPrvU, 0, "/"));
      GXCCtl = "Z14176ContFecUti_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z14176ContFecUti, 0, "/"));
      GXCCtl = "Z14183ContNumIni_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14183ContNumIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14184ContAplica_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14184ContAplica, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14185ContFecFUt_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z14185ContFecFUt, 0, "/"));
      GXCCtl = "Z14187ContIdSerL_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14187ContIdSerL));
      GXCCtl = "Z14186ContNumlas_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14186ContNumlas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z314ContDsc_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z314ContDsc));
      GXCCtl = "Z316ContVal_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7208ContDsc2_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7208ContDsc2));
      GXCCtl = "Z1147ContVal2_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1147ContVal2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10270ContTp_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10270ContTp));
      GXCCtl = "Z14172ContDoc_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14172ContDoc));
      GXCCtl = "Z14173ContATCod_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14173ContATCod));
      GXCCtl = "Z14175ContClaseD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14175ContClaseD));
      GXCCtl = "Z14188Contnumcer_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14188Contnumcer));
      GXCCtl = "Z14189Contmedio_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14189Contmedio));
      GXCCtl = "O316ContVal_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_41_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_41_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_41_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_41, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N316ContVal_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A316ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_32_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV44TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV44TrnContext);
      }
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "CONTATTS_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A14178ContATTs));
      GXCCtl = "CONTULTMOV_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A14179ContUltMov, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "CONTIDSERI_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A14180ContIDSeri));
      GXCCtl = "CONTIDSERN_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A14181ContIDSerN));
      GXCCtl = "CONTFCPRVU_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( A14182ContFcPrvU, 0, "/"));
      GXCCtl = "CONTFECUTI_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( A14176ContFecUti, 0, "/"));
      GXCCtl = "CONTNUMINI_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A14183ContNumIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "CONTFECFUT_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( A14185ContFecFUt, 0, "/"));
      GXCCtl = "CONTIDSERL_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A14187ContIdSerL));
      GXCCtl = "CONTNUMLAS_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A14186ContNumlas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTDSC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTVAL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTDSC2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContDsc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTVAL2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContVal2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTTP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContTp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTTP_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContTp_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTCTRL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContCtrl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTCTRL_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContCtrl_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTAPLICA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContAplica_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTAPLICA_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContAplica_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTATCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContATCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTATCOD_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContATCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTATEST_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtContATEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTATEST_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( edtContATEst_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowSU41( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3241( ) ;
      edtContCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTDSC_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTVAL_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContDsc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTDSC2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContVal2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTVAL2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContTp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTTP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContTp_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTTP_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContCtrl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTCTRL_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContCtrl_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTCTRL_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContAplica_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTAPLICA_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContAplica_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTAPLICA_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContATCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTATCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContATCod_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTATCOD_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContATEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONTATEST_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtContATEst_Visible = (int)(localUtil.ctol( httpContext.cgiGet( "CONTATEST_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A313ContCod = GXutil.upper( httpContext.cgiGet( edtContCod_Internalname)) ;
      A314ContDsc = httpContext.cgiGet( edtContDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtContVal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtContVal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "CONTVAL_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtContVal_Internalname ;
         wbErr = true ;
         A316ContVal = 0 ;
      }
      else
      {
         A316ContVal = (int)(localUtil.ctol( httpContext.cgiGet( edtContVal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A7208ContDsc2 = httpContext.cgiGet( edtContDsc2_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtContVal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtContVal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "CONTVAL2_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtContVal2_Internalname ;
         wbErr = true ;
         A1147ContVal2 = 0 ;
      }
      else
      {
         A1147ContVal2 = localUtil.ctol( httpContext.cgiGet( edtContVal2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      A10270ContTp = httpContext.cgiGet( edtContTp_Internalname) ;
      A14174ContCtrl = httpContext.cgiGet( edtContCtrl_Internalname) ;
      n14174ContCtrl = false ;
      A14184ContAplica = (byte)(localUtil.ctol( httpContext.cgiGet( edtContAplica_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n14184ContAplica = false ;
      A14173ContATCod = httpContext.cgiGet( edtContATCod_Internalname) ;
      n14173ContATCod = false ;
      A14177ContATEst = httpContext.cgiGet( edtContATEst_Internalname) ;
      n14177ContATEst = false ;
      GXCCtl = "Z313ContCod_" + sGXsfl_32_idx ;
      Z313ContCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14174ContCtrl_" + sGXsfl_32_idx ;
      Z14174ContCtrl = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14177ContATEst_" + sGXsfl_32_idx ;
      Z14177ContATEst = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14178ContATTs_" + sGXsfl_32_idx ;
      Z14178ContATTs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14179ContUltMov_" + sGXsfl_32_idx ;
      Z14179ContUltMov = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z14180ContIDSeri_" + sGXsfl_32_idx ;
      Z14180ContIDSeri = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14181ContIDSerN_" + sGXsfl_32_idx ;
      Z14181ContIDSerN = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14182ContFcPrvU_" + sGXsfl_32_idx ;
      Z14182ContFcPrvU = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z14176ContFecUti_" + sGXsfl_32_idx ;
      Z14176ContFecUti = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z14183ContNumIni_" + sGXsfl_32_idx ;
      Z14183ContNumIni = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14184ContAplica_" + sGXsfl_32_idx ;
      Z14184ContAplica = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14185ContFecFUt_" + sGXsfl_32_idx ;
      Z14185ContFecFUt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z14187ContIdSerL_" + sGXsfl_32_idx ;
      Z14187ContIdSerL = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14186ContNumlas_" + sGXsfl_32_idx ;
      Z14186ContNumlas = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z314ContDsc_" + sGXsfl_32_idx ;
      Z314ContDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z316ContVal_" + sGXsfl_32_idx ;
      Z316ContVal = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7208ContDsc2_" + sGXsfl_32_idx ;
      Z7208ContDsc2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1147ContVal2_" + sGXsfl_32_idx ;
      Z1147ContVal2 = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z10270ContTp_" + sGXsfl_32_idx ;
      Z10270ContTp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14172ContDoc_" + sGXsfl_32_idx ;
      Z14172ContDoc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14173ContATCod_" + sGXsfl_32_idx ;
      Z14173ContATCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14175ContClaseD_" + sGXsfl_32_idx ;
      Z14175ContClaseD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14188Contnumcer_" + sGXsfl_32_idx ;
      Z14188Contnumcer = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14189Contmedio_" + sGXsfl_32_idx ;
      Z14189Contmedio = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14178ContATTs_" + sGXsfl_32_idx ;
      A14178ContATTs = httpContext.cgiGet( GXCCtl) ;
      n14178ContATTs = false ;
      GXCCtl = "Z14179ContUltMov_" + sGXsfl_32_idx ;
      A14179ContUltMov = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      n14179ContUltMov = false ;
      GXCCtl = "Z14180ContIDSeri_" + sGXsfl_32_idx ;
      A14180ContIDSeri = httpContext.cgiGet( GXCCtl) ;
      n14180ContIDSeri = false ;
      GXCCtl = "Z14181ContIDSerN_" + sGXsfl_32_idx ;
      A14181ContIDSerN = httpContext.cgiGet( GXCCtl) ;
      n14181ContIDSerN = false ;
      GXCCtl = "Z14182ContFcPrvU_" + sGXsfl_32_idx ;
      A14182ContFcPrvU = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      n14182ContFcPrvU = false ;
      GXCCtl = "Z14176ContFecUti_" + sGXsfl_32_idx ;
      A14176ContFecUti = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      n14176ContFecUti = false ;
      GXCCtl = "Z14183ContNumIni_" + sGXsfl_32_idx ;
      A14183ContNumIni = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n14183ContNumIni = false ;
      GXCCtl = "Z14185ContFecFUt_" + sGXsfl_32_idx ;
      A14185ContFecFUt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      n14185ContFecFUt = false ;
      GXCCtl = "Z14187ContIdSerL_" + sGXsfl_32_idx ;
      A14187ContIdSerL = httpContext.cgiGet( GXCCtl) ;
      n14187ContIdSerL = false ;
      GXCCtl = "Z14186ContNumlas_" + sGXsfl_32_idx ;
      A14186ContNumlas = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n14186ContNumlas = false ;
      GXCCtl = "Z14172ContDoc_" + sGXsfl_32_idx ;
      A14172ContDoc = httpContext.cgiGet( GXCCtl) ;
      n14172ContDoc = false ;
      GXCCtl = "Z14175ContClaseD_" + sGXsfl_32_idx ;
      A14175ContClaseD = httpContext.cgiGet( GXCCtl) ;
      n14175ContClaseD = false ;
      GXCCtl = "Z14188Contnumcer_" + sGXsfl_32_idx ;
      A14188Contnumcer = httpContext.cgiGet( GXCCtl) ;
      n14188Contnumcer = false ;
      GXCCtl = "Z14189Contmedio_" + sGXsfl_32_idx ;
      A14189Contmedio = httpContext.cgiGet( GXCCtl) ;
      n14189Contmedio = false ;
      GXCCtl = "O316ContVal_" + sGXsfl_32_idx ;
      O316ContVal = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_41_" + sGXsfl_32_idx ;
      nRcdDeleted_41 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_41_" + sGXsfl_32_idx ;
      nRcdExists_41 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_41_" + sGXsfl_32_idx ;
      nIsMod_41 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N316ContVal_" + sGXsfl_32_idx ;
      N316ContVal = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "CONTATTS_" + sGXsfl_32_idx ;
      A14178ContATTs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "CONTULTMOV_" + sGXsfl_32_idx ;
      A14179ContUltMov = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "CONTIDSERI_" + sGXsfl_32_idx ;
      A14180ContIDSeri = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "CONTIDSERN_" + sGXsfl_32_idx ;
      A14181ContIDSerN = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "CONTFCPRVU_" + sGXsfl_32_idx ;
      A14182ContFcPrvU = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "CONTFECUTI_" + sGXsfl_32_idx ;
      A14176ContFecUti = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "CONTNUMINI_" + sGXsfl_32_idx ;
      A14183ContNumIni = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "CONTFECFUT_" + sGXsfl_32_idx ;
      A14185ContFecFUt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "CONTIDSERL_" + sGXsfl_32_idx ;
      A14187ContIdSerL = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "CONTNUMLAS_" + sGXsfl_32_idx ;
      A14186ContNumlas = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtContATEst_Enabled = edtContATEst_Enabled ;
      defedtContATCod_Enabled = edtContATCod_Enabled ;
      defedtContAplica_Enabled = edtContAplica_Enabled ;
      defedtContCtrl_Enabled = edtContCtrl_Enabled ;
      defedtContVal_Enabled = edtContVal_Enabled ;
      defedtContCod_Enabled = edtContCod_Enabled ;
   }

   public void confirmValuesSU0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3241( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3241( ) ;
         httpContext.changePostValue( "Z313ContCod_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z313ContCod_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z313ContCod_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14174ContCtrl_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14174ContCtrl_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14174ContCtrl_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14177ContATEst_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14177ContATEst_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14177ContATEst_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14178ContATTs_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14178ContATTs_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14178ContATTs_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14179ContUltMov_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14179ContUltMov_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14179ContUltMov_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14180ContIDSeri_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14180ContIDSeri_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14180ContIDSeri_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14181ContIDSerN_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14181ContIDSerN_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14181ContIDSerN_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14182ContFcPrvU_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14182ContFcPrvU_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14182ContFcPrvU_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14176ContFecUti_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14176ContFecUti_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14176ContFecUti_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14183ContNumIni_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14183ContNumIni_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14183ContNumIni_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14184ContAplica_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14184ContAplica_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14184ContAplica_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14185ContFecFUt_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14185ContFecFUt_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14185ContFecFUt_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14187ContIdSerL_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14187ContIdSerL_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14187ContIdSerL_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14186ContNumlas_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14186ContNumlas_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14186ContNumlas_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z314ContDsc_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z314ContDsc_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z314ContDsc_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z316ContVal_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z316ContVal_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z316ContVal_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z7208ContDsc2_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z7208ContDsc2_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7208ContDsc2_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z1147ContVal2_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z1147ContVal2_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1147ContVal2_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z10270ContTp_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z10270ContTp_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10270ContTp_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14172ContDoc_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14172ContDoc_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14172ContDoc_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14173ContATCod_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14173ContATCod_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14173ContATCod_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14175ContClaseD_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14175ContClaseD_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14175ContClaseD_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14188Contnumcer_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14188Contnumcer_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14188Contnumcer_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14189Contmedio_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14189Contmedio_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14189Contmedio_"+sGXsfl_32_idx) ;
      }
      httpContext.changePostValue( "O316ContVal", httpContext.cgiGet( "T316ContVal")) ;
      httpContext.deletePostValue( "T316ContVal") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.temppar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36EmprNom))}, new String[] {"Gx_mode","EmprCod","EmprNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TEMPPAR");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("EmprNom", GXutil.rtrim( localUtil.format( A407EmprNom, "")));
      forbiddenHiddens.add("EmpNumDec", localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("temppar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( Z3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV44TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV44TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV44TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV46Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV42Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "CONTATTS", GXutil.rtrim( A14178ContATTs));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTULTMOV", GXutil.ltrim( localUtil.ntoc( A14179ContUltMov, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTIDSERI", GXutil.rtrim( A14180ContIDSeri));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTIDSERN", GXutil.rtrim( A14181ContIDSerN));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTFCPRVU", localUtil.dtoc( A14182ContFcPrvU, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTFECUTI", localUtil.dtoc( A14176ContFecUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTNUMINI", GXutil.ltrim( localUtil.ntoc( A14183ContNumIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTFECFUT", localUtil.dtoc( A14185ContFecFUt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTIDSERL", GXutil.rtrim( A14187ContIdSerL));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTNUMLAS", GXutil.ltrim( localUtil.ntoc( A14186ContNumlas, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV29UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV37Station));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTDOC", GXutil.rtrim( A14172ContDoc));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTCLASED", GXutil.rtrim( A14175ContClaseD));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTNUMCER", GXutil.rtrim( A14188Contnumcer));
      app.GxWebStd.gx_hidden_field( httpContext, "CONTMEDIO", GXutil.rtrim( A14189Contmedio));
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
      return formatLink("app.temppar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV36EmprNom))}, new String[] {"Gx_mode","EmprCod","EmprNom"})  ;
   }

   public String getPgmname( )
   {
      return "TEMPPAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS EMPRESA", "") ;
   }

   public void initializeNonKeySU27( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      Z407EmprNom = "" ;
      Z3915EmpNumDec = (byte)(0) ;
   }

   public void initAllSU27( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      initializeNonKeySU27( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeySU41( )
   {
      AV42Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
      A314ContDsc = "" ;
      A316ContVal = 0 ;
      A7208ContDsc2 = "" ;
      A1147ContVal2 = 0 ;
      A10270ContTp = "" ;
      A14172ContDoc = "" ;
      n14172ContDoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14172ContDoc", A14172ContDoc);
      A14173ContATCod = "" ;
      n14173ContATCod = false ;
      A14175ContClaseD = "" ;
      n14175ContClaseD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14175ContClaseD", A14175ContClaseD);
      A14188Contnumcer = "" ;
      n14188Contnumcer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14188Contnumcer", A14188Contnumcer);
      A14189Contmedio = "" ;
      n14189Contmedio = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14189Contmedio", A14189Contmedio);
      A14174ContCtrl = httpContext.getMessage( "N", "") ;
      n14174ContCtrl = false ;
      A14177ContATEst = " " ;
      n14177ContATEst = false ;
      A14178ContATTs = " " ;
      n14178ContATTs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14178ContATTs", A14178ContATTs);
      A14179ContUltMov = 0 ;
      n14179ContUltMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14179ContUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14179ContUltMov), 12, 0));
      A14180ContIDSeri = "" ;
      n14180ContIDSeri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14180ContIDSeri", A14180ContIDSeri);
      A14181ContIDSerN = "" ;
      n14181ContIDSerN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14181ContIDSerN", A14181ContIDSerN);
      A14182ContFcPrvU = GXutil.nullDate() ;
      n14182ContFcPrvU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14182ContFcPrvU", localUtil.format(A14182ContFcPrvU, "99/99/99"));
      A14176ContFecUti = GXutil.nullDate() ;
      n14176ContFecUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14176ContFecUti", localUtil.format(A14176ContFecUti, "99/99/99"));
      A14183ContNumIni = 0 ;
      n14183ContNumIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14183ContNumIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14183ContNumIni), 8, 0));
      A14184ContAplica = (byte)(0) ;
      n14184ContAplica = false ;
      A14185ContFecFUt = GXutil.nullDate() ;
      n14185ContFecFUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14185ContFecFUt", localUtil.format(A14185ContFecFUt, "99/99/99"));
      A14187ContIdSerL = " " ;
      n14187ContIdSerL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14187ContIdSerL", A14187ContIdSerL);
      A14186ContNumlas = 0 ;
      n14186ContNumlas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14186ContNumlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14186ContNumlas), 8, 0));
      O316ContVal = A316ContVal ;
      Z14174ContCtrl = "" ;
      Z14177ContATEst = "" ;
      Z14178ContATTs = "" ;
      Z14179ContUltMov = 0 ;
      Z14180ContIDSeri = "" ;
      Z14181ContIDSerN = "" ;
      Z14182ContFcPrvU = GXutil.nullDate() ;
      Z14176ContFecUti = GXutil.nullDate() ;
      Z14183ContNumIni = 0 ;
      Z14184ContAplica = (byte)(0) ;
      Z14185ContFecFUt = GXutil.nullDate() ;
      Z14187ContIdSerL = "" ;
      Z14186ContNumlas = 0 ;
      Z314ContDsc = "" ;
      Z316ContVal = 0 ;
      Z7208ContDsc2 = "" ;
      Z1147ContVal2 = 0 ;
      Z10270ContTp = "" ;
      Z14172ContDoc = "" ;
      Z14173ContATCod = "" ;
      Z14175ContClaseD = "" ;
      Z14188Contnumcer = "" ;
      Z14189Contmedio = "" ;
   }

   public void initAllSU41( )
   {
      A313ContCod = "" ;
      initializeNonKeySU41( ) ;
   }

   public void standaloneModalInsertSU41( )
   {
      A14174ContCtrl = i14174ContCtrl ;
      n14174ContCtrl = false ;
      A14177ContATEst = i14177ContATEst ;
      n14177ContATEst = false ;
      A14178ContATTs = i14178ContATTs ;
      n14178ContATTs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14178ContATTs", A14178ContATTs);
      A14179ContUltMov = i14179ContUltMov ;
      n14179ContUltMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14179ContUltMov", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14179ContUltMov), 12, 0));
      A14180ContIDSeri = i14180ContIDSeri ;
      n14180ContIDSeri = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14180ContIDSeri", A14180ContIDSeri);
      A14181ContIDSerN = i14181ContIDSerN ;
      n14181ContIDSerN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14181ContIDSerN", A14181ContIDSerN);
      A14182ContFcPrvU = i14182ContFcPrvU ;
      n14182ContFcPrvU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14182ContFcPrvU", localUtil.format(A14182ContFcPrvU, "99/99/99"));
      A14176ContFecUti = i14176ContFecUti ;
      n14176ContFecUti = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14176ContFecUti", localUtil.format(A14176ContFecUti, "99/99/99"));
      A14183ContNumIni = i14183ContNumIni ;
      n14183ContNumIni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14183ContNumIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14183ContNumIni), 8, 0));
      A14184ContAplica = i14184ContAplica ;
      n14184ContAplica = false ;
      A14185ContFecFUt = i14185ContFecFUt ;
      n14185ContFecFUt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14185ContFecFUt", localUtil.format(A14185ContFecFUt, "99/99/99"));
      A14187ContIdSerL = i14187ContIdSerL ;
      n14187ContIdSerL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14187ContIdSerL", A14187ContIdSerL);
      A14186ContNumlas = i14186ContNumlas ;
      n14186ContNumlas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14186ContNumlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14186ContNumlas), 8, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241524754", true, true);
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
      httpContext.AddJavascriptSource("temppar.js", "?20268241524754", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties41( )
   {
      edtContATEst_Enabled = defedtContATEst_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATEst_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContATCod_Enabled = defedtContATCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContAplica_Enabled = defedtContAplica_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtContAplica_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContAplica_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContCtrl_Enabled = defedtContCtrl_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtContCtrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCtrl_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContVal_Enabled = defedtContVal_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtContVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContVal_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtContCod_Enabled = defedtContCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtContCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void startgridcontrol32( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A313ContCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A314ContDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A316ContVal, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A7208ContDsc2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContDsc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1147ContVal2, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContVal2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10270ContTp));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContTp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtContTp_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14174ContCtrl));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContCtrl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtContCtrl_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14184ContAplica, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContAplica_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtContAplica_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14173ContATCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContATCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtContATCod_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14177ContATEst));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtContATEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtContATEst_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavEmprcod_Internalname = "vEMPRCOD" ;
      edtavEmprnom_Internalname = "vEMPRNOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtContCod_Internalname = "CONTCOD" ;
      edtContDsc_Internalname = "CONTDSC" ;
      edtContVal_Internalname = "CONTVAL" ;
      edtContDsc2_Internalname = "CONTDSC2" ;
      edtContVal2_Internalname = "CONTVAL2" ;
      edtContTp_Internalname = "CONTTP" ;
      edtContCtrl_Internalname = "CONTCTRL" ;
      edtContAplica_Internalname = "CONTAPLICA" ;
      edtContATCod_Internalname = "CONTATCOD" ;
      edtContATEst_Internalname = "CONTATEST" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS EMPRESA", "") );
      edtContATEst_Jsonclick = "" ;
      edtContATCod_Jsonclick = "" ;
      edtContAplica_Jsonclick = "" ;
      edtContCtrl_Jsonclick = "" ;
      edtContTp_Jsonclick = "" ;
      edtContVal2_Jsonclick = "" ;
      edtContDsc2_Jsonclick = "" ;
      edtContVal_Jsonclick = "" ;
      edtContDsc_Jsonclick = "" ;
      edtContCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtContATEst_Visible = -1 ;
      edtContATEst_Enabled = 0 ;
      edtContATCod_Visible = -1 ;
      edtContATCod_Enabled = 0 ;
      edtContAplica_Visible = -1 ;
      edtContAplica_Enabled = 0 ;
      edtContCtrl_Visible = -1 ;
      edtContCtrl_Enabled = 0 ;
      edtContTp_Enabled = 1 ;
      edtContVal2_Enabled = 1 ;
      edtContDsc2_Enabled = 1 ;
      edtContVal_Enabled = 1 ;
      edtContDsc_Enabled = 1 ;
      edtContCod_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtavEmprnom_Jsonclick = "" ;
      edtavEmprnom_Enabled = 0 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
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
      edtContTp_Visible = -1 ;
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

   public void gxasa14174SU27( String AV35EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, "100001", GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      edtContCtrl_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContCtrl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContCtrl_Visible), 5, 0), !bGXsfl_32_Refreshing);
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

   public void gxasa14184SU27( String AV35EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, "100001", GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      edtContAplica_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContAplica_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContAplica_Visible), 5, 0), !bGXsfl_32_Refreshing);
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

   public void gxasa14173SU27( String AV35EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, "100001", GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      edtContATCod_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATCod_Visible), 5, 0), !bGXsfl_32_Refreshing);
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

   public void gxasa14177SU27( String AV35EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV35EmprCod, "100001", GXv_int6) ;
      temppar_impl.this.GXt_int5 = GXv_int6[0] ;
      edtContATEst_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtContATEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtContATEst_Visible), 5, 0), !bGXsfl_32_Refreshing);
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

   public void xc_28_SU41( String A396EmprCod ,
                           String AV46Pgmname ,
                           String AV29UsurCod ,
                           String AV37Station ,
                           String AV42Inc_obs ,
                           int A316ContVal )
   {
      if ( ( O316ContVal != A316ContVal ) && true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs, 99999999, (byte)(0), "@") ;
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

   public void xc_29_SU41( String A396EmprCod ,
                           String AV46Pgmname ,
                           String AV29UsurCod ,
                           String AV37Station ,
                           String AV42Inc_obs )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs, 99999999, (byte)(0), "@") ;
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

   public void xc_30_SU41( String A396EmprCod ,
                           String AV46Pgmname ,
                           String AV29UsurCod ,
                           String AV37Station ,
                           String AV42Inc_obs )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV46Pgmname, AV29UsurCod, AV37Station, AV42Inc_obs, 99999999, (byte)(0), "@") ;
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
      subsflControlProps_3241( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalSU41( ) ;
         standaloneModalSU41( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowSU41( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3241( ) ;
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

   public void valid_Contval( )
   {
      n14173ContATCod = false ;
      n14177ContATEst = false ;
      if ( ( O316ContVal != A316ContVal ) && isUpd( )  )
      {
         AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Modificacion Valores,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor Anterior=", ""), "") + GXutil.str( O316ContVal, 8, 0) + httpContext.getMessage( httpContext.getMessage( " Valor Nuevo=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
      }
      else
      {
         if ( isDlt( )  )
         {
            AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Eliminacion,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
         }
         else
         {
            if ( isIns( )  )
            {
               AV42Inc_obs = httpContext.getMessage( httpContext.getMessage( "Alta,Codigo=", ""), "") + A313ContCod + httpContext.getMessage( httpContext.getMessage( " Valor=", ""), "") + GXutil.str( A316ContVal, 8, 0) ;
            }
         }
      }
      if ( ! (GXutil.strcmp("", A14173ContATCod)==0) && ( A316ContVal != O316ContVal ) && ( GXutil.strcmp(A14177ContATEst, httpContext.getMessage( "A", "")) == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. Você NÃO pode modificar o valor do contador, ele tem um código de validação, ", "")+GXutil.trim( A14173ContATCod), 1, "CONTVAL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtContVal_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV42Inc_obs", AV42Inc_obs);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36EmprNom',fld:'vEMPRNOM',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV44TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12SU2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV44TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CONTCOD","{handler:'valid_Contcod',iparms:[]");
      setEventMetadata("VALID_CONTCOD",",oparms:[]}");
      setEventMetadata("VALID_CONTVAL","{handler:'valid_Contval',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O316ContVal'},{av:'A313ContCod',fld:'CONTCOD',pic:'@!'},{av:'A316ContVal',fld:'CONTVAL',pic:'ZZZZZZZ9'},{av:'A14173ContATCod',fld:'CONTATCOD',pic:''},{av:'A14177ContATEst',fld:'CONTATEST',pic:''},{av:'AV42Inc_obs',fld:'vINC_OBS',pic:''}]");
      setEventMetadata("VALID_CONTVAL",",oparms:[{av:'AV42Inc_obs',fld:'vINC_OBS',pic:''}]}");
      setEventMetadata("VALID_CONTATCOD","{handler:'valid_Contatcod',iparms:[]");
      setEventMetadata("VALID_CONTATCOD",",oparms:[]}");
      setEventMetadata("VALID_CONTATEST","{handler:'valid_Contatest',iparms:[]");
      setEventMetadata("VALID_CONTATEST",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV35EmprCod = "" ;
      wcpOAV36EmprNom = "" ;
      Z396EmprCod = "" ;
      Z407EmprNom = "" ;
      Z313ContCod = "" ;
      Z14174ContCtrl = "" ;
      Z14177ContATEst = "" ;
      Z14178ContATTs = "" ;
      Z14180ContIDSeri = "" ;
      Z14181ContIDSerN = "" ;
      Z14182ContFcPrvU = GXutil.nullDate() ;
      Z14176ContFecUti = GXutil.nullDate() ;
      Z14185ContFecFUt = GXutil.nullDate() ;
      Z14187ContIdSerL = "" ;
      Z314ContDsc = "" ;
      Z7208ContDsc2 = "" ;
      Z10270ContTp = "" ;
      Z14172ContDoc = "" ;
      Z14173ContATCod = "" ;
      Z14175ContClaseD = "" ;
      Z14188Contnumcer = "" ;
      Z14189Contmedio = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV46Pgmname = "" ;
      AV29UsurCod = "" ;
      AV37Station = "" ;
      AV42Inc_obs = "" ;
      AV35EmprCod = "" ;
      Gx_mode = "" ;
      AV36EmprNom = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode41 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A14178ContATTs = "" ;
      A14180ContIDSeri = "" ;
      A14181ContIDSerN = "" ;
      A14182ContFcPrvU = GXutil.nullDate() ;
      A14176ContFecUti = GXutil.nullDate() ;
      A14185ContFecFUt = GXutil.nullDate() ;
      A14187ContIdSerL = "" ;
      A14172ContDoc = "" ;
      A14175ContClaseD = "" ;
      A14188Contnumcer = "" ;
      A14189Contmedio = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode27 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A313ContCod = "" ;
      A314ContDsc = "" ;
      A7208ContDsc2 = "" ;
      A10270ContTp = "" ;
      A14174ContCtrl = "" ;
      A14173ContATCod = "" ;
      A14177ContATEst = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV43WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV44TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV45WebSession = httpContext.getWebSession();
      T00SU6_A396EmprCod = new String[] {""} ;
      T00SU6_A407EmprNom = new String[] {""} ;
      T00SU6_n407EmprNom = new boolean[] {false} ;
      T00SU6_A3915EmpNumDec = new byte[1] ;
      T00SU6_n3915EmpNumDec = new boolean[] {false} ;
      T00SU7_A396EmprCod = new String[] {""} ;
      T00SU5_A396EmprCod = new String[] {""} ;
      T00SU5_A407EmprNom = new String[] {""} ;
      T00SU5_n407EmprNom = new boolean[] {false} ;
      T00SU5_A3915EmpNumDec = new byte[1] ;
      T00SU5_n3915EmpNumDec = new boolean[] {false} ;
      T00SU8_A396EmprCod = new String[] {""} ;
      T00SU9_A396EmprCod = new String[] {""} ;
      T00SU4_A396EmprCod = new String[] {""} ;
      T00SU4_A407EmprNom = new String[] {""} ;
      T00SU4_n407EmprNom = new boolean[] {false} ;
      T00SU4_A3915EmpNumDec = new byte[1] ;
      T00SU4_n3915EmpNumDec = new boolean[] {false} ;
      T00SU13_A396EmprCod = new String[] {""} ;
      T00SU14_A396EmprCod = new String[] {""} ;
      T00SU14_A313ContCod = new String[] {""} ;
      T00SU14_A14174ContCtrl = new String[] {""} ;
      T00SU14_n14174ContCtrl = new boolean[] {false} ;
      T00SU14_A14177ContATEst = new String[] {""} ;
      T00SU14_n14177ContATEst = new boolean[] {false} ;
      T00SU14_A14178ContATTs = new String[] {""} ;
      T00SU14_n14178ContATTs = new boolean[] {false} ;
      T00SU14_A14179ContUltMov = new long[1] ;
      T00SU14_n14179ContUltMov = new boolean[] {false} ;
      T00SU14_A14180ContIDSeri = new String[] {""} ;
      T00SU14_n14180ContIDSeri = new boolean[] {false} ;
      T00SU14_A14181ContIDSerN = new String[] {""} ;
      T00SU14_n14181ContIDSerN = new boolean[] {false} ;
      T00SU14_A14182ContFcPrvU = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU14_n14182ContFcPrvU = new boolean[] {false} ;
      T00SU14_A14176ContFecUti = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU14_n14176ContFecUti = new boolean[] {false} ;
      T00SU14_A14183ContNumIni = new int[1] ;
      T00SU14_n14183ContNumIni = new boolean[] {false} ;
      T00SU14_A14184ContAplica = new byte[1] ;
      T00SU14_n14184ContAplica = new boolean[] {false} ;
      T00SU14_A14185ContFecFUt = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU14_n14185ContFecFUt = new boolean[] {false} ;
      T00SU14_A14187ContIdSerL = new String[] {""} ;
      T00SU14_n14187ContIdSerL = new boolean[] {false} ;
      T00SU14_A14186ContNumlas = new int[1] ;
      T00SU14_n14186ContNumlas = new boolean[] {false} ;
      T00SU14_A314ContDsc = new String[] {""} ;
      T00SU14_A316ContVal = new int[1] ;
      T00SU14_A7208ContDsc2 = new String[] {""} ;
      T00SU14_A1147ContVal2 = new long[1] ;
      T00SU14_A10270ContTp = new String[] {""} ;
      T00SU14_A14172ContDoc = new String[] {""} ;
      T00SU14_n14172ContDoc = new boolean[] {false} ;
      T00SU14_A14173ContATCod = new String[] {""} ;
      T00SU14_n14173ContATCod = new boolean[] {false} ;
      T00SU14_A14175ContClaseD = new String[] {""} ;
      T00SU14_n14175ContClaseD = new boolean[] {false} ;
      T00SU14_A14188Contnumcer = new String[] {""} ;
      T00SU14_n14188Contnumcer = new boolean[] {false} ;
      T00SU14_A14189Contmedio = new String[] {""} ;
      T00SU14_n14189Contmedio = new boolean[] {false} ;
      T00SU15_A396EmprCod = new String[] {""} ;
      T00SU15_A313ContCod = new String[] {""} ;
      T00SU3_A396EmprCod = new String[] {""} ;
      T00SU3_A313ContCod = new String[] {""} ;
      T00SU3_A14174ContCtrl = new String[] {""} ;
      T00SU3_n14174ContCtrl = new boolean[] {false} ;
      T00SU3_A14177ContATEst = new String[] {""} ;
      T00SU3_n14177ContATEst = new boolean[] {false} ;
      T00SU3_A14178ContATTs = new String[] {""} ;
      T00SU3_n14178ContATTs = new boolean[] {false} ;
      T00SU3_A14179ContUltMov = new long[1] ;
      T00SU3_n14179ContUltMov = new boolean[] {false} ;
      T00SU3_A14180ContIDSeri = new String[] {""} ;
      T00SU3_n14180ContIDSeri = new boolean[] {false} ;
      T00SU3_A14181ContIDSerN = new String[] {""} ;
      T00SU3_n14181ContIDSerN = new boolean[] {false} ;
      T00SU3_A14182ContFcPrvU = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU3_n14182ContFcPrvU = new boolean[] {false} ;
      T00SU3_A14176ContFecUti = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU3_n14176ContFecUti = new boolean[] {false} ;
      T00SU3_A14183ContNumIni = new int[1] ;
      T00SU3_n14183ContNumIni = new boolean[] {false} ;
      T00SU3_A14184ContAplica = new byte[1] ;
      T00SU3_n14184ContAplica = new boolean[] {false} ;
      T00SU3_A14185ContFecFUt = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU3_n14185ContFecFUt = new boolean[] {false} ;
      T00SU3_A14187ContIdSerL = new String[] {""} ;
      T00SU3_n14187ContIdSerL = new boolean[] {false} ;
      T00SU3_A14186ContNumlas = new int[1] ;
      T00SU3_n14186ContNumlas = new boolean[] {false} ;
      T00SU3_A314ContDsc = new String[] {""} ;
      T00SU3_A316ContVal = new int[1] ;
      T00SU3_A7208ContDsc2 = new String[] {""} ;
      T00SU3_A1147ContVal2 = new long[1] ;
      T00SU3_A10270ContTp = new String[] {""} ;
      T00SU3_A14172ContDoc = new String[] {""} ;
      T00SU3_n14172ContDoc = new boolean[] {false} ;
      T00SU3_A14173ContATCod = new String[] {""} ;
      T00SU3_n14173ContATCod = new boolean[] {false} ;
      T00SU3_A14175ContClaseD = new String[] {""} ;
      T00SU3_n14175ContClaseD = new boolean[] {false} ;
      T00SU3_A14188Contnumcer = new String[] {""} ;
      T00SU3_n14188Contnumcer = new boolean[] {false} ;
      T00SU3_A14189Contmedio = new String[] {""} ;
      T00SU3_n14189Contmedio = new boolean[] {false} ;
      T00SU2_A396EmprCod = new String[] {""} ;
      T00SU2_A313ContCod = new String[] {""} ;
      T00SU2_A14174ContCtrl = new String[] {""} ;
      T00SU2_n14174ContCtrl = new boolean[] {false} ;
      T00SU2_A14177ContATEst = new String[] {""} ;
      T00SU2_n14177ContATEst = new boolean[] {false} ;
      T00SU2_A14178ContATTs = new String[] {""} ;
      T00SU2_n14178ContATTs = new boolean[] {false} ;
      T00SU2_A14179ContUltMov = new long[1] ;
      T00SU2_n14179ContUltMov = new boolean[] {false} ;
      T00SU2_A14180ContIDSeri = new String[] {""} ;
      T00SU2_n14180ContIDSeri = new boolean[] {false} ;
      T00SU2_A14181ContIDSerN = new String[] {""} ;
      T00SU2_n14181ContIDSerN = new boolean[] {false} ;
      T00SU2_A14182ContFcPrvU = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU2_n14182ContFcPrvU = new boolean[] {false} ;
      T00SU2_A14176ContFecUti = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU2_n14176ContFecUti = new boolean[] {false} ;
      T00SU2_A14183ContNumIni = new int[1] ;
      T00SU2_n14183ContNumIni = new boolean[] {false} ;
      T00SU2_A14184ContAplica = new byte[1] ;
      T00SU2_n14184ContAplica = new boolean[] {false} ;
      T00SU2_A14185ContFecFUt = new java.util.Date[] {GXutil.nullDate()} ;
      T00SU2_n14185ContFecFUt = new boolean[] {false} ;
      T00SU2_A14187ContIdSerL = new String[] {""} ;
      T00SU2_n14187ContIdSerL = new boolean[] {false} ;
      T00SU2_A14186ContNumlas = new int[1] ;
      T00SU2_n14186ContNumlas = new boolean[] {false} ;
      T00SU2_A314ContDsc = new String[] {""} ;
      T00SU2_A316ContVal = new int[1] ;
      T00SU2_A7208ContDsc2 = new String[] {""} ;
      T00SU2_A1147ContVal2 = new long[1] ;
      T00SU2_A10270ContTp = new String[] {""} ;
      T00SU2_A14172ContDoc = new String[] {""} ;
      T00SU2_n14172ContDoc = new boolean[] {false} ;
      T00SU2_A14173ContATCod = new String[] {""} ;
      T00SU2_n14173ContATCod = new boolean[] {false} ;
      T00SU2_A14175ContClaseD = new String[] {""} ;
      T00SU2_n14175ContClaseD = new boolean[] {false} ;
      T00SU2_A14188Contnumcer = new String[] {""} ;
      T00SU2_n14188Contnumcer = new boolean[] {false} ;
      T00SU2_A14189Contmedio = new String[] {""} ;
      T00SU2_n14189Contmedio = new boolean[] {false} ;
      T00SU19_A396EmprCod = new String[] {""} ;
      T00SU19_A313ContCod = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i14174ContCtrl = "" ;
      i14177ContATEst = "" ;
      i14178ContATTs = "" ;
      i14180ContIDSeri = "" ;
      i14181ContIDSerN = "" ;
      i14182ContFcPrvU = GXutil.nullDate() ;
      i14176ContFecUti = GXutil.nullDate() ;
      i14185ContFecFUt = GXutil.nullDate() ;
      i14187ContIdSerL = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_int6 = new byte[1] ;
      ZV42Inc_obs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.temppar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.temppar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.temppar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.temppar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.temppar__default(),
         new Object[] {
             new Object[] {
            T00SU2_A396EmprCod, T00SU2_A313ContCod, T00SU2_A14174ContCtrl, T00SU2_n14174ContCtrl, T00SU2_A14177ContATEst, T00SU2_n14177ContATEst, T00SU2_A14178ContATTs, T00SU2_n14178ContATTs, T00SU2_A14179ContUltMov, T00SU2_n14179ContUltMov,
            T00SU2_A14180ContIDSeri, T00SU2_n14180ContIDSeri, T00SU2_A14181ContIDSerN, T00SU2_n14181ContIDSerN, T00SU2_A14182ContFcPrvU, T00SU2_n14182ContFcPrvU, T00SU2_A14176ContFecUti, T00SU2_n14176ContFecUti, T00SU2_A14183ContNumIni, T00SU2_n14183ContNumIni,
            T00SU2_A14184ContAplica, T00SU2_n14184ContAplica, T00SU2_A14185ContFecFUt, T00SU2_n14185ContFecFUt, T00SU2_A14187ContIdSerL, T00SU2_n14187ContIdSerL, T00SU2_A14186ContNumlas, T00SU2_n14186ContNumlas, T00SU2_A314ContDsc, T00SU2_A316ContVal,
            T00SU2_A7208ContDsc2, T00SU2_A1147ContVal2, T00SU2_A10270ContTp, T00SU2_A14172ContDoc, T00SU2_n14172ContDoc, T00SU2_A14173ContATCod, T00SU2_n14173ContATCod, T00SU2_A14175ContClaseD, T00SU2_n14175ContClaseD, T00SU2_A14188Contnumcer,
            T00SU2_n14188Contnumcer, T00SU2_A14189Contmedio, T00SU2_n14189Contmedio
            }
            , new Object[] {
            T00SU3_A396EmprCod, T00SU3_A313ContCod, T00SU3_A14174ContCtrl, T00SU3_n14174ContCtrl, T00SU3_A14177ContATEst, T00SU3_n14177ContATEst, T00SU3_A14178ContATTs, T00SU3_n14178ContATTs, T00SU3_A14179ContUltMov, T00SU3_n14179ContUltMov,
            T00SU3_A14180ContIDSeri, T00SU3_n14180ContIDSeri, T00SU3_A14181ContIDSerN, T00SU3_n14181ContIDSerN, T00SU3_A14182ContFcPrvU, T00SU3_n14182ContFcPrvU, T00SU3_A14176ContFecUti, T00SU3_n14176ContFecUti, T00SU3_A14183ContNumIni, T00SU3_n14183ContNumIni,
            T00SU3_A14184ContAplica, T00SU3_n14184ContAplica, T00SU3_A14185ContFecFUt, T00SU3_n14185ContFecFUt, T00SU3_A14187ContIdSerL, T00SU3_n14187ContIdSerL, T00SU3_A14186ContNumlas, T00SU3_n14186ContNumlas, T00SU3_A314ContDsc, T00SU3_A316ContVal,
            T00SU3_A7208ContDsc2, T00SU3_A1147ContVal2, T00SU3_A10270ContTp, T00SU3_A14172ContDoc, T00SU3_n14172ContDoc, T00SU3_A14173ContATCod, T00SU3_n14173ContATCod, T00SU3_A14175ContClaseD, T00SU3_n14175ContClaseD, T00SU3_A14188Contnumcer,
            T00SU3_n14188Contnumcer, T00SU3_A14189Contmedio, T00SU3_n14189Contmedio
            }
            , new Object[] {
            T00SU4_A396EmprCod, T00SU4_A407EmprNom, T00SU4_n407EmprNom, T00SU4_A3915EmpNumDec, T00SU4_n3915EmpNumDec
            }
            , new Object[] {
            T00SU5_A396EmprCod, T00SU5_A407EmprNom, T00SU5_n407EmprNom, T00SU5_A3915EmpNumDec, T00SU5_n3915EmpNumDec
            }
            , new Object[] {
            T00SU6_A396EmprCod, T00SU6_A407EmprNom, T00SU6_n407EmprNom, T00SU6_A3915EmpNumDec, T00SU6_n3915EmpNumDec
            }
            , new Object[] {
            T00SU7_A396EmprCod
            }
            , new Object[] {
            T00SU8_A396EmprCod
            }
            , new Object[] {
            T00SU9_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SU13_A396EmprCod
            }
            , new Object[] {
            T00SU14_A396EmprCod, T00SU14_A313ContCod, T00SU14_A14174ContCtrl, T00SU14_n14174ContCtrl, T00SU14_A14177ContATEst, T00SU14_n14177ContATEst, T00SU14_A14178ContATTs, T00SU14_n14178ContATTs, T00SU14_A14179ContUltMov, T00SU14_n14179ContUltMov,
            T00SU14_A14180ContIDSeri, T00SU14_n14180ContIDSeri, T00SU14_A14181ContIDSerN, T00SU14_n14181ContIDSerN, T00SU14_A14182ContFcPrvU, T00SU14_n14182ContFcPrvU, T00SU14_A14176ContFecUti, T00SU14_n14176ContFecUti, T00SU14_A14183ContNumIni, T00SU14_n14183ContNumIni,
            T00SU14_A14184ContAplica, T00SU14_n14184ContAplica, T00SU14_A14185ContFecFUt, T00SU14_n14185ContFecFUt, T00SU14_A14187ContIdSerL, T00SU14_n14187ContIdSerL, T00SU14_A14186ContNumlas, T00SU14_n14186ContNumlas, T00SU14_A314ContDsc, T00SU14_A316ContVal,
            T00SU14_A7208ContDsc2, T00SU14_A1147ContVal2, T00SU14_A10270ContTp, T00SU14_A14172ContDoc, T00SU14_n14172ContDoc, T00SU14_A14173ContATCod, T00SU14_n14173ContATCod, T00SU14_A14175ContClaseD, T00SU14_n14175ContClaseD, T00SU14_A14188Contnumcer,
            T00SU14_n14188Contnumcer, T00SU14_A14189Contmedio, T00SU14_n14189Contmedio
            }
            , new Object[] {
            T00SU15_A396EmprCod, T00SU15_A313ContCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SU19_A396EmprCod, T00SU19_A313ContCod
            }
         }
      );
      Z14186ContNumlas = 0 ;
      n14186ContNumlas = false ;
      A14186ContNumlas = 0 ;
      n14186ContNumlas = false ;
      i14186ContNumlas = 0 ;
      n14186ContNumlas = false ;
      Z14187ContIdSerL = " " ;
      n14187ContIdSerL = false ;
      A14187ContIdSerL = " " ;
      n14187ContIdSerL = false ;
      i14187ContIdSerL = " " ;
      n14187ContIdSerL = false ;
      Z14185ContFecFUt = GXutil.nullDate() ;
      n14185ContFecFUt = false ;
      A14185ContFecFUt = GXutil.nullDate() ;
      n14185ContFecFUt = false ;
      i14185ContFecFUt = GXutil.nullDate() ;
      n14185ContFecFUt = false ;
      Z14184ContAplica = (byte)(0) ;
      n14184ContAplica = false ;
      A14184ContAplica = (byte)(0) ;
      n14184ContAplica = false ;
      i14184ContAplica = (byte)(0) ;
      n14184ContAplica = false ;
      Z14183ContNumIni = 0 ;
      n14183ContNumIni = false ;
      A14183ContNumIni = 0 ;
      n14183ContNumIni = false ;
      i14183ContNumIni = 0 ;
      n14183ContNumIni = false ;
      Z14176ContFecUti = GXutil.nullDate() ;
      n14176ContFecUti = false ;
      A14176ContFecUti = GXutil.nullDate() ;
      n14176ContFecUti = false ;
      i14176ContFecUti = GXutil.nullDate() ;
      n14176ContFecUti = false ;
      Z14182ContFcPrvU = GXutil.nullDate() ;
      n14182ContFcPrvU = false ;
      A14182ContFcPrvU = GXutil.nullDate() ;
      n14182ContFcPrvU = false ;
      i14182ContFcPrvU = GXutil.nullDate() ;
      n14182ContFcPrvU = false ;
      Z14181ContIDSerN = "" ;
      n14181ContIDSerN = false ;
      A14181ContIDSerN = "" ;
      n14181ContIDSerN = false ;
      i14181ContIDSerN = "" ;
      n14181ContIDSerN = false ;
      Z14180ContIDSeri = "" ;
      n14180ContIDSeri = false ;
      A14180ContIDSeri = "" ;
      n14180ContIDSeri = false ;
      i14180ContIDSeri = "" ;
      n14180ContIDSeri = false ;
      Z14179ContUltMov = 0 ;
      n14179ContUltMov = false ;
      A14179ContUltMov = 0 ;
      n14179ContUltMov = false ;
      i14179ContUltMov = 0 ;
      n14179ContUltMov = false ;
      Z14178ContATTs = " " ;
      n14178ContATTs = false ;
      A14178ContATTs = " " ;
      n14178ContATTs = false ;
      i14178ContATTs = " " ;
      n14178ContATTs = false ;
      Z14177ContATEst = " " ;
      n14177ContATEst = false ;
      A14177ContATEst = " " ;
      n14177ContATEst = false ;
      i14177ContATEst = " " ;
      n14177ContATEst = false ;
      Z14174ContCtrl = httpContext.getMessage( "N", "") ;
      n14174ContCtrl = false ;
      A14174ContCtrl = httpContext.getMessage( "N", "") ;
      n14174ContCtrl = false ;
      i14174ContCtrl = httpContext.getMessage( "N", "") ;
      n14174ContCtrl = false ;
      AV46Pgmname = "TEMPPAR" ;
   }

   private byte Z3915EmpNumDec ;
   private byte Z14184ContAplica ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A3915EmpNumDec ;
   private byte A14184ContAplica ;
   private byte AV41Eliot ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i14184ContAplica ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short nRcdDeleted_41 ;
   private short nRcdExists_41 ;
   private short nIsMod_41 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount41 ;
   private short RcdFound41 ;
   private short nBlankRcdUsr41 ;
   private short RcdFound27 ;
   private short nIsDirty_27 ;
   private short nIsDirty_41 ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int Z14183ContNumIni ;
   private int Z14186ContNumlas ;
   private int Z316ContVal ;
   private int O316ContVal ;
   private int N316ContVal ;
   private int A316ContVal ;
   private int trnEnded ;
   private int edtContTp_Visible ;
   private int edtavEmprcod_Enabled ;
   private int edtavEmprnom_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtContCod_Enabled ;
   private int edtContDsc_Enabled ;
   private int edtContVal_Enabled ;
   private int edtContDsc2_Enabled ;
   private int edtContVal2_Enabled ;
   private int edtContTp_Enabled ;
   private int edtContCtrl_Enabled ;
   private int edtContCtrl_Visible ;
   private int edtContAplica_Enabled ;
   private int edtContAplica_Visible ;
   private int edtContATCod_Enabled ;
   private int edtContATCod_Visible ;
   private int edtContATEst_Enabled ;
   private int edtContATEst_Visible ;
   private int fRowAdded ;
   private int A14183ContNumIni ;
   private int A14186ContNumlas ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int T316ContVal ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtContATEst_Enabled ;
   private int defedtContATCod_Enabled ;
   private int defedtContAplica_Enabled ;
   private int defedtContCtrl_Enabled ;
   private int defedtContVal_Enabled ;
   private int defedtContCod_Enabled ;
   private int i14183ContNumIni ;
   private int i14186ContNumlas ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long Z14179ContUltMov ;
   private long Z1147ContVal2 ;
   private long A14179ContUltMov ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private long A1147ContVal2 ;
   private long i14179ContUltMov ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV35EmprCod ;
   private String wcpOAV36EmprNom ;
   private String Z396EmprCod ;
   private String Z407EmprNom ;
   private String Z313ContCod ;
   private String Z14174ContCtrl ;
   private String Z14177ContATEst ;
   private String Z14178ContATTs ;
   private String Z14180ContIDSeri ;
   private String Z14181ContIDSerN ;
   private String Z14187ContIdSerL ;
   private String Z314ContDsc ;
   private String Z7208ContDsc2 ;
   private String Z10270ContTp ;
   private String Z14172ContDoc ;
   private String Z14173ContATCod ;
   private String Z14175ContClaseD ;
   private String Z14188Contnumcer ;
   private String Z14189Contmedio ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV46Pgmname ;
   private String AV29UsurCod ;
   private String AV37Station ;
   private String AV35EmprCod ;
   private String Gx_mode ;
   private String AV36EmprNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_32_idx="0001" ;
   private String edtContTp_Internalname ;
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
   private String edtavEmprcod_Internalname ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavEmprnom_Internalname ;
   private String edtavEmprnom_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode41 ;
   private String edtContCod_Internalname ;
   private String edtContDsc_Internalname ;
   private String edtContVal_Internalname ;
   private String edtContDsc2_Internalname ;
   private String edtContVal2_Internalname ;
   private String edtContCtrl_Internalname ;
   private String edtContAplica_Internalname ;
   private String edtContATCod_Internalname ;
   private String edtContATEst_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A14178ContATTs ;
   private String A14180ContIDSeri ;
   private String A14181ContIDSerN ;
   private String A14187ContIdSerL ;
   private String A14172ContDoc ;
   private String A14175ContClaseD ;
   private String A14188Contnumcer ;
   private String A14189Contmedio ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode27 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A313ContCod ;
   private String A314ContDsc ;
   private String A7208ContDsc2 ;
   private String A10270ContTp ;
   private String A14174ContCtrl ;
   private String A14173ContATCod ;
   private String A14177ContATEst ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtContCod_Jsonclick ;
   private String edtContDsc_Jsonclick ;
   private String edtContVal_Jsonclick ;
   private String edtContDsc2_Jsonclick ;
   private String edtContVal2_Jsonclick ;
   private String edtContTp_Jsonclick ;
   private String edtContCtrl_Jsonclick ;
   private String edtContAplica_Jsonclick ;
   private String edtContATCod_Jsonclick ;
   private String edtContATEst_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i14174ContCtrl ;
   private String i14177ContATEst ;
   private String i14178ContATTs ;
   private String i14180ContIDSeri ;
   private String i14181ContIDSerN ;
   private String i14187ContIdSerL ;
   private String subGridlevel_level1_Header ;
   private java.util.Date Z14182ContFcPrvU ;
   private java.util.Date Z14176ContFecUti ;
   private java.util.Date Z14185ContFecFUt ;
   private java.util.Date A14182ContFcPrvU ;
   private java.util.Date A14176ContFecUti ;
   private java.util.Date A14185ContFecFUt ;
   private java.util.Date i14182ContFcPrvU ;
   private java.util.Date i14176ContFecUti ;
   private java.util.Date i14185ContFecFUt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n14178ContATTs ;
   private boolean n14179ContUltMov ;
   private boolean n14180ContIDSeri ;
   private boolean n14181ContIDSerN ;
   private boolean n14182ContFcPrvU ;
   private boolean n14176ContFecUti ;
   private boolean n14183ContNumIni ;
   private boolean n14185ContFecFUt ;
   private boolean n14187ContIdSerL ;
   private boolean n14186ContNumlas ;
   private boolean n14172ContDoc ;
   private boolean n14175ContClaseD ;
   private boolean n14188Contnumcer ;
   private boolean n14189Contmedio ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean n14174ContCtrl ;
   private boolean n14177ContATEst ;
   private boolean n14184ContAplica ;
   private boolean n14173ContATCod ;
   private boolean Gx_longc ;
   private String AV42Inc_obs ;
   private String ZV42Inc_obs ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV45WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00SU6_A396EmprCod ;
   private String[] T00SU6_A407EmprNom ;
   private boolean[] T00SU6_n407EmprNom ;
   private byte[] T00SU6_A3915EmpNumDec ;
   private boolean[] T00SU6_n3915EmpNumDec ;
   private String[] T00SU7_A396EmprCod ;
   private String[] T00SU5_A396EmprCod ;
   private String[] T00SU5_A407EmprNom ;
   private boolean[] T00SU5_n407EmprNom ;
   private byte[] T00SU5_A3915EmpNumDec ;
   private boolean[] T00SU5_n3915EmpNumDec ;
   private String[] T00SU8_A396EmprCod ;
   private String[] T00SU9_A396EmprCod ;
   private String[] T00SU4_A396EmprCod ;
   private String[] T00SU4_A407EmprNom ;
   private boolean[] T00SU4_n407EmprNom ;
   private byte[] T00SU4_A3915EmpNumDec ;
   private boolean[] T00SU4_n3915EmpNumDec ;
   private String[] T00SU13_A396EmprCod ;
   private String[] T00SU14_A396EmprCod ;
   private String[] T00SU14_A313ContCod ;
   private String[] T00SU14_A14174ContCtrl ;
   private boolean[] T00SU14_n14174ContCtrl ;
   private String[] T00SU14_A14177ContATEst ;
   private boolean[] T00SU14_n14177ContATEst ;
   private String[] T00SU14_A14178ContATTs ;
   private boolean[] T00SU14_n14178ContATTs ;
   private long[] T00SU14_A14179ContUltMov ;
   private boolean[] T00SU14_n14179ContUltMov ;
   private String[] T00SU14_A14180ContIDSeri ;
   private boolean[] T00SU14_n14180ContIDSeri ;
   private String[] T00SU14_A14181ContIDSerN ;
   private boolean[] T00SU14_n14181ContIDSerN ;
   private java.util.Date[] T00SU14_A14182ContFcPrvU ;
   private boolean[] T00SU14_n14182ContFcPrvU ;
   private java.util.Date[] T00SU14_A14176ContFecUti ;
   private boolean[] T00SU14_n14176ContFecUti ;
   private int[] T00SU14_A14183ContNumIni ;
   private boolean[] T00SU14_n14183ContNumIni ;
   private byte[] T00SU14_A14184ContAplica ;
   private boolean[] T00SU14_n14184ContAplica ;
   private java.util.Date[] T00SU14_A14185ContFecFUt ;
   private boolean[] T00SU14_n14185ContFecFUt ;
   private String[] T00SU14_A14187ContIdSerL ;
   private boolean[] T00SU14_n14187ContIdSerL ;
   private int[] T00SU14_A14186ContNumlas ;
   private boolean[] T00SU14_n14186ContNumlas ;
   private String[] T00SU14_A314ContDsc ;
   private int[] T00SU14_A316ContVal ;
   private String[] T00SU14_A7208ContDsc2 ;
   private long[] T00SU14_A1147ContVal2 ;
   private String[] T00SU14_A10270ContTp ;
   private String[] T00SU14_A14172ContDoc ;
   private boolean[] T00SU14_n14172ContDoc ;
   private String[] T00SU14_A14173ContATCod ;
   private boolean[] T00SU14_n14173ContATCod ;
   private String[] T00SU14_A14175ContClaseD ;
   private boolean[] T00SU14_n14175ContClaseD ;
   private String[] T00SU14_A14188Contnumcer ;
   private boolean[] T00SU14_n14188Contnumcer ;
   private String[] T00SU14_A14189Contmedio ;
   private boolean[] T00SU14_n14189Contmedio ;
   private String[] T00SU15_A396EmprCod ;
   private String[] T00SU15_A313ContCod ;
   private String[] T00SU3_A396EmprCod ;
   private String[] T00SU3_A313ContCod ;
   private String[] T00SU3_A14174ContCtrl ;
   private boolean[] T00SU3_n14174ContCtrl ;
   private String[] T00SU3_A14177ContATEst ;
   private boolean[] T00SU3_n14177ContATEst ;
   private String[] T00SU3_A14178ContATTs ;
   private boolean[] T00SU3_n14178ContATTs ;
   private long[] T00SU3_A14179ContUltMov ;
   private boolean[] T00SU3_n14179ContUltMov ;
   private String[] T00SU3_A14180ContIDSeri ;
   private boolean[] T00SU3_n14180ContIDSeri ;
   private String[] T00SU3_A14181ContIDSerN ;
   private boolean[] T00SU3_n14181ContIDSerN ;
   private java.util.Date[] T00SU3_A14182ContFcPrvU ;
   private boolean[] T00SU3_n14182ContFcPrvU ;
   private java.util.Date[] T00SU3_A14176ContFecUti ;
   private boolean[] T00SU3_n14176ContFecUti ;
   private int[] T00SU3_A14183ContNumIni ;
   private boolean[] T00SU3_n14183ContNumIni ;
   private byte[] T00SU3_A14184ContAplica ;
   private boolean[] T00SU3_n14184ContAplica ;
   private java.util.Date[] T00SU3_A14185ContFecFUt ;
   private boolean[] T00SU3_n14185ContFecFUt ;
   private String[] T00SU3_A14187ContIdSerL ;
   private boolean[] T00SU3_n14187ContIdSerL ;
   private int[] T00SU3_A14186ContNumlas ;
   private boolean[] T00SU3_n14186ContNumlas ;
   private String[] T00SU3_A314ContDsc ;
   private int[] T00SU3_A316ContVal ;
   private String[] T00SU3_A7208ContDsc2 ;
   private long[] T00SU3_A1147ContVal2 ;
   private String[] T00SU3_A10270ContTp ;
   private String[] T00SU3_A14172ContDoc ;
   private boolean[] T00SU3_n14172ContDoc ;
   private String[] T00SU3_A14173ContATCod ;
   private boolean[] T00SU3_n14173ContATCod ;
   private String[] T00SU3_A14175ContClaseD ;
   private boolean[] T00SU3_n14175ContClaseD ;
   private String[] T00SU3_A14188Contnumcer ;
   private boolean[] T00SU3_n14188Contnumcer ;
   private String[] T00SU3_A14189Contmedio ;
   private boolean[] T00SU3_n14189Contmedio ;
   private String[] T00SU2_A396EmprCod ;
   private String[] T00SU2_A313ContCod ;
   private String[] T00SU2_A14174ContCtrl ;
   private boolean[] T00SU2_n14174ContCtrl ;
   private String[] T00SU2_A14177ContATEst ;
   private boolean[] T00SU2_n14177ContATEst ;
   private String[] T00SU2_A14178ContATTs ;
   private boolean[] T00SU2_n14178ContATTs ;
   private long[] T00SU2_A14179ContUltMov ;
   private boolean[] T00SU2_n14179ContUltMov ;
   private String[] T00SU2_A14180ContIDSeri ;
   private boolean[] T00SU2_n14180ContIDSeri ;
   private String[] T00SU2_A14181ContIDSerN ;
   private boolean[] T00SU2_n14181ContIDSerN ;
   private java.util.Date[] T00SU2_A14182ContFcPrvU ;
   private boolean[] T00SU2_n14182ContFcPrvU ;
   private java.util.Date[] T00SU2_A14176ContFecUti ;
   private boolean[] T00SU2_n14176ContFecUti ;
   private int[] T00SU2_A14183ContNumIni ;
   private boolean[] T00SU2_n14183ContNumIni ;
   private byte[] T00SU2_A14184ContAplica ;
   private boolean[] T00SU2_n14184ContAplica ;
   private java.util.Date[] T00SU2_A14185ContFecFUt ;
   private boolean[] T00SU2_n14185ContFecFUt ;
   private String[] T00SU2_A14187ContIdSerL ;
   private boolean[] T00SU2_n14187ContIdSerL ;
   private int[] T00SU2_A14186ContNumlas ;
   private boolean[] T00SU2_n14186ContNumlas ;
   private String[] T00SU2_A314ContDsc ;
   private int[] T00SU2_A316ContVal ;
   private String[] T00SU2_A7208ContDsc2 ;
   private long[] T00SU2_A1147ContVal2 ;
   private String[] T00SU2_A10270ContTp ;
   private String[] T00SU2_A14172ContDoc ;
   private boolean[] T00SU2_n14172ContDoc ;
   private String[] T00SU2_A14173ContATCod ;
   private boolean[] T00SU2_n14173ContATCod ;
   private String[] T00SU2_A14175ContClaseD ;
   private boolean[] T00SU2_n14175ContClaseD ;
   private String[] T00SU2_A14188Contnumcer ;
   private boolean[] T00SU2_n14188Contnumcer ;
   private String[] T00SU2_A14189Contmedio ;
   private boolean[] T00SU2_n14189Contmedio ;
   private String[] T00SU19_A396EmprCod ;
   private String[] T00SU19_A313ContCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV43WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV44TrnContext ;
}

final  class temppar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class temppar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class temppar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class temppar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class temppar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00SU2", "SELECT EmprCod, ContCod, ContCtrl, ContATEst, ContATTs, ContUltMov, ContIDSeri, ContIDSerN, ContFcPrvU, ContFecUti, ContNumIni, ContAplica, ContFecFUt, ContIdSerL, ContNumlas, ContDsc, ContVal, ContDsc2, ContVal2, ContTp, ContDoc, ContATCod, ContClaseD, Contnumcer, Contmedio FROM TXPEMPLIN WHERE EmprCod = ? AND ContCod = ?  FOR UPDATE OF ContCtrl, ContATEst, ContATTs, ContUltMov, ContIDSeri, ContIDSerN, ContFcPrvU, ContFecUti, ContNumIni, ContAplica, ContFecFUt, ContIdSerL, ContNumlas, ContDsc, ContVal, ContDsc2, ContVal2, ContTp, ContDoc, ContATCod, ContClaseD, Contnumcer, Contmedio NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SU3", "SELECT EmprCod, ContCod, ContCtrl, ContATEst, ContATTs, ContUltMov, ContIDSeri, ContIDSerN, ContFcPrvU, ContFecUti, ContNumIni, ContAplica, ContFecFUt, ContIdSerL, ContNumlas, ContDsc, ContVal, ContDsc2, ContVal2, ContTp, ContDoc, ContATCod, ContClaseD, Contnumcer, Contmedio FROM TXPEMPLIN WHERE EmprCod = ? AND ContCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SU4", "SELECT EmprCod, EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ?  FOR UPDATE OF EmprNom, EmpNumDec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SU5", "SELECT EmprCod, EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SU6", "SELECT /*+ FIRST_ROWS(100) */ TM1.EmprCod, TM1.EmprNom, TM1.EmpNumDec FROM TXPEMPRES TM1 WHERE TM1.EmprCod = ? ORDER BY TM1.EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SU7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SU8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod > ?) ORDER BY EmprCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SU9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod FROM TXPEMPRES WHERE ( EmprCod < ?) ORDER BY EmprCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00SU10", "INSERT INTO TXPEMPRES(EmprCod, EmprNom, EmpNumDec, EmprDir, EmprCpo, EmprPob, EmprCif, EmprTel, EmprFax, IvaCod, Emp1, Emp0, Ser1, Ser0, Ser2, Ser20, Ser3, Ser30, Ser4, Ser40, Ser5, Ser50, Ser6, Ser60, Ser7, Ser70, Hh_UltL, Coste_mca, Coste_msa, Factor_in, Colombia, Auc_ULin, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6, EmpQuePrd, EmpQueCol, EmpQueSod, EmpCosInd, EmpGasGen, EmpMarCom, EmpCosTin, EmpRelBan, EmpItm7, PtosUltID, EmpKey, EmpToken, EmpEnv, EmpProd) VALUES(?, ?, ?, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T00SU11", "UPDATE TXPEMPRES SET EmprNom=?, EmpNumDec=?  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new UpdateCursor("T00SU12", "DELETE FROM TXPEMPRES  WHERE EmprCod = ?", GX_NOMASK, "TXPEMPRES")
         ,new ForEachCursor("T00SU13", "SELECT /*+ FIRST_ROWS(100) */ EmprCod FROM TXPEMPRES ORDER BY EmprCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SU14", "SELECT EmprCod, ContCod, ContCtrl, ContATEst, ContATTs, ContUltMov, ContIDSeri, ContIDSerN, ContFcPrvU, ContFecUti, ContNumIni, ContAplica, ContFecFUt, ContIdSerL, ContNumlas, ContDsc, ContVal, ContDsc2, ContVal2, ContTp, ContDoc, ContATCod, ContClaseD, Contnumcer, Contmedio FROM TXPEMPLIN WHERE EmprCod = ? and ContCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SU15", "SELECT EmprCod, ContCod FROM TXPEMPLIN WHERE EmprCod = ? AND ContCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00SU16", "INSERT INTO TXPEMPLIN(EmprCod, ContCod, ContCtrl, ContATEst, ContATTs, ContUltMov, ContIDSeri, ContIDSerN, ContFcPrvU, ContFecUti, ContNumIni, ContAplica, ContFecFUt, ContIdSerL, ContNumlas, ContDsc, ContVal, ContDsc2, ContVal2, ContTp, ContDoc, ContATCod, ContClaseD, Contnumcer, Contmedio) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPEMPLIN")
         ,new UpdateCursor("T00SU17", "UPDATE TXPEMPLIN SET ContCtrl=?, ContATEst=?, ContATTs=?, ContUltMov=?, ContIDSeri=?, ContIDSerN=?, ContFcPrvU=?, ContFecUti=?, ContNumIni=?, ContAplica=?, ContFecFUt=?, ContIdSerL=?, ContNumlas=?, ContDsc=?, ContVal=?, ContDsc2=?, ContVal2=?, ContTp=?, ContDoc=?, ContATCod=?, ContClaseD=?, Contnumcer=?, Contmedio=?  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK, "TXPEMPLIN")
         ,new UpdateCursor("T00SU18", "DELETE FROM TXPEMPLIN  WHERE EmprCod = ? AND ContCod = ?", GX_NOMASK, "TXPEMPLIN")
         ,new ForEachCursor("T00SU19", "SELECT EmprCod, ContCod FROM TXPEMPLIN WHERE EmprCod = ? ORDER BY EmprCod, ContCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 20);
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((String[]) buf[30])[0] = rslt.getString(18, 100);
               ((long[]) buf[31])[0] = rslt.getLong(19);
               ((String[]) buf[32])[0] = rslt.getString(20, 1);
               ((String[]) buf[33])[0] = rslt.getString(21, 4);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(25, 2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 20);
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((String[]) buf[30])[0] = rslt.getString(18, 100);
               ((long[]) buf[31])[0] = rslt.getLong(19);
               ((String[]) buf[32])[0] = rslt.getString(20, 1);
               ((String[]) buf[33])[0] = rslt.getString(21, 4);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(25, 2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 20);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 20);
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((String[]) buf[30])[0] = rslt.getString(18, 100);
               ((long[]) buf[31])[0] = rslt.getLong(19);
               ((String[]) buf[32])[0] = rslt.getString(20, 1);
               ((String[]) buf[33])[0] = rslt.getString(21, 4);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(25, 2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 9 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[9]).longValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[21]).byteValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 20);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[27]).intValue());
               }
               stmt.setString(16, (String)parms[28], 20);
               stmt.setInt(17, ((Number) parms[29]).intValue());
               stmt.setString(18, (String)parms[30], 100);
               stmt.setLong(19, ((Number) parms[31]).longValue());
               stmt.setString(20, (String)parms[32], 1);
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[34], 4);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[36], 30);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[38], 4);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[40], 20);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[42], 2);
               }
               return;
            case 15 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(4, ((Number) parms[7]).longValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 20);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[13]);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[15]);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[21]);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               stmt.setString(14, (String)parms[26], 20);
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setString(16, (String)parms[28], 100);
               stmt.setLong(17, ((Number) parms[29]).longValue());
               stmt.setString(18, (String)parms[30], 1);
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[32], 4);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[34], 30);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[36], 4);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[38], 20);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[40], 2);
               }
               stmt.setString(24, (String)parms[41], 3);
               stmt.setString(25, (String)parms[42], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

