package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordco_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
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
         gxload_17( A396EmprCod, A9425OMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9455OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A9455OMOpeCod) ;
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
            AV21OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21OMOpeCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21OMOpeCod), "ZZZZZ9")));
            AV22OMMTpo = httpContext.GetPar( "OMMTpo") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22OMMTpo", AV22OMMTpo);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMMTPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22OMMTpo, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control de Ordenes de Mantto", ""), (short)(0)) ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public tmordco_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordco_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordco_impl.class ));
   }

   public tmordco_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbOMMCEst = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMCod_Internalname, httpContext.getMessage( "Cod de Orden de Mantto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdCo.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMOpeCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMOpeCod_Internalname, httpContext.getMessage( "Operario Mantenimiento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9455OMOpeCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMOpeCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMOpeCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdCo.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMOpeNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMOpeNom_Internalname, httpContext.getMessage( "Nombre Operario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMOpeNom_Internalname, GXutil.rtrim( A9456OMOpeNom), GXutil.rtrim( localUtil.format( A9456OMOpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMOpeNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdCo.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMTpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMTpo_Internalname, httpContext.getMessage( "Tipo de Línea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMTpo_Internalname, GXutil.rtrim( A9458OMMTpo), GXutil.rtrim( localUtil.format( A9458OMMTpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMTpo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMTpo_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdCo.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMCCnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMCCnt_Internalname, httpContext.getMessage( "Cantidad Consumo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMCCnt_Internalname, GXutil.ltrim( localUtil.ntoc( A9461OMMCCnt, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMCCnt_Enabled!=0) ? localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9461OMMCCnt, "ZZ,ZZZ,ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMCCnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMCCnt_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdCo.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOMMCUlt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOMMCUlt_Internalname, httpContext.getMessage( "Ultimo Control", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOMMCUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A9465OMMCUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOMMCUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9465OMMCUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9465OMMCUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOMMCUlt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtOMMCUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdCo.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdCo.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdCo.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdCo.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdCo.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOrdCo.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1235 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1235 = (short)(1) ;
            scanStart13T1235( ) ;
            while ( RcdFound1235 != 0 )
            {
               init_level_properties1235( ) ;
               getByPrimaryKey13T1235( ) ;
               addRow13T1235( ) ;
               scanNext13T1235( ) ;
            }
            scanEnd13T1235( ) ;
            nBlankRcdCount1235 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal13T1235( ) ;
         standaloneModal13T1235( ) ;
         sMode1235 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow13T1235( ) ;
            edtOMMCLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            cmbOMMCEst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMCEST_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbOMMCEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMCEst.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
            edtOMMCIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCINI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCIni_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtOMMCFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCFIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCFin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtOMMCTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCTIE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOMMCTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCTie_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1235 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal13T1235( ) ;
            }
            sendRow13T1235( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1235 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1235 = (short)(5) ;
         nRcdExists_1235 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart13T1235( ) ;
            while ( RcdFound1235 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501235( ) ;
               init_level_properties1235( ) ;
               standaloneNotModal13T1235( ) ;
               getByPrimaryKey13T1235( ) ;
               standaloneModal13T1235( ) ;
               addRow13T1235( ) ;
               scanNext13T1235( ) ;
            }
            scanEnd13T1235( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1235 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_501235( ) ;
         initAll13T1235( ) ;
         init_level_properties1235( ) ;
         nRcdExists_1235 = (short)(0) ;
         nIsMod_1235 = (short)(0) ;
         nRcdDeleted_1235 = (short)(0) ;
         nBlankRcdCount1235 = (short)(nBlankRcdUsr1235+nBlankRcdCount1235) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1235 > 0 )
         {
            standaloneNotModal13T1235( ) ;
            standaloneModal13T1235( ) ;
            addRow13T1235( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtOMMCLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1235 = (short)(nBlankRcdCount1235-1) ;
         }
         Gx_mode = sMode1235 ;
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
      e1113T2 ();
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
            Z9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9455OMOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9458OMMTpo = httpContext.cgiGet( "Z9458OMMTpo") ;
            Z9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( "Z9461OMMCCnt")) ;
            Z9465OMMCUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z9465OMMCUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV14OMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "vOMOPECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22OMMTpo = httpContext.cgiGet( "vOMMTPO") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OMOPECOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMOpeCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9455OMOpeCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
            }
            else
            {
               A9455OMOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
            }
            A9456OMOpeNom = httpContext.cgiGet( edtOMOpeNom_Internalname) ;
            n9456OMOpeNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", A9456OMOpeNom);
            A9458OMMTpo = httpContext.cgiGet( edtOMMTpo_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)), DecimalUtil.stringToDec("-9999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)), DecimalUtil.stringToDec("99999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OMMCCNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMMCCnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9461OMMCCnt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A9461OMMCCnt", GXutil.ltrimstr( A9461OMMCCnt, 12, 3));
            }
            else
            {
               A9461OMMCCnt = localUtil.ctond( httpContext.cgiGet( edtOMMCCnt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9461OMMCCnt", GXutil.ltrimstr( A9461OMMCCnt, 12, 3));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMMCUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMMCUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OMMCULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtOMMCUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9465OMMCUlt = (short)(0) ;
               n9465OMMCUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9465OMMCUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9465OMMCUlt), 4, 0));
            }
            else
            {
               A9465OMMCUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtOMMCUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9465OMMCUlt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9465OMMCUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9465OMMCUlt), 4, 0));
            }
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdCo");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) || ( A9455OMOpeCod != Z9455OMOpeCod ) || ( GXutil.strcmp(A9458OMMTpo, Z9458OMMTpo) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmordco:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A9455OMOpeCod = (int)(GXutil.lval( httpContext.GetPar( "OMOpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
               A9458OMMTpo = httpContext.GetPar( "OMMTpo") ;
               httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
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
                  sMode1234 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1234 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1234 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13T0( ) ;
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
                        e1113T2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213T2 ();
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
         e1213T2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13T1234( ) ;
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
         disableAttributes13T1234( ) ;
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

   public void confirm_13T0( )
   {
      beforeValidate13T1234( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13T1234( ) ;
         }
         else
         {
            checkExtendedTable13T1234( ) ;
            closeExtendedTableCursors13T1234( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1234 = Gx_mode ;
         confirm_13T1235( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1234 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_13T1235( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow13T1235( ) ;
         if ( ( nRcdExists_1235 != 0 ) || ( nIsMod_1235 != 0 ) )
         {
            getKey13T1235( ) ;
            if ( ( nRcdExists_1235 == 0 ) && ( nRcdDeleted_1235 == 0 ) )
            {
               if ( RcdFound1235 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate13T1235( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable13T1235( ) ;
                     closeExtendedTableCursors13T1235( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "OMMCLIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOMMCLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1235 != 0 )
               {
                  if ( nRcdDeleted_1235 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey13T1235( ) ;
                     load13T1235( ) ;
                     beforeValidate13T1235( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls13T1235( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1235 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate13T1235( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable13T1235( ) ;
                           closeExtendedTableCursors13T1235( ) ;
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
                  if ( nRcdDeleted_1235 == 0 )
                  {
                     GXCCtl = "OMMCLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMMCLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMMCLin_Internalname, GXutil.ltrim( localUtil.ntoc( A9466OMMCLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMCEst.getInternalname(), GXutil.rtrim( A9467OMMCEst)) ;
         httpContext.changePostValue( edtOMMCIni_Internalname, localUtil.ttoc( A9468OMMCIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtOMMCFin_Internalname, localUtil.ttoc( A9469OMMCFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtOMMCTie_Internalname, GXutil.ltrim( localUtil.ntoc( A9470OMMCTie, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9466OMMCLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z9466OMMCLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9467OMMCEst_"+sGXsfl_50_idx, GXutil.rtrim( Z9467OMMCEst)) ;
         httpContext.changePostValue( "ZT_"+"Z9468OMMCIni_"+sGXsfl_50_idx, localUtil.ttoc( Z9468OMMCIni, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9469OMMCFin_"+sGXsfl_50_idx, localUtil.ttoc( Z9469OMMCFin, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1235_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1235_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1235_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1235 != 0 )
         {
            httpContext.changePostValue( "OMMCLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCEST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMCEst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCINI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCFIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCTIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption13T0( )
   {
   }

   public void e1113T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmordco_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV26ObtenerEmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordco_impl.this.AV26ObtenerEmprCod = GXv_char2[0] ;
      tmordco_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordco_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ObtenerEmprCod", AV26ObtenerEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmordco_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV20EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmordco_impl.this.AV20EmprCod = GXv_char4[0] ;
      tmordco_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmordco_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV23WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV23WWPContext = GXv_SdtWWPContext5[0] ;
      AV24TrnContext.fromxml(AV25WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e1213T2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV24TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tmordcoww", new String[] {}, new String[] {}) );
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
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm13T1234( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9461OMMCCnt = T013T5_A9461OMMCCnt[0] ;
            Z9465OMMCUlt = T013T5_A9465OMMCUlt[0] ;
         }
         else
         {
            Z9461OMMCCnt = A9461OMMCCnt ;
            Z9465OMMCUlt = A9465OMMCUlt ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z9458OMMTpo = A9458OMMTpo ;
         Z9461OMMCCnt = A9461OMMCCnt ;
         Z9465OMMCUlt = A9465OMMCUlt ;
         Z396EmprCod = A396EmprCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9425OMCod = A9425OMCod ;
         Z407EmprNom = A407EmprNom ;
         Z9456OMOpeNom = A9456OMOpeNom ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV20EmprCod)==0) )
      {
         A396EmprCod = AV20EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
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
      if ( ! (0==AV21OMOpeCod) )
      {
         A9455OMOpeCod = AV21OMOpeCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
      }
      if ( ! (0==AV21OMOpeCod) )
      {
         edtOMOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), true);
      }
      else
      {
         edtOMOpeCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV21OMOpeCod) )
      {
         edtOMOpeCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV22OMMTpo)==0) )
      {
         A9458OMMTpo = AV22OMMTpo ;
         httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
      }
      if ( ! (GXutil.strcmp("", AV22OMMTpo)==0) )
      {
         edtOMMTpo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMTpo_Enabled), 5, 0), true);
      }
      else
      {
         edtOMMTpo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMTpo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV22OMMTpo)==0) )
      {
         edtOMMTpo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMTpo_Enabled), 5, 0), true);
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
         /* Using cursor T013T6 */
         pr_default.execute(4, new Object[] {A396EmprCod});
         A407EmprNom = T013T6_A407EmprNom[0] ;
         n407EmprNom = T013T6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(4);
         /* Using cursor T013T7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
         A9456OMOpeNom = T013T7_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T013T7_n9456OMOpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", A9456OMOpeNom);
         pr_default.close(5);
      }
   }

   public void load13T1234( )
   {
      /* Using cursor T013T9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A407EmprNom = T013T9_A407EmprNom[0] ;
         n407EmprNom = T013T9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9456OMOpeNom = T013T9_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T013T9_n9456OMOpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", A9456OMOpeNom);
         A9461OMMCCnt = T013T9_A9461OMMCCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9461OMMCCnt", GXutil.ltrimstr( A9461OMMCCnt, 12, 3));
         A9465OMMCUlt = T013T9_A9465OMMCUlt[0] ;
         n9465OMMCUlt = T013T9_n9465OMMCUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9465OMMCUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9465OMMCUlt), 4, 0));
         zm13T1234( -14) ;
      }
      pr_default.close(7);
      onLoadActions13T1234( ) ;
   }

   public void onLoadActions13T1234( )
   {
   }

   public void checkExtendedTable13T1234( )
   {
      nIsDirty_1234 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T013T6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013T6_A407EmprNom[0] ;
      n407EmprNom = T013T6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T013T8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOrdenes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      /* Using cursor T013T7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T013T7_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013T7_n9456OMOpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", A9456OMOpeNom);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors13T1234( )
   {
      pr_default.close(4);
      pr_default.close(6);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod )
   {
      /* Using cursor T013T10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013T10_A407EmprNom[0] ;
      n407EmprNom = T013T10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_17( String A396EmprCod ,
                          int A9425OMCod )
   {
      /* Using cursor T013T11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOrdenes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_16( String A396EmprCod ,
                          int A9455OMOpeCod )
   {
      /* Using cursor T013T12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9456OMOpeNom = T013T12_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013T12_n9456OMOpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", A9456OMOpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9456OMOpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey13T1234( )
   {
      /* Using cursor T013T13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1234 = (short)(1) ;
      }
      else
      {
         RcdFound1234 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013T5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm13T1234( 14) ;
         RcdFound1234 = (short)(1) ;
         A9458OMMTpo = T013T5_A9458OMMTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
         A9461OMMCCnt = T013T5_A9461OMMCCnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9461OMMCCnt", GXutil.ltrimstr( A9461OMMCCnt, 12, 3));
         A9465OMMCUlt = T013T5_A9465OMMCUlt[0] ;
         n9465OMMCUlt = T013T5_n9465OMMCUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9465OMMCUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9465OMMCUlt), 4, 0));
         A396EmprCod = T013T5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9455OMOpeCod = T013T5_A9455OMOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
         A9425OMCod = T013T5_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13T1234( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1234 = (short)(0) ;
            initializeNonKey13T1234( ) ;
         }
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1234 = (short)(0) ;
         initializeNonKey13T1234( ) ;
         sMode1234 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1234 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey13T1234( ) ;
      if ( RcdFound1234 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1234 = (short)(0) ;
      /* Using cursor T013T14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9425OMCod), A396EmprCod, Integer.valueOf(A9455OMOpeCod), Integer.valueOf(A9455OMOpeCod), Integer.valueOf(A9425OMCod), A396EmprCod, A9458OMMTpo});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T013T14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013T14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013T14_A9425OMCod[0] < A9425OMCod ) || ( T013T14_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013T14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013T14_A9455OMOpeCod[0] < A9455OMOpeCod ) || ( T013T14_A9455OMOpeCod[0] == A9455OMOpeCod ) && ( T013T14_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013T14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013T14_A9458OMMTpo[0], A9458OMMTpo) < 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T013T14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013T14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013T14_A9425OMCod[0] > A9425OMCod ) || ( T013T14_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013T14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013T14_A9455OMOpeCod[0] > A9455OMOpeCod ) || ( T013T14_A9455OMOpeCod[0] == A9455OMOpeCod ) && ( T013T14_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013T14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013T14_A9458OMMTpo[0], A9458OMMTpo) > 0 ) ) )
         {
            A396EmprCod = T013T14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9425OMCod = T013T14_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            A9455OMOpeCod = T013T14_A9455OMOpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
            A9458OMMTpo = T013T14_A9458OMMTpo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
            RcdFound1234 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1234 = (short)(0) ;
      /* Using cursor T013T15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9425OMCod), A396EmprCod, Integer.valueOf(A9455OMOpeCod), Integer.valueOf(A9455OMOpeCod), Integer.valueOf(A9425OMCod), A396EmprCod, A9458OMMTpo});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T013T15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013T15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013T15_A9425OMCod[0] > A9425OMCod ) || ( T013T15_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013T15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013T15_A9455OMOpeCod[0] > A9455OMOpeCod ) || ( T013T15_A9455OMOpeCod[0] == A9455OMOpeCod ) && ( T013T15_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013T15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013T15_A9458OMMTpo[0], A9458OMMTpo) > 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T013T15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013T15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013T15_A9425OMCod[0] < A9425OMCod ) || ( T013T15_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013T15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013T15_A9455OMOpeCod[0] < A9455OMOpeCod ) || ( T013T15_A9455OMOpeCod[0] == A9455OMOpeCod ) && ( T013T15_A9425OMCod[0] == A9425OMCod ) && ( GXutil.strcmp(T013T15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013T15_A9458OMMTpo[0], A9458OMMTpo) < 0 ) ) )
         {
            A396EmprCod = T013T15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9425OMCod = T013T15_A9425OMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
            A9455OMOpeCod = T013T15_A9455OMOpeCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
            A9458OMMTpo = T013T15_A9458OMMTpo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
            RcdFound1234 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13T1234( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtOMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13T1234( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1234 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) || ( A9455OMOpeCod != Z9455OMOpeCod ) || ( GXutil.strcmp(A9458OMMTpo, Z9458OMMTpo) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9425OMCod = Z9425OMCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
               A9455OMOpeCod = Z9455OMOpeCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
               A9458OMMTpo = Z9458OMMTpo ;
               httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update13T1234( ) ;
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) || ( A9455OMOpeCod != Z9455OMOpeCod ) || ( GXutil.strcmp(A9458OMMTpo, Z9458OMMTpo) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtOMCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13T1234( ) ;
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
                  GX_FocusControl = edtOMCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13T1234( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9425OMCod != Z9425OMCod ) || ( A9455OMOpeCod != Z9455OMOpeCod ) || ( GXutil.strcmp(A9458OMMTpo, Z9458OMMTpo) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = Z9425OMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9455OMOpeCod = Z9455OMOpeCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
         A9458OMMTpo = Z9458OMMTpo ;
         httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtOMCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency13T1234( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013T4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z9461OMMCCnt, T013T4_A9461OMMCCnt[0]) != 0 ) || ( Z9465OMMCUlt != T013T4_A9465OMMCUlt[0] ) )
         {
            if ( DecimalUtil.compareTo(Z9461OMMCCnt, T013T4_A9461OMMCCnt[0]) != 0 )
            {
               GXutil.writeLogln("tmordco:[seudo value changed for attri]"+"OMMCCnt");
               GXutil.writeLogRaw("Old: ",Z9461OMMCCnt);
               GXutil.writeLogRaw("Current: ",T013T4_A9461OMMCCnt[0]);
            }
            if ( Z9465OMMCUlt != T013T4_A9465OMMCUlt[0] )
            {
               GXutil.writeLogln("tmordco:[seudo value changed for attri]"+"OMMCUlt");
               GXutil.writeLogRaw("Old: ",Z9465OMMCUlt);
               GXutil.writeLogRaw("Current: ",T013T4_A9465OMMCUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13T1234( )
   {
      beforeValidate13T1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13T1234( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13T1234( 0) ;
         checkOptimisticConcurrency13T1234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13T1234( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13T1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013T16 */
                  pr_default.execute(14, new Object[] {A9458OMMTpo, A9461OMMCCnt, Boolean.valueOf(n9465OMMCUlt), Short.valueOf(A9465OMMCUlt), A396EmprCod, Integer.valueOf(A9455OMOpeCod), Integer.valueOf(A9425OMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
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
                        processLevel13T1234( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption13T0( ) ;
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
            load13T1234( ) ;
         }
         endLevel13T1234( ) ;
      }
      closeExtendedTableCursors13T1234( ) ;
   }

   public void update13T1234( )
   {
      beforeValidate13T1234( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13T1234( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13T1234( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13T1234( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13T1234( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013T17 */
                  pr_default.execute(15, new Object[] {A9461OMMCCnt, Boolean.valueOf(n9465OMMCUlt), Short.valueOf(A9465OMMCUlt), A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13T1234( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13T1234( ) ;
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
         endLevel13T1234( ) ;
      }
      closeExtendedTableCursors13T1234( ) ;
   }

   public void deferredUpdate13T1234( )
   {
   }

   public void delete( )
   {
      beforeValidate13T1234( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13T1234( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13T1234( ) ;
         afterConfirm13T1234( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13T1234( ) ;
            if ( AnyError == 0 )
            {
               scanStart13T1235( ) ;
               while ( RcdFound1235 != 0 )
               {
                  getByPrimaryKey13T1235( ) ;
                  delete13T1235( ) ;
                  scanNext13T1235( ) ;
               }
               scanEnd13T1235( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013T18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMO");
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
      sMode1234 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13T1234( ) ;
      Gx_mode = sMode1234 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13T1234( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013T19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T013T19_A407EmprNom[0] ;
         n407EmprNom = T013T19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         /* Using cursor T013T20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
         A9456OMOpeNom = T013T20_A9456OMOpeNom[0] ;
         n9456OMOpeNom = T013T20_n9456OMOpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", A9456OMOpeNom);
         pr_default.close(18);
      }
   }

   public void processNestedLevel13T1235( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow13T1235( ) ;
         if ( ( nRcdExists_1235 != 0 ) || ( nIsMod_1235 != 0 ) )
         {
            standaloneNotModal13T1235( ) ;
            getKey13T1235( ) ;
            if ( ( nRcdExists_1235 == 0 ) && ( nRcdDeleted_1235 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert13T1235( ) ;
            }
            else
            {
               if ( RcdFound1235 != 0 )
               {
                  if ( ( nRcdDeleted_1235 != 0 ) && ( nRcdExists_1235 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete13T1235( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1235 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update13T1235( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1235 == 0 )
                  {
                     GXCCtl = "OMMCLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOMMCLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOMMCLin_Internalname, GXutil.ltrim( localUtil.ntoc( A9466OMMCLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbOMMCEst.getInternalname(), GXutil.rtrim( A9467OMMCEst)) ;
         httpContext.changePostValue( edtOMMCIni_Internalname, localUtil.ttoc( A9468OMMCIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtOMMCFin_Internalname, localUtil.ttoc( A9469OMMCFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtOMMCTie_Internalname, GXutil.ltrim( localUtil.ntoc( A9470OMMCTie, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9466OMMCLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z9466OMMCLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9467OMMCEst_"+sGXsfl_50_idx, GXutil.rtrim( Z9467OMMCEst)) ;
         httpContext.changePostValue( "ZT_"+"Z9468OMMCIni_"+sGXsfl_50_idx, localUtil.ttoc( Z9468OMMCIni, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z9469OMMCFin_"+sGXsfl_50_idx, localUtil.ttoc( Z9469OMMCFin, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1235_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1235_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1235_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1235 != 0 )
         {
            httpContext.changePostValue( "OMMCLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCEST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMCEst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCINI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCIni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCFIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCFin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OMMCTIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll13T1235( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1235 = (short)(0) ;
      nIsMod_1235 = (short)(0) ;
      nRcdDeleted_1235 = (short)(0) ;
   }

   public void processLevel13T1234( )
   {
      /* Save parent mode. */
      sMode1234 = Gx_mode ;
      processNestedLevel13T1235( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1234 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13T1234( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13T1234( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmordco");
         if ( AnyError == 0 )
         {
            confirmValues13T0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmordco");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13T1234( )
   {
      /* Scan By routine */
      /* Using cursor T013T21 */
      pr_default.execute(19);
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A396EmprCod = T013T21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = T013T21_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9455OMOpeCod = T013T21_A9455OMOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
         A9458OMMTpo = T013T21_A9458OMMTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13T1234( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1234 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1234 = (short)(1) ;
         A396EmprCod = T013T21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9425OMCod = T013T21_A9425OMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
         A9455OMOpeCod = T013T21_A9455OMOpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
         A9458OMMTpo = T013T21_A9458OMMTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
      }
   }

   public void scanEnd13T1234( )
   {
      pr_default.close(19);
   }

   public void afterConfirm13T1234( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13T1234( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13T1234( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13T1234( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13T1234( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13T1234( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13T1234( )
   {
      edtOMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Enabled), 5, 0), true);
      edtOMOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeCod_Enabled), 5, 0), true);
      edtOMOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMOpeNom_Enabled), 5, 0), true);
      edtOMMTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMTpo_Enabled), 5, 0), true);
      edtOMMCCnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCnt_Enabled), 5, 0), true);
      edtOMMCUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCUlt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm13T1235( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9467OMMCEst = T013T3_A9467OMMCEst[0] ;
            Z9468OMMCIni = T013T3_A9468OMMCIni[0] ;
            Z9469OMMCFin = T013T3_A9469OMMCFin[0] ;
         }
         else
         {
            Z9467OMMCEst = A9467OMMCEst ;
            Z9468OMMCIni = A9468OMMCIni ;
            Z9469OMMCFin = A9469OMMCFin ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z9425OMCod = A9425OMCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         Z9466OMMCLin = A9466OMMCLin ;
         Z9467OMMCEst = A9467OMMCEst ;
         Z9468OMMCIni = A9468OMMCIni ;
         Z9469OMMCFin = A9469OMMCFin ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal13T1235( )
   {
   }

   public void standaloneModal13T1235( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOMMCLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMCLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtOMMCLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOMMCLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load13T1235( )
   {
      /* Using cursor T013T22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, Short.valueOf(A9466OMMCLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1235 = (short)(1) ;
         A9467OMMCEst = T013T22_A9467OMMCEst[0] ;
         A9468OMMCIni = T013T22_A9468OMMCIni[0] ;
         A9469OMMCFin = T013T22_A9469OMMCFin[0] ;
         zm13T1235( -18) ;
      }
      pr_default.close(20);
      onLoadActions13T1235( ) ;
   }

   public void onLoadActions13T1235( )
   {
      if ( GXutil.strcmp(A9467OMMCEst, httpContext.getMessage( "T", "")) == 0 )
      {
         A9470OMMCTie = DecimalUtil.doubleToDec(GXutil.dtdiff( A9469OMMCFin, A9468OMMCIni)/ (double) (3600)) ;
      }
      else
      {
         A9470OMMCTie = DecimalUtil.doubleToDec(0) ;
      }
   }

   public void checkExtendedTable13T1235( )
   {
      nIsDirty_1235 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal13T1235( ) ;
      if ( GXutil.strcmp(A9467OMMCEst, httpContext.getMessage( "T", "")) == 0 )
      {
         nIsDirty_1235 = (short)(1) ;
         A9470OMMCTie = DecimalUtil.doubleToDec(GXutil.dtdiff( A9469OMMCFin, A9468OMMCIni)/ (double) (3600)) ;
      }
      else
      {
         nIsDirty_1235 = (short)(1) ;
         A9470OMMCTie = DecimalUtil.doubleToDec(0) ;
      }
   }

   public void closeExtendedTableCursors13T1235( )
   {
   }

   public void enableDisable13T1235( )
   {
   }

   public void getKey13T1235( )
   {
      /* Using cursor T013T23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, Short.valueOf(A9466OMMCLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1235 = (short)(1) ;
      }
      else
      {
         RcdFound1235 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey13T1235( )
   {
      /* Using cursor T013T3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, Short.valueOf(A9466OMMCLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm13T1235( 18) ;
         RcdFound1235 = (short)(1) ;
         initializeNonKey13T1235( ) ;
         A9466OMMCLin = T013T3_A9466OMMCLin[0] ;
         A9467OMMCEst = T013T3_A9467OMMCEst[0] ;
         A9468OMMCIni = T013T3_A9468OMMCIni[0] ;
         A9469OMMCFin = T013T3_A9469OMMCFin[0] ;
         Z396EmprCod = A396EmprCod ;
         Z9425OMCod = A9425OMCod ;
         Z9455OMOpeCod = A9455OMOpeCod ;
         Z9458OMMTpo = A9458OMMTpo ;
         Z9466OMMCLin = A9466OMMCLin ;
         sMode1235 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13T1235( ) ;
         Gx_mode = sMode1235 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1235 = (short)(0) ;
         initializeNonKey13T1235( ) ;
         sMode1235 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal13T1235( ) ;
         Gx_mode = sMode1235 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes13T1235( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency13T1235( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013T2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, Short.valueOf(A9466OMMCLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMCo"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9467OMMCEst, T013T2_A9467OMMCEst[0]) != 0 ) || !( GXutil.dateCompare(Z9468OMMCIni, T013T2_A9468OMMCIni[0]) ) || !( GXutil.dateCompare(Z9469OMMCFin, T013T2_A9469OMMCFin[0]) ) )
         {
            if ( GXutil.strcmp(Z9467OMMCEst, T013T2_A9467OMMCEst[0]) != 0 )
            {
               GXutil.writeLogln("tmordco:[seudo value changed for attri]"+"OMMCEst");
               GXutil.writeLogRaw("Old: ",Z9467OMMCEst);
               GXutil.writeLogRaw("Current: ",T013T2_A9467OMMCEst[0]);
            }
            if ( !( GXutil.dateCompare(Z9468OMMCIni, T013T2_A9468OMMCIni[0]) ) )
            {
               GXutil.writeLogln("tmordco:[seudo value changed for attri]"+"OMMCIni");
               GXutil.writeLogRaw("Old: ",Z9468OMMCIni);
               GXutil.writeLogRaw("Current: ",T013T2_A9468OMMCIni[0]);
            }
            if ( !( GXutil.dateCompare(Z9469OMMCFin, T013T2_A9469OMMCFin[0]) ) )
            {
               GXutil.writeLogln("tmordco:[seudo value changed for attri]"+"OMMCFin");
               GXutil.writeLogRaw("Old: ",Z9469OMMCFin);
               GXutil.writeLogRaw("Current: ",T013T2_A9469OMMCFin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOrMCo"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13T1235( )
   {
      beforeValidate13T1235( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13T1235( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13T1235( 0) ;
         checkOptimisticConcurrency13T1235( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13T1235( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13T1235( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013T24 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, Short.valueOf(A9466OMMCLin), A9467OMMCEst, A9468OMMCIni, A9469OMMCFin, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMCo");
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
            load13T1235( ) ;
         }
         endLevel13T1235( ) ;
      }
      closeExtendedTableCursors13T1235( ) ;
   }

   public void update13T1235( )
   {
      beforeValidate13T1235( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13T1235( ) ;
      }
      if ( ( nIsMod_1235 != 0 ) || ( nIsDirty_1235 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency13T1235( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm13T1235( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate13T1235( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013T25 */
                     pr_default.execute(23, new Object[] {A9467OMMCEst, A9468OMMCIni, A9469OMMCFin, A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, Short.valueOf(A9466OMMCLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMCo");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOrMCo"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate13T1235( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey13T1235( ) ;
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
            endLevel13T1235( ) ;
         }
      }
      closeExtendedTableCursors13T1235( ) ;
   }

   public void deferredUpdate13T1235( )
   {
   }

   public void delete13T1235( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13T1235( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13T1235( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13T1235( ) ;
         afterConfirm13T1235( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13T1235( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013T26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo, Short.valueOf(A9466OMMCLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOrMCo");
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
      sMode1235 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13T1235( ) ;
      Gx_mode = sMode1235 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13T1235( )
   {
      standaloneModal13T1235( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( GXutil.strcmp(A9467OMMCEst, httpContext.getMessage( "T", "")) == 0 )
         {
            A9470OMMCTie = DecimalUtil.doubleToDec(GXutil.dtdiff( A9469OMMCFin, A9468OMMCIni)/ (double) (3600)) ;
         }
         else
         {
            A9470OMMCTie = DecimalUtil.doubleToDec(0) ;
         }
      }
   }

   public void endLevel13T1235( )
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

   public void scanStart13T1235( )
   {
      /* Scan By routine */
      /* Using cursor T013T27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod), Integer.valueOf(A9455OMOpeCod), A9458OMMTpo});
      RcdFound1235 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1235 = (short)(1) ;
         A9466OMMCLin = T013T27_A9466OMMCLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13T1235( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound1235 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound1235 = (short)(1) ;
         A9466OMMCLin = T013T27_A9466OMMCLin[0] ;
      }
   }

   public void scanEnd13T1235( )
   {
      pr_default.close(25);
   }

   public void afterConfirm13T1235( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13T1235( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13T1235( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13T1235( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13T1235( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13T1235( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13T1235( )
   {
      edtOMMCLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      cmbOMMCEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMCEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbOMMCEst.getEnabled(), 5, 0), !bGXsfl_50_Refreshing);
      edtOMMCIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCIni_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtOMMCFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCFin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtOMMCTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCTie_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes13T1235( )
   {
   }

   public void send_integrity_lvl_hashes13T1234( )
   {
   }

   public void subsflControlProps_501235( )
   {
      edtOMMCLin_Internalname = "OMMCLIN_"+sGXsfl_50_idx ;
      cmbOMMCEst.setInternalname( "OMMCEST_"+sGXsfl_50_idx );
      edtOMMCIni_Internalname = "OMMCINI_"+sGXsfl_50_idx ;
      edtOMMCFin_Internalname = "OMMCFIN_"+sGXsfl_50_idx ;
      edtOMMCTie_Internalname = "OMMCTIE_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501235( )
   {
      edtOMMCLin_Internalname = "OMMCLIN_"+sGXsfl_50_fel_idx ;
      cmbOMMCEst.setInternalname( "OMMCEST_"+sGXsfl_50_fel_idx );
      edtOMMCIni_Internalname = "OMMCINI_"+sGXsfl_50_fel_idx ;
      edtOMMCFin_Internalname = "OMMCFIN_"+sGXsfl_50_fel_idx ;
      edtOMMCTie_Internalname = "OMMCTIE_"+sGXsfl_50_fel_idx ;
   }

   public void addRow13T1235( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501235( ) ;
      sendRow13T1235( ) ;
   }

   public void sendRow13T1235( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1235_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCLin_Internalname,GXutil.ltrim( localUtil.ntoc( A9466OMMCLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9466OMMCLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMCLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1235_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      if ( ( cmbOMMCEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "OMMCEST_" + sGXsfl_50_idx ;
         cmbOMMCEst.setName( GXCCtl );
         cmbOMMCEst.setWebtags( "" );
         cmbOMMCEst.addItem("I", httpContext.getMessage( "Iniciado", ""), (short)(0));
         cmbOMMCEst.addItem("T", httpContext.getMessage( "Terminado", ""), (short)(0));
         if ( cmbOMMCEst.getItemCount() > 0 )
         {
            A9467OMMCEst = cmbOMMCEst.getValidValue(A9467OMMCEst) ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMMCEst,cmbOMMCEst.getInternalname(),GXutil.rtrim( A9467OMMCEst),Integer.valueOf(1),cmbOMMCEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbOMMCEst.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbOMMCEst.setValue( GXutil.rtrim( A9467OMMCEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMMCEst.getInternalname(), "Values", cmbOMMCEst.ToJavascriptSource(), !bGXsfl_50_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1235_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCIni_Internalname,localUtil.ttoc( A9468OMMCIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9468OMMCIni, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMCIni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1235_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCFin_Internalname,localUtil.ttoc( A9469OMMCFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9469OMMCFin, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMCFin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCTie_Internalname,GXutil.ltrim( localUtil.ntoc( A9470OMMCTie, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOMMCTie_Enabled!=0) ? localUtil.format( A9470OMMCTie, "ZZ,ZZZ,ZZ9.999") : localUtil.format( A9470OMMCTie, "ZZ,ZZZ,ZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtOMMCTie_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes13T1235( ) ;
      GXCCtl = "Z9466OMMCLin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9466OMMCLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9467OMMCEst_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9467OMMCEst));
      GXCCtl = "Z9468OMMCIni_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z9468OMMCIni, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z9469OMMCFin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z9469OMMCFin, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_1235_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1235_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1235_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1235, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_50_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV24TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV24TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV20EmprCod));
      GXCCtl = "vOMCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vOMOPECOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV21OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vOMMTPO_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV22OMMTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCEST_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMCEst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCINI_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCFIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OMMCTIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow13T1235( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501235( ) ;
      edtOMMCLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbOMMCEst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "OMMCEST_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtOMMCIni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCINI_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCFin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCFIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOMMCTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OMMCTIE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOMMCLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOMMCLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "OMMCLIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMCLin_Internalname ;
         wbErr = true ;
         A9466OMMCLin = (short)(0) ;
      }
      else
      {
         A9466OMMCLin = (short)(localUtil.ctol( httpContext.cgiGet( edtOMMCLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      cmbOMMCEst.setName( cmbOMMCEst.getInternalname() );
      cmbOMMCEst.setValue( httpContext.cgiGet( cmbOMMCEst.getInternalname()) );
      A9467OMMCEst = httpContext.cgiGet( cmbOMMCEst.getInternalname()) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtOMMCIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "OMMCINI_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMCIni_Internalname ;
         wbErr = true ;
         A9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A9468OMMCIni = localUtil.ctot( httpContext.cgiGet( edtOMMCIni_Internalname)) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtOMMCFin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "OMMCFIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOMMCFin_Internalname ;
         wbErr = true ;
         A9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A9469OMMCFin = localUtil.ctot( httpContext.cgiGet( edtOMMCFin_Internalname)) ;
      }
      A9470OMMCTie = localUtil.ctond( httpContext.cgiGet( edtOMMCTie_Internalname)) ;
      GXCCtl = "Z9466OMMCLin_" + sGXsfl_50_idx ;
      Z9466OMMCLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9467OMMCEst_" + sGXsfl_50_idx ;
      Z9467OMMCEst = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9468OMMCIni_" + sGXsfl_50_idx ;
      Z9468OMMCIni = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z9469OMMCFin_" + sGXsfl_50_idx ;
      Z9469OMMCFin = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRcdDeleted_1235_" + sGXsfl_50_idx ;
      nRcdDeleted_1235 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1235_" + sGXsfl_50_idx ;
      nRcdExists_1235 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1235_" + sGXsfl_50_idx ;
      nIsMod_1235 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOMMCLin_Enabled = edtOMMCLin_Enabled ;
   }

   public void confirmValues13T0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501235( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501235( ) ;
         httpContext.changePostValue( "Z9466OMMCLin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z9466OMMCLin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9466OMMCLin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z9467OMMCEst_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z9467OMMCEst_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9467OMMCEst_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z9468OMMCIni_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z9468OMMCIni_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9468OMMCIni_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z9469OMMCFin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z9469OMMCFin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9469OMMCFin_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmordco", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV21OMOpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22OMMTpo))}, new String[] {"Gx_mode","EmprCod","OMCod","OMOpeCod","OMMTpo"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMOrdCo");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmordco:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9425OMCod", GXutil.ltrim( localUtil.ntoc( Z9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9455OMOpeCod", GXutil.ltrim( localUtil.ntoc( Z9455OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9458OMMTpo", GXutil.rtrim( Z9458OMMTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9461OMMCCnt", GXutil.ltrim( localUtil.ntoc( Z9461OMMCCnt, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9465OMMCUlt", GXutil.ltrim( localUtil.ntoc( Z9465OMMCUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV24TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV24TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV24TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMCOD", GXutil.ltrim( localUtil.ntoc( AV14OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14OMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMOPECOD", GXutil.ltrim( localUtil.ntoc( AV21OMOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21OMOpeCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMMTPO", GXutil.rtrim( AV22OMMTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOMMTPO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22OMMTpo, ""))));
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
      return formatLink("app.tmordco", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14OMCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV21OMOpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV22OMMTpo))}, new String[] {"Gx_mode","EmprCod","OMCod","OMOpeCod","OMMTpo"})  ;
   }

   public String getPgmname( )
   {
      return "TMOrdCo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control de Ordenes de Mantto", "") ;
   }

   public void initializeNonKey13T1234( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A9456OMOpeNom = "" ;
      n9456OMOpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", A9456OMOpeNom);
      A9461OMMCCnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9461OMMCCnt", GXutil.ltrimstr( A9461OMMCCnt, 12, 3));
      A9465OMMCUlt = (short)(0) ;
      n9465OMMCUlt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9465OMMCUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9465OMMCUlt), 4, 0));
      Z9461OMMCCnt = DecimalUtil.ZERO ;
      Z9465OMMCUlt = (short)(0) ;
   }

   public void initAll13T1234( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9425OMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9425OMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9425OMCod), 8, 0));
      A9455OMOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9455OMOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9455OMOpeCod), 6, 0));
      A9458OMMTpo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9458OMMTpo", A9458OMMTpo);
      initializeNonKey13T1234( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey13T1235( )
   {
      A9470OMMCTie = DecimalUtil.ZERO ;
      A9467OMMCEst = "" ;
      A9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      A9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      Z9467OMMCEst = "" ;
      Z9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      Z9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll13T1235( )
   {
      A9466OMMCLin = (short)(0) ;
      initializeNonKey13T1235( ) ;
   }

   public void standaloneModalInsert13T1235( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202636227348", true, true);
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
      httpContext.AddJavascriptSource("tmordco.js", "?202636227348", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1235( )
   {
      edtOMMCLin_Enabled = defedtOMMCLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9466OMMCLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A9467OMMCEst));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbOMMCEst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.ttoc( A9468OMMCIni, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCIni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.ttoc( A9469OMMCFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCFin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9470OMMCTie, (byte)(14), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOMMCTie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtOMOpeCod_Internalname = "OMOPECOD" ;
      edtOMOpeNom_Internalname = "OMOPENOM" ;
      edtOMMTpo_Internalname = "OMMTPO" ;
      edtOMMCCnt_Internalname = "OMMCCNT" ;
      edtOMMCUlt_Internalname = "OMMCULT" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtOMMCLin_Internalname = "OMMCLIN" ;
      cmbOMMCEst.setInternalname( "OMMCEST" );
      edtOMMCIni_Internalname = "OMMCINI" ;
      edtOMMCFin_Internalname = "OMMCFIN" ;
      edtOMMCTie_Internalname = "OMMCTIE" ;
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
      Form.setCaption( httpContext.getMessage( "Control de Ordenes de Mantto", "") );
      edtOMMCTie_Jsonclick = "" ;
      edtOMMCFin_Jsonclick = "" ;
      edtOMMCIni_Jsonclick = "" ;
      cmbOMMCEst.setJsonclick( "" );
      edtOMMCLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtOMMCTie_Enabled = 0 ;
      edtOMMCFin_Enabled = 1 ;
      edtOMMCIni_Enabled = 1 ;
      cmbOMMCEst.setEnabled( 1 );
      edtOMMCLin_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtOMMCUlt_Jsonclick = "" ;
      edtOMMCUlt_Enabled = 1 ;
      edtOMMCCnt_Jsonclick = "" ;
      edtOMMCCnt_Enabled = 1 ;
      edtOMMTpo_Jsonclick = "" ;
      edtOMMTpo_Enabled = 1 ;
      edtOMOpeNom_Jsonclick = "" ;
      edtOMOpeNom_Enabled = 0 ;
      edtOMOpeCod_Jsonclick = "" ;
      edtOMOpeCod_Enabled = 1 ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_501235( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal13T1235( ) ;
         standaloneModal13T1235( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow13T1235( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501235( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "OMMCEST_" + sGXsfl_50_idx ;
      cmbOMMCEst.setName( GXCCtl );
      cmbOMMCEst.setWebtags( "" );
      cmbOMMCEst.addItem("I", httpContext.getMessage( "Iniciado", ""), (short)(0));
      cmbOMMCEst.addItem("T", httpContext.getMessage( "Terminado", ""), (short)(0));
      if ( cmbOMMCEst.getItemCount() > 0 )
      {
         A9467OMMCEst = cmbOMMCEst.getValidValue(A9467OMMCEst) ;
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
      n9456OMOpeNom = false ;
      /* Using cursor T013T19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T013T19_A407EmprNom[0] ;
      n407EmprNom = T013T19_n407EmprNom[0] ;
      pr_default.close(17);
      /* Using cursor T013T20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A9455OMOpeCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOOpe", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9456OMOpeNom = T013T20_A9456OMOpeNom[0] ;
      n9456OMOpeNom = T013T20_n9456OMOpeNom[0] ;
      pr_default.close(18);
      /* Using cursor T013T28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A9425OMCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MOrdenes", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A9456OMOpeNom", GXutil.rtrim( A9456OMOpeNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV21OMOpeCod',fld:'vOMOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV22OMMTpo',fld:'vOMMTPO',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV24TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14OMCod',fld:'vOMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV21OMOpeCod',fld:'vOMOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV22OMMTpo',fld:'vOMMTPO',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213T2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV24TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[]");
      setEventMetadata("VALID_OMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMOPECOD","{handler:'valid_Omopecod',iparms:[]");
      setEventMetadata("VALID_OMOPECOD",",oparms:[]}");
      setEventMetadata("VALID_OMMTPO","{handler:'valid_Ommtpo',iparms:[]");
      setEventMetadata("VALID_OMMTPO",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9455OMOpeCod',fld:'OMOPECOD',pic:'ZZZZZ9'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A9456OMOpeNom',fld:'OMOPENOM',pic:''}]}");
      setEventMetadata("VALID_OMMCLIN","{handler:'valid_Ommclin',iparms:[]");
      setEventMetadata("VALID_OMMCLIN",",oparms:[]}");
      setEventMetadata("VALID_OMMCEST","{handler:'valid_Ommcest',iparms:[]");
      setEventMetadata("VALID_OMMCEST",",oparms:[]}");
      setEventMetadata("VALID_OMMCINI","{handler:'valid_Ommcini',iparms:[]");
      setEventMetadata("VALID_OMMCINI",",oparms:[]}");
      setEventMetadata("VALID_OMMCFIN","{handler:'valid_Ommcfin',iparms:[]");
      setEventMetadata("VALID_OMMCFIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Ommctie',iparms:[]");
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
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV20EmprCod = "" ;
      wcpOAV22OMMTpo = "" ;
      Z396EmprCod = "" ;
      Z9458OMMTpo = "" ;
      Z9461OMMCCnt = DecimalUtil.ZERO ;
      Z9467OMMCEst = "" ;
      Z9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      Z9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV20EmprCod = "" ;
      AV22OMMTpo = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A9456OMOpeNom = "" ;
      A9458OMMTpo = "" ;
      A9461OMMCCnt = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1235 = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1234 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A9467OMMCEst = "" ;
      A9468OMMCIni = GXutil.resetTime( GXutil.nullDate() );
      A9469OMMCFin = GXutil.resetTime( GXutil.nullDate() );
      A9470OMMCTie = DecimalUtil.ZERO ;
      AV12Station = "" ;
      AV26ObtenerEmprCod = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV23WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV25WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z9456OMOpeNom = "" ;
      T013T6_A407EmprNom = new String[] {""} ;
      T013T6_n407EmprNom = new boolean[] {false} ;
      T013T7_A9456OMOpeNom = new String[] {""} ;
      T013T7_n9456OMOpeNom = new boolean[] {false} ;
      T013T9_A9458OMMTpo = new String[] {""} ;
      T013T9_A407EmprNom = new String[] {""} ;
      T013T9_n407EmprNom = new boolean[] {false} ;
      T013T9_A9456OMOpeNom = new String[] {""} ;
      T013T9_n9456OMOpeNom = new boolean[] {false} ;
      T013T9_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013T9_A9465OMMCUlt = new short[1] ;
      T013T9_n9465OMMCUlt = new boolean[] {false} ;
      T013T9_A396EmprCod = new String[] {""} ;
      T013T9_A9455OMOpeCod = new int[1] ;
      T013T9_A9425OMCod = new int[1] ;
      T013T8_A396EmprCod = new String[] {""} ;
      T013T10_A407EmprNom = new String[] {""} ;
      T013T10_n407EmprNom = new boolean[] {false} ;
      T013T11_A396EmprCod = new String[] {""} ;
      T013T12_A9456OMOpeNom = new String[] {""} ;
      T013T12_n9456OMOpeNom = new boolean[] {false} ;
      T013T13_A396EmprCod = new String[] {""} ;
      T013T13_A9425OMCod = new int[1] ;
      T013T13_A9455OMOpeCod = new int[1] ;
      T013T13_A9458OMMTpo = new String[] {""} ;
      T013T5_A9458OMMTpo = new String[] {""} ;
      T013T5_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013T5_A9465OMMCUlt = new short[1] ;
      T013T5_n9465OMMCUlt = new boolean[] {false} ;
      T013T5_A396EmprCod = new String[] {""} ;
      T013T5_A9455OMOpeCod = new int[1] ;
      T013T5_A9425OMCod = new int[1] ;
      T013T14_A396EmprCod = new String[] {""} ;
      T013T14_A9425OMCod = new int[1] ;
      T013T14_A9455OMOpeCod = new int[1] ;
      T013T14_A9458OMMTpo = new String[] {""} ;
      T013T15_A396EmprCod = new String[] {""} ;
      T013T15_A9425OMCod = new int[1] ;
      T013T15_A9455OMOpeCod = new int[1] ;
      T013T15_A9458OMMTpo = new String[] {""} ;
      T013T4_A9458OMMTpo = new String[] {""} ;
      T013T4_A9461OMMCCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013T4_A9465OMMCUlt = new short[1] ;
      T013T4_n9465OMMCUlt = new boolean[] {false} ;
      T013T4_A396EmprCod = new String[] {""} ;
      T013T4_A9455OMOpeCod = new int[1] ;
      T013T4_A9425OMCod = new int[1] ;
      T013T19_A407EmprNom = new String[] {""} ;
      T013T19_n407EmprNom = new boolean[] {false} ;
      T013T20_A9456OMOpeNom = new String[] {""} ;
      T013T20_n9456OMOpeNom = new boolean[] {false} ;
      T013T21_A396EmprCod = new String[] {""} ;
      T013T21_A9425OMCod = new int[1] ;
      T013T21_A9455OMOpeCod = new int[1] ;
      T013T21_A9458OMMTpo = new String[] {""} ;
      T013T22_A9425OMCod = new int[1] ;
      T013T22_A9455OMOpeCod = new int[1] ;
      T013T22_A9458OMMTpo = new String[] {""} ;
      T013T22_A9466OMMCLin = new short[1] ;
      T013T22_A9467OMMCEst = new String[] {""} ;
      T013T22_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      T013T22_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      T013T22_A396EmprCod = new String[] {""} ;
      T013T23_A396EmprCod = new String[] {""} ;
      T013T23_A9425OMCod = new int[1] ;
      T013T23_A9455OMOpeCod = new int[1] ;
      T013T23_A9458OMMTpo = new String[] {""} ;
      T013T23_A9466OMMCLin = new short[1] ;
      T013T3_A9425OMCod = new int[1] ;
      T013T3_A9455OMOpeCod = new int[1] ;
      T013T3_A9458OMMTpo = new String[] {""} ;
      T013T3_A9466OMMCLin = new short[1] ;
      T013T3_A9467OMMCEst = new String[] {""} ;
      T013T3_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      T013T3_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      T013T3_A396EmprCod = new String[] {""} ;
      T013T2_A9425OMCod = new int[1] ;
      T013T2_A9455OMOpeCod = new int[1] ;
      T013T2_A9458OMMTpo = new String[] {""} ;
      T013T2_A9466OMMCLin = new short[1] ;
      T013T2_A9467OMMCEst = new String[] {""} ;
      T013T2_A9468OMMCIni = new java.util.Date[] {GXutil.nullDate()} ;
      T013T2_A9469OMMCFin = new java.util.Date[] {GXutil.nullDate()} ;
      T013T2_A396EmprCod = new String[] {""} ;
      T013T27_A396EmprCod = new String[] {""} ;
      T013T27_A9425OMCod = new int[1] ;
      T013T27_A9455OMOpeCod = new int[1] ;
      T013T27_A9458OMMTpo = new String[] {""} ;
      T013T27_A9466OMMCLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      T013T28_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmordco__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmordco__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmordco__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordco__default(),
         new Object[] {
             new Object[] {
            T013T2_A9425OMCod, T013T2_A9455OMOpeCod, T013T2_A9458OMMTpo, T013T2_A9466OMMCLin, T013T2_A9467OMMCEst, T013T2_A9468OMMCIni, T013T2_A9469OMMCFin, T013T2_A396EmprCod
            }
            , new Object[] {
            T013T3_A9425OMCod, T013T3_A9455OMOpeCod, T013T3_A9458OMMTpo, T013T3_A9466OMMCLin, T013T3_A9467OMMCEst, T013T3_A9468OMMCIni, T013T3_A9469OMMCFin, T013T3_A396EmprCod
            }
            , new Object[] {
            T013T4_A9458OMMTpo, T013T4_A9461OMMCCnt, T013T4_A9465OMMCUlt, T013T4_n9465OMMCUlt, T013T4_A396EmprCod, T013T4_A9455OMOpeCod, T013T4_A9425OMCod
            }
            , new Object[] {
            T013T5_A9458OMMTpo, T013T5_A9461OMMCCnt, T013T5_A9465OMMCUlt, T013T5_n9465OMMCUlt, T013T5_A396EmprCod, T013T5_A9455OMOpeCod, T013T5_A9425OMCod
            }
            , new Object[] {
            T013T6_A407EmprNom, T013T6_n407EmprNom
            }
            , new Object[] {
            T013T7_A9456OMOpeNom, T013T7_n9456OMOpeNom
            }
            , new Object[] {
            T013T8_A396EmprCod
            }
            , new Object[] {
            T013T9_A9458OMMTpo, T013T9_A407EmprNom, T013T9_n407EmprNom, T013T9_A9456OMOpeNom, T013T9_n9456OMOpeNom, T013T9_A9461OMMCCnt, T013T9_A9465OMMCUlt, T013T9_n9465OMMCUlt, T013T9_A396EmprCod, T013T9_A9455OMOpeCod,
            T013T9_A9425OMCod
            }
            , new Object[] {
            T013T10_A407EmprNom, T013T10_n407EmprNom
            }
            , new Object[] {
            T013T11_A396EmprCod
            }
            , new Object[] {
            T013T12_A9456OMOpeNom, T013T12_n9456OMOpeNom
            }
            , new Object[] {
            T013T13_A396EmprCod, T013T13_A9425OMCod, T013T13_A9455OMOpeCod, T013T13_A9458OMMTpo
            }
            , new Object[] {
            T013T14_A396EmprCod, T013T14_A9425OMCod, T013T14_A9455OMOpeCod, T013T14_A9458OMMTpo
            }
            , new Object[] {
            T013T15_A396EmprCod, T013T15_A9425OMCod, T013T15_A9455OMOpeCod, T013T15_A9458OMMTpo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013T19_A407EmprNom, T013T19_n407EmprNom
            }
            , new Object[] {
            T013T20_A9456OMOpeNom, T013T20_n9456OMOpeNom
            }
            , new Object[] {
            T013T21_A396EmprCod, T013T21_A9425OMCod, T013T21_A9455OMOpeCod, T013T21_A9458OMMTpo
            }
            , new Object[] {
            T013T22_A9425OMCod, T013T22_A9455OMOpeCod, T013T22_A9458OMMTpo, T013T22_A9466OMMCLin, T013T22_A9467OMMCEst, T013T22_A9468OMMCIni, T013T22_A9469OMMCFin, T013T22_A396EmprCod
            }
            , new Object[] {
            T013T23_A396EmprCod, T013T23_A9425OMCod, T013T23_A9455OMOpeCod, T013T23_A9458OMMTpo, T013T23_A9466OMMCLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013T27_A396EmprCod, T013T27_A9425OMCod, T013T27_A9455OMOpeCod, T013T27_A9458OMMTpo, T013T27_A9466OMMCLin
            }
            , new Object[] {
            T013T28_A396EmprCod
            }
         }
      );
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
   private short Z9465OMMCUlt ;
   private short Z9466OMMCLin ;
   private short nRcdDeleted_1235 ;
   private short nRcdExists_1235 ;
   private short nIsMod_1235 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A9465OMMCUlt ;
   private short nBlankRcdCount1235 ;
   private short RcdFound1235 ;
   private short nBlankRcdUsr1235 ;
   private short RcdFound1234 ;
   private short A9466OMMCLin ;
   private short nIsDirty_1234 ;
   private short nIsDirty_1235 ;
   private int wcpOAV14OMCod ;
   private int wcpOAV21OMOpeCod ;
   private int Z9425OMCod ;
   private int Z9455OMOpeCod ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int A9425OMCod ;
   private int A9455OMOpeCod ;
   private int AV14OMCod ;
   private int AV21OMOpeCod ;
   private int trnEnded ;
   private int edtOMCod_Enabled ;
   private int edtOMOpeCod_Enabled ;
   private int edtOMOpeNom_Enabled ;
   private int edtOMMTpo_Enabled ;
   private int edtOMMCCnt_Enabled ;
   private int edtOMMCUlt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtOMMCLin_Enabled ;
   private int edtOMMCIni_Enabled ;
   private int edtOMMCFin_Enabled ;
   private int edtOMMCTie_Enabled ;
   private int fRowAdded ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtOMMCLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z9461OMMCCnt ;
   private java.math.BigDecimal A9461OMMCCnt ;
   private java.math.BigDecimal A9470OMMCTie ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV20EmprCod ;
   private String wcpOAV22OMMTpo ;
   private String Z396EmprCod ;
   private String Z9458OMMTpo ;
   private String Z9467OMMCEst ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV20EmprCod ;
   private String AV22OMMTpo ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtOMCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtOMOpeCod_Internalname ;
   private String edtOMOpeCod_Jsonclick ;
   private String edtOMOpeNom_Internalname ;
   private String A9456OMOpeNom ;
   private String edtOMOpeNom_Jsonclick ;
   private String edtOMMTpo_Internalname ;
   private String A9458OMMTpo ;
   private String edtOMMTpo_Jsonclick ;
   private String edtOMMCCnt_Internalname ;
   private String edtOMMCCnt_Jsonclick ;
   private String edtOMMCUlt_Internalname ;
   private String edtOMMCUlt_Jsonclick ;
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
   private String sMode1235 ;
   private String edtOMMCLin_Internalname ;
   private String edtOMMCIni_Internalname ;
   private String edtOMMCFin_Internalname ;
   private String edtOMMCTie_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1234 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A9467OMMCEst ;
   private String AV12Station ;
   private String AV26ObtenerEmprCod ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z9456OMOpeNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtOMMCLin_Jsonclick ;
   private String edtOMMCIni_Jsonclick ;
   private String edtOMMCFin_Jsonclick ;
   private String edtOMMCTie_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private java.util.Date Z9468OMMCIni ;
   private java.util.Date Z9469OMMCFin ;
   private java.util.Date A9468OMMCIni ;
   private java.util.Date A9469OMMCFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n9456OMOpeNom ;
   private boolean n9465OMMCUlt ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV25WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbOMMCEst ;
   private IDataStoreProvider pr_default ;
   private String[] T013T6_A407EmprNom ;
   private boolean[] T013T6_n407EmprNom ;
   private String[] T013T7_A9456OMOpeNom ;
   private boolean[] T013T7_n9456OMOpeNom ;
   private String[] T013T9_A9458OMMTpo ;
   private String[] T013T9_A407EmprNom ;
   private boolean[] T013T9_n407EmprNom ;
   private String[] T013T9_A9456OMOpeNom ;
   private boolean[] T013T9_n9456OMOpeNom ;
   private java.math.BigDecimal[] T013T9_A9461OMMCCnt ;
   private short[] T013T9_A9465OMMCUlt ;
   private boolean[] T013T9_n9465OMMCUlt ;
   private String[] T013T9_A396EmprCod ;
   private int[] T013T9_A9455OMOpeCod ;
   private int[] T013T9_A9425OMCod ;
   private String[] T013T8_A396EmprCod ;
   private String[] T013T10_A407EmprNom ;
   private boolean[] T013T10_n407EmprNom ;
   private String[] T013T11_A396EmprCod ;
   private String[] T013T12_A9456OMOpeNom ;
   private boolean[] T013T12_n9456OMOpeNom ;
   private String[] T013T13_A396EmprCod ;
   private int[] T013T13_A9425OMCod ;
   private int[] T013T13_A9455OMOpeCod ;
   private String[] T013T13_A9458OMMTpo ;
   private String[] T013T5_A9458OMMTpo ;
   private java.math.BigDecimal[] T013T5_A9461OMMCCnt ;
   private short[] T013T5_A9465OMMCUlt ;
   private boolean[] T013T5_n9465OMMCUlt ;
   private String[] T013T5_A396EmprCod ;
   private int[] T013T5_A9455OMOpeCod ;
   private int[] T013T5_A9425OMCod ;
   private String[] T013T14_A396EmprCod ;
   private int[] T013T14_A9425OMCod ;
   private int[] T013T14_A9455OMOpeCod ;
   private String[] T013T14_A9458OMMTpo ;
   private String[] T013T15_A396EmprCod ;
   private int[] T013T15_A9425OMCod ;
   private int[] T013T15_A9455OMOpeCod ;
   private String[] T013T15_A9458OMMTpo ;
   private String[] T013T4_A9458OMMTpo ;
   private java.math.BigDecimal[] T013T4_A9461OMMCCnt ;
   private short[] T013T4_A9465OMMCUlt ;
   private boolean[] T013T4_n9465OMMCUlt ;
   private String[] T013T4_A396EmprCod ;
   private int[] T013T4_A9455OMOpeCod ;
   private int[] T013T4_A9425OMCod ;
   private String[] T013T19_A407EmprNom ;
   private boolean[] T013T19_n407EmprNom ;
   private String[] T013T20_A9456OMOpeNom ;
   private boolean[] T013T20_n9456OMOpeNom ;
   private String[] T013T21_A396EmprCod ;
   private int[] T013T21_A9425OMCod ;
   private int[] T013T21_A9455OMOpeCod ;
   private String[] T013T21_A9458OMMTpo ;
   private int[] T013T22_A9425OMCod ;
   private int[] T013T22_A9455OMOpeCod ;
   private String[] T013T22_A9458OMMTpo ;
   private short[] T013T22_A9466OMMCLin ;
   private String[] T013T22_A9467OMMCEst ;
   private java.util.Date[] T013T22_A9468OMMCIni ;
   private java.util.Date[] T013T22_A9469OMMCFin ;
   private String[] T013T22_A396EmprCod ;
   private String[] T013T23_A396EmprCod ;
   private int[] T013T23_A9425OMCod ;
   private int[] T013T23_A9455OMOpeCod ;
   private String[] T013T23_A9458OMMTpo ;
   private short[] T013T23_A9466OMMCLin ;
   private int[] T013T3_A9425OMCod ;
   private int[] T013T3_A9455OMOpeCod ;
   private String[] T013T3_A9458OMMTpo ;
   private short[] T013T3_A9466OMMCLin ;
   private String[] T013T3_A9467OMMCEst ;
   private java.util.Date[] T013T3_A9468OMMCIni ;
   private java.util.Date[] T013T3_A9469OMMCFin ;
   private String[] T013T3_A396EmprCod ;
   private int[] T013T2_A9425OMCod ;
   private int[] T013T2_A9455OMOpeCod ;
   private String[] T013T2_A9458OMMTpo ;
   private short[] T013T2_A9466OMMCLin ;
   private String[] T013T2_A9467OMMCEst ;
   private java.util.Date[] T013T2_A9468OMMCIni ;
   private java.util.Date[] T013T2_A9469OMMCFin ;
   private String[] T013T2_A396EmprCod ;
   private String[] T013T27_A396EmprCod ;
   private int[] T013T27_A9425OMCod ;
   private int[] T013T27_A9455OMOpeCod ;
   private String[] T013T27_A9458OMMTpo ;
   private short[] T013T27_A9466OMMCLin ;
   private String[] T013T28_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV23WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV24TrnContext ;
}

final  class tmordco__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordco__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordco__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmordco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013T2", "SELECT OMCod, OMOpeCod, OMMTpo, OMMCLin, OMMCEst, OMMCIni, OMMCFin, EmprCod FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? AND OMMCLin = ?  FOR UPDATE OF OMMCEst, OMMCIni, OMMCFin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T3", "SELECT OMCod, OMOpeCod, OMMTpo, OMMCLin, OMMCEst, OMMCIni, OMMCFin, EmprCod FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? AND OMMCLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T4", "SELECT OMMTpo, OMMCCnt, OMMCUlt, EmprCod, OMOpeCod, OMCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?  FOR UPDATE OF OMMCCnt, OMMCUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T5", "SELECT OMMTpo, OMMCCnt, OMMCUlt, EmprCod, OMOpeCod, OMCod FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T7", "SELECT OpeNom AS OMOpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T8", "SELECT EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T9", "SELECT /*+ FIRST_ROWS(100) */ TM1.OMMTpo, T2.EmprNom, T3.OpeNom AS OMOpeNom, TM1.OMMCCnt, TM1.OMMCUlt, TM1.EmprCod, TM1.OMOpeCod AS OMOpeCod, TM1.OMCod FROM ((TXPMOrMO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OMOpeCod) WHERE TM1.EmprCod = ? and TM1.OMCod = ? and TM1.OMOpeCod = ? and TM1.OMMTpo = ? ORDER BY TM1.EmprCod, TM1.OMCod, TM1.OMOpeCod, TM1.OMMTpo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T11", "SELECT EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T12", "SELECT OpeNom AS OMOpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE ( EmprCod > ? or EmprCod = ? and OMCod > ? or OMCod = ? and EmprCod = ? and OMOpeCod > ? or OMOpeCod = ? and OMCod = ? and EmprCod = ? and OMMTpo > ?) ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013T15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO WHERE ( EmprCod < ? or EmprCod = ? and OMCod < ? or OMCod = ? and EmprCod = ? and OMOpeCod < ? or OMOpeCod = ? and OMCod = ? and EmprCod = ? and OMMTpo < ?) ORDER BY EmprCod DESC, OMCod DESC, OMOpeCod DESC, OMMTpo DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013T16", "INSERT INTO TXPMOrMO(OMMTpo, OMMCCnt, OMMCUlt, EmprCod, OMOpeCod, OMCod, OMMRCnt, OMMRPre, OMMCPre) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T013T17", "UPDATE TXPMOrMO SET OMMCCnt=?, OMMCUlt=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new UpdateCursor("T013T18", "DELETE FROM TXPMOrMO  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ?", GX_NOMASK, "TXPMOrMO")
         ,new ForEachCursor("T013T19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T20", "SELECT OpeNom AS OMOpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OMCod, OMOpeCod, OMMTpo FROM TXPMOrMO ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T22", "SELECT OMCod, OMOpeCod, OMMTpo, OMMCLin, OMMCEst, OMMCIni, OMMCFin, EmprCod FROM TXPMOrMCo WHERE EmprCod = ? and OMCod = ? and OMOpeCod = ? and OMMTpo = ? and OMMCLin = ? ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T23", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? AND OMMCLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013T24", "INSERT INTO TXPMOrMCo(OMCod, OMOpeCod, OMMTpo, OMMCLin, OMMCEst, OMMCIni, OMMCFin, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMOrMCo")
         ,new UpdateCursor("T013T25", "UPDATE TXPMOrMCo SET OMMCEst=?, OMMCIni=?, OMMCFin=?  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? AND OMMCLin = ?", GX_NOMASK, "TXPMOrMCo")
         ,new UpdateCursor("T013T26", "DELETE FROM TXPMOrMCo  WHERE EmprCod = ? AND OMCod = ? AND OMOpeCod = ? AND OMMTpo = ? AND OMMCLin = ?", GX_NOMASK, "TXPMOrMCo")
         ,new ForEachCursor("T013T27", "SELECT EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin FROM TXPMOrMCo WHERE EmprCod = ? and OMCod = ? and OMOpeCod = ? and OMMTpo = ? ORDER BY EmprCod, OMCod, OMOpeCod, OMMTpo, OMMCLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013T28", "SELECT EmprCod FROM TXPMORDEN WHERE EmprCod = ? AND OMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setInt(6, ((Number) parms[6]).intValue());
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setString(8, (String)parms[7], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

