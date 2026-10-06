package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclapen_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"SELLOID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdlaselloidJZ655( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"CLASCOD") == 0 )
      {
         AV40ClasCod = (short)(GXutil.lval( httpContext.GetPar( "ClasCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ClasCod), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLASCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40ClasCod), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asaclascodJZ655( AV40ClasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"CLASCOD") == 0 )
      {
         A4295ClasCod = (short)(GXutil.lval( httpContext.GetPar( "ClasCod"))) ;
         n4295ClasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         AV41autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asaclascodJZ655( A4295ClasCod, AV41autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa11517JZ655( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa12345JZ655( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_23") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8339Tp_Cod = (byte)(GXutil.lval( httpContext.GetPar( "Tp_Cod"))) ;
         n8339Tp_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8339Tp_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8339Tp_Cod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_23( A396EmprCod, A8339Tp_Cod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12345SelloID = (short)(GXutil.lval( httpContext.GetPar( "SelloID"))) ;
         n12345SelloID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12345SelloID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12345SelloID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A12345SelloID) ;
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
            AV40ClasCod = (short)(GXutil.lval( httpContext.GetPar( "ClasCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40ClasCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLASCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40ClasCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tipos de Familias", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtClasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tclapen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclapen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclapen_impl.class ));
   }

   public tclapen_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynSelloID = new HTMLChoice();
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
      if ( dynSelloID.getItemCount() > 0 )
      {
         A12345SelloID = (short)(GXutil.lval( dynSelloID.getValidValue(GXutil.trim( GXutil.str( A12345SelloID, 4, 0))))) ;
         n12345SelloID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12345SelloID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12345SelloID), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynSelloID.setValue( GXutil.trim( GXutil.str( A12345SelloID, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynSelloID.getInternalname(), "Values", dynSelloID.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtClasCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtClasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4295ClasCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtClasCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TCLAPEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtClasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtClasDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtClasDsc_Internalname, GXutil.rtrim( A4296ClasDsc), GXutil.rtrim( localUtil.format( A4296ClasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtClasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtClasDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TCLAPEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTp_por_cell_Internalname, 1, 0, "px", 0, "px", divTp_por_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtTp_Por_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTp_Por_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTp_Por_Internalname, httpContext.getMessage( "Aumentar o disminuir (%)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTp_Por_Internalname, GXutil.ltrim( localUtil.ntoc( A11517Tp_Por, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTp_Por_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11517Tp_Por), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11517Tp_Por), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTp_Por_Jsonclick, 0, "AttributeFL", "", "", "", "", edtTp_Por_Visible, edtTp_Por_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TCLAPEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSelloid_cell_Internalname, 1, 0, "px", 0, "px", divSelloid_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", dynSelloID.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynSelloID.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynSelloID.getInternalname(), httpContext.getMessage( "Sello ID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynSelloID, dynSelloID.getInternalname(), GXutil.trim( GXutil.str( A12345SelloID, 4, 0)), 1, dynSelloID.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", dynSelloID.getVisible(), dynSelloID.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "", true, (byte)(0), "HLP_FicherosBasicos\\TCLAPEN.htm");
      dynSelloID.setValue( GXutil.trim( GXutil.str( A12345SelloID, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynSelloID.getInternalname(), "Values", dynSelloID.ToJavascriptSource(), true);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCLAPEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCLAPEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCLAPEN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV42Pgmname), GXutil.rtrim( localUtil.format( AV42Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TCLAPEN.htm");
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
      e11JZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4295ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z4295ClasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4296ClasDsc = httpContext.cgiGet( "Z4296ClasDsc") ;
            Z2325CodErpX = httpContext.cgiGet( "Z2325CodErpX") ;
            Z11517Tp_Por = (short)(localUtil.ctol( httpContext.cgiGet( "Z11517Tp_Por"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8339Tp_Cod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8339Tp_Cod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12345SelloID = (short)(localUtil.ctol( httpContext.cgiGet( "Z12345SelloID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2325CodErpX = httpContext.cgiGet( "Z2325CodErpX") ;
            n2325CodErpX = false ;
            A8339Tp_Cod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8339Tp_Cod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8339Tp_Cod = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N8339Tp_Cod = (byte)(localUtil.ctol( httpContext.cgiGet( "N8339Tp_Cod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N12345SelloID = (short)(localUtil.ctol( httpContext.cgiGet( "N12345SelloID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13804ClasDscID = httpContext.cgiGet( "CLASDSCID") ;
            AV26EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV40ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( "vCLASCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Insert_Tp_Cod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TP_COD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8339Tp_Cod = (byte)(localUtil.ctol( httpContext.cgiGet( "TP_COD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38Insert_SelloID = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_SELLOID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2325CodErpX = httpContext.cgiGet( "CODERPX") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A8340Tp_Dsc = httpContext.cgiGet( "TP_DSC") ;
            n8340Tp_Dsc = false ;
            A12344SelloDc = httpContext.cgiGet( "SELLODC") ;
            n12344SelloDc = false ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtClasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4295ClasCod = (short)(0) ;
               n4295ClasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
            }
            else
            {
               A4295ClasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtClasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4295ClasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
            }
            A4296ClasDsc = httpContext.cgiGet( edtClasDsc_Internalname) ;
            n4296ClasDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTp_Por_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -99 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTp_Por_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TP_POR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTp_Por_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11517Tp_Por = (short)(0) ;
               n11517Tp_Por = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11517Tp_Por", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11517Tp_Por), 3, 0));
            }
            else
            {
               A11517Tp_Por = (short)(localUtil.ctol( httpContext.cgiGet( edtTp_Por_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11517Tp_Por = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11517Tp_Por", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11517Tp_Por), 3, 0));
            }
            dynSelloID.setValue( httpContext.cgiGet( dynSelloID.getInternalname()) );
            A12345SelloID = (short)(GXutil.lval( httpContext.cgiGet( dynSelloID.getInternalname()))) ;
            n12345SelloID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12345SelloID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12345SelloID), 4, 0));
            AV42Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCLAPEN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV42Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV42Pgmname, "")));
            forbiddenHiddens.add("CodErpX", GXutil.rtrim( localUtil.format( A2325CodErpX, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A4295ClasCod != Z4295ClasCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tclapen:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A4295ClasCod = (short)(GXutil.lval( httpContext.GetPar( "ClasCod"))) ;
               n4295ClasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
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
                  sMode655 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode655 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound655 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_JZ0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CLASCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtClasCod_Internalname ;
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
                        e11JZ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12JZ2 ();
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
         e12JZ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllJZ655( ) ;
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
         disableAttributesJZ655( ) ;
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

   public void confirm_JZ0( )
   {
      beforeValidateJZ655( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsJZ655( ) ;
         }
         else
         {
            checkExtendedTableJZ655( ) ;
            closeExtendedTableCursorsJZ655( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionJZ0( )
   {
   }

   public void e11JZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tclapen_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclapen_impl.this.A396EmprCod = GXv_char2[0] ;
      tclapen_impl.this.AV25EmprNom = GXv_char3[0] ;
      tclapen_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      GXt_int5 = (byte)(AV41autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
      AV41autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41autonumber), 4, 0));
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tclapen_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char4[0] = AV26EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char2[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      tclapen_impl.this.AV26EmprCod = GXv_char4[0] ;
      tclapen_impl.this.AV25EmprNom = GXv_char3[0] ;
      tclapen_impl.this.AV21UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      GXv_SdtWWPContext7[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV34WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
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
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV35TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV42Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV43GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GXV1), 8, 0));
         while ( AV43GXV1 <= AV35TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV39TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV35TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV43GXV1));
            if ( GXutil.strcmp(AV39TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "Tp_Cod") == 0 )
            {
               AV37Insert_Tp_Cod = (byte)(GXutil.lval( AV39TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37Insert_Tp_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Insert_Tp_Cod), 2, 0));
            }
            else if ( GXutil.strcmp(AV39TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "SelloID") == 0 )
            {
               AV38Insert_SelloID = (short)(GXutil.lval( AV39TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38Insert_SelloID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Insert_SelloID), 4, 0));
            }
            AV43GXV1 = (int)(AV43GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GXV1), 8, 0));
         }
      }
   }

   public void e12JZ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV35TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.tclapenww", new String[] {}, new String[] {}) );
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
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divTp_por_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divTp_por_cell_Internalname, "Class", divTp_por_cell_Class, true);
      divSelloid_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divSelloid_cell_Internalname, "Class", divSelloid_cell_Class, true);
   }

   public void zmJZ655( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4296ClasDsc = T00JZ3_A4296ClasDsc[0] ;
            Z2325CodErpX = T00JZ3_A2325CodErpX[0] ;
            Z11517Tp_Por = T00JZ3_A11517Tp_Por[0] ;
            Z8339Tp_Cod = T00JZ3_A8339Tp_Cod[0] ;
            Z12345SelloID = T00JZ3_A12345SelloID[0] ;
         }
         else
         {
            Z4296ClasDsc = A4296ClasDsc ;
            Z2325CodErpX = A2325CodErpX ;
            Z11517Tp_Por = A11517Tp_Por ;
            Z8339Tp_Cod = A8339Tp_Cod ;
            Z12345SelloID = A12345SelloID ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z4295ClasCod = A4295ClasCod ;
         Z4296ClasDsc = A4296ClasDsc ;
         Z2325CodErpX = A2325CodErpX ;
         Z11517Tp_Por = A11517Tp_Por ;
         Z396EmprCod = A396EmprCod ;
         Z8339Tp_Cod = A8339Tp_Cod ;
         Z12345SelloID = A12345SelloID ;
         Z407EmprNom = A407EmprNom ;
         Z8340Tp_Dsc = A8340Tp_Dsc ;
         Z12344SelloDc = A12344SelloDc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV42Pgmname = "FicherosBasicos.TCLAPEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Pgmname", AV42Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV26EmprCod)==0) )
      {
         A396EmprCod = AV26EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00JZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00JZ4_A407EmprNom[0] ;
      n407EmprNom = T00JZ4_n407EmprNom[0] ;
      pr_default.close(2);
      gxaselloid_htmlJZ655( A396EmprCod) ;
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int6) ;
      tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
      edtTp_Por_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTp_Por_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTp_Por_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int6) ;
      tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divTp_por_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divTp_por_cell_Internalname, "Class", divTp_por_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int6) ;
         tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divTp_por_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divTp_por_cell_Internalname, "Class", divTp_por_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int6) ;
      tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
      dynSelloID.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, dynSelloID.getInternalname(), "Visible", GXutil.ltrimstr( dynSelloID.getVisible(), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int6) ;
      tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divSelloid_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divSelloid_cell_Internalname, "Class", divSelloid_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int6) ;
         tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divSelloid_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divSelloid_cell_Internalname, "Class", divSelloid_cell_Class, true);
         }
      }
      if ( ! (0==AV40ClasCod) )
      {
         A4295ClasCod = AV40ClasCod ;
         n4295ClasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      }
      if ( ! (0==AV40ClasCod) )
      {
         edtClasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtClasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV40ClasCod) )
      {
         edtClasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV38Insert_SelloID) )
      {
         dynSelloID.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynSelloID.getInternalname(), "Enabled", GXutil.ltrimstr( dynSelloID.getEnabled(), 5, 0), true);
      }
      else
      {
         dynSelloID.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynSelloID.getInternalname(), "Enabled", GXutil.ltrimstr( dynSelloID.getEnabled(), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV38Insert_SelloID) )
      {
         A12345SelloID = AV38Insert_SelloID ;
         n12345SelloID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12345SelloID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12345SelloID), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV37Insert_Tp_Cod) )
      {
         A8339Tp_Cod = AV37Insert_Tp_Cod ;
         n8339Tp_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8339Tp_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8339Tp_Cod), 2, 0));
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
         /* Using cursor T00JZ6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n12345SelloID), Short.valueOf(A12345SelloID)});
         A12344SelloDc = T00JZ6_A12344SelloDc[0] ;
         n12344SelloDc = T00JZ6_n12344SelloDc[0] ;
         pr_default.close(4);
         /* Using cursor T00JZ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n8339Tp_Cod), Byte.valueOf(A8339Tp_Cod)});
         A8340Tp_Dsc = T00JZ5_A8340Tp_Dsc[0] ;
         n8340Tp_Dsc = T00JZ5_n8340Tp_Dsc[0] ;
         pr_default.close(3);
      }
   }

   public void loadJZ655( )
   {
      /* Using cursor T00JZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound655 = (short)(1) ;
         A407EmprNom = T00JZ7_A407EmprNom[0] ;
         n407EmprNom = T00JZ7_n407EmprNom[0] ;
         A4296ClasDsc = T00JZ7_A4296ClasDsc[0] ;
         n4296ClasDsc = T00JZ7_n4296ClasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
         A8340Tp_Dsc = T00JZ7_A8340Tp_Dsc[0] ;
         n8340Tp_Dsc = T00JZ7_n8340Tp_Dsc[0] ;
         A2325CodErpX = T00JZ7_A2325CodErpX[0] ;
         n2325CodErpX = T00JZ7_n2325CodErpX[0] ;
         A11517Tp_Por = T00JZ7_A11517Tp_Por[0] ;
         n11517Tp_Por = T00JZ7_n11517Tp_Por[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11517Tp_Por", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11517Tp_Por), 3, 0));
         A12344SelloDc = T00JZ7_A12344SelloDc[0] ;
         n12344SelloDc = T00JZ7_n12344SelloDc[0] ;
         A8339Tp_Cod = T00JZ7_A8339Tp_Cod[0] ;
         n8339Tp_Cod = T00JZ7_n8339Tp_Cod[0] ;
         A12345SelloID = T00JZ7_A12345SelloID[0] ;
         n12345SelloID = T00JZ7_n12345SelloID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12345SelloID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12345SelloID), 4, 0));
         zmJZ655( -21) ;
      }
      pr_default.close(5);
      onLoadActionsJZ655( ) ;
   }

   public void onLoadActionsJZ655( )
   {
      A13804ClasDscID = GXutil.trim( GXutil.str( A4295ClasCod, 4, 0)) + "-" + GXutil.trim( A4296ClasDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13804ClasDscID", A13804ClasDscID);
   }

   public void checkExtendedTableJZ655( )
   {
      nIsDirty_655 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_655 = (short)(1) ;
      A13804ClasDscID = GXutil.trim( GXutil.str( A4295ClasCod, 4, 0)) + "-" + GXutil.trim( A4296ClasDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13804ClasDscID", A13804ClasDscID);
      /* Using cursor T00JZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n8339Tp_Cod), Byte.valueOf(A8339Tp_Cod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A8339Tp_Cod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TPPRDL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TP_COD");
            AnyError = (short)(1) ;
         }
      }
      A8340Tp_Dsc = T00JZ5_A8340Tp_Dsc[0] ;
      n8340Tp_Dsc = T00JZ5_n8340Tp_Dsc[0] ;
      pr_default.close(3);
      /* Using cursor T00JZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n12345SelloID), Short.valueOf(A12345SelloID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A12345SelloID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SELLO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SELLOID");
            AnyError = (short)(1) ;
            GX_FocusControl = dynSelloID.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A12344SelloDc = T00JZ6_A12344SelloDc[0] ;
      n12344SelloDc = T00JZ6_n12344SelloDc[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursorsJZ655( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_23( String A396EmprCod ,
                          byte A8339Tp_Cod )
   {
      /* Using cursor T00JZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n8339Tp_Cod), Byte.valueOf(A8339Tp_Cod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A8339Tp_Cod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TPPRDL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TP_COD");
            AnyError = (short)(1) ;
         }
      }
      A8340Tp_Dsc = T00JZ8_A8340Tp_Dsc[0] ;
      n8340Tp_Dsc = T00JZ8_n8340Tp_Dsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8340Tp_Dsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_24( String A396EmprCod ,
                          short A12345SelloID )
   {
      /* Using cursor T00JZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n12345SelloID), Short.valueOf(A12345SelloID)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A12345SelloID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SELLO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SELLOID");
            AnyError = (short)(1) ;
            GX_FocusControl = dynSelloID.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A12344SelloDc = T00JZ9_A12344SelloDc[0] ;
      n12344SelloDc = T00JZ9_n12344SelloDc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12344SelloDc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKeyJZ655( )
   {
      /* Using cursor T00JZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound655 = (short)(1) ;
      }
      else
      {
         RcdFound655 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00JZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00JZ3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmJZ655( 21) ;
         RcdFound655 = (short)(1) ;
         A4295ClasCod = T00JZ3_A4295ClasCod[0] ;
         n4295ClasCod = T00JZ3_n4295ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         A4296ClasDsc = T00JZ3_A4296ClasDsc[0] ;
         n4296ClasDsc = T00JZ3_n4296ClasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
         A2325CodErpX = T00JZ3_A2325CodErpX[0] ;
         n2325CodErpX = T00JZ3_n2325CodErpX[0] ;
         A11517Tp_Por = T00JZ3_A11517Tp_Por[0] ;
         n11517Tp_Por = T00JZ3_n11517Tp_Por[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11517Tp_Por", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11517Tp_Por), 3, 0));
         A8339Tp_Cod = T00JZ3_A8339Tp_Cod[0] ;
         n8339Tp_Cod = T00JZ3_n8339Tp_Cod[0] ;
         A12345SelloID = T00JZ3_A12345SelloID[0] ;
         n12345SelloID = T00JZ3_n12345SelloID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12345SelloID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12345SelloID), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4295ClasCod = A4295ClasCod ;
         sMode655 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadJZ655( ) ;
         if ( AnyError == 1 )
         {
            RcdFound655 = (short)(0) ;
            initializeNonKeyJZ655( ) ;
         }
         Gx_mode = sMode655 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound655 = (short)(0) ;
         initializeNonKeyJZ655( ) ;
         sMode655 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode655 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyJZ655( ) ;
      if ( RcdFound655 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound655 = (short)(0) ;
      /* Using cursor T00JZ11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00JZ11_A4295ClasCod[0] < A4295ClasCod ) ) && ( GXutil.strcmp(T00JZ11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00JZ11_A4295ClasCod[0] > A4295ClasCod ) ) && ( GXutil.strcmp(T00JZ11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4295ClasCod = T00JZ11_A4295ClasCod[0] ;
            n4295ClasCod = T00JZ11_n4295ClasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
            RcdFound655 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound655 = (short)(0) ;
      /* Using cursor T00JZ12 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T00JZ12_A4295ClasCod[0] > A4295ClasCod ) ) && ( GXutil.strcmp(T00JZ12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T00JZ12_A4295ClasCod[0] < A4295ClasCod ) ) && ( GXutil.strcmp(T00JZ12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4295ClasCod = T00JZ12_A4295ClasCod[0] ;
            n4295ClasCod = T00JZ12_n4295ClasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
            RcdFound655 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyJZ655( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtClasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertJZ655( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound655 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4295ClasCod != Z4295ClasCod ) )
            {
               A4295ClasCod = Z4295ClasCod ;
               n4295ClasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtClasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtClasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateJZ655( ) ;
               GX_FocusControl = edtClasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4295ClasCod != Z4295ClasCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtClasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertJZ655( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLASCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtClasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtClasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertJZ655( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4295ClasCod != Z4295ClasCod ) )
      {
         A4295ClasCod = Z4295ClasCod ;
         n4295ClasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtClasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyJZ655( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00JZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLAPEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4296ClasDsc, T00JZ2_A4296ClasDsc[0]) != 0 ) || ( GXutil.strcmp(Z2325CodErpX, T00JZ2_A2325CodErpX[0]) != 0 ) || ( Z11517Tp_Por != T00JZ2_A11517Tp_Por[0] ) || ( Z8339Tp_Cod != T00JZ2_A8339Tp_Cod[0] ) || ( Z12345SelloID != T00JZ2_A12345SelloID[0] ) )
         {
            if ( GXutil.strcmp(Z4296ClasDsc, T00JZ2_A4296ClasDsc[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tclapen:[seudo value changed for attri]"+"ClasDsc");
               GXutil.writeLogRaw("Old: ",Z4296ClasDsc);
               GXutil.writeLogRaw("Current: ",T00JZ2_A4296ClasDsc[0]);
            }
            if ( GXutil.strcmp(Z2325CodErpX, T00JZ2_A2325CodErpX[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tclapen:[seudo value changed for attri]"+"CodErpX");
               GXutil.writeLogRaw("Old: ",Z2325CodErpX);
               GXutil.writeLogRaw("Current: ",T00JZ2_A2325CodErpX[0]);
            }
            if ( Z11517Tp_Por != T00JZ2_A11517Tp_Por[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tclapen:[seudo value changed for attri]"+"Tp_Por");
               GXutil.writeLogRaw("Old: ",Z11517Tp_Por);
               GXutil.writeLogRaw("Current: ",T00JZ2_A11517Tp_Por[0]);
            }
            if ( Z8339Tp_Cod != T00JZ2_A8339Tp_Cod[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tclapen:[seudo value changed for attri]"+"Tp_Cod");
               GXutil.writeLogRaw("Old: ",Z8339Tp_Cod);
               GXutil.writeLogRaw("Current: ",T00JZ2_A8339Tp_Cod[0]);
            }
            if ( Z12345SelloID != T00JZ2_A12345SelloID[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tclapen:[seudo value changed for attri]"+"SelloID");
               GXutil.writeLogRaw("Old: ",Z12345SelloID);
               GXutil.writeLogRaw("Current: ",T00JZ2_A12345SelloID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLAPEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertJZ655( )
   {
      beforeValidateJZ655( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableJZ655( ) ;
      }
      if ( AnyError == 0 )
      {
         zmJZ655( 0) ;
         checkOptimisticConcurrencyJZ655( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmJZ655( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertJZ655( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00JZ13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod), Boolean.valueOf(n4296ClasDsc), A4296ClasDsc, Boolean.valueOf(n2325CodErpX), A2325CodErpX, Boolean.valueOf(n11517Tp_Por), Short.valueOf(A11517Tp_Por), A396EmprCod, Boolean.valueOf(n8339Tp_Cod), Byte.valueOf(A8339Tp_Cod), Boolean.valueOf(n12345SelloID), Short.valueOf(A12345SelloID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLAPEN");
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
                        resetCaptionJZ0( ) ;
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
            loadJZ655( ) ;
         }
         endLevelJZ655( ) ;
      }
      closeExtendedTableCursorsJZ655( ) ;
   }

   public void updateJZ655( )
   {
      beforeValidateJZ655( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableJZ655( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyJZ655( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmJZ655( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateJZ655( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00JZ14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n4296ClasDsc), A4296ClasDsc, Boolean.valueOf(n2325CodErpX), A2325CodErpX, Boolean.valueOf(n11517Tp_Por), Short.valueOf(A11517Tp_Por), Boolean.valueOf(n8339Tp_Cod), Byte.valueOf(A8339Tp_Cod), Boolean.valueOf(n12345SelloID), Short.valueOf(A12345SelloID), A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLAPEN");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLAPEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateJZ655( ) ;
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
         endLevelJZ655( ) ;
      }
      closeExtendedTableCursorsJZ655( ) ;
   }

   public void deferredUpdateJZ655( )
   {
   }

   public void delete( )
   {
      beforeValidateJZ655( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyJZ655( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsJZ655( ) ;
         afterConfirmJZ655( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteJZ655( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00JZ15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLAPEN");
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
      sMode655 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelJZ655( ) ;
      Gx_mode = sMode655 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsJZ655( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13804ClasDscID = GXutil.trim( GXutil.str( A4295ClasCod, 4, 0)) + "-" + GXutil.trim( A4296ClasDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13804ClasDscID", A13804ClasDscID);
         /* Using cursor T00JZ16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n8339Tp_Cod), Byte.valueOf(A8339Tp_Cod)});
         A8340Tp_Dsc = T00JZ16_A8340Tp_Dsc[0] ;
         n8340Tp_Dsc = T00JZ16_n8340Tp_Dsc[0] ;
         pr_default.close(14);
         /* Using cursor T00JZ17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n12345SelloID), Short.valueOf(A12345SelloID)});
         A12344SelloDc = T00JZ17_A12344SelloDc[0] ;
         n12344SelloDc = T00JZ17_n12344SelloDc[0] ;
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00JZ18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRENDA mas TIPO ARTICULO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00JZ19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00JZ20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PVPNITp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00JZ21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00JZ22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFS1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00JZ23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00JZ24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n4295ClasCod), Short.valueOf(A4295ClasCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void endLevelJZ655( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteJZ655( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tclapen");
         if ( AnyError == 0 )
         {
            confirmValuesJZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tclapen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartJZ655( )
   {
      /* Scan By routine */
      /* Using cursor T00JZ25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      RcdFound655 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound655 = (short)(1) ;
         A4295ClasCod = T00JZ25_A4295ClasCod[0] ;
         n4295ClasCod = T00JZ25_n4295ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextJZ655( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound655 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound655 = (short)(1) ;
         A4295ClasCod = T00JZ25_A4295ClasCod[0] ;
         n4295ClasCod = T00JZ25_n4295ClasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      }
   }

   public void scanEndJZ655( )
   {
      pr_default.close(23);
   }

   public void afterConfirmJZ655( )
   {
      /* After Confirm Rules */
      if ( (0==A4295ClasCod) && (0==AV41autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "CLASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtClasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsertJZ655( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A4295ClasCod) && ( AV41autonumber == 1 ) )
      {
         GXt_int8 = A4295ClasCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.tclapen_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         tclapen_impl.this.GXt_int8 = GXv_int9[0] ;
         A4295ClasCod = GXt_int8 ;
         n4295ClasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      }
   }

   public void beforeUpdateJZ655( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteJZ655( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteJZ655( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateJZ655( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesJZ655( )
   {
      edtClasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasCod_Enabled), 5, 0), true);
      edtClasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtClasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtClasDsc_Enabled), 5, 0), true);
      edtTp_Por_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTp_Por_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTp_Por_Enabled), 5, 0), true);
      dynSelloID.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynSelloID.getInternalname(), "Enabled", GXutil.ltrimstr( dynSelloID.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesJZ655( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesJZ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tclapen", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV40ClasCod,4,0))}, new String[] {"Gx_mode","EmprCod","ClasCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCLAPEN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV42Pgmname, "")));
      forbiddenHiddens.add("CodErpX", GXutil.rtrim( localUtil.format( A2325CodErpX, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tclapen:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4295ClasCod", GXutil.ltrim( localUtil.ntoc( Z4295ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4296ClasDsc", GXutil.rtrim( Z4296ClasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2325CodErpX", GXutil.rtrim( Z2325CodErpX));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11517Tp_Por", GXutil.ltrim( localUtil.ntoc( Z11517Tp_Por, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8339Tp_Cod", GXutil.ltrim( localUtil.ntoc( Z8339Tp_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12345SelloID", GXutil.ltrim( localUtil.ntoc( Z12345SelloID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N8339Tp_Cod", GXutil.ltrim( localUtil.ntoc( A8339Tp_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N12345SelloID", GXutil.ltrim( localUtil.ntoc( A12345SelloID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV35TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV35TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "CLASDSCID", A13804ClasDscID);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLASCOD", GXutil.ltrim( localUtil.ntoc( AV40ClasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLASCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40ClasCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV41autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TP_COD", GXutil.ltrim( localUtil.ntoc( AV37Insert_Tp_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TP_COD", GXutil.ltrim( localUtil.ntoc( A8339Tp_Cod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_SELLOID", GXutil.ltrim( localUtil.ntoc( AV38Insert_SelloID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CODERPX", GXutil.rtrim( A2325CodErpX));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TP_DSC", GXutil.rtrim( A8340Tp_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "SELLODC", GXutil.rtrim( A12344SelloDc));
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
      return formatLink("app.ficherosbasicos.tclapen", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV40ClasCod,4,0))}, new String[] {"Gx_mode","EmprCod","ClasCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TCLAPEN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tipos de Familias", "") ;
   }

   public void initializeNonKeyJZ655( )
   {
      A8339Tp_Cod = (byte)(0) ;
      n8339Tp_Cod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8339Tp_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8339Tp_Cod), 2, 0));
      A12345SelloID = (short)(0) ;
      n12345SelloID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12345SelloID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12345SelloID), 4, 0));
      A13804ClasDscID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13804ClasDscID", A13804ClasDscID);
      A4296ClasDsc = "" ;
      n4296ClasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4296ClasDsc", A4296ClasDsc);
      A8340Tp_Dsc = "" ;
      n8340Tp_Dsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8340Tp_Dsc", A8340Tp_Dsc);
      A2325CodErpX = "" ;
      n2325CodErpX = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2325CodErpX", A2325CodErpX);
      A11517Tp_Por = (short)(0) ;
      n11517Tp_Por = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11517Tp_Por", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11517Tp_Por), 3, 0));
      A12344SelloDc = "" ;
      n12344SelloDc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12344SelloDc", A12344SelloDc);
      Z4296ClasDsc = "" ;
      Z2325CodErpX = "" ;
      Z11517Tp_Por = (short)(0) ;
      Z8339Tp_Cod = (byte)(0) ;
      Z12345SelloID = (short)(0) ;
   }

   public void initAllJZ655( )
   {
      A4295ClasCod = (short)(0) ;
      n4295ClasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      initializeNonKeyJZ655( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655095", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tclapen.js", "?20268211655096", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtClasCod_Internalname = "CLASCOD" ;
      edtClasDsc_Internalname = "CLASDSC" ;
      edtTp_Por_Internalname = "TP_POR" ;
      divTp_por_cell_Internalname = "TP_POR_CELL" ;
      dynSelloID.setInternalname( "SELLOID" );
      divSelloid_cell_Internalname = "SELLOID_CELL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
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
      Form.setCaption( httpContext.getMessage( "Tipos de Familias", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      dynSelloID.setJsonclick( "" );
      dynSelloID.setEnabled( 1 );
      dynSelloID.setVisible( 1 );
      divSelloid_cell_Class = "col-xs-12 col-sm-6" ;
      edtTp_Por_Jsonclick = "" ;
      edtTp_Por_Enabled = 1 ;
      edtTp_Por_Visible = 1 ;
      divTp_por_cell_Class = "col-xs-12 col-sm-6" ;
      edtClasDsc_Jsonclick = "" ;
      edtClasDsc_Enabled = 1 ;
      edtClasCod_Jsonclick = "" ;
      edtClasCod_Enabled = 1 ;
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

   public void gxdlaselloidJZ655( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaselloid_dataJZ655( A396EmprCod) ;
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

   public void gxaselloid_htmlJZ655( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdlaselloid_dataJZ655( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynSelloID.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynSelloID.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaselloid_dataJZ655( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T00JZ26 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(24) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T00JZ26_A12345SelloID[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T00JZ26_A12344SelloDc[0]));
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   public void gx5asaclascodJZ655( short AV40ClasCod )
   {
      if ( ! (0==AV40ClasCod) )
      {
         A4295ClasCod = AV40ClasCod ;
         n4295ClasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asaclascodJZ655( short A4295ClasCod ,
                                   short AV41autonumber ,
                                   String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A4295ClasCod) && ( AV41autonumber == 1 ) )
      {
         GXt_int8 = A4295ClasCod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.tclapen_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         tclapen_impl.this.GXt_int8 = GXv_int9[0] ;
         A4295ClasCod = GXt_int8 ;
         n4295ClasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4295ClasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4295ClasCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4295ClasCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa11517JZ655( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "LAVAND", ""), ""), GXv_int6) ;
      tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
      edtTp_Por_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTp_Por_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTp_Por_Visible), 5, 0), true);
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

   public void gxasa12345JZ655( String A396EmprCod )
   {
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ELIOT", ""), ""), GXv_int6) ;
      tclapen_impl.this.GXt_int5 = GXv_int6[0] ;
      dynSelloID.setVisible( ((GXt_int5==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, dynSelloID.getInternalname(), "Visible", GXutil.ltrimstr( dynSelloID.getVisible(), 5, 0), true);
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
      dynSelloID.setName( "SELLOID" );
      dynSelloID.setWebtags( "" );
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

   public void valid_Selloid( )
   {
      n12345SelloID = false ;
      A12345SelloID = (short)(GXutil.lval( dynSelloID.getValue())) ;
      n12345SelloID = false ;
      n12344SelloDc = false ;
      /* Using cursor T00JZ27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n12345SelloID), Short.valueOf(A12345SelloID)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A12345SelloID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SELLO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SELLOID");
            AnyError = (short)(1) ;
            GX_FocusControl = dynSelloID.getInternalname() ;
         }
      }
      A12344SelloDc = T00JZ27_A12344SelloDc[0] ;
      n12344SelloDc = T00JZ27_n12344SelloDc[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12344SelloDc", GXutil.rtrim( A12344SelloDc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40ClasCod',fld:'vCLASCOD',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40ClasCod',fld:'vCLASCOD',pic:'ZZZ9',hsh:true},{av:'AV42Pgmname',fld:'vPGMNAME',pic:''},{av:'A2325CodErpX',fld:'CODERPX',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e12JZ2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_CLASCOD","{handler:'valid_Clascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CLASCOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_CLASDSC","{handler:'valid_Clasdsc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CLASDSC",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_SELLOID","{handler:'valid_Selloid',iparms:[{av:'A12344SelloDc',fld:'SELLODC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]");
      setEventMetadata("VALID_SELLOID",",oparms:[{av:'A12344SelloDc',fld:'SELLODC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynSelloID'},{av:'A12345SelloID',fld:'SELLOID',pic:'ZZZ9'}]}");
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
      pr_default.close(14);
      pr_default.close(25);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV26EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4296ClasDsc = "" ;
      Z2325CodErpX = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV26EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4296ClasDsc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV42Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A2325CodErpX = "" ;
      A13804ClasDscID = "" ;
      A407EmprNom = "" ;
      A8340Tp_Dsc = "" ;
      A12344SelloDc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode655 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV24Station = "" ;
      AV25EmprNom = "" ;
      AV21UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      AV39TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z8340Tp_Dsc = "" ;
      Z12344SelloDc = "" ;
      T00JZ4_A407EmprNom = new String[] {""} ;
      T00JZ4_n407EmprNom = new boolean[] {false} ;
      T00JZ6_A12344SelloDc = new String[] {""} ;
      T00JZ6_n12344SelloDc = new boolean[] {false} ;
      T00JZ5_A8340Tp_Dsc = new String[] {""} ;
      T00JZ5_n8340Tp_Dsc = new boolean[] {false} ;
      T00JZ7_A4295ClasCod = new short[1] ;
      T00JZ7_n4295ClasCod = new boolean[] {false} ;
      T00JZ7_A407EmprNom = new String[] {""} ;
      T00JZ7_n407EmprNom = new boolean[] {false} ;
      T00JZ7_A4296ClasDsc = new String[] {""} ;
      T00JZ7_n4296ClasDsc = new boolean[] {false} ;
      T00JZ7_A8340Tp_Dsc = new String[] {""} ;
      T00JZ7_n8340Tp_Dsc = new boolean[] {false} ;
      T00JZ7_A2325CodErpX = new String[] {""} ;
      T00JZ7_n2325CodErpX = new boolean[] {false} ;
      T00JZ7_A11517Tp_Por = new short[1] ;
      T00JZ7_n11517Tp_Por = new boolean[] {false} ;
      T00JZ7_A12344SelloDc = new String[] {""} ;
      T00JZ7_n12344SelloDc = new boolean[] {false} ;
      T00JZ7_A396EmprCod = new String[] {""} ;
      T00JZ7_A8339Tp_Cod = new byte[1] ;
      T00JZ7_n8339Tp_Cod = new boolean[] {false} ;
      T00JZ7_A12345SelloID = new short[1] ;
      T00JZ7_n12345SelloID = new boolean[] {false} ;
      T00JZ8_A8340Tp_Dsc = new String[] {""} ;
      T00JZ8_n8340Tp_Dsc = new boolean[] {false} ;
      T00JZ9_A12344SelloDc = new String[] {""} ;
      T00JZ9_n12344SelloDc = new boolean[] {false} ;
      T00JZ10_A396EmprCod = new String[] {""} ;
      T00JZ10_A4295ClasCod = new short[1] ;
      T00JZ10_n4295ClasCod = new boolean[] {false} ;
      T00JZ3_A4295ClasCod = new short[1] ;
      T00JZ3_n4295ClasCod = new boolean[] {false} ;
      T00JZ3_A4296ClasDsc = new String[] {""} ;
      T00JZ3_n4296ClasDsc = new boolean[] {false} ;
      T00JZ3_A2325CodErpX = new String[] {""} ;
      T00JZ3_n2325CodErpX = new boolean[] {false} ;
      T00JZ3_A11517Tp_Por = new short[1] ;
      T00JZ3_n11517Tp_Por = new boolean[] {false} ;
      T00JZ3_A396EmprCod = new String[] {""} ;
      T00JZ3_A8339Tp_Cod = new byte[1] ;
      T00JZ3_n8339Tp_Cod = new boolean[] {false} ;
      T00JZ3_A12345SelloID = new short[1] ;
      T00JZ3_n12345SelloID = new boolean[] {false} ;
      T00JZ11_A396EmprCod = new String[] {""} ;
      T00JZ11_A4295ClasCod = new short[1] ;
      T00JZ11_n4295ClasCod = new boolean[] {false} ;
      T00JZ12_A396EmprCod = new String[] {""} ;
      T00JZ12_A4295ClasCod = new short[1] ;
      T00JZ12_n4295ClasCod = new boolean[] {false} ;
      T00JZ2_A4295ClasCod = new short[1] ;
      T00JZ2_n4295ClasCod = new boolean[] {false} ;
      T00JZ2_A4296ClasDsc = new String[] {""} ;
      T00JZ2_n4296ClasDsc = new boolean[] {false} ;
      T00JZ2_A2325CodErpX = new String[] {""} ;
      T00JZ2_n2325CodErpX = new boolean[] {false} ;
      T00JZ2_A11517Tp_Por = new short[1] ;
      T00JZ2_n11517Tp_Por = new boolean[] {false} ;
      T00JZ2_A396EmprCod = new String[] {""} ;
      T00JZ2_A8339Tp_Cod = new byte[1] ;
      T00JZ2_n8339Tp_Cod = new boolean[] {false} ;
      T00JZ2_A12345SelloID = new short[1] ;
      T00JZ2_n12345SelloID = new boolean[] {false} ;
      T00JZ16_A8340Tp_Dsc = new String[] {""} ;
      T00JZ16_n8340Tp_Dsc = new boolean[] {false} ;
      T00JZ17_A12344SelloDc = new String[] {""} ;
      T00JZ17_n12344SelloDc = new boolean[] {false} ;
      T00JZ18_A396EmprCod = new String[] {""} ;
      T00JZ18_A4295ClasCod = new short[1] ;
      T00JZ18_n4295ClasCod = new boolean[] {false} ;
      T00JZ18_A11520TipArtId = new short[1] ;
      T00JZ19_A396EmprCod = new String[] {""} ;
      T00JZ19_A10588H_RecCod = new int[1] ;
      T00JZ20_A396EmprCod = new String[] {""} ;
      T00JZ20_A252CliCod = new int[1] ;
      T00JZ20_A65ArtCod = new String[] {""} ;
      T00JZ20_A8342CodPred = new short[1] ;
      T00JZ21_A396EmprCod = new String[] {""} ;
      T00JZ21_A252CliCod = new int[1] ;
      T00JZ21_A5452P_ForCod = new String[] {""} ;
      T00JZ21_A4295ClasCod = new short[1] ;
      T00JZ21_n4295ClasCod = new boolean[] {false} ;
      T00JZ22_A396EmprCod = new String[] {""} ;
      T00JZ22_A252CliCod = new int[1] ;
      T00JZ22_A5428FasPreCod = new String[] {""} ;
      T00JZ22_A4295ClasCod = new short[1] ;
      T00JZ22_n4295ClasCod = new boolean[] {false} ;
      T00JZ23_A396EmprCod = new String[] {""} ;
      T00JZ23_A252CliCod = new int[1] ;
      T00JZ23_A65ArtCod = new String[] {""} ;
      T00JZ24_A396EmprCod = new String[] {""} ;
      T00JZ24_A44AlbRecCod = new int[1] ;
      T00JZ25_A396EmprCod = new String[] {""} ;
      T00JZ25_A4295ClasCod = new short[1] ;
      T00JZ25_n4295ClasCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T00JZ26_A396EmprCod = new String[] {""} ;
      T00JZ26_A12345SelloID = new short[1] ;
      T00JZ26_n12345SelloID = new boolean[] {false} ;
      T00JZ26_A12344SelloDc = new String[] {""} ;
      T00JZ26_n12344SelloDc = new boolean[] {false} ;
      GXv_int9 = new short[1] ;
      GXv_int6 = new byte[1] ;
      T00JZ27_A12344SelloDc = new String[] {""} ;
      T00JZ27_n12344SelloDc = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclapen__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclapen__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclapen__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclapen__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclapen__default(),
         new Object[] {
             new Object[] {
            T00JZ2_A4295ClasCod, T00JZ2_A4296ClasDsc, T00JZ2_n4296ClasDsc, T00JZ2_A2325CodErpX, T00JZ2_n2325CodErpX, T00JZ2_A11517Tp_Por, T00JZ2_n11517Tp_Por, T00JZ2_A396EmprCod, T00JZ2_A8339Tp_Cod, T00JZ2_n8339Tp_Cod,
            T00JZ2_A12345SelloID, T00JZ2_n12345SelloID
            }
            , new Object[] {
            T00JZ3_A4295ClasCod, T00JZ3_A4296ClasDsc, T00JZ3_n4296ClasDsc, T00JZ3_A2325CodErpX, T00JZ3_n2325CodErpX, T00JZ3_A11517Tp_Por, T00JZ3_n11517Tp_Por, T00JZ3_A396EmprCod, T00JZ3_A8339Tp_Cod, T00JZ3_n8339Tp_Cod,
            T00JZ3_A12345SelloID, T00JZ3_n12345SelloID
            }
            , new Object[] {
            T00JZ4_A407EmprNom, T00JZ4_n407EmprNom
            }
            , new Object[] {
            T00JZ5_A8340Tp_Dsc, T00JZ5_n8340Tp_Dsc
            }
            , new Object[] {
            T00JZ6_A12344SelloDc, T00JZ6_n12344SelloDc
            }
            , new Object[] {
            T00JZ7_A4295ClasCod, T00JZ7_A407EmprNom, T00JZ7_n407EmprNom, T00JZ7_A4296ClasDsc, T00JZ7_n4296ClasDsc, T00JZ7_A8340Tp_Dsc, T00JZ7_n8340Tp_Dsc, T00JZ7_A2325CodErpX, T00JZ7_n2325CodErpX, T00JZ7_A11517Tp_Por,
            T00JZ7_n11517Tp_Por, T00JZ7_A12344SelloDc, T00JZ7_n12344SelloDc, T00JZ7_A396EmprCod, T00JZ7_A8339Tp_Cod, T00JZ7_n8339Tp_Cod, T00JZ7_A12345SelloID, T00JZ7_n12345SelloID
            }
            , new Object[] {
            T00JZ8_A8340Tp_Dsc, T00JZ8_n8340Tp_Dsc
            }
            , new Object[] {
            T00JZ9_A12344SelloDc, T00JZ9_n12344SelloDc
            }
            , new Object[] {
            T00JZ10_A396EmprCod, T00JZ10_A4295ClasCod
            }
            , new Object[] {
            T00JZ11_A396EmprCod, T00JZ11_A4295ClasCod
            }
            , new Object[] {
            T00JZ12_A396EmprCod, T00JZ12_A4295ClasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00JZ16_A8340Tp_Dsc, T00JZ16_n8340Tp_Dsc
            }
            , new Object[] {
            T00JZ17_A12344SelloDc, T00JZ17_n12344SelloDc
            }
            , new Object[] {
            T00JZ18_A396EmprCod, T00JZ18_A4295ClasCod, T00JZ18_A11520TipArtId
            }
            , new Object[] {
            T00JZ19_A396EmprCod, T00JZ19_A10588H_RecCod
            }
            , new Object[] {
            T00JZ20_A396EmprCod, T00JZ20_A252CliCod, T00JZ20_A65ArtCod, T00JZ20_A8342CodPred
            }
            , new Object[] {
            T00JZ21_A396EmprCod, T00JZ21_A252CliCod, T00JZ21_A5452P_ForCod, T00JZ21_A4295ClasCod
            }
            , new Object[] {
            T00JZ22_A396EmprCod, T00JZ22_A252CliCod, T00JZ22_A5428FasPreCod, T00JZ22_A4295ClasCod
            }
            , new Object[] {
            T00JZ23_A396EmprCod, T00JZ23_A252CliCod, T00JZ23_A65ArtCod
            }
            , new Object[] {
            T00JZ24_A396EmprCod, T00JZ24_A44AlbRecCod
            }
            , new Object[] {
            T00JZ25_A396EmprCod, T00JZ25_A4295ClasCod
            }
            , new Object[] {
            T00JZ26_A396EmprCod, T00JZ26_A12345SelloID, T00JZ26_A12344SelloDc, T00JZ26_n12344SelloDc
            }
            , new Object[] {
            T00JZ27_A12344SelloDc, T00JZ27_n12344SelloDc
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV42Pgmname = "FicherosBasicos.TCLAPEN" ;
   }

   private byte Z8339Tp_Cod ;
   private byte N8339Tp_Cod ;
   private byte GxWebError ;
   private byte A8339Tp_Cod ;
   private byte nKeyPressed ;
   private byte AV37Insert_Tp_Cod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private short wcpOAV40ClasCod ;
   private short Z4295ClasCod ;
   private short Z11517Tp_Por ;
   private short Z12345SelloID ;
   private short N12345SelloID ;
   private short AV40ClasCod ;
   private short A4295ClasCod ;
   private short AV41autonumber ;
   private short A12345SelloID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11517Tp_Por ;
   private short AV38Insert_SelloID ;
   private short RcdFound655 ;
   private short nIsDirty_655 ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int trnEnded ;
   private int edtClasCod_Enabled ;
   private int edtClasDsc_Enabled ;
   private int edtTp_Por_Visible ;
   private int edtTp_Por_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int AV43GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV26EmprCod ;
   private String Z396EmprCod ;
   private String Z4296ClasDsc ;
   private String Z2325CodErpX ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV26EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtClasCod_Internalname ;
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
   private String edtClasCod_Jsonclick ;
   private String edtClasDsc_Internalname ;
   private String A4296ClasDsc ;
   private String edtClasDsc_Jsonclick ;
   private String divTp_por_cell_Internalname ;
   private String divTp_por_cell_Class ;
   private String edtTp_Por_Internalname ;
   private String edtTp_Por_Jsonclick ;
   private String divSelloid_cell_Internalname ;
   private String divSelloid_cell_Class ;
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
   private String A2325CodErpX ;
   private String A407EmprNom ;
   private String A8340Tp_Dsc ;
   private String A12344SelloDc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode655 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV24Station ;
   private String AV25EmprNom ;
   private String AV21UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z8340Tp_Dsc ;
   private String Z12344SelloDc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4295ClasCod ;
   private boolean n8339Tp_Cod ;
   private boolean n12345SelloID ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n2325CodErpX ;
   private boolean n407EmprNom ;
   private boolean n8340Tp_Dsc ;
   private boolean n12344SelloDc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n4296ClasDsc ;
   private boolean n11517Tp_Por ;
   private boolean returnInSub ;
   private boolean gxdyncontrolsrefreshing ;
   private String A13804ClasDscID ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice dynSelloID ;
   private IDataStoreProvider pr_default ;
   private String[] T00JZ4_A407EmprNom ;
   private boolean[] T00JZ4_n407EmprNom ;
   private String[] T00JZ6_A12344SelloDc ;
   private boolean[] T00JZ6_n12344SelloDc ;
   private String[] T00JZ5_A8340Tp_Dsc ;
   private boolean[] T00JZ5_n8340Tp_Dsc ;
   private short[] T00JZ7_A4295ClasCod ;
   private boolean[] T00JZ7_n4295ClasCod ;
   private String[] T00JZ7_A407EmprNom ;
   private boolean[] T00JZ7_n407EmprNom ;
   private String[] T00JZ7_A4296ClasDsc ;
   private boolean[] T00JZ7_n4296ClasDsc ;
   private String[] T00JZ7_A8340Tp_Dsc ;
   private boolean[] T00JZ7_n8340Tp_Dsc ;
   private String[] T00JZ7_A2325CodErpX ;
   private boolean[] T00JZ7_n2325CodErpX ;
   private short[] T00JZ7_A11517Tp_Por ;
   private boolean[] T00JZ7_n11517Tp_Por ;
   private String[] T00JZ7_A12344SelloDc ;
   private boolean[] T00JZ7_n12344SelloDc ;
   private String[] T00JZ7_A396EmprCod ;
   private byte[] T00JZ7_A8339Tp_Cod ;
   private boolean[] T00JZ7_n8339Tp_Cod ;
   private short[] T00JZ7_A12345SelloID ;
   private boolean[] T00JZ7_n12345SelloID ;
   private String[] T00JZ8_A8340Tp_Dsc ;
   private boolean[] T00JZ8_n8340Tp_Dsc ;
   private String[] T00JZ9_A12344SelloDc ;
   private boolean[] T00JZ9_n12344SelloDc ;
   private String[] T00JZ10_A396EmprCod ;
   private short[] T00JZ10_A4295ClasCod ;
   private boolean[] T00JZ10_n4295ClasCod ;
   private short[] T00JZ3_A4295ClasCod ;
   private boolean[] T00JZ3_n4295ClasCod ;
   private String[] T00JZ3_A4296ClasDsc ;
   private boolean[] T00JZ3_n4296ClasDsc ;
   private String[] T00JZ3_A2325CodErpX ;
   private boolean[] T00JZ3_n2325CodErpX ;
   private short[] T00JZ3_A11517Tp_Por ;
   private boolean[] T00JZ3_n11517Tp_Por ;
   private String[] T00JZ3_A396EmprCod ;
   private byte[] T00JZ3_A8339Tp_Cod ;
   private boolean[] T00JZ3_n8339Tp_Cod ;
   private short[] T00JZ3_A12345SelloID ;
   private boolean[] T00JZ3_n12345SelloID ;
   private String[] T00JZ11_A396EmprCod ;
   private short[] T00JZ11_A4295ClasCod ;
   private boolean[] T00JZ11_n4295ClasCod ;
   private String[] T00JZ12_A396EmprCod ;
   private short[] T00JZ12_A4295ClasCod ;
   private boolean[] T00JZ12_n4295ClasCod ;
   private short[] T00JZ2_A4295ClasCod ;
   private boolean[] T00JZ2_n4295ClasCod ;
   private String[] T00JZ2_A4296ClasDsc ;
   private boolean[] T00JZ2_n4296ClasDsc ;
   private String[] T00JZ2_A2325CodErpX ;
   private boolean[] T00JZ2_n2325CodErpX ;
   private short[] T00JZ2_A11517Tp_Por ;
   private boolean[] T00JZ2_n11517Tp_Por ;
   private String[] T00JZ2_A396EmprCod ;
   private byte[] T00JZ2_A8339Tp_Cod ;
   private boolean[] T00JZ2_n8339Tp_Cod ;
   private short[] T00JZ2_A12345SelloID ;
   private boolean[] T00JZ2_n12345SelloID ;
   private String[] T00JZ16_A8340Tp_Dsc ;
   private boolean[] T00JZ16_n8340Tp_Dsc ;
   private String[] T00JZ17_A12344SelloDc ;
   private boolean[] T00JZ17_n12344SelloDc ;
   private String[] T00JZ18_A396EmprCod ;
   private short[] T00JZ18_A4295ClasCod ;
   private boolean[] T00JZ18_n4295ClasCod ;
   private short[] T00JZ18_A11520TipArtId ;
   private String[] T00JZ19_A396EmprCod ;
   private int[] T00JZ19_A10588H_RecCod ;
   private String[] T00JZ20_A396EmprCod ;
   private int[] T00JZ20_A252CliCod ;
   private String[] T00JZ20_A65ArtCod ;
   private short[] T00JZ20_A8342CodPred ;
   private String[] T00JZ21_A396EmprCod ;
   private int[] T00JZ21_A252CliCod ;
   private String[] T00JZ21_A5452P_ForCod ;
   private short[] T00JZ21_A4295ClasCod ;
   private boolean[] T00JZ21_n4295ClasCod ;
   private String[] T00JZ22_A396EmprCod ;
   private int[] T00JZ22_A252CliCod ;
   private String[] T00JZ22_A5428FasPreCod ;
   private short[] T00JZ22_A4295ClasCod ;
   private boolean[] T00JZ22_n4295ClasCod ;
   private String[] T00JZ23_A396EmprCod ;
   private int[] T00JZ23_A252CliCod ;
   private String[] T00JZ23_A65ArtCod ;
   private String[] T00JZ24_A396EmprCod ;
   private int[] T00JZ24_A44AlbRecCod ;
   private String[] T00JZ25_A396EmprCod ;
   private short[] T00JZ25_A4295ClasCod ;
   private boolean[] T00JZ25_n4295ClasCod ;
   private String[] T00JZ26_A396EmprCod ;
   private short[] T00JZ26_A12345SelloID ;
   private boolean[] T00JZ26_n12345SelloID ;
   private String[] T00JZ26_A12344SelloDc ;
   private boolean[] T00JZ26_n12344SelloDc ;
   private String[] T00JZ27_A12344SelloDc ;
   private boolean[] T00JZ27_n12344SelloDc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV39TrnContextAtt ;
}

final  class tclapen__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclapen__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclapen__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclapen__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclapen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00JZ2", "SELECT ClasCod, ClasDsc, CodErpX, Tp_Por, EmprCod, Tp_Cod, SelloID FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ?  FOR UPDATE OF ClasDsc, CodErpX, Tp_Por, Tp_Cod, SelloID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ3", "SELECT ClasCod, ClasDsc, CodErpX, Tp_Por, EmprCod, Tp_Cod, SelloID FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ5", "SELECT Tp_Dsc FROM TXPTPPRDL WHERE EmprCod = ? AND Tp_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ6", "SELECT SelloDc FROM TXPSELLO WHERE EmprCod = ? AND SelloID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ7", "SELECT /*+ FIRST_ROWS(100) */ TM1.ClasCod, T2.EmprNom, TM1.ClasDsc, T3.Tp_Dsc, TM1.CodErpX, TM1.Tp_Por, T4.SelloDc, TM1.EmprCod, TM1.Tp_Cod, TM1.SelloID FROM (((TXPCLAPEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPTPPRDL T3 ON T3.EmprCod = TM1.EmprCod AND T3.Tp_Cod = TM1.Tp_Cod) LEFT JOIN TXPSELLO T4 ON T4.EmprCod = TM1.EmprCod AND T4.SelloID = TM1.SelloID) WHERE TM1.EmprCod = ? and TM1.ClasCod = ? ORDER BY TM1.EmprCod, TM1.ClasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ8", "SELECT Tp_Dsc FROM TXPTPPRDL WHERE EmprCod = ? AND Tp_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ9", "SELECT SelloDc FROM TXPSELLO WHERE EmprCod = ? AND SelloID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ClasCod FROM TXPCLAPEN WHERE EmprCod = ? AND ClasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ClasCod FROM TXPCLAPEN WHERE ( ClasCod > ?) and EmprCod = ? ORDER BY EmprCod, ClasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00JZ12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ClasCod FROM TXPCLAPEN WHERE ( ClasCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, ClasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00JZ13", "INSERT INTO TXPCLAPEN(ClasCod, ClasDsc, CodErpX, Tp_Por, EmprCod, Tp_Cod, SelloID) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLAPEN")
         ,new UpdateCursor("T00JZ14", "UPDATE TXPCLAPEN SET ClasDsc=?, CodErpX=?, Tp_Por=?, Tp_Cod=?, SelloID=?  WHERE EmprCod = ? AND ClasCod = ?", GX_NOMASK, "TXPCLAPEN")
         ,new UpdateCursor("T00JZ15", "DELETE FROM TXPCLAPEN  WHERE EmprCod = ? AND ClasCod = ?", GX_NOMASK, "TXPCLAPEN")
         ,new ForEachCursor("T00JZ16", "SELECT Tp_Dsc FROM TXPTPPRDL WHERE EmprCod = ? AND Tp_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ17", "SELECT SelloDc FROM TXPSELLO WHERE EmprCod = ? AND SelloID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ18", "SELECT * FROM (SELECT EmprCod, ClasCod, TipArtId FROM TXPPDATAT WHERE EmprCod = ? AND ClasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00JZ19", "SELECT * FROM (SELECT EmprCod, H_RecCod FROM TXPALMPZ0 WHERE EmprCod = ? AND ClasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00JZ20", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CodPred FROM TXPPVPNIT WHERE EmprCod = ? AND CodPred = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00JZ21", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod, ClasCod FROM TXPPREQP WHERE EmprCod = ? AND ClasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00JZ22", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod, ClasCod FROM TXPPREFS1 WHERE EmprCod = ? AND ClasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00JZ23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND ClasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00JZ24", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND ClasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00JZ25", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ClasCod FROM TXPCLAPEN WHERE EmprCod = ? ORDER BY EmprCod, ClasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ26", "SELECT EmprCod, SelloID, SelloDc FROM TXPSELLO WHERE EmprCod = ? ORDER BY SelloDc ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00JZ27", "SELECT SelloDc FROM TXPSELLO WHERE EmprCod = ? AND SelloID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
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
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setString(2, (String)parms[3], 40);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
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
      }
   }

}

