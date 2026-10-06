package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie2_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV13AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_36_1P331( A396EmprCod, A44AlbRecCod, AV13AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"DEVGENTRN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdladevgentrn1P331( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_70") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_70( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_71") == 0 )
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
         gxload_71( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_72") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A327DevGenTrn = (short)(GXutil.lval( httpContext.GetPar( "DevGenTrn"))) ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_72( A396EmprCod, A327DevGenTrn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_73") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_73( A396EmprCod, A323DevGenCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_75") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_75( A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
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
            AV75EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75EmprCod", AV75EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75EmprCod, "@!"))));
            AV76DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76DevGenCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVGENCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76DevGenCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion de Piezas (Detail)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDevGenCod_Internalname ;
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
      nRC_GXsfl_181 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_181"))) ;
      nGXsfl_181_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_181_idx"))) ;
      sGXsfl_181_idx = httpContext.GetPar( "sGXsfl_181_idx") ;
      A326DevGenPie = (short)(GXutil.lval( httpContext.GetPar( "DevGenPie"))) ;
      n326DevGenPie = false ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A51AlbRPieDis = (int)(GXutil.lval( httpContext.GetPar( "AlbRPieDis"))) ;
      A57AlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "AlbRUniDis"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tdevpie2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevpie2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpie2_impl.class ));
   }

   public tdevpie2_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynDevGenTrn = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
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
      if ( dynDevGenTrn.getItemCount() > 0 )
      {
         A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValidValue(GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0))))) ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynDevGenTrn.setValue( GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Values", dynDevGenTrn.ToJavascriptSource(), true);
      }
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenCod_Internalname, httpContext.getMessage( "N Devolucion ID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenCod_Internalname, GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
      ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
      ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
      ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
      ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
      ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
      ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
      ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
      ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
      ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
      ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable5_Internalname, tblUnnamedtable5_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgenfec_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgenfec_Internalname, httpContext.getMessage( "Fecha de Devolucion", ""), "", "", lblTextblockdevgenfec_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenFec_Internalname, httpContext.getMessage( "Fecha de Devolucion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevGenFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenFec_Internalname, localUtil.format(A325DevGenFec, "99/99/99"), localUtil.format( A325DevGenFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevGenFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevGenFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDevPie2.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbreccod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbreccod_Internalname, httpContext.getMessage( "N Recepcion", ""), "", "", lblTextblockalbreccod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgendom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgendom_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "", "", lblTextblockdevgendom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenDom_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenDom_Internalname, GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenDom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9") : localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenDom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenDom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
      ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
      ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
      ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
      ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
      ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
      ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
      ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
      ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
      ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
      ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable6_Internalname, tblUnnamedtable6_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclinom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclinom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblockclinom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbref_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbref_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "", "", lblTextblockalbref_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
      ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
      ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
      ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
      ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
      ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
      ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
      ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
      ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
      ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
      ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable7_Internalname, tblUnnamedtable7_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgentrn_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgentrn_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblockdevgentrn_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynDevGenTrn.getInternalname(), httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynDevGenTrn, dynDevGenTrn.getInternalname(), GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0)), 1, dynDevGenTrn.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", httpContext.getMessage( "Codigo Transportista", ""), 1, dynDevGenTrn.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TDevPie2.htm");
      dynDevGenTrn.setValue( GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Values", dynDevGenTrn.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable8.setProperty("Width", Dvpanel_unnamedtable8_Width);
      ucDvpanel_unnamedtable8.setProperty("AutoWidth", Dvpanel_unnamedtable8_Autowidth);
      ucDvpanel_unnamedtable8.setProperty("AutoHeight", Dvpanel_unnamedtable8_Autoheight);
      ucDvpanel_unnamedtable8.setProperty("Cls", Dvpanel_unnamedtable8_Cls);
      ucDvpanel_unnamedtable8.setProperty("Title", Dvpanel_unnamedtable8_Title);
      ucDvpanel_unnamedtable8.setProperty("Collapsible", Dvpanel_unnamedtable8_Collapsible);
      ucDvpanel_unnamedtable8.setProperty("Collapsed", Dvpanel_unnamedtable8_Collapsed);
      ucDvpanel_unnamedtable8.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable8_Showcollapseicon);
      ucDvpanel_unnamedtable8.setProperty("IconPosition", Dvpanel_unnamedtable8_Iconposition);
      ucDvpanel_unnamedtable8.setProperty("AutoScroll", Dvpanel_unnamedtable8_Autoscroll);
      ucDvpanel_unnamedtable8.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable8_Internalname, "DVPANEL_UNNAMEDTABLE8Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE8Container"+"UnnamedTable8"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable8_Internalname, tblUnnamedtable8_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrunidis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrunidis_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblockalbrunidis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbruni_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbruni_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblockalbruni_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TDevPie2.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtablealbrpiedis_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbrpiedis_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblockalbrpiedis_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable9.setProperty("Width", Dvpanel_unnamedtable9_Width);
      ucDvpanel_unnamedtable9.setProperty("AutoWidth", Dvpanel_unnamedtable9_Autowidth);
      ucDvpanel_unnamedtable9.setProperty("AutoHeight", Dvpanel_unnamedtable9_Autoheight);
      ucDvpanel_unnamedtable9.setProperty("Cls", Dvpanel_unnamedtable9_Cls);
      ucDvpanel_unnamedtable9.setProperty("Title", Dvpanel_unnamedtable9_Title);
      ucDvpanel_unnamedtable9.setProperty("Collapsible", Dvpanel_unnamedtable9_Collapsible);
      ucDvpanel_unnamedtable9.setProperty("Collapsed", Dvpanel_unnamedtable9_Collapsed);
      ucDvpanel_unnamedtable9.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable9_Showcollapseicon);
      ucDvpanel_unnamedtable9.setProperty("IconPosition", Dvpanel_unnamedtable9_Iconposition);
      ucDvpanel_unnamedtable9.setProperty("AutoScroll", Dvpanel_unnamedtable9_Autoscroll);
      ucDvpanel_unnamedtable9.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable9_Internalname, "DVPANEL_UNNAMEDTABLE9Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE9Container"+"UnnamedTable9"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable9_Internalname, tblUnnamedtable9_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgenuni_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgenuni_Internalname, httpContext.getMessage( "Unidades", ""), "", "", lblTextblockdevgenuni_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenUni_Internalname, httpContext.getMessage( "Unidades Dev", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenUni_Internalname, GXutil.ltrim( localUtil.ntoc( A328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenUni_Enabled!=0) ? localUtil.format( A328DevGenUni, "ZZZZZ9.99") : localUtil.format( A328DevGenUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenUni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell DscTop", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledevgenpie_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdevgenpie_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTextblockdevgenpie_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenPie_Internalname, httpContext.getMessage( "Piezas Dev", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenPie_Internalname, GXutil.ltrim( localUtil.ntoc( A326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenPie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevGenPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnverpiezas_Internalname, "", httpContext.getMessage( "Piezas Disponibles", ""), bttBtnverpiezas_Jsonclick, 7, httpContext.getMessage( "Piezas Disponibles", ""), "", StyleString, ClassString, bttBtnverpiezas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111p331_client"+"'", TempTags, "", 2, "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
      ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
      ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
      ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
      ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
      ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
      ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
      ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
      ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
      ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
      ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "flex-grow:1;", "div");
      /*  Grid Control  */
      startgridcontrol181( ) ;
      nGXsfl_181_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount451 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_451 = (short)(1) ;
            scanStart1P3451( ) ;
            while ( RcdFound451 != 0 )
            {
               init_level_properties451( ) ;
               getByPrimaryKey1P3451( ) ;
               addRow1P3451( ) ;
               scanNext1P3451( ) ;
            }
            scanEnd1P3451( ) ;
            nBlankRcdCount451 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         B328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         B54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         B60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         B3066AlbDevPUni = A3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         B5278AlbDevPPie = A5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         standaloneNotModal1P3451( ) ;
         standaloneModal1P3451( ) ;
         sMode451 = Gx_mode ;
         while ( nGXsfl_181_idx < nRC_GXsfl_181 )
         {
            bGXsfl_181_Refreshing = true ;
            readRow1P3451( ) ;
            edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            edtDevPieUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVPIEUNI_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevPieUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevPieUni_Enabled), 5, 0), !bGXsfl_181_Refreshing);
            if ( ( nRcdExists_451 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1P3451( ) ;
            }
            sendRow1P3451( ) ;
            bGXsfl_181_Refreshing = false ;
         }
         Gx_mode = sMode451 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A326DevGenPie = B326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = B328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A54AlbRPieUti = B54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = B60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A3066AlbDevPUni = B3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = B5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount451 = (short)(5) ;
         nRcdExists_451 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1P3451( ) ;
            while ( RcdFound451 != 0 )
            {
               sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_181451( ) ;
               init_level_properties451( ) ;
               standaloneNotModal1P3451( ) ;
               getByPrimaryKey1P3451( ) ;
               standaloneModal1P3451( ) ;
               addRow1P3451( ) ;
               scanNext1P3451( ) ;
            }
            scanEnd1P3451( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode451 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_181451( ) ;
         initAll1P3451( ) ;
         init_level_properties451( ) ;
         B326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         B328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         B54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         B60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         B3066AlbDevPUni = A3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         B5278AlbDevPPie = A5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         nRcdExists_451 = (short)(0) ;
         nIsMod_451 = (short)(0) ;
         nRcdDeleted_451 = (short)(0) ;
         nBlankRcdCount451 = (short)(nBlankRcdUsr451+nBlankRcdCount451) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount451 > 0 )
         {
            standaloneNotModal1P3451( ) ;
            standaloneModal1P3451( ) ;
            addRow1P3451( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbRecPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount451 = (short)(nBlankRcdCount451-1) ;
         }
         Gx_mode = sMode451 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A326DevGenPie = B326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = B328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A54AlbRPieUti = B54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = B60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A3066AlbDevPUni = B3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = B5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 192,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie2.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPie2.htm");
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
      e121P32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z323DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z323DevGenCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z325DevGenFec = localUtil.ctod( httpContext.cgiGet( "Z325DevGenFec"), 0) ;
            Z6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6288DevGenDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z328DevGenUni = localUtil.ctond( httpContext.cgiGet( "Z328DevGenUni")) ;
            Z326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z326DevGenPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z324DevGenEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z327DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( "Z327DevGenTrn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z324DevGenEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n324DevGenEst = false ;
            A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1304DevUlin = false ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            O326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( "O326DevGenPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O328DevGenUni = localUtil.ctond( httpContext.cgiGet( "O328DevGenUni")) ;
            O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "O54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "O60AlbRUniUti")) ;
            O3066AlbDevPUni = localUtil.ctond( httpContext.cgiGet( "O3066AlbDevPUni")) ;
            O5278AlbDevPPie = (short)(localUtil.ctol( httpContext.cgiGet( "O5278AlbDevPPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_181 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_181"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "ALBRUNIENT")) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "ALBRUNIUTI")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV75EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV76DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDEVGENCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV80Insert_AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_ALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV81Insert_DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_DEVGENTRN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "vALBRUNIDIS")) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV15MetAnt = localUtil.ctond( httpContext.cgiGet( "vMETANT")) ;
            AV16PieAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Kilos = localUtil.ctond( httpContext.cgiGet( "vKILOS")) ;
            AV18Metros = localUtil.ctond( httpContext.cgiGet( "vMETROS")) ;
            AV19Piezas = (short)(localUtil.ctol( httpContext.cgiGet( "vPIEZAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13AlbRUni = httpContext.cgiGet( "vALBRUNI") ;
            AV11AlbRPDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12AlbRUDis = localUtil.ctond( httpContext.cgiGet( "vALBRUDIS")) ;
            A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVGENEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A329DevTrnNom = httpContext.cgiGet( "DEVTRNNOM") ;
            n329DevTrnNom = false ;
            A3066AlbDevPUni = localUtil.ctond( httpContext.cgiGet( "ALBDEVPUNI")) ;
            A5278AlbDevPPie = (short)(localUtil.ctol( httpContext.cgiGet( "ALBDEVPPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV84Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV63oldUni = localUtil.ctond( httpContext.cgiGet( "vOLDUNI")) ;
            A4795AlRPieCal = httpContext.cgiGet( "ALRPIECAL") ;
            Dvpanel_unnamedtable5_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Objectcall") ;
            Dvpanel_unnamedtable5_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Class") ;
            Dvpanel_unnamedtable5_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Enabled")) ;
            Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
            Dvpanel_unnamedtable5_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Height") ;
            Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
            Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
            Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
            Dvpanel_unnamedtable5_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showheader")) ;
            Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
            Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
            Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
            Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
            Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
            Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
            Dvpanel_unnamedtable5_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Visible")) ;
            Dvpanel_unnamedtable5_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable6_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Objectcall") ;
            Dvpanel_unnamedtable6_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Class") ;
            Dvpanel_unnamedtable6_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Enabled")) ;
            Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
            Dvpanel_unnamedtable6_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Height") ;
            Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
            Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
            Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
            Dvpanel_unnamedtable6_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showheader")) ;
            Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
            Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
            Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
            Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
            Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
            Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
            Dvpanel_unnamedtable6_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Visible")) ;
            Dvpanel_unnamedtable6_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable7_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Objectcall") ;
            Dvpanel_unnamedtable7_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Class") ;
            Dvpanel_unnamedtable7_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Enabled")) ;
            Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
            Dvpanel_unnamedtable7_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Height") ;
            Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
            Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
            Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
            Dvpanel_unnamedtable7_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showheader")) ;
            Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
            Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
            Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
            Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
            Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
            Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
            Dvpanel_unnamedtable7_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Visible")) ;
            Dvpanel_unnamedtable7_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable8_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Objectcall") ;
            Dvpanel_unnamedtable8_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Class") ;
            Dvpanel_unnamedtable8_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Enabled")) ;
            Dvpanel_unnamedtable8_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Width") ;
            Dvpanel_unnamedtable8_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Height") ;
            Dvpanel_unnamedtable8_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autowidth")) ;
            Dvpanel_unnamedtable8_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autoheight")) ;
            Dvpanel_unnamedtable8_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Cls") ;
            Dvpanel_unnamedtable8_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Showheader")) ;
            Dvpanel_unnamedtable8_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Title") ;
            Dvpanel_unnamedtable8_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Collapsible")) ;
            Dvpanel_unnamedtable8_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Collapsed")) ;
            Dvpanel_unnamedtable8_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Showcollapseicon")) ;
            Dvpanel_unnamedtable8_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Iconposition") ;
            Dvpanel_unnamedtable8_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Autoscroll")) ;
            Dvpanel_unnamedtable8_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Visible")) ;
            Dvpanel_unnamedtable8_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE8_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable9_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Objectcall") ;
            Dvpanel_unnamedtable9_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Class") ;
            Dvpanel_unnamedtable9_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Enabled")) ;
            Dvpanel_unnamedtable9_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Width") ;
            Dvpanel_unnamedtable9_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Height") ;
            Dvpanel_unnamedtable9_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autowidth")) ;
            Dvpanel_unnamedtable9_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoheight")) ;
            Dvpanel_unnamedtable9_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Cls") ;
            Dvpanel_unnamedtable9_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showheader")) ;
            Dvpanel_unnamedtable9_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Title") ;
            Dvpanel_unnamedtable9_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsible")) ;
            Dvpanel_unnamedtable9_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Collapsed")) ;
            Dvpanel_unnamedtable9_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Showcollapseicon")) ;
            Dvpanel_unnamedtable9_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Iconposition") ;
            Dvpanel_unnamedtable9_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Autoscroll")) ;
            Dvpanel_unnamedtable9_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Visible")) ;
            Dvpanel_unnamedtable9_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE9_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Dvpanel_unnamedtable1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_unnamedtable2_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Objectcall") ;
            Dvpanel_unnamedtable2_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Class") ;
            Dvpanel_unnamedtable2_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Enabled")) ;
            Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
            Dvpanel_unnamedtable2_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Height") ;
            Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
            Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
            Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
            Dvpanel_unnamedtable2_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showheader")) ;
            Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
            Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
            Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
            Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
            Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
            Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
            Dvpanel_unnamedtable2_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Visible")) ;
            Dvpanel_unnamedtable2_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVGENCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A323DevGenCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            }
            else
            {
               A323DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            }
            A325DevGenFec = localUtil.ctod( httpContext.cgiGet( edtDevGenFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n325DevGenFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6288DevGenDom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            dynDevGenTrn.setName( dynDevGenTrn.getInternalname() );
            dynDevGenTrn.setValue( httpContext.cgiGet( dynDevGenTrn.getInternalname()) );
            A327DevGenTrn = (short)(GXutil.lval( httpContext.cgiGet( dynDevGenTrn.getInternalname()))) ;
            n327DevGenTrn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A328DevGenUni = localUtil.ctond( httpContext.cgiGet( edtDevGenUni_Internalname)) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            A326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDevGenPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n326DevGenPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDevPie2");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A327DevGenTrn = (short)(GXutil.lval( httpContext.cgiGet( dynDevGenTrn.getInternalname()))) ;
            n327DevGenTrn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
            forbiddenHiddens.add("DevGenTrn", localUtil.format( DecimalUtil.doubleToDec(A327DevGenTrn), "ZZZ9"));
            A325DevGenFec = localUtil.ctod( httpContext.cgiGet( edtDevGenFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n325DevGenFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
            forbiddenHiddens.add("DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
            A6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6288DevGenDom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
            forbiddenHiddens.add("DevGenDom", localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9"));
            forbiddenHiddens.add("DevGenEst", localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"));
            forbiddenHiddens.add("DevUlin", localUtil.format( DecimalUtil.doubleToDec(A1304DevUlin), "Z9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A323DevGenCod != Z323DevGenCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdevpie2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
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
                  sMode31 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode31 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound31 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1P30( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DEVGENCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevGenCod_Internalname ;
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
                        e121P32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131P32 ();
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
         e131P32 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1P331( ) ;
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
         disableAttributes1P331( ) ;
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

   public void confirm_1P30( )
   {
      beforeValidate1P331( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P331( ) ;
         }
         else
         {
            checkExtendedTable1P331( ) ;
            closeExtendedTableCursors1P331( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode31 = Gx_mode ;
         confirm_1P3451( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode31 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1P3451( )
   {
      s326DevGenPie = O326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      s328DevGenUni = O328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s3066AlbDevPUni = O3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      s5278AlbDevPPie = O5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      sV14KilAnt = OV14KilAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      sV15MetAnt = OV15MetAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      sV16PieAnt = OV16PieAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      sV17Kilos = OV17Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      sV18Metros = OV18Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      sV19Piezas = OV19Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      sV9AlbRPieDis = OV9AlbRPieDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      sV10AlbRUniDis = OV10AlbRUniDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      s47AlbREst = O47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      nGXsfl_181_idx = 0 ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         readRow1P3451( ) ;
         if ( ( nRcdExists_451 != 0 ) || ( nIsMod_451 != 0 ) )
         {
            getKey1P3451( ) ;
            if ( ( nRcdExists_451 == 0 ) && ( nRcdDeleted_451 == 0 ) )
            {
               if ( RcdFound451 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1P3451( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1P3451( ) ;
                     closeExtendedTableCursors1P3451( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O326DevGenPie = A326DevGenPie ;
                     n326DevGenPie = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                     O328DevGenUni = A328DevGenUni ;
                     n328DevGenUni = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                     O54AlbRPieUti = A54AlbRPieUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                     O60AlbRUniUti = A60AlbRUniUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     O3066AlbDevPUni = A3066AlbDevPUni ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                     O5278AlbDevPPie = A5278AlbDevPPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                     OV14KilAnt = AV14KilAnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                     OV15MetAnt = AV15MetAnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                     OV16PieAnt = AV16PieAnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                     OV17Kilos = AV17Kilos ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                     OV18Metros = AV18Metros ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                     OV19Piezas = AV19Piezas ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                     OV9AlbRPieDis = AV9AlbRPieDis ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                     OV10AlbRUniDis = AV10AlbRUniDis ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                     O47AlbREst = A47AlbREst ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound451 != 0 )
               {
                  if ( nRcdDeleted_451 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1P3451( ) ;
                     load1P3451( ) ;
                     beforeValidate1P3451( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1P3451( ) ;
                        O326DevGenPie = A326DevGenPie ;
                        n326DevGenPie = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                        O328DevGenUni = A328DevGenUni ;
                        n328DevGenUni = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                        O54AlbRPieUti = A54AlbRPieUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                        O60AlbRUniUti = A60AlbRUniUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        O3066AlbDevPUni = A3066AlbDevPUni ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                        O5278AlbDevPPie = A5278AlbDevPPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                        OV14KilAnt = AV14KilAnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                        OV15MetAnt = AV15MetAnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                        OV16PieAnt = AV16PieAnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                        OV17Kilos = AV17Kilos ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                        OV18Metros = AV18Metros ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                        OV19Piezas = AV19Piezas ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                        OV9AlbRPieDis = AV9AlbRPieDis ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                        OV10AlbRUniDis = AV10AlbRUniDis ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                        O47AlbREst = A47AlbREst ;
                        httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_451 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1P3451( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1P3451( ) ;
                           closeExtendedTableCursors1P3451( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O326DevGenPie = A326DevGenPie ;
                           n326DevGenPie = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                           O328DevGenUni = A328DevGenUni ;
                           n328DevGenUni = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                           O54AlbRPieUti = A54AlbRPieUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                           O60AlbRUniUti = A60AlbRUniUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           O3066AlbDevPUni = A3066AlbDevPUni ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                           O5278AlbDevPPie = A5278AlbDevPPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                           OV14KilAnt = AV14KilAnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                           OV15MetAnt = AV15MetAnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                           OV16PieAnt = AV16PieAnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                           OV17Kilos = AV17Kilos ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                           OV18Metros = AV18Metros ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                           OV19Piezas = AV19Piezas ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                           OV9AlbRPieDis = AV9AlbRPieDis ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                           OV10AlbRUniDis = AV10AlbRUniDis ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                           O47AlbREst = A47AlbREst ;
                           httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_451 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevPieUni_Internalname, GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_181_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z3067DevPieUni_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_181_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3067DevPieUni_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2156AlbRecKgmU_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2158AlbRecMtrU_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_451_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_451_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_451_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_451 != 0 )
         {
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVPIEUNI_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevPieUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O326DevGenPie = s326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      O328DevGenUni = s328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      O54AlbRPieUti = s54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = s60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O3066AlbDevPUni = s3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      O5278AlbDevPPie = s5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      OV14KilAnt = sV14KilAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      OV15MetAnt = sV15MetAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      OV16PieAnt = sV16PieAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      OV17Kilos = sV17Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      OV18Metros = sV18Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      OV19Piezas = sV19Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      OV9AlbRPieDis = sV9AlbRPieDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      OV10AlbRUniDis = sV10AlbRUniDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      O47AlbREst = s47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      /* Start of After( level) rules */
      if ( ( DecimalUtil.compareTo(A328DevGenUni, A3066AlbDevPUni) != 0 ) && ( A3066AlbDevPUni.doubleValue() != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma las unidades", ""), 0, "");
      }
      if ( ( A326DevGenPie != A5278AlbDevPPie ) && ( A5278AlbDevPPie != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma la cantidad de piezas", ""), 0, "");
      }
      /* End of After( level) rules */
   }

   public void resetCaption1P30( )
   {
   }

   public void e121P32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevpie2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevpie2_impl.this.A396EmprCod = GXv_char2[0] ;
      tdevpie2_impl.this.AV7EmprNom = GXv_char3[0] ;
      tdevpie2_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdevpie2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char4[0] = AV75EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdevpie2_impl.this.AV75EmprCod = GXv_char4[0] ;
      tdevpie2_impl.this.AV7EmprNom = GXv_char3[0] ;
      tdevpie2_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75EmprCod", AV75EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV77WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV77WWPContext = GXv_SdtWWPContext5[0] ;
      AV78TrnContext.fromxml(AV79WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV78TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV84Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV85GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GXV1), 8, 0));
         while ( AV85GXV1 <= AV78TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV82TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV78TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV85GXV1));
            if ( GXutil.strcmp(AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "AlbRecCod") == 0 )
            {
               AV80Insert_AlbRecCod = (int)(GXutil.lval( AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80Insert_AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Insert_AlbRecCod), 8, 0));
            }
            else if ( GXutil.strcmp(AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "DevGenTrn") == 0 )
            {
               AV81Insert_DevGenTrn = (short)(GXutil.lval( AV82TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV81Insert_DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Insert_DevGenTrn), 4, 0));
            }
            AV85GXV1 = (int)(AV85GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GXV1), 8, 0));
         }
      }
   }

   public void e131P32( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV78TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tdevpie2ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(11);
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1P331( int GX_JID )
   {
      if ( ( GX_JID == 68 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z325DevGenFec = T01P37_A325DevGenFec[0] ;
            Z6288DevGenDom = T01P37_A6288DevGenDom[0] ;
            Z328DevGenUni = T01P37_A328DevGenUni[0] ;
            Z326DevGenPie = T01P37_A326DevGenPie[0] ;
            Z324DevGenEst = T01P37_A324DevGenEst[0] ;
            Z1304DevUlin = T01P37_A1304DevUlin[0] ;
            Z44AlbRecCod = T01P37_A44AlbRecCod[0] ;
            Z327DevGenTrn = T01P37_A327DevGenTrn[0] ;
         }
         else
         {
            Z325DevGenFec = A325DevGenFec ;
            Z6288DevGenDom = A6288DevGenDom ;
            Z328DevGenUni = A328DevGenUni ;
            Z326DevGenPie = A326DevGenPie ;
            Z324DevGenEst = A324DevGenEst ;
            Z1304DevUlin = A1304DevUlin ;
            Z44AlbRecCod = A44AlbRecCod ;
            Z327DevGenTrn = A327DevGenTrn ;
         }
      }
      if ( ( GX_JID == 70 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T01P310_A47AlbREst[0] ;
         Z252CliCod = T01P310_A252CliCod[0] ;
         Z45AlbRef = T01P310_A45AlbRef[0] ;
         Z56AlbRUni = T01P310_A56AlbRUni[0] ;
         Z60AlbRUniUti = T01P310_A60AlbRUniUti[0] ;
         Z52AlbRPieEnt = T01P310_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T01P310_A58AlbRUniEnt[0] ;
      }
      if ( GX_JID == -68 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z252CliCod = A252CliCod ;
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z407EmprNom = A407EmprNom ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z279CliNom = A279CliNom ;
         Z329DevTrnNom = A329DevTrnNom ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      dynDevGenTrn.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Enabled", GXutil.ltrimstr( dynDevGenTrn.getEnabled(), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtDevGenFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenFec_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtDevGenDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenDom_Enabled), 5, 0), true);
      AV84Pgmname = "TDevPie2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      dynDevGenTrn.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Enabled", GXutil.ltrimstr( dynDevGenTrn.getEnabled(), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtDevGenFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenFec_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtDevGenDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenDom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV75EmprCod)==0) )
      {
         A396EmprCod = AV75EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01P38 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01P38_A407EmprNom[0] ;
      n407EmprNom = T01P38_n407EmprNom[0] ;
      pr_default.close(6);
      gxadevgentrn_html1P331( A396EmprCod) ;
      if ( ! (0==AV76DevGenCod) )
      {
         A323DevGenCod = AV76DevGenCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
      if ( ! (0==AV76DevGenCod) )
      {
         edtDevGenCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDevGenCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV76DevGenCod) )
      {
         edtDevGenCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isUpd( )  )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV81Insert_DevGenTrn) )
      {
         A327DevGenTrn = AV81Insert_DevGenTrn ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV80Insert_AlbRecCod) )
      {
         A44AlbRecCod = AV80Insert_AlbRecCod ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
         /* Using cursor T01P312 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = T01P312_A329DevTrnNom[0] ;
         n329DevTrnNom = T01P312_n329DevTrnNom[0] ;
         pr_default.close(10);
         /* Using cursor T01P314 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            A3066AlbDevPUni = T01P314_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = T01P314_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            A5278AlbDevPPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         O3066AlbDevPUni = A3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         O5278AlbDevPPie = A5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         pr_default.close(11);
         /* Using cursor T01P310 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         zm1P331( 70) ;
         A54AlbRPieUti = T01P310_A54AlbRPieUti[0] ;
         A47AlbREst = T01P310_A47AlbREst[0] ;
         A252CliCod = T01P310_A252CliCod[0] ;
         n252CliCod = T01P310_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = T01P310_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A56AlbRUni = T01P310_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A60AlbRUniUti = T01P310_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = T01P310_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T01P310_A58AlbRUniEnt[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(8);
         /* Using cursor T01P311 */
         pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01P311_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(9);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
      }
   }

   public void load1P331( )
   {
      /* Using cursor T01P316 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A54AlbRPieUti = T01P316_A54AlbRPieUti[0] ;
         A47AlbREst = T01P316_A47AlbREst[0] ;
         A407EmprNom = T01P316_A407EmprNom[0] ;
         n407EmprNom = T01P316_n407EmprNom[0] ;
         A325DevGenFec = T01P316_A325DevGenFec[0] ;
         n325DevGenFec = T01P316_n325DevGenFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         A6288DevGenDom = T01P316_A6288DevGenDom[0] ;
         n6288DevGenDom = T01P316_n6288DevGenDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         A252CliCod = T01P316_A252CliCod[0] ;
         n252CliCod = T01P316_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T01P316_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = T01P316_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A329DevTrnNom = T01P316_A329DevTrnNom[0] ;
         n329DevTrnNom = T01P316_n329DevTrnNom[0] ;
         A56AlbRUni = T01P316_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A328DevGenUni = T01P316_A328DevGenUni[0] ;
         n328DevGenUni = T01P316_n328DevGenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A326DevGenPie = T01P316_A326DevGenPie[0] ;
         n326DevGenPie = T01P316_n326DevGenPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A60AlbRUniUti = T01P316_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = T01P316_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T01P316_A58AlbRUniEnt[0] ;
         A324DevGenEst = T01P316_A324DevGenEst[0] ;
         n324DevGenEst = T01P316_n324DevGenEst[0] ;
         A1304DevUlin = T01P316_A1304DevUlin[0] ;
         n1304DevUlin = T01P316_n1304DevUlin[0] ;
         A44AlbRecCod = T01P316_A44AlbRecCod[0] ;
         n44AlbRecCod = T01P316_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A327DevGenTrn = T01P316_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P316_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         A3066AlbDevPUni = T01P316_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01P316_A5278AlbDevPPie[0] ;
         zm1P331( -68) ;
      }
      pr_default.close(12);
      onLoadActions1P331( ) ;
   }

   public void onLoadActions1P331( )
   {
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O3066AlbDevPUni = A3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      O5278AlbDevPPie = A5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( true )
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         }
      }
      AV16PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV19Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
   }

   public void checkExtendedTable1P331( )
   {
      nIsDirty_31 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      if ( true )
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         }
      }
      AV16PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV19Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 0, "");
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A44AlbRecCod ;
         GXv_int7[0] = AV9AlbRPieDis ;
         GXv_decimal8[0] = AV10AlbRUniDis ;
         GXv_int9[0] = AV11AlbRPDis ;
         GXv_decimal10[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_decimal8, GXv_int9, GXv_decimal10, GXv_char3) ;
         tdevpie2_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevpie2_impl.this.A44AlbRecCod = GXv_int6[0] ;
         tdevpie2_impl.this.AV9AlbRPieDis = GXv_int7[0] ;
         tdevpie2_impl.this.AV10AlbRUniDis = GXv_decimal8[0] ;
         tdevpie2_impl.this.AV11AlbRPDis = GXv_int9[0] ;
         tdevpie2_impl.this.AV12AlbRUDis = GXv_decimal10[0] ;
         tdevpie2_impl.this.AV13AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      }
      /* Using cursor T01P310 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A54AlbRPieUti = T01P310_A54AlbRPieUti[0] ;
      A47AlbREst = T01P310_A47AlbREst[0] ;
      A252CliCod = T01P310_A252CliCod[0] ;
      n252CliCod = T01P310_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A45AlbRef = T01P310_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A56AlbRUni = T01P310_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A60AlbRUniUti = T01P310_A60AlbRUniUti[0] ;
      A52AlbRPieEnt = T01P310_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01P310_A58AlbRUniEnt[0] ;
      nIsDirty_31 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      nIsDirty_31 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      pr_default.close(8);
      if ( isDlt( )  )
      {
         nIsDirty_31 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_31 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      nIsDirty_31 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_31 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_31 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_31 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         nIsDirty_31 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            nIsDirty_31 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      /* Using cursor T01P311 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P311_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(9);
      /* Using cursor T01P312 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
         }
      }
      A329DevTrnNom = T01P312_A329DevTrnNom[0] ;
      n329DevTrnNom = T01P312_n329DevTrnNom[0] ;
      pr_default.close(10);
      /* Using cursor T01P314 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A3066AlbDevPUni = T01P314_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01P314_A5278AlbDevPPie[0] ;
      }
      else
      {
         nIsDirty_31 = (short)(1) ;
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         nIsDirty_31 = (short)(1) ;
         A5278AlbDevPPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      pr_default.close(11);
   }

   public void closeExtendedTableCursors1P331( )
   {
      pr_default.close(7);
      pr_default.close(9);
      pr_default.close(10);
      pr_default.close(11);
   }

   public void enableDisable( )
   {
   }

   public void gxload_70( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01P310 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A54AlbRPieUti = T01P310_A54AlbRPieUti[0] ;
      A47AlbREst = T01P310_A47AlbREst[0] ;
      A252CliCod = T01P310_A252CliCod[0] ;
      n252CliCod = T01P310_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A45AlbRef = T01P310_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A56AlbRUni = T01P310_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A60AlbRUniUti = T01P310_A60AlbRUniUti[0] ;
      A52AlbRPieEnt = T01P310_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01P310_A58AlbRUniEnt[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_71( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01P317 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P317_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_72( String A396EmprCod ,
                          short A327DevGenTrn )
   {
      /* Using cursor T01P318 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
         }
      }
      A329DevTrnNom = T01P318_A329DevTrnNom[0] ;
      n329DevTrnNom = T01P318_n329DevTrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A329DevTrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_73( String A396EmprCod ,
                          int A323DevGenCod )
   {
      /* Using cursor T01P320 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A3066AlbDevPUni = T01P320_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01P320_A5278AlbDevPPie[0] ;
      }
      else
      {
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1P331( )
   {
      /* Using cursor T01P321 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01P37 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01P37_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P331( 68) ;
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01P37_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         A325DevGenFec = T01P37_A325DevGenFec[0] ;
         n325DevGenFec = T01P37_n325DevGenFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         A6288DevGenDom = T01P37_A6288DevGenDom[0] ;
         n6288DevGenDom = T01P37_n6288DevGenDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         A328DevGenUni = T01P37_A328DevGenUni[0] ;
         n328DevGenUni = T01P37_n328DevGenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A326DevGenPie = T01P37_A326DevGenPie[0] ;
         n326DevGenPie = T01P37_n326DevGenPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A324DevGenEst = T01P37_A324DevGenEst[0] ;
         n324DevGenEst = T01P37_n324DevGenEst[0] ;
         A1304DevUlin = T01P37_A1304DevUlin[0] ;
         n1304DevUlin = T01P37_n1304DevUlin[0] ;
         A44AlbRecCod = T01P37_A44AlbRecCod[0] ;
         n44AlbRecCod = T01P37_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A327DevGenTrn = T01P37_A327DevGenTrn[0] ;
         n327DevGenTrn = T01P37_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P331( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey1P331( ) ;
         }
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey1P331( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1P331( ) ;
      if ( RcdFound31 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T01P322 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T01P322_A323DevGenCod[0] < A323DevGenCod ) ) && ( GXutil.strcmp(T01P322_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T01P322_A323DevGenCod[0] > A323DevGenCod ) ) && ( GXutil.strcmp(T01P322_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A323DevGenCod = T01P322_A323DevGenCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T01P323 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01P323_A323DevGenCod[0] > A323DevGenCod ) ) && ( GXutil.strcmp(T01P323_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01P323_A323DevGenCod[0] < A323DevGenCod ) ) && ( GXutil.strcmp(T01P323_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A323DevGenCod = T01P323_A323DevGenCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1P331( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A326DevGenPie = O326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = O328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A3066AlbDevPUni = O3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = O5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         AV14KilAnt = OV14KilAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         AV15MetAnt = OV15MetAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         AV16PieAnt = OV16PieAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         AV17Kilos = OV17Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         AV18Metros = OV18Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         AV19Piezas = OV19Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         AV9AlbRPieDis = OV9AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         AV10AlbRUniDis = OV10AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         A47AlbREst = O47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1P331( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound31 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
            {
               A323DevGenCod = Z323DevGenCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEVGENCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A3066AlbDevPUni = O3066AlbDevPUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               AV14KilAnt = OV14KilAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
               AV15MetAnt = OV15MetAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
               AV16PieAnt = OV16PieAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
               AV17Kilos = OV17Kilos ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
               AV18Metros = OV18Metros ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
               AV19Piezas = OV19Piezas ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
               AV9AlbRPieDis = OV9AlbRPieDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
               AV10AlbRUniDis = OV10AlbRUniDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A3066AlbDevPUni = O3066AlbDevPUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               AV14KilAnt = OV14KilAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
               AV15MetAnt = OV15MetAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
               AV16PieAnt = OV16PieAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
               AV17Kilos = OV17Kilos ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
               AV18Metros = OV18Metros ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
               AV19Piezas = OV19Piezas ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
               AV9AlbRPieDis = OV9AlbRPieDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
               AV10AlbRUniDis = OV10AlbRUniDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               update1P331( ) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
            {
               /* Insert record */
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A3066AlbDevPUni = O3066AlbDevPUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               AV14KilAnt = OV14KilAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
               AV15MetAnt = OV15MetAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
               AV16PieAnt = OV16PieAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
               AV17Kilos = OV17Kilos ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
               AV18Metros = OV18Metros ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
               AV19Piezas = OV19Piezas ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
               AV9AlbRPieDis = OV9AlbRPieDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
               AV10AlbRUniDis = OV10AlbRUniDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1P331( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEVGENCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevGenCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A326DevGenPie = O326DevGenPie ;
                  n326DevGenPie = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                  A328DevGenUni = O328DevGenUni ;
                  n328DevGenUni = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                  A54AlbRPieUti = O54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  A60AlbRUniUti = O60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  A3066AlbDevPUni = O3066AlbDevPUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                  A5278AlbDevPPie = O5278AlbDevPPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                  AV14KilAnt = OV14KilAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                  AV15MetAnt = OV15MetAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                  AV16PieAnt = OV16PieAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                  AV17Kilos = OV17Kilos ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                  AV18Metros = OV18Metros ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                  AV19Piezas = OV19Piezas ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                  AV9AlbRPieDis = OV9AlbRPieDis ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                  AV10AlbRUniDis = OV10AlbRUniDis ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                  A47AlbREst = O47AlbREst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  GX_FocusControl = edtDevGenCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1P331( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
      {
         A323DevGenCod = Z323DevGenCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEVGENCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A326DevGenPie = O326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = O328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A3066AlbDevPUni = O3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = O5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         AV14KilAnt = OV14KilAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         AV15MetAnt = OV15MetAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         AV16PieAnt = OV16PieAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         AV17Kilos = OV17Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         AV18Metros = OV18Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         AV19Piezas = OV19Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         AV9AlbRPieDis = OV9AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         AV10AlbRUniDis = OV10AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         A47AlbREst = O47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1P331( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P36 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(T01P36_A325DevGenFec[0])) ) || ( Z6288DevGenDom != T01P36_A6288DevGenDom[0] ) || ( DecimalUtil.compareTo(Z328DevGenUni, T01P36_A328DevGenUni[0]) != 0 ) || ( Z326DevGenPie != T01P36_A326DevGenPie[0] ) || ( Z324DevGenEst != T01P36_A324DevGenEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1304DevUlin != T01P36_A1304DevUlin[0] ) || ( Z44AlbRecCod != T01P36_A44AlbRecCod[0] ) || ( Z327DevGenTrn != T01P36_A327DevGenTrn[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(T01P36_A325DevGenFec[0])) ) )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"DevGenFec");
               GXutil.writeLogRaw("Old: ",Z325DevGenFec);
               GXutil.writeLogRaw("Current: ",T01P36_A325DevGenFec[0]);
            }
            if ( Z6288DevGenDom != T01P36_A6288DevGenDom[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"DevGenDom");
               GXutil.writeLogRaw("Old: ",Z6288DevGenDom);
               GXutil.writeLogRaw("Current: ",T01P36_A6288DevGenDom[0]);
            }
            if ( DecimalUtil.compareTo(Z328DevGenUni, T01P36_A328DevGenUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"DevGenUni");
               GXutil.writeLogRaw("Old: ",Z328DevGenUni);
               GXutil.writeLogRaw("Current: ",T01P36_A328DevGenUni[0]);
            }
            if ( Z326DevGenPie != T01P36_A326DevGenPie[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"DevGenPie");
               GXutil.writeLogRaw("Old: ",Z326DevGenPie);
               GXutil.writeLogRaw("Current: ",T01P36_A326DevGenPie[0]);
            }
            if ( Z324DevGenEst != T01P36_A324DevGenEst[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"DevGenEst");
               GXutil.writeLogRaw("Old: ",Z324DevGenEst);
               GXutil.writeLogRaw("Current: ",T01P36_A324DevGenEst[0]);
            }
            if ( Z1304DevUlin != T01P36_A1304DevUlin[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"DevUlin");
               GXutil.writeLogRaw("Old: ",Z1304DevUlin);
               GXutil.writeLogRaw("Current: ",T01P36_A1304DevUlin[0]);
            }
            if ( Z44AlbRecCod != T01P36_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01P36_A44AlbRecCod[0]);
            }
            if ( Z327DevGenTrn != T01P36_A327DevGenTrn[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"DevGenTrn");
               GXutil.writeLogRaw("Old: ",Z327DevGenTrn);
               GXutil.writeLogRaw("Current: ",T01P36_A327DevGenTrn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01P324 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(19) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != T01P324_A47AlbREst[0] ) || ( Z252CliCod != T01P324_A252CliCod[0] ) || ( GXutil.strcmp(Z45AlbRef, T01P324_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, T01P324_A56AlbRUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01P324_A60AlbRUniUti[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z52AlbRPieEnt != T01P324_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01P324_A58AlbRUniEnt[0]) != 0 ) )
         {
            if ( Z47AlbREst != T01P324_A47AlbREst[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01P324_A47AlbREst[0]);
            }
            if ( Z252CliCod != T01P324_A252CliCod[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01P324_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01P324_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01P324_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01P324_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01P324_A56AlbRUni[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01P324_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01P324_A60AlbRUniUti[0]);
            }
            if ( Z52AlbRPieEnt != T01P324_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01P324_A52AlbRPieEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01P324_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01P324_A58AlbRUniEnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P331( )
   {
      beforeValidate1P331( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P331( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P331( 0) ;
         checkOptimisticConcurrency1P331( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P331( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P331( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P325 */
                  pr_default.execute(20, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A323DevGenCod), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(20) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P331( ) ;
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P331( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1P30( ) ;
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
            load1P331( ) ;
         }
         endLevel1P331( ) ;
      }
      closeExtendedTableCursors1P331( ) ;
   }

   public void update1P331( )
   {
      beforeValidate1P331( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P331( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P331( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P331( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P331( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P326 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn), A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P331( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P331( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P331( ) ;
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
         endLevel1P331( ) ;
      }
      closeExtendedTableCursors1P331( ) ;
   }

   public void deferredUpdate1P331( )
   {
   }

   public void delete( )
   {
      beforeValidate1P331( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P331( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P331( ) ;
         afterConfirm1P331( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P331( ) ;
            if ( AnyError == 0 )
            {
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A3066AlbDevPUni = O3066AlbDevPUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               AV14KilAnt = OV14KilAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
               AV15MetAnt = OV15MetAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
               AV16PieAnt = OV16PieAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
               AV17Kilos = OV17Kilos ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
               AV18Metros = OV18Metros ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
               AV19Piezas = OV19Piezas ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
               AV9AlbRPieDis = OV9AlbRPieDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
               AV10AlbRUniDis = OV10AlbRUniDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               scanStart1P3451( ) ;
               while ( RcdFound451 != 0 )
               {
                  getByPrimaryKey1P3451( ) ;
                  delete1P3451( ) ;
                  scanNext1P3451( ) ;
                  O326DevGenPie = A326DevGenPie ;
                  n326DevGenPie = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                  O328DevGenUni = A328DevGenUni ;
                  n328DevGenUni = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                  O54AlbRPieUti = A54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  O60AlbRUniUti = A60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  O3066AlbDevPUni = A3066AlbDevPUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                  O5278AlbDevPPie = A5278AlbDevPPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                  OV14KilAnt = AV14KilAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                  OV15MetAnt = AV15MetAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                  OV16PieAnt = AV16PieAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                  OV17Kilos = AV17Kilos ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                  OV18Metros = AV18Metros ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                  OV19Piezas = AV19Piezas ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                  OV9AlbRPieDis = AV9AlbRPieDis ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                  OV10AlbRUniDis = AV10AlbRUniDis ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                  O47AlbREst = A47AlbREst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               scanEnd1P3451( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P327 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P331( ) ;
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
      sMode31 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1P331( ) ;
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P331( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true )
         {
            AV10AlbRUniDis = A57AlbRUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
         else
         {
            if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
            {
               AV10AlbRUniDis = AV12AlbRUDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
            }
         }
         if ( true )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
            {
               AV14KilAnt = O328DevGenUni ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
            }
         }
         if ( true )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
            {
               AV15MetAnt = O328DevGenUni ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
            }
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV17Kilos = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV18Metros = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         }
         if ( true )
         {
            AV9AlbRPieDis = A51AlbRPieDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         }
         else
         {
            if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
            {
               AV9AlbRPieDis = AV11AlbRPDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
            }
         }
         AV16PieAnt = O326DevGenPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         AV19Piezas = A326DevGenPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         /* Using cursor T01P328 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T01P328_A47AlbREst[0] ;
         Z252CliCod = T01P328_A252CliCod[0] ;
         Z45AlbRef = T01P328_A45AlbRef[0] ;
         Z56AlbRUni = T01P328_A56AlbRUni[0] ;
         Z60AlbRUniUti = T01P328_A60AlbRUniUti[0] ;
         Z52AlbRPieEnt = T01P328_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T01P328_A58AlbRUniEnt[0] ;
         A54AlbRPieUti = T01P328_A54AlbRPieUti[0] ;
         A47AlbREst = T01P328_A47AlbREst[0] ;
         A252CliCod = T01P328_A252CliCod[0] ;
         n252CliCod = T01P328_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = T01P328_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A56AlbRUni = T01P328_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A60AlbRUniUti = T01P328_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = T01P328_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T01P328_A58AlbRUniEnt[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         pr_default.close(23);
         if ( isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
         /* Using cursor T01P329 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01P329_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(24);
         /* Using cursor T01P330 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = T01P330_A329DevTrnNom[0] ;
         n329DevTrnNom = T01P330_n329DevTrnNom[0] ;
         pr_default.close(25);
         /* Using cursor T01P332 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A3066AlbDevPUni = T01P332_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = T01P332_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            A5278AlbDevPPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         pr_default.close(26);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01P333 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOBS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
      }
   }

   public void processNestedLevel1P3451( )
   {
      s326DevGenPie = O326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      s328DevGenUni = O328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s3066AlbDevPUni = O3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      s5278AlbDevPPie = O5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      sV14KilAnt = OV14KilAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      sV15MetAnt = OV15MetAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      sV16PieAnt = OV16PieAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      sV17Kilos = OV17Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      sV18Metros = OV18Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      sV19Piezas = OV19Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      sV9AlbRPieDis = OV9AlbRPieDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      sV10AlbRUniDis = OV10AlbRUniDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      s47AlbREst = O47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      nGXsfl_181_idx = 0 ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         readRow1P3451( ) ;
         if ( ( nRcdExists_451 != 0 ) || ( nIsMod_451 != 0 ) )
         {
            standaloneNotModal1P3451( ) ;
            getKey1P3451( ) ;
            if ( ( nRcdExists_451 == 0 ) && ( nRcdDeleted_451 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1P3451( ) ;
            }
            else
            {
               if ( RcdFound451 != 0 )
               {
                  if ( ( nRcdDeleted_451 != 0 ) && ( nRcdExists_451 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1P3451( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_451 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1P3451( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_451 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O326DevGenPie = A326DevGenPie ;
            n326DevGenPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
            O328DevGenUni = A328DevGenUni ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            O54AlbRPieUti = A54AlbRPieUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            O60AlbRUniUti = A60AlbRUniUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            O3066AlbDevPUni = A3066AlbDevPUni ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            O5278AlbDevPPie = A5278AlbDevPPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
            OV14KilAnt = AV14KilAnt ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
            OV15MetAnt = AV15MetAnt ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
            OV16PieAnt = AV16PieAnt ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
            OV17Kilos = AV17Kilos ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
            OV18Metros = AV18Metros ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
            OV19Piezas = AV19Piezas ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
            OV9AlbRPieDis = AV9AlbRPieDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
            OV10AlbRUniDis = AV10AlbRUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
            O47AlbREst = A47AlbREst ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevPieUni_Internalname, GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_181_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z3067DevPieUni_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_181_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3067DevPieUni_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2156AlbRecKgmU_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2158AlbRecMtrU_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( O2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_451_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_451_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_451_"+sGXsfl_181_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_451 != 0 )
         {
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVPIEUNI_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevPieUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      if ( ( DecimalUtil.compareTo(A328DevGenUni, A3066AlbDevPUni) != 0 ) && ( A3066AlbDevPUni.doubleValue() != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma las unidades", ""), 0, "");
      }
      if ( ( A326DevGenPie != A5278AlbDevPPie ) && ( A5278AlbDevPPie != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma la cantidad de piezas", ""), 0, "");
      }
      /* End of After( level) rules */
      initAll1P3451( ) ;
      if ( AnyError != 0 )
      {
         O326DevGenPie = s326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         O328DevGenUni = s328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O3066AlbDevPUni = s3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         O5278AlbDevPPie = s5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         OV14KilAnt = sV14KilAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         OV15MetAnt = sV15MetAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         OV16PieAnt = sV16PieAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         OV17Kilos = sV17Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         OV18Metros = sV18Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         OV19Piezas = sV19Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         OV9AlbRPieDis = sV9AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         OV10AlbRUniDis = sV10AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         O47AlbREst = s47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      nRcdExists_451 = (short)(0) ;
      nIsMod_451 = (short)(0) ;
      nRcdDeleted_451 = (short)(0) ;
   }

   public void processLevel1P331( )
   {
      /* Save parent mode. */
      sMode31 = Gx_mode ;
      processNestedLevel1P3451( ) ;
      if ( AnyError != 0 )
      {
         O326DevGenPie = s326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         O328DevGenUni = s328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O3066AlbDevPUni = s3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         O5278AlbDevPPie = s5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         OV14KilAnt = sV14KilAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         OV15MetAnt = sV15MetAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         OV16PieAnt = sV16PieAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         OV17Kilos = sV17Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         OV18Metros = sV18Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         OV19Piezas = sV19Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         OV9AlbRPieDis = sV9AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         OV10AlbRUniDis = sV10AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         O47AlbREst = s47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01P334 */
      pr_default.execute(28, new Object[] {Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n328DevGenUni), A328DevGenUni, A396EmprCod, Integer.valueOf(A323DevGenCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
      /* Using cursor T01P335 */
      pr_default.execute(29, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void updateTablesN11P331( )
   {
      /* Using cursor T01P336 */
      pr_default.execute(30, new Object[] {Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1P331( )
   {
      pr_default.close(4);
      pr_default.close(19);
      if ( AnyError == 0 )
      {
         beforeComplete1P331( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdevpie2");
         if ( AnyError == 0 )
         {
            confirmValues1P30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevpie2");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1P331( )
   {
      /* Scan By routine */
      /* Using cursor T01P337 */
      pr_default.execute(31, new Object[] {A396EmprCod});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01P337_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P331( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01P337_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
   }

   public void scanEnd1P331( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1P331( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P331( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P331( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P331( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P331( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P331( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P331( )
   {
      edtDevGenCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      edtDevGenFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenFec_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtDevGenDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenDom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      dynDevGenTrn.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Enabled", GXutil.ltrimstr( dynDevGenTrn.getEnabled(), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
   }

   public void zm1P3451( int GX_JID )
   {
      if ( ( GX_JID == 74 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3067DevPieUni = T01P33_A3067DevPieUni[0] ;
         }
         else
         {
            Z3067DevPieUni = A3067DevPieUni ;
         }
      }
      if ( ( GX_JID == 75 ) || ( GX_JID == 0 ) )
      {
         Z4795AlRPieCal = T01P35_A4795AlRPieCal[0] ;
         Z2155AlbRecKgm = T01P35_A2155AlbRecKgm[0] ;
         Z2157AlbRecMtr = T01P35_A2157AlbRecMtr[0] ;
      }
      if ( GX_JID == -74 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z3067DevPieUni = A3067DevPieUni ;
         Z396EmprCod = A396EmprCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z2158AlbRecMtrU = A2158AlbRecMtrU ;
         Z2156AlbRecKgmU = A2156AlbRecKgmU ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
         Z44AlbRecCod = A44AlbRecCod ;
      }
   }

   public void standaloneNotModal1P3451( )
   {
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
   }

   public void standaloneModal1P3451( )
   {
      if ( true /* Level */ && isIns( )  )
      {
         A326DevGenPie = (short)(O326DevGenPie+1) ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      }
      else
      {
         if ( true /* Level */ && isDlt( )  )
         {
            A326DevGenPie = (short)(O326DevGenPie-1) ;
            n326DevGenPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         }
      }
      if ( isIns( )  || isUpd( )  || isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      AV16PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV19Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      if ( true )
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         }
      }
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 0, "");
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
      else
      {
         edtAlbRecPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      }
   }

   public void load1P3451( )
   {
      /* Using cursor T01P338 */
      pr_default.execute(32, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A323DevGenCod), A396EmprCod, A2159AlbRecPie});
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A4795AlRPieCal = T01P338_A4795AlRPieCal[0] ;
         A3067DevPieUni = T01P338_A3067DevPieUni[0] ;
         A2158AlbRecMtrU = T01P338_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T01P338_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = T01P338_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = T01P338_A2157AlbRecMtr[0] ;
         zm1P3451( -74) ;
      }
      pr_default.close(32);
      onLoadActions1P3451( ) ;
   }

   public void onLoadActions1P3451( )
   {
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) >= 0 ) )
      {
         A3067DevPieUni = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      }
      else
      {
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) >= 0 ) )
         {
            A3067DevPieUni = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         }
      }
      if ( isIns( )  )
      {
         A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5278AlbDevPPie = O5278AlbDevPPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            }
         }
      }
      if ( isDlt( )  )
      {
         A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
      }
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrimstr( AV63oldUni, 9, 2));
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
      {
         A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(A3067DevPieUni) ;
            }
         }
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(A3067DevPieUni) ;
            }
         }
      }
   }

   public void checkExtendedTable1P3451( )
   {
      nIsDirty_451 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1P3451( ) ;
      /* Using cursor T01P35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBDET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4795AlRPieCal = T01P35_A4795AlRPieCal[0] ;
      A2158AlbRecMtrU = T01P35_A2158AlbRecMtrU[0] ;
      A2156AlbRecKgmU = T01P35_A2156AlbRecKgmU[0] ;
      A2155AlbRecKgm = T01P35_A2155AlbRecKgm[0] ;
      A2157AlbRecMtr = T01P35_A2157AlbRecMtr[0] ;
      nIsDirty_451 = (short)(1) ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      nIsDirty_451 = (short)(1) ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      pr_default.close(3);
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) >= 0 ) )
      {
         nIsDirty_451 = (short)(1) ;
         A3067DevPieUni = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      }
      else
      {
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) >= 0 ) )
         {
            nIsDirty_451 = (short)(1) ;
            A3067DevPieUni = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A5278AlbDevPPie = O5278AlbDevPPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_451 = (short)(1) ;
               A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_451 = (short)(1) ;
               A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            }
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      if ( isDlt( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrimstr( AV63oldUni, 9, 2));
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
      {
         nIsDirty_451 = (short)(1) ;
         A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            nIsDirty_451 = (short)(1) ;
            A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               nIsDirty_451 = (short)(1) ;
               A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(A3067DevPieUni) ;
            }
         }
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de kilos no suficientes", ""), 0, "");
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         nIsDirty_451 = (short)(1) ;
         A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            nIsDirty_451 = (short)(1) ;
            A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               nIsDirty_451 = (short)(1) ;
               A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(A3067DevPieUni) ;
            }
         }
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de metros no suficientes", ""), 0, "");
      }
   }

   public void closeExtendedTableCursors1P3451( )
   {
      pr_default.close(2);
   }

   public void enableDisable1P3451( )
   {
   }

   public void gxload_75( String A396EmprCod ,
                          int A44AlbRecCod ,
                          String A2159AlbRecPie )
   {
      /* Using cursor T01P35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBDET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4795AlRPieCal = T01P35_A4795AlRPieCal[0] ;
      A2158AlbRecMtrU = T01P35_A2158AlbRecMtrU[0] ;
      A2156AlbRecKgmU = T01P35_A2156AlbRecKgmU[0] ;
      A2155AlbRecKgm = T01P35_A2155AlbRecKgm[0] ;
      A2157AlbRecMtr = T01P35_A2157AlbRecMtr[0] ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4795AlRPieCal))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKey1P3451( )
   {
      /* Using cursor T01P339 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound451 = (short)(1) ;
      }
      else
      {
         RcdFound451 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey1P3451( )
   {
      /* Using cursor T01P33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01P33_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1P3451( 74) ;
         RcdFound451 = (short)(1) ;
         initializeNonKey1P3451( ) ;
         A3067DevPieUni = T01P33_A3067DevPieUni[0] ;
         A2159AlbRecPie = T01P33_A2159AlbRecPie[0] ;
         O3067DevPieUni = A3067DevPieUni ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode451 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P3451( ) ;
         Gx_mode = sMode451 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound451 = (short)(0) ;
         initializeNonKey1P3451( ) ;
         sMode451 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1P3451( ) ;
         Gx_mode = sMode451 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1P3451( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1P3451( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDevPie"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z3067DevPieUni, T01P32_A3067DevPieUni[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3067DevPieUni, T01P32_A3067DevPieUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"DevPieUni");
               GXutil.writeLogRaw("Old: ",Z3067DevPieUni);
               GXutil.writeLogRaw("Current: ",T01P32_A3067DevPieUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDevPie"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01P340 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(34) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z4795AlRPieCal, T01P340_A4795AlRPieCal[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, T01P340_A2155AlbRecKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, T01P340_A2157AlbRecMtr[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4795AlRPieCal, T01P340_A4795AlRPieCal[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlRPieCal");
               GXutil.writeLogRaw("Old: ",Z4795AlRPieCal);
               GXutil.writeLogRaw("Current: ",T01P340_A4795AlRPieCal[0]);
            }
            if ( DecimalUtil.compareTo(Z2155AlbRecKgm, T01P340_A2155AlbRecKgm[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbRecKgm");
               GXutil.writeLogRaw("Old: ",Z2155AlbRecKgm);
               GXutil.writeLogRaw("Current: ",T01P340_A2155AlbRecKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z2157AlbRecMtr, T01P340_A2157AlbRecMtr[0]) != 0 )
            {
               GXutil.writeLogln("tdevpie2:[seudo value changed for attri]"+"AlbRecMtr");
               GXutil.writeLogRaw("Old: ",Z2157AlbRecMtr);
               GXutil.writeLogRaw("Current: ",T01P340_A2157AlbRecMtr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P3451( )
   {
      beforeValidate1P3451( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P3451( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P3451( 0) ;
         checkOptimisticConcurrency1P3451( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P3451( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P3451( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P341 */
                  pr_default.execute(35, new Object[] {Integer.valueOf(A323DevGenCod), A3067DevPieUni, A396EmprCod, A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
                  if ( (pr_default.getStatus(35) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11P3451( ) ;
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
            load1P3451( ) ;
         }
         endLevel1P3451( ) ;
      }
      closeExtendedTableCursors1P3451( ) ;
   }

   public void update1P3451( )
   {
      beforeValidate1P3451( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P3451( ) ;
      }
      if ( ( nIsMod_451 != 0 ) || ( nIsDirty_451 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1P3451( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1P3451( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1P3451( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01P342 */
                     pr_default.execute(36, new Object[] {A3067DevPieUni, A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
                     if ( (pr_default.getStatus(36) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDevPie"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1P3451( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11P3451( ) ;
                           getByPrimaryKey1P3451( ) ;
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
            endLevel1P3451( ) ;
         }
      }
      closeExtendedTableCursors1P3451( ) ;
   }

   public void deferredUpdate1P3451( )
   {
   }

   public void delete1P3451( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1P3451( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P3451( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P3451( ) ;
         afterConfirm1P3451( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P3451( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01P343 */
               pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
               if ( AnyError == 0 )
               {
                  updateTablesN11P3451( ) ;
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
      sMode451 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1P3451( ) ;
      Gx_mode = sMode451 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P3451( )
   {
      standaloneModal1P3451( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01P344 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         Z4795AlRPieCal = T01P344_A4795AlRPieCal[0] ;
         Z2155AlbRecKgm = T01P344_A2155AlbRecKgm[0] ;
         Z2157AlbRecMtr = T01P344_A2157AlbRecMtr[0] ;
         A4795AlRPieCal = T01P344_A4795AlRPieCal[0] ;
         A2158AlbRecMtrU = T01P344_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T01P344_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = T01P344_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = T01P344_A2157AlbRecMtr[0] ;
         O2156AlbRecKgmU = A2156AlbRecKgmU ;
         O2158AlbRecMtrU = A2158AlbRecMtrU ;
         pr_default.close(38);
         if ( isIns( )  )
         {
            A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               }
            }
         }
         if ( isDlt( )  )
         {
            A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            }
         }
         if ( true )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
            {
               AV14KilAnt = O328DevGenUni ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
            }
         }
         if ( true )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
            {
               AV15MetAnt = O328DevGenUni ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
            }
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV17Kilos = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV18Metros = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         }
         if ( true )
         {
            AV10AlbRUniDis = A57AlbRUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
         else
         {
            if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
            {
               AV10AlbRUniDis = AV12AlbRUDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
            }
         }
         if ( isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
         }
         if ( true /* Level */ )
         {
            AV63oldUni = O3067DevPieUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrimstr( AV63oldUni, 9, 2));
         }
         if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(AV63oldUni) ;
            }
            else
            {
               if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
               {
                  A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(A3067DevPieUni) ;
               }
            }
         }
         if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(AV63oldUni) ;
            }
            else
            {
               if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(A3067DevPieUni) ;
               }
            }
         }
      }
   }

   public void updateTablesN11P3451( )
   {
      /* Using cursor T01P345 */
      pr_default.execute(39, new Object[] {A2158AlbRecMtrU, A2156AlbRecKgmU, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
   }

   public void endLevel1P3451( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(34);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1P3451( )
   {
      /* Scan By routine */
      /* Using cursor T01P346 */
      pr_default.execute(40, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      RcdFound451 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A2159AlbRecPie = T01P346_A2159AlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P3451( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound451 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A2159AlbRecPie = T01P346_A2159AlbRecPie[0] ;
      }
   }

   public void scanEnd1P3451( )
   {
      pr_default.close(40);
   }

   public void afterConfirm1P3451( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P3451( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P3451( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P3451( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P3451( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P3451( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P3451( )
   {
      edtAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtAlbRecMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_181_Refreshing);
      edtDevPieUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevPieUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevPieUni_Enabled), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void send_integrity_lvl_hashes1P3451( )
   {
   }

   public void send_integrity_lvl_hashes1P331( )
   {
   }

   public void subsflControlProps_181451( )
   {
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_181_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_181_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_181_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_181_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_181_idx ;
      edtDevPieUni_Internalname = "DEVPIEUNI_"+sGXsfl_181_idx ;
   }

   public void subsflControlProps_fel_181451( )
   {
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_181_fel_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_181_fel_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_181_fel_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_181_fel_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_181_fel_idx ;
      edtDevPieUni_Internalname = "DEVPIEUNI_"+sGXsfl_181_fel_idx ;
   }

   public void addRow1P3451( )
   {
      nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181451( ) ;
      sendRow1P3451( ) ;
   }

   public void sendRow1P3451( )
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
         if ( ((int)((nGXsfl_181_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_451_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPie_Internalname,GXutil.rtrim( A2159AlbRecPie),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,182);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecPie_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgm_Enabled!=0) ? localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99") : localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtr_Enabled!=0) ? localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99") : localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgmU_Internalname,GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgmU_Enabled!=0) ? localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99") : localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgmU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgmU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtrU_Internalname,GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtrU_Enabled!=0) ? localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99") : localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtrU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtrU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_451_" + sGXsfl_181_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_181_idx + "',181)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevPieUni_Internalname,GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevPieUni_Enabled!=0) ? localUtil.format( A3067DevPieUni, "ZZZZZ9.99") : localUtil.format( A3067DevPieUni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,187);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevPieUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDevPieUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(181),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1P3451( ) ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2159AlbRecPie));
      GXCCtl = "Z3067DevPieUni_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4795AlRPieCal));
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O3067DevPieUni_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2156AlbRecKgmU_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2158AlbRecMtrU_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_451_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_451_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_451_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_181_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV78TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV78TrnContext);
      }
      GXCCtl = "EMPRCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vEMPRCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV75EmprCod));
      GXCCtl = "vDEVGENCOD_" + sGXsfl_181_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV76DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPIE_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGM_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTR_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVPIEUNI_"+sGXsfl_181_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevPieUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1P3451( )
   {
      nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181451( ) ;
      edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevPieUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVPIEUNI_"+sGXsfl_181_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
      A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
      A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
      A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
      A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevPieUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevPieUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DEVPIEUNI_" + sGXsfl_181_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevPieUni_Internalname ;
         wbErr = true ;
         A3067DevPieUni = DecimalUtil.ZERO ;
      }
      else
      {
         A3067DevPieUni = localUtil.ctond( httpContext.cgiGet( edtDevPieUni_Internalname)) ;
      }
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_181_idx ;
      Z2159AlbRecPie = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3067DevPieUni_" + sGXsfl_181_idx ;
      Z3067DevPieUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_181_idx ;
      Z4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_181_idx ;
      Z2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_181_idx ;
      Z2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_181_idx ;
      A4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O3067DevPieUni_" + sGXsfl_181_idx ;
      O3067DevPieUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2156AlbRecKgmU_" + sGXsfl_181_idx ;
      O2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2158AlbRecMtrU_" + sGXsfl_181_idx ;
      O2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_451_" + sGXsfl_181_idx ;
      nRcdDeleted_451 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_451_" + sGXsfl_181_idx ;
      nRcdExists_451 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_451_" + sGXsfl_181_idx ;
      nIsMod_451 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRecPie_Enabled = edtAlbRecPie_Enabled ;
   }

   public void confirmValues1P30( )
   {
      nGXsfl_181_idx = 0 ;
      sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_181451( ) ;
      while ( nGXsfl_181_idx < nRC_GXsfl_181 )
      {
         nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_181451( ) ;
         httpContext.changePostValue( "Z2159AlbRecPie_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z3067DevPieUni_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z3067DevPieUni_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3067DevPieUni_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z4795AlRPieCal_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z2155AlbRecKgm_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_181_idx) ;
         httpContext.changePostValue( "Z2157AlbRecMtr_"+sGXsfl_181_idx, httpContext.cgiGet( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_181_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_181_idx) ;
      }
      httpContext.changePostValue( "O3067DevPieUni", httpContext.cgiGet( "T3067DevPieUni")) ;
      httpContext.deletePostValue( "T3067DevPieUni") ;
      httpContext.changePostValue( "O2156AlbRecKgmU", httpContext.cgiGet( "T2156AlbRecKgmU")) ;
      httpContext.deletePostValue( "T2156AlbRecKgmU") ;
      httpContext.changePostValue( "O2158AlbRecMtrU", httpContext.cgiGet( "T2158AlbRecMtrU")) ;
      httpContext.deletePostValue( "T2158AlbRecMtrU") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdevpie2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV75EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV76DevGenCod,8,0))}, new String[] {"Gx_mode","EmprCod","DevGenCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDevPie2");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("DevGenTrn", localUtil.format( DecimalUtil.doubleToDec(A327DevGenTrn), "ZZZ9"));
      forbiddenHiddens.add("DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      forbiddenHiddens.add("DevGenDom", localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9"));
      forbiddenHiddens.add("DevGenEst", localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"));
      forbiddenHiddens.add("DevUlin", localUtil.format( DecimalUtil.doubleToDec(A1304DevUlin), "Z9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdevpie2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z323DevGenCod", GXutil.ltrim( localUtil.ntoc( Z323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z325DevGenFec", localUtil.dtoc( Z325DevGenFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6288DevGenDom", GXutil.ltrim( localUtil.ntoc( Z6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z328DevGenUni", GXutil.ltrim( localUtil.ntoc( Z328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z326DevGenPie", GXutil.ltrim( localUtil.ntoc( Z326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z324DevGenEst", GXutil.ltrim( localUtil.ntoc( Z324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1304DevUlin", GXutil.ltrim( localUtil.ntoc( Z1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z327DevGenTrn", GXutil.ltrim( localUtil.ntoc( Z327DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O326DevGenPie", GXutil.ltrim( localUtil.ntoc( O326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O328DevGenUni", GXutil.ltrim( localUtil.ntoc( O328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3066AlbDevPUni", GXutil.ltrim( localUtil.ntoc( O3066AlbDevPUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5278AlbDevPPie", GXutil.ltrim( localUtil.ntoc( O5278AlbDevPPie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_181", GXutil.ltrim( localUtil.ntoc( nGXsfl_181_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV78TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV78TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV78TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV75EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVGENCOD", GXutil.ltrim( localUtil.ntoc( AV76DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVGENCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76DevGenCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_ALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV80Insert_AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_DEVGENTRN", GXutil.ltrim( localUtil.ntoc( AV81Insert_DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV14KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETANT", GXutil.ltrim( localUtil.ntoc( AV15MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEANT", GXutil.ltrim( localUtil.ntoc( AV16PieAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV17Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV18Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEZAS", GXutil.ltrim( localUtil.ntoc( AV19Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNI", GXutil.rtrim( AV13AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPDIS", GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUDIS", GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENEST", GXutil.ltrim( localUtil.ntoc( A324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVULIN", GXutil.ltrim( localUtil.ntoc( A1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVTRNNOM", GXutil.rtrim( A329DevTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDEVPUNI", GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDEVPPIE", GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV84Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDUNI", GXutil.ltrim( localUtil.ntoc( AV63oldUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECAL", GXutil.rtrim( A4795AlRPieCal));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable5_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Enabled", GXutil.booltostr( Dvpanel_unnamedtable5_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable6_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Enabled", GXutil.booltostr( Dvpanel_unnamedtable6_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable7_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Enabled", GXutil.booltostr( Dvpanel_unnamedtable7_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable8_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Enabled", GXutil.booltostr( Dvpanel_unnamedtable8_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Width", GXutil.rtrim( Dvpanel_unnamedtable8_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable8_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable8_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Cls", GXutil.rtrim( Dvpanel_unnamedtable8_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Title", GXutil.rtrim( Dvpanel_unnamedtable8_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable8_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable8_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable8_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE8_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable8_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable9_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Enabled", GXutil.booltostr( Dvpanel_unnamedtable9_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Width", GXutil.rtrim( Dvpanel_unnamedtable9_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable9_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable9_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Cls", GXutil.rtrim( Dvpanel_unnamedtable9_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Title", GXutil.rtrim( Dvpanel_unnamedtable9_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable9_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable9_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable9_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE9_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable9_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable2_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Enabled", GXutil.booltostr( Dvpanel_unnamedtable2_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      return formatLink("app.tdevpie2", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV75EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV76DevGenCod,8,0))}, new String[] {"Gx_mode","EmprCod","DevGenCod"})  ;
   }

   public String getPgmname( )
   {
      return "TDevPie2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion de Piezas (Detail)", "") ;
   }

   public void initializeNonKey1P331( )
   {
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A327DevGenTrn = (short)(0) ;
      n327DevGenTrn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
      AV9AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      AV13AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      AV11AlbRPDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
      AV12AlbRUDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      AV14KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      AV15MetAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      AV16PieAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV17Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      AV18Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      AV19Piezas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A325DevGenFec = GXutil.nullDate() ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      A6288DevGenDom = (byte)(0) ;
      n6288DevGenDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A329DevTrnNom = "" ;
      n329DevTrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A328DevGenUni = DecimalUtil.ZERO ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      A326DevGenPie = (short)(0) ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A324DevGenEst = (byte)(0) ;
      n324DevGenEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A324DevGenEst", GXutil.str( A324DevGenEst, 1, 0));
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      A5278AlbDevPPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      A1304DevUlin = (byte)(0) ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O3066AlbDevPUni = A3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      O5278AlbDevPPie = A5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      Z325DevGenFec = GXutil.nullDate() ;
      Z6288DevGenDom = (byte)(0) ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z326DevGenPie = (short)(0) ;
      Z324DevGenEst = (byte)(0) ;
      Z1304DevUlin = (byte)(0) ;
      Z44AlbRecCod = 0 ;
      Z327DevGenTrn = (short)(0) ;
      Z47AlbREst = (byte)(0) ;
      Z252CliCod = 0 ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
   }

   public void initAll1P331( )
   {
      A323DevGenCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      initializeNonKey1P331( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1P3451( )
   {
      A3067DevPieUni = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      AV63oldUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrimstr( AV63oldUni, 9, 2));
      A4795AlRPieCal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      O3067DevPieUni = A3067DevPieUni ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      Z3067DevPieUni = DecimalUtil.ZERO ;
      Z4795AlRPieCal = "" ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
   }

   public void initAll1P3451( )
   {
      A2159AlbRecPie = "" ;
      initializeNonKey1P3451( ) ;
   }

   public void standaloneModalInsert1P3451( )
   {
      A326DevGenPie = i326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A54AlbRPieUti = i54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511180", true, true);
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
      httpContext.AddJavascriptSource("tdevpie2.js", "?20268241511180", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties451( )
   {
      edtAlbRecPie_Enabled = defedtAlbRecPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_181_Refreshing);
   }

   public void startgridcontrol181( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A2159AlbRecPie));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevPieUni_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDevGenCod_Internalname = "DEVGENCOD" ;
      lblTextblockdevgenfec_Internalname = "TEXTBLOCKDEVGENFEC" ;
      edtDevGenFec_Internalname = "DEVGENFEC" ;
      divUnnamedtabledevgenfec_Internalname = "UNNAMEDTABLEDEVGENFEC" ;
      lblTextblockalbreccod_Internalname = "TEXTBLOCKALBRECCOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      divUnnamedtablealbreccod_Internalname = "UNNAMEDTABLEALBRECCOD" ;
      lblTextblockdevgendom_Internalname = "TEXTBLOCKDEVGENDOM" ;
      edtDevGenDom_Internalname = "DEVGENDOM" ;
      divUnnamedtabledevgendom_Internalname = "UNNAMEDTABLEDEVGENDOM" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      tblUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divUnnamedtableclicod_Internalname = "UNNAMEDTABLECLICOD" ;
      lblTextblockclinom_Internalname = "TEXTBLOCKCLINOM" ;
      edtCliNom_Internalname = "CLINOM" ;
      divUnnamedtableclinom_Internalname = "UNNAMEDTABLECLINOM" ;
      lblTextblockalbref_Internalname = "TEXTBLOCKALBREF" ;
      edtAlbRef_Internalname = "ALBREF" ;
      divUnnamedtablealbref_Internalname = "UNNAMEDTABLEALBREF" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      tblUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      lblTextblockdevgentrn_Internalname = "TEXTBLOCKDEVGENTRN" ;
      dynDevGenTrn.setInternalname( "DEVGENTRN" );
      divUnnamedtabledevgentrn_Internalname = "UNNAMEDTABLEDEVGENTRN" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      tblUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      lblTextblockalbrunidis_Internalname = "TEXTBLOCKALBRUNIDIS" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      divUnnamedtablealbrunidis_Internalname = "UNNAMEDTABLEALBRUNIDIS" ;
      lblTextblockalbruni_Internalname = "TEXTBLOCKALBRUNI" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      divUnnamedtablealbruni_Internalname = "UNNAMEDTABLEALBRUNI" ;
      lblTextblockalbrpiedis_Internalname = "TEXTBLOCKALBRPIEDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      divUnnamedtablealbrpiedis_Internalname = "UNNAMEDTABLEALBRPIEDIS" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      tblUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      Dvpanel_unnamedtable8_Internalname = "DVPANEL_UNNAMEDTABLE8" ;
      lblTextblockdevgenuni_Internalname = "TEXTBLOCKDEVGENUNI" ;
      edtDevGenUni_Internalname = "DEVGENUNI" ;
      divUnnamedtabledevgenuni_Internalname = "UNNAMEDTABLEDEVGENUNI" ;
      lblTextblockdevgenpie_Internalname = "TEXTBLOCKDEVGENPIE" ;
      edtDevGenPie_Internalname = "DEVGENPIE" ;
      divUnnamedtabledevgenpie_Internalname = "UNNAMEDTABLEDEVGENPIE" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      tblUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      Dvpanel_unnamedtable9_Internalname = "DVPANEL_UNNAMEDTABLE9" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtnverpiezas_Internalname = "BTNVERPIEZAS" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU" ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU" ;
      edtDevPieUni_Internalname = "DEVPIEUNI" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
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
      Form.setCaption( httpContext.getMessage( "Devolucion de Piezas (Detail)", "") );
      edtDevPieUni_Jsonclick = "" ;
      edtAlbRecMtrU_Jsonclick = "" ;
      edtAlbRecKgmU_Jsonclick = "" ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtAlbRecPie_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDevPieUni_Enabled = 1 ;
      edtAlbRecMtrU_Enabled = 0 ;
      edtAlbRecKgmU_Enabled = 0 ;
      edtAlbRecMtr_Enabled = 0 ;
      edtAlbRecKgm_Enabled = 0 ;
      edtAlbRecPie_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      bttBtnverpiezas_Visible = 1 ;
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
      edtDevGenPie_Jsonclick = "" ;
      edtDevGenPie_Enabled = 0 ;
      edtDevGenUni_Jsonclick = "" ;
      edtDevGenUni_Enabled = 0 ;
      Dvpanel_unnamedtable9_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Iconposition = "Right" ;
      Dvpanel_unnamedtable9_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Title = httpContext.getMessage( "A Devolver", "") ;
      Dvpanel_unnamedtable9_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable9_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable9_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable9_Width = "100%" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      Dvpanel_unnamedtable8_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Iconposition = "Right" ;
      Dvpanel_unnamedtable8_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Title = httpContext.getMessage( "Existencias Almacen", "") ;
      Dvpanel_unnamedtable8_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable8_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable8_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable8_Width = "100%" ;
      dynDevGenTrn.setJsonclick( "" );
      dynDevGenTrn.setEnabled( 0 );
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = "" ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = "" ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      edtDevGenDom_Jsonclick = "" ;
      edtDevGenDom_Enabled = 0 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 0 ;
      edtDevGenFec_Jsonclick = "" ;
      edtDevGenFec_Enabled = 0 ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = "" ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      edtDevGenCod_Jsonclick = "" ;
      edtDevGenCod_Enabled = 1 ;
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

   public void gxdladevgentrn1P331( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdladevgentrn_data1P331( A396EmprCod) ;
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

   public void gxadevgentrn_html1P331( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdladevgentrn_data1P331( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynDevGenTrn.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynDevGenTrn.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdladevgentrn_data1P331( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T01P347 */
      pr_default.execute(41, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(41) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T01P347_A327DevGenTrn[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01P347_A329DevTrnNom[0]));
         pr_default.readNext(41);
      }
      pr_default.close(41);
   }

   public void xc_36_1P331( String A396EmprCod ,
                            int A44AlbRecCod ,
                            String AV13AlbRUni )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A44AlbRecCod ;
         GXv_int7[0] = AV9AlbRPieDis ;
         GXv_decimal10[0] = AV10AlbRUniDis ;
         GXv_int6[0] = AV11AlbRPDis ;
         GXv_decimal8[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int7, GXv_decimal10, GXv_int6, GXv_decimal8, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int9[0] ;
         AV9AlbRPieDis = GXv_int7[0] ;
         AV10AlbRUniDis = GXv_decimal10[0] ;
         AV11AlbRPDis = GXv_int6[0] ;
         AV12AlbRUDis = GXv_decimal8[0] ;
         AV13AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV13AlbRUni))+"\"") ;
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
      subsflControlProps_181451( ) ;
      while ( nGXsfl_181_idx <= nRC_GXsfl_181 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1P3451( ) ;
         standaloneModal1P3451( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1P3451( ) ;
         nGXsfl_181_idx = (int)(nGXsfl_181_idx+1) ;
         sGXsfl_181_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_181_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_181451( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      dynDevGenTrn.setName( "DEVGENTRN" );
      dynDevGenTrn.setWebtags( "" );
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
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

   public void valid_Devgencod( )
   {
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      /* Using cursor T01P349 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         A3066AlbDevPUni = T01P349_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01P349_A5278AlbDevPPie[0] ;
      }
      else
      {
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         A5278AlbDevPPie = (short)(0) ;
      }
      pr_default.close(42);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      n252CliCod = false ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      /* Using cursor T01P350 */
      pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T01P350_A47AlbREst[0] ;
      Z252CliCod = T01P350_A252CliCod[0] ;
      Z45AlbRef = T01P350_A45AlbRef[0] ;
      Z56AlbRUni = T01P350_A56AlbRUni[0] ;
      Z60AlbRUniUti = T01P350_A60AlbRUniUti[0] ;
      Z52AlbRPieEnt = T01P350_A52AlbRPieEnt[0] ;
      Z58AlbRUniEnt = T01P350_A58AlbRUniEnt[0] ;
      if ( (pr_default.getStatus(43) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
      }
      A54AlbRPieUti = T01P350_A54AlbRPieUti[0] ;
      A47AlbREst = T01P350_A47AlbREst[0] ;
      A252CliCod = T01P350_A252CliCod[0] ;
      n252CliCod = T01P350_n252CliCod[0] ;
      A45AlbRef = T01P350_A45AlbRef[0] ;
      A56AlbRUni = T01P350_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A60AlbRUniUti = T01P350_A60AlbRUniUti[0] ;
      A52AlbRPieEnt = T01P350_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01P350_A58AlbRUniEnt[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(43);
      /* Using cursor T01P351 */
      pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(44) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01P351_A279CliNom[0] ;
      pr_default.close(44);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A44AlbRecCod ;
         GXv_int7[0] = AV9AlbRPieDis ;
         GXv_decimal10[0] = AV10AlbRUniDis ;
         GXv_int6[0] = AV11AlbRPDis ;
         GXv_decimal8[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_int7, GXv_decimal10, GXv_int6, GXv_decimal8, GXv_char3) ;
         tdevpie2_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevpie2_impl.this.A44AlbRecCod = GXv_int9[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         tdevpie2_impl.this.AV9AlbRPieDis = GXv_int7[0] ;
         AV9AlbRPieDis = this.AV9AlbRPieDis ;
         tdevpie2_impl.this.AV10AlbRUniDis = GXv_decimal10[0] ;
         AV10AlbRUniDis = this.AV10AlbRUniDis ;
         tdevpie2_impl.this.AV11AlbRPDis = GXv_int6[0] ;
         AV11AlbRPDis = this.AV11AlbRPDis ;
         tdevpie2_impl.this.AV12AlbRUDis = GXv_decimal8[0] ;
         AV12AlbRUDis = this.AV12AlbRUDis ;
         tdevpie2_impl.this.AV13AlbRUni = GXv_char3[0] ;
         AV13AlbRUni = this.AV13AlbRUni ;
      }
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", GXutil.rtrim( AV13AlbRUni));
   }

   public void valid_Devgentrn( )
   {
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      n329DevTrnNom = false ;
      /* Using cursor T01P352 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
         }
      }
      A329DevTrnNom = T01P352_A329DevTrnNom[0] ;
      n329DevTrnNom = T01P352_n329DevTrnNom[0] ;
      pr_default.close(45);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", GXutil.rtrim( A329DevTrnNom));
   }

   public void valid_Devgenuni( )
   {
      n328DevGenUni = false ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrim( localUtil.ntoc( AV14KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrim( localUtil.ntoc( AV15MetAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrim( localUtil.ntoc( AV17Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrim( localUtil.ntoc( AV18Metros, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Devgenpie( )
   {
      n328DevGenUni = false ;
      n326DevGenPie = false ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      if ( true )
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
         }
      }
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      AV16PieAnt = O326DevGenPie ;
      AV19Piezas = A326DevGenPie ;
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 0, "");
      }
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      O54AlbRPieUti = A54AlbRPieUti ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrim( localUtil.ntoc( AV16PieAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrim( localUtil.ntoc( AV19Piezas, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Albrecpie( )
   {
      n44AlbRecCod = false ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      /* Using cursor T01P344 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      Z4795AlRPieCal = T01P344_A4795AlRPieCal[0] ;
      Z2155AlbRecKgm = T01P344_A2155AlbRecKgm[0] ;
      Z2157AlbRecMtr = T01P344_A2157AlbRecMtr[0] ;
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBDET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
      }
      A4795AlRPieCal = T01P344_A4795AlRPieCal[0] ;
      A2158AlbRecMtrU = T01P344_A2158AlbRecMtrU[0] ;
      A2156AlbRecKgmU = T01P344_A2156AlbRecKgmU[0] ;
      A2155AlbRecKgm = T01P344_A2155AlbRecKgm[0] ;
      A2157AlbRecMtr = T01P344_A2157AlbRecMtr[0] ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      pr_default.close(38);
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) >= 0 ) )
      {
         A3067DevPieUni = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      }
      else
      {
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) >= 0 ) )
         {
            A3067DevPieUni = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O2158AlbRecMtrU", GXutil.ltrim( localUtil.ntoc( O2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2156AlbRecKgmU", GXutil.ltrim( localUtil.ntoc( O2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", GXutil.rtrim( A4795AlRPieCal));
      httpContext.ajax_rsp_assign_attri("", false, "A2158AlbRecMtrU", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2156AlbRecKgmU", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3067DevPieUni", GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Devpieuni( )
   {
      n326DevGenPie = false ;
      n328DevGenUni = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      if ( isDlt( )  )
      {
         A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
         n328DevGenUni = false ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
         }
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
         }
      }
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
      {
         A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(A3067DevPieUni) ;
            }
         }
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de kilos no suficientes", ""), 0, "");
      }
      if ( isIns( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
      {
         A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(AV63oldUni) ;
         }
         else
         {
            if ( isDlt( )  && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(A3067DevPieUni) ;
            }
         }
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de metros no suficientes", ""), 0, "");
      }
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O3067DevPieUni = A3067DevPieUni ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O3066AlbDevPUni = A3066AlbDevPUni ;
      O5278AlbDevPPie = A5278AlbDevPPie ;
      OV14KilAnt = AV14KilAnt ;
      OV15MetAnt = AV15MetAnt ;
      OV16PieAnt = AV16PieAnt ;
      OV17Kilos = AV17Kilos ;
      OV18Metros = AV18Metros ;
      OV19Piezas = AV19Piezas ;
      OV9AlbRPieDis = AV9AlbRPieDis ;
      OV10AlbRUniDis = AV10AlbRUniDis ;
      O47AlbREst = A47AlbREst ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrim( localUtil.ntoc( AV14KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrim( localUtil.ntoc( AV15MetAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrim( localUtil.ntoc( AV17Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrim( localUtil.ntoc( AV18Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrim( localUtil.ntoc( AV63oldUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2158AlbRecMtrU", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2156AlbRecKgmU", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV75EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV76DevGenCod',fld:'vDEVGENCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV78TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV75EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV76DevGenCod',fld:'vDEVGENCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A325DevGenFec',fld:'DEVGENFEC',pic:''},{av:'A6288DevGenDom',fld:'DEVGENDOM',pic:'9'},{av:'A324DevGenEst',fld:'DEVGENEST',pic:'9'},{av:'A1304DevUlin',fld:'DEVULIN',pic:'Z9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e131P32',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV78TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("'DOVERPIEZAS'","{handler:'e111P331',iparms:[{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("'DOVERPIEZAS'",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEVGENCOD","{handler:'valid_Devgencod',iparms:[{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9'},{av:'A3066AlbDevPUni',fld:'ALBDEVPUNI',pic:'ZZZZZ9.99'},{av:'A5278AlbDevPPie',fld:'ALBDEVPPIE',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DEVGENCOD",",oparms:[{av:'A3066AlbDevPUni',fld:'ALBDEVPUNI',pic:'ZZZZZ9.99'},{av:'A5278AlbDevPPie',fld:'ALBDEVPPIE',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV13AlbRUni',fld:'vALBRUNI',pic:''},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV11AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV12AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV11AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV12AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV13AlbRUni',fld:'vALBRUNI',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEVGENTRN","{handler:'valid_Devgentrn',iparms:[{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DEVGENTRN",",oparms:[{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEVGENUNI","{handler:'valid_Devgenuni',iparms:[{av:'O328DevGenUni'},{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DEVGENUNI",",oparms:[{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEVGENPIE","{handler:'valid_Devgenpie',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'O326DevGenPie'},{av:'O54AlbRPieUti'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV16PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'AV19Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DEVGENPIE",",oparms:[{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV16PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'AV19Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECPIE","{handler:'valid_Albrecpie',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99'},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A3067DevPieUni',fld:'DEVPIEUNI',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECPIE",",oparms:[{av:'O2158AlbRecMtrU'},{av:'O2156AlbRecKgmU'},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99'},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A3067DevPieUni',fld:'DEVPIEUNI',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECKGM","{handler:'valid_Albreckgm',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECKGM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECMTR","{handler:'valid_Albrecmtr',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECMTR",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECKGMU","{handler:'valid_Albreckgmu',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECKGMU",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECMTRU","{handler:'valid_Albrecmtru',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECMTRU",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEVPIEUNI","{handler:'valid_Devpieuni',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV19Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'AV16PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'A5278AlbDevPPie',fld:'ALBDEVPPIE',pic:'ZZ9'},{av:'A3066AlbDevPUni',fld:'ALBDEVPUNI',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'O2156AlbRecKgmU'},{av:'O2158AlbRecMtrU'},{av:'O60AlbRUniUti'},{av:'O328DevGenUni'},{av:'O3067DevPieUni'},{av:'O3066AlbDevPUni'},{av:'O5278AlbDevPPie'},{av:'A3067DevPieUni',fld:'DEVPIEUNI',pic:'ZZZZZ9.99'},{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'AV63oldUni',fld:'vOLDUNI',pic:'ZZZZZ9.99'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DEVPIEUNI",",oparms:[{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV63oldUni',fld:'vOLDUNI',pic:'ZZZZZ9.99'},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99'},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'}]}");
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
      pr_default.close(38);
      pr_default.close(43);
      pr_default.close(23);
      pr_default.close(44);
      pr_default.close(24);
      pr_default.close(45);
      pr_default.close(25);
      pr_default.close(42);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV75EmprCod = "" ;
      Z396EmprCod = "" ;
      Z325DevGenFec = GXutil.nullDate() ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      O328DevGenUni = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      O3066AlbDevPUni = DecimalUtil.ZERO ;
      Z2159AlbRecPie = "" ;
      Z3067DevPieUni = DecimalUtil.ZERO ;
      Z4795AlRPieCal = "" ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      O3067DevPieUni = DecimalUtil.ZERO ;
      O2156AlbRecKgmU = DecimalUtil.ZERO ;
      O2158AlbRecMtrU = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV13AlbRUni = "" ;
      A2159AlbRecPie = "" ;
      Gx_mode = "" ;
      AV75EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      sStyleString = "" ;
      lblTextblockdevgenfec_Jsonclick = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      lblTextblockalbreccod_Jsonclick = "" ;
      lblTextblockdevgendom_Jsonclick = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblockclinom_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblockalbref_Jsonclick = "" ;
      A45AlbRef = "" ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      lblTextblockdevgentrn_Jsonclick = "" ;
      ucDvpanel_unnamedtable8 = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbrunidis_Jsonclick = "" ;
      lblTextblockalbruni_Jsonclick = "" ;
      lblTextblockalbrpiedis_Jsonclick = "" ;
      ucDvpanel_unnamedtable9 = new com.genexus.webpanels.GXUserControl();
      lblTextblockdevgenuni_Jsonclick = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      lblTextblockdevgenpie_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnverpiezas_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B328DevGenUni = DecimalUtil.ZERO ;
      B60AlbRUniUti = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      B3066AlbDevPUni = DecimalUtil.ZERO ;
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      sMode451 = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      AV14KilAnt = DecimalUtil.ZERO ;
      AV15MetAnt = DecimalUtil.ZERO ;
      AV17Kilos = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A329DevTrnNom = "" ;
      AV84Pgmname = "" ;
      AV63oldUni = DecimalUtil.ZERO ;
      A4795AlRPieCal = "" ;
      Dvpanel_unnamedtable5_Objectcall = "" ;
      Dvpanel_unnamedtable5_Class = "" ;
      Dvpanel_unnamedtable5_Height = "" ;
      Dvpanel_unnamedtable6_Objectcall = "" ;
      Dvpanel_unnamedtable6_Class = "" ;
      Dvpanel_unnamedtable6_Height = "" ;
      Dvpanel_unnamedtable7_Objectcall = "" ;
      Dvpanel_unnamedtable7_Class = "" ;
      Dvpanel_unnamedtable7_Height = "" ;
      Dvpanel_unnamedtable8_Objectcall = "" ;
      Dvpanel_unnamedtable8_Class = "" ;
      Dvpanel_unnamedtable8_Height = "" ;
      Dvpanel_unnamedtable9_Objectcall = "" ;
      Dvpanel_unnamedtable9_Class = "" ;
      Dvpanel_unnamedtable9_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Dvpanel_unnamedtable2_Objectcall = "" ;
      Dvpanel_unnamedtable2_Class = "" ;
      Dvpanel_unnamedtable2_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode31 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s328DevGenUni = DecimalUtil.ZERO ;
      s60AlbRUniUti = DecimalUtil.ZERO ;
      s3066AlbDevPUni = DecimalUtil.ZERO ;
      sV14KilAnt = DecimalUtil.ZERO ;
      OV14KilAnt = DecimalUtil.ZERO ;
      sV15MetAnt = DecimalUtil.ZERO ;
      OV15MetAnt = DecimalUtil.ZERO ;
      sV17Kilos = DecimalUtil.ZERO ;
      OV17Kilos = DecimalUtil.ZERO ;
      sV18Metros = DecimalUtil.ZERO ;
      OV18Metros = DecimalUtil.ZERO ;
      sV10AlbRUniDis = DecimalUtil.ZERO ;
      OV10AlbRUniDis = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A3067DevPieUni = DecimalUtil.ZERO ;
      T3067DevPieUni = DecimalUtil.ZERO ;
      T2156AlbRecKgmU = DecimalUtil.ZERO ;
      T2158AlbRecMtrU = DecimalUtil.ZERO ;
      AV24Station = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV77WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV78TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV79WebSession = httpContext.getWebSession();
      AV82TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z329DevTrnNom = "" ;
      Z3066AlbDevPUni = DecimalUtil.ZERO ;
      T01P38_A407EmprNom = new String[] {""} ;
      T01P38_n407EmprNom = new boolean[] {false} ;
      T01P312_A329DevTrnNom = new String[] {""} ;
      T01P312_n329DevTrnNom = new boolean[] {false} ;
      T01P314_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P314_A5278AlbDevPPie = new short[1] ;
      T01P310_A54AlbRPieUti = new int[1] ;
      T01P310_A47AlbREst = new byte[1] ;
      T01P310_A252CliCod = new int[1] ;
      T01P310_n252CliCod = new boolean[] {false} ;
      T01P310_A45AlbRef = new String[] {""} ;
      T01P310_A56AlbRUni = new String[] {""} ;
      T01P310_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P310_A52AlbRPieEnt = new int[1] ;
      T01P310_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P311_A279CliNom = new String[] {""} ;
      T01P316_A323DevGenCod = new int[1] ;
      T01P316_A54AlbRPieUti = new int[1] ;
      T01P316_A47AlbREst = new byte[1] ;
      T01P316_A407EmprNom = new String[] {""} ;
      T01P316_n407EmprNom = new boolean[] {false} ;
      T01P316_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01P316_n325DevGenFec = new boolean[] {false} ;
      T01P316_A6288DevGenDom = new byte[1] ;
      T01P316_n6288DevGenDom = new boolean[] {false} ;
      T01P316_A252CliCod = new int[1] ;
      T01P316_n252CliCod = new boolean[] {false} ;
      T01P316_A279CliNom = new String[] {""} ;
      T01P316_A45AlbRef = new String[] {""} ;
      T01P316_A329DevTrnNom = new String[] {""} ;
      T01P316_n329DevTrnNom = new boolean[] {false} ;
      T01P316_A56AlbRUni = new String[] {""} ;
      T01P316_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P316_n328DevGenUni = new boolean[] {false} ;
      T01P316_A326DevGenPie = new short[1] ;
      T01P316_n326DevGenPie = new boolean[] {false} ;
      T01P316_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P316_A52AlbRPieEnt = new int[1] ;
      T01P316_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P316_A324DevGenEst = new byte[1] ;
      T01P316_n324DevGenEst = new boolean[] {false} ;
      T01P316_A1304DevUlin = new byte[1] ;
      T01P316_n1304DevUlin = new boolean[] {false} ;
      T01P316_A396EmprCod = new String[] {""} ;
      T01P316_A44AlbRecCod = new int[1] ;
      T01P316_n44AlbRecCod = new boolean[] {false} ;
      T01P316_A327DevGenTrn = new short[1] ;
      T01P316_n327DevGenTrn = new boolean[] {false} ;
      T01P316_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P316_A5278AlbDevPPie = new short[1] ;
      T01P317_A279CliNom = new String[] {""} ;
      T01P318_A329DevTrnNom = new String[] {""} ;
      T01P318_n329DevTrnNom = new boolean[] {false} ;
      T01P320_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P320_A5278AlbDevPPie = new short[1] ;
      T01P321_A396EmprCod = new String[] {""} ;
      T01P321_A323DevGenCod = new int[1] ;
      T01P37_A323DevGenCod = new int[1] ;
      T01P37_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01P37_n325DevGenFec = new boolean[] {false} ;
      T01P37_A6288DevGenDom = new byte[1] ;
      T01P37_n6288DevGenDom = new boolean[] {false} ;
      T01P37_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P37_n328DevGenUni = new boolean[] {false} ;
      T01P37_A326DevGenPie = new short[1] ;
      T01P37_n326DevGenPie = new boolean[] {false} ;
      T01P37_A324DevGenEst = new byte[1] ;
      T01P37_n324DevGenEst = new boolean[] {false} ;
      T01P37_A1304DevUlin = new byte[1] ;
      T01P37_n1304DevUlin = new boolean[] {false} ;
      T01P37_A396EmprCod = new String[] {""} ;
      T01P37_A44AlbRecCod = new int[1] ;
      T01P37_n44AlbRecCod = new boolean[] {false} ;
      T01P37_A327DevGenTrn = new short[1] ;
      T01P37_n327DevGenTrn = new boolean[] {false} ;
      T01P37_A252CliCod = new int[1] ;
      T01P37_n252CliCod = new boolean[] {false} ;
      T01P322_A396EmprCod = new String[] {""} ;
      T01P322_A323DevGenCod = new int[1] ;
      T01P323_A396EmprCod = new String[] {""} ;
      T01P323_A323DevGenCod = new int[1] ;
      T01P36_A323DevGenCod = new int[1] ;
      T01P36_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01P36_n325DevGenFec = new boolean[] {false} ;
      T01P36_A6288DevGenDom = new byte[1] ;
      T01P36_n6288DevGenDom = new boolean[] {false} ;
      T01P36_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P36_n328DevGenUni = new boolean[] {false} ;
      T01P36_A326DevGenPie = new short[1] ;
      T01P36_n326DevGenPie = new boolean[] {false} ;
      T01P36_A324DevGenEst = new byte[1] ;
      T01P36_n324DevGenEst = new boolean[] {false} ;
      T01P36_A1304DevUlin = new byte[1] ;
      T01P36_n1304DevUlin = new boolean[] {false} ;
      T01P36_A396EmprCod = new String[] {""} ;
      T01P36_A44AlbRecCod = new int[1] ;
      T01P36_n44AlbRecCod = new boolean[] {false} ;
      T01P36_A327DevGenTrn = new short[1] ;
      T01P36_n327DevGenTrn = new boolean[] {false} ;
      T01P36_A252CliCod = new int[1] ;
      T01P36_n252CliCod = new boolean[] {false} ;
      T01P324_A54AlbRPieUti = new int[1] ;
      T01P324_A47AlbREst = new byte[1] ;
      T01P324_A252CliCod = new int[1] ;
      T01P324_n252CliCod = new boolean[] {false} ;
      T01P324_A45AlbRef = new String[] {""} ;
      T01P324_A56AlbRUni = new String[] {""} ;
      T01P324_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P324_A52AlbRPieEnt = new int[1] ;
      T01P324_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P328_A54AlbRPieUti = new int[1] ;
      T01P328_A47AlbREst = new byte[1] ;
      T01P328_A252CliCod = new int[1] ;
      T01P328_n252CliCod = new boolean[] {false} ;
      T01P328_A45AlbRef = new String[] {""} ;
      T01P328_A56AlbRUni = new String[] {""} ;
      T01P328_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P328_A52AlbRPieEnt = new int[1] ;
      T01P328_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P329_A279CliNom = new String[] {""} ;
      T01P330_A329DevTrnNom = new String[] {""} ;
      T01P330_n329DevTrnNom = new boolean[] {false} ;
      T01P332_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P332_A5278AlbDevPPie = new short[1] ;
      T01P333_A396EmprCod = new String[] {""} ;
      T01P333_A323DevGenCod = new int[1] ;
      T01P333_A1302DevLin = new byte[1] ;
      T01P337_A396EmprCod = new String[] {""} ;
      T01P337_A323DevGenCod = new int[1] ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      T01P338_A4795AlRPieCal = new String[] {""} ;
      T01P338_A323DevGenCod = new int[1] ;
      T01P338_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P338_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P338_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P338_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P338_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P338_A396EmprCod = new String[] {""} ;
      T01P338_A2159AlbRecPie = new String[] {""} ;
      T01P338_A44AlbRecCod = new int[1] ;
      T01P338_n44AlbRecCod = new boolean[] {false} ;
      T01P35_A4795AlRPieCal = new String[] {""} ;
      T01P35_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P35_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P35_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P35_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P35_A44AlbRecCod = new int[1] ;
      T01P35_n44AlbRecCod = new boolean[] {false} ;
      T01P339_A396EmprCod = new String[] {""} ;
      T01P339_A323DevGenCod = new int[1] ;
      T01P339_A2159AlbRecPie = new String[] {""} ;
      T01P33_A323DevGenCod = new int[1] ;
      T01P33_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P33_A396EmprCod = new String[] {""} ;
      T01P33_A2159AlbRecPie = new String[] {""} ;
      T01P32_A323DevGenCod = new int[1] ;
      T01P32_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P32_A396EmprCod = new String[] {""} ;
      T01P32_A2159AlbRecPie = new String[] {""} ;
      T01P340_A4795AlRPieCal = new String[] {""} ;
      T01P340_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P340_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P340_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P340_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P340_A44AlbRecCod = new int[1] ;
      T01P340_n44AlbRecCod = new boolean[] {false} ;
      T01P344_A4795AlRPieCal = new String[] {""} ;
      T01P344_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P344_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P344_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P344_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P346_A396EmprCod = new String[] {""} ;
      T01P346_A323DevGenCod = new int[1] ;
      T01P346_A2159AlbRecPie = new String[] {""} ;
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
      T01P347_A396EmprCod = new String[] {""} ;
      T01P347_A327DevGenTrn = new short[1] ;
      T01P347_n327DevGenTrn = new boolean[] {false} ;
      T01P347_A329DevTrnNom = new String[] {""} ;
      T01P347_n329DevTrnNom = new boolean[] {false} ;
      T01P349_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P349_A5278AlbDevPPie = new short[1] ;
      T01P350_A54AlbRPieUti = new int[1] ;
      T01P350_A47AlbREst = new byte[1] ;
      T01P350_A252CliCod = new int[1] ;
      T01P350_n252CliCod = new boolean[] {false} ;
      T01P350_A45AlbRef = new String[] {""} ;
      T01P350_A56AlbRUni = new String[] {""} ;
      T01P350_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P350_A52AlbRPieEnt = new int[1] ;
      T01P350_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P351_A279CliNom = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV10AlbRUniDis = DecimalUtil.ZERO ;
      ZV12AlbRUDis = DecimalUtil.ZERO ;
      ZV13AlbRUni = "" ;
      T01P352_A329DevTrnNom = new String[] {""} ;
      T01P352_n329DevTrnNom = new boolean[] {false} ;
      ZV14KilAnt = DecimalUtil.ZERO ;
      ZV15MetAnt = DecimalUtil.ZERO ;
      ZV17Kilos = DecimalUtil.ZERO ;
      ZV18Metros = DecimalUtil.ZERO ;
      ZO2158AlbRecMtrU = DecimalUtil.ZERO ;
      ZO2156AlbRecKgmU = DecimalUtil.ZERO ;
      ZV63oldUni = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevpie2__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevpie2__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevpie2__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevpie2__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie2__default(),
         new Object[] {
             new Object[] {
            T01P32_A323DevGenCod, T01P32_A3067DevPieUni, T01P32_A396EmprCod, T01P32_A2159AlbRecPie
            }
            , new Object[] {
            T01P33_A323DevGenCod, T01P33_A3067DevPieUni, T01P33_A396EmprCod, T01P33_A2159AlbRecPie
            }
            , new Object[] {
            T01P34_A4795AlRPieCal, T01P34_A2158AlbRecMtrU, T01P34_A2156AlbRecKgmU, T01P34_A2155AlbRecKgm, T01P34_A2157AlbRecMtr, T01P34_A44AlbRecCod
            }
            , new Object[] {
            T01P35_A4795AlRPieCal, T01P35_A2158AlbRecMtrU, T01P35_A2156AlbRecKgmU, T01P35_A2155AlbRecKgm, T01P35_A2157AlbRecMtr, T01P35_A44AlbRecCod
            }
            , new Object[] {
            T01P36_A323DevGenCod, T01P36_A325DevGenFec, T01P36_n325DevGenFec, T01P36_A6288DevGenDom, T01P36_n6288DevGenDom, T01P36_A328DevGenUni, T01P36_n328DevGenUni, T01P36_A326DevGenPie, T01P36_n326DevGenPie, T01P36_A324DevGenEst,
            T01P36_n324DevGenEst, T01P36_A1304DevUlin, T01P36_n1304DevUlin, T01P36_A396EmprCod, T01P36_A44AlbRecCod, T01P36_n44AlbRecCod, T01P36_A327DevGenTrn, T01P36_n327DevGenTrn, T01P36_A252CliCod, T01P36_n252CliCod
            }
            , new Object[] {
            T01P37_A323DevGenCod, T01P37_A325DevGenFec, T01P37_n325DevGenFec, T01P37_A6288DevGenDom, T01P37_n6288DevGenDom, T01P37_A328DevGenUni, T01P37_n328DevGenUni, T01P37_A326DevGenPie, T01P37_n326DevGenPie, T01P37_A324DevGenEst,
            T01P37_n324DevGenEst, T01P37_A1304DevUlin, T01P37_n1304DevUlin, T01P37_A396EmprCod, T01P37_A44AlbRecCod, T01P37_n44AlbRecCod, T01P37_A327DevGenTrn, T01P37_n327DevGenTrn, T01P37_A252CliCod, T01P37_n252CliCod
            }
            , new Object[] {
            T01P38_A407EmprNom, T01P38_n407EmprNom
            }
            , new Object[] {
            T01P39_A54AlbRPieUti, T01P39_A47AlbREst, T01P39_A252CliCod, T01P39_A45AlbRef, T01P39_A56AlbRUni, T01P39_A60AlbRUniUti, T01P39_A52AlbRPieEnt, T01P39_A58AlbRUniEnt
            }
            , new Object[] {
            T01P310_A54AlbRPieUti, T01P310_A47AlbREst, T01P310_A252CliCod, T01P310_A45AlbRef, T01P310_A56AlbRUni, T01P310_A60AlbRUniUti, T01P310_A52AlbRPieEnt, T01P310_A58AlbRUniEnt
            }
            , new Object[] {
            T01P311_A279CliNom
            }
            , new Object[] {
            T01P312_A329DevTrnNom, T01P312_n329DevTrnNom
            }
            , new Object[] {
            T01P314_A3066AlbDevPUni, T01P314_A5278AlbDevPPie
            }
            , new Object[] {
            T01P316_A323DevGenCod, T01P316_A54AlbRPieUti, T01P316_A47AlbREst, T01P316_A407EmprNom, T01P316_n407EmprNom, T01P316_A325DevGenFec, T01P316_n325DevGenFec, T01P316_A6288DevGenDom, T01P316_n6288DevGenDom, T01P316_A252CliCod,
            T01P316_n252CliCod, T01P316_A279CliNom, T01P316_A45AlbRef, T01P316_A329DevTrnNom, T01P316_n329DevTrnNom, T01P316_A56AlbRUni, T01P316_A328DevGenUni, T01P316_n328DevGenUni, T01P316_A326DevGenPie, T01P316_n326DevGenPie,
            T01P316_A60AlbRUniUti, T01P316_A52AlbRPieEnt, T01P316_A58AlbRUniEnt, T01P316_A324DevGenEst, T01P316_n324DevGenEst, T01P316_A1304DevUlin, T01P316_n1304DevUlin, T01P316_A396EmprCod, T01P316_A44AlbRecCod, T01P316_n44AlbRecCod,
            T01P316_A327DevGenTrn, T01P316_n327DevGenTrn, T01P316_A3066AlbDevPUni, T01P316_A5278AlbDevPPie
            }
            , new Object[] {
            T01P317_A279CliNom
            }
            , new Object[] {
            T01P318_A329DevTrnNom, T01P318_n329DevTrnNom
            }
            , new Object[] {
            T01P320_A3066AlbDevPUni, T01P320_A5278AlbDevPPie
            }
            , new Object[] {
            T01P321_A396EmprCod, T01P321_A323DevGenCod
            }
            , new Object[] {
            T01P322_A396EmprCod, T01P322_A323DevGenCod
            }
            , new Object[] {
            T01P323_A396EmprCod, T01P323_A323DevGenCod
            }
            , new Object[] {
            T01P324_A54AlbRPieUti, T01P324_A47AlbREst, T01P324_A252CliCod, T01P324_A45AlbRef, T01P324_A56AlbRUni, T01P324_A60AlbRUniUti, T01P324_A52AlbRPieEnt, T01P324_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P328_A54AlbRPieUti, T01P328_A47AlbREst, T01P328_A252CliCod, T01P328_A45AlbRef, T01P328_A56AlbRUni, T01P328_A60AlbRUniUti, T01P328_A52AlbRPieEnt, T01P328_A58AlbRUniEnt
            }
            , new Object[] {
            T01P329_A279CliNom
            }
            , new Object[] {
            T01P330_A329DevTrnNom, T01P330_n329DevTrnNom
            }
            , new Object[] {
            T01P332_A3066AlbDevPUni, T01P332_A5278AlbDevPPie
            }
            , new Object[] {
            T01P333_A396EmprCod, T01P333_A323DevGenCod, T01P333_A1302DevLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P337_A396EmprCod, T01P337_A323DevGenCod
            }
            , new Object[] {
            T01P338_A4795AlRPieCal, T01P338_A323DevGenCod, T01P338_A3067DevPieUni, T01P338_A2158AlbRecMtrU, T01P338_A2156AlbRecKgmU, T01P338_A2155AlbRecKgm, T01P338_A2157AlbRecMtr, T01P338_A396EmprCod, T01P338_A2159AlbRecPie, T01P338_A44AlbRecCod
            }
            , new Object[] {
            T01P339_A396EmprCod, T01P339_A323DevGenCod, T01P339_A2159AlbRecPie
            }
            , new Object[] {
            T01P340_A4795AlRPieCal, T01P340_A2158AlbRecMtrU, T01P340_A2156AlbRecKgmU, T01P340_A2155AlbRecKgm, T01P340_A2157AlbRecMtr, T01P340_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P344_A4795AlRPieCal, T01P344_A2158AlbRecMtrU, T01P344_A2156AlbRecKgmU, T01P344_A2155AlbRecKgm, T01P344_A2157AlbRecMtr
            }
            , new Object[] {
            }
            , new Object[] {
            T01P346_A396EmprCod, T01P346_A323DevGenCod, T01P346_A2159AlbRecPie
            }
            , new Object[] {
            T01P347_A396EmprCod, T01P347_A327DevGenTrn, T01P347_A329DevTrnNom, T01P347_n329DevTrnNom
            }
            , new Object[] {
            T01P349_A3066AlbDevPUni, T01P349_A5278AlbDevPPie
            }
            , new Object[] {
            T01P350_A54AlbRPieUti, T01P350_A47AlbREst, T01P350_A252CliCod, T01P350_A45AlbRef, T01P350_A56AlbRUni, T01P350_A60AlbRUniUti, T01P350_A52AlbRPieEnt, T01P350_A58AlbRUniEnt
            }
            , new Object[] {
            T01P351_A279CliNom
            }
            , new Object[] {
            T01P352_A329DevTrnNom, T01P352_n329DevTrnNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV84Pgmname = "TDevPie2" ;
   }

   private byte Z6288DevGenDom ;
   private byte Z324DevGenEst ;
   private byte Z1304DevUlin ;
   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A6288DevGenDom ;
   private byte A324DevGenEst ;
   private byte A1304DevUlin ;
   private byte A47AlbREst ;
   private byte s47AlbREst ;
   private byte O47AlbREst ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short Z326DevGenPie ;
   private short Z327DevGenTrn ;
   private short O326DevGenPie ;
   private short O5278AlbDevPPie ;
   private short nRcdDeleted_451 ;
   private short nRcdExists_451 ;
   private short nIsMod_451 ;
   private short A327DevGenTrn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A326DevGenPie ;
   private short nBlankRcdCount451 ;
   private short RcdFound451 ;
   private short B326DevGenPie ;
   private short B5278AlbDevPPie ;
   private short A5278AlbDevPPie ;
   private short nBlankRcdUsr451 ;
   private short AV81Insert_DevGenTrn ;
   private short AV16PieAnt ;
   private short AV19Piezas ;
   private short RcdFound31 ;
   private short s326DevGenPie ;
   private short s5278AlbDevPPie ;
   private short sV16PieAnt ;
   private short OV16PieAnt ;
   private short sV19Piezas ;
   private short OV19Piezas ;
   private short Z5278AlbDevPPie ;
   private short nIsDirty_31 ;
   private short nIsDirty_451 ;
   private short i326DevGenPie ;
   private short ZV16PieAnt ;
   private short ZV19Piezas ;
   private int wcpOAV76DevGenCod ;
   private int Z323DevGenCod ;
   private int Z44AlbRecCod ;
   private int Z252CliCod ;
   private int Z52AlbRPieEnt ;
   private int O54AlbRPieUti ;
   private int nRC_GXsfl_181 ;
   private int nGXsfl_181_idx=1 ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A323DevGenCod ;
   private int AV76DevGenCod ;
   private int trnEnded ;
   private int A51AlbRPieDis ;
   private int edtDevGenCod_Enabled ;
   private int edtDevGenFec_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtDevGenDom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRPieDis_Enabled ;
   private int edtDevGenUni_Enabled ;
   private int edtDevGenPie_Enabled ;
   private int bttBtnverpiezas_Visible ;
   private int B54AlbRPieUti ;
   private int A54AlbRPieUti ;
   private int edtAlbRecPie_Enabled ;
   private int edtAlbRecKgm_Enabled ;
   private int edtAlbRecMtr_Enabled ;
   private int edtAlbRecKgmU_Enabled ;
   private int edtAlbRecMtrU_Enabled ;
   private int edtDevPieUni_Enabled ;
   private int fRowAdded ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int A52AlbRPieEnt ;
   private int AV80Insert_AlbRecCod ;
   private int AV9AlbRPieDis ;
   private int AV11AlbRPDis ;
   private int Dvpanel_unnamedtable5_Gxcontroltype ;
   private int Dvpanel_unnamedtable6_Gxcontroltype ;
   private int Dvpanel_unnamedtable7_Gxcontroltype ;
   private int Dvpanel_unnamedtable8_Gxcontroltype ;
   private int Dvpanel_unnamedtable9_Gxcontroltype ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_unnamedtable1_Gxcontroltype ;
   private int Dvpanel_unnamedtable2_Gxcontroltype ;
   private int s54AlbRPieUti ;
   private int sV9AlbRPieDis ;
   private int OV9AlbRPieDis ;
   private int AV85GXV1 ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtAlbRecPie_Enabled ;
   private int i54AlbRPieUti ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int GXv_int9[] ;
   private int GXv_int7[] ;
   private int GXv_int6[] ;
   private int ZO54AlbRPieUti ;
   private int ZV9AlbRPieDis ;
   private int ZV11AlbRPDis ;
   private int Z51AlbRPieDis ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z328DevGenUni ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O328DevGenUni ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal O3066AlbDevPUni ;
   private java.math.BigDecimal Z3067DevPieUni ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal O3067DevPieUni ;
   private java.math.BigDecimal O2156AlbRecKgmU ;
   private java.math.BigDecimal O2158AlbRecMtrU ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal B328DevGenUni ;
   private java.math.BigDecimal B60AlbRUniUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal B3066AlbDevPUni ;
   private java.math.BigDecimal A3066AlbDevPUni ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV10AlbRUniDis ;
   private java.math.BigDecimal AV14KilAnt ;
   private java.math.BigDecimal AV15MetAnt ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal AV18Metros ;
   private java.math.BigDecimal AV12AlbRUDis ;
   private java.math.BigDecimal AV63oldUni ;
   private java.math.BigDecimal s328DevGenUni ;
   private java.math.BigDecimal s60AlbRUniUti ;
   private java.math.BigDecimal s3066AlbDevPUni ;
   private java.math.BigDecimal sV14KilAnt ;
   private java.math.BigDecimal OV14KilAnt ;
   private java.math.BigDecimal sV15MetAnt ;
   private java.math.BigDecimal OV15MetAnt ;
   private java.math.BigDecimal sV17Kilos ;
   private java.math.BigDecimal OV17Kilos ;
   private java.math.BigDecimal sV18Metros ;
   private java.math.BigDecimal OV18Metros ;
   private java.math.BigDecimal sV10AlbRUniDis ;
   private java.math.BigDecimal OV10AlbRUniDis ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A3067DevPieUni ;
   private java.math.BigDecimal T3067DevPieUni ;
   private java.math.BigDecimal T2156AlbRecKgmU ;
   private java.math.BigDecimal T2158AlbRecMtrU ;
   private java.math.BigDecimal Z3066AlbDevPUni ;
   private java.math.BigDecimal Z2158AlbRecMtrU ;
   private java.math.BigDecimal Z2156AlbRecKgmU ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZV10AlbRUniDis ;
   private java.math.BigDecimal ZV12AlbRUDis ;
   private java.math.BigDecimal ZV14KilAnt ;
   private java.math.BigDecimal ZV15MetAnt ;
   private java.math.BigDecimal ZV17Kilos ;
   private java.math.BigDecimal ZV18Metros ;
   private java.math.BigDecimal ZO2158AlbRecMtrU ;
   private java.math.BigDecimal ZO2156AlbRecKgmU ;
   private java.math.BigDecimal ZV63oldUni ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV75EmprCod ;
   private String Z396EmprCod ;
   private String Z45AlbRef ;
   private String Z56AlbRUni ;
   private String Z2159AlbRecPie ;
   private String Z4795AlRPieCal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV13AlbRUni ;
   private String A2159AlbRecPie ;
   private String Gx_mode ;
   private String AV75EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevGenCod_Internalname ;
   private String sGXsfl_181_idx="0001" ;
   private String A56AlbRUni ;
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
   private String edtDevGenCod_Jsonclick ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String sStyleString ;
   private String tblUnnamedtable5_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String divUnnamedtabledevgenfec_Internalname ;
   private String lblTextblockdevgenfec_Internalname ;
   private String lblTextblockdevgenfec_Jsonclick ;
   private String edtDevGenFec_Internalname ;
   private String edtDevGenFec_Jsonclick ;
   private String divUnnamedtablealbreccod_Internalname ;
   private String lblTextblockalbreccod_Internalname ;
   private String lblTextblockalbreccod_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String divUnnamedtabledevgendom_Internalname ;
   private String lblTextblockdevgendom_Internalname ;
   private String lblTextblockdevgendom_Jsonclick ;
   private String edtDevGenDom_Internalname ;
   private String edtDevGenDom_Jsonclick ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String tblUnnamedtable6_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String divUnnamedtableclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtableclinom_Internalname ;
   private String lblTextblockclinom_Internalname ;
   private String lblTextblockclinom_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtablealbref_Internalname ;
   private String lblTextblockalbref_Internalname ;
   private String lblTextblockalbref_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String tblUnnamedtable7_Internalname ;
   private String divUnnamedtable12_Internalname ;
   private String divUnnamedtabledevgentrn_Internalname ;
   private String lblTextblockdevgentrn_Internalname ;
   private String lblTextblockdevgentrn_Jsonclick ;
   private String Dvpanel_unnamedtable8_Width ;
   private String Dvpanel_unnamedtable8_Cls ;
   private String Dvpanel_unnamedtable8_Title ;
   private String Dvpanel_unnamedtable8_Iconposition ;
   private String Dvpanel_unnamedtable8_Internalname ;
   private String tblUnnamedtable8_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtablealbrunidis_Internalname ;
   private String lblTextblockalbrunidis_Internalname ;
   private String lblTextblockalbrunidis_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String divUnnamedtablealbruni_Internalname ;
   private String lblTextblockalbruni_Internalname ;
   private String lblTextblockalbruni_Jsonclick ;
   private String divUnnamedtablealbrpiedis_Internalname ;
   private String lblTextblockalbrpiedis_Internalname ;
   private String lblTextblockalbrpiedis_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String Dvpanel_unnamedtable9_Width ;
   private String Dvpanel_unnamedtable9_Cls ;
   private String Dvpanel_unnamedtable9_Title ;
   private String Dvpanel_unnamedtable9_Iconposition ;
   private String Dvpanel_unnamedtable9_Internalname ;
   private String tblUnnamedtable9_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtabledevgenuni_Internalname ;
   private String lblTextblockdevgenuni_Internalname ;
   private String lblTextblockdevgenuni_Jsonclick ;
   private String edtDevGenUni_Internalname ;
   private String edtDevGenUni_Jsonclick ;
   private String divUnnamedtabledevgenpie_Internalname ;
   private String lblTextblockdevgenpie_Internalname ;
   private String lblTextblockdevgenpie_Jsonclick ;
   private String edtDevGenPie_Internalname ;
   private String edtDevGenPie_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnverpiezas_Internalname ;
   private String bttBtnverpiezas_Jsonclick ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String sMode451 ;
   private String edtAlbRecPie_Internalname ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecKgmU_Internalname ;
   private String edtAlbRecMtrU_Internalname ;
   private String edtDevPieUni_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String A407EmprNom ;
   private String A329DevTrnNom ;
   private String AV84Pgmname ;
   private String A4795AlRPieCal ;
   private String Dvpanel_unnamedtable5_Objectcall ;
   private String Dvpanel_unnamedtable5_Class ;
   private String Dvpanel_unnamedtable5_Height ;
   private String Dvpanel_unnamedtable6_Objectcall ;
   private String Dvpanel_unnamedtable6_Class ;
   private String Dvpanel_unnamedtable6_Height ;
   private String Dvpanel_unnamedtable7_Objectcall ;
   private String Dvpanel_unnamedtable7_Class ;
   private String Dvpanel_unnamedtable7_Height ;
   private String Dvpanel_unnamedtable8_Objectcall ;
   private String Dvpanel_unnamedtable8_Class ;
   private String Dvpanel_unnamedtable8_Height ;
   private String Dvpanel_unnamedtable9_Objectcall ;
   private String Dvpanel_unnamedtable9_Class ;
   private String Dvpanel_unnamedtable9_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Dvpanel_unnamedtable2_Objectcall ;
   private String Dvpanel_unnamedtable2_Class ;
   private String Dvpanel_unnamedtable2_Height ;
   private String hsh ;
   private String sMode31 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV24Station ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z329DevTrnNom ;
   private String sGXsfl_181_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecPie_Jsonclick ;
   private String edtAlbRecKgm_Jsonclick ;
   private String edtAlbRecMtr_Jsonclick ;
   private String edtAlbRecKgmU_Jsonclick ;
   private String edtAlbRecMtrU_Jsonclick ;
   private String edtDevPieUni_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV13AlbRUni ;
   private java.util.Date Z325DevGenFec ;
   private java.util.Date A325DevGenFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n252CliCod ;
   private boolean n327DevGenTrn ;
   private boolean wbErr ;
   private boolean n326DevGenPie ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean Dvpanel_unnamedtable8_Autowidth ;
   private boolean Dvpanel_unnamedtable8_Autoheight ;
   private boolean Dvpanel_unnamedtable8_Collapsible ;
   private boolean Dvpanel_unnamedtable8_Collapsed ;
   private boolean Dvpanel_unnamedtable8_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable8_Autoscroll ;
   private boolean Dvpanel_unnamedtable9_Autowidth ;
   private boolean Dvpanel_unnamedtable9_Autoheight ;
   private boolean Dvpanel_unnamedtable9_Collapsible ;
   private boolean Dvpanel_unnamedtable9_Collapsed ;
   private boolean Dvpanel_unnamedtable9_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable9_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean n328DevGenUni ;
   private boolean bGXsfl_181_Refreshing=false ;
   private boolean n324DevGenEst ;
   private boolean n1304DevUlin ;
   private boolean n407EmprNom ;
   private boolean n329DevTrnNom ;
   private boolean Dvpanel_unnamedtable5_Enabled ;
   private boolean Dvpanel_unnamedtable5_Showheader ;
   private boolean Dvpanel_unnamedtable5_Visible ;
   private boolean Dvpanel_unnamedtable6_Enabled ;
   private boolean Dvpanel_unnamedtable6_Showheader ;
   private boolean Dvpanel_unnamedtable6_Visible ;
   private boolean Dvpanel_unnamedtable7_Enabled ;
   private boolean Dvpanel_unnamedtable7_Showheader ;
   private boolean Dvpanel_unnamedtable7_Visible ;
   private boolean Dvpanel_unnamedtable8_Enabled ;
   private boolean Dvpanel_unnamedtable8_Showheader ;
   private boolean Dvpanel_unnamedtable8_Visible ;
   private boolean Dvpanel_unnamedtable9_Enabled ;
   private boolean Dvpanel_unnamedtable9_Showheader ;
   private boolean Dvpanel_unnamedtable9_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Dvpanel_unnamedtable2_Enabled ;
   private boolean Dvpanel_unnamedtable2_Showheader ;
   private boolean Dvpanel_unnamedtable2_Visible ;
   private boolean n325DevGenFec ;
   private boolean n6288DevGenDom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean gxdyncontrolsrefreshing ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV79WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable8 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable9 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice dynDevGenTrn ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] T01P38_A407EmprNom ;
   private boolean[] T01P38_n407EmprNom ;
   private String[] T01P312_A329DevTrnNom ;
   private boolean[] T01P312_n329DevTrnNom ;
   private java.math.BigDecimal[] T01P314_A3066AlbDevPUni ;
   private short[] T01P314_A5278AlbDevPPie ;
   private int[] T01P310_A54AlbRPieUti ;
   private byte[] T01P310_A47AlbREst ;
   private int[] T01P310_A252CliCod ;
   private boolean[] T01P310_n252CliCod ;
   private String[] T01P310_A45AlbRef ;
   private String[] T01P310_A56AlbRUni ;
   private java.math.BigDecimal[] T01P310_A60AlbRUniUti ;
   private int[] T01P310_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P310_A58AlbRUniEnt ;
   private String[] T01P311_A279CliNom ;
   private int[] T01P316_A323DevGenCod ;
   private int[] T01P316_A54AlbRPieUti ;
   private byte[] T01P316_A47AlbREst ;
   private String[] T01P316_A407EmprNom ;
   private boolean[] T01P316_n407EmprNom ;
   private java.util.Date[] T01P316_A325DevGenFec ;
   private boolean[] T01P316_n325DevGenFec ;
   private byte[] T01P316_A6288DevGenDom ;
   private boolean[] T01P316_n6288DevGenDom ;
   private int[] T01P316_A252CliCod ;
   private boolean[] T01P316_n252CliCod ;
   private String[] T01P316_A279CliNom ;
   private String[] T01P316_A45AlbRef ;
   private String[] T01P316_A329DevTrnNom ;
   private boolean[] T01P316_n329DevTrnNom ;
   private String[] T01P316_A56AlbRUni ;
   private java.math.BigDecimal[] T01P316_A328DevGenUni ;
   private boolean[] T01P316_n328DevGenUni ;
   private short[] T01P316_A326DevGenPie ;
   private boolean[] T01P316_n326DevGenPie ;
   private java.math.BigDecimal[] T01P316_A60AlbRUniUti ;
   private int[] T01P316_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P316_A58AlbRUniEnt ;
   private byte[] T01P316_A324DevGenEst ;
   private boolean[] T01P316_n324DevGenEst ;
   private byte[] T01P316_A1304DevUlin ;
   private boolean[] T01P316_n1304DevUlin ;
   private String[] T01P316_A396EmprCod ;
   private int[] T01P316_A44AlbRecCod ;
   private boolean[] T01P316_n44AlbRecCod ;
   private short[] T01P316_A327DevGenTrn ;
   private boolean[] T01P316_n327DevGenTrn ;
   private java.math.BigDecimal[] T01P316_A3066AlbDevPUni ;
   private short[] T01P316_A5278AlbDevPPie ;
   private String[] T01P317_A279CliNom ;
   private String[] T01P318_A329DevTrnNom ;
   private boolean[] T01P318_n329DevTrnNom ;
   private java.math.BigDecimal[] T01P320_A3066AlbDevPUni ;
   private short[] T01P320_A5278AlbDevPPie ;
   private String[] T01P321_A396EmprCod ;
   private int[] T01P321_A323DevGenCod ;
   private int[] T01P37_A323DevGenCod ;
   private java.util.Date[] T01P37_A325DevGenFec ;
   private boolean[] T01P37_n325DevGenFec ;
   private byte[] T01P37_A6288DevGenDom ;
   private boolean[] T01P37_n6288DevGenDom ;
   private java.math.BigDecimal[] T01P37_A328DevGenUni ;
   private boolean[] T01P37_n328DevGenUni ;
   private short[] T01P37_A326DevGenPie ;
   private boolean[] T01P37_n326DevGenPie ;
   private byte[] T01P37_A324DevGenEst ;
   private boolean[] T01P37_n324DevGenEst ;
   private byte[] T01P37_A1304DevUlin ;
   private boolean[] T01P37_n1304DevUlin ;
   private String[] T01P37_A396EmprCod ;
   private int[] T01P37_A44AlbRecCod ;
   private boolean[] T01P37_n44AlbRecCod ;
   private short[] T01P37_A327DevGenTrn ;
   private boolean[] T01P37_n327DevGenTrn ;
   private int[] T01P37_A252CliCod ;
   private boolean[] T01P37_n252CliCod ;
   private String[] T01P322_A396EmprCod ;
   private int[] T01P322_A323DevGenCod ;
   private String[] T01P323_A396EmprCod ;
   private int[] T01P323_A323DevGenCod ;
   private int[] T01P36_A323DevGenCod ;
   private java.util.Date[] T01P36_A325DevGenFec ;
   private boolean[] T01P36_n325DevGenFec ;
   private byte[] T01P36_A6288DevGenDom ;
   private boolean[] T01P36_n6288DevGenDom ;
   private java.math.BigDecimal[] T01P36_A328DevGenUni ;
   private boolean[] T01P36_n328DevGenUni ;
   private short[] T01P36_A326DevGenPie ;
   private boolean[] T01P36_n326DevGenPie ;
   private byte[] T01P36_A324DevGenEst ;
   private boolean[] T01P36_n324DevGenEst ;
   private byte[] T01P36_A1304DevUlin ;
   private boolean[] T01P36_n1304DevUlin ;
   private String[] T01P36_A396EmprCod ;
   private int[] T01P36_A44AlbRecCod ;
   private boolean[] T01P36_n44AlbRecCod ;
   private short[] T01P36_A327DevGenTrn ;
   private boolean[] T01P36_n327DevGenTrn ;
   private int[] T01P36_A252CliCod ;
   private boolean[] T01P36_n252CliCod ;
   private int[] T01P324_A54AlbRPieUti ;
   private byte[] T01P324_A47AlbREst ;
   private int[] T01P324_A252CliCod ;
   private boolean[] T01P324_n252CliCod ;
   private String[] T01P324_A45AlbRef ;
   private String[] T01P324_A56AlbRUni ;
   private java.math.BigDecimal[] T01P324_A60AlbRUniUti ;
   private int[] T01P324_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P324_A58AlbRUniEnt ;
   private int[] T01P328_A54AlbRPieUti ;
   private byte[] T01P328_A47AlbREst ;
   private int[] T01P328_A252CliCod ;
   private boolean[] T01P328_n252CliCod ;
   private String[] T01P328_A45AlbRef ;
   private String[] T01P328_A56AlbRUni ;
   private java.math.BigDecimal[] T01P328_A60AlbRUniUti ;
   private int[] T01P328_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P328_A58AlbRUniEnt ;
   private String[] T01P329_A279CliNom ;
   private String[] T01P330_A329DevTrnNom ;
   private boolean[] T01P330_n329DevTrnNom ;
   private java.math.BigDecimal[] T01P332_A3066AlbDevPUni ;
   private short[] T01P332_A5278AlbDevPPie ;
   private String[] T01P333_A396EmprCod ;
   private int[] T01P333_A323DevGenCod ;
   private byte[] T01P333_A1302DevLin ;
   private String[] T01P337_A396EmprCod ;
   private int[] T01P337_A323DevGenCod ;
   private String[] T01P338_A4795AlRPieCal ;
   private int[] T01P338_A323DevGenCod ;
   private java.math.BigDecimal[] T01P338_A3067DevPieUni ;
   private java.math.BigDecimal[] T01P338_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01P338_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01P338_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01P338_A2157AlbRecMtr ;
   private String[] T01P338_A396EmprCod ;
   private String[] T01P338_A2159AlbRecPie ;
   private int[] T01P338_A44AlbRecCod ;
   private boolean[] T01P338_n44AlbRecCod ;
   private String[] T01P35_A4795AlRPieCal ;
   private java.math.BigDecimal[] T01P35_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01P35_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01P35_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01P35_A2157AlbRecMtr ;
   private int[] T01P35_A44AlbRecCod ;
   private boolean[] T01P35_n44AlbRecCod ;
   private String[] T01P339_A396EmprCod ;
   private int[] T01P339_A323DevGenCod ;
   private String[] T01P339_A2159AlbRecPie ;
   private int[] T01P33_A323DevGenCod ;
   private java.math.BigDecimal[] T01P33_A3067DevPieUni ;
   private String[] T01P33_A396EmprCod ;
   private String[] T01P33_A2159AlbRecPie ;
   private int[] T01P32_A323DevGenCod ;
   private java.math.BigDecimal[] T01P32_A3067DevPieUni ;
   private String[] T01P32_A396EmprCod ;
   private String[] T01P32_A2159AlbRecPie ;
   private String[] T01P340_A4795AlRPieCal ;
   private java.math.BigDecimal[] T01P340_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01P340_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01P340_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01P340_A2157AlbRecMtr ;
   private int[] T01P340_A44AlbRecCod ;
   private boolean[] T01P340_n44AlbRecCod ;
   private String[] T01P344_A4795AlRPieCal ;
   private java.math.BigDecimal[] T01P344_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01P344_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01P344_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01P344_A2157AlbRecMtr ;
   private String[] T01P346_A396EmprCod ;
   private int[] T01P346_A323DevGenCod ;
   private String[] T01P346_A2159AlbRecPie ;
   private String[] T01P347_A396EmprCod ;
   private short[] T01P347_A327DevGenTrn ;
   private boolean[] T01P347_n327DevGenTrn ;
   private String[] T01P347_A329DevTrnNom ;
   private boolean[] T01P347_n329DevTrnNom ;
   private java.math.BigDecimal[] T01P349_A3066AlbDevPUni ;
   private short[] T01P349_A5278AlbDevPPie ;
   private int[] T01P350_A54AlbRPieUti ;
   private byte[] T01P350_A47AlbREst ;
   private int[] T01P350_A252CliCod ;
   private boolean[] T01P350_n252CliCod ;
   private String[] T01P350_A45AlbRef ;
   private String[] T01P350_A56AlbRUni ;
   private java.math.BigDecimal[] T01P350_A60AlbRUniUti ;
   private int[] T01P350_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P350_A58AlbRUniEnt ;
   private String[] T01P351_A279CliNom ;
   private String[] T01P352_A329DevTrnNom ;
   private boolean[] T01P352_n329DevTrnNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01P34_A4795AlRPieCal ;
   private java.math.BigDecimal[] T01P34_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01P34_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01P34_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01P34_A2157AlbRecMtr ;
   private int[] T01P34_A44AlbRecCod ;
   private int[] T01P39_A54AlbRPieUti ;
   private byte[] T01P39_A47AlbREst ;
   private int[] T01P39_A252CliCod ;
   private String[] T01P39_A45AlbRef ;
   private String[] T01P39_A56AlbRUni ;
   private java.math.BigDecimal[] T01P39_A60AlbRUniUti ;
   private int[] T01P39_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01P39_A58AlbRUniEnt ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV77WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV78TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV82TrnContextAtt ;
}

final  class tdevpie2__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie2__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie2__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie2__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpie2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01P32", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?  FOR UPDATE OF DevPieUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P33", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P34", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P35", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P36", "SELECT DevGenCod, DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P37", "SELECT DevGenCod, DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P38", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P39", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbREst, AlbRUniUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P310", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P311", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P312", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P314", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P316", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, T3.AlbRPieUti, T3.AlbREst, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T4.CliNom, T3.AlbRef, T5.TrnNom AS DevTrnNom, T3.AlbRUni, TM1.DevGenUni, TM1.DevGenPie, T3.AlbRUniUti, T3.AlbRPieEnt, T3.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T6.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T6.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPALBREC T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = TM1.EmprCod AND T5.TrnCod = TM1.DevGenTrn) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.DevGenCod = TM1.DevGenCod) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P317", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P318", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P320", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P321", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P322", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE ( DevGenCod > ?) and EmprCod = ? ORDER BY EmprCod, DevGenCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P323", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE ( DevGenCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevGenCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P324", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbREst, AlbRUniUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P325", "INSERT INTO TXPDEVGEN(CliCod, DevGenCod, DevGenFec, DevGenDom, DevGenUni, DevGenPie, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, EmprTrn, DevMatric, DevHorSal, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevDiscli, DevMdl, DevEnvAT, DevATCodeI, DevGenAT, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01P326", "UPDATE TXPDEVGEN SET CliCod=?, DevGenFec=?, DevGenDom=?, DevGenUni=?, DevGenPie=?, DevGenEst=?, DevUlin=?, AlbRecCod=?, DevGenTrn=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01P327", "DELETE FROM TXPDEVGEN  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new ForEachCursor("T01P328", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P329", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P330", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P332", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P333", "SELECT * FROM (SELECT EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01P334", "UPDATE TXPDEVGEN SET DevGenPie=?, DevGenUni=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01P335", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01P336", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01P337", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? ORDER BY EmprCod, DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P338", "SELECT T2.AlRPieCal, T1.DevGenCod, T1.DevPieUni, T2.AlbRecMtrU, T2.AlbRecKgmU, T2.AlbRecKgm, T2.AlbRecMtr, T1.EmprCod, T1.AlbRecPie, T2.AlbRecCod FROM (TXPDevPie T1 LEFT JOIN TXPALBDET T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = ? AND T2.AlbRecPie = T1.AlbRecPie) WHERE T1.DevGenCod = ? and T1.EmprCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.DevGenCod, T1.AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P339", "SELECT EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P340", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P341", "INSERT INTO TXPDevPie(DevGenCod, DevPieUni, EmprCod, AlbRecPie) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDevPie")
         ,new UpdateCursor("T01P342", "UPDATE TXPDevPie SET DevPieUni=?  WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPDevPie")
         ,new UpdateCursor("T01P343", "DELETE FROM TXPDevPie  WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPDevPie")
         ,new ForEachCursor("T01P344", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P345", "UPDATE TXPALBDET SET AlbRecMtrU=?, AlbRecKgmU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T01P346", "SELECT EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE DevGenCod = ? and EmprCod = ? ORDER BY EmprCod, DevGenCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P347", "SELECT EmprCod, TrnCod AS DevGenTrn, TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? ORDER BY TrnNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P349", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P350", "SELECT AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRUniUti, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P351", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P352", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 30);
               ((String[]) buf[12])[0] = rslt.getString(9, 16);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 1);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((byte[]) buf[23])[0] = rslt.getByte(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 3);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[33])[0] = rslt.getShort(23);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 42 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 43 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 45 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[4]);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               stmt.setString(9, (String)parms[15], 3);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               return;
            case 21 :
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
                  stmt.setNull( 2 , Types.DATE );
               }
               else
               {
                  stmt.setDate(2, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setInt(11, ((Number) parms[19]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               return;
            case 29 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 32 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 9);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 35 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 36 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 39 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               stmt.setString(5, (String)parms[5], 9);
               return;
            case 40 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 45 :
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

