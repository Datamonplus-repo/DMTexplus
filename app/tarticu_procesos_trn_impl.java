package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tarticu_procesos_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"") == 0 )
      {
         AV7EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa104121UI11( AV7EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = httpContext.GetPar( "ArtCod") ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A252CliCod, A65ArtCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         n758ProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A758ProCod) ;
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
            AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
            AV9ArtCod = httpContext.GetPar( "ArtCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ArtCod", AV9ArtCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ArtCod, ""))));
            AV10ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10ProCod", AV10ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ProCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Proceso", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tarticu_procesos_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tarticu_procesos_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tarticu_procesos_trn_impl.class ));
   }

   public tarticu_procesos_trn_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkProAct = UIFactory.getCheckbox(this);
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
      A10412ProAct = ((GXutil.strcmp(GXutil.rtrim( A10412ProAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10412ProAct", A10412ProAct);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtCod_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtCod_Internalname, GXutil.rtrim( A65ArtCod), GXutil.rtrim( localUtil.format( A65ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtCod_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtArtDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtArtDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtArtDsc_Internalname, GXutil.rtrim( A69ArtDsc), GXutil.rtrim( localUtil.format( A69ArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtArtDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtArtDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos_Trn.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divProact_cell_Internalname, 1, 0, "px", 0, "px", divProact_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", chkProAct.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkProAct.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkProAct.getInternalname(), httpContext.getMessage( "Activo?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkProAct.getInternalname(), A10412ProAct, "", httpContext.getMessage( "Activo?", ""), chkProAct.getVisible(), chkProAct.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(58, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,58);\"");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProUserA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProUserA_Internalname, httpContext.getMessage( "Usuario Alta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProUserA_Internalname, GXutil.rtrim( A10553ProUserA), GXutil.rtrim( localUtil.format( A10553ProUserA, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProUserA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProUserA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProFecA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProFecA_Internalname, httpContext.getMessage( "Fecha Alta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtProFecA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProFecA_Internalname, localUtil.ttoc( A10554ProFecA, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10554ProFecA, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProFecA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProFecA_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtProFecA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtProFecA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Tarticu_Procesos_Trn.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProUserM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProUserM_Internalname, httpContext.getMessage( "Usuario Modif", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProUserM_Internalname, GXutil.rtrim( A10555ProUserM), GXutil.rtrim( localUtil.format( A10555ProUserM, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProUserM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProUserM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProFecM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProFecM_Internalname, httpContext.getMessage( "Fecha Modif", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtProFecM_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProFecM_Internalname, localUtil.ttoc( A10556ProFecM, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10556ProFecM, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProFecM_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProFecM_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtProFecM_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtProFecM_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Tarticu_Procesos_Trn.htm");
      httpContext.writeTextNL( "</div>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_Procesos_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tarticu_Procesos_Trn.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV15Pgmname), GXutil.rtrim( localUtil.format( AV15Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tarticu_Procesos_Trn.htm");
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
      e111UI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z65ArtCod = httpContext.cgiGet( "Z65ArtCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z10555ProUserM = httpContext.cgiGet( "Z10555ProUserM") ;
            Z10556ProFecM = localUtil.ctot( httpContext.cgiGet( "Z10556ProFecM"), 0) ;
            Z10026DscCFa = httpContext.cgiGet( "Z10026DscCFa") ;
            Z10412ProAct = httpContext.cgiGet( "Z10412ProAct") ;
            Z10553ProUserA = httpContext.cgiGet( "Z10553ProUserA") ;
            Z10554ProFecA = localUtil.ctot( httpContext.cgiGet( "Z10554ProFecA"), 0) ;
            Z11272ProFabs = localUtil.ctond( httpContext.cgiGet( "Z11272ProFabs")) ;
            Z12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12141ProSta"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12142ProStFec = localUtil.ctot( httpContext.cgiGet( "Z12142ProStFec"), 0) ;
            A10026DscCFa = httpContext.cgiGet( "Z10026DscCFa") ;
            A11272ProFabs = localUtil.ctond( httpContext.cgiGet( "Z11272ProFabs")) ;
            A12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12141ProSta"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12142ProStFec = localUtil.ctot( httpContext.cgiGet( "Z12142ProStFec"), 0) ;
            O759ProDsc = httpContext.cgiGet( "O759ProDsc") ;
            O10412ProAct = httpContext.cgiGet( "O10412ProAct") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9ArtCod = httpContext.cgiGet( "vARTCOD") ;
            AV10ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV14UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            A10026DscCFa = httpContext.cgiGet( "DSCCFA") ;
            A11272ProFabs = localUtil.ctond( httpContext.cgiGet( "PROFABS")) ;
            A12141ProSta = (byte)(localUtil.ctol( httpContext.cgiGet( "PROSTA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12142ProStFec = localUtil.ctot( httpContext.cgiGet( "PROSTFEC"), 0) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A5289ProProvi = httpContext.cgiGet( "PROPROVI") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A65ArtCod = httpContext.cgiGet( edtArtCod_Internalname) ;
            n65ArtCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A69ArtDsc = httpContext.cgiGet( edtArtDsc_Internalname) ;
            n69ArtDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            n758ProCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A10412ProAct = ((GXutil.strcmp(httpContext.cgiGet( chkProAct.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10412ProAct", A10412ProAct);
            A10553ProUserA = httpContext.cgiGet( edtProUserA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10553ProUserA", A10553ProUserA);
            A10554ProFecA = localUtil.ctot( httpContext.cgiGet( edtProFecA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10554ProFecA", localUtil.ttoc( A10554ProFecA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A10555ProUserM = httpContext.cgiGet( edtProUserM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10555ProUserM", A10555ProUserM);
            A10556ProFecM = localUtil.ctot( httpContext.cgiGet( edtProFecM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10556ProFecM", localUtil.ttoc( A10556ProFecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV15Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Tarticu_Procesos_Trn");
            A10553ProUserA = httpContext.cgiGet( edtProUserA_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10553ProUserA", A10553ProUserA);
            forbiddenHiddens.add("ProUserA", GXutil.rtrim( localUtil.format( A10553ProUserA, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("DscCFa", GXutil.rtrim( localUtil.format( A10026DscCFa, "")));
            A10554ProFecA = localUtil.ctot( httpContext.cgiGet( edtProFecA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10554ProFecA", localUtil.ttoc( A10554ProFecA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("ProFecA", localUtil.format( A10554ProFecA, "99/99/99 99:99"));
            forbiddenHiddens.add("ProFabs", localUtil.format( A11272ProFabs, "ZZ9.99"));
            forbiddenHiddens.add("ProSta", localUtil.format( DecimalUtil.doubleToDec(A12141ProSta), "9"));
            forbiddenHiddens.add("ProStFec", localUtil.format( A12142ProStFec, "99/99/99 99:99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tarticu_procesos_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = httpContext.GetPar( "ArtCod") ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = httpContext.GetPar( "ProCod") ;
               n758ProCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
                  sMode11 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode11 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound11 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UI0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
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
                        e111UI2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UI2 ();
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
         e121UI2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UI11( ) ;
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
         disableAttributes1UI11( ) ;
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

   public void confirm_1UI0( )
   {
      beforeValidate1UI11( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UI11( ) ;
         }
         else
         {
            checkExtendedTable1UI11( ) ;
            closeExtendedTableCursors1UI11( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UI0( )
   {
   }

   public void e111UI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tarticu_procesos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV17Emprnom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      tarticu_procesos_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      tarticu_procesos_trn_impl.this.AV17Emprnom = GXv_char3[0] ;
      tarticu_procesos_trn_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprnom", AV17Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV14UsurCod", AV14UsurCod);
      GXv_SdtWWPContext5[0] = AV11WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV11WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV12TrnContext.fromxml(AV13WebSession.getValue("TrnContext"), null, null);
   }

   public void e121UI2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      chkProAct.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "Visible", GXutil.ltrimstr( chkProAct.getVisible(), 5, 0), true);
      divProact_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divProact_cell_Internalname, "Class", divProact_cell_Class, true);
   }

   public void zm1UI11( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10555ProUserM = T01UI3_A10555ProUserM[0] ;
            Z10556ProFecM = T01UI3_A10556ProFecM[0] ;
            Z10026DscCFa = T01UI3_A10026DscCFa[0] ;
            Z10412ProAct = T01UI3_A10412ProAct[0] ;
            Z10553ProUserA = T01UI3_A10553ProUserA[0] ;
            Z10554ProFecA = T01UI3_A10554ProFecA[0] ;
            Z11272ProFabs = T01UI3_A11272ProFabs[0] ;
            Z12141ProSta = T01UI3_A12141ProSta[0] ;
            Z12142ProStFec = T01UI3_A12142ProStFec[0] ;
         }
         else
         {
            Z10555ProUserM = A10555ProUserM ;
            Z10556ProFecM = A10556ProFecM ;
            Z10026DscCFa = A10026DscCFa ;
            Z10412ProAct = A10412ProAct ;
            Z10553ProUserA = A10553ProUserA ;
            Z10554ProFecA = A10554ProFecA ;
            Z11272ProFabs = A11272ProFabs ;
            Z12141ProSta = A12141ProSta ;
            Z12142ProStFec = A12142ProStFec ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z10555ProUserM = A10555ProUserM ;
         Z10556ProFecM = A10556ProFecM ;
         Z10026DscCFa = A10026DscCFa ;
         Z10412ProAct = A10412ProAct ;
         Z10553ProUserA = A10553ProUserA ;
         Z10554ProFecA = A10554ProFecA ;
         Z11272ProFabs = A11272ProFabs ;
         Z12141ProSta = A12141ProSta ;
         Z12142ProStFec = A12142ProStFec ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z69ArtDsc = A69ArtDsc ;
         Z759ProDsc = A759ProDsc ;
         Z5289ProProvi = A5289ProProvi ;
      }
   }

   public void standaloneNotModal( )
   {
      edtProUserA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), true);
      edtProFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), true);
      edtProUserM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), true);
      edtProFecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), true);
      AV15Pgmname = "Tarticu_Procesos_Trn" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      edtProUserA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), true);
      edtProFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), true);
      edtProUserM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), true);
      edtProFecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UI4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UI4_A407EmprNom[0] ;
      n407EmprNom = T01UI4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int7) ;
      tarticu_procesos_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      chkProAct.setVisible( ((GXt_int6==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "Visible", GXutil.ltrimstr( chkProAct.getVisible(), 5, 0), true);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int7) ;
      tarticu_procesos_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      if ( ! ( ( GXt_int6 == 1 ) ) )
      {
         divProact_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divProact_cell_Internalname, "Class", divProact_cell_Class, true);
      }
      else
      {
         GXt_int6 = (byte)(0) ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int7) ;
         tarticu_procesos_trn_impl.this.GXt_int6 = GXv_int7[0] ;
         if ( GXt_int6 == 1 )
         {
            divProact_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divProact_cell_Internalname, "Class", divProact_cell_Class, true);
         }
      }
      if ( ! (0==AV8CliCod) )
      {
         A252CliCod = AV8CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV8CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         A65ArtCod = AV9ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      }
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      else
      {
         edtArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         edtArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10ProCod)==0) )
      {
         A758ProCod = AV10ProCod ;
         n758ProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV10ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
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
         /* Using cursor T01UI5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01UI5_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(3);
         /* Using cursor T01UI6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         A69ArtDsc = T01UI6_A69ArtDsc[0] ;
         n69ArtDsc = T01UI6_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(4);
         /* Using cursor T01UI7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
         A759ProDsc = T01UI7_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A5289ProProvi = T01UI7_A5289ProProvi[0] ;
         O759ProDsc = A759ProDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(5);
      }
   }

   public void load1UI11( )
   {
      /* Using cursor T01UI8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A10555ProUserM = T01UI8_A10555ProUserM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10555ProUserM", A10555ProUserM);
         A10556ProFecM = T01UI8_A10556ProFecM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10556ProFecM", localUtil.ttoc( A10556ProFecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A279CliNom = T01UI8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A407EmprNom = T01UI8_A407EmprNom[0] ;
         n407EmprNom = T01UI8_n407EmprNom[0] ;
         A69ArtDsc = T01UI8_A69ArtDsc[0] ;
         n69ArtDsc = T01UI8_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         A759ProDsc = T01UI8_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A5289ProProvi = T01UI8_A5289ProProvi[0] ;
         A10026DscCFa = T01UI8_A10026DscCFa[0] ;
         A10412ProAct = T01UI8_A10412ProAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10412ProAct", A10412ProAct);
         A10553ProUserA = T01UI8_A10553ProUserA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10553ProUserA", A10553ProUserA);
         A10554ProFecA = T01UI8_A10554ProFecA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10554ProFecA", localUtil.ttoc( A10554ProFecA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11272ProFabs = T01UI8_A11272ProFabs[0] ;
         A12141ProSta = T01UI8_A12141ProSta[0] ;
         A12142ProStFec = T01UI8_A12142ProStFec[0] ;
         zm1UI11( -21) ;
      }
      pr_default.close(6);
      onLoadActions1UI11( ) ;
   }

   public void onLoadActions1UI11( )
   {
      O759ProDsc = A759ProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
   }

   public void checkExtendedTable1UI11( )
   {
      nIsDirty_11 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( ( GXutil.strcmp(A10412ProAct, "S") == 0 ) || ( GXutil.strcmp(A10412ProAct, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Activo?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PROACT");
         AnyError = (short)(1) ;
         GX_FocusControl = chkProAct.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01UI5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01UI5_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor T01UI6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01UI6_A69ArtDsc[0] ;
      n69ArtDsc = T01UI6_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      pr_default.close(4);
      /* Using cursor T01UI7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01UI7_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A5289ProProvi = T01UI7_A5289ProProvi[0] ;
      nIsDirty_11 = (short)(1) ;
      O759ProDsc = A759ProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1UI11( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_23( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01UI9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01UI9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_24( String A396EmprCod ,
                          int A252CliCod ,
                          String A65ArtCod )
   {
      /* Using cursor T01UI10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A69ArtDsc = T01UI10_A69ArtDsc[0] ;
      n69ArtDsc = T01UI10_n69ArtDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A69ArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_25( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01UI11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01UI11_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A5289ProProvi = T01UI11_A5289ProProvi[0] ;
      O759ProDsc = A759ProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5289ProProvi))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1UI11( )
   {
      /* Using cursor T01UI12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound11 = (short)(1) ;
      }
      else
      {
         RcdFound11 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UI11( 21) ;
         RcdFound11 = (short)(1) ;
         A10555ProUserM = T01UI3_A10555ProUserM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10555ProUserM", A10555ProUserM);
         A10556ProFecM = T01UI3_A10556ProFecM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10556ProFecM", localUtil.ttoc( A10556ProFecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10026DscCFa = T01UI3_A10026DscCFa[0] ;
         A10412ProAct = T01UI3_A10412ProAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10412ProAct", A10412ProAct);
         A10553ProUserA = T01UI3_A10553ProUserA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10553ProUserA", A10553ProUserA);
         A10554ProFecA = T01UI3_A10554ProFecA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10554ProFecA", localUtil.ttoc( A10554ProFecA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11272ProFabs = T01UI3_A11272ProFabs[0] ;
         A12141ProSta = T01UI3_A12141ProSta[0] ;
         A12142ProStFec = T01UI3_A12142ProStFec[0] ;
         A396EmprCod = T01UI3_A396EmprCod[0] ;
         A252CliCod = T01UI3_A252CliCod[0] ;
         n252CliCod = T01UI3_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01UI3_A65ArtCod[0] ;
         n65ArtCod = T01UI3_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01UI3_A758ProCod[0] ;
         n758ProCod = T01UI3_n758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         O10412ProAct = A10412ProAct ;
         httpContext.ajax_rsp_assign_attri("", false, "A10412ProAct", A10412ProAct);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z65ArtCod = A65ArtCod ;
         Z758ProCod = A758ProCod ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UI11( ) ;
         if ( AnyError == 1 )
         {
            RcdFound11 = (short)(0) ;
            initializeNonKey1UI11( ) ;
         }
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound11 = (short)(0) ;
         initializeNonKey1UI11( ) ;
         sMode11 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode11 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UI11( ) ;
      if ( RcdFound11 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T01UI13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01UI13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UI13_A252CliCod[0] < A252CliCod ) || ( T01UI13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01UI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UI13_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01UI13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01UI13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01UI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UI13_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01UI13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UI13_A252CliCod[0] > A252CliCod ) || ( T01UI13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01UI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UI13_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01UI13_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01UI13_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01UI13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UI13_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            A396EmprCod = T01UI13_A396EmprCod[0] ;
            A252CliCod = T01UI13_A252CliCod[0] ;
            n252CliCod = T01UI13_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01UI13_A65ArtCod[0] ;
            n65ArtCod = T01UI13_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = T01UI13_A758ProCod[0] ;
            n758ProCod = T01UI13_n758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound11 = (short)(0) ;
      /* Using cursor T01UI14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01UI14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UI14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UI14_A252CliCod[0] > A252CliCod ) || ( T01UI14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01UI14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UI14_A65ArtCod[0], A65ArtCod) > 0 ) || ( GXutil.strcmp(T01UI14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01UI14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01UI14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UI14_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01UI14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UI14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UI14_A252CliCod[0] < A252CliCod ) || ( T01UI14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01UI14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UI14_A65ArtCod[0], A65ArtCod) < 0 ) || ( GXutil.strcmp(T01UI14_A65ArtCod[0], A65ArtCod) == 0 ) && ( T01UI14_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01UI14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UI14_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            A396EmprCod = T01UI14_A396EmprCod[0] ;
            A252CliCod = T01UI14_A252CliCod[0] ;
            n252CliCod = T01UI14_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A65ArtCod = T01UI14_A65ArtCod[0] ;
            n65ArtCod = T01UI14_n65ArtCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
            A758ProCod = T01UI14_A758ProCod[0] ;
            n758ProCod = T01UI14_n758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound11 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UI11( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UI11( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound11 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A65ArtCod = Z65ArtCod ;
               n65ArtCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
               A758ProCod = Z758ProCod ;
               n758ProCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UI11( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UI11( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UI11( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A65ArtCod, Z65ArtCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = Z65ArtCod ;
         n65ArtCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = Z758ProCod ;
         n758ProCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UI11( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10555ProUserM, T01UI2_A10555ProUserM[0]) != 0 ) || !( GXutil.dateCompare(Z10556ProFecM, T01UI2_A10556ProFecM[0]) ) || ( GXutil.strcmp(Z10026DscCFa, T01UI2_A10026DscCFa[0]) != 0 ) || ( GXutil.strcmp(Z10412ProAct, T01UI2_A10412ProAct[0]) != 0 ) || ( GXutil.strcmp(Z10553ProUserA, T01UI2_A10553ProUserA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10554ProFecA, T01UI2_A10554ProFecA[0]) ) || ( DecimalUtil.compareTo(Z11272ProFabs, T01UI2_A11272ProFabs[0]) != 0 ) || ( Z12141ProSta != T01UI2_A12141ProSta[0] ) || !( GXutil.dateCompare(Z12142ProStFec, T01UI2_A12142ProStFec[0]) ) )
         {
            if ( GXutil.strcmp(Z10555ProUserM, T01UI2_A10555ProUserM[0]) != 0 )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"ProUserM");
               GXutil.writeLogRaw("Old: ",Z10555ProUserM);
               GXutil.writeLogRaw("Current: ",T01UI2_A10555ProUserM[0]);
            }
            if ( !( GXutil.dateCompare(Z10556ProFecM, T01UI2_A10556ProFecM[0]) ) )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"ProFecM");
               GXutil.writeLogRaw("Old: ",Z10556ProFecM);
               GXutil.writeLogRaw("Current: ",T01UI2_A10556ProFecM[0]);
            }
            if ( GXutil.strcmp(Z10026DscCFa, T01UI2_A10026DscCFa[0]) != 0 )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"DscCFa");
               GXutil.writeLogRaw("Old: ",Z10026DscCFa);
               GXutil.writeLogRaw("Current: ",T01UI2_A10026DscCFa[0]);
            }
            if ( GXutil.strcmp(Z10412ProAct, T01UI2_A10412ProAct[0]) != 0 )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"ProAct");
               GXutil.writeLogRaw("Old: ",Z10412ProAct);
               GXutil.writeLogRaw("Current: ",T01UI2_A10412ProAct[0]);
            }
            if ( GXutil.strcmp(Z10553ProUserA, T01UI2_A10553ProUserA[0]) != 0 )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"ProUserA");
               GXutil.writeLogRaw("Old: ",Z10553ProUserA);
               GXutil.writeLogRaw("Current: ",T01UI2_A10553ProUserA[0]);
            }
            if ( !( GXutil.dateCompare(Z10554ProFecA, T01UI2_A10554ProFecA[0]) ) )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"ProFecA");
               GXutil.writeLogRaw("Old: ",Z10554ProFecA);
               GXutil.writeLogRaw("Current: ",T01UI2_A10554ProFecA[0]);
            }
            if ( DecimalUtil.compareTo(Z11272ProFabs, T01UI2_A11272ProFabs[0]) != 0 )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"ProFabs");
               GXutil.writeLogRaw("Old: ",Z11272ProFabs);
               GXutil.writeLogRaw("Current: ",T01UI2_A11272ProFabs[0]);
            }
            if ( Z12141ProSta != T01UI2_A12141ProSta[0] )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"ProSta");
               GXutil.writeLogRaw("Old: ",Z12141ProSta);
               GXutil.writeLogRaw("Current: ",T01UI2_A12141ProSta[0]);
            }
            if ( !( GXutil.dateCompare(Z12142ProStFec, T01UI2_A12142ProStFec[0]) ) )
            {
               GXutil.writeLogln("tarticu_procesos_trn:[seudo value changed for attri]"+"ProStFec");
               GXutil.writeLogRaw("Old: ",Z12142ProStFec);
               GXutil.writeLogRaw("Current: ",T01UI2_A12142ProStFec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPARTLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UI11( )
   {
      beforeValidate1UI11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UI11( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UI11( 0) ;
         checkOptimisticConcurrency1UI11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UI11( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UI11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UI15 */
                  pr_default.execute(13, new Object[] {A10555ProUserM, A10556ProFecM, A10026DscCFa, A10412ProAct, A10553ProUserA, A10554ProFecA, A11272ProFabs, Byte.valueOf(A12141ProSta), A12142ProStFec, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1UI0( ) ;
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
            load1UI11( ) ;
         }
         endLevel1UI11( ) ;
      }
      closeExtendedTableCursors1UI11( ) ;
   }

   public void update1UI11( )
   {
      beforeValidate1UI11( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UI11( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UI11( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UI11( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UI11( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UI16 */
                  pr_default.execute(14, new Object[] {A10555ProUserM, A10556ProFecM, A10026DscCFa, A10412ProAct, A10553ProUserA, A10554ProFecA, A11272ProFabs, Byte.valueOf(A12141ProSta), A12142ProStFec, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPARTLIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UI11( ) ;
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
         endLevel1UI11( ) ;
      }
      closeExtendedTableCursors1UI11( ) ;
   }

   public void deferredUpdate1UI11( )
   {
   }

   public void delete( )
   {
      beforeValidate1UI11( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UI11( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UI11( ) ;
         afterConfirm1UI11( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UI11( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UI17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
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
      sMode11 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UI11( ) ;
      Gx_mode = sMode11 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UI11( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UI18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01UI18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
         /* Using cursor T01UI19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
         A69ArtDsc = T01UI19_A69ArtDsc[0] ;
         n69ArtDsc = T01UI19_n69ArtDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
         pr_default.close(17);
         /* Using cursor T01UI20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
         A759ProDsc = T01UI20_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A5289ProProvi = T01UI20_A5289ProProvi[0] ;
         pr_default.close(18);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UI21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01UI22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPFMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01UI23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARART", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01UI24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos p/Modelo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01UI25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod, Boolean.valueOf(n758ProCod), A758ProCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Cabezal de parametro", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void endLevel1UI11( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UI11( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tarticu_procesos_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tarticu_procesos_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UI11( )
   {
      /* Scan By routine */
      /* Using cursor T01UI26 */
      pr_default.execute(24);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A396EmprCod = T01UI26_A396EmprCod[0] ;
         A252CliCod = T01UI26_A252CliCod[0] ;
         n252CliCod = T01UI26_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01UI26_A65ArtCod[0] ;
         n65ArtCod = T01UI26_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01UI26_A758ProCod[0] ;
         n758ProCod = T01UI26_n758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UI11( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound11 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound11 = (short)(1) ;
         A396EmprCod = T01UI26_A396EmprCod[0] ;
         A252CliCod = T01UI26_A252CliCod[0] ;
         n252CliCod = T01UI26_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A65ArtCod = T01UI26_A65ArtCod[0] ;
         n65ArtCod = T01UI26_n65ArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
         A758ProCod = T01UI26_A758ProCod[0] ;
         n758ProCod = T01UI26_n758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
   }

   public void scanEnd1UI11( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1UI11( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && ( ( GXutil.strcmp(A10412ProAct, O10412ProAct) != 0 ) || ( GXutil.strcmp(A759ProDsc, O759ProDsc) != 0 ) ) )
      {
         A10555ProUserM = AV14UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A10555ProUserM", A10555ProUserM);
      }
      if ( true /* After */ && ( ( GXutil.strcmp(A10412ProAct, O10412ProAct) != 0 ) || ( GXutil.strcmp(A759ProDsc, O759ProDsc) != 0 ) ) )
      {
         A10556ProFecM = GXutil.serverNow( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10556ProFecM", localUtil.ttoc( A10556ProFecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void beforeInsert1UI11( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UI11( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UI11( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UI11( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UI11( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UI11( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtCod_Enabled), 5, 0), true);
      edtArtDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtArtDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtArtDsc_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      chkProAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkProAct.getEnabled(), 5, 0), true);
      edtProUserA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserA_Enabled), 5, 0), true);
      edtProFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecA_Enabled), 5, 0), true);
      edtProUserM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProUserM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProUserM_Enabled), 5, 0), true);
      edtProFecM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFecM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFecM_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UI11( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UI0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tarticu_procesos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV10ProCod))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","ProCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Tarticu_Procesos_Trn");
      forbiddenHiddens.add("ProUserA", GXutil.rtrim( localUtil.format( A10553ProUserA, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("DscCFa", GXutil.rtrim( localUtil.format( A10026DscCFa, "")));
      forbiddenHiddens.add("ProFecA", localUtil.format( A10554ProFecA, "99/99/99 99:99"));
      forbiddenHiddens.add("ProFabs", localUtil.format( A11272ProFabs, "ZZ9.99"));
      forbiddenHiddens.add("ProSta", localUtil.format( DecimalUtil.doubleToDec(A12141ProSta), "9"));
      forbiddenHiddens.add("ProStFec", localUtil.format( A12142ProStFec, "99/99/99 99:99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tarticu_procesos_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z65ArtCod", GXutil.rtrim( Z65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10555ProUserM", GXutil.rtrim( Z10555ProUserM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10556ProFecM", localUtil.ttoc( Z10556ProFecM, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10026DscCFa", GXutil.rtrim( Z10026DscCFa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10412ProAct", GXutil.rtrim( Z10412ProAct));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10553ProUserA", GXutil.rtrim( Z10553ProUserA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10554ProFecA", localUtil.ttoc( Z10554ProFecA, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11272ProFabs", GXutil.ltrim( localUtil.ntoc( Z11272ProFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12141ProSta", GXutil.ltrim( localUtil.ntoc( Z12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12142ProStFec", localUtil.ttoc( Z12142ProStFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "O759ProDsc", GXutil.rtrim( O759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "O10412ProAct", GXutil.rtrim( O10412ProAct));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD", GXutil.rtrim( AV9ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV10ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV14UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DSCCFA", GXutil.rtrim( A10026DscCFa));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFABS", GXutil.ltrim( localUtil.ntoc( A11272ProFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROSTA", GXutil.ltrim( localUtil.ntoc( A12141ProSta, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROSTFEC", localUtil.ttoc( A12142ProStFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPROVI", GXutil.rtrim( A5289ProProvi));
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
      return formatLink("app.tarticu_procesos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV10ProCod))}, new String[] {"Gx_mode","EmprCod","CliCod","ArtCod","ProCod"})  ;
   }

   public String getPgmname( )
   {
      return "Tarticu_Procesos_Trn" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Proceso", "") ;
   }

   public void initializeNonKey1UI11( )
   {
      A10555ProUserM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10555ProUserM", A10555ProUserM);
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10556ProFecM", localUtil.ttoc( A10556ProFecM, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A69ArtDsc = "" ;
      n69ArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", A69ArtDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A5289ProProvi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
      A10026DscCFa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10026DscCFa", A10026DscCFa);
      A10412ProAct = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10412ProAct", A10412ProAct);
      A10553ProUserA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10553ProUserA", A10553ProUserA);
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10554ProFecA", localUtil.ttoc( A10554ProFecA, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11272ProFabs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11272ProFabs", GXutil.ltrimstr( A11272ProFabs, 6, 2));
      A12141ProSta = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12141ProSta", GXutil.str( A12141ProSta, 1, 0));
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A12142ProStFec", localUtil.ttoc( A12142ProStFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      O759ProDsc = A759ProDsc ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      O10412ProAct = A10412ProAct ;
      httpContext.ajax_rsp_assign_attri("", false, "A10412ProAct", A10412ProAct);
      Z10555ProUserM = "" ;
      Z10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      Z10026DscCFa = "" ;
      Z10412ProAct = "" ;
      Z10553ProUserA = "" ;
      Z10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      Z11272ProFabs = DecimalUtil.ZERO ;
      Z12141ProSta = (byte)(0) ;
      Z12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1UI11( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A65ArtCod = "" ;
      n65ArtCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A65ArtCod", A65ArtCod);
      A758ProCod = "" ;
      n758ProCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      initializeNonKey1UI11( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610292", true, true);
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
      httpContext.AddJavascriptSource("tarticu_procesos_trn.js", "?20268211610292", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtArtCod_Internalname = "ARTCOD" ;
      edtArtDsc_Internalname = "ARTDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      chkProAct.setInternalname( "PROACT" );
      divProact_cell_Internalname = "PROACT_CELL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtProUserA_Internalname = "PROUSERA" ;
      edtProFecA_Internalname = "PROFECA" ;
      edtProUserM_Internalname = "PROUSERM" ;
      edtProFecM_Internalname = "PROFECM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
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
      Form.setCaption( httpContext.getMessage( "Proceso", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProFecM_Jsonclick = "" ;
      edtProFecM_Enabled = 0 ;
      edtProUserM_Jsonclick = "" ;
      edtProUserM_Enabled = 0 ;
      edtProFecA_Jsonclick = "" ;
      edtProFecA_Enabled = 0 ;
      edtProUserA_Jsonclick = "" ;
      edtProUserA_Enabled = 0 ;
      chkProAct.setEnabled( 1 );
      chkProAct.setVisible( 1 );
      divProact_cell_Class = "col-xs-12 col-sm-2" ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
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
      edtArtDsc_Jsonclick = "" ;
      edtArtDsc_Enabled = 0 ;
      edtArtCod_Jsonclick = "" ;
      edtArtCod_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
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

   public void gxasa104121UI11( String AV7EmprCod )
   {
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int7) ;
      tarticu_procesos_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      chkProAct.setVisible( ((GXt_int6==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "Visible", GXutil.ltrimstr( chkProAct.getVisible(), 5, 0), true);
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
      chkProAct.setName( "PROACT" );
      chkProAct.setWebtags( "" );
      chkProAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProAct.getInternalname(), "TitleCaption", chkProAct.getCaption(), true);
      chkProAct.setCheckedValue( "N" );
      A10412ProAct = ((GXutil.strcmp(GXutil.rtrim( A10412ProAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A10412ProAct", A10412ProAct);
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

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T01UI18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01UI18_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Artcod( )
   {
      n252CliCod = false ;
      n65ArtCod = false ;
      n69ArtDsc = false ;
      /* Using cursor T01UI19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n65ArtCod), A65ArtCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ARTICU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A69ArtDsc = T01UI19_A69ArtDsc[0] ;
      n69ArtDsc = T01UI19_n69ArtDsc[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A69ArtDsc", GXutil.rtrim( A69ArtDsc));
   }

   public void valid_Procod( )
   {
      n758ProCod = false ;
      /* Using cursor T01UI20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n758ProCod), A758ProCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T01UI20_A759ProDsc[0] ;
      A5289ProProvi = T01UI20_A5289ProProvi[0] ;
      O759ProDsc = A759ProDsc ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O759ProDsc", GXutil.rtrim( O759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", GXutil.rtrim( A5289ProProvi));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV10ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'A10412ProAct',fld:'PROACT',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A10412ProAct',fld:'PROACT',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ArtCod',fld:'vARTCOD',pic:'',hsh:true},{av:'AV10ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'A10553ProUserA',fld:'PROUSERA',pic:''},{av:'A10026DscCFa',fld:'DSCCFA',pic:''},{av:'A10554ProFecA',fld:'PROFECA',pic:'99/99/99 99:99'},{av:'A11272ProFabs',fld:'PROFABS',pic:'ZZ9.99'},{av:'A12141ProSta',fld:'PROSTA',pic:'9'},{av:'A12142ProStFec',fld:'PROSTFEC',pic:'99/99/99 99:99'},{av:'A10412ProAct',fld:'PROACT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A10412ProAct',fld:'PROACT',pic:''}]}");
      setEventMetadata("AFTER TRN","{handler:'e121UI2',iparms:[{av:'A10412ProAct',fld:'PROACT',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A10412ProAct',fld:'PROACT',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''}]}");
      setEventMetadata("VALID_ARTCOD","{handler:'valid_Artcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''}]");
      setEventMetadata("VALID_ARTCOD",",oparms:[{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'A10412ProAct',fld:'PROACT',pic:''}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'},{av:'A10412ProAct',fld:'PROACT',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'O759ProDsc'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'},{av:'A10412ProAct',fld:'PROACT',pic:''}]}");
      setEventMetadata("VALID_PRODSC","{handler:'valid_Prodsc',iparms:[{av:'A10412ProAct',fld:'PROACT',pic:''}]");
      setEventMetadata("VALID_PRODSC",",oparms:[{av:'A10412ProAct',fld:'PROACT',pic:''}]}");
      setEventMetadata("VALID_PROACT","{handler:'valid_Proact',iparms:[{av:'A10412ProAct',fld:'PROACT',pic:''}]");
      setEventMetadata("VALID_PROACT",",oparms:[{av:'A10412ProAct',fld:'PROACT',pic:''}]}");
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
      pr_default.close(17);
      pr_default.close(16);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9ArtCod = "" ;
      wcpOAV10ProCod = "" ;
      Z396EmprCod = "" ;
      Z65ArtCod = "" ;
      Z758ProCod = "" ;
      Z10555ProUserM = "" ;
      Z10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      Z10026DscCFa = "" ;
      Z10412ProAct = "" ;
      Z10553ProUserA = "" ;
      Z10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      Z11272ProFabs = DecimalUtil.ZERO ;
      Z12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      O759ProDsc = "" ;
      O10412ProAct = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      Gx_mode = "" ;
      AV9ArtCod = "" ;
      AV10ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A10412ProAct = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A279CliNom = "" ;
      A69ArtDsc = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A759ProDsc = "" ;
      A10553ProUserA = "" ;
      A10554ProFecA = GXutil.resetTime( GXutil.nullDate() );
      A10555ProUserM = "" ;
      A10556ProFecM = GXutil.resetTime( GXutil.nullDate() );
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV15Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A10026DscCFa = "" ;
      A11272ProFabs = DecimalUtil.ZERO ;
      A12142ProStFec = GXutil.resetTime( GXutil.nullDate() );
      AV14UsurCod = "" ;
      A407EmprNom = "" ;
      A5289ProProvi = "" ;
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
      sMode11 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV16Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV17Emprnom = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV11WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV12TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z69ArtDsc = "" ;
      Z759ProDsc = "" ;
      Z5289ProProvi = "" ;
      T01UI4_A407EmprNom = new String[] {""} ;
      T01UI4_n407EmprNom = new boolean[] {false} ;
      T01UI5_A279CliNom = new String[] {""} ;
      T01UI6_A69ArtDsc = new String[] {""} ;
      T01UI6_n69ArtDsc = new boolean[] {false} ;
      T01UI7_A759ProDsc = new String[] {""} ;
      T01UI7_A5289ProProvi = new String[] {""} ;
      T01UI8_A10555ProUserM = new String[] {""} ;
      T01UI8_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI8_A279CliNom = new String[] {""} ;
      T01UI8_A407EmprNom = new String[] {""} ;
      T01UI8_n407EmprNom = new boolean[] {false} ;
      T01UI8_A69ArtDsc = new String[] {""} ;
      T01UI8_n69ArtDsc = new boolean[] {false} ;
      T01UI8_A759ProDsc = new String[] {""} ;
      T01UI8_A5289ProProvi = new String[] {""} ;
      T01UI8_A10026DscCFa = new String[] {""} ;
      T01UI8_A10412ProAct = new String[] {""} ;
      T01UI8_A10553ProUserA = new String[] {""} ;
      T01UI8_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI8_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UI8_A12141ProSta = new byte[1] ;
      T01UI8_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI8_A396EmprCod = new String[] {""} ;
      T01UI8_A252CliCod = new int[1] ;
      T01UI8_n252CliCod = new boolean[] {false} ;
      T01UI8_A65ArtCod = new String[] {""} ;
      T01UI8_n65ArtCod = new boolean[] {false} ;
      T01UI8_A758ProCod = new String[] {""} ;
      T01UI8_n758ProCod = new boolean[] {false} ;
      T01UI9_A279CliNom = new String[] {""} ;
      T01UI10_A69ArtDsc = new String[] {""} ;
      T01UI10_n69ArtDsc = new boolean[] {false} ;
      T01UI11_A759ProDsc = new String[] {""} ;
      T01UI11_A5289ProProvi = new String[] {""} ;
      T01UI12_A396EmprCod = new String[] {""} ;
      T01UI12_A252CliCod = new int[1] ;
      T01UI12_n252CliCod = new boolean[] {false} ;
      T01UI12_A65ArtCod = new String[] {""} ;
      T01UI12_n65ArtCod = new boolean[] {false} ;
      T01UI12_A758ProCod = new String[] {""} ;
      T01UI12_n758ProCod = new boolean[] {false} ;
      T01UI3_A10555ProUserM = new String[] {""} ;
      T01UI3_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI3_A10026DscCFa = new String[] {""} ;
      T01UI3_A10412ProAct = new String[] {""} ;
      T01UI3_A10553ProUserA = new String[] {""} ;
      T01UI3_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI3_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UI3_A12141ProSta = new byte[1] ;
      T01UI3_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI3_A396EmprCod = new String[] {""} ;
      T01UI3_A252CliCod = new int[1] ;
      T01UI3_n252CliCod = new boolean[] {false} ;
      T01UI3_A65ArtCod = new String[] {""} ;
      T01UI3_n65ArtCod = new boolean[] {false} ;
      T01UI3_A758ProCod = new String[] {""} ;
      T01UI3_n758ProCod = new boolean[] {false} ;
      T01UI13_A396EmprCod = new String[] {""} ;
      T01UI13_A252CliCod = new int[1] ;
      T01UI13_n252CliCod = new boolean[] {false} ;
      T01UI13_A65ArtCod = new String[] {""} ;
      T01UI13_n65ArtCod = new boolean[] {false} ;
      T01UI13_A758ProCod = new String[] {""} ;
      T01UI13_n758ProCod = new boolean[] {false} ;
      T01UI14_A396EmprCod = new String[] {""} ;
      T01UI14_A252CliCod = new int[1] ;
      T01UI14_n252CliCod = new boolean[] {false} ;
      T01UI14_A65ArtCod = new String[] {""} ;
      T01UI14_n65ArtCod = new boolean[] {false} ;
      T01UI14_A758ProCod = new String[] {""} ;
      T01UI14_n758ProCod = new boolean[] {false} ;
      T01UI2_A10555ProUserM = new String[] {""} ;
      T01UI2_A10556ProFecM = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI2_A10026DscCFa = new String[] {""} ;
      T01UI2_A10412ProAct = new String[] {""} ;
      T01UI2_A10553ProUserA = new String[] {""} ;
      T01UI2_A10554ProFecA = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI2_A11272ProFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UI2_A12141ProSta = new byte[1] ;
      T01UI2_A12142ProStFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UI2_A396EmprCod = new String[] {""} ;
      T01UI2_A252CliCod = new int[1] ;
      T01UI2_n252CliCod = new boolean[] {false} ;
      T01UI2_A65ArtCod = new String[] {""} ;
      T01UI2_n65ArtCod = new boolean[] {false} ;
      T01UI2_A758ProCod = new String[] {""} ;
      T01UI2_n758ProCod = new boolean[] {false} ;
      T01UI18_A279CliNom = new String[] {""} ;
      T01UI19_A69ArtDsc = new String[] {""} ;
      T01UI19_n69ArtDsc = new boolean[] {false} ;
      T01UI20_A759ProDsc = new String[] {""} ;
      T01UI20_A5289ProProvi = new String[] {""} ;
      T01UI21_A396EmprCod = new String[] {""} ;
      T01UI21_A11604PArtId = new int[1] ;
      T01UI22_A396EmprCod = new String[] {""} ;
      T01UI22_A252CliCod = new int[1] ;
      T01UI22_n252CliCod = new boolean[] {false} ;
      T01UI22_A65ArtCod = new String[] {""} ;
      T01UI22_n65ArtCod = new boolean[] {false} ;
      T01UI22_A758ProCod = new String[] {""} ;
      T01UI22_n758ProCod = new boolean[] {false} ;
      T01UI22_A9836FasCodM = new String[] {""} ;
      T01UI23_A396EmprCod = new String[] {""} ;
      T01UI23_A252CliCod = new int[1] ;
      T01UI23_n252CliCod = new boolean[] {false} ;
      T01UI23_A65ArtCod = new String[] {""} ;
      T01UI23_n65ArtCod = new boolean[] {false} ;
      T01UI23_A758ProCod = new String[] {""} ;
      T01UI23_n758ProCod = new boolean[] {false} ;
      T01UI23_A6986NumLinPro = new short[1] ;
      T01UI24_A396EmprCod = new String[] {""} ;
      T01UI24_A252CliCod = new int[1] ;
      T01UI24_n252CliCod = new boolean[] {false} ;
      T01UI24_A65ArtCod = new String[] {""} ;
      T01UI24_n65ArtCod = new boolean[] {false} ;
      T01UI24_A4658MdlCod = new String[] {""} ;
      T01UI24_A758ProCod = new String[] {""} ;
      T01UI24_n758ProCod = new boolean[] {false} ;
      T01UI25_A396EmprCod = new String[] {""} ;
      T01UI25_A252CliCod = new int[1] ;
      T01UI25_n252CliCod = new boolean[] {false} ;
      T01UI25_A65ArtCod = new String[] {""} ;
      T01UI25_n65ArtCod = new boolean[] {false} ;
      T01UI25_A758ProCod = new String[] {""} ;
      T01UI25_n758ProCod = new boolean[] {false} ;
      T01UI25_A457FasCod = new String[] {""} ;
      T01UI26_A396EmprCod = new String[] {""} ;
      T01UI26_A252CliCod = new int[1] ;
      T01UI26_n252CliCod = new boolean[] {false} ;
      T01UI26_A65ArtCod = new String[] {""} ;
      T01UI26_n65ArtCod = new boolean[] {false} ;
      T01UI26_A758ProCod = new String[] {""} ;
      T01UI26_n758ProCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int7 = new byte[1] ;
      ZO759ProDsc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tarticu_procesos_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tarticu_procesos_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tarticu_procesos_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tarticu_procesos_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tarticu_procesos_trn__default(),
         new Object[] {
             new Object[] {
            T01UI2_A10555ProUserM, T01UI2_A10556ProFecM, T01UI2_A10026DscCFa, T01UI2_A10412ProAct, T01UI2_A10553ProUserA, T01UI2_A10554ProFecA, T01UI2_A11272ProFabs, T01UI2_A12141ProSta, T01UI2_A12142ProStFec, T01UI2_A396EmprCod,
            T01UI2_A252CliCod, T01UI2_A65ArtCod, T01UI2_A758ProCod
            }
            , new Object[] {
            T01UI3_A10555ProUserM, T01UI3_A10556ProFecM, T01UI3_A10026DscCFa, T01UI3_A10412ProAct, T01UI3_A10553ProUserA, T01UI3_A10554ProFecA, T01UI3_A11272ProFabs, T01UI3_A12141ProSta, T01UI3_A12142ProStFec, T01UI3_A396EmprCod,
            T01UI3_A252CliCod, T01UI3_A65ArtCod, T01UI3_A758ProCod
            }
            , new Object[] {
            T01UI4_A407EmprNom, T01UI4_n407EmprNom
            }
            , new Object[] {
            T01UI5_A279CliNom
            }
            , new Object[] {
            T01UI6_A69ArtDsc, T01UI6_n69ArtDsc
            }
            , new Object[] {
            T01UI7_A759ProDsc, T01UI7_A5289ProProvi
            }
            , new Object[] {
            T01UI8_A10555ProUserM, T01UI8_A10556ProFecM, T01UI8_A279CliNom, T01UI8_A407EmprNom, T01UI8_n407EmprNom, T01UI8_A69ArtDsc, T01UI8_n69ArtDsc, T01UI8_A759ProDsc, T01UI8_A5289ProProvi, T01UI8_A10026DscCFa,
            T01UI8_A10412ProAct, T01UI8_A10553ProUserA, T01UI8_A10554ProFecA, T01UI8_A11272ProFabs, T01UI8_A12141ProSta, T01UI8_A12142ProStFec, T01UI8_A396EmprCod, T01UI8_A252CliCod, T01UI8_A65ArtCod, T01UI8_A758ProCod
            }
            , new Object[] {
            T01UI9_A279CliNom
            }
            , new Object[] {
            T01UI10_A69ArtDsc, T01UI10_n69ArtDsc
            }
            , new Object[] {
            T01UI11_A759ProDsc, T01UI11_A5289ProProvi
            }
            , new Object[] {
            T01UI12_A396EmprCod, T01UI12_A252CliCod, T01UI12_A65ArtCod, T01UI12_A758ProCod
            }
            , new Object[] {
            T01UI13_A396EmprCod, T01UI13_A252CliCod, T01UI13_A65ArtCod, T01UI13_A758ProCod
            }
            , new Object[] {
            T01UI14_A396EmprCod, T01UI14_A252CliCod, T01UI14_A65ArtCod, T01UI14_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UI18_A279CliNom
            }
            , new Object[] {
            T01UI19_A69ArtDsc, T01UI19_n69ArtDsc
            }
            , new Object[] {
            T01UI20_A759ProDsc, T01UI20_A5289ProProvi
            }
            , new Object[] {
            T01UI21_A396EmprCod, T01UI21_A11604PArtId
            }
            , new Object[] {
            T01UI22_A396EmprCod, T01UI22_A252CliCod, T01UI22_A65ArtCod, T01UI22_A758ProCod, T01UI22_A9836FasCodM
            }
            , new Object[] {
            T01UI23_A396EmprCod, T01UI23_A252CliCod, T01UI23_A65ArtCod, T01UI23_A758ProCod, T01UI23_A6986NumLinPro
            }
            , new Object[] {
            T01UI24_A396EmprCod, T01UI24_A252CliCod, T01UI24_A65ArtCod, T01UI24_A4658MdlCod, T01UI24_A758ProCod
            }
            , new Object[] {
            T01UI25_A396EmprCod, T01UI25_A252CliCod, T01UI25_A65ArtCod, T01UI25_A758ProCod, T01UI25_A457FasCod
            }
            , new Object[] {
            T01UI26_A396EmprCod, T01UI26_A252CliCod, T01UI26_A65ArtCod, T01UI26_A758ProCod
            }
         }
      );
      AV15Pgmname = "Tarticu_Procesos_Trn" ;
   }

   private byte Z12141ProSta ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A12141ProSta ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound11 ;
   private short nIsDirty_11 ;
   private int wcpOAV8CliCod ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int AV8CliCod ;
   private int trnEnded ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtArtCod_Enabled ;
   private int edtArtDsc_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProUserA_Enabled ;
   private int edtProFecA_Enabled ;
   private int edtProUserM_Enabled ;
   private int edtProFecM_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z11272ProFabs ;
   private java.math.BigDecimal A11272ProFabs ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9ArtCod ;
   private String wcpOAV10ProCod ;
   private String Z396EmprCod ;
   private String Z65ArtCod ;
   private String Z758ProCod ;
   private String Z10555ProUserM ;
   private String Z10026DscCFa ;
   private String Z10412ProAct ;
   private String Z10553ProUserA ;
   private String O759ProDsc ;
   private String O10412ProAct ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String Gx_mode ;
   private String AV9ArtCod ;
   private String AV10ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String A10412ProAct ;
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
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtArtCod_Internalname ;
   private String edtArtCod_Jsonclick ;
   private String edtArtDsc_Internalname ;
   private String A69ArtDsc ;
   private String edtArtDsc_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String divProact_cell_Internalname ;
   private String divProact_cell_Class ;
   private String divUnnamedtable3_Internalname ;
   private String edtProUserA_Internalname ;
   private String A10553ProUserA ;
   private String edtProUserA_Jsonclick ;
   private String edtProFecA_Internalname ;
   private String edtProFecA_Jsonclick ;
   private String edtProUserM_Internalname ;
   private String A10555ProUserM ;
   private String edtProUserM_Jsonclick ;
   private String edtProFecM_Internalname ;
   private String edtProFecM_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV15Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A10026DscCFa ;
   private String AV14UsurCod ;
   private String A407EmprNom ;
   private String A5289ProProvi ;
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
   private String sMode11 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV16Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17Emprnom ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z69ArtDsc ;
   private String Z759ProDsc ;
   private String Z5289ProProvi ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZO759ProDsc ;
   private java.util.Date Z10556ProFecM ;
   private java.util.Date Z10554ProFecA ;
   private java.util.Date Z12142ProStFec ;
   private java.util.Date A10554ProFecA ;
   private java.util.Date A10556ProFecM ;
   private java.util.Date A12142ProStFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean n65ArtCod ;
   private boolean n758ProCod ;
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
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n69ArtDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.WebSession AV13WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkProAct ;
   private IDataStoreProvider pr_default ;
   private String[] T01UI4_A407EmprNom ;
   private boolean[] T01UI4_n407EmprNom ;
   private String[] T01UI5_A279CliNom ;
   private String[] T01UI6_A69ArtDsc ;
   private boolean[] T01UI6_n69ArtDsc ;
   private String[] T01UI7_A759ProDsc ;
   private String[] T01UI7_A5289ProProvi ;
   private String[] T01UI8_A10555ProUserM ;
   private java.util.Date[] T01UI8_A10556ProFecM ;
   private String[] T01UI8_A279CliNom ;
   private String[] T01UI8_A407EmprNom ;
   private boolean[] T01UI8_n407EmprNom ;
   private String[] T01UI8_A69ArtDsc ;
   private boolean[] T01UI8_n69ArtDsc ;
   private String[] T01UI8_A759ProDsc ;
   private String[] T01UI8_A5289ProProvi ;
   private String[] T01UI8_A10026DscCFa ;
   private String[] T01UI8_A10412ProAct ;
   private String[] T01UI8_A10553ProUserA ;
   private java.util.Date[] T01UI8_A10554ProFecA ;
   private java.math.BigDecimal[] T01UI8_A11272ProFabs ;
   private byte[] T01UI8_A12141ProSta ;
   private java.util.Date[] T01UI8_A12142ProStFec ;
   private String[] T01UI8_A396EmprCod ;
   private int[] T01UI8_A252CliCod ;
   private boolean[] T01UI8_n252CliCod ;
   private String[] T01UI8_A65ArtCod ;
   private boolean[] T01UI8_n65ArtCod ;
   private String[] T01UI8_A758ProCod ;
   private boolean[] T01UI8_n758ProCod ;
   private String[] T01UI9_A279CliNom ;
   private String[] T01UI10_A69ArtDsc ;
   private boolean[] T01UI10_n69ArtDsc ;
   private String[] T01UI11_A759ProDsc ;
   private String[] T01UI11_A5289ProProvi ;
   private String[] T01UI12_A396EmprCod ;
   private int[] T01UI12_A252CliCod ;
   private boolean[] T01UI12_n252CliCod ;
   private String[] T01UI12_A65ArtCod ;
   private boolean[] T01UI12_n65ArtCod ;
   private String[] T01UI12_A758ProCod ;
   private boolean[] T01UI12_n758ProCod ;
   private String[] T01UI3_A10555ProUserM ;
   private java.util.Date[] T01UI3_A10556ProFecM ;
   private String[] T01UI3_A10026DscCFa ;
   private String[] T01UI3_A10412ProAct ;
   private String[] T01UI3_A10553ProUserA ;
   private java.util.Date[] T01UI3_A10554ProFecA ;
   private java.math.BigDecimal[] T01UI3_A11272ProFabs ;
   private byte[] T01UI3_A12141ProSta ;
   private java.util.Date[] T01UI3_A12142ProStFec ;
   private String[] T01UI3_A396EmprCod ;
   private int[] T01UI3_A252CliCod ;
   private boolean[] T01UI3_n252CliCod ;
   private String[] T01UI3_A65ArtCod ;
   private boolean[] T01UI3_n65ArtCod ;
   private String[] T01UI3_A758ProCod ;
   private boolean[] T01UI3_n758ProCod ;
   private String[] T01UI13_A396EmprCod ;
   private int[] T01UI13_A252CliCod ;
   private boolean[] T01UI13_n252CliCod ;
   private String[] T01UI13_A65ArtCod ;
   private boolean[] T01UI13_n65ArtCod ;
   private String[] T01UI13_A758ProCod ;
   private boolean[] T01UI13_n758ProCod ;
   private String[] T01UI14_A396EmprCod ;
   private int[] T01UI14_A252CliCod ;
   private boolean[] T01UI14_n252CliCod ;
   private String[] T01UI14_A65ArtCod ;
   private boolean[] T01UI14_n65ArtCod ;
   private String[] T01UI14_A758ProCod ;
   private boolean[] T01UI14_n758ProCod ;
   private String[] T01UI2_A10555ProUserM ;
   private java.util.Date[] T01UI2_A10556ProFecM ;
   private String[] T01UI2_A10026DscCFa ;
   private String[] T01UI2_A10412ProAct ;
   private String[] T01UI2_A10553ProUserA ;
   private java.util.Date[] T01UI2_A10554ProFecA ;
   private java.math.BigDecimal[] T01UI2_A11272ProFabs ;
   private byte[] T01UI2_A12141ProSta ;
   private java.util.Date[] T01UI2_A12142ProStFec ;
   private String[] T01UI2_A396EmprCod ;
   private int[] T01UI2_A252CliCod ;
   private boolean[] T01UI2_n252CliCod ;
   private String[] T01UI2_A65ArtCod ;
   private boolean[] T01UI2_n65ArtCod ;
   private String[] T01UI2_A758ProCod ;
   private boolean[] T01UI2_n758ProCod ;
   private String[] T01UI18_A279CliNom ;
   private String[] T01UI19_A69ArtDsc ;
   private boolean[] T01UI19_n69ArtDsc ;
   private String[] T01UI20_A759ProDsc ;
   private String[] T01UI20_A5289ProProvi ;
   private String[] T01UI21_A396EmprCod ;
   private int[] T01UI21_A11604PArtId ;
   private String[] T01UI22_A396EmprCod ;
   private int[] T01UI22_A252CliCod ;
   private boolean[] T01UI22_n252CliCod ;
   private String[] T01UI22_A65ArtCod ;
   private boolean[] T01UI22_n65ArtCod ;
   private String[] T01UI22_A758ProCod ;
   private boolean[] T01UI22_n758ProCod ;
   private String[] T01UI22_A9836FasCodM ;
   private String[] T01UI23_A396EmprCod ;
   private int[] T01UI23_A252CliCod ;
   private boolean[] T01UI23_n252CliCod ;
   private String[] T01UI23_A65ArtCod ;
   private boolean[] T01UI23_n65ArtCod ;
   private String[] T01UI23_A758ProCod ;
   private boolean[] T01UI23_n758ProCod ;
   private short[] T01UI23_A6986NumLinPro ;
   private String[] T01UI24_A396EmprCod ;
   private int[] T01UI24_A252CliCod ;
   private boolean[] T01UI24_n252CliCod ;
   private String[] T01UI24_A65ArtCod ;
   private boolean[] T01UI24_n65ArtCod ;
   private String[] T01UI24_A4658MdlCod ;
   private String[] T01UI24_A758ProCod ;
   private boolean[] T01UI24_n758ProCod ;
   private String[] T01UI25_A396EmprCod ;
   private int[] T01UI25_A252CliCod ;
   private boolean[] T01UI25_n252CliCod ;
   private String[] T01UI25_A65ArtCod ;
   private boolean[] T01UI25_n65ArtCod ;
   private String[] T01UI25_A758ProCod ;
   private boolean[] T01UI25_n758ProCod ;
   private String[] T01UI25_A457FasCod ;
   private String[] T01UI26_A396EmprCod ;
   private int[] T01UI26_A252CliCod ;
   private boolean[] T01UI26_n252CliCod ;
   private String[] T01UI26_A65ArtCod ;
   private boolean[] T01UI26_n65ArtCod ;
   private String[] T01UI26_A758ProCod ;
   private boolean[] T01UI26_n758ProCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV11WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV12TrnContext ;
}

final  class tarticu_procesos_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticu_procesos_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticu_procesos_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticu_procesos_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tarticu_procesos_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UI2", "SELECT ProUserM, ProFecM, DscCFa, ProAct, ProUserA, ProFecA, ProFabs, ProSta, ProStFec, EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?  FOR UPDATE OF ProUserM, ProFecM, DscCFa, ProAct, ProUserA, ProFecA, ProFabs, ProSta, ProStFec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI3", "SELECT ProUserM, ProFecM, DscCFa, ProAct, ProUserA, ProFecA, ProFabs, ProSta, ProStFec, EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI6", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI7", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI8", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProUserM, TM1.ProFecM, T3.CliNom, T2.EmprNom, T4.ArtDsc, T5.ProDsc, T5.ProProvi, TM1.DscCFa, TM1.ProAct, TM1.ProUserA, TM1.ProFecA, TM1.ProFabs, TM1.ProSta, TM1.ProStFec, TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod FROM ((((TXPARTLIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) INNER JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.ArtCod) INNER JOIN TXPPROCES T5 ON T5.EmprCod = TM1.EmprCod AND T5.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ArtCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ArtCod, TM1.ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI10", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI11", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ArtCod > ? or ArtCod = ? and CliCod = ? and EmprCod = ? and ProCod > ?) ORDER BY EmprCod, CliCod, ArtCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UI14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ArtCod < ? or ArtCod = ? and CliCod = ? and EmprCod = ? and ProCod < ?) ORDER BY EmprCod DESC, CliCod DESC, ArtCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UI15", "INSERT INTO TXPARTLIN(ProUserM, ProFecM, DscCFa, ProAct, ProUserA, ProFecA, ProFabs, ProSta, ProStFec, EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, Art_Tipo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T01UI16", "UPDATE TXPARTLIN SET ProUserM=?, ProFecM=?, DscCFa=?, ProAct=?, ProUserA=?, ProFecA=?, ProFabs=?, ProSta=?, ProStFec=?  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new UpdateCursor("T01UI17", "DELETE FROM TXPARTLIN  WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?", GX_NOMASK, "TXPARTLIN")
         ,new ForEachCursor("T01UI18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI19", "SELECT ArtDsc FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI20", "SELECT ProDsc, ProProvi FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UI21", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UI22", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM FROM TXPCAPFMP WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UI23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, NumLinPro FROM TXPPARART WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UI24", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, MdlCod, ProCod FROM TXPModPro WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UI25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod FROM TXPSERPAU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UI26", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN ORDER BY EmprCod, CliCod, ArtCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 40);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 10);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 16);
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(2, (String)parms[2], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
            case 11 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               stmt.setString(9, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 8);
               }
               return;
            case 12 :
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
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               stmt.setString(5, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 16);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               stmt.setString(9, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 8);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setDateTime(9, (java.util.Date)parms[8], false);
               stmt.setString(10, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[13], 16);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[15], 8);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setDateTime(9, (java.util.Date)parms[8], false);
               stmt.setString(10, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[13], 16);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[15], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
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
                  stmt.setString(2, (String)parms[2], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
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
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 8);
               }
               return;
      }
   }

}

