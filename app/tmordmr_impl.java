package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordmr_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"OMOPECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaomopecod16E0( A396EmprCod, A13748OpeCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"OMOPECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaomopecod16E0( A396EmprCod, A13748OpeCNom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"OMOPECOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9455OMOpeCod = httpContext.GetPar( "h9455OMOpeCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaomopecod16E1234( A396EmprCod, h9455OMOpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9426OMMaqCod = httpContext.GetPar( "OMMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod, A9426OMMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_29( A396EmprCod, A9425OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_31") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9455OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_31( A396EmprCod, A9455OMOpeCod) ;
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
            AV20EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
            AV14OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OMCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14OMCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Res Mano de Obra Orden Trabajo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtOMCod_Internalname ;
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
      nRC_GXsfl_48 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_48"))) ;
      nGXsfl_48_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_48_idx"))) ;
      sGXsfl_48_idx = httpContext.GetPar( "sGXsfl_48_idx") ;
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

   public tmordmr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordmr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordmr_impl.class ));
   }

   public tmordmr_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMEst = new HTMLChoice();
      cmbOMMTpo = new HTMLChoice();
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
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMCod_Internalname, httpContext.getMessage( "Cod de Orden de Mantto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMaqCod_Internalname, httpContext.getMessage( "Cod Maquina Orden de Mantto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqCod_Internalname, GXutil.rtrim( A9426OMMaqCod), GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMaqDsc_Internalname, httpContext.getMessage( "Desc Maquina Ord Mantto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMaqDsc_Internalname, GXutil.rtrim( A9427OMMaqDsc), GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMaqDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMRCosT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMRCosT_Internalname, httpContext.getMessage( "Costo Total Reserva Mano Obra", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMRCosT_Internalname, GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMRCosT_Enabled!=0) ? localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999") : localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMRCosT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMRCosT_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdMR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbOMEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbOMEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbOMEst, cmbOMEst.getInternalname(), GXutil.rtrim( A9445OMEst), 1, cmbOMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbOMEst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TMOrdMR.htm");
      cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdMR.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMR.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdMR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol48( ) ;
      nGXsfl_48_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1234 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1234 = (short)(1) ;
            scanStart16E1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               init_level_properties1234( ) ;
               getByPrimaryKey16E1234( ) ;
               addRow16E1234( ) ;
               scanNext16E1234( ) ;
            }
            scanEnd16E1234( ) ;
            nBlankRcdCount1234 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B9442OMMRCosT = A9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         standaloneNotModal16E1234( ) ;
         standaloneModal16E1234( ) ;
         sMode1234 = Gx_mode ;
         while ( nGXsfl_48_idx < nRC_GXsfl_48 )
         {
            bGXsfl_48_Refreshing = true ;
            readRow16E1234( ) ;
            edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtOMOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPENOM_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_48_Refreshing);
            edtOMMRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCNT_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCnt_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtOMMRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRPRE_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtOMMRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCOS_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCos_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtOMMCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCNT_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtOMMCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCPRE_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            edtOMMCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCOS_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_48_Refreshing);
            if ( ( nRcdExists_1234 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16E1234( ) ;
            }
            sendRow16E1234( ) ;
            bGXsfl_48_Refreshing = false ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9442OMMRCosT = B9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1234 = (short)(5) ;
         nRcdExists_1234 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16E1234( ) ;
            while ( RcdFound1234 != 0 )
            {
               sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_481234( ) ;
               init_level_properties1234( ) ;
               standaloneNotModal16E1234( ) ;
               getByPrimaryKey16E1234( ) ;
               standaloneModal16E1234( ) ;
               addRow16E1234( ) ;
               scanNext16E1234( ) ;
            }
            scanEnd16E1234( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1234 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_481234( ) ;
         initAll16E1234( ) ;
         init_level_properties1234( ) ;
         B9442OMMRCosT = A9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         nRcdExists_1234 = (short)(0) ;
         nIsMod_1234 = (short)(0) ;
         nRcdDeleted_1234 = (short)(0) ;
         nBlankRcdCount1234 = (short)(nBlankRcdUsr1234+nBlankRcdCount1234) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1234 > 0 )
         {
            standaloneNotModal16E1234( ) ;
            standaloneModal16E1234( ) ;
            addRow16E1234( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtOMOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1234 = (short)(nBlankRcdCount1234-1) ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A9442OMMRCosT = B9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
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
      e1116E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9425OMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9445OMEst = httpContext.cgiGet( "Z9445OMEst") ;
            Z9426OMMaqCod = httpContext.cgiGet( "Z9426OMMaqCod") ;
            O9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( "O9442OMMRCosT")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_48 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_48"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N9426OMMaqCod = httpContext.cgiGet( "N9426OMMaqCod") ;
            AV20EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV14OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV24Insert_OMMaqCod = httpContext.cgiGet( "vINSERT_OMMAQCOD") ;
            AV35Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "GXHCOMOPECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9425OMCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            }
            else
            {
               A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            }
            A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
            A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
            n9427OMMaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
            A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
            n9442OMMRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            cmbOMEst.setName( cmbOMEst.getInternalname() );
            cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdMR");
            A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
            forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A9425OMCod != Z9425OMCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmordmr:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A9425OMCod = (int)(GXutil.lval( httpContext.GetPar( "OMCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
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
                  sMode1232 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1232 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1232 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_16E0( ) ;
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
                        e1116E2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1216E2 ();
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
         e1216E2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll16E1232( ) ;
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
         disableAttributes16E1232( ) ;
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

   public void confirm_16E0( )
   {
      beforeValidate16E1232( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16E1232( ) ;
         }
         else
         {
            checkExtendedTable16E1232( ) ;
            closeExtendedTableCursors16E1232( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1232 = Gx_mode ;
         confirm_16E1234( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1232 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_16E1234( )
   {
      s9442OMMRCosT = O9442OMMRCosT ;
      n9442OMMRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      nGXsfl_48_idx = 0 ;
      while ( nGXsfl_48_idx < nRC_GXsfl_48 )
      {
         readRow16E1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            getKey16E1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               if ( RcdFound1234 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16E1234( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16E1234( ) ;
                     closeExtendedTableCursors16E1234( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O9442OMMRCosT = A9442OMMRCosT ;
                     n9442OMMRCosT = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                  }
               }
               else
               {
                  GXCCtl = "OMOPECOD_" + sGXsfl_48_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMOpeCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( nRcdDeleted_1234 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16E1234( ) ;
                     load16E1234( ) ;
                     beforeValidate16E1234( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16E1234( ) ;
                        O9442OMMRCosT = A9442OMMRCosT ;
                        n9442OMMRCosT = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16E1234( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16E1234( ) ;
                           closeExtendedTableCursors16E1234( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O9442OMMRCosT = A9442OMMRCosT ;
                           n9442OMMRCosT = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_48_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMOpeCod_Internalname, h9455OMOpeCod) ;
         httpContext.changePostValue( edtOMOpeNom_Internalname, GXutil.rtrim( A9456OMOpeNom)) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMMRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_48_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9472OMMRCos_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( O9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPENOM_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCNT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCOS_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCNT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCOS_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O9442OMMRCosT = s9442OMMRCosT ;
      n9442OMMRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16E0( )
   {
   }

   public void e1116E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmordmr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV35Pgmname, (byte)(99), GXv_char2) ;
      tmordmr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmordmr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordmr_impl.this.A396EmprCod = GXv_char2[0] ;
      tmordmr_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordmr_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "OR", "") ;
      GXv_int5[0] = AV17MTMovCod ;
      GXv_char2[0] = AV18MTMovNom ;
      new app.pmrmtesp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2) ;
      tmordmr_impl.this.A396EmprCod = GXv_char4[0] ;
      tmordmr_impl.this.AV17MTMovCod = GXv_int5[0] ;
      tmordmr_impl.this.AV18MTMovNom = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV17MTMovCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17MTMovCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18MTMovNom", AV18MTMovNom);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmordmr_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV20EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmordmr_impl.this.AV20EmprCod = GXv_char4[0] ;
      tmordmr_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordmr_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext6[0] = AV21WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext6) ;
      AV21WWPContext = GXv_SdtWWPContext6[0] ;
      AV22TrnContext.fromxml(AV23WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV22TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV35Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV36GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         while ( AV36GXV1 <= AV22TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV25TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV22TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV36GXV1));
            if ( GXutil.strcmp(AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "OMMaqCod") == 0 )
            {
               AV24Insert_OMMaqCod = AV25TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Insert_OMMaqCod", AV24Insert_OMMaqCod);
            }
            AV36GXV1 = (int)(AV36GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e1216E2( )
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
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV22TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tmordmrww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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

   public void zm16E1232( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9445OMEst = T016E6_A9445OMEst[0] ;
            Z9426OMMaqCod = T016E6_A9426OMMaqCod[0] ;
         }
         else
         {
            Z9445OMEst = A9445OMEst ;
            Z9426OMMaqCod = A9426OMMaqCod ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9445OMEst = A9445OMEst ;
         Z396EmprCod = A396EmprCod ;
         Z9426OMMaqCod = A9426OMMaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z9427OMMaqDsc = A9427OMMaqDsc ;
         Z9442OMMRCosT = A9442OMMRCosT ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      AV35Pgmname = "TMOrdMR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmname", AV35Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         A396EmprCod = AV20EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T016E7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T016E7_A407EmprNom[0] ;
      n407EmprNom = T016E7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV14OMCod) )
      {
         A9425OMCod = AV14OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      if ( ! (0==AV14OMCod) )
      {
         edtOMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      }
      else
      {
         edtOMCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV14OMCod) )
      {
         edtOMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV24Insert_OMMaqCod)==0) )
      {
         edtOMMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtOMMaqCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
         }
         else
         {
            edtOMMaqCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
         }
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV24Insert_OMMaqCod)==0) )
      {
         A9426OMMaqCod = AV24Insert_OMMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
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
         /* Using cursor T016E10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A9442OMMRCosT = T016E10_A9442OMMRCosT[0] ;
            n9442OMMRCosT = T016E10_n9442OMMRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         else
         {
            A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
            n9442OMMRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         O9442OMMRCosT = A9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         pr_default.close(7);
         /* Using cursor T016E8 */
         pr_default.execute(6, new Object[] {A396EmprCod, A9426OMMaqCod});
         A9427OMMaqDsc = T016E8_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T016E8_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         pr_default.close(6);
      }
   }

   public void load16E1232( )
   {
      /* Using cursor T016E12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A407EmprNom = T016E12_A407EmprNom[0] ;
         n407EmprNom = T016E12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9427OMMaqDsc = T016E12_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T016E12_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         A9445OMEst = T016E12_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9426OMMaqCod = T016E12_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         A9442OMMRCosT = T016E12_A9442OMMRCosT[0] ;
         n9442OMMRCosT = T016E12_n9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         zm16E1232( -26) ;
      }
      pr_default.close(8);
      onLoadActions16E1232( ) ;
   }

   public void onLoadActions16E1232( )
   {
      O9442OMMRCosT = A9442OMMRCosT ;
      n9442OMMRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
   }

   public void checkExtendedTable16E1232( )
   {
      nIsDirty_1232 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T016E8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
      }
      A9427OMMaqDsc = T016E8_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T016E8_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      pr_default.close(6);
      /* Using cursor T016E10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A9442OMMRCosT = T016E10_A9442OMMRCosT[0] ;
         n9442OMMRCosT = T016E10_n9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         nIsDirty_1232 = (short)(1) ;
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors16E1232( )
   {
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_28( String A396EmprCod ,
                          String A9426OMMaqCod )
   {
      /* Using cursor T016E13 */
      pr_default.execute(9, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
      }
      A9427OMMaqDsc = T016E13_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T016E13_n9427OMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9427OMMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_29( String A396EmprCod ,
                          int A9425OMCod )
   {
      /* Using cursor T016E15 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A9442OMMRCosT = T016E15_A9442OMMRCosT[0] ;
         n9442OMMRCosT = T016E15_n9442OMMRCosT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey16E1232( )
   {
      /* Using cursor T016E16 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1232 = (short)(1) ;
      }
      else
      {
         RcdFound1232 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016E6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T016E6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16E1232( 26) ;
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T016E6_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9445OMEst = T016E6_A9445OMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
         A9426OMMaqCod = T016E6_A9426OMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load16E1232( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1232 = (short)(0) ;
            initializeNonKey16E1232( ) ;
         }
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1232 = (short)(0) ;
         initializeNonKey16E1232( ) ;
         sMode1232 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1232 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16E1232( ) ;
      if ( RcdFound1232 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T016E17 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T016E17_A9425OMCod[0] < A9425OMCod ) ) && ( GXutil.strcmp(T016E17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T016E17_A9425OMCod[0] > A9425OMCod ) ) && ( GXutil.strcmp(T016E17_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9425OMCod = T016E17_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1232 = (short)(0) ;
      /* Using cursor T016E18 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A9425OMCod), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T016E18_A9425OMCod[0] > A9425OMCod ) ) && ( GXutil.strcmp(T016E18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T016E18_A9425OMCod[0] < A9425OMCod ) ) && ( GXutil.strcmp(T016E18_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A9425OMCod = T016E18_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            RcdFound1232 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16E1232( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A9442OMMRCosT = O9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         GX_FocusControl = edtOMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16E1232( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1232 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               A9425OMCod = Z9425OMCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A9442OMMRCosT = O9442OMMRCosT ;
               n9442OMMRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A9442OMMRCosT = O9442OMMRCosT ;
               n9442OMMRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               update16E1232( ) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
            {
               /* Insert record */
               A9442OMMRCosT = O9442OMMRCosT ;
               n9442OMMRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16E1232( ) ;
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
                  A9442OMMRCosT = O9442OMMRCosT ;
                  n9442OMMRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
                  GX_FocusControl = edtOMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16E1232( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) )
      {
         A9425OMCod = Z9425OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A9442OMMRCosT = O9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency16E1232( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016E5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z9445OMEst, T016E5_A9445OMEst[0]) != 0 ) || ( GXutil.strcmp(Z9426OMMaqCod, T016E5_A9426OMMaqCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9445OMEst, T016E5_A9445OMEst[0]) != 0 )
            {
               GXutil.writeLogln("tmordmr:[seudo value changed for attri]"+"OMEst");
               GXutil.writeLogRaw("Old: ",Z9445OMEst);
               GXutil.writeLogRaw("Current: ",T016E5_A9445OMEst[0]);
            }
            if ( GXutil.strcmp(Z9426OMMaqCod, T016E5_A9426OMMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("tmordmr:[seudo value changed for attri]"+"OMMaqCod");
               GXutil.writeLogRaw("Old: ",Z9426OMMaqCod);
               GXutil.writeLogRaw("Current: ",T016E5_A9426OMMaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMORDEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16E1232( )
   {
      beforeValidate16E1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16E1232( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16E1232( 0) ;
         checkOptimisticConcurrency16E1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16E1232( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16E1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016E19 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A9425OMCod), A9445OMEst, A396EmprCod, A9426OMMaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel16E1232( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16E0( ) ;
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
            load16E1232( ) ;
         }
         endLevel16E1232( ) ;
      }
      closeExtendedTableCursors16E1232( ) ;
   }

   public void update16E1232( )
   {
      beforeValidate16E1232( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16E1232( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16E1232( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16E1232( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16E1232( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016E20 */
                  pr_default.execute(15, new Object[] {A9445OMEst, A9426OMMaqCod, A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMORDEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate16E1232( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16E1232( ) ;
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
         endLevel16E1232( ) ;
      }
      closeExtendedTableCursors16E1232( ) ;
   }

   public void deferredUpdate16E1232( )
   {
   }

   public void delete( )
   {
      beforeValidate16E1232( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16E1232( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16E1232( ) ;
         afterConfirm16E1232( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16E1232( ) ;
            if ( AnyError == 0 )
            {
               A9442OMMRCosT = O9442OMMRCosT ;
               n9442OMMRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               scanStart16E1234( ) ;
               while ( RcdFound1234 != 0 )
               {
                  getByPrimaryKey16E1234( ) ;
                  delete16E1234( ) ;
                  scanNext16E1234( ) ;
                  O9442OMMRCosT = A9442OMMRCosT ;
                  n9442OMMRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               }
               scanEnd16E1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016E21 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMORDEN");
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
      sMode1232 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16E1232( ) ;
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16E1232( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016E22 */
         pr_default.execute(17, new Object[] {A396EmprCod, A9426OMMaqCod});
         A9427OMMaqDsc = T016E22_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = T016E22_n9427OMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
         pr_default.close(17);
         /* Using cursor T016E24 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            A9442OMMRCosT = T016E24_A9442OMMRCosT[0] ;
            n9442OMMRCosT = T016E24_n9442OMMRCosT[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         else
         {
            A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
            n9442OMMRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         pr_default.close(18);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T016E25 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Equipos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T016E26 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tareas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T016E27 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T016E28 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Rep. de las Ordenes de Manten.", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void processNestedLevel16E1234( )
   {
      s9442OMMRCosT = O9442OMMRCosT ;
      n9442OMMRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      nGXsfl_48_idx = 0 ;
      while ( nGXsfl_48_idx < nRC_GXsfl_48 )
      {
         readRow16E1234( ) ;
         if ( ( nRcdExists_1234 != 0 ) || ( nIsMod_1234 != 0 ) )
         {
            standaloneNotModal16E1234( ) ;
            getKey16E1234( ) ;
            if ( ( nRcdExists_1234 == 0 ) && ( nRcdDeleted_1234 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16E1234( ) ;
            }
            else
            {
               if ( RcdFound1234 != 0 )
               {
                  if ( ( nRcdDeleted_1234 != 0 ) && ( nRcdExists_1234 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16E1234( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1234 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16E1234( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1234 == 0 )
                  {
                     GXCCtl = "OMOPECOD_" + sGXsfl_48_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMOpeCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O9442OMMRCosT = A9442OMMRCosT ;
            n9442OMMRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         httpContext.changePostValue( edtOMOpeCod_Internalname, h9455OMOpeCod) ;
         httpContext.changePostValue( edtOMOpeNom_Internalname, GXutil.rtrim( A9456OMOpeNom)) ;
         httpContext.changePostValue( edtOMOpePre_Internalname, GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMTpo.getInternalname(), GXutil.rtrim( A9458OMMTpo)) ;
         httpContext.changePostValue( edtOMMRCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMRCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCPre_Internalname, GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOMMCCos_Internalname, GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_48_idx, GXutil.rtrim( Z9458OMMTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T9472OMMRCos_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( O9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1234_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1234_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1234_"+sGXsfl_48_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1234 != 0 )
         {
            httpContext.changePostValue( "OMOPECOD_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPENOM_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMOPEPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMTPO_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCNT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMRCOS_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCNT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCCOS_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16E1234( ) ;
      if ( AnyError != 0 )
      {
         O9442OMMRCosT = s9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      nRcdExists_1234 = (short)(0) ;
      nIsMod_1234 = (short)(0) ;
      nRcdDeleted_1234 = (short)(0) ;
   }

   public void processLevel16E1232( )
   {
      /* Save parent mode. */
      sMode1232 = Gx_mode ;
      processNestedLevel16E1234( ) ;
      if ( AnyError != 0 )
      {
         O9442OMMRCosT = s9442OMMRCosT ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1232 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16E1232( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16E1232( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmordmr");
         if ( AnyError == 0 )
         {
            confirmValues16E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmordmr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16E1232( )
   {
      /* Scan By routine */
      /* Using cursor T016E29 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T016E29_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16E1232( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound1232 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1232 = (short)(1) ;
         A9425OMCod = T016E29_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      }
   }

   public void scanEnd16E1232( )
   {
      pr_default.close(23);
   }

   public void afterConfirm16E1232( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16E1232( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16E1232( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16E1232( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16E1232( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16E1232( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16E1232( )
   {
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Enabled), 5, 0), true);
      edtOMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Enabled), 5, 0), true);
      edtOMMRCosT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCosT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCosT_Enabled), 5, 0), true);
      cmbOMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMEst.getEnabled(), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm16E1234( int GX_JID )
   {
      if ( ( GX_JID == 30 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9460OMMRPre = T016E3_A9460OMMRPre[0] ;
            Z9459OMMRCnt = T016E3_A9459OMMRCnt[0] ;
            Z9461OMMCCnt = T016E3_A9461OMMCCnt[0] ;
            Z9462OMMCPre = T016E3_A9462OMMCPre[0] ;
         }
         else
         {
            Z9460OMMRPre = A9460OMMRPre ;
            Z9459OMMRCnt = A9459OMMRCnt ;
            Z9461OMMCCnt = A9461OMMCCnt ;
            Z9462OMMCPre = A9462OMMCPre ;
         }
      }
      if ( GX_JID == -30 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         Z9460OMMRPre = A9460OMMRPre ;
         Z9459OMMRCnt = A9459OMMRCnt ;
         Z9461OMMCCnt = A9461OMMCCnt ;
         Z9462OMMCPre = A9462OMMCPre ;
         Z396EmprCod = A396EmprCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9456OMOpeNom = A9456OMOpeNom ;
         Z9457OMOpePre = A9457OMOpePre ;
      }
   }

   public void standaloneNotModal16E1234( )
   {
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_48_Refreshing);
   }

   public void standaloneModal16E1234( )
   {
      if ( isIns( )  )
      {
         A9458OMMTpo = httpContext.getMessage( httpContext.getMessage( "R", ""), "") ;
      }
      A9463OMMCCos = A9461OMMCCnt.multiply(A9462OMMCPre) ;
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      }
      else
      {
         edtOMOpeCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      }
   }

   public void load16E1234( )
   {
      /* Using cursor T016E30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9460OMMRPre = T016E30_A9460OMMRPre[0] ;
         A9456OMOpeNom = T016E30_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T016E30_n9456OMOpeNom[0] ;
         A9457OMOpePre = T016E30_A9457OMOpePre[0] ;
         n9457OMOpePre = T016E30_n9457OMOpePre[0] ;
         A9459OMMRCnt = T016E30_A9459OMMRCnt[0] ;
         A9461OMMCCnt = T016E30_A9461OMMCCnt[0] ;
         A9462OMMCPre = T016E30_A9462OMMCPre[0] ;
         zm16E1234( -30) ;
      }
      pr_default.close(24);
      onLoadActions16E1234( ) ;
   }

   public void onLoadActions16E1234( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9460OMMRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9460OMMRPre = A9457OMOpePre ;
      }
      A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
      O9472OMMRCos = A9472OMMRCos ;
      if ( isIns( )  )
      {
         A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos) ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos).subtract(O9472OMMRCos) ;
            n9442OMMRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               A9442OMMRCosT = O9442OMMRCosT.subtract(O9472OMMRCos) ;
               n9442OMMRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            }
         }
      }
      /* Using cursor T016E31 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      h9455OMOpeCod = "" ;
      while ( (pr_default.getStatus(25) != 101) )
      {
         h9455OMOpeCod = T016E31_A13748OpeCNom[0] ;
         if (true) break;
      }
      pr_default.close(25);
      httpContext.ajax_rsp_assign_attri("", false, "h9455OMOpeCod", h9455OMOpeCod);
   }

   public void checkExtendedTable16E1234( )
   {
      nIsDirty_1234 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal16E1234( ) ;
      /* Using cursor T016E4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_48_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T016E4_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016E4_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016E4_A9457OMOpePre[0] ;
      n9457OMOpePre = T016E4_n9457OMOpePre[0] ;
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9460OMMRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1234 = (short)(1) ;
         A9460OMMRPre = A9457OMOpePre ;
      }
      nIsDirty_1234 = (short)(1) ;
      A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
      if ( isIns( )  )
      {
         nIsDirty_1234 = (short)(1) ;
         A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos) ;
         n9442OMMRCosT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1234 = (short)(1) ;
            A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos).subtract(O9472OMMRCos) ;
            n9442OMMRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1234 = (short)(1) ;
               A9442OMMRCosT = O9442OMMRCosT.subtract(O9472OMMRCos) ;
               n9442OMMRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            }
         }
      }
   }

   public void closeExtendedTableCursors16E1234( )
   {
      pr_default.close(2);
   }

   public void enableDisable16E1234( )
   {
   }

   public void gxload_31( String A396EmprCod ,
                          int A9455OMOpeCod )
   {
      /* Using cursor T016E32 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         GXCCtl = "OMOPECOD_" + sGXsfl_48_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T016E32_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016E32_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016E32_A9457OMOpePre[0] ;
      n9457OMOpePre = T016E32_n9457OMOpePre[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9456OMOpeNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(26) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(26);
   }

   public void getKey16E1234( )
   {
      /* Using cursor T016E33 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1234 = (short)(1) ;
      }
      else
      {
         RcdFound1234 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey16E1234( )
   {
      /* Using cursor T016E3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T016E3_A9458OMMTpo[0], "R") == 0 ) && ( GXutil.strcmp(T016E3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm16E1234( 30) ;
         RcdFound1234 = (short)(1) ;
         initializeNonKey16E1234( ) ;
         A9458OMMTpo = T016E3_A9458OMMTpo[0] ;
         A9460OMMRPre = T016E3_A9460OMMRPre[0] ;
         A9459OMMRCnt = T016E3_A9459OMMRCnt[0] ;
         A9461OMMCCnt = T016E3_A9461OMMCCnt[0] ;
         A9462OMMCPre = T016E3_A9462OMMCPre[0] ;
         A9455OMOpeCod = T016E3_A9455OMOpeCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load16E1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1234 = (short)(0) ;
         initializeNonKey16E1234( ) ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16E1234( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16E1234( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16E1234( )
   {
      if ( isDlt( ) )
      {
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T016E2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z9460OMMRPre, T016E2_A9460OMMRPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z9459OMMRCnt, T016E2_A9459OMMRCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9461OMMCCnt, T016E2_A9461OMMCCnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z9462OMMCPre, T016E2_A9462OMMCPre[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z9460OMMRPre, T016E2_A9460OMMRPre[0]) != 0 )
            {
               GXutil.writeLogln("tmordmr:[seudo value changed for attri]"+"OMMRPre");
               GXutil.writeLogRaw("Old: ",Z9460OMMRPre);
               GXutil.writeLogRaw("Current: ",T016E2_A9460OMMRPre[0]);
            }
            if ( DecimalUtil.compareTo(Z9459OMMRCnt, T016E2_A9459OMMRCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmordmr:[seudo value changed for attri]"+"OMMRCnt");
               GXutil.writeLogRaw("Old: ",Z9459OMMRCnt);
               GXutil.writeLogRaw("Current: ",T016E2_A9459OMMRCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9461OMMCCnt, T016E2_A9461OMMCCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmordmr:[seudo value changed for attri]"+"OMMCCnt");
               GXutil.writeLogRaw("Old: ",Z9461OMMCCnt);
               GXutil.writeLogRaw("Current: ",T016E2_A9461OMMCCnt[0]);
            }
            if ( DecimalUtil.compareTo(Z9462OMMCPre, T016E2_A9462OMMCPre[0]) != 0 )
            {
               GXutil.writeLogln("tmordmr:[seudo value changed for attri]"+"OMMCPre");
               GXutil.writeLogRaw("Old: ",Z9462OMMCPre);
               GXutil.writeLogRaw("Current: ",T016E2_A9462OMMCPre[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16E1234( )
   {
      beforeValidate16E1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16E1234( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16E1234( 0) ;
         checkOptimisticConcurrency16E1234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16E1234( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16E1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016E34 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A9425OMCod), A9458OMMTpo, A9460OMMRPre, A9459OMMRCnt, A9461OMMCCnt, A9462OMMCPre, A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                  if ( (pr_default.getStatus(28) == 1) )
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
            load16E1234( ) ;
         }
         endLevel16E1234( ) ;
      }
      closeExtendedTableCursors16E1234( ) ;
   }

   public void update16E1234( )
   {
      beforeValidate16E1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16E1234( ) ;
      }
      if ( ( nIsMod_1234 != 0 ) || ( nIsDirty_1234 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16E1234( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16E1234( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16E1234( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T016E35 */
                     pr_default.execute(29, new Object[] {A9460OMMRPre, A9459OMMRCnt, A9461OMMCCnt, A9462OMMCPre, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate16E1234( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16E1234( ) ;
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
            endLevel16E1234( ) ;
         }
      }
      closeExtendedTableCursors16E1234( ) ;
   }

   public void deferredUpdate16E1234( )
   {
   }

   public void delete16E1234( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16E1234( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16E1234( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16E1234( ) ;
         afterConfirm16E1234( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16E1234( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016E36 */
               pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
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
      sMode1234 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16E1234( ) ;
      Gx_mode = sMode1234 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16E1234( )
   {
      standaloneModal16E1234( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016E37 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
         A9456OMOpeNom = T016E37_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T016E37_n9456OMOpeNom[0] ;
         A9457OMOpePre = T016E37_A9457OMOpePre[0] ;
         n9457OMOpePre = T016E37_n9457OMOpePre[0] ;
         pr_default.close(31);
         A9472OMMRCos = A9459OMMRCnt.multiply(A9460OMMRPre) ;
         if ( isIns( )  )
         {
            A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos) ;
            n9442OMMRCosT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
         }
         else
         {
            if ( isUpd( )  )
            {
               A9442OMMRCosT = O9442OMMRCosT.add(A9472OMMRCos).subtract(O9472OMMRCos) ;
               n9442OMMRCosT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A9442OMMRCosT = O9442OMMRCosT.subtract(O9472OMMRCos) ;
                  n9442OMMRCosT = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T016E38 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Control MO Mantto", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
      }
   }

   public void endLevel16E1234( )
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

   public void scanStart16E1234( )
   {
      /* Scan By routine */
      /* Using cursor T016E39 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T016E39_A9455OMOpeCod[0] ;
         A9458OMMTpo = T016E39_A9458OMMTpo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16E1234( )
   {
      /* Scan next routine */
      pr_default.readNext(33);
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A9455OMOpeCod = T016E39_A9455OMOpeCod[0] ;
         A9458OMMTpo = T016E39_A9458OMMTpo[0] ;
      }
   }

   public void scanEnd16E1234( )
   {
      pr_default.close(33);
   }

   public void afterConfirm16E1234( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && true /* After */ && ( isIns( )  || isUpd( )  ) )
      {
         A9460OMMRPre = A9457OMOpePre ;
      }
   }

   public void beforeInsert16E1234( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16E1234( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16E1234( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16E1234( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16E1234( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16E1234( )
   {
      edtOMOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMOpePre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpePre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpePre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      cmbOMMTpo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMRCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCnt_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMRPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMRCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCos_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMCPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMCCos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_48_Refreshing);
   }

   public void send_integrity_lvl_hashes16E1234( )
   {
   }

   public void send_integrity_lvl_hashes16E1232( )
   {
   }

   public void subsflControlProps_481234( )
   {
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_48_idx ;
      edtOMOpeNom_Internalname = "OMOPENOM_"+sGXsfl_48_idx ;
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_48_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_48_idx );
      edtOMMRCnt_Internalname = "OMMRCNT_"+sGXsfl_48_idx ;
      edtOMMRPre_Internalname = "OMMRPRE_"+sGXsfl_48_idx ;
      edtOMMRCos_Internalname = "OMMRCOS_"+sGXsfl_48_idx ;
      edtOMMCCnt_Internalname = "OMMCCNT_"+sGXsfl_48_idx ;
      edtOMMCPre_Internalname = "OMMCPRE_"+sGXsfl_48_idx ;
      edtOMMCCos_Internalname = "OMMCCOS_"+sGXsfl_48_idx ;
   }

   public void subsflControlProps_fel_481234( )
   {
      edtOMOpeCod_Internalname = "OMOPECOD_"+sGXsfl_48_fel_idx ;
      edtOMOpeNom_Internalname = "OMOPENOM_"+sGXsfl_48_fel_idx ;
      edtOMOpePre_Internalname = "OMOPEPRE_"+sGXsfl_48_fel_idx ;
      cmbOMMTpo.setInternalname( "OMMTPO_"+sGXsfl_48_fel_idx );
      edtOMMRCnt_Internalname = "OMMRCNT_"+sGXsfl_48_fel_idx ;
      edtOMMRPre_Internalname = "OMMRPRE_"+sGXsfl_48_fel_idx ;
      edtOMMRCos_Internalname = "OMMRCOS_"+sGXsfl_48_fel_idx ;
      edtOMMCCnt_Internalname = "OMMCCNT_"+sGXsfl_48_fel_idx ;
      edtOMMCPre_Internalname = "OMMCPRE_"+sGXsfl_48_fel_idx ;
      edtOMMCCos_Internalname = "OMMCCOS_"+sGXsfl_48_fel_idx ;
   }

   public void addRow16E1234( )
   {
      nGXsfl_48_idx = (int)(nGXsfl_48_idx+1) ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_481234( ) ;
      sendRow16E1234( ) ;
   }

   public void sendRow16E1234( )
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
         if ( ((int)((nGXsfl_48_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_48_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_48_idx + "',48)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeCod_Internalname,h9455OMOpeCod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMOpeCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpeNom_Internalname,GXutil.rtrim( A9456OMOpeNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpeNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtOMOpeNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMOpePre_Internalname,GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMOpePre_Enabled!=0) ? localUtil.format( A9457OMOpePre, "ZZZZZ9.999") : localUtil.format( A9457OMOpePre, "ZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMOpePre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMOpePre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "OMMTPO_" + sGXsfl_48_idx ;
      cmbOMMTpo.setName( GXCCtl );
      cmbOMMTpo.setWebtags( "" );
      cmbOMMTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMMTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9458OMMTpo)==0) )
         {
            A9458OMMTpo = "R" ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMMTpo,cmbOMMTpo.getInternalname(),GXutil.rtrim( A9458OMMTpo),Integer.valueOf(1),cmbOMMTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbOMMTpo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Values", cmbOMMTpo.ToJavascriptSource(), !bGXsfl_48_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1234_" + sGXsfl_48_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_48_idx + "',48)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRCnt_Enabled!=0) ? localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9459OMMRCnt, "ZZ,ZZZ,ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMRCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRPre_Enabled!=0) ? localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9460OMMRPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMRPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMRCos_Enabled!=0) ? localUtil.format( A9472OMMRCos, "ZZZZZZZ9.999") : localUtil.format( A9472OMMRCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMRCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCCnt_Enabled!=0) ? localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtOMMCCnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCPre_Internalname,GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCPre_Enabled!=0) ? localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9462OMMCPre, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtOMMCPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCos_Internalname,GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCCos_Enabled!=0) ? localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999") : localUtil.format( A9463OMMCCos, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtOMMCCos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes16E1234( ) ;
      GXCCtl = "GXHCOMOPECOD_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9458OMMTpo));
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9460OMMRPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9459OMMRCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9462OMMCPre, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O9472OMMRCos_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O9472OMMRCos, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1234_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1234_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1234, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_48_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV22TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV22TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_48_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPECOD_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPENOM_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMOPEPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMTPO_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCNT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMRCOS_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCNT_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCPRE_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCCOS_"+sGXsfl_48_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow16E1234( )
   {
      nGXsfl_48_idx = (int)(nGXsfl_48_idx+1) ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_481234( ) ;
      edtOMOpeCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPECOD_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpeNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPENOM_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMOpePre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMOPEPRE_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbOMMTpo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMTPO_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMMRCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCNT_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMRPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRPRE_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMRCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMRCOS_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCCnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCNT_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCPRE_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCCos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCCOS_"+sGXsfl_48_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h9455OMOpeCod = httpContext.cgiGet( edtOMOpeCod_Internalname) ;
      A9456OMOpeNom = httpContext.cgiGet( edtOMOpeNom_Internalname) ;
      n9456OMOpeNom = false ;
      A9457OMOpePre = localUtil.ctond( httpContext.cgiGet( edtOMOpePre_Internalname)) ;
      n9457OMOpePre = false ;
      cmbOMMTpo.setName( cmbOMMTpo.getInternalname() );
      cmbOMMTpo.setValue( httpContext.cgiGet( cmbOMMTpo.getInternalname()) );
      A9458OMMTpo = httpContext.cgiGet( cmbOMMTpo.getInternalname()) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
      {
         GXCCtl = "OMMRCNT_" + sGXsfl_48_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMRCnt_Internalname ;
         wbErr = true ;
         A9459OMMRCnt = DecimalUtil.ZERO ;
      }
      else
      {
         A9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( edtOMMRCnt_Internalname)) ;
      }
      A9460OMMRPre = localUtil.ctond( httpContext.cgiGet( edtOMMRPre_Internalname)) ;
      A9472OMMRCos = localUtil.ctond( httpContext.cgiGet( edtOMMRCos_Internalname)) ;
      A9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)) ;
      A9462OMMCPre = localUtil.ctond( httpContext.cgiGet( edtOMMCPre_Internalname)) ;
      A9463OMMCCos = localUtil.ctond( httpContext.cgiGet( edtOMMCCos_Internalname)) ;
      GXCCtl = "GXHCOMOPECOD_" + sGXsfl_48_idx ;
      A9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9455OMOpeCod_" + sGXsfl_48_idx ;
      Z9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9458OMMTpo_" + sGXsfl_48_idx ;
      Z9458OMMTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9460OMMRPre_" + sGXsfl_48_idx ;
      Z9460OMMRPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9459OMMRCnt_" + sGXsfl_48_idx ;
      Z9459OMMRCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9461OMMCCnt_" + sGXsfl_48_idx ;
      Z9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9462OMMCPre_" + sGXsfl_48_idx ;
      Z9462OMMCPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O9472OMMRCos_" + sGXsfl_48_idx ;
      O9472OMMRCos = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1234_" + sGXsfl_48_idx ;
      nRcdDeleted_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1234_" + sGXsfl_48_idx ;
      nRcdExists_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1234_" + sGXsfl_48_idx ;
      nIsMod_1234 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOMMCCos_Enabled = edtOMMCCos_Enabled ;
      defedtOMMCPre_Enabled = edtOMMCPre_Enabled ;
      defedtOMMCCnt_Enabled = edtOMMCCnt_Enabled ;
      defedtOMMRPre_Enabled = edtOMMRPre_Enabled ;
      defcmbOMMTpo_Enabled = cmbOMMTpo.getEnabled() ;
      defedtOMOpeNom_Enabled = edtOMOpeNom_Enabled ;
      defedtOMOpeCod_Enabled = edtOMOpeCod_Enabled ;
   }

   public void confirmValues16E0( )
   {
      nGXsfl_48_idx = 0 ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_481234( ) ;
      while ( nGXsfl_48_idx < nRC_GXsfl_48 )
      {
         nGXsfl_48_idx = (int)(nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_481234( ) ;
         httpContext.changePostValue( "Z9455OMOpeCod_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9455OMOpeCod_"+sGXsfl_48_idx) ;
         httpContext.changePostValue( "Z9458OMMTpo_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z9458OMMTpo_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9458OMMTpo_"+sGXsfl_48_idx) ;
         httpContext.changePostValue( "Z9460OMMRPre_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z9460OMMRPre_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9460OMMRPre_"+sGXsfl_48_idx) ;
         httpContext.changePostValue( "Z9459OMMRCnt_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9459OMMRCnt_"+sGXsfl_48_idx) ;
         httpContext.changePostValue( "Z9461OMMCCnt_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9461OMMCCnt_"+sGXsfl_48_idx) ;
         httpContext.changePostValue( "Z9462OMMCPre_"+sGXsfl_48_idx, httpContext.cgiGet( "ZT_"+"Z9462OMMCPre_"+sGXsfl_48_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9462OMMCPre_"+sGXsfl_48_idx) ;
      }
      httpContext.changePostValue( "O9472OMMRCos", httpContext.cgiGet( "T9472OMMRCos")) ;
      httpContext.deletePostValue( "T9472OMMRCos") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmordmr", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0))}, new String[] {"Gx_mode","EmprCod","OMCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdMR");
      forbiddenHiddens.add("OMEst", GXutil.rtrim( localUtil.format( A9445OMEst, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmordmr:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9445OMEst", GXutil.rtrim( Z9445OMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9426OMMaqCod", GXutil.rtrim( Z9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O9442OMMRCosT", GXutil.ltrim( localUtil.ntoc( O9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_48", GXutil.ltrim( localUtil.ntoc( nGXsfl_48_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N9426OMMaqCod", GXutil.rtrim( A9426OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV22TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV22TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV22TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMCOD", GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14OMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_OMMAQCOD", GXutil.rtrim( AV24Insert_OMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV35Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCOMOPECOD", GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmordmr", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0))}, new String[] {"Gx_mode","EmprCod","OMCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMOrdMR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Res Mano de Obra Orden Trabajo", "") ;
   }

   public void initializeNonKey16E1232( )
   {
      A9426OMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9426OMMaqCod", A9426OMMaqCod);
      A9427OMMaqDsc = "" ;
      n9427OMMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", A9427OMMaqDsc);
      A9442OMMRCosT = DecimalUtil.ZERO ;
      n9442OMMRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      A9445OMEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      O9442OMMRCosT = A9442OMMRCosT ;
      n9442OMMRCosT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrimstr( A9442OMMRCosT, 12, 3));
      Z9445OMEst = "" ;
      Z9426OMMaqCod = "" ;
   }

   public void initAll16E1232( )
   {
      A9425OMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      initializeNonKey16E1232( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16E1234( )
   {
      A9463OMMCCos = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      A9456OMOpeNom = "" ;
      n9456OMOpeNom = false ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      n9457OMOpePre = false ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      O9472OMMRCos = A9472OMMRCos ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      Z9459OMMRCnt = DecimalUtil.ZERO ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
   }

   public void initAll16E1234( )
   {
      h9455OMOpeCod = "" ;
      A9458OMMTpo = "R" ;
      initializeNonKey16E1234( ) ;
   }

   public void standaloneModalInsert16E1234( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026362271313", true, true);
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
      httpContext.AddJavascriptSource("tmordmr.js", "?2026362271313", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1234( )
   {
      edtOMMCCos_Enabled = defedtOMMCCos_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCos_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMCPre_Enabled = defedtOMMCPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCPre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMCCnt_Enabled = defedtOMMCCnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMMRPre_Enabled = defedtOMMRPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRPre_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      cmbOMMTpo.setEnabled( defcmbOMMTpo_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMTpo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMTpo.getEnabled(), 5, 0), !bGXsfl_48_Refreshing);
      edtOMOpeNom_Enabled = defedtOMOpeNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtOMOpeCod_Enabled = defedtOMOpeCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), !bGXsfl_48_Refreshing);
   }

   public void startgridcontrol48( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", h9455OMOpeCod);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9456OMOpeNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpeNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMOpePre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9458OMMTpo));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMTpo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9459OMMRCnt, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9472OMMRCos, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMRCos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9462OMMCPre, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9463OMMCCos, (byte)(12), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCCos_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOMCod_Internalname = "OMCOD" ;
      edtOMMaqCod_Internalname = "OMMAQCOD" ;
      edtOMMaqDsc_Internalname = "OMMAQDSC" ;
      edtOMMRCosT_Internalname = "OMMRCOST" ;
      cmbOMEst.setInternalname( "OMEST" );
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtOMOpeCod_Internalname = "OMOPECOD" ;
      edtOMOpeNom_Internalname = "OMOPENOM" ;
      edtOMOpePre_Internalname = "OMOPEPRE" ;
      cmbOMMTpo.setInternalname( "OMMTPO" );
      edtOMMRCnt_Internalname = "OMMRCNT" ;
      edtOMMRPre_Internalname = "OMMRPRE" ;
      edtOMMRCos_Internalname = "OMMRCOS" ;
      edtOMMCCnt_Internalname = "OMMCCNT" ;
      edtOMMCPre_Internalname = "OMMCPRE" ;
      edtOMMCCos_Internalname = "OMMCCOS" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Res Mano de Obra Orden Trabajo", "") );
      edtOMMCCos_Jsonclick = "" ;
      edtOMMCPre_Jsonclick = "" ;
      edtOMMCCnt_Jsonclick = "" ;
      edtOMMRCos_Jsonclick = "" ;
      edtOMMRPre_Jsonclick = "" ;
      edtOMMRCnt_Jsonclick = "" ;
      cmbOMMTpo.setJsonclick( "" );
      edtOMOpePre_Jsonclick = "" ;
      edtOMOpeNom_Jsonclick = "" ;
      edtOMOpeCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtOMMCCos_Enabled = 0 ;
      edtOMMCPre_Enabled = 0 ;
      edtOMMCCnt_Enabled = 0 ;
      edtOMMRCos_Enabled = 0 ;
      edtOMMRPre_Enabled = 0 ;
      edtOMMRCnt_Enabled = 1 ;
      cmbOMMTpo.setEnabled( 0 );
      edtOMOpePre_Enabled = 0 ;
      edtOMOpeNom_Enabled = 0 ;
      edtOMOpeCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setEnabled( 0 );
      edtOMMRCosT_Jsonclick = "" ;
      edtOMMRCosT_Enabled = 0 ;
      edtOMMaqDsc_Jsonclick = "" ;
      edtOMMaqDsc_Enabled = 0 ;
      edtOMMaqCod_Jsonclick = "" ;
      edtOMMaqCod_Enabled = 0 ;
      edtOMCod_Jsonclick = "" ;
      edtOMCod_Enabled = 1 ;
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

   public void gxsgaomopecod16E0( String A396EmprCod ,
                                  String A13748OpeCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaomopecod_data16E0( A396EmprCod, A13748OpeCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaomopecod_data16E0( String A396EmprCod ,
                                          String A13748OpeCNom )
   {
      l13748OpeCNom = GXutil.concat( GXutil.rtrim( A13748OpeCNom), "%", "") ;
      /* Using cursor T016E40 */
      pr_default.execute(34, new Object[] {A396EmprCod, l13748OpeCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(34) != 101) )
      {
         gxdynajaxctrlcodr.add(T016E40_A13748OpeCNom[0]);
         gxdynajaxctrldescr.add(T016E40_A13748OpeCNom[0]);
         pr_default.readNext(34);
      }
      pr_default.close(34);
   }

   public void gxhcaomopecod16E1234( String A396EmprCod ,
                                     String A13748OpeCNom )
   {
      /* Using cursor T016E41 */
      pr_default.execute(35, new Object[] {A13748OpeCNom, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(35) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13748OpeCNom = T016E41_A13748OpeCNom[0] ;
         A396EmprCod = T016E41_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = T016E41_A652OpeCod[0] ;
         pr_default.readNext(35);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(35);
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_481234( ) ;
      while ( nGXsfl_48_idx <= nRC_GXsfl_48 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16E1234( ) ;
         standaloneModal16E1234( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16E1234( ) ;
         nGXsfl_48_idx = (int)(nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_481234( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbOMEst.setName( "OMEST" );
      cmbOMEst.setWebtags( "" );
      cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9445OMEst", A9445OMEst);
      }
      GXCCtl = "OMMTPO_" + sGXsfl_48_idx ;
      cmbOMMTpo.setName( GXCCtl );
      cmbOMMTpo.setWebtags( "" );
      cmbOMMTpo.addItem("R", httpContext.getMessage( "Reserva", ""), (short)(0));
      cmbOMMTpo.addItem("C", httpContext.getMessage( "Consumo", ""), (short)(0));
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9458OMMTpo)==0) )
         {
            A9458OMMTpo = "R" ;
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

   public void valid_Omcod( )
   {
      n9442OMMRCosT = false ;
      /* Using cursor T016E24 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A9442OMMRCosT = T016E24_A9442OMMRCosT[0] ;
         n9442OMMRCosT = T016E24_n9442OMMRCosT[0] ;
      }
      else
      {
         A9442OMMRCosT = DecimalUtil.doubleToDec(0) ;
         n9442OMMRCosT = false ;
      }
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9442OMMRCosT", GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), ".", "")));
   }

   public void valid_Ommaqcod( )
   {
      n9427OMMaqDsc = false ;
      /* Using cursor T016E22 */
      pr_default.execute(17, new Object[] {A396EmprCod, A9426OMMaqCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMMAQCOD");
         AnyError = (short)(1) ;
      }
      A9427OMMaqDsc = T016E22_A9427OMMaqDsc[0] ;
      n9427OMMaqDsc = T016E22_n9427OMMaqDsc[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9427OMMaqDsc", GXutil.rtrim( A9427OMMaqDsc));
   }

   public void valid_Omopecod( )
   {
      n9457OMOpePre = false ;
      n9456OMOpeNom = false ;
      if ( (GXutil.strcmp("", h9455OMOpeCod)==0) )
      {
         A9455OMOpeCod = 0 ;
      }
      else
      {
         A13748OpeCNom = h9455OMOpeCod ;
         /* Using cursor T016E42 */
         pr_default.execute(36, new Object[] {A13748OpeCNom, A396EmprCod});
         A9455OMOpeCod = T016E42_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(36) == 101) ) )
         {
            pr_default.readNext(36);
            if ( ! ( (pr_default.getStatus(36) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "OMOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMOpeCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(36);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9455OMOpeCod", h9455OMOpeCod);
      /* Using cursor T016E43 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMOpeCod_Internalname ;
      }
      A9456OMOpeNom = T016E43_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T016E43_n9456OMOpeNom[0] ;
      A9457OMOpePre = T016E43_A9457OMOpePre[0] ;
      n9457OMOpePre = T016E43_n9457OMOpePre[0] ;
      pr_default.close(37);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A9460OMMRPre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9460OMMRPre = A9457OMOpePre ;
      }
      dynload_actions( ) ;
      if ( cmbOMMTpo.getItemCount() > 0 )
      {
         A9458OMMTpo = cmbOMMTpo.getValidValue(A9458OMMTpo) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbOMMTpo.setValue( GXutil.rtrim( A9458OMMTpo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", GXutil.rtrim( A9456OMOpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9457OMOpePre", GXutil.ltrim( localUtil.ntoc( A9457OMOpePre, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9460OMMRPre", GXutil.ltrim( localUtil.ntoc( A9460OMMRPre, (byte)(12), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h9455OMOpeCod", h9455OMOpeCod);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV22TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1216E2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV22TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A9442OMMRCosT',fld:'OMMRCOST',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_OMCOD",",oparms:[{av:'A9442OMMRCosT',fld:'OMMRCOST',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''}]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_OMOPECOD","{handler:'valid_Omopecod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'h9455OMOpeCod'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9460OMMRPre',fld:'OMMRPRE',pic:'ZZ,ZZZ,ZZ9.999'}]");
      setEventMetadata("VALID_OMOPECOD",",oparms:[{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''},{av:'A9457OMOpePre',fld:'OMOPEPRE',pic:'ZZZZZ9.999'},{av:'A9460OMMRPre',fld:'OMMRPRE',pic:'ZZ,ZZZ,ZZ9.999'},{av:'h9455OMOpeCod'}]}");
      setEventMetadata("VALID_OMOPEPRE","{handler:'valid_Omopepre',iparms:[]");
      setEventMetadata("VALID_OMOPEPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMTPO","{handler:'valid_Ommtpo',iparms:[]");
      setEventMetadata("VALID_OMMTPO",",oparms:[]}");
      setEventMetadata("VALID_OMMRCNT","{handler:'valid_Ommrcnt',iparms:[]");
      setEventMetadata("VALID_OMMRCNT",",oparms:[]}");
      setEventMetadata("VALID_OMMRPRE","{handler:'valid_Ommrpre',iparms:[]");
      setEventMetadata("VALID_OMMRPRE",",oparms:[]}");
      setEventMetadata("VALID_OMMRCOS","{handler:'valid_Ommrcos',iparms:[]");
      setEventMetadata("VALID_OMMRCOS",",oparms:[]}");
      setEventMetadata("VALID_OMMCCNT","{handler:'valid_Ommccnt',iparms:[]");
      setEventMetadata("VALID_OMMCCNT",",oparms:[]}");
      setEventMetadata("VALID_OMMCPRE","{handler:'valid_Ommcpre',iparms:[]");
      setEventMetadata("VALID_OMMCPRE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ommccos',iparms:[]");
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
      pr_default.close(37);
      pr_default.close(31);
      pr_default.close(17);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV20EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9445OMEst = "" ;
      Z9426OMMaqCod = "" ;
      O9442OMMRCosT = DecimalUtil.ZERO ;
      N9426OMMaqCod = "" ;
      Z9458OMMTpo = "" ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      Z9459OMMRCnt = DecimalUtil.ZERO ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
      Z9462OMMCPre = DecimalUtil.ZERO ;
      O9472OMMRCos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13748OpeCNom = "" ;
      h9455OMOpeCod = "" ;
      A9426OMMaqCod = "" ;
      Gx_mode = "" ;
      AV20EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A9445OMEst = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A9427OMMaqDsc = "" ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B9442OMMRCosT = DecimalUtil.ZERO ;
      sMode1234 = "" ;
      sStyleString = "" ;
      AV24Insert_OMMaqCod = "" ;
      AV35Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1232 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s9442OMMRCosT = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A9456OMOpeNom = "" ;
      A9457OMOpePre = DecimalUtil.ZERO ;
      A9458OMMTpo = "" ;
      A9459OMMRCnt = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      A9472OMMRCos = DecimalUtil.ZERO ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      A9462OMMCPre = DecimalUtil.ZERO ;
      A9463OMMCCos = DecimalUtil.ZERO ;
      T9472OMMRCos = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_int5 = new int[1] ;
      AV18MTMovNom = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV21WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext6 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV23WebSession = httpContext.getWebSession();
      AV25TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z9427OMMaqDsc = "" ;
      Z9442OMMRCosT = DecimalUtil.ZERO ;
      T016E7_A407EmprNom = new String[] {""} ;
      T016E7_n407EmprNom = new boolean[] {false} ;
      T016E10_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E10_n9442OMMRCosT = new boolean[] {false} ;
      T016E8_A9427OMMaqDsc = new String[] {""} ;
      T016E8_n9427OMMaqDsc = new boolean[] {false} ;
      T016E12_A9425OMCod = new int[1] ;
      T016E12_A407EmprNom = new String[] {""} ;
      T016E12_n407EmprNom = new boolean[] {false} ;
      T016E12_A9427OMMaqDsc = new String[] {""} ;
      T016E12_n9427OMMaqDsc = new boolean[] {false} ;
      T016E12_A9445OMEst = new String[] {""} ;
      T016E12_A396EmprCod = new String[] {""} ;
      T016E12_A9426OMMaqCod = new String[] {""} ;
      T016E12_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E12_n9442OMMRCosT = new boolean[] {false} ;
      T016E13_A9427OMMaqDsc = new String[] {""} ;
      T016E13_n9427OMMaqDsc = new boolean[] {false} ;
      T016E15_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E15_n9442OMMRCosT = new boolean[] {false} ;
      T016E16_A396EmprCod = new String[] {""} ;
      T016E16_A9425OMCod = new int[1] ;
      T016E6_A9425OMCod = new int[1] ;
      T016E6_A9445OMEst = new String[] {""} ;
      T016E6_A396EmprCod = new String[] {""} ;
      T016E6_A9426OMMaqCod = new String[] {""} ;
      T016E17_A396EmprCod = new String[] {""} ;
      T016E17_A9425OMCod = new int[1] ;
      T016E18_A396EmprCod = new String[] {""} ;
      T016E18_A9425OMCod = new int[1] ;
      T016E5_A9425OMCod = new int[1] ;
      T016E5_A9445OMEst = new String[] {""} ;
      T016E5_A396EmprCod = new String[] {""} ;
      T016E5_A9426OMMaqCod = new String[] {""} ;
      T016E22_A9427OMMaqDsc = new String[] {""} ;
      T016E22_n9427OMMaqDsc = new boolean[] {false} ;
      T016E24_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E24_n9442OMMRCosT = new boolean[] {false} ;
      T016E25_A396EmprCod = new String[] {""} ;
      T016E25_A9425OMCod = new int[1] ;
      T016E25_A11446OMMEquCod = new String[] {""} ;
      T016E25_A11447OMMSEqCod = new String[] {""} ;
      T016E25_A11448OMMPieCod = new String[] {""} ;
      T016E26_A396EmprCod = new String[] {""} ;
      T016E26_A9425OMCod = new int[1] ;
      T016E26_A9430TMCod = new int[1] ;
      T016E27_A396EmprCod = new String[] {""} ;
      T016E27_A9425OMCod = new int[1] ;
      T016E27_A9455OMOpeCod = new int[1] ;
      T016E27_A9458OMMTpo = new String[] {""} ;
      T016E27_A9466OMMCLin = new short[1] ;
      T016E28_A396EmprCod = new String[] {""} ;
      T016E28_A9425OMCod = new int[1] ;
      T016E28_A9446OMRepCod = new int[1] ;
      T016E28_A9449OMRTpo = new String[] {""} ;
      T016E29_A396EmprCod = new String[] {""} ;
      T016E29_A9425OMCod = new int[1] ;
      Z9456OMOpeNom = "" ;
      Z9457OMOpePre = DecimalUtil.ZERO ;
      T016E30_A9425OMCod = new int[1] ;
      T016E30_A9458OMMTpo = new String[] {""} ;
      T016E30_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E30_A9456OMOpeNom = new String[] {""} ;
      T016E30_n9456OMOpeNom = new boolean[] {false} ;
      T016E30_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E30_n9457OMOpePre = new boolean[] {false} ;
      T016E30_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E30_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E30_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E30_A396EmprCod = new String[] {""} ;
      T016E30_A9455OMOpeCod = new int[1] ;
      T016E31_A13748OpeCNom = new String[] {""} ;
      T016E31_A396EmprCod = new String[] {""} ;
      T016E31_A652OpeCod = new int[1] ;
      T016E4_A9456OMOpeNom = new String[] {""} ;
      T016E4_n9456OMOpeNom = new boolean[] {false} ;
      T016E4_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E4_n9457OMOpePre = new boolean[] {false} ;
      T016E32_A9456OMOpeNom = new String[] {""} ;
      T016E32_n9456OMOpeNom = new boolean[] {false} ;
      T016E32_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E32_n9457OMOpePre = new boolean[] {false} ;
      T016E33_A396EmprCod = new String[] {""} ;
      T016E33_A9425OMCod = new int[1] ;
      T016E33_A9455OMOpeCod = new int[1] ;
      T016E33_A9458OMMTpo = new String[] {""} ;
      T016E3_A9425OMCod = new int[1] ;
      T016E3_A9458OMMTpo = new String[] {""} ;
      T016E3_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E3_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E3_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E3_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E3_A396EmprCod = new String[] {""} ;
      T016E3_A9455OMOpeCod = new int[1] ;
      T016E2_A9425OMCod = new int[1] ;
      T016E2_A9458OMMTpo = new String[] {""} ;
      T016E2_A9460OMMRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E2_A9459OMMRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E2_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E2_A9462OMMCPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E2_A396EmprCod = new String[] {""} ;
      T016E2_A9455OMOpeCod = new int[1] ;
      T016E37_A9456OMOpeNom = new String[] {""} ;
      T016E37_n9456OMOpeNom = new boolean[] {false} ;
      T016E37_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E37_n9457OMOpePre = new boolean[] {false} ;
      T016E38_A396EmprCod = new String[] {""} ;
      T016E38_A9425OMCod = new int[1] ;
      T016E38_A9455OMOpeCod = new int[1] ;
      T016E38_A9458OMMTpo = new String[] {""} ;
      T016E38_A9466OMMCLin = new short[1] ;
      T016E39_A396EmprCod = new String[] {""} ;
      T016E39_A9425OMCod = new int[1] ;
      T016E39_A9455OMOpeCod = new int[1] ;
      T016E39_A9458OMMTpo = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13748OpeCNom = "" ;
      T016E40_A13748OpeCNom = new String[] {""} ;
      T016E41_A13748OpeCNom = new String[] {""} ;
      T016E41_A396EmprCod = new String[] {""} ;
      T016E41_A652OpeCod = new int[1] ;
      T016E42_A13748OpeCNom = new String[] {""} ;
      T016E42_A396EmprCod = new String[] {""} ;
      T016E42_A652OpeCod = new int[1] ;
      T016E43_A9456OMOpeNom = new String[] {""} ;
      T016E43_n9456OMOpeNom = new boolean[] {false} ;
      T016E43_A9457OMOpePre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T016E43_n9457OMOpePre = new boolean[] {false} ;
      Zh9455OMOpeCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmordmr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmordmr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmordmr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordmr__default(),
         new Object[] {
             new Object[] {
            T016E2_A9425OMCod, T016E2_A9458OMMTpo, T016E2_A9460OMMRPre, T016E2_A9459OMMRCnt, T016E2_A9461OMMCCnt, T016E2_A9462OMMCPre, T016E2_A396EmprCod, T016E2_A9455OMOpeCod
            }
            , new Object[] {
            T016E3_A9425OMCod, T016E3_A9458OMMTpo, T016E3_A9460OMMRPre, T016E3_A9459OMMRCnt, T016E3_A9461OMMCCnt, T016E3_A9462OMMCPre, T016E3_A396EmprCod, T016E3_A9455OMOpeCod
            }
            , new Object[] {
            T016E4_A9456OMOpeNom, T016E4_n9456OMOpeNom, T016E4_A9457OMOpePre, T016E4_n9457OMOpePre
            }
            , new Object[] {
            T016E5_A9425OMCod, T016E5_A9445OMEst, T016E5_A396EmprCod, T016E5_A9426OMMaqCod
            }
            , new Object[] {
            T016E6_A9425OMCod, T016E6_A9445OMEst, T016E6_A396EmprCod, T016E6_A9426OMMaqCod
            }
            , new Object[] {
            T016E7_A407EmprNom, T016E7_n407EmprNom
            }
            , new Object[] {
            T016E8_A9427OMMaqDsc, T016E8_n9427OMMaqDsc
            }
            , new Object[] {
            T016E10_A9442OMMRCosT, T016E10_n9442OMMRCosT
            }
            , new Object[] {
            T016E12_A9425OMCod, T016E12_A407EmprNom, T016E12_n407EmprNom, T016E12_A9427OMMaqDsc, T016E12_n9427OMMaqDsc, T016E12_A9445OMEst, T016E12_A396EmprCod, T016E12_A9426OMMaqCod, T016E12_A9442OMMRCosT, T016E12_n9442OMMRCosT
            }
            , new Object[] {
            T016E13_A9427OMMaqDsc, T016E13_n9427OMMaqDsc
            }
            , new Object[] {
            T016E15_A9442OMMRCosT, T016E15_n9442OMMRCosT
            }
            , new Object[] {
            T016E16_A396EmprCod, T016E16_A9425OMCod
            }
            , new Object[] {
            T016E17_A396EmprCod, T016E17_A9425OMCod
            }
            , new Object[] {
            T016E18_A396EmprCod, T016E18_A9425OMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016E22_A9427OMMaqDsc, T016E22_n9427OMMaqDsc
            }
            , new Object[] {
            T016E24_A9442OMMRCosT, T016E24_n9442OMMRCosT
            }
            , new Object[] {
            T016E25_A396EmprCod, T016E25_A9425OMCod, T016E25_A11446OMMEquCod, T016E25_A11447OMMSEqCod, T016E25_A11448OMMPieCod
            }
            , new Object[] {
            T016E26_A396EmprCod, T016E26_A9425OMCod, T016E26_A9430TMCod
            }
            , new Object[] {
            T016E27_A396EmprCod, T016E27_A9425OMCod, T016E27_A9455OMOpeCod, T016E27_A9458OMMTpo, T016E27_A9466OMMCLin
            }
            , new Object[] {
            T016E28_A396EmprCod, T016E28_A9425OMCod, T016E28_A9446OMRepCod, T016E28_A9449OMRTpo
            }
            , new Object[] {
            T016E29_A396EmprCod, T016E29_A9425OMCod
            }
            , new Object[] {
            T016E30_A9425OMCod, T016E30_A9458OMMTpo, T016E30_A9460OMMRPre, T016E30_A9456OMOpeNom, T016E30_n9456OMOpeNom, T016E30_A9457OMOpePre, T016E30_n9457OMOpePre, T016E30_A9459OMMRCnt, T016E30_A9461OMMCCnt, T016E30_A9462OMMCPre,
            T016E30_A396EmprCod, T016E30_A9455OMOpeCod
            }
            , new Object[] {
            T016E31_A13748OpeCNom, T016E31_A396EmprCod, T016E31_A652OpeCod
            }
            , new Object[] {
            T016E32_A9456OMOpeNom, T016E32_n9456OMOpeNom, T016E32_A9457OMOpePre, T016E32_n9457OMOpePre
            }
            , new Object[] {
            T016E33_A396EmprCod, T016E33_A9425OMCod, T016E33_A9455OMOpeCod, T016E33_A9458OMMTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016E37_A9456OMOpeNom, T016E37_n9456OMOpeNom, T016E37_A9457OMOpePre, T016E37_n9457OMOpePre
            }
            , new Object[] {
            T016E38_A396EmprCod, T016E38_A9425OMCod, T016E38_A9455OMOpeCod, T016E38_A9458OMMTpo, T016E38_A9466OMMCLin
            }
            , new Object[] {
            T016E39_A396EmprCod, T016E39_A9425OMCod, T016E39_A9455OMOpeCod, T016E39_A9458OMMTpo
            }
            , new Object[] {
            T016E40_A13748OpeCNom
            }
            , new Object[] {
            T016E41_A13748OpeCNom, T016E41_A396EmprCod, T016E41_A652OpeCod
            }
            , new Object[] {
            T016E42_A13748OpeCNom, T016E42_A396EmprCod, T016E42_A652OpeCod
            }
            , new Object[] {
            T016E43_A9456OMOpeNom, T016E43_n9456OMOpeNom, T016E43_A9457OMOpePre, T016E43_n9457OMOpePre
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmname = "TMOrdMR" ;
      Z9460OMMRPre = DecimalUtil.ZERO ;
      A9460OMMRPre = DecimalUtil.ZERO ;
      Z9458OMMTpo = "R" ;
      A9458OMMTpo = "R" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_1234 ;
   private short nRcdExists_1234 ;
   private short nIsMod_1234 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1234 ;
   private short RcdFound1234 ;
   private short nBlankRcdUsr1234 ;
   private short RcdFound1232 ;
   private short nIsDirty_1232 ;
   private short nIsDirty_1234 ;
   private short gxhchits ;
   private int wcpOAV14OMCod ;
   private int Z9425OMCod ;
   private int nRC_GXsfl_48 ;
   private int nGXsfl_48_idx=1 ;
   private int Z9455OMOpeCod ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int AV14OMCod ;
   private int trnEnded ;
   private int edtOMCod_Enabled ;
   private int edtOMMaqCod_Enabled ;
   private int edtOMMaqDsc_Enabled ;
   private int edtOMMRCosT_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtOMOpeCod_Enabled ;
   private int edtOMOpeNom_Enabled ;
   private int edtOMOpePre_Enabled ;
   private int edtOMMRCnt_Enabled ;
   private int edtOMMRPre_Enabled ;
   private int edtOMMRCos_Enabled ;
   private int edtOMMCCnt_Enabled ;
   private int edtOMMCPre_Enabled ;
   private int edtOMMCCos_Enabled ;
   private int fRowAdded ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int AV17MTMovCod ;
   private int GXv_int5[] ;
   private int AV36GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtOMMCCos_Enabled ;
   private int defedtOMMCPre_Enabled ;
   private int defedtOMMCCnt_Enabled ;
   private int defedtOMMRPre_Enabled ;
   private int defcmbOMMTpo_Enabled ;
   private int defedtOMOpeNom_Enabled ;
   private int defedtOMOpeCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int A652OpeCod ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal O9442OMMRCosT ;
   private java.math.BigDecimal Z9460OMMRPre ;
   private java.math.BigDecimal Z9459OMMRCnt ;
   private java.math.BigDecimal Z9461OMMCCnt ;
   private java.math.BigDecimal Z9462OMMCPre ;
   private java.math.BigDecimal O9472OMMRCos ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal B9442OMMRCosT ;
   private java.math.BigDecimal s9442OMMRCosT ;
   private java.math.BigDecimal A9457OMOpePre ;
   private java.math.BigDecimal A9459OMMRCnt ;
   private java.math.BigDecimal A9460OMMRPre ;
   private java.math.BigDecimal A9472OMMRCos ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9462OMMCPre ;
   private java.math.BigDecimal A9463OMMCCos ;
   private java.math.BigDecimal T9472OMMRCos ;
   private java.math.BigDecimal Z9442OMMRCosT ;
   private java.math.BigDecimal Z9457OMOpePre ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV20EmprCod ;
   private String Z396EmprCod ;
   private String Z9445OMEst ;
   private String Z9426OMMaqCod ;
   private String N9426OMMaqCod ;
   private String Z9458OMMTpo ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A9426OMMaqCod ;
   private String Gx_mode ;
   private String AV20EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOMCod_Internalname ;
   private String sGXsfl_48_idx="0001" ;
   private String A9445OMEst ;
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
   private String edtOMCod_Jsonclick ;
   private String edtOMMaqCod_Internalname ;
   private String edtOMMaqCod_Jsonclick ;
   private String edtOMMaqDsc_Internalname ;
   private String A9427OMMaqDsc ;
   private String edtOMMaqDsc_Jsonclick ;
   private String edtOMMRCosT_Internalname ;
   private String edtOMMRCosT_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1234 ;
   private String edtOMOpeCod_Internalname ;
   private String edtOMOpeNom_Internalname ;
   private String edtOMOpePre_Internalname ;
   private String edtOMMRCnt_Internalname ;
   private String edtOMMRPre_Internalname ;
   private String edtOMMRCos_Internalname ;
   private String edtOMMCCnt_Internalname ;
   private String edtOMMCPre_Internalname ;
   private String edtOMMCCos_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String AV24Insert_OMMaqCod ;
   private String AV35Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1232 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9456OMOpeNom ;
   private String A9458OMMTpo ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String AV18MTMovNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z9427OMMaqDsc ;
   private String Z9456OMOpeNom ;
   private String sGXsfl_48_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtOMOpeCod_Jsonclick ;
   private String edtOMOpeNom_Jsonclick ;
   private String edtOMOpePre_Jsonclick ;
   private String edtOMMRCnt_Jsonclick ;
   private String edtOMMRPre_Jsonclick ;
   private String edtOMMRCos_Jsonclick ;
   private String edtOMMCCnt_Jsonclick ;
   private String edtOMMCPre_Jsonclick ;
   private String edtOMMCCos_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n9442OMMRCosT ;
   private boolean bGXsfl_48_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n9427OMMaqDsc ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n9456OMOpeNom ;
   private boolean n9457OMOpePre ;
   private String A13748OpeCNom ;
   private String h9455OMOpeCod ;
   private String l13748OpeCNom ;
   private String Zh9455OMOpeCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMEst ;
   private HTMLChoice cmbOMMTpo ;
   private IDataStoreProvider pr_default ;
   private String[] T016E7_A407EmprNom ;
   private boolean[] T016E7_n407EmprNom ;
   private java.math.BigDecimal[] T016E10_A9442OMMRCosT ;
   private boolean[] T016E10_n9442OMMRCosT ;
   private String[] T016E8_A9427OMMaqDsc ;
   private boolean[] T016E8_n9427OMMaqDsc ;
   private int[] T016E12_A9425OMCod ;
   private String[] T016E12_A407EmprNom ;
   private boolean[] T016E12_n407EmprNom ;
   private String[] T016E12_A9427OMMaqDsc ;
   private boolean[] T016E12_n9427OMMaqDsc ;
   private String[] T016E12_A9445OMEst ;
   private String[] T016E12_A396EmprCod ;
   private String[] T016E12_A9426OMMaqCod ;
   private java.math.BigDecimal[] T016E12_A9442OMMRCosT ;
   private boolean[] T016E12_n9442OMMRCosT ;
   private String[] T016E13_A9427OMMaqDsc ;
   private boolean[] T016E13_n9427OMMaqDsc ;
   private java.math.BigDecimal[] T016E15_A9442OMMRCosT ;
   private boolean[] T016E15_n9442OMMRCosT ;
   private String[] T016E16_A396EmprCod ;
   private int[] T016E16_A9425OMCod ;
   private int[] T016E6_A9425OMCod ;
   private String[] T016E6_A9445OMEst ;
   private String[] T016E6_A396EmprCod ;
   private String[] T016E6_A9426OMMaqCod ;
   private String[] T016E17_A396EmprCod ;
   private int[] T016E17_A9425OMCod ;
   private String[] T016E18_A396EmprCod ;
   private int[] T016E18_A9425OMCod ;
   private int[] T016E5_A9425OMCod ;
   private String[] T016E5_A9445OMEst ;
   private String[] T016E5_A396EmprCod ;
   private String[] T016E5_A9426OMMaqCod ;
   private String[] T016E22_A9427OMMaqDsc ;
   private boolean[] T016E22_n9427OMMaqDsc ;
   private java.math.BigDecimal[] T016E24_A9442OMMRCosT ;
   private boolean[] T016E24_n9442OMMRCosT ;
   private String[] T016E25_A396EmprCod ;
   private int[] T016E25_A9425OMCod ;
   private String[] T016E25_A11446OMMEquCod ;
   private String[] T016E25_A11447OMMSEqCod ;
   private String[] T016E25_A11448OMMPieCod ;
   private String[] T016E26_A396EmprCod ;
   private int[] T016E26_A9425OMCod ;
   private int[] T016E26_A9430TMCod ;
   private String[] T016E27_A396EmprCod ;
   private int[] T016E27_A9425OMCod ;
   private int[] T016E27_A9455OMOpeCod ;
   private String[] T016E27_A9458OMMTpo ;
   private short[] T016E27_A9466OMMCLin ;
   private String[] T016E28_A396EmprCod ;
   private int[] T016E28_A9425OMCod ;
   private int[] T016E28_A9446OMRepCod ;
   private String[] T016E28_A9449OMRTpo ;
   private String[] T016E29_A396EmprCod ;
   private int[] T016E29_A9425OMCod ;
   private int[] T016E30_A9425OMCod ;
   private String[] T016E30_A9458OMMTpo ;
   private java.math.BigDecimal[] T016E30_A9460OMMRPre ;
   private String[] T016E30_A9456OMOpeNom ;
   private boolean[] T016E30_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016E30_A9457OMOpePre ;
   private boolean[] T016E30_n9457OMOpePre ;
   private java.math.BigDecimal[] T016E30_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016E30_A9461OMMCCnt ;
   private java.math.BigDecimal[] T016E30_A9462OMMCPre ;
   private String[] T016E30_A396EmprCod ;
   private int[] T016E30_A9455OMOpeCod ;
   private String[] T016E31_A13748OpeCNom ;
   private String[] T016E31_A396EmprCod ;
   private int[] T016E31_A652OpeCod ;
   private String[] T016E4_A9456OMOpeNom ;
   private boolean[] T016E4_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016E4_A9457OMOpePre ;
   private boolean[] T016E4_n9457OMOpePre ;
   private String[] T016E32_A9456OMOpeNom ;
   private boolean[] T016E32_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016E32_A9457OMOpePre ;
   private boolean[] T016E32_n9457OMOpePre ;
   private String[] T016E33_A396EmprCod ;
   private int[] T016E33_A9425OMCod ;
   private int[] T016E33_A9455OMOpeCod ;
   private String[] T016E33_A9458OMMTpo ;
   private int[] T016E3_A9425OMCod ;
   private String[] T016E3_A9458OMMTpo ;
   private java.math.BigDecimal[] T016E3_A9460OMMRPre ;
   private java.math.BigDecimal[] T016E3_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016E3_A9461OMMCCnt ;
   private java.math.BigDecimal[] T016E3_A9462OMMCPre ;
   private String[] T016E3_A396EmprCod ;
   private int[] T016E3_A9455OMOpeCod ;
   private int[] T016E2_A9425OMCod ;
   private String[] T016E2_A9458OMMTpo ;
   private java.math.BigDecimal[] T016E2_A9460OMMRPre ;
   private java.math.BigDecimal[] T016E2_A9459OMMRCnt ;
   private java.math.BigDecimal[] T016E2_A9461OMMCCnt ;
   private java.math.BigDecimal[] T016E2_A9462OMMCPre ;
   private String[] T016E2_A396EmprCod ;
   private int[] T016E2_A9455OMOpeCod ;
   private String[] T016E37_A9456OMOpeNom ;
   private boolean[] T016E37_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016E37_A9457OMOpePre ;
   private boolean[] T016E37_n9457OMOpePre ;
   private String[] T016E38_A396EmprCod ;
   private int[] T016E38_A9425OMCod ;
   private int[] T016E38_A9455OMOpeCod ;
   private String[] T016E38_A9458OMMTpo ;
   private short[] T016E38_A9466OMMCLin ;
   private String[] T016E39_A396EmprCod ;
   private int[] T016E39_A9425OMCod ;
   private int[] T016E39_A9455OMOpeCod ;
   private String[] T016E39_A9458OMMTpo ;
   private String[] T016E40_A13748OpeCNom ;
   private String[] T016E41_A13748OpeCNom ;
   private String[] T016E41_A396EmprCod ;
   private int[] T016E41_A652OpeCod ;
   private String[] T016E42_A13748OpeCNom ;
   private String[] T016E42_A396EmprCod ;
   private int[] T016E42_A652OpeCod ;
   private String[] T016E43_A9456OMOpeNom ;
   private boolean[] T016E43_n9456OMOpeNom ;
   private java.math.BigDecimal[] T016E43_A9457OMOpePre ;
   private boolean[] T016E43_n9457OMOpePre ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV21WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext6[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV22TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV25TrnContextAtt ;
}

final  class tmordmr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordmr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016E2", "SELECT OMCod, OMMTpo, OMMRPre, OMMRCnt, OMMCCnt, OMMCPre, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?  FOR UPDATE OF OMMRPre, OMMRCnt, OMMCCnt, OMMCPre NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E3", "SELECT OMCod, OMMTpo, OMMRPre, OMMRCnt, OMMCCnt, OMMCPre, EmprCod, OMOpeCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E4", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E5", "SELECT OMCod, OMEst, EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ?  FOR UPDATE OF OMEst, OMMaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E6", "SELECT OMCod, OMEst, EmprCod, OMMaqCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E8", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E10", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E12", "SELECT /*+ FIRST_ROWS(100) */ TM1.OMCod, T2.EmprNom, T3.MaqDsc AS OMMaqDsc, TM1.OMEst, TM1.EmprCod, TM1.OMMaqCod AS OMMaqCod, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT FROM (((TXPMORDEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.OMMaqCod) LEFT JOIN (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.OMCod = TM1.OMCod) WHERE TM1.EmprCod = ? and TM1.OMCod = ? ORDER BY TM1.EmprCod, TM1.OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E13", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E15", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E16", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E17", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE ( OMCod > ?) and EmprCod = ? ORDER BY EmprCod, OMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016E18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod FROM TXPMORDEN WHERE ( OMCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, OMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016E19", "INSERT INTO TXPMORDEN(OMCod, OMEst, EmprCod, OMMaqCod, SMCod, PMCod, OMTxt, OMOpeRes, OMFchCre, OMUsuCre, OMFchPre, OMFchCer, OMNot) VALUES(?, ?, ?, ?, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016E20", "UPDATE TXPMORDEN SET OMEst=?, OMMaqCod=?  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new UpdateCursor("T016E21", "DELETE FROM TXPMORDEN  WHERE EmprCod = ? AND OMCod = ?", GX_NOMASK, "TXPMORDEN")
         ,new ForEachCursor("T016E22", "SELECT MaqDsc AS OMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E24", "SELECT COALESCE( T1.OMMRCosT, 0) AS OMMRCosT FROM (SELECT SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, EmprCod, OMCod FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T1 WHERE T1.EmprCod = ? AND T1.OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E25", "SELECT * FROM (SELECT EmprCod, OMCod, OMMEquCod, OMMSEqCod, OMMPieCod FROM TXPMOrde1 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016E26", "SELECT * FROM (SELECT EmprCod, OMCod, TMCod FROM TXPMOrde2 WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016E27", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016E28", "SELECT * FROM (SELECT EmprCod, OMCod, OMRepCod, OMRTpo FROM TXPMOrRep WHERE EmprCod = ? AND OMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016E29", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? ORDER BY EmprCod, OMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E30", "SELECT T1.OMCod, T1.OMMTpo, T1.OMMRPre, T2.OpeNom AS OMOpeNom, T2.OpePreHor AS OMOpePre, T1.OMMRCnt, T1.OMMCCnt, T1.OMMCPre, T1.EmprCod, T1.OMOpeCod AS OMOpeCod FROM (TXPMOrMO T1 INNER JOIN TXPOPERAR T2 ON T2.EmprCod = T1.EmprCod AND T2.OpeCod = T1.OMOpeCod) WHERE T1.EmprCod = ? and T1.OMCod = ? and T1.OMOpeCod = ? and T1.OMMTpo = ? ORDER BY T1.EmprCod, T1.OMCod, T1.OMOpeCod, T1.OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E31", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E32", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E33", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016E34", "INSERT INTO TXPMOrMO(OMCod, OMMTpo, OMMRPre, OMMRCnt, OMMCCnt, OMMCPre, EmprCod, OMOpeCod, OMMCUlt) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T016E35", "UPDATE TXPMOrMO SET OMMRPre=?, OMMRCnt=?, OMMCCnt=?, OMMCPre=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T016E36", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new ForEachCursor("T016E37", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E38", "SELECT * FROM (SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016E39", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? and OMCod = ? and OMMTpo = 'R' ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E40", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, '')))) like '%' || UPPER(?)) ORDER BY OpeCNom) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E41", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E42", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016E43", "SELECT OpeNom AS OMOpeNom, OpePreHor AS OMOpePre FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 3);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 29 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 35 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 36 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

