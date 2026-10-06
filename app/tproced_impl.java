package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproced_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"PROCECOD") == 0 )
      {
         AV44ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44ProceCod), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44ProceCod), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asaprocecod35132( AV44ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"PROCECOD") == 0 )
      {
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         AV54autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asaprocecod35132( A970ProceCod, AV54autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A781PrvCod = (short)(GXutil.lval( httpContext.GetPar( "PrvCod"))) ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A781PrvCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10122GpoEcoCod = (int)(GXutil.lval( httpContext.GetPar( "GpoEcoCod"))) ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A10122GpoEcoCod) ;
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
            AV43EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43EmprCod, "@!"))));
            AV44ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44ProceCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44ProceCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PROCEDENCIAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProceCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tproced_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tproced_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproced_impl.class ));
   }

   public tproced_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNom_Internalname, GXutil.rtrim( A971ProceNom), GXutil.rtrim( localUtil.format( A971ProceNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceNif_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceNif_Internalname, httpContext.getMessage( "Nif", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNif_Internalname, GXutil.rtrim( A993ProceNif), GXutil.rtrim( localUtil.format( A993ProceNif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceNif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceDom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceDom_Internalname, httpContext.getMessage( "Domicilio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceDom_Internalname, GXutil.rtrim( A994ProceDom), GXutil.rtrim( localUtil.format( A994ProceDom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceDom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceDom_Enabled, 0, "text", "", 34, "chr", 1, "row", 34, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPoceCp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPoceCp_Internalname, httpContext.getMessage( "Código Postal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPoceCp_Internalname, GXutil.rtrim( A989PoceCp), GXutil.rtrim( localUtil.format( A989PoceCp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPoceCp_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPoceCp_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPoceCp2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPoceCp2_Internalname, httpContext.getMessage( "Postal (PT)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPoceCp2_Internalname, GXutil.rtrim( A14029PoceCp2), GXutil.rtrim( localUtil.format( A14029PoceCp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPoceCp2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPoceCp2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProcePob_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProcePob_Internalname, httpContext.getMessage( "Población", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProcePob_Internalname, GXutil.rtrim( A988ProcePob), GXutil.rtrim( localUtil.format( A988ProcePob, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProcePob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProcePob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCellFL RequiredDataContentCellFL ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedprvcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprvcod_Internalname, httpContext.getMessage( "Provincia", ""), "", "", lblTextblockprvcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_prvcod.setProperty("Caption", Combo_prvcod_Caption);
      ucCombo_prvcod.setProperty("Cls", Combo_prvcod_Cls);
      ucCombo_prvcod.setProperty("EmptyItem", Combo_prvcod_Emptyitem);
      ucCombo_prvcod.setProperty("DropDownOptionsData", AV51PrvCod_Data);
      ucCombo_prvcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prvcod_Internalname, "COMBO_PRVCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvCod_Internalname, httpContext.getMessage( "Codigo Provincia", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvCod_Internalname, GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvCod_Jsonclick, 0, "Attribute", "", "", "", "", edtPrvCod_Visible, edtPrvCod_Enabled, 1, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProPers_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProPers_Internalname, httpContext.getMessage( "Persona Contacto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProPers_Internalname, GXutil.rtrim( A10390ProPers), GXutil.rtrim( localUtil.format( A10390ProPers, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProPers_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProPers_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProEmail_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProEmail_Internalname, httpContext.getMessage( "Email", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProEmail_Internalname, GXutil.rtrim( A10391ProEmail), GXutil.rtrim( localUtil.format( A10391ProEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProEmail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProEmail_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceTel1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceTel1_Internalname, httpContext.getMessage( "Telefono (1)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceTel1_Internalname, GXutil.rtrim( A990ProceTel1), GXutil.rtrim( localUtil.format( A990ProceTel1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceTel1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceTel1_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceTel2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceTel2_Internalname, httpContext.getMessage( "Telefono (2)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceTel2_Internalname, GXutil.rtrim( A991ProceTel2), GXutil.rtrim( localUtil.format( A991ProceTel2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceTel2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceTel2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProceTelex_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProceTelex_Internalname, httpContext.getMessage( "Telex", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceTelex_Internalname, GXutil.rtrim( A992ProceTelex), GXutil.rtrim( localUtil.format( A992ProceTelex, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceTelex_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProceTelex_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCED.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCED.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV55Pgmname), GXutil.rtrim( localUtil.format( AV55Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCED.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_prvcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboprvcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV53ComboPrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboprvcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV53ComboPrvCod), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV53ComboPrvCod), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboprvcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboprvcod_Visible, edtavComboprvcod_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPROCED.htm");
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
      e11352 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRVCOD_DATA"), AV51PrvCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z993ProceNif = httpContext.cgiGet( "Z993ProceNif") ;
            Z971ProceNom = httpContext.cgiGet( "Z971ProceNom") ;
            Z994ProceDom = httpContext.cgiGet( "Z994ProceDom") ;
            Z988ProcePob = httpContext.cgiGet( "Z988ProcePob") ;
            Z989PoceCp = httpContext.cgiGet( "Z989PoceCp") ;
            Z14029PoceCp2 = httpContext.cgiGet( "Z14029PoceCp2") ;
            Z990ProceTel1 = httpContext.cgiGet( "Z990ProceTel1") ;
            Z991ProceTel2 = httpContext.cgiGet( "Z991ProceTel2") ;
            Z992ProceTelex = httpContext.cgiGet( "Z992ProceTelex") ;
            Z6187ProceIe = httpContext.cgiGet( "Z6187ProceIe") ;
            Z10390ProPers = httpContext.cgiGet( "Z10390ProPers") ;
            Z10391ProEmail = httpContext.cgiGet( "Z10391ProEmail") ;
            Z10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10122GpoEcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            Z781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z781PrvCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6187ProceIe = httpContext.cgiGet( "Z6187ProceIe") ;
            n6187ProceIe = false ;
            A10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10122GpoEcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10122GpoEcoCod = false ;
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "N781PrvCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "N10122GpoEcoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            A13820ProceNomID = httpContext.cgiGet( "PROCENOMID") ;
            AV43EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV44ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "vPROCECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV54autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV48Insert_PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV49Insert_GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_GPOECOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A10122GpoEcoCod = (int)(localUtil.ctol( httpContext.cgiGet( "GPOECOCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10122GpoEcoCod = ((0==A10122GpoEcoCod) ? true : false) ;
            A6187ProceIe = httpContext.cgiGet( "PROCEIE") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A10123GpoEcoNom = httpContext.cgiGet( "GPOECONOM") ;
            n10123GpoEcoNom = false ;
            A787PrvDsc = httpContext.cgiGet( "PRVDSC") ;
            n787PrvDsc = false ;
            Combo_prvcod_Objectcall = httpContext.cgiGet( "COMBO_PRVCOD_Objectcall") ;
            Combo_prvcod_Class = httpContext.cgiGet( "COMBO_PRVCOD_Class") ;
            Combo_prvcod_Icontype = httpContext.cgiGet( "COMBO_PRVCOD_Icontype") ;
            Combo_prvcod_Icon = httpContext.cgiGet( "COMBO_PRVCOD_Icon") ;
            Combo_prvcod_Caption = httpContext.cgiGet( "COMBO_PRVCOD_Caption") ;
            Combo_prvcod_Tooltip = httpContext.cgiGet( "COMBO_PRVCOD_Tooltip") ;
            Combo_prvcod_Cls = httpContext.cgiGet( "COMBO_PRVCOD_Cls") ;
            Combo_prvcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRVCOD_Selectedvalue_set") ;
            Combo_prvcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRVCOD_Selectedvalue_get") ;
            Combo_prvcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PRVCOD_Selectedtext_set") ;
            Combo_prvcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PRVCOD_Selectedtext_get") ;
            Combo_prvcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRVCOD_Gamoauthtoken") ;
            Combo_prvcod_Ddointernalname = httpContext.cgiGet( "COMBO_PRVCOD_Ddointernalname") ;
            Combo_prvcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRVCOD_Titlecontrolalign") ;
            Combo_prvcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRVCOD_Dropdownoptionstype") ;
            Combo_prvcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Enabled")) ;
            Combo_prvcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Visible")) ;
            Combo_prvcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRVCOD_Titlecontrolidtoreplace") ;
            Combo_prvcod_Datalisttype = httpContext.cgiGet( "COMBO_PRVCOD_Datalisttype") ;
            Combo_prvcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Allowmultipleselection")) ;
            Combo_prvcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRVCOD_Datalistfixedvalues") ;
            Combo_prvcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Isgriditem")) ;
            Combo_prvcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Hasdescription")) ;
            Combo_prvcod_Datalistproc = httpContext.cgiGet( "COMBO_PRVCOD_Datalistproc") ;
            Combo_prvcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRVCOD_Datalistprocparametersprefix") ;
            Combo_prvcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRVCOD_Remoteservicesparameters") ;
            Combo_prvcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRVCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prvcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Includeonlyselectedoption")) ;
            Combo_prvcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Includeselectalloption")) ;
            Combo_prvcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Emptyitem")) ;
            Combo_prvcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRVCOD_Includeaddnewoption")) ;
            Combo_prvcod_Htmltemplate = httpContext.cgiGet( "COMBO_PRVCOD_Htmltemplate") ;
            Combo_prvcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRVCOD_Multiplevaluestype") ;
            Combo_prvcod_Loadingdata = httpContext.cgiGet( "COMBO_PRVCOD_Loadingdata") ;
            Combo_prvcod_Noresultsfound = httpContext.cgiGet( "COMBO_PRVCOD_Noresultsfound") ;
            Combo_prvcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PRVCOD_Emptyitemtext") ;
            Combo_prvcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRVCOD_Onlyselectedvalues") ;
            Combo_prvcod_Selectalltext = httpContext.cgiGet( "COMBO_PRVCOD_Selectalltext") ;
            Combo_prvcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRVCOD_Multiplevaluesseparator") ;
            Combo_prvcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRVCOD_Addnewoptiontext") ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A970ProceCod = (short)(0) ;
               n970ProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            }
            else
            {
               A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n970ProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            }
            A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
            n971ProceNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
            A993ProceNif = httpContext.cgiGet( edtProceNif_Internalname) ;
            n993ProceNif = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A993ProceNif", A993ProceNif);
            A994ProceDom = httpContext.cgiGet( edtProceDom_Internalname) ;
            n994ProceDom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A994ProceDom", A994ProceDom);
            A989PoceCp = httpContext.cgiGet( edtPoceCp_Internalname) ;
            n989PoceCp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A989PoceCp", A989PoceCp);
            A14029PoceCp2 = httpContext.cgiGet( edtPoceCp2_Internalname) ;
            n14029PoceCp2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14029PoceCp2", A14029PoceCp2);
            A988ProcePob = httpContext.cgiGet( edtProcePob_Internalname) ;
            n988ProcePob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A988ProcePob", A988ProcePob);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrvCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A781PrvCod = (short)(0) ;
               n781PrvCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
            }
            else
            {
               A781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n781PrvCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
            }
            A10390ProPers = httpContext.cgiGet( edtProPers_Internalname) ;
            n10390ProPers = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10390ProPers", A10390ProPers);
            A10391ProEmail = httpContext.cgiGet( edtProEmail_Internalname) ;
            n10391ProEmail = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10391ProEmail", A10391ProEmail);
            A990ProceTel1 = httpContext.cgiGet( edtProceTel1_Internalname) ;
            n990ProceTel1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A990ProceTel1", A990ProceTel1);
            A991ProceTel2 = httpContext.cgiGet( edtProceTel2_Internalname) ;
            n991ProceTel2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A991ProceTel2", A991ProceTel2);
            A992ProceTelex = httpContext.cgiGet( edtProceTelex_Internalname) ;
            n992ProceTelex = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A992ProceTelex", A992ProceTelex);
            AV55Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
            AV53ComboPrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavComboprvcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53ComboPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53ComboPrvCod), 3, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPROCED");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV55Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV55Pgmname, "")));
            forbiddenHiddens.add("ProceIe", GXutil.rtrim( localUtil.format( A6187ProceIe, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A970ProceCod != Z970ProceCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tproced:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
               n970ProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
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
                  sMode132 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode132 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound132 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_350( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PROCECOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProceCod_Internalname ;
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
                        e11352 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12352 ();
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
         e12352 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll35132( ) ;
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
         disableAttributes35132( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvcod_Enabled), 5, 0), true);
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

   public void confirm_350( )
   {
      beforeValidate35132( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls35132( ) ;
         }
         else
         {
            checkExtendedTable35132( ) ;
            closeExtendedTableCursors35132( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption350( )
   {
   }

   public void e11352( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tproced_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tproced_impl.this.A396EmprCod = GXv_char2[0] ;
      tproced_impl.this.AV16EmprNom = GXv_char3[0] ;
      tproced_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV54autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      tproced_impl.this.GXt_int5 = GXv_int6[0] ;
      AV54autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54autonumber), 4, 0));
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tproced_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV43EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      tproced_impl.this.AV43EmprCod = GXv_char4[0] ;
      tproced_impl.this.AV16EmprNom = GXv_char3[0] ;
      tproced_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43EmprCod", AV43EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV45WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV45WWPContext = GXv_SdtWWPContext7[0] ;
      edtPrvCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Visible), 5, 0), true);
      AV53ComboPrvCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53ComboPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53ComboPrvCod), 3, 0));
      edtavComboprvcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRVCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV46TrnContext.fromxml(AV47WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV46TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV55Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV56GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GXV1), 8, 0));
         while ( AV56GXV1 <= AV46TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV50TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV46TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV56GXV1));
            if ( GXutil.strcmp(AV50TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvCod") == 0 )
            {
               AV48Insert_PrvCod = (short)(GXutil.lval( AV50TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48Insert_PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Insert_PrvCod), 3, 0));
               if ( ! (0==AV48Insert_PrvCod) )
               {
                  AV53ComboPrvCod = AV48Insert_PrvCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV53ComboPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53ComboPrvCod), 3, 0));
                  Combo_prvcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV53ComboPrvCod, 3, 0)) ;
                  ucCombo_prvcod.sendProperty(context, "", false, Combo_prvcod_Internalname, "SelectedValue_set", Combo_prvcod_Selectedvalue_set);
                  Combo_prvcod_Enabled = false ;
                  ucCombo_prvcod.sendProperty(context, "", false, Combo_prvcod_Internalname, "Enabled", GXutil.booltostr( Combo_prvcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV50TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "GpoEcoCod") == 0 )
            {
               AV49Insert_GpoEcoCod = (int)(GXutil.lval( AV50TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49Insert_GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Insert_GpoEcoCod), 6, 0));
            }
            AV56GXV1 = (int)(AV56GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GXV1), 8, 0));
         }
      }
   }

   public void e12352( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV46TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tprocedww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRVCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV51PrvCod_Data ;
      GXv_char4[0] = AV52ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tprocedloaddvcombo(remoteHandle, context).execute( "PrvCod", Gx_mode, AV43EmprCod, AV44ProceCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tproced_impl.this.AV52ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV51PrvCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_prvcod_Selectedvalue_set = AV52ComboSelectedValue ;
      ucCombo_prvcod.sendProperty(context, "", false, Combo_prvcod_Internalname, "SelectedValue_set", Combo_prvcod_Selectedvalue_set);
      AV53ComboPrvCod = (short)(GXutil.lval( AV52ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53ComboPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53ComboPrvCod), 3, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_prvcod_Enabled = false ;
         ucCombo_prvcod.sendProperty(context, "", false, Combo_prvcod_Internalname, "Enabled", GXutil.booltostr( Combo_prvcod_Enabled));
      }
   }

   public void zm35132( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z993ProceNif = T00353_A993ProceNif[0] ;
            Z971ProceNom = T00353_A971ProceNom[0] ;
            Z994ProceDom = T00353_A994ProceDom[0] ;
            Z988ProcePob = T00353_A988ProcePob[0] ;
            Z989PoceCp = T00353_A989PoceCp[0] ;
            Z14029PoceCp2 = T00353_A14029PoceCp2[0] ;
            Z990ProceTel1 = T00353_A990ProceTel1[0] ;
            Z991ProceTel2 = T00353_A991ProceTel2[0] ;
            Z992ProceTelex = T00353_A992ProceTelex[0] ;
            Z6187ProceIe = T00353_A6187ProceIe[0] ;
            Z10390ProPers = T00353_A10390ProPers[0] ;
            Z10391ProEmail = T00353_A10391ProEmail[0] ;
            Z10122GpoEcoCod = T00353_A10122GpoEcoCod[0] ;
            Z781PrvCod = T00353_A781PrvCod[0] ;
         }
         else
         {
            Z993ProceNif = A993ProceNif ;
            Z971ProceNom = A971ProceNom ;
            Z994ProceDom = A994ProceDom ;
            Z988ProcePob = A988ProcePob ;
            Z989PoceCp = A989PoceCp ;
            Z14029PoceCp2 = A14029PoceCp2 ;
            Z990ProceTel1 = A990ProceTel1 ;
            Z991ProceTel2 = A991ProceTel2 ;
            Z992ProceTelex = A992ProceTelex ;
            Z6187ProceIe = A6187ProceIe ;
            Z10390ProPers = A10390ProPers ;
            Z10391ProEmail = A10391ProEmail ;
            Z10122GpoEcoCod = A10122GpoEcoCod ;
            Z781PrvCod = A781PrvCod ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z970ProceCod = A970ProceCod ;
         Z993ProceNif = A993ProceNif ;
         Z971ProceNom = A971ProceNom ;
         Z994ProceDom = A994ProceDom ;
         Z988ProcePob = A988ProcePob ;
         Z989PoceCp = A989PoceCp ;
         Z14029PoceCp2 = A14029PoceCp2 ;
         Z990ProceTel1 = A990ProceTel1 ;
         Z991ProceTel2 = A991ProceTel2 ;
         Z992ProceTelex = A992ProceTelex ;
         Z6187ProceIe = A6187ProceIe ;
         Z10390ProPers = A10390ProPers ;
         Z10391ProEmail = A10391ProEmail ;
         Z396EmprCod = A396EmprCod ;
         Z10122GpoEcoCod = A10122GpoEcoCod ;
         Z781PrvCod = A781PrvCod ;
         Z407EmprNom = A407EmprNom ;
         Z10123GpoEcoNom = A10123GpoEcoNom ;
         Z787PrvDsc = A787PrvDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV55Pgmname = "TPROCED" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Pgmname", AV55Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV43EmprCod)==0) )
      {
         A396EmprCod = AV43EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00354 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00354_A407EmprNom[0] ;
      n407EmprNom = T00354_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV44ProceCod) )
      {
         A970ProceCod = AV44ProceCod ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      if ( ! (0==AV44ProceCod) )
      {
         edtProceCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProceCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV44ProceCod) )
      {
         edtProceCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV48Insert_PrvCod) )
      {
         edtPrvCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Enabled), 5, 0), true);
      }
      else
      {
         edtPrvCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV49Insert_GpoEcoCod) )
      {
         A10122GpoEcoCod = AV49Insert_GpoEcoCod ;
         n10122GpoEcoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV48Insert_PrvCod) )
      {
         A781PrvCod = AV48Insert_PrvCod ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
      }
      else
      {
         A781PrvCod = AV53ComboPrvCod ;
         n781PrvCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
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
         /* Using cursor T00355 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
         A10123GpoEcoNom = T00355_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T00355_n10123GpoEcoNom[0] ;
         pr_default.close(3);
         /* Using cursor T00356 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
         A787PrvDsc = T00356_A787PrvDsc[0] ;
         n787PrvDsc = T00356_n787PrvDsc[0] ;
         pr_default.close(4);
      }
   }

   public void load35132( )
   {
      /* Using cursor T00357 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound132 = (short)(1) ;
         A407EmprNom = T00357_A407EmprNom[0] ;
         n407EmprNom = T00357_n407EmprNom[0] ;
         A993ProceNif = T00357_A993ProceNif[0] ;
         n993ProceNif = T00357_n993ProceNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A993ProceNif", A993ProceNif);
         A971ProceNom = T00357_A971ProceNom[0] ;
         n971ProceNom = T00357_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A994ProceDom = T00357_A994ProceDom[0] ;
         n994ProceDom = T00357_n994ProceDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A994ProceDom", A994ProceDom);
         A988ProcePob = T00357_A988ProcePob[0] ;
         n988ProcePob = T00357_n988ProcePob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A988ProcePob", A988ProcePob);
         A787PrvDsc = T00357_A787PrvDsc[0] ;
         n787PrvDsc = T00357_n787PrvDsc[0] ;
         A989PoceCp = T00357_A989PoceCp[0] ;
         n989PoceCp = T00357_n989PoceCp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A989PoceCp", A989PoceCp);
         A14029PoceCp2 = T00357_A14029PoceCp2[0] ;
         n14029PoceCp2 = T00357_n14029PoceCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14029PoceCp2", A14029PoceCp2);
         A990ProceTel1 = T00357_A990ProceTel1[0] ;
         n990ProceTel1 = T00357_n990ProceTel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A990ProceTel1", A990ProceTel1);
         A991ProceTel2 = T00357_A991ProceTel2[0] ;
         n991ProceTel2 = T00357_n991ProceTel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A991ProceTel2", A991ProceTel2);
         A992ProceTelex = T00357_A992ProceTelex[0] ;
         n992ProceTelex = T00357_n992ProceTelex[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A992ProceTelex", A992ProceTelex);
         A6187ProceIe = T00357_A6187ProceIe[0] ;
         n6187ProceIe = T00357_n6187ProceIe[0] ;
         A10123GpoEcoNom = T00357_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T00357_n10123GpoEcoNom[0] ;
         A10390ProPers = T00357_A10390ProPers[0] ;
         n10390ProPers = T00357_n10390ProPers[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10390ProPers", A10390ProPers);
         A10391ProEmail = T00357_A10391ProEmail[0] ;
         n10391ProEmail = T00357_n10391ProEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10391ProEmail", A10391ProEmail);
         A10122GpoEcoCod = T00357_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = T00357_n10122GpoEcoCod[0] ;
         A781PrvCod = T00357_A781PrvCod[0] ;
         n781PrvCod = T00357_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         zm35132( -18) ;
      }
      pr_default.close(5);
      onLoadActions35132( ) ;
   }

   public void onLoadActions35132( )
   {
      A13820ProceNomID = GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) + "-" + GXutil.trim( A971ProceNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13820ProceNomID", A13820ProceNomID);
   }

   public void checkExtendedTable35132( )
   {
      nIsDirty_132 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_132 = (short)(1) ;
      A13820ProceNomID = GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) + "-" + GXutil.trim( A971ProceNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13820ProceNomID", A13820ProceNomID);
      /* Using cursor T00356 */
      pr_default.execute(4, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A787PrvDsc = T00356_A787PrvDsc[0] ;
      n787PrvDsc = T00356_n787PrvDsc[0] ;
      pr_default.close(4);
      if ( (0==A781PrvCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Provincia es requerido.", ""), 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GxRegex.IsMatch(A10391ProEmail,"^((\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*)|(\\s*))$") ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXM_DoesNotMatchRegExp", ""), httpContext.getMessage( "Email", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PROEMAIL");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProEmail_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00355 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10122GpoEcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
            AnyError = (short)(1) ;
         }
      }
      A10123GpoEcoNom = T00355_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T00355_n10123GpoEcoNom[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors35132( )
   {
      pr_default.close(4);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_21( short A781PrvCod )
   {
      /* Using cursor T00358 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A787PrvDsc = T00358_A787PrvDsc[0] ;
      n787PrvDsc = T00358_n787PrvDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A787PrvDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_20( String A396EmprCod ,
                          int A10122GpoEcoCod )
   {
      /* Using cursor T00359 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A10122GpoEcoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Grupo económico", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GPOECOCOD");
            AnyError = (short)(1) ;
         }
      }
      A10123GpoEcoNom = T00359_A10123GpoEcoNom[0] ;
      n10123GpoEcoNom = T00359_n10123GpoEcoNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( A10123GpoEcoNom)+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey35132( )
   {
      /* Using cursor T003510 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound132 = (short)(1) ;
      }
      else
      {
         RcdFound132 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00353 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00353_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm35132( 18) ;
         RcdFound132 = (short)(1) ;
         A970ProceCod = T00353_A970ProceCod[0] ;
         n970ProceCod = T00353_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A993ProceNif = T00353_A993ProceNif[0] ;
         n993ProceNif = T00353_n993ProceNif[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A993ProceNif", A993ProceNif);
         A971ProceNom = T00353_A971ProceNom[0] ;
         n971ProceNom = T00353_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A994ProceDom = T00353_A994ProceDom[0] ;
         n994ProceDom = T00353_n994ProceDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A994ProceDom", A994ProceDom);
         A988ProcePob = T00353_A988ProcePob[0] ;
         n988ProcePob = T00353_n988ProcePob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A988ProcePob", A988ProcePob);
         A989PoceCp = T00353_A989PoceCp[0] ;
         n989PoceCp = T00353_n989PoceCp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A989PoceCp", A989PoceCp);
         A14029PoceCp2 = T00353_A14029PoceCp2[0] ;
         n14029PoceCp2 = T00353_n14029PoceCp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14029PoceCp2", A14029PoceCp2);
         A990ProceTel1 = T00353_A990ProceTel1[0] ;
         n990ProceTel1 = T00353_n990ProceTel1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A990ProceTel1", A990ProceTel1);
         A991ProceTel2 = T00353_A991ProceTel2[0] ;
         n991ProceTel2 = T00353_n991ProceTel2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A991ProceTel2", A991ProceTel2);
         A992ProceTelex = T00353_A992ProceTelex[0] ;
         n992ProceTelex = T00353_n992ProceTelex[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A992ProceTelex", A992ProceTelex);
         A6187ProceIe = T00353_A6187ProceIe[0] ;
         n6187ProceIe = T00353_n6187ProceIe[0] ;
         A10390ProPers = T00353_A10390ProPers[0] ;
         n10390ProPers = T00353_n10390ProPers[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10390ProPers", A10390ProPers);
         A10391ProEmail = T00353_A10391ProEmail[0] ;
         n10391ProEmail = T00353_n10391ProEmail[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10391ProEmail", A10391ProEmail);
         A10122GpoEcoCod = T00353_A10122GpoEcoCod[0] ;
         n10122GpoEcoCod = T00353_n10122GpoEcoCod[0] ;
         A781PrvCod = T00353_A781PrvCod[0] ;
         n781PrvCod = T00353_n781PrvCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z970ProceCod = A970ProceCod ;
         sMode132 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load35132( ) ;
         if ( AnyError == 1 )
         {
            RcdFound132 = (short)(0) ;
            initializeNonKey35132( ) ;
         }
         Gx_mode = sMode132 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound132 = (short)(0) ;
         initializeNonKey35132( ) ;
         sMode132 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode132 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey35132( ) ;
      if ( RcdFound132 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound132 = (short)(0) ;
      /* Using cursor T003511 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T003511_A970ProceCod[0] < A970ProceCod ) ) && ( GXutil.strcmp(T003511_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T003511_A970ProceCod[0] > A970ProceCod ) ) && ( GXutil.strcmp(T003511_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A970ProceCod = T003511_A970ProceCod[0] ;
            n970ProceCod = T003511_n970ProceCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            RcdFound132 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound132 = (short)(0) ;
      /* Using cursor T003512 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T003512_A970ProceCod[0] > A970ProceCod ) ) && ( GXutil.strcmp(T003512_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T003512_A970ProceCod[0] < A970ProceCod ) ) && ( GXutil.strcmp(T003512_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A970ProceCod = T003512_A970ProceCod[0] ;
            n970ProceCod = T003512_n970ProceCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
            RcdFound132 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey35132( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProceCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert35132( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound132 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A970ProceCod != Z970ProceCod ) )
            {
               A970ProceCod = Z970ProceCod ;
               n970ProceCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PROCECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update35132( ) ;
               GX_FocusControl = edtProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A970ProceCod != Z970ProceCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtProceCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert35132( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PROCECOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProceCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtProceCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert35132( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A970ProceCod != Z970ProceCod ) )
      {
         A970ProceCod = Z970ProceCod ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProceCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProceCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency35132( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00352 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCED"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z993ProceNif, T00352_A993ProceNif[0]) != 0 ) || ( GXutil.strcmp(Z971ProceNom, T00352_A971ProceNom[0]) != 0 ) || ( GXutil.strcmp(Z994ProceDom, T00352_A994ProceDom[0]) != 0 ) || ( GXutil.strcmp(Z988ProcePob, T00352_A988ProcePob[0]) != 0 ) || ( GXutil.strcmp(Z989PoceCp, T00352_A989PoceCp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14029PoceCp2, T00352_A14029PoceCp2[0]) != 0 ) || ( GXutil.strcmp(Z990ProceTel1, T00352_A990ProceTel1[0]) != 0 ) || ( GXutil.strcmp(Z991ProceTel2, T00352_A991ProceTel2[0]) != 0 ) || ( GXutil.strcmp(Z992ProceTelex, T00352_A992ProceTelex[0]) != 0 ) || ( GXutil.strcmp(Z6187ProceIe, T00352_A6187ProceIe[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10390ProPers, T00352_A10390ProPers[0]) != 0 ) || ( GXutil.strcmp(Z10391ProEmail, T00352_A10391ProEmail[0]) != 0 ) || ( Z10122GpoEcoCod != T00352_A10122GpoEcoCod[0] ) || ( Z781PrvCod != T00352_A781PrvCod[0] ) )
         {
            if ( GXutil.strcmp(Z993ProceNif, T00352_A993ProceNif[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProceNif");
               GXutil.writeLogRaw("Old: ",Z993ProceNif);
               GXutil.writeLogRaw("Current: ",T00352_A993ProceNif[0]);
            }
            if ( GXutil.strcmp(Z971ProceNom, T00352_A971ProceNom[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProceNom");
               GXutil.writeLogRaw("Old: ",Z971ProceNom);
               GXutil.writeLogRaw("Current: ",T00352_A971ProceNom[0]);
            }
            if ( GXutil.strcmp(Z994ProceDom, T00352_A994ProceDom[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProceDom");
               GXutil.writeLogRaw("Old: ",Z994ProceDom);
               GXutil.writeLogRaw("Current: ",T00352_A994ProceDom[0]);
            }
            if ( GXutil.strcmp(Z988ProcePob, T00352_A988ProcePob[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProcePob");
               GXutil.writeLogRaw("Old: ",Z988ProcePob);
               GXutil.writeLogRaw("Current: ",T00352_A988ProcePob[0]);
            }
            if ( GXutil.strcmp(Z989PoceCp, T00352_A989PoceCp[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"PoceCp");
               GXutil.writeLogRaw("Old: ",Z989PoceCp);
               GXutil.writeLogRaw("Current: ",T00352_A989PoceCp[0]);
            }
            if ( GXutil.strcmp(Z14029PoceCp2, T00352_A14029PoceCp2[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"PoceCp2");
               GXutil.writeLogRaw("Old: ",Z14029PoceCp2);
               GXutil.writeLogRaw("Current: ",T00352_A14029PoceCp2[0]);
            }
            if ( GXutil.strcmp(Z990ProceTel1, T00352_A990ProceTel1[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProceTel1");
               GXutil.writeLogRaw("Old: ",Z990ProceTel1);
               GXutil.writeLogRaw("Current: ",T00352_A990ProceTel1[0]);
            }
            if ( GXutil.strcmp(Z991ProceTel2, T00352_A991ProceTel2[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProceTel2");
               GXutil.writeLogRaw("Old: ",Z991ProceTel2);
               GXutil.writeLogRaw("Current: ",T00352_A991ProceTel2[0]);
            }
            if ( GXutil.strcmp(Z992ProceTelex, T00352_A992ProceTelex[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProceTelex");
               GXutil.writeLogRaw("Old: ",Z992ProceTelex);
               GXutil.writeLogRaw("Current: ",T00352_A992ProceTelex[0]);
            }
            if ( GXutil.strcmp(Z6187ProceIe, T00352_A6187ProceIe[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProceIe");
               GXutil.writeLogRaw("Old: ",Z6187ProceIe);
               GXutil.writeLogRaw("Current: ",T00352_A6187ProceIe[0]);
            }
            if ( GXutil.strcmp(Z10390ProPers, T00352_A10390ProPers[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProPers");
               GXutil.writeLogRaw("Old: ",Z10390ProPers);
               GXutil.writeLogRaw("Current: ",T00352_A10390ProPers[0]);
            }
            if ( GXutil.strcmp(Z10391ProEmail, T00352_A10391ProEmail[0]) != 0 )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"ProEmail");
               GXutil.writeLogRaw("Old: ",Z10391ProEmail);
               GXutil.writeLogRaw("Current: ",T00352_A10391ProEmail[0]);
            }
            if ( Z10122GpoEcoCod != T00352_A10122GpoEcoCod[0] )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"GpoEcoCod");
               GXutil.writeLogRaw("Old: ",Z10122GpoEcoCod);
               GXutil.writeLogRaw("Current: ",T00352_A10122GpoEcoCod[0]);
            }
            if ( Z781PrvCod != T00352_A781PrvCod[0] )
            {
               GXutil.writeLogln("tproced:[seudo value changed for attri]"+"PrvCod");
               GXutil.writeLogRaw("Old: ",Z781PrvCod);
               GXutil.writeLogRaw("Current: ",T00352_A781PrvCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROCED"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert35132( )
   {
      beforeValidate35132( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable35132( ) ;
      }
      if ( AnyError == 0 )
      {
         zm35132( 0) ;
         checkOptimisticConcurrency35132( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm35132( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert35132( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003513 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n993ProceNif), A993ProceNif, Boolean.valueOf(n971ProceNom), A971ProceNom, Boolean.valueOf(n994ProceDom), A994ProceDom, Boolean.valueOf(n988ProcePob), A988ProcePob, Boolean.valueOf(n989PoceCp), A989PoceCp, Boolean.valueOf(n14029PoceCp2), A14029PoceCp2, Boolean.valueOf(n990ProceTel1), A990ProceTel1, Boolean.valueOf(n991ProceTel2), A991ProceTel2, Boolean.valueOf(n992ProceTelex), A992ProceTelex, Boolean.valueOf(n6187ProceIe), A6187ProceIe, Boolean.valueOf(n10390ProPers), A10390ProPers, Boolean.valueOf(n10391ProEmail), A10391ProEmail, A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod), Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCED");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption350( ) ;
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
            load35132( ) ;
         }
         endLevel35132( ) ;
      }
      closeExtendedTableCursors35132( ) ;
   }

   public void update35132( )
   {
      beforeValidate35132( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable35132( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency35132( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm35132( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate35132( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003514 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n993ProceNif), A993ProceNif, Boolean.valueOf(n971ProceNom), A971ProceNom, Boolean.valueOf(n994ProceDom), A994ProceDom, Boolean.valueOf(n988ProcePob), A988ProcePob, Boolean.valueOf(n989PoceCp), A989PoceCp, Boolean.valueOf(n14029PoceCp2), A14029PoceCp2, Boolean.valueOf(n990ProceTel1), A990ProceTel1, Boolean.valueOf(n991ProceTel2), A991ProceTel2, Boolean.valueOf(n992ProceTelex), A992ProceTelex, Boolean.valueOf(n6187ProceIe), A6187ProceIe, Boolean.valueOf(n10390ProPers), A10390ProPers, Boolean.valueOf(n10391ProEmail), A10391ProEmail, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod), Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod), A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCED");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCED"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate35132( ) ;
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
         endLevel35132( ) ;
      }
      closeExtendedTableCursors35132( ) ;
   }

   public void deferredUpdate35132( )
   {
   }

   public void delete( )
   {
      beforeValidate35132( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency35132( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls35132( ) ;
         afterConfirm35132( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete35132( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T003515 */
               pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCED");
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
      sMode132 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel35132( ) ;
      Gx_mode = sMode132 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls35132( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13820ProceNomID = GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) + "-" + GXutil.trim( A971ProceNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13820ProceNomID", A13820ProceNomID);
         /* Using cursor T003516 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
         A787PrvDsc = T003516_A787PrvDsc[0] ;
         n787PrvDsc = T003516_n787PrvDsc[0] ;
         pr_default.close(14);
         /* Using cursor T003517 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n10122GpoEcoCod), Integer.valueOf(A10122GpoEcoCod)});
         A10123GpoEcoNom = T003517_A10123GpoEcoNom[0] ;
         n10123GpoEcoNom = T003517_n10123GpoEcoNom[0] ;
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T003518 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Cabecera)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T003519 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T003520 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREOPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T003521 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T003522 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPEANT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T003523 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T003524 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T003525 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T003526 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void endLevel35132( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete35132( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tproced");
         if ( AnyError == 0 )
         {
            confirmValues350( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tproced");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart35132( )
   {
      /* Scan By routine */
      /* Using cursor T003527 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      RcdFound132 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound132 = (short)(1) ;
         A970ProceCod = T003527_A970ProceCod[0] ;
         n970ProceCod = T003527_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext35132( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound132 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound132 = (short)(1) ;
         A970ProceCod = T003527_A970ProceCod[0] ;
         n970ProceCod = T003527_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
   }

   public void scanEnd35132( )
   {
      pr_default.close(25);
   }

   public void afterConfirm35132( )
   {
      /* After Confirm Rules */
      if ( (0==A970ProceCod) && (0==AV54autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "PROCECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProceCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert35132( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A970ProceCod) && ( AV54autonumber == 1 ) )
      {
         GXt_int10 = A970ProceCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.tproced_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int11) ;
         tproced_impl.this.GXt_int10 = GXv_int11[0] ;
         A970ProceCod = GXt_int10 ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
   }

   public void beforeUpdate35132( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete35132( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete35132( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate35132( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes35132( )
   {
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtProceNif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNif_Enabled), 5, 0), true);
      edtProceDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceDom_Enabled), 5, 0), true);
      edtPoceCp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPoceCp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPoceCp_Enabled), 5, 0), true);
      edtPoceCp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPoceCp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPoceCp2_Enabled), 5, 0), true);
      edtProcePob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProcePob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProcePob_Enabled), 5, 0), true);
      edtPrvCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Enabled), 5, 0), true);
      edtProPers_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPers_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPers_Enabled), 5, 0), true);
      edtProEmail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProEmail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProEmail_Enabled), 5, 0), true);
      edtProceTel1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceTel1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTel1_Enabled), 5, 0), true);
      edtProceTel2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceTel2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTel2_Enabled), 5, 0), true);
      edtProceTelex_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceTelex_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTelex_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboprvcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboprvcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboprvcod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes35132( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues350( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tproced", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV43EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44ProceCod,4,0))}, new String[] {"Gx_mode","EmprCod","ProceCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPROCED");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV55Pgmname, "")));
      forbiddenHiddens.add("ProceIe", GXutil.rtrim( localUtil.format( A6187ProceIe, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tproced:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z993ProceNif", GXutil.rtrim( Z993ProceNif));
      app.GxWebStd.gx_hidden_field( httpContext, "Z971ProceNom", GXutil.rtrim( Z971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z994ProceDom", GXutil.rtrim( Z994ProceDom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z988ProcePob", GXutil.rtrim( Z988ProcePob));
      app.GxWebStd.gx_hidden_field( httpContext, "Z989PoceCp", GXutil.rtrim( Z989PoceCp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14029PoceCp2", GXutil.rtrim( Z14029PoceCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z990ProceTel1", GXutil.rtrim( Z990ProceTel1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z991ProceTel2", GXutil.rtrim( Z991ProceTel2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z992ProceTelex", GXutil.rtrim( Z992ProceTelex));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6187ProceIe", GXutil.rtrim( Z6187ProceIe));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10390ProPers", GXutil.rtrim( Z10390ProPers));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10391ProEmail", GXutil.rtrim( Z10391ProEmail));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( Z10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z781PrvCod", GXutil.ltrim( localUtil.ntoc( Z781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N781PrvCod", GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N10122GpoEcoCod", GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRVCOD_DATA", AV51PrvCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRVCOD_DATA", AV51PrvCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV46TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV46TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV46TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCENOMID", A13820ProceNomID);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV43EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCECOD", GXutil.ltrim( localUtil.ntoc( AV44ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV44ProceCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV54autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVCOD", GXutil.ltrim( localUtil.ntoc( AV48Insert_PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_GPOECOCOD", GXutil.ltrim( localUtil.ntoc( AV49Insert_GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GPOECOCOD", GXutil.ltrim( localUtil.ntoc( A10122GpoEcoCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCEIE", GXutil.rtrim( A6187ProceIe));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GPOECONOM", A10123GpoEcoNom);
      app.GxWebStd.gx_hidden_field( httpContext, "PRVDSC", GXutil.rtrim( A787PrvDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Objectcall", GXutil.rtrim( Combo_prvcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Cls", GXutil.rtrim( Combo_prvcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Selectedvalue_set", GXutil.rtrim( Combo_prvcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Enabled", GXutil.booltostr( Combo_prvcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRVCOD_Emptyitem", GXutil.booltostr( Combo_prvcod_Emptyitem));
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
      return formatLink("app.tproced", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV43EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV44ProceCod,4,0))}, new String[] {"Gx_mode","EmprCod","ProceCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPROCED" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROCEDENCIAS", "") ;
   }

   public void initializeNonKey35132( )
   {
      A781PrvCod = (short)(0) ;
      n781PrvCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A781PrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A781PrvCod), 3, 0));
      A10122GpoEcoCod = 0 ;
      n10122GpoEcoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10122GpoEcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10122GpoEcoCod), 6, 0));
      A13820ProceNomID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13820ProceNomID", A13820ProceNomID);
      A993ProceNif = "" ;
      n993ProceNif = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A993ProceNif", A993ProceNif);
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A994ProceDom = "" ;
      n994ProceDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A994ProceDom", A994ProceDom);
      A988ProcePob = "" ;
      n988ProcePob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A988ProcePob", A988ProcePob);
      A787PrvDsc = "" ;
      n787PrvDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", A787PrvDsc);
      A989PoceCp = "" ;
      n989PoceCp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A989PoceCp", A989PoceCp);
      A14029PoceCp2 = "" ;
      n14029PoceCp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14029PoceCp2", A14029PoceCp2);
      A990ProceTel1 = "" ;
      n990ProceTel1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A990ProceTel1", A990ProceTel1);
      A991ProceTel2 = "" ;
      n991ProceTel2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A991ProceTel2", A991ProceTel2);
      A992ProceTelex = "" ;
      n992ProceTelex = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A992ProceTelex", A992ProceTelex);
      A6187ProceIe = "" ;
      n6187ProceIe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6187ProceIe", A6187ProceIe);
      A10123GpoEcoNom = "" ;
      n10123GpoEcoNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10123GpoEcoNom", A10123GpoEcoNom);
      A10390ProPers = "" ;
      n10390ProPers = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10390ProPers", A10390ProPers);
      A10391ProEmail = "" ;
      n10391ProEmail = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10391ProEmail", A10391ProEmail);
      Z993ProceNif = "" ;
      Z971ProceNom = "" ;
      Z994ProceDom = "" ;
      Z988ProcePob = "" ;
      Z989PoceCp = "" ;
      Z14029PoceCp2 = "" ;
      Z990ProceTel1 = "" ;
      Z991ProceTel2 = "" ;
      Z992ProceTelex = "" ;
      Z6187ProceIe = "" ;
      Z10390ProPers = "" ;
      Z10391ProEmail = "" ;
      Z10122GpoEcoCod = 0 ;
      Z781PrvCod = (short)(0) ;
   }

   public void initAll35132( )
   {
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      initializeNonKey35132( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211653950", true, true);
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
      httpContext.AddJavascriptSource("tproced.js", "?20268211653950", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtProceCod_Internalname = "PROCECOD" ;
      edtProceNom_Internalname = "PROCENOM" ;
      edtProceNif_Internalname = "PROCENIF" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtProceDom_Internalname = "PROCEDOM" ;
      edtPoceCp_Internalname = "POCECP" ;
      edtPoceCp2_Internalname = "POCECP2" ;
      edtProcePob_Internalname = "PROCEPOB" ;
      lblTextblockprvcod_Internalname = "TEXTBLOCKPRVCOD" ;
      Combo_prvcod_Internalname = "COMBO_PRVCOD" ;
      edtPrvCod_Internalname = "PRVCOD" ;
      divTablesplittedprvcod_Internalname = "TABLESPLITTEDPRVCOD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtProPers_Internalname = "PROPERS" ;
      edtProEmail_Internalname = "PROEMAIL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtProceTel1_Internalname = "PROCETEL1" ;
      edtProceTel2_Internalname = "PROCETEL2" ;
      edtProceTelex_Internalname = "PROCETELEX" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboprvcod_Internalname = "vCOMBOPRVCOD" ;
      divSectionattribute_prvcod_Internalname = "SECTIONATTRIBUTE_PRVCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      Form.setCaption( httpContext.getMessage( "PROCEDENCIAS", "") );
      edtavComboprvcod_Jsonclick = "" ;
      edtavComboprvcod_Enabled = 0 ;
      edtavComboprvcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProceTelex_Jsonclick = "" ;
      edtProceTelex_Enabled = 1 ;
      edtProceTel2_Jsonclick = "" ;
      edtProceTel2_Enabled = 1 ;
      edtProceTel1_Jsonclick = "" ;
      edtProceTel1_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Telefonos", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtProEmail_Jsonclick = "" ;
      edtProEmail_Enabled = 1 ;
      edtProPers_Jsonclick = "" ;
      edtProPers_Enabled = 1 ;
      edtPrvCod_Jsonclick = "" ;
      edtPrvCod_Enabled = 1 ;
      edtPrvCod_Visible = 1 ;
      Combo_prvcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prvcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_prvcod_Enabled = GXutil.toBoolean( -1) ;
      edtProcePob_Jsonclick = "" ;
      edtProcePob_Enabled = 1 ;
      edtPoceCp2_Jsonclick = "" ;
      edtPoceCp2_Enabled = 1 ;
      edtPoceCp_Jsonclick = "" ;
      edtPoceCp_Enabled = 1 ;
      edtProceDom_Jsonclick = "" ;
      edtProceDom_Enabled = 1 ;
      edtProceNif_Jsonclick = "" ;
      edtProceNif_Enabled = 1 ;
      edtProceNom_Jsonclick = "" ;
      edtProceNom_Enabled = 1 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Enabled = 1 ;
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

   public void gx6asaprocecod35132( short AV44ProceCod )
   {
      if ( ! (0==AV44ProceCod) )
      {
         A970ProceCod = AV44ProceCod ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asaprocecod35132( short A970ProceCod ,
                                    short AV54autonumber ,
                                    String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A970ProceCod) && ( AV54autonumber == 1 ) )
      {
         GXt_int10 = A970ProceCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.tproced_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int11) ;
         tproced_impl.this.GXt_int10 = GXv_int11[0] ;
         A970ProceCod = GXt_int10 ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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

   public void valid_Prvcod( )
   {
      n781PrvCod = false ;
      n787PrvDsc = false ;
      /* Using cursor T003516 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n781PrvCod), Short.valueOf(A781PrvCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROVIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
      }
      A787PrvDsc = T003516_A787PrvDsc[0] ;
      n787PrvDsc = T003516_n787PrvDsc[0] ;
      pr_default.close(14);
      if ( (0==A781PrvCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Provincia es requerido.", ""), 1, "PRVCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrvCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A787PrvDsc", GXutil.rtrim( A787PrvDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44ProceCod',fld:'vPROCECOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV46TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV44ProceCod',fld:'vPROCECOD',pic:'ZZZ9',hsh:true},{av:'AV55Pgmname',fld:'vPGMNAME',pic:''},{av:'A6187ProceIe',fld:'PROCEIE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12352',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV46TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[]");
      setEventMetadata("VALID_PROCECOD",",oparms:[]}");
      setEventMetadata("VALID_PROCENOM","{handler:'valid_Procenom',iparms:[]");
      setEventMetadata("VALID_PROCENOM",",oparms:[]}");
      setEventMetadata("VALID_PRVCOD","{handler:'valid_Prvcod',iparms:[{av:'A781PrvCod',fld:'PRVCOD',pic:'ZZ9'},{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'}]");
      setEventMetadata("VALID_PRVCOD",",oparms:[{av:'A787PrvDsc',fld:'PRVDSC',pic:'@!'}]}");
      setEventMetadata("VALID_PROEMAIL","{handler:'valid_Proemail',iparms:[]");
      setEventMetadata("VALID_PROEMAIL",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOPRVCOD","{handler:'validv_Comboprvcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOPRVCOD",",oparms:[]}");
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
      pr_default.close(15);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV43EmprCod = "" ;
      Z396EmprCod = "" ;
      Z993ProceNif = "" ;
      Z971ProceNom = "" ;
      Z994ProceDom = "" ;
      Z988ProcePob = "" ;
      Z989PoceCp = "" ;
      Z14029PoceCp2 = "" ;
      Z990ProceTel1 = "" ;
      Z991ProceTel2 = "" ;
      Z992ProceTelex = "" ;
      Z6187ProceIe = "" ;
      Z10390ProPers = "" ;
      Z10391ProEmail = "" ;
      Combo_prvcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV43EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A971ProceNom = "" ;
      A993ProceNif = "" ;
      A994ProceDom = "" ;
      A989PoceCp = "" ;
      A14029PoceCp2 = "" ;
      A988ProcePob = "" ;
      lblTextblockprvcod_Jsonclick = "" ;
      ucCombo_prvcod = new com.genexus.webpanels.GXUserControl();
      Combo_prvcod_Caption = "" ;
      AV51PrvCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV55Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A6187ProceIe = "" ;
      A13820ProceNomID = "" ;
      A407EmprNom = "" ;
      A10123GpoEcoNom = "" ;
      A787PrvDsc = "" ;
      Combo_prvcod_Objectcall = "" ;
      Combo_prvcod_Class = "" ;
      Combo_prvcod_Icontype = "" ;
      Combo_prvcod_Icon = "" ;
      Combo_prvcod_Tooltip = "" ;
      Combo_prvcod_Selectedvalue_set = "" ;
      Combo_prvcod_Selectedtext_set = "" ;
      Combo_prvcod_Selectedtext_get = "" ;
      Combo_prvcod_Gamoauthtoken = "" ;
      Combo_prvcod_Ddointernalname = "" ;
      Combo_prvcod_Titlecontrolalign = "" ;
      Combo_prvcod_Dropdownoptionstype = "" ;
      Combo_prvcod_Titlecontrolidtoreplace = "" ;
      Combo_prvcod_Datalisttype = "" ;
      Combo_prvcod_Datalistfixedvalues = "" ;
      Combo_prvcod_Datalistproc = "" ;
      Combo_prvcod_Datalistprocparametersprefix = "" ;
      Combo_prvcod_Remoteservicesparameters = "" ;
      Combo_prvcod_Htmltemplate = "" ;
      Combo_prvcod_Multiplevaluestype = "" ;
      Combo_prvcod_Loadingdata = "" ;
      Combo_prvcod_Noresultsfound = "" ;
      Combo_prvcod_Emptyitemtext = "" ;
      Combo_prvcod_Onlyselectedvalues = "" ;
      Combo_prvcod_Selectalltext = "" ;
      Combo_prvcod_Multiplevaluesseparator = "" ;
      Combo_prvcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode132 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV45WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV46TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV47WebSession = httpContext.getWebSession();
      AV50TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV52ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z10123GpoEcoNom = "" ;
      Z787PrvDsc = "" ;
      T00354_A407EmprNom = new String[] {""} ;
      T00354_n407EmprNom = new boolean[] {false} ;
      T00355_A10123GpoEcoNom = new String[] {""} ;
      T00355_n10123GpoEcoNom = new boolean[] {false} ;
      T00356_A787PrvDsc = new String[] {""} ;
      T00356_n787PrvDsc = new boolean[] {false} ;
      T00357_A970ProceCod = new short[1] ;
      T00357_n970ProceCod = new boolean[] {false} ;
      T00357_A407EmprNom = new String[] {""} ;
      T00357_n407EmprNom = new boolean[] {false} ;
      T00357_A993ProceNif = new String[] {""} ;
      T00357_n993ProceNif = new boolean[] {false} ;
      T00357_A971ProceNom = new String[] {""} ;
      T00357_n971ProceNom = new boolean[] {false} ;
      T00357_A994ProceDom = new String[] {""} ;
      T00357_n994ProceDom = new boolean[] {false} ;
      T00357_A988ProcePob = new String[] {""} ;
      T00357_n988ProcePob = new boolean[] {false} ;
      T00357_A787PrvDsc = new String[] {""} ;
      T00357_n787PrvDsc = new boolean[] {false} ;
      T00357_A989PoceCp = new String[] {""} ;
      T00357_n989PoceCp = new boolean[] {false} ;
      T00357_A14029PoceCp2 = new String[] {""} ;
      T00357_n14029PoceCp2 = new boolean[] {false} ;
      T00357_A990ProceTel1 = new String[] {""} ;
      T00357_n990ProceTel1 = new boolean[] {false} ;
      T00357_A991ProceTel2 = new String[] {""} ;
      T00357_n991ProceTel2 = new boolean[] {false} ;
      T00357_A992ProceTelex = new String[] {""} ;
      T00357_n992ProceTelex = new boolean[] {false} ;
      T00357_A6187ProceIe = new String[] {""} ;
      T00357_n6187ProceIe = new boolean[] {false} ;
      T00357_A10123GpoEcoNom = new String[] {""} ;
      T00357_n10123GpoEcoNom = new boolean[] {false} ;
      T00357_A10390ProPers = new String[] {""} ;
      T00357_n10390ProPers = new boolean[] {false} ;
      T00357_A10391ProEmail = new String[] {""} ;
      T00357_n10391ProEmail = new boolean[] {false} ;
      T00357_A396EmprCod = new String[] {""} ;
      T00357_A10122GpoEcoCod = new int[1] ;
      T00357_n10122GpoEcoCod = new boolean[] {false} ;
      T00357_A781PrvCod = new short[1] ;
      T00357_n781PrvCod = new boolean[] {false} ;
      T00358_A787PrvDsc = new String[] {""} ;
      T00358_n787PrvDsc = new boolean[] {false} ;
      T00359_A10123GpoEcoNom = new String[] {""} ;
      T00359_n10123GpoEcoNom = new boolean[] {false} ;
      T003510_A396EmprCod = new String[] {""} ;
      T003510_A970ProceCod = new short[1] ;
      T003510_n970ProceCod = new boolean[] {false} ;
      T00353_A970ProceCod = new short[1] ;
      T00353_n970ProceCod = new boolean[] {false} ;
      T00353_A993ProceNif = new String[] {""} ;
      T00353_n993ProceNif = new boolean[] {false} ;
      T00353_A971ProceNom = new String[] {""} ;
      T00353_n971ProceNom = new boolean[] {false} ;
      T00353_A994ProceDom = new String[] {""} ;
      T00353_n994ProceDom = new boolean[] {false} ;
      T00353_A988ProcePob = new String[] {""} ;
      T00353_n988ProcePob = new boolean[] {false} ;
      T00353_A989PoceCp = new String[] {""} ;
      T00353_n989PoceCp = new boolean[] {false} ;
      T00353_A14029PoceCp2 = new String[] {""} ;
      T00353_n14029PoceCp2 = new boolean[] {false} ;
      T00353_A990ProceTel1 = new String[] {""} ;
      T00353_n990ProceTel1 = new boolean[] {false} ;
      T00353_A991ProceTel2 = new String[] {""} ;
      T00353_n991ProceTel2 = new boolean[] {false} ;
      T00353_A992ProceTelex = new String[] {""} ;
      T00353_n992ProceTelex = new boolean[] {false} ;
      T00353_A6187ProceIe = new String[] {""} ;
      T00353_n6187ProceIe = new boolean[] {false} ;
      T00353_A10390ProPers = new String[] {""} ;
      T00353_n10390ProPers = new boolean[] {false} ;
      T00353_A10391ProEmail = new String[] {""} ;
      T00353_n10391ProEmail = new boolean[] {false} ;
      T00353_A396EmprCod = new String[] {""} ;
      T00353_A10122GpoEcoCod = new int[1] ;
      T00353_n10122GpoEcoCod = new boolean[] {false} ;
      T00353_A781PrvCod = new short[1] ;
      T00353_n781PrvCod = new boolean[] {false} ;
      T003511_A396EmprCod = new String[] {""} ;
      T003511_A970ProceCod = new short[1] ;
      T003511_n970ProceCod = new boolean[] {false} ;
      T003512_A396EmprCod = new String[] {""} ;
      T003512_A970ProceCod = new short[1] ;
      T003512_n970ProceCod = new boolean[] {false} ;
      T00352_A970ProceCod = new short[1] ;
      T00352_n970ProceCod = new boolean[] {false} ;
      T00352_A993ProceNif = new String[] {""} ;
      T00352_n993ProceNif = new boolean[] {false} ;
      T00352_A971ProceNom = new String[] {""} ;
      T00352_n971ProceNom = new boolean[] {false} ;
      T00352_A994ProceDom = new String[] {""} ;
      T00352_n994ProceDom = new boolean[] {false} ;
      T00352_A988ProcePob = new String[] {""} ;
      T00352_n988ProcePob = new boolean[] {false} ;
      T00352_A989PoceCp = new String[] {""} ;
      T00352_n989PoceCp = new boolean[] {false} ;
      T00352_A14029PoceCp2 = new String[] {""} ;
      T00352_n14029PoceCp2 = new boolean[] {false} ;
      T00352_A990ProceTel1 = new String[] {""} ;
      T00352_n990ProceTel1 = new boolean[] {false} ;
      T00352_A991ProceTel2 = new String[] {""} ;
      T00352_n991ProceTel2 = new boolean[] {false} ;
      T00352_A992ProceTelex = new String[] {""} ;
      T00352_n992ProceTelex = new boolean[] {false} ;
      T00352_A6187ProceIe = new String[] {""} ;
      T00352_n6187ProceIe = new boolean[] {false} ;
      T00352_A10390ProPers = new String[] {""} ;
      T00352_n10390ProPers = new boolean[] {false} ;
      T00352_A10391ProEmail = new String[] {""} ;
      T00352_n10391ProEmail = new boolean[] {false} ;
      T00352_A396EmprCod = new String[] {""} ;
      T00352_A10122GpoEcoCod = new int[1] ;
      T00352_n10122GpoEcoCod = new boolean[] {false} ;
      T00352_A781PrvCod = new short[1] ;
      T00352_n781PrvCod = new boolean[] {false} ;
      T003516_A787PrvDsc = new String[] {""} ;
      T003516_n787PrvDsc = new boolean[] {false} ;
      T003517_A10123GpoEcoNom = new String[] {""} ;
      T003517_n10123GpoEcoNom = new boolean[] {false} ;
      T003518_A396EmprCod = new String[] {""} ;
      T003518_A4850DevComCod = new int[1] ;
      T003519_A396EmprCod = new String[] {""} ;
      T003519_A10588H_RecCod = new int[1] ;
      T003520_A396EmprCod = new String[] {""} ;
      T003520_A970ProceCod = new short[1] ;
      T003520_n970ProceCod = new boolean[] {false} ;
      T003520_A2102OperCod = new String[] {""} ;
      T003521_A396EmprCod = new String[] {""} ;
      T003521_A1031EmpesCod = new String[] {""} ;
      T003521_A252CliCod = new int[1] ;
      T003521_A1032FonCod = new String[] {""} ;
      T003522_A396EmprCod = new String[] {""} ;
      T003522_A2420OpeAntCod = new int[1] ;
      T003523_A396EmprCod = new String[] {""} ;
      T003523_A2268MovParCod = new String[] {""} ;
      T003523_A252CliCod = new int[1] ;
      T003524_A396EmprCod = new String[] {""} ;
      T003524_A966PartCod = new String[] {""} ;
      T003524_A252CliCod = new int[1] ;
      T003525_A396EmprCod = new String[] {""} ;
      T003525_A252CliCod = new int[1] ;
      T003525_A65ArtCod = new String[] {""} ;
      T003526_A396EmprCod = new String[] {""} ;
      T003526_A44AlbRecCod = new int[1] ;
      T003527_A396EmprCod = new String[] {""} ;
      T003527_A970ProceCod = new short[1] ;
      T003527_n970ProceCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int11 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tproced__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tproced__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tproced__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tproced__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tproced__default(),
         new Object[] {
             new Object[] {
            T00352_A970ProceCod, T00352_A993ProceNif, T00352_n993ProceNif, T00352_A971ProceNom, T00352_n971ProceNom, T00352_A994ProceDom, T00352_n994ProceDom, T00352_A988ProcePob, T00352_n988ProcePob, T00352_A989PoceCp,
            T00352_n989PoceCp, T00352_A14029PoceCp2, T00352_n14029PoceCp2, T00352_A990ProceTel1, T00352_n990ProceTel1, T00352_A991ProceTel2, T00352_n991ProceTel2, T00352_A992ProceTelex, T00352_n992ProceTelex, T00352_A6187ProceIe,
            T00352_n6187ProceIe, T00352_A10390ProPers, T00352_n10390ProPers, T00352_A10391ProEmail, T00352_n10391ProEmail, T00352_A396EmprCod, T00352_A10122GpoEcoCod, T00352_n10122GpoEcoCod, T00352_A781PrvCod, T00352_n781PrvCod
            }
            , new Object[] {
            T00353_A970ProceCod, T00353_A993ProceNif, T00353_n993ProceNif, T00353_A971ProceNom, T00353_n971ProceNom, T00353_A994ProceDom, T00353_n994ProceDom, T00353_A988ProcePob, T00353_n988ProcePob, T00353_A989PoceCp,
            T00353_n989PoceCp, T00353_A14029PoceCp2, T00353_n14029PoceCp2, T00353_A990ProceTel1, T00353_n990ProceTel1, T00353_A991ProceTel2, T00353_n991ProceTel2, T00353_A992ProceTelex, T00353_n992ProceTelex, T00353_A6187ProceIe,
            T00353_n6187ProceIe, T00353_A10390ProPers, T00353_n10390ProPers, T00353_A10391ProEmail, T00353_n10391ProEmail, T00353_A396EmprCod, T00353_A10122GpoEcoCod, T00353_n10122GpoEcoCod, T00353_A781PrvCod, T00353_n781PrvCod
            }
            , new Object[] {
            T00354_A407EmprNom, T00354_n407EmprNom
            }
            , new Object[] {
            T00355_A10123GpoEcoNom, T00355_n10123GpoEcoNom
            }
            , new Object[] {
            T00356_A787PrvDsc, T00356_n787PrvDsc
            }
            , new Object[] {
            T00357_A970ProceCod, T00357_A407EmprNom, T00357_n407EmprNom, T00357_A993ProceNif, T00357_n993ProceNif, T00357_A971ProceNom, T00357_n971ProceNom, T00357_A994ProceDom, T00357_n994ProceDom, T00357_A988ProcePob,
            T00357_n988ProcePob, T00357_A787PrvDsc, T00357_n787PrvDsc, T00357_A989PoceCp, T00357_n989PoceCp, T00357_A14029PoceCp2, T00357_n14029PoceCp2, T00357_A990ProceTel1, T00357_n990ProceTel1, T00357_A991ProceTel2,
            T00357_n991ProceTel2, T00357_A992ProceTelex, T00357_n992ProceTelex, T00357_A6187ProceIe, T00357_n6187ProceIe, T00357_A10123GpoEcoNom, T00357_n10123GpoEcoNom, T00357_A10390ProPers, T00357_n10390ProPers, T00357_A10391ProEmail,
            T00357_n10391ProEmail, T00357_A396EmprCod, T00357_A10122GpoEcoCod, T00357_n10122GpoEcoCod, T00357_A781PrvCod, T00357_n781PrvCod
            }
            , new Object[] {
            T00358_A787PrvDsc, T00358_n787PrvDsc
            }
            , new Object[] {
            T00359_A10123GpoEcoNom, T00359_n10123GpoEcoNom
            }
            , new Object[] {
            T003510_A396EmprCod, T003510_A970ProceCod
            }
            , new Object[] {
            T003511_A396EmprCod, T003511_A970ProceCod
            }
            , new Object[] {
            T003512_A396EmprCod, T003512_A970ProceCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T003516_A787PrvDsc, T003516_n787PrvDsc
            }
            , new Object[] {
            T003517_A10123GpoEcoNom, T003517_n10123GpoEcoNom
            }
            , new Object[] {
            T003518_A396EmprCod, T003518_A4850DevComCod
            }
            , new Object[] {
            T003519_A396EmprCod, T003519_A10588H_RecCod
            }
            , new Object[] {
            T003520_A396EmprCod, T003520_A970ProceCod, T003520_A2102OperCod
            }
            , new Object[] {
            T003521_A396EmprCod, T003521_A1031EmpesCod, T003521_A252CliCod, T003521_A1032FonCod
            }
            , new Object[] {
            T003522_A396EmprCod, T003522_A2420OpeAntCod
            }
            , new Object[] {
            T003523_A396EmprCod, T003523_A2268MovParCod, T003523_A252CliCod
            }
            , new Object[] {
            T003524_A396EmprCod, T003524_A966PartCod, T003524_A252CliCod
            }
            , new Object[] {
            T003525_A396EmprCod, T003525_A252CliCod, T003525_A65ArtCod
            }
            , new Object[] {
            T003526_A396EmprCod, T003526_A44AlbRecCod
            }
            , new Object[] {
            T003527_A396EmprCod, T003527_A970ProceCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV55Pgmname = "TPROCED" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV44ProceCod ;
   private short Z970ProceCod ;
   private short Z781PrvCod ;
   private short N781PrvCod ;
   private short AV44ProceCod ;
   private short A970ProceCod ;
   private short AV54autonumber ;
   private short A781PrvCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short AV53ComboPrvCod ;
   private short AV48Insert_PrvCod ;
   private short RcdFound132 ;
   private short nIsDirty_132 ;
   private short GXt_int10 ;
   private short GXv_int11[] ;
   private int Z10122GpoEcoCod ;
   private int N10122GpoEcoCod ;
   private int A10122GpoEcoCod ;
   private int trnEnded ;
   private int edtProceCod_Enabled ;
   private int edtProceNom_Enabled ;
   private int edtProceNif_Enabled ;
   private int edtProceDom_Enabled ;
   private int edtPoceCp_Enabled ;
   private int edtPoceCp2_Enabled ;
   private int edtProcePob_Enabled ;
   private int edtPrvCod_Visible ;
   private int edtPrvCod_Enabled ;
   private int edtProPers_Enabled ;
   private int edtProEmail_Enabled ;
   private int edtProceTel1_Enabled ;
   private int edtProceTel2_Enabled ;
   private int edtProceTelex_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboprvcod_Enabled ;
   private int edtavComboprvcod_Visible ;
   private int AV49Insert_GpoEcoCod ;
   private int Combo_prvcod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV56GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV43EmprCod ;
   private String Z396EmprCod ;
   private String Z993ProceNif ;
   private String Z971ProceNom ;
   private String Z994ProceDom ;
   private String Z988ProcePob ;
   private String Z989PoceCp ;
   private String Z14029PoceCp2 ;
   private String Z990ProceTel1 ;
   private String Z991ProceTel2 ;
   private String Z992ProceTelex ;
   private String Z6187ProceIe ;
   private String Z10390ProPers ;
   private String Z10391ProEmail ;
   private String Combo_prvcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV43EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProceCod_Internalname ;
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
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtProceCod_Jsonclick ;
   private String edtProceNom_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Jsonclick ;
   private String edtProceNif_Internalname ;
   private String A993ProceNif ;
   private String edtProceNif_Jsonclick ;
   private String edtProceDom_Internalname ;
   private String A994ProceDom ;
   private String edtProceDom_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtPoceCp_Internalname ;
   private String A989PoceCp ;
   private String edtPoceCp_Jsonclick ;
   private String edtPoceCp2_Internalname ;
   private String A14029PoceCp2 ;
   private String edtPoceCp2_Jsonclick ;
   private String edtProcePob_Internalname ;
   private String A988ProcePob ;
   private String edtProcePob_Jsonclick ;
   private String divTablesplittedprvcod_Internalname ;
   private String lblTextblockprvcod_Internalname ;
   private String lblTextblockprvcod_Jsonclick ;
   private String Combo_prvcod_Caption ;
   private String Combo_prvcod_Cls ;
   private String Combo_prvcod_Internalname ;
   private String edtPrvCod_Internalname ;
   private String edtPrvCod_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtProPers_Internalname ;
   private String A10390ProPers ;
   private String edtProPers_Jsonclick ;
   private String edtProEmail_Internalname ;
   private String A10391ProEmail ;
   private String edtProEmail_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtProceTel1_Internalname ;
   private String A990ProceTel1 ;
   private String edtProceTel1_Jsonclick ;
   private String edtProceTel2_Internalname ;
   private String A991ProceTel2 ;
   private String edtProceTel2_Jsonclick ;
   private String edtProceTelex_Internalname ;
   private String A992ProceTelex ;
   private String edtProceTelex_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV55Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_prvcod_Internalname ;
   private String edtavComboprvcod_Internalname ;
   private String edtavComboprvcod_Jsonclick ;
   private String A6187ProceIe ;
   private String A407EmprNom ;
   private String A787PrvDsc ;
   private String Combo_prvcod_Objectcall ;
   private String Combo_prvcod_Class ;
   private String Combo_prvcod_Icontype ;
   private String Combo_prvcod_Icon ;
   private String Combo_prvcod_Tooltip ;
   private String Combo_prvcod_Selectedvalue_set ;
   private String Combo_prvcod_Selectedtext_set ;
   private String Combo_prvcod_Selectedtext_get ;
   private String Combo_prvcod_Gamoauthtoken ;
   private String Combo_prvcod_Ddointernalname ;
   private String Combo_prvcod_Titlecontrolalign ;
   private String Combo_prvcod_Dropdownoptionstype ;
   private String Combo_prvcod_Titlecontrolidtoreplace ;
   private String Combo_prvcod_Datalisttype ;
   private String Combo_prvcod_Datalistfixedvalues ;
   private String Combo_prvcod_Datalistproc ;
   private String Combo_prvcod_Datalistprocparametersprefix ;
   private String Combo_prvcod_Remoteservicesparameters ;
   private String Combo_prvcod_Htmltemplate ;
   private String Combo_prvcod_Multiplevaluestype ;
   private String Combo_prvcod_Loadingdata ;
   private String Combo_prvcod_Noresultsfound ;
   private String Combo_prvcod_Emptyitemtext ;
   private String Combo_prvcod_Onlyselectedvalues ;
   private String Combo_prvcod_Selectalltext ;
   private String Combo_prvcod_Multiplevaluesseparator ;
   private String Combo_prvcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode132 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z787PrvDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n970ProceCod ;
   private boolean n781PrvCod ;
   private boolean n10122GpoEcoCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prvcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean n6187ProceIe ;
   private boolean n407EmprNom ;
   private boolean n10123GpoEcoNom ;
   private boolean n787PrvDsc ;
   private boolean Combo_prvcod_Enabled ;
   private boolean Combo_prvcod_Visible ;
   private boolean Combo_prvcod_Allowmultipleselection ;
   private boolean Combo_prvcod_Isgriditem ;
   private boolean Combo_prvcod_Hasdescription ;
   private boolean Combo_prvcod_Includeonlyselectedoption ;
   private boolean Combo_prvcod_Includeselectalloption ;
   private boolean Combo_prvcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n971ProceNom ;
   private boolean n993ProceNif ;
   private boolean n994ProceDom ;
   private boolean n989PoceCp ;
   private boolean n14029PoceCp2 ;
   private boolean n988ProcePob ;
   private boolean n10390ProPers ;
   private boolean n10391ProEmail ;
   private boolean n990ProceTel1 ;
   private boolean n991ProceTel2 ;
   private boolean n992ProceTelex ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13820ProceNomID ;
   private String A10123GpoEcoNom ;
   private String AV52ComboSelectedValue ;
   private String Z10123GpoEcoNom ;
   private com.genexus.webpanels.WebSession AV47WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prvcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00354_A407EmprNom ;
   private boolean[] T00354_n407EmprNom ;
   private String[] T00355_A10123GpoEcoNom ;
   private boolean[] T00355_n10123GpoEcoNom ;
   private String[] T00356_A787PrvDsc ;
   private boolean[] T00356_n787PrvDsc ;
   private short[] T00357_A970ProceCod ;
   private boolean[] T00357_n970ProceCod ;
   private String[] T00357_A407EmprNom ;
   private boolean[] T00357_n407EmprNom ;
   private String[] T00357_A993ProceNif ;
   private boolean[] T00357_n993ProceNif ;
   private String[] T00357_A971ProceNom ;
   private boolean[] T00357_n971ProceNom ;
   private String[] T00357_A994ProceDom ;
   private boolean[] T00357_n994ProceDom ;
   private String[] T00357_A988ProcePob ;
   private boolean[] T00357_n988ProcePob ;
   private String[] T00357_A787PrvDsc ;
   private boolean[] T00357_n787PrvDsc ;
   private String[] T00357_A989PoceCp ;
   private boolean[] T00357_n989PoceCp ;
   private String[] T00357_A14029PoceCp2 ;
   private boolean[] T00357_n14029PoceCp2 ;
   private String[] T00357_A990ProceTel1 ;
   private boolean[] T00357_n990ProceTel1 ;
   private String[] T00357_A991ProceTel2 ;
   private boolean[] T00357_n991ProceTel2 ;
   private String[] T00357_A992ProceTelex ;
   private boolean[] T00357_n992ProceTelex ;
   private String[] T00357_A6187ProceIe ;
   private boolean[] T00357_n6187ProceIe ;
   private String[] T00357_A10123GpoEcoNom ;
   private boolean[] T00357_n10123GpoEcoNom ;
   private String[] T00357_A10390ProPers ;
   private boolean[] T00357_n10390ProPers ;
   private String[] T00357_A10391ProEmail ;
   private boolean[] T00357_n10391ProEmail ;
   private String[] T00357_A396EmprCod ;
   private int[] T00357_A10122GpoEcoCod ;
   private boolean[] T00357_n10122GpoEcoCod ;
   private short[] T00357_A781PrvCod ;
   private boolean[] T00357_n781PrvCod ;
   private String[] T00358_A787PrvDsc ;
   private boolean[] T00358_n787PrvDsc ;
   private String[] T00359_A10123GpoEcoNom ;
   private boolean[] T00359_n10123GpoEcoNom ;
   private String[] T003510_A396EmprCod ;
   private short[] T003510_A970ProceCod ;
   private boolean[] T003510_n970ProceCod ;
   private short[] T00353_A970ProceCod ;
   private boolean[] T00353_n970ProceCod ;
   private String[] T00353_A993ProceNif ;
   private boolean[] T00353_n993ProceNif ;
   private String[] T00353_A971ProceNom ;
   private boolean[] T00353_n971ProceNom ;
   private String[] T00353_A994ProceDom ;
   private boolean[] T00353_n994ProceDom ;
   private String[] T00353_A988ProcePob ;
   private boolean[] T00353_n988ProcePob ;
   private String[] T00353_A989PoceCp ;
   private boolean[] T00353_n989PoceCp ;
   private String[] T00353_A14029PoceCp2 ;
   private boolean[] T00353_n14029PoceCp2 ;
   private String[] T00353_A990ProceTel1 ;
   private boolean[] T00353_n990ProceTel1 ;
   private String[] T00353_A991ProceTel2 ;
   private boolean[] T00353_n991ProceTel2 ;
   private String[] T00353_A992ProceTelex ;
   private boolean[] T00353_n992ProceTelex ;
   private String[] T00353_A6187ProceIe ;
   private boolean[] T00353_n6187ProceIe ;
   private String[] T00353_A10390ProPers ;
   private boolean[] T00353_n10390ProPers ;
   private String[] T00353_A10391ProEmail ;
   private boolean[] T00353_n10391ProEmail ;
   private String[] T00353_A396EmprCod ;
   private int[] T00353_A10122GpoEcoCod ;
   private boolean[] T00353_n10122GpoEcoCod ;
   private short[] T00353_A781PrvCod ;
   private boolean[] T00353_n781PrvCod ;
   private String[] T003511_A396EmprCod ;
   private short[] T003511_A970ProceCod ;
   private boolean[] T003511_n970ProceCod ;
   private String[] T003512_A396EmprCod ;
   private short[] T003512_A970ProceCod ;
   private boolean[] T003512_n970ProceCod ;
   private short[] T00352_A970ProceCod ;
   private boolean[] T00352_n970ProceCod ;
   private String[] T00352_A993ProceNif ;
   private boolean[] T00352_n993ProceNif ;
   private String[] T00352_A971ProceNom ;
   private boolean[] T00352_n971ProceNom ;
   private String[] T00352_A994ProceDom ;
   private boolean[] T00352_n994ProceDom ;
   private String[] T00352_A988ProcePob ;
   private boolean[] T00352_n988ProcePob ;
   private String[] T00352_A989PoceCp ;
   private boolean[] T00352_n989PoceCp ;
   private String[] T00352_A14029PoceCp2 ;
   private boolean[] T00352_n14029PoceCp2 ;
   private String[] T00352_A990ProceTel1 ;
   private boolean[] T00352_n990ProceTel1 ;
   private String[] T00352_A991ProceTel2 ;
   private boolean[] T00352_n991ProceTel2 ;
   private String[] T00352_A992ProceTelex ;
   private boolean[] T00352_n992ProceTelex ;
   private String[] T00352_A6187ProceIe ;
   private boolean[] T00352_n6187ProceIe ;
   private String[] T00352_A10390ProPers ;
   private boolean[] T00352_n10390ProPers ;
   private String[] T00352_A10391ProEmail ;
   private boolean[] T00352_n10391ProEmail ;
   private String[] T00352_A396EmprCod ;
   private int[] T00352_A10122GpoEcoCod ;
   private boolean[] T00352_n10122GpoEcoCod ;
   private short[] T00352_A781PrvCod ;
   private boolean[] T00352_n781PrvCod ;
   private String[] T003516_A787PrvDsc ;
   private boolean[] T003516_n787PrvDsc ;
   private String[] T003517_A10123GpoEcoNom ;
   private boolean[] T003517_n10123GpoEcoNom ;
   private String[] T003518_A396EmprCod ;
   private int[] T003518_A4850DevComCod ;
   private String[] T003519_A396EmprCod ;
   private int[] T003519_A10588H_RecCod ;
   private String[] T003520_A396EmprCod ;
   private short[] T003520_A970ProceCod ;
   private boolean[] T003520_n970ProceCod ;
   private String[] T003520_A2102OperCod ;
   private String[] T003521_A396EmprCod ;
   private String[] T003521_A1031EmpesCod ;
   private int[] T003521_A252CliCod ;
   private String[] T003521_A1032FonCod ;
   private String[] T003522_A396EmprCod ;
   private int[] T003522_A2420OpeAntCod ;
   private String[] T003523_A396EmprCod ;
   private String[] T003523_A2268MovParCod ;
   private int[] T003523_A252CliCod ;
   private String[] T003524_A396EmprCod ;
   private String[] T003524_A966PartCod ;
   private int[] T003524_A252CliCod ;
   private String[] T003525_A396EmprCod ;
   private int[] T003525_A252CliCod ;
   private String[] T003525_A65ArtCod ;
   private String[] T003526_A396EmprCod ;
   private int[] T003526_A44AlbRecCod ;
   private String[] T003527_A396EmprCod ;
   private short[] T003527_A970ProceCod ;
   private boolean[] T003527_n970ProceCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV51PrvCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV45WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV46TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV50TrnContextAtt ;
}

final  class tproced__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproced__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproced__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproced__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproced__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00352", "SELECT ProceCod, ProceNif, ProceNom, ProceDom, ProcePob, PoceCp, PoceCp2, ProceTel1, ProceTel2, ProceTelex, ProceIe, ProPers, ProEmail, EmprCod, GpoEcoCod, PrvCod FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ?  FOR UPDATE OF ProceNif, ProceNom, ProceDom, ProcePob, PoceCp, PoceCp2, ProceTel1, ProceTel2, ProceTelex, ProceIe, ProPers, ProEmail, GpoEcoCod, PrvCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00353", "SELECT ProceCod, ProceNif, ProceNom, ProceDom, ProcePob, PoceCp, PoceCp2, ProceTel1, ProceTel2, ProceTelex, ProceIe, ProPers, ProEmail, EmprCod, GpoEcoCod, PrvCod FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00354", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00355", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00356", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00357", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProceCod, T2.EmprNom, TM1.ProceNif, TM1.ProceNom, TM1.ProceDom, TM1.ProcePob, T4.PrvDsc, TM1.PoceCp, TM1.PoceCp2, TM1.ProceTel1, TM1.ProceTel2, TM1.ProceTelex, TM1.ProceIe, T3.GpoEcoNom, TM1.ProPers, TM1.ProEmail, TM1.EmprCod, TM1.GpoEcoCod, TM1.PrvCod FROM (((TXPPROCED TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPGPOECO T3 ON T3.EmprCod = TM1.EmprCod AND T3.GpoEcoCod = TM1.GpoEcoCod) LEFT JOIN TXPPROVIN T4 ON T4.PrvCod = TM1.PrvCod) WHERE TM1.EmprCod = ? and TM1.ProceCod = ? ORDER BY TM1.EmprCod, TM1.ProceCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00358", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00359", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003510", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProceCod FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003511", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProceCod FROM TXPPROCED WHERE ( ProceCod > ?) and EmprCod = ? ORDER BY EmprCod, ProceCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003512", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProceCod FROM TXPPROCED WHERE ( ProceCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, ProceCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T003513", "INSERT INTO TXPPROCED(ProceCod, ProceNif, ProceNom, ProceDom, ProcePob, PoceCp, PoceCp2, ProceTel1, ProceTel2, ProceTelex, ProceIe, ProPers, ProEmail, EmprCod, GpoEcoCod, PrvCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPROCED")
         ,new UpdateCursor("T003514", "UPDATE TXPPROCED SET ProceNif=?, ProceNom=?, ProceDom=?, ProcePob=?, PoceCp=?, PoceCp2=?, ProceTel1=?, ProceTel2=?, ProceTelex=?, ProceIe=?, ProPers=?, ProEmail=?, GpoEcoCod=?, PrvCod=?  WHERE EmprCod = ? AND ProceCod = ?", GX_NOMASK, "TXPPROCED")
         ,new UpdateCursor("T003515", "DELETE FROM TXPPROCED  WHERE EmprCod = ? AND ProceCod = ?", GX_NOMASK, "TXPPROCED")
         ,new ForEachCursor("T003516", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003517", "SELECT GpoEcoNom FROM TXPGPOECO WHERE EmprCod = ? AND GpoEcoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003518", "SELECT * FROM (SELECT EmprCod, DevComCod FROM TXPDEVCCO WHERE EmprCod = ? AND ProceCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003519", "SELECT * FROM (SELECT EmprCod, H_RecCod FROM TXPALMPZ0 WHERE EmprCod = ? AND ProceCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003520", "SELECT * FROM (SELECT EmprCod, ProceCod, OperCod FROM TXPPREOPE WHERE EmprCod = ? AND ProceCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003521", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND ProceCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003522", "SELECT * FROM (SELECT EmprCod, OpeAntCod FROM TXPOPEANT WHERE EmprOpe = ? AND OpePrcCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003523", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND ProceCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003524", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND ProceCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003525", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND ArtTh = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003526", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND ProceCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003527", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProceCod FROM TXPPROCED WHERE EmprCod = ? ORDER BY EmprCod, ProceCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 34);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 34);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 14);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 40);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 40);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 3);
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 34);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 9);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 9);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 3);
               ((int[]) buf[32])[0] = rslt.getInt(18);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(19);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 1 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               return;
            case 5 :
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
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 30);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 34);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 6);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 9);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 9);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 14);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 40);
               }
               stmt.setString(14, (String)parms[26], 3);
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 34);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 30);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 6);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 9);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 9);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 14);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 20);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               stmt.setString(15, (String)parms[28], 3);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[30]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 17 :
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
            case 18 :
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
            case 19 :
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
            case 22 :
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
            case 23 :
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
            case 24 :
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
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

