package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albaranobservacion_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"ALBPOBSLIN") == 0 )
      {
         AV14AlbPObsLin = (byte)(GXutil.lval( httpContext.GetPar( "AlbPObsLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14AlbPObsLin), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPOBSLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14AlbPObsLin), "Z9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asaalbpobslin1T4121( AV14AlbPObsLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"ALBPOBSLIN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asaalbpobslin1T4121( A396EmprCod, A30AlbProCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A1253EmprGuiRem = httpContext.GetPar( "EmprGuiRem") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
         A1243GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A1253EmprGuiRem, A1243GuiRemCli) ;
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
            AV13EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
            AV7AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AlbProCod), "ZZZZZZZZZ9")));
            AV14AlbPObsLin = (byte)(GXutil.lval( httpContext.GetPar( "AlbPObsLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14AlbPObsLin), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPOBSLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14AlbPObsLin), "Z9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Guias / Observación", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public albaranobservacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albaranobservacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranobservacion_impl.class ));
   }

   public albaranobservacion_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbEnvFtp = new HTMLChoice();
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
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tablealbaran.setProperty("Width", Dvpanel_tablealbaran_Width);
      ucDvpanel_tablealbaran.setProperty("AutoWidth", Dvpanel_tablealbaran_Autowidth);
      ucDvpanel_tablealbaran.setProperty("AutoHeight", Dvpanel_tablealbaran_Autoheight);
      ucDvpanel_tablealbaran.setProperty("Cls", Dvpanel_tablealbaran_Cls);
      ucDvpanel_tablealbaran.setProperty("Title", Dvpanel_tablealbaran_Title);
      ucDvpanel_tablealbaran.setProperty("Collapsible", Dvpanel_tablealbaran_Collapsible);
      ucDvpanel_tablealbaran.setProperty("Collapsed", Dvpanel_tablealbaran_Collapsed);
      ucDvpanel_tablealbaran.setProperty("ShowCollapseIcon", Dvpanel_tablealbaran_Showcollapseicon);
      ucDvpanel_tablealbaran.setProperty("IconPosition", Dvpanel_tablealbaran_Iconposition);
      ucDvpanel_tablealbaran.setProperty("AutoScroll", Dvpanel_tablealbaran_Autoscroll);
      ucDvpanel_tablealbaran.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablealbaran_Internalname, "DVPANEL_TABLEALBARANContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEALBARANContainer"+"TableAlbaran"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablealbaran_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranObservacion.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop25", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTbngruia_Internalname, httpContext.getMessage( "<b>Nº Guia</b>", ""), "", "", lblTbngruia_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbEnvFtp.getInternalname(), httpContext.getMessage( "Envio Albaran FTP", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbEnvFtp, cmbAlbEnvFtp.getInternalname(), GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)), 1, cmbAlbEnvFtp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbEnvFtp.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Albaranes\\AlbaranObservacion.htm");
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiRemCln_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCln_Internalname, GXutil.rtrim( A1244GuiRemCln), GXutil.rtrim( localUtil.format( A1244GuiRemCln, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiRemCln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProfch_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbProfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProfch_Internalname, localUtil.format(A34AlbProfch, "99/99/99"), localUtil.format( A34AlbProfch, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbProfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbProfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\AlbaranObservacion.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPObsLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPObsLin_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPObsLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A915AlbPObsLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A915AlbPObsLin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPObsLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPObsLin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-11 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbPObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbPObs_Internalname, httpContext.getMessage( "Observación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPObs_Internalname, GXutil.rtrim( A916AlbPObs), GXutil.rtrim( localUtil.format( A916AlbPObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPObs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbPObs_Enabled, 1, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranObservacion.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-9", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV18Pgmname), GXutil.rtrim( localUtil.format( AV18Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\AlbaranObservacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e111T42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z915AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z915AlbPObsLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z916AlbPObs = httpContext.cgiGet( "Z916AlbPObs") ;
            Z1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            Z914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5805AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z5805AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            Z34AlbProfch = localUtil.ctod( httpContext.cgiGet( "Z34AlbProfch"), 0) ;
            Z2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( "Z1243GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1253EmprGuiRem = httpContext.cgiGet( "Z1253EmprGuiRem") ;
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7101AlbLic = httpContext.cgiGet( "Z7101AlbLic") ;
            A2242AlbSec = httpContext.cgiGet( "Z2242AlbSec") ;
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N916AlbPObs = httpContext.cgiGet( "N916AlbPObs") ;
            AV13EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV7AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV14AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( "vALBPOBSLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBPROEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A1253EmprGuiRem = httpContext.cgiGet( "EMPRGUIREM") ;
            A7101AlbLic = httpContext.cgiGet( "ALBLIC") ;
            A2242AlbSec = httpContext.cgiGet( "ALBSEC") ;
            Dvpanel_tablealbaran_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Objectcall") ;
            Dvpanel_tablealbaran_Class = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Class") ;
            Dvpanel_tablealbaran_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Enabled")) ;
            Dvpanel_tablealbaran_Width = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Width") ;
            Dvpanel_tablealbaran_Height = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Height") ;
            Dvpanel_tablealbaran_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autowidth")) ;
            Dvpanel_tablealbaran_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autoheight")) ;
            Dvpanel_tablealbaran_Cls = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Cls") ;
            Dvpanel_tablealbaran_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Showheader")) ;
            Dvpanel_tablealbaran_Title = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Title") ;
            Dvpanel_tablealbaran_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Collapsible")) ;
            Dvpanel_tablealbaran_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Collapsed")) ;
            Dvpanel_tablealbaran_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Showcollapseicon")) ;
            Dvpanel_tablealbaran_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Iconposition") ;
            Dvpanel_tablealbaran_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Autoscroll")) ;
            Dvpanel_tablealbaran_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEALBARAN_Visible")) ;
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
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
            A915AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
            A916AlbPObs = httpContext.cgiGet( edtAlbPObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A916AlbPObs", A916AlbPObs);
            AV18Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"AlbaranObservacion");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A915AlbPObsLin != Z915AlbPObsLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("albaranes\\albaranobservacion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A915AlbPObsLin = (byte)(GXutil.lval( httpContext.GetPar( "AlbPObsLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
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
                  sMode121 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode121 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound121 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1T40( ) ;
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
                        e111T42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121T42 ();
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
         e121T42 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1T4121( ) ;
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
         disableAttributes1T4121( ) ;
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

   public void confirm_1T40( )
   {
      beforeValidate1T4121( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1T4121( ) ;
         }
         else
         {
            checkExtendedTable1T4121( ) ;
            closeExtendedTableCursors1T4121( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1T40( )
   {
   }

   public void e111T42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albaranobservacion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Station", AV10Station);
      GXv_char2[0] = AV13EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      albaranobservacion_impl.this.AV13EmprCod = GXv_char2[0] ;
      albaranobservacion_impl.this.AV11EmprNom = GXv_char3[0] ;
      albaranobservacion_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprCod", AV13EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
      GXv_SdtWWPContext5[0] = AV15WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV15WWPContext = GXv_SdtWWPContext5[0] ;
      AV16TrnContext.fromxml(AV17WebSession.getValue("TrnContext"), null, null);
   }

   public void e121T42( )
   {
      /* After Trn Routine */
      returnInSub = false ;
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

   public void zm1T4121( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z916AlbPObs = T01T43_A916AlbPObs[0] ;
         }
         else
         {
            Z916AlbPObs = A916AlbPObs ;
         }
      }
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         Z1253EmprGuiRem = T01T46_A1253EmprGuiRem[0] ;
         Z914AlbPObsCon = T01T46_A914AlbPObsCon[0] ;
         Z5805AlbEnvFtp = T01T46_A5805AlbEnvFtp[0] ;
         Z7101AlbLic = T01T46_A7101AlbLic[0] ;
         Z34AlbProfch = T01T46_A34AlbProfch[0] ;
         Z2242AlbSec = T01T46_A2242AlbSec[0] ;
         Z33AlbProEst = T01T46_A33AlbProEst[0] ;
         Z1243GuiRemCli = T01T46_A1243GuiRemCli[0] ;
      }
      if ( GX_JID == -13 )
      {
         Z915AlbPObsLin = A915AlbPObsLin ;
         Z916AlbPObs = A916AlbPObs ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z1253EmprGuiRem = A1253EmprGuiRem ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z5805AlbEnvFtp = A5805AlbEnvFtp ;
         Z7101AlbLic = A7101AlbLic ;
         Z34AlbProfch = A34AlbProfch ;
         Z2242AlbSec = A2242AlbSec ;
         Z33AlbProEst = A33AlbProEst ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z1244GuiRemCln = A1244GuiRemCln ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbPObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      AV18Pgmname = "Albaranes.AlbaranObservacion" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
      edtAlbPObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         A396EmprCod = AV13EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV13EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7AlbProCod) )
      {
         A30AlbProCod = AV7AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( ! (0==AV14AlbPObsLin) )
      {
         A915AlbPObsLin = AV14AlbPObsLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
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
         /* Using cursor T01T44 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T01T44_A407EmprNom[0] ;
         n407EmprNom = T01T44_n407EmprNom[0] ;
         pr_default.close(2);
         /* Using cursor T01T46 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         zm1T4121( 15) ;
         A1253EmprGuiRem = T01T46_A1253EmprGuiRem[0] ;
         A914AlbPObsCon = T01T46_A914AlbPObsCon[0] ;
         A5805AlbEnvFtp = T01T46_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T46_A7101AlbLic[0] ;
         A34AlbProfch = T01T46_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T46_A2242AlbSec[0] ;
         A33AlbProEst = T01T46_A33AlbProEst[0] ;
         A1243GuiRemCli = T01T46_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         pr_default.close(4);
         if ( A33AlbProEst == 2 )
         {
            edtAlbPObs_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbPObs_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
         }
         /* Using cursor T01T47 */
         pr_default.execute(5, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01T47_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         pr_default.close(5);
      }
   }

   public void load1T4121( )
   {
      /* Using cursor T01T48 */
      pr_default.execute(6, new Object[] {Byte.valueOf(A915AlbPObsLin), A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A1253EmprGuiRem = T01T48_A1253EmprGuiRem[0] ;
         A914AlbPObsCon = T01T48_A914AlbPObsCon[0] ;
         A407EmprNom = T01T48_A407EmprNom[0] ;
         n407EmprNom = T01T48_n407EmprNom[0] ;
         A5805AlbEnvFtp = T01T48_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T48_A7101AlbLic[0] ;
         A1244GuiRemCln = T01T48_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         A34AlbProfch = T01T48_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T48_A2242AlbSec[0] ;
         A33AlbProEst = T01T48_A33AlbProEst[0] ;
         A916AlbPObs = T01T48_A916AlbPObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A916AlbPObs", A916AlbPObs);
         A1243GuiRemCli = T01T48_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         zm1T4121( -13) ;
      }
      pr_default.close(6);
      onLoadActions1T4121( ) ;
   }

   public void onLoadActions1T4121( )
   {
      if ( A33AlbProEst == 2 )
      {
         edtAlbPObs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbPObs_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
      }
   }

   public void checkExtendedTable1T4121( )
   {
      nIsDirty_121 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01T44 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01T44_A407EmprNom[0] ;
      n407EmprNom = T01T44_n407EmprNom[0] ;
      pr_default.close(2);
      /* Using cursor T01T46 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1253EmprGuiRem = T01T46_A1253EmprGuiRem[0] ;
      A914AlbPObsCon = T01T46_A914AlbPObsCon[0] ;
      A5805AlbEnvFtp = T01T46_A5805AlbEnvFtp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = T01T46_A7101AlbLic[0] ;
      A34AlbProfch = T01T46_A34AlbProfch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = T01T46_A2242AlbSec[0] ;
      A33AlbProEst = T01T46_A33AlbProEst[0] ;
      A1243GuiRemCli = T01T46_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      pr_default.close(4);
      if ( A33AlbProEst == 2 )
      {
         edtAlbPObs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbPObs_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
      }
      if ( ( A33AlbProEst == 2 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Guia já faturou.", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01T47 */
      pr_default.execute(5, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T47_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1T4121( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A396EmprCod )
   {
      /* Using cursor T01T49 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01T49_A407EmprNom[0] ;
      n407EmprNom = T01T49_n407EmprNom[0] ;
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

   public void gxload_15( String A396EmprCod ,
                          long A30AlbProCod )
   {
      /* Using cursor T01T46 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1253EmprGuiRem = T01T46_A1253EmprGuiRem[0] ;
      A914AlbPObsCon = T01T46_A914AlbPObsCon[0] ;
      A5805AlbEnvFtp = T01T46_A5805AlbEnvFtp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = T01T46_A7101AlbLic[0] ;
      A34AlbProfch = T01T46_A34AlbProfch[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = T01T46_A2242AlbSec[0] ;
      A33AlbProEst = T01T46_A33AlbProEst[0] ;
      A1243GuiRemCli = T01T46_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1253EmprGuiRem))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7101AlbLic))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A34AlbProfch, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2242AlbSec))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void gxload_16( String A1253EmprGuiRem ,
                          int A1243GuiRemCli )
   {
      /* Using cursor T01T410 */
      pr_default.execute(8, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T410_A1244GuiRemCln[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1244GuiRemCln))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1T4121( )
   {
      /* Using cursor T01T411 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound121 = (short)(1) ;
      }
      else
      {
         RcdFound121 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01T43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1T4121( 13) ;
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = T01T43_A915AlbPObsLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
         A916AlbPObs = T01T43_A916AlbPObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A916AlbPObs", A916AlbPObs);
         A396EmprCod = T01T43_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01T43_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1T4121( ) ;
         if ( AnyError == 1 )
         {
            RcdFound121 = (short)(0) ;
            initializeNonKey1T4121( ) ;
         }
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound121 = (short)(0) ;
         initializeNonKey1T4121( ) ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1T4121( ) ;
      if ( RcdFound121 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound121 = (short)(0) ;
      /* Using cursor T01T412 */
      pr_default.execute(10, new Object[] {Byte.valueOf(A915AlbPObsLin), Byte.valueOf(A915AlbPObsLin), A396EmprCod, A396EmprCod, Byte.valueOf(A915AlbPObsLin), Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01T412_A915AlbPObsLin[0] < A915AlbPObsLin ) || ( T01T412_A915AlbPObsLin[0] == A915AlbPObsLin ) && ( GXutil.strcmp(T01T412_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01T412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T412_A915AlbPObsLin[0] == A915AlbPObsLin ) && ( T01T412_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01T412_A915AlbPObsLin[0] > A915AlbPObsLin ) || ( T01T412_A915AlbPObsLin[0] == A915AlbPObsLin ) && ( GXutil.strcmp(T01T412_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01T412_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T412_A915AlbPObsLin[0] == A915AlbPObsLin ) && ( T01T412_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A915AlbPObsLin = T01T412_A915AlbPObsLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
            A396EmprCod = T01T412_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = T01T412_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound121 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound121 = (short)(0) ;
      /* Using cursor T01T413 */
      pr_default.execute(11, new Object[] {Byte.valueOf(A915AlbPObsLin), Byte.valueOf(A915AlbPObsLin), A396EmprCod, A396EmprCod, Byte.valueOf(A915AlbPObsLin), Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01T413_A915AlbPObsLin[0] > A915AlbPObsLin ) || ( T01T413_A915AlbPObsLin[0] == A915AlbPObsLin ) && ( GXutil.strcmp(T01T413_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01T413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T413_A915AlbPObsLin[0] == A915AlbPObsLin ) && ( T01T413_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01T413_A915AlbPObsLin[0] < A915AlbPObsLin ) || ( T01T413_A915AlbPObsLin[0] == A915AlbPObsLin ) && ( GXutil.strcmp(T01T413_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01T413_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01T413_A915AlbPObsLin[0] == A915AlbPObsLin ) && ( T01T413_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A915AlbPObsLin = T01T413_A915AlbPObsLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
            A396EmprCod = T01T413_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = T01T413_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound121 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1T4121( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1T4121( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound121 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A915AlbPObsLin != Z915AlbPObsLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A915AlbPObsLin = Z915AlbPObsLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1T4121( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A915AlbPObsLin != Z915AlbPObsLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1T4121( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1T4121( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A915AlbPObsLin != Z915AlbPObsLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A915AlbPObsLin = Z915AlbPObsLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1T4121( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01T42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z916AlbPObs, T01T42_A916AlbPObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z916AlbPObs, T01T42_A916AlbPObs[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"AlbPObs");
               GXutil.writeLogRaw("Old: ",Z916AlbPObs);
               GXutil.writeLogRaw("Current: ",T01T42_A916AlbPObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01T414 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(12) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( GXutil.strcmp(Z1253EmprGuiRem, T01T414_A1253EmprGuiRem[0]) != 0 ) || ( Z914AlbPObsCon != T01T414_A914AlbPObsCon[0] ) || ( Z5805AlbEnvFtp != T01T414_A5805AlbEnvFtp[0] ) || ( GXutil.strcmp(Z7101AlbLic, T01T414_A7101AlbLic[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01T414_A34AlbProfch[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2242AlbSec, T01T414_A2242AlbSec[0]) != 0 ) || ( Z33AlbProEst != T01T414_A33AlbProEst[0] ) || ( Z1243GuiRemCli != T01T414_A1243GuiRemCli[0] ) )
         {
            if ( GXutil.strcmp(Z1253EmprGuiRem, T01T414_A1253EmprGuiRem[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"EmprGuiRem");
               GXutil.writeLogRaw("Old: ",Z1253EmprGuiRem);
               GXutil.writeLogRaw("Current: ",T01T414_A1253EmprGuiRem[0]);
            }
            if ( Z914AlbPObsCon != T01T414_A914AlbPObsCon[0] )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"AlbPObsCon");
               GXutil.writeLogRaw("Old: ",Z914AlbPObsCon);
               GXutil.writeLogRaw("Current: ",T01T414_A914AlbPObsCon[0]);
            }
            if ( Z5805AlbEnvFtp != T01T414_A5805AlbEnvFtp[0] )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"AlbEnvFtp");
               GXutil.writeLogRaw("Old: ",Z5805AlbEnvFtp);
               GXutil.writeLogRaw("Current: ",T01T414_A5805AlbEnvFtp[0]);
            }
            if ( GXutil.strcmp(Z7101AlbLic, T01T414_A7101AlbLic[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"AlbLic");
               GXutil.writeLogRaw("Old: ",Z7101AlbLic);
               GXutil.writeLogRaw("Current: ",T01T414_A7101AlbLic[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z34AlbProfch), GXutil.resetTime(T01T414_A34AlbProfch[0])) ) )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"AlbProfch");
               GXutil.writeLogRaw("Old: ",Z34AlbProfch);
               GXutil.writeLogRaw("Current: ",T01T414_A34AlbProfch[0]);
            }
            if ( GXutil.strcmp(Z2242AlbSec, T01T414_A2242AlbSec[0]) != 0 )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"AlbSec");
               GXutil.writeLogRaw("Old: ",Z2242AlbSec);
               GXutil.writeLogRaw("Current: ",T01T414_A2242AlbSec[0]);
            }
            if ( Z33AlbProEst != T01T414_A33AlbProEst[0] )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01T414_A33AlbProEst[0]);
            }
            if ( Z1243GuiRemCli != T01T414_A1243GuiRemCli[0] )
            {
               GXutil.writeLogln("albaranes.albaranobservacion:[seudo value changed for attri]"+"GuiRemCli");
               GXutil.writeLogRaw("Old: ",Z1243GuiRemCli);
               GXutil.writeLogRaw("Current: ",T01T414_A1243GuiRemCli[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1T4121( )
   {
      beforeValidate1T4121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T4121( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1T4121( 0) ;
         checkOptimisticConcurrency1T4121( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T4121( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1T4121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T415 */
                  pr_default.execute(13, new Object[] {Byte.valueOf(A915AlbPObsLin), A916AlbPObs, A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                  if ( (pr_default.getStatus(13) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11T4121( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1T40( ) ;
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
            load1T4121( ) ;
         }
         endLevel1T4121( ) ;
      }
      closeExtendedTableCursors1T4121( ) ;
   }

   public void update1T4121( )
   {
      beforeValidate1T4121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1T4121( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T4121( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1T4121( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1T4121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01T416 */
                  pr_default.execute(14, new Object[] {A916AlbPObs, A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1T4121( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11T4121( ) ;
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
         endLevel1T4121( ) ;
      }
      closeExtendedTableCursors1T4121( ) ;
   }

   public void deferredUpdate1T4121( )
   {
   }

   public void delete( )
   {
      beforeValidate1T4121( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1T4121( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1T4121( ) ;
         afterConfirm1T4121( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1T4121( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01T417 */
               pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
               if ( AnyError == 0 )
               {
                  updateTablesN11T4121( ) ;
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
      sMode121 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1T4121( ) ;
      Gx_mode = sMode121 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1T4121( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( A33AlbProEst == 2 ) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Guia já faturou.", ""), 1, "");
            AnyError = (short)(1) ;
         }
         /* Using cursor T01T418 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T01T418_A407EmprNom[0] ;
         n407EmprNom = T01T418_n407EmprNom[0] ;
         pr_default.close(16);
         /* Using cursor T01T419 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         Z1253EmprGuiRem = T01T419_A1253EmprGuiRem[0] ;
         Z914AlbPObsCon = T01T419_A914AlbPObsCon[0] ;
         Z5805AlbEnvFtp = T01T419_A5805AlbEnvFtp[0] ;
         Z7101AlbLic = T01T419_A7101AlbLic[0] ;
         Z34AlbProfch = T01T419_A34AlbProfch[0] ;
         Z2242AlbSec = T01T419_A2242AlbSec[0] ;
         Z33AlbProEst = T01T419_A33AlbProEst[0] ;
         Z1243GuiRemCli = T01T419_A1243GuiRemCli[0] ;
         A1253EmprGuiRem = T01T419_A1253EmprGuiRem[0] ;
         A914AlbPObsCon = T01T419_A914AlbPObsCon[0] ;
         A5805AlbEnvFtp = T01T419_A5805AlbEnvFtp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
         A7101AlbLic = T01T419_A7101AlbLic[0] ;
         A34AlbProfch = T01T419_A34AlbProfch[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
         A2242AlbSec = T01T419_A2242AlbSec[0] ;
         A33AlbProEst = T01T419_A33AlbProEst[0] ;
         A1243GuiRemCli = T01T419_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         pr_default.close(17);
         if ( A33AlbProEst == 2 )
         {
            edtAlbPObs_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbPObs_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
         }
         /* Using cursor T01T420 */
         pr_default.execute(18, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
         A1244GuiRemCln = T01T420_A1244GuiRemCln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
         pr_default.close(18);
      }
   }

   public void updateTablesN11T4121( )
   {
      /* Using cursor T01T421 */
      pr_default.execute(19, new Object[] {Byte.valueOf(A914AlbPObsCon), A396EmprCod, Long.valueOf(A30AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
   }

   public void endLevel1T4121( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(12);
      if ( AnyError == 0 )
      {
         beforeComplete1T4121( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "albaranes.albaranobservacion");
         if ( AnyError == 0 )
         {
            confirmValues1T40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "albaranes.albaranobservacion");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1T4121( )
   {
      /* Scan By routine */
      /* Using cursor T01T422 */
      pr_default.execute(20);
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A396EmprCod = T01T422_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01T422_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A915AlbPObsLin = T01T422_A915AlbPObsLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1T4121( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A396EmprCod = T01T422_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01T422_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A915AlbPObsLin = T01T422_A915AlbPObsLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
      }
   }

   public void scanEnd1T4121( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1T4121( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1T4121( )
   {
      /* Before Insert Rules */
      GXt_int6 = A915AlbPObsLin ;
      GXv_int7[0] = GXt_int6 ;
      new app.albaranes.albaranobservacion_proxid(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int7) ;
      albaranobservacion_impl.this.GXt_int6 = GXv_int7[0] ;
      A915AlbPObsLin = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
      A914AlbPObsCon = A915AlbPObsLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
   }

   public void beforeUpdate1T4121( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1T4121( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1T4121( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1T4121( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1T4121( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      cmbAlbEnvFtp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbEnvFtp.getEnabled(), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
      edtGuiRemCln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Enabled), 5, 0), true);
      edtAlbProfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Enabled), 5, 0), true);
      edtAlbPObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), true);
      edtAlbPObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1T4121( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1T40( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranes.albaranobservacion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14AlbPObsLin,2,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod","AlbPObsLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"AlbaranObservacion");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaranobservacion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z915AlbPObsLin", GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z916AlbPObs", GXutil.rtrim( Z916AlbPObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1253EmprGuiRem", GXutil.rtrim( Z1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( Z5805AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7101AlbLic", GXutil.rtrim( Z7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "Z34AlbProfch", localUtil.dtoc( Z34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2242AlbSec", GXutil.rtrim( Z2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( Z1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N916AlbPObs", GXutil.rtrim( A916AlbPObs));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV7AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPOBSLIN", GXutil.ltrim( localUtil.ntoc( AV14AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPOBSLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14AlbPObsLin), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBSCON", GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROEST", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRGUIREM", GXutil.rtrim( A1253EmprGuiRem));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSEC", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Objectcall", GXutil.rtrim( Dvpanel_tablealbaran_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Enabled", GXutil.booltostr( Dvpanel_tablealbaran_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Width", GXutil.rtrim( Dvpanel_tablealbaran_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autowidth", GXutil.booltostr( Dvpanel_tablealbaran_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autoheight", GXutil.booltostr( Dvpanel_tablealbaran_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Cls", GXutil.rtrim( Dvpanel_tablealbaran_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Title", GXutil.rtrim( Dvpanel_tablealbaran_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Collapsible", GXutil.booltostr( Dvpanel_tablealbaran_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Collapsed", GXutil.booltostr( Dvpanel_tablealbaran_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Showcollapseicon", GXutil.booltostr( Dvpanel_tablealbaran_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Iconposition", GXutil.rtrim( Dvpanel_tablealbaran_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEALBARAN_Autoscroll", GXutil.booltostr( Dvpanel_tablealbaran_Autoscroll));
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
      return formatLink("app.albaranes.albaranobservacion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14AlbPObsLin,2,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod","AlbPObsLin"})  ;
   }

   public String getPgmname( )
   {
      return "Albaranes.AlbaranObservacion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Guias / Observación", "") ;
   }

   public void initializeNonKey1T4121( )
   {
      A1253EmprGuiRem = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", A1253EmprGuiRem);
      A914AlbPObsCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A5805AlbEnvFtp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
      A7101AlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", A7101AlbLic);
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A1244GuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", A1244GuiRemCln);
      A34AlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      A2242AlbSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", A2242AlbSec);
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      A916AlbPObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A916AlbPObs", A916AlbPObs);
      Z916AlbPObs = "" ;
      Z1253EmprGuiRem = "" ;
      Z914AlbPObsCon = (byte)(0) ;
      Z5805AlbEnvFtp = (byte)(0) ;
      Z7101AlbLic = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z2242AlbSec = "" ;
      Z33AlbProEst = (byte)(0) ;
      Z1243GuiRemCli = 0 ;
   }

   public void initAll1T4121( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A915AlbPObsLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
      initializeNonKey1T4121( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211694741", true, true);
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
      httpContext.AddJavascriptSource("albaranes/albaranobservacion.js", "?20268211694741", false, true);
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
      edtEmprCod_Internalname = "EMPRCOD" ;
      lblTbngruia_Internalname = "TBNGRUIA" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTablealbaran_Internalname = "TABLEALBARAN" ;
      Dvpanel_tablealbaran_Internalname = "DVPANEL_TABLEALBARAN" ;
      edtAlbPObsLin_Internalname = "ALBPOBSLIN" ;
      edtAlbPObs_Internalname = "ALBPOBS" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
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
      Form.setCaption( httpContext.getMessage( "Guias / Observación", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbPObs_Jsonclick = "" ;
      edtAlbPObs_Enabled = 1 ;
      edtAlbPObsLin_Jsonclick = "" ;
      edtAlbPObsLin_Enabled = 0 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Observación", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Enabled = 0 ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 0 ;
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setEnabled( 0 );
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      Dvpanel_tablealbaran_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Iconposition = "Right" ;
      Dvpanel_tablealbaran_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Title = httpContext.getMessage( "Albarán", "") ;
      Dvpanel_tablealbaran_Cls = "PanelNoHeader" ;
      Dvpanel_tablealbaran_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablealbaran_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablealbaran_Width = "100%" ;
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

   public void gx6asaalbpobslin1T4121( byte AV14AlbPObsLin )
   {
      if ( ! (0==AV14AlbPObsLin) )
      {
         A915AlbPObsLin = AV14AlbPObsLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asaalbpobslin1T4121( String A396EmprCod ,
                                       long A30AlbProCod )
   {
      GXt_int6 = A915AlbPObsLin ;
      GXv_int7[0] = GXt_int6 ;
      new app.albaranes.albaranobservacion_proxid(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_int7) ;
      albaranobservacion_impl.this.GXt_int6 = GXv_int7[0] ;
      A915AlbPObsLin = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "A915AlbPObsLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A915AlbPObsLin), 2, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      cmbAlbEnvFtp.setName( "ALBENVFTP" );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.str( A5805AlbEnvFtp, 1, 0));
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01T418 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01T418_A407EmprNom[0] ;
      n407EmprNom = T01T418_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Albprocod( )
   {
      A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValue())) ;
      cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      /* Using cursor T01T419 */
      pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      Z1253EmprGuiRem = T01T419_A1253EmprGuiRem[0] ;
      Z914AlbPObsCon = T01T419_A914AlbPObsCon[0] ;
      Z5805AlbEnvFtp = T01T419_A5805AlbEnvFtp[0] ;
      Z7101AlbLic = T01T419_A7101AlbLic[0] ;
      Z34AlbProfch = T01T419_A34AlbProfch[0] ;
      Z2242AlbSec = T01T419_A2242AlbSec[0] ;
      Z33AlbProEst = T01T419_A33AlbProEst[0] ;
      Z1243GuiRemCli = T01T419_A1243GuiRemCli[0] ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1253EmprGuiRem = T01T419_A1253EmprGuiRem[0] ;
      A914AlbPObsCon = T01T419_A914AlbPObsCon[0] ;
      A5805AlbEnvFtp = T01T419_A5805AlbEnvFtp[0] ;
      cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      A7101AlbLic = T01T419_A7101AlbLic[0] ;
      A34AlbProfch = T01T419_A34AlbProfch[0] ;
      A2242AlbSec = T01T419_A2242AlbSec[0] ;
      A33AlbProEst = T01T419_A33AlbProEst[0] ;
      A1243GuiRemCli = T01T419_A1243GuiRemCli[0] ;
      pr_default.close(17);
      if ( A33AlbProEst == 2 )
      {
         edtAlbPObs_Enabled = 0 ;
      }
      else
      {
         edtAlbPObs_Enabled = 1 ;
      }
      if ( ( A33AlbProEst == 2 ) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Guia já faturou.", ""), 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
      }
      /* Using cursor T01T420 */
      pr_default.execute(18, new Object[] {A1253EmprGuiRem, Integer.valueOf(A1243GuiRemCli)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GuiRemCli", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GUIREMCLI");
         AnyError = (short)(1) ;
      }
      A1244GuiRemCln = T01T420_A1244GuiRemCln[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
         cmbAlbEnvFtp.setValue( GXutil.str( A5805AlbEnvFtp, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1253EmprGuiRem", GXutil.rtrim( A1253EmprGuiRem));
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5805AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
      cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A7101AlbLic", GXutil.rtrim( A7101AlbLic));
      httpContext.ajax_rsp_assign_attri("", false, "A34AlbProfch", localUtil.format(A34AlbProfch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A2242AlbSec", GXutil.rtrim( A2242AlbSec));
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1244GuiRemCln", GXutil.rtrim( A1244GuiRemCln));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV14AlbPObsLin',fld:'vALBPOBSLIN',pic:'Z9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV7AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV14AlbPObsLin',fld:'vALBPOBSLIN',pic:'Z9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121T42',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A914AlbPObsCon',fld:'ALBPOBSCON',pic:'Z9'},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''}]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A914AlbPObsCon',fld:'ALBPOBSCON',pic:'Z9'},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'edtAlbPObs_Enabled',ctrl:'ALBPOBS',prop:'Enabled'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''}]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBPOBSLIN","{handler:'valid_Albpobslin',iparms:[]");
      setEventMetadata("VALID_ALBPOBSLIN",",oparms:[]}");
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
      pr_default.close(16);
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV13EmprCod = "" ;
      Z396EmprCod = "" ;
      Z916AlbPObs = "" ;
      Z1253EmprGuiRem = "" ;
      Z7101AlbLic = "" ;
      Z34AlbProfch = GXutil.nullDate() ;
      Z2242AlbSec = "" ;
      N916AlbPObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1253EmprGuiRem = "" ;
      Gx_mode = "" ;
      AV13EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablealbaran = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTbngruia_Jsonclick = "" ;
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A916AlbPObs = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV18Pgmname = "" ;
      A7101AlbLic = "" ;
      A2242AlbSec = "" ;
      A407EmprNom = "" ;
      Dvpanel_tablealbaran_Objectcall = "" ;
      Dvpanel_tablealbaran_Class = "" ;
      Dvpanel_tablealbaran_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode121 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV10Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV12UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV15WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV16TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV17WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z1244GuiRemCln = "" ;
      T01T44_A407EmprNom = new String[] {""} ;
      T01T44_n407EmprNom = new boolean[] {false} ;
      T01T46_A1253EmprGuiRem = new String[] {""} ;
      T01T46_A914AlbPObsCon = new byte[1] ;
      T01T46_A5805AlbEnvFtp = new byte[1] ;
      T01T46_A7101AlbLic = new String[] {""} ;
      T01T46_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T46_A2242AlbSec = new String[] {""} ;
      T01T46_A33AlbProEst = new byte[1] ;
      T01T46_A1243GuiRemCli = new int[1] ;
      T01T47_A1244GuiRemCln = new String[] {""} ;
      T01T48_A1253EmprGuiRem = new String[] {""} ;
      T01T48_A915AlbPObsLin = new byte[1] ;
      T01T48_A914AlbPObsCon = new byte[1] ;
      T01T48_A407EmprNom = new String[] {""} ;
      T01T48_n407EmprNom = new boolean[] {false} ;
      T01T48_A5805AlbEnvFtp = new byte[1] ;
      T01T48_A7101AlbLic = new String[] {""} ;
      T01T48_A1244GuiRemCln = new String[] {""} ;
      T01T48_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T48_A2242AlbSec = new String[] {""} ;
      T01T48_A33AlbProEst = new byte[1] ;
      T01T48_A916AlbPObs = new String[] {""} ;
      T01T48_A396EmprCod = new String[] {""} ;
      T01T48_A30AlbProCod = new long[1] ;
      T01T48_A1243GuiRemCli = new int[1] ;
      T01T49_A407EmprNom = new String[] {""} ;
      T01T49_n407EmprNom = new boolean[] {false} ;
      T01T410_A1244GuiRemCln = new String[] {""} ;
      T01T411_A396EmprCod = new String[] {""} ;
      T01T411_A30AlbProCod = new long[1] ;
      T01T411_A915AlbPObsLin = new byte[1] ;
      T01T43_A915AlbPObsLin = new byte[1] ;
      T01T43_A916AlbPObs = new String[] {""} ;
      T01T43_A396EmprCod = new String[] {""} ;
      T01T43_A30AlbProCod = new long[1] ;
      T01T412_A915AlbPObsLin = new byte[1] ;
      T01T412_A396EmprCod = new String[] {""} ;
      T01T412_A30AlbProCod = new long[1] ;
      T01T413_A915AlbPObsLin = new byte[1] ;
      T01T413_A396EmprCod = new String[] {""} ;
      T01T413_A30AlbProCod = new long[1] ;
      T01T42_A915AlbPObsLin = new byte[1] ;
      T01T42_A916AlbPObs = new String[] {""} ;
      T01T42_A396EmprCod = new String[] {""} ;
      T01T42_A30AlbProCod = new long[1] ;
      T01T414_A1253EmprGuiRem = new String[] {""} ;
      T01T414_A914AlbPObsCon = new byte[1] ;
      T01T414_A5805AlbEnvFtp = new byte[1] ;
      T01T414_A7101AlbLic = new String[] {""} ;
      T01T414_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T414_A2242AlbSec = new String[] {""} ;
      T01T414_A33AlbProEst = new byte[1] ;
      T01T414_A1243GuiRemCli = new int[1] ;
      T01T418_A407EmprNom = new String[] {""} ;
      T01T418_n407EmprNom = new boolean[] {false} ;
      T01T419_A1253EmprGuiRem = new String[] {""} ;
      T01T419_A914AlbPObsCon = new byte[1] ;
      T01T419_A5805AlbEnvFtp = new byte[1] ;
      T01T419_A7101AlbLic = new String[] {""} ;
      T01T419_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      T01T419_A2242AlbSec = new String[] {""} ;
      T01T419_A33AlbProEst = new byte[1] ;
      T01T419_A1243GuiRemCli = new int[1] ;
      T01T420_A1244GuiRemCln = new String[] {""} ;
      T01T422_A396EmprCod = new String[] {""} ;
      T01T422_A30AlbProCod = new long[1] ;
      T01T422_A915AlbPObsLin = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int7 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranobservacion__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranobservacion__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranobservacion__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranobservacion__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranobservacion__default(),
         new Object[] {
             new Object[] {
            T01T42_A915AlbPObsLin, T01T42_A916AlbPObs, T01T42_A396EmprCod, T01T42_A30AlbProCod
            }
            , new Object[] {
            T01T43_A915AlbPObsLin, T01T43_A916AlbPObs, T01T43_A396EmprCod, T01T43_A30AlbProCod
            }
            , new Object[] {
            T01T44_A407EmprNom, T01T44_n407EmprNom
            }
            , new Object[] {
            T01T45_A1253EmprGuiRem, T01T45_A914AlbPObsCon, T01T45_A5805AlbEnvFtp, T01T45_A7101AlbLic, T01T45_A34AlbProfch, T01T45_A2242AlbSec, T01T45_A33AlbProEst, T01T45_A1243GuiRemCli
            }
            , new Object[] {
            T01T46_A1253EmprGuiRem, T01T46_A914AlbPObsCon, T01T46_A5805AlbEnvFtp, T01T46_A7101AlbLic, T01T46_A34AlbProfch, T01T46_A2242AlbSec, T01T46_A33AlbProEst, T01T46_A1243GuiRemCli
            }
            , new Object[] {
            T01T47_A1244GuiRemCln
            }
            , new Object[] {
            T01T48_A1253EmprGuiRem, T01T48_A915AlbPObsLin, T01T48_A914AlbPObsCon, T01T48_A407EmprNom, T01T48_n407EmprNom, T01T48_A5805AlbEnvFtp, T01T48_A7101AlbLic, T01T48_A1244GuiRemCln, T01T48_A34AlbProfch, T01T48_A2242AlbSec,
            T01T48_A33AlbProEst, T01T48_A916AlbPObs, T01T48_A396EmprCod, T01T48_A30AlbProCod, T01T48_A1243GuiRemCli
            }
            , new Object[] {
            T01T49_A407EmprNom, T01T49_n407EmprNom
            }
            , new Object[] {
            T01T410_A1244GuiRemCln
            }
            , new Object[] {
            T01T411_A396EmprCod, T01T411_A30AlbProCod, T01T411_A915AlbPObsLin
            }
            , new Object[] {
            T01T412_A915AlbPObsLin, T01T412_A396EmprCod, T01T412_A30AlbProCod
            }
            , new Object[] {
            T01T413_A915AlbPObsLin, T01T413_A396EmprCod, T01T413_A30AlbProCod
            }
            , new Object[] {
            T01T414_A1253EmprGuiRem, T01T414_A914AlbPObsCon, T01T414_A5805AlbEnvFtp, T01T414_A7101AlbLic, T01T414_A34AlbProfch, T01T414_A2242AlbSec, T01T414_A33AlbProEst, T01T414_A1243GuiRemCli
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01T418_A407EmprNom, T01T418_n407EmprNom
            }
            , new Object[] {
            T01T419_A1253EmprGuiRem, T01T419_A914AlbPObsCon, T01T419_A5805AlbEnvFtp, T01T419_A7101AlbLic, T01T419_A34AlbProfch, T01T419_A2242AlbSec, T01T419_A33AlbProEst, T01T419_A1243GuiRemCli
            }
            , new Object[] {
            T01T420_A1244GuiRemCln
            }
            , new Object[] {
            }
            , new Object[] {
            T01T422_A396EmprCod, T01T422_A30AlbProCod, T01T422_A915AlbPObsLin
            }
         }
      );
      AV18Pgmname = "Albaranes.AlbaranObservacion" ;
   }

   private byte wcpOAV14AlbPObsLin ;
   private byte Z915AlbPObsLin ;
   private byte Z914AlbPObsCon ;
   private byte Z5805AlbEnvFtp ;
   private byte Z33AlbProEst ;
   private byte GxWebError ;
   private byte AV14AlbPObsLin ;
   private byte nKeyPressed ;
   private byte A5805AlbEnvFtp ;
   private byte A915AlbPObsLin ;
   private byte A914AlbPObsCon ;
   private byte A33AlbProEst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound121 ;
   private short nIsDirty_121 ;
   private int Z1243GuiRemCli ;
   private int A1243GuiRemCli ;
   private int trnEnded ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtGuiRemCli_Enabled ;
   private int edtGuiRemCln_Enabled ;
   private int edtAlbProfch_Enabled ;
   private int edtAlbPObsLin_Enabled ;
   private int edtAlbPObs_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long wcpOAV7AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long AV7AlbProCod ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV13EmprCod ;
   private String Z396EmprCod ;
   private String Z916AlbPObs ;
   private String Z1253EmprGuiRem ;
   private String Z7101AlbLic ;
   private String Z2242AlbSec ;
   private String N916AlbPObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1253EmprGuiRem ;
   private String Gx_mode ;
   private String AV13EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tablealbaran_Width ;
   private String Dvpanel_tablealbaran_Cls ;
   private String Dvpanel_tablealbaran_Title ;
   private String Dvpanel_tablealbaran_Iconposition ;
   private String Dvpanel_tablealbaran_Internalname ;
   private String divTablealbaran_Internalname ;
   private String TempTags ;
   private String edtEmprCod_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String lblTbngruia_Internalname ;
   private String lblTbngruia_Jsonclick ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbProfch_Jsonclick ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String edtAlbPObsLin_Internalname ;
   private String edtAlbPObsLin_Jsonclick ;
   private String edtAlbPObs_Internalname ;
   private String A916AlbPObs ;
   private String edtAlbPObs_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV18Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String A7101AlbLic ;
   private String A2242AlbSec ;
   private String A407EmprNom ;
   private String Dvpanel_tablealbaran_Objectcall ;
   private String Dvpanel_tablealbaran_Class ;
   private String Dvpanel_tablealbaran_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode121 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV10Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV12UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z1244GuiRemCln ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z34AlbProfch ;
   private java.util.Date A34AlbProfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tablealbaran_Autowidth ;
   private boolean Dvpanel_tablealbaran_Autoheight ;
   private boolean Dvpanel_tablealbaran_Collapsible ;
   private boolean Dvpanel_tablealbaran_Collapsed ;
   private boolean Dvpanel_tablealbaran_Showcollapseicon ;
   private boolean Dvpanel_tablealbaran_Autoscroll ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tablealbaran_Enabled ;
   private boolean Dvpanel_tablealbaran_Showheader ;
   private boolean Dvpanel_tablealbaran_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV17WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablealbaran ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbEnvFtp ;
   private IDataStoreProvider pr_default ;
   private String[] T01T44_A407EmprNom ;
   private boolean[] T01T44_n407EmprNom ;
   private String[] T01T46_A1253EmprGuiRem ;
   private byte[] T01T46_A914AlbPObsCon ;
   private byte[] T01T46_A5805AlbEnvFtp ;
   private String[] T01T46_A7101AlbLic ;
   private java.util.Date[] T01T46_A34AlbProfch ;
   private String[] T01T46_A2242AlbSec ;
   private byte[] T01T46_A33AlbProEst ;
   private int[] T01T46_A1243GuiRemCli ;
   private String[] T01T47_A1244GuiRemCln ;
   private String[] T01T48_A1253EmprGuiRem ;
   private byte[] T01T48_A915AlbPObsLin ;
   private byte[] T01T48_A914AlbPObsCon ;
   private String[] T01T48_A407EmprNom ;
   private boolean[] T01T48_n407EmprNom ;
   private byte[] T01T48_A5805AlbEnvFtp ;
   private String[] T01T48_A7101AlbLic ;
   private String[] T01T48_A1244GuiRemCln ;
   private java.util.Date[] T01T48_A34AlbProfch ;
   private String[] T01T48_A2242AlbSec ;
   private byte[] T01T48_A33AlbProEst ;
   private String[] T01T48_A916AlbPObs ;
   private String[] T01T48_A396EmprCod ;
   private long[] T01T48_A30AlbProCod ;
   private int[] T01T48_A1243GuiRemCli ;
   private String[] T01T49_A407EmprNom ;
   private boolean[] T01T49_n407EmprNom ;
   private String[] T01T410_A1244GuiRemCln ;
   private String[] T01T411_A396EmprCod ;
   private long[] T01T411_A30AlbProCod ;
   private byte[] T01T411_A915AlbPObsLin ;
   private byte[] T01T43_A915AlbPObsLin ;
   private String[] T01T43_A916AlbPObs ;
   private String[] T01T43_A396EmprCod ;
   private long[] T01T43_A30AlbProCod ;
   private byte[] T01T412_A915AlbPObsLin ;
   private String[] T01T412_A396EmprCod ;
   private long[] T01T412_A30AlbProCod ;
   private byte[] T01T413_A915AlbPObsLin ;
   private String[] T01T413_A396EmprCod ;
   private long[] T01T413_A30AlbProCod ;
   private byte[] T01T42_A915AlbPObsLin ;
   private String[] T01T42_A916AlbPObs ;
   private String[] T01T42_A396EmprCod ;
   private long[] T01T42_A30AlbProCod ;
   private String[] T01T414_A1253EmprGuiRem ;
   private byte[] T01T414_A914AlbPObsCon ;
   private byte[] T01T414_A5805AlbEnvFtp ;
   private String[] T01T414_A7101AlbLic ;
   private java.util.Date[] T01T414_A34AlbProfch ;
   private String[] T01T414_A2242AlbSec ;
   private byte[] T01T414_A33AlbProEst ;
   private int[] T01T414_A1243GuiRemCli ;
   private String[] T01T418_A407EmprNom ;
   private boolean[] T01T418_n407EmprNom ;
   private String[] T01T419_A1253EmprGuiRem ;
   private byte[] T01T419_A914AlbPObsCon ;
   private byte[] T01T419_A5805AlbEnvFtp ;
   private String[] T01T419_A7101AlbLic ;
   private java.util.Date[] T01T419_A34AlbProfch ;
   private String[] T01T419_A2242AlbSec ;
   private byte[] T01T419_A33AlbProEst ;
   private int[] T01T419_A1243GuiRemCli ;
   private String[] T01T420_A1244GuiRemCln ;
   private String[] T01T422_A396EmprCod ;
   private long[] T01T422_A30AlbProCod ;
   private byte[] T01T422_A915AlbPObsLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01T45_A1253EmprGuiRem ;
   private byte[] T01T45_A914AlbPObsCon ;
   private byte[] T01T45_A5805AlbEnvFtp ;
   private String[] T01T45_A7101AlbLic ;
   private java.util.Date[] T01T45_A34AlbProfch ;
   private String[] T01T45_A2242AlbSec ;
   private byte[] T01T45_A33AlbProEst ;
   private int[] T01T45_A1243GuiRemCli ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV15WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV16TrnContext ;
}

final  class albaranobservacion__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranobservacion__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranobservacion__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranobservacion__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albaranobservacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01T42", "SELECT AlbPObsLin, AlbPObs, EmprCod, AlbProCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?  FOR UPDATE OF AlbPObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T43", "SELECT AlbPObsLin, AlbPObs, EmprCod, AlbProCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T44", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T45", "SELECT EmprGuiRem, AlbPObsCon, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, AlbProEst, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbPObsCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T46", "SELECT EmprGuiRem, AlbPObsCon, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, AlbProEst, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T47", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T48", "SELECT /*+ FIRST_ROWS(100) */ T3.EmprGuiRem AS EmprGuiRem, TM1.AlbPObsLin, T3.AlbPObsCon, T2.EmprNom, T3.AlbEnvFtp, T3.AlbLic, T4.CliNom AS GuiRemCln, T3.AlbProfch, T3.AlbSec, T3.AlbProEst, TM1.AlbPObs, TM1.EmprCod, TM1.AlbProCod, T3.GuiRemCli AS GuiRemCli FROM (((TXPOBSALB TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbProCod = TM1.AlbProCod) INNER JOIN TXPCLIENT T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli) WHERE TM1.AlbPObsLin = ? and TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.AlbPObsLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T49", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T410", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T411", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T412", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AlbPObsLin, EmprCod, AlbProCod FROM TXPOBSALB WHERE ( AlbPObsLin > ? or AlbPObsLin = ? and EmprCod > ? or EmprCod = ? and AlbPObsLin = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod, AlbPObsLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T413", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ AlbPObsLin, EmprCod, AlbProCod FROM TXPOBSALB WHERE ( AlbPObsLin < ? or AlbPObsLin = ? and EmprCod < ? or EmprCod = ? and AlbPObsLin = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC, AlbPObsLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01T414", "SELECT EmprGuiRem, AlbPObsCon, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, AlbProEst, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbPObsCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T415", "INSERT INTO TXPOBSALB(AlbPObsLin, AlbPObs, EmprCod, AlbProCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("T01T416", "UPDATE TXPOBSALB SET AlbPObs=?  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("T01T417", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new ForEachCursor("T01T418", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T419", "SELECT EmprGuiRem, AlbPObsCon, AlbEnvFtp, AlbLic, AlbProfch, AlbSec, AlbProEst, GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01T420", "SELECT CliNom AS GuiRemCln FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01T421", "UPDATE TXPCALPRD SET AlbPObsCon=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01T422", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB ORDER BY EmprCod, AlbProCod, AlbPObsLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 20);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 50);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((long[]) buf[13])[0] = rslt.getLong(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 11 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 10 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 50);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

