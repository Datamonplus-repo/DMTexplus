package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesoquimico_1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6061ProForLab = httpContext.GetPar( "ProForLab") ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         AV35Exis_pro = (short)(GXutil.lval( httpContext.GetPar( "Exis_pro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Exis_pro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Exis_pro), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_1TK89( A396EmprCod, A6061ProForLab, AV35Exis_pro) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa47051TK89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa85271TK89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa85281TK89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa101201TK89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa105471TK89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel17"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel18"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa139361TK89( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel19"+"_"+"") == 0 )
      {
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
            AV8EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
            AV30ProForCod = httpContext.GetPar( "ProForCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30ProForCod", AV30ProForCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30ProForCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Proceso Quimico", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public procesoquimico_1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesoquimico_1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_1_impl.class ));
   }

   public procesoquimico_1_impl( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkProForAct = UIFactory.getCheckbox(this);
      cmbProRev = new HTMLChoice();
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
      A13133ProForAct = ((GXutil.strcmp(GXutil.rtrim( A13133ProForAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      if ( cmbProRev.getItemCount() > 0 )
      {
         A3005ProRev = cmbProRev.getValidValue(A3005ProRev) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
         httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForDsc2_Internalname, httpContext.getMessage( "Descripcion (large)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2), GXutil.rtrim( localUtil.format( A4715ProForDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForDsc2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkProForAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkProForAct.getInternalname(), httpContext.getMessage( "Activo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkProForAct.getInternalname(), A13133ProForAct, "", httpContext.getMessage( "Activo", ""), 1, chkProForAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(37, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,37);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTip_Internalname, httpContext.getMessage( "Tip. Proc.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTip_Internalname, GXutil.rtrim( A5523ProForTip), GXutil.rtrim( localUtil.format( A5523ProForTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTip_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforrs_cell_Internalname, 1, 0, "px", 0, "px", divProforrs_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForRs_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForRs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForRs_Internalname, httpContext.getMessage( "Resina?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForRs_Internalname, GXutil.rtrim( A13936ProForRs), GXutil.rtrim( localUtil.format( A13936ProForRs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRs_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForRs_Visible, edtProForRs_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTie_Internalname, httpContext.getMessage( "Tiempo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTie_Internalname, GXutil.ltrim( localUtil.ntoc( A771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A771ProForTie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForTmx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForTmx_Internalname, httpContext.getMessage( "Temp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A772ProForTmx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForTmx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForTmx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForMat_Internalname, httpContext.getMessage( "Materia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForMat_Internalname, GXutil.rtrim( A769ProForMat), GXutil.rtrim( localUtil.format( A769ProForMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForRb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForRb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForRb_Internalname, GXutil.ltrim( localUtil.ntoc( A4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4706ProForRb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForRb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForRb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbProRev.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbProRev.getInternalname(), httpContext.getMessage( "Revision", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbProRev, cmbProRev.getInternalname(), GXutil.rtrim( A3005ProRev), 1, cmbProRev.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbProRev.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      cmbProRev.setValue( GXutil.rtrim( A3005ProRev) );
      httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Values", cmbProRev.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedproforlab_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforlab_Internalname, httpContext.getMessage( "Proc. Lab.", ""), "", "", lblTextblockproforlab_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_proforlab.setProperty("Caption", Combo_proforlab_Caption);
      ucCombo_proforlab.setProperty("Cls", Combo_proforlab_Cls);
      ucCombo_proforlab.setProperty("EmptyItemText", Combo_proforlab_Emptyitemtext);
      ucCombo_proforlab.setProperty("DropDownOptionsData", AV36ProForLab_Data);
      ucCombo_proforlab.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforlab_Internalname, "COMBO_PROFORLABContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForLab_Internalname, httpContext.getMessage( "Proceso Laboratorio", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForLab_Internalname, GXutil.rtrim( A6061ProForLab), GXutil.rtrim( localUtil.format( A6061ProForLab, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForLab_Jsonclick, 0, "Attribute", "", "", "", "", edtProForLab_Visible, edtProForLab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforabs_cell_Internalname, 1, 0, "px", 0, "px", divProforabs_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForAbs_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForAbs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForAbs_Internalname, httpContext.getMessage( "FAbs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForAbs_Enabled!=0) ? localUtil.format( A8527ProForAbs, "ZZ9.99") : localUtil.format( A8527ProForAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForAbs_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForAbs_Visible, edtProForAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforcos_cell_Internalname, 1, 0, "px", 0, "px", divProforcos_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForCos_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForCos_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCos_Internalname, httpContext.getMessage( "Coste Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCos_Internalname, GXutil.ltrim( localUtil.ntoc( A8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForCos_Enabled!=0) ? localUtil.format( A8528ProForCos, "ZZ9.9999") : localUtil.format( A8528ProForCos, "ZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCos_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForCos_Visible, edtProForCos_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforvl_cell_Internalname, 1, 0, "px", 0, "px", divProforvl_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProforVl_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProforVl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProforVl_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProforVl_Internalname, GXutil.ltrim( localUtil.ntoc( A10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProforVl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10120ProforVl), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProforVl_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProforVl_Visible, edtProforVl_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProh2o_cell_Internalname, 1, 0, "px", 0, "px", divProh2o_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProH2O_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProH2O_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProH2O_Internalname, httpContext.getMessage( "Nº Aguas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10547ProH2O), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProH2O_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProH2O_Visible, edtProH2O_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
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
      /* Control Group */
      app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Automatismos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProNumPro_Internalname, httpContext.getMessage( "Nº Prog.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumPro_Internalname, GXutil.ltrim( localUtil.ntoc( A2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2392ProNumPro), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumPro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumPro_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProNumRec_Internalname, httpContext.getMessage( "Receta Nº Prog.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumRec_Internalname, GXutil.ltrim( localUtil.ntoc( A2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2393ProNumRec), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumRec_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProforpau_cell_Internalname, 1, 0, "px", 0, "px", divProforpau_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProForPau_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForPau_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForPau_Internalname, httpContext.getMessage( "Tiempo Pausa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForPau_Internalname, GXutil.ltrim( localUtil.ntoc( A4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForPau_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4705ProForPau), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForPau_Jsonclick, 0, "AttributeFL", "", "", "", "", edtProForPau_Visible, edtProForPau_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</fieldset>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV40Pgmname), GXutil.rtrim( localUtil.format( AV40Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_proforlab_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboproforlab_Internalname, GXutil.rtrim( AV38ComboProForLab), GXutil.rtrim( localUtil.format( AV38ComboProForLab, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboproforlab_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboproforlab_Visible, edtavComboproforlab_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ProcesoQuimico_1.htm");
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
      e111TK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORLAB_DATA"), AV36ProForLab_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            Z6061ProForLab = httpContext.cgiGet( "Z6061ProForLab") ;
            Z766ProForDsc = httpContext.cgiGet( "Z766ProForDsc") ;
            Z4715ProForDsc2 = httpContext.cgiGet( "Z4715ProForDsc2") ;
            Z13133ProForAct = httpContext.cgiGet( "Z13133ProForAct") ;
            Z5523ProForTip = httpContext.cgiGet( "Z5523ProForTip") ;
            Z771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( "Z771ProForTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( "Z772ProForTmx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z769ProForMat = httpContext.cgiGet( "Z769ProForMat") ;
            Z4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( "Z4706ProForRb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( "Z2392ProNumPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z2393ProNumRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( "Z4705ProForPau"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z674PorForFul = localUtil.ctod( httpContext.cgiGet( "Z674PorForFul"), 0) ;
            Z8527ProForAbs = localUtil.ctond( httpContext.cgiGet( "Z8527ProForAbs")) ;
            Z773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "Z773ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3005ProRev = httpContext.cgiGet( "Z3005ProRev") ;
            Z4864ProForCCi = httpContext.cgiGet( "Z4864ProForCCi") ;
            Z4865ProForDCi = httpContext.cgiGet( "Z4865ProForDCi") ;
            Z8528ProForCos = localUtil.ctond( httpContext.cgiGet( "Z8528ProForCos")) ;
            Z10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( "Z10120ProforVl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( "Z10547ProH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3589ProForMer = localUtil.ctond( httpContext.cgiGet( "Z3589ProForMer")) ;
            Z13936ProForRs = httpContext.cgiGet( "Z13936ProForRs") ;
            A674PorForFul = localUtil.ctod( httpContext.cgiGet( "Z674PorForFul"), 0) ;
            A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "Z773ProForUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4864ProForCCi = httpContext.cgiGet( "Z4864ProForCCi") ;
            A4865ProForDCi = httpContext.cgiGet( "Z4865ProForDCi") ;
            A3589ProForMer = localUtil.ctond( httpContext.cgiGet( "Z3589ProForMer")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A941EmprCodV2 = httpContext.cgiGet( "EMPRCODV2") ;
            A13740ProFDsc = httpContext.cgiGet( "PROFDSC") ;
            A920ProForCodV = httpContext.cgiGet( "PROFORCODV") ;
            AV8EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV30ProForCod = httpContext.cgiGet( "vPROFORCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Exis_pro = (short)(localUtil.ctol( httpContext.cgiGet( "vEXIS_PRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Msg1 = httpContext.cgiGet( "vMSG1") ;
            AV24Orient = (short)(localUtil.ctol( httpContext.cgiGet( "vORIENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A674PorForFul = localUtil.ctod( httpContext.cgiGet( "PORFORFUL"), 0) ;
            A773ProForUli = (short)(localUtil.ctol( httpContext.cgiGet( "PROFORULI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4864ProForCCi = httpContext.cgiGet( "PROFORCCI") ;
            A4865ProForDCi = httpContext.cgiGet( "PROFORDCI") ;
            A3589ProForMer = localUtil.ctond( httpContext.cgiGet( "PROFORMER")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Combo_proforlab_Objectcall = httpContext.cgiGet( "COMBO_PROFORLAB_Objectcall") ;
            Combo_proforlab_Class = httpContext.cgiGet( "COMBO_PROFORLAB_Class") ;
            Combo_proforlab_Icontype = httpContext.cgiGet( "COMBO_PROFORLAB_Icontype") ;
            Combo_proforlab_Icon = httpContext.cgiGet( "COMBO_PROFORLAB_Icon") ;
            Combo_proforlab_Caption = httpContext.cgiGet( "COMBO_PROFORLAB_Caption") ;
            Combo_proforlab_Tooltip = httpContext.cgiGet( "COMBO_PROFORLAB_Tooltip") ;
            Combo_proforlab_Cls = httpContext.cgiGet( "COMBO_PROFORLAB_Cls") ;
            Combo_proforlab_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORLAB_Selectedvalue_set") ;
            Combo_proforlab_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROFORLAB_Selectedvalue_get") ;
            Combo_proforlab_Selectedtext_set = httpContext.cgiGet( "COMBO_PROFORLAB_Selectedtext_set") ;
            Combo_proforlab_Selectedtext_get = httpContext.cgiGet( "COMBO_PROFORLAB_Selectedtext_get") ;
            Combo_proforlab_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROFORLAB_Gamoauthtoken") ;
            Combo_proforlab_Ddointernalname = httpContext.cgiGet( "COMBO_PROFORLAB_Ddointernalname") ;
            Combo_proforlab_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROFORLAB_Titlecontrolalign") ;
            Combo_proforlab_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROFORLAB_Dropdownoptionstype") ;
            Combo_proforlab_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Enabled")) ;
            Combo_proforlab_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Visible")) ;
            Combo_proforlab_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROFORLAB_Titlecontrolidtoreplace") ;
            Combo_proforlab_Datalisttype = httpContext.cgiGet( "COMBO_PROFORLAB_Datalisttype") ;
            Combo_proforlab_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Allowmultipleselection")) ;
            Combo_proforlab_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROFORLAB_Datalistfixedvalues") ;
            Combo_proforlab_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Isgriditem")) ;
            Combo_proforlab_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Hasdescription")) ;
            Combo_proforlab_Datalistproc = httpContext.cgiGet( "COMBO_PROFORLAB_Datalistproc") ;
            Combo_proforlab_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROFORLAB_Datalistprocparametersprefix") ;
            Combo_proforlab_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROFORLAB_Remoteservicesparameters") ;
            Combo_proforlab_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORLAB_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforlab_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Includeonlyselectedoption")) ;
            Combo_proforlab_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Includeselectalloption")) ;
            Combo_proforlab_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Emptyitem")) ;
            Combo_proforlab_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORLAB_Includeaddnewoption")) ;
            Combo_proforlab_Htmltemplate = httpContext.cgiGet( "COMBO_PROFORLAB_Htmltemplate") ;
            Combo_proforlab_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROFORLAB_Multiplevaluestype") ;
            Combo_proforlab_Loadingdata = httpContext.cgiGet( "COMBO_PROFORLAB_Loadingdata") ;
            Combo_proforlab_Noresultsfound = httpContext.cgiGet( "COMBO_PROFORLAB_Noresultsfound") ;
            Combo_proforlab_Emptyitemtext = httpContext.cgiGet( "COMBO_PROFORLAB_Emptyitemtext") ;
            Combo_proforlab_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROFORLAB_Onlyselectedvalues") ;
            Combo_proforlab_Selectalltext = httpContext.cgiGet( "COMBO_PROFORLAB_Selectalltext") ;
            Combo_proforlab_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROFORLAB_Multiplevaluesseparator") ;
            Combo_proforlab_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROFORLAB_Addnewoptiontext") ;
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
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            n764ProForCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
            A4715ProForDsc2 = httpContext.cgiGet( edtProForDsc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
            A13133ProForAct = ((GXutil.strcmp(httpContext.cgiGet( chkProForAct.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
            A5523ProForTip = httpContext.cgiGet( edtProForTip_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
            A13936ProForRs = httpContext.cgiGet( edtProForRs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForTie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A771ProForTie = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
            }
            else
            {
               A771ProForTie = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORTMX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForTmx_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A772ProForTmx = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
            }
            else
            {
               A772ProForTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtProForTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
            }
            A769ProForMat = httpContext.cgiGet( edtProForMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORRB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForRb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4706ProForRb = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            }
            else
            {
               A4706ProForRb = (short)(localUtil.ctol( httpContext.cgiGet( edtProForRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
            }
            cmbProRev.setValue( httpContext.cgiGet( cmbProRev.getInternalname()) );
            A3005ProRev = httpContext.cgiGet( cmbProRev.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
            A6061ProForLab = httpContext.cgiGet( edtProForLab_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORABS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForAbs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8527ProForAbs = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
            }
            else
            {
               A8527ProForAbs = localUtil.ctond( httpContext.cgiGet( edtProForAbs_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)), DecimalUtil.stringToDec("999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORCOS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCos_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8528ProForCos = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
            }
            else
            {
               A8528ProForCos = localUtil.ctond( httpContext.cgiGet( edtProForCos_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProforVl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProforVl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORVL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProforVl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10120ProforVl = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
            }
            else
            {
               A10120ProforVl = (int)(localUtil.ctol( httpContext.cgiGet( edtProforVl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROH2O");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProH2O_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10547ProH2O = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
            }
            else
            {
               A10547ProH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtProH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMPRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProNumPro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2392ProNumPro = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            }
            else
            {
               A2392ProNumPro = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRONUMREC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProNumRec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2393ProNumRec = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
            }
            else
            {
               A2393ProNumRec = (int)(localUtil.ctol( httpContext.cgiGet( edtProNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORPAU");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForPau_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4705ProForPau = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            }
            else
            {
               A4705ProForPau = (short)(localUtil.ctol( httpContext.cgiGet( edtProForPau_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
            }
            AV40Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
            AV38ComboProForLab = httpContext.cgiGet( edtavComboproforlab_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38ComboProForLab", AV38ComboProForLab);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoQuimico_1");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
            forbiddenHiddens.add("ProForUli", localUtil.format( DecimalUtil.doubleToDec(A773ProForUli), "ZZZ9"));
            forbiddenHiddens.add("ProForCCi", GXutil.rtrim( localUtil.format( A4864ProForCCi, "")));
            forbiddenHiddens.add("ProForDCi", GXutil.rtrim( localUtil.format( A4865ProForDCi, "")));
            forbiddenHiddens.add("ProForMer", localUtil.format( A3589ProForMer, "ZZ9.99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("formulaciontinte\\procesoquimico_1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A764ProForCod = httpContext.GetPar( "ProForCod") ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
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
                  sMode89 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode89 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound89 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TK0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PROFORCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProForCod_Internalname ;
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
                        e111TK2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TK2 ();
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
         e121TK2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TK89( ) ;
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
         disableAttributes1TK89( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforlab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforlab_Enabled), 5, 0), true);
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

   public void confirm_1TK0( )
   {
      beforeValidate1TK89( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TK89( ) ;
         }
         else
         {
            checkExtendedTable1TK89( ) ;
            closeExtendedTableCursors1TK89( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TK0( )
   {
   }

   public void e111TK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      procesoquimico_1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char2[0] = AV8EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char4[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      procesoquimico_1_impl.this.AV8EmprCod = GXv_char2[0] ;
      procesoquimico_1_impl.this.AV9EmprNom = GXv_char3[0] ;
      procesoquimico_1_impl.this.AV10UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXv_int5[0] = (byte)(AV11ObsPrf) ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "OBSPRF", ""), GXv_int5) ;
      procesoquimico_1_impl.this.AV11ObsPrf = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ObsPrf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11ObsPrf), 4, 0));
      GXv_int5[0] = (byte)(AV12FlagLav) ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int5) ;
      procesoquimico_1_impl.this.AV12FlagLav = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12FlagLav", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12FlagLav), 4, 0));
      GXt_int6 = (byte)(AV13CdpPor) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "%CDP", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV13CdpPor = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CdpPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CdpPor), 4, 0));
      GXt_int6 = (byte)(AV14Tecido) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TEJIDO", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV14Tecido = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Tecido", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Tecido), 4, 0));
      GXt_int6 = (byte)(AV15Lavado) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "LAVADO", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV15Lavado = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lavado", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Lavado), 4, 0));
      GXt_int6 = (byte)(AV16Erfoc) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV16Erfoc = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Erfoc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Erfoc), 4, 0));
      GXt_int6 = (byte)(AV17Texfina) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV17Texfina = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Texfina", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Texfina), 4, 0));
      GXt_int6 = (byte)(AV18Clave2) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "CLAVE2", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV18Clave2 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Clave2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Clave2), 4, 0));
      GXt_int6 = (byte)(AV19NoVisible) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "NOVISC", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV19NoVisible = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19NoVisible", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19NoVisible), 4, 0));
      GXt_int6 = (byte)(AV20Velta) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV20Velta = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Velta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20Velta), 4, 0));
      GXt_int6 = (byte)(AV21Filasur) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "FILASU", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV21Filasur = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Filasur", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Filasur), 4, 0));
      GXt_int6 = (byte)(AV22Pathter) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "PATHTE", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV22Pathter = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Pathter", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Pathter), 4, 0));
      GXt_int6 = (byte)(AV23jpf) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "JPF", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV23jpf = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23jpf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23jpf), 4, 0));
      GXt_int6 = (byte)(AV24Orient) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV24Orient = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Orient", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Orient), 4, 0));
      GXt_int6 = (byte)(AV25tintutex) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV25tintutex = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25tintutex", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25tintutex), 4, 0));
      GXt_int6 = (byte)(AV26TiposTecnologias) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "TIETEC", ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      AV26TiposTecnologias = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TiposTecnologias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TiposTecnologias), 4, 0));
      AV27Fabs = (short)(100) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Fabs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Fabs), 4, 0));
      AV41Op = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Op", AV41Op);
      GXt_char1 = AV28msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char4) ;
      procesoquimico_1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28msg0", AV28msg0);
      GXt_char1 = AV29Msg1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG168_", ""), (byte)(99), GXv_char4) ;
      procesoquimico_1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Msg1", AV29Msg1);
      AV29Msg1 = GXutil.trim( AV29Msg1) + httpContext.getMessage( " Item Proceso Lab", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Msg1", AV29Msg1);
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      procesoquimico_1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      GXv_char4[0] = AV8EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char2[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      procesoquimico_1_impl.this.AV8EmprCod = GXv_char4[0] ;
      procesoquimico_1_impl.this.AV9EmprNom = GXv_char3[0] ;
      procesoquimico_1_impl.this.AV10UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXv_SdtWWPContext7[0] = AV31WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV31WWPContext = GXv_SdtWWPContext7[0] ;
      edtProForLab_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLab_Visible), 5, 0), true);
      AV38ComboProForLab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ComboProForLab", AV38ComboProForLab);
      edtavComboproforlab_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforlab_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforlab_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPROFORLAB' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV32TrnContext.fromxml(AV33WebSession.getValue("TrnContext"), null, null);
   }

   public void e121TK2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         httpContext.popup(formatLink("app.formulaciontinte.procesoquimico_3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod)),GXutil.URLEncode(GXutil.rtrim(A766ProForDsc)),GXutil.URLEncode(GXutil.rtrim(A4715ProForDsc2))}, new String[] {"Emprcod","ProForCod","ProForDsc","ProForDsc2"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV32TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.formulaciontinte.procesoquimico_1ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      edtProForPau_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
      divProforpau_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
      edtProForAbs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
      divProforabs_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
      edtProForCos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
      divProforcos_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
      edtProforVl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
      divProforvl_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
      edtProH2O_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
      divProh2o_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
      edtProForRs_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
      divProforrs_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROFORLAB' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV36ProForLab_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.formulaciontinte.procesoquimico_1loaddvcombo(remoteHandle, context).execute( "ProForLab", Gx_mode, AV8EmprCod, AV30ProForCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      procesoquimico_1_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV36ProForLab_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_proforlab_Selectedvalue_set = AV37ComboSelectedValue ;
      ucCombo_proforlab.sendProperty(context, "", false, Combo_proforlab_Internalname, "SelectedValue_set", Combo_proforlab_Selectedvalue_set);
      AV38ComboProForLab = AV37ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ComboProForLab", AV38ComboProForLab);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_proforlab_Enabled = false ;
         ucCombo_proforlab.sendProperty(context, "", false, Combo_proforlab_Internalname, "Enabled", GXutil.booltostr( Combo_proforlab_Enabled));
      }
   }

   public void zm1TK89( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6061ProForLab = T01TK3_A6061ProForLab[0] ;
            Z766ProForDsc = T01TK3_A766ProForDsc[0] ;
            Z4715ProForDsc2 = T01TK3_A4715ProForDsc2[0] ;
            Z13133ProForAct = T01TK3_A13133ProForAct[0] ;
            Z5523ProForTip = T01TK3_A5523ProForTip[0] ;
            Z771ProForTie = T01TK3_A771ProForTie[0] ;
            Z772ProForTmx = T01TK3_A772ProForTmx[0] ;
            Z769ProForMat = T01TK3_A769ProForMat[0] ;
            Z4706ProForRb = T01TK3_A4706ProForRb[0] ;
            Z2392ProNumPro = T01TK3_A2392ProNumPro[0] ;
            Z2393ProNumRec = T01TK3_A2393ProNumRec[0] ;
            Z4705ProForPau = T01TK3_A4705ProForPau[0] ;
            Z674PorForFul = T01TK3_A674PorForFul[0] ;
            Z8527ProForAbs = T01TK3_A8527ProForAbs[0] ;
            Z773ProForUli = T01TK3_A773ProForUli[0] ;
            Z3005ProRev = T01TK3_A3005ProRev[0] ;
            Z4864ProForCCi = T01TK3_A4864ProForCCi[0] ;
            Z4865ProForDCi = T01TK3_A4865ProForDCi[0] ;
            Z8528ProForCos = T01TK3_A8528ProForCos[0] ;
            Z10120ProforVl = T01TK3_A10120ProforVl[0] ;
            Z10547ProH2O = T01TK3_A10547ProH2O[0] ;
            Z3589ProForMer = T01TK3_A3589ProForMer[0] ;
            Z13936ProForRs = T01TK3_A13936ProForRs[0] ;
         }
         else
         {
            Z6061ProForLab = A6061ProForLab ;
            Z766ProForDsc = A766ProForDsc ;
            Z4715ProForDsc2 = A4715ProForDsc2 ;
            Z13133ProForAct = A13133ProForAct ;
            Z5523ProForTip = A5523ProForTip ;
            Z771ProForTie = A771ProForTie ;
            Z772ProForTmx = A772ProForTmx ;
            Z769ProForMat = A769ProForMat ;
            Z4706ProForRb = A4706ProForRb ;
            Z2392ProNumPro = A2392ProNumPro ;
            Z2393ProNumRec = A2393ProNumRec ;
            Z4705ProForPau = A4705ProForPau ;
            Z674PorForFul = A674PorForFul ;
            Z8527ProForAbs = A8527ProForAbs ;
            Z773ProForUli = A773ProForUli ;
            Z3005ProRev = A3005ProRev ;
            Z4864ProForCCi = A4864ProForCCi ;
            Z4865ProForDCi = A4865ProForDCi ;
            Z8528ProForCos = A8528ProForCos ;
            Z10120ProforVl = A10120ProforVl ;
            Z10547ProH2O = A10547ProH2O ;
            Z3589ProForMer = A3589ProForMer ;
            Z13936ProForRs = A13936ProForRs ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z764ProForCod = A764ProForCod ;
         Z6061ProForLab = A6061ProForLab ;
         Z766ProForDsc = A766ProForDsc ;
         Z4715ProForDsc2 = A4715ProForDsc2 ;
         Z13133ProForAct = A13133ProForAct ;
         Z5523ProForTip = A5523ProForTip ;
         Z771ProForTie = A771ProForTie ;
         Z772ProForTmx = A772ProForTmx ;
         Z769ProForMat = A769ProForMat ;
         Z4706ProForRb = A4706ProForRb ;
         Z2392ProNumPro = A2392ProNumPro ;
         Z2393ProNumRec = A2393ProNumRec ;
         Z4705ProForPau = A4705ProForPau ;
         Z674PorForFul = A674PorForFul ;
         Z8527ProForAbs = A8527ProForAbs ;
         Z773ProForUli = A773ProForUli ;
         Z3005ProRev = A3005ProRev ;
         Z4864ProForCCi = A4864ProForCCi ;
         Z4865ProForDCi = A4865ProForDCi ;
         Z8528ProForCos = A8528ProForCos ;
         Z10120ProforVl = A10120ProforVl ;
         Z10547ProH2O = A10547ProH2O ;
         Z3589ProForMer = A3589ProForMer ;
         Z13936ProForRs = A13936ProForRs ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV40Pgmname = "FormulacionTinte.ProcesoQuimico_1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         A396EmprCod = AV8EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TK4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TK4_A407EmprNom[0] ;
      n407EmprNom = T01TK4_n407EmprNom[0] ;
      pr_default.close(2);
      A941EmprCodV2 = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A941EmprCodV2", A941EmprCodV2);
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      edtProForPau_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divProforpau_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int5) ;
         procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( GXt_int6 == 1 )
         {
            divProforpau_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-4 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforpau_cell_Internalname, "Class", divProforpau_cell_Class, true);
         }
      }
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      edtProForAbs_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divProforabs_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
         procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( GXt_int6 == 1 )
         {
            divProforabs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforabs_cell_Internalname, "Class", divProforabs_cell_Class, true);
         }
      }
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      edtProForCos_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divProforcos_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int5) ;
         procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( GXt_int6 == 1 )
         {
            divProforcos_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforcos_cell_Internalname, "Class", divProforcos_cell_Class, true);
         }
      }
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      edtProforVl_Visible = ((GXt_int6==1)||(GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int10 == 1 ) || ( GXt_int6 == 1 ) ) )
      {
         divProforvl_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
      }
      else
      {
         GXt_int10 = (byte)(0) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int11) ;
         procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
         procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( ( GXt_int10 == 1 ) || ( GXt_int6 == 1 ) )
         {
            divProforvl_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforvl_cell_Internalname, "Class", divProforvl_cell_Class, true);
         }
      }
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      edtProH2O_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      if ( ! ( ( GXt_int10 == 1 ) ) )
      {
         divProh2o_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
      }
      else
      {
         GXt_int10 = (byte)(0) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int11) ;
         procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
         if ( GXt_int10 == 1 )
         {
            divProh2o_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProh2o_cell_Internalname, "Class", divProh2o_cell_Class, true);
         }
      }
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      edtProForRs_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      if ( ! ( ( GXt_int10 == 1 ) ) )
      {
         divProforrs_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
      }
      else
      {
         GXt_int10 = (byte)(0) ;
         GXv_int11[0] = GXt_int10 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int11) ;
         procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
         if ( GXt_int10 == 1 )
         {
            divProforrs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-1 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProforrs_cell_Internalname, "Class", divProforrs_cell_Class, true);
         }
      }
      if ( ! (GXutil.strcmp("", AV30ProForCod)==0) )
      {
         A764ProForCod = AV30ProForCod ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      if ( ! (GXutil.strcmp("", AV30ProForCod)==0) )
      {
         edtProForCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProForCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV30ProForCod)==0) )
      {
         edtProForCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A13133ProForAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A13133ProForAct = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      }
      if ( isIns( )  && (GXutil.strcmp("", A3005ProRev)==0) && ( Gx_BScreen == 0 ) )
      {
         A3005ProRev = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         A920ProForCodV = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      }
   }

   public void load1TK89( )
   {
      /* Using cursor T01TK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A6061ProForLab = T01TK5_A6061ProForLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         A407EmprNom = T01TK5_A407EmprNom[0] ;
         n407EmprNom = T01TK5_n407EmprNom[0] ;
         A766ProForDsc = T01TK5_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01TK5_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A13133ProForAct = T01TK5_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         A5523ProForTip = T01TK5_A5523ProForTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
         A771ProForTie = T01TK5_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T01TK5_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T01TK5_A769ProForMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         A4706ProForRb = T01TK5_A4706ProForRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A2392ProNumPro = T01TK5_A2392ProNumPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A2393ProNumRec = T01TK5_A2393ProNumRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
         A4705ProForPau = T01TK5_A4705ProForPau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A674PorForFul = T01TK5_A674PorForFul[0] ;
         A8527ProForAbs = T01TK5_A8527ProForAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
         A773ProForUli = T01TK5_A773ProForUli[0] ;
         A3005ProRev = T01TK5_A3005ProRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
         A4864ProForCCi = T01TK5_A4864ProForCCi[0] ;
         A4865ProForDCi = T01TK5_A4865ProForDCi[0] ;
         A8528ProForCos = T01TK5_A8528ProForCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
         A10120ProforVl = T01TK5_A10120ProforVl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
         A10547ProH2O = T01TK5_A10547ProH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
         A3589ProForMer = T01TK5_A3589ProForMer[0] ;
         A13936ProForRs = T01TK5_A13936ProForRs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
         zm1TK89( -30) ;
      }
      pr_default.close(3);
      onLoadActions1TK89( ) ;
   }

   public void onLoadActions1TK89( )
   {
      A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      if ( true )
      {
         A6061ProForLab = AV38ComboProForLab ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
         {
            A6061ProForLab = A764ProForCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         }
      }
   }

   public void checkExtendedTable1TK89( )
   {
      nIsDirty_89 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_89 = (short)(1) ;
      A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      nIsDirty_89 = (short)(1) ;
      A920ProForCodV = A764ProForCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      if ( (GXutil.strcmp("", A764ProForCod)==0) )
      {
         httpContext.GX_msglist.addItem("Código de proceso nulo", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( A772ProForTmx == 0 ) && ( AV24Orient == 1 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem("No se ha introducido Temperatura¡¡¡", 1, "PROFORTMX");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForTmx_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A4706ProForRb) && true /* After */ && ( AV12FlagLav == 1 ) )
      {
         httpContext.GX_msglist.addItem("Atencion. No se ha entrado lao Relación de Baño", 0, "PROFORRB");
      }
      if ( ! ( ( GXutil.strcmp(A3005ProRev, "S") == 0 ) || ( GXutil.strcmp(A3005ProRev, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Revision", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PROREV");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbProRev.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true )
      {
         nIsDirty_89 = (short)(1) ;
         A6061ProForLab = AV38ComboProForLab ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_89 = (short)(1) ;
            A6061ProForLab = A764ProForCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         }
      }
   }

   public void closeExtendedTableCursors1TK89( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1TK89( )
   {
      /* Using cursor T01TK6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound89 = (short)(1) ;
      }
      else
      {
         RcdFound89 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TK89( 30) ;
         RcdFound89 = (short)(1) ;
         A764ProForCod = T01TK3_A764ProForCod[0] ;
         n764ProForCod = T01TK3_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A6061ProForLab = T01TK3_A6061ProForLab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         A766ProForDsc = T01TK3_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A4715ProForDsc2 = T01TK3_A4715ProForDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
         A13133ProForAct = T01TK3_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         A5523ProForTip = T01TK3_A5523ProForTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
         A771ProForTie = T01TK3_A771ProForTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
         A772ProForTmx = T01TK3_A772ProForTmx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
         A769ProForMat = T01TK3_A769ProForMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
         A4706ProForRb = T01TK3_A4706ProForRb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
         A2392ProNumPro = T01TK3_A2392ProNumPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
         A2393ProNumRec = T01TK3_A2393ProNumRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
         A4705ProForPau = T01TK3_A4705ProForPau[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
         A674PorForFul = T01TK3_A674PorForFul[0] ;
         A8527ProForAbs = T01TK3_A8527ProForAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
         A773ProForUli = T01TK3_A773ProForUli[0] ;
         A3005ProRev = T01TK3_A3005ProRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
         A4864ProForCCi = T01TK3_A4864ProForCCi[0] ;
         A4865ProForDCi = T01TK3_A4865ProForDCi[0] ;
         A8528ProForCos = T01TK3_A8528ProForCos[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
         A10120ProforVl = T01TK3_A10120ProforVl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
         A10547ProH2O = T01TK3_A10547ProH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
         A3589ProForMer = T01TK3_A3589ProForMer[0] ;
         A13936ProForRs = T01TK3_A13936ProForRs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
         A396EmprCod = T01TK3_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TK89( ) ;
         if ( AnyError == 1 )
         {
            RcdFound89 = (short)(0) ;
            initializeNonKey1TK89( ) ;
         }
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound89 = (short)(0) ;
         initializeNonKey1TK89( ) ;
         sMode89 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode89 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TK89( ) ;
      if ( RcdFound89 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T01TK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01TK7_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TK7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TK7_A764ProForCod[0], A764ProForCod) < 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01TK7_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TK7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TK7_A764ProForCod[0], A764ProForCod) > 0 ) ) )
         {
            A396EmprCod = T01TK7_A396EmprCod[0] ;
            A764ProForCod = T01TK7_A764ProForCod[0] ;
            n764ProForCod = T01TK7_n764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound89 = (short)(0) ;
      /* Using cursor T01TK8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01TK8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TK8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TK8_A764ProForCod[0], A764ProForCod) > 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01TK8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TK8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TK8_A764ProForCod[0], A764ProForCod) < 0 ) ) )
         {
            A396EmprCod = T01TK8_A396EmprCod[0] ;
            A764ProForCod = T01TK8_A764ProForCod[0] ;
            n764ProForCod = T01TK8_n764ProForCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            RcdFound89 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TK89( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TK89( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound89 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A764ProForCod = Z764ProForCod ;
               n764ProForCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PROFORCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TK89( ) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TK89( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PROFORCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtProForCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TK89( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A764ProForCod, Z764ProForCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = Z764ProForCod ;
         n764ProForCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TK89( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6061ProForLab, T01TK2_A6061ProForLab[0]) != 0 ) || ( GXutil.strcmp(Z766ProForDsc, T01TK2_A766ProForDsc[0]) != 0 ) || ( GXutil.strcmp(Z4715ProForDsc2, T01TK2_A4715ProForDsc2[0]) != 0 ) || ( GXutil.strcmp(Z13133ProForAct, T01TK2_A13133ProForAct[0]) != 0 ) || ( GXutil.strcmp(Z5523ProForTip, T01TK2_A5523ProForTip[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z771ProForTie != T01TK2_A771ProForTie[0] ) || ( Z772ProForTmx != T01TK2_A772ProForTmx[0] ) || ( GXutil.strcmp(Z769ProForMat, T01TK2_A769ProForMat[0]) != 0 ) || ( Z4706ProForRb != T01TK2_A4706ProForRb[0] ) || ( Z2392ProNumPro != T01TK2_A2392ProNumPro[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2393ProNumRec != T01TK2_A2393ProNumRec[0] ) || ( Z4705ProForPau != T01TK2_A4705ProForPau[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z674PorForFul), GXutil.resetTime(T01TK2_A674PorForFul[0])) ) || ( DecimalUtil.compareTo(Z8527ProForAbs, T01TK2_A8527ProForAbs[0]) != 0 ) || ( Z773ProForUli != T01TK2_A773ProForUli[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3005ProRev, T01TK2_A3005ProRev[0]) != 0 ) || ( GXutil.strcmp(Z4864ProForCCi, T01TK2_A4864ProForCCi[0]) != 0 ) || ( GXutil.strcmp(Z4865ProForDCi, T01TK2_A4865ProForDCi[0]) != 0 ) || ( DecimalUtil.compareTo(Z8528ProForCos, T01TK2_A8528ProForCos[0]) != 0 ) || ( Z10120ProforVl != T01TK2_A10120ProforVl[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10547ProH2O != T01TK2_A10547ProH2O[0] ) || ( DecimalUtil.compareTo(Z3589ProForMer, T01TK2_A3589ProForMer[0]) != 0 ) || ( GXutil.strcmp(Z13936ProForRs, T01TK2_A13936ProForRs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6061ProForLab, T01TK2_A6061ProForLab[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForLab");
               GXutil.writeLogRaw("Old: ",Z6061ProForLab);
               GXutil.writeLogRaw("Current: ",T01TK2_A6061ProForLab[0]);
            }
            if ( GXutil.strcmp(Z766ProForDsc, T01TK2_A766ProForDsc[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForDsc");
               GXutil.writeLogRaw("Old: ",Z766ProForDsc);
               GXutil.writeLogRaw("Current: ",T01TK2_A766ProForDsc[0]);
            }
            if ( GXutil.strcmp(Z4715ProForDsc2, T01TK2_A4715ProForDsc2[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForDsc2");
               GXutil.writeLogRaw("Old: ",Z4715ProForDsc2);
               GXutil.writeLogRaw("Current: ",T01TK2_A4715ProForDsc2[0]);
            }
            if ( GXutil.strcmp(Z13133ProForAct, T01TK2_A13133ProForAct[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForAct");
               GXutil.writeLogRaw("Old: ",Z13133ProForAct);
               GXutil.writeLogRaw("Current: ",T01TK2_A13133ProForAct[0]);
            }
            if ( GXutil.strcmp(Z5523ProForTip, T01TK2_A5523ProForTip[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForTip");
               GXutil.writeLogRaw("Old: ",Z5523ProForTip);
               GXutil.writeLogRaw("Current: ",T01TK2_A5523ProForTip[0]);
            }
            if ( Z771ProForTie != T01TK2_A771ProForTie[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForTie");
               GXutil.writeLogRaw("Old: ",Z771ProForTie);
               GXutil.writeLogRaw("Current: ",T01TK2_A771ProForTie[0]);
            }
            if ( Z772ProForTmx != T01TK2_A772ProForTmx[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForTmx");
               GXutil.writeLogRaw("Old: ",Z772ProForTmx);
               GXutil.writeLogRaw("Current: ",T01TK2_A772ProForTmx[0]);
            }
            if ( GXutil.strcmp(Z769ProForMat, T01TK2_A769ProForMat[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForMat");
               GXutil.writeLogRaw("Old: ",Z769ProForMat);
               GXutil.writeLogRaw("Current: ",T01TK2_A769ProForMat[0]);
            }
            if ( Z4706ProForRb != T01TK2_A4706ProForRb[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForRb");
               GXutil.writeLogRaw("Old: ",Z4706ProForRb);
               GXutil.writeLogRaw("Current: ",T01TK2_A4706ProForRb[0]);
            }
            if ( Z2392ProNumPro != T01TK2_A2392ProNumPro[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProNumPro");
               GXutil.writeLogRaw("Old: ",Z2392ProNumPro);
               GXutil.writeLogRaw("Current: ",T01TK2_A2392ProNumPro[0]);
            }
            if ( Z2393ProNumRec != T01TK2_A2393ProNumRec[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProNumRec");
               GXutil.writeLogRaw("Old: ",Z2393ProNumRec);
               GXutil.writeLogRaw("Current: ",T01TK2_A2393ProNumRec[0]);
            }
            if ( Z4705ProForPau != T01TK2_A4705ProForPau[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForPau");
               GXutil.writeLogRaw("Old: ",Z4705ProForPau);
               GXutil.writeLogRaw("Current: ",T01TK2_A4705ProForPau[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z674PorForFul), GXutil.resetTime(T01TK2_A674PorForFul[0])) ) )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"PorForFul");
               GXutil.writeLogRaw("Old: ",Z674PorForFul);
               GXutil.writeLogRaw("Current: ",T01TK2_A674PorForFul[0]);
            }
            if ( DecimalUtil.compareTo(Z8527ProForAbs, T01TK2_A8527ProForAbs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForAbs");
               GXutil.writeLogRaw("Old: ",Z8527ProForAbs);
               GXutil.writeLogRaw("Current: ",T01TK2_A8527ProForAbs[0]);
            }
            if ( Z773ProForUli != T01TK2_A773ProForUli[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForUli");
               GXutil.writeLogRaw("Old: ",Z773ProForUli);
               GXutil.writeLogRaw("Current: ",T01TK2_A773ProForUli[0]);
            }
            if ( GXutil.strcmp(Z3005ProRev, T01TK2_A3005ProRev[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProRev");
               GXutil.writeLogRaw("Old: ",Z3005ProRev);
               GXutil.writeLogRaw("Current: ",T01TK2_A3005ProRev[0]);
            }
            if ( GXutil.strcmp(Z4864ProForCCi, T01TK2_A4864ProForCCi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForCCi");
               GXutil.writeLogRaw("Old: ",Z4864ProForCCi);
               GXutil.writeLogRaw("Current: ",T01TK2_A4864ProForCCi[0]);
            }
            if ( GXutil.strcmp(Z4865ProForDCi, T01TK2_A4865ProForDCi[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForDCi");
               GXutil.writeLogRaw("Old: ",Z4865ProForDCi);
               GXutil.writeLogRaw("Current: ",T01TK2_A4865ProForDCi[0]);
            }
            if ( DecimalUtil.compareTo(Z8528ProForCos, T01TK2_A8528ProForCos[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForCos");
               GXutil.writeLogRaw("Old: ",Z8528ProForCos);
               GXutil.writeLogRaw("Current: ",T01TK2_A8528ProForCos[0]);
            }
            if ( Z10120ProforVl != T01TK2_A10120ProforVl[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProforVl");
               GXutil.writeLogRaw("Old: ",Z10120ProforVl);
               GXutil.writeLogRaw("Current: ",T01TK2_A10120ProforVl[0]);
            }
            if ( Z10547ProH2O != T01TK2_A10547ProH2O[0] )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProH2O");
               GXutil.writeLogRaw("Old: ",Z10547ProH2O);
               GXutil.writeLogRaw("Current: ",T01TK2_A10547ProH2O[0]);
            }
            if ( DecimalUtil.compareTo(Z3589ProForMer, T01TK2_A3589ProForMer[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForMer");
               GXutil.writeLogRaw("Old: ",Z3589ProForMer);
               GXutil.writeLogRaw("Current: ",T01TK2_A3589ProForMer[0]);
            }
            if ( GXutil.strcmp(Z13936ProForRs, T01TK2_A13936ProForRs[0]) != 0 )
            {
               GXutil.writeLogln("formulaciontinte.procesoquimico_1:[seudo value changed for attri]"+"ProForRs");
               GXutil.writeLogRaw("Old: ",Z13936ProForRs);
               GXutil.writeLogRaw("Current: ",T01TK2_A13936ProForRs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPROFO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TK89( )
   {
      beforeValidate1TK89( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TK89( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TK89( 0) ;
         checkOptimisticConcurrency1TK89( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TK89( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TK89( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TK9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n764ProForCod), A764ProForCod, A6061ProForLab, A766ProForDsc, A4715ProForDsc2, A13133ProForAct, A5523ProForTip, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, Short.valueOf(A4706ProForRb), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), Short.valueOf(A4705ProForPau), A674PorForFul, A8527ProForAbs, Short.valueOf(A773ProForUli), A3005ProRev, A4864ProForCCi, A4865ProForDCi, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, A13936ProForRs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption1TK0( ) ;
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
            load1TK89( ) ;
         }
         endLevel1TK89( ) ;
      }
      closeExtendedTableCursors1TK89( ) ;
   }

   public void update1TK89( )
   {
      beforeValidate1TK89( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TK89( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TK89( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TK89( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TK89( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TK10 */
                  pr_default.execute(8, new Object[] {A6061ProForLab, A766ProForDsc, A4715ProForDsc2, A13133ProForAct, A5523ProForTip, Short.valueOf(A771ProForTie), Short.valueOf(A772ProForTmx), A769ProForMat, Short.valueOf(A4706ProForRb), Integer.valueOf(A2392ProNumPro), Integer.valueOf(A2393ProNumRec), Short.valueOf(A4705ProForPau), A674PorForFul, A8527ProForAbs, Short.valueOf(A773ProForUli), A3005ProRev, A4864ProForCCi, A4865ProForDCi, A8528ProForCos, Integer.valueOf(A10120ProforVl), Short.valueOf(A10547ProH2O), A3589ProForMer, A13936ProForRs, A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPROFO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TK89( ) ;
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
         endLevel1TK89( ) ;
      }
      closeExtendedTableCursors1TK89( ) ;
   }

   public void deferredUpdate1TK89( )
   {
   }

   public void delete( )
   {
      beforeValidate1TK89( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TK89( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TK89( ) ;
         afterConfirm1TK89( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TK89( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TK11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPROFO");
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
      sMode89 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TK89( ) ;
      Gx_mode = sMode89 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TK89( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A920ProForCodV = A764ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
         A13740ProFDsc = GXutil.trim( A764ProForCod) + "-" + GXutil.trim( A766ProForDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TK12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T01TK13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01TK14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01TK15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "creest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01TK16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01TK17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FTPQS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01TK18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECETAS ACABADO , OLLAS (POT)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01TK19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PQPRGNO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01TK20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CORAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01TK21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01TK22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01TK23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01TK24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01TK25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")+" ("+httpContext.getMessage( "PQuimicos", "")+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01TK26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01TK27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIPCOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01TK28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01TK29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas de Formulación por Fase", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01TK30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01TK31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01TK32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMACPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01TK33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01TK34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01TK35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n764ProForCod), A764ProForCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPROFO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void endLevel1TK89( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TK89( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.procesoquimico_1");
         if ( AnyError == 0 )
         {
            confirmValues1TK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "formulaciontinte.procesoquimico_1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TK89( )
   {
      /* Scan By routine */
      /* Using cursor T01TK36 */
      pr_default.execute(34);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A396EmprCod = T01TK36_A396EmprCod[0] ;
         A764ProForCod = T01TK36_A764ProForCod[0] ;
         n764ProForCod = T01TK36_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TK89( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound89 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound89 = (short)(1) ;
         A396EmprCod = T01TK36_A396EmprCod[0] ;
         A764ProForCod = T01TK36_A764ProForCod[0] ;
         n764ProForCod = T01TK36_n764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
   }

   public void scanEnd1TK89( )
   {
      pr_default.close(34);
   }

   public void afterConfirm1TK89( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A6061ProForLab ;
         GXv_int11[0] = (byte)(AV35Exis_pro) ;
         new app.pexiprq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int11) ;
         procesoquimico_1_impl.this.A396EmprCod = GXv_char4[0] ;
         procesoquimico_1_impl.this.A6061ProForLab = GXv_char3[0] ;
         procesoquimico_1_impl.this.AV35Exis_pro = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         httpContext.ajax_rsp_assign_attri("", false, "AV35Exis_pro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Exis_pro), 4, 0));
      }
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) && ( AV35Exis_pro == 0 ) && ( GXutil.strcmp(A764ProForCod, A6061ProForLab) != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV29Msg1, 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1TK89( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TK89( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TK89( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TK89( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TK89( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TK89( )
   {
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtProForDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), true);
      chkProForAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProForAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkProForAct.getEnabled(), 5, 0), true);
      edtProForTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTip_Enabled), 5, 0), true);
      edtProForRs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Enabled), 5, 0), true);
      edtProForTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTie_Enabled), 5, 0), true);
      edtProForTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForTmx_Enabled), 5, 0), true);
      edtProForMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMat_Enabled), 5, 0), true);
      edtProForRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRb_Enabled), 5, 0), true);
      cmbProRev.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbProRev.getInternalname(), "Enabled", GXutil.ltrimstr( cmbProRev.getEnabled(), 5, 0), true);
      edtProForLab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForLab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForLab_Enabled), 5, 0), true);
      edtProForAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Enabled), 5, 0), true);
      edtProForCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Enabled), 5, 0), true);
      edtProforVl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Enabled), 5, 0), true);
      edtProH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Enabled), 5, 0), true);
      edtProNumPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumPro_Enabled), 5, 0), true);
      edtProNumRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumRec_Enabled), 5, 0), true);
      edtProForPau_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboproforlab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforlab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforlab_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TK89( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TK0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.procesoquimico_1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV30ProForCod))}, new String[] {"Gx_mode","EmprCod","ProForCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoQuimico_1");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      forbiddenHiddens.add("ProForUli", localUtil.format( DecimalUtil.doubleToDec(A773ProForUli), "ZZZ9"));
      forbiddenHiddens.add("ProForCCi", GXutil.rtrim( localUtil.format( A4864ProForCCi, "")));
      forbiddenHiddens.add("ProForDCi", GXutil.rtrim( localUtil.format( A4865ProForDCi, "")));
      forbiddenHiddens.add("ProForMer", localUtil.format( A3589ProForMer, "ZZ9.99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\procesoquimico_1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6061ProForLab", GXutil.rtrim( Z6061ProForLab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z766ProForDsc", GXutil.rtrim( Z766ProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4715ProForDsc2", GXutil.rtrim( Z4715ProForDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13133ProForAct", GXutil.rtrim( Z13133ProForAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5523ProForTip", GXutil.rtrim( Z5523ProForTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z771ProForTie", GXutil.ltrim( localUtil.ntoc( Z771ProForTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z772ProForTmx", GXutil.ltrim( localUtil.ntoc( Z772ProForTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z769ProForMat", GXutil.rtrim( Z769ProForMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4706ProForRb", GXutil.ltrim( localUtil.ntoc( Z4706ProForRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2392ProNumPro", GXutil.ltrim( localUtil.ntoc( Z2392ProNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2393ProNumRec", GXutil.ltrim( localUtil.ntoc( Z2393ProNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4705ProForPau", GXutil.ltrim( localUtil.ntoc( Z4705ProForPau, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z674PorForFul", localUtil.dtoc( Z674PorForFul, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8527ProForAbs", GXutil.ltrim( localUtil.ntoc( Z8527ProForAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z773ProForUli", GXutil.ltrim( localUtil.ntoc( Z773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3005ProRev", GXutil.rtrim( Z3005ProRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4864ProForCCi", GXutil.rtrim( Z4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4865ProForDCi", GXutil.rtrim( Z4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8528ProForCos", GXutil.ltrim( localUtil.ntoc( Z8528ProForCos, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10120ProforVl", GXutil.ltrim( localUtil.ntoc( Z10120ProforVl, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10547ProH2O", GXutil.ltrim( localUtil.ntoc( Z10547ProH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3589ProForMer", GXutil.ltrim( localUtil.ntoc( Z3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13936ProForRs", GXutil.rtrim( Z13936ProForRs));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORLAB_DATA", AV36ProForLab_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORLAB_DATA", AV36ProForLab_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV32TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV32TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV32TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCODV2", GXutil.rtrim( A941EmprCodV2));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFDSC", A13740ProFDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCODV", GXutil.rtrim( A920ProForCodV));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORCOD", GXutil.rtrim( AV30ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30ProForCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXIS_PRO", GXutil.ltrim( localUtil.ntoc( AV35Exis_pro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV29Msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "vORIENT", GXutil.ltrim( localUtil.ntoc( AV24Orient, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PORFORFUL", localUtil.dtoc( A674PorForFul, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORULI", GXutil.ltrim( localUtil.ntoc( A773ProForUli, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCCI", GXutil.rtrim( A4864ProForCCi));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDCI", GXutil.rtrim( A4865ProForDCi));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORMER", GXutil.ltrim( localUtil.ntoc( A3589ProForMer, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Objectcall", GXutil.rtrim( Combo_proforlab_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Cls", GXutil.rtrim( Combo_proforlab_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Selectedvalue_set", GXutil.rtrim( Combo_proforlab_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Enabled", GXutil.booltostr( Combo_proforlab_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORLAB_Emptyitemtext", GXutil.rtrim( Combo_proforlab_Emptyitemtext));
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
      return formatLink("app.formulaciontinte.procesoquimico_1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV30ProForCod))}, new String[] {"Gx_mode","EmprCod","ProForCod"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ProcesoQuimico_1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Proceso Quimico", "") ;
   }

   public void initializeNonKey1TK89( )
   {
      AV35Exis_pro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Exis_pro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Exis_pro), 4, 0));
      A920ProForCodV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", A920ProForCodV);
      A13740ProFDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13740ProFDsc", A13740ProFDsc);
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A4715ProForDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", A4715ProForDsc2);
      A5523ProForTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5523ProForTip", A5523ProForTip);
      A771ProForTie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A771ProForTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A771ProForTie), 4, 0));
      A772ProForTmx = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A772ProForTmx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A772ProForTmx), 4, 0));
      A769ProForMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A769ProForMat", A769ProForMat);
      A4706ProForRb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4706ProForRb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4706ProForRb), 4, 0));
      A2392ProNumPro = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2392ProNumPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2392ProNumPro), 5, 0));
      A2393ProNumRec = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2393ProNumRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2393ProNumRec), 5, 0));
      A4705ProForPau = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4705ProForPau", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4705ProForPau), 4, 0));
      A674PorForFul = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A674PorForFul", localUtil.format(A674PorForFul, "99/99/99"));
      A8527ProForAbs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8527ProForAbs", GXutil.ltrimstr( A8527ProForAbs, 6, 2));
      A773ProForUli = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A773ProForUli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A773ProForUli), 4, 0));
      A4864ProForCCi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4864ProForCCi", A4864ProForCCi);
      A4865ProForDCi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4865ProForDCi", A4865ProForDCi);
      A8528ProForCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8528ProForCos", GXutil.ltrimstr( A8528ProForCos, 8, 4));
      A10120ProforVl = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10120ProforVl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10120ProforVl), 5, 0));
      A10547ProH2O = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10547ProH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10547ProH2O), 4, 0));
      A3589ProForMer = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3589ProForMer", GXutil.ltrimstr( A3589ProForMer, 6, 2));
      A13936ProForRs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13936ProForRs", A13936ProForRs);
      A6061ProForLab = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
      A13133ProForAct = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      A3005ProRev = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
      Z6061ProForLab = "" ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z13133ProForAct = "" ;
      Z5523ProForTip = "" ;
      Z771ProForTie = (short)(0) ;
      Z772ProForTmx = (short)(0) ;
      Z769ProForMat = "" ;
      Z4706ProForRb = (short)(0) ;
      Z2392ProNumPro = 0 ;
      Z2393ProNumRec = 0 ;
      Z4705ProForPau = (short)(0) ;
      Z674PorForFul = GXutil.nullDate() ;
      Z8527ProForAbs = DecimalUtil.ZERO ;
      Z773ProForUli = (short)(0) ;
      Z3005ProRev = "" ;
      Z4864ProForCCi = "" ;
      Z4865ProForDCi = "" ;
      Z8528ProForCos = DecimalUtil.ZERO ;
      Z10120ProforVl = 0 ;
      Z10547ProH2O = (short)(0) ;
      Z3589ProForMer = DecimalUtil.ZERO ;
      Z13936ProForRs = "" ;
   }

   public void initAll1TK89( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A764ProForCod = "" ;
      n764ProForCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      initializeNonKey1TK89( ) ;
   }

   public void standaloneModalInsert( )
   {
      A13133ProForAct = i13133ProForAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      A3005ProRev = i3005ProRev ;
      httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610154", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/procesoquimico_1.js", "?20268211610154", false, true);
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
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForDsc2_Internalname = "PROFORDSC2" ;
      chkProForAct.setInternalname( "PROFORACT" );
      edtProForTip_Internalname = "PROFORTIP" ;
      edtProForRs_Internalname = "PROFORRS" ;
      divProforrs_cell_Internalname = "PROFORRS_CELL" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtProForTie_Internalname = "PROFORTIE" ;
      edtProForTmx_Internalname = "PROFORTMX" ;
      edtProForMat_Internalname = "PROFORMAT" ;
      edtProForRb_Internalname = "PROFORRB" ;
      cmbProRev.setInternalname( "PROREV" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockproforlab_Internalname = "TEXTBLOCKPROFORLAB" ;
      Combo_proforlab_Internalname = "COMBO_PROFORLAB" ;
      edtProForLab_Internalname = "PROFORLAB" ;
      divTablesplittedproforlab_Internalname = "TABLESPLITTEDPROFORLAB" ;
      edtProForAbs_Internalname = "PROFORABS" ;
      divProforabs_cell_Internalname = "PROFORABS_CELL" ;
      edtProForCos_Internalname = "PROFORCOS" ;
      divProforcos_cell_Internalname = "PROFORCOS_CELL" ;
      edtProforVl_Internalname = "PROFORVL" ;
      divProforvl_cell_Internalname = "PROFORVL_CELL" ;
      edtProH2O_Internalname = "PROH2O" ;
      divProh2o_cell_Internalname = "PROH2O_CELL" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtProNumPro_Internalname = "PRONUMPRO" ;
      edtProNumRec_Internalname = "PRONUMREC" ;
      edtProForPau_Internalname = "PROFORPAU" ;
      divProforpau_cell_Internalname = "PROFORPAU_CELL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = "UNNAMEDGROUP5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboproforlab_Internalname = "vCOMBOPROFORLAB" ;
      divSectionattribute_proforlab_Internalname = "SECTIONATTRIBUTE_PROFORLAB" ;
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
      Form.setCaption( httpContext.getMessage( "Proceso Quimico", "") );
      edtavComboproforlab_Jsonclick = "" ;
      edtavComboproforlab_Enabled = 0 ;
      edtavComboproforlab_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProForPau_Jsonclick = "" ;
      edtProForPau_Enabled = 1 ;
      edtProForPau_Visible = 1 ;
      divProforpau_cell_Class = "col-xs-12 col-sm-4" ;
      edtProNumRec_Jsonclick = "" ;
      edtProNumRec_Enabled = 1 ;
      edtProNumPro_Jsonclick = "" ;
      edtProNumPro_Enabled = 1 ;
      edtProH2O_Jsonclick = "" ;
      edtProH2O_Enabled = 1 ;
      edtProH2O_Visible = 1 ;
      divProh2o_cell_Class = "col-xs-12 col-sm-2" ;
      edtProforVl_Jsonclick = "" ;
      edtProforVl_Enabled = 1 ;
      edtProforVl_Visible = 1 ;
      divProforvl_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForCos_Jsonclick = "" ;
      edtProForCos_Enabled = 1 ;
      edtProForCos_Visible = 1 ;
      divProforcos_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForAbs_Jsonclick = "" ;
      edtProForAbs_Enabled = 1 ;
      edtProForAbs_Visible = 1 ;
      divProforabs_cell_Class = "col-xs-12 col-sm-2" ;
      edtProForLab_Jsonclick = "" ;
      edtProForLab_Enabled = 1 ;
      edtProForLab_Visible = 1 ;
      Combo_proforlab_Emptyitemtext = "s/d" ;
      Combo_proforlab_Cls = "ExtendedCombo AttributeFL" ;
      Combo_proforlab_Enabled = GXutil.toBoolean( -1) ;
      cmbProRev.setJsonclick( "" );
      cmbProRev.setEnabled( 1 );
      edtProForRb_Jsonclick = "" ;
      edtProForRb_Enabled = 1 ;
      edtProForMat_Jsonclick = "" ;
      edtProForMat_Enabled = 1 ;
      edtProForTmx_Jsonclick = "" ;
      edtProForTmx_Enabled = 1 ;
      edtProForTie_Jsonclick = "" ;
      edtProForTie_Enabled = 1 ;
      edtProForRs_Jsonclick = "" ;
      edtProForRs_Enabled = 1 ;
      edtProForRs_Visible = 1 ;
      divProforrs_cell_Class = "col-xs-12 col-sm-1" ;
      edtProForTip_Jsonclick = "" ;
      edtProForTip_Enabled = 1 ;
      chkProForAct.setEnabled( 1 );
      edtProForDsc2_Jsonclick = "" ;
      edtProForDsc2_Enabled = 1 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 1 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
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

   public void gxasa47051TK89( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      edtProForPau_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForPau_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForPau_Visible), 5, 0), true);
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

   public void gxasa85271TK89( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      edtProForAbs_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAbs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAbs_Visible), 5, 0), true);
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

   public void gxasa85281TK89( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TINTTO", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      edtProForCos_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCos_Visible), 5, 0), true);
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

   public void gxasa101201TK89( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "TEJIDO", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVADO", ""), ""), GXv_int5) ;
      procesoquimico_1_impl.this.GXt_int6 = GXv_int5[0] ;
      edtProforVl_Visible = ((GXt_int10==1)||(GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProforVl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProforVl_Visible), 5, 0), true);
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

   public void gxasa105471TK89( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "JPF", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      edtProH2O_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProH2O_Visible), 5, 0), true);
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

   public void gxasa139361TK89( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "AC2013", ""), ""), GXv_int11) ;
      procesoquimico_1_impl.this.GXt_int10 = GXv_int11[0] ;
      edtProForRs_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForRs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForRs_Visible), 5, 0), true);
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

   public void xc_29_1TK89( String A396EmprCod ,
                            String A6061ProForLab ,
                            short AV35Exis_pro )
   {
      if ( true /* After */ && ! (GXutil.strcmp("", A6061ProForLab)==0) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A6061ProForLab ;
         GXv_int11[0] = (byte)(AV35Exis_pro) ;
         new app.pexiprq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int11) ;
         A396EmprCod = GXv_char4[0] ;
         A6061ProForLab = GXv_char3[0] ;
         AV35Exis_pro = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", A6061ProForLab);
         httpContext.ajax_rsp_assign_attri("", false, "AV35Exis_pro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35Exis_pro), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6061ProForLab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35Exis_pro, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      chkProForAct.setName( "PROFORACT" );
      chkProForAct.setWebtags( "" );
      chkProForAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProForAct.getInternalname(), "TitleCaption", chkProForAct.getCaption(), true);
      chkProForAct.setCheckedValue( "N" );
      if ( isIns( ) && (GXutil.strcmp("", A13133ProForAct)==0) )
      {
         A13133ProForAct = httpContext.getMessage( "S", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      }
      cmbProRev.setName( "PROREV" );
      cmbProRev.setWebtags( "" );
      cmbProRev.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbProRev.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbProRev.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A3005ProRev)==0) )
         {
            A3005ProRev = httpContext.getMessage( "N", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A3005ProRev", A3005ProRev);
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

   public void valid_Proforcod( )
   {
      n764ProForCod = false ;
      A920ProForCodV = A764ProForCod ;
      if ( true )
      {
         A6061ProForLab = AV38ComboProForLab ;
      }
      else
      {
         if ( isIns( )  && (GXutil.strcmp("", A6061ProForLab)==0) && ( Gx_BScreen == 0 ) )
         {
            A6061ProForLab = A764ProForCod ;
         }
      }
      if ( (GXutil.strcmp("", A764ProForCod)==0) )
      {
         httpContext.GX_msglist.addItem("Código de proceso nulo", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A920ProForCodV", GXutil.rtrim( A920ProForCodV));
      httpContext.ajax_rsp_assign_attri("", false, "A6061ProForLab", GXutil.rtrim( A6061ProForLab));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV30ProForCod',fld:'vPROFORCOD',pic:'',hsh:true},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV30ProForCod',fld:'vPROFORCOD',pic:'',hsh:true},{av:'A674PorForFul',fld:'PORFORFUL',pic:''},{av:'A773ProForUli',fld:'PROFORULI',pic:'ZZZ9'},{av:'A4864ProForCCi',fld:'PROFORCCI',pic:''},{av:'A4865ProForDCi',fld:'PROFORDCI',pic:''},{av:'A3589ProForMer',fld:'PROFORMER',pic:'ZZ9.99'},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e121TK2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''},{av:'AV32TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'AV38ComboProForLab',fld:'vCOMBOPROFORLAB',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'A6061ProForLab',fld:'PROFORLAB',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A920ProForCodV',fld:'PROFORCODV',pic:''},{av:'A6061ProForLab',fld:'PROFORLAB',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORDSC","{handler:'valid_Profordsc',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORDSC",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORTMX","{handler:'valid_Profortmx',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORTMX",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORRB","{handler:'valid_Proforrb',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORRB",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROREV","{handler:'valid_Prorev',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROREV",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALID_PROFORLAB","{handler:'valid_Proforlab',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORLAB",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALIDV_COMBOPROFORLAB","{handler:'validv_Comboproforlab',iparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALIDV_COMBOPROFORLAB",",oparms:[{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
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
      wcpOAV8EmprCod = "" ;
      wcpOAV30ProForCod = "" ;
      Z396EmprCod = "" ;
      Z764ProForCod = "" ;
      Z6061ProForLab = "" ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      Z13133ProForAct = "" ;
      Z5523ProForTip = "" ;
      Z769ProForMat = "" ;
      Z674PorForFul = GXutil.nullDate() ;
      Z8527ProForAbs = DecimalUtil.ZERO ;
      Z3005ProRev = "" ;
      Z4864ProForCCi = "" ;
      Z4865ProForDCi = "" ;
      Z8528ProForCos = DecimalUtil.ZERO ;
      Z3589ProForMer = DecimalUtil.ZERO ;
      Z13936ProForRs = "" ;
      Combo_proforlab_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A6061ProForLab = "" ;
      Gx_mode = "" ;
      AV8EmprCod = "" ;
      AV30ProForCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A13133ProForAct = "" ;
      A3005ProRev = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      A5523ProForTip = "" ;
      A13936ProForRs = "" ;
      A769ProForMat = "" ;
      lblTextblockproforlab_Jsonclick = "" ;
      ucCombo_proforlab = new com.genexus.webpanels.GXUserControl();
      Combo_proforlab_Caption = "" ;
      AV36ProForLab_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A8527ProForAbs = DecimalUtil.ZERO ;
      A8528ProForCos = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV40Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV38ComboProForLab = "" ;
      A674PorForFul = GXutil.nullDate() ;
      A4864ProForCCi = "" ;
      A4865ProForDCi = "" ;
      A3589ProForMer = DecimalUtil.ZERO ;
      A941EmprCodV2 = "" ;
      A13740ProFDsc = "" ;
      A920ProForCodV = "" ;
      AV29Msg1 = "" ;
      A407EmprNom = "" ;
      Combo_proforlab_Objectcall = "" ;
      Combo_proforlab_Class = "" ;
      Combo_proforlab_Icontype = "" ;
      Combo_proforlab_Icon = "" ;
      Combo_proforlab_Tooltip = "" ;
      Combo_proforlab_Selectedvalue_set = "" ;
      Combo_proforlab_Selectedtext_set = "" ;
      Combo_proforlab_Selectedtext_get = "" ;
      Combo_proforlab_Gamoauthtoken = "" ;
      Combo_proforlab_Ddointernalname = "" ;
      Combo_proforlab_Titlecontrolalign = "" ;
      Combo_proforlab_Dropdownoptionstype = "" ;
      Combo_proforlab_Titlecontrolidtoreplace = "" ;
      Combo_proforlab_Datalisttype = "" ;
      Combo_proforlab_Datalistfixedvalues = "" ;
      Combo_proforlab_Datalistproc = "" ;
      Combo_proforlab_Datalistprocparametersprefix = "" ;
      Combo_proforlab_Remoteservicesparameters = "" ;
      Combo_proforlab_Htmltemplate = "" ;
      Combo_proforlab_Multiplevaluestype = "" ;
      Combo_proforlab_Loadingdata = "" ;
      Combo_proforlab_Noresultsfound = "" ;
      Combo_proforlab_Onlyselectedvalues = "" ;
      Combo_proforlab_Selectalltext = "" ;
      Combo_proforlab_Multiplevaluesseparator = "" ;
      Combo_proforlab_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode89 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Station = "" ;
      AV9EmprNom = "" ;
      AV10UsurCod = "" ;
      AV41Op = "" ;
      AV28msg0 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV31WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV32TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV33WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV37ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01TK4_A407EmprNom = new String[] {""} ;
      T01TK4_n407EmprNom = new boolean[] {false} ;
      T01TK5_A764ProForCod = new String[] {""} ;
      T01TK5_n764ProForCod = new boolean[] {false} ;
      T01TK5_A6061ProForLab = new String[] {""} ;
      T01TK5_A407EmprNom = new String[] {""} ;
      T01TK5_n407EmprNom = new boolean[] {false} ;
      T01TK5_A766ProForDsc = new String[] {""} ;
      T01TK5_A4715ProForDsc2 = new String[] {""} ;
      T01TK5_A13133ProForAct = new String[] {""} ;
      T01TK5_A5523ProForTip = new String[] {""} ;
      T01TK5_A771ProForTie = new short[1] ;
      T01TK5_A772ProForTmx = new short[1] ;
      T01TK5_A769ProForMat = new String[] {""} ;
      T01TK5_A4706ProForRb = new short[1] ;
      T01TK5_A2392ProNumPro = new int[1] ;
      T01TK5_A2393ProNumRec = new int[1] ;
      T01TK5_A4705ProForPau = new short[1] ;
      T01TK5_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01TK5_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK5_A773ProForUli = new short[1] ;
      T01TK5_A3005ProRev = new String[] {""} ;
      T01TK5_A4864ProForCCi = new String[] {""} ;
      T01TK5_A4865ProForDCi = new String[] {""} ;
      T01TK5_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK5_A10120ProforVl = new int[1] ;
      T01TK5_A10547ProH2O = new short[1] ;
      T01TK5_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK5_A13936ProForRs = new String[] {""} ;
      T01TK5_A396EmprCod = new String[] {""} ;
      T01TK6_A396EmprCod = new String[] {""} ;
      T01TK6_A764ProForCod = new String[] {""} ;
      T01TK6_n764ProForCod = new boolean[] {false} ;
      T01TK3_A764ProForCod = new String[] {""} ;
      T01TK3_n764ProForCod = new boolean[] {false} ;
      T01TK3_A6061ProForLab = new String[] {""} ;
      T01TK3_A766ProForDsc = new String[] {""} ;
      T01TK3_A4715ProForDsc2 = new String[] {""} ;
      T01TK3_A13133ProForAct = new String[] {""} ;
      T01TK3_A5523ProForTip = new String[] {""} ;
      T01TK3_A771ProForTie = new short[1] ;
      T01TK3_A772ProForTmx = new short[1] ;
      T01TK3_A769ProForMat = new String[] {""} ;
      T01TK3_A4706ProForRb = new short[1] ;
      T01TK3_A2392ProNumPro = new int[1] ;
      T01TK3_A2393ProNumRec = new int[1] ;
      T01TK3_A4705ProForPau = new short[1] ;
      T01TK3_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01TK3_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK3_A773ProForUli = new short[1] ;
      T01TK3_A3005ProRev = new String[] {""} ;
      T01TK3_A4864ProForCCi = new String[] {""} ;
      T01TK3_A4865ProForDCi = new String[] {""} ;
      T01TK3_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK3_A10120ProforVl = new int[1] ;
      T01TK3_A10547ProH2O = new short[1] ;
      T01TK3_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK3_A13936ProForRs = new String[] {""} ;
      T01TK3_A396EmprCod = new String[] {""} ;
      T01TK7_A396EmprCod = new String[] {""} ;
      T01TK7_A764ProForCod = new String[] {""} ;
      T01TK7_n764ProForCod = new boolean[] {false} ;
      T01TK8_A396EmprCod = new String[] {""} ;
      T01TK8_A764ProForCod = new String[] {""} ;
      T01TK8_n764ProForCod = new boolean[] {false} ;
      T01TK2_A764ProForCod = new String[] {""} ;
      T01TK2_n764ProForCod = new boolean[] {false} ;
      T01TK2_A6061ProForLab = new String[] {""} ;
      T01TK2_A766ProForDsc = new String[] {""} ;
      T01TK2_A4715ProForDsc2 = new String[] {""} ;
      T01TK2_A13133ProForAct = new String[] {""} ;
      T01TK2_A5523ProForTip = new String[] {""} ;
      T01TK2_A771ProForTie = new short[1] ;
      T01TK2_A772ProForTmx = new short[1] ;
      T01TK2_A769ProForMat = new String[] {""} ;
      T01TK2_A4706ProForRb = new short[1] ;
      T01TK2_A2392ProNumPro = new int[1] ;
      T01TK2_A2393ProNumRec = new int[1] ;
      T01TK2_A4705ProForPau = new short[1] ;
      T01TK2_A674PorForFul = new java.util.Date[] {GXutil.nullDate()} ;
      T01TK2_A8527ProForAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK2_A773ProForUli = new short[1] ;
      T01TK2_A3005ProRev = new String[] {""} ;
      T01TK2_A4864ProForCCi = new String[] {""} ;
      T01TK2_A4865ProForDCi = new String[] {""} ;
      T01TK2_A8528ProForCos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK2_A10120ProforVl = new int[1] ;
      T01TK2_A10547ProH2O = new short[1] ;
      T01TK2_A3589ProForMer = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TK2_A13936ProForRs = new String[] {""} ;
      T01TK2_A396EmprCod = new String[] {""} ;
      T01TK12_A396EmprCod = new String[] {""} ;
      T01TK12_A252CliCod = new int[1] ;
      T01TK12_A13381CliProQui = new String[] {""} ;
      T01TK13_A396EmprCod = new String[] {""} ;
      T01TK13_A13026PedDGId = new int[1] ;
      T01TK13_A758ProCod = new String[] {""} ;
      T01TK13_A13045PedDGFasLi = new short[1] ;
      T01TK13_A13057PedDGPQLin = new short[1] ;
      T01TK14_A396EmprCod = new String[] {""} ;
      T01TK14_A12673LavMqId = new int[1] ;
      T01TK14_A12692LavMqLnPq = new short[1] ;
      T01TK15_A396EmprCod = new String[] {""} ;
      T01TK15_A129BarCod = new int[1] ;
      T01TK15_A132BarCodReo = new byte[1] ;
      T01TK15_A130BarCodPar = new String[] {""} ;
      T01TK15_A4075recestncol = new byte[1] ;
      T01TK15_A4076recestnpro = new byte[1] ;
      T01TK16_A396EmprCod = new String[] {""} ;
      T01TK16_A4052EstNumFor = new int[1] ;
      T01TK16_A4053EstNumCol = new byte[1] ;
      T01TK16_A4057EstNumLin = new byte[1] ;
      T01TK17_A396EmprCod = new String[] {""} ;
      T01TK17_A6380Ft_procod = new String[] {""} ;
      T01TK17_A6383Ft_ProLin = new short[1] ;
      T01TK18_A396EmprCod = new String[] {""} ;
      T01TK18_A11270Pot_num = new int[1] ;
      T01TK19_A396EmprCod = new String[] {""} ;
      T01TK19_A764ProForCod = new String[] {""} ;
      T01TK19_n764ProForCod = new boolean[] {false} ;
      T01TK19_A8877Prg_Cod = new int[1] ;
      T01TK20_A396EmprCod = new String[] {""} ;
      T01TK20_A252CliCod = new int[1] ;
      T01TK20_A494ForSer = new String[] {""} ;
      T01TK20_A482ForColNom = new String[] {""} ;
      T01TK20_A483ForColNum = new int[1] ;
      T01TK20_A831TipColCod = new byte[1] ;
      T01TK20_A7094Acab_Ter = new String[] {""} ;
      T01TK21_A396EmprCod = new String[] {""} ;
      T01TK21_A758ProCod = new String[] {""} ;
      T01TK21_A774ProNumLin = new short[1] ;
      T01TK21_A6438ProFsaL = new short[1] ;
      T01TK22_A396EmprCod = new String[] {""} ;
      T01TK22_A6319C_Barcod = new int[1] ;
      T01TK22_A6320C_Barcodre = new byte[1] ;
      T01TK22_A6321C_Barcodpa = new String[] {""} ;
      T01TK22_A6322C_Reclinma = new short[1] ;
      T01TK22_A6323C_Reclinpr = new byte[1] ;
      T01TK23_A396EmprCod = new String[] {""} ;
      T01TK23_A361DisCod = new int[1] ;
      T01TK23_A758ProCod = new String[] {""} ;
      T01TK23_A368DisFasLin = new short[1] ;
      T01TK23_A5377DisQuiLin = new short[1] ;
      T01TK24_A396EmprCod = new String[] {""} ;
      T01TK24_A129BarCod = new int[1] ;
      T01TK24_A132BarCodReo = new byte[1] ;
      T01TK24_A130BarCodPar = new String[] {""} ;
      T01TK24_A758ProCod = new String[] {""} ;
      T01TK24_A194BarOrdLin = new short[1] ;
      T01TK24_A5371FasQuiLin = new short[1] ;
      T01TK25_A396EmprCod = new String[] {""} ;
      T01TK25_A764ProForCod = new String[] {""} ;
      T01TK25_n764ProForCod = new boolean[] {false} ;
      T01TK25_A5191ProForLC = new short[1] ;
      T01TK26_A396EmprCod = new String[] {""} ;
      T01TK26_A764ProForCod = new String[] {""} ;
      T01TK26_n764ProForCod = new boolean[] {false} ;
      T01TK26_A5191ProForLC = new short[1] ;
      T01TK27_A396EmprCod = new String[] {""} ;
      T01TK27_A831TipColCod = new byte[1] ;
      T01TK27_A5162TipColLin = new short[1] ;
      T01TK28_A396EmprCod = new String[] {""} ;
      T01TK28_A4744RecPreCod = new int[1] ;
      T01TK28_A4762RecPreLin = new short[1] ;
      T01TK29_A396EmprCod = new String[] {""} ;
      T01TK29_A252CliCod = new int[1] ;
      T01TK29_A65ArtCod = new String[] {""} ;
      T01TK29_A4658MdlCod = new String[] {""} ;
      T01TK29_A457FasCod = new String[] {""} ;
      T01TK29_A4660FasProLin = new short[1] ;
      T01TK30_A396EmprCod = new String[] {""} ;
      T01TK30_A457FasCod = new String[] {""} ;
      T01TK30_A4650FasForLin = new short[1] ;
      T01TK31_A396EmprCod = new String[] {""} ;
      T01TK31_A129BarCod = new int[1] ;
      T01TK31_A132BarCodReo = new byte[1] ;
      T01TK31_A130BarCodPar = new String[] {""} ;
      T01TK31_A2804RecLinMaq = new short[1] ;
      T01TK31_A1273RecLinPro = new byte[1] ;
      T01TK32_A396EmprCod = new String[] {""} ;
      T01TK32_A1514MacProCod = new String[] {""} ;
      T01TK32_A1517MacProLin = new short[1] ;
      T01TK33_A396EmprCod = new String[] {""} ;
      T01TK33_A252CliCod = new int[1] ;
      T01TK33_A494ForSer = new String[] {""} ;
      T01TK33_A482ForColNom = new String[] {""} ;
      T01TK33_A483ForColNum = new int[1] ;
      T01TK33_A831TipColCod = new byte[1] ;
      T01TK33_A1160ProForL = new short[1] ;
      T01TK34_A396EmprCod = new String[] {""} ;
      T01TK34_A910Workstat = new String[] {""} ;
      T01TK34_A887EscMLin = new int[1] ;
      T01TK35_A396EmprCod = new String[] {""} ;
      T01TK35_A764ProForCod = new String[] {""} ;
      T01TK35_n764ProForCod = new boolean[] {false} ;
      T01TK35_A767ProForLin = new short[1] ;
      T01TK36_A396EmprCod = new String[] {""} ;
      T01TK36_A764ProForCod = new String[] {""} ;
      T01TK36_n764ProForCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i13133ProForAct = "" ;
      i3005ProRev = "" ;
      GXv_int5 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int11 = new byte[1] ;
      Z920ProForCodV = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_1__default(),
         new Object[] {
             new Object[] {
            T01TK2_A764ProForCod, T01TK2_A6061ProForLab, T01TK2_A766ProForDsc, T01TK2_A4715ProForDsc2, T01TK2_A13133ProForAct, T01TK2_A5523ProForTip, T01TK2_A771ProForTie, T01TK2_A772ProForTmx, T01TK2_A769ProForMat, T01TK2_A4706ProForRb,
            T01TK2_A2392ProNumPro, T01TK2_A2393ProNumRec, T01TK2_A4705ProForPau, T01TK2_A674PorForFul, T01TK2_A8527ProForAbs, T01TK2_A773ProForUli, T01TK2_A3005ProRev, T01TK2_A4864ProForCCi, T01TK2_A4865ProForDCi, T01TK2_A8528ProForCos,
            T01TK2_A10120ProforVl, T01TK2_A10547ProH2O, T01TK2_A3589ProForMer, T01TK2_A13936ProForRs, T01TK2_A396EmprCod
            }
            , new Object[] {
            T01TK3_A764ProForCod, T01TK3_A6061ProForLab, T01TK3_A766ProForDsc, T01TK3_A4715ProForDsc2, T01TK3_A13133ProForAct, T01TK3_A5523ProForTip, T01TK3_A771ProForTie, T01TK3_A772ProForTmx, T01TK3_A769ProForMat, T01TK3_A4706ProForRb,
            T01TK3_A2392ProNumPro, T01TK3_A2393ProNumRec, T01TK3_A4705ProForPau, T01TK3_A674PorForFul, T01TK3_A8527ProForAbs, T01TK3_A773ProForUli, T01TK3_A3005ProRev, T01TK3_A4864ProForCCi, T01TK3_A4865ProForDCi, T01TK3_A8528ProForCos,
            T01TK3_A10120ProforVl, T01TK3_A10547ProH2O, T01TK3_A3589ProForMer, T01TK3_A13936ProForRs, T01TK3_A396EmprCod
            }
            , new Object[] {
            T01TK4_A407EmprNom, T01TK4_n407EmprNom
            }
            , new Object[] {
            T01TK5_A764ProForCod, T01TK5_A6061ProForLab, T01TK5_A407EmprNom, T01TK5_n407EmprNom, T01TK5_A766ProForDsc, T01TK5_A4715ProForDsc2, T01TK5_A13133ProForAct, T01TK5_A5523ProForTip, T01TK5_A771ProForTie, T01TK5_A772ProForTmx,
            T01TK5_A769ProForMat, T01TK5_A4706ProForRb, T01TK5_A2392ProNumPro, T01TK5_A2393ProNumRec, T01TK5_A4705ProForPau, T01TK5_A674PorForFul, T01TK5_A8527ProForAbs, T01TK5_A773ProForUli, T01TK5_A3005ProRev, T01TK5_A4864ProForCCi,
            T01TK5_A4865ProForDCi, T01TK5_A8528ProForCos, T01TK5_A10120ProforVl, T01TK5_A10547ProH2O, T01TK5_A3589ProForMer, T01TK5_A13936ProForRs, T01TK5_A396EmprCod
            }
            , new Object[] {
            T01TK6_A396EmprCod, T01TK6_A764ProForCod
            }
            , new Object[] {
            T01TK7_A396EmprCod, T01TK7_A764ProForCod
            }
            , new Object[] {
            T01TK8_A396EmprCod, T01TK8_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TK12_A396EmprCod, T01TK12_A252CliCod, T01TK12_A13381CliProQui
            }
            , new Object[] {
            T01TK13_A396EmprCod, T01TK13_A13026PedDGId, T01TK13_A758ProCod, T01TK13_A13045PedDGFasLi, T01TK13_A13057PedDGPQLin
            }
            , new Object[] {
            T01TK14_A396EmprCod, T01TK14_A12673LavMqId, T01TK14_A12692LavMqLnPq
            }
            , new Object[] {
            T01TK15_A396EmprCod, T01TK15_A129BarCod, T01TK15_A132BarCodReo, T01TK15_A130BarCodPar, T01TK15_A4075recestncol, T01TK15_A4076recestnpro
            }
            , new Object[] {
            T01TK16_A396EmprCod, T01TK16_A4052EstNumFor, T01TK16_A4053EstNumCol, T01TK16_A4057EstNumLin
            }
            , new Object[] {
            T01TK17_A396EmprCod, T01TK17_A6380Ft_procod, T01TK17_A6383Ft_ProLin
            }
            , new Object[] {
            T01TK18_A396EmprCod, T01TK18_A11270Pot_num
            }
            , new Object[] {
            T01TK19_A396EmprCod, T01TK19_A764ProForCod, T01TK19_A8877Prg_Cod
            }
            , new Object[] {
            T01TK20_A396EmprCod, T01TK20_A252CliCod, T01TK20_A494ForSer, T01TK20_A482ForColNom, T01TK20_A483ForColNum, T01TK20_A831TipColCod, T01TK20_A7094Acab_Ter
            }
            , new Object[] {
            T01TK21_A396EmprCod, T01TK21_A758ProCod, T01TK21_A774ProNumLin, T01TK21_A6438ProFsaL
            }
            , new Object[] {
            T01TK22_A396EmprCod, T01TK22_A6319C_Barcod, T01TK22_A6320C_Barcodre, T01TK22_A6321C_Barcodpa, T01TK22_A6322C_Reclinma, T01TK22_A6323C_Reclinpr
            }
            , new Object[] {
            T01TK23_A396EmprCod, T01TK23_A361DisCod, T01TK23_A758ProCod, T01TK23_A368DisFasLin, T01TK23_A5377DisQuiLin
            }
            , new Object[] {
            T01TK24_A396EmprCod, T01TK24_A129BarCod, T01TK24_A132BarCodReo, T01TK24_A130BarCodPar, T01TK24_A758ProCod, T01TK24_A194BarOrdLin, T01TK24_A5371FasQuiLin
            }
            , new Object[] {
            T01TK25_A396EmprCod, T01TK25_A764ProForCod, T01TK25_A5191ProForLC
            }
            , new Object[] {
            T01TK26_A396EmprCod, T01TK26_A764ProForCod, T01TK26_A5191ProForLC
            }
            , new Object[] {
            T01TK27_A396EmprCod, T01TK27_A831TipColCod, T01TK27_A5162TipColLin
            }
            , new Object[] {
            T01TK28_A396EmprCod, T01TK28_A4744RecPreCod, T01TK28_A4762RecPreLin
            }
            , new Object[] {
            T01TK29_A396EmprCod, T01TK29_A252CliCod, T01TK29_A65ArtCod, T01TK29_A4658MdlCod, T01TK29_A457FasCod, T01TK29_A4660FasProLin
            }
            , new Object[] {
            T01TK30_A396EmprCod, T01TK30_A457FasCod, T01TK30_A4650FasForLin
            }
            , new Object[] {
            T01TK31_A396EmprCod, T01TK31_A129BarCod, T01TK31_A132BarCodReo, T01TK31_A130BarCodPar, T01TK31_A2804RecLinMaq, T01TK31_A1273RecLinPro
            }
            , new Object[] {
            T01TK32_A396EmprCod, T01TK32_A1514MacProCod, T01TK32_A1517MacProLin
            }
            , new Object[] {
            T01TK33_A396EmprCod, T01TK33_A252CliCod, T01TK33_A494ForSer, T01TK33_A482ForColNom, T01TK33_A483ForColNum, T01TK33_A831TipColCod, T01TK33_A1160ProForL
            }
            , new Object[] {
            T01TK34_A396EmprCod, T01TK34_A910Workstat, T01TK34_A887EscMLin
            }
            , new Object[] {
            T01TK35_A396EmprCod, T01TK35_A764ProForCod, T01TK35_A767ProForLin
            }
            , new Object[] {
            T01TK36_A396EmprCod, T01TK36_A764ProForCod
            }
         }
      );
      AV40Pgmname = "FormulacionTinte.ProcesoQuimico_1" ;
      Z3005ProRev = httpContext.getMessage( "N", "") ;
      A3005ProRev = httpContext.getMessage( "N", "") ;
      i3005ProRev = httpContext.getMessage( "N", "") ;
      Z13133ProForAct = httpContext.getMessage( "S", "") ;
      A13133ProForAct = httpContext.getMessage( "S", "") ;
      i13133ProForAct = httpContext.getMessage( "S", "") ;
      Z6061ProForLab = "" ;
      A6061ProForLab = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private short Z771ProForTie ;
   private short Z772ProForTmx ;
   private short Z4706ProForRb ;
   private short Z4705ProForPau ;
   private short Z773ProForUli ;
   private short Z10547ProH2O ;
   private short AV35Exis_pro ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short A4706ProForRb ;
   private short A10547ProH2O ;
   private short A4705ProForPau ;
   private short A773ProForUli ;
   private short AV24Orient ;
   private short RcdFound89 ;
   private short AV11ObsPrf ;
   private short AV12FlagLav ;
   private short AV13CdpPor ;
   private short AV14Tecido ;
   private short AV15Lavado ;
   private short AV16Erfoc ;
   private short AV17Texfina ;
   private short AV18Clave2 ;
   private short AV19NoVisible ;
   private short AV20Velta ;
   private short AV21Filasur ;
   private short AV22Pathter ;
   private short AV23jpf ;
   private short AV25tintutex ;
   private short AV26TiposTecnologias ;
   private short AV27Fabs ;
   private short nIsDirty_89 ;
   private int Z2392ProNumPro ;
   private int Z2393ProNumRec ;
   private int Z10120ProforVl ;
   private int trnEnded ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForDsc2_Enabled ;
   private int edtProForTip_Enabled ;
   private int edtProForRs_Visible ;
   private int edtProForRs_Enabled ;
   private int edtProForTie_Enabled ;
   private int edtProForTmx_Enabled ;
   private int edtProForMat_Enabled ;
   private int edtProForRb_Enabled ;
   private int edtProForLab_Visible ;
   private int edtProForLab_Enabled ;
   private int edtProForAbs_Visible ;
   private int edtProForAbs_Enabled ;
   private int edtProForCos_Visible ;
   private int edtProForCos_Enabled ;
   private int edtProforVl_Visible ;
   private int A10120ProforVl ;
   private int edtProforVl_Enabled ;
   private int edtProH2O_Visible ;
   private int edtProH2O_Enabled ;
   private int A2392ProNumPro ;
   private int edtProNumPro_Enabled ;
   private int A2393ProNumRec ;
   private int edtProNumRec_Enabled ;
   private int edtProForPau_Visible ;
   private int edtProForPau_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboproforlab_Visible ;
   private int edtavComboproforlab_Enabled ;
   private int Combo_proforlab_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z8527ProForAbs ;
   private java.math.BigDecimal Z8528ProForCos ;
   private java.math.BigDecimal Z3589ProForMer ;
   private java.math.BigDecimal A8527ProForAbs ;
   private java.math.BigDecimal A8528ProForCos ;
   private java.math.BigDecimal A3589ProForMer ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV8EmprCod ;
   private String wcpOAV30ProForCod ;
   private String Z396EmprCod ;
   private String Z764ProForCod ;
   private String Z6061ProForLab ;
   private String Z766ProForDsc ;
   private String Z4715ProForDsc2 ;
   private String Z13133ProForAct ;
   private String Z5523ProForTip ;
   private String Z769ProForMat ;
   private String Z3005ProRev ;
   private String Z4864ProForCCi ;
   private String Z4865ProForDCi ;
   private String Z13936ProForRs ;
   private String Combo_proforlab_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A6061ProForLab ;
   private String Gx_mode ;
   private String AV8EmprCod ;
   private String AV30ProForCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProForCod_Internalname ;
   private String A13133ProForAct ;
   private String A3005ProRev ;
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
   private String A764ProForCod ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForDsc2_Internalname ;
   private String A4715ProForDsc2 ;
   private String edtProForDsc2_Jsonclick ;
   private String edtProForTip_Internalname ;
   private String A5523ProForTip ;
   private String edtProForTip_Jsonclick ;
   private String divProforrs_cell_Internalname ;
   private String divProforrs_cell_Class ;
   private String edtProForRs_Internalname ;
   private String A13936ProForRs ;
   private String edtProForRs_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtProForTie_Internalname ;
   private String edtProForTie_Jsonclick ;
   private String edtProForTmx_Internalname ;
   private String edtProForTmx_Jsonclick ;
   private String edtProForMat_Internalname ;
   private String A769ProForMat ;
   private String edtProForMat_Jsonclick ;
   private String edtProForRb_Internalname ;
   private String edtProForRb_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedproforlab_Internalname ;
   private String lblTextblockproforlab_Internalname ;
   private String lblTextblockproforlab_Jsonclick ;
   private String Combo_proforlab_Caption ;
   private String Combo_proforlab_Cls ;
   private String Combo_proforlab_Emptyitemtext ;
   private String Combo_proforlab_Internalname ;
   private String edtProForLab_Internalname ;
   private String edtProForLab_Jsonclick ;
   private String divProforabs_cell_Internalname ;
   private String divProforabs_cell_Class ;
   private String edtProForAbs_Internalname ;
   private String edtProForAbs_Jsonclick ;
   private String divProforcos_cell_Internalname ;
   private String divProforcos_cell_Class ;
   private String edtProForCos_Internalname ;
   private String edtProForCos_Jsonclick ;
   private String divProforvl_cell_Internalname ;
   private String divProforvl_cell_Class ;
   private String edtProforVl_Internalname ;
   private String edtProforVl_Jsonclick ;
   private String divProh2o_cell_Internalname ;
   private String divProh2o_cell_Class ;
   private String edtProH2O_Internalname ;
   private String edtProH2O_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtProNumPro_Internalname ;
   private String edtProNumPro_Jsonclick ;
   private String edtProNumRec_Internalname ;
   private String edtProNumRec_Jsonclick ;
   private String divProforpau_cell_Internalname ;
   private String divProforpau_cell_Class ;
   private String edtProForPau_Internalname ;
   private String edtProForPau_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV40Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_proforlab_Internalname ;
   private String edtavComboproforlab_Internalname ;
   private String AV38ComboProForLab ;
   private String edtavComboproforlab_Jsonclick ;
   private String A4864ProForCCi ;
   private String A4865ProForDCi ;
   private String A941EmprCodV2 ;
   private String A920ProForCodV ;
   private String AV29Msg1 ;
   private String A407EmprNom ;
   private String Combo_proforlab_Objectcall ;
   private String Combo_proforlab_Class ;
   private String Combo_proforlab_Icontype ;
   private String Combo_proforlab_Icon ;
   private String Combo_proforlab_Tooltip ;
   private String Combo_proforlab_Selectedvalue_set ;
   private String Combo_proforlab_Selectedtext_set ;
   private String Combo_proforlab_Selectedtext_get ;
   private String Combo_proforlab_Gamoauthtoken ;
   private String Combo_proforlab_Ddointernalname ;
   private String Combo_proforlab_Titlecontrolalign ;
   private String Combo_proforlab_Dropdownoptionstype ;
   private String Combo_proforlab_Titlecontrolidtoreplace ;
   private String Combo_proforlab_Datalisttype ;
   private String Combo_proforlab_Datalistfixedvalues ;
   private String Combo_proforlab_Datalistproc ;
   private String Combo_proforlab_Datalistprocparametersprefix ;
   private String Combo_proforlab_Remoteservicesparameters ;
   private String Combo_proforlab_Htmltemplate ;
   private String Combo_proforlab_Multiplevaluestype ;
   private String Combo_proforlab_Loadingdata ;
   private String Combo_proforlab_Noresultsfound ;
   private String Combo_proforlab_Onlyselectedvalues ;
   private String Combo_proforlab_Selectalltext ;
   private String Combo_proforlab_Multiplevaluesseparator ;
   private String Combo_proforlab_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode89 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Station ;
   private String AV9EmprNom ;
   private String AV10UsurCod ;
   private String AV41Op ;
   private String AV28msg0 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i13133ProForAct ;
   private String i3005ProRev ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z920ProForCodV ;
   private java.util.Date Z674PorForFul ;
   private java.util.Date A674PorForFul ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Combo_proforlab_Enabled ;
   private boolean Combo_proforlab_Visible ;
   private boolean Combo_proforlab_Allowmultipleselection ;
   private boolean Combo_proforlab_Isgriditem ;
   private boolean Combo_proforlab_Hasdescription ;
   private boolean Combo_proforlab_Includeonlyselectedoption ;
   private boolean Combo_proforlab_Includeselectalloption ;
   private boolean Combo_proforlab_Emptyitem ;
   private boolean Combo_proforlab_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n764ProForCod ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13740ProFDsc ;
   private String AV37ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV33WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforlab ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkProForAct ;
   private HTMLChoice cmbProRev ;
   private IDataStoreProvider pr_default ;
   private String[] T01TK4_A407EmprNom ;
   private boolean[] T01TK4_n407EmprNom ;
   private String[] T01TK5_A764ProForCod ;
   private boolean[] T01TK5_n764ProForCod ;
   private String[] T01TK5_A6061ProForLab ;
   private String[] T01TK5_A407EmprNom ;
   private boolean[] T01TK5_n407EmprNom ;
   private String[] T01TK5_A766ProForDsc ;
   private String[] T01TK5_A4715ProForDsc2 ;
   private String[] T01TK5_A13133ProForAct ;
   private String[] T01TK5_A5523ProForTip ;
   private short[] T01TK5_A771ProForTie ;
   private short[] T01TK5_A772ProForTmx ;
   private String[] T01TK5_A769ProForMat ;
   private short[] T01TK5_A4706ProForRb ;
   private int[] T01TK5_A2392ProNumPro ;
   private int[] T01TK5_A2393ProNumRec ;
   private short[] T01TK5_A4705ProForPau ;
   private java.util.Date[] T01TK5_A674PorForFul ;
   private java.math.BigDecimal[] T01TK5_A8527ProForAbs ;
   private short[] T01TK5_A773ProForUli ;
   private String[] T01TK5_A3005ProRev ;
   private String[] T01TK5_A4864ProForCCi ;
   private String[] T01TK5_A4865ProForDCi ;
   private java.math.BigDecimal[] T01TK5_A8528ProForCos ;
   private int[] T01TK5_A10120ProforVl ;
   private short[] T01TK5_A10547ProH2O ;
   private java.math.BigDecimal[] T01TK5_A3589ProForMer ;
   private String[] T01TK5_A13936ProForRs ;
   private String[] T01TK5_A396EmprCod ;
   private String[] T01TK6_A396EmprCod ;
   private String[] T01TK6_A764ProForCod ;
   private boolean[] T01TK6_n764ProForCod ;
   private String[] T01TK3_A764ProForCod ;
   private boolean[] T01TK3_n764ProForCod ;
   private String[] T01TK3_A6061ProForLab ;
   private String[] T01TK3_A766ProForDsc ;
   private String[] T01TK3_A4715ProForDsc2 ;
   private String[] T01TK3_A13133ProForAct ;
   private String[] T01TK3_A5523ProForTip ;
   private short[] T01TK3_A771ProForTie ;
   private short[] T01TK3_A772ProForTmx ;
   private String[] T01TK3_A769ProForMat ;
   private short[] T01TK3_A4706ProForRb ;
   private int[] T01TK3_A2392ProNumPro ;
   private int[] T01TK3_A2393ProNumRec ;
   private short[] T01TK3_A4705ProForPau ;
   private java.util.Date[] T01TK3_A674PorForFul ;
   private java.math.BigDecimal[] T01TK3_A8527ProForAbs ;
   private short[] T01TK3_A773ProForUli ;
   private String[] T01TK3_A3005ProRev ;
   private String[] T01TK3_A4864ProForCCi ;
   private String[] T01TK3_A4865ProForDCi ;
   private java.math.BigDecimal[] T01TK3_A8528ProForCos ;
   private int[] T01TK3_A10120ProforVl ;
   private short[] T01TK3_A10547ProH2O ;
   private java.math.BigDecimal[] T01TK3_A3589ProForMer ;
   private String[] T01TK3_A13936ProForRs ;
   private String[] T01TK3_A396EmprCod ;
   private String[] T01TK7_A396EmprCod ;
   private String[] T01TK7_A764ProForCod ;
   private boolean[] T01TK7_n764ProForCod ;
   private String[] T01TK8_A396EmprCod ;
   private String[] T01TK8_A764ProForCod ;
   private boolean[] T01TK8_n764ProForCod ;
   private String[] T01TK2_A764ProForCod ;
   private boolean[] T01TK2_n764ProForCod ;
   private String[] T01TK2_A6061ProForLab ;
   private String[] T01TK2_A766ProForDsc ;
   private String[] T01TK2_A4715ProForDsc2 ;
   private String[] T01TK2_A13133ProForAct ;
   private String[] T01TK2_A5523ProForTip ;
   private short[] T01TK2_A771ProForTie ;
   private short[] T01TK2_A772ProForTmx ;
   private String[] T01TK2_A769ProForMat ;
   private short[] T01TK2_A4706ProForRb ;
   private int[] T01TK2_A2392ProNumPro ;
   private int[] T01TK2_A2393ProNumRec ;
   private short[] T01TK2_A4705ProForPau ;
   private java.util.Date[] T01TK2_A674PorForFul ;
   private java.math.BigDecimal[] T01TK2_A8527ProForAbs ;
   private short[] T01TK2_A773ProForUli ;
   private String[] T01TK2_A3005ProRev ;
   private String[] T01TK2_A4864ProForCCi ;
   private String[] T01TK2_A4865ProForDCi ;
   private java.math.BigDecimal[] T01TK2_A8528ProForCos ;
   private int[] T01TK2_A10120ProforVl ;
   private short[] T01TK2_A10547ProH2O ;
   private java.math.BigDecimal[] T01TK2_A3589ProForMer ;
   private String[] T01TK2_A13936ProForRs ;
   private String[] T01TK2_A396EmprCod ;
   private String[] T01TK12_A396EmprCod ;
   private int[] T01TK12_A252CliCod ;
   private String[] T01TK12_A13381CliProQui ;
   private String[] T01TK13_A396EmprCod ;
   private int[] T01TK13_A13026PedDGId ;
   private String[] T01TK13_A758ProCod ;
   private short[] T01TK13_A13045PedDGFasLi ;
   private short[] T01TK13_A13057PedDGPQLin ;
   private String[] T01TK14_A396EmprCod ;
   private int[] T01TK14_A12673LavMqId ;
   private short[] T01TK14_A12692LavMqLnPq ;
   private String[] T01TK15_A396EmprCod ;
   private int[] T01TK15_A129BarCod ;
   private byte[] T01TK15_A132BarCodReo ;
   private String[] T01TK15_A130BarCodPar ;
   private byte[] T01TK15_A4075recestncol ;
   private byte[] T01TK15_A4076recestnpro ;
   private String[] T01TK16_A396EmprCod ;
   private int[] T01TK16_A4052EstNumFor ;
   private byte[] T01TK16_A4053EstNumCol ;
   private byte[] T01TK16_A4057EstNumLin ;
   private String[] T01TK17_A396EmprCod ;
   private String[] T01TK17_A6380Ft_procod ;
   private short[] T01TK17_A6383Ft_ProLin ;
   private String[] T01TK18_A396EmprCod ;
   private int[] T01TK18_A11270Pot_num ;
   private String[] T01TK19_A396EmprCod ;
   private String[] T01TK19_A764ProForCod ;
   private boolean[] T01TK19_n764ProForCod ;
   private int[] T01TK19_A8877Prg_Cod ;
   private String[] T01TK20_A396EmprCod ;
   private int[] T01TK20_A252CliCod ;
   private String[] T01TK20_A494ForSer ;
   private String[] T01TK20_A482ForColNom ;
   private int[] T01TK20_A483ForColNum ;
   private byte[] T01TK20_A831TipColCod ;
   private String[] T01TK20_A7094Acab_Ter ;
   private String[] T01TK21_A396EmprCod ;
   private String[] T01TK21_A758ProCod ;
   private short[] T01TK21_A774ProNumLin ;
   private short[] T01TK21_A6438ProFsaL ;
   private String[] T01TK22_A396EmprCod ;
   private int[] T01TK22_A6319C_Barcod ;
   private byte[] T01TK22_A6320C_Barcodre ;
   private String[] T01TK22_A6321C_Barcodpa ;
   private short[] T01TK22_A6322C_Reclinma ;
   private byte[] T01TK22_A6323C_Reclinpr ;
   private String[] T01TK23_A396EmprCod ;
   private int[] T01TK23_A361DisCod ;
   private String[] T01TK23_A758ProCod ;
   private short[] T01TK23_A368DisFasLin ;
   private short[] T01TK23_A5377DisQuiLin ;
   private String[] T01TK24_A396EmprCod ;
   private int[] T01TK24_A129BarCod ;
   private byte[] T01TK24_A132BarCodReo ;
   private String[] T01TK24_A130BarCodPar ;
   private String[] T01TK24_A758ProCod ;
   private short[] T01TK24_A194BarOrdLin ;
   private short[] T01TK24_A5371FasQuiLin ;
   private String[] T01TK25_A396EmprCod ;
   private String[] T01TK25_A764ProForCod ;
   private boolean[] T01TK25_n764ProForCod ;
   private short[] T01TK25_A5191ProForLC ;
   private String[] T01TK26_A396EmprCod ;
   private String[] T01TK26_A764ProForCod ;
   private boolean[] T01TK26_n764ProForCod ;
   private short[] T01TK26_A5191ProForLC ;
   private String[] T01TK27_A396EmprCod ;
   private byte[] T01TK27_A831TipColCod ;
   private short[] T01TK27_A5162TipColLin ;
   private String[] T01TK28_A396EmprCod ;
   private int[] T01TK28_A4744RecPreCod ;
   private short[] T01TK28_A4762RecPreLin ;
   private String[] T01TK29_A396EmprCod ;
   private int[] T01TK29_A252CliCod ;
   private String[] T01TK29_A65ArtCod ;
   private String[] T01TK29_A4658MdlCod ;
   private String[] T01TK29_A457FasCod ;
   private short[] T01TK29_A4660FasProLin ;
   private String[] T01TK30_A396EmprCod ;
   private String[] T01TK30_A457FasCod ;
   private short[] T01TK30_A4650FasForLin ;
   private String[] T01TK31_A396EmprCod ;
   private int[] T01TK31_A129BarCod ;
   private byte[] T01TK31_A132BarCodReo ;
   private String[] T01TK31_A130BarCodPar ;
   private short[] T01TK31_A2804RecLinMaq ;
   private byte[] T01TK31_A1273RecLinPro ;
   private String[] T01TK32_A396EmprCod ;
   private String[] T01TK32_A1514MacProCod ;
   private short[] T01TK32_A1517MacProLin ;
   private String[] T01TK33_A396EmprCod ;
   private int[] T01TK33_A252CliCod ;
   private String[] T01TK33_A494ForSer ;
   private String[] T01TK33_A482ForColNom ;
   private int[] T01TK33_A483ForColNum ;
   private byte[] T01TK33_A831TipColCod ;
   private short[] T01TK33_A1160ProForL ;
   private String[] T01TK34_A396EmprCod ;
   private String[] T01TK34_A910Workstat ;
   private int[] T01TK34_A887EscMLin ;
   private String[] T01TK35_A396EmprCod ;
   private String[] T01TK35_A764ProForCod ;
   private boolean[] T01TK35_n764ProForCod ;
   private short[] T01TK35_A767ProForLin ;
   private String[] T01TK36_A396EmprCod ;
   private String[] T01TK36_A764ProForCod ;
   private boolean[] T01TK36_n764ProForCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV36ProForLab_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV31WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV32TrnContext ;
}

final  class procesoquimico_1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesoquimico_1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesoquimico_1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesoquimico_1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesoquimico_1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TK2", "SELECT ProForCod, ProForLab, ProForDsc, ProForDsc2, ProForAct, ProForTip, ProForTie, ProForTmx, ProForMat, ProForRb, ProNumPro, ProNumRec, ProForPau, PorForFul, ProForAbs, ProForUli, ProRev, ProForCCi, ProForDCi, ProForCos, ProforVl, ProH2O, ProForMer, ProForRs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ?  FOR UPDATE OF ProForLab, ProForDsc, ProForDsc2, ProForAct, ProForTip, ProForTie, ProForTmx, ProForMat, ProForRb, ProNumPro, ProNumRec, ProForPau, PorForFul, ProForAbs, ProForUli, ProRev, ProForCCi, ProForDCi, ProForCos, ProforVl, ProH2O, ProForMer, ProForRs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TK3", "SELECT ProForCod, ProForLab, ProForDsc, ProForDsc2, ProForAct, ProForTip, ProForTie, ProForTmx, ProForMat, ProForRb, ProNumPro, ProNumRec, ProForPau, PorForFul, ProForAbs, ProForUli, ProRev, ProForCCi, ProForDCi, ProForCos, ProforVl, ProH2O, ProForMer, ProForRs, EmprCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TK4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TK5", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProForCod, TM1.ProForLab, T2.EmprNom, TM1.ProForDsc, TM1.ProForDsc2, TM1.ProForAct, TM1.ProForTip, TM1.ProForTie, TM1.ProForTmx, TM1.ProForMat, TM1.ProForRb, TM1.ProNumPro, TM1.ProNumRec, TM1.ProForPau, TM1.PorForFul, TM1.ProForAbs, TM1.ProForUli, TM1.ProRev, TM1.ProForCCi, TM1.ProForDCi, TM1.ProForCos, TM1.ProforVl, TM1.ProH2O, TM1.ProForMer, TM1.ProForRs, TM1.EmprCod FROM (TXPCPROFO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.ProForCod = ? ORDER BY TM1.EmprCod, TM1.ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TK6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TK7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE ( EmprCod > ? or EmprCod = ? and ProForCod > ?) ORDER BY EmprCod, ProForCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProForCod FROM TXPCPROFO WHERE ( EmprCod < ? or EmprCod = ? and ProForCod < ?) ORDER BY EmprCod DESC, ProForCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TK9", "INSERT INTO TXPCPROFO(ProForCod, ProForLab, ProForDsc, ProForDsc2, ProForAct, ProForTip, ProForTie, ProForTmx, ProForMat, ProForRb, ProNumPro, ProNumRec, ProForPau, PorForFul, ProForAbs, ProForUli, ProRev, ProForCCi, ProForDCi, ProForCos, ProforVl, ProH2O, ProForMer, ProForRs, EmprCod, ProForObs, ProFoLCU, ProForFac, IntCodF2, ProForFab, ProForCol, ProForPhx, ProForPhn, ProNh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0)", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T01TK10", "UPDATE TXPCPROFO SET ProForLab=?, ProForDsc=?, ProForDsc2=?, ProForAct=?, ProForTip=?, ProForTie=?, ProForTmx=?, ProForMat=?, ProForRb=?, ProNumPro=?, ProNumRec=?, ProForPau=?, PorForFul=?, ProForAbs=?, ProForUli=?, ProRev=?, ProForCCi=?, ProForDCi=?, ProForCos=?, ProforVl=?, ProH2O=?, ProForMer=?, ProForRs=?  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new UpdateCursor("T01TK11", "DELETE FROM TXPCPROFO  WHERE EmprCod = ? AND ProForCod = ?", GX_NOMASK, "TXPCPROFO")
         ,new ForEachCursor("T01TK12", "SELECT * FROM (SELECT EmprCod, CliCod, CliProQui FROM TXPCLIPQU WHERE EmprCod = ? AND CliProQui = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK13", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin FROM TXPPEDDG7 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK14", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq FROM TXPLAVMQ1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK15", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro FROM TXPcreest WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK16", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstNumLin FROM TXPLCoPro WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK17", "SELECT * FROM (SELECT EmprCod, Ft_procod, Ft_ProLin FROM TXPFTPQS1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK18", "SELECT * FROM (SELECT EmprCod, Pot_num FROM TXPRECPOT WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK19", "SELECT * FROM (SELECT EmprCod, ProForCod, Prg_Cod FROM TXPPQPRGN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK20", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Acab_Ter FROM TXPCORAQ WHERE EmprCod = ? AND Acab_Ter = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK21", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK22", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma, C_Reclinpr FROM TXPCRECE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK23", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK24", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK25", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoQuC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK26", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK27", "SELECT * FROM (SELECT EmprCod, TipColCod, TipColLin FROM TXPTIPCOP WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK28", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin FROM TXPPRERE1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, FasCod, FasProLin FROM TXPLForFa WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK30", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPCRECET WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK32", "SELECT * FROM (SELECT EmprCod, MacProCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK33", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK34", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK35", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? AND ProForCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TK36", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProForCod FROM TXPCPROFO ORDER BY EmprCod, ProForCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((String[]) buf[18])[0] = rslt.getString(19, 16);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,4);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((String[]) buf[18])[0] = rslt.getString(19, 16);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,4);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[23])[0] = rslt.getString(24, 1);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[17])[0] = rslt.getShort(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 10);
               ((String[]) buf[20])[0] = rslt.getString(20, 16);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[25])[0] = rslt.getString(25, 1);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 30);
               stmt.setString(4, (String)parms[4], 40);
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 1);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               stmt.setString(9, (String)parms[9], 16);
               stmt.setShort(10, ((Number) parms[10]).shortValue());
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setInt(12, ((Number) parms[12]).intValue());
               stmt.setShort(13, ((Number) parms[13]).shortValue());
               stmt.setDate(14, (java.util.Date)parms[14]);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setString(17, (String)parms[17], 1);
               stmt.setString(18, (String)parms[18], 10);
               stmt.setString(19, (String)parms[19], 16);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 4);
               stmt.setInt(21, ((Number) parms[21]).intValue());
               stmt.setShort(22, ((Number) parms[22]).shortValue());
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[23], 2);
               stmt.setString(24, (String)parms[24], 1);
               stmt.setString(25, (String)parms[25], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 40);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 16);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 10);
               stmt.setString(18, (String)parms[17], 16);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 4);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               stmt.setString(23, (String)parms[22], 1);
               stmt.setString(24, (String)parms[23], 3);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[25], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

