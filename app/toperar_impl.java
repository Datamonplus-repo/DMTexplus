package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class toperar_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action16") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_16_1P75( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action17") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_17_1P75( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action19") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8422OpeSecc = httpContext.GetPar( "OpeSecc") ;
         n8422OpeSecc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_19_1P75( Gx_mode, A396EmprCod, A8422OpeSecc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa86401P75( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"") == 0 )
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
            AV42EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
            AV43OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43OpeCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43OpeCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO DE OPERARIOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public toperar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public toperar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( toperar_impl.class ));
   }

   public toperar_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOpeAct = new HTMLChoice();
      chkOpeMSol = UIFactory.getCheckbox(this);
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
      if ( cmbOpeAct.getItemCount() > 0 )
      {
         A8482OpeAct = cmbOpeAct.getValidValue(A8482OpeAct) ;
         n8482OpeAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8482OpeAct", A8482OpeAct);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOpeAct.setValue( GXutil.rtrim( A8482OpeAct) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOpeAct.getInternalname(), "Values", cmbOpeAct.ToJavascriptSource(), true);
      }
      A9528OpeMSol = ((GXutil.strcmp(GXutil.rtrim( A9528OpeMSol), "S")==0) ? "S" : "N") ;
      n9528OpeMSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9528OpeMSol", A9528OpeMSol);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOpeCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpeCod_Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOpeCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOpeNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpeNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOpeNom2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpeNom2_Internalname, httpContext.getMessage( "Nombre (cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom2_Internalname, GXutil.rtrim( A6869OpeNom2), GXutil.rtrim( localUtil.format( A6869OpeNom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOpeNom2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbOpeAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbOpeAct.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOpeAct, cmbOpeAct.getInternalname(), GXutil.rtrim( A8482OpeAct), 1, cmbOpeAct.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOpeAct.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "", true, (byte)(0), "HLP_TOPERAR.htm");
      cmbOpeAct.setValue( GXutil.rtrim( A8482OpeAct) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOpeAct.getInternalname(), "Values", cmbOpeAct.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtOpeCedula_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOpeCedula_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpeCedula_Internalname, httpContext.getMessage( "Cedula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCedula_Internalname, GXutil.ltrim( localUtil.ntoc( A6868OpeCedula, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCedula_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6868OpeCedula), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6868OpeCedula), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCedula_Jsonclick, 0, "AttributeFL", "", "", "", "", edtOpeCedula_Visible, edtOpeCedula_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtOpePreHor_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOpePreHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpePreHor_Internalname, httpContext.getMessage( "Precio Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpePreHor_Internalname, GXutil.ltrim( localUtil.ntoc( A2505OpePreHor, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpePreHor_Enabled!=0) ? localUtil.format( A2505OpePreHor, "ZZZZZ9.999") : localUtil.format( A2505OpePreHor, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpePreHor_Jsonclick, 0, "AttributeFL", "", "", "", "", edtOpePreHor_Visible, edtOpePreHor_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOpeCargo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpeCargo_Internalname, httpContext.getMessage( "Cargo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCargo_Internalname, GXutil.rtrim( A14500OpeCargo), GXutil.rtrim( localUtil.format( A14500OpeCargo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCargo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOpeCargo_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPERAR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedopeturno_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockopeturno_Internalname, httpContext.getMessage( "Turno", ""), "", "", lblTextblockopeturno_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_opeturno.setProperty("Caption", Combo_opeturno_Caption);
      ucCombo_opeturno.setProperty("Cls", Combo_opeturno_Cls);
      ucCombo_opeturno.setProperty("EmptyItemText", Combo_opeturno_Emptyitemtext);
      ucCombo_opeturno.setProperty("DropDownOptionsData", AV51OpeTurno_Data);
      ucCombo_opeturno.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_opeturno_Internalname, "COMBO_OPETURNOContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpeTurno_Internalname, httpContext.getMessage( "Turno", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeTurno_Internalname, GXutil.ltrim( localUtil.ntoc( A6232OpeTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeTurno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6232OpeTurno), "9") : localUtil.format( DecimalUtil.doubleToDec(A6232OpeTurno), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeTurno_Jsonclick, 0, "Attribute", "", "", "", "", edtOpeTurno_Visible, edtOpeTurno_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedopesecc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockopesecc_Internalname, httpContext.getMessage( "Seccion", ""), "", "", lblTextblockopesecc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_opesecc.setProperty("Caption", Combo_opesecc_Caption);
      ucCombo_opesecc.setProperty("Cls", Combo_opesecc_Cls);
      ucCombo_opesecc.setProperty("EmptyItemText", Combo_opesecc_Emptyitemtext);
      ucCombo_opesecc.setProperty("DropDownOptionsData", AV47OpeSecc_Data);
      ucCombo_opesecc.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_opesecc_Internalname, "COMBO_OPESECCContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpeSecc_Internalname, httpContext.getMessage( "Seccion", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeSecc_Internalname, GXutil.rtrim( A8422OpeSecc), GXutil.rtrim( localUtil.format( A8422OpeSecc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeSecc_Jsonclick, 0, "Attribute", "", "", "", "", edtOpeSecc_Visible, edtOpeSecc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divOpepass_cell_Internalname, 1, 0, "px", 0, "px", divOpepass_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtOpePass_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOpePass_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpePass_Internalname, httpContext.getMessage( "Password", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpePass_Internalname, GXutil.rtrim( A8640OpePass), GXutil.rtrim( localUtil.format( A8640OpePass, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpePass_Jsonclick, 0, "AttributeFL", "", "", "", "", edtOpePass_Visible, edtOpePass_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPERAR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", chkOpeMSol.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkOpeMSol.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkOpeMSol.getInternalname(), httpContext.getMessage( "Solicita Mant?", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkOpeMSol.getInternalname(), A9528OpeMSol, "", httpContext.getMessage( "Solicita Mant?", ""), chkOpeMSol.getVisible(), chkOpeMSol.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(94, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,94);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtOpeMUsu_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOpeMUsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOpeMUsu_Internalname, httpContext.getMessage( "Usuario", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeMUsu_Internalname, GXutil.rtrim( A9529OpeMUsu), GXutil.rtrim( localUtil.format( A9529OpeMUsu, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeMUsu_Jsonclick, 0, "AttributeFL", "", "", "", "", edtOpeMUsu_Visible, edtOpeMUsu_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPERAR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV54Pgmname), GXutil.rtrim( localUtil.format( AV54Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPERAR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_opeturno_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboopeturno_Internalname, GXutil.ltrim( localUtil.ntoc( AV52ComboOpeTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboopeturno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52ComboOpeTurno), "9") : localUtil.format( DecimalUtil.doubleToDec(AV52ComboOpeTurno), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboopeturno_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboopeturno_Visible, edtavComboopeturno_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_opesecc_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboopesecc_Internalname, GXutil.rtrim( AV49ComboOpeSecc), GXutil.rtrim( localUtil.format( AV49ComboOpeSecc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboopesecc_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboopesecc_Visible, edtavComboopesecc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPERAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_trn_delete_Internalname, tblTabledvelop_confirmpanel_trn_delete_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_trn_delete.setProperty("Title", Dvelop_confirmpanel_trn_delete_Title);
      ucDvelop_confirmpanel_trn_delete.setProperty("ConfirmationText", Dvelop_confirmpanel_trn_delete_Confirmationtext);
      ucDvelop_confirmpanel_trn_delete.setProperty("YesButtonCaption", Dvelop_confirmpanel_trn_delete_Yesbuttoncaption);
      ucDvelop_confirmpanel_trn_delete.setProperty("NoButtonCaption", Dvelop_confirmpanel_trn_delete_Nobuttoncaption);
      ucDvelop_confirmpanel_trn_delete.setProperty("CancelButtonCaption", Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption);
      ucDvelop_confirmpanel_trn_delete.setProperty("YesButtonPosition", Dvelop_confirmpanel_trn_delete_Yesbuttonposition);
      ucDvelop_confirmpanel_trn_delete.setProperty("ConfirmType", Dvelop_confirmpanel_trn_delete_Confirmtype);
      ucDvelop_confirmpanel_trn_delete.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_trn_delete_Internalname, "DVELOP_CONFIRMPANEL_TRN_DELETEContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_TRN_DELETEContainer"+"Body"+"\" style=\"display:none;\">") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      e111P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOPETURNO_DATA"), AV51OpeTurno_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOPESECC_DATA"), AV47OpeSecc_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6232OpeTurno = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6232OpeTurno"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8422OpeSecc = httpContext.cgiGet( "Z8422OpeSecc") ;
            Z9529OpeMUsu = httpContext.cgiGet( "Z9529OpeMUsu") ;
            Z653OpeNom = httpContext.cgiGet( "Z653OpeNom") ;
            Z6869OpeNom2 = httpContext.cgiGet( "Z6869OpeNom2") ;
            Z2505OpePreHor = localUtil.ctond( httpContext.cgiGet( "Z2505OpePreHor")) ;
            Z6868OpeCedula = localUtil.ctol( httpContext.cgiGet( "Z6868OpeCedula"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z8482OpeAct = httpContext.cgiGet( "Z8482OpeAct") ;
            Z8640OpePass = httpContext.cgiGet( "Z8640OpePass") ;
            Z9528OpeMSol = httpContext.cgiGet( "Z9528OpeMSol") ;
            Z14500OpeCargo = httpContext.cgiGet( "Z14500OpeCargo") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N9529OpeMUsu = httpContext.cgiGet( "N9529OpeMUsu") ;
            A13748OpeCNom = httpContext.cgiGet( "OPECNOM") ;
            AV42EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV43OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "vOPECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32FlagTintu = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGTINTU"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26msg0 = httpContext.cgiGet( "vMSG0") ;
            AV35Ok = (byte)(localUtil.ctol( httpContext.cgiGet( "vOK"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Combo_opeturno_Objectcall = httpContext.cgiGet( "COMBO_OPETURNO_Objectcall") ;
            Combo_opeturno_Class = httpContext.cgiGet( "COMBO_OPETURNO_Class") ;
            Combo_opeturno_Icontype = httpContext.cgiGet( "COMBO_OPETURNO_Icontype") ;
            Combo_opeturno_Icon = httpContext.cgiGet( "COMBO_OPETURNO_Icon") ;
            Combo_opeturno_Caption = httpContext.cgiGet( "COMBO_OPETURNO_Caption") ;
            Combo_opeturno_Tooltip = httpContext.cgiGet( "COMBO_OPETURNO_Tooltip") ;
            Combo_opeturno_Cls = httpContext.cgiGet( "COMBO_OPETURNO_Cls") ;
            Combo_opeturno_Selectedvalue_set = httpContext.cgiGet( "COMBO_OPETURNO_Selectedvalue_set") ;
            Combo_opeturno_Selectedvalue_get = httpContext.cgiGet( "COMBO_OPETURNO_Selectedvalue_get") ;
            Combo_opeturno_Selectedtext_set = httpContext.cgiGet( "COMBO_OPETURNO_Selectedtext_set") ;
            Combo_opeturno_Selectedtext_get = httpContext.cgiGet( "COMBO_OPETURNO_Selectedtext_get") ;
            Combo_opeturno_Gamoauthtoken = httpContext.cgiGet( "COMBO_OPETURNO_Gamoauthtoken") ;
            Combo_opeturno_Ddointernalname = httpContext.cgiGet( "COMBO_OPETURNO_Ddointernalname") ;
            Combo_opeturno_Titlecontrolalign = httpContext.cgiGet( "COMBO_OPETURNO_Titlecontrolalign") ;
            Combo_opeturno_Dropdownoptionstype = httpContext.cgiGet( "COMBO_OPETURNO_Dropdownoptionstype") ;
            Combo_opeturno_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Enabled")) ;
            Combo_opeturno_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Visible")) ;
            Combo_opeturno_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_OPETURNO_Titlecontrolidtoreplace") ;
            Combo_opeturno_Datalisttype = httpContext.cgiGet( "COMBO_OPETURNO_Datalisttype") ;
            Combo_opeturno_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Allowmultipleselection")) ;
            Combo_opeturno_Datalistfixedvalues = httpContext.cgiGet( "COMBO_OPETURNO_Datalistfixedvalues") ;
            Combo_opeturno_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Isgriditem")) ;
            Combo_opeturno_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Hasdescription")) ;
            Combo_opeturno_Datalistproc = httpContext.cgiGet( "COMBO_OPETURNO_Datalistproc") ;
            Combo_opeturno_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_OPETURNO_Datalistprocparametersprefix") ;
            Combo_opeturno_Remoteservicesparameters = httpContext.cgiGet( "COMBO_OPETURNO_Remoteservicesparameters") ;
            Combo_opeturno_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_OPETURNO_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_opeturno_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Includeonlyselectedoption")) ;
            Combo_opeturno_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Includeselectalloption")) ;
            Combo_opeturno_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Emptyitem")) ;
            Combo_opeturno_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPETURNO_Includeaddnewoption")) ;
            Combo_opeturno_Htmltemplate = httpContext.cgiGet( "COMBO_OPETURNO_Htmltemplate") ;
            Combo_opeturno_Multiplevaluestype = httpContext.cgiGet( "COMBO_OPETURNO_Multiplevaluestype") ;
            Combo_opeturno_Loadingdata = httpContext.cgiGet( "COMBO_OPETURNO_Loadingdata") ;
            Combo_opeturno_Noresultsfound = httpContext.cgiGet( "COMBO_OPETURNO_Noresultsfound") ;
            Combo_opeturno_Emptyitemtext = httpContext.cgiGet( "COMBO_OPETURNO_Emptyitemtext") ;
            Combo_opeturno_Onlyselectedvalues = httpContext.cgiGet( "COMBO_OPETURNO_Onlyselectedvalues") ;
            Combo_opeturno_Selectalltext = httpContext.cgiGet( "COMBO_OPETURNO_Selectalltext") ;
            Combo_opeturno_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_OPETURNO_Multiplevaluesseparator") ;
            Combo_opeturno_Addnewoptiontext = httpContext.cgiGet( "COMBO_OPETURNO_Addnewoptiontext") ;
            Combo_opesecc_Objectcall = httpContext.cgiGet( "COMBO_OPESECC_Objectcall") ;
            Combo_opesecc_Class = httpContext.cgiGet( "COMBO_OPESECC_Class") ;
            Combo_opesecc_Icontype = httpContext.cgiGet( "COMBO_OPESECC_Icontype") ;
            Combo_opesecc_Icon = httpContext.cgiGet( "COMBO_OPESECC_Icon") ;
            Combo_opesecc_Caption = httpContext.cgiGet( "COMBO_OPESECC_Caption") ;
            Combo_opesecc_Tooltip = httpContext.cgiGet( "COMBO_OPESECC_Tooltip") ;
            Combo_opesecc_Cls = httpContext.cgiGet( "COMBO_OPESECC_Cls") ;
            Combo_opesecc_Selectedvalue_set = httpContext.cgiGet( "COMBO_OPESECC_Selectedvalue_set") ;
            Combo_opesecc_Selectedvalue_get = httpContext.cgiGet( "COMBO_OPESECC_Selectedvalue_get") ;
            Combo_opesecc_Selectedtext_set = httpContext.cgiGet( "COMBO_OPESECC_Selectedtext_set") ;
            Combo_opesecc_Selectedtext_get = httpContext.cgiGet( "COMBO_OPESECC_Selectedtext_get") ;
            Combo_opesecc_Gamoauthtoken = httpContext.cgiGet( "COMBO_OPESECC_Gamoauthtoken") ;
            Combo_opesecc_Ddointernalname = httpContext.cgiGet( "COMBO_OPESECC_Ddointernalname") ;
            Combo_opesecc_Titlecontrolalign = httpContext.cgiGet( "COMBO_OPESECC_Titlecontrolalign") ;
            Combo_opesecc_Dropdownoptionstype = httpContext.cgiGet( "COMBO_OPESECC_Dropdownoptionstype") ;
            Combo_opesecc_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Enabled")) ;
            Combo_opesecc_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Visible")) ;
            Combo_opesecc_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_OPESECC_Titlecontrolidtoreplace") ;
            Combo_opesecc_Datalisttype = httpContext.cgiGet( "COMBO_OPESECC_Datalisttype") ;
            Combo_opesecc_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Allowmultipleselection")) ;
            Combo_opesecc_Datalistfixedvalues = httpContext.cgiGet( "COMBO_OPESECC_Datalistfixedvalues") ;
            Combo_opesecc_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Isgriditem")) ;
            Combo_opesecc_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Hasdescription")) ;
            Combo_opesecc_Datalistproc = httpContext.cgiGet( "COMBO_OPESECC_Datalistproc") ;
            Combo_opesecc_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_OPESECC_Datalistprocparametersprefix") ;
            Combo_opesecc_Remoteservicesparameters = httpContext.cgiGet( "COMBO_OPESECC_Remoteservicesparameters") ;
            Combo_opesecc_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_OPESECC_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_opesecc_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Includeonlyselectedoption")) ;
            Combo_opesecc_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Includeselectalloption")) ;
            Combo_opesecc_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Emptyitem")) ;
            Combo_opesecc_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_OPESECC_Includeaddnewoption")) ;
            Combo_opesecc_Htmltemplate = httpContext.cgiGet( "COMBO_OPESECC_Htmltemplate") ;
            Combo_opesecc_Multiplevaluestype = httpContext.cgiGet( "COMBO_OPESECC_Multiplevaluestype") ;
            Combo_opesecc_Loadingdata = httpContext.cgiGet( "COMBO_OPESECC_Loadingdata") ;
            Combo_opesecc_Noresultsfound = httpContext.cgiGet( "COMBO_OPESECC_Noresultsfound") ;
            Combo_opesecc_Emptyitemtext = httpContext.cgiGet( "COMBO_OPESECC_Emptyitemtext") ;
            Combo_opesecc_Onlyselectedvalues = httpContext.cgiGet( "COMBO_OPESECC_Onlyselectedvalues") ;
            Combo_opesecc_Selectalltext = httpContext.cgiGet( "COMBO_OPESECC_Selectalltext") ;
            Combo_opesecc_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_OPESECC_Multiplevaluesseparator") ;
            Combo_opesecc_Addnewoptiontext = httpContext.cgiGet( "COMBO_OPESECC_Addnewoptiontext") ;
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
            Dvelop_confirmpanel_trn_delete_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Objectcall") ;
            Dvelop_confirmpanel_trn_delete_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Enabled")) ;
            Dvelop_confirmpanel_trn_delete_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Width") ;
            Dvelop_confirmpanel_trn_delete_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Height") ;
            Dvelop_confirmpanel_trn_delete_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Class") ;
            Dvelop_confirmpanel_trn_delete_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Title") ;
            Dvelop_confirmpanel_trn_delete_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Confirmationtext") ;
            Dvelop_confirmpanel_trn_delete_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Yesbuttoncaption") ;
            Dvelop_confirmpanel_trn_delete_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Nobuttoncaption") ;
            Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_trn_delete_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Yesbuttonposition") ;
            Dvelop_confirmpanel_trn_delete_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Confirmtype") ;
            Dvelop_confirmpanel_trn_delete_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Comment") ;
            Dvelop_confirmpanel_trn_delete_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Bodytype") ;
            Dvelop_confirmpanel_trn_delete_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Bodycontentinternalname") ;
            Dvelop_confirmpanel_trn_delete_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Result") ;
            Dvelop_confirmpanel_trn_delete_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Texttype") ;
            Dvelop_confirmpanel_trn_delete_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_TRN_DELETE_Visible")) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A652OpeCod = 0 ;
               n652OpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            }
            else
            {
               A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n652OpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            }
            A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
            n653OpeNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
            A6869OpeNom2 = httpContext.cgiGet( edtOpeNom2_Internalname) ;
            n6869OpeNom2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6869OpeNom2", A6869OpeNom2);
            cmbOpeAct.setValue( httpContext.cgiGet( cmbOpeAct.getInternalname()) );
            A8482OpeAct = httpContext.cgiGet( cmbOpeAct.getInternalname()) ;
            n8482OpeAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8482OpeAct", A8482OpeAct);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCedula_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCedula_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPECEDULA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOpeCedula_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6868OpeCedula = 0 ;
               n6868OpeCedula = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6868OpeCedula", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6868OpeCedula), 18, 0));
            }
            else
            {
               A6868OpeCedula = localUtil.ctol( httpContext.cgiGet( edtOpeCedula_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n6868OpeCedula = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6868OpeCedula", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6868OpeCedula), 18, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOpePreHor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOpePreHor_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPEPREHOR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOpePreHor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2505OpePreHor = DecimalUtil.ZERO ;
               n2505OpePreHor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2505OpePreHor", GXutil.ltrimstr( A2505OpePreHor, 12, 5));
            }
            else
            {
               A2505OpePreHor = localUtil.ctond( httpContext.cgiGet( edtOpePreHor_Internalname)) ;
               n2505OpePreHor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2505OpePreHor", GXutil.ltrimstr( A2505OpePreHor, 12, 5));
            }
            A14500OpeCargo = httpContext.cgiGet( edtOpeCargo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14500OpeCargo", A14500OpeCargo);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPETURNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOpeTurno_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6232OpeTurno = (byte)(0) ;
               n6232OpeTurno = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6232OpeTurno", GXutil.str( A6232OpeTurno, 1, 0));
            }
            else
            {
               A6232OpeTurno = (byte)(localUtil.ctol( httpContext.cgiGet( edtOpeTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6232OpeTurno = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6232OpeTurno", GXutil.str( A6232OpeTurno, 1, 0));
            }
            A8422OpeSecc = httpContext.cgiGet( edtOpeSecc_Internalname) ;
            n8422OpeSecc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
            A8640OpePass = httpContext.cgiGet( edtOpePass_Internalname) ;
            n8640OpePass = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8640OpePass", A8640OpePass);
            A9528OpeMSol = ((GXutil.strcmp(httpContext.cgiGet( chkOpeMSol.getInternalname()), "S")==0) ? "S" : "N") ;
            n9528OpeMSol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9528OpeMSol", A9528OpeMSol);
            A9529OpeMUsu = httpContext.cgiGet( edtOpeMUsu_Internalname) ;
            n9529OpeMUsu = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9529OpeMUsu", A9529OpeMUsu);
            AV54Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
            AV52ComboOpeTurno = (byte)(localUtil.ctol( httpContext.cgiGet( edtavComboopeturno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52ComboOpeTurno", GXutil.str( AV52ComboOpeTurno, 1, 0));
            AV49ComboOpeSecc = httpContext.cgiGet( edtavComboopesecc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49ComboOpeSecc", AV49ComboOpeSecc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TOPERAR");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A652OpeCod != Z652OpeCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("toperar:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               n652OpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
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
                  sMode75 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode75 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound75 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1P0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "OPECOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOpeCod_Internalname ;
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
                        e111P2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121P2 ();
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
         e121P2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1P75( ) ;
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
         disableAttributes1P75( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboopeturno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboopeturno_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboopesecc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboopesecc_Enabled), 5, 0), true);
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

   public void confirm_1P0( )
   {
      beforeValidate1P75( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P75( ) ;
         }
         else
         {
            checkExtendedTable1P75( ) ;
            closeExtendedTableCursors1P75( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1P0( )
   {
   }

   public void e111P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      toperar_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      toperar_impl.this.A396EmprCod = GXv_char2[0] ;
      toperar_impl.this.AV16EmprNom = GXv_char3[0] ;
      toperar_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV26msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMAD030_", ""), (byte)(99), GXv_char4) ;
      toperar_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26msg0", AV26msg0);
      GXv_int5[0] = AV27NoPreuOpe ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOPROP", ""), GXv_int5) ;
      toperar_impl.this.AV27NoPreuOpe = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27NoPreuOpe", GXutil.str( AV27NoPreuOpe, 1, 0));
      GXt_int6 = AV40UsOpePass ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LECPAS", ""), GXv_int5) ;
      toperar_impl.this.GXt_int6 = GXv_int5[0] ;
      AV40UsOpePass = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40UsOpePass", GXutil.str( AV40UsOpePass, 1, 0));
      GXv_int5[0] = AV30Suprema ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SUPREM", ""), GXv_int5) ;
      toperar_impl.this.AV30Suprema = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Suprema", GXutil.str( AV30Suprema, 1, 0));
      GXv_int5[0] = AV31Lindalana ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LINDAL", ""), GXv_int5) ;
      toperar_impl.this.AV31Lindalana = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lindalana", GXutil.str( AV31Lindalana, 1, 0));
      GXv_int5[0] = AV33Eliot ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int5) ;
      toperar_impl.this.AV33Eliot = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Eliot", GXutil.str( AV33Eliot, 1, 0));
      GXv_int5[0] = AV32FlagTintu ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int5) ;
      toperar_impl.this.AV32FlagTintu = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FlagTintu", GXutil.str( AV32FlagTintu, 1, 0));
      GXt_int6 = AV41Mnt ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MNT", ""), GXv_int5) ;
      toperar_impl.this.GXt_int6 = GXv_int5[0] ;
      AV41Mnt = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Mnt", GXutil.str( AV41Mnt, 1, 0));
      GXt_int6 = (byte)(AV50autonumber) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int5) ;
      toperar_impl.this.GXt_int6 = GXv_int5[0] ;
      AV50autonumber = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50autonumber), 4, 0));
      AV40UsOpePass = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40UsOpePass", GXutil.str( AV40UsOpePass, 1, 0));
      if ( AV40UsOpePass == 0 )
      {
         edtOpePass_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpePass_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpePass_Visible), 5, 0), true);
      }
      if ( AV27NoPreuOpe == 1 )
      {
         edtOpePreHor_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpePreHor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpePreHor_Visible), 5, 0), true);
      }
      if ( ( AV30Suprema == 1 ) || ( AV31Lindalana == 1 ) || ( AV33Eliot == 1 ) )
      {
         edtOpeCedula_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeCedula_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCedula_Visible), 5, 0), true);
      }
      else
      {
         edtOpeCedula_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeCedula_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCedula_Visible), 5, 0), true);
      }
      chkOpeMSol.setVisible( AV41Mnt );
      httpContext.ajax_rsp_assign_prop("", false, chkOpeMSol.getInternalname(), "Visible", GXutil.ltrimstr( chkOpeMSol.getVisible(), 5, 0), true);
      edtOpeMUsu_Visible = AV41Mnt ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeMUsu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeMUsu_Visible), 5, 0), true);
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      toperar_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV42EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      toperar_impl.this.AV42EmprCod = GXv_char4[0] ;
      toperar_impl.this.AV16EmprNom = GXv_char3[0] ;
      toperar_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV44WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV44WWPContext = GXv_SdtWWPContext7[0] ;
      edtOpeSecc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeSecc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeSecc_Visible), 5, 0), true);
      AV49ComboOpeSecc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ComboOpeSecc", AV49ComboOpeSecc);
      edtavComboopesecc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboopesecc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboopesecc_Visible), 5, 0), true);
      edtOpeTurno_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeTurno_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeTurno_Visible), 5, 0), true);
      AV52ComboOpeTurno = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52ComboOpeTurno", GXutil.str( AV52ComboOpeTurno, 1, 0));
      edtavComboopeturno_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboopeturno_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboopeturno_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOOPETURNO' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOOPESECC' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV45TrnContext.fromxml(AV46WebSession.getValue("TrnContext"), null, null);
   }

   public void e121P2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV45TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.toperarww", new String[] {}, new String[] {}) );
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

   public void S132( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divOpepass_cell_Class = "col-xs-12 col-sm-3 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divOpepass_cell_Internalname, "Class", divOpepass_cell_Class, true);
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12 col-lg-6 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
   }

   public void S122( )
   {
      /* 'LOADCOMBOOPESECC' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV47OpeSecc_Data ;
      GXv_char4[0] = AV48ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.toperarloaddvcombo(remoteHandle, context).execute( "OpeSecc", Gx_mode, AV42EmprCod, AV43OpeCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      toperar_impl.this.AV48ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV47OpeSecc_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_opesecc_Selectedvalue_set = AV48ComboSelectedValue ;
      ucCombo_opesecc.sendProperty(context, "", false, Combo_opesecc_Internalname, "SelectedValue_set", Combo_opesecc_Selectedvalue_set);
      AV49ComboOpeSecc = AV48ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ComboOpeSecc", AV49ComboOpeSecc);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_opesecc_Enabled = false ;
         ucCombo_opesecc.sendProperty(context, "", false, Combo_opesecc_Internalname, "Enabled", GXutil.booltostr( Combo_opesecc_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOOPETURNO' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV51OpeTurno_Data ;
      GXv_char4[0] = AV48ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.toperarloaddvcombo(remoteHandle, context).execute( "OpeTurno", Gx_mode, AV42EmprCod, AV43OpeCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      toperar_impl.this.AV48ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV51OpeTurno_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_opeturno_Selectedvalue_set = AV48ComboSelectedValue ;
      ucCombo_opeturno.sendProperty(context, "", false, Combo_opeturno_Internalname, "SelectedValue_set", Combo_opeturno_Selectedvalue_set);
      AV52ComboOpeTurno = (byte)(GXutil.lval( AV48ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52ComboOpeTurno", GXutil.str( AV52ComboOpeTurno, 1, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_opeturno_Enabled = false ;
         ucCombo_opeturno.sendProperty(context, "", false, Combo_opeturno_Internalname, "Enabled", GXutil.booltostr( Combo_opeturno_Enabled));
      }
   }

   public void zm1P75( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6232OpeTurno = T001P3_A6232OpeTurno[0] ;
            Z8422OpeSecc = T001P3_A8422OpeSecc[0] ;
            Z9529OpeMUsu = T001P3_A9529OpeMUsu[0] ;
            Z653OpeNom = T001P3_A653OpeNom[0] ;
            Z6869OpeNom2 = T001P3_A6869OpeNom2[0] ;
            Z2505OpePreHor = T001P3_A2505OpePreHor[0] ;
            Z6868OpeCedula = T001P3_A6868OpeCedula[0] ;
            Z8482OpeAct = T001P3_A8482OpeAct[0] ;
            Z8640OpePass = T001P3_A8640OpePass[0] ;
            Z9528OpeMSol = T001P3_A9528OpeMSol[0] ;
            Z14500OpeCargo = T001P3_A14500OpeCargo[0] ;
         }
         else
         {
            Z6232OpeTurno = A6232OpeTurno ;
            Z8422OpeSecc = A8422OpeSecc ;
            Z9529OpeMUsu = A9529OpeMUsu ;
            Z653OpeNom = A653OpeNom ;
            Z6869OpeNom2 = A6869OpeNom2 ;
            Z2505OpePreHor = A2505OpePreHor ;
            Z6868OpeCedula = A6868OpeCedula ;
            Z8482OpeAct = A8482OpeAct ;
            Z8640OpePass = A8640OpePass ;
            Z9528OpeMSol = A9528OpeMSol ;
            Z14500OpeCargo = A14500OpeCargo ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z652OpeCod = A652OpeCod ;
         Z6232OpeTurno = A6232OpeTurno ;
         Z8422OpeSecc = A8422OpeSecc ;
         Z9529OpeMUsu = A9529OpeMUsu ;
         Z653OpeNom = A653OpeNom ;
         Z6869OpeNom2 = A6869OpeNom2 ;
         Z2505OpePreHor = A2505OpePreHor ;
         Z6868OpeCedula = A6868OpeCedula ;
         Z8482OpeAct = A8482OpeAct ;
         Z8640OpePass = A8640OpePass ;
         Z9528OpeMSol = A9528OpeMSol ;
         Z14500OpeCargo = A14500OpeCargo ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV54Pgmname = "TOPERAR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Pgmname", AV54Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV42EmprCod)==0) )
      {
         A396EmprCod = AV42EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T001P4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T001P4_A407EmprNom[0] ;
      n407EmprNom = T001P4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LECPAS", ""), ""), GXv_int5) ;
      toperar_impl.this.GXt_int6 = GXv_int5[0] ;
      edtOpePass_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpePass_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpePass_Visible), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LECPAS", ""), ""), GXv_int5) ;
      toperar_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divOpepass_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divOpepass_cell_Internalname, "Class", divOpepass_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LECPAS", ""), ""), GXv_int5) ;
         toperar_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( GXt_int6 == 1 )
         {
            divOpepass_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-3 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divOpepass_cell_Internalname, "Class", divOpepass_cell_Class, true);
         }
      }
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNT", ""), ""), GXv_int5) ;
      toperar_impl.this.GXt_int6 = GXv_int5[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int5[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNT", ""), ""), GXv_int5) ;
         toperar_impl.this.GXt_int6 = GXv_int5[0] ;
         if ( GXt_int6 == 1 )
         {
            divDvpanel_unnamedtable1_cell_Class = httpContext.getMessage( "col-xs-12 col-lg-6 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
         }
      }
      if ( ! (0==AV43OpeCod) )
      {
         A652OpeCod = AV43OpeCod ;
         n652OpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      }
      if ( ! (0==AV43OpeCod) )
      {
         edtOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      }
      else
      {
         edtOpeCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV43OpeCod) )
      {
         edtOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      A6232OpeTurno = AV52ComboOpeTurno ;
      n6232OpeTurno = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6232OpeTurno", GXutil.str( A6232OpeTurno, 1, 0));
      A8422OpeSecc = AV49ComboOpeSecc ;
      n8422OpeSecc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
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
      if ( isIns( )  && (GXutil.strcmp("", A8482OpeAct)==0) && ( Gx_BScreen == 0 ) )
      {
         A8482OpeAct = httpContext.getMessage( httpContext.getMessage( "A", ""), "") ;
         n8482OpeAct = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8482OpeAct", A8482OpeAct);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1P75( )
   {
      /* Using cursor T001P5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound75 = (short)(1) ;
         A6232OpeTurno = T001P5_A6232OpeTurno[0] ;
         n6232OpeTurno = T001P5_n6232OpeTurno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6232OpeTurno", GXutil.str( A6232OpeTurno, 1, 0));
         A8422OpeSecc = T001P5_A8422OpeSecc[0] ;
         n8422OpeSecc = T001P5_n8422OpeSecc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
         A9529OpeMUsu = T001P5_A9529OpeMUsu[0] ;
         n9529OpeMUsu = T001P5_n9529OpeMUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9529OpeMUsu", A9529OpeMUsu);
         A653OpeNom = T001P5_A653OpeNom[0] ;
         n653OpeNom = T001P5_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A6869OpeNom2 = T001P5_A6869OpeNom2[0] ;
         n6869OpeNom2 = T001P5_n6869OpeNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6869OpeNom2", A6869OpeNom2);
         A407EmprNom = T001P5_A407EmprNom[0] ;
         n407EmprNom = T001P5_n407EmprNom[0] ;
         A2505OpePreHor = T001P5_A2505OpePreHor[0] ;
         n2505OpePreHor = T001P5_n2505OpePreHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2505OpePreHor", GXutil.ltrimstr( A2505OpePreHor, 12, 5));
         A6868OpeCedula = T001P5_A6868OpeCedula[0] ;
         n6868OpeCedula = T001P5_n6868OpeCedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6868OpeCedula", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6868OpeCedula), 18, 0));
         A8482OpeAct = T001P5_A8482OpeAct[0] ;
         n8482OpeAct = T001P5_n8482OpeAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8482OpeAct", A8482OpeAct);
         A8640OpePass = T001P5_A8640OpePass[0] ;
         n8640OpePass = T001P5_n8640OpePass[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8640OpePass", A8640OpePass);
         A9528OpeMSol = T001P5_A9528OpeMSol[0] ;
         n9528OpeMSol = T001P5_n9528OpeMSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9528OpeMSol", A9528OpeMSol);
         A14500OpeCargo = T001P5_A14500OpeCargo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14500OpeCargo", A14500OpeCargo);
         zm1P75( -22) ;
      }
      pr_default.close(3);
      onLoadActions1P75( ) ;
   }

   public void onLoadActions1P75( )
   {
      A13748OpeCNom = GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) + " - " + GXutil.trim( A653OpeNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13748OpeCNom", A13748OpeCNom);
      if ( GXutil.strcmp(A9528OpeMSol, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         A9529OpeMUsu = "" ;
         n9529OpeMUsu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9529OpeMUsu", A9529OpeMUsu);
      }
      if ( GXutil.strcmp(A9528OpeMSol, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtOpeMUsu_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeMUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeMUsu_Enabled), 5, 0), true);
      }
      else
      {
         edtOpeMUsu_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeMUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeMUsu_Enabled), 5, 0), true);
      }
   }

   public void checkExtendedTable1P75( )
   {
      nIsDirty_75 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_75 = (short)(1) ;
      A13748OpeCNom = GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) + " - " + GXutil.trim( A653OpeNom) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13748OpeCNom", A13748OpeCNom);
      if ( (0==A652OpeCod) && ( ( AV32FlagTintu == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(AV26msg0, 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A8482OpeAct, "A") == 0 ) || ( GXutil.strcmp(A8482OpeAct, "I") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "A/I", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "OPEACT");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbOpeAct.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A9528OpeMSol, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         nIsDirty_75 = (short)(1) ;
         A9529OpeMUsu = "" ;
         n9529OpeMUsu = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9529OpeMUsu", A9529OpeMUsu);
      }
      if ( GXutil.strcmp(A9528OpeMSol, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
      {
         edtOpeMUsu_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeMUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeMUsu_Enabled), 5, 0), true);
      }
      else
      {
         edtOpeMUsu_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOpeMUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeMUsu_Enabled), 5, 0), true);
      }
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A8422OpeSecc ;
         GXv_int5[0] = AV35Ok ;
         new app.peximaq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         toperar_impl.this.A396EmprCod = GXv_char4[0] ;
         toperar_impl.this.A8422OpeSecc = GXv_char3[0] ;
         toperar_impl.this.AV35Ok = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
         httpContext.ajax_rsp_assign_attri("", false, "AV35Ok", GXutil.str( AV35Ok, 1, 0));
      }
      if ( ( GXutil.strcmp(A8422OpeSecc, " ") != 0 ) && ( AV35Ok == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina-Seccion Inexistente", ""), 1, "OPESECC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeSecc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1P75( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1P75( )
   {
      /* Using cursor T001P6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound75 = (short)(1) ;
      }
      else
      {
         RcdFound75 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001P3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T001P3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P75( 22) ;
         RcdFound75 = (short)(1) ;
         A652OpeCod = T001P3_A652OpeCod[0] ;
         n652OpeCod = T001P3_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         A6232OpeTurno = T001P3_A6232OpeTurno[0] ;
         n6232OpeTurno = T001P3_n6232OpeTurno[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6232OpeTurno", GXutil.str( A6232OpeTurno, 1, 0));
         A8422OpeSecc = T001P3_A8422OpeSecc[0] ;
         n8422OpeSecc = T001P3_n8422OpeSecc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
         A9529OpeMUsu = T001P3_A9529OpeMUsu[0] ;
         n9529OpeMUsu = T001P3_n9529OpeMUsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9529OpeMUsu", A9529OpeMUsu);
         A653OpeNom = T001P3_A653OpeNom[0] ;
         n653OpeNom = T001P3_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A6869OpeNom2 = T001P3_A6869OpeNom2[0] ;
         n6869OpeNom2 = T001P3_n6869OpeNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6869OpeNom2", A6869OpeNom2);
         A2505OpePreHor = T001P3_A2505OpePreHor[0] ;
         n2505OpePreHor = T001P3_n2505OpePreHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2505OpePreHor", GXutil.ltrimstr( A2505OpePreHor, 12, 5));
         A6868OpeCedula = T001P3_A6868OpeCedula[0] ;
         n6868OpeCedula = T001P3_n6868OpeCedula[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6868OpeCedula", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6868OpeCedula), 18, 0));
         A8482OpeAct = T001P3_A8482OpeAct[0] ;
         n8482OpeAct = T001P3_n8482OpeAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8482OpeAct", A8482OpeAct);
         A8640OpePass = T001P3_A8640OpePass[0] ;
         n8640OpePass = T001P3_n8640OpePass[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8640OpePass", A8640OpePass);
         A9528OpeMSol = T001P3_A9528OpeMSol[0] ;
         n9528OpeMSol = T001P3_n9528OpeMSol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9528OpeMSol", A9528OpeMSol);
         A14500OpeCargo = T001P3_A14500OpeCargo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14500OpeCargo", A14500OpeCargo);
         Z396EmprCod = A396EmprCod ;
         Z652OpeCod = A652OpeCod ;
         sMode75 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P75( ) ;
         if ( AnyError == 1 )
         {
            RcdFound75 = (short)(0) ;
            initializeNonKey1P75( ) ;
         }
         Gx_mode = sMode75 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound75 = (short)(0) ;
         initializeNonKey1P75( ) ;
         sMode75 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode75 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1P75( ) ;
      if ( RcdFound75 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound75 = (short)(0) ;
      /* Using cursor T001P7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001P7_A652OpeCod[0] < A652OpeCod ) ) && ( GXutil.strcmp(T001P7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001P7_A652OpeCod[0] > A652OpeCod ) ) && ( GXutil.strcmp(T001P7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A652OpeCod = T001P7_A652OpeCod[0] ;
            n652OpeCod = T001P7_n652OpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            RcdFound75 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound75 = (short)(0) ;
      /* Using cursor T001P8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T001P8_A652OpeCod[0] > A652OpeCod ) ) && ( GXutil.strcmp(T001P8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T001P8_A652OpeCod[0] < A652OpeCod ) ) && ( GXutil.strcmp(T001P8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A652OpeCod = T001P8_A652OpeCod[0] ;
            n652OpeCod = T001P8_n652OpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
            RcdFound75 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1P75( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1P75( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound75 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A652OpeCod != Z652OpeCod ) )
            {
               A652OpeCod = Z652OpeCod ;
               n652OpeCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "OPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1P75( ) ;
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A652OpeCod != Z652OpeCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1P75( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "OPECOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1P75( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A652OpeCod != Z652OpeCod ) )
      {
         A652OpeCod = Z652OpeCod ;
         n652OpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1P75( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001P2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPERAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z6232OpeTurno != T001P2_A6232OpeTurno[0] ) || ( GXutil.strcmp(Z8422OpeSecc, T001P2_A8422OpeSecc[0]) != 0 ) || ( GXutil.strcmp(Z9529OpeMUsu, T001P2_A9529OpeMUsu[0]) != 0 ) || ( GXutil.strcmp(Z653OpeNom, T001P2_A653OpeNom[0]) != 0 ) || ( GXutil.strcmp(Z6869OpeNom2, T001P2_A6869OpeNom2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2505OpePreHor, T001P2_A2505OpePreHor[0]) != 0 ) || ( Z6868OpeCedula != T001P2_A6868OpeCedula[0] ) || ( GXutil.strcmp(Z8482OpeAct, T001P2_A8482OpeAct[0]) != 0 ) || ( GXutil.strcmp(Z8640OpePass, T001P2_A8640OpePass[0]) != 0 ) || ( GXutil.strcmp(Z9528OpeMSol, T001P2_A9528OpeMSol[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14500OpeCargo, T001P2_A14500OpeCargo[0]) != 0 ) )
         {
            if ( Z6232OpeTurno != T001P2_A6232OpeTurno[0] )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeTurno");
               GXutil.writeLogRaw("Old: ",Z6232OpeTurno);
               GXutil.writeLogRaw("Current: ",T001P2_A6232OpeTurno[0]);
            }
            if ( GXutil.strcmp(Z8422OpeSecc, T001P2_A8422OpeSecc[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeSecc");
               GXutil.writeLogRaw("Old: ",Z8422OpeSecc);
               GXutil.writeLogRaw("Current: ",T001P2_A8422OpeSecc[0]);
            }
            if ( GXutil.strcmp(Z9529OpeMUsu, T001P2_A9529OpeMUsu[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeMUsu");
               GXutil.writeLogRaw("Old: ",Z9529OpeMUsu);
               GXutil.writeLogRaw("Current: ",T001P2_A9529OpeMUsu[0]);
            }
            if ( GXutil.strcmp(Z653OpeNom, T001P2_A653OpeNom[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeNom");
               GXutil.writeLogRaw("Old: ",Z653OpeNom);
               GXutil.writeLogRaw("Current: ",T001P2_A653OpeNom[0]);
            }
            if ( GXutil.strcmp(Z6869OpeNom2, T001P2_A6869OpeNom2[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeNom2");
               GXutil.writeLogRaw("Old: ",Z6869OpeNom2);
               GXutil.writeLogRaw("Current: ",T001P2_A6869OpeNom2[0]);
            }
            if ( DecimalUtil.compareTo(Z2505OpePreHor, T001P2_A2505OpePreHor[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpePreHor");
               GXutil.writeLogRaw("Old: ",Z2505OpePreHor);
               GXutil.writeLogRaw("Current: ",T001P2_A2505OpePreHor[0]);
            }
            if ( Z6868OpeCedula != T001P2_A6868OpeCedula[0] )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeCedula");
               GXutil.writeLogRaw("Old: ",Z6868OpeCedula);
               GXutil.writeLogRaw("Current: ",T001P2_A6868OpeCedula[0]);
            }
            if ( GXutil.strcmp(Z8482OpeAct, T001P2_A8482OpeAct[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeAct");
               GXutil.writeLogRaw("Old: ",Z8482OpeAct);
               GXutil.writeLogRaw("Current: ",T001P2_A8482OpeAct[0]);
            }
            if ( GXutil.strcmp(Z8640OpePass, T001P2_A8640OpePass[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpePass");
               GXutil.writeLogRaw("Old: ",Z8640OpePass);
               GXutil.writeLogRaw("Current: ",T001P2_A8640OpePass[0]);
            }
            if ( GXutil.strcmp(Z9528OpeMSol, T001P2_A9528OpeMSol[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeMSol");
               GXutil.writeLogRaw("Old: ",Z9528OpeMSol);
               GXutil.writeLogRaw("Current: ",T001P2_A9528OpeMSol[0]);
            }
            if ( GXutil.strcmp(Z14500OpeCargo, T001P2_A14500OpeCargo[0]) != 0 )
            {
               GXutil.writeLogln("toperar:[seudo value changed for attri]"+"OpeCargo");
               GXutil.writeLogRaw("Old: ",Z14500OpeCargo);
               GXutil.writeLogRaw("Current: ",T001P2_A14500OpeCargo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOPERAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P75( )
   {
      beforeValidate1P75( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P75( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P75( 0) ;
         checkOptimisticConcurrency1P75( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P75( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P75( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001P9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), Boolean.valueOf(n6232OpeTurno), Byte.valueOf(A6232OpeTurno), Boolean.valueOf(n8422OpeSecc), A8422OpeSecc, Boolean.valueOf(n9529OpeMUsu), A9529OpeMUsu, Boolean.valueOf(n653OpeNom), A653OpeNom, Boolean.valueOf(n6869OpeNom2), A6869OpeNom2, Boolean.valueOf(n2505OpePreHor), A2505OpePreHor, Boolean.valueOf(n6868OpeCedula), Long.valueOf(A6868OpeCedula), Boolean.valueOf(n8482OpeAct), A8482OpeAct, Boolean.valueOf(n8640OpePass), A8640OpePass, Boolean.valueOf(n9528OpeMSol), A9528OpeMSol, A14500OpeCargo, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPERAR");
                  if ( (pr_default.getStatus(7) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int10[0] = A652OpeCod ;
                        GXv_char3[0] = httpContext.getMessage( "INS", "") ;
                        new app.pactgrup(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
                        toperar_impl.this.A396EmprCod = GXv_char4[0] ;
                        toperar_impl.this.A652OpeCod = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1P0( ) ;
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
            load1P75( ) ;
         }
         endLevel1P75( ) ;
      }
      closeExtendedTableCursors1P75( ) ;
   }

   public void update1P75( )
   {
      beforeValidate1P75( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P75( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P75( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P75( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P75( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001P10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n6232OpeTurno), Byte.valueOf(A6232OpeTurno), Boolean.valueOf(n8422OpeSecc), A8422OpeSecc, Boolean.valueOf(n9529OpeMUsu), A9529OpeMUsu, Boolean.valueOf(n653OpeNom), A653OpeNom, Boolean.valueOf(n6869OpeNom2), A6869OpeNom2, Boolean.valueOf(n2505OpePreHor), A2505OpePreHor, Boolean.valueOf(n6868OpeCedula), Long.valueOf(A6868OpeCedula), Boolean.valueOf(n8482OpeAct), A8482OpeAct, Boolean.valueOf(n8640OpePass), A8640OpePass, Boolean.valueOf(n9528OpeMSol), A9528OpeMSol, A14500OpeCargo, A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPERAR");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPERAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P75( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     if ( true /* After */ )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int10[0] = A652OpeCod ;
                        GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
                        new app.pactgrup(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
                        toperar_impl.this.A396EmprCod = GXv_char4[0] ;
                        toperar_impl.this.A652OpeCod = GXv_int10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
                     }
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
         endLevel1P75( ) ;
      }
      closeExtendedTableCursors1P75( ) ;
   }

   public void deferredUpdate1P75( )
   {
   }

   public void delete( )
   {
      beforeValidate1P75( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P75( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P75( ) ;
         afterConfirm1P75( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P75( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001P11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPERAR");
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
      sMode75 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1P75( ) ;
      Gx_mode = sMode75 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P75( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  || isUpd( )  )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A8422OpeSecc ;
            GXv_int5[0] = AV35Ok ;
            new app.peximaq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
            toperar_impl.this.A396EmprCod = GXv_char4[0] ;
            toperar_impl.this.A8422OpeSecc = GXv_char3[0] ;
            toperar_impl.this.AV35Ok = GXv_int5[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
            httpContext.ajax_rsp_assign_attri("", false, "AV35Ok", GXutil.str( AV35Ok, 1, 0));
         }
         A13748OpeCNom = GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) + " - " + GXutil.trim( A653OpeNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13748OpeCNom", A13748OpeCNom);
         if ( GXutil.strcmp(A9528OpeMSol, httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 )
         {
            edtOpeMUsu_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOpeMUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeMUsu_Enabled), 5, 0), true);
         }
         else
         {
            edtOpeMUsu_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOpeMUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeMUsu_Enabled), 5, 0), true);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001P12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Embellishment Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T001P13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST Print Durability", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T001P14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONTRASTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T001P15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEST DE APARIENCIA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T001P16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Jornadas de Operarios", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T001P17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Incidencias Produccion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T001P18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "POSBOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T001P19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Responsables", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T001P20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T001P21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T001P22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T001P23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T001P24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TPH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T001P25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TR0300", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T001P26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T001P27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACAB1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T001P28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T001P29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPE1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T001P30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T001P31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MO de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T001P32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T001P33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HDRTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T001P34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "NOTREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T001P35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERCA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T001P36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T001P37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T001P38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTRASP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T001P39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSUBLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T001P40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLLU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T001P41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFRICC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T001P42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPILLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T001P43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CSOLCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T001P44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESDIM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T001P45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LGRUOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
      }
   }

   public void endLevel1P75( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1P75( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "toperar");
         if ( AnyError == 0 )
         {
            confirmValues1P0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "toperar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1P75( )
   {
      /* Scan By routine */
      /* Using cursor T001P46 */
      pr_default.execute(44, new Object[] {A396EmprCod});
      RcdFound75 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound75 = (short)(1) ;
         A652OpeCod = T001P46_A652OpeCod[0] ;
         n652OpeCod = T001P46_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P75( )
   {
      /* Scan next routine */
      pr_default.readNext(44);
      RcdFound75 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound75 = (short)(1) ;
         A652OpeCod = T001P46_A652OpeCod[0] ;
         n652OpeCod = T001P46_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      }
   }

   public void scanEnd1P75( )
   {
      pr_default.close(44);
   }

   public void afterConfirm1P75( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P75( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P75( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P75( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P75( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P75( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P75( )
   {
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtOpeNom2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom2_Enabled), 5, 0), true);
      cmbOpeAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOpeAct.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOpeAct.getEnabled(), 5, 0), true);
      edtOpeCedula_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCedula_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCedula_Enabled), 5, 0), true);
      edtOpePreHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpePreHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpePreHor_Enabled), 5, 0), true);
      edtOpeCargo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCargo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCargo_Enabled), 5, 0), true);
      edtOpeTurno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeTurno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeTurno_Enabled), 5, 0), true);
      edtOpeSecc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeSecc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeSecc_Enabled), 5, 0), true);
      edtOpePass_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpePass_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpePass_Enabled), 5, 0), true);
      chkOpeMSol.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkOpeMSol.getInternalname(), "Enabled", GXutil.ltrimstr( chkOpeMSol.getEnabled(), 5, 0), true);
      edtOpeMUsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeMUsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeMUsu_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboopeturno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboopeturno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboopeturno_Enabled), 5, 0), true);
      edtavComboopesecc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboopesecc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboopesecc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1P75( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1P0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.toperar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV43OpeCod,6,0))}, new String[] {"Gx_mode","EmprCod","OpeCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TOPERAR");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("toperar:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6232OpeTurno", GXutil.ltrim( localUtil.ntoc( Z6232OpeTurno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8422OpeSecc", GXutil.rtrim( Z8422OpeSecc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9529OpeMUsu", GXutil.rtrim( Z9529OpeMUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6869OpeNom2", GXutil.rtrim( Z6869OpeNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2505OpePreHor", GXutil.ltrim( localUtil.ntoc( Z2505OpePreHor, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6868OpeCedula", GXutil.ltrim( localUtil.ntoc( Z6868OpeCedula, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8482OpeAct", GXutil.rtrim( Z8482OpeAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8640OpePass", GXutil.rtrim( Z8640OpePass));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9528OpeMSol", GXutil.rtrim( Z9528OpeMSol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14500OpeCargo", GXutil.rtrim( Z14500OpeCargo));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N9529OpeMUsu", GXutil.rtrim( A9529OpeMUsu));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOPETURNO_DATA", AV51OpeTurno_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOPETURNO_DATA", AV51OpeTurno_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOPESECC_DATA", AV47OpeSecc_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOPESECC_DATA", AV47OpeSecc_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV45TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV45TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV45TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "OPECNOM", A13748OpeCNom);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV42EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV43OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43OpeCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGTINTU", GXutil.ltrim( localUtil.ntoc( AV32FlagTintu, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG0", GXutil.rtrim( AV26msg0));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.ltrim( localUtil.ntoc( AV35Ok, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPETURNO_Objectcall", GXutil.rtrim( Combo_opeturno_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPETURNO_Cls", GXutil.rtrim( Combo_opeturno_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPETURNO_Selectedvalue_set", GXutil.rtrim( Combo_opeturno_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPETURNO_Enabled", GXutil.booltostr( Combo_opeturno_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPETURNO_Emptyitemtext", GXutil.rtrim( Combo_opeturno_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPESECC_Objectcall", GXutil.rtrim( Combo_opesecc_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPESECC_Cls", GXutil.rtrim( Combo_opesecc_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPESECC_Selectedvalue_set", GXutil.rtrim( Combo_opesecc_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPESECC_Enabled", GXutil.booltostr( Combo_opesecc_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPESECC_Emptyitemtext", GXutil.rtrim( Combo_opesecc_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Enabled", GXutil.booltostr( Dvelop_confirmpanel_trn_delete_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Title", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_TRN_DELETE_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_trn_delete_Confirmtype));
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
      return formatLink("app.toperar", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV43OpeCod,6,0))}, new String[] {"Gx_mode","EmprCod","OpeCod"})  ;
   }

   public String getPgmname( )
   {
      return "TOPERAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO DE OPERARIOS", "") ;
   }

   public void initializeNonKey1P75( )
   {
      A6232OpeTurno = (byte)(0) ;
      n6232OpeTurno = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6232OpeTurno", GXutil.str( A6232OpeTurno, 1, 0));
      A8422OpeSecc = "" ;
      n8422OpeSecc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
      AV35Ok = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Ok", GXutil.str( AV35Ok, 1, 0));
      A9529OpeMUsu = "" ;
      n9529OpeMUsu = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9529OpeMUsu", A9529OpeMUsu);
      A13748OpeCNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13748OpeCNom", A13748OpeCNom);
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A6869OpeNom2 = "" ;
      n6869OpeNom2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6869OpeNom2", A6869OpeNom2);
      A2505OpePreHor = DecimalUtil.ZERO ;
      n2505OpePreHor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2505OpePreHor", GXutil.ltrimstr( A2505OpePreHor, 12, 5));
      A6868OpeCedula = 0 ;
      n6868OpeCedula = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6868OpeCedula", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6868OpeCedula), 18, 0));
      A8640OpePass = "" ;
      n8640OpePass = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8640OpePass", A8640OpePass);
      A9528OpeMSol = "" ;
      n9528OpeMSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9528OpeMSol", A9528OpeMSol);
      A14500OpeCargo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14500OpeCargo", A14500OpeCargo);
      A8482OpeAct = httpContext.getMessage( "A", "") ;
      n8482OpeAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8482OpeAct", A8482OpeAct);
      Z6232OpeTurno = (byte)(0) ;
      Z8422OpeSecc = "" ;
      Z9529OpeMUsu = "" ;
      Z653OpeNom = "" ;
      Z6869OpeNom2 = "" ;
      Z2505OpePreHor = DecimalUtil.ZERO ;
      Z6868OpeCedula = 0 ;
      Z8482OpeAct = "" ;
      Z8640OpePass = "" ;
      Z9528OpeMSol = "" ;
      Z14500OpeCargo = "" ;
   }

   public void initAll1P75( )
   {
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      initializeNonKey1P75( ) ;
   }

   public void standaloneModalInsert( )
   {
      A8482OpeAct = i8482OpeAct ;
      n8482OpeAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8482OpeAct", A8482OpeAct);
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211653215", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("toperar.js", "?20268211653215", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtOpeCod_Internalname = "OPECOD" ;
      edtOpeNom_Internalname = "OPENOM" ;
      edtOpeNom2_Internalname = "OPENOM2" ;
      cmbOpeAct.setInternalname( "OPEACT" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtOpeCedula_Internalname = "OPECEDULA" ;
      edtOpePreHor_Internalname = "OPEPREHOR" ;
      edtOpeCargo_Internalname = "OPECARGO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockopeturno_Internalname = "TEXTBLOCKOPETURNO" ;
      Combo_opeturno_Internalname = "COMBO_OPETURNO" ;
      edtOpeTurno_Internalname = "OPETURNO" ;
      divTablesplittedopeturno_Internalname = "TABLESPLITTEDOPETURNO" ;
      lblTextblockopesecc_Internalname = "TEXTBLOCKOPESECC" ;
      Combo_opesecc_Internalname = "COMBO_OPESECC" ;
      edtOpeSecc_Internalname = "OPESECC" ;
      divTablesplittedopesecc_Internalname = "TABLESPLITTEDOPESECC" ;
      edtOpePass_Internalname = "OPEPASS" ;
      divOpepass_cell_Internalname = "OPEPASS_CELL" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      chkOpeMSol.setInternalname( "OPEMSOL" );
      edtOpeMUsu_Internalname = "OPEMUSU" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = "DVPANEL_UNNAMEDTABLE1_CELL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboopeturno_Internalname = "vCOMBOOPETURNO" ;
      divSectionattribute_opeturno_Internalname = "SECTIONATTRIBUTE_OPETURNO" ;
      edtavComboopesecc_Internalname = "vCOMBOOPESECC" ;
      divSectionattribute_opesecc_Internalname = "SECTIONATTRIBUTE_OPESECC" ;
      Dvelop_confirmpanel_trn_delete_Internalname = "DVELOP_CONFIRMPANEL_TRN_DELETE" ;
      tblTabledvelop_confirmpanel_trn_delete_Internalname = "TABLEDVELOP_CONFIRMPANEL_TRN_DELETE" ;
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO DE OPERARIOS", "") );
      Dvelop_confirmpanel_trn_delete_Confirmtype = "1" ;
      Dvelop_confirmpanel_trn_delete_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_trn_delete_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_trn_delete_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_trn_delete_Confirmationtext = "¿Desea eliminar el Operario?" ;
      Dvelop_confirmpanel_trn_delete_Title = "" ;
      edtavComboopesecc_Jsonclick = "" ;
      edtavComboopesecc_Enabled = 0 ;
      edtavComboopesecc_Visible = 1 ;
      edtavComboopeturno_Jsonclick = "" ;
      edtavComboopeturno_Enabled = 0 ;
      edtavComboopeturno_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtOpeMUsu_Jsonclick = "" ;
      edtOpeMUsu_Enabled = 1 ;
      edtOpeMUsu_Visible = 1 ;
      chkOpeMSol.setEnabled( 1 );
      chkOpeMSol.setVisible( 1 );
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Mantenimiento", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12 col-lg-6" ;
      edtOpePass_Jsonclick = "" ;
      edtOpePass_Enabled = 1 ;
      edtOpePass_Visible = 1 ;
      divOpepass_cell_Class = "col-xs-12 col-sm-3" ;
      edtOpeSecc_Jsonclick = "" ;
      edtOpeSecc_Enabled = 1 ;
      edtOpeSecc_Visible = 1 ;
      Combo_opesecc_Emptyitemtext = "" ;
      Combo_opesecc_Cls = "ExtendedCombo AttributeFL" ;
      Combo_opesecc_Enabled = GXutil.toBoolean( -1) ;
      edtOpeTurno_Jsonclick = "" ;
      edtOpeTurno_Enabled = 1 ;
      edtOpeTurno_Visible = 1 ;
      Combo_opeturno_Emptyitemtext = "" ;
      Combo_opeturno_Cls = "ExtendedCombo AttributeFL" ;
      Combo_opeturno_Enabled = GXutil.toBoolean( -1) ;
      edtOpeCargo_Jsonclick = "" ;
      edtOpeCargo_Enabled = 1 ;
      edtOpePreHor_Jsonclick = "" ;
      edtOpePreHor_Enabled = 1 ;
      edtOpePreHor_Visible = 1 ;
      edtOpeCedula_Jsonclick = "" ;
      edtOpeCedula_Enabled = 1 ;
      edtOpeCedula_Visible = 1 ;
      cmbOpeAct.setJsonclick( "" );
      cmbOpeAct.setEnabled( 1 );
      edtOpeNom2_Jsonclick = "" ;
      edtOpeNom2_Enabled = 1 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Enabled = 1 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Enabled = 1 ;
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

   public void gxasa86401P75( String A396EmprCod )
   {
      GXt_int6 = (byte)(0) ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LECPAS", ""), ""), GXv_int5) ;
      toperar_impl.this.GXt_int6 = GXv_int5[0] ;
      edtOpePass_Visible = ((GXt_int6==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpePass_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpePass_Visible), 5, 0), true);
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

   public void xc_16_1P75( )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A652OpeCod ;
         GXv_char3[0] = httpContext.getMessage( "INS", "") ;
         new app.pactgrup(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A652OpeCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
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

   public void xc_17_1P75( )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A652OpeCod ;
         GXv_char3[0] = httpContext.getMessage( "UPD", "") ;
         new app.pactgrup(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A652OpeCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
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

   public void xc_19_1P75( String Gx_mode ,
                           String A396EmprCod ,
                           String A8422OpeSecc )
   {
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A8422OpeSecc ;
         GXv_int5[0] = AV35Ok ;
         new app.peximaq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         A396EmprCod = GXv_char4[0] ;
         A8422OpeSecc = GXv_char3[0] ;
         AV35Ok = GXv_int5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", A8422OpeSecc);
         httpContext.ajax_rsp_assign_attri("", false, "AV35Ok", GXutil.str( AV35Ok, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8422OpeSecc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35Ok, (byte)(1), (byte)(0), ".", "")))+"\"") ;
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
      cmbOpeAct.setName( "OPEACT" );
      cmbOpeAct.setWebtags( "" );
      cmbOpeAct.addItem("A", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbOpeAct.addItem("I", httpContext.getMessage( "Inactivo", ""), (short)(0));
      if ( cmbOpeAct.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A8482OpeAct)==0) )
         {
            A8482OpeAct = httpContext.getMessage( "A", "") ;
            n8482OpeAct = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8482OpeAct", A8482OpeAct);
         }
      }
      chkOpeMSol.setName( "OPEMSOL" );
      chkOpeMSol.setWebtags( "" );
      chkOpeMSol.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkOpeMSol.getInternalname(), "TitleCaption", chkOpeMSol.getCaption(), true);
      chkOpeMSol.setCheckedValue( "N" );
      A9528OpeMSol = ((GXutil.strcmp(GXutil.rtrim( A9528OpeMSol), "S")==0) ? "S" : "N") ;
      n9528OpeMSol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9528OpeMSol", A9528OpeMSol);
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

   public void valid_Opesecc( )
   {
      n8422OpeSecc = false ;
      if ( isIns( )  || isUpd( )  )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A8422OpeSecc ;
         GXv_int5[0] = AV35Ok ;
         new app.peximaq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
         toperar_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         toperar_impl.this.A8422OpeSecc = GXv_char3[0] ;
         A8422OpeSecc = this.A8422OpeSecc ;
         toperar_impl.this.AV35Ok = GXv_int5[0] ;
         AV35Ok = this.AV35Ok ;
      }
      if ( ( GXutil.strcmp(A8422OpeSecc, " ") != 0 ) && ( AV35Ok == 0 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina-Seccion Inexistente", ""), 1, "OPESECC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeSecc_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A8422OpeSecc", GXutil.rtrim( A8422OpeSecc));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Ok", GXutil.ltrim( localUtil.ntoc( AV35Ok, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV43OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV45TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV43OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e121P2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV45TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("VALID_OPENOM","{handler:'valid_Openom',iparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("VALID_OPENOM",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("VALID_OPEACT","{handler:'valid_Opeact',iparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("VALID_OPEACT",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("VALID_OPESECC","{handler:'valid_Opesecc',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8422OpeSecc',fld:'OPESECC',pic:''},{av:'AV35Ok',fld:'vOK',pic:'9'},{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("VALID_OPESECC",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8422OpeSecc',fld:'OPESECC',pic:''},{av:'AV35Ok',fld:'vOK',pic:'9'},{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("VALID_OPEMSOL","{handler:'valid_Opemsol',iparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("VALID_OPEMSOL",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("VALIDV_COMBOOPETURNO","{handler:'validv_Comboopeturno',iparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("VALIDV_COMBOOPETURNO",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
      setEventMetadata("VALIDV_COMBOOPESECC","{handler:'validv_Comboopesecc',iparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]");
      setEventMetadata("VALIDV_COMBOOPESECC",",oparms:[{av:'A9528OpeMSol',fld:'OPEMSOL',pic:''}]}");
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
      wcpOAV42EmprCod = "" ;
      Z396EmprCod = "" ;
      Z8422OpeSecc = "" ;
      Z9529OpeMUsu = "" ;
      Z653OpeNom = "" ;
      Z6869OpeNom2 = "" ;
      Z2505OpePreHor = DecimalUtil.ZERO ;
      Z8482OpeAct = "" ;
      Z8640OpePass = "" ;
      Z9528OpeMSol = "" ;
      Z14500OpeCargo = "" ;
      N9529OpeMUsu = "" ;
      Combo_opesecc_Selectedvalue_get = "" ;
      Combo_opeturno_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A8422OpeSecc = "" ;
      AV42EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A8482OpeAct = "" ;
      A9528OpeMSol = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A653OpeNom = "" ;
      A6869OpeNom2 = "" ;
      A2505OpePreHor = DecimalUtil.ZERO ;
      A14500OpeCargo = "" ;
      lblTextblockopeturno_Jsonclick = "" ;
      ucCombo_opeturno = new com.genexus.webpanels.GXUserControl();
      Combo_opeturno_Caption = "" ;
      AV51OpeTurno_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockopesecc_Jsonclick = "" ;
      ucCombo_opesecc = new com.genexus.webpanels.GXUserControl();
      Combo_opesecc_Caption = "" ;
      AV47OpeSecc_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A8640OpePass = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      A9529OpeMUsu = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV54Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV49ComboOpeSecc = "" ;
      ucDvelop_confirmpanel_trn_delete = new com.genexus.webpanels.GXUserControl();
      A13748OpeCNom = "" ;
      AV26msg0 = "" ;
      A407EmprNom = "" ;
      Combo_opeturno_Objectcall = "" ;
      Combo_opeturno_Class = "" ;
      Combo_opeturno_Icontype = "" ;
      Combo_opeturno_Icon = "" ;
      Combo_opeturno_Tooltip = "" ;
      Combo_opeturno_Selectedvalue_set = "" ;
      Combo_opeturno_Selectedtext_set = "" ;
      Combo_opeturno_Selectedtext_get = "" ;
      Combo_opeturno_Gamoauthtoken = "" ;
      Combo_opeturno_Ddointernalname = "" ;
      Combo_opeturno_Titlecontrolalign = "" ;
      Combo_opeturno_Dropdownoptionstype = "" ;
      Combo_opeturno_Titlecontrolidtoreplace = "" ;
      Combo_opeturno_Datalisttype = "" ;
      Combo_opeturno_Datalistfixedvalues = "" ;
      Combo_opeturno_Datalistproc = "" ;
      Combo_opeturno_Datalistprocparametersprefix = "" ;
      Combo_opeturno_Remoteservicesparameters = "" ;
      Combo_opeturno_Htmltemplate = "" ;
      Combo_opeturno_Multiplevaluestype = "" ;
      Combo_opeturno_Loadingdata = "" ;
      Combo_opeturno_Noresultsfound = "" ;
      Combo_opeturno_Onlyselectedvalues = "" ;
      Combo_opeturno_Selectalltext = "" ;
      Combo_opeturno_Multiplevaluesseparator = "" ;
      Combo_opeturno_Addnewoptiontext = "" ;
      Combo_opesecc_Objectcall = "" ;
      Combo_opesecc_Class = "" ;
      Combo_opesecc_Icontype = "" ;
      Combo_opesecc_Icon = "" ;
      Combo_opesecc_Tooltip = "" ;
      Combo_opesecc_Selectedvalue_set = "" ;
      Combo_opesecc_Selectedtext_set = "" ;
      Combo_opesecc_Selectedtext_get = "" ;
      Combo_opesecc_Gamoauthtoken = "" ;
      Combo_opesecc_Ddointernalname = "" ;
      Combo_opesecc_Titlecontrolalign = "" ;
      Combo_opesecc_Dropdownoptionstype = "" ;
      Combo_opesecc_Titlecontrolidtoreplace = "" ;
      Combo_opesecc_Datalisttype = "" ;
      Combo_opesecc_Datalistfixedvalues = "" ;
      Combo_opesecc_Datalistproc = "" ;
      Combo_opesecc_Datalistprocparametersprefix = "" ;
      Combo_opesecc_Remoteservicesparameters = "" ;
      Combo_opesecc_Htmltemplate = "" ;
      Combo_opesecc_Multiplevaluestype = "" ;
      Combo_opesecc_Loadingdata = "" ;
      Combo_opesecc_Noresultsfound = "" ;
      Combo_opesecc_Onlyselectedvalues = "" ;
      Combo_opesecc_Selectalltext = "" ;
      Combo_opesecc_Multiplevaluesseparator = "" ;
      Combo_opesecc_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Dvelop_confirmpanel_trn_delete_Objectcall = "" ;
      Dvelop_confirmpanel_trn_delete_Width = "" ;
      Dvelop_confirmpanel_trn_delete_Height = "" ;
      Dvelop_confirmpanel_trn_delete_Class = "" ;
      Dvelop_confirmpanel_trn_delete_Comment = "" ;
      Dvelop_confirmpanel_trn_delete_Bodytype = "" ;
      Dvelop_confirmpanel_trn_delete_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_trn_delete_Result = "" ;
      Dvelop_confirmpanel_trn_delete_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode75 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV44WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV46WebSession = httpContext.getWebSession();
      AV48ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T001P4_A407EmprNom = new String[] {""} ;
      T001P4_n407EmprNom = new boolean[] {false} ;
      T001P5_A652OpeCod = new int[1] ;
      T001P5_n652OpeCod = new boolean[] {false} ;
      T001P5_A6232OpeTurno = new byte[1] ;
      T001P5_n6232OpeTurno = new boolean[] {false} ;
      T001P5_A8422OpeSecc = new String[] {""} ;
      T001P5_n8422OpeSecc = new boolean[] {false} ;
      T001P5_A9529OpeMUsu = new String[] {""} ;
      T001P5_n9529OpeMUsu = new boolean[] {false} ;
      T001P5_A653OpeNom = new String[] {""} ;
      T001P5_n653OpeNom = new boolean[] {false} ;
      T001P5_A6869OpeNom2 = new String[] {""} ;
      T001P5_n6869OpeNom2 = new boolean[] {false} ;
      T001P5_A407EmprNom = new String[] {""} ;
      T001P5_n407EmprNom = new boolean[] {false} ;
      T001P5_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001P5_n2505OpePreHor = new boolean[] {false} ;
      T001P5_A6868OpeCedula = new long[1] ;
      T001P5_n6868OpeCedula = new boolean[] {false} ;
      T001P5_A8482OpeAct = new String[] {""} ;
      T001P5_n8482OpeAct = new boolean[] {false} ;
      T001P5_A8640OpePass = new String[] {""} ;
      T001P5_n8640OpePass = new boolean[] {false} ;
      T001P5_A9528OpeMSol = new String[] {""} ;
      T001P5_n9528OpeMSol = new boolean[] {false} ;
      T001P5_A14500OpeCargo = new String[] {""} ;
      T001P5_A396EmprCod = new String[] {""} ;
      T001P6_A396EmprCod = new String[] {""} ;
      T001P6_A652OpeCod = new int[1] ;
      T001P6_n652OpeCod = new boolean[] {false} ;
      T001P3_A652OpeCod = new int[1] ;
      T001P3_n652OpeCod = new boolean[] {false} ;
      T001P3_A6232OpeTurno = new byte[1] ;
      T001P3_n6232OpeTurno = new boolean[] {false} ;
      T001P3_A8422OpeSecc = new String[] {""} ;
      T001P3_n8422OpeSecc = new boolean[] {false} ;
      T001P3_A9529OpeMUsu = new String[] {""} ;
      T001P3_n9529OpeMUsu = new boolean[] {false} ;
      T001P3_A653OpeNom = new String[] {""} ;
      T001P3_n653OpeNom = new boolean[] {false} ;
      T001P3_A6869OpeNom2 = new String[] {""} ;
      T001P3_n6869OpeNom2 = new boolean[] {false} ;
      T001P3_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001P3_n2505OpePreHor = new boolean[] {false} ;
      T001P3_A6868OpeCedula = new long[1] ;
      T001P3_n6868OpeCedula = new boolean[] {false} ;
      T001P3_A8482OpeAct = new String[] {""} ;
      T001P3_n8482OpeAct = new boolean[] {false} ;
      T001P3_A8640OpePass = new String[] {""} ;
      T001P3_n8640OpePass = new boolean[] {false} ;
      T001P3_A9528OpeMSol = new String[] {""} ;
      T001P3_n9528OpeMSol = new boolean[] {false} ;
      T001P3_A14500OpeCargo = new String[] {""} ;
      T001P3_A396EmprCod = new String[] {""} ;
      T001P7_A396EmprCod = new String[] {""} ;
      T001P7_A652OpeCod = new int[1] ;
      T001P7_n652OpeCod = new boolean[] {false} ;
      T001P8_A396EmprCod = new String[] {""} ;
      T001P8_A652OpeCod = new int[1] ;
      T001P8_n652OpeCod = new boolean[] {false} ;
      T001P2_A652OpeCod = new int[1] ;
      T001P2_n652OpeCod = new boolean[] {false} ;
      T001P2_A6232OpeTurno = new byte[1] ;
      T001P2_n6232OpeTurno = new boolean[] {false} ;
      T001P2_A8422OpeSecc = new String[] {""} ;
      T001P2_n8422OpeSecc = new boolean[] {false} ;
      T001P2_A9529OpeMUsu = new String[] {""} ;
      T001P2_n9529OpeMUsu = new boolean[] {false} ;
      T001P2_A653OpeNom = new String[] {""} ;
      T001P2_n653OpeNom = new boolean[] {false} ;
      T001P2_A6869OpeNom2 = new String[] {""} ;
      T001P2_n6869OpeNom2 = new boolean[] {false} ;
      T001P2_A2505OpePreHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001P2_n2505OpePreHor = new boolean[] {false} ;
      T001P2_A6868OpeCedula = new long[1] ;
      T001P2_n6868OpeCedula = new boolean[] {false} ;
      T001P2_A8482OpeAct = new String[] {""} ;
      T001P2_n8482OpeAct = new boolean[] {false} ;
      T001P2_A8640OpePass = new String[] {""} ;
      T001P2_n8640OpePass = new boolean[] {false} ;
      T001P2_A9528OpeMSol = new String[] {""} ;
      T001P2_n9528OpeMSol = new boolean[] {false} ;
      T001P2_A14500OpeCargo = new String[] {""} ;
      T001P2_A396EmprCod = new String[] {""} ;
      T001P12_A396EmprCod = new String[] {""} ;
      T001P12_A11917Ebd_numero = new int[1] ;
      T001P13_A396EmprCod = new String[] {""} ;
      T001P13_A11898Prd_numero = new int[1] ;
      T001P14_A396EmprCod = new String[] {""} ;
      T001P14_A11849Cte_numero = new int[1] ;
      T001P15_A396EmprCod = new String[] {""} ;
      T001P15_A11791Ap_numero = new int[1] ;
      T001P16_A396EmprCod = new String[] {""} ;
      T001P16_A3710JorFecha = new java.util.Date[] {GXutil.nullDate()} ;
      T001P16_A652OpeCod = new int[1] ;
      T001P16_n652OpeCod = new boolean[] {false} ;
      T001P17_A396EmprCod = new String[] {""} ;
      T001P17_A5294InPTime = new java.util.Date[] {GXutil.nullDate()} ;
      T001P17_A652OpeCod = new int[1] ;
      T001P17_n652OpeCod = new boolean[] {false} ;
      T001P18_A396EmprCod = new String[] {""} ;
      T001P18_A5994PosBotCod = new short[1] ;
      T001P18_A2855CodBota = new int[1] ;
      T001P19_A396EmprCod = new String[] {""} ;
      T001P19_A9429PMCod = new int[1] ;
      T001P19_A9481PMOpeRes = new int[1] ;
      T001P20_A396EmprCod = new String[] {""} ;
      T001P20_A602MaqCod = new String[] {""} ;
      T001P20_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001P20_A561HisProLin = new int[1] ;
      T001P20_A10501Peh_cod = new String[] {""} ;
      T001P20_A10503Peh_lin = new int[1] ;
      T001P21_A396EmprCod = new String[] {""} ;
      T001P21_A602MaqCod = new String[] {""} ;
      T001P21_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001P21_A561HisProLin = new int[1] ;
      T001P21_A10495Emh_cod = new String[] {""} ;
      T001P21_A10497Emh_lin = new int[1] ;
      T001P22_A396EmprCod = new String[] {""} ;
      T001P22_A602MaqCod = new String[] {""} ;
      T001P22_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001P22_A561HisProLin = new int[1] ;
      T001P22_A10487Cah_cod = new String[] {""} ;
      T001P22_A10489Cah_lin = new int[1] ;
      T001P23_A396EmprCod = new String[] {""} ;
      T001P23_A602MaqCod = new String[] {""} ;
      T001P23_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001P23_A561HisProLin = new int[1] ;
      T001P23_A10486Abh_cod = new String[] {""} ;
      T001P23_A10481Abh_lin = new int[1] ;
      T001P24_A396EmprCod = new String[] {""} ;
      T001P24_A10364Ph_numero = new int[1] ;
      T001P25_A396EmprCod = new String[] {""} ;
      T001P25_A652OpeCod = new int[1] ;
      T001P25_n652OpeCod = new boolean[] {false} ;
      T001P25_A10278Act_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T001P26_A396EmprCod = new String[] {""} ;
      T001P26_A129BarCod = new int[1] ;
      T001P26_A132BarCodReo = new byte[1] ;
      T001P26_A130BarCodPar = new String[] {""} ;
      T001P26_A758ProCod = new String[] {""} ;
      T001P26_A194BarOrdLin = new short[1] ;
      T001P26_A9966Em_cod = new String[] {""} ;
      T001P26_A9977Em_lin = new int[1] ;
      T001P27_A396EmprCod = new String[] {""} ;
      T001P27_A129BarCod = new int[1] ;
      T001P27_A132BarCodReo = new byte[1] ;
      T001P27_A130BarCodPar = new String[] {""} ;
      T001P27_A758ProCod = new String[] {""} ;
      T001P27_A194BarOrdLin = new short[1] ;
      T001P27_A9940Ab_cod = new String[] {""} ;
      T001P27_A9961Ab_lin = new int[1] ;
      T001P28_A396EmprCod = new String[] {""} ;
      T001P28_A129BarCod = new int[1] ;
      T001P28_A132BarCodReo = new byte[1] ;
      T001P28_A130BarCodPar = new String[] {""} ;
      T001P28_A758ProCod = new String[] {""} ;
      T001P28_A194BarOrdLin = new short[1] ;
      T001P28_A9911Ca_cod = new String[] {""} ;
      T001P28_A9924Ca_lin = new int[1] ;
      T001P29_A396EmprCod = new String[] {""} ;
      T001P29_A129BarCod = new int[1] ;
      T001P29_A132BarCodReo = new byte[1] ;
      T001P29_A130BarCodPar = new String[] {""} ;
      T001P29_A758ProCod = new String[] {""} ;
      T001P29_A194BarOrdLin = new short[1] ;
      T001P29_A9878Pe_cod = new String[] {""} ;
      T001P29_A9906Pe_lin = new int[1] ;
      T001P30_A396EmprCod = new String[] {""} ;
      T001P30_A129BarCod = new int[1] ;
      T001P30_A132BarCodReo = new byte[1] ;
      T001P30_A130BarCodPar = new String[] {""} ;
      T001P30_A758ProCod = new String[] {""} ;
      T001P30_A194BarOrdLin = new short[1] ;
      T001P30_A9870Rm_cod = new String[] {""} ;
      T001P30_A9886Rm_lin = new int[1] ;
      T001P31_A396EmprCod = new String[] {""} ;
      T001P31_A9425OMCod = new int[1] ;
      T001P31_A9455OMOpeCod = new int[1] ;
      T001P31_A9458OMMTpo = new String[] {""} ;
      T001P32_A396EmprCod = new String[] {""} ;
      T001P32_A9425OMCod = new int[1] ;
      T001P33_A396EmprCod = new String[] {""} ;
      T001P33_A8059Rev_Hd = new int[1] ;
      T001P33_A8060Rev_Hdr = new byte[1] ;
      T001P33_A8061Rev_Hdp = new String[] {""} ;
      T001P33_A8063Rev_Ln = new short[1] ;
      T001P34_A396EmprCod = new String[] {""} ;
      T001P34_A5198Nr_codigo = new int[1] ;
      T001P35_A396EmprCod = new String[] {""} ;
      T001P35_A4744RecPreCod = new int[1] ;
      T001P35_A4754RecPreLCa = new int[1] ;
      T001P36_A396EmprCod = new String[] {""} ;
      T001P36_A4618EnsLCod = new int[1] ;
      T001P37_A396EmprCod = new String[] {""} ;
      T001P37_A129BarCod = new int[1] ;
      T001P37_A132BarCodReo = new byte[1] ;
      T001P37_A130BarCodPar = new String[] {""} ;
      T001P37_A200BarPieCod = new String[] {""} ;
      T001P37_A3858BarTroCod = new short[1] ;
      T001P38_A396EmprCod = new String[] {""} ;
      T001P38_A3253SolTraCod = new int[1] ;
      T001P39_A396EmprCod = new String[] {""} ;
      T001P39_A3235SolSubCod = new int[1] ;
      T001P40_A396EmprCod = new String[] {""} ;
      T001P40_A3218SolLuzCod = new int[1] ;
      T001P41_A396EmprCod = new String[] {""} ;
      T001P41_A3196SolFriCod = new int[1] ;
      T001P42_A396EmprCod = new String[] {""} ;
      T001P42_A3165SolPilCod = new int[1] ;
      T001P43_A396EmprCod = new String[] {""} ;
      T001P43_A1348SolColCod = new int[1] ;
      T001P44_A396EmprCod = new String[] {""} ;
      T001P44_A1333EstDimCod = new int[1] ;
      T001P45_A396EmprCod = new String[] {""} ;
      T001P45_A503GruOpeCod = new int[1] ;
      T001P45_A652OpeCod = new int[1] ;
      T001P45_n652OpeCod = new boolean[] {false} ;
      T001P46_A396EmprCod = new String[] {""} ;
      T001P46_A652OpeCod = new int[1] ;
      T001P46_n652OpeCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i8482OpeAct = "" ;
      GXv_int10 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.toperar__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.toperar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.toperar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.toperar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.toperar__default(),
         new Object[] {
             new Object[] {
            T001P2_A652OpeCod, T001P2_A6232OpeTurno, T001P2_n6232OpeTurno, T001P2_A8422OpeSecc, T001P2_n8422OpeSecc, T001P2_A9529OpeMUsu, T001P2_n9529OpeMUsu, T001P2_A653OpeNom, T001P2_n653OpeNom, T001P2_A6869OpeNom2,
            T001P2_n6869OpeNom2, T001P2_A2505OpePreHor, T001P2_n2505OpePreHor, T001P2_A6868OpeCedula, T001P2_n6868OpeCedula, T001P2_A8482OpeAct, T001P2_n8482OpeAct, T001P2_A8640OpePass, T001P2_n8640OpePass, T001P2_A9528OpeMSol,
            T001P2_n9528OpeMSol, T001P2_A14500OpeCargo, T001P2_A396EmprCod
            }
            , new Object[] {
            T001P3_A652OpeCod, T001P3_A6232OpeTurno, T001P3_n6232OpeTurno, T001P3_A8422OpeSecc, T001P3_n8422OpeSecc, T001P3_A9529OpeMUsu, T001P3_n9529OpeMUsu, T001P3_A653OpeNom, T001P3_n653OpeNom, T001P3_A6869OpeNom2,
            T001P3_n6869OpeNom2, T001P3_A2505OpePreHor, T001P3_n2505OpePreHor, T001P3_A6868OpeCedula, T001P3_n6868OpeCedula, T001P3_A8482OpeAct, T001P3_n8482OpeAct, T001P3_A8640OpePass, T001P3_n8640OpePass, T001P3_A9528OpeMSol,
            T001P3_n9528OpeMSol, T001P3_A14500OpeCargo, T001P3_A396EmprCod
            }
            , new Object[] {
            T001P4_A407EmprNom, T001P4_n407EmprNom
            }
            , new Object[] {
            T001P5_A652OpeCod, T001P5_A6232OpeTurno, T001P5_n6232OpeTurno, T001P5_A8422OpeSecc, T001P5_n8422OpeSecc, T001P5_A9529OpeMUsu, T001P5_n9529OpeMUsu, T001P5_A653OpeNom, T001P5_n653OpeNom, T001P5_A6869OpeNom2,
            T001P5_n6869OpeNom2, T001P5_A407EmprNom, T001P5_n407EmprNom, T001P5_A2505OpePreHor, T001P5_n2505OpePreHor, T001P5_A6868OpeCedula, T001P5_n6868OpeCedula, T001P5_A8482OpeAct, T001P5_n8482OpeAct, T001P5_A8640OpePass,
            T001P5_n8640OpePass, T001P5_A9528OpeMSol, T001P5_n9528OpeMSol, T001P5_A14500OpeCargo, T001P5_A396EmprCod
            }
            , new Object[] {
            T001P6_A396EmprCod, T001P6_A652OpeCod
            }
            , new Object[] {
            T001P7_A396EmprCod, T001P7_A652OpeCod
            }
            , new Object[] {
            T001P8_A396EmprCod, T001P8_A652OpeCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001P12_A396EmprCod, T001P12_A11917Ebd_numero
            }
            , new Object[] {
            T001P13_A396EmprCod, T001P13_A11898Prd_numero
            }
            , new Object[] {
            T001P14_A396EmprCod, T001P14_A11849Cte_numero
            }
            , new Object[] {
            T001P15_A396EmprCod, T001P15_A11791Ap_numero
            }
            , new Object[] {
            T001P16_A396EmprCod, T001P16_A3710JorFecha, T001P16_A652OpeCod
            }
            , new Object[] {
            T001P17_A396EmprCod, T001P17_A5294InPTime, T001P17_A652OpeCod
            }
            , new Object[] {
            T001P18_A396EmprCod, T001P18_A5994PosBotCod, T001P18_A2855CodBota
            }
            , new Object[] {
            T001P19_A396EmprCod, T001P19_A9429PMCod, T001P19_A9481PMOpeRes
            }
            , new Object[] {
            T001P20_A396EmprCod, T001P20_A602MaqCod, T001P20_A558HisProFec, T001P20_A561HisProLin, T001P20_A10501Peh_cod, T001P20_A10503Peh_lin
            }
            , new Object[] {
            T001P21_A396EmprCod, T001P21_A602MaqCod, T001P21_A558HisProFec, T001P21_A561HisProLin, T001P21_A10495Emh_cod, T001P21_A10497Emh_lin
            }
            , new Object[] {
            T001P22_A396EmprCod, T001P22_A602MaqCod, T001P22_A558HisProFec, T001P22_A561HisProLin, T001P22_A10487Cah_cod, T001P22_A10489Cah_lin
            }
            , new Object[] {
            T001P23_A396EmprCod, T001P23_A602MaqCod, T001P23_A558HisProFec, T001P23_A561HisProLin, T001P23_A10486Abh_cod, T001P23_A10481Abh_lin
            }
            , new Object[] {
            T001P24_A396EmprCod, T001P24_A10364Ph_numero
            }
            , new Object[] {
            T001P25_A396EmprCod, T001P25_A652OpeCod, T001P25_A10278Act_dia
            }
            , new Object[] {
            T001P26_A396EmprCod, T001P26_A129BarCod, T001P26_A132BarCodReo, T001P26_A130BarCodPar, T001P26_A758ProCod, T001P26_A194BarOrdLin, T001P26_A9966Em_cod, T001P26_A9977Em_lin
            }
            , new Object[] {
            T001P27_A396EmprCod, T001P27_A129BarCod, T001P27_A132BarCodReo, T001P27_A130BarCodPar, T001P27_A758ProCod, T001P27_A194BarOrdLin, T001P27_A9940Ab_cod, T001P27_A9961Ab_lin
            }
            , new Object[] {
            T001P28_A396EmprCod, T001P28_A129BarCod, T001P28_A132BarCodReo, T001P28_A130BarCodPar, T001P28_A758ProCod, T001P28_A194BarOrdLin, T001P28_A9911Ca_cod, T001P28_A9924Ca_lin
            }
            , new Object[] {
            T001P29_A396EmprCod, T001P29_A129BarCod, T001P29_A132BarCodReo, T001P29_A130BarCodPar, T001P29_A758ProCod, T001P29_A194BarOrdLin, T001P29_A9878Pe_cod, T001P29_A9906Pe_lin
            }
            , new Object[] {
            T001P30_A396EmprCod, T001P30_A129BarCod, T001P30_A132BarCodReo, T001P30_A130BarCodPar, T001P30_A758ProCod, T001P30_A194BarOrdLin, T001P30_A9870Rm_cod, T001P30_A9886Rm_lin
            }
            , new Object[] {
            T001P31_A396EmprCod, T001P31_A9425OMCod, T001P31_A9455OMOpeCod, T001P31_A9458OMMTpo
            }
            , new Object[] {
            T001P32_A396EmprCod, T001P32_A9425OMCod
            }
            , new Object[] {
            T001P33_A396EmprCod, T001P33_A8059Rev_Hd, T001P33_A8060Rev_Hdr, T001P33_A8061Rev_Hdp, T001P33_A8063Rev_Ln
            }
            , new Object[] {
            T001P34_A396EmprCod, T001P34_A5198Nr_codigo
            }
            , new Object[] {
            T001P35_A396EmprCod, T001P35_A4744RecPreCod, T001P35_A4754RecPreLCa
            }
            , new Object[] {
            T001P36_A396EmprCod, T001P36_A4618EnsLCod
            }
            , new Object[] {
            T001P37_A396EmprCod, T001P37_A129BarCod, T001P37_A132BarCodReo, T001P37_A130BarCodPar, T001P37_A200BarPieCod, T001P37_A3858BarTroCod
            }
            , new Object[] {
            T001P38_A396EmprCod, T001P38_A3253SolTraCod
            }
            , new Object[] {
            T001P39_A396EmprCod, T001P39_A3235SolSubCod
            }
            , new Object[] {
            T001P40_A396EmprCod, T001P40_A3218SolLuzCod
            }
            , new Object[] {
            T001P41_A396EmprCod, T001P41_A3196SolFriCod
            }
            , new Object[] {
            T001P42_A396EmprCod, T001P42_A3165SolPilCod
            }
            , new Object[] {
            T001P43_A396EmprCod, T001P43_A1348SolColCod
            }
            , new Object[] {
            T001P44_A396EmprCod, T001P44_A1333EstDimCod
            }
            , new Object[] {
            T001P45_A396EmprCod, T001P45_A503GruOpeCod, T001P45_A652OpeCod
            }
            , new Object[] {
            T001P46_A396EmprCod, T001P46_A652OpeCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV54Pgmname = "TOPERAR" ;
      Z8482OpeAct = httpContext.getMessage( "A", "") ;
      n8482OpeAct = false ;
      A8482OpeAct = httpContext.getMessage( "A", "") ;
      n8482OpeAct = false ;
      i8482OpeAct = httpContext.getMessage( "A", "") ;
      n8482OpeAct = false ;
   }

   private byte Z6232OpeTurno ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6232OpeTurno ;
   private byte AV52ComboOpeTurno ;
   private byte Gx_BScreen ;
   private byte AV32FlagTintu ;
   private byte AV35Ok ;
   private byte AV27NoPreuOpe ;
   private byte AV40UsOpePass ;
   private byte AV30Suprema ;
   private byte AV31Lindalana ;
   private byte AV33Eliot ;
   private byte AV41Mnt ;
   private byte gxajaxcallmode ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte ZV35Ok ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound75 ;
   private short AV50autonumber ;
   private short nIsDirty_75 ;
   private int wcpOAV43OpeCod ;
   private int Z652OpeCod ;
   private int AV43OpeCod ;
   private int trnEnded ;
   private int A652OpeCod ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int edtOpeNom2_Enabled ;
   private int edtOpeCedula_Visible ;
   private int edtOpeCedula_Enabled ;
   private int edtOpePreHor_Visible ;
   private int edtOpePreHor_Enabled ;
   private int edtOpeCargo_Enabled ;
   private int edtOpeTurno_Enabled ;
   private int edtOpeTurno_Visible ;
   private int edtOpeSecc_Visible ;
   private int edtOpeSecc_Enabled ;
   private int edtOpePass_Visible ;
   private int edtOpePass_Enabled ;
   private int edtOpeMUsu_Visible ;
   private int edtOpeMUsu_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboopeturno_Enabled ;
   private int edtavComboopeturno_Visible ;
   private int edtavComboopesecc_Visible ;
   private int edtavComboopesecc_Enabled ;
   private int Combo_opeturno_Datalistupdateminimumcharacters ;
   private int Combo_opesecc_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int10[] ;
   private long Z6868OpeCedula ;
   private long A6868OpeCedula ;
   private java.math.BigDecimal Z2505OpePreHor ;
   private java.math.BigDecimal A2505OpePreHor ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV42EmprCod ;
   private String Z396EmprCod ;
   private String Z8422OpeSecc ;
   private String Z9529OpeMUsu ;
   private String Z653OpeNom ;
   private String Z6869OpeNom2 ;
   private String Z8482OpeAct ;
   private String Z8640OpePass ;
   private String Z9528OpeMSol ;
   private String Z14500OpeCargo ;
   private String N9529OpeMUsu ;
   private String Combo_opesecc_Selectedvalue_get ;
   private String Combo_opeturno_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A8422OpeSecc ;
   private String AV42EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOpeCod_Internalname ;
   private String A8482OpeAct ;
   private String A9528OpeMSol ;
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
   private String edtOpeCod_Jsonclick ;
   private String edtOpeNom_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Jsonclick ;
   private String edtOpeNom2_Internalname ;
   private String A6869OpeNom2 ;
   private String edtOpeNom2_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtOpeCedula_Internalname ;
   private String edtOpeCedula_Jsonclick ;
   private String edtOpePreHor_Internalname ;
   private String edtOpePreHor_Jsonclick ;
   private String edtOpeCargo_Internalname ;
   private String A14500OpeCargo ;
   private String edtOpeCargo_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedopeturno_Internalname ;
   private String lblTextblockopeturno_Internalname ;
   private String lblTextblockopeturno_Jsonclick ;
   private String Combo_opeturno_Caption ;
   private String Combo_opeturno_Cls ;
   private String Combo_opeturno_Emptyitemtext ;
   private String Combo_opeturno_Internalname ;
   private String edtOpeTurno_Internalname ;
   private String edtOpeTurno_Jsonclick ;
   private String divTablesplittedopesecc_Internalname ;
   private String lblTextblockopesecc_Internalname ;
   private String lblTextblockopesecc_Jsonclick ;
   private String Combo_opesecc_Caption ;
   private String Combo_opesecc_Cls ;
   private String Combo_opesecc_Emptyitemtext ;
   private String Combo_opesecc_Internalname ;
   private String edtOpeSecc_Internalname ;
   private String edtOpeSecc_Jsonclick ;
   private String divOpepass_cell_Internalname ;
   private String divOpepass_cell_Class ;
   private String edtOpePass_Internalname ;
   private String A8640OpePass ;
   private String edtOpePass_Jsonclick ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtOpeMUsu_Internalname ;
   private String A9529OpeMUsu ;
   private String edtOpeMUsu_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV54Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_opeturno_Internalname ;
   private String edtavComboopeturno_Internalname ;
   private String edtavComboopeturno_Jsonclick ;
   private String divSectionattribute_opesecc_Internalname ;
   private String edtavComboopesecc_Internalname ;
   private String AV49ComboOpeSecc ;
   private String edtavComboopesecc_Jsonclick ;
   private String tblTabledvelop_confirmpanel_trn_delete_Internalname ;
   private String Dvelop_confirmpanel_trn_delete_Title ;
   private String Dvelop_confirmpanel_trn_delete_Confirmationtext ;
   private String Dvelop_confirmpanel_trn_delete_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_trn_delete_Nobuttoncaption ;
   private String Dvelop_confirmpanel_trn_delete_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_trn_delete_Yesbuttonposition ;
   private String Dvelop_confirmpanel_trn_delete_Confirmtype ;
   private String Dvelop_confirmpanel_trn_delete_Internalname ;
   private String AV26msg0 ;
   private String A407EmprNom ;
   private String Combo_opeturno_Objectcall ;
   private String Combo_opeturno_Class ;
   private String Combo_opeturno_Icontype ;
   private String Combo_opeturno_Icon ;
   private String Combo_opeturno_Tooltip ;
   private String Combo_opeturno_Selectedvalue_set ;
   private String Combo_opeturno_Selectedtext_set ;
   private String Combo_opeturno_Selectedtext_get ;
   private String Combo_opeturno_Gamoauthtoken ;
   private String Combo_opeturno_Ddointernalname ;
   private String Combo_opeturno_Titlecontrolalign ;
   private String Combo_opeturno_Dropdownoptionstype ;
   private String Combo_opeturno_Titlecontrolidtoreplace ;
   private String Combo_opeturno_Datalisttype ;
   private String Combo_opeturno_Datalistfixedvalues ;
   private String Combo_opeturno_Datalistproc ;
   private String Combo_opeturno_Datalistprocparametersprefix ;
   private String Combo_opeturno_Remoteservicesparameters ;
   private String Combo_opeturno_Htmltemplate ;
   private String Combo_opeturno_Multiplevaluestype ;
   private String Combo_opeturno_Loadingdata ;
   private String Combo_opeturno_Noresultsfound ;
   private String Combo_opeturno_Onlyselectedvalues ;
   private String Combo_opeturno_Selectalltext ;
   private String Combo_opeturno_Multiplevaluesseparator ;
   private String Combo_opeturno_Addnewoptiontext ;
   private String Combo_opesecc_Objectcall ;
   private String Combo_opesecc_Class ;
   private String Combo_opesecc_Icontype ;
   private String Combo_opesecc_Icon ;
   private String Combo_opesecc_Tooltip ;
   private String Combo_opesecc_Selectedvalue_set ;
   private String Combo_opesecc_Selectedtext_set ;
   private String Combo_opesecc_Selectedtext_get ;
   private String Combo_opesecc_Gamoauthtoken ;
   private String Combo_opesecc_Ddointernalname ;
   private String Combo_opesecc_Titlecontrolalign ;
   private String Combo_opesecc_Dropdownoptionstype ;
   private String Combo_opesecc_Titlecontrolidtoreplace ;
   private String Combo_opesecc_Datalisttype ;
   private String Combo_opesecc_Datalistfixedvalues ;
   private String Combo_opesecc_Datalistproc ;
   private String Combo_opesecc_Datalistprocparametersprefix ;
   private String Combo_opesecc_Remoteservicesparameters ;
   private String Combo_opesecc_Htmltemplate ;
   private String Combo_opesecc_Multiplevaluestype ;
   private String Combo_opesecc_Loadingdata ;
   private String Combo_opesecc_Noresultsfound ;
   private String Combo_opesecc_Onlyselectedvalues ;
   private String Combo_opesecc_Selectalltext ;
   private String Combo_opesecc_Multiplevaluesseparator ;
   private String Combo_opesecc_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Dvelop_confirmpanel_trn_delete_Objectcall ;
   private String Dvelop_confirmpanel_trn_delete_Width ;
   private String Dvelop_confirmpanel_trn_delete_Height ;
   private String Dvelop_confirmpanel_trn_delete_Class ;
   private String Dvelop_confirmpanel_trn_delete_Comment ;
   private String Dvelop_confirmpanel_trn_delete_Bodytype ;
   private String Dvelop_confirmpanel_trn_delete_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_trn_delete_Result ;
   private String Dvelop_confirmpanel_trn_delete_Texttype ;
   private String hsh ;
   private String sMode75 ;
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
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i8482OpeAct ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n8422OpeSecc ;
   private boolean wbErr ;
   private boolean n8482OpeAct ;
   private boolean n9528OpeMSol ;
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
   private boolean n407EmprNom ;
   private boolean Combo_opeturno_Enabled ;
   private boolean Combo_opeturno_Visible ;
   private boolean Combo_opeturno_Allowmultipleselection ;
   private boolean Combo_opeturno_Isgriditem ;
   private boolean Combo_opeturno_Hasdescription ;
   private boolean Combo_opeturno_Includeonlyselectedoption ;
   private boolean Combo_opeturno_Includeselectalloption ;
   private boolean Combo_opeturno_Emptyitem ;
   private boolean Combo_opeturno_Includeaddnewoption ;
   private boolean Combo_opesecc_Enabled ;
   private boolean Combo_opesecc_Visible ;
   private boolean Combo_opesecc_Allowmultipleselection ;
   private boolean Combo_opesecc_Isgriditem ;
   private boolean Combo_opesecc_Hasdescription ;
   private boolean Combo_opesecc_Includeonlyselectedoption ;
   private boolean Combo_opesecc_Includeselectalloption ;
   private boolean Combo_opesecc_Emptyitem ;
   private boolean Combo_opesecc_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Dvelop_confirmpanel_trn_delete_Enabled ;
   private boolean Dvelop_confirmpanel_trn_delete_Visible ;
   private boolean n652OpeCod ;
   private boolean n653OpeNom ;
   private boolean n6869OpeNom2 ;
   private boolean n6868OpeCedula ;
   private boolean n2505OpePreHor ;
   private boolean n6232OpeTurno ;
   private boolean n8640OpePass ;
   private boolean n9529OpeMUsu ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13748OpeCNom ;
   private String AV48ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV46WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_opeturno ;
   private com.genexus.webpanels.GXUserControl ucCombo_opesecc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_trn_delete ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOpeAct ;
   private ICheckbox chkOpeMSol ;
   private IDataStoreProvider pr_default ;
   private String[] T001P4_A407EmprNom ;
   private boolean[] T001P4_n407EmprNom ;
   private int[] T001P5_A652OpeCod ;
   private boolean[] T001P5_n652OpeCod ;
   private byte[] T001P5_A6232OpeTurno ;
   private boolean[] T001P5_n6232OpeTurno ;
   private String[] T001P5_A8422OpeSecc ;
   private boolean[] T001P5_n8422OpeSecc ;
   private String[] T001P5_A9529OpeMUsu ;
   private boolean[] T001P5_n9529OpeMUsu ;
   private String[] T001P5_A653OpeNom ;
   private boolean[] T001P5_n653OpeNom ;
   private String[] T001P5_A6869OpeNom2 ;
   private boolean[] T001P5_n6869OpeNom2 ;
   private String[] T001P5_A407EmprNom ;
   private boolean[] T001P5_n407EmprNom ;
   private java.math.BigDecimal[] T001P5_A2505OpePreHor ;
   private boolean[] T001P5_n2505OpePreHor ;
   private long[] T001P5_A6868OpeCedula ;
   private boolean[] T001P5_n6868OpeCedula ;
   private String[] T001P5_A8482OpeAct ;
   private boolean[] T001P5_n8482OpeAct ;
   private String[] T001P5_A8640OpePass ;
   private boolean[] T001P5_n8640OpePass ;
   private String[] T001P5_A9528OpeMSol ;
   private boolean[] T001P5_n9528OpeMSol ;
   private String[] T001P5_A14500OpeCargo ;
   private String[] T001P5_A396EmprCod ;
   private String[] T001P6_A396EmprCod ;
   private int[] T001P6_A652OpeCod ;
   private boolean[] T001P6_n652OpeCod ;
   private int[] T001P3_A652OpeCod ;
   private boolean[] T001P3_n652OpeCod ;
   private byte[] T001P3_A6232OpeTurno ;
   private boolean[] T001P3_n6232OpeTurno ;
   private String[] T001P3_A8422OpeSecc ;
   private boolean[] T001P3_n8422OpeSecc ;
   private String[] T001P3_A9529OpeMUsu ;
   private boolean[] T001P3_n9529OpeMUsu ;
   private String[] T001P3_A653OpeNom ;
   private boolean[] T001P3_n653OpeNom ;
   private String[] T001P3_A6869OpeNom2 ;
   private boolean[] T001P3_n6869OpeNom2 ;
   private java.math.BigDecimal[] T001P3_A2505OpePreHor ;
   private boolean[] T001P3_n2505OpePreHor ;
   private long[] T001P3_A6868OpeCedula ;
   private boolean[] T001P3_n6868OpeCedula ;
   private String[] T001P3_A8482OpeAct ;
   private boolean[] T001P3_n8482OpeAct ;
   private String[] T001P3_A8640OpePass ;
   private boolean[] T001P3_n8640OpePass ;
   private String[] T001P3_A9528OpeMSol ;
   private boolean[] T001P3_n9528OpeMSol ;
   private String[] T001P3_A14500OpeCargo ;
   private String[] T001P3_A396EmprCod ;
   private String[] T001P7_A396EmprCod ;
   private int[] T001P7_A652OpeCod ;
   private boolean[] T001P7_n652OpeCod ;
   private String[] T001P8_A396EmprCod ;
   private int[] T001P8_A652OpeCod ;
   private boolean[] T001P8_n652OpeCod ;
   private int[] T001P2_A652OpeCod ;
   private boolean[] T001P2_n652OpeCod ;
   private byte[] T001P2_A6232OpeTurno ;
   private boolean[] T001P2_n6232OpeTurno ;
   private String[] T001P2_A8422OpeSecc ;
   private boolean[] T001P2_n8422OpeSecc ;
   private String[] T001P2_A9529OpeMUsu ;
   private boolean[] T001P2_n9529OpeMUsu ;
   private String[] T001P2_A653OpeNom ;
   private boolean[] T001P2_n653OpeNom ;
   private String[] T001P2_A6869OpeNom2 ;
   private boolean[] T001P2_n6869OpeNom2 ;
   private java.math.BigDecimal[] T001P2_A2505OpePreHor ;
   private boolean[] T001P2_n2505OpePreHor ;
   private long[] T001P2_A6868OpeCedula ;
   private boolean[] T001P2_n6868OpeCedula ;
   private String[] T001P2_A8482OpeAct ;
   private boolean[] T001P2_n8482OpeAct ;
   private String[] T001P2_A8640OpePass ;
   private boolean[] T001P2_n8640OpePass ;
   private String[] T001P2_A9528OpeMSol ;
   private boolean[] T001P2_n9528OpeMSol ;
   private String[] T001P2_A14500OpeCargo ;
   private String[] T001P2_A396EmprCod ;
   private String[] T001P12_A396EmprCod ;
   private int[] T001P12_A11917Ebd_numero ;
   private String[] T001P13_A396EmprCod ;
   private int[] T001P13_A11898Prd_numero ;
   private String[] T001P14_A396EmprCod ;
   private int[] T001P14_A11849Cte_numero ;
   private String[] T001P15_A396EmprCod ;
   private int[] T001P15_A11791Ap_numero ;
   private String[] T001P16_A396EmprCod ;
   private java.util.Date[] T001P16_A3710JorFecha ;
   private int[] T001P16_A652OpeCod ;
   private boolean[] T001P16_n652OpeCod ;
   private String[] T001P17_A396EmprCod ;
   private java.util.Date[] T001P17_A5294InPTime ;
   private int[] T001P17_A652OpeCod ;
   private boolean[] T001P17_n652OpeCod ;
   private String[] T001P18_A396EmprCod ;
   private short[] T001P18_A5994PosBotCod ;
   private int[] T001P18_A2855CodBota ;
   private String[] T001P19_A396EmprCod ;
   private int[] T001P19_A9429PMCod ;
   private int[] T001P19_A9481PMOpeRes ;
   private String[] T001P20_A396EmprCod ;
   private String[] T001P20_A602MaqCod ;
   private java.util.Date[] T001P20_A558HisProFec ;
   private int[] T001P20_A561HisProLin ;
   private String[] T001P20_A10501Peh_cod ;
   private int[] T001P20_A10503Peh_lin ;
   private String[] T001P21_A396EmprCod ;
   private String[] T001P21_A602MaqCod ;
   private java.util.Date[] T001P21_A558HisProFec ;
   private int[] T001P21_A561HisProLin ;
   private String[] T001P21_A10495Emh_cod ;
   private int[] T001P21_A10497Emh_lin ;
   private String[] T001P22_A396EmprCod ;
   private String[] T001P22_A602MaqCod ;
   private java.util.Date[] T001P22_A558HisProFec ;
   private int[] T001P22_A561HisProLin ;
   private String[] T001P22_A10487Cah_cod ;
   private int[] T001P22_A10489Cah_lin ;
   private String[] T001P23_A396EmprCod ;
   private String[] T001P23_A602MaqCod ;
   private java.util.Date[] T001P23_A558HisProFec ;
   private int[] T001P23_A561HisProLin ;
   private String[] T001P23_A10486Abh_cod ;
   private int[] T001P23_A10481Abh_lin ;
   private String[] T001P24_A396EmprCod ;
   private int[] T001P24_A10364Ph_numero ;
   private String[] T001P25_A396EmprCod ;
   private int[] T001P25_A652OpeCod ;
   private boolean[] T001P25_n652OpeCod ;
   private java.util.Date[] T001P25_A10278Act_dia ;
   private String[] T001P26_A396EmprCod ;
   private int[] T001P26_A129BarCod ;
   private byte[] T001P26_A132BarCodReo ;
   private String[] T001P26_A130BarCodPar ;
   private String[] T001P26_A758ProCod ;
   private short[] T001P26_A194BarOrdLin ;
   private String[] T001P26_A9966Em_cod ;
   private int[] T001P26_A9977Em_lin ;
   private String[] T001P27_A396EmprCod ;
   private int[] T001P27_A129BarCod ;
   private byte[] T001P27_A132BarCodReo ;
   private String[] T001P27_A130BarCodPar ;
   private String[] T001P27_A758ProCod ;
   private short[] T001P27_A194BarOrdLin ;
   private String[] T001P27_A9940Ab_cod ;
   private int[] T001P27_A9961Ab_lin ;
   private String[] T001P28_A396EmprCod ;
   private int[] T001P28_A129BarCod ;
   private byte[] T001P28_A132BarCodReo ;
   private String[] T001P28_A130BarCodPar ;
   private String[] T001P28_A758ProCod ;
   private short[] T001P28_A194BarOrdLin ;
   private String[] T001P28_A9911Ca_cod ;
   private int[] T001P28_A9924Ca_lin ;
   private String[] T001P29_A396EmprCod ;
   private int[] T001P29_A129BarCod ;
   private byte[] T001P29_A132BarCodReo ;
   private String[] T001P29_A130BarCodPar ;
   private String[] T001P29_A758ProCod ;
   private short[] T001P29_A194BarOrdLin ;
   private String[] T001P29_A9878Pe_cod ;
   private int[] T001P29_A9906Pe_lin ;
   private String[] T001P30_A396EmprCod ;
   private int[] T001P30_A129BarCod ;
   private byte[] T001P30_A132BarCodReo ;
   private String[] T001P30_A130BarCodPar ;
   private String[] T001P30_A758ProCod ;
   private short[] T001P30_A194BarOrdLin ;
   private String[] T001P30_A9870Rm_cod ;
   private int[] T001P30_A9886Rm_lin ;
   private String[] T001P31_A396EmprCod ;
   private int[] T001P31_A9425OMCod ;
   private int[] T001P31_A9455OMOpeCod ;
   private String[] T001P31_A9458OMMTpo ;
   private String[] T001P32_A396EmprCod ;
   private int[] T001P32_A9425OMCod ;
   private String[] T001P33_A396EmprCod ;
   private int[] T001P33_A8059Rev_Hd ;
   private byte[] T001P33_A8060Rev_Hdr ;
   private String[] T001P33_A8061Rev_Hdp ;
   private short[] T001P33_A8063Rev_Ln ;
   private String[] T001P34_A396EmprCod ;
   private int[] T001P34_A5198Nr_codigo ;
   private String[] T001P35_A396EmprCod ;
   private int[] T001P35_A4744RecPreCod ;
   private int[] T001P35_A4754RecPreLCa ;
   private String[] T001P36_A396EmprCod ;
   private int[] T001P36_A4618EnsLCod ;
   private String[] T001P37_A396EmprCod ;
   private int[] T001P37_A129BarCod ;
   private byte[] T001P37_A132BarCodReo ;
   private String[] T001P37_A130BarCodPar ;
   private String[] T001P37_A200BarPieCod ;
   private short[] T001P37_A3858BarTroCod ;
   private String[] T001P38_A396EmprCod ;
   private int[] T001P38_A3253SolTraCod ;
   private String[] T001P39_A396EmprCod ;
   private int[] T001P39_A3235SolSubCod ;
   private String[] T001P40_A396EmprCod ;
   private int[] T001P40_A3218SolLuzCod ;
   private String[] T001P41_A396EmprCod ;
   private int[] T001P41_A3196SolFriCod ;
   private String[] T001P42_A396EmprCod ;
   private int[] T001P42_A3165SolPilCod ;
   private String[] T001P43_A396EmprCod ;
   private int[] T001P43_A1348SolColCod ;
   private String[] T001P44_A396EmprCod ;
   private int[] T001P44_A1333EstDimCod ;
   private String[] T001P45_A396EmprCod ;
   private int[] T001P45_A503GruOpeCod ;
   private int[] T001P45_A652OpeCod ;
   private boolean[] T001P45_n652OpeCod ;
   private String[] T001P46_A396EmprCod ;
   private int[] T001P46_A652OpeCod ;
   private boolean[] T001P46_n652OpeCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV51OpeTurno_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV47OpeSecc_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV44WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV45TrnContext ;
}

final  class toperar__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class toperar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class toperar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class toperar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class toperar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001P2", "SELECT OpeCod, OpeTurno, OpeSecc, OpeMUsu, OpeNom, OpeNom2, OpePreHor, OpeCedula, OpeAct, OpePass, OpeMSol, OpeCargo, EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ?  FOR UPDATE OF OpeTurno, OpeSecc, OpeMUsu, OpeNom, OpeNom2, OpePreHor, OpeCedula, OpeAct, OpePass, OpeMSol, OpeCargo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001P3", "SELECT OpeCod, OpeTurno, OpeSecc, OpeMUsu, OpeNom, OpeNom2, OpePreHor, OpeCedula, OpeAct, OpePass, OpeMSol, OpeCargo, EmprCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001P4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001P5", "SELECT /*+ FIRST_ROWS(100) */ TM1.OpeCod, TM1.OpeTurno, TM1.OpeSecc, TM1.OpeMUsu, TM1.OpeNom, TM1.OpeNom2, T2.EmprNom, TM1.OpePreHor, TM1.OpeCedula, TM1.OpeAct, TM1.OpePass, TM1.OpeMSol, TM1.OpeCargo, TM1.EmprCod FROM (TXPOPERAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.OpeCod = ? ORDER BY TM1.EmprCod, TM1.OpeCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001P6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OpeCod FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001P7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OpeCod FROM TXPOPERAR WHERE ( OpeCod > ?) and EmprCod = ? ORDER BY EmprCod, OpeCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OpeCod FROM TXPOPERAR WHERE ( OpeCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, OpeCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001P9", "INSERT INTO TXPOPERAR(OpeCod, OpeTurno, OpeSecc, OpeMUsu, OpeNom, OpeNom2, OpePreHor, OpeCedula, OpeAct, OpePass, OpeMSol, OpeCargo, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOPERAR")
         ,new UpdateCursor("T001P10", "UPDATE TXPOPERAR SET OpeTurno=?, OpeSecc=?, OpeMUsu=?, OpeNom=?, OpeNom2=?, OpePreHor=?, OpeCedula=?, OpeAct=?, OpePass=?, OpeMSol=?, OpeCargo=?  WHERE EmprCod = ? AND OpeCod = ?", GX_NOMASK, "TXPOPERAR")
         ,new UpdateCursor("T001P11", "DELETE FROM TXPOPERAR  WHERE EmprCod = ? AND OpeCod = ?", GX_NOMASK, "TXPOPERAR")
         ,new ForEachCursor("T001P12", "SELECT * FROM (SELECT EmprCod, Ebd_numero FROM TXPEMBDUR WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P13", "SELECT * FROM (SELECT EmprCod, Prd_numero FROM TXPPRIDUR WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P14", "SELECT * FROM (SELECT EmprCod, Cte_numero FROM TXPCONTTE WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P15", "SELECT * FROM (SELECT EmprCod, Ap_numero FROM TXPTAPAR WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P16", "SELECT * FROM (SELECT EmprCod, JorFecha, OpeCod FROM TXPJornad WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P17", "SELECT * FROM (SELECT EmprCod, InPTime, OpeCod FROM TXPINCPRO WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P18", "SELECT * FROM (SELECT EmprCod, PosBotCod, CodBota FROM TXPPOSBOT WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P19", "SELECT * FROM (SELECT EmprCod, PMCod, PMOpeRes FROM TXPMPrev1 WHERE EmprCod = ? AND PMOpeRes = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P20", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Peh_cod, Peh_lin FROM TXPCAPE01 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P21", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Emh_cod, Emh_lin FROM TXPCAEM01 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P22", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Cah_cod, Cah_lin FROM TXPCALA01 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P23", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod, Abh_lin FROM TXPCAAB01 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P24", "SELECT * FROM (SELECT EmprCod, Ph_numero FROM TXPTPH WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P25", "SELECT * FROM (SELECT EmprCod, OpeCod, Act_dia FROM TXPTR0300 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod, Em_lin FROM TXPCACEM1 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod, Ab_lin FROM TXPCACAB1 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod, Ca_lin FROM TXPCACCA1 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod, Pe_lin FROM TXPCACPE1 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod, Rm_lin FROM TXPCACRA1 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P31", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMOpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P32", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMOpeRes = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P33", "SELECT * FROM (SELECT EmprCod, Rev_Hd, Rev_Hdr, Rev_Hdp, Rev_Ln FROM TXPHDRTA1 WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P34", "SELECT * FROM (SELECT EmprCod, Nr_codigo FROM TXPNOTREC WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P35", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLCa FROM TXPPRERCA WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P36", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarTroOpeC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P38", "SELECT * FROM (SELECT EmprCod, SolTraCod FROM TXPCTRASP WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P39", "SELECT * FROM (SELECT EmprCod, SolSubCod FROM TXPCSUBLI WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P40", "SELECT * FROM (SELECT EmprCod, SolLuzCod FROM TXPCSOLLU WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P41", "SELECT * FROM (SELECT EmprCod, SolFriCod FROM TXPCFRICC WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P42", "SELECT * FROM (SELECT EmprCod, SolPilCod FROM TXPCPILLI WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P43", "SELECT * FROM (SELECT EmprCod, SolColCod FROM TXPCSOLCO WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P44", "SELECT * FROM (SELECT EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P45", "SELECT * FROM (SELECT EmprCod, GruOpeCod, OpeCod FROM TXPLGRUOP WHERE EmprCod = ? AND OpeCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001P46", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OpeCod FROM TXPOPERAR WHERE EmprCod = ? ORDER BY EmprCod, OpeCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((long[]) buf[13])[0] = rslt.getLong(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((long[]) buf[15])[0] = rslt.getLong(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 30);
               ((String[]) buf[24])[0] = rslt.getString(14, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
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
                  stmt.setString(6, (String)parms[11], 30);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[15]).longValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 1);
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
                  stmt.setString(11, (String)parms[21], 1);
               }
               stmt.setString(12, (String)parms[22], 30);
               stmt.setString(13, (String)parms[23], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
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
                  stmt.setString(5, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 20);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               stmt.setString(11, (String)parms[20], 30);
               stmt.setString(12, (String)parms[21], 3);
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[23]).intValue());
               }
               return;
            case 9 :
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
            case 10 :
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
            case 11 :
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
            case 12 :
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
            case 18 :
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
               return;
            case 21 :
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
            case 22 :
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
            case 25 :
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
            case 26 :
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
            case 27 :
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
            case 28 :
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
            case 29 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 31 :
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
            case 32 :
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
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
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
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

