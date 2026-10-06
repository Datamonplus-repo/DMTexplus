package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfacdiv_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A3115FacDivCod = (byte)(GXutil.lval( httpContext.GetPar( "FacDivCod"))) ;
         n3115FacDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A3115FacDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3119FacRepCod = httpContext.GetPar( "FacRepCod") ;
         n3119FacRepCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A3119FacRepCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3119FacRepCod = httpContext.GetPar( "FacRepCod") ;
         n3119FacRepCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A3119FacRepCod, A252CliCod) ;
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
            AV26EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
            AV28FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28FacCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FacCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DIVISAS/REPRESENTANTES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tfacdiv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfacdiv_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfacdiv_impl.class ));
   }

   public tfacdiv_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbFacDivTCod = new HTMLChoice();
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
      if ( cmbFacDivTCod.getItemCount() > 0 )
      {
         A3096FacDivTCod = cmbFacDivTCod.getValidValue(A3096FacDivTCod) ;
         n3096FacDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbFacDivTCod.setValue( GXutil.rtrim( A3096FacDivTCod) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacDivTCod.getInternalname(), "Values", cmbFacDivTCod.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacCod_Internalname, httpContext.getMessage( "Nº Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TFACDIV.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfacdivcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfacdivcod_Internalname, httpContext.getMessage( "Divisa", ""), "", "", lblTextblockfacdivcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_facdivcod.setProperty("Caption", Combo_facdivcod_Caption);
      ucCombo_facdivcod.setProperty("Cls", Combo_facdivcod_Cls);
      ucCombo_facdivcod.setProperty("EmptyItem", Combo_facdivcod_Emptyitem);
      ucCombo_facdivcod.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
      ucCombo_facdivcod.setProperty("DropDownOptionsData", AV39FacDivCod_Data);
      ucCombo_facdivcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_facdivcod_Internalname, "COMBO_FACDIVCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacDivCod_Internalname, httpContext.getMessage( "Divisa", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacDivCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3115FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3115FacDivCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDivCod_Jsonclick, 0, "Attribute", "", "", "", "", edtFacDivCod_Visible, edtFacDivCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbFacDivTCod.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbFacDivTCod.getInternalname(), httpContext.getMessage( "Divisa Ctb", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbFacDivTCod, cmbFacDivTCod.getInternalname(), GXutil.rtrim( A3096FacDivTCod), 1, cmbFacDivTCod.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbFacDivTCod.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "", true, (byte)(0), "HLP_Facturacion\\TFACDIV.htm");
      cmbFacDivTCod.setValue( GXutil.rtrim( A3096FacDivTCod) );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacDivTCod.getInternalname(), "Values", cmbFacDivTCod.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfacrepcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfacrepcod_Internalname, httpContext.getMessage( "Representante", ""), "", "", lblTextblockfacrepcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_facrepcod.setProperty("Caption", Combo_facrepcod_Caption);
      ucCombo_facrepcod.setProperty("Cls", Combo_facrepcod_Cls);
      ucCombo_facrepcod.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
      ucCombo_facrepcod.setProperty("DropDownOptionsData", AV36FacRepCod_Data);
      ucCombo_facrepcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_facrepcod_Internalname, "COMBO_FACREPCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacRepCod_Internalname, httpContext.getMessage( "Representante", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacRepCod_Internalname, GXutil.rtrim( A3119FacRepCod), GXutil.rtrim( localUtil.format( A3119FacRepCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacRepCod_Jsonclick, 0, "Attribute", "", "", "", "", edtFacRepCod_Visible, edtFacRepCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TFACDIV.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACDIV.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV42Pgmname), GXutil.rtrim( localUtil.format( AV42Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TFACDIV.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_facdivcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofacdivcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV40ComboFacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombofacdivcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV40ComboFacDivCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV40ComboFacDivCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofacdivcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofacdivcod_Visible, edtavCombofacdivcod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_facrepcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofacrepcod_Internalname, GXutil.rtrim( AV38ComboFacRepCod), GXutil.rtrim( localUtil.format( AV38ComboFacRepCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofacrepcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofacrepcod_Visible, edtavCombofacrepcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TFACDIV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacDivAbr_Internalname, GXutil.rtrim( A3116FacDivAbr), GXutil.rtrim( localUtil.format( A3116FacDivAbr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacDivAbr_Jsonclick, 0, "Attribute", "", "", "", "", edtFacDivAbr_Visible, edtFacDivAbr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TFACDIV.htm");
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
      e11B52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFACDIVCOD_DATA"), AV39FacDivCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFACREPCOD_DATA"), AV36FacRepCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z430FacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3096FacDivTCod = httpContext.cgiGet( "Z3096FacDivTCod") ;
            Z3119FacRepCod = httpContext.cgiGet( "Z3119FacRepCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3115FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3115FacDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N3115FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3115FacDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3119FacRepCod = httpContext.cgiGet( "N3119FacRepCod") ;
            AV26EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV28FacCod = (int)(localUtil.ctol( httpContext.cgiGet( "vFACCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Insert_FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_FACDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Insert_FacRepCod = httpContext.cgiGet( "vINSERT_FACREPCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3120FacRepNom = httpContext.cgiGet( "FACREPNOM") ;
            n3120FacRepNom = false ;
            Combo_facdivcod_Objectcall = httpContext.cgiGet( "COMBO_FACDIVCOD_Objectcall") ;
            Combo_facdivcod_Class = httpContext.cgiGet( "COMBO_FACDIVCOD_Class") ;
            Combo_facdivcod_Icontype = httpContext.cgiGet( "COMBO_FACDIVCOD_Icontype") ;
            Combo_facdivcod_Icon = httpContext.cgiGet( "COMBO_FACDIVCOD_Icon") ;
            Combo_facdivcod_Caption = httpContext.cgiGet( "COMBO_FACDIVCOD_Caption") ;
            Combo_facdivcod_Tooltip = httpContext.cgiGet( "COMBO_FACDIVCOD_Tooltip") ;
            Combo_facdivcod_Cls = httpContext.cgiGet( "COMBO_FACDIVCOD_Cls") ;
            Combo_facdivcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FACDIVCOD_Selectedvalue_set") ;
            Combo_facdivcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FACDIVCOD_Selectedvalue_get") ;
            Combo_facdivcod_Selectedtext_set = httpContext.cgiGet( "COMBO_FACDIVCOD_Selectedtext_set") ;
            Combo_facdivcod_Selectedtext_get = httpContext.cgiGet( "COMBO_FACDIVCOD_Selectedtext_get") ;
            Combo_facdivcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_FACDIVCOD_Gamoauthtoken") ;
            Combo_facdivcod_Ddointernalname = httpContext.cgiGet( "COMBO_FACDIVCOD_Ddointernalname") ;
            Combo_facdivcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_FACDIVCOD_Titlecontrolalign") ;
            Combo_facdivcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FACDIVCOD_Dropdownoptionstype") ;
            Combo_facdivcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Enabled")) ;
            Combo_facdivcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Visible")) ;
            Combo_facdivcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FACDIVCOD_Titlecontrolidtoreplace") ;
            Combo_facdivcod_Datalisttype = httpContext.cgiGet( "COMBO_FACDIVCOD_Datalisttype") ;
            Combo_facdivcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Allowmultipleselection")) ;
            Combo_facdivcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FACDIVCOD_Datalistfixedvalues") ;
            Combo_facdivcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Isgriditem")) ;
            Combo_facdivcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Hasdescription")) ;
            Combo_facdivcod_Datalistproc = httpContext.cgiGet( "COMBO_FACDIVCOD_Datalistproc") ;
            Combo_facdivcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FACDIVCOD_Datalistprocparametersprefix") ;
            Combo_facdivcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FACDIVCOD_Remoteservicesparameters") ;
            Combo_facdivcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FACDIVCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_facdivcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Includeonlyselectedoption")) ;
            Combo_facdivcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Includeselectalloption")) ;
            Combo_facdivcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Emptyitem")) ;
            Combo_facdivcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACDIVCOD_Includeaddnewoption")) ;
            Combo_facdivcod_Htmltemplate = httpContext.cgiGet( "COMBO_FACDIVCOD_Htmltemplate") ;
            Combo_facdivcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FACDIVCOD_Multiplevaluestype") ;
            Combo_facdivcod_Loadingdata = httpContext.cgiGet( "COMBO_FACDIVCOD_Loadingdata") ;
            Combo_facdivcod_Noresultsfound = httpContext.cgiGet( "COMBO_FACDIVCOD_Noresultsfound") ;
            Combo_facdivcod_Emptyitemtext = httpContext.cgiGet( "COMBO_FACDIVCOD_Emptyitemtext") ;
            Combo_facdivcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FACDIVCOD_Onlyselectedvalues") ;
            Combo_facdivcod_Selectalltext = httpContext.cgiGet( "COMBO_FACDIVCOD_Selectalltext") ;
            Combo_facdivcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FACDIVCOD_Multiplevaluesseparator") ;
            Combo_facdivcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_FACDIVCOD_Addnewoptiontext") ;
            Combo_facdivcod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FACDIVCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_facrepcod_Objectcall = httpContext.cgiGet( "COMBO_FACREPCOD_Objectcall") ;
            Combo_facrepcod_Class = httpContext.cgiGet( "COMBO_FACREPCOD_Class") ;
            Combo_facrepcod_Icontype = httpContext.cgiGet( "COMBO_FACREPCOD_Icontype") ;
            Combo_facrepcod_Icon = httpContext.cgiGet( "COMBO_FACREPCOD_Icon") ;
            Combo_facrepcod_Caption = httpContext.cgiGet( "COMBO_FACREPCOD_Caption") ;
            Combo_facrepcod_Tooltip = httpContext.cgiGet( "COMBO_FACREPCOD_Tooltip") ;
            Combo_facrepcod_Cls = httpContext.cgiGet( "COMBO_FACREPCOD_Cls") ;
            Combo_facrepcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FACREPCOD_Selectedvalue_set") ;
            Combo_facrepcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FACREPCOD_Selectedvalue_get") ;
            Combo_facrepcod_Selectedtext_set = httpContext.cgiGet( "COMBO_FACREPCOD_Selectedtext_set") ;
            Combo_facrepcod_Selectedtext_get = httpContext.cgiGet( "COMBO_FACREPCOD_Selectedtext_get") ;
            Combo_facrepcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_FACREPCOD_Gamoauthtoken") ;
            Combo_facrepcod_Ddointernalname = httpContext.cgiGet( "COMBO_FACREPCOD_Ddointernalname") ;
            Combo_facrepcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_FACREPCOD_Titlecontrolalign") ;
            Combo_facrepcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FACREPCOD_Dropdownoptionstype") ;
            Combo_facrepcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Enabled")) ;
            Combo_facrepcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Visible")) ;
            Combo_facrepcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FACREPCOD_Titlecontrolidtoreplace") ;
            Combo_facrepcod_Datalisttype = httpContext.cgiGet( "COMBO_FACREPCOD_Datalisttype") ;
            Combo_facrepcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Allowmultipleselection")) ;
            Combo_facrepcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FACREPCOD_Datalistfixedvalues") ;
            Combo_facrepcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Isgriditem")) ;
            Combo_facrepcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Hasdescription")) ;
            Combo_facrepcod_Datalistproc = httpContext.cgiGet( "COMBO_FACREPCOD_Datalistproc") ;
            Combo_facrepcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FACREPCOD_Datalistprocparametersprefix") ;
            Combo_facrepcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FACREPCOD_Remoteservicesparameters") ;
            Combo_facrepcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FACREPCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_facrepcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Includeonlyselectedoption")) ;
            Combo_facrepcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Includeselectalloption")) ;
            Combo_facrepcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Emptyitem")) ;
            Combo_facrepcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FACREPCOD_Includeaddnewoption")) ;
            Combo_facrepcod_Htmltemplate = httpContext.cgiGet( "COMBO_FACREPCOD_Htmltemplate") ;
            Combo_facrepcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FACREPCOD_Multiplevaluestype") ;
            Combo_facrepcod_Loadingdata = httpContext.cgiGet( "COMBO_FACREPCOD_Loadingdata") ;
            Combo_facrepcod_Noresultsfound = httpContext.cgiGet( "COMBO_FACREPCOD_Noresultsfound") ;
            Combo_facrepcod_Emptyitemtext = httpContext.cgiGet( "COMBO_FACREPCOD_Emptyitemtext") ;
            Combo_facrepcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FACREPCOD_Onlyselectedvalues") ;
            Combo_facrepcod_Selectalltext = httpContext.cgiGet( "COMBO_FACREPCOD_Selectalltext") ;
            Combo_facrepcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FACREPCOD_Multiplevaluesseparator") ;
            Combo_facrepcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_FACREPCOD_Addnewoptiontext") ;
            Combo_facrepcod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FACREPCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A430FacCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            }
            else
            {
               A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            }
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACDIVCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacDivCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3115FacDivCod = (byte)(0) ;
               n3115FacDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
            }
            else
            {
               A3115FacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3115FacDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
            }
            cmbFacDivTCod.setValue( httpContext.cgiGet( cmbFacDivTCod.getInternalname()) );
            A3096FacDivTCod = httpContext.cgiGet( cmbFacDivTCod.getInternalname()) ;
            n3096FacDivTCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
            A3119FacRepCod = httpContext.cgiGet( edtFacRepCod_Internalname) ;
            n3119FacRepCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
            AV42Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
            AV40ComboFacDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCombofacdivcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40ComboFacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ComboFacDivCod), 2, 0));
            AV38ComboFacRepCod = httpContext.cgiGet( edtavCombofacrepcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38ComboFacRepCod", AV38ComboFacRepCod);
            A3116FacDivAbr = httpContext.cgiGet( edtFacDivAbr_Internalname) ;
            n3116FacDivAbr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", A3116FacDivAbr);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TFACDIV");
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV42Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV42Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A430FacCod != Z430FacCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\tfacdiv:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
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
                  sMode43 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode43 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound43 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_B50( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FACCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacCod_Internalname ;
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
                        e11B52 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12B52 ();
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
         e12B52 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllB543( ) ;
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
         disableAttributesB543( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacdivcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacdivcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacrepcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacrepcod_Enabled), 5, 0), true);
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

   public void confirm_B50( )
   {
      beforeValidateB543( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsB543( ) ;
         }
         else
         {
            checkExtendedTableB543( ) ;
            closeExtendedTableCursorsB543( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionB50( )
   {
   }

   public void e11B52( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfacdiv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = AV26EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfacdiv_impl.this.AV26EmprCod = GXv_char2[0] ;
      tfacdiv_impl.this.AV27EmprNom = GXv_char3[0] ;
      tfacdiv_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV29WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV29WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtFacRepCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacRepCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRepCod_Visible), 5, 0), true);
      AV38ComboFacRepCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ComboFacRepCod", AV38ComboFacRepCod);
      edtavCombofacrepcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacrepcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacrepcod_Visible), 5, 0), true);
      edtFacDivCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDivCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDivCod_Visible), 5, 0), true);
      AV40ComboFacDivCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40ComboFacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ComboFacDivCod), 2, 0));
      edtavCombofacdivcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacdivcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacdivcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFACDIVCOD' */
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
      /* Execute user subroutine: 'LOADCOMBOFACREPCOD' */
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
      AV30TrnContext.fromxml(AV31WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV30TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV42Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV43GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GXV1), 8, 0));
         while ( AV43GXV1 <= AV30TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV35TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV30TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV43GXV1));
            if ( GXutil.strcmp(AV35TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV32Insert_CliCod = (int)(GXutil.lval( AV35TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Insert_CliCod), 6, 0));
            }
            else if ( GXutil.strcmp(AV35TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FacDivCod") == 0 )
            {
               AV33Insert_FacDivCod = (byte)(GXutil.lval( AV35TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33Insert_FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Insert_FacDivCod), 2, 0));
               if ( ! (0==AV33Insert_FacDivCod) )
               {
                  AV40ComboFacDivCod = AV33Insert_FacDivCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV40ComboFacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ComboFacDivCod), 2, 0));
                  Combo_facdivcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV40ComboFacDivCod, 2, 0)) ;
                  ucCombo_facdivcod.sendProperty(context, "", false, Combo_facdivcod_Internalname, "SelectedValue_set", Combo_facdivcod_Selectedvalue_set);
                  Combo_facdivcod_Enabled = false ;
                  ucCombo_facdivcod.sendProperty(context, "", false, Combo_facdivcod_Internalname, "Enabled", GXutil.booltostr( Combo_facdivcod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV35TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FacRepCod") == 0 )
            {
               AV34Insert_FacRepCod = AV35TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34Insert_FacRepCod", AV34Insert_FacRepCod);
               if ( ! (GXutil.strcmp("", AV34Insert_FacRepCod)==0) )
               {
                  AV38ComboFacRepCod = AV34Insert_FacRepCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV38ComboFacRepCod", AV38ComboFacRepCod);
                  Combo_facrepcod_Selectedvalue_set = AV38ComboFacRepCod ;
                  ucCombo_facrepcod.sendProperty(context, "", false, Combo_facrepcod_Internalname, "SelectedValue_set", Combo_facrepcod_Selectedvalue_set);
                  Combo_facrepcod_Enabled = false ;
                  ucCombo_facrepcod.sendProperty(context, "", false, Combo_facrepcod_Internalname, "Enabled", GXutil.booltostr( Combo_facrepcod_Enabled));
               }
            }
            AV43GXV1 = (int)(AV43GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GXV1), 8, 0));
         }
      }
      edtFacDivAbr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDivAbr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDivAbr_Visible), 5, 0), true);
   }

   public void e12B52( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV30TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.facturacion.tfacdivww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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
      /* 'LOADCOMBOFACREPCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV36FacRepCod_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.facturacion.tfacdivloaddvcombo(remoteHandle, context).execute( "FacRepCod", Gx_mode, AV26EmprCod, AV28FacCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tfacdiv_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV36FacRepCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_facrepcod_Selectedvalue_set = AV37ComboSelectedValue ;
      ucCombo_facrepcod.sendProperty(context, "", false, Combo_facrepcod_Internalname, "SelectedValue_set", Combo_facrepcod_Selectedvalue_set);
      AV38ComboFacRepCod = AV37ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ComboFacRepCod", AV38ComboFacRepCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_facrepcod_Enabled = false ;
         ucCombo_facrepcod.sendProperty(context, "", false, Combo_facrepcod_Internalname, "Enabled", GXutil.booltostr( Combo_facrepcod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOFACDIVCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV39FacDivCod_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.facturacion.tfacdivloaddvcombo(remoteHandle, context).execute( "FacDivCod", Gx_mode, AV26EmprCod, AV28FacCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tfacdiv_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV39FacDivCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_facdivcod_Selectedvalue_set = AV37ComboSelectedValue ;
      ucCombo_facdivcod.sendProperty(context, "", false, Combo_facdivcod_Internalname, "SelectedValue_set", Combo_facdivcod_Selectedvalue_set);
      AV40ComboFacDivCod = (byte)(GXutil.lval( AV37ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40ComboFacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ComboFacDivCod), 2, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_facdivcod_Enabled = false ;
         ucCombo_facdivcod.sendProperty(context, "", false, Combo_facdivcod_Internalname, "Enabled", GXutil.booltostr( Combo_facdivcod_Enabled));
      }
   }

   public void zmB543( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3096FacDivTCod = T00B53_A3096FacDivTCod[0] ;
            Z3119FacRepCod = T00B53_A3119FacRepCod[0] ;
            Z252CliCod = T00B53_A252CliCod[0] ;
            Z3115FacDivCod = T00B53_A3115FacDivCod[0] ;
         }
         else
         {
            Z3096FacDivTCod = A3096FacDivTCod ;
            Z3119FacRepCod = A3119FacRepCod ;
            Z252CliCod = A252CliCod ;
            Z3115FacDivCod = A3115FacDivCod ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z430FacCod = A430FacCod ;
         Z3096FacDivTCod = A3096FacDivTCod ;
         Z396EmprCod = A396EmprCod ;
         Z3119FacRepCod = A3119FacRepCod ;
         Z252CliCod = A252CliCod ;
         Z3115FacDivCod = A3115FacDivCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z3116FacDivAbr = A3116FacDivAbr ;
         Z3120FacRepNom = A3120FacRepNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      AV42Pgmname = "Facturacion.TFACDIV" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV26EmprCod)==0) )
      {
         A396EmprCod = AV26EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00B54 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00B54_A407EmprNom[0] ;
      n407EmprNom = T00B54_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV28FacCod) )
      {
         A430FacCod = AV28FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      if ( ! (0==AV28FacCod) )
      {
         edtFacCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFacCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV28FacCod) )
      {
         edtFacCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV33Insert_FacDivCod) )
      {
         edtFacDivCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDivCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFacDivCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDivCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV34Insert_FacRepCod)==0) )
      {
         edtFacRepCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRepCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFacRepCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRepCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV32Insert_CliCod) )
      {
         A252CliCod = AV32Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV33Insert_FacDivCod) )
      {
         A3115FacDivCod = AV33Insert_FacDivCod ;
         n3115FacDivCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
      }
      else
      {
         if ( (0==AV40ComboFacDivCod) )
         {
            A3115FacDivCod = (byte)(0) ;
            n3115FacDivCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
            n3115FacDivCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
         }
         else
         {
            if ( ! (0==AV40ComboFacDivCod) )
            {
               A3115FacDivCod = AV40ComboFacDivCod ;
               n3115FacDivCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
            }
         }
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV34Insert_FacRepCod)==0) )
      {
         A3119FacRepCod = AV34Insert_FacRepCod ;
         n3119FacRepCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
      }
      else
      {
         if ( (GXutil.strcmp("", AV38ComboFacRepCod)==0) )
         {
            A3119FacRepCod = "" ;
            n3119FacRepCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
            n3119FacRepCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV38ComboFacRepCod)==0) )
            {
               A3119FacRepCod = AV38ComboFacRepCod ;
               n3119FacRepCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
            }
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
         /* Using cursor T00B56 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T00B56_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(4);
         /* Using cursor T00B58 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
         A3116FacDivAbr = T00B58_A3116FacDivAbr[0] ;
         n3116FacDivAbr = T00B58_n3116FacDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", A3116FacDivAbr);
         pr_default.close(6);
         /* Using cursor T00B55 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
         A3120FacRepNom = T00B55_A3120FacRepNom[0] ;
         n3120FacRepNom = T00B55_n3120FacRepNom[0] ;
         pr_default.close(3);
      }
   }

   public void loadB543( )
   {
      /* Using cursor T00B59 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A279CliNom = T00B59_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A3096FacDivTCod = T00B59_A3096FacDivTCod[0] ;
         n3096FacDivTCod = T00B59_n3096FacDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
         A3116FacDivAbr = T00B59_A3116FacDivAbr[0] ;
         n3116FacDivAbr = T00B59_n3116FacDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", A3116FacDivAbr);
         A3120FacRepNom = T00B59_A3120FacRepNom[0] ;
         n3120FacRepNom = T00B59_n3120FacRepNom[0] ;
         A407EmprNom = T00B59_A407EmprNom[0] ;
         n407EmprNom = T00B59_n407EmprNom[0] ;
         A3119FacRepCod = T00B59_A3119FacRepCod[0] ;
         n3119FacRepCod = T00B59_n3119FacRepCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         A252CliCod = T00B59_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A3115FacDivCod = T00B59_A3115FacDivCod[0] ;
         n3115FacDivCod = T00B59_n3115FacDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
         zmB543( -17) ;
      }
      pr_default.close(7);
      onLoadActionsB543( ) ;
   }

   public void onLoadActionsB543( )
   {
   }

   public void checkExtendedTableB543( )
   {
      nIsDirty_43 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00B58 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (0==A3115FacDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivFac", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3116FacDivAbr = T00B58_A3116FacDivAbr[0] ;
      n3116FacDivAbr = T00B58_n3116FacDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", A3116FacDivAbr);
      pr_default.close(6);
      /* Using cursor T00B55 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FacRepres", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACREPCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacRepCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3120FacRepNom = T00B55_A3120FacRepNom[0] ;
      n3120FacRepNom = T00B55_n3120FacRepNom[0] ;
      pr_default.close(3);
      /* Using cursor T00B56 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00B56_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(4);
      /* Using cursor T00B57 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "COMREP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacRepCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsB543( )
   {
      pr_default.close(6);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_22( byte A3115FacDivCod )
   {
      /* Using cursor T00B510 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (0==A3115FacDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivFac", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacDivCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3116FacDivAbr = T00B510_A3116FacDivAbr[0] ;
      n3116FacDivAbr = T00B510_n3116FacDivAbr[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", A3116FacDivAbr);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3116FacDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_19( String A396EmprCod ,
                          String A3119FacRepCod )
   {
      /* Using cursor T00B511 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FacRepres", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACREPCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacRepCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A3120FacRepNom = T00B511_A3120FacRepNom[0] ;
      n3120FacRepNom = T00B511_n3120FacRepNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3120FacRepNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_20( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T00B512 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00B512_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_21( String A396EmprCod ,
                          String A3119FacRepCod ,
                          int A252CliCod )
   {
      /* Using cursor T00B513 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "COMREP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacRepCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
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

   public void getKeyB543( )
   {
      /* Using cursor T00B514 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound43 = (short)(1) ;
      }
      else
      {
         RcdFound43 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00B53 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmB543( 17) ;
         RcdFound43 = (short)(1) ;
         A430FacCod = T00B53_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A3096FacDivTCod = T00B53_A3096FacDivTCod[0] ;
         n3096FacDivTCod = T00B53_n3096FacDivTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
         A396EmprCod = T00B53_A396EmprCod[0] ;
         A3119FacRepCod = T00B53_A3119FacRepCod[0] ;
         n3119FacRepCod = T00B53_n3119FacRepCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
         A252CliCod = T00B53_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A3115FacDivCod = T00B53_A3115FacDivCod[0] ;
         n3115FacDivCod = T00B53_n3115FacDivCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z430FacCod = A430FacCod ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadB543( ) ;
         if ( AnyError == 1 )
         {
            RcdFound43 = (short)(0) ;
            initializeNonKeyB543( ) ;
         }
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound43 = (short)(0) ;
         initializeNonKeyB543( ) ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyB543( ) ;
      if ( RcdFound43 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T00B515 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A430FacCod), Integer.valueOf(A430FacCod), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T00B515_A430FacCod[0] < A430FacCod ) || ( T00B515_A430FacCod[0] == A430FacCod ) && ( GXutil.strcmp(T00B515_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T00B515_A430FacCod[0] > A430FacCod ) || ( T00B515_A430FacCod[0] == A430FacCod ) && ( GXutil.strcmp(T00B515_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            A430FacCod = T00B515_A430FacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            A396EmprCod = T00B515_A396EmprCod[0] ;
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T00B516 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A430FacCod), Integer.valueOf(A430FacCod), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T00B516_A430FacCod[0] > A430FacCod ) || ( T00B516_A430FacCod[0] == A430FacCod ) && ( GXutil.strcmp(T00B516_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T00B516_A430FacCod[0] < A430FacCod ) || ( T00B516_A430FacCod[0] == A430FacCod ) && ( GXutil.strcmp(T00B516_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            A430FacCod = T00B516_A430FacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            A396EmprCod = T00B516_A396EmprCod[0] ;
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyB543( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertB543( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound43 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A430FacCod = Z430FacCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FACCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateB543( ) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertB543( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FACCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFacCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtFacCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertB543( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = Z430FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyB543( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00B52 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFAVEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3096FacDivTCod, T00B52_A3096FacDivTCod[0]) != 0 ) || ( GXutil.strcmp(Z3119FacRepCod, T00B52_A3119FacRepCod[0]) != 0 ) || ( Z252CliCod != T00B52_A252CliCod[0] ) || ( Z3115FacDivCod != T00B52_A3115FacDivCod[0] ) )
         {
            if ( GXutil.strcmp(Z3096FacDivTCod, T00B52_A3096FacDivTCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tfacdiv:[seudo value changed for attri]"+"FacDivTCod");
               GXutil.writeLogRaw("Old: ",Z3096FacDivTCod);
               GXutil.writeLogRaw("Current: ",T00B52_A3096FacDivTCod[0]);
            }
            if ( GXutil.strcmp(Z3119FacRepCod, T00B52_A3119FacRepCod[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tfacdiv:[seudo value changed for attri]"+"FacRepCod");
               GXutil.writeLogRaw("Old: ",Z3119FacRepCod);
               GXutil.writeLogRaw("Current: ",T00B52_A3119FacRepCod[0]);
            }
            if ( Z252CliCod != T00B52_A252CliCod[0] )
            {
               GXutil.writeLogln("facturacion.tfacdiv:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00B52_A252CliCod[0]);
            }
            if ( Z3115FacDivCod != T00B52_A3115FacDivCod[0] )
            {
               GXutil.writeLogln("facturacion.tfacdiv:[seudo value changed for attri]"+"FacDivCod");
               GXutil.writeLogRaw("Old: ",Z3115FacDivCod);
               GXutil.writeLogRaw("Current: ",T00B52_A3115FacDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFAVEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertB543( )
   {
      beforeValidateB543( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableB543( ) ;
      }
      if ( AnyError == 0 )
      {
         zmB543( 0) ;
         checkOptimisticConcurrencyB543( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmB543( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertB543( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00B517 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A430FacCod), Boolean.valueOf(n3096FacDivTCod), A3096FacDivTCod, A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
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
                        resetCaptionB50( ) ;
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
            loadB543( ) ;
         }
         endLevelB543( ) ;
      }
      closeExtendedTableCursorsB543( ) ;
   }

   public void updateB543( )
   {
      beforeValidateB543( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableB543( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyB543( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmB543( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateB543( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00B518 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n3096FacDivTCod), A3096FacDivTCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod), A396EmprCod, Integer.valueOf(A430FacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFAVEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateB543( ) ;
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
         endLevelB543( ) ;
      }
      closeExtendedTableCursorsB543( ) ;
   }

   public void deferredUpdateB543( )
   {
   }

   public void delete( )
   {
      beforeValidateB543( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyB543( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsB543( ) ;
         afterConfirmB543( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteB543( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00B519 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
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
      sMode43 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelB543( ) ;
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsB543( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00B520 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
         A3116FacDivAbr = T00B520_A3116FacDivAbr[0] ;
         n3116FacDivAbr = T00B520_n3116FacDivAbr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", A3116FacDivAbr);
         pr_default.close(18);
         /* Using cursor T00B521 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
         A3120FacRepNom = T00B521_A3120FacRepNom[0] ;
         n3120FacRepNom = T00B521_n3120FacRepNom[0] ;
         pr_default.close(19);
         /* Using cursor T00B522 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T00B522_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(20);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00B523 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACVTO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00B524 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFAVEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void endLevelB543( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteB543( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tfacdiv");
         if ( AnyError == 0 )
         {
            confirmValuesB50( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tfacdiv");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartB543( )
   {
      /* Scan By routine */
      /* Using cursor T00B525 */
      pr_default.execute(23);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A396EmprCod = T00B525_A396EmprCod[0] ;
         A430FacCod = T00B525_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextB543( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A396EmprCod = T00B525_A396EmprCod[0] ;
         A430FacCod = T00B525_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
   }

   public void scanEndB543( )
   {
      pr_default.close(23);
   }

   public void afterConfirmB543( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertB543( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateB543( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteB543( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteB543( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateB543( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesB543( )
   {
      edtFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtFacDivCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDivCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDivCod_Enabled), 5, 0), true);
      cmbFacDivTCod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbFacDivTCod.getInternalname(), "Enabled", GXutil.ltrimstr( cmbFacDivTCod.getEnabled(), 5, 0), true);
      edtFacRepCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacRepCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacRepCod_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombofacdivcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacdivcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacdivcod_Enabled), 5, 0), true);
      edtavCombofacrepcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofacrepcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofacrepcod_Enabled), 5, 0), true);
      edtFacDivAbr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacDivAbr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacDivAbr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesB543( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesB50( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tfacdiv", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV28FacCod,8,0))}, new String[] {"Gx_mode","EmprCod","FacCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFACDIV");
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV42Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tfacdiv:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z430FacCod", GXutil.ltrim( localUtil.ntoc( Z430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3096FacDivTCod", GXutil.rtrim( Z3096FacDivTCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3119FacRepCod", GXutil.rtrim( Z3119FacRepCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3115FacDivCod", GXutil.ltrim( localUtil.ntoc( Z3115FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N3115FacDivCod", GXutil.ltrim( localUtil.ntoc( A3115FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3119FacRepCod", GXutil.rtrim( A3119FacRepCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFACDIVCOD_DATA", AV39FacDivCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFACDIVCOD_DATA", AV39FacDivCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFACREPCOD_DATA", AV36FacRepCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFACREPCOD_DATA", AV36FacRepCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV30TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV30TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV30TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACCOD", GXutil.ltrim( localUtil.ntoc( AV28FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FacCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV32Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FACDIVCOD", GXutil.ltrim( localUtil.ntoc( AV33Insert_FacDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FACREPCOD", GXutil.rtrim( AV34Insert_FacRepCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FACREPNOM", GXutil.rtrim( A3120FacRepNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACDIVCOD_Objectcall", GXutil.rtrim( Combo_facdivcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACDIVCOD_Cls", GXutil.rtrim( Combo_facdivcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACDIVCOD_Selectedvalue_set", GXutil.rtrim( Combo_facdivcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACDIVCOD_Enabled", GXutil.booltostr( Combo_facdivcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACDIVCOD_Emptyitem", GXutil.booltostr( Combo_facdivcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACREPCOD_Objectcall", GXutil.rtrim( Combo_facrepcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACREPCOD_Cls", GXutil.rtrim( Combo_facrepcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACREPCOD_Selectedvalue_set", GXutil.rtrim( Combo_facrepcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FACREPCOD_Enabled", GXutil.booltostr( Combo_facrepcod_Enabled));
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
      return formatLink("app.facturacion.tfacdiv", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV28FacCod,8,0))}, new String[] {"Gx_mode","EmprCod","FacCod"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TFACDIV" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DIVISAS/REPRESENTANTES", "") ;
   }

   public void initializeNonKeyB543( )
   {
      A3073RepCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3073RepCod", A3073RepCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A3115FacDivCod = (byte)(0) ;
      n3115FacDivCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3115FacDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3115FacDivCod), 2, 0));
      A3119FacRepCod = "" ;
      n3119FacRepCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3119FacRepCod", A3119FacRepCod);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A3096FacDivTCod = "" ;
      n3096FacDivTCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
      A3116FacDivAbr = "" ;
      n3116FacDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", A3116FacDivAbr);
      A3120FacRepNom = "" ;
      n3120FacRepNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3120FacRepNom", A3120FacRepNom);
      Z3096FacDivTCod = "" ;
      Z3119FacRepCod = "" ;
      Z252CliCod = 0 ;
      Z3115FacDivCod = (byte)(0) ;
   }

   public void initAllB543( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A430FacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      initializeNonKeyB543( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269210535314", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tfacdiv.js", "?20269210535314", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtFacCod_Internalname = "FACCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockfacdivcod_Internalname = "TEXTBLOCKFACDIVCOD" ;
      Combo_facdivcod_Internalname = "COMBO_FACDIVCOD" ;
      edtFacDivCod_Internalname = "FACDIVCOD" ;
      divTablesplittedfacdivcod_Internalname = "TABLESPLITTEDFACDIVCOD" ;
      cmbFacDivTCod.setInternalname( "FACDIVTCOD" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockfacrepcod_Internalname = "TEXTBLOCKFACREPCOD" ;
      Combo_facrepcod_Internalname = "COMBO_FACREPCOD" ;
      edtFacRepCod_Internalname = "FACREPCOD" ;
      divTablesplittedfacrepcod_Internalname = "TABLESPLITTEDFACREPCOD" ;
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
      edtavCombofacdivcod_Internalname = "vCOMBOFACDIVCOD" ;
      divSectionattribute_facdivcod_Internalname = "SECTIONATTRIBUTE_FACDIVCOD" ;
      edtavCombofacrepcod_Internalname = "vCOMBOFACREPCOD" ;
      divSectionattribute_facrepcod_Internalname = "SECTIONATTRIBUTE_FACREPCOD" ;
      edtFacDivAbr_Internalname = "FACDIVABR" ;
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
      Form.setCaption( httpContext.getMessage( "DIVISAS/REPRESENTANTES", "") );
      edtFacDivAbr_Jsonclick = "" ;
      edtFacDivAbr_Enabled = 0 ;
      edtFacDivAbr_Visible = 1 ;
      edtavCombofacrepcod_Jsonclick = "" ;
      edtavCombofacrepcod_Enabled = 0 ;
      edtavCombofacrepcod_Visible = 1 ;
      edtavCombofacdivcod_Jsonclick = "" ;
      edtavCombofacdivcod_Enabled = 0 ;
      edtavCombofacdivcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFacRepCod_Jsonclick = "" ;
      edtFacRepCod_Enabled = 1 ;
      edtFacRepCod_Visible = 1 ;
      Combo_facrepcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_facrepcod_Caption = "" ;
      Combo_facrepcod_Enabled = GXutil.toBoolean( -1) ;
      cmbFacDivTCod.setJsonclick( "" );
      cmbFacDivTCod.setEnabled( 1 );
      edtFacDivCod_Jsonclick = "" ;
      edtFacDivCod_Enabled = 1 ;
      edtFacDivCod_Visible = 1 ;
      Combo_facdivcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_facdivcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_facdivcod_Caption = "" ;
      Combo_facdivcod_Enabled = GXutil.toBoolean( -1) ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtFacCod_Jsonclick = "" ;
      edtFacCod_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      cmbFacDivTCod.setName( "FACDIVTCOD" );
      cmbFacDivTCod.setWebtags( "" );
      cmbFacDivTCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      cmbFacDivTCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      if ( cmbFacDivTCod.getItemCount() > 0 )
      {
         A3096FacDivTCod = cmbFacDivTCod.getValidValue(A3096FacDivTCod) ;
         n3096FacDivTCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3096FacDivTCod", A3096FacDivTCod);
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

   public void valid_Clicod( )
   {
      /* Using cursor T00B522 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00B522_A279CliNom[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Facdivcod( )
   {
      n3115FacDivCod = false ;
      n3116FacDivAbr = false ;
      /* Using cursor T00B520 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n3115FacDivCod), Byte.valueOf(A3115FacDivCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (0==A3115FacDivCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivFac", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACDIVCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacDivCod_Internalname ;
         }
      }
      A3116FacDivAbr = T00B520_A3116FacDivAbr[0] ;
      n3116FacDivAbr = T00B520_n3116FacDivAbr[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3116FacDivAbr", GXutil.rtrim( A3116FacDivAbr));
   }

   public void valid_Facrepcod( )
   {
      n3119FacRepCod = false ;
      n3120FacRepNom = false ;
      /* Using cursor T00B521 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FacRepres", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FACREPCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacRepCod_Internalname ;
         }
      }
      A3120FacRepNom = T00B521_A3120FacRepNom[0] ;
      n3120FacRepNom = T00B521_n3120FacRepNom[0] ;
      pr_default.close(19);
      /* Using cursor T00B526 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n3119FacRepCod), A3119FacRepCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3119FacRepCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "COMREP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacRepCod_Internalname ;
         }
      }
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3120FacRepNom", GXutil.rtrim( A3120FacRepNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV28FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV28FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV42Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12B52',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_FACCOD","{handler:'valid_Faccod',iparms:[]");
      setEventMetadata("VALID_FACCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_FACDIVCOD","{handler:'valid_Facdivcod',iparms:[{av:'A3115FacDivCod',fld:'FACDIVCOD',pic:'Z9'},{av:'A3116FacDivAbr',fld:'FACDIVABR',pic:''}]");
      setEventMetadata("VALID_FACDIVCOD",",oparms:[{av:'A3116FacDivAbr',fld:'FACDIVABR',pic:''}]}");
      setEventMetadata("VALID_FACREPCOD","{handler:'valid_Facrepcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3119FacRepCod',fld:'FACREPCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A3120FacRepNom',fld:'FACREPNOM',pic:''}]");
      setEventMetadata("VALID_FACREPCOD",",oparms:[{av:'A3120FacRepNom',fld:'FACREPNOM',pic:''}]}");
      setEventMetadata("VALIDV_COMBOFACDIVCOD","{handler:'validv_Combofacdivcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOFACDIVCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOFACREPCOD","{handler:'validv_Combofacrepcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOFACREPCOD",",oparms:[]}");
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
      pr_default.close(19);
      pr_default.close(24);
      pr_default.close(20);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV26EmprCod = "" ;
      Z396EmprCod = "" ;
      Z3096FacDivTCod = "" ;
      Z3119FacRepCod = "" ;
      N3119FacRepCod = "" ;
      Combo_facrepcod_Selectedvalue_get = "" ;
      Combo_facdivcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A3119FacRepCod = "" ;
      Gx_mode = "" ;
      AV26EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A3096FacDivTCod = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A279CliNom = "" ;
      lblTextblockfacdivcod_Jsonclick = "" ;
      ucCombo_facdivcod = new com.genexus.webpanels.GXUserControl();
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV39FacDivCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblockfacrepcod_Jsonclick = "" ;
      ucCombo_facrepcod = new com.genexus.webpanels.GXUserControl();
      AV36FacRepCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV42Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV38ComboFacRepCod = "" ;
      A3116FacDivAbr = "" ;
      AV34Insert_FacRepCod = "" ;
      A407EmprNom = "" ;
      A3120FacRepNom = "" ;
      Combo_facdivcod_Objectcall = "" ;
      Combo_facdivcod_Class = "" ;
      Combo_facdivcod_Icontype = "" ;
      Combo_facdivcod_Icon = "" ;
      Combo_facdivcod_Tooltip = "" ;
      Combo_facdivcod_Selectedvalue_set = "" ;
      Combo_facdivcod_Selectedtext_set = "" ;
      Combo_facdivcod_Selectedtext_get = "" ;
      Combo_facdivcod_Gamoauthtoken = "" ;
      Combo_facdivcod_Ddointernalname = "" ;
      Combo_facdivcod_Titlecontrolalign = "" ;
      Combo_facdivcod_Dropdownoptionstype = "" ;
      Combo_facdivcod_Titlecontrolidtoreplace = "" ;
      Combo_facdivcod_Datalisttype = "" ;
      Combo_facdivcod_Datalistfixedvalues = "" ;
      Combo_facdivcod_Datalistproc = "" ;
      Combo_facdivcod_Datalistprocparametersprefix = "" ;
      Combo_facdivcod_Remoteservicesparameters = "" ;
      Combo_facdivcod_Htmltemplate = "" ;
      Combo_facdivcod_Multiplevaluestype = "" ;
      Combo_facdivcod_Loadingdata = "" ;
      Combo_facdivcod_Noresultsfound = "" ;
      Combo_facdivcod_Emptyitemtext = "" ;
      Combo_facdivcod_Onlyselectedvalues = "" ;
      Combo_facdivcod_Selectalltext = "" ;
      Combo_facdivcod_Multiplevaluesseparator = "" ;
      Combo_facdivcod_Addnewoptiontext = "" ;
      Combo_facrepcod_Objectcall = "" ;
      Combo_facrepcod_Class = "" ;
      Combo_facrepcod_Icontype = "" ;
      Combo_facrepcod_Icon = "" ;
      Combo_facrepcod_Tooltip = "" ;
      Combo_facrepcod_Selectedvalue_set = "" ;
      Combo_facrepcod_Selectedtext_set = "" ;
      Combo_facrepcod_Selectedtext_get = "" ;
      Combo_facrepcod_Gamoauthtoken = "" ;
      Combo_facrepcod_Ddointernalname = "" ;
      Combo_facrepcod_Titlecontrolalign = "" ;
      Combo_facrepcod_Dropdownoptionstype = "" ;
      Combo_facrepcod_Titlecontrolidtoreplace = "" ;
      Combo_facrepcod_Datalisttype = "" ;
      Combo_facrepcod_Datalistfixedvalues = "" ;
      Combo_facrepcod_Datalistproc = "" ;
      Combo_facrepcod_Datalistprocparametersprefix = "" ;
      Combo_facrepcod_Remoteservicesparameters = "" ;
      Combo_facrepcod_Htmltemplate = "" ;
      Combo_facrepcod_Multiplevaluestype = "" ;
      Combo_facrepcod_Loadingdata = "" ;
      Combo_facrepcod_Noresultsfound = "" ;
      Combo_facrepcod_Emptyitemtext = "" ;
      Combo_facrepcod_Onlyselectedvalues = "" ;
      Combo_facrepcod_Selectalltext = "" ;
      Combo_facrepcod_Multiplevaluesseparator = "" ;
      Combo_facrepcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode43 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV24Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV27EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      AV29WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV30TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV31WebSession = httpContext.getWebSession();
      AV35TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV37ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z3116FacDivAbr = "" ;
      Z3120FacRepNom = "" ;
      T00B54_A407EmprNom = new String[] {""} ;
      T00B54_n407EmprNom = new boolean[] {false} ;
      T00B56_A279CliNom = new String[] {""} ;
      T00B58_A3116FacDivAbr = new String[] {""} ;
      T00B58_n3116FacDivAbr = new boolean[] {false} ;
      T00B55_A3120FacRepNom = new String[] {""} ;
      T00B55_n3120FacRepNom = new boolean[] {false} ;
      T00B59_A430FacCod = new int[1] ;
      T00B59_A279CliNom = new String[] {""} ;
      T00B59_A3096FacDivTCod = new String[] {""} ;
      T00B59_n3096FacDivTCod = new boolean[] {false} ;
      T00B59_A3116FacDivAbr = new String[] {""} ;
      T00B59_n3116FacDivAbr = new boolean[] {false} ;
      T00B59_A3120FacRepNom = new String[] {""} ;
      T00B59_n3120FacRepNom = new boolean[] {false} ;
      T00B59_A407EmprNom = new String[] {""} ;
      T00B59_n407EmprNom = new boolean[] {false} ;
      T00B59_A396EmprCod = new String[] {""} ;
      T00B59_A3119FacRepCod = new String[] {""} ;
      T00B59_n3119FacRepCod = new boolean[] {false} ;
      T00B59_A252CliCod = new int[1] ;
      T00B59_A3115FacDivCod = new byte[1] ;
      T00B59_n3115FacDivCod = new boolean[] {false} ;
      T00B57_A3073RepCod = new String[] {""} ;
      T00B510_A3116FacDivAbr = new String[] {""} ;
      T00B510_n3116FacDivAbr = new boolean[] {false} ;
      T00B511_A3120FacRepNom = new String[] {""} ;
      T00B511_n3120FacRepNom = new boolean[] {false} ;
      T00B512_A279CliNom = new String[] {""} ;
      T00B513_A3073RepCod = new String[] {""} ;
      T00B514_A396EmprCod = new String[] {""} ;
      T00B514_A430FacCod = new int[1] ;
      T00B53_A430FacCod = new int[1] ;
      T00B53_A3096FacDivTCod = new String[] {""} ;
      T00B53_n3096FacDivTCod = new boolean[] {false} ;
      T00B53_A396EmprCod = new String[] {""} ;
      T00B53_A3119FacRepCod = new String[] {""} ;
      T00B53_n3119FacRepCod = new boolean[] {false} ;
      T00B53_A252CliCod = new int[1] ;
      T00B53_A3115FacDivCod = new byte[1] ;
      T00B53_n3115FacDivCod = new boolean[] {false} ;
      T00B515_A430FacCod = new int[1] ;
      T00B515_A396EmprCod = new String[] {""} ;
      T00B516_A430FacCod = new int[1] ;
      T00B516_A396EmprCod = new String[] {""} ;
      T00B52_A430FacCod = new int[1] ;
      T00B52_A3096FacDivTCod = new String[] {""} ;
      T00B52_n3096FacDivTCod = new boolean[] {false} ;
      T00B52_A396EmprCod = new String[] {""} ;
      T00B52_A3119FacRepCod = new String[] {""} ;
      T00B52_n3119FacRepCod = new boolean[] {false} ;
      T00B52_A252CliCod = new int[1] ;
      T00B52_A3115FacDivCod = new byte[1] ;
      T00B52_n3115FacDivCod = new boolean[] {false} ;
      T00B520_A3116FacDivAbr = new String[] {""} ;
      T00B520_n3116FacDivAbr = new boolean[] {false} ;
      T00B521_A3120FacRepNom = new String[] {""} ;
      T00B521_n3120FacRepNom = new boolean[] {false} ;
      T00B522_A279CliNom = new String[] {""} ;
      T00B523_A396EmprCod = new String[] {""} ;
      T00B523_A430FacCod = new int[1] ;
      T00B523_A956FacVtoLin = new byte[1] ;
      T00B524_A396EmprCod = new String[] {""} ;
      T00B524_A430FacCod = new int[1] ;
      T00B524_A446FacLin = new int[1] ;
      T00B525_A396EmprCod = new String[] {""} ;
      T00B525_A430FacCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      A3073RepCod = "" ;
      T00B526_A3073RepCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdiv__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdiv__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdiv__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdiv__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacdiv__default(),
         new Object[] {
             new Object[] {
            T00B52_A430FacCod, T00B52_A3096FacDivTCod, T00B52_n3096FacDivTCod, T00B52_A396EmprCod, T00B52_A3119FacRepCod, T00B52_n3119FacRepCod, T00B52_A252CliCod, T00B52_A3115FacDivCod, T00B52_n3115FacDivCod
            }
            , new Object[] {
            T00B53_A430FacCod, T00B53_A3096FacDivTCod, T00B53_n3096FacDivTCod, T00B53_A396EmprCod, T00B53_A3119FacRepCod, T00B53_n3119FacRepCod, T00B53_A252CliCod, T00B53_A3115FacDivCod, T00B53_n3115FacDivCod
            }
            , new Object[] {
            T00B54_A407EmprNom, T00B54_n407EmprNom
            }
            , new Object[] {
            T00B55_A3120FacRepNom, T00B55_n3120FacRepNom
            }
            , new Object[] {
            T00B56_A279CliNom
            }
            , new Object[] {
            T00B57_A3073RepCod
            }
            , new Object[] {
            T00B58_A3116FacDivAbr, T00B58_n3116FacDivAbr
            }
            , new Object[] {
            T00B59_A430FacCod, T00B59_A279CliNom, T00B59_A3096FacDivTCod, T00B59_n3096FacDivTCod, T00B59_A3116FacDivAbr, T00B59_n3116FacDivAbr, T00B59_A3120FacRepNom, T00B59_n3120FacRepNom, T00B59_A407EmprNom, T00B59_n407EmprNom,
            T00B59_A396EmprCod, T00B59_A3119FacRepCod, T00B59_n3119FacRepCod, T00B59_A252CliCod, T00B59_A3115FacDivCod, T00B59_n3115FacDivCod
            }
            , new Object[] {
            T00B510_A3116FacDivAbr, T00B510_n3116FacDivAbr
            }
            , new Object[] {
            T00B511_A3120FacRepNom, T00B511_n3120FacRepNom
            }
            , new Object[] {
            T00B512_A279CliNom
            }
            , new Object[] {
            T00B513_A3073RepCod
            }
            , new Object[] {
            T00B514_A396EmprCod, T00B514_A430FacCod
            }
            , new Object[] {
            T00B515_A430FacCod, T00B515_A396EmprCod
            }
            , new Object[] {
            T00B516_A430FacCod, T00B516_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00B520_A3116FacDivAbr, T00B520_n3116FacDivAbr
            }
            , new Object[] {
            T00B521_A3120FacRepNom, T00B521_n3120FacRepNom
            }
            , new Object[] {
            T00B522_A279CliNom
            }
            , new Object[] {
            T00B523_A396EmprCod, T00B523_A430FacCod, T00B523_A956FacVtoLin
            }
            , new Object[] {
            T00B524_A396EmprCod, T00B524_A430FacCod, T00B524_A446FacLin
            }
            , new Object[] {
            T00B525_A396EmprCod, T00B525_A430FacCod
            }
            , new Object[] {
            T00B526_A3073RepCod
            }
         }
      );
      AV42Pgmname = "Facturacion.TFACDIV" ;
   }

   private byte Z3115FacDivCod ;
   private byte N3115FacDivCod ;
   private byte GxWebError ;
   private byte A3115FacDivCod ;
   private byte nKeyPressed ;
   private byte AV40ComboFacDivCod ;
   private byte AV33Insert_FacDivCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound43 ;
   private short nIsDirty_43 ;
   private int wcpOAV28FacCod ;
   private int Z430FacCod ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int AV28FacCod ;
   private int trnEnded ;
   private int A430FacCod ;
   private int edtFacCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtFacDivCod_Visible ;
   private int edtFacDivCod_Enabled ;
   private int edtFacRepCod_Visible ;
   private int edtFacRepCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombofacdivcod_Enabled ;
   private int edtavCombofacdivcod_Visible ;
   private int edtavCombofacrepcod_Visible ;
   private int edtavCombofacrepcod_Enabled ;
   private int edtFacDivAbr_Visible ;
   private int edtFacDivAbr_Enabled ;
   private int AV32Insert_CliCod ;
   private int Combo_facdivcod_Datalistupdateminimumcharacters ;
   private int Combo_facdivcod_Gxcontroltype ;
   private int Combo_facrepcod_Datalistupdateminimumcharacters ;
   private int Combo_facrepcod_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int AV43GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV26EmprCod ;
   private String Z396EmprCod ;
   private String Z3096FacDivTCod ;
   private String Z3119FacRepCod ;
   private String N3119FacRepCod ;
   private String Combo_facrepcod_Selectedvalue_get ;
   private String Combo_facdivcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A3119FacRepCod ;
   private String Gx_mode ;
   private String AV26EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFacCod_Internalname ;
   private String A3096FacDivTCod ;
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
   private String TempTags ;
   private String edtFacCod_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedfacdivcod_Internalname ;
   private String lblTextblockfacdivcod_Internalname ;
   private String lblTextblockfacdivcod_Jsonclick ;
   private String Combo_facdivcod_Caption ;
   private String Combo_facdivcod_Cls ;
   private String Combo_facdivcod_Internalname ;
   private String edtFacDivCod_Internalname ;
   private String edtFacDivCod_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divTablesplittedfacrepcod_Internalname ;
   private String lblTextblockfacrepcod_Internalname ;
   private String lblTextblockfacrepcod_Jsonclick ;
   private String Combo_facrepcod_Caption ;
   private String Combo_facrepcod_Cls ;
   private String Combo_facrepcod_Internalname ;
   private String edtFacRepCod_Internalname ;
   private String edtFacRepCod_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV42Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_facdivcod_Internalname ;
   private String edtavCombofacdivcod_Internalname ;
   private String edtavCombofacdivcod_Jsonclick ;
   private String divSectionattribute_facrepcod_Internalname ;
   private String edtavCombofacrepcod_Internalname ;
   private String AV38ComboFacRepCod ;
   private String edtavCombofacrepcod_Jsonclick ;
   private String edtFacDivAbr_Internalname ;
   private String A3116FacDivAbr ;
   private String edtFacDivAbr_Jsonclick ;
   private String AV34Insert_FacRepCod ;
   private String A407EmprNom ;
   private String A3120FacRepNom ;
   private String Combo_facdivcod_Objectcall ;
   private String Combo_facdivcod_Class ;
   private String Combo_facdivcod_Icontype ;
   private String Combo_facdivcod_Icon ;
   private String Combo_facdivcod_Tooltip ;
   private String Combo_facdivcod_Selectedvalue_set ;
   private String Combo_facdivcod_Selectedtext_set ;
   private String Combo_facdivcod_Selectedtext_get ;
   private String Combo_facdivcod_Gamoauthtoken ;
   private String Combo_facdivcod_Ddointernalname ;
   private String Combo_facdivcod_Titlecontrolalign ;
   private String Combo_facdivcod_Dropdownoptionstype ;
   private String Combo_facdivcod_Titlecontrolidtoreplace ;
   private String Combo_facdivcod_Datalisttype ;
   private String Combo_facdivcod_Datalistfixedvalues ;
   private String Combo_facdivcod_Datalistproc ;
   private String Combo_facdivcod_Datalistprocparametersprefix ;
   private String Combo_facdivcod_Remoteservicesparameters ;
   private String Combo_facdivcod_Htmltemplate ;
   private String Combo_facdivcod_Multiplevaluestype ;
   private String Combo_facdivcod_Loadingdata ;
   private String Combo_facdivcod_Noresultsfound ;
   private String Combo_facdivcod_Emptyitemtext ;
   private String Combo_facdivcod_Onlyselectedvalues ;
   private String Combo_facdivcod_Selectalltext ;
   private String Combo_facdivcod_Multiplevaluesseparator ;
   private String Combo_facdivcod_Addnewoptiontext ;
   private String Combo_facrepcod_Objectcall ;
   private String Combo_facrepcod_Class ;
   private String Combo_facrepcod_Icontype ;
   private String Combo_facrepcod_Icon ;
   private String Combo_facrepcod_Tooltip ;
   private String Combo_facrepcod_Selectedvalue_set ;
   private String Combo_facrepcod_Selectedtext_set ;
   private String Combo_facrepcod_Selectedtext_get ;
   private String Combo_facrepcod_Gamoauthtoken ;
   private String Combo_facrepcod_Ddointernalname ;
   private String Combo_facrepcod_Titlecontrolalign ;
   private String Combo_facrepcod_Dropdownoptionstype ;
   private String Combo_facrepcod_Titlecontrolidtoreplace ;
   private String Combo_facrepcod_Datalisttype ;
   private String Combo_facrepcod_Datalistfixedvalues ;
   private String Combo_facrepcod_Datalistproc ;
   private String Combo_facrepcod_Datalistprocparametersprefix ;
   private String Combo_facrepcod_Remoteservicesparameters ;
   private String Combo_facrepcod_Htmltemplate ;
   private String Combo_facrepcod_Multiplevaluestype ;
   private String Combo_facrepcod_Loadingdata ;
   private String Combo_facrepcod_Noresultsfound ;
   private String Combo_facrepcod_Emptyitemtext ;
   private String Combo_facrepcod_Onlyselectedvalues ;
   private String Combo_facrepcod_Selectalltext ;
   private String Combo_facrepcod_Multiplevaluesseparator ;
   private String Combo_facrepcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode43 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV24Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV27EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z3116FacDivAbr ;
   private String Z3120FacRepNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String A3073RepCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3115FacDivCod ;
   private boolean n3119FacRepCod ;
   private boolean wbErr ;
   private boolean n3096FacDivTCod ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_facdivcod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n3120FacRepNom ;
   private boolean Combo_facdivcod_Enabled ;
   private boolean Combo_facdivcod_Visible ;
   private boolean Combo_facdivcod_Allowmultipleselection ;
   private boolean Combo_facdivcod_Isgriditem ;
   private boolean Combo_facdivcod_Hasdescription ;
   private boolean Combo_facdivcod_Includeonlyselectedoption ;
   private boolean Combo_facdivcod_Includeselectalloption ;
   private boolean Combo_facdivcod_Includeaddnewoption ;
   private boolean Combo_facrepcod_Enabled ;
   private boolean Combo_facrepcod_Visible ;
   private boolean Combo_facrepcod_Allowmultipleselection ;
   private boolean Combo_facrepcod_Isgriditem ;
   private boolean Combo_facrepcod_Hasdescription ;
   private boolean Combo_facrepcod_Includeonlyselectedoption ;
   private boolean Combo_facrepcod_Includeselectalloption ;
   private boolean Combo_facrepcod_Emptyitem ;
   private boolean Combo_facrepcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n3116FacDivAbr ;
   private boolean returnInSub ;
   private String AV37ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV31WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_facdivcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_facrepcod ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbFacDivTCod ;
   private IDataStoreProvider pr_default ;
   private String[] T00B54_A407EmprNom ;
   private boolean[] T00B54_n407EmprNom ;
   private String[] T00B56_A279CliNom ;
   private String[] T00B58_A3116FacDivAbr ;
   private boolean[] T00B58_n3116FacDivAbr ;
   private String[] T00B55_A3120FacRepNom ;
   private boolean[] T00B55_n3120FacRepNom ;
   private int[] T00B59_A430FacCod ;
   private String[] T00B59_A279CliNom ;
   private String[] T00B59_A3096FacDivTCod ;
   private boolean[] T00B59_n3096FacDivTCod ;
   private String[] T00B59_A3116FacDivAbr ;
   private boolean[] T00B59_n3116FacDivAbr ;
   private String[] T00B59_A3120FacRepNom ;
   private boolean[] T00B59_n3120FacRepNom ;
   private String[] T00B59_A407EmprNom ;
   private boolean[] T00B59_n407EmprNom ;
   private String[] T00B59_A396EmprCod ;
   private String[] T00B59_A3119FacRepCod ;
   private boolean[] T00B59_n3119FacRepCod ;
   private int[] T00B59_A252CliCod ;
   private byte[] T00B59_A3115FacDivCod ;
   private boolean[] T00B59_n3115FacDivCod ;
   private String[] T00B57_A3073RepCod ;
   private String[] T00B510_A3116FacDivAbr ;
   private boolean[] T00B510_n3116FacDivAbr ;
   private String[] T00B511_A3120FacRepNom ;
   private boolean[] T00B511_n3120FacRepNom ;
   private String[] T00B512_A279CliNom ;
   private String[] T00B513_A3073RepCod ;
   private String[] T00B514_A396EmprCod ;
   private int[] T00B514_A430FacCod ;
   private int[] T00B53_A430FacCod ;
   private String[] T00B53_A3096FacDivTCod ;
   private boolean[] T00B53_n3096FacDivTCod ;
   private String[] T00B53_A396EmprCod ;
   private String[] T00B53_A3119FacRepCod ;
   private boolean[] T00B53_n3119FacRepCod ;
   private int[] T00B53_A252CliCod ;
   private byte[] T00B53_A3115FacDivCod ;
   private boolean[] T00B53_n3115FacDivCod ;
   private int[] T00B515_A430FacCod ;
   private String[] T00B515_A396EmprCod ;
   private int[] T00B516_A430FacCod ;
   private String[] T00B516_A396EmprCod ;
   private int[] T00B52_A430FacCod ;
   private String[] T00B52_A3096FacDivTCod ;
   private boolean[] T00B52_n3096FacDivTCod ;
   private String[] T00B52_A396EmprCod ;
   private String[] T00B52_A3119FacRepCod ;
   private boolean[] T00B52_n3119FacRepCod ;
   private int[] T00B52_A252CliCod ;
   private byte[] T00B52_A3115FacDivCod ;
   private boolean[] T00B52_n3115FacDivCod ;
   private String[] T00B520_A3116FacDivAbr ;
   private boolean[] T00B520_n3116FacDivAbr ;
   private String[] T00B521_A3120FacRepNom ;
   private boolean[] T00B521_n3120FacRepNom ;
   private String[] T00B522_A279CliNom ;
   private String[] T00B523_A396EmprCod ;
   private int[] T00B523_A430FacCod ;
   private byte[] T00B523_A956FacVtoLin ;
   private String[] T00B524_A396EmprCod ;
   private int[] T00B524_A430FacCod ;
   private int[] T00B524_A446FacLin ;
   private String[] T00B525_A396EmprCod ;
   private int[] T00B525_A430FacCod ;
   private String[] T00B526_A3073RepCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV39FacDivCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV36FacRepCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV29WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV30TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV35TrnContextAtt ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tfacdiv__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacdiv__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacdiv__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacdiv__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacdiv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00B52", "SELECT FacCod, FacDivTCod, EmprCod, FacRepCod, CliCod, FacDivCod FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ?  FOR UPDATE OF FacDivTCod, FacRepCod, CliCod, FacDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B53", "SELECT FacCod, FacDivTCod, EmprCod, FacRepCod, CliCod, FacDivCod FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B54", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B55", "SELECT RepNom AS FacRepNom FROM TXPREPRES WHERE EmprCod = ? AND RepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B56", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B57", "SELECT RepCod FROM TXPCOMREP WHERE EmprCod = ? AND RepCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B58", "SELECT DivAbr AS FacDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B59", "SELECT /*+ FIRST_ROWS(100) */ TM1.FacCod, T3.CliNom, TM1.FacDivTCod, T4.DivAbr AS FacDivAbr, T5.RepNom AS FacRepNom, T2.EmprNom, TM1.EmprCod, TM1.FacRepCod AS FacRepCod, TM1.CliCod, TM1.FacDivCod AS FacDivCod FROM ((((TXPCFAVEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPDIVISA T4 ON T4.DivCod = TM1.FacDivCod) LEFT JOIN TXPREPRES T5 ON T5.EmprCod = TM1.EmprCod AND T5.RepCod = TM1.FacRepCod) WHERE TM1.EmprCod = ? and TM1.FacCod = ? ORDER BY TM1.EmprCod, TM1.FacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B510", "SELECT DivAbr AS FacDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B511", "SELECT RepNom AS FacRepNom FROM TXPREPRES WHERE EmprCod = ? AND RepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B512", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B513", "SELECT RepCod FROM TXPCOMREP WHERE EmprCod = ? AND RepCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B514", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B515", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ FacCod, EmprCod FROM TXPCFAVEN WHERE ( FacCod > ? or FacCod = ? and EmprCod > ?) ORDER BY EmprCod, FacCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B516", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ FacCod, EmprCod FROM TXPCFAVEN WHERE ( FacCod < ? or FacCod = ? and EmprCod < ?) ORDER BY EmprCod DESC, FacCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00B517", "INSERT INTO TXPCFAVEN(FacCod, FacDivTCod, EmprCod, FacRepCod, CliCod, FacDivCod, FacFch, FacPri, FacFpg, FacDtoGen, FacDtoPP, FacIVAPor, FacRECPor, FacEst, FacLiC, FacIVACod, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacRegIva, FacSerNum, FacDto, FacObs, Factrm, FacRect, FacRecI, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacObs2, FacRecIca, FacMan, MeivaId, FacTpFra, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, FacAnulada, FacFecAnul, MotAnuID, FacSFD, FacIDATe, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacSerAT, FacTipAT, FacEnvMail) VALUES(?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCFAVEN")
         ,new UpdateCursor("T00B518", "UPDATE TXPCFAVEN SET FacDivTCod=?, FacRepCod=?, CliCod=?, FacDivCod=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK, "TXPCFAVEN")
         ,new UpdateCursor("T00B519", "DELETE FROM TXPCFAVEN  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK, "TXPCFAVEN")
         ,new ForEachCursor("T00B520", "SELECT DivAbr AS FacDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B521", "SELECT RepNom AS FacRepNom FROM TXPREPRES WHERE EmprCod = ? AND RepCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B522", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B523", "SELECT * FROM (SELECT EmprCod, FacCod, FacVtoLin FROM TXPFACVTO WHERE EmprCod = ? AND FacCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B524", "SELECT * FROM (SELECT EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? AND FacCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00B525", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FacCod FROM TXPCFAVEN ORDER BY EmprCod, FacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00B526", "SELECT RepCod FROM TXPCOMREP WHERE EmprCod = ? AND RepCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 34);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((byte[]) buf[14])[0] = rslt.getByte(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 6);
               }
               stmt.setInt(5, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[8]).byteValue());
               }
               return;
            case 16 :
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
                  stmt.setString(2, (String)parms[3], 6);
               }
               stmt.setInt(3, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
      }
   }

}

